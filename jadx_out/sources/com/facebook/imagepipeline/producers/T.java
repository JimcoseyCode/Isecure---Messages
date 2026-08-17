package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import g2.AbstractC2662a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class T implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ContentResolver f20002b;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends m0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ g0 f20003l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ e0 f20004m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.b f20005n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1978n interfaceC1978n, g0 g0Var, e0 e0Var, String str, g0 g0Var2, e0 e0Var2, com.facebook.imagepipeline.request.b bVar) {
            super(interfaceC1978n, g0Var, e0Var, str);
            this.f20003l = g0Var2;
            this.f20004m = e0Var2;
            this.f20005n = bVar;
        }

        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        protected void e(Exception exc) {
            super.e(exc);
            this.f20003l.c(this.f20004m, "VideoThumbnailProducer", false);
            this.f20004m.r("local", "video");
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
        public AbstractC2662a c() throws Throwable {
            String strI;
            try {
                strI = T.this.i(this.f20005n);
            } catch (IllegalArgumentException unused) {
                strI = null;
            }
            Bitmap bitmapCreateVideoThumbnail = strI != null ? ThumbnailUtils.createVideoThumbnail(strI, T.g(this.f20005n)) : null;
            if (bitmapCreateVideoThumbnail == null) {
                bitmapCreateVideoThumbnail = T.h(T.this.f20002b, this.f20005n.getSourceUri());
            }
            if (bitmapCreateVideoThumbnail == null) {
                return null;
            }
            d3.f fVarM0 = d3.f.m0(bitmapCreateVideoThumbnail, V2.f.a(), d3.o.f25593d, 0);
            this.f20004m.J("image_format", "thumbnail");
            fVarM0.s(this.f20004m.getExtras());
            return AbstractC2662a.g0(fVarM0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0, a2.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void f(AbstractC2662a abstractC2662a) {
            super.f(abstractC2662a);
            this.f20003l.c(this.f20004m, "VideoThumbnailProducer", abstractC2662a != null);
            this.f20004m.r("local", "video");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f20007a;

        b(m0 m0Var) {
            this.f20007a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f20007a.a();
        }
    }

    public T(Executor executor, ContentResolver contentResolver) {
        this.f20001a = executor;
        this.f20002b = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(com.facebook.imagepipeline.request.b bVar) {
        return (bVar.getPreferredWidth() > 96 || bVar.getPreferredHeight() > 96) ? 1 : 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap h(ContentResolver contentResolver, Uri uri) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2 = null;
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(uri, "r");
            c2.k.g(parcelFileDescriptorOpenFileDescriptor);
            mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(-1L);
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
                return frameAtTime;
            } catch (FileNotFoundException unused2) {
                if (mediaMetadataRetriever != null) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                mediaMetadataRetriever2 = mediaMetadataRetriever;
                if (mediaMetadataRetriever2 != null) {
                    try {
                        mediaMetadataRetriever2.release();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused5) {
            mediaMetadataRetriever = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String i(com.facebook.imagepipeline.request.b bVar) {
        return k2.f.e(this.f20002b, bVar.getSourceUri());
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        e0Var.r("local", "video");
        a aVar = new a(interfaceC1978n, g0VarW, e0Var, "VideoThumbnailProducer", g0VarW, e0Var, bVarE);
        e0Var.k(new b(aVar));
        this.f20001a.execute(aVar);
    }
}
