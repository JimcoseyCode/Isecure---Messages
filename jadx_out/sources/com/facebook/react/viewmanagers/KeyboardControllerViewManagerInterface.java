package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface KeyboardControllerViewManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEnabled(T t10, boolean z10);

    void setNavigationBarTranslucent(T t10, boolean z10);

    void setPreserveEdgeToEdge(T t10, boolean z10);

    void setStatusBarTranslucent(T t10, boolean z10);

    void synchronizeFocusedInputLayout(T t10);
}
