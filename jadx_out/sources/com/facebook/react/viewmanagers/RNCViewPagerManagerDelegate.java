package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNCViewPagerManagerInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class RNCViewPagerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNCViewPagerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNCViewPagerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: receiveCommand */
    public void kotlinCompat$receiveCommand(T t10, String str, ReadableArray readableArray) {
        str.getClass();
        switch (str) {
            case "setPageWithoutAnimation":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPageWithoutAnimation(t10, readableArray.getInt(0));
                break;
            case "setScrollEnabledImperatively":
                ((RNCViewPagerManagerInterface) this.mViewManager).setScrollEnabledImperatively(t10, readableArray.getBoolean(0));
                break;
            case "setPage":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPage(t10, readableArray.getInt(0));
                break;
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* JADX INFO: renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        switch (str) {
            case "layoutDirection":
                ((RNCViewPagerManagerInterface) this.mViewManager).setLayoutDirection(t10, (String) obj);
                break;
            case "offscreenPageLimit":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOffscreenPageLimit(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "orientation":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOrientation(t10, (String) obj);
                break;
            case "overScrollMode":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOverScrollMode(t10, (String) obj);
                break;
            case "scrollEnabled":
                ((RNCViewPagerManagerInterface) this.mViewManager).setScrollEnabled(t10, obj != null ? ((Boolean) obj).booleanValue() : true);
                break;
            case "keyboardDismissMode":
                ((RNCViewPagerManagerInterface) this.mViewManager).setKeyboardDismissMode(t10, (String) obj);
                break;
            case "overdrag":
                ((RNCViewPagerManagerInterface) this.mViewManager).setOverdrag(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case "pageMargin":
                ((RNCViewPagerManagerInterface) this.mViewManager).setPageMargin(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case "initialPage":
                ((RNCViewPagerManagerInterface) this.mViewManager).setInitialPage(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
