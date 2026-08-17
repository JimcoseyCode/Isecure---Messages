package N0;

import R8.AbstractC1444y;
import R8.InterfaceC1440w;
import a9.InterfaceC1601a;
import i7.AbstractC2753p;
import i7.C2735B;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1601a f7947a = a9.g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1440w f7948b = AbstractC1444y.b(null, 1, null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f7949g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f7950h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        /* synthetic */ Object f7951i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f7953k;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f7951i = obj;
            this.f7953k |= androidx.customview.widget.a.INVALID_ID;
            return z.this.c(this);
        }
    }

    public final Object a(n7.f fVar) {
        Object objI = this.f7948b.I(fVar);
        return objI == AbstractC3016b.e() ? objI : C2735B.f28704a;
    }

    protected abstract Object b(n7.f fVar);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(n7.f fVar) throws Throwable {
        a aVar;
        InterfaceC1601a interfaceC1601a;
        z zVar;
        InterfaceC1601a interfaceC1601a2;
        Throwable th;
        z zVar2;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f7953k;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f7953k = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj = aVar.f7951i;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f7953k;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj);
                if (this.f7948b.isCompleted()) {
                    return C2735B.f28704a;
                }
                interfaceC1601a = this.f7947a;
                aVar.f7949g = this;
                aVar.f7950h = interfaceC1601a;
                aVar.f7953k = 1;
                if (interfaceC1601a.a(null, aVar) != objE) {
                    zVar = this;
                }
                return objE;
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC1601a2 = (InterfaceC1601a) aVar.f7950h;
                zVar2 = (z) aVar.f7949g;
                try {
                    AbstractC2753p.b(obj);
                    InterfaceC1440w interfaceC1440w = zVar2.f7948b;
                    C2735B c2735b = C2735B.f28704a;
                    interfaceC1440w.l0(c2735b);
                    interfaceC1601a2.c(null);
                    return c2735b;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC1601a2.c(null);
                    throw th;
                }
            }
            InterfaceC1601a interfaceC1601a3 = (InterfaceC1601a) aVar.f7950h;
            zVar = (z) aVar.f7949g;
            AbstractC2753p.b(obj);
            interfaceC1601a = interfaceC1601a3;
            if (zVar.f7948b.isCompleted()) {
                C2735B c2735b2 = C2735B.f28704a;
                interfaceC1601a.c(null);
                return c2735b2;
            }
            aVar.f7949g = zVar;
            aVar.f7950h = interfaceC1601a;
            aVar.f7953k = 2;
            if (zVar.b(aVar) != objE) {
                interfaceC1601a2 = interfaceC1601a;
                zVar2 = zVar;
                InterfaceC1440w interfaceC1440w2 = zVar2.f7948b;
                C2735B c2735b3 = C2735B.f28704a;
                interfaceC1440w2.l0(c2735b3);
                interfaceC1601a2.c(null);
                return c2735b3;
            }
            return objE;
        } catch (Throwable th3) {
            interfaceC1601a2 = interfaceC1601a;
            th = th3;
            interfaceC1601a2.c(null);
            throw th;
        }
    }
}
