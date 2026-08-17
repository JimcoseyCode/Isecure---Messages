package com.ov.message;

import P8.q;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.activity.AbstractC1624x;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.ReactActivityDelegateWrapper;
import expo.modules.splashscreen.SplashScreenManager;
import i7.C2735B;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0003R\u0014\u0010\u0019\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/ov/message/MainActivity;", "Lcom/facebook/react/ReactActivity;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isPasswordProtected", "()Z", "Landroid/content/Intent;", "intent", "Li7/B;", "handleNotificationIntent", "(Landroid/content/Intent;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "onResume", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getMainComponentName", "()Ljava/lang/String;", "Lcom/facebook/react/ReactActivityDelegate;", "createReactActivityDelegate", "()Lcom/facebook/react/ReactActivityDelegate;", "invokeDefaultOnBackPressed", "TAG", "Ljava/lang/String;", "OV-Message-1.0.0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MainActivity extends ReactActivity {
    private final String TAG = "MainActivity";

    private final void handleNotificationIntent(Intent intent) {
        if (intent != null && intent.getBooleanExtra("openChatScreen", false)) {
            String stringExtra = intent.getStringExtra("contactPhone");
            intent.removeExtra("openChatScreen");
            intent.removeExtra("contactPhone");
            try {
                ReactInstanceManager reactInstanceManager = getReactNativeHost().getReactInstanceManager();
                AbstractC2855l.f(reactInstanceManager, "getReactInstanceManager(...)");
                ReactContext currentReactContext = reactInstanceManager.getCurrentReactContext();
                SmsEventModule smsEventModule = currentReactContext != null ? (SmsEventModule) currentReactContext.getNativeModule(SmsEventModule.class) : null;
                if (stringExtra != null && !q.f0(stringExtra)) {
                    if (smsEventModule != null) {
                        smsEventModule.emitNavigateToConversation(stringExtra);
                        return;
                    } else {
                        SmsEventModule.setPendingConversationNavigation(stringExtra);
                        return;
                    }
                }
                if (smsEventModule != null) {
                    smsEventModule.emitNavigateToChatScreen();
                } else {
                    SmsEventModule.setPendingChatScreenNavigation();
                }
            } catch (Exception unused) {
                if (stringExtra != null) {
                    try {
                        if (q.f0(stringExtra)) {
                            SmsEventModule.setPendingChatScreenNavigation();
                        } else {
                            SmsEventModule.setPendingConversationNavigation(stringExtra);
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                } else {
                    SmsEventModule.setPendingChatScreenNavigation();
                }
                C2735B c2735b = C2735B.f28704a;
            }
        }
    }

    private final boolean isPasswordProtected() {
        try {
            return getSharedPreferences("OVMessagePrefs", 0).getBoolean("login_password_enabled", false);
        } catch (Exception unused) {
            return true;
        }
    }

    @Override // com.facebook.react.ReactActivity
    protected ReactActivityDelegate createReactActivityDelegate() {
        return new ReactActivityDelegateWrapper(this, true, new DefaultReactActivityDelegate(this, getMainComponentName(), DefaultNewArchitectureEntryPoint.getFabricEnabled()) { // from class: com.ov.message.MainActivity.createReactActivityDelegate.1
        });
    }

    @Override // com.facebook.react.ReactActivity
    protected String getMainComponentName() {
        return "main";
    }

    @Override // com.facebook.react.ReactActivity, com.facebook.react.modules.core.DefaultHardwareBackBtnHandler
    public void invokeDefaultOnBackPressed() {
        if (Build.VERSION.SDK_INT > 30) {
            super.invokeDefaultOnBackPressed();
        } else {
            if (moveTaskToBack(false)) {
                return;
            }
            super.invokeDefaultOnBackPressed();
        }
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.AbstractActivityC1749q, androidx.activity.AbstractActivityC1618q, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreenManager.INSTANCE.registerOnActivity(this);
        AbstractC1624x.b(this, null, null, 3, null);
        super.onCreate(null);
        if (getSharedPreferences("OVMessagePrefs", 0).getBoolean("secure_window_enabled", false)) {
            getWindow().addFlags(8192);
        }
        handleNotificationIntent(getIntent());
    }

    @Override // com.facebook.react.ReactActivity, androidx.activity.AbstractActivityC1618q, android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC2855l.g(intent, "intent");
        if (intent.getData() != null && isPasswordProtected()) {
            Objects.toString(intent.getData());
            intent.setData(null);
        }
        super.onNewIntent(intent);
        setIntent(intent);
        handleNotificationIntent(intent);
    }

    @Override // com.facebook.react.ReactActivity, androidx.fragment.app.AbstractActivityC1749q, android.app.Activity
    protected void onResume() {
        super.onResume();
        getWindow().setSoftInputMode(19);
        Object systemService = getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        View currentFocus = getCurrentFocus();
        if (currentFocus == null || inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }
}
