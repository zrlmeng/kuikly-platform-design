# 守赚 UI · 薄 DX 公网镜像仓

**中文** · [English](./README.en.md)

> **本仓 = 薄 DX 镜像**（文档入口 + IDE Kit 源 + Maven 坐标说明）。  
> **不含** 组件库 / 设计系统实现源码。运行时请用 Maven 二进制。  
> 产品：**守赚 UI** · 面向 [Kuikly](https://github.com/Tencent-TDS/KuiklyUI) Compose。

| 镜像 | 地址 |
|------|------|
| **GitHub（本仓）** | https://github.com/zrlmeng/kuikly-platform-design |
| **Gitee（同步镜像）** | https://gitee.com/zrlmeng/kuikly-platform-design |

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

## 本仓有什么 / 没有什么

| 有（可公开） | 没有（永不进本仓） |
|-------------|-------------------|
| 接入文档、对照表、NOTICE | `platform-design` / `platform-core` 实现源码树 |
| JetBrains / VS Code 薄 IDE Kit 源 | 企业规范原文、`.cursor/rules`、内部台账 |
| Maven / OHPM **坐标**与用法 | 业务 App / 垂直模块源码 |

## IDE 薄 DX

- JetBrains：**ShouZhuan Kuikly Kit** → [jetbrains-plugin/](./jetbrains-plugin/)
- VS Code / Cursor：Marketplace `shouzhuan.shouzhuan-kuikly-kit`（薄 DX，同能力）

## 许可 / 联系

- 制品：**Apache-2.0**（见 Maven POM / [LICENSE](./LICENSE)）
- 问题：本仓 Issues（GitHub 或 Gitee）
- 维护：[zrlmeng](https://github.com/zrlmeng) · 品牌 **守赚 UI**
