package com.facebook.react.views.text;

import P8.o;
import android.os.Build;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.common.mapbuffer.MapBuffer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ReactAccessibilityDelegate;
import com.facebook.react.uimanager.ReactStylesDiffMap;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import d2.AbstractC2325a;
import j7.AbstractC2800q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b/\u0018\u0000 |2\u00020\u0001:\u0001|B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0019\u0010\u001a\u001a\u00020\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0016J\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b \u0010\u0016J\u0019\u0010\"\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u0019\u0010$\u001a\u00020\u00062\b\u0010#\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b$\u0010\u0016J\u0019\u0010&\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b&\u0010\u0016J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020'H\u0002¢\u0006\u0004\b&\u0010(R*\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\fR$\u00100\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R*\u00103\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00101\u001a\u0004\b4\u00102\"\u0004\b5\u00106R*\u00107\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-\"\u0004\b9\u0010\fR$\u0010:\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b:\u00101\u001a\u0004\b:\u00102R$\u0010;\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b;\u0010+\u001a\u0004\b<\u0010-R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010?R$\u0010\n\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b@\u0010?R\u0016\u0010A\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010+R\u0016\u0010B\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010+R\u0016\u0010C\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010+R$\u0010\u001f\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010=\u001a\u0004\bD\u0010?R\"\u0010!\u001a\u00020E8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u00101\u001a\u0004\bK\u00102R$\u0010L\u001a\u00020/2\u0006\u0010)\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u00101\u001a\u0004\bL\u00102R\u0016\u0010M\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u00101R(\u0010#\u001a\u0004\u0018\u00010N2\b\u0010)\u001a\u0004\u0018\u00010N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010O\u001a\u0004\bP\u0010QR(\u0010%\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b%\u0010R\u001a\u0004\bS\u0010TR$\u0010U\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bU\u0010=\u001a\u0004\bV\u0010?R$\u0010W\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bW\u0010=\u001a\u0004\bX\u0010?R(\u0010Y\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R(\u0010]\u001a\u0004\u0018\u00010\u00132\b\u0010)\u001a\u0004\u0018\u00010\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010Z\u001a\u0004\b^\u0010\\R.\u0010_\u001a\u0004\u0018\u00010\u00042\b\u0010)\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR.\u0010e\u001a\u0004\u0018\u00010\u00042\b\u0010_\u001a\u0004\u0018\u00010\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010`\u001a\u0004\bf\u0010b\"\u0004\bg\u0010dR*\u0010h\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010+\u001a\u0004\bi\u0010-\"\u0004\bj\u0010\fR*\u0010k\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010+\u001a\u0004\bl\u0010-\"\u0004\bm\u0010\fR*\u0010n\u001a\u00020\t2\u0006\u0010)\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bn\u0010+\u001a\u0004\bo\u0010-\"\u0004\bp\u0010\fR*\u0010q\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010=\u001a\u0004\br\u0010?\"\u0004\bs\u0010\bR\u001a\u0010v\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\bu\u0010\u0003\u001a\u0004\bt\u0010-R$\u0010w\u001a\u00020\t2\u0006\u0010w\u001a\u00020\t8F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bx\u0010-\"\u0004\by\u0010\fR\u0011\u0010{\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bz\u0010-¨\u0006}"}, d2 = {"Lcom/facebook/react/views/text/TextAttributeProps;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.NUMBER_OF_LINES, "Li7/B;", "setNumberOfLines", "(I)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.FONT_SIZE, "setFontSize", "(F)V", "Lcom/facebook/react/bridge/ReadableArray;", ViewProps.FONT_VARIANT, "setFontVariant", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "(Lcom/facebook/react/common/mapbuffer/MapBuffer;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fontWeightString", "setFontWeight", "(Ljava/lang/String;)V", "fontStyleString", "setFontStyle", "textDecorationLineString", "setTextDecorationLine", "Lcom/facebook/react/bridge/ReadableMap;", "offsetMap", "setTextShadowOffset", "(Lcom/facebook/react/bridge/ReadableMap;)V", ViewProps.LAYOUT_DIRECTION, "setLayoutDirection", "textTransform", "setTextTransform", ViewProps.ACCESSIBILITY_ROLE, "setAccessibilityRole", ViewProps.ROLE, "setRole", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;)V", "value", ViewProps.LINE_HEIGHT, "F", "getLineHeight", "()F", "setLineHeight", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isColorSet", "Z", "()Z", ViewProps.ALLOW_FONT_SCALING, "getAllowFontScaling", "setAllowFontScaling", "(Z)V", ViewProps.MAX_FONT_SIZE_MULTIPLIER, "getMaxFontSizeMultiplier", "setMaxFontSizeMultiplier", "isBackgroundColorSet", ViewProps.OPACITY, "getOpacity", "I", "getNumberOfLines", "()I", "getFontSize", "fontSizeInput", "lineHeightInput", "letterSpacingInput", "getLayoutDirection", "Lcom/facebook/react/views/text/TextTransform;", "Lcom/facebook/react/views/text/TextTransform;", "getTextTransform$ReactAndroid_release", "()Lcom/facebook/react/views/text/TextTransform;", "setTextTransform$ReactAndroid_release", "(Lcom/facebook/react/views/text/TextTransform;)V", "isUnderlineTextDecorationSet", "isLineThroughTextDecorationSet", ViewProps.INCLUDE_FONT_PADDING, "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "getAccessibilityRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;", "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", "getRole", "()Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;", ViewProps.FONT_STYLE, "getFontStyle", ViewProps.FONT_WEIGHT, "getFontWeight", ViewProps.FONT_FAMILY, "Ljava/lang/String;", "getFontFamily", "()Ljava/lang/String;", "fontFeatureSettings", "getFontFeatureSettings", ViewProps.COLOR, "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", ViewProps.BACKGROUND_COLOR, "getBackgroundColor", "setBackgroundColor", "textShadowOffsetDx", "getTextShadowOffsetDx", "setTextShadowOffsetDx", "textShadowOffsetDy", "getTextShadowOffsetDy", "setTextShadowOffsetDy", "textShadowRadius", "getTextShadowRadius", "setTextShadowRadius", "textShadowColor", "getTextShadowColor", "setTextShadowColor", "getEffectiveLineHeight", "getEffectiveLineHeight$annotations", "effectiveLineHeight", ViewProps.LETTER_SPACING, "getLetterSpacing", "setLetterSpacing", "getEffectiveLetterSpacing", "effectiveLetterSpacing", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextAttributeProps {
    private static final int DEFAULT_BREAK_STRATEGY = 1;
    private static final int DEFAULT_HYPHENATION_FREQUENCY = 0;
    private static final int DEFAULT_TEXT_SHADOW_COLOR = 1426063360;
    private static final String PROP_SHADOW_COLOR = "textShadowColor";
    private static final String PROP_SHADOW_OFFSET = "textShadowOffset";
    private static final String PROP_SHADOW_OFFSET_HEIGHT = "height";
    private static final String PROP_SHADOW_OFFSET_WIDTH = "width";
    private static final String PROP_SHADOW_RADIUS = "textShadowRadius";
    private static final String PROP_TEXT_TRANSFORM = "textTransform";
    public static final int TA_KEY_ACCESSIBILITY_ROLE = 24;
    public static final int TA_KEY_ALIGNMENT = 12;
    public static final int TA_KEY_ALLOW_FONT_SCALING = 9;
    public static final int TA_KEY_BACKGROUND_COLOR = 1;
    public static final int TA_KEY_BEST_WRITING_DIRECTION = 13;
    public static final int TA_KEY_FONT_FAMILY = 3;
    public static final int TA_KEY_FONT_SIZE = 4;
    public static final int TA_KEY_FONT_SIZE_MULTIPLIER = 5;
    public static final int TA_KEY_FONT_STYLE = 7;
    public static final int TA_KEY_FONT_VARIANT = 8;
    public static final int TA_KEY_FONT_WEIGHT = 6;
    public static final int TA_KEY_FOREGROUND_COLOR = 0;
    public static final int TA_KEY_IS_HIGHLIGHTED = 22;
    public static final int TA_KEY_LAYOUT_DIRECTION = 23;
    public static final int TA_KEY_LETTER_SPACING = 10;
    public static final int TA_KEY_LINE_BREAK_STRATEGY = 25;
    public static final int TA_KEY_LINE_HEIGHT = 11;
    public static final int TA_KEY_MAX_FONT_SIZE_MULTIPLIER = 29;
    public static final int TA_KEY_OPACITY = 2;
    public static final int TA_KEY_ROLE = 26;
    public static final int TA_KEY_TEXT_DECORATION_COLOR = 14;
    public static final int TA_KEY_TEXT_DECORATION_LINE = 15;
    public static final int TA_KEY_TEXT_DECORATION_STYLE = 16;
    public static final int TA_KEY_TEXT_SHADOW_COLOR = 19;
    public static final int TA_KEY_TEXT_SHADOW_OFFSET_DX = 20;
    public static final int TA_KEY_TEXT_SHADOW_OFFSET_DY = 21;
    public static final int TA_KEY_TEXT_SHADOW_RADIUS = 18;
    public static final int TA_KEY_TEXT_TRANSFORM = 27;
    public static final int UNSET = -1;
    private ReactAccessibilityDelegate.AccessibilityRole accessibilityRole;
    private boolean allowFontScaling;
    private Integer backgroundColor;
    private Integer color;
    private String fontFamily;
    private String fontFeatureSettings;
    private int fontSize;
    private float fontSizeInput;
    private int fontStyle;
    private int fontWeight;
    private boolean includeFontPadding;
    private boolean isBackgroundColorSet;
    private boolean isColorSet;
    private boolean isLineThroughTextDecorationSet;
    private boolean isUnderlineTextDecorationSet;
    private int layoutDirection;
    private float letterSpacingInput;
    private float lineHeight;
    private float lineHeightInput;
    private float maxFontSizeMultiplier;
    private int numberOfLines;
    private float opacity;
    private ReactAccessibilityDelegate.Role role;
    private int textShadowColor;
    private float textShadowOffsetDx;
    private float textShadowOffsetDy;
    private float textShadowRadius;
    private TextTransform textTransform;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int DEFAULT_JUSTIFICATION_MODE = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u00020.2\u0006\u0010/\u001a\u000202J\u001e\u00103\u001a\u00020\u00052\u0006\u0010/\u001a\u0002022\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u0005J\u0016\u00107\u001a\u00020\u00052\u0006\u0010/\u001a\u0002022\u0006\u00106\u001a\u00020\u0005J \u00108\u001a\u0002052\u0006\u0010/\u001a\u0002022\u0006\u00109\u001a\u00020#2\u0006\u00106\u001a\u000205H\u0002J\u001a\u0010:\u001a\u0004\u0018\u00010#2\u0006\u0010/\u001a\u0002022\u0006\u00109\u001a\u00020#H\u0002J \u0010;\u001a\u00020\u00052\u0006\u0010/\u001a\u0002022\u0006\u00109\u001a\u00020#2\u0006\u00106\u001a\u00020\u0005H\u0002J \u0010<\u001a\u00020=2\u0006\u0010/\u001a\u0002022\u0006\u00109\u001a\u00020#2\u0006\u00106\u001a\u00020=H\u0002J\u001a\u0010>\u001a\u0004\u0018\u00010?2\u0006\u0010/\u001a\u0002022\u0006\u00109\u001a\u00020#H\u0002J\u0010\u0010@\u001a\u00020\u00052\b\u0010A\u001a\u0004\u0018\u00010#J\u0010\u0010B\u001a\u00020\u00052\b\u0010C\u001a\u0004\u0018\u00010#J\u0010\u0010D\u001a\u00020\u00052\b\u0010E\u001a\u0004\u0018\u00010#J\u0012\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020#X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/facebook/react/views/text/TextAttributeProps$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "TA_KEY_FOREGROUND_COLOR", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TA_KEY_BACKGROUND_COLOR", "TA_KEY_OPACITY", "TA_KEY_FONT_FAMILY", "TA_KEY_FONT_SIZE", "TA_KEY_FONT_SIZE_MULTIPLIER", "TA_KEY_FONT_WEIGHT", "TA_KEY_FONT_STYLE", "TA_KEY_FONT_VARIANT", "TA_KEY_ALLOW_FONT_SCALING", "TA_KEY_LETTER_SPACING", "TA_KEY_LINE_HEIGHT", "TA_KEY_ALIGNMENT", "TA_KEY_BEST_WRITING_DIRECTION", "TA_KEY_TEXT_DECORATION_COLOR", "TA_KEY_TEXT_DECORATION_LINE", "TA_KEY_TEXT_DECORATION_STYLE", "TA_KEY_TEXT_SHADOW_RADIUS", "TA_KEY_TEXT_SHADOW_COLOR", "TA_KEY_TEXT_SHADOW_OFFSET_DX", "TA_KEY_TEXT_SHADOW_OFFSET_DY", "TA_KEY_IS_HIGHLIGHTED", "TA_KEY_LAYOUT_DIRECTION", "TA_KEY_ACCESSIBILITY_ROLE", "TA_KEY_LINE_BREAK_STRATEGY", "TA_KEY_ROLE", "TA_KEY_TEXT_TRANSFORM", "TA_KEY_MAX_FONT_SIZE_MULTIPLIER", "UNSET", "PROP_SHADOW_OFFSET", PointerEventHelper.POINTER_TYPE_UNKNOWN, "PROP_SHADOW_OFFSET_WIDTH", "PROP_SHADOW_OFFSET_HEIGHT", "PROP_SHADOW_RADIUS", "PROP_SHADOW_COLOR", "PROP_TEXT_TRANSFORM", "DEFAULT_TEXT_SHADOW_COLOR", "DEFAULT_JUSTIFICATION_MODE", "DEFAULT_BREAK_STRATEGY", "DEFAULT_HYPHENATION_FREQUENCY", "fromMapBuffer", "Lcom/facebook/react/views/text/TextAttributeProps;", "props", "Lcom/facebook/react/common/mapbuffer/MapBuffer;", "fromReadableMap", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "getTextAlignment", "isRTL", PointerEventHelper.POINTER_TYPE_UNKNOWN, "defaultValue", "getJustificationMode", "getBooleanProp", "name", "getStringProp", "getIntProp", "getFloatProp", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getArrayProp", "Lcom/facebook/react/bridge/ReadableArray;", "getLayoutDirection", ViewProps.LAYOUT_DIRECTION, "getTextBreakStrategy", ViewProps.TEXT_BREAK_STRATEGY, "getHyphenationFrequency", "hyphenationFrequency", "getEllipsizeMode", "Landroid/text/TextUtils$TruncateAt;", ViewProps.ELLIPSIZE_MODE, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final ReadableArray getArrayProp(ReactStylesDiffMap props, String name) {
            if (props.hasKey(name)) {
                return props.getArray(name);
            }
            return null;
        }

        private final boolean getBooleanProp(ReactStylesDiffMap props, String name, boolean defaultValue) {
            return props.hasKey(name) ? props.getBoolean(name, defaultValue) : defaultValue;
        }

        private final float getFloatProp(ReactStylesDiffMap props, String name, float defaultValue) {
            return props.hasKey(name) ? props.getFloat(name, defaultValue) : defaultValue;
        }

        private final int getIntProp(ReactStylesDiffMap props, String name, int defaultValue) {
            return props.hasKey(name) ? props.getInt(name, defaultValue) : defaultValue;
        }

        private final String getStringProp(ReactStylesDiffMap props, String name) {
            if (props.hasKey(name)) {
                return props.getString(name);
            }
            return null;
        }

        public final TextAttributeProps fromMapBuffer(MapBuffer props) {
            AbstractC2855l.g(props, "props");
            TextAttributeProps textAttributeProps = new TextAttributeProps(null);
            for (MapBuffer.Entry entry : props) {
                switch (entry.getKey()) {
                    case 0:
                        textAttributeProps.setColor(Integer.valueOf(entry.getIntValue()));
                        break;
                    case 1:
                        textAttributeProps.setBackgroundColor(Integer.valueOf(entry.getIntValue()));
                        break;
                    case 2:
                        textAttributeProps.opacity = (float) entry.getDoubleValue();
                        break;
                    case 3:
                        textAttributeProps.fontFamily = entry.getStringValue();
                        break;
                    case 4:
                        textAttributeProps.setFontSize((float) entry.getDoubleValue());
                        break;
                    case 6:
                        textAttributeProps.setFontWeight(entry.getStringValue());
                        break;
                    case 7:
                        textAttributeProps.setFontStyle(entry.getStringValue());
                        break;
                    case 8:
                        textAttributeProps.setFontVariant(entry.getMapBufferValue());
                        break;
                    case 9:
                        textAttributeProps.setAllowFontScaling(entry.getBooleanValue());
                        break;
                    case 10:
                        textAttributeProps.setLetterSpacing((float) entry.getDoubleValue());
                        break;
                    case 11:
                        textAttributeProps.setLineHeight((float) entry.getDoubleValue());
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                        textAttributeProps.setTextDecorationLine(entry.getStringValue());
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                        textAttributeProps.setTextShadowRadius((float) entry.getDoubleValue());
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                        textAttributeProps.setTextShadowColor(entry.getIntValue());
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                        textAttributeProps.setTextShadowOffsetDx((float) entry.getDoubleValue());
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                        textAttributeProps.setTextShadowOffsetDy((float) entry.getDoubleValue());
                        break;
                    case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                        textAttributeProps.setLayoutDirection(entry.getStringValue());
                        break;
                    case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                        textAttributeProps.setAccessibilityRole(entry.getStringValue());
                        break;
                    case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                        textAttributeProps.setRole((ReactAccessibilityDelegate.Role) ReactAccessibilityDelegate.Role.getEntries().get(entry.getIntValue()));
                        break;
                    case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                        textAttributeProps.setTextTransform(entry.getStringValue());
                        break;
                    case 29:
                        textAttributeProps.setMaxFontSizeMultiplier((float) entry.getDoubleValue());
                        break;
                }
            }
            return textAttributeProps;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final TextAttributeProps fromReadableMap(ReactStylesDiffMap props) {
            AbstractC2855l.g(props, "props");
            TextAttributeProps textAttributeProps = new TextAttributeProps(0 == true ? 1 : 0);
            textAttributeProps.setNumberOfLines(getIntProp(props, ViewProps.NUMBER_OF_LINES, -1));
            textAttributeProps.setLineHeight(getFloatProp(props, ViewProps.LINE_HEIGHT, -1.0f));
            textAttributeProps.setLetterSpacing(getFloatProp(props, ViewProps.LETTER_SPACING, Float.NaN));
            textAttributeProps.setAllowFontScaling(getBooleanProp(props, ViewProps.ALLOW_FONT_SCALING, true));
            textAttributeProps.setMaxFontSizeMultiplier(getFloatProp(props, ViewProps.MAX_FONT_SIZE_MULTIPLIER, Float.NaN));
            textAttributeProps.setFontSize(getFloatProp(props, ViewProps.FONT_SIZE, -1.0f));
            textAttributeProps.setColor(props.hasKey(ViewProps.COLOR) ? Integer.valueOf(props.getInt(ViewProps.COLOR, 0)) : null);
            textAttributeProps.setColor(props.hasKey(ViewProps.FOREGROUND_COLOR) ? Integer.valueOf(props.getInt(ViewProps.FOREGROUND_COLOR, 0)) : null);
            textAttributeProps.setBackgroundColor(props.hasKey(ViewProps.BACKGROUND_COLOR) ? Integer.valueOf(props.getInt(ViewProps.BACKGROUND_COLOR, 0)) : null);
            textAttributeProps.opacity = getFloatProp(props, ViewProps.OPACITY, Float.NaN);
            textAttributeProps.fontFamily = getStringProp(props, ViewProps.FONT_FAMILY);
            textAttributeProps.setFontWeight(getStringProp(props, ViewProps.FONT_WEIGHT));
            textAttributeProps.setFontStyle(getStringProp(props, ViewProps.FONT_STYLE));
            textAttributeProps.setFontVariant(getArrayProp(props, ViewProps.FONT_VARIANT));
            textAttributeProps.includeFontPadding = getBooleanProp(props, ViewProps.INCLUDE_FONT_PADDING, true);
            textAttributeProps.setTextDecorationLine(getStringProp(props, ViewProps.TEXT_DECORATION_LINE));
            textAttributeProps.setTextShadowOffset(props.hasKey("textShadowOffset") ? props.getMap("textShadowOffset") : null);
            textAttributeProps.setTextShadowRadius(getFloatProp(props, "textShadowRadius", 1.0f));
            textAttributeProps.setTextShadowColor(getIntProp(props, "textShadowColor", 1426063360));
            textAttributeProps.setTextTransform(getStringProp(props, "textTransform"));
            textAttributeProps.setLayoutDirection(getStringProp(props, ViewProps.LAYOUT_DIRECTION));
            textAttributeProps.setAccessibilityRole(getStringProp(props, ViewProps.ACCESSIBILITY_ROLE));
            textAttributeProps.setRole(getStringProp(props, ViewProps.ROLE));
            return textAttributeProps;
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final TextUtils.TruncateAt getEllipsizeMode(String ellipsizeMode) {
            if (ellipsizeMode == null) {
                return null;
            }
            switch (ellipsizeMode.hashCode()) {
                case -1074341483:
                    if (ellipsizeMode.equals("middle")) {
                        return TextUtils.TruncateAt.MIDDLE;
                    }
                    return null;
                case 3056464:
                    ellipsizeMode.equals("clip");
                    return null;
                case 3198432:
                    if (ellipsizeMode.equals("head")) {
                        return TextUtils.TruncateAt.START;
                    }
                    return null;
                case 3552336:
                    if (ellipsizeMode.equals("tail")) {
                        return TextUtils.TruncateAt.END;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final int getHyphenationFrequency(String hyphenationFrequency) {
            if (hyphenationFrequency == null || AbstractC2855l.b(hyphenationFrequency, "none")) {
                return 0;
            }
            return AbstractC2855l.b(hyphenationFrequency, "normal") ? 1 : 2;
        }

        public final int getJustificationMode(ReactStylesDiffMap props, int defaultValue) {
            AbstractC2855l.g(props, "props");
            if (!props.hasKey(ViewProps.TEXT_ALIGN)) {
                return defaultValue;
            }
            if (!AbstractC2855l.b("justify", props.getString(ViewProps.TEXT_ALIGN)) || Build.VERSION.SDK_INT < 26) {
                return TextAttributeProps.DEFAULT_JUSTIFICATION_MODE;
            }
            return 1;
        }

        public final int getLayoutDirection(String layoutDirection) {
            if (layoutDirection != null) {
                int iHashCode = layoutDirection.hashCode();
                if (iHashCode != -1038130864) {
                    if (iHashCode != 107498) {
                        if (iHashCode == 113258 && layoutDirection.equals("rtl")) {
                            return 1;
                        }
                    } else if (layoutDirection.equals("ltr")) {
                        return 0;
                    }
                } else if (!layoutDirection.equals("undefined")) {
                }
                AbstractC2325a.I(ReactConstants.TAG, "Invalid layoutDirection: " + layoutDirection);
            }
            return -1;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        
            if (r4.equals("auto") == false) goto L31;
         */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final int getTextAlignment(ReactStylesDiffMap props, boolean isRTL, int defaultValue) {
            AbstractC2855l.g(props, "props");
            if (!props.hasKey(ViewProps.TEXT_ALIGN)) {
                return defaultValue;
            }
            String string = props.getString(ViewProps.TEXT_ALIGN);
            if (string != null) {
                switch (string.hashCode()) {
                    case -1364013995:
                        if (string.equals("center")) {
                            return 1;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + string);
                        return 0;
                    case -1249482096:
                        if (string.equals("justify")) {
                            return 3;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + string);
                        return 0;
                    case 3005871:
                        break;
                    case 3317767:
                        if (string.equals(ViewProps.LEFT)) {
                            return isRTL ? 5 : 3;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + string);
                        return 0;
                    case 108511772:
                        if (string.equals(ViewProps.RIGHT)) {
                            return isRTL ? 3 : 5;
                        }
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + string);
                        return 0;
                    default:
                        AbstractC2325a.I(ReactConstants.TAG, "Invalid textAlign: " + string);
                        return 0;
                }
            }
            return 0;
        }

        public final int getTextBreakStrategy(String textBreakStrategy) {
            if (textBreakStrategy == null) {
                return 1;
            }
            if (AbstractC2855l.b(textBreakStrategy, "simple")) {
                return 0;
            }
            return AbstractC2855l.b(textBreakStrategy, "balanced") ? 2 : 1;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextAttributeProps(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAccessibilityRole(String accessibilityRole) {
        this.accessibilityRole = accessibilityRole == null ? null : ReactAccessibilityDelegate.AccessibilityRole.INSTANCE.fromValue(accessibilityRole);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAllowFontScaling(boolean z10) {
        if (z10 != this.allowFontScaling) {
            this.allowFontScaling = z10;
            setFontSize(this.fontSizeInput);
            setLineHeight(this.lineHeightInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBackgroundColor(Integer num) {
        this.isBackgroundColorSet = num != null;
        if (num != null) {
            this.backgroundColor = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setColor(Integer num) {
        this.isColorSet = num != null;
        if (num != null) {
            this.color = num;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontSize(float fontSize) {
        this.fontSizeInput = fontSize;
        if (fontSize != -1.0f) {
            fontSize = (float) (this.allowFontScaling ? Math.ceil(PixelUtil.toPixelFromSP(fontSize, this.maxFontSizeMultiplier)) : Math.ceil(PixelUtil.toPixelFromDIP(fontSize)));
        }
        this.fontSize = (int) fontSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontStyle(String fontStyleString) {
        this.fontStyle = ReactTypefaceUtils.parseFontStyle(fontStyleString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontVariant(ReadableArray fontVariant) {
        this.fontFeatureSettings = ReactTypefaceUtils.parseFontVariant(fontVariant);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setFontWeight(String fontWeightString) {
        this.fontWeight = ReactTypefaceUtils.parseFontWeight(fontWeightString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLayoutDirection(String layoutDirection) {
        this.layoutDirection = INSTANCE.getLayoutDirection(layoutDirection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLetterSpacing(float f10) {
        this.letterSpacingInput = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLineHeight(float f10) {
        this.lineHeightInput = f10;
        this.lineHeight = f10 == -1.0f ? Float.NaN : this.allowFontScaling ? PixelUtil.toPixelFromSP$default(f10, 0.0f, 2, null) : PixelUtil.toPixelFromDIP(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMaxFontSizeMultiplier(float f10) {
        if (f10 == this.maxFontSizeMultiplier) {
            return;
        }
        this.maxFontSizeMultiplier = f10;
        setFontSize(this.fontSizeInput);
        setLineHeight(this.lineHeightInput);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setNumberOfLines(int numberOfLines) {
        if (numberOfLines == 0) {
            numberOfLines = -1;
        }
        this.numberOfLines = numberOfLines;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRole(String role) {
        if (role == null) {
            this.role = null;
        } else {
            this.role = ReactAccessibilityDelegate.Role.INSTANCE.fromValue(role);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextDecorationLine(String textDecorationLineString) {
        List listJ;
        this.isUnderlineTextDecorationSet = false;
        this.isLineThroughTextDecorationSet = false;
        if (textDecorationLineString != null) {
            List listF = new o("-").f(textDecorationLineString, 0);
            if (listF.isEmpty()) {
                listJ = AbstractC2800q.j();
            } else {
                ListIterator listIterator = listF.listIterator(listF.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        listJ = AbstractC2800q.I0(listF, listIterator.nextIndex() + 1);
                        break;
                    }
                }
                listJ = AbstractC2800q.j();
            }
            for (String str : (String[]) listJ.toArray(new String[0])) {
                if (AbstractC2855l.b("underline", str)) {
                    this.isUnderlineTextDecorationSet = true;
                } else if (AbstractC2855l.b("strikethrough", str)) {
                    this.isLineThroughTextDecorationSet = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowColor(int i10) {
        if (i10 != this.textShadowColor) {
            this.textShadowColor = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffset(ReadableMap offsetMap) {
        setTextShadowOffsetDx(0.0f);
        setTextShadowOffsetDy(0.0f);
        if (offsetMap != null) {
            if (offsetMap.hasKey("width") && !offsetMap.isNull("width")) {
                setTextShadowOffsetDx(PixelUtil.toPixelFromDIP(offsetMap.getDouble("width")));
            }
            if (!offsetMap.hasKey("height") || offsetMap.isNull("height")) {
                return;
            }
            setTextShadowOffsetDy(PixelUtil.toPixelFromDIP(offsetMap.getDouble("height")));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffsetDx(float f10) {
        this.textShadowOffsetDx = PixelUtil.toPixelFromDIP(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowOffsetDy(float f10) {
        this.textShadowOffsetDy = PixelUtil.toPixelFromDIP(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTextShadowRadius(float f10) {
        if (f10 == this.textShadowRadius) {
            return;
        }
        this.textShadowRadius = f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
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
                        textTransform2 = TextTransform.NONE;
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
        }
        this.textTransform = textTransform2;
    }

    public final ReactAccessibilityDelegate.AccessibilityRole getAccessibilityRole() {
        return this.accessibilityRole;
    }

    public final boolean getAllowFontScaling() {
        return this.allowFontScaling;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final float getEffectiveLetterSpacing() {
        return getLetterSpacing();
    }

    /* JADX INFO: renamed from: getEffectiveLineHeight, reason: from getter */
    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public final int getFontStyle() {
        return this.fontStyle;
    }

    public final int getFontWeight() {
        return this.fontWeight;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final float getLetterSpacing() {
        float pixelFromSP$default = this.allowFontScaling ? PixelUtil.toPixelFromSP$default(this.letterSpacingInput, 0.0f, 2, null) : PixelUtil.toPixelFromDIP(this.letterSpacingInput);
        int i10 = this.fontSize;
        if (i10 > 0) {
            return pixelFromSP$default / i10;
        }
        throw new IllegalArgumentException(("FontSize should be a positive value. Current value: " + i10).toString());
    }

    public final float getLineHeight() {
        return this.lineHeight;
    }

    public final float getMaxFontSizeMultiplier() {
        return this.maxFontSizeMultiplier;
    }

    public final int getNumberOfLines() {
        return this.numberOfLines;
    }

    public final float getOpacity() {
        return this.opacity;
    }

    public final ReactAccessibilityDelegate.Role getRole() {
        return this.role;
    }

    public final int getTextShadowColor() {
        return this.textShadowColor;
    }

    public final float getTextShadowOffsetDx() {
        return this.textShadowOffsetDx;
    }

    public final float getTextShadowOffsetDy() {
        return this.textShadowOffsetDy;
    }

    public final float getTextShadowRadius() {
        return this.textShadowRadius;
    }

    /* JADX INFO: renamed from: getTextTransform$ReactAndroid_release, reason: from getter */
    public final TextTransform getTextTransform() {
        return this.textTransform;
    }

    /* JADX INFO: renamed from: isBackgroundColorSet, reason: from getter */
    public final boolean getIsBackgroundColorSet() {
        return this.isBackgroundColorSet;
    }

    /* JADX INFO: renamed from: isColorSet, reason: from getter */
    public final boolean getIsColorSet() {
        return this.isColorSet;
    }

    /* JADX INFO: renamed from: isLineThroughTextDecorationSet, reason: from getter */
    public final boolean getIsLineThroughTextDecorationSet() {
        return this.isLineThroughTextDecorationSet;
    }

    /* JADX INFO: renamed from: isUnderlineTextDecorationSet, reason: from getter */
    public final boolean getIsUnderlineTextDecorationSet() {
        return this.isUnderlineTextDecorationSet;
    }

    public final void setTextTransform$ReactAndroid_release(TextTransform textTransform) {
        AbstractC2855l.g(textTransform, "<set-?>");
        this.textTransform = textTransform;
    }

    private TextAttributeProps() {
        this.lineHeight = Float.NaN;
        this.allowFontScaling = true;
        this.maxFontSizeMultiplier = Float.NaN;
        this.opacity = Float.NaN;
        this.numberOfLines = -1;
        this.fontSize = -1;
        this.fontSizeInput = -1.0f;
        this.lineHeightInput = -1.0f;
        this.letterSpacingInput = Float.NaN;
        this.layoutDirection = -1;
        this.textTransform = TextTransform.NONE;
        this.includeFontPadding = true;
        this.fontStyle = -1;
        this.fontWeight = -1;
        this.backgroundColor = 0;
        this.textShadowColor = 1426063360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void setFontVariant(MapBuffer fontVariant) {
        if (fontVariant == null || fontVariant.getCount() == 0) {
            this.fontFeatureSettings = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<MapBuffer.Entry> it = fontVariant.iterator();
        while (it.hasNext()) {
            String stringValue = it.next().getStringValue();
            if (stringValue != null) {
                switch (stringValue.hashCode()) {
                    case -1983120972:
                        if (stringValue.equals("stylistic-thirteen")) {
                            arrayList.add("'ss13'");
                        }
                        break;
                    case -1933522176:
                        if (stringValue.equals("stylistic-fifteen")) {
                            arrayList.add("'ss15'");
                        }
                        break;
                    case -1534462052:
                        if (stringValue.equals("stylistic-eighteen")) {
                            arrayList.add("'ss18'");
                        }
                        break;
                    case -1195362251:
                        if (stringValue.equals("proportional-nums")) {
                            arrayList.add("'pnum'");
                        }
                        break;
                    case -1061392823:
                        if (stringValue.equals("lining-nums")) {
                            arrayList.add("'lnum'");
                        }
                        break;
                    case -771984547:
                        if (stringValue.equals("tabular-nums")) {
                            arrayList.add("'tnum'");
                        }
                        break;
                    case -659678800:
                        if (stringValue.equals("oldstyle-nums")) {
                            arrayList.add("'onum'");
                        }
                        break;
                    case 296506098:
                        if (stringValue.equals("stylistic-eight")) {
                            arrayList.add("'ss08'");
                        }
                        break;
                    case 309330544:
                        if (stringValue.equals("stylistic-seven")) {
                            arrayList.add("'ss07'");
                        }
                        break;
                    case 310339585:
                        if (stringValue.equals("stylistic-three")) {
                            arrayList.add("'ss03'");
                        }
                        break;
                    case 604478526:
                        if (stringValue.equals("stylistic-eleven")) {
                            arrayList.add("'ss11'");
                        }
                        break;
                    case 979426287:
                        if (stringValue.equals("stylistic-five")) {
                            arrayList.add("'ss05'");
                        }
                        break;
                    case 979432035:
                        if (stringValue.equals("stylistic-four")) {
                            arrayList.add("'ss04'");
                        }
                        break;
                    case 979664367:
                        if (stringValue.equals("stylistic-nine")) {
                            arrayList.add("'ss09'");
                        }
                        break;
                    case 1001434505:
                        if (stringValue.equals("stylistic-one")) {
                            arrayList.add("'ss01'");
                        }
                        break;
                    case 1001438213:
                        if (stringValue.equals("stylistic-six")) {
                            arrayList.add("'ss06'");
                        }
                        break;
                    case 1001439040:
                        if (stringValue.equals("stylistic-ten")) {
                            arrayList.add("'ss10'");
                        }
                        break;
                    case 1001439599:
                        if (stringValue.equals("stylistic-two")) {
                            arrayList.add("'ss02'");
                        }
                        break;
                    case 1030714463:
                        if (stringValue.equals("stylistic-sixteen")) {
                            arrayList.add("'ss16'");
                        }
                        break;
                    case 1044065430:
                        if (stringValue.equals("stylistic-twelve")) {
                            arrayList.add("'ss12'");
                        }
                        break;
                    case 1044067310:
                        if (stringValue.equals("stylistic-twenty")) {
                            arrayList.add("'ss20'");
                        }
                        break;
                    case 1183323111:
                        if (stringValue.equals("small-caps")) {
                            arrayList.add("'smcp'");
                        }
                        break;
                    case 1463562569:
                        if (stringValue.equals("stylistic-nineteen")) {
                            arrayList.add("'ss19'");
                        }
                        break;
                    case 1648446397:
                        if (stringValue.equals("stylistic-fourteen")) {
                            arrayList.add("'ss14'");
                        }
                        break;
                    case 2097122634:
                        if (stringValue.equals("stylistic-seventeen")) {
                            arrayList.add("'ss17'");
                        }
                        break;
                }
            }
        }
        this.fontFeatureSettings = TextUtils.join(", ", arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRole(ReactAccessibilityDelegate.Role role) {
        this.role = role;
    }

    public static /* synthetic */ void getEffectiveLineHeight$annotations() {
    }
}
