package l7;

import java.util.Comparator;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: l7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class C2889f implements Comparator {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2889f f29462g = new C2889f();

    private C2889f() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable a10, Comparable b10) {
        AbstractC2855l.g(a10, "a");
        AbstractC2855l.g(b10, "b");
        return b10.compareTo(a10);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return C2888e.f29461g;
    }
}
