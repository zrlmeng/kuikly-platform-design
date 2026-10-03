# platform-design · INTEGRATION（中文）

> 公网文档镜像。English: [INTEGRATION.en.md](./INTEGRATION.en.md) · 最小路径: [HOST-MINIMAL.md](./HOST-MINIMAL.md)

## 1. 制品

| 端 | 制品 | 坐标 / 链接 |
|----|------|-------------|
| Android | AAR | `com.sxztdhkjyxgs:platform-design:1.0.24`（另需 `platform-core`） |
| 鸿蒙 | HAR | 随 Gallery 宿主构建提供；版本与 AAR 对齐 |
| iOS | XCFramework | 尚未公开发布 |
| H5 | 演示站 | https://ui-demo-h5.zrlmeng.com/（不发独立 JS Maven 包） |

发布策略：**仅二进制**。Maven Central 附件为**占位** sources/javadoc。真实业务 `.kt` 树永不公开。

## 2. 宿主清单

1. 依赖 `platform-design` + `platform-core`
2. 实现 `BrandTheme`，钉死 `sceneStyle`（`OFFICE_AZURE` / `PLAY_ENERGY`）
3. 任意 `AppTheme` 前 `BrandRegistry.install`
4. `AppAppearanceStoreRegistry.install { store }`
5. 壳根注入系统深浅色
6. `@Page` 根优先 `AppThemeHost`
7. Toast 用 `AppToast` / `rememberAppToast()`
8. 弹层用 `AppAlertDialog` / `AppModalSheet` / `AppOverlay` / `AppPopover`
9. 颜色/尺寸只走 `AppTheme.*`
10. 混淆时保留设计系统公开包

## 3. Gallery 深链

页名：`design_system_gallery`；参数 `component=<id>`。

- H5：https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui
- APK：https://apk-dl.zrlmeng.com/ui.apk

## 4. 说明

- Popover / Guide 为 Compose 蒙层门面（非原生锚点 Popup）
- 地图/扫码/裁剪等需宿主 Module；缺省时演示诚实降级
- **不**替代 KuiklyUI 引擎
