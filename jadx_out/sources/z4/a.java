package Z4;

import android.content.Context;
import android.graphics.Color;
import e5.AbstractC2424b;
import x0.AbstractC3516d;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f13604f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f13605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f13607c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f13608d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f13609e;

    public a(Context context) {
        this(AbstractC2424b.b(context, Q4.a.f9131a0, false), X4.a.b(context, Q4.a.f9129Z, 0), X4.a.b(context, Q4.a.f9128Y, 0), X4.a.b(context, Q4.a.f9109J, 0), context.getResources().getDisplayMetrics().density);
    }

    private boolean e(int i10) {
        return AbstractC3516d.k(i10, 255) == this.f13608d;
    }

    public float a(float f10) {
        if (this.f13609e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i10, float f10) {
        int i11;
        float fA = a(f10);
        int iAlpha = Color.alpha(i10);
        int iJ = X4.a.j(AbstractC3516d.k(i10, 255), this.f13606b, fA);
        if (fA > 0.0f && (i11 = this.f13607c) != 0) {
            iJ = X4.a.i(iJ, AbstractC3516d.k(i11, f13604f));
        }
        return AbstractC3516d.k(iJ, iAlpha);
    }

    public int c(int i10, float f10) {
        return (this.f13605a && e(i10)) ? b(i10, f10) : i10;
    }

    public boolean d() {
        return this.f13605a;
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f13605a = z10;
        this.f13606b = i10;
        this.f13607c = i11;
        this.f13608d = i12;
        this.f13609e = f10;
    }
}
