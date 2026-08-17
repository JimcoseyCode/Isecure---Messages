package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface RNSVGFilterManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setFilterUnits(T t10, String str);

    void setHeight(T t10, Dynamic dynamic);

    void setName(T t10, String str);

    void setPrimitiveUnits(T t10, String str);

    void setWidth(T t10, Dynamic dynamic);

    void setX(T t10, Dynamic dynamic);

    void setY(T t10, Dynamic dynamic);
}
