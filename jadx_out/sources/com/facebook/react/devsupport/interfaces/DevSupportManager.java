package com.facebook.react.devsupport.interfaces;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\bf\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0006H&¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0006H&¢\u0006\u0004\b\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H&¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H&¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H&¢\u0006\u0004\b(\u0010\u001cJ\u000f\u0010)\u001a\u00020\u0006H&¢\u0006\u0004\b)\u0010\u001cJ\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H&¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010,\u001a\u00020/H&¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020%H&¢\u0006\u0004\b3\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020%H&¢\u0006\u0004\b6\u00104J\u000f\u00107\u001a\u00020\u0006H&¢\u0006\u0004\b7\u0010\u001cJ!\u0010;\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\u00022\u0006\u0010:\u001a\u000209H&¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H&¢\u0006\u0004\b?\u0010@J;\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0A2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020C0B0AH&¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020GH&¢\u0006\u0004\bI\u0010JJ\u0019\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020\u0002H&¢\u0006\u0004\bM\u0010NJ\u001b\u0010P\u001a\u00020\u00062\n\b\u0002\u0010O\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\bP\u0010QJ\u001f\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020RH&¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0006H&¢\u0006\u0004\bV\u0010\u001cJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H&¢\u0006\u0004\bY\u0010ZR\u0016\u0010^\u001a\u0004\u0018\u00010[8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010_8&X¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0016\u0010g\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010dR\u0016\u0010k\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\bj\u0010dR\u001c\u0010n\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8&X¦\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u0016\u0010r\u001a\u0004\u0018\u00010o8&X¦\u0004¢\u0006\u0006\u001a\u0004\bp\u0010qR\u0014\u0010u\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8&X¦\u0004¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0016\u0010|\u001a\u0004\u0018\u00010 8&X¦\u0004¢\u0006\u0006\u001a\u0004\bz\u0010{R$\u0010\u007f\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b}\u0010'\"\u0004\b~\u00104R'\u0010\u0082\u0001\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0080\u0001\u0010'\"\u0005\b\u0081\u0001\u00104R'\u0010\u0085\u0001\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010'\"\u0005\b\u0084\u0001\u00104R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00022\b\u0010X\u001a\u0004\u0018\u00010\u00028V@VX\u0096\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u0010d\"\u0005\b\u0087\u0001\u0010QR\u001f\u0010\u008b\u0001\u001a\u00020%8&@&X¦\u000e¢\u0006\u000e\u001a\u0005\b\u0089\u0001\u0010'\"\u0005\b\u008a\u0001\u00104ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u008e\u0001À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "Lcom/facebook/react/bridge/JSExceptionHandler;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "e", "Li7/B;", "showNewJavaError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "optionName", "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;", "optionHandler", "addCustomDevOption", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V", "appKey", "Landroid/view/View;", "createRootView", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "destroyRootView", "(Landroid/view/View;)V", "Lcom/facebook/react/bridge/ReadableArray;", "details", PointerEventHelper.POINTER_TYPE_UNKNOWN, "errorCookie", "showNewJSError", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V", "hideRedboxDialog", "()V", "showDevOptionsDialog", "startInspector", "stopInspector", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "onNewReactContextCreated", "(Lcom/facebook/react/bridge/ReactContext;)V", "onReactInstanceDestroyed", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hasUpToDateJSBundleInCache", "()Z", "reloadSettings", "handleReloadJS", "bundleURL", "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;", "callback", "reloadJSFromServer", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "isPackagerRunning", "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "isHotModuleReplacementEnabled", "setHotModuleReplacementEnabled", "(Z)V", "isFpsDebugEnabled", "setFpsDebugEnabled", "toggleElementInspector", "resourceURL", "Ljava/io/File;", "outputFile", "downloadBundleResourceFromUrlSync", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;", "errorCustomizer", "registerErrorCustomizer", "(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V", "Landroid/util/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "errorInfo", "processErrorCustomizers", "(Landroid/util/Pair;)Landroid/util/Pair;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", "packagerLocationCustomizer", "setPackagerLocationCustomizer", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V", "moduleName", "Lcom/facebook/react/common/SurfaceDelegate;", "createSurfaceDelegate", "(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;", "panel", "openDebugger", "(Ljava/lang/String;)V", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "listener", "showPausedInDebuggerOverlay", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V", "hidePausedInDebuggerOverlay", "name", "value", "setAdditionalOptionForPackager", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "getDevSettings", "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "devSettings", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "getRedBoxHandler", "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "getSourceMapUrl", "()Ljava/lang/String;", "sourceMapUrl", "getSourceUrl", "sourceUrl", "getDownloadedJSBundleFile", "downloadedJSBundleFile", "getLastErrorTitle", "lastErrorTitle", "getLastErrorStack", "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "lastErrorStack", "Lcom/facebook/react/devsupport/interfaces/ErrorType;", "getLastErrorType", "()Lcom/facebook/react/devsupport/interfaces/ErrorType;", "lastErrorType", "getLastErrorCookie", "()I", "lastErrorCookie", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "getDevMenuEnabled", "setDevMenuEnabled", "devMenuEnabled", "getShakeGestureEnabled", "setShakeGestureEnabled", "shakeGestureEnabled", "getKeyboardShortcutsEnabled", "setKeyboardShortcutsEnabled", "keyboardShortcutsEnabled", "getBundleFilePath", "setBundleFilePath", "bundleFilePath", "getDevSupportEnabled", "setDevSupportEnabled", "devSupportEnabled", "PackagerLocationCustomizer", "PausedInDebuggerOverlayCommandListener", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface DevSupportManager extends JSExceptionHandler {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Ljava/lang/Runnable;", "callback", "Li7/B;", "run", "(Ljava/lang/Runnable;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PackagerLocationCustomizer {
        void run(Runnable callback);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onResume", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PausedInDebuggerOverlayCommandListener {
        void onResume();
    }

    static /* synthetic */ void openDebugger$default(DevSupportManager devSupportManager, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openDebugger");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        devSupportManager.openDebugger(str);
    }

    void addCustomDevOption(String optionName, DevOptionHandler optionHandler);

    View createRootView(String appKey);

    SurfaceDelegate createSurfaceDelegate(String moduleName);

    void destroyRootView(View rootView);

    File downloadBundleResourceFromUrlSync(String resourceURL, File outputFile);

    default String getBundleFilePath() {
        return null;
    }

    Activity getCurrentActivity();

    ReactContext getCurrentReactContext();

    default boolean getDevMenuEnabled() {
        return true;
    }

    DeveloperSettings getDevSettings();

    boolean getDevSupportEnabled();

    String getDownloadedJSBundleFile();

    default boolean getKeyboardShortcutsEnabled() {
        return true;
    }

    int getLastErrorCookie();

    StackFrame[] getLastErrorStack();

    String getLastErrorTitle();

    ErrorType getLastErrorType();

    RedBoxHandler getRedBoxHandler();

    default boolean getShakeGestureEnabled() {
        return true;
    }

    String getSourceMapUrl();

    String getSourceUrl();

    void handleReloadJS();

    boolean hasUpToDateJSBundleInCache();

    void hidePausedInDebuggerOverlay();

    void hideRedboxDialog();

    void isPackagerRunning(PackagerStatusCallback callback);

    void onNewReactContextCreated(ReactContext reactContext);

    void onReactInstanceDestroyed(ReactContext reactContext);

    void openDebugger(String panel);

    Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> errorInfo);

    void registerErrorCustomizer(ErrorCustomizer errorCustomizer);

    void reloadJSFromServer(String bundleURL, BundleLoadCallback callback);

    void reloadSettings();

    void setAdditionalOptionForPackager(String name, String value);

    void setDevSupportEnabled(boolean z10);

    void setFpsDebugEnabled(boolean isFpsDebugEnabled);

    void setHotModuleReplacementEnabled(boolean isHotModuleReplacementEnabled);

    void setPackagerLocationCustomizer(PackagerLocationCustomizer packagerLocationCustomizer);

    void showDevOptionsDialog();

    void showNewJSError(String message, ReadableArray details, int errorCookie);

    void showNewJavaError(String message, Throwable e10);

    void showPausedInDebuggerOverlay(String message, PausedInDebuggerOverlayCommandListener listener);

    void startInspector();

    void stopInspector();

    void toggleElementInspector();

    default void setBundleFilePath(String str) {
    }

    default void setDevMenuEnabled(boolean z10) {
    }

    default void setKeyboardShortcutsEnabled(boolean z10) {
    }

    default void setShakeGestureEnabled(boolean z10) {
    }
}
