package com.alipay.sdk.pay.demo;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

import org.autojs.plugin.sdk.Plugin;

public class PluginAlipay extends Plugin {
    public PluginAlipay(Context context, Context selfContext, Object runtime, Object topLevelScope) {
        super(context, selfContext, runtime, topLevelScope);
    }

    // 返回插件的JavaScript胶水层代码的assets目录路径
    @Override
    public String getAssetsScriptDir() {
        return "plugin_alipay";
    }

    // 插件public API，可被JavaScript代码调用
    public String getStringFromJava() {
        return "Hello, Auto.js!";
    }

    // 插件public API，可被JavaScript代码调用
    public void pay(String message) {
        getSelfContext().startActivity(new Intent(getSelfContext(), PayDemoActivity.class)
                .putExtra("message", message)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }

//    @Override
//    public ComponentName getService() {
//        return new ComponentName(getSelfContext().getPackageName(), AlipayService.class.getName());
//    }
}
