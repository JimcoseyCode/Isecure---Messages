package com.swmansion.gesturehandler.react;

import J6.AbstractC1274d;
import J6.q;
import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AbstractC1670g0;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerDelegate;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;
import com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ReactModule(name = RNGestureHandlerButtonViewManager.REACT_CLASS)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0002?@B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0018\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u001a\u0010\u0012J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001bH\u0017¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u001bH\u0017¢\u0006\u0004\b\"\u0010\u001eJ\u001f\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0004\b$\u0010\u001eJ\u001f\u0010&\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0004\b&\u0010\u001eJ\u001f\u0010(\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\u001bH\u0017¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b*\u0010+J!\u0010-\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010,\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b0\u0010+J\u001f\u00102\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00101\u001a\u00020\u0013H\u0017¢\u0006\u0004\b2\u0010\u0016J\u001f\u00104\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u000eH\u0017¢\u0006\u0004\b4\u0010\u0012J\u001f\u00106\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u000eH\u0017¢\u0006\u0004\b6\u0010\u0012J\u0017\u00107\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0002H\u0014¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u000109H\u0014¢\u0006\u0004\b:\u0010;R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "Lcom/facebook/react/viewmanagers/RNGestureHandlerButtonManagerInterface;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/ThemedReactContext;)Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;", "view", PointerEventHelper.POINTER_TYPE_UNKNOWN, "useDrawableOnForeground", "Li7/B;", "setForeground", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.BACKGROUND_COLOR, "setBackgroundColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;I)V", "useBorderlessDrawable", "setBorderless", ViewProps.ENABLED, "setEnabled", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.BORDER_RADIUS, "setBorderRadius", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;F)V", ViewProps.BORDER_TOP_LEFT_RADIUS, "setBorderTopLeftRadius", ViewProps.BORDER_TOP_RIGHT_RADIUS, "setBorderTopRightRadius", ViewProps.BORDER_BOTTOM_LEFT_RADIUS, "setBorderBottomLeftRadius", ViewProps.BORDER_BOTTOM_RIGHT_RADIUS, "setBorderBottomRightRadius", ViewProps.BORDER_WIDTH, "setBorderWidth", ViewProps.BORDER_COLOR, "setBorderColor", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/Integer;)V", "borderStyle", "setBorderStyle", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;Ljava/lang/String;)V", "rippleColor", "setRippleColor", "rippleRadius", "setRippleRadius", "exclusive", "setExclusive", "touchSoundDisabled", "setTouchSoundDisabled", "onAfterUpdateTransaction", "(Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;)V", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "()Lcom/facebook/react/uimanager/ViewManagerDelegate;", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "Companion", "a", "b", "react-native-gesture-handler_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RNGestureHandlerButtonViewManager extends ViewGroupManager<a> implements RNGestureHandlerButtonManagerInterface<a> {
    public static final String REACT_CLASS = "RNGestureHandlerButton";
    private final ViewManagerDelegate<a> mDelegate;

    public RNGestureHandlerButtonViewManager() {
        super(null, 1, null);
        this.mDelegate = new RNGestureHandlerButtonManagerDelegate(this);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    protected ViewManagerDelegate<a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ThemedReactContext context) {
        AbstractC2855l.g(context, "context");
        return new a(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(a view) {
        AbstractC2855l.g(view, "view");
        super.onAfterUpdateTransaction(view);
        view.t();
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BACKGROUND_COLOR)
    public void setBackgroundColor(a view, int backgroundColor) {
        AbstractC2855l.g(view, "view");
        view.setBackgroundColor(backgroundColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_BOTTOM_LEFT_RADIUS)
    public void setBorderBottomLeftRadius(a view, float borderBottomLeftRadius) {
        AbstractC2855l.g(view, "view");
        view.setBorderBottomLeftRadius(borderBottomLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_BOTTOM_RIGHT_RADIUS)
    public void setBorderBottomRightRadius(a view, float borderBottomRightRadius) {
        AbstractC2855l.g(view, "view");
        view.setBorderBottomRightRadius(borderBottomRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_COLOR)
    public void setBorderColor(a view, Integer borderColor) {
        AbstractC2855l.g(view, "view");
        view.setBorderColor(borderColor);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_RADIUS)
    public void setBorderRadius(a view, float borderRadius) {
        AbstractC2855l.g(view, "view");
        view.setBorderRadius(borderRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderStyle")
    public void setBorderStyle(a view, String borderStyle) {
        AbstractC2855l.g(view, "view");
        view.setBorderStyle(borderStyle);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_TOP_LEFT_RADIUS)
    public void setBorderTopLeftRadius(a view, float borderTopLeftRadius) {
        AbstractC2855l.g(view, "view");
        view.setBorderTopLeftRadius(borderTopLeftRadius);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    @ReactProp(name = ViewProps.BORDER_TOP_RIGHT_RADIUS)
    public void setBorderTopRightRadius(a view, float borderTopRightRadius) {
        AbstractC2855l.g(view, "view");
        view.setBorderTopRightRadius(borderTopRightRadius);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.BORDER_WIDTH)
    public void setBorderWidth(a view, float borderWidth) {
        AbstractC2855l.g(view, "view");
        view.setBorderWidth(borderWidth);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "borderless")
    public void setBorderless(a view, boolean useBorderlessDrawable) {
        AbstractC2855l.g(view, "view");
        view.setUseBorderlessDrawable(useBorderlessDrawable);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = ViewProps.ENABLED)
    public void setEnabled(a view, boolean enabled) {
        AbstractC2855l.g(view, "view");
        view.setEnabled(enabled);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "exclusive")
    public void setExclusive(a view, boolean exclusive) {
        AbstractC2855l.g(view, "view");
        view.setExclusive(exclusive);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "foreground")
    @TargetApi(TextAttributeProps.TA_KEY_LAYOUT_DIRECTION)
    public void setForeground(a view, boolean useDrawableOnForeground) {
        AbstractC2855l.g(view, "view");
        view.setUseDrawableOnForeground(useDrawableOnForeground);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleColor")
    public void setRippleColor(a view, Integer rippleColor) {
        AbstractC2855l.g(view, "view");
        view.setRippleColor(rippleColor);
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "rippleRadius")
    public void setRippleRadius(a view, int rippleRadius) {
        AbstractC2855l.g(view, "view");
        view.setRippleRadius(Integer.valueOf(rippleRadius));
    }

    @Override // com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface
    @ReactProp(name = "touchSoundDisabled")
    public void setTouchSoundDisabled(a view, boolean touchSoundDisabled) {
        AbstractC2855l.g(view, "view");
        view.setSoundEffectsEnabled(!touchSoundDisabled);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends ViewGroup implements q.e {

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        private static a f24902B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        private static a f24903C;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f24906g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f24907h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f24908i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f24909j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f24910k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f24911l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f24912m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f24913n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private float f24914o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private float f24915p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Integer f24916q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private String f24917r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f24918s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f24919t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private boolean f24920u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private long f24921v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private int f24922w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        private boolean f24923x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private boolean f24924y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final C0238a f24905z = new C0238a(null);

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        private static TypedValue f24901A = new TypedValue();

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        private static View.OnClickListener f24904D = new View.OnClickListener() { // from class: com.swmansion.gesturehandler.react.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RNGestureHandlerButtonViewManager.a.n(view);
            }
        };

        /* JADX INFO: renamed from: com.swmansion.gesturehandler.react.RNGestureHandlerButtonViewManager$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
        public static final class C0238a {
            public /* synthetic */ C0238a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0238a() {
            }
        }

        public a(Context context) {
            super(context);
            this.f24917r = "solid";
            this.f24918s = true;
            this.f24921v = -1L;
            this.f24922w = -1;
            setOnClickListener(f24904D);
            setClickable(true);
            setFocusable(true);
            this.f24920u = true;
            setClipChildren(false);
        }

        private final boolean getHasBorderRadii() {
            return (this.f24910k == 0.0f && this.f24911l == 0.0f && this.f24912m == 0.0f && this.f24913n == 0.0f && this.f24914o == 0.0f) ? false : true;
        }

        private final float[] j() {
            float f10 = this.f24911l;
            float f11 = this.f24912m;
            float f12 = this.f24914o;
            float f13 = this.f24913n;
            float[] fArr = {f10, f10, f11, f11, f12, f12, f13, f13};
            ArrayList arrayList = new ArrayList(8);
            for (int i10 = 0; i10 < 8; i10++) {
                float f14 = fArr[i10];
                if (f14 == 0.0f) {
                    f14 = this.f24910k;
                }
                arrayList.add(Float.valueOf(f14));
            }
            return AbstractC2800q.M0(arrayList);
        }

        private final PathEffect k() {
            String str = this.f24917r;
            if (AbstractC2855l.b(str, "dotted")) {
                float f10 = this.f24915p;
                return new DashPathEffect(new float[]{f10, f10, f10, f10}, 0.0f);
            }
            if (!AbstractC2855l.b(str, "dashed")) {
                return null;
            }
            float f11 = this.f24915p;
            float f12 = 3;
            return new DashPathEffect(new float[]{f11 * f12, f11 * f12, f11 * f12, f11 * f12}, 0.0f);
        }

        private final Drawable l() {
            PaintDrawable paintDrawable = new PaintDrawable(0);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            if (this.f24915p > 0.0f) {
                Paint paint = paintDrawable.getPaint();
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(this.f24915p);
                Integer num = this.f24916q;
                paint.setColor(num != null ? num.intValue() : -16777216);
                paint.setPathEffect(k());
            }
            return paintDrawable;
        }

        private final Drawable m() {
            ColorStateList colorStateList;
            Integer num = this.f24906g;
            if (num != null && num.intValue() == 0) {
                return null;
            }
            int[][] iArr = {new int[]{R.attr.state_enabled}};
            Integer num2 = this.f24907h;
            Integer num3 = this.f24906g;
            if (num3 != null) {
                AbstractC2855l.d(num3);
                colorStateList = new ColorStateList(iArr, new int[]{num3.intValue()});
            } else {
                getContext().getTheme().resolveAttribute(R.attr.colorControlHighlight, f24901A, true);
                colorStateList = new ColorStateList(iArr, new int[]{f24901A.data});
            }
            RippleDrawable rippleDrawable = new RippleDrawable(colorStateList, null, this.f24909j ? null : new ShapeDrawable(new RectShape()));
            if (num2 != null) {
                rippleDrawable.setRadius((int) PixelUtil.toPixelFromDIP(num2.intValue()));
            }
            return rippleDrawable;
        }

        private final l o() {
            l lVar = null;
            for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof l) {
                    lVar = (l) parent;
                }
            }
            return lVar;
        }

        private final boolean p(O8.i iVar) {
            Iterator it = iVar.iterator();
            while (it.hasNext()) {
                View view = (View) it.next();
                if (view instanceof a) {
                    a aVar = (a) view;
                    if (aVar.f24924y || aVar.isPressed()) {
                        return true;
                    }
                }
                if ((view instanceof ViewGroup) && p(AbstractC1670g0.a((ViewGroup) view))) {
                    return true;
                }
            }
            return false;
        }

        static /* synthetic */ boolean q(a aVar, O8.i iVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                iVar = AbstractC1670g0.a(aVar);
            }
            return aVar.p(iVar);
        }

        private final void r() {
            if (f24902B == this) {
                f24902B = null;
                f24903C = this;
            }
        }

        private final boolean s() {
            if (q(this, null, 1, null)) {
                return false;
            }
            a aVar = f24902B;
            if (aVar == null) {
                f24902B = this;
                return true;
            }
            if (this.f24918s) {
                return aVar == this;
            }
            return !(aVar != null ? aVar.f24918s : false);
        }

        private final void u(int i10, Drawable drawable, Drawable drawable2) {
            PaintDrawable paintDrawable = new PaintDrawable(i10);
            if (getHasBorderRadii()) {
                paintDrawable.setCornerRadii(j());
            }
            setBackground(new LayerDrawable(drawable2 != null ? new Drawable[]{paintDrawable, drawable2, drawable} : new Drawable[]{paintDrawable, drawable}));
        }

        @Override // J6.q.e
        public boolean a() {
            return q.e.a.f(this);
        }

        @Override // J6.q.e
        public Boolean b(AbstractC1274d abstractC1274d) {
            return q.e.a.g(this, abstractC1274d);
        }

        @Override // J6.q.e
        public boolean c(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            if (event.getAction() == 3 || event.getAction() == 1 || event.getActionMasked() == 6) {
                return false;
            }
            boolean zS = s();
            if (zS) {
                this.f24924y = true;
            }
            return zS;
        }

        @Override // J6.q.e
        public boolean d() {
            return q.e.a.h(this);
        }

        @Override // android.view.View
        public void drawableHotspotChanged(float f10, float f11) {
            a aVar = f24902B;
            if (aVar == null || aVar == this) {
                super.drawableHotspotChanged(f10, f11);
            }
        }

        @Override // J6.q.e
        public boolean e(View view) {
            return q.e.a.b(this, view);
        }

        @Override // J6.q.e
        public void f(MotionEvent motionEvent) {
            q.e.a.d(this, motionEvent);
        }

        @Override // J6.q.e
        public Boolean g(View view, MotionEvent motionEvent) {
            return q.e.a.e(this, view, motionEvent);
        }

        public final float getBorderBottomLeftRadius() {
            return this.f24913n;
        }

        public final float getBorderBottomRightRadius() {
            return this.f24914o;
        }

        public final Integer getBorderColor() {
            return this.f24916q;
        }

        public final float getBorderRadius() {
            return this.f24910k;
        }

        public final String getBorderStyle() {
            return this.f24917r;
        }

        public final float getBorderTopLeftRadius() {
            return this.f24911l;
        }

        public final float getBorderTopRightRadius() {
            return this.f24912m;
        }

        public final float getBorderWidth() {
            return this.f24915p;
        }

        public final boolean getExclusive() {
            return this.f24918s;
        }

        public final Integer getRippleColor() {
            return this.f24906g;
        }

        public final Integer getRippleRadius() {
            return this.f24907h;
        }

        public final boolean getUseBorderlessDrawable() {
            return this.f24909j;
        }

        public final boolean getUseDrawableOnForeground() {
            return this.f24908i;
        }

        @Override // J6.q.e
        public void h(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            r();
            this.f24924y = false;
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
            AbstractC2855l.g(info, "info");
            super.onInitializeAccessibilityNodeInfo(info);
            Object tag = super.getTag(com.facebook.react.R.id.react_test_id);
            if (tag instanceof String) {
                info.setViewIdResourceName((String) tag);
            }
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            if (super.onInterceptTouchEvent(event)) {
                return true;
            }
            onTouchEvent(event);
            return isPressed();
        }

        @Override // android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyUp(int i10, KeyEvent keyEvent) {
            this.f24923x = true;
            return super.onKeyUp(i10, keyEvent);
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            AbstractC2855l.g(event, "event");
            long eventTime = event.getEventTime();
            int action = event.getAction();
            a aVar = f24902B;
            if (aVar != null && aVar != this) {
                AbstractC2855l.d(aVar);
                if (aVar.f24918s) {
                    if (isPressed()) {
                        setPressed(false);
                    }
                    this.f24921v = eventTime;
                    this.f24922w = action;
                    return false;
                }
            }
            if (event.getAction() == 3) {
                r();
            }
            if (this.f24921v == eventTime && this.f24922w == action && action != 3) {
                return false;
            }
            this.f24921v = eventTime;
            this.f24922w = action;
            return super.onTouchEvent(event);
        }

        @Override // android.view.View
        public boolean performClick() {
            if (!q(this, null, 1, null)) {
                Context context = getContext();
                AbstractC2855l.f(context, "getContext(...)");
                if (com.swmansion.gesturehandler.react.a.d(context)) {
                    l lVarO = o();
                    if (lVarO != null) {
                        lVarO.c(this);
                    }
                } else if (this.f24923x) {
                    l lVarO2 = o();
                    if (lVarO2 != null) {
                        lVarO2.c(this);
                    }
                    this.f24923x = false;
                }
                if (f24903C == this) {
                    r();
                    f24903C = null;
                    return super.performClick();
                }
            }
            return false;
        }

        @Override // android.view.View
        public void setBackgroundColor(int i10) {
            this.f24919t = i10;
            this.f24920u = true;
        }

        public final void setBorderBottomLeftRadius(float f10) {
            this.f24913n = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setBorderBottomRightRadius(float f10) {
            this.f24914o = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setBorderColor(Integer num) {
            this.f24916q = num;
            this.f24920u = true;
        }

        public final void setBorderRadius(float f10) {
            this.f24910k = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setBorderStyle(String str) {
            this.f24917r = str;
            this.f24920u = true;
        }

        public final void setBorderTopLeftRadius(float f10) {
            this.f24911l = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setBorderTopRightRadius(float f10) {
            this.f24912m = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setBorderWidth(float f10) {
            this.f24915p = f10 * getResources().getDisplayMetrics().density;
            this.f24920u = true;
        }

        public final void setExclusive(boolean z10) {
            this.f24918s = z10;
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0017  */
        @Override // android.view.View
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void setPressed(boolean z10) {
            boolean z11;
            if (!this.f24918s) {
                a aVar = f24902B;
                z11 = (aVar == null || !aVar.f24918s) && !q(this, null, 1, null);
            }
            if (!z10 || f24902B == this || z11) {
                this.f24924y = z10;
                super.setPressed(z10);
            }
            if (z10 || f24902B != this) {
                return;
            }
            this.f24924y = false;
        }

        public final void setRippleColor(Integer num) {
            this.f24906g = num;
            this.f24920u = true;
        }

        public final void setRippleRadius(Integer num) {
            this.f24907h = num;
            this.f24920u = true;
        }

        public final void setTouched(boolean z10) {
            this.f24924y = z10;
        }

        public final void setUseBorderlessDrawable(boolean z10) {
            this.f24909j = z10;
        }

        public final void setUseDrawableOnForeground(boolean z10) {
            this.f24908i = z10;
            this.f24920u = true;
        }

        public final void t() {
            if (this.f24920u) {
                this.f24920u = false;
                if (this.f24919t == 0) {
                    setBackground(null);
                }
                setForeground(null);
                Drawable drawableM = m();
                Drawable drawableL = l();
                if (getHasBorderRadii() && (drawableM instanceof RippleDrawable)) {
                    PaintDrawable paintDrawable = new PaintDrawable(-1);
                    paintDrawable.setCornerRadii(j());
                    ((RippleDrawable) drawableM).setDrawableByLayerId(R.id.mask, paintDrawable);
                }
                if (this.f24908i) {
                    setForeground(drawableM);
                    int i10 = this.f24919t;
                    if (i10 != 0) {
                        u(i10, drawableL, null);
                        return;
                    }
                    return;
                }
                int i11 = this.f24919t;
                if (i11 == 0 && this.f24906g == null) {
                    setBackground(new LayerDrawable(new Drawable[]{drawableM, drawableL}));
                } else {
                    u(i11, drawableL, drawableM);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void n(View view) {
        }

        @Override // android.view.ViewGroup, android.view.View
        public void dispatchDrawableHotspotChanged(float f10, float f11) {
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        }
    }
}
