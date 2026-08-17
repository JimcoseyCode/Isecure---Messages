package com.facebook.react.uimanager;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ViewManagerResolver;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getViewManager", "Lcom/facebook/react/uimanager/ViewManager;", "viewManagerName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getViewManagerNames", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ViewManagerResolver {
    ViewManager<?, ?> getViewManager(String viewManagerName);

    Collection<String> getViewManagerNames();
}
