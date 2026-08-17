package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface ModalHostViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAllowSwipeDismissal(T t10, boolean z10);

    void setAnimated(T t10, boolean z10);

    void setAnimationType(T t10, String str);

    void setHardwareAccelerated(T t10, boolean z10);

    void setIdentifier(T t10, int i10);

    void setNavigationBarTranslucent(T t10, boolean z10);

    void setPresentationStyle(T t10, String str);

    void setStatusBarTranslucent(T t10, boolean z10);

    void setSupportedOrientations(T t10, ReadableArray readableArray);

    void setTransparent(T t10, boolean z10);

    void setVisible(T t10, boolean z10);
}
