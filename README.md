# 守赚 UI · platform-design

**中文** · [English](./README.en.md)

> **守赚**出品的 Kuikly Compose **企业级业务设计系统**。  
> 本仓只有说明与演示链接，**不含**业务 / SDK 源码树。请用 Maven **二进制**接入（`platform-design` AAR；Central 附件为占位 sources/javadoc）。

| 入口 | 地址 |
|------|------|
| **官网文档** | https://ui-site.zrlmeng.com |
| **H5 Gallery 演示** | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| **Android Gallery APK** | https://apk-dl.zrlmeng.com/ui.apk |
| **最小宿主接入** | [HOST-MINIMAL.md](./HOST-MINIMAL.md) |
| **与官方对照** | [COMPARE.md](./COMPARE.md) |
| **Maven** | [`com.sxztdhkjyxgs:platform-design`](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) |
| **已验证版本** | **1.0.24** |

---

## 这是什么

**守赚 UI**（工程名 **platform-design**）是给 [Kuikly](https://github.com/Tencent-TDS/KuiklyUI) Compose 应用准备的 **业务设计系统 + 插件门面**：

- 品牌：**守赚**（ShouZhuan）· 面向国内团队默认中文文档，并提供英文对照
- 主题组件：表单、反馈、导航、展示、业务模板
- 办公 / 娱乐 **双场景风格** + OEM **品牌换肤** + 浅色 / 深色
- Stitch 新拟态表面（外凸 / 内凹 / 主按钮光晕）
- 纯 Compose 插件门面（图表、签名板、Markdown 策略、媒体选择槽）

它 **不是** Kuikly 渲染引擎的分叉或替代品。  
它补的是官方原语之上、类似 Vant / TDesign 的 **企业业务组件层**。

## 这不是什么

| 不是 | 原因 |
|------|------|
| KuiklyUI 引擎 / Compose 原语 | 那是 [Tencent-TDS/KuiklyUI](https://github.com/Tencent-TDS/KuiklyUI) |
| KuiklyBase 网络 / 图片等 | 那是 KuiklyBase |
| 开箱即用的 WebView / 相机 / MMKV 套件 | 优先官方 contrib / 宿主模块；我们只在需要处提供门面 |
| 守赚产品源码 `.kt` 树 | 二进制在 Maven；本仓 = 文档 + 演示链接 |

## 安装（Android）

```gradle
implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
```

> 若 Central 已有比 `1.0.24` 更新的版本，优先用最新版。  
> 宿主清单：[HOST-MINIMAL.md](./HOST-MINIMAL.md) · [INTEGRATION.md](./INTEGRATION.md) · English: [INTEGRATION.en.md](./INTEGRATION.en.md)

## 看演示（不需要源码）

| 入口 | 地址 |
|------|------|
| 文档站 | https://ui-site.zrlmeng.com |
| 可交互 H5 Gallery | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| 深链示例 | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui |
| Android APK（Gallery 壳） | https://apk-dl.zrlmeng.com/ui.apk |

应用内 Gallery 页名：`design_system_gallery` · 查询参数 `component=<id>`（如 `calendar`、`popover`、`guide`）。

## 平台成熟度（诚实）

| 平台 | 状态 |
|------|------|
| Android | 主交付（AAR + Gallery APK） |
| 鸿蒙 | Gallery 宿主 + HAR 二进制 |
| H5 / JS | 公开 Gallery 演示；不单独发 JS Maven 包 |
| iOS | commonMain 共用；XCFramework 尚未公开发布 |

详情：[PLATFORMS.md](./PLATFORMS.md) · [English](./PLATFORMS.en.md)

## 与官方 Kuikly 对照

见 [COMPARE.md](./COMPARE.md) — **A 层**（引擎原语）vs 守赚 **B+C 层**（设计系统 + 插件门面）。English: [COMPARE.en.md](./COMPARE.en.md)

## 许可 / 联系

- 库二进制：按已发布 AAR 的 **Apache-2.0**（见 Maven POM / [LICENSE](./LICENSE)）
- 本说明仓：Apache-2.0
- 问题：本仓 GitHub Issues
- 维护组织：[zrlmeng](https://github.com/zrlmeng) · 品牌 **守赚 UI**

## 安全

- 这里不会放生产密钥、签名文件或私有产品源码。
- 若在演示资源里发现凭据，请开 Issue。
