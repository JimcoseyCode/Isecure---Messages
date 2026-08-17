package com.facebook.react.views.text;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIViewOperationQueue;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import com.facebook.yoga.q;
import com.facebook.yoga.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2845b;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\bJ\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010#\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u001f\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/facebook/react/views/text/ReactTextShadowNode;", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "Li7/B;", "initMeasureFunction", "()V", "Landroid/text/Spannable;", ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "Lcom/facebook/yoga/p;", "widthMode", "Landroid/text/Layout;", "measureSpannedText", "(Landroid/text/Spannable;FLcom/facebook/yoga/p;)Landroid/text/Layout;", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "onBeforeLayout", "(Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isVirtualAnchor", "()Z", "hoistNativeChildren", "markUpdated", "Lcom/facebook/react/uimanager/UIViewOperationQueue;", "uiViewOperationQueue", "onCollectExtraUpdates", "(Lcom/facebook/react/uimanager/UIViewOperationQueue;)V", "shouldNotifyOnTextLayout", "setShouldNotifyOnTextLayout", "(Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ReactShadowNode;", "calculateLayoutOnChildren", "()Ljava/lang/Iterable;", "preparedSpannableText", "Landroid/text/Spannable;", "Z", "Lcom/facebook/yoga/o;", "textMeasureFunction", "Lcom/facebook/yoga/o;", "Lcom/facebook/yoga/b;", "textBaselineFunction", "Lcom/facebook/yoga/b;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "get_textAlign", "()I", "_textAlign", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactTextShadowNode extends ReactBaseTextShadowNode {
    private static final Companion Companion = new Companion(null);
    private static final TextPaint textPaintInstance = new TextPaint(1);
    private Spannable preparedSpannableText;
    private boolean shouldNotifyOnTextLayout;
    private final com.facebook.yoga.b textBaselineFunction;
    private final o textMeasureFunction;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/react/views/text/ReactTextShadowNode$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "textPaintInstance", "Landroid/text/TextPaint;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactTextShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final int get_textAlign() {
        int textAlign = super.getTextAlign();
        if (getLayoutDirection() == com.facebook.yoga.h.RTL) {
            if (textAlign == 3) {
                return 5;
            }
            if (textAlign == 5) {
                return 3;
            }
        }
        return textAlign;
    }

    private final void initMeasureFunction() {
        if (isVirtual()) {
            return;
        }
        setMeasureFunction(this.textMeasureFunction);
        setBaselineFunction(this.textBaselineFunction);
    }

    private final Layout measureSpannedText(Spannable text, float width, p widthMode) {
        float fCeil = width;
        TextPaint textPaint = textPaintInstance;
        textPaint.setTextSize(getTextAttributes().getEffectiveFontSize());
        BoringLayout.Metrics metricsIsBoring = BoringLayout.isBoring(text, textPaint);
        float desiredWidth = metricsIsBoring == null ? Layout.getDesiredWidth(text, textPaint) : Float.NaN;
        boolean z10 = widthMode == p.UNDEFINED || fCeil < 0.0f;
        int i10 = get_textAlign();
        Layout.Alignment alignment = i10 != 1 ? (i10 == 3 || i10 != 5) ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
        if (metricsIsBoring == null && (z10 || (!com.facebook.yoga.g.a(desiredWidth) && desiredWidth <= fCeil))) {
            StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (int) Math.ceil(desiredWidth)).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getTextBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency());
            AbstractC2855l.f(hyphenationFrequency, "setHyphenationFrequency(...)");
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 26) {
                hyphenationFrequency.setJustificationMode(getJustificationMode());
            }
            if (i11 >= 28) {
                hyphenationFrequency.setUseLineSpacingFromFallbacks(true);
            }
            StaticLayout staticLayoutBuild = hyphenationFrequency.build();
            AbstractC2855l.f(staticLayoutBuild, "build(...)");
            return staticLayoutBuild;
        }
        if (metricsIsBoring != null && (z10 || metricsIsBoring.width <= fCeil)) {
            BoringLayout boringLayoutMake = BoringLayout.make(text, textPaint, (int) Math.max(metricsIsBoring.width, 0.0d), alignment, 1.0f, 0.0f, metricsIsBoring, getIncludeFontPadding());
            AbstractC2855l.f(boringLayoutMake, "make(...)");
            return boringLayoutMake;
        }
        Layout.Alignment alignment2 = alignment;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        StaticLayout.Builder hyphenationFrequency2 = StaticLayout.Builder.obtain(text, 0, text.length(), textPaint, (int) fCeil).setAlignment(alignment2).setLineSpacing(0.0f, 1.0f).setIncludePad(getIncludeFontPadding()).setBreakStrategy(getTextBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency());
        AbstractC2855l.f(hyphenationFrequency2, "setHyphenationFrequency(...)");
        if (i12 >= 26) {
            hyphenationFrequency2.setJustificationMode(getJustificationMode());
        }
        if (i12 >= 28) {
            hyphenationFrequency2.setUseLineSpacingFromFallbacks(true);
        }
        StaticLayout staticLayoutBuild2 = hyphenationFrequency2.build();
        AbstractC2855l.f(staticLayoutBuild2, "build(...)");
        return staticLayoutBuild2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float textBaselineFunction$lambda$4(ReactTextShadowNode reactTextShadowNode, r node, float f10, float f11) {
        AbstractC2855l.g(node, "node");
        Spannable spannable = reactTextShadowNode.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        Layout layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, f10, p.EXACTLY);
        return layoutMeasureSpannedText.getLineBaseline(layoutMeasureSpannedText.getLineCount() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:61:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long textMeasureFunction$lambda$2(ReactTextShadowNode reactTextShadowNode, r rVar, float f10, p widthMode, float f11, p heightMode) {
        float lineBottom;
        float fCeil = f10;
        AbstractC2855l.g(rVar, "<unused var>");
        AbstractC2855l.g(widthMode, "widthMode");
        AbstractC2855l.g(heightMode, "heightMode");
        Spannable spannable = reactTextShadowNode.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalArgumentException("Spannable element has not been prepared in onBeforeLayout");
        }
        Layout layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, fCeil, widthMode);
        int i10 = 0;
        int i11 = 1;
        if (reactTextShadowNode.getAdjustsFontSizeToFit()) {
            int effectiveFontSize = reactTextShadowNode.getTextAttributes().getEffectiveFontSize();
            int effectiveFontSize2 = reactTextShadowNode.getTextAttributes().getEffectiveFontSize();
            float f12 = effectiveFontSize;
            int iMax = (int) Math.max(reactTextShadowNode.getMinimumFontScale() * f12, PixelUtil.toPixelFromDIP(4.0f));
            for (int i12 = -1; effectiveFontSize2 > iMax && ((reactTextShadowNode.getNumberOfLines() != i12 && layoutMeasureSpannedText.getLineCount() > reactTextShadowNode.getNumberOfLines()) || (heightMode != p.UNDEFINED && layoutMeasureSpannedText.getHeight() > f11)); i12 = -1) {
                effectiveFontSize2 -= Math.max(i11, (int) PixelUtil.toPixelFromDIP(1.0f));
                float f13 = effectiveFontSize2 / f12;
                Iterator itA = AbstractC2845b.a((ReactAbsoluteSizeSpan[]) spannable.getSpans(i10, spannable.length(), ReactAbsoluteSizeSpan.class));
                while (itA.hasNext()) {
                    ReactAbsoluteSizeSpan reactAbsoluteSizeSpan = (ReactAbsoluteSizeSpan) itA.next();
                    spannable.setSpan(new ReactAbsoluteSizeSpan((int) Math.max(reactAbsoluteSizeSpan.getSize() * f13, iMax)), spannable.getSpanStart(reactAbsoluteSizeSpan), spannable.getSpanEnd(reactAbsoluteSizeSpan), spannable.getSpanFlags(reactAbsoluteSizeSpan));
                    spannable.removeSpan(reactAbsoluteSizeSpan);
                    i11 = i11;
                    effectiveFontSize2 = effectiveFontSize2;
                }
                layoutMeasureSpannedText = reactTextShadowNode.measureSpannedText(spannable, fCeil, widthMode);
                i10 = 0;
            }
        }
        if (reactTextShadowNode.shouldNotifyOnTextLayout) {
            ThemedReactContext themedContext = reactTextShadowNode.getThemedContext();
            AbstractC2855l.d(themedContext);
            WritableArray fontMetrics = FontMetricsUtil.getFontMetrics(spannable, layoutMeasureSpannedText, themedContext);
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putArray("lines", fontMetrics);
            if (themedContext.hasActiveReactInstance()) {
                ((RCTEventEmitter) themedContext.getJSModule(RCTEventEmitter.class)).receiveEvent(reactTextShadowNode.getReactTag(), "topTextLayout", writableMapCreateMap);
            } else {
                ReactSoftExceptionLogger.logSoftException("ReactTextShadowNode", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
            }
        }
        int lineCount = reactTextShadowNode.getNumberOfLines() == -1 ? layoutMeasureSpannedText.getLineCount() : (int) Math.min(reactTextShadowNode.getNumberOfLines(), layoutMeasureSpannedText.getLineCount());
        if (widthMode != p.EXACTLY) {
            float f14 = 0.0f;
            for (int i13 = 0; i13 < lineCount; i13++) {
                float lineWidth = (spannable.length() <= 0 || spannable.charAt(layoutMeasureSpannedText.getLineEnd(i13) + (-1)) != '\n') ? layoutMeasureSpannedText.getLineWidth(i13) : layoutMeasureSpannedText.getLineMax(i13);
                if (lineWidth > f14) {
                    f14 = lineWidth;
                }
            }
            if (widthMode != p.AT_MOST || f14 <= fCeil) {
                fCeil = f14;
            }
        }
        if (Build.VERSION.SDK_INT > 29) {
            fCeil = (float) Math.ceil(fCeil);
        }
        if (heightMode != p.EXACTLY) {
            lineBottom = layoutMeasureSpannedText.getLineBottom(lineCount - 1);
            if (heightMode == p.AT_MOST && lineBottom > f11) {
                lineBottom = f11;
            }
        }
        return q.a(fCeil, lineBottom);
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public Iterable<ReactShadowNode<?>> calculateLayoutOnChildren() {
        Map<Integer, ReactShadowNode<?>> inlineViews = getInlineViews();
        if (inlineViews == null || inlineViews.isEmpty()) {
            return null;
        }
        Spannable spannable = this.preparedSpannableText;
        if (spannable == null) {
            throw new IllegalStateException("Spannable element has not been prepared in onBeforeLayout");
        }
        TextInlineViewPlaceholderSpan[] textInlineViewPlaceholderSpanArr = (TextInlineViewPlaceholderSpan[]) spannable.getSpans(0, spannable.length(), TextInlineViewPlaceholderSpan.class);
        ArrayList arrayList = new ArrayList();
        Iterator itA = AbstractC2845b.a(textInlineViewPlaceholderSpanArr);
        while (itA.hasNext()) {
            TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) itA.next();
            Map<Integer, ReactShadowNode<?>> inlineViews2 = getInlineViews();
            ReactShadowNode<?> reactShadowNode = inlineViews2 != null ? inlineViews2.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag())) : null;
            if (reactShadowNode == null) {
                throw new IllegalStateException("Child is null");
            }
            reactShadowNode.calculateLayout();
            arrayList.add(reactShadowNode);
        }
        return arrayList;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean hoistNativeChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public boolean isVirtualAnchor() {
        return false;
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void markUpdated() {
        super.markUpdated();
        super.dirty();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onBeforeLayout(NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        AbstractC2855l.g(nativeViewHierarchyOptimizer, "nativeViewHierarchyOptimizer");
        this.preparedSpannableText = spannedFromShadowNode(this, null, true, nativeViewHierarchyOptimizer);
        markUpdated();
    }

    @Override // com.facebook.react.uimanager.ReactShadowNodeImpl, com.facebook.react.uimanager.ReactShadowNode
    public void onCollectExtraUpdates(UIViewOperationQueue uiViewOperationQueue) {
        AbstractC2855l.g(uiViewOperationQueue, "uiViewOperationQueue");
        super.onCollectExtraUpdates(uiViewOperationQueue);
        Spannable spannable = this.preparedSpannableText;
        if (spannable == null) {
            return;
        }
        uiViewOperationQueue.enqueueUpdateExtraData(getReactTag(), new ReactTextUpdate(spannable, -1, getContainsImages(), getPadding(4), getPadding(1), getPadding(5), getPadding(3), get_textAlign(), getTextBreakStrategy(), getJustificationMode()));
    }

    @ReactProp(name = "onTextLayout")
    public final void setShouldNotifyOnTextLayout(boolean shouldNotifyOnTextLayout) {
        this.shouldNotifyOnTextLayout = shouldNotifyOnTextLayout;
    }

    public /* synthetic */ ReactTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    public ReactTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        super(reactTextViewManagerCallback);
        this.textMeasureFunction = new o() { // from class: com.facebook.react.views.text.d
            @Override // com.facebook.yoga.o
            public final long measure(r rVar, float f10, p pVar, float f11, p pVar2) {
                return ReactTextShadowNode.textMeasureFunction$lambda$2(this.f20629a, rVar, f10, pVar, f11, pVar2);
            }
        };
        this.textBaselineFunction = new com.facebook.yoga.b() { // from class: com.facebook.react.views.text.e
            @Override // com.facebook.yoga.b
            public final float a(r rVar, float f10, float f11) {
                return ReactTextShadowNode.textBaselineFunction$lambda$4(this.f20630a, rVar, f10, f11);
            }
        };
        initMeasureFunction();
    }
}
