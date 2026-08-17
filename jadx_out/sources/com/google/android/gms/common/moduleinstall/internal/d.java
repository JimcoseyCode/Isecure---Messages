package com.google.android.gms.common.moduleinstall.internal;

import D4.j;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import p4.InterfaceC3056c;
import p4.InterfaceC3061h;
import r4.C3262c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.c {
    protected d(Context context, Looper looper, C3262c c3262c, InterfaceC3056c interfaceC3056c, InterfaceC3061h interfaceC3061h) {
        super(context, looper, 308, c3262c, interfaceC3056c, interfaceC3061h);
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String D() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final String E() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // com.google.android.gms.common.internal.b
    protected final boolean H() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b
    public final boolean Q() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.b, o4.C3008a.f
    public final int l() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final /* synthetic */ IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.b
    public final Feature[] u() {
        return j.f794b;
    }
}
