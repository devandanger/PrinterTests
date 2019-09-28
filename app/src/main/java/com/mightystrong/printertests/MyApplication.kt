package com.mightystrong.printertests

import android.app.Application
import com.mazenrashed.printooth.Printooth

class MyApplication : Application() {
    override fun onCreate() {
        Printooth.init(this)
        super.onCreate()
    }
}