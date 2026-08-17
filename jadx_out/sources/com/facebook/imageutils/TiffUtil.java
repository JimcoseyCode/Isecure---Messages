package com.facebook.imageutils;

import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0014\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Lcom/facebook/imageutils/TiffUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "orientation", "getAutoRotateAngleFromOrientation", "(I)I", "Ljava/io/InputStream;", "stream", "length", "readOrientationFromTIFF", "(Ljava/io/InputStream;I)I", "Lcom/facebook/imageutils/TiffUtil$a;", "tiffHeader", "c", "(Ljava/io/InputStream;ILcom/facebook/imageutils/TiffUtil$a;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isLittleEndian", "tagToFind", "b", "(Ljava/io/InputStream;IZI)I", "a", "(Ljava/io/InputStream;IZ)I", "Ljava/lang/Class;", "Ljava/lang/Class;", "TAG", "TIFF_BYTE_ORDER_BIG_END", "I", "TIFF_BYTE_ORDER_LITTLE_END", "TIFF_TAG_ORIENTATION", "TIFF_TYPE_SHORT", "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TiffUtil {
    public static final int TIFF_BYTE_ORDER_BIG_END = 1296891946;
    public static final int TIFF_BYTE_ORDER_LITTLE_END = 1229531648;
    public static final int TIFF_TAG_ORIENTATION = 274;
    public static final int TIFF_TYPE_SHORT = 3;
    public static final TiffUtil INSTANCE = new TiffUtil();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final Class TAG = TiffUtil.class;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f20266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f20268c;

        public final int a() {
            return this.f20267b;
        }

        public final int b() {
            return this.f20268c;
        }

        public final boolean c() {
            return this.f20266a;
        }

        public final void d(int i10) {
            this.f20267b = i10;
        }

        public final void e(int i10) {
            this.f20268c = i10;
        }

        public final void f(boolean z10) {
            this.f20266a = z10;
        }
    }

    private TiffUtil() {
    }

    private final int a(InputStream stream, int length, boolean isLittleEndian) {
        if (length >= 10 && StreamProcessor.readPackedInt(stream, 2, isLittleEndian) == 3 && StreamProcessor.readPackedInt(stream, 4, isLittleEndian) == 1) {
            return StreamProcessor.readPackedInt(stream, 2, isLittleEndian);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int b(InputStream stream, int length, boolean isLittleEndian, int tagToFind) throws IOException {
        if (length < 14) {
            return 0;
        }
        int packedInt = StreamProcessor.readPackedInt(stream, 2, isLittleEndian);
        int i10 = length - 2;
        while (true) {
            int i11 = packedInt - 1;
            if (packedInt <= 0 || i10 < 12) {
                break;
            }
            int i12 = i10 - 2;
            if (StreamProcessor.readPackedInt(stream, 2, isLittleEndian) == tagToFind) {
                return i12;
            }
            stream.skip(10L);
            i10 -= 12;
            packedInt = i11;
        }
    }

    private final int c(InputStream stream, int length, a tiffHeader) {
        if (length <= 8) {
            return 0;
        }
        tiffHeader.d(StreamProcessor.readPackedInt(stream, 4, false));
        if (tiffHeader.a() != 1229531648 && tiffHeader.a() != 1296891946) {
            AbstractC2325a.i(TAG, "Invalid TIFF header");
            return 0;
        }
        tiffHeader.f(tiffHeader.a() == 1229531648);
        tiffHeader.e(StreamProcessor.readPackedInt(stream, 4, tiffHeader.c()));
        int i10 = length - 8;
        if (tiffHeader.b() >= 8 && tiffHeader.b() - 8 <= i10) {
            return i10;
        }
        AbstractC2325a.i(TAG, "Invalid offset");
        return 0;
    }

    public static final int getAutoRotateAngleFromOrientation(int orientation) {
        if (orientation == 0 || orientation == 1) {
            return 0;
        }
        if (orientation == 3) {
            return 180;
        }
        if (orientation != 6) {
            return orientation != 8 ? 0 : 270;
        }
        return 90;
    }

    public static final int readOrientationFromTIFF(InputStream stream, int length) throws IOException {
        AbstractC2855l.g(stream, "stream");
        a aVar = new a();
        TiffUtil tiffUtil = INSTANCE;
        int iC = tiffUtil.c(stream, length, aVar);
        int iB = aVar.b() - 8;
        if (iC == 0 || iB > iC) {
            return 0;
        }
        stream.skip(iB);
        return tiffUtil.a(stream, tiffUtil.b(stream, iC - iB, aVar.c(), TIFF_TAG_ORIENTATION), aVar.c());
    }
}
