package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface AndroidDrawerLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void closeDrawer(T t10);

    void openDrawer(T t10);

    void setDrawerBackgroundColor(T t10, Integer num);

    void setDrawerLockMode(T t10, String str);

    void setDrawerPosition(T t10, String str);

    void setDrawerWidth(T t10, Float f10);

    void setKeyboardDismissMode(T t10, String str);

    void setStatusBarBackgroundColor(T t10, Integer num);
}
