package Y2;

import Y2.C1525k;
import i7.AbstractC2746i;
import i7.EnumC2749l;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: renamed from: Y2.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1525k implements c2.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1531q f12716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g3.D f12717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1530p f12718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W2.t f12719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f12720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X1.d f12721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final X1.d f12722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f12723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f12724i;

    /* JADX INFO: renamed from: Y2.k$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements InterfaceC1517c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lazy f12725a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Lazy f12726b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Lazy f12727c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Lazy f12728d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Lazy f12729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Lazy f12730f;

        a(final C1525k c1525k) {
            EnumC2749l enumC2749l = EnumC2749l.f28716g;
            this.f12725a = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.e
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.p(c1525k);
                }
            });
            this.f12726b = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.f
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.o(this.f12707g, c1525k);
                }
            });
            this.f12727c = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.g
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.r(c1525k);
                }
            });
            this.f12728d = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.h
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.q(this.f12710g, c1525k);
                }
            });
            this.f12729e = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.i
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.k(c1525k, this);
                }
            });
            this.f12730f = AbstractC2746i.a(enumC2749l, new InterfaceC3487a() { // from class: Y2.j
                @Override // w7.InterfaceC3487a
                public final Object invoke() {
                    return C1525k.a.j(this.f12714g, c1525k);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final c2.g j(a this$0, C1525k this$1) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(this$1, "this$1");
            Map mapL = this$0.l();
            LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(mapL.size()));
            for (Map.Entry entry : mapL.entrySet()) {
                Object key = entry.getKey();
                X1.k kVar = (X1.k) entry.getValue();
                f2.i iVarI = this$1.f12717b.i(this$1.f12720e);
                AbstractC2855l.f(iVarI, "getPooledByteBufferFactory(...)");
                f2.l lVarJ = this$1.f12717b.j();
                AbstractC2855l.f(lVarJ, "getPooledByteStreams(...)");
                Executor executorE = this$1.f12718c.e();
                AbstractC2855l.f(executorE, "forLocalStorageRead(...)");
                Executor executorD = this$1.f12718c.d();
                AbstractC2855l.f(executorD, "forLocalStorageWrite(...)");
                linkedHashMap.put(key, new W2.j(kVar, iVarI, lVarJ, executorE, executorD, this$1.f12719d));
            }
            return c2.g.a(linkedHashMap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Map k(C1525k this$0, a this$1) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(this$1, "this$1");
            Map map = this$0.f12723h;
            if (map == null) {
                return j7.K.i();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(j7.K.e(map.size()));
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), this$0.f12716a.a((X1.d) entry.getValue()));
            }
            return linkedHashMap;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final W2.j o(a this$0, C1525k this$1) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(this$1, "this$1");
            X1.k kVarM = this$0.m();
            f2.i iVarI = this$1.f12717b.i(this$1.f12720e);
            AbstractC2855l.f(iVarI, "getPooledByteBufferFactory(...)");
            f2.l lVarJ = this$1.f12717b.j();
            AbstractC2855l.f(lVarJ, "getPooledByteStreams(...)");
            Executor executorE = this$1.f12718c.e();
            AbstractC2855l.f(executorE, "forLocalStorageRead(...)");
            Executor executorD = this$1.f12718c.d();
            AbstractC2855l.f(executorD, "forLocalStorageWrite(...)");
            return new W2.j(kVarM, iVarI, lVarJ, executorE, executorD, this$1.f12719d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final X1.k p(C1525k this$0) {
            AbstractC2855l.g(this$0, "this$0");
            return this$0.f12716a.a(this$0.f12721f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final W2.j q(a this$0, C1525k this$1) {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(this$1, "this$1");
            X1.k kVarN = this$0.n();
            f2.i iVarI = this$1.f12717b.i(this$1.f12720e);
            AbstractC2855l.f(iVarI, "getPooledByteBufferFactory(...)");
            f2.l lVarJ = this$1.f12717b.j();
            AbstractC2855l.f(lVarJ, "getPooledByteStreams(...)");
            Executor executorE = this$1.f12718c.e();
            AbstractC2855l.f(executorE, "forLocalStorageRead(...)");
            Executor executorD = this$1.f12718c.d();
            AbstractC2855l.f(executorD, "forLocalStorageWrite(...)");
            return new W2.j(kVarN, iVarI, lVarJ, executorE, executorD, this$1.f12719d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final X1.k r(C1525k this$0) {
            AbstractC2855l.g(this$0, "this$0");
            return this$0.f12716a.a(this$0.f12722g);
        }

        @Override // Y2.InterfaceC1517c
        public c2.g a() {
            Object value = this.f12730f.getValue();
            AbstractC2855l.f(value, "getValue(...)");
            return (c2.g) value;
        }

        @Override // Y2.InterfaceC1517c
        public W2.j b() {
            return (W2.j) this.f12728d.getValue();
        }

        @Override // Y2.InterfaceC1517c
        public W2.j c() {
            return (W2.j) this.f12726b.getValue();
        }

        public Map l() {
            return (Map) this.f12729e.getValue();
        }

        public X1.k m() {
            return (X1.k) this.f12725a.getValue();
        }

        public X1.k n() {
            return (X1.k) this.f12727c.getValue();
        }
    }

    public C1525k(InterfaceC1531q fileCacheFactory, g3.D poolFactory, InterfaceC1530p executorSupplier, W2.t imageCacheStatsTracker, int i10, X1.d mainDiskCacheConfig, X1.d smallImageDiskCacheConfig, Map map) {
        AbstractC2855l.g(fileCacheFactory, "fileCacheFactory");
        AbstractC2855l.g(poolFactory, "poolFactory");
        AbstractC2855l.g(executorSupplier, "executorSupplier");
        AbstractC2855l.g(imageCacheStatsTracker, "imageCacheStatsTracker");
        AbstractC2855l.g(mainDiskCacheConfig, "mainDiskCacheConfig");
        AbstractC2855l.g(smallImageDiskCacheConfig, "smallImageDiskCacheConfig");
        this.f12716a = fileCacheFactory;
        this.f12717b = poolFactory;
        this.f12718c = executorSupplier;
        this.f12719d = imageCacheStatsTracker;
        this.f12720e = i10;
        this.f12721f = mainDiskCacheConfig;
        this.f12722g = smallImageDiskCacheConfig;
        this.f12723h = map;
        this.f12724i = AbstractC2746i.a(EnumC2749l.f28716g, new InterfaceC3487a() { // from class: Y2.d
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return C1525k.j(this.f12705g);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a j(C1525k this$0) {
        AbstractC2855l.g(this$0, "this$0");
        return new a(this$0);
    }

    private final InterfaceC1517c l() {
        return (InterfaceC1517c) this.f12724i.getValue();
    }

    @Override // c2.n
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public InterfaceC1517c get() {
        return l();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1525k(InterfaceC1531q fileCacheFactory, InterfaceC1535v config) {
        this(fileCacheFactory, config.a(), config.H(), config.s(), config.c(), config.i(), config.r(), config.q());
        AbstractC2855l.g(fileCacheFactory, "fileCacheFactory");
        AbstractC2855l.g(config, "config");
    }
}
