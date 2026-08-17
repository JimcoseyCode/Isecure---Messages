package K;

import F.E;
import F.J;
import F.L;
import android.util.Range;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7004a = b.f7006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f7005b = new a();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a implements m {
        a() {
        }

        @Override // K.m
        public l b(int i10, L cameraInfoInternal, List newUseCases, List attachedUseCases, E cameraConfig, int i11, Range targetFrameRate, boolean z10, boolean z11) {
            AbstractC2855l.g(cameraInfoInternal, "cameraInfoInternal");
            AbstractC2855l.g(newUseCases, "newUseCases");
            AbstractC2855l.g(attachedUseCases, "attachedUseCases");
            AbstractC2855l.g(cameraConfig, "cameraConfig");
            AbstractC2855l.g(targetFrameRate, "targetFrameRate");
            return new l(null, 0, 3, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f7006a = new b();

        private b() {
        }
    }

    default void a(J cameraDeviceSurfaceManager) {
        AbstractC2855l.g(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
    }

    l b(int i10, L l10, List list, List list2, E e10, int i11, Range range, boolean z10, boolean z11);
}
