package D8;

import C8.u0;
import D8.f;
import D8.g;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: D8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0440a {
    public static final u0 a(boolean z10, boolean z11, b typeSystemContext, f kotlinTypePreparator, g kotlinTypeRefiner) {
        AbstractC2855l.g(typeSystemContext, "typeSystemContext");
        AbstractC2855l.g(kotlinTypePreparator, "kotlinTypePreparator");
        AbstractC2855l.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new u0(z10, z11, true, typeSystemContext, kotlinTypePreparator, kotlinTypeRefiner);
    }

    public static /* synthetic */ u0 b(boolean z10, boolean z11, b bVar, f fVar, g gVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        if ((i10 & 4) != 0) {
            bVar = s.f846a;
        }
        if ((i10 & 8) != 0) {
            fVar = f.a.f820a;
        }
        if ((i10 & 16) != 0) {
            gVar = g.a.f821a;
        }
        return a(z10, z11, bVar, fVar, gVar);
    }
}
