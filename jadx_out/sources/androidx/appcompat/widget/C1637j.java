package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.V;
import f.AbstractC2568a;
import f.AbstractC2570c;
import f.AbstractC2571d;
import f.AbstractC2572e;
import g.AbstractC2619a;
import x0.AbstractC3516d;

/* JADX INFO: renamed from: androidx.appcompat.widget.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1637j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f15005b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static C1637j f15006c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private V f15007a;

    /* JADX INFO: renamed from: androidx.appcompat.widget.j$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements V.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f15008a = {AbstractC2572e.f26794R, AbstractC2572e.f26792P, AbstractC2572e.f26796a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f15009b = {AbstractC2572e.f26810o, AbstractC2572e.f26778B, AbstractC2572e.f26815t, AbstractC2572e.f26811p, AbstractC2572e.f26812q, AbstractC2572e.f26814s, AbstractC2572e.f26813r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f15010c = {AbstractC2572e.f26791O, AbstractC2572e.f26793Q, AbstractC2572e.f26806k, AbstractC2572e.f26787K, AbstractC2572e.f26788L, AbstractC2572e.f26789M, AbstractC2572e.f26790N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f15011d = {AbstractC2572e.f26818w, AbstractC2572e.f26804i, AbstractC2572e.f26817v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f15012e = {AbstractC2572e.f26786J, AbstractC2572e.f26795S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f15013f = {AbstractC2572e.f26798c, AbstractC2572e.f26802g, AbstractC2572e.f26799d, AbstractC2572e.f26803h};

        a() {
        }

        private boolean f(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i10) {
            int iC = b0.c(context, AbstractC2568a.f26748t);
            return new ColorStateList(new int[][]{b0.f14948b, b0.f14951e, b0.f14949c, b0.f14955i}, new int[]{b0.b(context, AbstractC2568a.f26746r), AbstractC3516d.g(iC, i10), AbstractC3516d.g(iC, i10), i10});
        }

        private ColorStateList i(Context context) {
            return h(context, b0.c(context, AbstractC2568a.f26745q));
        }

        private ColorStateList j(Context context) {
            return h(context, b0.c(context, AbstractC2568a.f26746r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = b0.e(context, AbstractC2568a.f26752x);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = b0.f14948b;
                iArr2[0] = b0.b(context, AbstractC2568a.f26752x);
                iArr[1] = b0.f14952f;
                iArr2[1] = b0.c(context, AbstractC2568a.f26747s);
                iArr[2] = b0.f14955i;
                iArr2[2] = b0.c(context, AbstractC2568a.f26752x);
            } else {
                int[] iArr3 = b0.f14948b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = b0.f14952f;
                iArr2[1] = b0.c(context, AbstractC2568a.f26747s);
                iArr[2] = b0.f14955i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(V v10, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawableI = v10.i(context, AbstractC2572e.f26782F);
            Drawable drawableI2 = v10.i(context, AbstractC2572e.f26783G);
            if ((drawableI instanceof BitmapDrawable) && drawableI.getIntrinsicWidth() == dimensionPixelSize && drawableI.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableI;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableI.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableI2 instanceof BitmapDrawable) && drawableI2.getIntrinsicWidth() == dimensionPixelSize && drawableI2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableI2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableI2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableI2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = C1637j.f15005b;
            }
            drawableMutate.setColorFilter(C1637j.e(i10, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0065 A[RETURN] */
        @Override // androidx.appcompat.widget.V.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean a(Context context, int i10, Drawable drawable) {
            PorterDuff.Mode mode;
            int i11;
            boolean z10;
            int iRound;
            PorterDuff.Mode mode2 = C1637j.f15005b;
            if (f(this.f15008a, i10)) {
                i11 = AbstractC2568a.f26749u;
            } else if (f(this.f15010c, i10)) {
                i11 = AbstractC2568a.f26747s;
            } else {
                if (f(this.f15011d, i10)) {
                    mode2 = PorterDuff.Mode.MULTIPLY;
                } else {
                    if (i10 == AbstractC2572e.f26816u) {
                        iRound = Math.round(40.8f);
                        i11 = 16842800;
                        mode = mode2;
                        z10 = true;
                        if (z10) {
                            return false;
                        }
                        Drawable drawableMutate = drawable.mutate();
                        drawableMutate.setColorFilter(C1637j.e(b0.c(context, i11), mode));
                        if (iRound != -1) {
                            drawableMutate.setAlpha(iRound);
                        }
                        return true;
                    }
                    if (i10 != AbstractC2572e.f26807l) {
                        mode = mode2;
                        i11 = 0;
                        z10 = false;
                        iRound = -1;
                        if (z10) {
                        }
                    }
                }
                mode = mode2;
                iRound = -1;
                i11 = 16842801;
                z10 = true;
                if (z10) {
                }
            }
            mode = mode2;
            z10 = true;
            iRound = -1;
            if (z10) {
            }
        }

        @Override // androidx.appcompat.widget.V.c
        public PorterDuff.Mode b(int i10) {
            if (i10 == AbstractC2572e.f26784H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.V.c
        public Drawable c(V v10, Context context, int i10) {
            if (i10 == AbstractC2572e.f26805j) {
                return new LayerDrawable(new Drawable[]{v10.i(context, AbstractC2572e.f26804i), v10.i(context, AbstractC2572e.f26806k)});
            }
            if (i10 == AbstractC2572e.f26820y) {
                return l(v10, context, AbstractC2571d.f26770g);
            }
            if (i10 == AbstractC2572e.f26819x) {
                return l(v10, context, AbstractC2571d.f26771h);
            }
            if (i10 == AbstractC2572e.f26821z) {
                return l(v10, context, AbstractC2571d.f26772i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.V.c
        public ColorStateList d(Context context, int i10) {
            if (i10 == AbstractC2572e.f26808m) {
                return AbstractC2619a.a(context, AbstractC2570c.f26760e);
            }
            if (i10 == AbstractC2572e.f26785I) {
                return AbstractC2619a.a(context, AbstractC2570c.f26763h);
            }
            if (i10 == AbstractC2572e.f26784H) {
                return k(context);
            }
            if (i10 == AbstractC2572e.f26801f) {
                return j(context);
            }
            if (i10 == AbstractC2572e.f26797b) {
                return g(context);
            }
            if (i10 == AbstractC2572e.f26800e) {
                return i(context);
            }
            if (i10 == AbstractC2572e.f26780D || i10 == AbstractC2572e.f26781E) {
                return AbstractC2619a.a(context, AbstractC2570c.f26762g);
            }
            if (f(this.f15009b, i10)) {
                return b0.e(context, AbstractC2568a.f26749u);
            }
            if (f(this.f15012e, i10)) {
                return AbstractC2619a.a(context, AbstractC2570c.f26759d);
            }
            if (f(this.f15013f, i10)) {
                return AbstractC2619a.a(context, AbstractC2570c.f26758c);
            }
            if (i10 == AbstractC2572e.f26777A) {
                return AbstractC2619a.a(context, AbstractC2570c.f26761f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.V.c
        public boolean e(Context context, int i10, Drawable drawable) {
            if (i10 == AbstractC2572e.f26779C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), b0.c(context, AbstractC2568a.f26749u), C1637j.f15005b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), b0.c(context, AbstractC2568a.f26749u), C1637j.f15005b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), b0.c(context, AbstractC2568a.f26747s), C1637j.f15005b);
                return true;
            }
            if (i10 != AbstractC2572e.f26820y && i10 != AbstractC2572e.f26819x && i10 != AbstractC2572e.f26821z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), b0.b(context, AbstractC2568a.f26749u), C1637j.f15005b);
            m(layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress), b0.c(context, AbstractC2568a.f26747s), C1637j.f15005b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), b0.c(context, AbstractC2568a.f26747s), C1637j.f15005b);
            return true;
        }
    }

    public static synchronized C1637j b() {
        try {
            if (f15006c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f15006c;
    }

    public static synchronized PorterDuffColorFilter e(int i10, PorterDuff.Mode mode) {
        return V.k(i10, mode);
    }

    public static synchronized void h() {
        if (f15006c == null) {
            C1637j c1637j = new C1637j();
            f15006c = c1637j;
            c1637j.f15007a = V.g();
            f15006c.f15007a.t(new a());
        }
    }

    static void i(Drawable drawable, d0 d0Var, int[] iArr) {
        V.v(drawable, d0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i10) {
        return this.f15007a.i(context, i10);
    }

    synchronized Drawable d(Context context, int i10, boolean z10) {
        return this.f15007a.j(context, i10, z10);
    }

    synchronized ColorStateList f(Context context, int i10) {
        return this.f15007a.l(context, i10);
    }

    public synchronized void g(Context context) {
        this.f15007a.r(context);
    }
}
