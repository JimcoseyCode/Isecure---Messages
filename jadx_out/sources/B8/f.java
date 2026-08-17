package B8;

import P8.q;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import kotlin.jvm.functions.Function1;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class f implements B8.n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f410d = q.Z0(f.class.getCanonicalName(), ".", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final B8.n f411e = new a("NO_LOCKS", InterfaceC0019f.f420a, B8.e.f409b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final B8.k f412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0019f f413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f414c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends f {
        a(String str, InterfaceC0019f interfaceC0019f, B8.k kVar) {
            super(str, interfaceC0019f, kVar, null);
        }

        private static /* synthetic */ void j(int i10) {
            String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 1 ? 3 : 2];
            if (i10 != 1) {
                objArr[0] = "source";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            }
            if (i10 != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$1";
            } else {
                objArr[1] = "recursionDetectedDefault";
            }
            if (i10 != 1) {
                objArr[2] = "recursionDetectedDefault";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 1) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // B8.f
        protected o p(String str, Object obj) {
            if (str == null) {
                j(0);
            }
            o oVarA = o.a();
            if (oVarA == null) {
                j(1);
            }
            return oVarA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends j {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Object f415j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f fVar, InterfaceC3487a interfaceC3487a, Object obj) {
            super(fVar, interfaceC3487a);
            this.f415j = obj;
        }

        private static /* synthetic */ void a(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$4", "recursionDetected"));
        }

        @Override // B8.f.h
        protected o d(boolean z10) {
            o oVarD = o.d(this.f415j);
            if (oVarD == null) {
                a(0);
            }
            return oVarD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c extends k {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function1 f417k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function1 f418l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f fVar, InterfaceC3487a interfaceC3487a, Function1 function1, Function1 function12) {
            super(fVar, interfaceC3487a);
            this.f417k = function1;
            this.f418l = function12;
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[i10 != 2 ? 2 : 3];
            if (i10 != 2) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            } else {
                objArr[0] = "value";
            }
            if (i10 != 2) {
                objArr[1] = "recursionDetected";
            } else {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$5";
            }
            if (i10 == 2) {
                objArr[2] = "doPostCompute";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalArgumentException(str2);
            }
        }

        @Override // B8.f.h
        protected o d(boolean z10) {
            Function1 function1 = this.f417k;
            if (function1 == null) {
                o oVarD = super.d(z10);
                if (oVarD == null) {
                    a(0);
                }
                return oVarD;
            }
            o oVarD2 = o.d(function1.invoke(Boolean.valueOf(z10)));
            if (oVarD2 == null) {
                a(1);
            }
            return oVarD2;
        }

        @Override // B8.f.i
        protected void f(Object obj) {
            if (obj == null) {
                a(2);
            }
            this.f418l.invoke(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends e implements B8.a {
        /* synthetic */ d(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void c(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "computation";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNotNullValuesBasedOnMemoizedFunction";
            } else {
                objArr[1] = "computeIfAbsent";
            }
            if (i10 == 2) {
                objArr[2] = "computeIfAbsent";
            } else if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // B8.f.e, B8.a
        public Object a(Object obj, InterfaceC3487a interfaceC3487a) {
            if (interfaceC3487a == null) {
                c(2);
            }
            Object objA = super.a(obj, interfaceC3487a);
            if (objA == null) {
                c(3);
            }
            return objA;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private d(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, null);
            if (fVar == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class e extends l implements B8.b {

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a implements Function1 {
            a() {
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Object invoke(g gVar) {
                return gVar.f422b.invoke();
            }
        }

        /* synthetic */ e(f fVar, ConcurrentMap concurrentMap, a aVar) {
            this(fVar, concurrentMap);
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computation";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$CacheWithNullableValuesBasedOnMemoizedFunction";
            if (i10 != 2) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "computeIfAbsent";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public Object a(Object obj, InterfaceC3487a interfaceC3487a) {
            if (interfaceC3487a == null) {
                c(2);
            }
            return invoke(new g(obj, interfaceC3487a));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        private e(f fVar, ConcurrentMap concurrentMap) {
            super(fVar, concurrentMap, new a());
            if (fVar == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
        }
    }

    /* JADX INFO: renamed from: B8.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0019f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InterfaceC0019f f420a = new a();

        /* JADX INFO: renamed from: B8.f$f$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static class a implements InterfaceC0019f {
            a() {
            }

            private static /* synthetic */ void a(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "throwable", "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$ExceptionHandlingStrategy$1", "handleException"));
            }

            @Override // B8.f.InterfaceC0019f
            public RuntimeException handleException(Throwable th) {
                if (th == null) {
                    a(0);
                }
                throw M8.d.b(th);
            }
        }

        RuntimeException handleException(Throwable th);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC3487a f422b;

        public g(Object obj, InterfaceC3487a interfaceC3487a) {
            this.f421a = obj;
            this.f422b = interfaceC3487a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f421a.equals(((g) obj).f421a);
        }

        public int hashCode() {
            return this.f421a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class i extends h {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile B8.l f426j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f fVar, InterfaceC3487a interfaceC3487a) {
            super(fVar, interfaceC3487a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC3487a == null) {
                a(1);
            }
            this.f426j = null;
        }

        private static /* synthetic */ void a(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "computable";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValueWithPostCompute";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // B8.f.h
        protected final void c(Object obj) {
            this.f426j = new B8.l(obj);
            try {
                f(obj);
            } finally {
                this.f426j = null;
            }
        }

        protected abstract void f(Object obj);

        @Override // B8.f.h, w7.InterfaceC3487a
        public Object invoke() {
            B8.l lVar = this.f426j;
            return (lVar == null || !lVar.b()) ? super.invoke() : lVar.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class j extends h implements B8.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f fVar, InterfaceC3487a interfaceC3487a) {
            super(fVar, interfaceC3487a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC3487a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValue";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // B8.f.h, w7.InterfaceC3487a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class k extends i implements B8.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(f fVar, InterfaceC3487a interfaceC3487a) {
            super(fVar, interfaceC3487a);
            if (fVar == null) {
                a(0);
            }
            if (interfaceC3487a == null) {
                a(1);
            }
        }

        private static /* synthetic */ void a(int i10) {
            String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 2 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 != 2) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            }
            if (i10 != 2) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedNotNullLazyValueWithPostCompute";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 2) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 2) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // B8.f.i, B8.f.h, w7.InterfaceC3487a
        public Object invoke() {
            Object objInvoke = super.invoke();
            if (objInvoke == null) {
                a(2);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class l implements B8.h {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final f f427g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ConcurrentMap f428h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Function1 f429i;

        public l(f fVar, ConcurrentMap concurrentMap, Function1 function1) {
            if (fVar == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
            if (function1 == null) {
                c(2);
            }
            this.f427g = fVar;
            this.f428h = concurrentMap;
            this.f429i = function1;
        }

        private static /* synthetic */ void c(int i10) {
            String str = (i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 3 || i10 == 4) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 == 3 || i10 == 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 3) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunction";
            } else {
                objArr[1] = "raceCondition";
            }
            if (i10 != 3 && i10 != 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 3 && i10 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        private AssertionError d(Object obj, Object obj2) {
            return (AssertionError) f.q(new AssertionError("Inconsistent key detected. " + n.COMPUTING + " is expected, was: " + obj2 + ", most probably race condition detected on input " + obj + " under " + this.f427g));
        }

        private AssertionError f(Object obj, Object obj2) {
            AssertionError assertionError = (AssertionError) f.q(new AssertionError("Race condition detected on input " + obj + ". Old value is " + obj2 + " under " + this.f427g));
            if (assertionError == null) {
                c(4);
            }
            return assertionError;
        }

        private AssertionError j(Object obj, Throwable th) {
            return (AssertionError) f.q(new AssertionError("Unable to remove " + obj + " under " + this.f427g, th));
        }

        protected o g(Object obj, boolean z10) {
            o oVarP = this.f427g.p(PointerEventHelper.POINTER_TYPE_UNKNOWN, obj);
            if (oVarP == null) {
                c(3);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[Catch: all -> 0x003b, PHI: r0
          0x003e: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v21 java.lang.Object) binds: [B:10:0x0020, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:9:0x0018, B:11:0x0022, B:13:0x002f, B:18:0x003e, B:20:0x0042, B:22:0x004d, B:24:0x0054, B:34:0x007f, B:37:0x008b, B:39:0x008f, B:40:0x0093, B:41:0x0094, B:42:0x0096, B:47:0x009f, B:49:0x00ad, B:50:0x00b1, B:51:0x00b2, B:52:0x00bc, B:54:0x00c2, B:55:0x00cc, B:57:0x00ce, B:58:0x00d2, B:44:0x0098, B:45:0x009c, B:36:0x0085, B:53:0x00bd, B:27:0x005a, B:31:0x0079, B:32:0x007d), top: B:63:0x0018, inners: #0, #2, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
        @Override // kotlin.jvm.functions.Function1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object invoke(Object obj) {
            Object obj2;
            n nVar;
            AssertionError assertionErrorJ;
            Object objD;
            Object obj3 = this.f428h.get(obj);
            if (obj3 != null && obj3 != n.COMPUTING) {
                return M8.m.d(obj3);
            }
            this.f427g.f412a.lock();
            try {
                obj2 = this.f428h.get(obj);
                nVar = n.COMPUTING;
            } finally {
            }
            if (obj2 == nVar) {
                obj2 = n.RECURSION_WAS_DETECTED;
                o oVarG = g(obj, true);
                if (!oVarG.c()) {
                    objD = oVarG.b();
                } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                    o oVarG2 = g(obj, false);
                    if (!oVarG2.c()) {
                        objD = oVarG2.b();
                    } else {
                        if (obj2 == null) {
                            AssertionError assertionErrorF = null;
                            try {
                                this.f428h.put(obj, nVar);
                                Object objInvoke = this.f429i.invoke(obj);
                                Object objPut = this.f428h.put(obj, M8.m.b(objInvoke));
                                if (objPut == nVar) {
                                    return objInvoke;
                                }
                                assertionErrorF = f(obj, objPut);
                                throw assertionErrorF;
                            } catch (Throwable th) {
                                if (M8.d.a(th)) {
                                    try {
                                        Object objRemove = this.f428h.remove(obj);
                                        if (objRemove != n.COMPUTING) {
                                            throw d(obj, objRemove);
                                        }
                                        throw th;
                                    } finally {
                                    }
                                }
                                if (th == assertionErrorF) {
                                    try {
                                        this.f428h.remove(obj);
                                        throw this.f427g.f413b.handleException(th);
                                    } finally {
                                    }
                                }
                                Object objPut2 = this.f428h.put(obj, M8.m.c(th));
                                if (objPut2 != n.COMPUTING) {
                                    throw f(obj, objPut2);
                                }
                                throw this.f427g.f413b.handleException(th);
                            }
                            this.f427g.f412a.unlock();
                        }
                        objD = M8.m.d(obj2);
                    }
                }
            }
            return objD;
        }

        @Override // B8.h
        public boolean k(Object obj) {
            Object obj2 = this.f428h.get(obj);
            return (obj2 == null || obj2 == n.COMPUTING) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class m extends l implements B8.g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(f fVar, ConcurrentMap concurrentMap, Function1 function1) {
            super(fVar, concurrentMap, function1);
            if (fVar == null) {
                c(0);
            }
            if (concurrentMap == null) {
                c(1);
            }
            if (function1 == null) {
                c(2);
            }
        }

        private static /* synthetic */ void c(int i10) {
            String str = i10 != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[i10 != 3 ? 3 : 2];
            if (i10 == 1) {
                objArr[0] = "map";
            } else if (i10 == 2) {
                objArr[0] = "compute";
            } else if (i10 != 3) {
                objArr[0] = "storageManager";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            }
            if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$MapBasedMemoizedFunctionToNotNull";
            } else {
                objArr[1] = "invoke";
            }
            if (i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 == 3) {
                throw new IllegalStateException(str2);
            }
        }

        @Override // B8.f.l, kotlin.jvm.functions.Function1
        public Object invoke(Object obj) {
            Object objInvoke = super.invoke(obj);
            if (objInvoke == null) {
                c(3);
            }
            return objInvoke;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum n {
        NOT_COMPUTED,
        COMPUTING,
        RECURSION_WAS_DETECTED
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f435b;

        private o(Object obj, boolean z10) {
            this.f434a = obj;
            this.f435b = z10;
        }

        public static o a() {
            return new o(null, true);
        }

        public static o d(Object obj) {
            return new o(obj, false);
        }

        public Object b() {
            return this.f434a;
        }

        public boolean c() {
            return this.f435b;
        }

        public String toString() {
            return c() ? "FALL_THROUGH" : String.valueOf(this.f434a);
        }
    }

    /* synthetic */ f(String str, InterfaceC0019f interfaceC0019f, B8.k kVar, a aVar) {
        this(str, interfaceC0019f, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void j(int i10) {
        String str = (i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 10 || i10 == 13 || i10 == 20 || i10 == 37) ? 2 : 3];
        if (i10 == 1 || i10 == 3 || i10 == 5) {
            objArr[0] = "exceptionHandlingStrategy";
        } else if (i10 != 6) {
            switch (i10) {
                case 8:
                    break;
                case 9:
                case 11:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case 16:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                    objArr[0] = "compute";
                    break;
                case 10:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                case 37:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
                    break;
                case 12:
                case 17:
                case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                    objArr[0] = "onRecursiveCall";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                    objArr[0] = "map";
                    break;
                case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                case 30:
                case 31:
                case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                case 34:
                    objArr[0] = "computable";
                    break;
                case 29:
                case 33:
                    objArr[0] = "postCompute";
                    break;
                case 35:
                    objArr[0] = "source";
                    break;
                case 36:
                    objArr[0] = "throwable";
                    break;
                default:
                    objArr[0] = "debugText";
                    break;
            }
        } else {
            objArr[0] = "lock";
        }
        if (i10 == 10 || i10 == 13) {
            objArr[1] = "createMemoizedFunction";
        } else if (i10 == 20) {
            objArr[1] = "createMemoizedFunctionWithNullableValues";
        } else if (i10 != 37) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager";
        } else {
            objArr[1] = "sanitizeStackTrace";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "<init>";
                break;
            case 7:
            case 8:
                objArr[2] = "replaceExceptionHandling";
                break;
            case 9:
            case 11:
            case 12:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
            case 16:
            case 17:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                objArr[2] = "createMemoizedFunction";
                break;
            case 10:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
            case 37:
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                objArr[2] = "createMemoizedFunctionWithNullableValues";
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                objArr[2] = "createLazyValue";
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                objArr[2] = "createRecursionTolerantLazyValue";
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
            case 29:
                objArr[2] = "createLazyValueWithPostCompute";
                break;
            case 30:
                objArr[2] = "createNullableLazyValue";
                break;
            case 31:
                objArr[2] = "createRecursionTolerantNullableLazyValue";
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
            case 33:
                objArr[2] = "createNullableLazyValueWithPostCompute";
                break;
            case 34:
                objArr[2] = "compute";
                break;
            case 35:
                objArr[2] = "recursionDetectedDefault";
                break;
            case 36:
                objArr[2] = "sanitizeStackTrace";
                break;
            default:
                objArr[2] = "createWithExceptionHandling";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 10 && i10 != 13 && i10 != 20 && i10 != 37) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    private static ConcurrentMap m() {
        return new ConcurrentHashMap(3, 1.0f, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Throwable q(Throwable th) {
        if (th == null) {
            j(36);
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (!stackTrace[i10].getClassName().startsWith(f410d)) {
                break;
            }
            i10++;
        }
        List listSubList = Arrays.asList(stackTrace).subList(i10, length);
        th.setStackTrace((StackTraceElement[]) listSubList.toArray(new StackTraceElement[listSubList.size()]));
        return th;
    }

    @Override // B8.n
    public B8.b a() {
        return new e(this, m(), null);
    }

    @Override // B8.n
    public B8.i b(InterfaceC3487a interfaceC3487a, Object obj) {
        if (interfaceC3487a == null) {
            j(26);
        }
        if (obj == null) {
            j(27);
        }
        return new b(this, interfaceC3487a, obj);
    }

    @Override // B8.n
    public B8.a c() {
        return new d(this, m(), null);
    }

    @Override // B8.n
    public B8.i d(InterfaceC3487a interfaceC3487a, Function1 function1, Function1 function12) {
        if (interfaceC3487a == null) {
            j(28);
        }
        if (function12 == null) {
            j(29);
        }
        return new c(this, interfaceC3487a, function1, function12);
    }

    @Override // B8.n
    public B8.i e(InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            j(23);
        }
        return new j(this, interfaceC3487a);
    }

    @Override // B8.n
    public Object f(InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            j(34);
        }
        this.f412a.lock();
        try {
            return interfaceC3487a.invoke();
        } finally {
        }
    }

    @Override // B8.n
    public B8.j g(InterfaceC3487a interfaceC3487a) {
        if (interfaceC3487a == null) {
            j(30);
        }
        return new h(this, interfaceC3487a);
    }

    @Override // B8.n
    public B8.g h(Function1 function1) {
        if (function1 == null) {
            j(9);
        }
        B8.g gVarN = n(function1, m());
        if (gVarN == null) {
            j(10);
        }
        return gVarN;
    }

    @Override // B8.n
    public B8.h i(Function1 function1) {
        if (function1 == null) {
            j(19);
        }
        B8.h hVarO = o(function1, m());
        if (hVarO == null) {
            j(20);
        }
        return hVarO;
    }

    public B8.g n(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(14);
        }
        if (concurrentMap == null) {
            j(15);
        }
        return new m(this, concurrentMap, function1);
    }

    public B8.h o(Function1 function1, ConcurrentMap concurrentMap) {
        if (function1 == null) {
            j(21);
        }
        if (concurrentMap == null) {
            j(22);
        }
        return new l(this, concurrentMap, function1);
    }

    protected o p(String str, Object obj) {
        String str2;
        if (str == null) {
            j(35);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Recursion detected ");
        sb.append(str);
        if (obj == null) {
            str2 = PointerEventHelper.POINTER_TYPE_UNKNOWN;
        } else {
            str2 = "on input: " + obj;
        }
        sb.append(str2);
        sb.append(" under ");
        sb.append(this);
        throw ((AssertionError) q(new AssertionError(sb.toString())));
    }

    public String toString() {
        return getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + " (" + this.f414c + ")";
    }

    private f(String str, InterfaceC0019f interfaceC0019f, B8.k kVar) {
        if (str == null) {
            j(4);
        }
        if (interfaceC0019f == null) {
            j(5);
        }
        if (kVar == null) {
            j(6);
        }
        this.f412a = kVar;
        this.f413b = interfaceC0019f;
        this.f414c = str;
    }

    public f(String str) {
        this(str, (Runnable) null, (Function1) null);
    }

    public f(String str, Runnable runnable, Function1 function1) {
        this(str, InterfaceC0019f.f420a, B8.k.f436a.a(runnable, function1));
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h implements B8.j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final f f423g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final InterfaceC3487a f424h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private volatile Object f425i;

        public h(f fVar, InterfaceC3487a interfaceC3487a) {
            if (fVar == null) {
                a(0);
            }
            if (interfaceC3487a == null) {
                a(1);
            }
            this.f425i = n.NOT_COMPUTED;
            this.f423g = fVar;
            this.f424h = interfaceC3487a;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 2 || i10 == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 2 || i10 == 3) ? 2 : 3];
            if (i10 == 1) {
                objArr[0] = "computable";
            } else if (i10 == 2 || i10 == 3) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[0] = "storageManager";
            }
            if (i10 == 2) {
                objArr[1] = "recursionDetected";
            } else if (i10 != 3) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/storage/LockBasedStorageManager$LockBasedLazyValue";
            } else {
                objArr[1] = "renderDebugInformation";
            }
            if (i10 != 2 && i10 != 3) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public boolean b() {
            return (this.f425i == n.NOT_COMPUTED || this.f425i == n.COMPUTING) ? false : true;
        }

        protected o d(boolean z10) {
            o oVarP = this.f423g.p("in a lazy value", null);
            if (oVarP == null) {
                a(2);
            }
            return oVarP;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x0024, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {all -> 0x0024, blocks: (B:7:0x0012, B:9:0x0018, B:14:0x0026, B:16:0x002a, B:18:0x0039, B:19:0x003e, B:21:0x0042, B:23:0x004d, B:24:0x0052, B:28:0x0061, B:30:0x0067, B:32:0x006d, B:33:0x0073, B:34:0x007d, B:35:0x007e, B:36:0x0084, B:25:0x0054), top: B:41:0x0012, inners: #0 }] */
        @Override // w7.InterfaceC3487a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object invoke() {
            Object objInvoke;
            Object obj = this.f425i;
            if (!(obj instanceof n)) {
                return M8.m.f(obj);
            }
            this.f423g.f412a.lock();
            try {
                Object obj2 = this.f425i;
                if (obj2 instanceof n) {
                    n nVar = n.COMPUTING;
                    if (obj2 == nVar) {
                        this.f425i = n.RECURSION_WAS_DETECTED;
                        o oVarD = d(true);
                        if (!oVarD.c()) {
                            objInvoke = oVarD.b();
                        } else if (obj2 == n.RECURSION_WAS_DETECTED) {
                            o oVarD2 = d(false);
                            if (oVarD2.c()) {
                                this.f425i = nVar;
                                try {
                                    objInvoke = this.f424h.invoke();
                                    c(objInvoke);
                                    this.f425i = objInvoke;
                                } catch (Throwable th) {
                                    if (M8.d.a(th)) {
                                        this.f425i = n.NOT_COMPUTED;
                                        throw th;
                                    }
                                    if (this.f425i == n.COMPUTING) {
                                        this.f425i = M8.m.c(th);
                                    }
                                    throw this.f423g.f413b.handleException(th);
                                }
                            } else {
                                objInvoke = oVarD2.b();
                            }
                        }
                    }
                } else {
                    objInvoke = M8.m.f(obj2);
                }
                return objInvoke;
            } finally {
                this.f423g.f412a.unlock();
            }
        }

        protected void c(Object obj) {
        }
    }
}
