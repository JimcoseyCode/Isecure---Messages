package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface AndroidSwipeRefreshLayoutManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColors(T t10, ReadableArray readableArray);

    void setEnabled(T t10, boolean z10);

    void setNativeRefreshing(T t10, boolean z10);

    void setProgressBackgroundColor(T t10, Integer num);

    void setProgressViewOffset(T t10, float f10);

    void setRefreshing(T t10, boolean z10);

    void setSize(T t10, String str);
}
