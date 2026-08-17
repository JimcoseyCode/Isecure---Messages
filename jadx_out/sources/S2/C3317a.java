package s2;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c3.InterfaceC1844a;
import j3.C2768b;

/* JADX INFO: renamed from: s2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3317a implements InterfaceC1844a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f32232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1844a f32233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC1844a f32234c;

    public C3317a(Resources resources, InterfaceC1844a interfaceC1844a, InterfaceC1844a interfaceC1844a2) {
        this.f32232a = resources;
        this.f32233b = interfaceC1844a;
        this.f32234c = interfaceC1844a2;
    }

    private static boolean c(d3.f fVar) {
        return (fVar.I0() == 1 || fVar.I0() == 0) ? false : true;
    }

    private static boolean d(d3.f fVar) {
        return (fVar.F() == 0 || fVar.F() == -1) ? false : true;
    }

    @Override // c3.InterfaceC1844a
    public Drawable a(d3.e eVar) {
        try {
            if (C2768b.d()) {
                C2768b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof d3.f) {
                d3.f fVar = (d3.f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f32232a, fVar.h0());
                if (!d(fVar) && !c(fVar)) {
                    if (C2768b.d()) {
                        C2768b.b();
                    }
                    return bitmapDrawable;
                }
                com.facebook.drawee.drawable.h hVar = new com.facebook.drawee.drawable.h(bitmapDrawable, fVar.F(), fVar.I0());
                if (C2768b.d()) {
                    C2768b.b();
                }
                return hVar;
            }
            InterfaceC1844a interfaceC1844a = this.f32233b;
            if (interfaceC1844a != null && interfaceC1844a.b(eVar)) {
                Drawable drawableA = this.f32233b.a(eVar);
                if (C2768b.d()) {
                    C2768b.b();
                }
                return drawableA;
            }
            InterfaceC1844a interfaceC1844a2 = this.f32234c;
            if (interfaceC1844a2 == null || !interfaceC1844a2.b(eVar)) {
                if (C2768b.d()) {
                    C2768b.b();
                }
                return null;
            }
            Drawable drawableA2 = this.f32234c.a(eVar);
            if (C2768b.d()) {
                C2768b.b();
            }
            return drawableA2;
        } catch (Throwable th) {
            if (C2768b.d()) {
                C2768b.b();
            }
            throw th;
        }
    }

    @Override // c3.InterfaceC1844a
    public boolean b(d3.e eVar) {
        return true;
    }
}
