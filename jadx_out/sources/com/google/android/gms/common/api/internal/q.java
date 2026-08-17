package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import o4.C3008a;
import p4.C3055b;
import p4.InterfaceC3076w;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class q implements b.c, InterfaceC3076w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3008a.f f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3055b f21087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.android.gms.common.internal.e f21088c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Set f21089d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f21090e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ C2098b f21091f;

    public q(C2098b c2098b, C3008a.f fVar, C3055b c3055b) {
        this.f21091f = c2098b;
        this.f21086a = fVar;
        this.f21087b = c3055b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        com.google.android.gms.common.internal.e eVar;
        if (!this.f21090e || (eVar = this.f21088c) == null) {
            return;
        }
        this.f21086a.b(eVar, this.f21089d);
    }

    @Override // com.google.android.gms.common.internal.b.c
    public final void a(ConnectionResult connectionResult) {
        this.f21091f.f21048n.post(new p(this, connectionResult));
    }

    @Override // p4.InterfaceC3076w
    public final void b(ConnectionResult connectionResult) {
        n nVar = (n) this.f21091f.f21044j.get(this.f21087b);
        if (nVar != null) {
            nVar.I(connectionResult);
        }
    }

    @Override // p4.InterfaceC3076w
    public final void c(com.google.android.gms.common.internal.e eVar, Set set) {
        if (eVar == null || set == null) {
            new Exception();
            b(new ConnectionResult(4));
        } else {
            this.f21088c = eVar;
            this.f21089d = set;
            i();
        }
    }

    @Override // p4.InterfaceC3076w
    public final void d(int i10) {
        n nVar = (n) this.f21091f.f21044j.get(this.f21087b);
        if (nVar != null) {
            if (nVar.f21077k) {
                nVar.I(new ConnectionResult(17));
            } else {
                nVar.c(i10);
            }
        }
    }
}
