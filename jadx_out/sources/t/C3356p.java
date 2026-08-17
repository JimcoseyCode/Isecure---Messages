package t;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: t.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C3356p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f32454a;

    /* JADX INFO: renamed from: t.p$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f32457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CameraCaptureSession.StateCallback f32458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Executor f32459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f32460d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private C3349i f32461e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private CaptureRequest f32462f = null;

        b(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this.f32460d = i10;
            this.f32457a = Collections.unmodifiableList(new ArrayList(list));
            this.f32458b = stateCallback;
            this.f32459c = executor;
        }

        @Override // t.C3356p.c
        public C3349i a() {
            return this.f32461e;
        }

        @Override // t.C3356p.c
        public Executor b() {
            return this.f32459c;
        }

        @Override // t.C3356p.c
        public CameraCaptureSession.StateCallback c() {
            return this.f32458b;
        }

        @Override // t.C3356p.c
        public Object d() {
            return null;
        }

        @Override // t.C3356p.c
        public int e() {
            return this.f32460d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (Objects.equals(this.f32461e, bVar.f32461e) && this.f32460d == bVar.f32460d && this.f32457a.size() == bVar.f32457a.size()) {
                    for (int i10 = 0; i10 < this.f32457a.size(); i10++) {
                        if (!((C3350j) this.f32457a.get(i10)).equals(bVar.f32457a.get(i10))) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        @Override // t.C3356p.c
        public void f(C3349i c3349i) {
            if (this.f32460d == 1) {
                throw new UnsupportedOperationException("Method not supported for high speed session types");
            }
            this.f32461e = c3349i;
        }

        @Override // t.C3356p.c
        public List g() {
            return this.f32457a;
        }

        @Override // t.C3356p.c
        public void h(CaptureRequest captureRequest) {
            this.f32462f = captureRequest;
        }

        public int hashCode() {
            int iHashCode = this.f32457a.hashCode() ^ 31;
            int i10 = (iHashCode << 5) - iHashCode;
            C3349i c3349i = this.f32461e;
            int iHashCode2 = (c3349i == null ? 0 : c3349i.hashCode()) ^ i10;
            return this.f32460d ^ ((iHashCode2 << 5) - iHashCode2);
        }
    }

    /* JADX INFO: renamed from: t.p$c */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private interface c {
        C3349i a();

        Executor b();

        CameraCaptureSession.StateCallback c();

        Object d();

        int e();

        void f(C3349i c3349i);

        List g();

        void h(CaptureRequest captureRequest);
    }

    public C3356p(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f32454a = new b(i10, list, executor, stateCallback);
        } else {
            this.f32454a = new a(i10, list, executor, stateCallback);
        }
    }

    public static List h(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((C3350j) it.next()).i());
        }
        return arrayList;
    }

    static List i(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C3350j.j((OutputConfiguration) it.next()));
        }
        return arrayList;
    }

    public Executor a() {
        return this.f32454a.b();
    }

    public C3349i b() {
        return this.f32454a.a();
    }

    public List c() {
        return this.f32454a.g();
    }

    public int d() {
        return this.f32454a.e();
    }

    public CameraCaptureSession.StateCallback e() {
        return this.f32454a.c();
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3356p) {
            return this.f32454a.equals(((C3356p) obj).f32454a);
        }
        return false;
    }

    public void f(C3349i c3349i) {
        this.f32454a.f(c3349i);
    }

    public void g(CaptureRequest captureRequest) {
        this.f32454a.h(captureRequest);
    }

    public int hashCode() {
        return this.f32454a.hashCode();
    }

    public Object j() {
        return this.f32454a.d();
    }

    /* JADX INFO: renamed from: t.p$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SessionConfiguration f32455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f32456b;

        a(Object obj) {
            SessionConfiguration sessionConfiguration = (SessionConfiguration) obj;
            this.f32455a = sessionConfiguration;
            this.f32456b = Collections.unmodifiableList(C3356p.i(sessionConfiguration.getOutputConfigurations()));
        }

        @Override // t.C3356p.c
        public C3349i a() {
            return C3349i.b(this.f32455a.getInputConfiguration());
        }

        @Override // t.C3356p.c
        public Executor b() {
            return this.f32455a.getExecutor();
        }

        @Override // t.C3356p.c
        public CameraCaptureSession.StateCallback c() {
            return this.f32455a.getStateCallback();
        }

        @Override // t.C3356p.c
        public Object d() {
            return this.f32455a;
        }

        @Override // t.C3356p.c
        public int e() {
            return this.f32455a.getSessionType();
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Objects.equals(this.f32455a, ((a) obj).f32455a);
            }
            return false;
        }

        @Override // t.C3356p.c
        public void f(C3349i c3349i) {
            this.f32455a.setInputConfiguration((InputConfiguration) c3349i.a());
        }

        @Override // t.C3356p.c
        public List g() {
            return this.f32456b;
        }

        @Override // t.C3356p.c
        public void h(CaptureRequest captureRequest) {
            this.f32455a.setSessionParameters(captureRequest);
        }

        public int hashCode() {
            return this.f32455a.hashCode();
        }

        a(int i10, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
            this(new SessionConfiguration(i10, C3356p.h(list), executor, stateCallback));
        }
    }
}
