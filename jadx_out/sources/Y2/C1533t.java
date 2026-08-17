package Y2;

import android.net.Uri;
import android.os.StrictMode;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.l0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.request.b;
import f3.C2608b;
import f3.C2609c;
import f3.InterfaceC2610d;
import f3.InterfaceC2611e;
import g2.AbstractC2662a;
import i7.C2750m;
import j3.C2768b;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Y2.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1533t {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f12738n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final CancellationException f12739o = new CancellationException("Prefetching is not enabled");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final CancellationException f12740p = new CancellationException("ImageRequest is null");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final CancellationException f12741q = new CancellationException("Modified URL is null");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final W f12742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c2.n f12743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c2.n f12744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final InterfaceC2611e f12745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final InterfaceC2610d f12746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final W2.x f12747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final W2.x f12748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final W2.k f12749h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final p0 f12750i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c2.n f12751j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicLong f12752k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c2.n f12753l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final InterfaceC1535v f12754m;

    /* JADX INFO: renamed from: Y2.t$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: Y2.t$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f12755a;

        static {
            int[] iArr = new int[b.EnumC0218b.values().length];
            try {
                iArr[b.EnumC0218b.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.EnumC0218b.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.EnumC0218b.DYNAMIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12755a = iArr;
        }
    }

    public C1533t(W producerSequenceFactory, Set requestListeners, Set requestListener2s, c2.n isPrefetchEnabledSupplier, W2.x bitmapMemoryCache, W2.x encodedMemoryCache, c2.n diskCachesStoreSupplier, W2.k cacheKeyFactory, p0 threadHandoffProducerQueue, c2.n suppressBitmapPrefetchingSupplier, c2.n lazyDataSource, Y1.a aVar, InterfaceC1535v config) {
        AbstractC2855l.g(producerSequenceFactory, "producerSequenceFactory");
        AbstractC2855l.g(requestListeners, "requestListeners");
        AbstractC2855l.g(requestListener2s, "requestListener2s");
        AbstractC2855l.g(isPrefetchEnabledSupplier, "isPrefetchEnabledSupplier");
        AbstractC2855l.g(bitmapMemoryCache, "bitmapMemoryCache");
        AbstractC2855l.g(encodedMemoryCache, "encodedMemoryCache");
        AbstractC2855l.g(diskCachesStoreSupplier, "diskCachesStoreSupplier");
        AbstractC2855l.g(cacheKeyFactory, "cacheKeyFactory");
        AbstractC2855l.g(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        AbstractC2855l.g(suppressBitmapPrefetchingSupplier, "suppressBitmapPrefetchingSupplier");
        AbstractC2855l.g(lazyDataSource, "lazyDataSource");
        AbstractC2855l.g(config, "config");
        this.f12742a = producerSequenceFactory;
        this.f12743b = isPrefetchEnabledSupplier;
        this.f12744c = diskCachesStoreSupplier;
        this.f12745d = new C2609c(requestListeners);
        this.f12746e = new C2608b(requestListener2s);
        this.f12752k = new AtomicLong();
        this.f12747f = bitmapMemoryCache;
        this.f12748g = encodedMemoryCache;
        this.f12749h = cacheKeyFactory;
        this.f12750i = threadHandoffProducerQueue;
        this.f12751j = suppressBitmapPrefetchingSupplier;
        this.f12753l = lazyDataSource;
        this.f12754m = config;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(Uri uri, W1.d key) {
        AbstractC2855l.g(uri, "$uri");
        AbstractC2855l.g(key, "key");
        return key.a(uri);
    }

    private final m2.c D(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, InterfaceC2611e interfaceC2611e, String str) {
        return E(d0Var, bVar, cVar, obj, interfaceC2611e, str, null);
    }

    private final m2.c E(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, InterfaceC2611e interfaceC2611e, String str, Map map) {
        m2.c cVarB;
        if (!C2768b.d()) {
            com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(s(bVar, interfaceC2611e), this.f12746e);
            try {
                b.c cVarH = b.c.h(bVar.getLowestPermittedRequestLevel(), cVar);
                AbstractC2855l.f(cVarH, "getMax(...)");
                l0 l0Var = new l0(bVar, p(), str, f10, obj, cVarH, false, bVar.getProgressiveRenderingEnabled() || !k2.f.o(bVar.getSourceUri()), bVar.getPriority(), this.f12754m);
                l0Var.s(map);
                return Z2.c.F(d0Var, l0Var, f10);
            } catch (Exception e10) {
                return m2.d.b(e10);
            }
        }
        C2768b.a("ImagePipeline#submitFetchRequest");
        try {
            com.facebook.imagepipeline.producers.F f11 = new com.facebook.imagepipeline.producers.F(s(bVar, interfaceC2611e), this.f12746e);
            try {
                b.c cVarH2 = b.c.h(bVar.getLowestPermittedRequestLevel(), cVar);
                AbstractC2855l.f(cVarH2, "getMax(...)");
                l0 l0Var2 = new l0(bVar, p(), str, f11, obj, cVarH2, false, bVar.getProgressiveRenderingEnabled() || !k2.f.o(bVar.getSourceUri()), bVar.getPriority(), this.f12754m);
                l0Var2.s(map);
                cVarB = Z2.c.F(d0Var, l0Var2, f11);
            } catch (Exception e11) {
                cVarB = m2.d.b(e11);
            }
            C2768b.b();
            return cVarB;
        } catch (Throwable th) {
            C2768b.b();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final m2.c F(d0 d0Var, com.facebook.imagepipeline.request.b bVar, b.c cVar, Object obj, X2.f fVar, InterfaceC2611e interfaceC2611e) {
        boolean z10;
        com.facebook.imagepipeline.producers.F f10 = new com.facebook.imagepipeline.producers.F(s(bVar, interfaceC2611e), this.f12746e);
        Uri sourceUri = bVar.getSourceUri();
        AbstractC2855l.f(sourceUri, "getSourceUri(...)");
        Uri uriA = O2.b.f8180b.a(sourceUri, obj);
        if (uriA == null) {
            m2.c cVarB = m2.d.b(f12741q);
            AbstractC2855l.f(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (!AbstractC2855l.b(sourceUri, uriA)) {
            bVar = com.facebook.imagepipeline.request.c.b(bVar).R(uriA).a();
        }
        com.facebook.imagepipeline.request.b bVar2 = bVar;
        try {
            b.c cVarH = b.c.h(bVar2.getLowestPermittedRequestLevel(), cVar);
            AbstractC2855l.f(cVarH, "getMax(...)");
            String strP = p();
            x xVarF = this.f12754m.F();
            if (xVarF != null) {
                z10 = xVarF.b() && bVar2.getProgressiveRenderingEnabled();
            }
            return Z2.d.f13562j.a(d0Var, new l0(bVar2, strP, f10, obj, cVarH, true, z10, fVar, this.f12754m), f10);
        } catch (Exception e10) {
            return m2.d.b(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(W1.d it) {
        AbstractC2855l.g(it, "it");
        return true;
    }

    public static /* synthetic */ m2.c n(C1533t c1533t, com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar, InterfaceC2611e interfaceC2611e, String str, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            cVar = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC2611e = null;
        }
        if ((i10 & 16) != 0) {
            str = null;
        }
        return c1533t.m(bVar, obj, cVar, interfaceC2611e, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean y(com.facebook.imagepipeline.request.b bVar) {
        Object obj = this.f12744c.get();
        AbstractC2855l.f(obj, "get(...)");
        InterfaceC1517c interfaceC1517c = (InterfaceC1517c) obj;
        W1.d dVarD = this.f12749h.d(bVar, null);
        String diskCacheId = bVar.getDiskCacheId();
        if (diskCacheId != null) {
            W2.j jVar = (W2.j) interfaceC1517c.a().get(diskCacheId);
            if (jVar == null) {
                return false;
            }
            AbstractC2855l.d(dVarD);
            return jVar.k(dVarD);
        }
        Iterator it = interfaceC1517c.a().entrySet().iterator();
        while (it.hasNext()) {
            W2.j jVar2 = (W2.j) ((Map.Entry) it.next()).getValue();
            AbstractC2855l.d(dVarD);
            if (jVar2.k(dVarD)) {
                return true;
            }
        }
        return false;
    }

    private final c2.l z(final Uri uri) {
        return new c2.l() { // from class: Y2.r
            @Override // c2.l
            public final boolean apply(Object obj) {
                return C1533t.A(uri, (W1.d) obj);
            }
        };
    }

    public final m2.c B(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return C(bVar, obj, X2.f.f12440i, null);
    }

    public final m2.c C(com.facebook.imagepipeline.request.b bVar, Object obj, X2.f priority, InterfaceC2611e interfaceC2611e) {
        AbstractC2855l.g(priority, "priority");
        if (!((Boolean) this.f12743b.get()).booleanValue()) {
            m2.c cVarB = m2.d.b(f12739o);
            AbstractC2855l.f(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        if (bVar == null) {
            m2.c cVarB2 = m2.d.b(new NullPointerException("imageRequest is null"));
            AbstractC2855l.d(cVarB2);
            return cVarB2;
        }
        try {
            return F(this.f12742a.G(bVar), bVar, b.c.FULL_FETCH, obj, priority, interfaceC2611e);
        } catch (Exception e10) {
            return m2.d.b(e10);
        }
    }

    public final void c() {
        e();
        d();
    }

    public final void d() {
        Object obj = this.f12744c.get();
        AbstractC2855l.f(obj, "get(...)");
        InterfaceC1517c interfaceC1517c = (InterfaceC1517c) obj;
        interfaceC1517c.c().h();
        interfaceC1517c.b().h();
        Iterator it = interfaceC1517c.a().entrySet().iterator();
        while (it.hasNext()) {
            ((W2.j) ((Map.Entry) it.next()).getValue()).h();
        }
    }

    public final void e() {
        c2.l lVar = new c2.l() { // from class: Y2.s
            @Override // c2.l
            public final boolean apply(Object obj) {
                return C1533t.f((W1.d) obj);
            }
        };
        this.f12747f.d(lVar);
        this.f12748g.d(lVar);
    }

    public final void g(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        j(uri);
        h(uri);
    }

    public final void h(Uri uri) {
        com.facebook.imagepipeline.request.b bVarFromUri = com.facebook.imagepipeline.request.b.fromUri(uri);
        if (bVarFromUri == null) {
            throw new IllegalStateException("Required value was null.");
        }
        i(bVarFromUri);
    }

    public final void i(com.facebook.imagepipeline.request.b bVar) {
        if (bVar == null) {
            return;
        }
        W1.d dVarD = this.f12749h.d(bVar, null);
        Object obj = this.f12744c.get();
        AbstractC2855l.f(obj, "get(...)");
        InterfaceC1517c interfaceC1517c = (InterfaceC1517c) obj;
        W2.j jVarC = interfaceC1517c.c();
        AbstractC2855l.d(dVarD);
        jVarC.s(dVarD);
        interfaceC1517c.b().s(dVarD);
        Iterator it = interfaceC1517c.a().entrySet().iterator();
        while (it.hasNext()) {
            ((W2.j) ((Map.Entry) it.next()).getValue()).s(dVarD);
        }
    }

    public final void j(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        c2.l lVarZ = z(uri);
        this.f12747f.d(lVarZ);
        this.f12748g.d(lVarZ);
    }

    public final m2.c k(com.facebook.imagepipeline.request.b bVar, Object obj) {
        return n(this, bVar, obj, null, null, null, 24, null);
    }

    public final m2.c l(com.facebook.imagepipeline.request.b bVar, Object obj, b.c lowestPermittedRequestLevelOnSubmit) {
        AbstractC2855l.g(lowestPermittedRequestLevelOnSubmit, "lowestPermittedRequestLevelOnSubmit");
        return n(this, bVar, obj, lowestPermittedRequestLevelOnSubmit, null, null, 16, null);
    }

    public final m2.c m(com.facebook.imagepipeline.request.b bVar, Object obj, b.c cVar, InterfaceC2611e interfaceC2611e, String str) {
        if (bVar == null) {
            m2.c cVarB = m2.d.b(new NullPointerException());
            AbstractC2855l.f(cVarB, "immediateFailedDataSource(...)");
            return cVarB;
        }
        try {
            d0 d0VarE = this.f12742a.E(bVar);
            if (cVar == null) {
                cVar = b.c.FULL_FETCH;
            }
            return D(d0VarE, bVar, cVar, obj, interfaceC2611e, str);
        } catch (Exception e10) {
            return m2.d.b(e10);
        }
    }

    public final m2.c o(com.facebook.imagepipeline.request.b imageRequest, Object obj) {
        AbstractC2855l.g(imageRequest, "imageRequest");
        return l(imageRequest, obj, b.c.BITMAP_MEMORY_CACHE);
    }

    public final String p() {
        return String.valueOf(this.f12752k.getAndIncrement());
    }

    public final W2.x q() {
        return this.f12747f;
    }

    public final W2.k r() {
        return this.f12749h;
    }

    public final InterfaceC2611e s(com.facebook.imagepipeline.request.b bVar, InterfaceC2611e interfaceC2611e) {
        if (bVar != null) {
            return interfaceC2611e == null ? bVar.getRequestListener() == null ? this.f12745d : new C2609c(this.f12745d, bVar.getRequestListener()) : bVar.getRequestListener() == null ? new C2609c(this.f12745d, interfaceC2611e) : new C2609c(this.f12745d, interfaceC2611e, bVar.getRequestListener());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean t(Uri uri) {
        if (uri == null) {
            return false;
        }
        return this.f12747f.b(z(uri));
    }

    public final boolean u(com.facebook.imagepipeline.request.b bVar) {
        if (bVar == null) {
            return false;
        }
        W1.d dVarA = this.f12749h.a(bVar, null);
        W2.x xVar = this.f12747f;
        AbstractC2855l.d(dVarA);
        AbstractC2662a abstractC2662a = xVar.get(dVarA);
        try {
            return AbstractC2662a.d0(abstractC2662a);
        } finally {
            AbstractC2662a.B(abstractC2662a);
        }
    }

    public final boolean v(Uri uri) {
        return w(uri, b.EnumC0218b.SMALL) || w(uri, b.EnumC0218b.DEFAULT) || w(uri, b.EnumC0218b.DYNAMIC);
    }

    public final boolean w(Uri uri, b.EnumC0218b enumC0218b) {
        com.facebook.imagepipeline.request.b bVarA = com.facebook.imagepipeline.request.c.x(uri).A(enumC0218b).a();
        AbstractC2855l.d(bVarA);
        return x(bVarA);
    }

    public final boolean x(com.facebook.imagepipeline.request.b imageRequest) {
        boolean zK;
        AbstractC2855l.g(imageRequest, "imageRequest");
        Object obj = this.f12744c.get();
        AbstractC2855l.f(obj, "get(...)");
        InterfaceC1517c interfaceC1517c = (InterfaceC1517c) obj;
        W1.d dVarD = this.f12749h.d(imageRequest, null);
        b.EnumC0218b cacheChoice = imageRequest.getCacheChoice();
        AbstractC2855l.f(cacheChoice, "getCacheChoice(...)");
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            int i10 = b.f12755a[cacheChoice.ordinal()];
            if (i10 == 1) {
                W2.j jVarC = interfaceC1517c.c();
                AbstractC2855l.d(dVarD);
                zK = jVarC.k(dVarD);
            } else if (i10 == 2) {
                W2.j jVarB = interfaceC1517c.b();
                AbstractC2855l.d(dVarD);
                zK = jVarB.k(dVarD);
            } else {
                if (i10 != 3) {
                    throw new C2750m();
                }
                zK = y(imageRequest);
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return zK;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }
}
