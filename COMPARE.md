# 守赚 UI vs 官方 KuiklyUI

**中文** · [English](./COMPARE.en.md)

> 诚实定位：**守赚 UI**（platform-design）是架在 Kuikly Compose **之上**的 **业务设计系统 + 插件门面**。  
> **不替代** KuiklyUI 渲染引擎。

## 对照

| 维度 | Kuikly 官方（A 层） | 守赚 UI / platform-design（B+C） |
|------|-------------------|------------------------|
| 定位 | 跨端渲染引擎 + Compose/DSL 原语 | 企业业务组件库 + Token/主题 + 插件门面 |
| 品牌 | 腾讯 TDS / Kuikly | **守赚**（ShouZhuan） |
| 主题 | 框架默认 Material 子集 | 办公/娱乐双场景轨 · OEM Brand · 深色三轴 |
| 反馈 | Dialog/Sheet 等需自拼 | Toast / Alert / ActionSheet / Overlay / Popover / Guide / Result… |
| 表单 | TextField 等原语 | FormField / Picker / Cascader / Calendar / Uploader / Rate… |
| 导航展示 | Tab / Lazy 等原语 | Steps / BackTop / Collapse / IndexBar / Notice / SwipeCell… |
| 视觉 | 无业务级新拟态规范 | Stitch 新拟态凸凹 / CTA 光晕 |
| 插件 | 官方 Sample / 社区分散 | 图表 / 签名 / Markdown 策略 / 媒体选择门面（Compose） |
| 交付 | 框架依赖 | Maven **二进制 + 占位 sources**（无真实业务源码树） |
| Gallery | 官方 Demo | Storybook 深链 `component=` + 文档站 / H5 / APK |

**不做虚假宣称**：不说引擎层优于官方；iOS 打包轨尚未公开发布。

## 相关

- [HOST-MINIMAL.md](./HOST-MINIMAL.md)
- [INTEGRATION.md](./INTEGRATION.md)
- [PLATFORMS.md](./PLATFORMS.md)
- 官网：https://ui-site.zrlmeng.com
