package com.google.android.gms.common.api.internal;

import P4.C1379m;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import o4.C3009b;
import p4.AbstractC3071r;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
abstract class u extends AbstractC3071r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C1379m f21102b;

    public u(int i10, C1379m c1379m) {
        super(i10);
        this.f21102b = c1379m;
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f21102b.d(new C3009b(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f21102b.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(n nVar) throws DeadObjectException {
        try {
            h(nVar);
        } catch (DeadObjectException e10) {
            a(x.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(x.e(e11));
        } catch (RuntimeException e12) {
            this.f21102b.d(e12);
        }
    }

    protected abstract void h(n nVar);
}
