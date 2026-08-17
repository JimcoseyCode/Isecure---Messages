package U8;

import R8.D0;
import i7.AbstractC2753p;
import kotlin.jvm.internal.C;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract /* synthetic */ class k {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ C f11595g;

        public a(C c10) {
            this.f11595g = c10;
        }

        @Override // U8.c
        public Object l(Object obj, n7.f fVar) {
            this.f11595g.f29371g = obj;
            throw new V8.a(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f11596g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f11597h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f11598i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f11599j;

        b(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11598i = obj;
            this.f11599j |= androidx.customview.widget.a.INVALID_ID;
            return d.h(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(U8.b bVar, n7.f fVar) {
        b bVar2;
        C c10;
        V8.a e10;
        c cVar;
        if (fVar instanceof b) {
            bVar2 = (b) fVar;
            int i10 = bVar2.f11599j;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                bVar2.f11599j = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                bVar2 = new b(fVar);
            }
        }
        Object obj = bVar2.f11598i;
        Object objE = AbstractC3016b.e();
        int i11 = bVar2.f11599j;
        if (i11 == 0) {
            AbstractC2753p.b(obj);
            C c11 = new C();
            c aVar = new a(c11);
            try {
                bVar2.f11596g = c11;
                bVar2.f11597h = aVar;
                bVar2.f11599j = 1;
                if (bVar.b(aVar, bVar2) == objE) {
                    return objE;
                }
                c10 = c11;
            } catch (V8.a e11) {
                c10 = c11;
                e10 = e11;
                cVar = aVar;
                V8.j.a(e10, cVar);
                D0.g(bVar2.getContext());
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cVar = (a) bVar2.f11597h;
            c10 = (C) bVar2.f11596g;
            try {
                AbstractC2753p.b(obj);
            } catch (V8.a e12) {
                e10 = e12;
                V8.j.a(e10, cVar);
                D0.g(bVar2.getContext());
            }
        }
        return c10.f29371g;
    }
}
