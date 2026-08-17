package B;

import F.C0;
import F.D1;
import F.E1;
import K.f;
import T.g;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.view.SurfaceHolder;
import i7.C2750m;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import y.J0;
import y.V;
import y.p0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f234j = new c("PREVIEW", 0, SurfaceHolder.class, 34);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f235k = new c("IMAGE_CAPTURE", 1, null, 256);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f236l = new c("VIDEO_CAPTURE", 2, MediaCodec.class, 34);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f237m = new c("STREAM_SHARING", 3, SurfaceTexture.class, 34);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f238n = new c("UNDEFINED", 4, null, 34);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final /* synthetic */ c[] f239o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f240p;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Class f241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f242h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: B.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public /* synthetic */ class C0009a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ int[] f244b;

            static {
                int[] iArr = new int[E1.b.values().length];
                try {
                    iArr[E1.b.IMAGE_CAPTURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[E1.b.PREVIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[E1.b.VIDEO_CAPTURE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[E1.b.STREAM_SHARING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f243a = iArr;
                int[] iArr2 = new int[C.b.values().length];
                try {
                    iArr2[C.b.f444g.ordinal()] = 1;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[C.b.f445h.ordinal()] = 2;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[C.b.f446i.ordinal()] = 3;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[C.b.f447j.ordinal()] = 4;
                } catch (NoSuchFieldError unused8) {
                }
                f244b = iArr2;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final boolean d(C.b bVar, J0 j02) {
            int i10 = C0009a.f244b[bVar.ordinal()];
            if (i10 == 1) {
                return e(j02);
            }
            if (i10 == 2) {
                return f(j02);
            }
            if (i10 == 3) {
                return h(j02);
            }
            if (i10 == 4) {
                return g(j02);
            }
            throw new C2750m();
        }

        private final boolean e(J0 j02) {
            return j02.e().u();
        }

        private final boolean f(J0 j02) {
            return j02.e().b0();
        }

        private final boolean g(J0 j02) {
            return j02.e().b(C0.f1276U);
        }

        private final boolean h(J0 j02) {
            return j02.e().b(D1.f1304H) || j02.e().b(D1.f1305I);
        }

        public final C.b a(J0 j02) {
            Object next;
            AbstractC2855l.g(j02, "<this>");
            Iterator<E> it = C.b.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (c.f233i.d((C.b) next, j02)) {
                    break;
                }
            }
            return (C.b) next;
        }

        public final c b(D1 d12) {
            AbstractC2855l.g(d12, "<this>");
            int i10 = C0009a.f243a[d12.G().ordinal()];
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? c.f238n : c.f237m : c.f236l : c.f234j : c.f235k;
        }

        public final c c(J0 j02) {
            AbstractC2855l.g(j02, "<this>");
            return j02 instanceof p0 ? c.f234j : j02 instanceof V ? c.f235k : f.e0(j02) ? c.f236l : j02 instanceof g ? c.f237m : c.f238n;
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f245a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f234j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f235k.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f236l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f237m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f238n.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f245a = iArr;
        }
    }

    static {
        c[] cVarArrH = h();
        f239o = cVarArrH;
        f240p = AbstractC3083a.a(cVarArrH);
        f233i = new a(null);
    }

    private c(String str, int i10, Class cls, int i11) {
        this.f241g = cls;
        this.f242h = i11;
    }

    private static final /* synthetic */ c[] h() {
        return new c[]{f234j, f235k, f236l, f237m, f238n};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f239o.clone();
    }

    public final Class j() {
        return this.f241g;
    }

    @Override // java.lang.Enum
    public String toString() {
        int i10 = b.f245a[ordinal()];
        if (i10 == 1) {
            return "Preview";
        }
        if (i10 == 2) {
            return "ImageCapture";
        }
        if (i10 == 3) {
            return "VideoCapture";
        }
        if (i10 == 4) {
            return "StreamSharing";
        }
        if (i10 == 5) {
            return "Undefined";
        }
        throw new C2750m();
    }
}
