package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public interface RNCViewPagerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setInitialPage(T t10, int i10);

    void setKeyboardDismissMode(T t10, String str);

    void setLayoutDirection(T t10, String str);

    void setOffscreenPageLimit(T t10, int i10);

    void setOrientation(T t10, String str);

    void setOverScrollMode(T t10, String str);

    void setOverdrag(T t10, boolean z10);

    void setPage(T t10, int i10);

    void setPageMargin(T t10, int i10);

    void setPageWithoutAnimation(T t10, int i10);

    void setScrollEnabled(T t10, boolean z10);

    void setScrollEnabledImperatively(T t10, boolean z10);
}
