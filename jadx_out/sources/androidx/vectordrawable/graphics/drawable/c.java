package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import m0.C2892a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w0.AbstractC3461h;
import w0.k;
import y0.AbstractC3606a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0193c f18441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Context f18442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ArgbEvaluator f18443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    d f18444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator.AnimatorListener f18445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ArrayList f18446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Drawable.Callback f18447n;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            c.this.scheduleSelf(runnable, j10);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f18446m);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f18446m);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i10)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class C0193c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f18450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f18451b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f18452c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList f18453d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        C2892a f18454e;

        public C0193c(Context context, C0193c c0193c, Drawable.Callback callback, Resources resources) {
            if (c0193c != null) {
                this.f18450a = c0193c.f18450a;
                f fVar = c0193c.f18451b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f18451b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f18451b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f18451b.mutate();
                    this.f18451b = fVar2;
                    fVar2.setCallback(callback);
                    this.f18451b.setBounds(c0193c.f18451b.getBounds());
                    this.f18451b.g(false);
                }
                ArrayList arrayList = c0193c.f18453d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f18453d = new ArrayList(size);
                    this.f18454e = new C2892a(size);
                    for (int i10 = 0; i10 < size; i10++) {
                        Animator animator = (Animator) c0193c.f18453d.get(i10);
                        Animator animatorClone = animator.clone();
                        String str = (String) c0193c.f18454e.get(animator);
                        animatorClone.setTarget(this.f18451b.c(str));
                        this.f18453d.add(animatorClone);
                        this.f18454e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f18452c == null) {
                this.f18452c = new AnimatorSet();
            }
            this.f18452c.playTogether(this.f18453d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f18450a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i10) {
        c cVar = new c(context);
        Drawable drawableF = AbstractC3461h.f(context.getResources(), i10, context.getTheme());
        cVar.f18456g = drawableF;
        drawableF.setCallback(cVar.f18447n);
        cVar.f18444k = new d(cVar.f18456g.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f18445l;
        if (animatorListener != null) {
            this.f18441h.f18452c.removeListener(animatorListener);
            this.f18445l = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f18441h.f18451b.c(str));
        C0193c c0193c = this.f18441h;
        if (c0193c.f18453d == null) {
            c0193c.f18453d = new ArrayList();
            this.f18441h.f18454e = new C2892a();
        }
        this.f18441h.f18453d.add(animator);
        this.f18441h.f18454e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f18446m == null) {
            this.f18446m = new ArrayList();
        }
        if (this.f18446m.contains(bVar)) {
            return;
        }
        this.f18446m.add(bVar);
        if (this.f18445l == null) {
            this.f18445l = new b();
        }
        this.f18441h.f18452c.addListener(this.f18445l);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            return AbstractC3606a.b(drawable);
        }
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
        this.f18441h.f18451b.draw(canvas);
        if (this.f18441h.f18452c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList arrayList = this.f18446m;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f18446m.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.d(drawable) : this.f18441h.f18451b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f18441h.f18450a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.e(drawable) : this.f18441h.f18451b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f18456g != null) {
            return new d(this.f18456g.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f18441h.f18451b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f18441h.f18451b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f18441h.f18451b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f18431e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f18447n);
                        f fVar = this.f18441h.f18451b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f18441h.f18451b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f18432f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f18442i;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f18441h.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f18456g;
        return drawable != null ? AbstractC3606a.h(drawable) : this.f18441h.f18451b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f18456g;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f18441h.f18452c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.isStateful() : this.f18441h.f18451b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f18441h.f18451b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.setLevel(i10) : this.f18441h.f18451b.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18456g;
        return drawable != null ? drawable.setState(iArr) : this.f18441h.f18451b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f18441h.f18451b.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.j(drawable, z10);
        } else {
            this.f18441h.f18451b.setAutoMirrored(z10);
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
            this.f18441h.f18451b.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.o(drawable, colorStateList);
        } else {
            this.f18441h.f18451b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            AbstractC3606a.p(drawable, mode);
        } else {
            this.f18441h.f18451b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f18441h.f18451b.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f18441h.f18452c.isStarted()) {
                return;
            }
            this.f18441h.f18452c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f18441h.f18452c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f18456g;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f18441h.f18451b.setColorFilter(colorFilter);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f18455a;

        public d(Drawable.ConstantState constantState) {
            this.f18455a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f18455a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f18455a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f18455a.newDrawable();
            cVar.f18456g = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f18447n);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f18455a.newDrawable(resources);
            cVar.f18456g = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f18447n);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f18455a.newDrawable(resources, theme);
            cVar.f18456g = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f18447n);
            return cVar;
        }
    }

    private c(Context context, C0193c c0193c, Resources resources) {
        this.f18443j = null;
        this.f18445l = null;
        this.f18446m = null;
        a aVar = new a();
        this.f18447n = aVar;
        this.f18442i = context;
        if (c0193c != null) {
            this.f18441h = c0193c;
        } else {
            this.f18441h = new C0193c(context, c0193c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
