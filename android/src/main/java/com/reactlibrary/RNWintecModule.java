
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import android.widget.Toast;

import cn.wintec.wtandroidjar.Printer;
import cn.wintec.wtandroidjar.ComIO;
import android.widget.Spinner;
import android.content.SharedPreferences;
import android.content.Context;

public class RNWintecModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  public static final String ISO_8859_11 = "GBK";

  public RNWintecModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNWintec";
  }

  @ReactMethod
  public void print(String message) {
    Printer printer = null;
	  String devicePath = "/dev/ttySAC1"; 
    ComIO.Baudrate baudrate;

		baudrate = ComIO.Baudrate.valueOf("BAUD_38400");
	  
		printer = new Printer(devicePath, baudrate);

    printer.PRN_DisableChinese();
		printer.PRN_SetCodePage(70);
    printer.PRN_SelectUnicode(12);
    printer.PRN_Print(message, ISO_8859_11);
  }

  @ReactMethod
  public void feedLine() {
    Printer printer = null;
	  String devicePath = "/dev/ttySAC1"; 
    ComIO.Baudrate baudrate;

		baudrate = ComIO.Baudrate.valueOf("BAUD_38400");
	  
		printer = new Printer(devicePath, baudrate);

    printer.PRN_DisableChinese();
		printer.PRN_SetCodePage(70);
    printer.PRN_PrintAndFeedLine(6);
  }



  
}