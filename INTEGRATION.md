# 守赚 UI · 接入说明

**中文** · [English](./INTEGRATION.en.md)

> 公网文档镜像。最小路径：[HOST-MINIMAL.md](./HOST-MINIMAL.md)

## 1. 制品

| 端 | 制品 | 坐标 / 链接 |
|----|------|-------------|
| Android | AAR | `com.sxztdhkjyxgs:platform-design:1.0.24`（另需 `platform-core`） |
| 鸿蒙 | HAR | 随 Gallery 宿主构建提供；版本与 AAR 对齐 |
| iOS | 共用 commonMain | 持续扩展发布形态 |
| H5 | 在线展厅 | https://ui-demo-h5.zrlmeng.com/ |

Maven 坐标：`com.sxztdhkjyxgs:platform-design`（配合 `platform-core`）。

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

- Popover / Guide 为 Compose 蒙层能力
- 地图 / 扫码 / 裁剪等由宿主 Module 接入后启用
- 与官方引擎分工：Kuikly 渲染，守赚 UI 提供企业界面层
