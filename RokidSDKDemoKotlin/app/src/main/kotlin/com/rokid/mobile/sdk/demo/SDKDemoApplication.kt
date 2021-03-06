package com.rokid.mobile.sdk.demo

import android.app.Application
import com.rokid.mobile.sdk.RokidMobileSDK
import com.rokid.mobile.sdk.annotation.SDKEnvType
import com.rokid.mobile.sdk.callback.SDKInitCompletedCallback

/**
 * Created by wangshuwen on 2017/12/3.
 */
class SDKDemoApplication : Application() {

    companion object {
        private lateinit var instance: Application

        fun getContext(): Application {
            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        RokidMobileSDK.env(SDKEnvType.RELEASE)

        RokidMobileSDK.init(this,
                "rokid-demo",
                "rokid-demo-secret",
                "",
                object : SDKInitCompletedCallback {
                    override fun onInitFailed(p0: String?, p1: String?) {
                    }

                    override fun onInitSuccess() {
                    }

                })

        RokidMobileSDK.openLog(true)
    }


}