package com.facebook.react.bridge;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/bridge/ReactApplicationContext;", "Lcom/facebook/react/bridge/ReactContext;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactApplicationContext extends ReactContext {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactApplicationContext(Context context) {
        super(context.getApplicationContext());
        AbstractC2855l.g(context, "context");
    }
}
