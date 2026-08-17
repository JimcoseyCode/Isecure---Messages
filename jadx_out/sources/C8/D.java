package C8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class D extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f554e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E0 f555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E0 f556d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E0 a(E0 first, E0 second) {
            AbstractC2855l.g(first, "first");
            AbstractC2855l.g(second, "second");
            return first.f() ? second : second.f() ? first : new D(first, second, null);
        }

        private a() {
        }
    }

    public /* synthetic */ D(E0 e02, E0 e03, DefaultConstructorMarker defaultConstructorMarker) {
        this(e02, e03);
    }

    public static final E0 i(E0 e02, E0 e03) {
        return f554e.a(e02, e03);
    }

    @Override // C8.E0
    public boolean a() {
        return this.f555c.a() || this.f556d.a();
    }

    @Override // C8.E0
    public boolean b() {
        return this.f555c.b() || this.f556d.b();
    }

    @Override // C8.E0
    public M7.h d(M7.h annotations) {
        AbstractC2855l.g(annotations, "annotations");
        return this.f556d.d(this.f555c.d(annotations));
    }

    @Override // C8.E0
    public B0 e(S key) {
        AbstractC2855l.g(key, "key");
        B0 b0E = this.f555c.e(key);
        return b0E == null ? this.f556d.e(key) : b0E;
    }

    @Override // C8.E0
    public boolean f() {
        return false;
    }

    @Override // C8.E0
    public S g(S topLevelType, N0 position) {
        AbstractC2855l.g(topLevelType, "topLevelType");
        AbstractC2855l.g(position, "position");
        return this.f556d.g(this.f555c.g(topLevelType, position), position);
    }

    private D(E0 e02, E0 e03) {
        this.f555c = e02;
        this.f556d = e03;
    }
}
