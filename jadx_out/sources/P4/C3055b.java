package p4;

import o4.C3008a;
import r4.AbstractC3267h;

/* JADX INFO: renamed from: p4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3055b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3008a f30634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3008a.d f30635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30636d;

    private C3055b(C3008a c3008a, C3008a.d dVar, String str) {
        this.f30634b = c3008a;
        this.f30635c = dVar;
        this.f30636d = str;
        this.f30633a = AbstractC3267h.b(c3008a, dVar, str);
    }

    public static C3055b a(C3008a c3008a, C3008a.d dVar, String str) {
        return new C3055b(c3008a, dVar, str);
    }

    public final String b() {
        return this.f30634b.b();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3055b)) {
            return false;
        }
        C3055b c3055b = (C3055b) obj;
        return AbstractC3267h.a(this.f30634b, c3055b.f30634b) && AbstractC3267h.a(this.f30635c, c3055b.f30635c) && AbstractC3267h.a(this.f30636d, c3055b.f30636d);
    }

    public final int hashCode() {
        return this.f30633a;
    }
}
