package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSBottomTabsManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSBottomTabsManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSBottomTabsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSBottomTabsManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1873119606:
                if (str.equals("tabBarTintColor")) {
                    b10 = 0;
                }
                break;
            case -1716883528:
                if (str.equals("tabBarItemLabelVisibilityMode")) {
                    b10 = 1;
                }
                break;
            case -1583805635:
                if (str.equals("tabBarControllerMode")) {
                    b10 = 2;
                }
                break;
            case -1167805191:
                if (str.equals("tabBarItemIconColor")) {
                    b10 = 3;
                }
                break;
            case -1140765365:
                if (str.equals("tabBarItemActiveIndicatorColor")) {
                    b10 = 4;
                }
                break;
            case -727132909:
                if (str.equals("tabBarItemTitleFontColorActive")) {
                    b10 = 5;
                }
                break;
            case -149697865:
                if (str.equals("tabBarBackgroundColor")) {
                    b10 = 6;
                }
                break;
            case -141083017:
                if (str.equals("tabBarItemTitleFontSize")) {
                    b10 = 7;
                }
                break;
            case -93216851:
                if (str.equals("tabBarItemTitleFontColor")) {
                    b10 = 8;
                }
                break;
            case -78279173:
                if (str.equals("tabBarItemTitleFontStyle")) {
                    b10 = 9;
                }
                break;
            case 144476014:
                if (str.equals("tabBarMinimizeBehavior")) {
                    b10 = 10;
                }
                break;
            case 278168456:
                if (str.equals("tabBarHidden")) {
                    b10 = 11;
                }
                break;
            case 595595083:
                if (str.equals("nativeContainerBackgroundColor")) {
                    b10 = 12;
                }
                break;
            case 676974377:
                if (str.equals("tabBarItemActiveIndicatorEnabled")) {
                    b10 = 13;
                }
                break;
            case 697418079:
                if (str.equals("tabBarItemIconColorActive")) {
                    b10 = 14;
                }
                break;
            case 1458977038:
                if (str.equals("controlNavigationStateInJS")) {
                    b10 = 15;
                }
                break;
            case 1478227034:
                if (str.equals("tabBarItemTitleFontFamily")) {
                    b10 = 16;
                }
                break;
            case 1935822306:
                if (str.equals("tabBarItemRippleColor")) {
                    b10 = 17;
                }
                break;
            case 1968495470:
                if (str.equals("tabBarItemTitleFontWeight")) {
                    b10 = 18;
                }
                break;
            case 2018161757:
                if (str.equals("tabBarItemTitleFontSizeActive")) {
                    b10 = 19;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 1:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemLabelVisibilityMode(t10, (String) obj);
                break;
            case 2:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarControllerMode(t10, (String) obj);
                break;
            case 3:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemIconColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 4:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 5:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontColorActive(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 7:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontSize(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            case 8:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 9:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontStyle(t10, obj != null ? (String) obj : null);
                break;
            case 10:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarMinimizeBehavior(t10, (String) obj);
                break;
            case 11:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarHidden(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 12:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setNativeContainerBackgroundColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemActiveIndicatorEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemIconColorActive(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setControlNavigationStateInJS(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 16:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontFamily(t10, obj != null ? (String) obj : null);
                break;
            case 17:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemRippleColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_RADIUS /* 18 */:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontWeight(t10, obj != null ? (String) obj : null);
                break;
            case TextAttributeProps.TA_KEY_TEXT_SHADOW_COLOR /* 19 */:
                ((RNSBottomTabsManagerInterface) this.mViewManager).setTabBarItemTitleFontSizeActive(t10, obj != null ? ((Double) obj).floatValue() : 0.0f);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
