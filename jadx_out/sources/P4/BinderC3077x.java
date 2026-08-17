package p4;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import o4.C3008a;
import o4.f;
import r4.AbstractC3268i;
import r4.C3262c;

/* JADX INFO: renamed from: p4.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3077x extends N4.a implements f.a, f.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C3008a.AbstractC0335a f30652j = M4.d.f7498c;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f30653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f30654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C3008a.AbstractC0335a f30655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f30656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3262c f30657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private M4.e f30658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private InterfaceC3076w f30659i;

    public BinderC3077x(Context context, Handler handler, C3262c c3262c) {
        C3008a.AbstractC0335a abstractC0335a = f30652j;
        this.f30653c = context;
        this.f30654d = handler;
        this.f30657g = (C3262c) AbstractC3268i.l(c3262c, "ClientSettings must not be null");
        this.f30656f = c3262c.e();
        this.f30655e = abstractC0335a;
    }

    static /* bridge */ /* synthetic */ void z(BinderC3077x binderC3077x, zak zakVar) {
        ConnectionResult connectionResultE = zakVar.e();
        if (connectionResultE.l0()) {
            zav zavVar = (zav) AbstractC3268i.k(zakVar.s());
            ConnectionResult connectionResultE2 = zavVar.e();
            if (!connectionResultE2.l0()) {
                String strValueOf = String.valueOf(connectionResultE2);
                new Exception();
                "Sign-in succeeded with resolve account failure: ".concat(strValueOf);
                binderC3077x.f30659i.b(connectionResultE2);
                binderC3077x.f30658h.g();
                return;
            }
            binderC3077x.f30659i.c(zavVar.s(), binderC3077x.f30656f);
        } else {
            binderC3077x.f30659i.b(connectionResultE);
        }
        binderC3077x.f30658h.g();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [M4.e, o4.a$f] */
    public final void A(InterfaceC3076w interfaceC3076w) {
        M4.e eVar = this.f30658h;
        if (eVar != null) {
            eVar.g();
        }
        this.f30657g.i(Integer.valueOf(System.identityHashCode(this)));
        C3008a.AbstractC0335a abstractC0335a = this.f30655e;
        Context context = this.f30653c;
        Handler handler = this.f30654d;
        C3262c c3262c = this.f30657g;
        this.f30658h = abstractC0335a.a(context, handler.getLooper(), c3262c, c3262c.f(), this, this);
        this.f30659i = interfaceC3076w;
        Set set = this.f30656f;
        if (set == null || set.isEmpty()) {
            this.f30654d.post(new RunnableC3074u(this));
        } else {
            this.f30658h.p();
        }
    }

    public final void B() {
        M4.e eVar = this.f30658h;
        if (eVar != null) {
            eVar.g();
        }
    }

    @Override // p4.InterfaceC3056c
    public final void c(int i10) {
        this.f30659i.d(i10);
    }

    @Override // p4.InterfaceC3061h
    public final void d(ConnectionResult connectionResult) {
        this.f30659i.b(connectionResult);
    }

    @Override // p4.InterfaceC3056c
    public final void f(Bundle bundle) {
        this.f30658h.k(this);
    }

    @Override // N4.c
    public final void g(zak zakVar) {
        this.f30654d.post(new RunnableC3075v(this, zakVar));
    }
}
