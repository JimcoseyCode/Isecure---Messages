package com.facebook.imagepipeline.producers;

import Y2.C1515a;
import Y2.EnumC1528n;
import android.graphics.Bitmap;
import android.net.Uri;
import b3.C1802a;
import com.facebook.imagepipeline.producers.C1980p;
import com.facebook.imagepipeline.producers.G;
import com.facebook.imagepipeline.request.b;
import com.facebook.imageutils.BitmapUtil;
import d2.AbstractC2325a;
import f2.InterfaceC2600a;
import g2.AbstractC2662a;
import i7.C2735B;
import j3.C2768b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k2.C2823a;
import k3.C2827a;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1980p implements d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f20153m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC2600a f20154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f20155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b3.c f20156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b3.e f20157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EnumC1528n f20158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f20159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d0 f20161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f20162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final C1515a f20163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f20164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c2.n f20165l;

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean b(d3.k kVar, X2.d dVar) {
            return (((long) kVar.getWidth()) * ((long) kVar.getHeight())) * ((long) BitmapUtil.getPixelSizeForBitmapConfig(dVar.f12421h)) > 104857600;
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class b extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ C1980p f20166k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C1980p c1980p, InterfaceC1978n consumer, e0 producerContext, boolean z10, int i10) {
            super(c1980p, consumer, producerContext, z10, i10);
            AbstractC2855l.g(consumer, "consumer");
            AbstractC2855l.g(producerContext, "producerContext");
            this.f20166k = c1980p;
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected synchronized boolean I(d3.k kVar, int i10) {
            return AbstractC1967c.e(i10) ? false : super.I(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected int w(d3.k encodedImage) {
            AbstractC2855l.g(encodedImage, "encodedImage");
            return encodedImage.X();
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected d3.p y() {
            d3.p pVarD = d3.o.d(0, false, false);
            AbstractC2855l.f(pVarD, "of(...)");
            return pVarD;
        }
    }

    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private final class c extends d {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final b3.f f20167k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final b3.e f20168l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ C1980p f20169m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C1980p c1980p, InterfaceC1978n consumer, e0 producerContext, b3.f progressiveJpegParser, b3.e progressiveJpegConfig, boolean z10, int i10) {
            super(c1980p, consumer, producerContext, z10, i10);
            AbstractC2855l.g(consumer, "consumer");
            AbstractC2855l.g(producerContext, "producerContext");
            AbstractC2855l.g(progressiveJpegParser, "progressiveJpegParser");
            AbstractC2855l.g(progressiveJpegConfig, "progressiveJpegConfig");
            this.f20169m = c1980p;
            this.f20167k = progressiveJpegParser;
            this.f20168l = progressiveJpegConfig;
            H(0);
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected synchronized boolean I(d3.k kVar, int i10) {
            if (kVar == null) {
                return false;
            }
            try {
                boolean zI = super.I(kVar, i10);
                if (AbstractC1967c.e(i10) || AbstractC1967c.m(i10, 8)) {
                    if (!AbstractC1967c.m(i10, 4) && d3.k.u0(kVar) && kVar.I() == Q2.b.f9065b) {
                        if (!this.f20167k.g(kVar)) {
                            return false;
                        }
                        int iD = this.f20167k.d();
                        if (iD <= x()) {
                            return false;
                        }
                        if (iD < this.f20168l.b(x()) && !this.f20167k.e()) {
                            return false;
                        }
                        H(iD);
                    }
                }
                return zI;
            } catch (Throwable th) {
                throw th;
            }
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected int w(d3.k encodedImage) {
            AbstractC2855l.g(encodedImage, "encodedImage");
            return this.f20167k.c();
        }

        @Override // com.facebook.imagepipeline.producers.C1980p.d
        protected d3.p y() {
            d3.p pVarA = this.f20168l.a(this.f20167k.d());
            AbstractC2855l.f(pVarA, "getQualityInfo(...)");
            return pVarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    abstract class d extends AbstractC1983t {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final e0 f20170c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f20171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g0 f20172e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final X2.d f20173f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f20174g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final G f20175h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f20176i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C1980p f20177j;

        /* JADX INFO: renamed from: com.facebook.imagepipeline.producers.p$d$a */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class a extends AbstractC1970f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f20179b;

            a(boolean z10) {
                this.f20179b = z10;
            }

            @Override // com.facebook.imagepipeline.producers.f0
            public void a() {
                if (this.f20179b) {
                    d.this.z();
                }
            }

            @Override // com.facebook.imagepipeline.producers.AbstractC1970f, com.facebook.imagepipeline.producers.f0
            public void b() {
                if (d.this.f20170c.X()) {
                    d.this.f20175h.h();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(final C1980p c1980p, InterfaceC1978n consumer, e0 producerContext, boolean z10, final int i10) {
            super(consumer);
            AbstractC2855l.g(consumer, "consumer");
            AbstractC2855l.g(producerContext, "producerContext");
            this.f20177j = c1980p;
            this.f20170c = producerContext;
            this.f20171d = "ProgressiveDecoder";
            this.f20172e = producerContext.W();
            X2.d imageDecodeOptions = producerContext.e().getImageDecodeOptions();
            AbstractC2855l.f(imageDecodeOptions, "getImageDecodeOptions(...)");
            this.f20173f = imageDecodeOptions;
            this.f20175h = new G(c1980p.f(), new G.d() { // from class: com.facebook.imagepipeline.producers.q
                @Override // com.facebook.imagepipeline.producers.G.d
                public final void a(d3.k kVar, int i11) throws Throwable {
                    C1980p.d.q(this.f20180a, c1980p, i10, kVar, i11);
                }
            }, imageDecodeOptions.f12414a);
            producerContext.k(new a(z10));
        }

        private final void A(Throwable th) {
            D(true);
            o().onFailure(th);
        }

        private final void B(d3.e eVar, int i10) {
            AbstractC2662a abstractC2662aB = this.f20177j.c().b(eVar);
            try {
                D(AbstractC1967c.d(i10));
                o().c(abstractC2662aB, i10);
            } finally {
                AbstractC2662a.B(abstractC2662aB);
            }
        }

        private final d3.e C(d3.k kVar, int i10, d3.p pVar) {
            boolean z10 = this.f20177j.h() != null && ((Boolean) this.f20177j.i().get()).booleanValue();
            try {
                return this.f20177j.g().a(kVar, i10, pVar, this.f20173f);
            } catch (OutOfMemoryError e10) {
                if (!z10) {
                    throw e10;
                }
                Runnable runnableH = this.f20177j.h();
                if (runnableH != null) {
                    runnableH.run();
                }
                System.gc();
                return this.f20177j.g().a(kVar, i10, pVar, this.f20173f);
            }
        }

        private final void D(boolean z10) {
            synchronized (this) {
                if (z10) {
                    if (!this.f20174g) {
                        o().b(1.0f);
                        this.f20174g = true;
                        C2735B c2735b = C2735B.f28704a;
                        this.f20175h.c();
                    }
                }
            }
        }

        private final void E(d3.k kVar) {
            if (kVar.I() != Q2.b.f9065b) {
                return;
            }
            kVar.O0(C2827a.c(kVar, BitmapUtil.getPixelSizeForBitmapConfig(this.f20173f.f12421h), 104857600));
        }

        private final void G(d3.k kVar, d3.e eVar, int i10) {
            this.f20170c.J("encoded_width", Integer.valueOf(kVar.getWidth()));
            this.f20170c.J("encoded_height", Integer.valueOf(kVar.getHeight()));
            this.f20170c.J("encoded_size", Integer.valueOf(kVar.X()));
            this.f20170c.J("image_color_space", kVar.A());
            if (eVar instanceof d3.d) {
                this.f20170c.J("bitmap_config", String.valueOf(((d3.d) eVar).h0().getConfig()));
            }
            if (eVar != null) {
                eVar.s(this.f20170c.getExtras());
            }
            this.f20170c.J("last_scan_num", Integer.valueOf(i10));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(d this$0, C1980p this$1, int i10, d3.k kVar, int i11) throws Throwable {
            AbstractC2855l.g(this$0, "this$0");
            AbstractC2855l.g(this$1, "this$1");
            if (kVar != null) {
                com.facebook.imagepipeline.request.b bVarE = this$0.f20170c.e();
                this$0.f20170c.J("image_format", kVar.I().a());
                Uri sourceUri = bVarE.getSourceUri();
                kVar.P0(sourceUri != null ? sourceUri.toString() : null);
                EnumC1528n downsampleOverride = bVarE.getDownsampleOverride();
                if (downsampleOverride == null) {
                    downsampleOverride = this$1.e();
                }
                boolean zM = AbstractC1967c.m(i11, 16);
                if ((downsampleOverride == EnumC1528n.f12732g || (downsampleOverride == EnumC1528n.f12733h && !zM)) && (this$1.d() || !k2.f.o(bVarE.getSourceUri()))) {
                    X2.h rotationOptions = bVarE.getRotationOptions();
                    AbstractC2855l.f(rotationOptions, "getRotationOptions(...)");
                    kVar.O0(C2827a.b(rotationOptions, bVarE.getResizeOptions(), kVar, i10));
                }
                if (this$0.f20170c.m().F().i()) {
                    this$0.E(kVar);
                }
                this$0.u(kVar, i11, this$0.f20176i);
            }
        }

        private final void u(d3.k kVar, int i10, int i11) throws Throwable {
            d3.p pVar;
            String str;
            long j10;
            d3.e eVarC;
            int i12 = i10;
            if ((kVar.I() != Q2.b.f9065b && AbstractC1967c.e(i12)) || this.f20174g || !d3.k.u0(kVar)) {
                return;
            }
            if (AbstractC2855l.b(kVar.I(), Q2.b.f9067d) && C1980p.f20153m.b(kVar, this.f20173f)) {
                IllegalStateException illegalStateException = new IllegalStateException("Image is too big to attempt decoding: w = " + kVar.getWidth() + ", h = " + kVar.getHeight() + ", pixel config = " + this.f20173f.f12421h + ", max bitmap size = 104857600");
                this.f20172e.k(this.f20170c, "DecodeProducer", illegalStateException, null);
                A(illegalStateException);
                return;
            }
            Q2.c cVarI = kVar.I();
            AbstractC2855l.f(cVarI, "getImageFormat(...)");
            String strA = cVarI.a();
            String str2 = "unknown";
            String str3 = strA == null ? "unknown" : strA;
            String str4 = kVar.getWidth() + "x" + kVar.getHeight();
            String strValueOf = String.valueOf(kVar.W());
            boolean zD = AbstractC1967c.d(i12);
            boolean z10 = zD && !AbstractC1967c.m(i12, 8);
            boolean zM = AbstractC1967c.m(i12, 4);
            X2.g resizeOptions = this.f20170c.e().getResizeOptions();
            if (resizeOptions != null) {
                str2 = resizeOptions.f12445a + "x" + resizeOptions.f12446b;
            }
            try {
                long jF = this.f20175h.f();
                String string = this.f20170c.e().getSourceUri().toString();
                AbstractC2855l.f(string, "toString(...)");
                int iX = (z10 || zM) ? kVar.X() : w(kVar);
                d3.p pVarY = (z10 || zM) ? d3.o.f25593d : y();
                this.f20172e.e(this.f20170c, "DecodeProducer");
                try {
                    AbstractC2855l.d(pVarY);
                    eVarC = C(kVar, iX, pVarY);
                    try {
                        if (kVar.W() != 1) {
                            i12 |= 16;
                        }
                        this.f20172e.j(this.f20170c, "DecodeProducer", v(eVarC, jF, pVarY, zD, str3, str4, str2, strValueOf));
                        G(kVar, eVarC, i11);
                        B(eVarC, i12);
                        d3.k.k(kVar);
                    } catch (Exception e10) {
                        e = e10;
                        pVar = pVarY;
                        str = str2;
                        j10 = jF;
                        AbstractC2855l.d(pVar);
                        this.f20172e.k(this.f20170c, "DecodeProducer", e, v(eVarC, j10, pVar, zD, str3, str4, str, strValueOf));
                        A(e);
                        d3.k.k(kVar);
                    }
                } catch (C1802a e11) {
                    pVar = pVarY;
                    str = str2;
                    j10 = jF;
                    try {
                        try {
                            d3.k kVarA = e11.a();
                            AbstractC2325a.K(this.f20171d, "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", e11.getMessage(), string, kVarA.B(10), Integer.valueOf(kVarA.X()));
                            throw e11;
                        } catch (Exception e12) {
                            e = e12;
                            eVarC = null;
                            AbstractC2855l.d(pVar);
                            this.f20172e.k(this.f20170c, "DecodeProducer", e, v(eVarC, j10, pVar, zD, str3, str4, str, strValueOf));
                            A(e);
                            d3.k.k(kVar);
                        }
                    } catch (Throwable th) {
                        th = th;
                        d3.k.k(kVar);
                        throw th;
                    }
                } catch (Exception e13) {
                    e = e13;
                    pVar = pVarY;
                    str = str2;
                    j10 = jF;
                    eVarC = null;
                    AbstractC2855l.d(pVar);
                    this.f20172e.k(this.f20170c, "DecodeProducer", e, v(eVarC, j10, pVar, zD, str3, str4, str, strValueOf));
                    A(e);
                    d3.k.k(kVar);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private final Map v(d3.e eVar, long j10, d3.p pVar, boolean z10, String str, String str2, String str3, String str4) {
            Map extras;
            Object obj;
            String string = null;
            if (!this.f20172e.g(this.f20170c, "DecodeProducer")) {
                return null;
            }
            String strValueOf = String.valueOf(j10);
            String strValueOf2 = String.valueOf(pVar.b());
            String strValueOf3 = String.valueOf(z10);
            if (eVar != null && (extras = eVar.getExtras()) != null && (obj = extras.get("non_fatal_decode_error")) != null) {
                string = obj.toString();
            }
            if (!(eVar instanceof d3.f)) {
                String str5 = string;
                HashMap map = new HashMap(7);
                map.put("queueTime", strValueOf);
                map.put("hasGoodQuality", strValueOf2);
                map.put("isFinal", strValueOf3);
                map.put("encodedImageSize", str2);
                map.put("imageFormat", str);
                map.put("requestedImageSize", str3);
                map.put("sampleSize", str4);
                if (str5 != null) {
                    map.put("non_fatal_decode_error", str5);
                }
                return c2.g.a(map);
            }
            String str6 = string;
            Bitmap bitmapH0 = ((d3.f) eVar).h0();
            AbstractC2855l.f(bitmapH0, "getUnderlyingBitmap(...)");
            String str7 = bitmapH0.getWidth() + "x" + bitmapH0.getHeight();
            HashMap map2 = new HashMap(8);
            map2.put("bitmapSize", str7);
            map2.put("queueTime", strValueOf);
            map2.put("hasGoodQuality", strValueOf2);
            map2.put("isFinal", strValueOf3);
            map2.put("encodedImageSize", str2);
            map2.put("imageFormat", str);
            map2.put("requestedImageSize", str3);
            map2.put("sampleSize", str4);
            int byteCount = bitmapH0.getByteCount();
            StringBuilder sb = new StringBuilder();
            sb.append(byteCount);
            map2.put("byteCount", sb.toString());
            if (str6 != null) {
                map2.put("non_fatal_decode_error", str6);
            }
            return c2.g.a(map2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void z() {
            D(true);
            o().a();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1967c
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void h(d3.k kVar, int i10) {
            if (!C2768b.d()) {
                boolean zD = AbstractC1967c.d(i10);
                if (zD) {
                    if (kVar == null) {
                        boolean zB = AbstractC2855l.b(this.f20170c.B("cached_value_found"), Boolean.TRUE);
                        if (!this.f20170c.m().F().h() || this.f20170c.d0() == b.c.FULL_FETCH || zB) {
                            A(new C2823a("Encoded image is null."));
                            return;
                        }
                    } else if (!kVar.t0()) {
                        A(new C2823a("Encoded image is not valid."));
                        return;
                    }
                }
                if (I(kVar, i10)) {
                    boolean zM = AbstractC1967c.m(i10, 4);
                    if (zD || zM || this.f20170c.X()) {
                        this.f20175h.h();
                        return;
                    }
                    return;
                }
                return;
            }
            C2768b.a("DecodeProducer#onNewResultImpl");
            try {
                boolean zD2 = AbstractC1967c.d(i10);
                if (zD2) {
                    if (kVar == null) {
                        boolean zB2 = AbstractC2855l.b(this.f20170c.B("cached_value_found"), Boolean.TRUE);
                        if (this.f20170c.m().F().h()) {
                            if (this.f20170c.d0() != b.c.FULL_FETCH) {
                                if (zB2) {
                                }
                            }
                        }
                        A(new C2823a("Encoded image is null."));
                        C2768b.b();
                        return;
                    }
                    if (!kVar.t0()) {
                        A(new C2823a("Encoded image is not valid."));
                        C2768b.b();
                        return;
                    }
                }
                if (!I(kVar, i10)) {
                    C2768b.b();
                    return;
                }
                boolean zM2 = AbstractC1967c.m(i10, 4);
                if (zD2 || zM2 || this.f20170c.X()) {
                    this.f20175h.h();
                }
                C2735B c2735b = C2735B.f28704a;
                C2768b.b();
            } catch (Throwable th) {
                C2768b.b();
                throw th;
            }
        }

        protected final void H(int i10) {
            this.f20176i = i10;
        }

        protected boolean I(d3.k kVar, int i10) {
            return this.f20175h.k(kVar, i10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        public void f() {
            z();
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        public void g(Throwable t10) {
            AbstractC2855l.g(t10, "t");
            A(t10);
        }

        @Override // com.facebook.imagepipeline.producers.AbstractC1983t, com.facebook.imagepipeline.producers.AbstractC1967c
        protected void i(float f10) {
            super.i(f10 * 0.99f);
        }

        protected abstract int w(d3.k kVar);

        protected final int x() {
            return this.f20176i;
        }

        protected abstract d3.p y();
    }

    public C1980p(InterfaceC2600a byteArrayPool, Executor executor, b3.c imageDecoder, b3.e progressiveJpegConfig, EnumC1528n downsampleMode, boolean z10, boolean z11, d0 inputProducer, int i10, C1515a closeableReferenceFactory, Runnable runnable, c2.n recoverFromDecoderOOM) {
        AbstractC2855l.g(byteArrayPool, "byteArrayPool");
        AbstractC2855l.g(executor, "executor");
        AbstractC2855l.g(imageDecoder, "imageDecoder");
        AbstractC2855l.g(progressiveJpegConfig, "progressiveJpegConfig");
        AbstractC2855l.g(downsampleMode, "downsampleMode");
        AbstractC2855l.g(inputProducer, "inputProducer");
        AbstractC2855l.g(closeableReferenceFactory, "closeableReferenceFactory");
        AbstractC2855l.g(recoverFromDecoderOOM, "recoverFromDecoderOOM");
        this.f20154a = byteArrayPool;
        this.f20155b = executor;
        this.f20156c = imageDecoder;
        this.f20157d = progressiveJpegConfig;
        this.f20158e = downsampleMode;
        this.f20159f = z10;
        this.f20160g = z11;
        this.f20161h = inputProducer;
        this.f20162i = i10;
        this.f20163j = closeableReferenceFactory;
        this.f20164k = runnable;
        this.f20165l = recoverFromDecoderOOM;
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n consumer, e0 context) {
        C1980p c1980p;
        e0 e0Var;
        InterfaceC1978n cVar;
        AbstractC2855l.g(consumer, "consumer");
        AbstractC2855l.g(context, "context");
        if (C2768b.d()) {
            C2768b.a("DecodeProducer#produceResults");
            try {
                com.facebook.imagepipeline.request.b bVarE = context.e();
                this.f20161h.b((k2.f.o(bVarE.getSourceUri()) || com.facebook.imagepipeline.request.c.s(bVarE.getSourceUri())) ? new c(this, consumer, context, new b3.f(this.f20154a), this.f20157d, this.f20160g, this.f20162i) : new b(this, consumer, context, this.f20160g, this.f20162i), context);
                C2735B c2735b = C2735B.f28704a;
                C2768b.b();
                return;
            } catch (Throwable th) {
                C2768b.b();
                throw th;
            }
        }
        com.facebook.imagepipeline.request.b bVarE2 = context.e();
        if (k2.f.o(bVarE2.getSourceUri()) || com.facebook.imagepipeline.request.c.s(bVarE2.getSourceUri())) {
            c1980p = this;
            e0Var = context;
            cVar = new c(c1980p, consumer, e0Var, new b3.f(c1980p.f20154a), c1980p.f20157d, c1980p.f20160g, c1980p.f20162i);
        } else {
            cVar = new b(this, consumer, context, this.f20160g, this.f20162i);
            c1980p = this;
            e0Var = context;
        }
        c1980p.f20161h.b(cVar, e0Var);
    }

    public final C1515a c() {
        return this.f20163j;
    }

    public final boolean d() {
        return this.f20159f;
    }

    public final EnumC1528n e() {
        return this.f20158e;
    }

    public final Executor f() {
        return this.f20155b;
    }

    public final b3.c g() {
        return this.f20156c;
    }

    public final Runnable h() {
        return this.f20164k;
    }

    public final c2.n i() {
        return this.f20165l;
    }
}
