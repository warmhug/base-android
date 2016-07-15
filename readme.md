

apk 下载:   
![](https://zos.alipayobjects.com/rmsportal/MNTgsYEPebJUVyc.png)

## Android
> 使用了 Android 最新支持的 ConstraintLayout 布局。  
>
> 注意点: app/build.gradle 里的`targetSdkVersion`要和预览的手机设备 skdVersion 一样。

官方文档：[https://developer.android.com/training/index.html](https://developer.android.com/training/index.html)

### 优化
- [优化布局性能](https://developer.android.com/training/improving-layouts/optimizing-layout.html#Inspect)
- [滚动怎么更顺滑](https://developer.android.com/training/improving-layouts/smooth-scrolling.html)

## 环境
- 安装 [JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 、 [Android SDK 和 Android Studio](https://developer.android.com/studio/index.html) 。添加环境变量：`export ANDROID_HOME=/../android-sdk` 至 `~/.bashrc` 或 `~/.zshrc` 。
    - [解决](http://blog.kuoruan.com/24.html) Android SDK Manager 下载慢无法更新：
    - 在使用 Android SDK Manager 的时候，主要会连接到两个地址 dl.google.com 和 dl-ssl.google.com 两个地址都是无法正常访问的.

方法一：

    打开地址：http://ping.chinaz.com/，
    分别测试 dl.google.com 和 dl-ssl.google.com 的IP地址，   
    将获取到的IP写入hosts文件。

方法二：使用国内镜像源 (在『Android SDK Manager – Settings』窗口中，在「HTTP Proxy Server」和「HTTP Proxy Port」输入框内填入mirrors.neusoft.edu.cn和80，并且选中「Force https://… sources to be fetched using http://…」复选框)

    mirrors.neusoft.edu.cn //东软信息学院
    ubuntu.buct.edu.cn //北京化工大学
    mirrors.dormforce.net //（栋力无限）电子科技大学
    
方法三: 直接从仓库网站下载再导入,如 [Android SDK | “Android 6.0” Package Direct Links](https://afterroot.wordpress.com/2016/01/01/android-sdk-android-6-0-package-direct-links/)。

[真机调试](http://yijiebuyi.com/blog/84b194d94e768e8eecd0de3a3a3da041.html)

#### 打开 Android emulator (Android AVD Manager): 
如果未设置环境变量, 到 <ANDROID_SDK>/tools 目录, 双击 android, 如果设置了Android环境变量, 命令行运行`android`会打开 
"Android SDK Manager"。再在菜单中选择 Tools -> Manage AVDs (或命令行运行`android avd`), 
打开 "Android Virtual Device (AVD) Manager" 会看到虚拟机列表。
如果为空, 点击按钮 "Create..." 创建虚拟机, 点击某个虚拟机, 如果右边按钮 "Start..." 不可点?
则点击按钮 "Edit..." 查看编辑框里的 "CPU/ABI" 选项是否有设置, 设置为何虚拟机列表里 "CPU/ABI" 列一样的值, 并把其他选项填写完善。
