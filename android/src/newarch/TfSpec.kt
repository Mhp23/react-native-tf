package com.tf

import com.facebook.react.bridge.ReactApplicationContext

abstract class TfSpec internal constructor(context: ReactApplicationContext) :
  NativeTfSpec(context) {
}
