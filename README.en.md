# ShouZhuan UI · thin DX public mirror

[中文](./README.md) · **English**

> **This repo is a thin DX mirror**: docs + IDE Kit sources + Maven coordinates.  
> **No** component-library / design-system implementation sources. Runtime = Maven binaries.  
> Product: **ShouZhuan UI** on [Kuikly](https://github.com/Tencent-TDS/KuiklyUI) Compose.

| Mirror | URL |
|--|--|
| **GitHub (this repo)** | https://github.com/zrlmeng/kuikly-platform-design |
| **Gitee (sync mirror)** | https://gitee.com/zrlmeng/kuikly-platform-design |

| Surface | URL |
|--|--|
| **Docs** | https://ui-site.zrlmeng.com |
| **Live gallery** | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| **Android APK** | https://apk-dl.zrlmeng.com/ui.apk |
| **Quick start** | [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md) |
| **vs official Kuikly** | [COMPARE.en.md](./COMPARE.en.md) |
| **Maven** | [`com.sxztdhkjyxgs:platform-design`](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) |
| **Version** | **1.0.24** |

---

## Product

**ShouZhuan UI** (package **platform-design**) brings a full enterprise UI layer to Kuikly Compose apps:

- Brand: **守赚 / ShouZhuan** — Chinese docs by default, English available
- Themes and components: forms, feedback, navigation, data display, business templates
- Office / entertainment **scene styles** + OEM **branding** + light/dark
- Production neumorphic surfaces (convex / concave / CTA glow)
- Charts, signature, Markdown, and media-picker plugins

Clear split: Kuikly renders across platforms; **ShouZhuan UI** is the Vant / TDesign-class business layer on top.

## Install (Android)

```gradle
implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
```

Guides: [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md) · [INTEGRATION.en.md](./INTEGRATION.en.md) · [中文](./INTEGRATION.md)

## Try it

| Surface | URL |
|---------|-----|
| Docs | https://ui-site.zrlmeng.com |
| Live gallery | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| Component deep link | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui |
| Android APK | https://apk-dl.zrlmeng.com/ui.apk |

Gallery page: `design_system_gallery` · `component=<id>` (e.g. `calendar`, `popover`, `guide`).

## Platforms

| Platform | Capability |
|----------|------------|
| Android | Maven AAR + Gallery app |
| HarmonyOS | Gallery host + HAR |
| H5 | Live gallery, same Compose UI |
| iOS | Shared commonMain, packaging expanding |

Details: [PLATFORMS.en.md](./PLATFORMS.en.md) · [中文](./PLATFORMS.md)

## vs official Kuikly

See [COMPARE.en.md](./COMPARE.en.md) — official engine primitives plus **ShouZhuan UI** as the enterprise design system. [中文](./COMPARE.md)

## What is / is not in this repo

| Included (public) | Never in this repo |
|-------------------|--------------------|
| Integration docs, compare tables, NOTICE | `platform-design` / `platform-core` implementation sources |
| Thin JetBrains / VS Code IDE Kit sources | Internal enterprise rules / `.cursor/rules` |
| Maven / OHPM **coordinates** | Business app / vertical sources |

IDE Kit: [jetbrains-plugin/](./jetbrains-plugin/) · VS Code `shouzhuan.shouzhuan-kuikly-kit`

## License / contact

- Artifacts: **Apache-2.0** (Maven POM / [LICENSE](./LICENSE))
- Issues: GitHub or Gitee Issues
- Org: [zrlmeng](https://github.com/zrlmeng) · brand **守赚 UI / ShouZhuan UI**
