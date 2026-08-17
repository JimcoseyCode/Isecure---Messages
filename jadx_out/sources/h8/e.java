package h8;

import kotlin.jvm.internal.AbstractC2855l;
import m8.AbstractC2950i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static final Object a(AbstractC2950i.d dVar, AbstractC2950i.f extension) {
        AbstractC2855l.g(dVar, "<this>");
        AbstractC2855l.g(extension, "extension");
        if (dVar.w(extension)) {
            return dVar.t(extension);
        }
        return null;
    }

    public static final Object b(AbstractC2950i.d dVar, AbstractC2950i.f extension, int i10) {
        AbstractC2855l.g(dVar, "<this>");
        AbstractC2855l.g(extension, "extension");
        if (i10 < dVar.v(extension)) {
            return dVar.u(extension, i10);
        }
        return null;
    }
}
