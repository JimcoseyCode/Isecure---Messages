package r;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import r.C3208p1;

/* JADX INFO: renamed from: r.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class C3208p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f31449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f31450b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Set f31451c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Set f31452d = new LinkedHashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Set f31453e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CameraDevice.StateCallback f31454f = new a();

    C3208p1(Executor executor) {
        this.f31449a = executor;
    }

    private void a(InterfaceC3175g2 interfaceC3175g2) {
        InterfaceC3175g2 interfaceC3175g22;
        Iterator it = f().iterator();
        while (it.hasNext() && (interfaceC3175g22 = (InterfaceC3175g2) it.next()) != interfaceC3175g2) {
            interfaceC3175g22.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            InterfaceC3175g2 interfaceC3175g2 = (InterfaceC3175g2) it.next();
            interfaceC3175g2.c().s(interfaceC3175g2);
        }
    }

    CameraDevice.StateCallback c() {
        return this.f31454f;
    }

    List d() {
        ArrayList arrayList;
        synchronized (this.f31450b) {
            arrayList = new ArrayList(this.f31451c);
        }
        return arrayList;
    }

    List e() {
        ArrayList arrayList;
        synchronized (this.f31450b) {
            arrayList = new ArrayList(this.f31453e);
        }
        return arrayList;
    }

    List f() {
        ArrayList arrayList;
        synchronized (this.f31450b) {
            arrayList = new ArrayList();
            arrayList.addAll(d());
            arrayList.addAll(e());
        }
        return arrayList;
    }

    void g(InterfaceC3175g2 interfaceC3175g2) {
        synchronized (this.f31450b) {
            this.f31451c.remove(interfaceC3175g2);
            this.f31452d.remove(interfaceC3175g2);
        }
    }

    void h(InterfaceC3175g2 interfaceC3175g2) {
        synchronized (this.f31450b) {
            this.f31452d.add(interfaceC3175g2);
        }
    }

    void i(InterfaceC3175g2 interfaceC3175g2) {
        a(interfaceC3175g2);
        synchronized (this.f31450b) {
            this.f31453e.remove(interfaceC3175g2);
        }
    }

    void j(InterfaceC3175g2 interfaceC3175g2) {
        synchronized (this.f31450b) {
            this.f31451c.add(interfaceC3175g2);
            this.f31453e.remove(interfaceC3175g2);
        }
        a(interfaceC3175g2);
    }

    void k(InterfaceC3175g2 interfaceC3175g2) {
        synchronized (this.f31450b) {
            this.f31453e.add(interfaceC3175g2);
        }
    }

    /* JADX INFO: renamed from: r.p1$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends CameraDevice.StateCallback {
        a() {
        }

        public static /* synthetic */ void a(LinkedHashSet linkedHashSet, int i10) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                ((InterfaceC3175g2) it.next()).i(i10);
            }
        }

        private void c() {
            List listF;
            synchronized (C3208p1.this.f31450b) {
                listF = C3208p1.this.f();
                C3208p1.this.f31453e.clear();
                C3208p1.this.f31451c.clear();
                C3208p1.this.f31452d.clear();
            }
            Iterator it = listF.iterator();
            while (it.hasNext()) {
                ((InterfaceC3175g2) it.next()).e();
            }
        }

        private void d(final int i10) {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C3208p1.this.f31450b) {
                linkedHashSet.addAll(C3208p1.this.f31453e);
                linkedHashSet.addAll(C3208p1.this.f31451c);
            }
            C3208p1.this.f31449a.execute(new Runnable() { // from class: r.o1
                @Override // java.lang.Runnable
                public final void run() {
                    C3208p1.a.a(linkedHashSet, i10);
                }
            });
        }

        private void e() {
            final LinkedHashSet linkedHashSet = new LinkedHashSet();
            synchronized (C3208p1.this.f31450b) {
                linkedHashSet.addAll(C3208p1.this.f31453e);
                linkedHashSet.addAll(C3208p1.this.f31451c);
            }
            C3208p1.this.f31449a.execute(new Runnable() { // from class: r.n1
                @Override // java.lang.Runnable
                public final void run() {
                    C3208p1.b(linkedHashSet);
                }
            });
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            e();
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i10) {
            e();
            d(i10);
            c();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
        }
    }
}
