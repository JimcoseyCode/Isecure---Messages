package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0223b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0223b c0223b = new DynamiteModule.b.C0223b();
        int iA = aVar.a(context, str, false);
        c0223b.f21409b = iA;
        c0223b.f21410c = iA != 0 ? 1 : 0;
        return c0223b;
    }
}
