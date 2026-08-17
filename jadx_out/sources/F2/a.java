package F2;

import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface a {
    void a(int i10, int i11, InterfaceC3487a interfaceC3487a);

    AbstractC2662a b(int i10, int i11, int i12);

    void c();

    void d(b bVar, D2.b bVar2, C2.a aVar, int i10, InterfaceC3487a interfaceC3487a);

    void onStop();

    /* JADX INFO: renamed from: F2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0040a {
        public static AbstractC2662a b(a aVar, int i10, int i11, int i12) {
            return null;
        }

        public static void e(a aVar, b bitmapFramePreparer, D2.b bitmapFrameCache, C2.a animationBackend, int i10, InterfaceC3487a interfaceC3487a) {
            AbstractC2855l.g(bitmapFramePreparer, "bitmapFramePreparer");
            AbstractC2855l.g(bitmapFrameCache, "bitmapFrameCache");
            AbstractC2855l.g(animationBackend, "animationBackend");
        }

        public static /* synthetic */ void f(a aVar, b bVar, D2.b bVar2, C2.a aVar2, int i10, InterfaceC3487a interfaceC3487a, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareFrames");
            }
            if ((i11 & 16) != 0) {
                interfaceC3487a = null;
            }
            aVar.d(bVar, bVar2, aVar2, i10, interfaceC3487a);
        }

        public static void a(a aVar) {
        }

        public static void c(a aVar) {
        }

        public static void d(a aVar, int i10, int i11, InterfaceC3487a interfaceC3487a) {
        }
    }
}
