package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.concurrent.futures.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import m5.InterfaceFutureC2904a;
import n.InterfaceC2955a;
import r.AbstractC3157c0;
import v.t;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f32759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32760b = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InterfaceFutureC2904a f32761a = androidx.concurrent.futures.c.a(new c.InterfaceC0153c() { // from class: v.s
            @Override // androidx.concurrent.futures.c.InterfaceC0153c
            public final Object a(c.a aVar) {
                return t.a.a(this.f32758a, aVar);
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c.a f32762b;

        a() {
        }

        public static /* synthetic */ Object a(a aVar, c.a aVar2) {
            aVar.f32762b = aVar2;
            return "RequestCompleteListener[" + aVar + "]";
        }

        private void b() {
            c.a aVar = this.f32762b;
            if (aVar != null) {
                aVar.c(null);
                this.f32762b = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i10, long j10) {
            b();
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j10, long j11) {
            b();
        }
    }

    public t(boolean z10) {
        this.f32759a = z10;
    }

    public static /* synthetic */ void a(t tVar, a aVar, InterfaceFutureC2904a interfaceFutureC2904a) {
        tVar.getClass();
        Objects.toString(aVar);
        tVar.toString();
        tVar.f32760b.remove(interfaceFutureC2904a);
    }

    public static /* synthetic */ Void b(List list) {
        return null;
    }

    private CameraCaptureSession.CaptureCallback c() {
        final a aVar = new a();
        final InterfaceFutureC2904a interfaceFutureC2904a = aVar.f32761a;
        this.f32760b.add(interfaceFutureC2904a);
        toString();
        interfaceFutureC2904a.h(new Runnable() { // from class: v.q
            @Override // java.lang.Runnable
            public final void run() {
                t.a(this.f32755g, aVar, interfaceFutureC2904a);
            }
        }, I.c.b());
        return aVar;
    }

    public CameraCaptureSession.CaptureCallback d(CameraCaptureSession.CaptureCallback captureCallback) {
        return f() ? AbstractC3157c0.b(c(), captureCallback) : captureCallback;
    }

    public InterfaceFutureC2904a e() {
        return this.f32760b.isEmpty() ? J.n.p(null) : J.n.s(J.n.x(J.n.w(new ArrayList(this.f32760b)), new InterfaceC2955a() { // from class: v.r
            @Override // n.InterfaceC2955a
            public final Object apply(Object obj) {
                return t.b((List) obj);
            }
        }, I.c.b()));
    }

    public boolean f() {
        return this.f32759a;
    }

    public void g() {
        LinkedList linkedList = new LinkedList(this.f32760b);
        while (!linkedList.isEmpty()) {
            InterfaceFutureC2904a interfaceFutureC2904a = (InterfaceFutureC2904a) linkedList.poll();
            Objects.requireNonNull(interfaceFutureC2904a);
            interfaceFutureC2904a.cancel(true);
        }
    }
}
