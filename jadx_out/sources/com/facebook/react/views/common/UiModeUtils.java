package com.facebook.react.views.common;

import android.content.Context;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/react/views/common/UiModeUtils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "isDarkMode", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UiModeUtils {
    public static final UiModeUtils INSTANCE = new UiModeUtils();

    private UiModeUtils() {
    }

    public static final boolean isDarkMode(Context context) {
        AbstractC2855l.g(context, "context");
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }
}
