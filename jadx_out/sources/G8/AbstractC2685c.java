package g8;

import f8.m;
import i7.t;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import m8.C2948g;
import t7.AbstractC3376c;

/* JADX INFO: renamed from: g8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2685c {
    public static final Pair a(InputStream inputStream) throws IOException {
        m mVarV;
        AbstractC2855l.g(inputStream, "<this>");
        try {
            C2683a c2683aA = C2683a.f28232g.a(inputStream);
            if (c2683aA.h()) {
                C2948g c2948gD = C2948g.d();
                AbstractC2684b.a(c2948gD);
                mVarV = m.V(inputStream, c2948gD);
            } else {
                mVarV = null;
            }
            Pair pairA = t.a(mVarV, c2683aA);
            AbstractC3376c.a(inputStream, null);
            return pairA;
        } finally {
        }
    }
}
