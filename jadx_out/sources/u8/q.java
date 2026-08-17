package U8;

import R8.A0;
import R8.D0;
import W8.E;
import i7.AbstractC2753p;
import i7.C2735B;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
final class q extends V8.b implements l, b, V8.k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f11602k = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f11603j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f11604g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f11605h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        Object f11606i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f11607j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f11608k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f11609l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f11611n;

        a(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f11609l = obj;
            this.f11611n |= androidx.customview.widget.a.INVALID_ID;
            return q.this.b(null, this);
        }
    }

    public q(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean m(Object obj, Object obj2) {
        int i10;
        V8.d[] dVarArrH;
        synchronized (this) {
            Object obj3 = f11602k.get(this);
            if (obj != null && !AbstractC2855l.b(obj3, obj)) {
                return false;
            }
            if (AbstractC2855l.b(obj3, obj2)) {
                return true;
            }
            f11602k.set(this, obj2);
            int i11 = this.f11603j;
            if ((i11 & 1) != 0) {
                this.f11603j = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f11603j = i12;
            V8.d[] dVarArrH2 = h();
            C2735B c2735b = C2735B.f28704a;
            while (true) {
                s[] sVarArr = (s[]) dVarArrH2;
                if (sVarArr != null) {
                    for (s sVar : sVarArr) {
                        if (sVar != null) {
                            sVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f11603j;
                    if (i10 == i12) {
                        this.f11603j = i12 + 1;
                        return true;
                    }
                    dVarArrH = h();
                    C2735B c2735b2 = C2735B.f28704a;
                }
                dVarArrH2 = dVarArrH;
                i12 = i10;
            }
        }
    }

    @Override // U8.l
    public boolean a(Object obj, Object obj2) {
        if (obj == null) {
            obj = V8.m.f11867a;
        }
        if (obj2 == null) {
            obj2 = V8.m.f11867a;
        }
        return m(obj, obj2);
    }

    /* JADX WARN: Path cross not found for [B:29:0x008f, B:45:0x00c5], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:33:0x009e, B:35:0x00a4], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a4, B:33:0x009e], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:35:0x00a4, B:43:0x00bf], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:45:0x00c5, B:29:0x008f], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:15:0x003e, B:29:0x008f, B:31:0x0099, B:33:0x009e, B:43:0x00bf, B:45:0x00c5, B:35:0x00a4, B:39:0x00ab, B:22:0x005f, B:25:0x0071, B:28:0x0080), top: B:50:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c3 -> B:29:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d5 -> B:29:0x008f). Please report as a decompilation issue!!! */
    @Override // U8.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(c cVar, n7.f fVar) {
        a aVar;
        q qVar;
        s sVar;
        c cVar2;
        A0 a02;
        Object obj;
        Object obj2;
        Object obj3;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i10 = aVar.f11611n;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                aVar.f11611n = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                aVar = new a(fVar);
            }
        }
        Object obj4 = aVar.f11609l;
        Object objE = AbstractC3016b.e();
        int i11 = aVar.f11611n;
        try {
            if (i11 == 0) {
                AbstractC2753p.b(obj4);
                qVar = this;
                sVar = (s) d();
            } else if (i11 == 1) {
                sVar = (s) aVar.f11606i;
                cVar = (c) aVar.f11605h;
                qVar = (q) aVar.f11604g;
                AbstractC2753p.b(obj4);
            } else if (i11 == 2) {
                obj = aVar.f11608k;
                a02 = (A0) aVar.f11607j;
                sVar = (s) aVar.f11606i;
                cVar2 = (c) aVar.f11605h;
                qVar = (q) aVar.f11604g;
                AbstractC2753p.b(obj4);
                if (!sVar.h()) {
                }
                obj2 = f11602k.get(qVar);
                if (a02 != null) {
                }
                if (obj != null) {
                }
                if (obj2 != V8.m.f11867a) {
                }
                aVar.f11604g = qVar;
                aVar.f11605h = cVar2;
                aVar.f11606i = sVar;
                aVar.f11607j = a02;
                aVar.f11608k = obj2;
                aVar.f11611n = 2;
                if (cVar2.l(obj3, aVar) != objE) {
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f11608k;
                a02 = (A0) aVar.f11607j;
                sVar = (s) aVar.f11606i;
                cVar2 = (c) aVar.f11605h;
                qVar = (q) aVar.f11604g;
                AbstractC2753p.b(obj4);
                obj2 = f11602k.get(qVar);
                if (a02 != null) {
                    D0.f(a02);
                }
                if (obj != null || !AbstractC2855l.b(obj, obj2)) {
                    obj3 = obj2 != V8.m.f11867a ? null : obj2;
                    aVar.f11604g = qVar;
                    aVar.f11605h = cVar2;
                    aVar.f11606i = sVar;
                    aVar.f11607j = a02;
                    aVar.f11608k = obj2;
                    aVar.f11611n = 2;
                    if (cVar2.l(obj3, aVar) != objE) {
                        return objE;
                    }
                    obj = obj2;
                }
                if (!sVar.h()) {
                    aVar.f11604g = qVar;
                    aVar.f11605h = cVar2;
                    aVar.f11606i = sVar;
                    aVar.f11607j = a02;
                    aVar.f11608k = obj;
                    aVar.f11611n = 3;
                    if (sVar.e(aVar) != objE) {
                    }
                    return objE;
                }
                obj2 = f11602k.get(qVar);
                if (a02 != null) {
                }
                if (obj != null) {
                }
                if (obj2 != V8.m.f11867a) {
                }
                aVar.f11604g = qVar;
                aVar.f11605h = cVar2;
                aVar.f11606i = sVar;
                aVar.f11607j = a02;
                aVar.f11608k = obj2;
                aVar.f11611n = 2;
                if (cVar2.l(obj3, aVar) != objE) {
                }
            }
            cVar2 = cVar;
            a02 = (A0) aVar.getContext().e(A0.f10112c);
            obj = null;
            obj2 = f11602k.get(qVar);
            if (a02 != null) {
            }
            if (obj != null) {
            }
            if (obj2 != V8.m.f11867a) {
            }
            aVar.f11604g = qVar;
            aVar.f11605h = cVar2;
            aVar.f11606i = sVar;
            aVar.f11607j = a02;
            aVar.f11608k = obj2;
            aVar.f11611n = 2;
            if (cVar2.l(obj3, aVar) != objE) {
            }
        } catch (Throwable th) {
            qVar.g(sVar);
            throw th;
        }
    }

    @Override // V8.k
    public b c(n7.j jVar, int i10, T8.a aVar) {
        return r.d(this, jVar, i10, aVar);
    }

    @Override // U8.l
    public Object getValue() {
        E e10 = V8.m.f11867a;
        Object obj = f11602k.get(this);
        if (obj == e10) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // V8.b
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public s e() {
        return new s();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // V8.b
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public s[] f(int i10) {
        return new s[i10];
    }

    @Override // U8.c
    public Object l(Object obj, n7.f fVar) {
        setValue(obj);
        return C2735B.f28704a;
    }

    @Override // U8.l
    public void setValue(Object obj) {
        if (obj == null) {
            obj = V8.m.f11867a;
        }
        m(null, obj);
    }
}
