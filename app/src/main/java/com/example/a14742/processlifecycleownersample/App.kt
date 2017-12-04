package com.example.a14742.processlifecycleownersample

import android.app.Application
import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.arch.lifecycle.ProcessLifecycleOwner
import android.util.Log

class App : Application(), LifecycleObserver {

  override fun onCreate() {
    super.onCreate()
    Log.i("process", "onCreate first")
    ProcessLifecycleOwner.get().lifecycle.addObserver(this)
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
  fun onAppCreate() {
    Log.i("process", "onCreate")
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_START)
  fun onAppStart() {
    Log.i("process", "onStart")
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
  fun onAppResume() {
    Log.i("process", "onStart")
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
  fun onAppPause() {
    Log.i("process", "onPause")
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
  fun onAppStop() {
    Log.i("process", "onStop")
  }

  @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
  fun onAppDestroy() {
    Log.i("process", "onDestroy")
  }

  override fun onTerminate() {
    super.onTerminate()
    Log.i("process", "onTerminate")
  }
}