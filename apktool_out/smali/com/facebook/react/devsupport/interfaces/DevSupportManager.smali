.class public interface abstract Lcom/facebook/react/devsupport/interfaces/DevSupportManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/JSExceptionHandler;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;,
        Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008f\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001J!\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000c\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00062\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u000fH&\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J+\u0010\u0019\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0017H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008\u001f\u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H&\u00a2\u0006\u0004\u0008$\u0010#J\u000f\u0010&\u001a\u00020%H&\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010(\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008(\u0010\u001cJ\u000f\u0010)\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008)\u0010\u001cJ\u001f\u0010-\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H&\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u00100\u001a\u00020\u00062\u0006\u0010,\u001a\u00020/H&\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u00020\u00062\u0006\u00102\u001a\u00020%H&\u00a2\u0006\u0004\u00083\u00104J\u0017\u00106\u001a\u00020\u00062\u0006\u00105\u001a\u00020%H&\u00a2\u0006\u0004\u00086\u00104J\u000f\u00107\u001a\u00020\u0006H&\u00a2\u0006\u0004\u00087\u0010\u001cJ!\u0010;\u001a\u0004\u0018\u0001092\u0006\u00108\u001a\u00020\u00022\u0006\u0010:\u001a\u000209H&\u00a2\u0006\u0004\u0008;\u0010<J\u0017\u0010?\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=H&\u00a2\u0006\u0004\u0008?\u0010@J;\u0010E\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020C0B0A2\u0018\u0010D\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020C0B0AH&\u00a2\u0006\u0004\u0008E\u0010FJ\u0017\u0010I\u001a\u00020\u00062\u0006\u0010H\u001a\u00020GH&\u00a2\u0006\u0004\u0008I\u0010JJ\u0019\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010K\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008M\u0010NJ\u001b\u0010P\u001a\u00020\u00062\n\u0008\u0002\u0010O\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008P\u0010QJ\u001f\u0010T\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010S\u001a\u00020RH&\u00a2\u0006\u0004\u0008T\u0010UJ\u000f\u0010V\u001a\u00020\u0006H&\u00a2\u0006\u0004\u0008V\u0010\u001cJ\u001f\u0010Y\u001a\u00020\u00062\u0006\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008Y\u0010ZR\u0016\u0010^\u001a\u0004\u0018\u00010[8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\\\u0010]R\u0016\u0010b\u001a\u0004\u0018\u00010_8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008`\u0010aR\u0016\u0010e\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008c\u0010dR\u0016\u0010g\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008f\u0010dR\u0016\u0010i\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008h\u0010dR\u0016\u0010k\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008j\u0010dR\u001c\u0010n\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010B8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008l\u0010mR\u0016\u0010r\u001a\u0004\u0018\u00010o8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010qR\u0014\u0010u\u001a\u00020\u00178&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008s\u0010tR\u0016\u0010y\u001a\u0004\u0018\u00010v8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008w\u0010xR\u0016\u0010|\u001a\u0004\u0018\u00010 8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008z\u0010{R$\u0010\u007f\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e\u00a2\u0006\u000c\u001a\u0004\u0008}\u0010\'\"\u0004\u0008~\u00104R\'\u0010\u0082\u0001\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0080\u0001\u0010\'\"\u0005\u0008\u0081\u0001\u00104R\'\u0010\u0085\u0001\u001a\u00020%2\u0006\u0010X\u001a\u00020%8V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0083\u0001\u0010\'\"\u0005\u0008\u0084\u0001\u00104R+\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00022\u0008\u0010X\u001a\u0004\u0018\u00010\u00028V@VX\u0096\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0086\u0001\u0010d\"\u0005\u0008\u0087\u0001\u0010QR\u001f\u0010\u008b\u0001\u001a\u00020%8&@&X\u00a6\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0089\u0001\u0010\'\"\u0005\u0008\u008a\u0001\u00104\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u008e\u0001\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "Lcom/facebook/react/bridge/JSExceptionHandler;",
        "",
        "message",
        "",
        "e",
        "Li7/B;",
        "showNewJavaError",
        "(Ljava/lang/String;Ljava/lang/Throwable;)V",
        "optionName",
        "Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;",
        "optionHandler",
        "addCustomDevOption",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V",
        "appKey",
        "Landroid/view/View;",
        "createRootView",
        "(Ljava/lang/String;)Landroid/view/View;",
        "rootView",
        "destroyRootView",
        "(Landroid/view/View;)V",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "details",
        "",
        "errorCookie",
        "showNewJSError",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V",
        "hideRedboxDialog",
        "()V",
        "showDevOptionsDialog",
        "startInspector",
        "stopInspector",
        "Lcom/facebook/react/bridge/ReactContext;",
        "reactContext",
        "onNewReactContextCreated",
        "(Lcom/facebook/react/bridge/ReactContext;)V",
        "onReactInstanceDestroyed",
        "",
        "hasUpToDateJSBundleInCache",
        "()Z",
        "reloadSettings",
        "handleReloadJS",
        "bundleURL",
        "Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;",
        "callback",
        "reloadJSFromServer",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V",
        "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;",
        "isPackagerRunning",
        "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V",
        "isHotModuleReplacementEnabled",
        "setHotModuleReplacementEnabled",
        "(Z)V",
        "isFpsDebugEnabled",
        "setFpsDebugEnabled",
        "toggleElementInspector",
        "resourceURL",
        "Ljava/io/File;",
        "outputFile",
        "downloadBundleResourceFromUrlSync",
        "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;",
        "Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;",
        "errorCustomizer",
        "registerErrorCustomizer",
        "(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V",
        "Landroid/util/Pair;",
        "",
        "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "errorInfo",
        "processErrorCustomizers",
        "(Landroid/util/Pair;)Landroid/util/Pair;",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;",
        "packagerLocationCustomizer",
        "setPackagerLocationCustomizer",
        "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V",
        "moduleName",
        "Lcom/facebook/react/common/SurfaceDelegate;",
        "createSurfaceDelegate",
        "(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;",
        "panel",
        "openDebugger",
        "(Ljava/lang/String;)V",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;",
        "listener",
        "showPausedInDebuggerOverlay",
        "(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V",
        "hidePausedInDebuggerOverlay",
        "name",
        "value",
        "setAdditionalOptionForPackager",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;",
        "getDevSettings",
        "()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;",
        "devSettings",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "getRedBoxHandler",
        "()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "redBoxHandler",
        "getSourceMapUrl",
        "()Ljava/lang/String;",
        "sourceMapUrl",
        "getSourceUrl",
        "sourceUrl",
        "getDownloadedJSBundleFile",
        "downloadedJSBundleFile",
        "getLastErrorTitle",
        "lastErrorTitle",
        "getLastErrorStack",
        "()[Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "lastErrorStack",
        "Lcom/facebook/react/devsupport/interfaces/ErrorType;",
        "getLastErrorType",
        "()Lcom/facebook/react/devsupport/interfaces/ErrorType;",
        "lastErrorType",
        "getLastErrorCookie",
        "()I",
        "lastErrorCookie",
        "Landroid/app/Activity;",
        "getCurrentActivity",
        "()Landroid/app/Activity;",
        "currentActivity",
        "getCurrentReactContext",
        "()Lcom/facebook/react/bridge/ReactContext;",
        "currentReactContext",
        "getDevMenuEnabled",
        "setDevMenuEnabled",
        "devMenuEnabled",
        "getShakeGestureEnabled",
        "setShakeGestureEnabled",
        "shakeGestureEnabled",
        "getKeyboardShortcutsEnabled",
        "setKeyboardShortcutsEnabled",
        "keyboardShortcutsEnabled",
        "getBundleFilePath",
        "setBundleFilePath",
        "bundleFilePath",
        "getDevSupportEnabled",
        "setDevSupportEnabled",
        "devSupportEnabled",
        "PackagerLocationCustomizer",
        "PausedInDebuggerOverlayCommandListener",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic openDebugger$default(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Ljava/lang/String;ILjava/lang/Object;)V
    .locals 0

    .line 1
    if-nez p3, :cond_1

    .line 2
    .line 3
    and-int/lit8 p2, p2, 0x1

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    :cond_0
    invoke-interface {p0, p1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->openDebugger(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 13
    .line 14
    const-string p1, "Super calls with default arguments not supported in this target, function: openDebugger"

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method


# virtual methods
.method public abstract addCustomDevOption(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;)V
.end method

.method public abstract createRootView(Ljava/lang/String;)Landroid/view/View;
.end method

.method public abstract createSurfaceDelegate(Ljava/lang/String;)Lcom/facebook/react/common/SurfaceDelegate;
.end method

.method public abstract destroyRootView(Landroid/view/View;)V
.end method

.method public abstract downloadBundleResourceFromUrlSync(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;
.end method

.method public getBundleFilePath()Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract getCurrentActivity()Landroid/app/Activity;
.end method

.method public abstract getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;
.end method

.method public getDevMenuEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public abstract getDevSettings()Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;
.end method

.method public abstract getDevSupportEnabled()Z
.end method

.method public abstract getDownloadedJSBundleFile()Ljava/lang/String;
.end method

.method public getKeyboardShortcutsEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public abstract getLastErrorCookie()I
.end method

.method public abstract getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;
.end method

.method public abstract getLastErrorTitle()Ljava/lang/String;
.end method

.method public abstract getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;
.end method

.method public abstract getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;
.end method

.method public getShakeGestureEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public abstract getSourceMapUrl()Ljava/lang/String;
.end method

.method public abstract getSourceUrl()Ljava/lang/String;
.end method

.method public abstract handleReloadJS()V
.end method

.method public abstract hasUpToDateJSBundleInCache()Z
.end method

.method public abstract hidePausedInDebuggerOverlay()V
.end method

.method public abstract hideRedboxDialog()V
.end method

.method public abstract isPackagerRunning(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V
.end method

.method public abstract onNewReactContextCreated(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract onReactInstanceDestroyed(Lcom/facebook/react/bridge/ReactContext;)V
.end method

.method public abstract openDebugger(Ljava/lang/String;)V
.end method

.method public abstract processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;)",
            "Landroid/util/Pair<",
            "Ljava/lang/String;",
            "[",
            "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
            ">;"
        }
    .end annotation
.end method

.method public abstract registerErrorCustomizer(Lcom/facebook/react/devsupport/interfaces/ErrorCustomizer;)V
.end method

.method public abstract reloadJSFromServer(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/BundleLoadCallback;)V
.end method

.method public abstract reloadSettings()V
.end method

.method public abstract setAdditionalOptionForPackager(Ljava/lang/String;Ljava/lang/String;)V
.end method

.method public setBundleFilePath(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setDevMenuEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract setDevSupportEnabled(Z)V
.end method

.method public abstract setFpsDebugEnabled(Z)V
.end method

.method public abstract setHotModuleReplacementEnabled(Z)V
.end method

.method public setKeyboardShortcutsEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract setPackagerLocationCustomizer(Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PackagerLocationCustomizer;)V
.end method

.method public setShakeGestureEnabled(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public abstract showDevOptionsDialog()V
.end method

.method public abstract showNewJSError(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;I)V
.end method

.method public abstract showNewJavaError(Ljava/lang/String;Ljava/lang/Throwable;)V
.end method

.method public abstract showPausedInDebuggerOverlay(Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/DevSupportManager$PausedInDebuggerOverlayCommandListener;)V
.end method

.method public abstract startInspector()V
.end method

.method public abstract stopInspector()V
.end method

.method public abstract toggleElementInspector()V
.end method
