package r;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import r.InterfaceC3175g2;
import s.AbstractC3288b;
import s.AbstractC3291e;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
final class r2 extends InterfaceC3175g2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f31486a;

    r2(List list) {
        ArrayList arrayList = new ArrayList();
        this.f31486a = arrayList;
        arrayList.addAll(list);
    }

    static InterfaceC3175g2.c y(InterfaceC3175g2.c... cVarArr) {
        return new r2(Arrays.asList(cVarArr));
    }

    @Override // r.InterfaceC3175g2.c
    public void q(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).q(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void r(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).r(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void s(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).s(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void t(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).t(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void u(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).u(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void v(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).v(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    void w(InterfaceC3175g2 interfaceC3175g2) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).w(interfaceC3175g2);
        }
    }

    @Override // r.InterfaceC3175g2.c
    public void x(InterfaceC3175g2 interfaceC3175g2, Surface surface) {
        Iterator it = this.f31486a.iterator();
        while (it.hasNext()) {
            ((InterfaceC3175g2.c) it.next()).x(interfaceC3175g2, surface);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends InterfaceC3175g2.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f31487a;

        a(CameraCaptureSession.StateCallback stateCallback) {
            this.f31487a = stateCallback;
        }

        @Override // r.InterfaceC3175g2.c
        public void q(InterfaceC3175g2 interfaceC3175g2) {
            this.f31487a.onActive(interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void r(InterfaceC3175g2 interfaceC3175g2) {
            AbstractC3291e.a(this.f31487a, interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void s(InterfaceC3175g2 interfaceC3175g2) {
            this.f31487a.onClosed(interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void t(InterfaceC3175g2 interfaceC3175g2) {
            this.f31487a.onConfigureFailed(interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void u(InterfaceC3175g2 interfaceC3175g2) {
            this.f31487a.onConfigured(interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void v(InterfaceC3175g2 interfaceC3175g2) {
            this.f31487a.onReady(interfaceC3175g2.h().d());
        }

        @Override // r.InterfaceC3175g2.c
        public void x(InterfaceC3175g2 interfaceC3175g2, Surface surface) {
            AbstractC3288b.a(this.f31487a, interfaceC3175g2.h().d(), surface);
        }

        a(List list) {
            this(U0.a(list));
        }

        @Override // r.InterfaceC3175g2.c
        void w(InterfaceC3175g2 interfaceC3175g2) {
        }
    }
}
