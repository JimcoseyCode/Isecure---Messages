package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import e2.C2393a;
import g2.AbstractC2662a;
import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class S implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f19992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f19993b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends m0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g0 f19994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ e0 f19995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.b f19996n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ CancellationSignal f19997o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1978n interfaceC1978n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, com.facebook.imagepipeline.request.b bVar, CancellationSignal cancellationSignal) {
            super(interfaceC1978n, g0Var, e0Var, str);
            this.f19994l = g0Var2;
            this.f19995m = e0Var2;
            this.f19996n = bVar;
            this.f19997o = cancellationSignal;
        }

        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        protected void d() {
            super.d();
            this.f19997o.cancel();
        }

        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f19994l.c(this.f19995m, "LocalThumbnailBitmapSdk29Producer", false);
            this.f19995m.r("local", "thumbnail_bitmap");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(AbstractC2662a abstractC2662a) {
            AbstractC2662a.B(abstractC2662a);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(AbstractC2662a abstractC2662a) {
            return c2.g.of("createdThumbnail", String.valueOf(abstractC2662a != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public AbstractC2662a c() throws IOException {
            String strE;
            Size size = new Size(this.f19996n.getPreferredWidth(), this.f19996n.getPreferredHeight());
            try {
                strE = S.this.e(this.f19996n);
            } catch (IllegalArgumentException unused) {
                strE = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strE != null ? C2393a.c(C2393a.b(strE)) ? ThumbnailUtils.createVideoThumbnail(new File(strE), size, this.f19997o) : ThumbnailUtils.createImageThumbnail(new File(strE), size, this.f19997o) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = S.this.f19993b.loadThumbnail(this.f19996n.getSourceUri(), size, this.f19997o);
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            d3.f fVarM0 = d3.f.m0(bitmapCreateVideoThumbnail, V2.f.a(), d3.o.f25593d, 0);
            this.f19995m.J("image_format", "thumbnail");
            fVarM0.s(this.f19995m.getExtras());
            return AbstractC2662a.g0(fVarM0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(AbstractC2662a abstractC2662a) {
            super.f(abstractC2662a);
            this.f19994l.c(this.f19995m, "LocalThumbnailBitmapSdk29Producer", abstractC2662a != null);
            this.f19995m.r("local", "thumbnail_bitmap");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f19999a;

        b(m0 m0Var) {
            this.f19999a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f19999a.a();
        }
    }

    public S(Executor executor, ContentResolver contentResolver) {
        this.f19992a = executor;
        this.f19993b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String e(com.facebook.imagepipeline.request.b bVar) {
        return k2.f.e(this.f19993b, bVar.getSourceUri());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        e0Var.r("local", "thumbnail_bitmap");
        a aVar = new a(interfaceC1978n, g0VarW, e0Var, "LocalThumbnailBitmapSdk29Producer", g0VarW, e0Var, bVarE, new CancellationSignal());
        e0Var.k(new b(aVar));
        this.f19992a.execute(aVar);
    }
}
