package q;

import F.k1;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.os.Bundle;
import android.util.Size;
import android.view.SurfaceHolder;
import i7.AbstractC2746i;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import r.Z0;
import s.C3294h;
import s.E;
import s.S;
import t.AbstractC3344d;
import t.C3346f;
import w7.InterfaceC3487a;
import y.AbstractC3583h0;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements B.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f30720k = new c(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b f30721l = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f30722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final S f30724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f30725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f30726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Lazy f30727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f30728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f30729j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends CameraCaptureSession.StateCallback {
        b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession p02) {
            AbstractC2855l.g(p02, "p0");
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession p02) {
            AbstractC2855l.g(p02, "p0");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public w(Context context, String cameraId, S cameraManagerCompat) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(cameraId, "cameraId");
        AbstractC2855l.g(cameraManagerCompat, "cameraManagerCompat");
        this.f30722c = context;
        this.f30723d = cameraId;
        this.f30724e = cameraManagerCompat;
        this.f30725f = AbstractC2746i.b(new InterfaceC3487a() { // from class: q.q
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return w.j(this.f30715g);
            }
        });
        this.f30726g = AbstractC2746i.b(new InterfaceC3487a() { // from class: q.r
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return w.k(this.f30716g);
            }
        });
        this.f30727h = AbstractC2746i.b(new InterfaceC3487a() { // from class: q.s
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return w.i(this.f30717g);
            }
        });
        this.f30728i = AbstractC2746i.b(new InterfaceC3487a() { // from class: q.t
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return w.m(this.f30718g);
            }
        });
        this.f30729j = AbstractC2746i.b(new InterfaceC3487a() { // from class: q.u
            @Override // w7.InterfaceC3487a
            public final Object invoke() {
                return Boolean.valueOf(w.u(this.f30719g));
            }
        });
    }

    private final void h(OutputConfiguration outputConfiguration, k1.f fVar) {
        DynamicRangeProfiles dynamicRangeProfilesR = r();
        if (dynamicRangeProfilesR == null) {
            return;
        }
        Long lA = AbstractC3344d.a(fVar.b(), dynamicRangeProfilesR);
        if (lA == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        outputConfiguration.setDynamicRangeProfile(lA.longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final E i(w wVar) throws C3600u {
        try {
            E eC = wVar.f30724e.c(wVar.f30723d);
            AbstractC2855l.d(eC);
            return eC;
        } catch (C3294h e10) {
            throw Z0.a(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final X.e j(w wVar) {
        return new X.f(wVar.f30722c).a(wVar.f30723d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraDevice.CameraDeviceSetup k(w wVar) {
        if (wVar.f30724e.i().isCameraDeviceSetupSupported(wVar.f30723d)) {
            return wVar.f30724e.i().getCameraDeviceSetup(wVar.f30723d);
        }
        return null;
    }

    private final List l(k1 k1Var) {
        a aVarV;
        List<k1.f> listI = k1Var.i();
        AbstractC2855l.f(listI, "getOutputConfigs(...)");
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listI, 10));
        for (k1.f fVar : listI) {
            if (t()) {
                AbstractC2855l.d(fVar);
                aVarV = w(fVar);
            } else {
                AbstractC2855l.d(fVar);
                aVarV = v(fVar);
            }
            if (fVar.f().g() != null) {
                h(aVarV.d(), fVar);
            }
            arrayList.add(aVarV);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DynamicRangeProfiles m(w wVar) {
        return C3346f.a(wVar.o()).d();
    }

    private final SessionConfiguration n(List list, k1 k1Var) {
        AbstractC3099i.a();
        SessionConfiguration sessionConfigurationA = AbstractC3098h.a(0, list, I.c.b(), f30721l);
        CameraDevice.CameraDeviceSetup cameraDeviceSetupP = p();
        if (cameraDeviceSetupP == null) {
            return null;
        }
        CaptureRequest.Builder builderCreateCaptureRequest = cameraDeviceSetupP.createCaptureRequest(k1Var.p());
        builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, k1Var.e());
        if (k1Var.k().h() == 2) {
            builderCreateCaptureRequest.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        }
        sessionConfigurationA.setSessionParameters(builderCreateCaptureRequest.build());
        return sessionConfigurationA;
    }

    private final E o() {
        return (E) this.f30727h.getValue();
    }

    private final CameraDevice.CameraDeviceSetup p() {
        return AbstractC3095e.a(this.f30726g.getValue());
    }

    private final X.e q() {
        return (X.e) this.f30725f.getValue();
    }

    private final DynamicRangeProfiles r() {
        return AbstractC3094d.a(this.f30728i.getValue());
    }

    private final Boolean s() {
        try {
            ServiceInfo[] serviceInfoArr = this.f30722c.getPackageManager().getPackageInfo(this.f30722c.getPackageName(), 132).services;
            if (serviceInfoArr == null) {
                return Boolean.FALSE;
            }
            Iterator itA = AbstractC2845b.a(serviceInfoArr);
            while (itA.hasNext()) {
                Bundle bundle = ((ServiceInfo) itA.next()).metaData;
                if (bundle != null && bundle.getString("androidx.camera.featurecombinationquery.PLAY_SERVICES_IMPL_PROVIDER_KEY") != null) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean t() {
        return ((Boolean) this.f30729j.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u(w wVar) {
        return AbstractC2855l.b(wVar.s(), Boolean.FALSE);
    }

    private final a v(k1.f fVar) {
        Class clsG = fVar.f().g();
        long j10 = AbstractC2855l.b(clsG, MediaCodec.class) ? 65536L : AbstractC2855l.b(clsG, SurfaceHolder.class) ? 2048L : AbstractC2855l.b(clsG, SurfaceTexture.class) ? 256L : 0L;
        AbstractC3583h0.a("FeatureCombinationQueryImpl", "toConcreteOutputConfiguration: surface containerClass = " + fVar.f().g() + ", usageFlag = " + j10);
        ImageReader imageReaderNewInstance = ImageReader.newInstance(fVar.f().h().getWidth(), fVar.f().h().getHeight(), fVar.f().i(), 1, j10);
        AbstractC2855l.f(imageReaderNewInstance, "newInstance(...)");
        return new a(new OutputConfiguration(imageReaderNewInstance.getSurface()), imageReaderNewInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final a w(k1.f fVar) {
        OutputConfiguration outputConfigurationA;
        Class clsG = fVar.f().g();
        AbstractC3583h0.a("FeatureCombinationQueryImpl", "toDeferredOutputConfiguration: surface containerClass = " + fVar.f().g());
        if (clsG != null) {
            AbstractC3097g.a();
            Size sizeH = fVar.f().h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            outputConfigurationA = AbstractC3092b.a(sizeH, clsG);
        } else {
            AbstractC3097g.a();
            outputConfigurationA = AbstractC3096f.a(fVar.f().i(), fVar.f().h());
        }
        return new a(outputConfigurationA, null, 2, 0 == true ? 1 : 0);
    }

    private final String x(k1 k1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append("sessionParameters=[");
        sb.append("fpsRange=" + k1Var.e());
        sb.append(", previewStabilizationMode=" + k1Var.k().h());
        sb.append("], ");
        sb.append("outputConfigurations=[");
        List listI = k1Var.i();
        AbstractC2855l.f(listI, "getOutputConfigs(...)");
        int i10 = 0;
        for (Object obj : listI) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC2800q.t();
            }
            k1.f fVar = (k1.f) obj;
            if (i10 != 0) {
                sb.append(",");
            }
            sb.append("{format=" + fVar.f().i() + ", size=" + fVar.f().h() + ", dynamicRange=" + fVar.b() + ", class=" + fVar.f().g() + '}');
            i10 = i11;
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        return string;
    }

    @Override // B.a
    public boolean a(k1 sessionConfig) throws Exception {
        AbstractC2855l.g(sessionConfig, "sessionConfig");
        List listL = l(sessionConfig);
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listL, 10));
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).d());
        }
        SessionConfiguration sessionConfigurationN = n(arrayList, sessionConfig);
        if (sessionConfigurationN == null) {
            return false;
        }
        int iA = q().a(sessionConfigurationN).a();
        AbstractC3583h0.a("FeatureCombinationQueryImpl", "isSupported: supported = " + iA + " for session config with " + x(sessionConfig));
        boolean z10 = iA == 1;
        Iterator it2 = listL.iterator();
        while (it2.hasNext()) {
            AbstractC3105o.a((AutoCloseable) it2.next());
        }
        return z10;
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static final class a implements AutoCloseable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final OutputConfiguration f30730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ImageReader f30731h;

        public a(OutputConfiguration value, ImageReader imageReader) {
            AbstractC2855l.g(value, "value");
            this.f30730g = value;
            this.f30731h = imageReader;
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            ImageReader imageReader = this.f30731h;
            if (imageReader != null) {
                imageReader.close();
            }
        }

        public final OutputConfiguration d() {
            return this.f30730g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC2855l.b(this.f30730g, aVar.f30730g) && AbstractC2855l.b(this.f30731h, aVar.f30731h);
        }

        public int hashCode() {
            int iHashCode = this.f30730g.hashCode() * 31;
            ImageReader imageReader = this.f30731h;
            return iHashCode + (imageReader == null ? 0 : imageReader.hashCode());
        }

        public String toString() {
            return "CloseableOutputConfiguration(value=" + this.f30730g + ", backingImageReader=" + this.f30731h + ')';
        }

        public /* synthetic */ a(OutputConfiguration outputConfiguration, ImageReader imageReader, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(outputConfiguration, (i10 & 2) != 0 ? null : imageReader);
        }
    }
}
