package A;

import C.c;
import C.d;
import C.e;
import F.L;
import i7.AbstractC2746i;
import i7.C2750m;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;
import y.C3563H;
import y.v0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f2c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f3d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f4e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f5f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lazy f6a = AbstractC2746i.b(new InterfaceC3487a() { // from class: A.a
        @Override // w7.InterfaceC3487a
        public final Object invoke() {
            return Integer.valueOf(b.b(this.f0g));
        }
    });

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: A.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class C0000b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7a;

        static {
            int[] iArr = new int[C.b.values().length];
            try {
                iArr[C.b.f444g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C.b.f445h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C.b.f446i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[C.b.f447j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f7a = iArr;
        }
    }

    static {
        C3563H HLG_10_BIT = C3563H.f33652f;
        AbstractC2855l.f(HLG_10_BIT, "HLG_10_BIT");
        f2c = new C.a(HLG_10_BIT);
        f3d = new c(60, 60);
        f4e = new e(e.b.f464i);
        f5f = new d(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(b bVar) {
        return bVar.e(bVar.c());
    }

    private final int e(C.b bVar) {
        int i10 = C0000b.f7a[bVar.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        throw new C2750m();
    }

    public abstract C.b c();

    public boolean d(L cameraInfoInternal, v0 sessionConfig) {
        AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
        AbstractC2855l.g(sessionConfig, "sessionConfig");
        return true;
    }
}
