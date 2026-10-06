# ShouZhuan UI vs official KuiklyUI

[中文](./COMPARE.md) · **English**

> Honest positioning: **ShouZhuan UI** (platform-design) is a **business design system + plugin façades** on top of Kuikly Compose. It does **not** replace the KuiklyUI render engine.

## Comparison

| Dimension | Official KuiklyUI (layer A) | ShouZhuan UI / platform-design (layers B+C) |
|-----------|----------------------------|------------------------------|
| Role | Cross-platform render + Compose/DSL primitives | Enterprise DS + tokens/themes + plugin façades |
| Brand | Tencent TDS / Kuikly | **守赚 / ShouZhuan** |
| Theming | Framework Material-like defaults | Scene styles (office/play), OEM brand, dark mode |
| Feedback | Build your own dialogs/sheets | Toast, alerts, overlay, popover, guide, result |
| Forms | Primitive fields | Pickers, cascader, calendar, uploader, rate |
| Nav / display | Tabs / Lazy lists | Steps, back-to-top, collapse, index bar, notice |
| Visual craft | No product neumorphism spec | Stitch convex/concave + CTA glow |
| Plugins | Samples / community | Charts, sign board, markdown policy, media façades |
| Distribution | Framework deps | Maven **binary + placeholder sources only** |
| Gallery | Official demos | Storybook deep-link + docs / H5 / APK |

We do **not** claim a better engine than official Kuikly. iOS packaging is not publicly released yet.

## Related

- [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md)
- [INTEGRATION.en.md](./INTEGRATION.en.md)
- [PLATFORMS.en.md](./PLATFORMS.en.md)
- Docs site: https://ui-site.zrlmeng.com
