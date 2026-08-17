package androidx.camera.core.impl.utils;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class SurfaceUtil {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15194a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15195b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15196c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f15194a = iArrNativeGetSurfaceInfo[0];
        aVar.f15195b = iArrNativeGetSurfaceInfo[1];
        aVar.f15196c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
