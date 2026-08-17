package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface RNSSplitViewHostManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setColumnMetrics(T t10, ReadableMap readableMap);

    void setDisplayModeButtonVisibility(T t10, String str);

    void setOrientation(T t10, String str);

    void setPreferredDisplayMode(T t10, String str);

    void setPreferredSplitBehavior(T t10, String str);

    void setPresentsWithGesture(T t10, boolean z10);

    void setPrimaryBackgroundStyle(T t10, String str);

    void setPrimaryEdge(T t10, String str);

    void setShowInspector(T t10, boolean z10);

    void setShowSecondaryToggleButton(T t10, boolean z10);
}
