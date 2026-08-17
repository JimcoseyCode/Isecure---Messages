package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.drawable.OutsetBoxShadowDrawableKt;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderConfigManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSScreenStackHeaderConfigManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSScreenStackHeaderConfigManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenStackHeaderConfigManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2035671681:
                if (str.equals("synchronousShadowStateUpdatesEnabled")) {
                    b10 = 0;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 1;
                }
                break;
            case -1822687399:
                if (str.equals("translucent")) {
                    b10 = 2;
                }
                break;
            case -1799367701:
                if (str.equals("titleColor")) {
                    b10 = 3;
                }
                break;
            case -1795707688:
                if (str.equals("blurEffect")) {
                    b10 = 4;
                }
                break;
            case -1774658170:
                if (str.equals("largeTitleColor")) {
                    b10 = 5;
                }
                break;
            case -1715368693:
                if (str.equals("titleFontFamily")) {
                    b10 = 6;
                }
                break;
            case -1503810304:
                if (str.equals("disableBackButtonMenu")) {
                    b10 = 7;
                }
                break;
            case -1225100257:
                if (str.equals("titleFontWeight")) {
                    b10 = 8;
                }
                break;
            case -1217487446:
                if (str.equals(ViewProps.HIDDEN)) {
                    b10 = 9;
                }
                break;
            case -1094575123:
                if (str.equals("largeTitleFontSize")) {
                    b10 = 10;
                }
                break;
            case -1093089076:
                if (str.equals("backButtonDisplayMode")) {
                    b10 = 11;
                }
                break;
            case -1063138943:
                if (str.equals("backTitleVisible")) {
                    b10 = 12;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b10 = 13;
                }
                break;
            case -389245640:
                if (str.equals("largeTitleBackgroundColor")) {
                    b10 = 14;
                }
                break;
            case -140063148:
                if (str.equals("backButtonInCustomView")) {
                    b10 = 15;
                }
                break;
            case 347216:
                if (str.equals("largeTitleFontFamily")) {
                    b10 = 16;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    b10 = 17;
                }
                break;
            case 110371416:
                if (str.equals(AlertFragment.ARG_TITLE)) {
                    b10 = 18;
                }
                break;
            case 183888321:
                if (str.equals("backTitleFontSize")) {
                    b10 = 19;
                }
                break;
            case 243070244:
                if (str.equals("backTitleFontFamily")) {
                    b10 = 20;
                }
                break;
            case 339462402:
                if (str.equals("hideShadow")) {
                    b10 = 21;
                }
                break;
            case 490615652:
                if (str.equals("largeTitleFontWeight")) {
                    b10 = 22;
                }
                break;
            case 946001674:
                if (str.equals("headerRightBarButtonItems")) {
                    b10 = 23;
                }
                break;
            case 1038753243:
                if (str.equals("hideBackButton")) {
                    b10 = 24;
                }
                break;
            case 1249557231:
                if (str.equals("headerLeftBarButtonItems")) {
                    b10 = 25;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    b10 = 26;
                }
                break;
            case 1324688817:
                if (str.equals("backTitle")) {
                    b10 = 27;
                }
                break;
            case 1518161768:
                if (str.equals("titleFontSize")) {
                    b10 = 28;
                }
                break;
            case 1564506303:
                if (str.equals("largeTitleHideShadow")) {
                    b10 = 29;
                }
                break;
            case 2029798365:
                if (str.equals("largeTitle")) {
                    b10 = 30;
                }
                break;
            case 2099541337:
                if (str.equals("topInsetEnabled")) {
                    b10 = 31;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setSynchronousShadowStateUpdatesEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 1:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setUserInterfaceStyle(t10, (String) obj);
                break;
            case 2:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTranslucent(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 3:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 4:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBlurEffect(t10, (String) obj);
                break;
            case 5:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDisableBackButtonMenu(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 8:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontWeight(t10, obj != null ? (String) obj : null);
                break;
            case 9:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 10:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 11:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonDisplayMode(t10, (String) obj);
                break;
            case 12:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleVisible(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setDirection(t10, (String) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackButtonInCustomView(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideShadow(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleFontWeight(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderRightBarButtonItems(t10, (ReadableArray) obj);
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHideBackButton(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setHeaderLeftBarButtonItems(t10, (ReadableArray) obj);
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_TEXT_TRANSFORM /* 27 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setBackTitle(t10, obj != null ? (String) obj : null);
                break;
            case OutsetBoxShadowDrawableKt.MIN_OUTSET_BOX_SHADOW_SDK_VERSION /* 28 */:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTitleFontSize(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 29:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitleHideShadow(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 30:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setLargeTitle(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 31:
                ((RNSScreenStackHeaderConfigManagerInterface) this.mViewManager).setTopInsetEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
