package I8;

import C8.S;
import D8.e;
import L7.m0;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m0 f5264a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S f5265b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f5266c;

    public d(m0 typeParameter, S inProjection, S outProjection) {
        AbstractC2855l.g(typeParameter, "typeParameter");
        AbstractC2855l.g(inProjection, "inProjection");
        AbstractC2855l.g(outProjection, "outProjection");
        this.f5264a = typeParameter;
        this.f5265b = inProjection;
        this.f5266c = outProjection;
    }

    public final S a() {
        return this.f5265b;
    }

    public final S b() {
        return this.f5266c;
    }

    public final m0 c() {
        return this.f5264a;
    }

    public final boolean d() {
        return e.f819a.b(this.f5265b, this.f5266c);
    }
}
