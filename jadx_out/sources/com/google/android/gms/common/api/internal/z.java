package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import p4.AbstractC3069p;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class z extends AbstractC3069p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Dialog f21110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ A f21111b;

    z(A a10, Dialog dialog) {
        this.f21111b = a10;
        this.f21110a = dialog;
    }

    @Override // p4.AbstractC3069p
    public final void a() {
        this.f21111b.f21020h.o();
        if (this.f21110a.isShowing()) {
            this.f21110a.dismiss();
        }
    }
}
