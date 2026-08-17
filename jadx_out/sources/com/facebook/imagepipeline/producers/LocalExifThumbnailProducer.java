package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.imageutils.JfifUtil;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import d2.AbstractC2325a;
import g2.AbstractC2662a;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class LocalExifThumbnailProducer implements u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f19981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f2.i f19982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f19983c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private class Api24Utils {
        ExifInterface a(FileDescriptor fileDescriptor) {
            return new ExifInterface(fileDescriptor);
        }

        private Api24Utils() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends m0 {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ com.facebook.imagepipeline.request.b f19985l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC1978n interfaceC1978n, g0 g0Var, e0 e0Var, String str, com.facebook.imagepipeline.request.b bVar) {
            super(interfaceC1978n, g0Var, e0Var, str);
            this.f19985l = bVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void b(d3.k kVar) {
            d3.k.k(kVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.imagepipeline.producers.m0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map i(d3.k kVar) {
            return c2.g.of("createdThumbnail", Boolean.toString(kVar != null));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // a2.h
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public d3.k c() {
            ExifInterface exifInterfaceG = LocalExifThumbnailProducer.this.g(this.f19985l.getSourceUri());
            if (exifInterfaceG == null || !exifInterfaceG.hasThumbnail()) {
                return null;
            }
            return LocalExifThumbnailProducer.this.e(LocalExifThumbnailProducer.this.f19982b.b((byte[]) c2.k.g(exifInterfaceG.getThumbnail())), exifInterfaceG);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AbstractC1970f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m0 f19987a;

        b(m0 m0Var) {
            this.f19987a = m0Var;
        }

        @Override // com.facebook.imagepipeline.producers.f0
        public void a() {
            this.f19987a.a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, f2.i iVar, ContentResolver contentResolver) {
        this.f19981a = executor;
        this.f19982b = iVar;
        this.f19983c = contentResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d3.k e(f2.h hVar, ExifInterface exifInterface) {
        Pair<Integer, Integer> pairDecodeDimensions = BitmapUtil.decodeDimensions(new f2.j(hVar));
        int iH = h(exifInterface);
        int iIntValue = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.first).intValue() : -1;
        int iIntValue2 = pairDecodeDimensions != null ? ((Integer) pairDecodeDimensions.second).intValue() : -1;
        AbstractC2662a abstractC2662aG0 = AbstractC2662a.g0(hVar);
        try {
            d3.k kVar = new d3.k(abstractC2662aG0);
            AbstractC2662a.B(abstractC2662aG0);
            kVar.M0(Q2.b.f9065b);
            kVar.N0(iH);
            kVar.Q0(iIntValue);
            kVar.L0(iIntValue2);
            return kVar;
        } catch (Throwable th) {
            AbstractC2662a.B(abstractC2662aG0);
            throw th;
        }
    }

    private int h(ExifInterface exifInterface) {
        return JfifUtil.getAutoRotateAngleFromOrientation(Integer.parseInt((String) c2.k.g(exifInterface.getAttribute("Orientation"))));
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean a(X2.g gVar) {
        return v0.b(IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING, gVar);
    }

    @Override // com.facebook.imagepipeline.producers.d0
    public void b(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        g0 g0VarW = e0Var.W();
        com.facebook.imagepipeline.request.b bVarE = e0Var.e();
        e0Var.r("local", "exif");
        a aVar = new a(interfaceC1978n, g0VarW, e0Var, "LocalExifThumbnailProducer", bVarE);
        e0Var.k(new b(aVar));
        this.f19981a.execute(aVar);
    }

    boolean f(String str) {
        if (str == null) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.canRead();
    }

    ExifInterface g(Uri uri) {
        String strE = k2.f.e(this.f19983c, uri);
        if (strE == null) {
            return null;
        }
        try {
        } catch (IOException unused) {
        } catch (StackOverflowError unused2) {
            AbstractC2325a.i(LocalExifThumbnailProducer.class, "StackOverflowError in ExifInterface constructor");
        }
        if (f(strE)) {
            return new ExifInterface(strE);
        }
        AssetFileDescriptor assetFileDescriptorA = k2.f.a(this.f19983c, uri);
        if (assetFileDescriptorA != null) {
            ExifInterface exifInterfaceA = new Api24Utils().a(assetFileDescriptorA.getFileDescriptor());
            assetFileDescriptorA.close();
            return exifInterfaceA;
        }
        return null;
    }
}
