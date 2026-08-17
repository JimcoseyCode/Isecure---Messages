package L7;

import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f7374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f7375b;

    protected x0(String name, boolean z10) {
        AbstractC2855l.g(name, "name");
        this.f7374a = name;
        this.f7375b = z10;
    }

    public Integer a(x0 visibility) {
        AbstractC2855l.g(visibility, "visibility");
        return w0.f7361a.a(this, visibility);
    }

    public String b() {
        return this.f7374a;
    }

    public final boolean c() {
        return this.f7375b;
    }

    public final String toString() {
        return b();
    }

    public x0 d() {
        return this;
    }
}
