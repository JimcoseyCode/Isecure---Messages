package com.facebook.react.devsupport.interfaces;

import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u0005\u0010\nJ-\u0010\u000f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0013À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/DevLoadingViewManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "Li7/B;", "showMessage", "(Ljava/lang/String;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, ViewProps.COLOR, ViewProps.BACKGROUND_COLOR, "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;)V", PermissionsResponse.STATUS_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "done", "total", "updateProgress", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "hide", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DevLoadingViewManager {
    void hide();

    void showMessage(String message);

    void showMessage(String message, Double color, Double backgroundColor);

    void updateProgress(String status, Integer done, Integer total);
}
