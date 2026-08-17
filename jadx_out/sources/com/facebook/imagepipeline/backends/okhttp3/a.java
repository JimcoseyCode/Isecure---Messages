package com.facebook.imagepipeline.backends.okhttp3;

import Y2.C1534u;
import android.content.Context;
import e9.z;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f19851a = new a();

    private a() {
    }

    public static final C1534u.a a(Context context, z okHttpClient) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(okHttpClient, "okHttpClient");
        return C1534u.f12756M.i(context).S(new b(okHttpClient));
    }
}
