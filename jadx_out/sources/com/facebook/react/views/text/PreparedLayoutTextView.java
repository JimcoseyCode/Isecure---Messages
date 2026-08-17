package com.facebook.react.views.text;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.view.AbstractC1658a0;
import androidx.core.view.C1657a;
import com.facebook.react.uimanager.BackgroundStyleApplicator;
import com.facebook.react.uimanager.ReactCompoundView;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.style.Overflow;
import com.facebook.react.views.text.internal.span.ReactFragmentIndexSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y7.AbstractC3624a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0007\b\u0001\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0003\\][B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ5\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tJ\u0017\u0010(\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00192\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010)J)\u0010/\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00192\u0006\u0010'\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0019H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020\u000b2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR.\u0010D\u001a\u0004\u0018\u00010B2\b\u0010C\u001a\u0004\u0018\u00010B8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR*\u0010K\u001a\u00020J2\u0006\u0010C\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010Q\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u0013\u0010Z\u001a\u0004\u0018\u00010W8G¢\u0006\u0006\u001a\u0004\bX\u0010Y¨\u0006^"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView;", "Landroid/view/ViewGroup;", "Lcom/facebook/react/uimanager/ReactCompoundView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Li7/B;", "initView", "()V", "T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "x", "y", "Ljava/lang/Class;", "clazz", "getSpanInCoords", "(IILjava/lang/Class;)Ljava/lang/Object;", "getTextOffsetAt", "(II)I", "recycleView", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", ViewProps.START, ViewProps.END, "setSelection", "(II)V", "clearSelection", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "hasOverlappingRendering", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "touchX", "touchY", "reactTagForTouch", "(FF)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/text/style/ClickableSpan;", "clickableSpans", "Ljava/util/List;", "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "selection", "Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", "Lcom/facebook/react/views/text/PreparedLayout;", "value", "preparedLayout", "Lcom/facebook/react/views/text/PreparedLayout;", "getPreparedLayout", "()Lcom/facebook/react/views/text/PreparedLayout;", "setPreparedLayout", "(Lcom/facebook/react/views/text/PreparedLayout;)V", "Lcom/facebook/react/uimanager/style/Overflow;", ViewProps.OVERFLOW, "Lcom/facebook/react/uimanager/style/Overflow;", "getOverflow", "()Lcom/facebook/react/uimanager/style/Overflow;", "setOverflow", "(Lcom/facebook/react/uimanager/style/Overflow;)V", "selectionColor", "Ljava/lang/Integer;", "getSelectionColor", "()Ljava/lang/Integer;", "setSelectionColor", "(Ljava/lang/Integer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getText", "()Ljava/lang/CharSequence;", ReactTextInputShadowNode.PROP_TEXT, "Companion", "Api34Utils", "TextSelection", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PreparedLayoutTextView extends ViewGroup implements ReactCompoundView {
    private static final Companion Companion = new Companion(null);
    private static final Paint selectionPaint = new Paint();
    private List<? extends ClickableSpan> clickableSpans;
    private Overflow overflow;
    private PreparedLayout preparedLayout;
    private TextSelection selection;
    private Integer selectionColor;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Api34Utils;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Landroid/text/Layout;", "layout", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Path;", "selectionPath", "Landroid/graphics/Paint;", "selectionPaint", "Li7/B;", "draw", "(Landroid/text/Layout;Landroid/graphics/Canvas;Landroid/graphics/Path;Landroid/graphics/Paint;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "highlightPaths", "Ljava/util/List;", "highlightPaints", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Api34Utils {
        public static final Api34Utils INSTANCE = new Api34Utils();
        private static List<? extends Paint> highlightPaints;
        private static List<? extends Path> highlightPaths;

        private Api34Utils() {
        }

        public final void draw(Layout layout, Canvas canvas, Path selectionPath, Paint selectionPaint) {
            AbstractC2855l.g(layout, "layout");
            AbstractC2855l.g(canvas, "canvas");
            if (selectionPath != null) {
                if (highlightPaths == null) {
                    highlightPaths = new ArrayList();
                }
                if (highlightPaints == null) {
                    highlightPaints = new ArrayList();
                }
            }
            layout.draw(canvas, highlightPaths, highlightPaints, selectionPath, selectionPaint, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "selectionPaint", "Landroid/graphics/Paint;", "filterClickableSpans", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/text/style/ClickableSpan;", ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<ClickableSpan> filterClickableSpans(CharSequence text) {
            if (!(text instanceof Spanned)) {
                return AbstractC2800q.j();
            }
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < text.length()) {
                Spanned spanned = (Spanned) text;
                int iNextSpanTransition = spanned.nextSpanTransition(i10, text.length(), ClickableSpan.class);
                Object[] spans = spanned.getSpans(i10, iNextSpanTransition, ClickableSpan.class);
                AbstractC2855l.f(spans, "getSpans(...)");
                AbstractC2800q.B(arrayList, spans);
                i10 = iNextSpanTransition;
            }
            return arrayList;
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/facebook/react/views/text/PreparedLayoutTextView$TextSelection;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.START, PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.END, "path", "Landroid/graphics/Path;", "<init>", "(IILandroid/graphics/Path;)V", "getStart", "()I", "setStart", "(I)V", "getEnd", "setEnd", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class TextSelection {
        private int end;
        private Path path;
        private int start;

        public TextSelection(int i10, int i11, Path path) {
            AbstractC2855l.g(path, "path");
            this.start = i10;
            this.end = i11;
            this.path = path;
        }

        public final int getEnd() {
            return this.end;
        }

        public final Path getPath() {
            return this.path;
        }

        public final int getStart() {
            return this.start;
        }

        public final void setEnd(int i10) {
            this.end = i10;
        }

        public final void setPath(Path path) {
            AbstractC2855l.g(path, "<set-?>");
            this.path = path;
        }

        public final void setStart(int i10) {
            this.start = i10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreparedLayoutTextView(Context context) {
        super(context);
        AbstractC2855l.g(context, "context");
        this.clickableSpans = AbstractC2800q.j();
        this.overflow = Overflow.HIDDEN;
        initView();
        setWillNotDraw(false);
    }

    private final <T> T getSpanInCoords(int x10, int y10, Class<T> clazz) {
        int textOffsetAt = getTextOffsetAt(x10, y10);
        if (textOffsetAt < 0) {
            return null;
        }
        CharSequence text = getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return null;
        }
        Object[] spans = spanned.getSpans(textOffsetAt, textOffsetAt, clazz);
        AbstractC2855l.d(spans);
        if (spans.length == 0) {
            return null;
        }
        if (spans.length > 2) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator itA = AbstractC2845b.a(spans);
        while (itA.hasNext()) {
            T t10 = (T) itA.next();
            int spanFlags = spanned.getSpanFlags(t10);
            int i10 = spanFlags & 18;
            int spanStart = (i10 == 0 && (spanFlags & 17) == 0) ? spanned.getSpanStart(t10) + 1 : spanned.getSpanStart(t10);
            int spanEnd = (i10 == 0 && (spanFlags & 34) == 0) ? spanned.getSpanEnd(t10) - 1 : spanned.getSpanEnd(t10);
            if (textOffsetAt >= spanStart && textOffsetAt <= spanEnd) {
                return t10;
            }
        }
        return null;
    }

    private final int getTextOffsetAt(int x10, int y10) {
        Layout layout;
        float paragraphRight;
        float lineLeft;
        int paddingLeft = x10 - getPaddingLeft();
        int paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        int iC = y10 - (paddingTop + (preparedLayout != null ? AbstractC3624a.c(preparedLayout.getVerticalOffset()) : 0));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        if (preparedLayout2 != null && (layout = preparedLayout2.getLayout()) != null) {
            int lineForVertical = layout.getLineForVertical(iC);
            if (layout.getAlignment() == Layout.Alignment.ALIGN_CENTER) {
                lineLeft = layout.getLineLeft(lineForVertical);
                paragraphRight = layout.getLineRight(lineForVertical);
            } else {
                boolean z10 = layout.getParagraphDirection(lineForVertical) == -1;
                float width = z10 ? layout.getWidth() - layout.getLineMax(lineForVertical) : layout.getParagraphLeft(lineForVertical);
                paragraphRight = z10 ? layout.getParagraphRight(lineForVertical) : layout.getLineMax(lineForVertical);
                lineLeft = width;
            }
            float f10 = paddingLeft;
            if (f10 >= lineLeft && f10 <= paragraphRight) {
                try {
                    return layout.getOffsetForHorizontal(lineForVertical, f10);
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
            }
        }
        return -1;
    }

    private final void initView() {
        this.clickableSpans = AbstractC2800q.j();
        this.selection = null;
        setPreparedLayout(null);
    }

    public final void clearSelection() {
        this.selection = null;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        return super.dispatchHoverEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        AbstractC2855l.g(event, "event");
        C1657a c1657aK = AbstractC1658a0.k(this);
        return ((c1657aK instanceof ReactTextViewAccessibilityDelegate) && ((ReactTextViewAccessibilityDelegate) c1657aK).dispatchKeyEvent(event)) || super.dispatchKeyEvent(event);
    }

    public final Overflow getOverflow() {
        return this.overflow;
    }

    public final PreparedLayout getPreparedLayout() {
        return this.preparedLayout;
    }

    public final Integer getSelectionColor() {
        return this.selectionColor;
    }

    public final CharSequence getText() {
        Layout layout;
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null) {
            return null;
        }
        return layout.getText();
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int defaultTextColorHighlight;
        AbstractC2855l.g(canvas, "canvas");
        if (this.overflow != Overflow.VISIBLE) {
            BackgroundStyleApplicator.clipToPaddingBox(this, canvas);
        }
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        PreparedLayout preparedLayout = this.preparedLayout;
        canvas.translate(paddingLeft, paddingTop + (preparedLayout != null ? preparedLayout.getVerticalOffset() : 0.0f));
        PreparedLayout preparedLayout2 = this.preparedLayout;
        Layout layout = preparedLayout2 != null ? preparedLayout2.getLayout() : null;
        if (layout != null) {
            if (this.selection != null) {
                Paint paint = selectionPaint;
                Integer num = this.selectionColor;
                if (num != null) {
                    defaultTextColorHighlight = num.intValue();
                } else {
                    Context context = getContext();
                    AbstractC2855l.f(context, "getContext(...)");
                    defaultTextColorHighlight = DefaultStyleValuesUtil.getDefaultTextColorHighlight(context);
                }
                paint.setColor(defaultTextColorHighlight);
            }
            if (Build.VERSION.SDK_INT < 34) {
                TextSelection textSelection = this.selection;
                layout.draw(canvas, textSelection != null ? textSelection.getPath() : null, selectionPaint, 0);
            } else {
                Api34Utils api34Utils = Api34Utils.INSTANCE;
                TextSelection textSelection2 = this.selection;
                api34Utils.draw(layout, canvas, textSelection2 != null ? textSelection2.getPath() : null, selectionPaint);
            }
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        if (!this.clickableSpans.isEmpty() && !gainFocus) {
            clearSelection();
        }
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        C1657a c1657aK = AbstractC1658a0.k(this);
        if (c1657aK == null || !(c1657aK instanceof ReactTextViewAccessibilityDelegate)) {
            return;
        }
        ((ReactTextViewAccessibilityDelegate) c1657aK).onFocusChanged(gainFocus, direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        AbstractC2855l.g(event, "event");
        if (!isEnabled() || this.clickableSpans.isEmpty()) {
            return super.onTouchEvent(event);
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 3) {
            clearSelection();
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) getSpanInCoords((int) event.getX(), (int) event.getY(), ClickableSpan.class);
        if (clickableSpan == null) {
            clearSelection();
            return super.onTouchEvent(event);
        }
        if (actionMasked == 0) {
            PreparedLayout preparedLayout = this.preparedLayout;
            if (preparedLayout == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Layout layout = preparedLayout.getLayout();
            CharSequence text = layout.getText();
            AbstractC2855l.e(text, "null cannot be cast to non-null type android.text.Spanned");
            int spanStart = ((Spanned) text).getSpanStart(clickableSpan);
            CharSequence text2 = layout.getText();
            AbstractC2855l.e(text2, "null cannot be cast to non-null type android.text.Spanned");
            setSelection(spanStart, ((Spanned) text2).getSpanEnd(clickableSpan));
        } else if (actionMasked == 1) {
            clearSelection();
            clickableSpan.onClick(this);
        }
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactCompoundView
    public int reactTagForTouch(float touchX, float touchY) {
        ReactFragmentIndexSpan reactFragmentIndexSpan = (ReactFragmentIndexSpan) getSpanInCoords(AbstractC3624a.c(touchX), AbstractC3624a.c(touchY), ReactFragmentIndexSpan.class);
        if (reactFragmentIndexSpan != null) {
            int fragmentIndex = reactFragmentIndexSpan.getFragmentIndex();
            PreparedLayout preparedLayout = this.preparedLayout;
            Integer numValueOf = preparedLayout != null ? Integer.valueOf(preparedLayout.getReactTags()[fragmentIndex]) : null;
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return getId();
    }

    public final void recycleView() {
        initView();
        BackgroundStyleApplicator.reset(this);
        setOverflow(Overflow.HIDDEN);
    }

    public final void setOverflow(Overflow value) {
        AbstractC2855l.g(value, "value");
        if (this.overflow != value) {
            this.overflow = value;
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setPreparedLayout(PreparedLayout preparedLayout) {
        List<? extends ClickableSpan> listJ;
        Layout layout;
        CharSequence text;
        Layout layout2;
        if (AbstractC2855l.b(this.preparedLayout, preparedLayout)) {
            return;
        }
        TextSelection textSelection = this.selection;
        if (textSelection != null) {
            if (preparedLayout == null) {
                clearSelection();
            } else {
                PreparedLayout preparedLayout2 = this.preparedLayout;
                if (AbstractC2855l.b(String.valueOf((preparedLayout2 == null || (layout2 = preparedLayout2.getLayout()) == null) ? null : layout2.getText()), preparedLayout.getLayout().getText().toString())) {
                    preparedLayout.getLayout().getSelectionPath(textSelection.getStart(), textSelection.getEnd(), textSelection.getPath());
                }
            }
        }
        if (preparedLayout == null || (layout = preparedLayout.getLayout()) == null || (text = layout.getText()) == null || (listJ = Companion.filterClickableSpans(text)) == null) {
            listJ = AbstractC2800q.j();
        }
        this.clickableSpans = listJ;
        this.preparedLayout = preparedLayout;
        invalidate();
    }

    public final void setSelection(int start, int end) {
        PreparedLayout preparedLayout = this.preparedLayout;
        if (preparedLayout == null) {
            throw new IllegalStateException("Required value was null.");
        }
        Layout layout = preparedLayout.getLayout();
        if (start < 0 || end > layout.getText().length() || start >= end) {
            throw new IllegalArgumentException("setSelection start and end are not in valid range. start: " + start + ", end: " + end + ", text length: " + layout.getText().length());
        }
        TextSelection textSelection = this.selection;
        if (textSelection == null) {
            Path path = new Path();
            layout.getSelectionPath(start, end, path);
            this.selection = new TextSelection(start, end, path);
        } else {
            textSelection.setStart(start);
            textSelection.setEnd(end);
            layout.getSelectionPath(start, end, textSelection.getPath());
        }
        invalidate();
    }

    public final void setSelectionColor(Integer num) {
        this.selectionColor = num;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
    }
}
