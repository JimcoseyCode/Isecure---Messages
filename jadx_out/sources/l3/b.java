package l3;

import android.graphics.Bitmap;
import g2.AbstractC2662a;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f29427a = new b();

    private b() {
    }

    public static final boolean a(InterfaceC2866a interfaceC2866a, AbstractC2662a abstractC2662a) {
        if (interfaceC2866a == null || abstractC2662a == null) {
            return false;
        }
        Object objJ = abstractC2662a.J();
        AbstractC2855l.f(objJ, "get(...)");
        Bitmap bitmap = (Bitmap) objJ;
        if (interfaceC2866a.a()) {
            bitmap.setHasAlpha(true);
        }
        interfaceC2866a.b(bitmap);
        return true;
    }
}
