/*
       Author KongYang, 橙朴上海智能科技有限公司 COOLTOUCH CHINA.
       联系方式: 4008-7676-82
*/
package com.chengputech.coolcloud;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

import com.mxchip.wifiman.EasyLinkWifiManager;

import android.Manifest;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.MediaScannerConnection;
import android.media.MediaScannerConnection.MediaScannerConnectionClient;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import android.util.Log;
import android.content.pm.PackageManager;
/**
 * This class launches the camera view, allows the user to take a picture, closes the camera view,
 * and returns the captured image.  When the camera view is closed, the screen displayed before
 * the camera view was shown is redisplayed.
 */
public class MicoSDK extends CordovaPlugin {
	private EasyLinkWifiManager mWifiManager = null;
	
	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("beep".equals(action)) {
//            this.beep(args.getLong(0));
//            callbackContext.success();
//            return true;
        	callbackContext.success("micro sdk !!!");
        	return true;
        } else if("getSsid".equals(action)) {
        	mWifiManager = new EasyLinkWifiManager(webView.getContext());
        	callbackContext.success(mWifiManager.getCurrentSSID());
        	return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
}
