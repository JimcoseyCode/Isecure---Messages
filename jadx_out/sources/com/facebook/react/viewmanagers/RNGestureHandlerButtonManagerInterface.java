package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface RNGestureHandlerButtonManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setBorderColor(T t10, Integer num);

    void setBorderStyle(T t10, String str);

    void setBorderWidth(T t10, float f10);

    void setBorderless(T t10, boolean z10);

    void setEnabled(T t10, boolean z10);

    void setExclusive(T t10, boolean z10);

    void setForeground(T t10, boolean z10);

    void setRippleColor(T t10, Integer num);

    void setRippleRadius(T t10, int i10);

    void setTouchSoundDisabled(T t10, boolean z10);
}
