package com.facebook.react.views.text;

import P8.q;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.NativeViewHierarchyOptimizer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactShadowNode;
import com.facebook.react.uimanager.ReactShadowNodeImpl;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.internal.ReactTextInlineImageShadowNode;
import com.facebook.react.views.text.internal.span.CustomLetterSpacingSpan;
import com.facebook.react.views.text.internal.span.CustomLineHeightSpan;
import com.facebook.react.views.text.internal.span.CustomStyleSpan;
import com.facebook.react.views.text.internal.span.ReactAbsoluteSizeSpan;
import com.facebook.react.views.text.internal.span.ReactBackgroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactClickableSpan;
import com.facebook.react.views.text.internal.span.ReactForegroundColorSpan;
import com.facebook.react.views.text.internal.span.ReactSpan;
import com.facebook.react.views.text.internal.span.ReactStrikethroughSpan;
import com.facebook.react.views.text.internal.span.ReactTagSpan;
import com.facebook.react.views.text.internal.span.ReactUnderlineSpan;
import com.facebook.react.views.text.internal.span.SetSpanOperation;
import com.facebook.react.views.text.internal.span.ShadowStyleSpan;
import com.facebook.react.views.text.internal.span.TextInlineImageSpan;
import com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 \u009d\u00012\u00020\u0001:\u0002\u009d\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u001f\u0010\u0018J\u0019\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0015H\u0007¢\u0006\u0004\b$\u0010\u0018J\u0019\u0010&\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u00020\u00122\b\u0010%\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b(\u0010'J\u0019\u0010*\u001a\u00020\u00122\b\u0010)\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b*\u0010\"J\u0019\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b,\u0010\"J\u0019\u0010.\u001a\u00020\u00122\b\u0010-\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b.\u0010\"J\u0019\u00100\u001a\u00020\u00122\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b0\u0010\"J\u0019\u00103\u001a\u00020\u00122\b\u00102\u001a\u0004\u0018\u000101H\u0007¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\u00020\u00122\b\u00105\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b6\u0010\"J\u0017\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00020\tH\u0007¢\u0006\u0004\b8\u0010\u001dJ\u0019\u0010:\u001a\u00020\u00122\b\u00109\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b:\u0010\"J\u0019\u0010<\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010\u0007H\u0017¢\u0006\u0004\b<\u0010\"J\u0019\u0010?\u001a\u00020\u00122\b\u0010>\u001a\u0004\u0018\u00010=H\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020\u0015H\u0007¢\u0006\u0004\bB\u0010\u0018J\u0017\u0010D\u001a\u00020\u00122\u0006\u0010C\u001a\u00020\u0010H\u0007¢\u0006\u0004\bD\u0010\u0014J\u0019\u0010F\u001a\u00020\u00122\b\u0010E\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\bF\u0010\"J\u0017\u0010H\u001a\u00020\u00122\u0006\u0010G\u001a\u00020\tH\u0007¢\u0006\u0004\bH\u0010\u001dJ\u0017\u0010J\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0015H\u0007¢\u0006\u0004\bJ\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010\u0005R\"\u0010P\u001a\u00020O8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010V\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bV\u0010X\"\u0004\bY\u0010\u001dR\"\u0010%\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b%\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b&\u0010\u0014R\"\u0010]\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b]\u0010W\u001a\u0004\b]\u0010X\"\u0004\b^\u0010\u001dR\"\u0010_\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\b(\u0010\u0014R$\u0010)\u001a\u0004\u0018\u00010a8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b)\u0010b\u001a\u0004\bc\u0010d\"\u0004\b*\u0010eR$\u0010+\u001a\u0004\u0018\u00010f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b+\u0010g\u001a\u0004\bh\u0010i\"\u0004\b,\u0010jR$\u0010\u0011\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\bl\u0010\\R\"\u0010;\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010Z\u001a\u0004\bm\u0010\\\"\u0004\b<\u0010\u0014R\"\u0010n\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bn\u0010Z\u001a\u0004\bo\u0010\\\"\u0004\bp\u0010\u0014R\"\u0010q\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bq\u0010Z\u001a\u0004\br\u0010\\\"\u0004\bs\u0010\u0014R$\u0010 \u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00108D@BX\u0084\u000e¢\u0006\f\n\u0004\b \u0010Z\u001a\u0004\bt\u0010\\R\"\u0010u\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bu\u0010Z\u001a\u0004\bv\u0010\\\"\u0004\b6\u0010\u0014R\"\u0010w\u001a\u00020\u00108\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bw\u0010Z\u001a\u0004\bx\u0010\\\"\u0004\b0\u0010\u0014R(\u0010-\u001a\u0004\u0018\u00010\u00072\b\u0010k\u001a\u0004\u0018\u00010\u00078\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b-\u0010y\u001a\u0004\bz\u0010{R$\u0010|\u001a\u0004\u0018\u00010\u00078\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b|\u0010y\u001a\u0004\b}\u0010{\"\u0004\b~\u0010\"R%\u0010\u007f\u001a\u00020\t2\u0006\u0010k\u001a\u00020\t8\u0004@BX\u0084\u000e¢\u0006\r\n\u0004\b\u007f\u0010W\u001a\u0005\b\u0080\u0001\u0010XR$\u0010G\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0014\n\u0004\bG\u0010W\u001a\u0005\b\u0081\u0001\u0010X\"\u0005\b\u0082\u0001\u0010\u001dR'\u0010I\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u00158\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\bI\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R(\u0010\u0086\u0001\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0083\u0001\u001a\u0006\b\u0087\u0001\u0010\u0085\u0001\"\u0005\b\u0088\u0001\u0010\u0018R(\u0010\u0089\u0001\u001a\u00020\u00158\u0004@\u0004X\u0084\u000e¢\u0006\u0017\n\u0006\b\u0089\u0001\u0010\u0083\u0001\u001a\u0006\b\u008a\u0001\u0010\u0085\u0001\"\u0005\b\u008b\u0001\u0010\u0018R'\u0010A\u001a\u00020\u00152\u0006\u0010k\u001a\u00020\u00158\u0004@BX\u0084\u000e¢\u0006\u000f\n\u0005\bA\u0010\u0083\u0001\u001a\u0006\b\u008c\u0001\u0010\u0085\u0001R%\u0010C\u001a\u00020\u00102\u0006\u0010k\u001a\u00020\u00108\u0004@BX\u0084\u000e¢\u0006\r\n\u0004\bC\u0010Z\u001a\u0005\b\u008d\u0001\u0010\\R&\u0010\u008e\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010W\u001a\u0005\b\u008e\u0001\u0010X\"\u0005\b\u008f\u0001\u0010\u001dR&\u0010\u0090\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010W\u001a\u0005\b\u0090\u0001\u0010X\"\u0005\b\u0091\u0001\u0010\u001dR&\u0010\u0092\u0001\u001a\u00020\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010W\u001a\u0005\b\u0093\u0001\u0010X\"\u0005\b\u0094\u0001\u0010\u001dR=\u0010\u0097\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0096\u0001\u0018\u00010\u0095\u00018\u0004@\u0004X\u0084\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001¨\u0006\u009e\u0001"}, d2 = {"Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "Lcom/facebook/react/uimanager/LayoutShadowNode;", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "reactTextViewManagerCallback", "<init>", "(Lcom/facebook/react/views/text/ReactTextViewManagerCallback;)V", "textShadowNode", PointerEventHelper.POINTER_TYPE_UNKNOWN, ReactTextInputShadowNode.PROP_TEXT, PointerEventHelper.POINTER_TYPE_UNKNOWN, "supportsInlineViews", "Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;", "nativeViewHierarchyOptimizer", "Landroid/text/Spannable;", "spannedFromShadowNode", "(Lcom/facebook/react/views/text/ReactBaseTextShadowNode;Ljava/lang/String;ZLcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)Landroid/text/Spannable;", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.NUMBER_OF_LINES, "Li7/B;", "setNumberOfLines", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LINE_HEIGHT, "setLineHeight", "(F)V", ViewProps.LETTER_SPACING, "setLetterSpacing", ViewProps.ALLOW_FONT_SCALING, "setAllowFontScaling", "(Z)V", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "setMaxFontSizeMultiplier", ViewProps.TEXT_ALIGN, "setTextAlign", "(Ljava/lang/String;)V", ViewProps.FONT_SIZE, "setFontSize", ViewProps.COLOR, "setColor", "(Ljava/lang/Integer;)V", "setBackgroundColor", ViewProps.ACCESSIBILITY_ROLE, "setAccessibilityRole", ViewProps.ROLE, "setRole", ViewProps.FONT_FAMILY, "setFontFamily", "fontWeightString", "setFontWeight", "Lcom/facebook/react/bridge/ReadableArray;", "fontVariantArray", "setFontVariant", "(Lcom/facebook/react/bridge/ReadableArray;)V", "fontStyleString", "setFontStyle", "includepad", "setIncludeFontPadding", "textDecorationLineString", "setTextDecorationLine", ViewProps.TEXT_BREAK_STRATEGY, "setTextBreakStrategy", "Lcom/facebook/react/bridge/ReadableMap;", "offsetMap", "setTextShadowOffset", "(Lcom/facebook/react/bridge/ReadableMap;)V", ReactBaseTextShadowNode.PROP_SHADOW_RADIUS, "setTextShadowRadius", ReactBaseTextShadowNode.PROP_SHADOW_COLOR, "setTextShadowColor", ReactBaseTextShadowNode.PROP_TEXT_TRANSFORM, "setTextTransform", ViewProps.ADJUSTS_FONT_SIZE_TO_FIT, "setAdjustFontSizeToFit", ViewProps.MINIMUM_FONT_SCALE, "setMinimumFontScale", "Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "getReactTextViewManagerCallback", "()Lcom/facebook/react/views/text/ReactTextViewManagerCallback;", "setReactTextViewManagerCallback", "Lcom/facebook/react/views/text/TextAttributes;", "textAttributes", "Lcom/facebook/react/views/text/TextAttributes;", "getTextAttributes", "()Lcom/facebook/react/views/text/TextAttributes;", "setTextAttributes", "(Lcom/facebook/react/views/text/TextAttributes;)V", "isColorSet", "Z", "()Z", "setColorSet", "I", "getColor", "()I", "isBackgroundColorSet", "setBackgroundColorSet", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "getAccessibilityRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;)V", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "getRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;)V", "value", "getNumberOfLines", "getTextBreakStrategy", "hyphenationFrequency", "getHyphenationFrequency", "setHyphenationFrequency", "justificationMode", "getJustificationMode", "setJustificationMode", "getTextAlign", ViewProps.FONT_STYLE, "getFontStyle", ViewProps.FONT_WEIGHT, "getFontWeight", "Ljava/lang/String;", "getFontFamily", "()Ljava/lang/String;", "fontFeatureSettings", "getFontFeatureSettings", "setFontFeatureSettings", ViewProps.INCLUDE_FONT_PADDING, "getIncludeFontPadding", "getAdjustsFontSizeToFit", "setAdjustsFontSizeToFit", "F", "getMinimumFontScale", "()F", "textShadowOffsetDx", "getTextShadowOffsetDx", "setTextShadowOffsetDx", "textShadowOffsetDy", "getTextShadowOffsetDy", "setTextShadowOffsetDy", "getTextShadowRadius", "getTextShadowColor", "isUnderlineTextDecorationSet", "setUnderlineTextDecorationSet", "isLineThroughTextDecorationSet", "setLineThroughTextDecorationSet", "containsImages", "getContainsImages", "setContainsImages", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ReactShadowNode;", "inlineViews", "Ljava/util/Map;", "getInlineViews", "()Ljava/util/Map;", "setInlineViews", "(Ljava/util/Map;)V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ReactBaseTextShadowNode extends LayoutShadowNode {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String INLINE_VIEW_PLACEHOLDER = "0";
    public static final String PROP_SHADOW_COLOR = "textShadowColor";
    public static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    public static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    public static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    public static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    public static final String PROP_TEXT_TRANSFORM = "textTransform";
    private ReactAccessibilityDelegate.AccessibilityRole accessibilityRole;
    private boolean adjustsFontSizeToFit;
    private int backgroundColor;
    private int color;
    private boolean containsImages;
    private String fontFamily;
    private String fontFeatureSettings;
    private int fontStyle;
    private int fontWeight;
    private int hyphenationFrequency;
    private boolean includeFontPadding;
    private Map<Integer, ? extends ReactShadowNode<?>> inlineViews;
    private boolean isBackgroundColorSet;
    private boolean isColorSet;
    private boolean isLineThroughTextDecorationSet;
    private boolean isUnderlineTextDecorationSet;
    private int justificationMode;
    private float minimumFontScale;
    private int numberOfLines;
    private ReactTextViewManagerCallback reactTextViewManagerCallback;
    private ReactAccessibilityDelegate.Role role;
    private int textAlign;
    private TextAttributes textAttributes;
    private int textBreakStrategy;
    private int textShadowColor;
    private float textShadowOffsetDx;
    private float textShadowOffsetDy;
    private float textShadowRadius;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ja\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0011\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u0014\u0010\u001f\u001a\u00020\u00178\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u0014\u0010 \u001a\u00020\u00108\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/facebook/react/views/text/ReactBaseTextShadowNode$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/views/text/ReactBaseTextShadowNode;", "textShadowNode", "Landroid/text/SpannableStringBuilder;", "sb", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/views/text/internal/span/SetSpanOperation;", "ops", "Lcom/facebook/react/views/text/TextAttributes;", "parentTextAttributes", PointerEventHelper.POINTER_TYPE_UNKNOWN, "supportsInlineViews", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/ReactShadowNode;", "inlineViews", ViewProps.START, "Li7/B;", "buildSpannedFromShadowNode", "(Lcom/facebook/react/views/text/ReactBaseTextShadowNode;Landroid/text/SpannableStringBuilder;Ljava/util/List;Lcom/facebook/react/views/text/TextAttributes;ZLjava/util/Map;I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "INLINE_VIEW_PLACEHOLDER", "Ljava/lang/String;", "PROP_SHADOW_OFFSET", "PROP_SHADOW_OFFSET_WIDTH", "PROP_SHADOW_OFFSET_HEIGHT", "PROP_SHADOW_RADIUS", "PROP_SHADOW_COLOR", "PROP_TEXT_TRANSFORM", "DEFAULT_TEXT_SHADOW_COLOR", "I", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void buildSpannedFromShadowNode(ReactBaseTextShadowNode textShadowNode, SpannableStringBuilder sb, List<SetSpanOperation> ops, TextAttributes parentTextAttributes, boolean supportsInlineViews, Map<Integer, ReactShadowNode<?>> inlineViews, int start) {
            TextAttributes textAttributes;
            float layoutWidth;
            float layoutHeight;
            if (parentTextAttributes == null || (textAttributes = parentTextAttributes.applyChild(textShadowNode.getTextAttributes())) == null) {
                textAttributes = textShadowNode.getTextAttributes();
            }
            TextAttributes textAttributes2 = textAttributes;
            int childCount = textShadowNode.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                ReactShadowNodeImpl childAt = textShadowNode.getChildAt(i10);
                AbstractC2855l.f(childAt, "getChildAt(...)");
                if (childAt instanceof ReactBaseTextShadowNode) {
                    buildSpannedFromShadowNode((ReactBaseTextShadowNode) childAt, sb, ops, textAttributes2, supportsInlineViews, inlineViews, sb.length());
                } else if (childAt instanceof ReactTextInlineImageShadowNode) {
                    sb.append(ReactBaseTextShadowNode.INLINE_VIEW_PLACEHOLDER);
                    ops.add(new SetSpanOperation(sb.length() - 1, sb.length(), ((ReactTextInlineImageShadowNode) childAt).buildInlineImageSpan()));
                } else {
                    if (!supportsInlineViews) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    w wVar = styleWidth.f20751b;
                    w wVar2 = w.POINT;
                    if (wVar == wVar2 && styleHeight.f20751b == wVar2) {
                        layoutWidth = styleWidth.f20750a;
                        layoutHeight = styleHeight.f20750a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    sb.append(ReactBaseTextShadowNode.INLINE_VIEW_PLACEHOLDER);
                    ops.add(new SetSpanOperation(sb.length() - 1, sb.length(), new TextInlineViewPlaceholderSpan(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    if (inlineViews == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    inlineViews.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            int length = sb.length();
            if (length >= start) {
                if (textShadowNode.getIsColorSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactForegroundColorSpan(textShadowNode.getColor())));
                }
                if (textShadowNode.getIsBackgroundColorSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactBackgroundColorSpan(textShadowNode.getBackgroundColor())));
                }
                if (textShadowNode.getRole() == null ? textShadowNode.getAccessibilityRole() == ReactAccessibilityDelegate.AccessibilityRole.LINK : textShadowNode.getRole() == ReactAccessibilityDelegate.Role.LINK) {
                    ops.add(new SetSpanOperation(start, length, new ReactClickableSpan(textShadowNode.getReactTag())));
                }
                float effectiveLetterSpacing = textAttributes2.getEffectiveLetterSpacing();
                if (!Float.isNaN(effectiveLetterSpacing) && (parentTextAttributes == null || parentTextAttributes.getEffectiveLetterSpacing() != effectiveLetterSpacing)) {
                    ops.add(new SetSpanOperation(start, length, new CustomLetterSpacingSpan(effectiveLetterSpacing)));
                }
                int effectiveFontSize = textAttributes2.getEffectiveFontSize();
                if (parentTextAttributes == null || parentTextAttributes.getEffectiveFontSize() != effectiveFontSize) {
                    ops.add(new SetSpanOperation(start, length, new ReactAbsoluteSizeSpan(effectiveFontSize)));
                }
                if (textShadowNode.getFontStyle() != -1 || textShadowNode.getFontWeight() != -1 || textShadowNode.getFontFamily() != null) {
                    int fontStyle = textShadowNode.getFontStyle();
                    int fontWeight = textShadowNode.getFontWeight();
                    String fontFeatureSettings = textShadowNode.getFontFeatureSettings();
                    String fontFamily = textShadowNode.getFontFamily();
                    AssetManager assets = textShadowNode.getThemedContext().getAssets();
                    AbstractC2855l.f(assets, "getAssets(...)");
                    ops.add(new SetSpanOperation(start, length, new CustomStyleSpan(fontStyle, fontWeight, fontFeatureSettings, fontFamily, assets)));
                }
                if (textShadowNode.getIsUnderlineTextDecorationSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactUnderlineSpan()));
                }
                if (textShadowNode.getIsLineThroughTextDecorationSet()) {
                    ops.add(new SetSpanOperation(start, length, new ReactStrikethroughSpan()));
                }
                if ((textShadowNode.getTextShadowOffsetDx() != 0.0f || textShadowNode.getTextShadowOffsetDy() != 0.0f || textShadowNode.getTextShadowRadius() != 0.0f) && Color.alpha(textShadowNode.getTextShadowColor()) != 0) {
                    ops.add(new SetSpanOperation(start, length, new ShadowStyleSpan(textShadowNode.getTextShadowOffsetDx(), textShadowNode.getTextShadowOffsetDy(), textShadowNode.getTextShadowRadius(), textShadowNode.getTextShadowColor())));
                }
                float effectiveLineHeight = textAttributes2.getEffectiveLineHeight();
                if (!Float.isNaN(effectiveLineHeight) && (parentTextAttributes == null || parentTextAttributes.getEffectiveLineHeight() != effectiveLineHeight)) {
                    ops.add(new SetSpanOperation(start, length, new CustomLineHeightSpan(effectiveLineHeight)));
                }
                ops.add(new SetSpanOperation(start, length, new ReactTagSpan(textShadowNode.getReactTag())));
            }
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReactBaseTextShadowNode() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    protected final ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.accessibilityRole;
    }

    protected final boolean getAdjustsFontSizeToFit() {
        return this.adjustsFontSizeToFit;
    }

    protected final int getBackgroundColor() {
        return this.backgroundColor;
    }

    protected final int getColor() {
        return this.color;
    }

    protected final boolean getContainsImages() {
        return this.containsImages;
    }

    protected final String getFontFamily() {
        return this.fontFamily;
    }

    protected final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    protected final int getFontStyle() {
        return this.fontStyle;
    }

    protected final int getFontWeight() {
        return this.fontWeight;
    }

    protected final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    protected final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    protected final Map<Integer, ReactShadowNode<?>> getInlineViews() {
        return this.inlineViews;
    }

    protected final int getJustificationMode() {
        return this.justificationMode;
    }

    protected final float getMinimumFontScale() {
        return this.minimumFontScale;
    }

    protected final int getNumberOfLines() {
        return this.numberOfLines;
    }

    protected final ReactTextViewManagerCallback getReactTextViewManagerCallback() {
        return this.reactTextViewManagerCallback;
    }

    protected final ReactAccessibilityDelegate.Role getRole() {
        return this.role;
    }

    protected final int getTextAlign() {
        if (getLayoutDirection() != com.facebook.yoga.h.RTL) {
            return this.textAlign;
        }
        int i10 = this.textAlign;
        if (i10 == 3) {
            return 5;
        }
        if (i10 != 5) {
            return i10;
        }
        return 3;
    }

    protected final TextAttributes getTextAttributes() {
        return this.textAttributes;
    }

    protected final int getTextBreakStrategy() {
        return this.textBreakStrategy;
    }

    protected final int getTextShadowColor() {
        return this.textShadowColor;
    }

    protected final float getTextShadowOffsetDx() {
        return this.textShadowOffsetDx;
    }

    protected final float getTextShadowOffsetDy() {
        return this.textShadowOffsetDy;
    }

    protected final float getTextShadowRadius() {
        return this.textShadowRadius;
    }

    /* JADX INFO: renamed from: isBackgroundColorSet, reason: from getter */
    protected final boolean getIsBackgroundColorSet() {
        return this.isBackgroundColorSet;
    }

    /* JADX INFO: renamed from: isColorSet, reason: from getter */
    protected final boolean getIsColorSet() {
        return this.isColorSet;
    }

    /* JADX INFO: renamed from: isLineThroughTextDecorationSet, reason: from getter */
    protected final boolean getIsLineThroughTextDecorationSet() {
        return this.isLineThroughTextDecorationSet;
    }

    /* JADX INFO: renamed from: isUnderlineTextDecorationSet, reason: from getter */
    protected final boolean getIsUnderlineTextDecorationSet() {
        return this.isUnderlineTextDecorationSet;
    }

    protected final void setAccessibilityRole(ReactAccessibilityDelegate.AccessibilityRole accessibilityRole) {
        this.accessibilityRole = accessibilityRole;
    }

    @ReactProp(name = ViewProps.ADJUSTS_FONT_SIZE_TO_FIT)
    public final void setAdjustFontSizeToFit(boolean adjustsFontSizeToFit) {
        if (adjustsFontSizeToFit != this.adjustsFontSizeToFit) {
            this.adjustsFontSizeToFit = adjustsFontSizeToFit;
            markUpdated();
        }
    }

    protected final void setAdjustsFontSizeToFit(boolean z10) {
        this.adjustsFontSizeToFit = z10;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.ALLOW_FONT_SCALING)
    public final void setAllowFontScaling(boolean allowFontScaling) {
        if (allowFontScaling != this.textAttributes.getAllowFontScaling()) {
            this.textAttributes.setAllowFontScaling(allowFontScaling);
            markUpdated();
        }
    }

    protected final void setBackgroundColor(int i10) {
        this.backgroundColor = i10;
    }

    protected final void setBackgroundColorSet(boolean z10) {
        this.isBackgroundColorSet = z10;
    }

    protected final void setColor(int i10) {
        this.color = i10;
    }

    protected final void setColorSet(boolean z10) {
        this.isColorSet = z10;
    }

    protected final void setContainsImages(boolean z10) {
        this.containsImages = z10;
    }

    @ReactProp(name = ViewProps.FONT_FAMILY)
    public final void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        markUpdated();
    }

    protected final void setFontFeatureSettings(String str) {
        this.fontFeatureSettings = str;
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.FONT_SIZE)
    public final void setFontSize(float fontSize) {
        this.textAttributes.setFontSize(fontSize);
        markUpdated();
    }

    protected final void setFontStyle(int i10) {
        this.fontStyle = i10;
    }

    @ReactProp(name = ViewProps.FONT_VARIANT)
    public final void setFontVariant(ReadableArray fontVariantArray) {
        String fontVariant = ReactTypefaceUtils.parseFontVariant(fontVariantArray);
        if (AbstractC2855l.b(fontVariant, this.fontFeatureSettings)) {
            return;
        }
        this.fontFeatureSettings = fontVariant;
        markUpdated();
    }

    protected final void setFontWeight(int i10) {
        this.fontWeight = i10;
    }

    protected final void setHyphenationFrequency(int i10) {
        this.hyphenationFrequency = i10;
    }

    @ReactProp(defaultBoolean = true, name = ViewProps.INCLUDE_FONT_PADDING)
    public final void setIncludeFontPadding(boolean includepad) {
        this.includeFontPadding = includepad;
    }

    protected final void setInlineViews(Map<Integer, ? extends ReactShadowNode<?>> map) {
        this.inlineViews = map;
    }

    protected final void setJustificationMode(int i10) {
        this.justificationMode = i10;
    }

    @ReactProp(defaultFloat = 0.0f, name = ViewProps.LETTER_SPACING)
    public final void setLetterSpacing(float letterSpacing) {
        this.textAttributes.setLetterSpacing(letterSpacing);
        markUpdated();
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.LINE_HEIGHT)
    public final void setLineHeight(float lineHeight) {
        this.textAttributes.setLineHeight(lineHeight);
        markUpdated();
    }

    protected final void setLineThroughTextDecorationSet(boolean z10) {
        this.isLineThroughTextDecorationSet = z10;
    }

    @ReactProp(defaultFloat = Float.NaN, name = ViewProps.MAX_FONT_SIZE_MULTIPLIER)
    public final void setMaxFontSizeMultiplier(float maxFontSizeMultiplier) {
        if (maxFontSizeMultiplier == this.textAttributes.getMaxFontSizeMultiplier()) {
            return;
        }
        this.textAttributes.setMaxFontSizeMultiplier(maxFontSizeMultiplier);
        markUpdated();
    }

    @ReactProp(name = ViewProps.MINIMUM_FONT_SCALE)
    public final void setMinimumFontScale(float minimumFontScale) {
        if (minimumFontScale == this.minimumFontScale) {
            return;
        }
        this.minimumFontScale = minimumFontScale;
        markUpdated();
    }

    @ReactProp(defaultInt = -1, name = ViewProps.NUMBER_OF_LINES)
    public final void setNumberOfLines(int numberOfLines) {
        if (numberOfLines == 0) {
            numberOfLines = -1;
        }
        this.numberOfLines = numberOfLines;
        markUpdated();
    }

    protected final void setReactTextViewManagerCallback(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
    }

    protected final void setRole(ReactAccessibilityDelegate.Role role) {
        this.role = role;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r6.equals(com.facebook.react.uimanager.ViewProps.LEFT) == false) goto L27;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
    @ReactProp(name = ViewProps.TEXT_ALIGN)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextAlign(String textAlign) {
        int i10 = 3;
        if (AbstractC2855l.b("justify", textAlign)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.justificationMode = 1;
            }
            this.textAlign = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.justificationMode = 0;
            }
            if (textAlign != null) {
                switch (textAlign.hashCode()) {
                    case -1364013995:
                        if (textAlign.equals("center")) {
                            i10 = 1;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        i10 = 0;
                        break;
                    case 3005871:
                        if (!textAlign.equals("auto")) {
                            AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        }
                        i10 = 0;
                        break;
                    case 3317767:
                        break;
                    case 108511772:
                        if (textAlign.equals(ViewProps.RIGHT)) {
                            i10 = 5;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + textAlign);
                        i10 = 0;
                        break;
                }
                this.textAlign = i10;
            } else {
                i10 = 0;
                this.textAlign = i10;
            }
        }
        markUpdated();
    }

    protected final void setTextAttributes(TextAttributes textAttributes) {
        AbstractC2855l.g(textAttributes, "<set-?>");
        this.textAttributes = textAttributes;
    }

    protected final void setTextBreakStrategy(int i10) {
        this.textBreakStrategy = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    @ReactProp(name = ViewProps.TEXT_DECORATION_LINE)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextDecorationLine(String textDecorationLineString) {
        List listJ;
        this.isUnderlineTextDecorationSet = false;
        this.isLineThroughTextDecorationSet = false;
        if (textDecorationLineString != null) {
            List listG0 = q.G0(textDecorationLineString, new String[]{" "}, false, 0, 6, null);
            if (listG0.isEmpty()) {
                listJ = AbstractC2800q.j();
                while (i < r1) {
                }
            } else {
                ListIterator listIterator = listG0.listIterator(listG0.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listJ = AbstractC2800q.I0(listG0, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listJ = AbstractC2800q.j();
                for (String str : (String[]) listJ.toArray(new String[0])) {
                    if (AbstractC2855l.b("underline", str)) {
                        this.isUnderlineTextDecorationSet = true;
                    } else if (AbstractC2855l.b("line-through", str)) {
                        this.isLineThroughTextDecorationSet = true;
                    }
                }
            }
        }
        markUpdated();
    }

    @ReactProp(customType = "Color", defaultInt = DEFAULT_TEXT_SHADOW_COLOR, name = PROP_SHADOW_COLOR)
    public final void setTextShadowColor(int textShadowColor) {
        if (textShadowColor != this.textShadowColor) {
            this.textShadowColor = textShadowColor;
            markUpdated();
        }
    }

    @ReactProp(name = PROP_SHADOW_OFFSET)
    public final void setTextShadowOffset(ReadableMap offsetMap) {
        this.textShadowOffsetDx = 0.0f;
        this.textShadowOffsetDy = 0.0f;
        if (offsetMap != null) {
            if (offsetMap.hasKey("width") && !offsetMap.isNull("width")) {
                this.textShadowOffsetDx = PixelUtil.toPixelFromDIP(offsetMap.getDouble("width"));
            }
            if (offsetMap.hasKey("height") && !offsetMap.isNull("height")) {
                this.textShadowOffsetDy = PixelUtil.toPixelFromDIP(offsetMap.getDouble("height"));
            }
        }
        markUpdated();
    }

    protected final void setTextShadowOffsetDx(float f10) {
        this.textShadowOffsetDx = f10;
    }

    protected final void setTextShadowOffsetDy(float f10) {
        this.textShadowOffsetDy = f10;
    }

    @ReactProp(defaultInt = 1, name = PROP_SHADOW_RADIUS)
    public final void setTextShadowRadius(float textShadowRadius) {
        if (textShadowRadius == this.textShadowRadius) {
            return;
        }
        this.textShadowRadius = textShadowRadius;
        markUpdated();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    @ReactProp(name = PROP_TEXT_TRANSFORM)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void setTextTransform(String textTransform) {
        TextTransform textTransform2;
        if (textTransform != null) {
            switch (textTransform.hashCode()) {
                case -1765638420:
                    if (!textTransform.equals("capitalize")) {
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textTransform: " + textTransform);
                        textTransform2 = TextTransform.UNSET;
                    } else {
                        textTransform2 = TextTransform.CAPITALIZE;
                    }
                    break;
                case -514507343:
                    if (textTransform.equals("lowercase")) {
                        textTransform2 = TextTransform.LOWERCASE;
                        break;
                    }
                    break;
                case 3387192:
                    if (textTransform.equals("none")) {
                        textTransform2 = TextTransform.NONE;
                        break;
                    }
                    break;
                case 223523538:
                    if (textTransform.equals("uppercase")) {
                        textTransform2 = TextTransform.UPPERCASE;
                        break;
                    }
                    break;
            }
        } else {
            textTransform2 = TextTransform.UNSET;
        }
        this.textAttributes.textTransform = textTransform2;
        markUpdated();
    }

    protected final void setUnderlineTextDecorationSet(boolean z10) {
        this.isUnderlineTextDecorationSet = z10;
    }

    protected final Spannable spannedFromShadowNode(ReactBaseTextShadowNode textShadowNode, String text, boolean supportsInlineViews, NativeViewHierarchyOptimizer nativeViewHierarchyOptimizer) {
        int i10;
        AbstractC2855l.g(textShadowNode, "textShadowNode");
        if (supportsInlineViews && nativeViewHierarchyOptimizer == null) {
            throw new IllegalStateException("nativeViewHierarchyOptimizer is required when inline views are supported");
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = supportsInlineViews ? new HashMap() : null;
        if (text != null) {
            spannableStringBuilder.append((CharSequence) TextTransform.INSTANCE.apply(text, textShadowNode.textAttributes.textTransform));
        }
        INSTANCE.buildSpannedFromShadowNode(textShadowNode, spannableStringBuilder, arrayList, null, supportsInlineViews, map, 0);
        textShadowNode.containsImages = false;
        textShadowNode.inlineViews = map;
        int size = arrayList.size();
        float f10 = Float.NaN;
        for (int i11 = 0; i11 < size; i11++) {
            SetSpanOperation setSpanOperation = (SetSpanOperation) arrayList.get((arrayList.size() - i11) - 1);
            ReactSpan reactSpan = setSpanOperation.what;
            boolean z10 = reactSpan instanceof TextInlineImageSpan;
            if (z10 || (reactSpan instanceof TextInlineViewPlaceholderSpan)) {
                if (z10) {
                    i10 = ((TextInlineImageSpan) reactSpan).get_height();
                    textShadowNode.containsImages = true;
                } else {
                    AbstractC2855l.e(reactSpan, "null cannot be cast to non-null type com.facebook.react.views.text.internal.span.TextInlineViewPlaceholderSpan");
                    TextInlineViewPlaceholderSpan textInlineViewPlaceholderSpan = (TextInlineViewPlaceholderSpan) reactSpan;
                    int height = textInlineViewPlaceholderSpan.getHeight();
                    if (map == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    ReactShadowNode reactShadowNode = (ReactShadowNode) map.get(Integer.valueOf(textInlineViewPlaceholderSpan.getReactTag()));
                    if (reactShadowNode == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (nativeViewHierarchyOptimizer == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    nativeViewHierarchyOptimizer.handleForceViewToBeNonLayoutOnly(reactShadowNode);
                    reactShadowNode.setLayoutParent(textShadowNode);
                    i10 = height;
                }
                if (Float.isNaN(f10) || i10 > f10) {
                    f10 = i10;
                }
            }
            setSpanOperation.execute(spannableStringBuilder, i11);
        }
        textShadowNode.textAttributes.setHeightOfTallestInlineViewOrImage(f10);
        ReactTextViewManagerCallback reactTextViewManagerCallback = this.reactTextViewManagerCallback;
        if (reactTextViewManagerCallback != null) {
            reactTextViewManagerCallback.onPostProcessSpannable(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public /* synthetic */ ReactBaseTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : reactTextViewManagerCallback);
    }

    @ReactProp(name = ViewProps.ACCESSIBILITY_ROLE)
    public final void setAccessibilityRole(String accessibilityRole) {
        if (isVirtual()) {
            this.accessibilityRole = ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromValue(accessibilityRole);
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.BACKGROUND_COLOR)
    public final void setBackgroundColor(Integer color) {
        if (isVirtual()) {
            if (color != null) {
                int iIntValue = color.intValue();
                this.isBackgroundColorSet = true;
                this.backgroundColor = iIntValue;
            }
            markUpdated();
        }
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public final void setColor(Integer color) {
        if (color != null) {
            int iIntValue = color.intValue();
            this.isColorSet = true;
            this.color = iIntValue;
        }
        markUpdated();
    }

    @ReactProp(name = ViewProps.FONT_STYLE)
    public final void setFontStyle(String fontStyleString) {
        int fontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
        if (fontStyle != this.fontStyle) {
            this.fontStyle = fontStyle;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.FONT_WEIGHT)
    public final void setFontWeight(String fontWeightString) {
        int fontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
        if (fontWeight != this.fontWeight) {
            this.fontWeight = fontWeight;
            markUpdated();
        }
    }

    @ReactProp(name = ViewProps.ROLE)
    public final void setRole(String role) {
        if (isVirtual()) {
            this.role = ReactAccessibilityDelegate.Role.INSTANCE.fromValue(role);
            markUpdated();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    @ReactProp(name = ViewProps.TEXT_BREAK_STRATEGY)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setTextBreakStrategy(String textBreakStrategy) {
        int i10 = 1;
        if (textBreakStrategy != null) {
            int iHashCode = textBreakStrategy.hashCode();
            if (iHashCode != -1924829944) {
                if (iHashCode != -902286926) {
                    if (iHashCode != 336871677 || !textBreakStrategy.equals("highQuality")) {
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textBreakStrategy: " + textBreakStrategy);
                    }
                } else if (textBreakStrategy.equals("simple")) {
                    i10 = 0;
                }
            } else if (textBreakStrategy.equals("balanced")) {
                i10 = 2;
            }
        }
        this.textBreakStrategy = i10;
        markUpdated();
    }

    public ReactBaseTextShadowNode(ReactTextViewManagerCallback reactTextViewManagerCallback) {
        this.reactTextViewManagerCallback = reactTextViewManagerCallback;
        this.textAttributes = new TextAttributes();
        this.numberOfLines = -1;
        this.textBreakStrategy = 1;
        this.justificationMode = 0;
        this.fontStyle = -1;
        this.fontWeight = -1;
        this.includeFontPadding = true;
        this.textShadowColor = DEFAULT_TEXT_SHADOW_COLOR;
    }
}
