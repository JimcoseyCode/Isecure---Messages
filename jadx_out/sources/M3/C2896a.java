package m3;

import android.graphics.drawable.Drawable;
import c3.InterfaceC1844a;
import d3.e;
import d3.g;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: m3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896a implements InterfaceC1844a {
    @Override // c3.InterfaceC1844a
    public Drawable a(e image) {
        AbstractC2855l.g(image, "image");
        g gVar = image instanceof g ? (g) image : null;
        if (gVar != null) {
            return gVar.U();
        }
        return null;
    }

    @Override // c3.InterfaceC1844a
    public boolean b(e image) {
        AbstractC2855l.g(image, "image");
        return image instanceof g;
    }
}
