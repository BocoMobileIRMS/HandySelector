#   敏捷开发基本框架
![](HandyBase.png)

## 最新版本
    compile 'com.github.liujie045:HandySelector:1.0.2'

## 项目说明
此项目整合了三个开源项目：<br>
选择器：[gzu-liyujiang/AndroidPicker](https://github.com/gzu-liyujiang/AndroidPicker)<br>
对话框：[hss01248/DialogUtil](https://github.com/hss01248/DialogUtil)<br>
多选、单选、滑动Switch控件：[Mixiaoxiao/SmoothCompoundButton](https://github.com/Mixiaoxiao/SmoothCompoundButton)<br>
Spinner控件：[jaredrummler/material-spinner](https://github.com/jaredrummler/material-spinner)

## 项目引用

#### Step 1.添加maven地址到Project的build.gradle配置文件中
```javascript
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
```

#### Step 2.添加compile引用到Module的build.gradle配置文件中
```javascript
    dependencies {
        ...
        compile 'com.github.liujie045:HandySelector:最新版本'
    }
```

#### Step 3.使用StyledDialog时，需要在承载的Activity中进行软引用配置
```javascript
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ...
        DialogManager.getInstance().setCurrentActivity(this);
    }
```

#### Step 4.使用Spinner时，自xml定义属性说明
属性 | 类型 | 说明
----|------|----
ms_arrow_tint | color | 设置箭头颜色
ms_hide_arrow |	boolean | 设置箭头显影
ms_background_color | color | 设置Spinner背景颜色
ms_text_color | color | 设置Spinner文字颜色
ms_dropdown_max_height | dimension | 设置Spinner最大高度
ms_dropdown_height | dimension | 设置Spinner高度

##  更新日志
***2017年5月10日 v1.0.2***

* 增加Spinner xml中配置background的能力

***2017年5月2日 v1.0.1***

* 增加Spinner

***2017年5月2日 v1.0.0***

* 初始化项目提交