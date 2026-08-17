package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.X;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class C0205a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f19143a;

        C0205a(InputStream inputStream) {
            this.f19143a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.e(this.f19143a);
            } finally {
                this.f19143a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f19144a;

        b(ByteBuffer byteBuffer) {
            this.f19144a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.a(this.f19144a);
            } finally {
                Q1.a.d(this.f19144a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f19145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19146b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
            this.f19145a = parcelFileDescriptorRewinder;
            this.f19146b = bVar;
        }

        @Override // com.bumptech.glide.load.a.l
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            X x10 = null;
            try {
                X x11 = new X(new FileInputStream(this.f19145a.a().getFileDescriptor()), this.f19146b);
                try {
                    ImageHeaderParser.ImageType imageTypeE = imageHeaderParser.e(x11);
                    x11.k();
                    this.f19145a.a();
                    return imageTypeE;
                } catch (Throwable th) {
                    th = th;
                    x10 = x11;
                    if (x10 != null) {
                        x10.k();
                    }
                    this.f19145a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class d implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f19147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19148b;

        d(ByteBuffer byteBuffer, y1.b bVar) {
            this.f19147a = byteBuffer;
            this.f19148b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.f(this.f19147a, this.f19148b);
            } finally {
                Q1.a.d(this.f19147a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class e implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f19149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19150b;

        e(InputStream inputStream, y1.b bVar) {
            this.f19149a = inputStream;
            this.f19150b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f19149a, this.f19150b);
            } finally {
                this.f19149a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class f implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f19151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19152b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
            this.f19151a = parcelFileDescriptorRewinder;
            this.f19152b = bVar;
        }

        @Override // com.bumptech.glide.load.a.k
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            X x10 = null;
            try {
                X x11 = new X(new FileInputStream(this.f19151a.a().getFileDescriptor()), this.f19152b);
                try {
                    int iC = imageHeaderParser.c(x11, this.f19152b);
                    x11.k();
                    this.f19151a.a();
                    return iC;
                } catch (Throwable th) {
                    th = th;
                    x10 = x11;
                    if (x10 != null) {
                        x10.k();
                    }
                    this.f19151a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class g implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f19153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19154b;

        g(ByteBuffer byteBuffer, y1.b bVar) {
            this.f19153a = byteBuffer;
            this.f19154b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) {
            try {
                return imageHeaderParser.b(this.f19153a, this.f19154b);
            } finally {
                Q1.a.d(this.f19153a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class h implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f19155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19156b;

        h(InputStream inputStream, y1.b bVar) {
            this.f19155a = inputStream;
            this.f19156b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f19155a, this.f19156b);
            } finally {
                this.f19155a.reset();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class i implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f19157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y1.b f19158b;

        i(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
            this.f19157a = parcelFileDescriptorRewinder;
            this.f19158b = bVar;
        }

        @Override // com.bumptech.glide.load.a.j
        public boolean a(ImageHeaderParser imageHeaderParser) throws Throwable {
            X x10 = null;
            try {
                X x11 = new X(new FileInputStream(this.f19157a.a().getFileDescriptor()), this.f19158b);
                try {
                    boolean zD = imageHeaderParser.d(x11, this.f19158b);
                    x11.k();
                    this.f19157a.a();
                    return zD;
                } catch (Throwable th) {
                    th = th;
                    x10 = x11;
                    if (x10 != null) {
                        x10.k();
                    }
                    this.f19157a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface j {
        boolean a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface k {
        int a(ImageHeaderParser imageHeaderParser);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface l {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, y1.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new X(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, y1.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, k kVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = kVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, y1.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new X(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0205a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = lVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean i(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, y1.b bVar) {
        return l(list, new i(parcelFileDescriptorRewinder, bVar));
    }

    public static boolean j(List list, InputStream inputStream, y1.b bVar) {
        if (inputStream == null) {
            return false;
        }
        if (!inputStream.markSupported()) {
            inputStream = new X(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return l(list, new h(inputStream, bVar));
    }

    public static boolean k(List list, ByteBuffer byteBuffer, y1.b bVar) {
        if (byteBuffer == null) {
            return false;
        }
        return l(list, new g(byteBuffer, bVar));
    }

    private static boolean l(List list, j jVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (jVar.a((ImageHeaderParser) list.get(i10))) {
                return true;
            }
        }
        return false;
    }
}
