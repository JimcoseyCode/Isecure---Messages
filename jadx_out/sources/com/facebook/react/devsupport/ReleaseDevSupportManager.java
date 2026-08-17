package com.facebook.react.devsupport;

import android.app.Activity;
import android.util.Pair;
import android.view.View;
import com.facebook.react.bridge.DefaultJSExceptionHandler;
import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.SurfaceDelegate;
import com.facebook.react.devsupport.interfaces.BundleLoadCallback;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.ErrorType;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.RedBoxHandler;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0014\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010\u0003J\u0017\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020!H\u0016¢\u0006\u0004\b&\u0010$J\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\u0003J\u0017\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010-\u001a\u00020!H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\bH\u0016¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\bH\u0016¢\u0006\u0004\b0\u0010\u0003J\u001f\u00104\u001a\u00020\b2\u0006\u00101\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\b2\u0006\u00103\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J!\u0010<\u001a\u0004\u0018\u00010:2\u0006\u00109\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\b2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ;\u0010F\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0B2\u0018\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0C0BH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\b2\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u001b\u0010N\u001a\u00020\b2\n\u0010\u0007\u001a\u00060Lj\u0002`MH\u0016¢\u0006\u0004\bN\u0010OJ\u0019\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010P\u001a\u00020\u0004H\u0016¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u00020\b2\b\u0010T\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010Y\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\bH\u0016¢\u0006\u0004\b[\u0010\u0003J\u001f\u0010^\u001a\u00020\b2\u0006\u0010\\\u001a\u00020\u00042\u0006\u0010]\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u001a\u0010c\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR$\u0010i\u001a\u00020!2\u0006\u0010]\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bg\u0010.\"\u0004\bh\u0010$R$\u0010l\u001a\u00020!2\u0006\u0010]\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bj\u0010.\"\u0004\bk\u0010$R$\u0010o\u001a\u00020!2\u0006\u0010]\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bm\u0010.\"\u0004\bn\u0010$R$\u0010r\u001a\u00020!2\u0006\u0010]\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bp\u0010.\"\u0004\bq\u0010$R\u0016\u0010v\u001a\u0004\u0018\u00010s8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0016\u0010z\u001a\u0004\u0018\u00010w8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0016\u0010}\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0016\u0010\u007f\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010|R\u0018\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0001\u0010|R\u0018\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010|R\u001f\u0010\u0086\u0001\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001a\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u0004\u0018\u00010(8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001¨\u0006\u0092\u0001"}, d2 = {"Lcom/facebook/react/devsupport/ReleaseDevSupportManager;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "message", PointerEventHelper.POINTER_TYPE_UNKNOWN, "e", "Li7/B;", "showNewJavaError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "optionName", "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;", "optionHandler", "addCustomDevOption", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V", "Lcom/facebook/react/bridge/ReadableArray;", "details", PointerEventHelper.POINTER_TYPE_UNKNOWN, "errorCookie", "showNewJSError", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V", "appKey", "Landroid/view/View;", "createRootView", "(Ljava/lang/String;)Landroid/view/View;", "rootView", "destroyRootView", "(Landroid/view/View;)V", "hideRedboxDialog", "showDevOptionsDialog", "startInspector", "stopInspector", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isHotModuleReplacementEnabled", "setHotModuleReplacementEnabled", "(Z)V", "isFpsDebugEnabled", "setFpsDebugEnabled", "toggleElementInspector", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "onNewReactContextCreated", "(Lcom/facebook/react/bridge/ReactContext;)V", "onReactInstanceDestroyed", "hasUpToDateJSBundleInCache", "()Z", "reloadSettings", "handleReloadJS", "bundleURL", "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;", "callback", "reloadJSFromServer", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "isPackagerRunning", "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "resourceURL", "Ljava/io/File;", "outputFile", "downloadBundleResourceFromUrlSync", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;", "errorCustomizer", "registerErrorCustomizer", "(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V", "Landroid/util/Pair;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/devsupport/interfaces/StackFrame;", "errorInfo", "processErrorCustomizers", "(Landroid/util/Pair;)Landroid/util/Pair;", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;", "packagerLocationCustomizer", "setPackagerLocationCustomizer", "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "handleException", "(Ljava/lang/Exception;)V", "moduleName", "Lcom/facebook/react/common/SurfaceDelegate;", "createSurfaceDelegate", "(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;", "panel", "openDebugger", "(Ljava/lang/String;)V", "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;", "listener", "showPausedInDebuggerOverlay", "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V", "hidePausedInDebuggerOverlay", "name", "value", "setAdditionalOptionForPackager", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/bridge/JSExceptionHandler;", "defaultJSExceptionHandler", "Lcom/facebook/react/bridge/JSExceptionHandler;", "lastErrorCookie", "I", "getLastErrorCookie", "()I", "getDevSupportEnabled", "setDevSupportEnabled", "devSupportEnabled", "getDevMenuEnabled", "setDevMenuEnabled", "devMenuEnabled", "getShakeGestureEnabled", "setShakeGestureEnabled", "shakeGestureEnabled", "getKeyboardShortcutsEnabled", "setKeyboardShortcutsEnabled", "keyboardShortcutsEnabled", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "getDevSettings", "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "devSettings", "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "getRedBoxHandler", "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;", "redBoxHandler", "getSourceMapUrl", "()Ljava/lang/String;", "sourceMapUrl", "getSourceUrl", "sourceUrl", "getDownloadedJSBundleFile", "downloadedJSBundleFile", "getLastErrorTitle", "lastErrorTitle", "getLastErrorStack", "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;", "lastErrorStack", "Lcom/facebook/react/devsupport/interfaces/ErrorType;", "getLastErrorType", "()Lcom/facebook/react/devsupport/interfaces/ErrorType;", "lastErrorType", "Landroid/app/Activity;", "getCurrentActivity", "()Landroid/app/Activity;", "currentActivity", "getCurrentReactContext", "()Lcom/facebook/react/bridge/ReactContext;", "currentReactContext", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ReleaseDevSupportManager implements DevSupportManager {
    private final JSExceptionHandler defaultJSExceptionHandler = new DefaultJSExceptionHandler();
    private final int lastErrorCookie;

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void addCustomDevOption(String optionName, DevOptionHandler optionHandler) {
        AbstractC2855l.g(optionName, "optionName");
        AbstractC2855l.g(optionHandler, "optionHandler");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public View createRootView(String appKey) {
        AbstractC2855l.g(appKey, "appKey");
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public SurfaceDelegate createSurfaceDelegate(String moduleName) {
        AbstractC2855l.g(moduleName, "moduleName");
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public File downloadBundleResourceFromUrlSync(String resourceURL, File outputFile) {
        AbstractC2855l.g(resourceURL, "resourceURL");
        AbstractC2855l.g(outputFile, "outputFile");
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Activity getCurrentActivity() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public ReactContext getCurrentReactContext() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getDevMenuEnabled() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public DeveloperSettings getDevSettings() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    /* JADX INFO: renamed from: getDevSupportEnabled */
    public boolean getIsDevSupportEnabled() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getDownloadedJSBundleFile() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getKeyboardShortcutsEnabled() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public int getLastErrorCookie() {
        return this.lastErrorCookie;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public StackFrame[] getLastErrorStack() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getLastErrorTitle() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public ErrorType getLastErrorType() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public RedBoxHandler getRedBoxHandler() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean getShakeGestureEnabled() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceMapUrl() {
        return null;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public String getSourceUrl() {
        return null;
    }

    @Override // com.facebook.react.bridge.JSExceptionHandler
    public void handleException(Exception e10) {
        AbstractC2855l.g(e10, "e");
        this.defaultJSExceptionHandler.handleException(e10);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public boolean hasUpToDateJSBundleInCache() {
        return false;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void isPackagerRunning(PackagerStatusCallback callback) {
        AbstractC2855l.g(callback, "callback");
        callback.onPackagerStatusFetched(false);
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onNewReactContextCreated(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void onReactInstanceDestroyed(ReactContext reactContext) {
        AbstractC2855l.g(reactContext, "reactContext");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public Pair<String, StackFrame[]> processErrorCustomizers(Pair<String, StackFrame[]> errorInfo) {
        AbstractC2855l.g(errorInfo, "errorInfo");
        return errorInfo;
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
        AbstractC2855l.g(errorCustomizer, "errorCustomizer");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadJSFromServer(String bundleURL, BundleLoadCallback callback) {
        AbstractC2855l.g(bundleURL, "bundleURL");
        AbstractC2855l.g(callback, "callback");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setAdditionalOptionForPackager(String name, String value) {
        AbstractC2855l.g(name, "name");
        AbstractC2855l.g(value, "value");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setPackagerLocationCustomizer(DevSupportManager.PackagerLocationCustomizer packagerLocationCustomizer) {
        AbstractC2855l.g(packagerLocationCustomizer, "packagerLocationCustomizer");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJavaError(String message, Throwable e10) {
        AbstractC2855l.g(e10, "e");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showPausedInDebuggerOverlay(String message, DevSupportManager.PausedInDebuggerOverlayCommandListener listener) {
        AbstractC2855l.g(message, "message");
        AbstractC2855l.g(listener, "listener");
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void handleReloadJS() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hidePausedInDebuggerOverlay() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void hideRedboxDialog() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void reloadSettings() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showDevOptionsDialog() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void startInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void stopInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void toggleElementInspector() {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void destroyRootView(View rootView) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void openDebugger(String panel) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevMenuEnabled(boolean z10) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setDevSupportEnabled(boolean z10) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setFpsDebugEnabled(boolean isFpsDebugEnabled) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setHotModuleReplacementEnabled(boolean isHotModuleReplacementEnabled) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setKeyboardShortcutsEnabled(boolean z10) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void setShakeGestureEnabled(boolean z10) {
    }

    @Override // com.facebook.react.devsupport.interfaces.DevSupportManager
    public void showNewJSError(String message, ReadableArray details, int errorCookie) {
    }
}
