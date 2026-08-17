package i0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import F.g1;
import android.util.Size;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: i0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C2717e implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f28659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g1 f28660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f28661e = new HashMap();

    public C2717e(InterfaceC0513v0 interfaceC0513v0, g1 g1Var) {
        this.f28659c = interfaceC0513v0;
        this.f28660d = g1Var;
    }

    private InterfaceC0515w0 c(InterfaceC0515w0 interfaceC0515w0, Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator it = interfaceC0515w0.d().iterator();
        while (it.hasNext()) {
            arrayList.add(d((InterfaceC0515w0.c) it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0515w0.b.h(interfaceC0515w0.a(), interfaceC0515w0.b(), interfaceC0515w0.c(), arrayList);
    }

    private static InterfaceC0515w0.c d(InterfaceC0515w0.c cVar, Size size) {
        return InterfaceC0515w0.c.a(cVar.e(), cVar.i(), cVar.c(), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    private Size e(int i10) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.f28660d.c(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.g(i10);
            }
        }
        return null;
    }

    private InterfaceC0515w0 f(int i10) {
        InterfaceC0515w0 interfaceC0515w0C;
        if (this.f28661e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f28661e.get(Integer.valueOf(i10));
        }
        if (this.f28659c.a(i10)) {
            InterfaceC0515w0 interfaceC0515w0B = this.f28659c.b(i10);
            Objects.requireNonNull(interfaceC0515w0B);
            interfaceC0515w0C = interfaceC0515w0B;
            Size sizeE = e(i10);
            if (sizeE != null) {
                interfaceC0515w0C = c(interfaceC0515w0C, sizeE);
            }
        } else {
            interfaceC0515w0C = null;
        }
        this.f28661e.put(Integer.valueOf(i10), interfaceC0515w0C);
        return interfaceC0515w0C;
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return this.f28659c.a(i10) && f(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return f(i10);
    }
}
