package r8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: r8.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3279a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3279a other) {
        AbstractC2855l.g(other, "other");
        int iCompareTo = j().compareTo(other.j());
        if (iCompareTo == 0 && !k() && other.k()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC3280b j();

    public abstract boolean k();
}
