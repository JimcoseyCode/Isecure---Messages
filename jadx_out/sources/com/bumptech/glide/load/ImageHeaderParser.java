package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import y1.b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface ImageHeaderParser {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f19141g;

        ImageType(boolean z10) {
            this.f19141g = z10;
        }

        public boolean hasAlpha() {
            return this.f19141g;
        }

        public boolean isWebp() {
            int i10 = a.f19142a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19142a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f19142a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19142a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19142a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    boolean b(ByteBuffer byteBuffer, b bVar);

    int c(InputStream inputStream, b bVar);

    boolean d(InputStream inputStream, b bVar);

    ImageType e(InputStream inputStream);

    int f(ByteBuffer byteBuffer, b bVar);
}
