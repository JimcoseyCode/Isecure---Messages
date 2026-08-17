package Z;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import Z.AbstractC1582v;
import android.util.Size;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import y.AbstractC3583h0;

/* JADX INFO: renamed from: Z.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C1576o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f13456a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TreeMap f13457b = new TreeMap(new H.e());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b0.i f13458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b0.i f13459d;

    public C1576o(InterfaceC0513v0 interfaceC0513v0, int i10) {
        for (AbstractC1582v abstractC1582v : AbstractC1582v.b()) {
            InterfaceC0515w0 interfaceC0515w0E = e(abstractC1582v, interfaceC0513v0, i10);
            if (interfaceC0515w0E != null) {
                AbstractC3583h0.a("CapabilitiesByQuality", "profiles = " + interfaceC0515w0E);
                b0.i iVarH = h(interfaceC0515w0E);
                if (iVarH == null) {
                    AbstractC3583h0.l("CapabilitiesByQuality", "EncoderProfiles of quality " + abstractC1582v + " has no video validated profiles.");
                } else {
                    this.f13457b.put(iVarH.k().k(), abstractC1582v);
                    this.f13456a.put(abstractC1582v, iVarH);
                }
            }
        }
        if (this.f13456a.isEmpty()) {
            AbstractC3583h0.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f13459d = null;
            this.f13458c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f13456a.values());
            this.f13458c = (b0.i) arrayDeque.peekFirst();
            this.f13459d = (b0.i) arrayDeque.peekLast();
        }
    }

    private static void a(AbstractC1582v abstractC1582v) {
        H0.g.b(AbstractC1582v.a(abstractC1582v), "Unknown quality: " + abstractC1582v);
    }

    public static boolean b(InterfaceC0513v0 interfaceC0513v0, int i10) {
        return !new C1576o(interfaceC0513v0, i10).g().isEmpty();
    }

    private InterfaceC0515w0 e(AbstractC1582v abstractC1582v, InterfaceC0513v0 interfaceC0513v0, int i10) {
        H0.g.j(abstractC1582v instanceof AbstractC1582v.b, "Currently only support ConstantQuality");
        return interfaceC0513v0.b(((AbstractC1582v.b) abstractC1582v).e(i10));
    }

    private b0.i h(InterfaceC0515w0 interfaceC0515w0) {
        if (interfaceC0515w0.d().isEmpty()) {
            return null;
        }
        return b0.i.i(interfaceC0515w0);
    }

    public b0.i c(Size size) {
        AbstractC1582v abstractC1582vD = d(size);
        AbstractC3583h0.a("CapabilitiesByQuality", "Using supported quality of " + abstractC1582vD + " for size " + size);
        if (abstractC1582vD == AbstractC1582v.f13489g) {
            return null;
        }
        b0.i iVarF = f(abstractC1582vD);
        if (iVarF != null) {
            return iVarF;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    public AbstractC1582v d(Size size) {
        AbstractC1582v abstractC1582v = (AbstractC1582v) O.d.a(size, this.f13457b);
        return abstractC1582v != null ? abstractC1582v : AbstractC1582v.f13489g;
    }

    public b0.i f(AbstractC1582v abstractC1582v) {
        a(abstractC1582v);
        return abstractC1582v == AbstractC1582v.f13488f ? this.f13458c : abstractC1582v == AbstractC1582v.f13487e ? this.f13459d : (b0.i) this.f13456a.get(abstractC1582v);
    }

    public List g() {
        return new ArrayList(this.f13456a.keySet());
    }
}
