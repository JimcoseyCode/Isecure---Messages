package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.DynamicFromObject;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.dialog.AlertFragment;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSBottomTabsScreenManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSBottomTabsScreenManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSBottomTabsScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSBottomTabsScreenManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1991728986:
                if (str.equals("bottomScrollEdgeEffect")) {
                    b10 = 0;
                }
                break;
            case -1871891504:
                if (str.equals("topScrollEdgeEffect")) {
                    b10 = 1;
                }
                break;
            case -1829317469:
                if (str.equals("userInterfaceStyle")) {
                    b10 = 2;
                }
                break;
            case -1791070590:
                if (str.equals("leftScrollEdgeEffect")) {
                    b10 = 3;
                }
                break;
            case -1770963447:
                if (str.equals("specialEffects")) {
                    b10 = 4;
                }
                break;
            case -1628518761:
                if (str.equals("rightScrollEdgeEffect")) {
                    b10 = 5;
                }
                break;
            case -1559978286:
                if (str.equals("iconResourceName")) {
                    b10 = 6;
                }
                break;
            case -1439500848:
                if (str.equals("orientation")) {
                    b10 = 7;
                }
                break;
            case -1270820115:
                if (str.equals("isFocused")) {
                    b10 = 8;
                }
                break;
            case -1186468415:
                if (str.equals("overrideScrollViewContentInsetAdjustmentBehavior")) {
                    b10 = 9;
                }
                break;
            case -1167193694:
                if (str.equals("isTitleUndefined")) {
                    b10 = 10;
                }
                break;
            case -881409398:
                if (str.equals("tabKey")) {
                    b10 = 11;
                }
                break;
            case -776576227:
                if (str.equals("iconImageSource")) {
                    b10 = 12;
                }
                break;
            case -737911981:
                if (str.equals("iconType")) {
                    b10 = 13;
                }
                break;
            case -558395241:
                if (str.equals("tabBarItemAccessibilityLabel")) {
                    b10 = 14;
                }
                break;
            case -270334418:
                if (str.equals("scrollEdgeAppearance")) {
                    b10 = 15;
                }
                break;
            case -10721392:
                if (str.equals("drawableIconResourceName")) {
                    b10 = 16;
                }
                break;
            case 28389121:
                if (str.equals("standardAppearance")) {
                    b10 = 17;
                }
                break;
            case 110371416:
                if (str.equals(AlertFragment.ARG_TITLE)) {
                    b10 = 18;
                }
                break;
            case 642560482:
                if (str.equals("systemItem")) {
                    b10 = 19;
                }
                break;
            case 1001537282:
                if (str.equals("selectedIconImageSource")) {
                    b10 = 20;
                }
                break;
            case 1072026510:
                if (str.equals("badgeValue")) {
                    b10 = 21;
                }
                break;
            case 1519110851:
                if (str.equals("tabBarItemBadgeBackgroundColor")) {
                    b10 = 22;
                }
                break;
            case 1577043198:
                if (str.equals("tabBarItemTestID")) {
                    b10 = 23;
                }
                break;
            case 1595935908:
                if (str.equals("tabBarItemBadgeTextColor")) {
                    b10 = 24;
                }
                break;
            case 2021932941:
                if (str.equals("selectedIconResourceName")) {
                    b10 = 25;
                }
                break;
            case 2109188258:
                if (str.equals("imageIconResource")) {
                    b10 = 26;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBottomScrollEdgeEffect(t10, (String) obj);
                break;
            case 1:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTopScrollEdgeEffect(t10, (String) obj);
                break;
            case 2:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setUserInterfaceStyle(t10, (String) obj);
                break;
            case 3:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setLeftScrollEdgeEffect(t10, (String) obj);
                break;
            case 4:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSpecialEffects(t10, (ReadableMap) obj);
                break;
            case 5:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setRightScrollEdgeEffect(t10, (String) obj);
                break;
            case 6:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOrientation(t10, (String) obj);
                break;
            case 8:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsFocused(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setOverrideScrollViewContentInsetAdjustmentBehavior(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIsTitleUndefined(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 11:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabKey(t10, obj != null ? (String) obj : null);
                break;
            case 12:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconImageSource(t10, (ReadableMap) obj);
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setIconType(t10, (String) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemAccessibilityLabel(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setScrollEdgeAppearance(t10, new DynamicFromObject(obj));
                break;
            case 16:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setDrawableIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setStandardAppearance(t10, new DynamicFromObject(obj));
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSystemItem(t10, (String) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DX /* 20 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconImageSource(t10, (ReadableMap) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_OFFSET_DY /* 21 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setBadgeValue(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_IS_HIGHLIGHTED /* 22 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_LAYOUT_DIRECTION /* 23 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemTestID(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_ACCESSIBILITY_ROLE /* 24 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setTabBarItemBadgeTextColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_LINE_BREAK_STRATEGY /* 25 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setSelectedIconResourceName(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_ROLE /* 26 */:
                ((RNSBottomTabsScreenManagerInterface) this.mViewManager).setImageIconResource(t10, (ReadableMap) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
