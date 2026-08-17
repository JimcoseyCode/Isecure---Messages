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
import android.util.DisplayMetrics;
import com.canhub.cropper.d;
import i7.AbstractC2753p;
import i7.C2735B;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: com.canhub.cropper.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1957b implements N {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f19572g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f19573h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19574i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f19575j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final WeakReference f19576k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private A0 f19577l;

    /* JADX INFO: renamed from: com.canhub.cropper.b$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f19578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f19579b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19580c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f19581d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f19582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f19583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Exception f19584g;

        public a(Uri uri, Bitmap bitmap, int i10, int i11, boolean z10, boolean z11, Exception exc) {
            AbstractC2855l.g(uri, "uri");
            this.f19578a = uri;
            this.f19579b = bitmap;
            this.f19580c = i10;
            this.f19581d = i11;
            this.f19582e = z10;
            this.f19583f = z11;
            this.f19584g = exc;
        }

        public final Bitmap a() {
            return this.f19579b;
        }

        public final int b() {
            return this.f19581d;
        }

        public final Exception c() {
            return this.f19584g;
        }

        public final boolean d() {
            return this.f19582e;
        }

        public final boolean e() {
            return this.f19583f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f19578a, aVar.f19578a) && AbstractC2855l.b(this.f19579b, aVar.f19579b) && this.f19580c == aVar.f19580c && this.f19581d == aVar.f19581d && this.f19582e == aVar.f19582e && this.f19583f == aVar.f19583f && AbstractC2855l.b(this.f19584g, aVar.f19584g);
        }

        public final int f() {
            return this.f19580c;
        }

        public final Uri g() {
            return this.f19578a;
        }

        public int hashCode() {
            int iHashCode = this.f19578a.hashCode() * 31;
            Bitmap bitmap = this.f19579b;
            int iHashCode2 = (((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + Integer.hashCode(this.f19580c)) * 31) + Integer.hashCode(this.f19581d)) * 31) + Boolean.hashCode(this.f19582e)) * 31) + Boolean.hashCode(this.f19583f)) * 31;
            Exception exc = this.f19584g;
            return iHashCode2 + (exc != null ? exc.hashCode() : 0);
        }

        public String toString() {
            return "Result(uri=" + this.f19578a + ", bitmap=" + this.f19579b + ", loadSampleSize=" + this.f19580c + ", degreesRotated=" + this.f19581d + ", flipHorizontally=" + this.f19582e + ", flipVertically=" + this.f19583f + ", error=" + this.f19584g + ")";
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class C0208b extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19585g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f19586h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ a f19588j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0208b(a aVar, n7.f fVar) {
            super(2, fVar);
            this.f19588j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            C0208b c0208b = C1957b.this.new C0208b(this.f19588j, fVar);
            c0208b.f19586h = obj;
            return c0208b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((C0208b) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CropImageView cropImageView;
            AbstractC3016b.e();
            if (this.f19585g != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2753p.b(obj);
            N n10 = (N) this.f19586h;
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            if (O.e(n10) && (cropImageView = (CropImageView) C1957b.this.f19576k.get()) != null) {
                a aVar = this.f19588j;
                zVar.f29399g = true;
                cropImageView.l(aVar);
            }
            if (!zVar.f29399g && this.f19588j.a() != null) {
                this.f19588j.a().recycle();
            }
            return C2735B.f28704a;
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.b$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class c extends kotlin.coroutines.jvm.internal.l implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19589g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f19590h;

        c(n7.f fVar) {
            super(2, fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            c cVar = C1957b.this.new c(fVar);
            cVar.f19590h = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((c) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
        
            if (r0.h(r5, r13) == r1) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
        
            if (r14.h(r3, r13) != r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
        
            return r1;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.f19589g;
            try {
            } catch (Exception e10) {
                C1957b c1957b = C1957b.this;
                a aVar = new a(c1957b.g(), null, 0, 0, false, false, e10);
                this.f19589g = 2;
            }
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                N n10 = (N) this.f19590h;
                if (O.e(n10)) {
                    d dVar = d.f19592a;
                    d.a aVarL = dVar.l(C1957b.this.f19572g, C1957b.this.g(), C1957b.this.f19574i, C1957b.this.f19575j);
                    if (O.e(n10)) {
                        d.b bVarF = dVar.F(aVarL.a(), C1957b.this.f19572g, C1957b.this.g());
                        C1957b c1957b2 = C1957b.this;
                        a aVar2 = new a(c1957b2.g(), bVarF.a(), aVarL.b(), bVarF.b(), bVarF.c(), bVarF.d(), null);
                        this.f19589g = 1;
                    }
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2753p.b(obj);
                    return C2735B.f28704a;
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public C1957b(Context context, CropImageView cropImageView, Uri uri) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(cropImageView, "cropImageView");
        AbstractC2855l.g(uri, "uri");
        this.f19572g = context;
        this.f19573h = uri;
        this.f19576k = new WeakReference(cropImageView);
        this.f19577l = E0.b(null, 1, null);
        DisplayMetrics displayMetrics = cropImageView.getResources().getDisplayMetrics();
        float f10 = displayMetrics.density;
        double d10 = f10 > 1.0f ? 1.0d / ((double) f10) : 1.0d;
        this.f19574i = (int) (((double) displayMetrics.widthPixels) * d10);
        this.f19575j = (int) (((double) displayMetrics.heightPixels) * d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(a aVar, n7.f fVar) {
        Object objG = AbstractC1413i.g(C1404d0.c(), new C0208b(aVar, null), fVar);
        return objG == AbstractC3016b.e() ? objG : C2735B.f28704a;
    }

    public final void f() {
        A0.a.a(this.f19577l, null, 1, null);
    }

    public final Uri g() {
        return this.f19573h;
    }

    @Override // R8.N
    public n7.j i() {
        return C1404d0.c().X(this.f19577l);
    }

    public final void j() {
        this.f19577l = AbstractC1417k.d(this, C1404d0.a(), null, new c(null), 2, null);
    }
}
