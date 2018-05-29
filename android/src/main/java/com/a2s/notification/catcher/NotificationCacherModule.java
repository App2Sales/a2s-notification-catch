package com.a2s.notification.catcher;
 
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.widget.Toast;

public class NotificationCacherModule extends ReactContextBaseJavaModule {
  
  public NotificationCacherModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }
 
  @Override
  public String getName() {
    return "NotificationCacherModule";
  }
 
  @ReactMethod
  public void show(string message) {
    Toast.makeText(getReactApplicationContext(), message, Toast.LENGTH_LONG).show();
  }
}