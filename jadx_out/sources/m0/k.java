package m0;

import kotlin.jvm.internal.AbstractC2855l;
import n0.AbstractC2956a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f29545a = new Object();

    public static final Object c(j jVar, int i10) {
        Object obj;
        AbstractC2855l.g(jVar, "<this>");
        int iA = AbstractC2956a.a(jVar.f29542h, jVar.f29544j, i10);
        if (iA < 0 || (obj = jVar.f29543i[iA]) == f29545a) {
            return null;
        }
        return obj;
    }

    public static final void d(j jVar, int i10) {
        AbstractC2855l.g(jVar, "<this>");
        int iA = AbstractC2956a.a(jVar.f29542h, jVar.f29544j, i10);
        if (iA >= 0) {
            Object[] objArr = jVar.f29543i;
            Object obj = objArr[iA];
            Object obj2 = f29545a;
            if (obj != obj2) {
                objArr[iA] = obj2;
                jVar.f29541g = true;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(j jVar) {
        int i10 = jVar.f29544j;
        int[] iArr = jVar.f29542h;
        Object[] objArr = jVar.f29543i;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f29545a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        jVar.f29541g = false;
        jVar.f29544j = i11;
    }
}
