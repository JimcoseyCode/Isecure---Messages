package com.facebook.react.devsupport.interfaces;

import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/PausedInDebuggerOverlayManager;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "listener", "Li7/B;", "showPausedInDebuggerOverlay", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V", "hidePausedInDebuggerOverlay", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface PausedInDebuggerOverlayManager {
    void hidePausedInDebuggerOverlay();

    void showPausedInDebuggerOverlay(String message, DevSupportManager.PausedInDebuggerOverlayCommandListener listener);
}
