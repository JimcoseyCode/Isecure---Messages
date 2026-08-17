package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import r4.AbstractC3268i;
import r4.F;
import r4.H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class x implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ y f21261a;

    /* synthetic */ x(y yVar, H h10) {
        this.f21261a = yVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f21261a.f21262f) {
                try {
                    F f10 = (F) message.obj;
                    w wVar = (w) this.f21261a.f21262f.get(f10);
                    if (wVar != null && wVar.i()) {
                        if (wVar.j()) {
                            wVar.g("GmsClientSupervisor");
                        }
                        this.f21261a.f21262f.remove(f10);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f21261a.f21262f) {
            try {
                F f11 = (F) message.obj;
                w wVar2 = (w) this.f21261a.f21262f.get(f11);
                if (wVar2 != null && wVar2.a() == 3) {
                    String.valueOf(f11);
                    new Exception();
                    ComponentName componentNameB = wVar2.b();
                    if (componentNameB == null) {
                        componentNameB = f11.a();
                    }
                    if (componentNameB == null) {
                        String strC = f11.c();
                        AbstractC3268i.k(strC);
                        componentNameB = new ComponentName(strC, "unknown");
                    }
                    wVar2.onServiceDisconnected(componentNameB);
                }
            } finally {
            }
        }
        return true;
    }
}
