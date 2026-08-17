package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSVGRectManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSVGRectManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGRectManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1274492040:
                if (str.equals(ViewProps.FILTER)) {
                    b10 = 0;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    b10 = 1;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
                    b10 = 2;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    b10 = 3;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    b10 = 4;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    b10 = 5;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    b10 = 6;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    b10 = 7;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    b10 = 8;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    b10 = 9;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    b10 = 10;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    b10 = 11;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    b10 = 12;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    b10 = 13;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    b10 = 14;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    b10 = 15;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    b10 = 16;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    b10 = 17;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    b10 = 18;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    b10 = 19;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    b10 = 20;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 21;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    b10 = 22;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    b10 = 23;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    b10 = 24;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    b10 = 25;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    b10 = 26;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    b10 = 27;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    b10 = 28;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    b10 = 29;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    b10 = 30;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    b10 = 31;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    b10 = 32;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSVGRectManagerInterface) this.mViewManager).setFilter(t10, obj != null ? (String) obj : null);
                break;
            case 1:
                this.mViewManager.setOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 2:
                ((RNSVGRectManagerInterface) this.mViewManager).setHeight(t10, new DynamicFromObject(obj));
                break;
            case 3:
                ((RNSVGRectManagerInterface) this.mViewManager).setMatrix(t10, (ReadableArray) obj);
                break;
            case 4:
                ((RNSVGRectManagerInterface) this.mViewManager).setPropList(t10, (ReadableArray) obj);
                break;
            case 5:
                ((RNSVGRectManagerInterface) this.mViewManager).setMarkerEnd(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNSVGRectManagerInterface) this.mViewManager).setMarkerMid(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSVGRectManagerInterface) this.mViewManager).setStroke(t10, new DynamicFromObject(obj));
                break;
            case 8:
                ((RNSVGRectManagerInterface) this.mViewManager).setFillRule(t10, obj != null ? ((Double) obj).intValue() : 1);
                break;
            case 9:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 10:
                ((RNSVGRectManagerInterface) this.mViewManager).setPointerEvents(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSVGRectManagerInterface) this.mViewManager).setFillOpacity(t10, obj != null ? ((Double) obj).floatValue() : 1.0f);
                break;
            case 12:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeDashoffset(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setX(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setY(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setRx(t10, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSVGRectManagerInterface) this.mViewManager).setRy(t10, new DynamicFromObject(obj));
                break;
            case 17:
                ((RNSVGRectManagerInterface) this.mViewManager).setFill(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setMask(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setName(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeMiterlimit(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setVectorEffect(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setWidth(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setMarkerStart(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeDasharray(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setClipPath(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setClipRule(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeLinecap(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((RNSVGRectManagerInterface) this.mViewManager).setDisplay(t10, obj != null ? (String) obj : null);
                break;
            case 30:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeLinejoin(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 31:
                ((RNSVGRectManagerInterface) this.mViewManager).setResponsible(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case IntBufferBatchMountItem.INSTRUCTION_UPDATE_PROPS /* 32 */:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeWidth(t10, new DynamicFromObject(obj));
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
