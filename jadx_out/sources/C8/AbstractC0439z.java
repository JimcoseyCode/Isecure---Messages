package C8;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: C8.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0439z extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f720c;

    public AbstractC0439z(E0 substitution) {
        AbstractC2855l.g(substitution, "substitution");
        this.f720c = substitution;
    }

    @Override // C8.E0
    public boolean a() {
        return this.f720c.a();
    }

    @Override // C8.E0
    public M7.h d(M7.h annotations) {
        AbstractC2855l.g(annotations, "annotations");
        return this.f720c.d(annotations);
    }

    @Override // C8.E0
    public B0 e(S key) {
        AbstractC2855l.g(key, "key");
        return this.f720c.e(key);
    }

    @Override // C8.E0
    public boolean f() {
        return this.f720c.f();
    }

    @Override // C8.E0
    public S g(S topLevelType, N0 position) {
        AbstractC2855l.g(topLevelType, "topLevelType");
        AbstractC2855l.g(position, "position");
        return this.f720c.g(topLevelType, position);
    }
}
