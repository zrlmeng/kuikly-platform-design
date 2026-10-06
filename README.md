# 守赚 UI · platform-design

**中文** · [English](./README.en.md)

> **守赚**出品 · 面向 [Kuikly](https://github.com/Tencent-TDS/KuiklyUI) Compose 的企业级业务设计系统。  
> 主题、组件、场景风格与插件能力一体交付，Maven 一键接入。

| 入口 | 地址 |
|------|------|
| **官网文档** | https://ui-site.zrlmeng.com |
| **在线组件展厅** | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| **Android 安装包** | https://apk-dl.zrlmeng.com/ui.apk |
| **快速接入** | [HOST-MINIMAL.md](./HOST-MINIMAL.md) |
| **能力对照** | [COMPARE.md](./COMPARE.md) |
| **Maven** | [`com.sxztdhkjyxgs:platform-design`](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) |
| **当前版本** | **1.0.24** |

---

## 产品定位

**守赚 UI**（工程名 **platform-design**）把企业级业务界面能力做到 Kuikly Compose 应用里：

- 品牌：**守赚**（ShouZhuan）· 文档默认中文，可切英文
- 完整主题与组件：表单、反馈、导航、数据展示、业务模板
- 办公 / 娱乐 **双场景风格** + OEM **品牌换肤** + 浅色 / 深色
- 商业级新拟态质感（外凸 / 内凹 / 主按钮光晕）
- 图表、签名、Markdown、媒体选择等插件能力

与官方引擎分工清晰：Kuikly 负责跨端渲染，**守赚 UI** 负责企业业务界面层（对标 Vant / TDesign 量级）。

## 安装（Android）

```gradle
implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
```

接入说明：[HOST-MINIMAL.md](./HOST-MINIMAL.md) · [INTEGRATION.md](./INTEGRATION.md) · [English](./INTEGRATION.en.md)

## 立即体验

| 入口 | 地址 |
|------|------|
| 官网文档 | https://ui-site.zrlmeng.com |
| 在线组件展厅 | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| 组件直达 | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui |
| Android 安装包 | https://apk-dl.zrlmeng.com/ui.apk |

展厅页名：`design_system_gallery` · 参数 `component=<id>`（如 `calendar`、`popover`、`guide`）。

## 多端能力

| 平台 | 能力 |
|------|------|
| Android | Maven AAR + 完整 Gallery 安装包 |
| 鸿蒙 | Gallery 宿主 + HAR 制品 |
| H5 | 在线组件展厅，与 Compose 同一套界面 |
| iOS | 共用 commonMain，持续扩展发布形态 |

详情：[PLATFORMS.md](./PLATFORMS.md) · [English](./PLATFORMS.en.md)

## 与官方 Kuikly 的分工

见 [COMPARE.md](./COMPARE.md) — 官方引擎原语之上，由 **守赚 UI** 提供企业设计系统与插件能力。[English](./COMPARE.en.md)

## IDE 薄 DX（JetBrains）

Marketplace 插件 **ShouZhuan Kuikly Kit** 源码（仅 IDE 辅助，非业务实现）：  
[jetbrains-plugin/](./jetbrains-plugin/)

## 许可 / 联系

- 制品：**Apache-2.0**（见 Maven POM / [LICENSE](./LICENSE)）
- 问题：本仓 GitHub Issues
- 维护：[zrlmeng](https://github.com/zrlmeng) · 品牌 **守赚 UI**
