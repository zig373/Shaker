package com.shaker.shaker.service;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class ShakerApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }
}