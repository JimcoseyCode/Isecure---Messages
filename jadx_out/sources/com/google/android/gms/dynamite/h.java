package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0223b a(Context context, String str, DynamiteModule.b.a aVar) {
        int iA;
        DynamiteModule.b.C0223b c0223b = new DynamiteModule.b.C0223b();
        int iB = aVar.b(context, str);
        c0223b.f21408a = iB;
        int i10 = 1;
        int i11 = 0;
        if (iB != 0) {
            iA = aVar.a(context, str, false);
            c0223b.f21409b = iA;
        } else {
            iA = aVar.a(context, str, true);
            c0223b.f21409b = iA;
        }
        int i12 = c0223b.f21408a;
        if (i12 == 0) {
            if (iA == 0) {
                i10 = 0;
            }
            c0223b.f21410c = i10;
            return c0223b;
        }
        i11 = i12;
        if (i11 >= iA) {
            i10 = -1;
        }
        c0223b.f21410c = i10;
        return c0223b;
    }
}
