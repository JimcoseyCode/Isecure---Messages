package Y2;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Build;
import com.facebook.imagepipeline.producers.C1965a;
import com.facebook.imagepipeline.producers.C1971g;
import com.facebook.imagepipeline.producers.C1972h;
import com.facebook.imagepipeline.producers.C1973i;
import com.facebook.imagepipeline.producers.C1975k;
import com.facebook.imagepipeline.producers.C1976l;
import com.facebook.imagepipeline.producers.C1979o;
import com.facebook.imagepipeline.producers.C1980p;
import com.facebook.imagepipeline.producers.C1982s;
import com.facebook.imagepipeline.producers.C1985v;
import com.facebook.imagepipeline.producers.C1986w;
import com.facebook.imagepipeline.producers.C1988y;
import com.facebook.imagepipeline.producers.X;
import com.facebook.imagepipeline.producers.Y;
import com.facebook.imagepipeline.producers.b0;
import com.facebook.imagepipeline.producers.d0;
import com.facebook.imagepipeline.producers.i0;
import com.facebook.imagepipeline.producers.j0;
import com.facebook.imagepipeline.producers.k0;
import com.facebook.imagepipeline.producers.n0;
import com.facebook.imagepipeline.producers.p0;
import com.facebook.imagepipeline.producers.r0;
import com.facebook.imagepipeline.producers.t0;
import com.facebook.imagepipeline.producers.u0;
import com.facebook.imagepipeline.request.b;
import e2.C2393a;
import i7.AbstractC2746i;
import j3.C2768b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public static final a f12659K = new a(null);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private final Lazy f12660A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Lazy f12661B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private final Lazy f12662C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final Lazy f12663D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final Lazy f12664E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final Lazy f12665F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Lazy f12666G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Lazy f12667H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private final Lazy f12668I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final Lazy f12669J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ContentResolver f12670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C f12671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final X f12672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f12673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p0 f12675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final EnumC1528n f12676g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f12677h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f12678i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12679j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final k3.d f12680k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f12681l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f12682m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f12683n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f12684o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map f12685p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map f12686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map f12687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f12688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Lazy f12689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Lazy f12690u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Lazy f12691v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Lazy f12692w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Lazy f12693x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Lazy f12694y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final Lazy f12695z;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String c(Uri uri) {
            String string = uri.toString();
            AbstractC2855l.f(string, "toString(...)");
            if (string.length() <= 30) {
                return string;
            }
            String strSubstring = string.substring(0, 30);
            AbstractC2855l.f(strSubstring, "substring(...)");
            return strSubstring + "...";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(com.facebook.imagepipeline.request.b bVar) {
            c2.k.b(Boolean.valueOf(bVar.getLowestPermittedRequestLevel().j() <= b.c.ENCODED_MEMORY_CACHE.j()));
        }

        private a() {
        }
    }

    public W(ContentResolver contentResolver, C producerFactory, X networkFetcher, boolean z10, boolean z11, p0 threadHandoffProducerQueue, EnumC1528n downsampleMode, boolean z12, boolean z13, boolean z14, k3.d imageTranscoderFactory, boolean z15, boolean z16, boolean z17, Set set) {
        AbstractC2855l.g(contentResolver, "contentResolver");
        AbstractC2855l.g(producerFactory, "producerFactory");
        AbstractC2855l.g(networkFetcher, "networkFetcher");
        AbstractC2855l.g(threadHandoffProducerQueue, "threadHandoffProducerQueue");
        AbstractC2855l.g(downsampleMode, "downsampleMode");
        AbstractC2855l.g(imageTranscoderFactory, "imageTranscoderFactory");
        this.f12670a = contentResolver;
        this.f12671b = producerFactory;
        this.f12672c = networkFetcher;
        this.f12673d = z10;
        this.f12674e = z11;
        this.f12675f = threadHandoffProducerQueue;
        this.f12676g = downsampleMode;
        this.f12677h = z12;
        this.f12678i = z13;
        this.f12679j = z14;
        this.f12680k = imageTranscoderFactory;
        this.f12681l = z15;
        this.f12682m = z16;
        this.f12683n = z17;
        this.f12684o = set;
        this.f12685p = new LinkedHashMap();
        this.f12686q = new LinkedHashMap();
        this.f12687r = new LinkedHashMap();
        this.f12688s = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.D
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.b0(this.f12641g);
            }
        });
        this.f12689t = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.V
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.V(this.f12658g);
            }
        });
        this.f12690u = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.E
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.T(this.f12642g);
            }
        });
        this.f12691v = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.F
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.c0(this.f12643g);
            }
        });
        this.f12692w = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.G
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.u(this.f12644g);
            }
        });
        this.f12693x = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.H
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.d0(this.f12645g);
            }
        });
        this.f12694y = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.I
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.v(this.f12646g);
            }
        });
        this.f12695z = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.J
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.W(this.f12647g);
            }
        });
        this.f12660A = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.K
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.t(this.f12648g);
            }
        });
        this.f12661B = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.L
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.s(this.f12649g);
            }
        });
        this.f12662C = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.M
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.X(this.f12650g);
            }
        });
        this.f12663D = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.N
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.a0(this.f12651g);
            }
        });
        this.f12664E = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.O
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.U(this.f12652g);
            }
        });
        this.f12665F = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.P
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.Z(this.f12653g);
            }
        });
        this.f12666G = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.Q
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.n0(this.f12654g);
            }
        });
        this.f12667H = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.S
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.Y(this.f12655g);
            }
        });
        this.f12668I = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.T
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.S(this.f12656g);
            }
        });
        this.f12669J = AbstractC2746i.b(new InterfaceC3487a() { // from class: Y2.U
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return W.w(this.f12657g);
            }
        });
    }

    private final d0 A(com.facebook.imagepipeline.request.b bVar) {
        d0 d0VarO;
        if (!C2768b.d()) {
            Uri sourceUri = bVar.getSourceUri();
            AbstractC2855l.f(sourceUri, "getSourceUri(...)");
            if (sourceUri == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int sourceUriType = bVar.getSourceUriType();
            if (sourceUriType == 0) {
                return O();
            }
            switch (sourceUriType) {
                case 2:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : N();
                case 3:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : K();
                case 4:
                    return bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ() ? M() : C2393a.c(this.f12670a.getType(sourceUri)) ? N() : I();
                case 5:
                    return H();
                case 6:
                    return L();
                case 7:
                    return D();
                case 8:
                    return R();
                default:
                    Set set = this.f12684o;
                    if (set != null) {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            android.support.v4.media.session.b.a(it.next());
                            throw null;
                        }
                    }
                    throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f12659K.c(sourceUri));
            }
        }
        C2768b.a("ProducerSequenceFactory#getBasicDecodedImageSequence");
        try {
            Uri sourceUri2 = bVar.getSourceUri();
            AbstractC2855l.f(sourceUri2, "getSourceUri(...)");
            if (sourceUri2 == null) {
                throw new IllegalStateException("Uri is null.");
            }
            int sourceUriType2 = bVar.getSourceUriType();
            if (sourceUriType2 != 0) {
                switch (sourceUriType2) {
                    case 2:
                        if (bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            d0 d0VarM = M();
                            C2768b.b();
                            return d0VarM;
                        }
                        d0VarO = N();
                        break;
                    case 3:
                        if (bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            d0 d0VarM2 = M();
                            C2768b.b();
                            return d0VarM2;
                        }
                        d0VarO = K();
                        break;
                    case 4:
                        if (bVar.getLoadThumbnailOnlyForAndroidSdkAboveQ()) {
                            d0 d0VarM3 = M();
                            C2768b.b();
                            return d0VarM3;
                        }
                        if (C2393a.c(this.f12670a.getType(sourceUri2))) {
                            d0 d0VarN = N();
                            C2768b.b();
                            return d0VarN;
                        }
                        d0VarO = I();
                        break;
                    case 5:
                        d0VarO = H();
                        break;
                    case 6:
                        d0VarO = L();
                        break;
                    case 7:
                        d0VarO = D();
                        break;
                    case 8:
                        d0VarO = R();
                        break;
                    default:
                        Set set2 = this.f12684o;
                        if (set2 != null) {
                            Iterator it2 = set2.iterator();
                            if (it2.hasNext()) {
                                android.support.v4.media.session.b.a(it2.next());
                                throw null;
                            }
                        }
                        throw new IllegalArgumentException("Unsupported uri scheme! Uri is: " + f12659K.c(sourceUri2));
                }
            } else {
                d0VarO = O();
            }
            C2768b.b();
            return d0VarO;
        } catch (Throwable th) {
            C2768b.b();
            throw th;
        }
    }

    private final synchronized d0 B(d0 d0Var) {
        d0 d0VarF;
        d0VarF = (d0) this.f12687r.get(d0Var);
        if (d0VarF == null) {
            d0VarF = this.f12671b.f(d0Var);
            this.f12687r.put(d0Var, d0VarF);
        }
        return d0VarF;
    }

    private final synchronized d0 F(d0 d0Var) {
        C1982s c1982sK;
        c1982sK = this.f12671b.k(d0Var);
        AbstractC2855l.f(c1982sK, "newDelayProducer(...)");
        return c1982sK;
    }

    private final synchronized d0 Q(d0 d0Var) {
        d0 d0VarA;
        d0VarA = (d0) this.f12685p.get(d0Var);
        if (d0VarA == null) {
            b0 b0VarB = this.f12671b.B(d0Var);
            AbstractC2855l.f(b0VarB, "newPostprocessorProducer(...)");
            d0VarA = this.f12671b.A(b0VarB);
            this.f12685p.put(d0Var, d0VarA);
        }
        return d0VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 S(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        com.facebook.imagepipeline.producers.H hQ = this$0.f12671b.q();
        AbstractC2855l.f(hQ, "newLocalAssetFetchProducer(...)");
        return this$0.g0(hQ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 T(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return new j0(this$0.x());
        }
        C2768b.a("ProducerSequenceFactory#getLocalContentUriFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.x());
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 U(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        com.facebook.imagepipeline.producers.I iR = this$0.f12671b.r();
        AbstractC2855l.f(iR, "newLocalContentUriFetchProducer(...)");
        return this$0.h0(iR, new u0[]{this$0.f12671b.s(), this$0.f12671b.t()});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 V(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return new j0(this$0.y());
        }
        C2768b.a("ProducerSequenceFactory#getLocalFileFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.y());
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 W(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return this$0.f12671b.E(this$0.y());
        }
        C2768b.a("ProducerSequenceFactory#getLocalFileFetchToEncodedMemoryPrefetchSequence:init");
        try {
            return this$0.f12671b.E(this$0.y());
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 X(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        com.facebook.imagepipeline.producers.M mU = this$0.f12671b.u();
        AbstractC2855l.f(mU, "newLocalFileFetchProducer(...)");
        return this$0.g0(mU);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 Y(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        com.facebook.imagepipeline.producers.N nV = this$0.f12671b.v();
        AbstractC2855l.f(nV, "newLocalResourceFetchProducer(...)");
        return this$0.g0(nV);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 Z(W this$0) throws Throwable {
        AbstractC2855l.g(this$0, "this$0");
        if (Build.VERSION.SDK_INT < 29) {
            throw new Throwable("Unreachable exception. Just to make linter happy for the lazy block.");
        }
        com.facebook.imagepipeline.producers.S sW = this$0.f12671b.w();
        AbstractC2855l.f(sW, "newLocalThumbnailBitmapSdk29Producer(...)");
        return this$0.e0(sW);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 a0(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        com.facebook.imagepipeline.producers.T tX = this$0.f12671b.x();
        AbstractC2855l.f(tX, "newLocalVideoThumbnailProducer(...)");
        return this$0.e0(tX);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 b0(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return new j0(this$0.z());
        }
        C2768b.a("ProducerSequenceFactory#getNetworkFetchEncodedImageProducerSequence:init");
        try {
            return new j0(this$0.z());
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 c0(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return this$0.f0(this$0.C());
        }
        C2768b.a("ProducerSequenceFactory#getNetworkFetchSequence:init");
        try {
            return this$0.f0(this$0.C());
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 d0(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return this$0.f12671b.E(this$0.z());
        }
        C2768b.a("ProducerSequenceFactory#getNetworkFetchToEncodedMemoryPrefetchSequence");
        try {
            return this$0.f12671b.E(this$0.z());
        } finally {
            C2768b.b();
        }
    }

    private final d0 e0(d0 d0Var) {
        C1973i c1973iE = this.f12671b.e(d0Var);
        AbstractC2855l.f(c1973iE, "newBitmapMemoryCacheProducer(...)");
        C1972h c1972hD = this.f12671b.d(c1973iE);
        AbstractC2855l.f(c1972hD, "newBitmapMemoryCacheKeyMultiplexProducer(...)");
        d0 d0VarB = this.f12671b.b(c1972hD, this.f12675f);
        AbstractC2855l.f(d0VarB, "newBackgroundThreadHandoffProducer(...)");
        if (!this.f12681l && !this.f12682m) {
            C1971g c1971gC = this.f12671b.c(d0VarB);
            AbstractC2855l.f(c1971gC, "newBitmapMemoryCacheGetProducer(...)");
            return c1971gC;
        }
        C1971g c1971gC2 = this.f12671b.c(d0VarB);
        AbstractC2855l.f(c1971gC2, "newBitmapMemoryCacheGetProducer(...)");
        C1975k c1975kG = this.f12671b.g(c1971gC2);
        AbstractC2855l.f(c1975kG, "newBitmapProbeProducer(...)");
        return c1975kG;
    }

    private final d0 g0(d0 d0Var) {
        return h0(d0Var, new u0[]{this.f12671b.t()});
    }

    private final d0 h0(d0 d0Var, u0[] u0VarArr) {
        return f0(m0(k0(d0Var), u0VarArr));
    }

    private final d0 j0(d0 d0Var) {
        C1986w c1986wM;
        C1986w c1986wM2;
        if (!C2768b.d()) {
            if (this.f12678i) {
                Y yZ = this.f12671b.z(d0Var);
                AbstractC2855l.f(yZ, "newPartialDiskCacheProducer(...)");
                c1986wM2 = this.f12671b.m(yZ);
            } else {
                c1986wM2 = this.f12671b.m(d0Var);
            }
            AbstractC2855l.d(c1986wM2);
            C1985v c1985vL = this.f12671b.l(c1986wM2);
            AbstractC2855l.f(c1985vL, "newDiskCacheReadProducer(...)");
            return c1985vL;
        }
        C2768b.a("ProducerSequenceFactory#newDiskCacheSequence");
        try {
            if (this.f12678i) {
                Y yZ2 = this.f12671b.z(d0Var);
                AbstractC2855l.f(yZ2, "newPartialDiskCacheProducer(...)");
                c1986wM = this.f12671b.m(yZ2);
            } else {
                c1986wM = this.f12671b.m(d0Var);
            }
            AbstractC2855l.d(c1986wM);
            C1985v c1985vL2 = this.f12671b.l(c1986wM);
            AbstractC2855l.f(c1985vL2, "newDiskCacheReadProducer(...)");
            C2768b.b();
            return c1985vL2;
        } catch (Throwable th) {
            C2768b.b();
            throw th;
        }
    }

    private final d0 k0(d0 d0Var) {
        if (this.f12679j) {
            d0Var = j0(d0Var);
        }
        d0 d0VarO = this.f12671b.o(d0Var);
        AbstractC2855l.f(d0VarO, "newEncodedMemoryCacheProducer(...)");
        if (!this.f12682m) {
            C1988y c1988yN = this.f12671b.n(d0VarO);
            AbstractC2855l.f(c1988yN, "newEncodedCacheKeyMultiplexProducer(...)");
            return c1988yN;
        }
        com.facebook.imagepipeline.producers.A aP = this.f12671b.p(d0VarO);
        AbstractC2855l.f(aP, "newEncodedProbeProducer(...)");
        C1988y c1988yN2 = this.f12671b.n(aP);
        AbstractC2855l.f(c1988yN2, "newEncodedCacheKeyMultiplexProducer(...)");
        return c1988yN2;
    }

    private final d0 l0(u0[] u0VarArr) {
        t0 t0VarG = this.f12671b.G(u0VarArr);
        AbstractC2855l.f(t0VarG, "newThumbnailBranchProducer(...)");
        k0 k0VarD = this.f12671b.D(t0VarG, true, this.f12680k);
        AbstractC2855l.f(k0VarD, "newResizeAndRotateProducer(...)");
        return k0VarD;
    }

    private final d0 m0(d0 d0Var, u0[] u0VarArr) {
        C1965a c1965aA = C.a(d0Var);
        AbstractC2855l.f(c1965aA, "newAddImageTransformMetaDataProducer(...)");
        r0 r0VarF = this.f12671b.F(this.f12671b.D(c1965aA, true, this.f12680k));
        AbstractC2855l.f(r0VarF, "newThrottlingProducer(...)");
        C1976l c1976lH = C.h(l0(u0VarArr), r0VarF);
        AbstractC2855l.f(c1976lH, "newBranchOnSeparateImagesProducer(...)");
        return c1976lH;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 n0(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        i0 i0VarC = this$0.f12671b.C();
        AbstractC2855l.f(i0VarC, "newQualifiedResourceFetchProducer(...)");
        return this$0.g0(i0VarC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 s(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            com.facebook.imagepipeline.producers.I iR = this$0.f12671b.r();
            AbstractC2855l.f(iR, "newLocalContentUriFetchProducer(...)");
            return this$0.f12671b.b(this$0.k0(iR), this$0.f12675f);
        }
        C2768b.a("ProducerSequenceFactory#getBackgroundLocalContentUriFetchToEncodeMemorySequence:init");
        try {
            com.facebook.imagepipeline.producers.I iR2 = this$0.f12671b.r();
            AbstractC2855l.f(iR2, "newLocalContentUriFetchProducer(...)");
            return this$0.f12671b.b(this$0.k0(iR2), this$0.f12675f);
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 t(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            com.facebook.imagepipeline.producers.M mU = this$0.f12671b.u();
            AbstractC2855l.f(mU, "newLocalFileFetchProducer(...)");
            return this$0.f12671b.b(this$0.k0(mU), this$0.f12675f);
        }
        C2768b.a("ProducerSequenceFactory#getBackgroundLocalFileFetchToEncodeMemorySequence");
        try {
            com.facebook.imagepipeline.producers.M mU2 = this$0.f12671b.u();
            AbstractC2855l.f(mU2, "newLocalFileFetchProducer(...)");
            return this$0.f12671b.b(this$0.k0(mU2), this$0.f12675f);
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 u(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return this$0.f12671b.b(this$0.C(), this$0.f12675f);
        }
        C2768b.a("ProducerSequenceFactory#getBackgroundNetworkFetchToEncodedMemorySequence:init");
        try {
            return this$0.f12671b.b(this$0.C(), this$0.f12675f);
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 v(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        if (!C2768b.d()) {
            return this$0.i0(this$0.f12672c);
        }
        C2768b.a("ProducerSequenceFactory#getCommonNetworkFetchToEncodedMemorySequence");
        try {
            return this$0.i0(this$0.f12672c);
        } finally {
            C2768b.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 w(W this$0) {
        AbstractC2855l.g(this$0, "this$0");
        C1979o c1979oI = this$0.f12671b.i();
        AbstractC2855l.f(c1979oI, "newDataFetchProducer(...)");
        return this$0.f0(this$0.f12671b.D(C.a(c1979oI), true, this$0.f12680k));
    }

    public final d0 C() {
        return (d0) this.f12694y.getValue();
    }

    public final d0 D() {
        return (d0) this.f12669J.getValue();
    }

    public final d0 E(com.facebook.imagepipeline.request.b imageRequest) {
        AbstractC2855l.g(imageRequest, "imageRequest");
        if (!C2768b.d()) {
            d0 d0VarA = A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                d0VarA = Q(d0VarA);
            }
            if (this.f12677h) {
                d0VarA = B(d0VarA);
            }
            return (!this.f12683n || imageRequest.getDelayMs() <= 0) ? d0VarA : F(d0VarA);
        }
        C2768b.a("ProducerSequenceFactory#getDecodedImageProducerSequence");
        try {
            d0 d0VarA2 = A(imageRequest);
            if (imageRequest.getPostprocessor() != null) {
                d0VarA2 = Q(d0VarA2);
            }
            if (this.f12677h) {
                d0VarA2 = B(d0VarA2);
            }
            if (this.f12683n && imageRequest.getDelayMs() > 0) {
                d0VarA2 = F(d0VarA2);
            }
            C2768b.b();
            return d0VarA2;
        } catch (Throwable th) {
            C2768b.b();
            throw th;
        }
    }

    public final d0 G(com.facebook.imagepipeline.request.b imageRequest) {
        AbstractC2855l.g(imageRequest, "imageRequest");
        a aVar = f12659K;
        aVar.d(imageRequest);
        int sourceUriType = imageRequest.getSourceUriType();
        if (sourceUriType == 0) {
            return P();
        }
        if (sourceUriType == 2 || sourceUriType == 3) {
            return J();
        }
        Uri sourceUri = imageRequest.getSourceUri();
        AbstractC2855l.f(sourceUri, "getSourceUri(...)");
        throw new IllegalArgumentException("Unsupported uri scheme for encoded image fetch! Uri is: " + aVar.c(sourceUri));
    }

    public final d0 H() {
        return (d0) this.f12668I.getValue();
    }

    public final d0 I() {
        return (d0) this.f12664E.getValue();
    }

    public final d0 J() {
        Object value = this.f12695z.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 K() {
        return (d0) this.f12662C.getValue();
    }

    public final d0 L() {
        return (d0) this.f12667H.getValue();
    }

    public final d0 M() {
        return (d0) this.f12665F.getValue();
    }

    public final d0 N() {
        return (d0) this.f12663D.getValue();
    }

    public final d0 O() {
        return (d0) this.f12691v.getValue();
    }

    public final d0 P() {
        Object value = this.f12693x.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 R() {
        return (d0) this.f12666G.getValue();
    }

    public final d0 f0(d0 inputProducer) {
        AbstractC2855l.g(inputProducer, "inputProducer");
        if (!C2768b.d()) {
            C1980p c1980pJ = this.f12671b.j(inputProducer);
            AbstractC2855l.f(c1980pJ, "newDecodeProducer(...)");
            return e0(c1980pJ);
        }
        C2768b.a("ProducerSequenceFactory#newBitmapCacheGetToDecodeSequence");
        try {
            C1980p c1980pJ2 = this.f12671b.j(inputProducer);
            AbstractC2855l.f(c1980pJ2, "newDecodeProducer(...)");
            return e0(c1980pJ2);
        } finally {
            C2768b.b();
        }
    }

    public final synchronized d0 i0(X networkFetcher) {
        try {
            AbstractC2855l.g(networkFetcher, "networkFetcher");
            boolean z10 = false;
            if (!C2768b.d()) {
                d0 d0VarY = this.f12671b.y(networkFetcher);
                AbstractC2855l.f(d0VarY, "newNetworkFetchProducer(...)");
                C1965a c1965aA = C.a(k0(d0VarY));
                AbstractC2855l.f(c1965aA, "newAddImageTransformMetaDataProducer(...)");
                C c10 = this.f12671b;
                if (this.f12673d && this.f12676g != EnumC1528n.f12734i) {
                    z10 = true;
                }
                return c10.D(c1965aA, z10, this.f12680k);
            }
            C2768b.a("ProducerSequenceFactory#createCommonNetworkFetchToEncodedMemorySequence");
            try {
                d0 d0VarY2 = this.f12671b.y(networkFetcher);
                AbstractC2855l.f(d0VarY2, "newNetworkFetchProducer(...)");
                C1965a c1965aA2 = C.a(k0(d0VarY2));
                AbstractC2855l.f(c1965aA2, "newAddImageTransformMetaDataProducer(...)");
                C c11 = this.f12671b;
                if (this.f12673d && this.f12676g != EnumC1528n.f12734i) {
                    z10 = true;
                }
                k0 k0VarD = c11.D(c1965aA2, z10, this.f12680k);
                C2768b.b();
                return k0VarD;
            } catch (Throwable th) {
                C2768b.b();
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final d0 x() {
        Object value = this.f12661B.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 y() {
        Object value = this.f12660A.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (d0) value;
    }

    public final d0 z() {
        Object value = this.f12692w.getValue();
        AbstractC2855l.f(value, "getValue(...)");
        return (d0) value;
    }
}
