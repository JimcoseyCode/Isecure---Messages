package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;
import p4.InterfaceC3058e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class B extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected volatile boolean f21021h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final AtomicReference f21022i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f21023j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final com.google.android.gms.common.a f21024k;

    B(InterfaceC3058e interfaceC3058e, com.google.android.gms.common.a aVar) {
        super(interfaceC3058e);
        this.f21022i = new AtomicReference(null);
        this.f21023j = new D4.i(Looper.getMainLooper());
        this.f21024k = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ConnectionResult connectionResult, int i10) {
        this.f21022i.set(null);
        m(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        this.f21022i.set(null);
        n();
    }

    private static final int p(y yVar) {
        if (yVar == null) {
            return -1;
        }
        return yVar.a();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void e(int i10, int i11, Intent intent) {
        y yVar = (y) this.f21022i.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iG = this.f21024k.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (yVar == null) {
                        return;
                    }
                    if (yVar.b().e() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            o();
            return;
        } else if (i11 == 0) {
            if (yVar != null) {
                l(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, yVar.b().toString()), p(yVar));
                return;
            }
            return;
        }
        if (yVar != null) {
            l(yVar.b(), yVar.a());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f21022i.set(bundle.getBoolean("resolving_error", false) ? new y(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void i(Bundle bundle) {
        super.i(bundle);
        y yVar = (y) this.f21022i.get();
        if (yVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", yVar.a());
        bundle.putInt("failed_status", yVar.b().e());
        bundle.putParcelable("failed_resolution", yVar.b().X());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void j() {
        super.j();
        this.f21021h = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void k() {
        super.k();
        this.f21021h = false;
    }

    protected abstract void m(ConnectionResult connectionResult, int i10);

    protected abstract void n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new ConnectionResult(13, null), p((y) this.f21022i.get()));
    }

    public final void s(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        y yVar = new y(connectionResult, i10);
        do {
            atomicReference = this.f21022i;
            if (androidx.camera.view.i.a(atomicReference, null, yVar)) {
                this.f21023j.post(new A(this, yVar));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
