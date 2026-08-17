package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface RNSVGFeGaussianBlurManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setEdgeMode(T t10, String str);

    void setHeight(T t10, Dynamic dynamic);

    void setIn1(T t10, String str);

    void setResult(T t10, String str);

    void setStdDeviationX(T t10, float f10);

    void setStdDeviationY(T t10, float f10);

    void setWidth(T t10, Dynamic dynamic);

    void setX(T t10, Dynamic dynamic);

    void setY(T t10, Dynamic dynamic);
}
