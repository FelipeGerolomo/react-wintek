package com.reactlibrary;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;


import cn.wintec.wtandroidjar.ComIO;
import cn.wintec.wtandroidjar.Printer;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class Printer extends Activity {
    Printer printer = null;
    String devicePath;
    ComIO.Baudrate baudrate;
    private Spinner Spinnerserport;

    
    devicePath =mSharedPreferences.getString("devicePath","/dev/ttySAC1");
    baudrate =ComIO.Baudrate.valueOf(mSharedPreferences.getString(
            "baudrate","BAUD_38400"));
    printer = new Printer(devicePath, baudrate);
        printer.PRN_Print("Ji'nan Kuangshan wholesale market","gbk");
        printer.PRN_Print("Trade confirmations < buyer associated >","gbk");
        printer.PRN_Print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~","gbk");
        printer.PRN_Print("bill no:3702564897456212000001","gbk");
        printer.PRN_Print("saler:liangxiaohong","gbk");
        printer.PRN_Print("buyer:zhanghanyang","gbk");
        printer.PRN_Print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~","gbk");
        printer.PRN_Print("trace code:37010000000000000001","gbk");
        printer.PRN_Print("goods:ginger","gbk");
        printer.PRN_Print("weight/qty:10.00","gbk");
        printer.PRN_Print("price:15.25yuan/kg","gbk");
        printer.PRN_Print("amount:152.5yuan","gbk");
        printer.PRN_Print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~","gbk");
        printer.PRN_Print("total amount:152.5yuan","gbk");
        printer.PRN_PrintAndFeedLine(6);
    // print.PRN_HalfCutPage();
}