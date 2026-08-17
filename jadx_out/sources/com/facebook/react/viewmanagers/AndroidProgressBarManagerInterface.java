package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface AndroidProgressBarManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setAnimating(T t10, boolean z10);

    void setColor(T t10, Integer num);

    void setIndeterminate(T t10, boolean z10);

    void setProgress(T t10, double d10);

    void setStyleAttr(T t10, String str);

    void setTestID(T t10, String str);

    void setTypeAttr(T t10, String str);
}
