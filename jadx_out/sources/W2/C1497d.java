package W2;

import java.util.LinkedHashSet;

/* JADX INFO: renamed from: W2.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1497d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f11969b;

    public C1497d(int i10) {
        this.f11968a = i10;
        this.f11969b = new LinkedHashSet(i10);
    }

    public final synchronized boolean a(Object obj) {
        try {
            if (this.f11969b.size() == this.f11968a) {
                LinkedHashSet linkedHashSet = this.f11969b;
                linkedHashSet.remove(linkedHashSet.iterator().next());
            }
            this.f11969b.remove(obj);
        } catch (Throwable th) {
            throw th;
        }
        return this.f11969b.add(obj);
    }

    public final synchronized boolean b(Object obj) {
        return this.f11969b.contains(obj);
    }
}
