package com.tf

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.Promise

abstract class TfSpec internal constructor(context: ReactApplicationContext) :
  ReactContextBaseJavaModule(context) {
}
