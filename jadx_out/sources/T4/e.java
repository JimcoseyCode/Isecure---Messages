package t4;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import p4.InterfaceC3056c;
import p4.InterfaceC3061h;
import r4.C3262c;
import r4.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final n f32482I;

    public e(Context context, Looper looper, C3262c c3262c, n nVar, InterfaceC3056c interfaceC3056c, InterfaceC3061h interfaceC3061h) {
        super(context, looper, 270, c3262c, interfaceC3056c, interfaceC3061h);
        this.f32482I = nVar;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String D() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String E() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, o4.C3008a.f
    public final int l() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof C3364a ? (C3364a) iInterfaceQueryLocalInterface : new C3364a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] u() {
        return D4.d.f790b;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Bundle z() {
        return this.f32482I.b();
    }
}
