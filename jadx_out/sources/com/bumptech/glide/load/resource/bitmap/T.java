package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
interface T {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f19203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final y1.b f19204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f19205c;

        b(InputStream inputStream, List list, y1.b bVar) {
            this.f19204b = (y1.b) Q1.k.e(bVar);
            this.f19205c = (List) Q1.k.e(list);
            this.f19203a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public int a() {
            return com.bumptech.glide.load.a.b(this.f19205c, this.f19203a.a(), this.f19204b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public Bitmap b(BitmapFactory.Options options) {
            return P.b(this.f19203a.a(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public boolean c() {
            return com.bumptech.glide.load.a.j(this.f19205c, this.f19203a.a(), this.f19204b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public void d() {
            this.f19203a.b();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.f(this.f19205c, this.f19203a.a(), this.f19204b);
        }
    }

    int a();

    Bitmap b(BitmapFactory.Options options);

    boolean c();

    void d();

    ImageHeaderParser.ImageType e();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f19201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final y1.b f19202c;

        a(ByteBuffer byteBuffer, List list, y1.b bVar) {
            this.f19200a = byteBuffer;
            this.f19201b = list;
            this.f19202c = bVar;
        }

        private InputStream f() {
            return Q1.a.g(Q1.a.d(this.f19200a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public int a() {
            return com.bumptech.glide.load.a.c(this.f19201b, Q1.a.d(this.f19200a), this.f19202c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public Bitmap b(BitmapFactory.Options options) {
            return P.b(f(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public boolean c() {
            return com.bumptech.glide.load.a.k(this.f19201b, Q1.a.d(this.f19200a), this.f19202c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.g(this.f19201b, Q1.a.d(this.f19200a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public void d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c implements T {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y1.b f19206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f19207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f19208c;

        c(ParcelFileDescriptor parcelFileDescriptor, List list, y1.b bVar) {
            this.f19206a = (y1.b) Q1.k.e(bVar);
            this.f19207b = (List) Q1.k.e(list);
            this.f19208c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public int a() {
            return com.bumptech.glide.load.a.a(this.f19207b, this.f19208c, this.f19206a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public Bitmap b(BitmapFactory.Options options) {
            return P.a(this.f19208c.a().getFileDescriptor(), options, this);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public boolean c() {
            return com.bumptech.glide.load.a.i(this.f19207b, this.f19208c, this.f19206a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public ImageHeaderParser.ImageType e() {
            return com.bumptech.glide.load.a.e(this.f19207b, this.f19208c, this.f19206a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.T
        public void d() {
        }
    }
}
