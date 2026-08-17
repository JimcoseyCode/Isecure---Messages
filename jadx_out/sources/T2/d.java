package T2;

import R2.b;
import R2.e;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import g2.AbstractC2662a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final R2.a f10417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f10418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Paint f10419c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f10420d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10421a;

        static {
            int[] iArr = new int[c.values().length];
            f10421a = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10421a[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10421a[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10421a[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface b {
        void a(int i10, Bitmap bitmap);

        AbstractC2662a b(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(R2.a aVar, boolean z10, b bVar) {
        this.f10417a = aVar;
        this.f10418b = bVar;
        this.f10420d = z10;
        Paint paint = new Paint();
        this.f10419c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    private void a(Canvas canvas, R2.b bVar) {
        canvas.drawRect(bVar.f9960b, bVar.f9961c, r0 + bVar.f9962d, r1 + bVar.f9963e, this.f10419c);
    }

    private c b(int i10) {
        R2.b bVarC = this.f10417a.c(i10);
        b.EnumC0104b enumC0104b = bVarC.f9965g;
        return enumC0104b == b.EnumC0104b.DISPOSE_DO_NOT ? c.REQUIRED : enumC0104b == b.EnumC0104b.DISPOSE_TO_BACKGROUND ? c(bVarC) ? c.NOT_REQUIRED : c.REQUIRED : enumC0104b == b.EnumC0104b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    private boolean c(R2.b bVar) {
        return bVar.f9960b == 0 && bVar.f9961c == 0 && bVar.f9962d == this.f10417a.j() && bVar.f9963e == this.f10417a.h();
    }

    private boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        R2.b bVarC = this.f10417a.c(i10);
        R2.b bVarC2 = this.f10417a.c(i10 - 1);
        if (bVarC.f9964f == b.a.NO_BLEND && c(bVarC)) {
            return true;
        }
        return bVarC2.f9965g == b.EnumC0104b.DISPOSE_TO_BACKGROUND && c(bVarC2);
    }

    private void e(Bitmap bitmap) {
        e eVarK = this.f10417a.k();
        if (eVarK == null) {
            return;
        }
        eVarK.c();
    }

    private int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.f10421a[b(i10).ordinal()];
            if (i11 == 1) {
                R2.b bVarC = this.f10417a.c(i10);
                AbstractC2662a abstractC2662aB = this.f10418b.b(i10);
                if (abstractC2662aB != null) {
                    try {
                        canvas.drawBitmap((Bitmap) abstractC2662aB.J(), 0.0f, 0.0f, (Paint) null);
                        if (bVarC.f9965g == b.EnumC0104b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, bVarC);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f10420d) {
                            abstractC2662aB.close();
                        }
                    }
                }
                if (d(i10)) {
                    return i10;
                }
                i10--;
            } else {
                if (i11 == 2) {
                    return i10 + 1;
                }
                if (i11 == 3) {
                    return i10;
                }
                i10--;
            }
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f10417a.i(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        if (this.f10420d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int iF = !d(i10) ? f(i10 - 1, canvas) : i10; iF < i10; iF++) {
            R2.b bVarC = this.f10417a.c(iF);
            b.EnumC0104b enumC0104b = bVarC.f9965g;
            if (enumC0104b != b.EnumC0104b.DISPOSE_TO_PREVIOUS) {
                if (bVarC.f9964f == b.a.NO_BLEND) {
                    a(canvas, bVarC);
                }
                this.f10417a.e(iF, canvas);
                this.f10418b.a(iF, bitmap);
                if (enumC0104b == b.EnumC0104b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, bVarC);
                }
            }
        }
        R2.b bVarC2 = this.f10417a.c(i10);
        if (bVarC2.f9964f == b.a.NO_BLEND) {
            a(canvas, bVarC2);
        }
        this.f10417a.e(i10, canvas);
        e(bitmap);
    }
}
