package com.canhub.cropper;

import R8.A0;
import R8.AbstractC1413i;
import R8.AbstractC1417k;
import R8.C1404d0;
import R8.E0;
import R8.N;
import R8.O;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.canhub.cropper.CropImageView;
import com.canhub.cropper.d;
import i7.AbstractC2753p;
import i7.C2735B;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: com.canhub.cropper.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1956a implements N {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f19537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final WeakReference f19538h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f19539i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Bitmap f19540j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final float[] f19541k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f19542l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f19543m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f19544n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f19545o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f19546p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final int f19547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f19548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int f19549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f19550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f19551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final CropImageView.k f19552v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Bitmap.CompressFormat f19553w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f19554x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Uri f19555y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private A0 f19556z;

    /* JADX INFO: renamed from: com.canhub.cropper.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0206a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f19557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Uri f19558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Exception f19559c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f19560d;

        public C0206a(Bitmap bitmap, Uri uri, Exception exc, int i10) {
            this.f19557a = bitmap;
            this.f19558b = uri;
            this.f19559c = exc;
            this.f19560d = i10;
        }

        public final Bitmap a() {
            return this.f19557a;
        }

        public final Exception b() {
            return this.f19559c;
        }

        public final int c() {
            return this.f19560d;
        }

        public final Uri d() {
            return this.f19558b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0206a)) {
                return false;
            }
            C0206a c0206a = (C0206a) obj;
            return AbstractC2855l.b(this.f19557a, c0206a.f19557a) && AbstractC2855l.b(this.f19558b, c0206a.f19558b) && AbstractC2855l.b(this.f19559c, c0206a.f19559c) && this.f19560d == c0206a.f19560d;
        }

        public int hashCode() {
            Bitmap bitmap = this.f19557a;
            int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
            Uri uri = this.f19558b;
            int iHashCode2 = (iHashCode + (uri == null ? 0 : uri.hashCode())) * 31;
            Exception exc = this.f19559c;
            return ((iHashCode2 + (exc != null ? exc.hashCode() : 0)) * 31) + Integer.hashCode(this.f19560d);
        }

        public String toString() {
            return "Result(bitmap=" + this.f19557a + ", uri=" + this.f19558b + ", error=" + this.f19559c + ", sampleSize=" + this.f19560d + ")";
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.a$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19561g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f19562h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ C0206a f19564j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C0206a c0206a, n7.f fVar) {
            super(2, fVar);
            this.f19564j = c0206a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            b bVar = C1956a.this.new b(this.f19564j, fVar);
            bVar.f19562h = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((b) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            AbstractC3016b.e();
            if (this.f19561g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.f19562h;
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            if (O.e(n10) && (cropImageView = (CropImageView) C1956a.this.f19538h.get()) != null) {
                C0206a c0206a = this.f19564j;
                zVar.f29399g = true;
                cropImageView.k(c0206a);
            }
            if (!zVar.f29399g && this.f19564j.a() != null) {
                this.f19564j.a().recycle();
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.a$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19565g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f19566h;

        /* JADX INFO: renamed from: com.canhub.cropper.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        static final class C0207a extends kotlin.coroutines.jvm.internal.l implements Function2 {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f19568g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ C1956a f19569h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Bitmap f19570i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ d.a f19571j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0207a(C1956a c1956a, Bitmap bitmap, d.a aVar, n7.f fVar) {
                super(2, fVar);
                this.f19569h = c1956a;
                this.f19570i = bitmap;
                this.f19571j = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final n7.f create(Object obj, n7.f fVar) {
                return new C0207a(this.f19569h, this.f19570i, this.f19571j, fVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(N n10, n7.f fVar) {
                return ((C0207a) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC3016b.e();
                int i10 = this.f19568g;
                if (i10 == 0) {
                    AbstractC2753p.b(obj);
                    Uri uriK = d.f19592a.K(this.f19569h.f19537g, this.f19570i, this.f19569h.f19553w, this.f19569h.f19554x, this.f19569h.f19555y);
                    C1956a c1956a = this.f19569h;
                    C0206a c0206a = new C0206a(this.f19570i, uriK, null, this.f19571j.b());
                    this.f19568g = 1;
                    if (c1956a.w(c0206a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                }
                return C2735B.f28704a;
            }
        }

        c(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            c cVar = C1956a.this.new c(fVar);
            cVar.f19566h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((c) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x011e, code lost:
        
            if (r6.w(r7, r21) != r2) goto L31;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            d.a aVarG;
            Object objE = AbstractC3016b.e();
            int i10 = this.f19565g;
            try {
            } catch (Exception e10) {
                C1956a c1956a = C1956a.this;
                C0206a c0206a = new C0206a(null, null, e10, 1);
                this.f19565g = 2;
            }
            if (i10 != 0) {
                if (i10 == 1) {
                    AbstractC2753p.b(obj);
                    return C2735B.f28704a;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.f19566h;
            if (O.e(n10)) {
                if (C1956a.this.f19539i != null) {
                    aVarG = d.f19592a.d(C1956a.this.f19537g, C1956a.this.f19539i, C1956a.this.f19541k, C1956a.this.f19542l, C1956a.this.f19543m, C1956a.this.f19544n, C1956a.this.f19545o, C1956a.this.f19546p, C1956a.this.f19547q, C1956a.this.f19548r, C1956a.this.f19549s, C1956a.this.f19550t, C1956a.this.f19551u);
                } else {
                    if (C1956a.this.f19540j == null) {
                        C1956a c1956a2 = C1956a.this;
                        C0206a c0206a2 = new C0206a(null, null, null, 1);
                        this.f19565g = 1;
                        if (c1956a2.w(c0206a2, this) == objE) {
                            return objE;
                        }
                        return C2735B.f28704a;
                    }
                    aVarG = d.f19592a.g(C1956a.this.f19540j, C1956a.this.f19541k, C1956a.this.f19542l, C1956a.this.f19545o, C1956a.this.f19546p, C1956a.this.f19547q, C1956a.this.f19550t, C1956a.this.f19551u);
                }
                AbstractC1417k.d(n10, C1404d0.b(), null, new C0207a(C1956a.this, d.f19592a.G(aVarG.a(), C1956a.this.f19548r, C1956a.this.f19549s, C1956a.this.f19552v), aVarG, null), 2, null);
            }
            return C2735B.f28704a;
        }
    }

    public C1956a(Context context, WeakReference cropImageViewReference, Uri uri, Bitmap bitmap, float[] cropPoints, int i10, int i11, int i12, boolean z10, int i13, int i14, int i15, int i16, boolean z11, boolean z12, CropImageView.k options, Bitmap.CompressFormat saveCompressFormat, int i17, Uri uri2) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(cropImageViewReference, "cropImageViewReference");
        AbstractC2855l.g(cropPoints, "cropPoints");
        AbstractC2855l.g(options, "options");
        AbstractC2855l.g(saveCompressFormat, "saveCompressFormat");
        this.f19537g = context;
        this.f19538h = cropImageViewReference;
        this.f19539i = uri;
        this.f19540j = bitmap;
        this.f19541k = cropPoints;
        this.f19542l = i10;
        this.f19543m = i11;
        this.f19544n = i12;
        this.f19545o = z10;
        this.f19546p = i13;
        this.f19547q = i14;
        this.f19548r = i15;
        this.f19549s = i16;
        this.f19550t = z11;
        this.f19551u = z12;
        this.f19552v = options;
        this.f19553w = saveCompressFormat;
        this.f19554x = i17;
        this.f19555y = uri2;
        this.f19556z = E0.b(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(C0206a c0206a, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.c(), new b(c0206a, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    @Override // R8.N
    public n7.j i() {
        return C1404d0.c().X(this.f19556z);
    }

    public final void v() {
        A0.a.a(this.f19556z, null, 1, null);
    }

    public final void x() {
        this.f19556z = AbstractC1417k.d(this, C1404d0.a(), null, new c(null), 2, null);
    }
}
