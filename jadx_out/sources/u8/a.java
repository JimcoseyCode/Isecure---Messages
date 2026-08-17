package U8;

import i7.AbstractC2753p;
import i7.C2735B;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: U8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0120a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f11544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f11545h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f11547j;

        C0120a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11545h = obj;
            this.f11547j |= androidx.customview.widget.a.INVALID_ID;
            return a.this.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // U8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(c cVar, n7.f fVar) throws Throwable {
        C0120a c0120a;
        Throwable th;
        V8.o oVar;
        if (fVar instanceof C0120a) {
            c0120a = (C0120a) fVar;
            int i10 = c0120a.f11547j;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                c0120a.f11547j = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                c0120a = new C0120a(fVar);
            }
        }
        Object obj = c0120a.f11545h;
        Object objE = AbstractC3016b.e();
        int i11 = c0120a.f11547j;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = (V8.o) c0120a.f11544g;
            try {
                AbstractC2753p.b(obj);
                oVar.releaseIntercepted();
                return C2735B.f28704a;
            } catch (Throwable th2) {
                th = th2;
                oVar.releaseIntercepted();
                throw th;
            }
        }
        AbstractC2753p.b(obj);
        V8.o oVar2 = new V8.o(cVar, c0120a.getContext());
        try {
            c0120a.f11544g = oVar2;
            c0120a.f11547j = 1;
            if (d(oVar2, c0120a) == objE) {
                return objE;
            }
            oVar = oVar2;
            oVar.releaseIntercepted();
            return C2735B.f28704a;
        } catch (Throwable th3) {
            th = th3;
            oVar = oVar2;
            oVar.releaseIntercepted();
            throw th;
        }
    }

    public abstract Object d(c cVar, n7.f fVar);
}
