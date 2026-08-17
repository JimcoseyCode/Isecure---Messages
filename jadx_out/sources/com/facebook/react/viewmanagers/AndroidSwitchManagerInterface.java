package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface AndroidSwitchManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setDisabled(T t10, boolean z10);

    void setEnabled(T t10, boolean z10);

    void setNativeValue(T t10, boolean z10);

    void setOn(T t10, boolean z10);

    void setThumbColor(T t10, Integer num);

    void setThumbTintColor(T t10, Integer num);

    void setTrackColorForFalse(T t10, Integer num);

    void setTrackColorForTrue(T t10, Integer num);

    void setTrackTintColor(T t10, Integer num);

    void setValue(T t10, boolean z10);
}
