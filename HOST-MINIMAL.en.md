# ShouZhuan UI · Minimal host integration (≈30 minutes)

[中文](./HOST-MINIMAL.md) · **English**

> Goal: wire a Kuikly Compose Android host using **Maven binaries only** — no private source trees — and show **ShouZhuan UI** theme + one button + Toast.

## 0. Prerequisites

| Item | Note |
|------|------|
| Host | Existing Kuikly Compose Android app / shell |
| Artifacts | `platform-core` + `platform-design` |
| Version | Prefer **1.0.24** or newer on [Maven Central](https://central.sonatype.com/artifact/com.sxztdhkjyxgs/platform-design) |
| Do not | Expect a real `*-sources.jar` with product `.kt` |

## 1. Gradle

```gradle
dependencies {
    implementation("com.sxztdhkjyxgs:platform-core:1.0.24")
    implementation("com.sxztdhkjyxgs:platform-design:1.0.24")
}
```

Keep design-system packages if you enable R8 minify on the host.

## 2. Bootstrap order

1. Inject system dark/light into the shell
2. `BrandRegistry.install(YourBrand)` with `sceneStyle` = `OFFICE_AZURE` or `PLAY_ENERGY`
3. `AppAppearanceStoreRegistry.install { store }`
4. Wrap `@Page` roots with `AppThemeHost`

```kotlin
BrandRegistry.install(MyOemBrand)
AppAppearanceStoreRegistry.install { InMemoryAppearanceStore() }

AppThemeHost { _, _ ->
    AppPrimaryButton(text = "Ping", onClick = { /* AppToast */ })
}
```

## 3. Done when

- [ ] Project compiles with Central coordinates
- [ ] Brand colors apply after install
- [ ] Toast / button feedback works
- [ ] No raw brand colors bypassing `AppTheme`
- [ ] Public copy does **not** claim this replaces KuiklyUI

## 4. Optional Gallery

- APK: https://apk-dl.zrlmeng.com/ui.apk  
- H5: https://ui-demo-h5.zrlmeng.com/?page_name=design_system_gallery&product_line=ui  
- Page: `design_system_gallery` · `component=<id>`

## 5. Host-backed plugins

Map / video / scan / crop / immersive enable after host Bridge/Module wiring.

## 6. More

- [INTEGRATION.en.md](./INTEGRATION.en.md) · [COMPARE.md](./COMPARE.md) · https://ui-site.zrlmeng.com
