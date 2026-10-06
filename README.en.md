# ShouZhuan UI · platform-design

[中文](./README.md) · **English**

> **ShouZhuan** (**守赚**) enterprise business design system for Kuikly Compose.  
> **Docs & demos only.** This repository does **not** contain application or SDK source trees.  
> Consume the library as a **Maven binary** (`platform-design` AAR). Central ships **placeholder** sources/javadoc only.

| Surface | URL |
|--|--|
| **Docs site** | https://ui-site.zrlmeng.com |
| **H5 Gallery** | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| **Android Gallery APK** | https://apk-dl.zrlmeng.com/ui.apk |
| **Minimal host** | [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md) |
| **vs official Kuikly** | [COMPARE.en.md](./COMPARE.en.md) |
| **Maven** | [`com.sxztdhkjyxgs:platform-design`](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) |
| **Latest verified** | **1.0.24** |

---

## What this is

**ShouZhuan UI** (package **platform-design**) is an enterprise **business design system + plugin façades** for apps built with [Kuikly](https://github.com/Tencent-TDS/KuiklyUI) Compose:

- Brand: **守赚 / ShouZhuan** — docs default to Chinese, with this English copy for international hosts
- Themed components: forms, feedback, navigation, display, business templates
- Office / entertainment **scene styles** + OEM **brand themes** + light/dark
- Stitch-oriented neumorphic surfaces (convex / concave / CTA glow)
- Pure-Compose plugin façades (charts, signature board, markdown policy, media pick slots)

It is **not** a fork or replacement of the Kuikly render engine.  
It fills the ecosystem gap for a **Vant / TDesign-class business DS** on top of Kuikly primitives.

## What this is not

| Not this | Why |
|----------|-----|
| KuiklyUI engine / Compose primitives | That is [Tencent-TDS/KuiklyUI](https://github.com/Tencent-TDS/KuiklyUI) |
| KuiklyBase knoi / Network / Image | That is KuiklyBase |
| Drop-in WebView / Camera / MMKV kits | Prefer Kuikly-contrib / host modules; we expose façades only where needed |
| Open-source of ShouZhuan product `.kt` trees | Binaries on Maven; this repo = docs + demo links |

## Install (Android)

```gradle
implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
```

> Prefer the latest Central version if newer than `1.0.24`.  
> Host checklist: [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md) · [INTEGRATION.en.md](./INTEGRATION.en.md) · 中文：[INTEGRATION.md](./INTEGRATION.md)

## Try demos (no source required)

| Surface | URL |
|---------|-----|
| Documentation | https://ui-site.zrlmeng.com |
| Interactive H5 Gallery | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui |
| Deep-link example | https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui |
| Android APK (Gallery shell) | https://apk-dl.zrlmeng.com/ui.apk |

In-app Gallery page name: `design_system_gallery` · query `component=<id>` (e.g. `calendar`, `popover`, `guide`).

## Platforms (honest)

| Platform | Status |
|----------|--------|
| Android | Primary delivery (AAR + Gallery APK) |
| HarmonyOS | Gallery host + HAR binary available |
| H5 / JS bundle | Public Gallery demo; not a separate JS Maven package |
| iOS | commonMain shared; XCFramework packaging not published yet |

Details: [PLATFORMS.en.md](./PLATFORMS.en.md) · [中文](./PLATFORMS.md)

## Compare vs official Kuikly

See [COMPARE.en.md](./COMPARE.en.md) — layer **A** (engine primitives) vs ShouZhuan layers **B+C** (design system + plugin façades). 中文：[COMPARE.md](./COMPARE.md)

## License / contact

- Library binary distribution: intended **Apache-2.0** terms for the published AAR (see Maven POM / [LICENSE](./LICENSE)).
- This docs repo: Apache-2.0.
- Issues: GitHub Issues on this repository.
- Maintainer org: [zrlmeng](https://github.com/zrlmeng) · brand **守赚 UI / ShouZhuan UI**

## Security

- Do not expect production secrets, keystores, or private product source here.
- If you find a credential in any linked demo asset, please open an issue.
