package expo.modules.image.drawing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.FloatUtil;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.yoga.g;
import expo.modules.image.YogaUtilsKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import p7.AbstractC3083a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002<=B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJG\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u001d\u0010(\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010+\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0017\u00101\u001a\u0002008\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00107¨\u0006>"}, d2 = {"Lexpo/modules/image/drawing/OutlineProvider;", "Landroid/view/ViewOutlineProvider;", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;)V", "Li7/B;", "updateCornerRadiiIfNeeded", "()V", "Lexpo/modules/image/drawing/OutlineProvider$CornerRadius;", "outputPosition", "Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;", "inputPosition", "oppositePosition", "startPosition", "endPosition", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isRTL", "isRTLSwap", "updateCornerRadius", "(Lexpo/modules/image/drawing/OutlineProvider$CornerRadius;Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;ZZ)V", "updateConvexPathIfNeeded", "Landroid/view/View;", "view", "updateBoundsAndLayoutDirection", "(Landroid/view/View;)V", "hasEqualCorners", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "radius", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.POSITION, "setBorderRadius", "(FI)Z", "Landroid/graphics/Outline;", "outline", "getOutline", "(Landroid/view/View;Landroid/graphics/Outline;)V", "Landroid/graphics/Canvas;", "canvas", "clipCanvasIfNeeded", "(Landroid/graphics/Canvas;Landroid/view/View;)V", "Landroid/content/Context;", "mLayoutDirection", "I", "Landroid/graphics/RectF;", "mBounds", "Landroid/graphics/RectF;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "borderRadiiConfig", "[F", "getBorderRadiiConfig", "()[F", "mCornerRadii", "mCornerRadiiInvalidated", "Z", "Landroid/graphics/Path;", "mConvexPath", "Landroid/graphics/Path;", "mConvexPathInvalidated", "BorderRadiusConfig", "CornerRadius", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OutlineProvider extends ViewOutlineProvider {
    private final float[] borderRadiiConfig;
    private final RectF mBounds;
    private final Context mContext;
    private final Path mConvexPath;
    private boolean mConvexPathInvalidated;
    private final float[] mCornerRadii;
    private boolean mCornerRadiiInvalidated;
    private int mLayoutDirection;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lexpo/modules/image/drawing/OutlineProvider$BorderRadiusConfig;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "ALL", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "TOP_START", "TOP_END", "BOTTOM_START", "BOTTOM_END", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BorderRadiusConfig {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BorderRadiusConfig[] $VALUES;
        public static final BorderRadiusConfig ALL = new BorderRadiusConfig("ALL", 0);
        public static final BorderRadiusConfig TOP_LEFT = new BorderRadiusConfig("TOP_LEFT", 1);
        public static final BorderRadiusConfig TOP_RIGHT = new BorderRadiusConfig("TOP_RIGHT", 2);
        public static final BorderRadiusConfig BOTTOM_RIGHT = new BorderRadiusConfig("BOTTOM_RIGHT", 3);
        public static final BorderRadiusConfig BOTTOM_LEFT = new BorderRadiusConfig("BOTTOM_LEFT", 4);
        public static final BorderRadiusConfig TOP_START = new BorderRadiusConfig("TOP_START", 5);
        public static final BorderRadiusConfig TOP_END = new BorderRadiusConfig("TOP_END", 6);
        public static final BorderRadiusConfig BOTTOM_START = new BorderRadiusConfig("BOTTOM_START", 7);
        public static final BorderRadiusConfig BOTTOM_END = new BorderRadiusConfig("BOTTOM_END", 8);

        private static final /* synthetic */ BorderRadiusConfig[] $values() {
            return new BorderRadiusConfig[]{ALL, TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT, TOP_START, TOP_END, BOTTOM_START, BOTTOM_END};
        }

        static {
            BorderRadiusConfig[] borderRadiusConfigArr$values = $values();
            $VALUES = borderRadiusConfigArr$values;
            $ENTRIES = AbstractC3083a.a(borderRadiusConfigArr$values);
        }

        private BorderRadiusConfig(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BorderRadiusConfig valueOf(String str) {
            return (BorderRadiusConfig) Enum.valueOf(BorderRadiusConfig.class, str);
        }

        public static BorderRadiusConfig[] values() {
            return (BorderRadiusConfig[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/image/drawing/OutlineProvider$CornerRadius;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;I)V", "TOP_LEFT", "TOP_RIGHT", "BOTTOM_RIGHT", "BOTTOM_LEFT", "expo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CornerRadius {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CornerRadius[] $VALUES;
        public static final CornerRadius TOP_LEFT = new CornerRadius("TOP_LEFT", 0);
        public static final CornerRadius TOP_RIGHT = new CornerRadius("TOP_RIGHT", 1);
        public static final CornerRadius BOTTOM_RIGHT = new CornerRadius("BOTTOM_RIGHT", 2);
        public static final CornerRadius BOTTOM_LEFT = new CornerRadius("BOTTOM_LEFT", 3);

        private static final /* synthetic */ CornerRadius[] $values() {
            return new CornerRadius[]{TOP_LEFT, TOP_RIGHT, BOTTOM_RIGHT, BOTTOM_LEFT};
        }

        static {
            CornerRadius[] cornerRadiusArr$values = $values();
            $VALUES = cornerRadiusArr$values;
            $ENTRIES = AbstractC3083a.a(cornerRadiusArr$values);
        }

        private CornerRadius(String str, int i10) {
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static CornerRadius valueOf(String str) {
            return (CornerRadius) Enum.valueOf(CornerRadius.class, str);
        }

        public static CornerRadius[] values() {
            return (CornerRadius[]) $VALUES.clone();
        }
    }

    public OutlineProvider(Context mContext) {
        AbstractC2855l.g(mContext, "mContext");
        this.mContext = mContext;
        this.mBounds = new RectF();
        float[] fArr = new float[9];
        for (int i10 = 0; i10 < 9; i10++) {
            fArr[i10] = g.f20769b;
        }
        this.borderRadiiConfig = fArr;
        this.mCornerRadii = new float[4];
        this.mCornerRadiiInvalidated = true;
        this.mConvexPath = new Path();
        this.mConvexPathInvalidated = true;
        updateCornerRadiiIfNeeded();
    }

    private final void updateBoundsAndLayoutDirection(View view) {
        int layoutDirection = view.getLayoutDirection();
        if (this.mLayoutDirection != layoutDirection) {
            this.mLayoutDirection = layoutDirection;
            this.mCornerRadiiInvalidated = true;
        }
        int width = view.getWidth();
        int height = view.getHeight();
        RectF rectF = this.mBounds;
        float f10 = 0;
        if (rectF.left == f10 && rectF.top == f10 && rectF.right == width && rectF.bottom == height) {
            return;
        }
        rectF.set(f10, f10, width, height);
        this.mCornerRadiiInvalidated = true;
    }

    private final void updateConvexPathIfNeeded() {
        if (this.mConvexPathInvalidated) {
            this.mConvexPath.reset();
            Path path = this.mConvexPath;
            RectF rectF = this.mBounds;
            float[] fArr = this.mCornerRadii;
            CornerRadius cornerRadius = CornerRadius.TOP_LEFT;
            float f10 = fArr[cornerRadius.ordinal()];
            float f11 = this.mCornerRadii[cornerRadius.ordinal()];
            float[] fArr2 = this.mCornerRadii;
            CornerRadius cornerRadius2 = CornerRadius.TOP_RIGHT;
            float f12 = fArr2[cornerRadius2.ordinal()];
            float f13 = this.mCornerRadii[cornerRadius2.ordinal()];
            float[] fArr3 = this.mCornerRadii;
            CornerRadius cornerRadius3 = CornerRadius.BOTTOM_RIGHT;
            float f14 = fArr3[cornerRadius3.ordinal()];
            float f15 = this.mCornerRadii[cornerRadius3.ordinal()];
            float[] fArr4 = this.mCornerRadii;
            CornerRadius cornerRadius4 = CornerRadius.BOTTOM_LEFT;
            path.addRoundRect(rectF, new float[]{f10, f11, f12, f13, f14, f15, fArr4[cornerRadius4.ordinal()], this.mCornerRadii[cornerRadius4.ordinal()]}, Path.Direction.CW);
            this.mConvexPathInvalidated = false;
        }
    }

    private final void updateCornerRadiiIfNeeded() {
        if (this.mCornerRadiiInvalidated) {
            boolean z10 = this.mLayoutDirection == 1;
            boolean zDoLeftAndRightSwapInRTL = I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(this.mContext);
            CornerRadius cornerRadius = CornerRadius.TOP_LEFT;
            BorderRadiusConfig borderRadiusConfig = BorderRadiusConfig.TOP_LEFT;
            BorderRadiusConfig borderRadiusConfig2 = BorderRadiusConfig.TOP_RIGHT;
            BorderRadiusConfig borderRadiusConfig3 = BorderRadiusConfig.TOP_START;
            BorderRadiusConfig borderRadiusConfig4 = BorderRadiusConfig.TOP_END;
            updateCornerRadius(cornerRadius, borderRadiusConfig, borderRadiusConfig2, borderRadiusConfig3, borderRadiusConfig4, z10, zDoLeftAndRightSwapInRTL);
            updateCornerRadius(CornerRadius.TOP_RIGHT, borderRadiusConfig2, borderRadiusConfig, borderRadiusConfig4, borderRadiusConfig3, z10, zDoLeftAndRightSwapInRTL);
            CornerRadius cornerRadius2 = CornerRadius.BOTTOM_LEFT;
            BorderRadiusConfig borderRadiusConfig5 = BorderRadiusConfig.BOTTOM_LEFT;
            BorderRadiusConfig borderRadiusConfig6 = BorderRadiusConfig.BOTTOM_RIGHT;
            BorderRadiusConfig borderRadiusConfig7 = BorderRadiusConfig.BOTTOM_START;
            BorderRadiusConfig borderRadiusConfig8 = BorderRadiusConfig.BOTTOM_END;
            updateCornerRadius(cornerRadius2, borderRadiusConfig5, borderRadiusConfig6, borderRadiusConfig7, borderRadiusConfig8, z10, zDoLeftAndRightSwapInRTL);
            updateCornerRadius(CornerRadius.BOTTOM_RIGHT, borderRadiusConfig6, borderRadiusConfig5, borderRadiusConfig8, borderRadiusConfig7, z10, zDoLeftAndRightSwapInRTL);
            this.mCornerRadiiInvalidated = false;
            this.mConvexPathInvalidated = true;
        }
    }

    private final void updateCornerRadius(CornerRadius outputPosition, BorderRadiusConfig inputPosition, BorderRadiusConfig oppositePosition, BorderRadiusConfig startPosition, BorderRadiusConfig endPosition, boolean isRTL, boolean isRTLSwap) {
        float f10 = this.borderRadiiConfig[inputPosition.ordinal()];
        if (isRTL) {
            if (isRTLSwap) {
                f10 = this.borderRadiiConfig[oppositePosition.ordinal()];
            }
            if (g.a(f10)) {
                f10 = this.borderRadiiConfig[endPosition.ordinal()];
            }
        } else if (g.a(f10)) {
            f10 = this.borderRadiiConfig[startPosition.ordinal()];
        }
        this.mCornerRadii[outputPosition.ordinal()] = PixelUtil.toPixelFromDIP(YogaUtilsKt.ifYogaUndefinedUse(YogaUtilsKt.ifYogaUndefinedUse(f10, this.borderRadiiConfig[BorderRadiusConfig.ALL.ordinal()]), 0.0f));
    }

    public final void clipCanvasIfNeeded(Canvas canvas, View view) {
        AbstractC2855l.g(canvas, "canvas");
        AbstractC2855l.g(view, "view");
        updateBoundsAndLayoutDirection(view);
        updateCornerRadiiIfNeeded();
        if (hasEqualCorners()) {
            return;
        }
        updateConvexPathIfNeeded();
        canvas.clipPath(this.mConvexPath);
    }

    public final float[] getBorderRadiiConfig() {
        return this.borderRadiiConfig;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        AbstractC2855l.g(view, "view");
        AbstractC2855l.g(outline, "outline");
        updateBoundsAndLayoutDirection(view);
        updateCornerRadiiIfNeeded();
        if (hasEqualCorners()) {
            float f10 = this.mCornerRadii[0];
            if (f10 > 0.0f) {
                outline.setRoundRect(0, 0, (int) this.mBounds.width(), (int) this.mBounds.height(), f10);
                return;
            } else {
                outline.setRect(0, 0, (int) this.mBounds.width(), (int) this.mBounds.height());
                return;
            }
        }
        updateConvexPathIfNeeded();
        if (Build.VERSION.SDK_INT >= 30) {
            outline.setPath(this.mConvexPath);
        } else {
            outline.setConvexPath(this.mConvexPath);
        }
    }

    public final boolean hasEqualCorners() {
        updateCornerRadiiIfNeeded();
        float[] fArr = this.mCornerRadii;
        float f10 = fArr[0];
        for (float f11 : fArr) {
            if (f10 != f11) {
                return false;
            }
        }
        return true;
    }

    public final boolean setBorderRadius(float radius, int position) {
        if (FloatUtil.floatsEqual(this.borderRadiiConfig[position], radius)) {
            return false;
        }
        this.borderRadiiConfig[position] = radius;
        this.mCornerRadiiInvalidated = true;
        return true;
    }
}
