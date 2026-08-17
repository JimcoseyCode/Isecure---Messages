package com.facebook.react.uimanager;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.L0;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020\u001e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010'\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0000¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020(8\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*R\u001e\u0010+\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b+\u0010,\u0012\u0004\b-\u0010\u0003R\u001e\u0010.\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b.\u0010,\u0012\u0004\b/\u0010\u0003¨\u00060"}, d2 = {"Lcom/facebook/react/uimanager/DisplayMetricsHolder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/util/DisplayMetrics;", "getWindowDisplayMetrics", "()Landroid/util/DisplayMetrics;", "displayMetrics", "Li7/B;", "setWindowDisplayMetrics", "(Landroid/util/DisplayMetrics;)V", "getScreenDisplayMetrics", "setScreenDisplayMetrics", "Landroid/content/Context;", "context", "initDisplayMetricsIfNotInitialized", "(Landroid/content/Context;)V", "initDisplayMetrics", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontScale", "Lcom/facebook/react/bridge/WritableMap;", "getDisplayMetricsWritableMap", "(D)Lcom/facebook/react/bridge/WritableMap;", "getPhysicalPixelsWritableMap", "(Landroid/util/DisplayMetrics;D)Lcom/facebook/react/bridge/WritableMap;", "Landroid/app/Activity;", "activity", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getEncodedScreenSizeWithoutVerticalInsets", "(Landroid/app/Activity;)J", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStatusBarHeightPx$ReactAndroid_release", "(Landroid/app/Activity;)I", "getStatusBarHeightPx", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "encodeFloatsToLong$ReactAndroid_release", "(FF)J", "encodeFloatsToLong", PointerEventHelper.POINTER_TYPE_UNKNOWN, "INITIALIZATION_MISSING_MESSAGE", "Ljava/lang/String;", "windowDisplayMetrics", "Landroid/util/DisplayMetrics;", "getWindowDisplayMetrics$annotations", "screenDisplayMetrics", "getScreenDisplayMetrics$annotations", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisplayMetricsHolder {
    private static final String INITIALIZATION_MISSING_MESSAGE = "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics";
    public static final DisplayMetricsHolder INSTANCE = new DisplayMetricsHolder();
    private static DisplayMetrics screenDisplayMetrics;
    private static DisplayMetrics windowDisplayMetrics;

    private DisplayMetricsHolder() {
    }

    public static final WritableMap getDisplayMetricsWritableMap(double fontScale) {
        if (windowDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        DisplayMetricsHolder displayMetricsHolder = INSTANCE;
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        AbstractC2855l.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("windowPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics, fontScale));
        DisplayMetrics displayMetrics2 = screenDisplayMetrics;
        AbstractC2855l.e(displayMetrics2, "null cannot be cast to non-null type android.util.DisplayMetrics");
        writableNativeMap.putMap("screenPhysicalPixels", displayMetricsHolder.getPhysicalPixelsWritableMap(displayMetrics2, fontScale));
        return writableNativeMap;
    }

    public static final long getEncodedScreenSizeWithoutVerticalInsets(Activity activity) {
        Window window;
        View decorView;
        L0 l0F;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (l0F = AbstractC1658a0.F(decorView)) == null) {
            return 0L;
        }
        x0.e eVarF = l0F.f(L0.p.f() | L0.p.e() | L0.p.a());
        AbstractC2855l.f(eVarF, "getInsets(...)");
        int i10 = eVarF.f33238b + eVarF.f33240d;
        DisplayMetricsHolder displayMetricsHolder = INSTANCE;
        PixelUtil pixelUtil = PixelUtil.INSTANCE;
        if (screenDisplayMetrics == null) {
            throw new IllegalStateException("Required value was null.");
        }
        float fPxToDp = pixelUtil.pxToDp(r2.widthPixels);
        if (screenDisplayMetrics != null) {
            return displayMetricsHolder.encodeFloatsToLong$ReactAndroid_release(fPxToDp, pixelUtil.pxToDp(r4.heightPixels - i10));
        }
        throw new IllegalStateException("Required value was null.");
    }

    private final WritableMap getPhysicalPixelsWritableMap(DisplayMetrics displayMetrics, double fontScale) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("width", displayMetrics.widthPixels);
        writableNativeMap.putInt("height", displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", fontScale);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static final DisplayMetrics getScreenDisplayMetrics() {
        DisplayMetrics displayMetrics = screenDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        AbstractC2855l.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final DisplayMetrics getWindowDisplayMetrics() {
        DisplayMetrics displayMetrics = windowDisplayMetrics;
        if (displayMetrics == null) {
            throw new IllegalStateException(INITIALIZATION_MISSING_MESSAGE);
        }
        AbstractC2855l.e(displayMetrics, "null cannot be cast to non-null type android.util.DisplayMetrics");
        return displayMetrics;
    }

    public static final void initDisplayMetrics(Context context) {
        AbstractC2855l.g(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        windowDisplayMetrics = displayMetrics;
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        Object systemService = context.getSystemService("window");
        AbstractC2855l.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics2);
        displayMetrics2.scaledDensity = displayMetrics.scaledDensity;
        screenDisplayMetrics = displayMetrics2;
    }

    public static final void initDisplayMetricsIfNotInitialized(Context context) {
        AbstractC2855l.g(context, "context");
        if (screenDisplayMetrics != null) {
            return;
        }
        initDisplayMetrics(context);
    }

    public static final void setScreenDisplayMetrics(DisplayMetrics displayMetrics) {
        screenDisplayMetrics = displayMetrics;
    }

    public static final void setWindowDisplayMetrics(DisplayMetrics displayMetrics) {
        windowDisplayMetrics = displayMetrics;
    }

    public final long encodeFloatsToLong$ReactAndroid_release(float width, float height) {
        return ((long) Float.floatToRawIntBits(height)) | (((long) Float.floatToRawIntBits(width)) << 32);
    }

    public final int getStatusBarHeightPx$ReactAndroid_release(Activity activity) {
        Window window;
        View decorView;
        L0 l0F;
        if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (l0F = AbstractC1658a0.F(decorView)) == null) {
            return 0;
        }
        return l0F.f(L0.p.f() | L0.p.e() | L0.p.a()).f33238b;
    }

    private static /* synthetic */ void getScreenDisplayMetrics$annotations() {
    }

    private static /* synthetic */ void getWindowDisplayMetrics$annotations() {
    }
}
