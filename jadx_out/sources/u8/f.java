package U8;

import T8.v;
import i7.AbstractC2753p;
import i7.C2735B;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class f {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f11548g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f11549h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f11550i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f11551j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f11552k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f11553l;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11552k = obj;
            this.f11553l |= androidx.customview.widget.a.INVALID_ID;
            return f.c(null, null, false, this);
        }
    }

    public static final Object b(c cVar, v vVar, n7.f fVar) {
        Object objC = c(cVar, vVar, true, fVar);
        return objC == AbstractC3016b.e() ? objC : C2735B.f28704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.l(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(c cVar, v vVar, boolean z10, n7.f fVar) {
        a aVar;
        T8.i it;
        T8.i iVar;
        c cVar2;
        Object objA;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f11553l;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f11553l = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f11552k;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f11553l;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                d.g(cVar);
                it = vVar.iterator();
                aVar.f11548g = cVar;
                aVar.f11549h = vVar;
                aVar.f11550i = it;
                aVar.f11551j = z10;
                aVar.f11553l = 1;
                objA = it.a(aVar);
                if (objA != objE) {
                }
            } else if (i11 == 1) {
                z10 = aVar.f11551j;
                iVar = (T8.i) aVar.f11550i;
                vVar = (v) aVar.f11549h;
                cVar2 = (c) aVar.f11548g;
                AbstractC2753p.b(obj);
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z10 = aVar.f11551j;
                iVar = (T8.i) aVar.f11550i;
                vVar = (v) aVar.f11549h;
                cVar2 = (c) aVar.f11548g;
                AbstractC2753p.b(obj);
                it = iVar;
                cVar = cVar2;
                aVar.f11548g = cVar;
                aVar.f11549h = vVar;
                aVar.f11550i = it;
                aVar.f11551j = z10;
                aVar.f11553l = 1;
                objA = it.a(aVar);
                if (objA != objE) {
                    return objE;
                }
                cVar2 = cVar;
                iVar = it;
                obj = objA;
                if (((Boolean) obj).booleanValue()) {
                    if (z10) {
                        T8.n.a(vVar, null);
                    }
                    return C2735B.f28704a;
                }
                Object next = iVar.next();
                aVar.f11548g = cVar2;
                aVar.f11549h = vVar;
                aVar.f11550i = iVar;
                aVar.f11551j = z10;
                aVar.f11553l = 2;
            }
        } finally {
        }
    }
}
