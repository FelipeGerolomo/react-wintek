
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;


public class RNWintecModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNWintecModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNWintec";
  }

  @ReactMethod
  public String getText(String message) {
    return message;
  }

  
}