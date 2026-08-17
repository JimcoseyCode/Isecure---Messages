package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class n extends F4.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f21243b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b bVar, Looper looper) {
        super(looper);
        this.f21243b = bVar;
    }

    private static final void a(Message message) {
        o oVar = (o) message.obj;
        oVar.b();
        oVar.e();
    }

    private static final boolean b(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f21243b.f21201C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.f21243b.s()) || message.what == 5)) && !this.f21243b.d()) {
            a(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.f21243b.f21227z = new ConnectionResult(message.arg2);
            if (b.f0(this.f21243b)) {
                b bVar = this.f21243b;
                if (!bVar.f21199A) {
                    bVar.g0(3, null);
                    return;
                }
            }
            b bVar2 = this.f21243b;
            ConnectionResult connectionResult = bVar2.f21227z != null ? bVar2.f21227z : new ConnectionResult(8);
            this.f21243b.f21217p.a(connectionResult);
            this.f21243b.K(connectionResult);
            return;
        }
        if (i11 == 5) {
            b bVar3 = this.f21243b;
            ConnectionResult connectionResult2 = bVar3.f21227z != null ? bVar3.f21227z : new ConnectionResult(8);
            this.f21243b.f21217p.a(connectionResult2);
            this.f21243b.K(connectionResult2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f21243b.f21217p.a(connectionResult3);
            this.f21243b.K(connectionResult3);
            return;
        }
        if (i11 == 6) {
            this.f21243b.g0(5, null);
            b bVar4 = this.f21243b;
            if (bVar4.f21222u != null) {
                bVar4.f21222u.c(message.arg2);
            }
            this.f21243b.L(message.arg2);
            b.e0(this.f21243b, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.f21243b.i()) {
            a(message);
        } else if (b(message)) {
            ((o) message.obj).c();
        } else {
            new Exception();
        }
    }
}
