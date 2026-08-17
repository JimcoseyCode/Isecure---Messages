package C2;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface a extends d {

    /* JADX INFO: renamed from: C2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface InterfaceC0023a {
    }

    int c();

    void clear();

    void d(Rect rect);

    int e();

    void g(ColorFilter colorFilter);

    void k(int i10);

    void m(InterfaceC0023a interfaceC0023a);

    boolean n(Drawable drawable, Canvas canvas, int i10);
}
