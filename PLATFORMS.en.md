# Platform maturity (honest)

[中文](./PLATFORMS.md) · **English**

> Brand: **ShouZhuan UI** (platform-design)

| Platform | Library common code | Published binary | Public demo | Notes |
|----------|---------------------|------------------|-------------|-------|
| **Android** | Yes | Maven AAR `platform-design` **1.0.24** | [ui.apk](https://apk-dl.zrlmeng.com/ui.apk) | Primary track |
| **HarmonyOS** | Yes | HAR available (version-aligned) | Gallery host smoke | Markdown/QR may use OHOS-compatible path |
| **H5 / JS** | Yes (same Compose) | No separate JS Maven package | [ui-demo-h5](https://ui-demo-h5.zrlmeng.com/) | Scan/crop = best-effort, not native camera |
| **iOS** | Yes | XCFramework **not** published yet | — | Environment / packaging backlog |

## Claims we refuse

- “Six platforms fully verified” when only Android + partial OHOS/H5 demos exist
- “H5 native scan/crop complete”
- “This replaces KuiklyUI”
