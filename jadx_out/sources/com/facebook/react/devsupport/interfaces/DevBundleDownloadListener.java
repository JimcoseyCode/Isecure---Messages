package com.facebook.react.devsupport.interfaces;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.permissions.PermissionsResponse;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\n\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u00022\n\u0010\u000e\u001a\u00060\fj\u0002`\rH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onSuccess", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, PermissionsResponse.STATUS_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "done", "total", "onProgress", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "onFailure", "(Ljava/lang/Exception;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DevBundleDownloadListener {
    void onFailure(Exception cause);

    void onProgress(String status, Integer done, Integer total);

    void onSuccess();
}
