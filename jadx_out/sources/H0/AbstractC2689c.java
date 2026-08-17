package h0;

import F.InterfaceC0515w0;
import android.util.Range;
import android.util.Size;
import f0.AbstractC2590m;

/* JADX INFO: renamed from: h0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2689c {
    public static InterfaceC0515w0.c a(InterfaceC0515w0.c cVar, Size size, Range range) {
        return InterfaceC0515w0.c.a(cVar.e(), cVar.i(), AbstractC2590m.f(cVar.c(), cVar.b(), cVar.b(), cVar.f(), cVar.f(), size.getWidth(), cVar.l(), size.getHeight(), cVar.h(), range), cVar.f(), size.getWidth(), size.getHeight(), cVar.j(), cVar.b(), cVar.d(), cVar.g());
    }

    public static InterfaceC0515w0.c b(InterfaceC0515w0 interfaceC0515w0) {
        if (interfaceC0515w0 == null || interfaceC0515w0.d().isEmpty()) {
            return null;
        }
        return (InterfaceC0515w0.c) interfaceC0515w0.d().get(0);
    }
}
