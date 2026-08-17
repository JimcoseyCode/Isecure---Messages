package com.th3rdwave.safeareacontext;

import android.content.Context;
import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerHelper;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    public static final ReactContext a(View view) {
        AbstractC2855l.g(view, "view");
        return UIManagerHelper.getReactContext(view);
    }

    public static final int b(Context context) {
        AbstractC2855l.g(context, "context");
        return UIManagerHelper.getSurfaceId(context);
    }
}
