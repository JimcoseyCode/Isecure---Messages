package C2;

import C2.a;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b implements C2.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f492e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C2.a f493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f494b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Rect f496d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(C2.a aVar) {
        this.f493a = aVar;
    }

    @Override // C2.d
    public int a() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.a();
    }

    @Override // C2.d
    public int b() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.b();
    }

    @Override // C2.a
    public int c() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return -1;
        }
        AbstractC2855l.d(aVar);
        return aVar.c();
    }

    @Override // C2.a
    public void clear() {
        C2.a aVar = this.f493a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // C2.a
    public void d(Rect bounds) {
        AbstractC2855l.g(bounds, "bounds");
        C2.a aVar = this.f493a;
        if (aVar != null) {
            aVar.d(bounds);
        }
        this.f496d = bounds;
    }

    @Override // C2.a
    public int e() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return -1;
        }
        AbstractC2855l.d(aVar);
        return aVar.e();
    }

    @Override // C2.a
    public void g(ColorFilter colorFilter) {
        C2.a aVar = this.f493a;
        if (aVar != null) {
            aVar.g(colorFilter);
        }
        this.f495c = colorFilter;
    }

    @Override // C2.d
    public int h() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.h();
    }

    @Override // C2.d
    public int i() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.i();
    }

    @Override // C2.d
    public int j(int i10) {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.j(i10);
    }

    @Override // C2.a
    public void k(int i10) {
        C2.a aVar = this.f493a;
        if (aVar != null) {
            aVar.k(i10);
        }
        this.f494b = i10;
    }

    @Override // C2.d
    public int l() {
        C2.a aVar = this.f493a;
        if (aVar == null) {
            return 0;
        }
        AbstractC2855l.d(aVar);
        return aVar.l();
    }

    @Override // C2.a
    public void m(a.InterfaceC0023a interfaceC0023a) {
        C2.a aVar = this.f493a;
        if (aVar != null) {
            aVar.m(interfaceC0023a);
        }
    }

    @Override // C2.a
    public boolean n(Drawable parent, Canvas canvas, int i10) {
        AbstractC2855l.g(parent, "parent");
        AbstractC2855l.g(canvas, "canvas");
        C2.a aVar = this.f493a;
        return aVar != null && aVar.n(parent, canvas, i10);
    }
}
