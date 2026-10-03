# Official KuiklyUI vs platform-design

> Honest positioning: **platform-design** is a **business design system + plugin façades** on top of Kuikly Compose. It does **not** replace the KuiklyUI render engine.

## 中文 · 对照

| 维度 | Kuikly 官方（A 层） | platform-design（B+C） |
|------|-------------------|------------------------|
| 定位 | 跨端渲染引擎 + Compose/DSL 原语 | 企业业务组件库 + Token/主题 + 插件门面 |
| 主题 | 框架默认 Material 子集 | 办公/娱乐双场景轨 · OEM Brand · 深色三轴 |
| 反馈 | Dialog/Sheet 等需自拼 | Toast / Alert / ActionSheet / Overlay / Popover / Guide / Result… |
| 表单 | TextField 等原语 | FormField / Picker / Cascader / Calendar / Uploader / Rate… |
| 导航展示 | Tab / Lazy 等原语 | Steps / BackTop / Collapse / IndexBar / Notice / SwipeCell… |
| 视觉 | 无业务级新拟态规范 | Stitch 新拟态凸凹 / CTA 光晕 |
| 插件 | 官方 Sample / 社区分散 | 图表 / 签名 / Markdown 策略 / 媒体选择门面（Compose） |
| 交付 | 框架依赖 | Maven **二进制 + 占位 sources**（无真实业务源码树） |
| Gallery | 官方 Demo | Storybook 深链 `component=` + 文档站 / H5 / APK |

**不做虚假宣称**：不说引擎层优于官方；iOS 打包轨尚未公开发布。

## English · Comparison

| Dimension | Official KuiklyUI (layer A) | platform-design (layers B+C) |
|-----------|----------------------------|------------------------------|
| Role | Cross-platform render + Compose/DSL primitives | Enterprise DS + tokens/themes + plugin façades |
| Theming | Framework Material-like defaults | Scene styles (office/play), OEM brand, dark mode |
| Feedback | Build your own dialogs/sheets | Toast, alerts, overlay, popover, guide, result |
| Forms | Primitive fields | Pickers, cascader, calendar, uploader, rate |
| Nav / display | Tabs / Lazy lists | Steps, back-to-top, collapse, index bar, notice |
| Visual craft | No product neumorphism spec | Stitch convex/concave + CTA glow |
| Plugins | Samples / community | Charts, sign board, markdown policy, media façades |
| Distribution | Framework deps | Maven **binary + placeholder sources only** |
| Gallery | Official demos | Storybook deep-link + docs / H5 / APK |

## Related

- [HOST-MINIMAL.md](./HOST-MINIMAL.md)
- [INTEGRATION.en.md](./INTEGRATION.en.md)
- [PLATFORMS.md](./PLATFORMS.md)
- Docs site: https://ui-site.zrlmeng.com
