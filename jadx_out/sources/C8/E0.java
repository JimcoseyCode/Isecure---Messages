package C8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f559a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E0 f560b = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends E0 {
        a() {
        }

        @Override // C8.E0
        public /* bridge */ /* synthetic */ B0 e(S s10) {
            return (B0) i(s10);
        }

        @Override // C8.E0
        public boolean f() {
            return true;
        }

        public Void i(S key) {
            AbstractC2855l.g(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends E0 {
        c() {
        }

        @Override // C8.E0
        public boolean a() {
            return false;
        }

        @Override // C8.E0
        public boolean b() {
            return false;
        }

        @Override // C8.E0
        public M7.h d(M7.h annotations) {
            AbstractC2855l.g(annotations, "annotations");
            return E0.this.d(annotations);
        }

        @Override // C8.E0
        public B0 e(S key) {
            AbstractC2855l.g(key, "key");
            return E0.this.e(key);
        }

        @Override // C8.E0
        public boolean f() {
            return E0.this.f();
        }

        @Override // C8.E0
        public S g(S topLevelType, N0 position) {
            AbstractC2855l.g(topLevelType, "topLevelType");
            AbstractC2855l.g(position, "position");
            return E0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final G0 c() {
        G0 g0G = G0.g(this);
        AbstractC2855l.f(g0G, "create(...)");
        return g0G;
    }

    public M7.h d(M7.h annotations) {
        AbstractC2855l.g(annotations, "annotations");
        return annotations;
    }

    public abstract B0 e(S s10);

    public boolean f() {
        return false;
    }

    public S g(S topLevelType, N0 position) {
        AbstractC2855l.g(topLevelType, "topLevelType");
        AbstractC2855l.g(position, "position");
        return topLevelType;
    }

    public final E0 h() {
        return new c();
    }
}
