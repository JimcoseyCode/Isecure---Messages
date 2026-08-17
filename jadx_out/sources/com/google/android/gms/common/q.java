package com.google.android.gms.common;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final o f21317a = new i(m.f("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final o f21318b = new j(m.f("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final o f21319c = new k(m.f("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final o f21320d = new l(m.f("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f21321e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Context f21322f;

    static synchronized void a(Context context) {
        if (f21322f == null) {
            if (context != null) {
                f21322f = context.getApplicationContext();
            }
        }
    }
}
