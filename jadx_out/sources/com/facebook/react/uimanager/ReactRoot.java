package com.facebook.react.uimanager;

import android.os.Bundle;
import android.view.ViewGroup;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 !2\u00020\u0001:\u0001!J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\bH&¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\u001d\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b\u001f\u0010 ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lcom/facebook/react/uimanager/ReactRoot;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "getAppProperties", "()Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getJSModuleName", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getUIManagerType", "()I", "getRootViewTag", "rootViewTag", "Li7/B;", "setRootViewTag", "(I)V", "runApplication", "()V", "stage", "onStage", "Landroid/view/ViewGroup;", "getRootViewGroup", "()Landroid/view/ViewGroup;", "getWidthMeasureSpec", "getHeightMeasureSpec", PointerEventHelper.POINTER_TYPE_UNKNOWN, "shouldLogContentAppeared", "setShouldLogContentAppeared", "(Z)V", "getSurfaceID", "Ljava/util/concurrent/atomic/AtomicInteger;", "getState", "()Ljava/util/concurrent/atomic/AtomicInteger;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ReactRoot {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int STATE_STARTED = 1;
    public static final int STATE_STOPPED = 0;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/ReactRoot$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "STATE_STOPPED", PointerEventHelper.POINTER_TYPE_UNKNOWN, "STATE_STARTED", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int STATE_STARTED = 1;
        public static final int STATE_STOPPED = 0;

        private Companion() {
        }
    }

    Bundle getAppProperties();

    int getHeightMeasureSpec();

    String getJSModuleName();

    ViewGroup getRootViewGroup();

    int getRootViewTag();

    AtomicInteger getState();

    String getSurfaceID();

    int getUIManagerType();

    int getWidthMeasureSpec();

    void onStage(int stage);

    void runApplication();

    void setRootViewTag(int rootViewTag);

    void setShouldLogContentAppeared(boolean shouldLogContentAppeared);
}
