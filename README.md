# RNText
React Native 官方文档过于简洁了，我打算react-native与native混合开发，开始集成的时候费了我九牛二虎之力，最后终于成功了。现在把源码分享出来
以便大家直接copy配置去用，react-native模块项目我直接copy了大牛的项目https://github.com/attentiveness/reading。


# react-native模块截图:


![image](http://lookcode-wordpress.stor.sinaapp.com/uploads/2016/06/1.jpg)


# native首页
![image](https://github.com/eesc88/RNText/blob/master/device-2016-06-24-145609.png)


# native集成Ibeacon的一个简单的 demo
![image](https://github.com/eesc88/RNText/blob/master/device-2016-06-24-151224.png)


#运行步骤

在项目根目录分别依次运行：
1、npm install
2、npm start
运行成功然后用Android Studio部署Android项目
主界面菜单栏随便点点就知道是哪个菜单跳转到哪里了，菜单栏名称我就懒得改了哦。

#React Native模块需要设置电脑的ip地址，端口号等。。。。参考
需要进行如下操作（或者参考：http://reactnative.cn/docs/0.27/running-on-device-android.html#content）：
    (Android 5.0以下)通过Wi-Fi连接你的本地开发服务器

    首先确保你的电脑和手机设备在同一个Wi-Fi环境下。
    在设备上运行你的React Native应用。和打开其它App一样操作。
    你应该会看到一个“红屏”错误提示。这是正常的，下面的步骤会解决这个报错。
    摇晃设备，或者运行adb shell input keyevent 82，可以打开开发者菜单。
    点击进入Dev Settings。
    点击Debug server host for device。
    输入你电脑的IP地址和端口号（譬如10.0.1.1:8081）。在Mac上，你可以在系统设置/网络里找查询你的IP地址。在Windows上，打开命令提示符并输入ipconfig来查询你的IP地址。在Linux上你可以在终端中输入ifconfig来查询你的IP地址。
    回到开发者菜单然后选择Reload JS。



