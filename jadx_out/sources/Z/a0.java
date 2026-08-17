package Z;

import F.C0511u0;
import F.InterfaceC0513v0;
import F.g1;
import android.util.Size;
import g0.s0;
import i0.C2715c;
import i0.C2716d;
import i0.C2717e;
import i0.C2718f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import y.AbstractC3583h0;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class a0 implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0513v0 f13327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f13328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f13330e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f13331f = new HashMap();

    a0(int i10, F.L l10, int i11, s0.a aVar) {
        H0.g.b(i10 == 0 || i10 == 1, "Not a supported video capabilities source: " + i10);
        int i12 = i11 == 2 ? 2 : 1;
        this.f13329d = i12;
        this.f13327b = h(i10, l10, aVar, i12);
        for (C3563H c3563h : l10.b()) {
            C1576o c1576o = new C1576o(new b0.e(this.f13327b, c3563h), this.f13329d);
            if (!c1576o.g().isEmpty()) {
                this.f13330e.put(c3563h, c1576o);
            }
        }
        this.f13328c = l10.e();
    }

    private C1576o f(C3563H c3563h) {
        if (C0511u0.c(c3563h, b())) {
            return new C1576o(new b0.e(this.f13327b, c3563h), this.f13329d);
        }
        return null;
    }

    private C1576o g(C3563H c3563h) {
        if (c3563h.e()) {
            return (C1576o) this.f13330e.get(c3563h);
        }
        if (this.f13331f.containsKey(c3563h)) {
            return (C1576o) this.f13331f.get(c3563h);
        }
        C1576o c1576oF = f(c3563h);
        this.f13331f.put(c3563h, c1576oF);
        return c1576oF;
    }

    private static InterfaceC0513v0 h(int i10, F.L l10, s0.a aVar, int i11) {
        s0.a aVar2;
        InterfaceC0513v0 interfaceC0513v0U = l10.u();
        if (i11 == 2) {
            return !l10.j() ? InterfaceC0513v0.f1712a : interfaceC0513v0U;
        }
        if (!C1576o.b(interfaceC0513v0U, i11)) {
            AbstractC3583h0.l("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
            interfaceC0513v0U = new C2715c(l10, Arrays.asList(AbstractC1582v.f13485c, AbstractC1582v.f13484b, AbstractC1582v.f13483a), aVar);
        }
        g1 g1VarC = androidx.camera.video.internal.compat.quirk.a.c();
        InterfaceC0513v0 c2716d = new C2716d(interfaceC0513v0U, g1VarC, l10, aVar);
        if (i10 == 1) {
            aVar2 = aVar;
            c2716d = new b0.h(c2716d, AbstractC1582v.b(), Collections.singleton(C3563H.f33650d), l10.x(34), aVar2);
        } else {
            aVar2 = aVar;
        }
        InterfaceC0513v0 c2717e = new C2717e(c2716d, g1VarC);
        if (i(l10)) {
            c2717e = new b0.b(c2717e, aVar2);
        }
        return new C2718f(c2717e, l10, g1VarC);
    }

    private static boolean i(F.L l10) {
        for (C3563H c3563h : l10.b()) {
            Integer numValueOf = Integer.valueOf(c3563h.b());
            int iA = c3563h.a();
            if (numValueOf.equals(3) && iA == 10) {
                return true;
            }
        }
        return false;
    }

    @Override // Z.e0
    public b0.i a(Size size, C3563H c3563h) {
        C1576o c1576oG = g(c3563h);
        if (c1576oG == null) {
            return null;
        }
        return c1576oG.c(size);
    }

    @Override // Z.e0
    public Set b() {
        return this.f13330e.keySet();
    }

    @Override // Z.e0
    public b0.i c(AbstractC1582v abstractC1582v, C3563H c3563h) {
        C1576o c1576oG = g(c3563h);
        if (c1576oG == null) {
            return null;
        }
        return c1576oG.f(abstractC1582v);
    }

    @Override // Z.e0
    public List d(C3563H c3563h) {
        C1576o c1576oG = g(c3563h);
        return c1576oG == null ? new ArrayList() : c1576oG.g();
    }

    @Override // Z.e0
    public AbstractC1582v e(Size size, C3563H c3563h) {
        C1576o c1576oG = g(c3563h);
        return c1576oG == null ? AbstractC1582v.f13489g : c1576oG.d(size);
    }
}
