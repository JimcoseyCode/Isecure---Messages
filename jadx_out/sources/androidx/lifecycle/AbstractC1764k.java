package androidx.lifecycle;

import i7.C2750m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;

/* JADX INFO: renamed from: androidx.lifecycle.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1764k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C1755b f17587a = new C1755b(null);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final C0180a Companion;
        public static final a ON_CREATE = new a("ON_CREATE", 0);
        public static final a ON_START = new a("ON_START", 1);
        public static final a ON_RESUME = new a("ON_RESUME", 2);
        public static final a ON_PAUSE = new a("ON_PAUSE", 3);
        public static final a ON_STOP = new a("ON_STOP", 4);
        public static final a ON_DESTROY = new a("ON_DESTROY", 5);
        public static final a ON_ANY = new a("ON_ANY", 6);

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0180a {

            /* JADX INFO: renamed from: androidx.lifecycle.k$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
            public /* synthetic */ class C0181a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f17588a;

                static {
                    int[] iArr = new int[b.values().length];
                    try {
                        iArr[b.f17592i.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[b.f17593j.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[b.f17594k.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[b.f17590g.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[b.f17591h.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f17588a = iArr;
                }
            }

            public /* synthetic */ C0180a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(b state) {
                AbstractC2855l.g(state, "state");
                int i10 = C0181a.f17588a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_DESTROY;
                }
                if (i10 == 2) {
                    return a.ON_STOP;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public final a b(b state) {
                AbstractC2855l.g(state, "state");
                int i10 = C0181a.f17588a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_START;
                }
                if (i10 == 2) {
                    return a.ON_RESUME;
                }
                if (i10 != 5) {
                    return null;
                }
                return a.ON_CREATE;
            }

            public final a c(b state) {
                AbstractC2855l.g(state, "state");
                int i10 = C0181a.f17588a[state.ordinal()];
                if (i10 == 1) {
                    return a.ON_CREATE;
                }
                if (i10 == 2) {
                    return a.ON_START;
                }
                if (i10 != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }

            private C0180a() {
            }
        }

        /* JADX INFO: renamed from: androidx.lifecycle.k$a$b */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17589a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f17589a = iArr;
            }
        }

        static {
            a[] aVarArrH = h();
            $VALUES = aVarArrH;
            $ENTRIES = AbstractC3083a.a(aVarArrH);
            Companion = new C0180a(null);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] h() {
            return new a[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
        }

        public static final a j(b bVar) {
            return Companion.a(bVar);
        }

        public static final a m(b bVar) {
            return Companion.c(bVar);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final b k() {
            switch (b.f17589a[ordinal()]) {
                case 1:
                case 2:
                    return b.f17592i;
                case 3:
                case 4:
                    return b.f17593j;
                case 5:
                    return b.f17594k;
                case 6:
                    return b.f17590g;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new C2750m();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: androidx.lifecycle.k$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f17590g = new b("DESTROYED", 0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f17591h = new b("INITIALIZED", 1);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final b f17592i = new b("CREATED", 2);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final b f17593j = new b("STARTED", 3);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final b f17594k = new b("RESUMED", 4);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final /* synthetic */ b[] f17595l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f17596m;

        static {
            b[] bVarArrH = h();
            f17595l = bVarArrH;
            f17596m = AbstractC3083a.a(bVarArrH);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] h() {
            return new b[]{f17590g, f17591h, f17592i, f17593j, f17594k};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f17595l.clone();
        }

        public final boolean j(b state) {
            AbstractC2855l.g(state, "state");
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(InterfaceC1770q interfaceC1770q);

    public abstract b b();

    public final C1755b c() {
        return this.f17587a;
    }

    public abstract void d(InterfaceC1770q interfaceC1770q);
}
