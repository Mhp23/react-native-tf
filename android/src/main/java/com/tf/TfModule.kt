package com.tf

import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactMethod
import com.facebook.react.bridge.Promise

class TfModule internal constructor(context: ReactApplicationContext) :
  TfSpec(context) {

  override fun getName(): String {
    return NAME
  }

  companion object {
    const val NAME = "Tf"
  }
}
