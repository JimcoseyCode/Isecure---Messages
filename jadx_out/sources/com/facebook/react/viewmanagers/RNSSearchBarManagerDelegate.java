package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNSSearchBarManagerInterface;
import com.facebook.react.views.text.TextAttributeProps;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNSSearchBarManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNSSearchBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSSearchBarManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "cancelSearch":
                ((RNSSearchBarManagerInterface) this.mViewManager).cancelSearch(t10);
                break;
            case "clearText":
                ((RNSSearchBarManagerInterface) this.mViewManager).clearText(t10);
                break;
            case "toggleCancelButton":
                ((RNSSearchBarManagerInterface) this.mViewManager).toggleCancelButton(t10, readableArray.getBoolean(0));
                break;
            case "blur":
                ((RNSSearchBarManagerInterface) this.mViewManager).blur(t10);
                break;
            case "focus":
                ((RNSSearchBarManagerInterface) this.mViewManager).focus(t10);
                break;
            case "setText":
                ((RNSSearchBarManagerInterface) this.mViewManager).setText(t10, readableArray.getString(0));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1619312835:
                if (str.equals("hideNavigationBar")) {
                    b10 = 0;
                }
                break;
            case -1465798051:
                if (str.equals("headerIconColor")) {
                    b10 = 1;
                }
                break;
            case -1339545093:
                if (str.equals("autoCapitalize")) {
                    b10 = 2;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    b10 = 3;
                }
                break;
            case -336520619:
                if (str.equals("barTintColor")) {
                    b10 = 4;
                }
                break;
            case -256845969:
                if (str.equals("hintTextColor")) {
                    b10 = 5;
                }
                break;
            case -186579527:
                if (str.equals("hideWhenScrolling")) {
                    b10 = 6;
                }
                break;
            case -146361959:
                if (str.equals("cancelButtonText")) {
                    b10 = 7;
                }
                break;
            case -109380883:
                if (str.equals("disableBackButtonOverride")) {
                    b10 = 8;
                }
                break;
            case -39414888:
                if (str.equals("shouldShowHintSearchIcon")) {
                    b10 = 9;
                }
                break;
            case 598246771:
                if (str.equals(ReactTextInputShadowNode.PROP_PLACEHOLDER)) {
                    b10 = 10;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    b10 = 11;
                }
                break;
            case 1399891586:
                if (str.equals("allowToolbarIntegration")) {
                    b10 = 12;
                }
                break;
            case 1584806451:
                if (str.equals("obscureBackground")) {
                    b10 = 13;
                }
                break;
            case 1638055017:
                if (str.equals("autoFocus")) {
                    b10 = 14;
                }
                break;
            case 1706976804:
                if (str.equals("inputType")) {
                    b10 = 15;
                }
                break;
            case 1792938725:
                if (str.equals("placement")) {
                    b10 = 16;
                }
                break;
        }
        switch (b10) {
            case 0:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideNavigationBar(t10, (String) obj);
                break;
            case 1:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHeaderIconColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 2:
                ((RNSSearchBarManagerInterface) this.mViewManager).setAutoCapitalize(t10, (String) obj);
                break;
            case 3:
                ((RNSSearchBarManagerInterface) this.mViewManager).setTextColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 4:
                ((RNSSearchBarManagerInterface) this.mViewManager).setBarTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 5:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHintTextColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 6:
                ((RNSSearchBarManagerInterface) this.mViewManager).setHideWhenScrolling(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 7:
                ((RNSSearchBarManagerInterface) this.mViewManager).setCancelButtonText(t10, obj != null ? (String) obj : null);
                break;
            case 8:
                ((RNSSearchBarManagerInterface) this.mViewManager).setDisableBackButtonOverride(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 9:
                ((RNSSearchBarManagerInterface) this.mViewManager).setShouldShowHintSearchIcon(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case 10:
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlaceholder(t10, obj != null ? (String) obj : null);
                break;
            case 11:
                ((RNSSearchBarManagerInterface) this.mViewManager).setTintColor(t10, ColorPropConverter.getColor(obj, t10.getContext()));
                break;
            case 12:
                ((RNSSearchBarManagerInterface) this.mViewManager).setAllowToolbarIntegration(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                ((RNSSearchBarManagerInterface) this.mViewManager).setObscureBackground(t10, (String) obj);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                ((RNSSearchBarManagerInterface) this.mViewManager).setAutoFocus(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                ((RNSSearchBarManagerInterface) this.mViewManager).setInputType(t10, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNSSearchBarManagerInterface) this.mViewManager).setPlacement(t10, (String) obj);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
