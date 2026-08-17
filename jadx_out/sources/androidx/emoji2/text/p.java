package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f17173d = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f17174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f17175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f17176c = 0;

    p(n nVar, int i10) {
        this.f17175b = nVar;
        this.f17174a = i10;
    }

    private V0.a g() {
        ThreadLocal threadLocal = f17173d;
        V0.a aVar = (V0.a) threadLocal.get();
        if (aVar == null) {
            aVar = new V0.a();
            threadLocal.set(aVar);
        }
        this.f17175b.d().j(aVar, this.f17174a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface typefaceG = this.f17175b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(typefaceG);
        canvas.drawText(this.f17175b.c(), this.f17174a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f17176c & 3;
    }

    public int e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public int i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public boolean k() {
        return (this.f17176c & 4) > 0;
    }

    public void l(boolean z10) {
        int iD = d();
        if (z10) {
            this.f17176c = iD | 4;
        } else {
            this.f17176c = iD;
        }
    }

    public void m(boolean z10) {
        int i10 = this.f17176c & 4;
        this.f17176c = z10 ? i10 | 2 : i10 | 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int iC = c();
        for (int i10 = 0; i10 < iC; i10++) {
            sb.append(Integer.toHexString(b(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
