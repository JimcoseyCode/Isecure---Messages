package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0223b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0223b c0223b = new DynamiteModule.b.C0223b();
        int iB = aVar.b(context, str);
        c0223b.f21408a = iB;
        if (iB != 0) {
            c0223b.f21410c = -1;
            return c0223b;
        }
        int iA = aVar.a(context, str, true);
        c0223b.f21409b = iA;
        if (iA != 0) {
            c0223b.f21410c = 1;
        }
        return c0223b;
    }
}
