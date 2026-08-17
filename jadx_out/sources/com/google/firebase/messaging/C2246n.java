package com.google.firebase.messaging;

import P4.AbstractC1378l;
import P4.AbstractC1381o;
import P4.InterfaceC1369c;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import f1.ExecutorC2595b;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class C2246n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f24301c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static p0 f24302d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f24303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f24304b = new ExecutorC2595b();

    public C2246n(Context context) {
        this.f24303a = context;
    }

    public static /* synthetic */ AbstractC1378l a(Context context, Intent intent, boolean z10, AbstractC1378l abstractC1378l) {
        return (y4.l.g() && ((Integer) abstractC1378l.l()).intValue() == 402) ? e(context, intent, z10).i(new ExecutorC2595b(), new InterfaceC1369c() { // from class: com.google.firebase.messaging.l
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l2) {
                return C2246n.d(abstractC1378l2);
            }
        }) : abstractC1378l;
    }

    public static /* synthetic */ Integer c(AbstractC1378l abstractC1378l) {
        return -1;
    }

    public static /* synthetic */ Integer d(AbstractC1378l abstractC1378l) {
        return 403;
    }

    private static AbstractC1378l e(Context context, Intent intent, boolean z10) {
        p0 p0VarF = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z10) {
            return p0VarF.d(intent).i(new ExecutorC2595b(), new InterfaceC1369c() { // from class: com.google.firebase.messaging.m
                @Override // P4.InterfaceC1369c
                public final Object a(AbstractC1378l abstractC1378l) {
                    return C2246n.c(abstractC1378l);
                }
            });
        }
        if (Z.b().e(context)) {
            k0.e(context, p0VarF, intent);
        } else {
            p0VarF.d(intent);
        }
        return AbstractC1381o.f(-1);
    }

    private static p0 f(Context context, String str) {
        p0 p0Var;
        synchronized (f24301c) {
            try {
                if (f24302d == null) {
                    f24302d = new p0(context, str);
                }
                p0Var = f24302d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p0Var;
    }

    public AbstractC1378l g(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return h(this.f24303a, intent);
    }

    public AbstractC1378l h(final Context context, final Intent intent) {
        boolean z10 = y4.l.g() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? AbstractC1381o.c(this.f24304b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(Z.b().g(context, intent));
            }
        }).j(this.f24304b, new InterfaceC1369c() { // from class: com.google.firebase.messaging.k
            @Override // P4.InterfaceC1369c
            public final Object a(AbstractC1378l abstractC1378l) {
                return C2246n.a(context, intent, z11, abstractC1378l);
            }
        }) : e(context, intent, z11);
    }
}
