package r6;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.uimanager.UIManagerHelper;
import com.facebook.react.uimanager.events.EventDispatcher;
import f.AbstractC2573f;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f31975a = 2;

    public static final ViewGroup a(ReactContext reactContext) {
        Window window;
        View decorView;
        View rootView;
        AbstractC2855l.g(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootView = decorView.getRootView()) == null) {
            return null;
        }
        return (ViewGroup) rootView.findViewById(AbstractC2573f.f26842d);
    }

    public static final EventDispatcher b(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "<this>");
        return UIManagerHelper.getEventDispatcher(reactContext, f31975a);
    }

    public static final View c(ReactContext reactContext) {
        Window window;
        View decorView;
        AbstractC2855l.g(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getRootView();
    }

    public static final UIManager d(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "<this>");
        return UIManagerHelper.getUIManager(reactContext, f31975a);
    }

    public static final int e(ReactContext reactContext) {
        Window window;
        WindowManager.LayoutParams attributes;
        AbstractC2855l.g(reactContext, "<this>");
        Activity currentActivity = reactContext.getCurrentActivity();
        if (currentActivity == null || (window = currentActivity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
            return 0;
        }
        return attributes.softInputMode;
    }
}
