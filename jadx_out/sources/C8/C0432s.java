package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0432s extends p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final M7.h f684a;

    public C0432s(M7.h annotations) {
        AbstractC2855l.g(annotations, "annotations");
        this.f684a = annotations;
    }

    @Override // C8.p0
    public C7.d b() {
        return kotlin.jvm.internal.D.b(C0432s.class);
    }

    @Override // C8.p0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0432s a(C0432s c0432s) {
        return c0432s == null ? this : new C0432s(M7.j.a(this.f684a, c0432s.f684a));
    }

    public final M7.h e() {
        return this.f684a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C0432s) {
            return AbstractC2855l.b(((C0432s) obj).f684a, this.f684a);
        }
        return false;
    }

    @Override // C8.p0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C0432s c(C0432s c0432s) {
        if (AbstractC2855l.b(c0432s, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f684a.hashCode();
    }
}
