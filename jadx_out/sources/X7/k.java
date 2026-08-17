package X7;

import L7.H;
import U7.E;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f12541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p f12542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f12543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f12544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Z7.e f12545e;

    public k(d components, p typeParameterResolver, Lazy delegateForDefaultTypeQualifiers) {
        AbstractC2855l.g(components, "components");
        AbstractC2855l.g(typeParameterResolver, "typeParameterResolver");
        AbstractC2855l.g(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f12541a = components;
        this.f12542b = typeParameterResolver;
        this.f12543c = delegateForDefaultTypeQualifiers;
        this.f12544d = delegateForDefaultTypeQualifiers;
        this.f12545e = new Z7.e(this, typeParameterResolver);
    }

    public final d a() {
        return this.f12541a;
    }

    public final E b() {
        return (E) this.f12544d.getValue();
    }

    public final Lazy c() {
        return this.f12543c;
    }

    public final H d() {
        return this.f12541a.m();
    }

    public final B8.n e() {
        return this.f12541a.u();
    }

    public final p f() {
        return this.f12542b;
    }

    public final Z7.e g() {
        return this.f12545e;
    }
}
