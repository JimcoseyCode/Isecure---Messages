package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.AbstractC1688p0;
import androidx.core.view.L0;
import androidx.core.view.l1;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.common.UiModeUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u000b\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u001b\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\f\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u000e\u0010\u000b\"\u001a\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013\"$\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Li7/B;", "setEdgeToEdgeFeatureFlagOn", "()V", "Landroid/view/Window;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isTranslucent", "setStatusBarTranslucency", "(Landroid/view/Window;Z)V", "isHidden", "setStatusBarVisibility", "statusBarHide", "(Landroid/view/Window;)V", "statusBarShow", "enableEdgeToEdge", "disableEdgeToEdge", PointerEventHelper.POINTER_TYPE_UNKNOWN, "LightNavigationBarColor", "I", "getLightNavigationBarColor", "()I", "DarkNavigationBarColor", "getDarkNavigationBarColor", "value", "isEdgeToEdgeFeatureFlagOn", "Z", "()Z", "ReactAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class WindowUtilKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20642a = 0;
    private static boolean isEdgeToEdgeFeatureFlagOn;
    private static final int LightNavigationBarColor = Color.argb(230, 255, 255, 255);
    private static final int DarkNavigationBarColor = Color.argb(IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT, 27, 27, 27);

    public static final void disableEdgeToEdge(Window window) {
        AbstractC2855l.g(window, "<this>");
        AbstractC1688p0.c(window, true);
    }

    public static final void enableEdgeToEdge(Window window) {
        AbstractC2855l.g(window, "<this>");
        AbstractC1688p0.c(window, false);
        Context context = window.getContext();
        AbstractC2855l.f(context, "getContext(...)");
        boolean zIsDarkMode = UiModeUtils.isDarkMode(context);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(true);
        }
        window.setStatusBarColor(0);
        window.setNavigationBarColor(i10 < 29 ? (i10 < 26 || zIsDarkMode) ? DarkNavigationBarColor : LightNavigationBarColor : 0);
        new l1(window, window.getDecorView()).d(!zIsDarkMode);
        if (i10 >= 28) {
            window.getAttributes().layoutInDisplayCutoutMode = i10 >= 30 ? 3 : 1;
        }
    }

    public static final int getDarkNavigationBarColor() {
        return DarkNavigationBarColor;
    }

    public static final int getLightNavigationBarColor() {
        return LightNavigationBarColor;
    }

    public static final boolean isEdgeToEdgeFeatureFlagOn() {
        return isEdgeToEdgeFeatureFlagOn;
    }

    public static final void setEdgeToEdgeFeatureFlagOn() {
        isEdgeToEdgeFeatureFlagOn = true;
    }

    public static final void setStatusBarTranslucency(Window window, boolean z10) {
        AbstractC2855l.g(window, "<this>");
        if (z10) {
            window.getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.views.view.f
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return WindowUtilKt.setStatusBarTranslucency$lambda$0(view, windowInsets);
                }
            });
        } else {
            window.getDecorView().setOnApplyWindowInsetsListener(null);
        }
        AbstractC1658a0.h0(window.getDecorView());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets setStatusBarTranslucency$lambda$0(View v10, WindowInsets insets) {
        AbstractC2855l.g(v10, "v");
        AbstractC2855l.g(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = v10.onApplyWindowInsets(insets);
        return windowInsetsOnApplyWindowInsets.replaceSystemWindowInsets(windowInsetsOnApplyWindowInsets.getSystemWindowInsetLeft(), 0, windowInsetsOnApplyWindowInsets.getSystemWindowInsetRight(), windowInsetsOnApplyWindowInsets.getSystemWindowInsetBottom());
    }

    public static final void setStatusBarVisibility(Window window, boolean z10) {
        AbstractC2855l.g(window, "<this>");
        if (z10) {
            statusBarHide(window);
        } else {
            statusBarShow(window);
        }
    }

    private static final void statusBarHide(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            l1 l1Var = new l1(window, window.getDecorView());
            l1Var.f(2);
            l1Var.b(L0.p.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
                window.setDecorFitsSystemWindows(false);
            }
            window.addFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
            window.clearFlags(2048);
        }
    }

    private static final void statusBarShow(Window window) {
        if (isEdgeToEdgeFeatureFlagOn) {
            l1 l1Var = new l1(window, window.getDecorView());
            l1Var.f(2);
            l1Var.g(L0.p.f());
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                window.getAttributes().layoutInDisplayCutoutMode = 0;
                window.setDecorFitsSystemWindows(true);
            }
            window.addFlags(2048);
            window.clearFlags(IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET);
        }
    }
}
