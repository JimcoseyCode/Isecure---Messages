package expo.modules.core.interfaces;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.ViewGroup;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactHost;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public interface ReactActivityHandler {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public interface DelayLoadAppHandler {
        void whenReady(Runnable runnable);
    }

    default ViewGroup createReactRootViewContainer(Activity activity) {
        return null;
    }

    default DelayLoadAppHandler getDelayLoadAppHandler(ReactActivity reactActivity, ReactHost reactHost) {
        return null;
    }

    default ReactActivityDelegate onDidCreateReactActivityDelegate(ReactActivity reactActivity, ReactActivityDelegate reactActivityDelegate) {
        return null;
    }

    default boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyLongPress(int i10, KeyEvent keyEvent) {
        return false;
    }

    default boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return false;
    }

    default void onDidCreateReactActivityDelegateNotification(ReactActivity reactActivity, ReactActivityDelegate reactActivityDelegate) {
    }
}
