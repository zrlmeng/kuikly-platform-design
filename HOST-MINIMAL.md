# 守赚 UI · 最小宿主集成（30 分钟）

**中文** · [English](./HOST-MINIMAL.en.md)

> 目标：外部宿主 **只依赖 Maven 二进制**，不打开任何业务源码仓，即可跑通 **守赚 UI** 主题 + 一个按钮 + Toast。

## 0. 你需要什么

| 项 | 说明 |
|----|------|
| 宿主 | 已有 Kuikly Compose Android App（或等价壳） |
| 坐标 | `com.sxztdhkjyxgs:platform-core` + `com.sxztdhkjyxgs:platform-design` |
| 版本 | 建议 **1.0.24**（以 [Maven Central](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) 最新为准） |
| 不要 | 拉取本组织私有业务仓；不要期待真实 `*-sources.jar` |

## 1. Gradle

```gradle
dependencies {
    implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
    implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
}
```

R8 / ProGuard（若开启混淆）：保留设计系统包（按你工程实际包名调整 keep 规则；公开 API 在 AAR 内）。

## 2. 启动时安装主题（Application / 壳 onCreate）

顺序不可乱：

1. 系统深浅色注入（宿主实现）
2. `BrandRegistry.install(YourBrand)` — `sceneStyle` 钉死 `OFFICE_AZURE` 或 `PLAY_ENERGY`
3. `AppAppearanceStoreRegistry.install { yourStore }`（可先内存实现）
4. 任意 `@Page` 根用 `AppThemeHost { … }`

示意（API 名以 AAR 公开符号为准）：

```kotlin
// Application.onCreate（示意）
BrandRegistry.install(MyOemBrand) // sceneStyle = OFFICE_AZURE | PLAY_ENERGY
AppAppearanceStoreRegistry.install { InMemoryAppearanceStore() }

// @Page willInit → setContent
AppThemeHost { _, _ ->
    AppPrimaryButton(
        text = "Ping",
        onClick = { /* rememberAppToast().show("OK") */ },
    )
}
```

## 3. 最小 DoD（勾完即可宣称「集成成功」）

- [ ] 依赖解析成功，工程可编译
- [ ] 冷启后主色/圆角随 `BrandTheme` 变化（改 Brand 再装一次可验证）
- [ ] 点按钮出现 `AppToast`（或等价反馈）
- [ ] UI 里 **没有** 散落硬编码色值顶替 `AppTheme`
- [ ] **未**把本库当成 Kuikly 引擎替代品写进对外文案

## 4. 可选：打开 Gallery 对照

| 方式 | 入口 |
|------|------|
| 不写代码 | 装 [ui.apk](https://apk-dl.zrlmeng.com/ui.apk) 或开 [H5 Gallery](https://ui-demo-h5.zrlmeng.com/) |
| 宿主内嵌 | 打开页 `design_system_gallery`，参数 `component=calendar` 等 |

## 5. 宿主能力（插件门面）

下列能力是 **门面 + 宿主接线**，不是「AAR 内嵌完整原生 SDK」：

| 能力 | 最小期望 |
|------|----------|
| 地图 / 视频 / 扫码 / 裁剪 / 沉浸 | 宿主 Bridge / Module 接入后启用 |
| Markdown / 图表 / 签名 | Compose 能力，详见 [PLATFORMS.md](./PLATFORMS.md) |

业务 App 请按隐私合规申请权限（相机等）：**仅用户点击具体功能后申请**，勿冷启弹权限。

## 6. 下一步

- 完整清单：[INTEGRATION.md](./INTEGRATION.md) / [INTEGRATION.en.md](./INTEGRATION.en.md)
- 与官方分层对照：[COMPARE.md](./COMPARE.md)
- 文档站：https://ui-site.zrlmeng.com
