package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import q.AbstractC3105o;
import v1.g;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d0 implements v1.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v1.g f19238d = v1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new a());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v1.g f19239e = v1.g.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new b());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f19240f = new f();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final List f19241g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f19242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final y1.d f19243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f19244c;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19245a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // v1.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Long l10, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f19245a) {
                this.f19245a.position(0);
                messageDigest.update(this.f19245a.putLong(l10.longValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b implements g.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ByteBuffer f19246a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // v1.g.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f19246a) {
                this.f19246a.position(0);
                messageDigest.update(this.f19246a.putInt(num.intValue()).array());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class c implements e {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    interface e {
        void a(MediaExtractor mediaExtractor, Object obj);

        void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class g implements e {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    d0(y1.d dVar, e eVar) {
        this(dVar, eVar, f19240f);
    }

    public static v1.j a(y1.d dVar) {
        return new d0(dVar, new c(null));
    }

    public static v1.j b(y1.d dVar) {
        return new d0(dVar, new d());
    }

    private static Bitmap c(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (h()) {
            try {
                if (g(mediaMetadataRetriever)) {
                    if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) != 180) {
                        return bitmap;
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            } catch (NumberFormatException unused) {
                return bitmap;
            }
        }
        return bitmap;
    }

    private Bitmap d(Object obj, MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC1944n abstractC1944n) {
        if (j(obj, mediaMetadataRetriever)) {
            throw new IllegalStateException("Cannot decode VP8 video on CrOS.");
        }
        Bitmap bitmapF = (Build.VERSION.SDK_INT < 27 || i11 == Integer.MIN_VALUE || i12 == Integer.MIN_VALUE || abstractC1944n == AbstractC1944n.NONE) ? null : f(mediaMetadataRetriever, j10, i10, i11, i12, abstractC1944n);
        if (bitmapF == null) {
            bitmapF = e(mediaMetadataRetriever, j10, i10);
        }
        Bitmap bitmapC = c(mediaMetadataRetriever, bitmapF);
        if (bitmapC != null) {
            return bitmapC;
        }
        throw new h();
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10) {
        return mediaMetadataRetriever.getFrameAtTime(j10, i10);
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j10, int i10, int i11, int i12, AbstractC1944n abstractC1944n) {
        try {
            int i13 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int i14 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int i15 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (i15 == 90 || i15 == 270) {
                i14 = i13;
                i13 = i14;
            }
            float scaleFactor = abstractC1944n.getScaleFactor(i13, i14, i11, i12);
            return mediaMetadataRetriever.getScaledFrameAtTime(j10, i10, Math.round(i13 * scaleFactor), Math.round(scaleFactor * i14));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g(MediaMetadataRetriever mediaMetadataRetriever) {
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int i10 = Integer.parseInt(strExtractMetadata);
        return (i10 == 7 || i10 == 6) && Integer.parseInt(strExtractMetadata2) == 6;
    }

    static boolean h() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return i();
        }
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 30 && i10 < 33;
    }

    private static boolean i() {
        Iterator it = f19241g.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean j(Object obj, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str != null && str.matches(".+_cheets|cheets_.+")) {
            MediaExtractor mediaExtractor = null;
            try {
                if (!"video/webm".equals(mediaMetadataRetriever.extractMetadata(12))) {
                    return false;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                try {
                    this.f19242a.a(mediaExtractor2, obj);
                    int trackCount = mediaExtractor2.getTrackCount();
                    for (int i10 = 0; i10 < trackCount; i10++) {
                        if ("video/x-vnd.on2.vp8".equals(mediaExtractor2.getTrackFormat(i10).getString("mime"))) {
                            mediaExtractor2.release();
                            return true;
                        }
                    }
                    mediaExtractor2.release();
                } catch (Throwable unused) {
                    mediaExtractor = mediaExtractor2;
                    if (mediaExtractor != null) {
                    }
                }
            } catch (Throwable unused2) {
            }
            if (mediaExtractor != null) {
                mediaExtractor.release();
            }
        }
        return false;
    }

    public static v1.j k(y1.d dVar) {
        return new d0(dVar, new g());
    }

    @Override // v1.j
    public x1.v decode(Object obj, int i10, int i11, v1.h hVar) throws Exception {
        long jLongValue = ((Long) hVar.b(f19238d)).longValue();
        if (jLongValue < 0 && jLongValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + jLongValue);
        }
        Integer num = (Integer) hVar.b(f19239e);
        if (num == null) {
            num = 2;
        }
        AbstractC1944n abstractC1944n = (AbstractC1944n) hVar.b(AbstractC1944n.OPTION);
        if (abstractC1944n == null) {
            abstractC1944n = AbstractC1944n.DEFAULT;
        }
        AbstractC1944n abstractC1944n2 = abstractC1944n;
        MediaMetadataRetriever mediaMetadataRetrieverA = this.f19244c.a();
        try {
            this.f19242a.b(mediaMetadataRetrieverA, obj);
            try {
                Bitmap bitmapD = d(obj, mediaMetadataRetrieverA, jLongValue, num.intValue(), i10, i11, abstractC1944n2);
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3105o.a(mediaMetadataRetrieverA);
                } else {
                    mediaMetadataRetrieverA.release();
                }
                return C1937g.d(bitmapD, this.f19243b);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                if (Build.VERSION.SDK_INT >= 29) {
                    AbstractC3105o.a(mediaMetadataRetrieverA);
                    throw th2;
                }
                mediaMetadataRetrieverA.release();
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // v1.j
    public boolean handles(Object obj, v1.h hVar) {
        return true;
    }

    d0(y1.d dVar, e eVar, f fVar) {
        this.f19243b = dVar;
        this.f19242a = eVar;
        this.f19244c = fVar;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class d implements e {
        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(c(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(c(byteBuffer));
        }

        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        class a extends MediaDataSource {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f19247g;

            a(ByteBuffer byteBuffer) {
                this.f19247g = byteBuffer;
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f19247g.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j10, byte[] bArr, int i10, int i11) {
                if (j10 >= this.f19247g.limit()) {
                    return -1;
                }
                this.f19247g.position((int) j10);
                int iMin = Math.min(i11, this.f19247g.remaining());
                this.f19247g.get(bArr, i10, iMin);
                return iMin;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }
        }
    }
}
