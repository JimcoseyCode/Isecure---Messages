package r;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import y.AbstractC3583h0;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class N0 implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f31039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f31042f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F.g1 f31043g;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static class a {
        static EncoderProfiles a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public N0(String str, F.g1 g1Var) {
        boolean z10;
        int i10;
        this.f31040d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            AbstractC3583h0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f31039c = z10;
        this.f31041e = i10;
        this.f31043g = g1Var;
    }

    private InterfaceC0515w0 c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f31041e, i10);
        } catch (RuntimeException e10) {
            AbstractC3583h0.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return G.a.a(camcorderProfile);
        }
        return null;
    }

    private InterfaceC0515w0 d() {
        Iterator it = InterfaceC0513v0.f1713b.iterator();
        while (it.hasNext()) {
            InterfaceC0515w0 interfaceC0515w0B = b(((Integer) it.next()).intValue());
            if (interfaceC0515w0B != null) {
                return interfaceC0515w0B;
            }
        }
        return null;
    }

    private InterfaceC0515w0 e() {
        for (int size = InterfaceC0513v0.f1713b.size() - 1; size >= 0; size--) {
            InterfaceC0515w0 interfaceC0515w0B = b(size);
            if (interfaceC0515w0B != null) {
                return interfaceC0515w0B;
            }
        }
        return null;
    }

    private InterfaceC0515w0 f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles encoderProfilesA = a.a(this.f31040d, i10);
            if (encoderProfilesA == null) {
                return null;
            }
            if (androidx.camera.camera2.internal.compat.quirk.b.b(InvalidVideoProfilesQuirk.class) != null) {
                AbstractC3583h0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return G.a.b(encoderProfilesA);
                } catch (NullPointerException e10) {
                    AbstractC3583h0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return c(i10);
    }

    private boolean g(InterfaceC0515w0 interfaceC0515w0) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f31043g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List listD = interfaceC0515w0.d();
        if (listD.isEmpty()) {
            return true;
        }
        return camcorderProfileResolutionQuirk.g().contains(((InterfaceC0515w0.c) listD.get(0)).k());
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return this.f31039c && b(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        InterfaceC0515w0 interfaceC0515w0E = null;
        if (!this.f31039c || !CamcorderProfile.hasProfile(this.f31041e, i10)) {
            return null;
        }
        if (this.f31042f.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f31042f.get(Integer.valueOf(i10));
        }
        InterfaceC0515w0 interfaceC0515w0F = f(i10);
        if (interfaceC0515w0F == null || g(interfaceC0515w0F)) {
            interfaceC0515w0E = interfaceC0515w0F;
        } else if (i10 == 1) {
            interfaceC0515w0E = d();
        } else if (i10 == 0) {
            interfaceC0515w0E = e();
        }
        this.f31042f.put(Integer.valueOf(i10), interfaceC0515w0E);
        return interfaceC0515w0E;
    }
}
