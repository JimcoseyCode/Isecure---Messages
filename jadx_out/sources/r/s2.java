package r;

import F.E1;
import androidx.camera.camera2.internal.compat.quirk.PreviewUnderExposureQuirk;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s2 {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31493a;

        static {
            int[] iArr = new int[E1.b.values().length];
            f31493a = iArr;
            try {
                iArr[E1.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31493a[E1.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31493a[E1.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31493a[E1.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31493a[E1.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static int a(E1.b bVar, int i10) {
        int i11 = a.f31493a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && androidx.camera.camera2.internal.compat.quirk.b.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 2;
    }

    public static int b(E1.b bVar, int i10) {
        int i11 = a.f31493a[bVar.ordinal()];
        return i11 != 1 ? (i11 == 2 && androidx.camera.camera2.internal.compat.quirk.b.b(PreviewUnderExposureQuirk.class) == null) ? 3 : 1 : i10 == 2 ? 5 : 1;
    }
}
