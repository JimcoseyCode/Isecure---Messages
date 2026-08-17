package com.facebook.react.modules.core;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00132\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lcom/facebook/react/modules/core/PermissionAwareActivity;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "permission", PointerEventHelper.POINTER_TYPE_UNKNOWN, "pid", "uid", "checkPermission", "(Ljava/lang/String;II)I", "checkSelfPermission", "(Ljava/lang/String;)I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldShowRequestPermissionRationale", "(Ljava/lang/String;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "permissions", "requestCode", "Lcom/facebook/react/modules/core/PermissionListener;", "listener", "Li7/B;", "requestPermissions", "([Ljava/lang/String;ILcom/facebook/react/modules/core/PermissionListener;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PermissionAwareActivity {
    int checkPermission(String permission, int pid, int uid);

    int checkSelfPermission(String permission);

    void requestPermissions(String[] permissions, int requestCode, PermissionListener listener);

    boolean shouldShowRequestPermissionRationale(String permission);
}
