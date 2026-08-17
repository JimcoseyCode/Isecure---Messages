package U;

import F.InterfaceC0490j0;
import F.S0;
import F.X0;
import F.h1;
import android.hardware.camera2.CaptureRequest;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f implements h1 {

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private InterfaceC0490j0 f10719P;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private S0 f10720a = S0.i0();

        public f a() {
            return new f(X0.h0(this.f10720a));
        }

        public b b(CaptureRequest.Key key, Object obj) {
            this.f10720a.X(f.f0(key), obj);
            return this;
        }
    }

    static InterfaceC0490j0.a f0(CaptureRequest.Key key) {
        return InterfaceC0490j0.a.b("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // F.h1
    public InterfaceC0490j0 o() {
        return this.f10719P;
    }

    private f(InterfaceC0490j0 interfaceC0490j0) {
        this.f10719P = interfaceC0490j0;
    }
}
