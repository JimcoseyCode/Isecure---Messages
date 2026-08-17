package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.zat;
import k4.C2829b;
import o4.f;
import r4.AbstractC3268i;
import r4.C3262c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a extends com.google.android.gms.common.internal.c implements M4.e {

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public static final /* synthetic */ int f22546M = 0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final boolean f22547I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final C3262c f22548J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private final Bundle f22549K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private final Integer f22550L;

    public a(Context context, Looper looper, boolean z10, C3262c c3262c, Bundle bundle, f.a aVar, f.b bVar) {
        super(context, looper, 44, c3262c, aVar, bVar);
        this.f22547I = true;
        this.f22548J = c3262c;
        this.f22549K = bundle;
        this.f22550L = c3262c.g();
    }

    public static Bundle j0(C3262c c3262c) {
        c3262c.f();
        Integer numG = c3262c.g();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", c3262c.a());
        if (numG != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", numG.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String E() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // M4.e
    public final void k(N4.c cVar) {
        AbstractC3268i.l(cVar, "Expecting a valid ISignInCallbacks");
        try {
            try {
                Account accountB = this.f22548J.b();
                ((c) C()).x(new zai(1, new zat(accountB, ((Integer) AbstractC3268i.k(this.f22550L)).intValue(), "<<default account>>".equals(accountB.name) ? C2829b.a(x()).b() : null)), cVar);
            } catch (RemoteException unused) {
                cVar.g(new zak(1, new ConnectionResult(8, null), null));
            }
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.gms.common.internal.b, o4.C3008a.f
    public final int l() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.b, o4.C3008a.f
    public final boolean o() {
        return this.f22547I;
    }

    @Override // M4.e
    public final void p() {
        f(new b.d());
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle z() {
        if (!x().getPackageName().equals(this.f22548J.d())) {
            this.f22549K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f22548J.d());
        }
        return this.f22549K;
    }
}
