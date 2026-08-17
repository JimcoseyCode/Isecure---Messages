package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.text.TextAttributeProps;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m0.C2892a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w0.AbstractC3461h;
import w0.C3457d;
import w0.k;
import x0.g;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final PorterDuff.Mode f18457q = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f18458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f18459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ColorFilter f18460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f18461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Drawable.ConstantState f18463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float[] f18464n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Matrix f18465o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f18466p;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class b extends AbstractC0194f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f18493b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f18492a = x0.g.d(string2);
            }
            this.f18494c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0194f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f18430d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f18514b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f18515c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f18516d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f18517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f18518f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f18519g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f18520h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f18521i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f18522j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f18523k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f18524l;

        public h(h hVar) {
            this.f18515c = null;
            this.f18516d = f.f18457q;
            if (hVar != null) {
                this.f18513a = hVar.f18513a;
                g gVar = new g(hVar.f18514b);
                this.f18514b = gVar;
                if (hVar.f18514b.f18501e != null) {
                    gVar.f18501e = new Paint(hVar.f18514b.f18501e);
                }
                if (hVar.f18514b.f18500d != null) {
                    this.f18514b.f18500d = new Paint(hVar.f18514b.f18500d);
                }
                this.f18515c = hVar.f18515c;
                this.f18516d = hVar.f18516d;
                this.f18517e = hVar.f18517e;
            }
        }

        public boolean a(int i10, int i11) {
            return i10 == this.f18518f.getWidth() && i11 == this.f18518f.getHeight();
        }

        public boolean b() {
            return !this.f18523k && this.f18519g == this.f18515c && this.f18520h == this.f18516d && this.f18522j == this.f18517e && this.f18521i == this.f18514b.getRootAlpha();
        }

        public void c(int i10, int i11) {
            if (this.f18518f == null || !a(i10, i11)) {
                this.f18518f = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                this.f18523k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f18518f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f18524l == null) {
                Paint paint = new Paint();
                this.f18524l = paint;
                paint.setFilterBitmap(true);
            }
            this.f18524l.setAlpha(this.f18514b.getRootAlpha());
            this.f18524l.setColorFilter(colorFilter);
            return this.f18524l;
        }

        public boolean f() {
            return this.f18514b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f18514b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f18513a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f18514b.g(iArr);
            this.f18523k |= zG;
            return zG;
        }

        public void i() {
            this.f18519g = this.f18515c;
            this.f18520h = this.f18516d;
            this.f18521i = this.f18514b.getRootAlpha();
            this.f18522j = this.f18517e;
            this.f18523k = false;
        }

        public void j(int i10, int i11) {
            this.f18518f.eraseColor(0);
            this.f18514b.b(new Canvas(this.f18518f), i10, i11, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f18515c = null;
            this.f18516d = f.f18457q;
            this.f18514b = new g();
        }
    }

    f() {
        this.f18462l = true;
        this.f18464n = new float[9];
        this.f18465o = new Matrix();
        this.f18466p = new Rect();
        this.f18458h = new h();
    }

    static int a(int i10, float f10) {
        return (i10 & 16777215) | (((int) (Color.alpha(i10) * f10)) << 24);
    }

    public static f b(Resources resources, int i10, Resources.Theme theme) {
        f fVar = new f();
        fVar.f18456g = AbstractC3461h.f(resources, i10, theme);
        fVar.f18463m = new i(fVar.f18456g.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f18458h;
        g gVar = hVar.f18514b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f18504h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z10 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18480b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f18512p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f18513a = cVar.f18495d | hVar.f18513a;
                    z10 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18480b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f18512p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f18513a = bVar.f18495d | hVar.f18513a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f18480b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f18512p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f18513a = dVar2.f18489k | hVar.f18513a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z10) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && AbstractC3606a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f18458h;
        g gVar = hVar.f18514b;
        hVar.f18516d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f18515c = colorStateListC;
        }
        hVar.f18517e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f18517e);
        gVar.f18507k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f18507k);
        float f10 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f18508l);
        gVar.f18508l = f10;
        if (gVar.f18507k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f10 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f18505i = typedArray.getDimension(3, gVar.f18505i);
        float dimension = typedArray.getDimension(2, gVar.f18506j);
        gVar.f18506j = dimension;
        if (gVar.f18505i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f18510n = string;
            gVar.f18512p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f18458h.f18514b.f18512p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f18456g;
        if (drawable == null) {
            return false;
        }
        AbstractC3606a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f18466p);
        if (this.f18466p.width() <= 0 || this.f18466p.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f18460j;
        if (colorFilter == null) {
            colorFilter = this.f18459i;
        }
        canvas.getMatrix(this.f18465o);
        this.f18465o.getValues(this.f18464n);
        float fAbs = Math.abs(this.f18464n[0]);
        float fAbs2 = Math.abs(this.f18464n[4]);
        float fAbs3 = Math.abs(this.f18464n[1]);
        float fAbs4 = Math.abs(this.f18464n[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f18466p.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f18466p.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f18466p;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f18466p.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f18466p.offsetTo(0, 0);
        this.f18458h.c(iMin, iMin2);
        if (!this.f18462l) {
            this.f18458h.j(iMin, iMin2);
        } else if (!this.f18458h.b()) {
            this.f18458h.j(iMin, iMin2);
            this.f18458h.i();
        }
        this.f18458h.d(canvas, colorFilter, this.f18466p);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z10) {
        this.f18462l = z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.d(drawable) : this.f18458h.f18514b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f18458h.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.e(drawable) : this.f18460j;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f18456g != null) {
            return new i(this.f18456g.getConstantState());
        }
        this.f18458h.f18513a = getChangingConfigurations();
        return this.f18458h;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f18458h.f18514b.f18506j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f18458h.f18514b.f18505i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.h(drawable) : this.f18458h.f18517e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f18458h;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f18458h.f18515c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f18461k && super.mutate() == this) {
            this.f18458h = new h(this.f18458h);
            this.f18461k = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f18458h;
        ColorStateList colorStateList = hVar.f18515c;
        if (colorStateList == null || (mode = hVar.f18516d) == null) {
            z10 = false;
        } else {
            this.f18459i = i(this.f18459i, colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z10;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f18458h.f18514b.getRootAlpha() != i10) {
            this.f18458h.f18514b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.j(drawable, z10);
        } else {
            this.f18458h.f18517e = z10;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i10) {
        super.setChangingConfigurations(i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i10, PorterDuff.Mode mode) {
        super.setColorFilter(i10, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z10) {
        super.setFilterBitmap(z10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f10, float f11) {
        super.setHotspot(f10, f11);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i10, int i11, int i12, int i13) {
        super.setHotspotBounds(i10, i11, i12, i13);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.n(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f18458h;
        if (hVar.f18515c != colorStateList) {
            hVar.f18515c = colorStateList;
            this.f18459i = i(this.f18459i, colorStateList, hVar.f18516d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.p(drawable, mode);
            return;
        }
        h hVar = this.f18458h;
        if (hVar.f18516d != mode) {
            hVar.f18516d = mode;
            this.f18459i = i(this.f18459i, hVar.f18515c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f18525a;

        public i(Drawable.ConstantState constantState) {
            this.f18525a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f18525a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f18525a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f18456g = (VectorDrawable) this.f18525a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f18456g = (VectorDrawable) this.f18525a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f18456g = (VectorDrawable) this.f18525a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18460j = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static abstract class AbstractC0194f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected g.b[] f18492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f18493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f18494c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f18495d;

        public AbstractC0194f() {
            super();
            this.f18492a = null;
            this.f18494c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            g.b[] bVarArr = this.f18492a;
            if (bVarArr != null) {
                g.b.h(bVarArr, path);
            }
        }

        public g.b[] getPathData() {
            return this.f18492a;
        }

        public String getPathName() {
            return this.f18493b;
        }

        public void setPathData(g.b[] bVarArr) {
            if (x0.g.b(this.f18492a, bVarArr)) {
                x0.g.k(this.f18492a, bVarArr);
            } else {
                this.f18492a = x0.g.f(bVarArr);
            }
        }

        public AbstractC0194f(AbstractC0194f abstractC0194f) {
            super();
            this.f18492a = null;
            this.f18494c = 0;
            this.f18493b = abstractC0194f.f18493b;
            this.f18495d = abstractC0194f.f18495d;
            this.f18492a = x0.g.f(abstractC0194f.f18492a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f18458h;
        hVar.f18514b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f18427a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f18513a = getChangingConfigurations();
        hVar.f18523k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f18459i = i(this.f18459i, hVar.f18515c, hVar.f18516d);
    }

    f(h hVar) {
        this.f18462l = true;
        this.f18464n = new float[9];
        this.f18465o = new Matrix();
        this.f18466p = new Rect();
        this.f18458h = hVar;
        this.f18459i = i(this.f18459i, hVar.f18515c, hVar.f18516d);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class c extends AbstractC0194f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f18467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        C3457d f18468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f18469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        C3457d f18470h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f18471i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f18472j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f18473k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f18474l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f18475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f18476n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f18477o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f18478p;

        c() {
            this.f18469g = 0.0f;
            this.f18471i = 1.0f;
            this.f18472j = 1.0f;
            this.f18473k = 0.0f;
            this.f18474l = 1.0f;
            this.f18475m = 0.0f;
            this.f18476n = Paint.Cap.BUTT;
            this.f18477o = Paint.Join.MITER;
            this.f18478p = 4.0f;
        }

        private Paint.Cap e(int i10, Paint.Cap cap) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i10, Paint.Join join) {
            return i10 != 0 ? i10 != 1 ? i10 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f18467e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f18493b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f18492a = x0.g.d(string2);
                }
                this.f18470h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f18472j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f18472j);
                this.f18476n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f18476n);
                this.f18477o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f18477o);
                this.f18478p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f18478p);
                this.f18468f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f18471i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f18471i);
                this.f18469g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f18469g);
                this.f18474l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f18474l);
                this.f18475m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f18475m);
                this.f18473k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f18473k);
                this.f18494c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f18494c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f18470h.i() || this.f18468f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f18468f.j(iArr) | this.f18470h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f18429c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f18472j;
        }

        int getFillColor() {
            return this.f18470h.e();
        }

        float getStrokeAlpha() {
            return this.f18471i;
        }

        int getStrokeColor() {
            return this.f18468f.e();
        }

        float getStrokeWidth() {
            return this.f18469g;
        }

        float getTrimPathEnd() {
            return this.f18474l;
        }

        float getTrimPathOffset() {
            return this.f18475m;
        }

        float getTrimPathStart() {
            return this.f18473k;
        }

        void setFillAlpha(float f10) {
            this.f18472j = f10;
        }

        void setFillColor(int i10) {
            this.f18470h.k(i10);
        }

        void setStrokeAlpha(float f10) {
            this.f18471i = f10;
        }

        void setStrokeColor(int i10) {
            this.f18468f.k(i10);
        }

        void setStrokeWidth(float f10) {
            this.f18469g = f10;
        }

        void setTrimPathEnd(float f10) {
            this.f18474l = f10;
        }

        void setTrimPathOffset(float f10) {
            this.f18475m = f10;
        }

        void setTrimPathStart(float f10) {
            this.f18473k = f10;
        }

        c(c cVar) {
            super(cVar);
            this.f18469g = 0.0f;
            this.f18471i = 1.0f;
            this.f18472j = 1.0f;
            this.f18473k = 0.0f;
            this.f18474l = 1.0f;
            this.f18475m = 0.0f;
            this.f18476n = Paint.Cap.BUTT;
            this.f18477o = Paint.Join.MITER;
            this.f18478p = 4.0f;
            this.f18467e = cVar.f18467e;
            this.f18468f = cVar.f18468f;
            this.f18469g = cVar.f18469g;
            this.f18471i = cVar.f18471i;
            this.f18470h = cVar.f18470h;
            this.f18494c = cVar.f18494c;
            this.f18472j = cVar.f18472j;
            this.f18473k = cVar.f18473k;
            this.f18474l = cVar.f18474l;
            this.f18475m = cVar.f18475m;
            this.f18476n = cVar.f18476n;
            this.f18477o = cVar.f18477o;
            this.f18478p = cVar.f18478p;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f18496q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f18497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f18498b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f18499c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f18500d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f18501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f18502f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f18503g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f18504h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f18505i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f18506j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f18507k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f18508l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f18509m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f18510n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f18511o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final C2892a f18512p;

        public g() {
            this.f18499c = new Matrix();
            this.f18505i = 0.0f;
            this.f18506j = 0.0f;
            this.f18507k = 0.0f;
            this.f18508l = 0.0f;
            this.f18509m = 255;
            this.f18510n = null;
            this.f18511o = null;
            this.f18512p = new C2892a();
            this.f18504h = new d();
            this.f18497a = new Path();
            this.f18498b = new Path();
        }

        private static float a(float f10, float f11, float f12, float f13) {
            return (f10 * f13) - (f11 * f12);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f18479a.set(matrix);
            dVar2.f18479a.preConcat(dVar2.f18488j);
            canvas.save();
            int i12 = 0;
            while (i12 < dVar2.f18480b.size()) {
                e eVar = (e) dVar2.f18480b.get(i12);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f18479a, canvas, i10, i11, colorFilter);
                } else if (eVar instanceof AbstractC0194f) {
                    d(dVar2, (AbstractC0194f) eVar, canvas, i10, i11, colorFilter);
                }
                i12++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0194f abstractC0194f, Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            float f10 = i10 / this.f18507k;
            float f11 = i11 / this.f18508l;
            float fMin = Math.min(f10, f11);
            Matrix matrix = dVar.f18479a;
            this.f18499c.set(matrix);
            this.f18499c.postScale(f10, f11);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0194f.d(this.f18497a);
            Path path = this.f18497a;
            this.f18498b.reset();
            if (abstractC0194f.c()) {
                this.f18498b.setFillType(abstractC0194f.f18494c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f18498b.addPath(path, this.f18499c);
                canvas.clipPath(this.f18498b);
                return;
            }
            c cVar = (c) abstractC0194f;
            float f12 = cVar.f18473k;
            if (f12 != 0.0f || cVar.f18474l != 1.0f) {
                float f13 = cVar.f18475m;
                float f14 = (f12 + f13) % 1.0f;
                float f15 = (cVar.f18474l + f13) % 1.0f;
                if (this.f18502f == null) {
                    this.f18502f = new PathMeasure();
                }
                this.f18502f.setPath(this.f18497a, false);
                float length = this.f18502f.getLength();
                float f16 = f14 * length;
                float f17 = f15 * length;
                path.reset();
                if (f16 > f17) {
                    this.f18502f.getSegment(f16, length, path, true);
                    this.f18502f.getSegment(0.0f, f17, path, true);
                } else {
                    this.f18502f.getSegment(f16, f17, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f18498b.addPath(path, this.f18499c);
            if (cVar.f18470h.l()) {
                C3457d c3457d = cVar.f18470h;
                if (this.f18501e == null) {
                    Paint paint = new Paint(1);
                    this.f18501e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f18501e;
                if (c3457d.h()) {
                    Shader shaderF = c3457d.f();
                    shaderF.setLocalMatrix(this.f18499c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f18472j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(f.a(c3457d.e(), cVar.f18472j));
                }
                paint2.setColorFilter(colorFilter);
                this.f18498b.setFillType(cVar.f18494c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f18498b, paint2);
            }
            if (cVar.f18468f.l()) {
                C3457d c3457d2 = cVar.f18468f;
                if (this.f18500d == null) {
                    Paint paint3 = new Paint(1);
                    this.f18500d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f18500d;
                Paint.Join join = cVar.f18477o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f18476n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f18478p);
                if (c3457d2.h()) {
                    Shader shaderF2 = c3457d2.f();
                    shaderF2.setLocalMatrix(this.f18499c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f18471i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(f.a(c3457d2.e(), cVar.f18471i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f18469g * fMin * fE);
                canvas.drawPath(this.f18498b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i10, int i11, ColorFilter colorFilter) {
            c(this.f18504h, f18496q, canvas, i10, i11, colorFilter);
        }

        public boolean f() {
            if (this.f18511o == null) {
                this.f18511o = Boolean.valueOf(this.f18504h.a());
            }
            return this.f18511o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f18504h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f18509m;
        }

        public void setAlpha(float f10) {
            setRootAlpha((int) (f10 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f18509m = i10;
        }

        public g(g gVar) {
            this.f18499c = new Matrix();
            this.f18505i = 0.0f;
            this.f18506j = 0.0f;
            this.f18507k = 0.0f;
            this.f18508l = 0.0f;
            this.f18509m = 255;
            this.f18510n = null;
            this.f18511o = null;
            C2892a c2892a = new C2892a();
            this.f18512p = c2892a;
            this.f18504h = new d(gVar.f18504h, c2892a);
            this.f18497a = new Path(gVar.f18497a);
            this.f18498b = new Path(gVar.f18498b);
            this.f18505i = gVar.f18505i;
            this.f18506j = gVar.f18506j;
            this.f18507k = gVar.f18507k;
            this.f18508l = gVar.f18508l;
            this.f18503g = gVar.f18503g;
            this.f18509m = gVar.f18509m;
            this.f18510n = gVar.f18510n;
            String str = gVar.f18510n;
            if (str != null) {
                c2892a.put(str, this);
            }
            this.f18511o = gVar.f18511o;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f18479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList f18480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f18481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f18482d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f18483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f18484f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f18485g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f18486h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f18487i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f18488j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f18489k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f18490l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f18491m;

        public d(d dVar, C2892a c2892a) {
            AbstractC0194f bVar;
            super();
            this.f18479a = new Matrix();
            this.f18480b = new ArrayList();
            this.f18481c = 0.0f;
            this.f18482d = 0.0f;
            this.f18483e = 0.0f;
            this.f18484f = 1.0f;
            this.f18485g = 1.0f;
            this.f18486h = 0.0f;
            this.f18487i = 0.0f;
            Matrix matrix = new Matrix();
            this.f18488j = matrix;
            this.f18491m = null;
            this.f18481c = dVar.f18481c;
            this.f18482d = dVar.f18482d;
            this.f18483e = dVar.f18483e;
            this.f18484f = dVar.f18484f;
            this.f18485g = dVar.f18485g;
            this.f18486h = dVar.f18486h;
            this.f18487i = dVar.f18487i;
            this.f18490l = dVar.f18490l;
            String str = dVar.f18491m;
            this.f18491m = str;
            this.f18489k = dVar.f18489k;
            if (str != null) {
                c2892a.put(str, this);
            }
            matrix.set(dVar.f18488j);
            ArrayList arrayList = dVar.f18480b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof d) {
                    this.f18480b.add(new d((d) obj, c2892a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f18480b.add(bVar);
                    Object obj2 = bVar.f18493b;
                    if (obj2 != null) {
                        c2892a.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f18488j.reset();
            this.f18488j.postTranslate(-this.f18482d, -this.f18483e);
            this.f18488j.postScale(this.f18484f, this.f18485g);
            this.f18488j.postRotate(this.f18481c, 0.0f, 0.0f);
            this.f18488j.postTranslate(this.f18486h + this.f18482d, this.f18487i + this.f18483e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f18490l = null;
            this.f18481c = k.f(typedArray, xmlPullParser, ViewProps.ROTATION, 5, this.f18481c);
            this.f18482d = typedArray.getFloat(1, this.f18482d);
            this.f18483e = typedArray.getFloat(2, this.f18483e);
            this.f18484f = k.f(typedArray, xmlPullParser, ViewProps.SCALE_X, 3, this.f18484f);
            this.f18485g = k.f(typedArray, xmlPullParser, ViewProps.SCALE_Y, 4, this.f18485g);
            this.f18486h = k.f(typedArray, xmlPullParser, ViewProps.TRANSLATE_X, 6, this.f18486h);
            this.f18487i = k.f(typedArray, xmlPullParser, ViewProps.TRANSLATE_Y, 7, this.f18487i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f18491m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i10 = 0; i10 < this.f18480b.size(); i10++) {
                if (((e) this.f18480b.get(i10)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i10 = 0; i10 < this.f18480b.size(); i10++) {
                zB |= ((e) this.f18480b.get(i10)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f18428b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f18491m;
        }

        public Matrix getLocalMatrix() {
            return this.f18488j;
        }

        public float getPivotX() {
            return this.f18482d;
        }

        public float getPivotY() {
            return this.f18483e;
        }

        public float getRotation() {
            return this.f18481c;
        }

        public float getScaleX() {
            return this.f18484f;
        }

        public float getScaleY() {
            return this.f18485g;
        }

        public float getTranslateX() {
            return this.f18486h;
        }

        public float getTranslateY() {
            return this.f18487i;
        }

        public void setPivotX(float f10) {
            if (f10 != this.f18482d) {
                this.f18482d = f10;
                d();
            }
        }

        public void setPivotY(float f10) {
            if (f10 != this.f18483e) {
                this.f18483e = f10;
                d();
            }
        }

        public void setRotation(float f10) {
            if (f10 != this.f18481c) {
                this.f18481c = f10;
                d();
            }
        }

        public void setScaleX(float f10) {
            if (f10 != this.f18484f) {
                this.f18484f = f10;
                d();
            }
        }

        public void setScaleY(float f10) {
            if (f10 != this.f18485g) {
                this.f18485g = f10;
                d();
            }
        }

        public void setTranslateX(float f10) {
            if (f10 != this.f18486h) {
                this.f18486h = f10;
                d();
            }
        }

        public void setTranslateY(float f10) {
            if (f10 != this.f18487i) {
                this.f18487i = f10;
                d();
            }
        }

        public d() {
            super();
            this.f18479a = new Matrix();
            this.f18480b = new ArrayList();
            this.f18481c = 0.0f;
            this.f18482d = 0.0f;
            this.f18483e = 0.0f;
            this.f18484f = 1.0f;
            this.f18485g = 1.0f;
            this.f18486h = 0.0f;
            this.f18487i = 0.0f;
            this.f18488j = new Matrix();
            this.f18491m = null;
        }
    }
}
