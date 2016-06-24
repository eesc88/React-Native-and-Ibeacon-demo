package com.example.wangjing.rntext;


import android.os.Bundle;
import android.view.KeyEvent;

import com.facebook.react.LifecycleState;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactPackage;
import com.facebook.react.ReactRootView;

import com.facebook.react.shell.MainReactPackage;
import com.learnium.RNDeviceInfo.RNDeviceInfo;
import com.microsoft.codepush.react.CodePush;
import com.theweflex.react.WeChatPackage;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Nullable;

public class RNActivity extends ReactActivity {



    private CodePush codePush;

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected String getMainComponentName() {
        return "MyAwesomeApp";
    }

    /**
     * Returns whether dev mode should be enabled.
     * This enables e.g. the dev menu.
     */
    @Override
    protected boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
    }

    @Nullable
    @Override
    protected String getJSBundleFile() {
        return this.codePush.getBundleUrl("index.android.bundle");
    }

    /**
     * A list of packages used by the app. If the app uses additional views
     * or modules besides the default ones, add more packages here.
     */
    @Override
    protected List<ReactPackage> getPackages() {
        String deploymentKey;
        if (BuildConfig.DEBUG) {
            deploymentKey = "U7ZF2kYt5EzV14JyIB22SLRhQ2KBV1Ifekvul";
        } else {
            deploymentKey = "RGOUfyINiLicZnld67aD0nrbRvyLV1Ifekvul";
        }
        this.codePush = new CodePush(deploymentKey, this, BuildConfig.DEBUG);
        return Arrays.<ReactPackage>asList(
                new MainReactPackage(),
                new WeChatPackage(),
                this.codePush.getReactPackage(),
                new RNDeviceInfo());
    }


//    private CodePush codePush;
//
//    private ReactRootView mReactRootView;
//    private ReactInstanceManager mReactInstanceManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        mReactRootView = new ReactRootView(this);
//        mReactInstanceManager = ReactInstanceManager.builder()
//                .setApplication(getApplication())
//                .setBundleAssetName("index.android.bundle")
//                .setJSMainModuleName("index.android")
//                .addPackage(new MainReactPackage())
//                .setUseDeveloperSupport(BuildConfig.DEBUG)
//                .setInitialLifecycleState(LifecycleState.RESUMED)
//                .build();
//        mReactRootView.startReactApplication(mReactInstanceManager, "MyAwesomeApp", null);
//
//        setContentView(mReactRootView);
//    }
//
//    @Override
//    public void invokeDefaultOnBackPressed() {
//        super.onBackPressed();
//    }
//
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostPause();
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onHostResume(this, this);
//        }
//    }
//
//
//    @Override
//    public void onBackPressed() {
//        if (mReactInstanceManager != null) {
//            mReactInstanceManager.onBackPressed();
//        } else {
//            super.onBackPressed();
//        }
//    }
//
//
//    @Override
//    public boolean onKeyUp(int keyCode, KeyEvent event) {
//        if (keyCode == KeyEvent.KEYCODE_MENU && mReactInstanceManager != null) {
//            mReactInstanceManager.showDevOptionsDialog();
//            return true;
//        }
//        return super.onKeyUp(keyCode, event);
//    }
//
//
//    @Nullable
//    @Override
//    protected String getJSBundleFile() {
//        return this.codePush.getBundleUrl("index.android.bundle");
//    }
//
//    /**
//     * A list of packages used by the app. If the app uses additional views
//     * or modules besides the default ones, add more packages here.
//     */
//    @Override
//    protected List<ReactPackage> getPackages() {
//        String deploymentKey;
//        if (BuildConfig.DEBUG) {
//            deploymentKey = "U7ZF2kYt5EzV14JyIB22SLRhQ2KBV1Ifekvul";
//        } else {
//            deploymentKey = "RGOUfyINiLicZnld67aD0nrbRvyLV1Ifekvul";
//        }
//        this.codePush = new CodePush(deploymentKey, this, BuildConfig.DEBUG);
//        return Arrays.<ReactPackage>asList(
//                new MainReactPackage(),
//                new WeChatPackage(),
//                this.codePush.getReactPackage(),
//                new RNDeviceInfo());
//    }
}
