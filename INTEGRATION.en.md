# platform-design · INTEGRATION (English)

> Public docs mirror. Chinese: [INTEGRATION.md](./INTEGRATION.md) · Minimal path: [HOST-MINIMAL.en.md](./HOST-MINIMAL.en.md)

## 1. Artifacts

| End | Artifact | Coordinate / link |
|-----|----------|-------------------|
| Android | AAR | `com.sxztdhkjyxgs:platform-design:1.0.24` (+ `platform-core`) |
| HarmonyOS | HAR | Distributed with Gallery host builds; ask maintainer for matching HAR |
| iOS | XCFramework | Not published yet |
| H5 | Demo site | https://ui-demo-h5.zrlmeng.com/ (not a separate Maven JS package) |

Publish policy: **binary only**. Maven Central attachments use **placeholder** sources/javadoc. Real product `.kt` trees are never published.

## 2. Host checklist

1. Depend on `platform-design` + `platform-core`
2. Implement `BrandTheme` with `sceneStyle` (`OFFICE_AZURE` or `PLAY_ENERGY`)
3. `BrandRegistry.install(XxxBrand)` before any `AppTheme`
4. `AppAppearanceStoreRegistry.install { store }`
5. Inject system dark theme at shell root
6. Prefer `AppThemeHost` at `@Page` roots
7. Toast via `AppToast` / `rememberAppToast()`
8. Dialogs / overlays via `AppAlertDialog` / `AppModalSheet` / `AppOverlay` / `AppPopover`
9. Colors/sizes only via `AppTheme.*`
10. Keep design-system packages in consumer ProGuard keep rules

## 3. Gallery deep links

Page: `design_system_gallery`. Pass `component=<id>` (e.g. `calendar`, `popover`, `collapse`, `guide`, `steps`, `backtop`).

Public demos:

- https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&component=calendar&product_line=ui
- APK: https://apk-dl.zrlmeng.com/ui.apk

## 4. Notes

- Popover / Guide are Compose scrim façades (not native anchored Popup).
- Host modules (map / scan / crop) are optional; demos degrade honestly without keys/modules.
- This library does **not** replace KuiklyUI.
