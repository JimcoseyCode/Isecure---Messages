package b0;

import F.InterfaceC0513v0;
import F.InterfaceC0515w0;
import h0.AbstractC2688b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import y.C3563H;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC0513v0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0513v0 f18622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C3563H f18623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f18624e = new HashMap();

    public e(InterfaceC0513v0 interfaceC0513v0, C3563H c3563h) {
        this.f18622c = interfaceC0513v0;
        this.f18623d = c3563h;
    }

    private static InterfaceC0515w0 c(InterfaceC0515w0 interfaceC0515w0, C3563H c3563h) {
        if (interfaceC0515w0 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (InterfaceC0515w0.c cVar : interfaceC0515w0.d()) {
            if (AbstractC2688b.f(cVar, c3563h)) {
                arrayList.add(cVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return InterfaceC0515w0.b.h(interfaceC0515w0.a(), interfaceC0515w0.b(), interfaceC0515w0.c(), arrayList);
    }

    private InterfaceC0515w0 d(int i10) {
        if (this.f18624e.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC0515w0) this.f18624e.get(Integer.valueOf(i10));
        }
        if (!this.f18622c.a(i10)) {
            return null;
        }
        InterfaceC0515w0 interfaceC0515w0C = c(this.f18622c.b(i10), this.f18623d);
        this.f18624e.put(Integer.valueOf(i10), interfaceC0515w0C);
        return interfaceC0515w0C;
    }

    @Override // F.InterfaceC0513v0
    public boolean a(int i10) {
        return this.f18622c.a(i10) && d(i10) != null;
    }

    @Override // F.InterfaceC0513v0
    public InterfaceC0515w0 b(int i10) {
        return d(i10);
    }
}
