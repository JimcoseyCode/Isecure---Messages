package com.facebook.react.uimanager.style;

import android.content.Context;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.modules.i18nmanager.I18nUtil;
import com.facebook.react.uimanager.LengthPercentage;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.C2750m;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b$\b\u0080\b\u0018\u00002\u00020\u0001B£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B#\b\u0016\u0012\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00020\u00130\u0012¢\u0006\u0004\b\u0010\u0010\u0016J?\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001e\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J-\u0010,\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010/J\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010/J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010/J\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010/J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u0010/J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010/J\u0012\u00106\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b6\u0010/J\u0012\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b7\u0010/J\u0012\u00108\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b8\u0010/J\u0012\u00109\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b9\u0010/J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010/J\u0012\u0010;\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b;\u0010/J¬\u0001\u0010<\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010?\u001a\u00020>HÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020(HÖ\u0001¢\u0006\u0004\bA\u0010BJ\u001a\u0010D\u001a\u00020%2\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bD\u0010ER$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010F\u001a\u0004\bG\u0010/\"\u0004\bH\u0010IR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010F\u001a\u0004\bJ\u0010/\"\u0004\bK\u0010IR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010F\u001a\u0004\bL\u0010/\"\u0004\bM\u0010IR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010F\u001a\u0004\bN\u0010/\"\u0004\bO\u0010IR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010F\u001a\u0004\bP\u0010/\"\u0004\bQ\u0010IR$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010F\u001a\u0004\bR\u0010/\"\u0004\bS\u0010IR$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010F\u001a\u0004\bT\u0010/\"\u0004\bU\u0010IR$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010F\u001a\u0004\bV\u0010/\"\u0004\bW\u0010IR$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010F\u001a\u0004\bX\u0010/\"\u0004\bY\u0010IR$\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010F\u001a\u0004\bZ\u0010/\"\u0004\b[\u0010IR$\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010F\u001a\u0004\b\\\u0010/\"\u0004\b]\u0010IR$\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\b^\u0010/\"\u0004\b_\u0010IR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010F\u001a\u0004\b`\u0010/\"\u0004\ba\u0010I¨\u0006b"}, d2 = {"Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/uimanager/LengthPercentage;", "uniform", "topLeft", "topRight", "bottomLeft", "bottomRight", "topStart", "topEnd", "bottomStart", "bottomEnd", "startStart", "startEnd", "endStart", "endEnd", "<init>", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lkotlin/Pair;", "Lcom/facebook/react/uimanager/style/BorderRadiusProp;", "properties", "(Ljava/util/List;)V", "Lcom/facebook/react/uimanager/style/CornerRadii;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "width", "height", "Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "ensureNoOverlap", "(Lcom/facebook/react/uimanager/style/CornerRadii;Lcom/facebook/react/uimanager/style/CornerRadii;Lcom/facebook/react/uimanager/style/CornerRadii;Lcom/facebook/react/uimanager/style/CornerRadii;FF)Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "property", "value", "Li7/B;", "set", "(Lcom/facebook/react/uimanager/style/BorderRadiusProp;Lcom/facebook/react/uimanager/LengthPercentage;)V", "get", "(Lcom/facebook/react/uimanager/style/BorderRadiusProp;)Lcom/facebook/react/uimanager/LengthPercentage;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasRoundedBorders", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.LAYOUT_DIRECTION, "Landroid/content/Context;", "context", "resolve", "(ILandroid/content/Context;FF)Lcom/facebook/react/uimanager/style/ComputedBorderRadius;", "component1", "()Lcom/facebook/react/uimanager/LengthPercentage;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)Lcom/facebook/react/uimanager/style/BorderRadiusStyle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/facebook/react/uimanager/LengthPercentage;", "getUniform", "setUniform", "(Lcom/facebook/react/uimanager/LengthPercentage;)V", "getTopLeft", "setTopLeft", "getTopRight", "setTopRight", "getBottomLeft", "setBottomLeft", "getBottomRight", "setBottomRight", "getTopStart", "setTopStart", "getTopEnd", "setTopEnd", "getBottomStart", "setBottomStart", "getBottomEnd", "setBottomEnd", "getStartStart", "setStartStart", "getStartEnd", "setStartEnd", "getEndStart", "setEndStart", "getEndEnd", "setEndEnd", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class BorderRadiusStyle {
    private LengthPercentage bottomEnd;
    private LengthPercentage bottomLeft;
    private LengthPercentage bottomRight;
    private LengthPercentage bottomStart;
    private LengthPercentage endEnd;
    private LengthPercentage endStart;
    private LengthPercentage startEnd;
    private LengthPercentage startStart;
    private LengthPercentage topEnd;
    private LengthPercentage topLeft;
    private LengthPercentage topRight;
    private LengthPercentage topStart;
    private LengthPercentage uniform;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderRadiusProp.values().length];
            try {
                iArr[BorderRadiusProp.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BorderRadiusProp.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public BorderRadiusStyle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public static /* synthetic */ BorderRadiusStyle copy$default(BorderRadiusStyle borderRadiusStyle, LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lengthPercentage = borderRadiusStyle.uniform;
        }
        return borderRadiusStyle.copy(lengthPercentage, (i10 & 2) != 0 ? borderRadiusStyle.topLeft : lengthPercentage2, (i10 & 4) != 0 ? borderRadiusStyle.topRight : lengthPercentage3, (i10 & 8) != 0 ? borderRadiusStyle.bottomLeft : lengthPercentage4, (i10 & 16) != 0 ? borderRadiusStyle.bottomRight : lengthPercentage5, (i10 & 32) != 0 ? borderRadiusStyle.topStart : lengthPercentage6, (i10 & 64) != 0 ? borderRadiusStyle.topEnd : lengthPercentage7, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? borderRadiusStyle.bottomStart : lengthPercentage8, (i10 & 256) != 0 ? borderRadiusStyle.bottomEnd : lengthPercentage9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? borderRadiusStyle.startStart : lengthPercentage10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? borderRadiusStyle.startEnd : lengthPercentage11, (i10 & 2048) != 0 ? borderRadiusStyle.endStart : lengthPercentage12, (i10 & 4096) != 0 ? borderRadiusStyle.endEnd : lengthPercentage13);
    }

    private final ComputedBorderRadius ensureNoOverlap(CornerRadii topLeft, CornerRadii topRight, CornerRadii bottomLeft, CornerRadii bottomRight, float width, float height) {
        float vertical = topLeft.getVertical() + bottomLeft.getVertical();
        float horizontal = topLeft.getHorizontal() + topRight.getHorizontal();
        float vertical2 = topRight.getVertical() + bottomRight.getVertical();
        float horizontal2 = bottomLeft.getHorizontal() + bottomRight.getHorizontal();
        float fMin = vertical > 0.0f ? Math.min(height / vertical, 1.0f) : 0.0f;
        float fMin2 = horizontal > 0.0f ? Math.min(width / horizontal, 1.0f) : 0.0f;
        float fMin3 = vertical2 > 0.0f ? Math.min(height / vertical2, 1.0f) : 0.0f;
        float fMin4 = horizontal2 > 0.0f ? Math.min(width / horizontal2, 1.0f) : 0.0f;
        return new ComputedBorderRadius(new CornerRadii(topLeft.getHorizontal() * Math.min(fMin2, fMin), topLeft.getVertical() * Math.min(fMin2, fMin)), new CornerRadii(topRight.getHorizontal() * Math.min(fMin3, fMin2), topRight.getVertical() * Math.min(fMin3, fMin2)), new CornerRadii(bottomLeft.getHorizontal() * Math.min(fMin4, fMin), bottomLeft.getVertical() * Math.min(fMin4, fMin)), new CornerRadii(bottomRight.getHorizontal() * Math.min(fMin4, fMin3), bottomRight.getVertical() * Math.min(fMin4, fMin3)));
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LengthPercentage getUniform() {
        return this.uniform;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final LengthPercentage getStartStart() {
        return this.startStart;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final LengthPercentage getStartEnd() {
        return this.startEnd;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final LengthPercentage getEndStart() {
        return this.endStart;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final LengthPercentage getEndEnd() {
        return this.endEnd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LengthPercentage getTopLeft() {
        return this.topLeft;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LengthPercentage getTopRight() {
        return this.topRight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LengthPercentage getBottomLeft() {
        return this.bottomLeft;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final LengthPercentage getBottomRight() {
        return this.bottomRight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final LengthPercentage getTopStart() {
        return this.topStart;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final LengthPercentage getTopEnd() {
        return this.topEnd;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LengthPercentage getBottomStart() {
        return this.bottomStart;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final LengthPercentage getBottomEnd() {
        return this.bottomEnd;
    }

    public final BorderRadiusStyle copy(LengthPercentage uniform, LengthPercentage topLeft, LengthPercentage topRight, LengthPercentage bottomLeft, LengthPercentage bottomRight, LengthPercentage topStart, LengthPercentage topEnd, LengthPercentage bottomStart, LengthPercentage bottomEnd, LengthPercentage startStart, LengthPercentage startEnd, LengthPercentage endStart, LengthPercentage endEnd) {
        return new BorderRadiusStyle(uniform, topLeft, topRight, bottomLeft, bottomRight, topStart, topEnd, bottomStart, bottomEnd, startStart, startEnd, endStart, endEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderRadiusStyle)) {
            return false;
        }
        BorderRadiusStyle borderRadiusStyle = (BorderRadiusStyle) other;
        return AbstractC2855l.b(this.uniform, borderRadiusStyle.uniform) && AbstractC2855l.b(this.topLeft, borderRadiusStyle.topLeft) && AbstractC2855l.b(this.topRight, borderRadiusStyle.topRight) && AbstractC2855l.b(this.bottomLeft, borderRadiusStyle.bottomLeft) && AbstractC2855l.b(this.bottomRight, borderRadiusStyle.bottomRight) && AbstractC2855l.b(this.topStart, borderRadiusStyle.topStart) && AbstractC2855l.b(this.topEnd, borderRadiusStyle.topEnd) && AbstractC2855l.b(this.bottomStart, borderRadiusStyle.bottomStart) && AbstractC2855l.b(this.bottomEnd, borderRadiusStyle.bottomEnd) && AbstractC2855l.b(this.startStart, borderRadiusStyle.startStart) && AbstractC2855l.b(this.startEnd, borderRadiusStyle.startEnd) && AbstractC2855l.b(this.endStart, borderRadiusStyle.endStart) && AbstractC2855l.b(this.endEnd, borderRadiusStyle.endEnd);
    }

    public final LengthPercentage get(BorderRadiusProp property) {
        AbstractC2855l.g(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                return this.uniform;
            case 2:
                return this.topLeft;
            case 3:
                return this.topRight;
            case 4:
                return this.bottomLeft;
            case 5:
                return this.bottomRight;
            case 6:
                return this.topStart;
            case 7:
                return this.topEnd;
            case 8:
                return this.bottomStart;
            case 9:
                return this.bottomEnd;
            case 10:
                return this.startStart;
            case 11:
                return this.startEnd;
            case 12:
                return this.endStart;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                return this.endEnd;
            default:
                throw new C2750m();
        }
    }

    public final LengthPercentage getBottomEnd() {
        return this.bottomEnd;
    }

    public final LengthPercentage getBottomLeft() {
        return this.bottomLeft;
    }

    public final LengthPercentage getBottomRight() {
        return this.bottomRight;
    }

    public final LengthPercentage getBottomStart() {
        return this.bottomStart;
    }

    public final LengthPercentage getEndEnd() {
        return this.endEnd;
    }

    public final LengthPercentage getEndStart() {
        return this.endStart;
    }

    public final LengthPercentage getStartEnd() {
        return this.startEnd;
    }

    public final LengthPercentage getStartStart() {
        return this.startStart;
    }

    public final LengthPercentage getTopEnd() {
        return this.topEnd;
    }

    public final LengthPercentage getTopLeft() {
        return this.topLeft;
    }

    public final LengthPercentage getTopRight() {
        return this.topRight;
    }

    public final LengthPercentage getTopStart() {
        return this.topStart;
    }

    public final LengthPercentage getUniform() {
        return this.uniform;
    }

    public final boolean hasRoundedBorders() {
        return (this.uniform == null && this.topLeft == null && this.topRight == null && this.bottomLeft == null && this.bottomRight == null && this.topStart == null && this.topEnd == null && this.bottomStart == null && this.bottomEnd == null && this.startStart == null && this.startEnd == null && this.endStart == null && this.endEnd == null) ? false : true;
    }

    public int hashCode() {
        LengthPercentage lengthPercentage = this.uniform;
        int iHashCode = (lengthPercentage == null ? 0 : lengthPercentage.hashCode()) * 31;
        LengthPercentage lengthPercentage2 = this.topLeft;
        int iHashCode2 = (iHashCode + (lengthPercentage2 == null ? 0 : lengthPercentage2.hashCode())) * 31;
        LengthPercentage lengthPercentage3 = this.topRight;
        int iHashCode3 = (iHashCode2 + (lengthPercentage3 == null ? 0 : lengthPercentage3.hashCode())) * 31;
        LengthPercentage lengthPercentage4 = this.bottomLeft;
        int iHashCode4 = (iHashCode3 + (lengthPercentage4 == null ? 0 : lengthPercentage4.hashCode())) * 31;
        LengthPercentage lengthPercentage5 = this.bottomRight;
        int iHashCode5 = (iHashCode4 + (lengthPercentage5 == null ? 0 : lengthPercentage5.hashCode())) * 31;
        LengthPercentage lengthPercentage6 = this.topStart;
        int iHashCode6 = (iHashCode5 + (lengthPercentage6 == null ? 0 : lengthPercentage6.hashCode())) * 31;
        LengthPercentage lengthPercentage7 = this.topEnd;
        int iHashCode7 = (iHashCode6 + (lengthPercentage7 == null ? 0 : lengthPercentage7.hashCode())) * 31;
        LengthPercentage lengthPercentage8 = this.bottomStart;
        int iHashCode8 = (iHashCode7 + (lengthPercentage8 == null ? 0 : lengthPercentage8.hashCode())) * 31;
        LengthPercentage lengthPercentage9 = this.bottomEnd;
        int iHashCode9 = (iHashCode8 + (lengthPercentage9 == null ? 0 : lengthPercentage9.hashCode())) * 31;
        LengthPercentage lengthPercentage10 = this.startStart;
        int iHashCode10 = (iHashCode9 + (lengthPercentage10 == null ? 0 : lengthPercentage10.hashCode())) * 31;
        LengthPercentage lengthPercentage11 = this.startEnd;
        int iHashCode11 = (iHashCode10 + (lengthPercentage11 == null ? 0 : lengthPercentage11.hashCode())) * 31;
        LengthPercentage lengthPercentage12 = this.endStart;
        int iHashCode12 = (iHashCode11 + (lengthPercentage12 == null ? 0 : lengthPercentage12.hashCode())) * 31;
        LengthPercentage lengthPercentage13 = this.endEnd;
        return iHashCode12 + (lengthPercentage13 != null ? lengthPercentage13.hashCode() : 0);
    }

    public final ComputedBorderRadius resolve(int layoutDirection, Context context, float width, float height) {
        AbstractC2855l.g(context, "context");
        CornerRadii cornerRadii = new CornerRadii(0.0f, 0.0f);
        if (layoutDirection == 0) {
            LengthPercentage lengthPercentage = this.startStart;
            if (lengthPercentage == null && (lengthPercentage = this.topStart) == null && (lengthPercentage = this.topLeft) == null) {
                lengthPercentage = this.uniform;
            }
            CornerRadii cornerRadii2 = lengthPercentage != null ? new CornerRadii(lengthPercentage, width, height) : cornerRadii;
            LengthPercentage lengthPercentage2 = this.endStart;
            if (lengthPercentage2 == null && (lengthPercentage2 = this.topEnd) == null && (lengthPercentage2 = this.topRight) == null) {
                lengthPercentage2 = this.uniform;
            }
            CornerRadii cornerRadii3 = lengthPercentage2 != null ? new CornerRadii(lengthPercentage2, width, height) : cornerRadii;
            LengthPercentage lengthPercentage3 = this.startEnd;
            if (lengthPercentage3 == null && (lengthPercentage3 = this.bottomStart) == null && (lengthPercentage3 = this.bottomLeft) == null) {
                lengthPercentage3 = this.uniform;
            }
            CornerRadii cornerRadii4 = lengthPercentage3 != null ? new CornerRadii(lengthPercentage3, width, height) : cornerRadii;
            LengthPercentage lengthPercentage4 = this.endEnd;
            if (lengthPercentage4 == null && (lengthPercentage4 = this.bottomEnd) == null && (lengthPercentage4 = this.bottomRight) == null) {
                lengthPercentage4 = this.uniform;
            }
            if (lengthPercentage4 != null) {
                cornerRadii = new CornerRadii(lengthPercentage4, width, height);
            }
            return ensureNoOverlap(cornerRadii2, cornerRadii3, cornerRadii4, cornerRadii, width, height);
        }
        if (layoutDirection != 1) {
            throw new IllegalArgumentException("Expected?.resolved layout direction");
        }
        if (I18nUtil.INSTANCE.getInstance().doLeftAndRightSwapInRTL(context)) {
            LengthPercentage lengthPercentage5 = this.endStart;
            if (lengthPercentage5 == null && (lengthPercentage5 = this.topEnd) == null && (lengthPercentage5 = this.topRight) == null) {
                lengthPercentage5 = this.uniform;
            }
            CornerRadii cornerRadii5 = lengthPercentage5 != null ? new CornerRadii(lengthPercentage5, width, height) : cornerRadii;
            LengthPercentage lengthPercentage6 = this.startStart;
            if (lengthPercentage6 == null && (lengthPercentage6 = this.topStart) == null && (lengthPercentage6 = this.topLeft) == null) {
                lengthPercentage6 = this.uniform;
            }
            CornerRadii cornerRadii6 = lengthPercentage6 != null ? new CornerRadii(lengthPercentage6, width, height) : cornerRadii;
            LengthPercentage lengthPercentage7 = this.endEnd;
            if (lengthPercentage7 == null && (lengthPercentage7 = this.bottomEnd) == null && (lengthPercentage7 = this.bottomRight) == null) {
                lengthPercentage7 = this.uniform;
            }
            CornerRadii cornerRadii7 = lengthPercentage7 != null ? new CornerRadii(lengthPercentage7, width, height) : cornerRadii;
            LengthPercentage lengthPercentage8 = this.startEnd;
            if (lengthPercentage8 == null && (lengthPercentage8 = this.bottomStart) == null && (lengthPercentage8 = this.bottomLeft) == null) {
                lengthPercentage8 = this.uniform;
            }
            if (lengthPercentage8 != null) {
                cornerRadii = new CornerRadii(lengthPercentage8, width, height);
            }
            return ensureNoOverlap(cornerRadii5, cornerRadii6, cornerRadii7, cornerRadii, width, height);
        }
        LengthPercentage lengthPercentage9 = this.endStart;
        if (lengthPercentage9 == null && (lengthPercentage9 = this.topEnd) == null && (lengthPercentage9 = this.topLeft) == null) {
            lengthPercentage9 = this.uniform;
        }
        CornerRadii cornerRadii8 = lengthPercentage9 != null ? new CornerRadii(lengthPercentage9, width, height) : cornerRadii;
        LengthPercentage lengthPercentage10 = this.startStart;
        if (lengthPercentage10 == null && (lengthPercentage10 = this.topStart) == null && (lengthPercentage10 = this.topRight) == null) {
            lengthPercentage10 = this.uniform;
        }
        CornerRadii cornerRadii9 = lengthPercentage10 != null ? new CornerRadii(lengthPercentage10, width, height) : cornerRadii;
        LengthPercentage lengthPercentage11 = this.endEnd;
        if (lengthPercentage11 == null && (lengthPercentage11 = this.bottomStart) == null && (lengthPercentage11 = this.bottomLeft) == null) {
            lengthPercentage11 = this.uniform;
        }
        CornerRadii cornerRadii10 = lengthPercentage11 != null ? new CornerRadii(lengthPercentage11, width, height) : cornerRadii;
        LengthPercentage lengthPercentage12 = this.startEnd;
        if (lengthPercentage12 == null && (lengthPercentage12 = this.bottomEnd) == null && (lengthPercentage12 = this.bottomRight) == null) {
            lengthPercentage12 = this.uniform;
        }
        if (lengthPercentage12 != null) {
            cornerRadii = new CornerRadii(lengthPercentage12, width, height);
        }
        return ensureNoOverlap(cornerRadii8, cornerRadii9, cornerRadii10, cornerRadii, width, height);
    }

    public final void set(BorderRadiusProp property, LengthPercentage value) {
        AbstractC2855l.g(property, "property");
        switch (WhenMappings.$EnumSwitchMapping$0[property.ordinal()]) {
            case 1:
                this.uniform = value;
                return;
            case 2:
                this.topLeft = value;
                return;
            case 3:
                this.topRight = value;
                return;
            case 4:
                this.bottomLeft = value;
                return;
            case 5:
                this.bottomRight = value;
                return;
            case 6:
                this.topStart = value;
                return;
            case 7:
                this.topEnd = value;
                return;
            case 8:
                this.bottomStart = value;
                return;
            case 9:
                this.bottomEnd = value;
                return;
            case 10:
                this.startStart = value;
                return;
            case 11:
                this.startEnd = value;
                return;
            case 12:
                this.endStart = value;
                return;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                this.endEnd = value;
                return;
            default:
                throw new C2750m();
        }
    }

    public final void setBottomEnd(LengthPercentage lengthPercentage) {
        this.bottomEnd = lengthPercentage;
    }

    public final void setBottomLeft(LengthPercentage lengthPercentage) {
        this.bottomLeft = lengthPercentage;
    }

    public final void setBottomRight(LengthPercentage lengthPercentage) {
        this.bottomRight = lengthPercentage;
    }

    public final void setBottomStart(LengthPercentage lengthPercentage) {
        this.bottomStart = lengthPercentage;
    }

    public final void setEndEnd(LengthPercentage lengthPercentage) {
        this.endEnd = lengthPercentage;
    }

    public final void setEndStart(LengthPercentage lengthPercentage) {
        this.endStart = lengthPercentage;
    }

    public final void setStartEnd(LengthPercentage lengthPercentage) {
        this.startEnd = lengthPercentage;
    }

    public final void setStartStart(LengthPercentage lengthPercentage) {
        this.startStart = lengthPercentage;
    }

    public final void setTopEnd(LengthPercentage lengthPercentage) {
        this.topEnd = lengthPercentage;
    }

    public final void setTopLeft(LengthPercentage lengthPercentage) {
        this.topLeft = lengthPercentage;
    }

    public final void setTopRight(LengthPercentage lengthPercentage) {
        this.topRight = lengthPercentage;
    }

    public final void setTopStart(LengthPercentage lengthPercentage) {
        this.topStart = lengthPercentage;
    }

    public final void setUniform(LengthPercentage lengthPercentage) {
        this.uniform = lengthPercentage;
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.uniform + ", topLeft=" + this.topLeft + ", topRight=" + this.topRight + ", bottomLeft=" + this.bottomLeft + ", bottomRight=" + this.bottomRight + ", topStart=" + this.topStart + ", topEnd=" + this.topEnd + ", bottomStart=" + this.bottomStart + ", bottomEnd=" + this.bottomEnd + ", startStart=" + this.startStart + ", startEnd=" + this.startEnd + ", endStart=" + this.endStart + ", endEnd=" + this.endEnd + ")";
    }

    public BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13) {
        this.uniform = lengthPercentage;
        this.topLeft = lengthPercentage2;
        this.topRight = lengthPercentage3;
        this.bottomLeft = lengthPercentage4;
        this.bottomRight = lengthPercentage5;
        this.topStart = lengthPercentage6;
        this.topEnd = lengthPercentage7;
        this.bottomStart = lengthPercentage8;
        this.bottomEnd = lengthPercentage9;
        this.startStart = lengthPercentage10;
        this.startEnd = lengthPercentage11;
        this.endStart = lengthPercentage12;
        this.endEnd = lengthPercentage13;
    }

    public /* synthetic */ BorderRadiusStyle(LengthPercentage lengthPercentage, LengthPercentage lengthPercentage2, LengthPercentage lengthPercentage3, LengthPercentage lengthPercentage4, LengthPercentage lengthPercentage5, LengthPercentage lengthPercentage6, LengthPercentage lengthPercentage7, LengthPercentage lengthPercentage8, LengthPercentage lengthPercentage9, LengthPercentage lengthPercentage10, LengthPercentage lengthPercentage11, LengthPercentage lengthPercentage12, LengthPercentage lengthPercentage13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : lengthPercentage, (i10 & 2) != 0 ? null : lengthPercentage2, (i10 & 4) != 0 ? null : lengthPercentage3, (i10 & 8) != 0 ? null : lengthPercentage4, (i10 & 16) != 0 ? null : lengthPercentage5, (i10 & 32) != 0 ? null : lengthPercentage6, (i10 & 64) != 0 ? null : lengthPercentage7, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT) != 0 ? null : lengthPercentage8, (i10 & 256) != 0 ? null : lengthPercentage9, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_PADDING) != 0 ? null : lengthPercentage10, (i10 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_OVERFLOW_INSET) != 0 ? null : lengthPercentage11, (i10 & 2048) != 0 ? null : lengthPercentage12, (i10 & 4096) != 0 ? null : lengthPercentage13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BorderRadiusStyle(List<? extends Pair<? extends BorderRadiusProp, LengthPercentage>> properties) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
        AbstractC2855l.g(properties, "properties");
        Iterator<T> it = properties.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            set((BorderRadiusProp) pair.getFirst(), (LengthPercentage) pair.getSecond());
        }
    }
}
