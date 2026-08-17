package com.google.android.gms.common.api.internal;

import P4.C1379m;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import p4.AbstractC3071r;
import p4.InterfaceC3063j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends AbstractC3071r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f21103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C1379m f21104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC3063j f21105d;

    public v(int i10, d dVar, C1379m c1379m, InterfaceC3063j interfaceC3063j) {
        super(i10);
        this.f21104c = c1379m;
        this.f21103b = dVar;
        this.f21105d = interfaceC3063j;
        if (i10 == 2 && dVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void a(Status status) {
        this.f21104c.d(this.f21105d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void b(Exception exc) {
        this.f21104c.d(exc);
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void c(n nVar) throws DeadObjectException {
        try {
            this.f21103b.b(nVar.v(), this.f21104c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(x.e(e11));
        } catch (RuntimeException e12) {
            this.f21104c.d(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.x
    public final void d(g gVar, boolean z10) {
        gVar.b(this.f21104c, z10);
    }

    @Override // p4.AbstractC3071r
    public final boolean f(n nVar) {
        return this.f21103b.c();
    }

    @Override // p4.AbstractC3071r
    public final Feature[] g(n nVar) {
        return this.f21103b.e();
    }
}
