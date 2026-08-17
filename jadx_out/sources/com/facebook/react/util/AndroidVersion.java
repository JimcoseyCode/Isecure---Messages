package com.facebook.react.util;

import android.content.Context;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/facebook/react/util/AndroidVersion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "VERSION_CODE_BAKLAVA", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isAtLeastTargetSdk36", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidVersion {
    public static final AndroidVersion INSTANCE = new AndroidVersion();
    private static final int VERSION_CODE_BAKLAVA = 36;

    private AndroidVersion() {
    }

    public static final boolean isAtLeastTargetSdk36(Context context) {
        AbstractC2855l.g(context, "context");
        return Build.VERSION.SDK_INT >= VERSION_CODE_BAKLAVA && context.getApplicationInfo().targetSdkVersion >= VERSION_CODE_BAKLAVA;
    }
}
