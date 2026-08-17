package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class i implements DynamiteModule.b {
    i() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
      0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DynamiteModule.b.C0223b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0223b c0223b = new DynamiteModule.b.C0223b();
        c0223b.f21408a = aVar.b(context, str);
        int i10 = 1;
        int iA = aVar.a(context, str, true);
        c0223b.f21409b = iA;
        int i11 = c0223b.f21408a;
        if (i11 == 0) {
            i11 = 0;
            if (iA == 0) {
                i10 = 0;
            } else if (iA < i11) {
                i10 = -1;
            }
        }
        c0223b.f21410c = i10;
        return c0223b;
    }
}
