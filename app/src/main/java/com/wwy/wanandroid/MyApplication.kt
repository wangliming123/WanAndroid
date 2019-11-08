package com.wwy.wanandroid

import android.app.Application
import android.content.Context
import android.util.Log
import com.coder.zzq.smartshow.core.SmartShow
import com.coder.zzq.smartshow.snackbar.SmartSnackbar
import com.wwy.wanandroid.db.AppDatabase
import timber.log.Timber
import kotlin.properties.Delegates

/**
 *@创建者wwy
 *@创建时间 2019/10/9 16:12
 *@描述
 */
class MyApplication : Application() {
    companion object {
        var CONTEXT: Context by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        CONTEXT = applicationContext
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
        SmartShow.init(this)
        SmartSnackbar.setting()
            .backgroundColorRes(R.color.colorPrimary)
            .dismissOnLeave(true)
    }
}