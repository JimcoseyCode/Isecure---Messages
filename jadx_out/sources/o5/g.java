package O5;

import com.google.gson.n;
import com.google.gson.o;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class g extends n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f8234b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.gson.d f8235a;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements o {
        a() {
        }

        @Override // com.google.gson.o
        public n a(com.google.gson.d dVar, R5.a aVar) {
            if (aVar.c() == Object.class) {
                return new g(dVar);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8236a;

        static {
            int[] iArr = new int[S5.b.values().length];
            f8236a = iArr;
            try {
                iArr[S5.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8236a[S5.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8236a[S5.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8236a[S5.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8236a[S5.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8236a[S5.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    g(com.google.gson.d dVar) {
        this.f8235a = dVar;
    }

    @Override // com.google.gson.n
    public Object b(S5.a aVar) throws IOException {
        switch (b.f8236a[aVar.D0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.d();
                while (aVar.J()) {
                    arrayList.add(b(aVar));
                }
                aVar.s();
                return arrayList;
            case 2:
                N5.h hVar = new N5.h();
                aVar.e();
                while (aVar.J()) {
                    hVar.put(aVar.l0(), b(aVar));
                }
                aVar.A();
                return hVar;
            case 3:
                return aVar.y0();
            case 4:
                return Double.valueOf(aVar.g0());
            case 5:
                return Boolean.valueOf(aVar.d0());
            case 6:
                aVar.u0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.n
    public void d(S5.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.X();
            return;
        }
        n nVarL = this.f8235a.l(obj.getClass());
        if (!(nVarL instanceof g)) {
            nVarL.d(cVar, obj);
        } else {
            cVar.m();
            cVar.A();
        }
    }
}
