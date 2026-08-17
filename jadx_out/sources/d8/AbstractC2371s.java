package d8;

import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t8.EnumC3382e;

/* JADX INFO: renamed from: d8.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2371s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f25777a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d f25778b = new d(EnumC3382e.BOOLEAN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f25779c = new d(EnumC3382e.CHAR);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final d f25780d = new d(EnumC3382e.BYTE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final d f25781e = new d(EnumC3382e.SHORT);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f25782f = new d(EnumC3382e.INT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final d f25783g = new d(EnumC3382e.FLOAT);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final d f25784h = new d(EnumC3382e.LONG);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final d f25785i = new d(EnumC3382e.DOUBLE);

    /* JADX INFO: renamed from: d8.s$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends AbstractC2371s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final AbstractC2371s f25786j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC2371s elementType) {
            super(null);
            AbstractC2855l.g(elementType, "elementType");
            this.f25786j = elementType;
        }

        public final AbstractC2371s i() {
            return this.f25786j;
        }
    }

    /* JADX INFO: renamed from: d8.s$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return AbstractC2371s.f25778b;
        }

        public final d b() {
            return AbstractC2371s.f25780d;
        }

        public final d c() {
            return AbstractC2371s.f25779c;
        }

        public final d d() {
            return AbstractC2371s.f25785i;
        }

        public final d e() {
            return AbstractC2371s.f25783g;
        }

        public final d f() {
            return AbstractC2371s.f25782f;
        }

        public final d g() {
            return AbstractC2371s.f25784h;
        }

        public final d h() {
            return AbstractC2371s.f25781e;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: d8.s$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c extends AbstractC2371s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f25787j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String internalName) {
            super(null);
            AbstractC2855l.g(internalName, "internalName");
            this.f25787j = internalName;
        }

        public final String i() {
            return this.f25787j;
        }
    }

    /* JADX INFO: renamed from: d8.s$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends AbstractC2371s {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final EnumC3382e f25788j;

        public d(EnumC3382e enumC3382e) {
            super(null);
            this.f25788j = enumC3382e;
        }

        public final EnumC3382e i() {
            return this.f25788j;
        }
    }

    public /* synthetic */ AbstractC2371s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public String toString() {
        return C2373u.f25789a.a(this);
    }

    private AbstractC2371s() {
    }
}
