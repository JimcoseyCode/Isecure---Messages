.class public final Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;
.super Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tH\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016\u00a2\u0006\u0004\u0008 \u0010!J\u0019\u0010#\u001a\u00020\u000f2\u0008\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0016\u00a2\u0006\u0004\u0008#\u0010\u001cJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008%\u0010\u0011R\u0014\u0010\'\u001a\u00020&8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;",
        "Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "mReactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "getName",
        "()Ljava/lang/String;",
        "",
        "",
        "getTypedExportedConstants",
        "()Ljava/util/Map;",
        "",
        "mode",
        "Li7/B;",
        "setInputMode",
        "(D)V",
        "setDefaultMode",
        "()V",
        "preload",
        "",
        "keepFocus",
        "animated",
        "dismiss",
        "(ZZ)V",
        "direction",
        "setFocusTo",
        "(Ljava/lang/String;)V",
        "viewTag",
        "Lcom/facebook/react/bridge/Promise;",
        "promise",
        "viewPositionInWindow",
        "(DLcom/facebook/react/bridge/Promise;)V",
        "eventName",
        "addListener",
        "count",
        "removeListeners",
        "Ly6/g;",
        "module",
        "Ly6/g;",
        "react-native-keyboard-controller_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final module:Ly6/g;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "mReactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/reactnativekeyboardcontroller/NativeKeyboardControllerSpec;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ly6/g;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ly6/g;-><init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public addListener(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public dismiss(ZZ)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Ly6/g;->g(ZZ)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "KeyboardController"

    .line 2
    .line 3
    return-object v0
.end method

.method protected getTypedExportedConstants()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly6/g;->l()Ljava/util/Map;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public preload()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly6/g;->m()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public removeListeners(D)V
    .locals 0

    .line 1
    return-void
.end method

.method public setDefaultMode()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly6/g;->n()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setFocusTo(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "direction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ly6/g;->o(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public setInputMode(D)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 2
    .line 3
    double-to-int p1, p1

    .line 4
    invoke-virtual {v0, p1}, Ly6/g;->q(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public viewPositionInWindow(DLcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/reactnativekeyboardcontroller/KeyboardControllerModule;->module:Ly6/g;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Ly6/g;->t(DLcom/facebook/react/bridge/Promise;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
