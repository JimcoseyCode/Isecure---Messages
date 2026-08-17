.class public interface abstract Lcom/facebook/react/bridge/UIManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/PerformanceCounter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J+\u0010\u0008\u001a\u00020\u0007\"\u0008\u0008\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0004\u0008\u0008\u0010\tJE\u0010\u000e\u001a\u00020\u0007\"\n\u0008\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J7\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\'\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ)\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\n2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0004\u0008\u001d\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 H\'\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010%\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\'H&\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\'H&\u00a2\u0006\u0004\u0008+\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008,\u0010-J)\u00100\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\n2\u0008\u0010/\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0004\u00080\u00101J1\u00100\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\n2\u0008\u0010/\u001a\u0004\u0018\u00010\u0005H&\u00a2\u0006\u0004\u00080\u00102J\u0019\u00103\u001a\u0004\u0018\u00010\n2\u0006\u0010.\u001a\u00020\nH\'\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0011H&\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\u0011H&\u00a2\u0006\u0004\u00087\u00106J\u001f\u00108\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&\u00a2\u0006\u0004\u00088\u0010&J\u001f\u00109\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H&\u00a2\u0006\u0004\u00089\u0010&R\u0014\u0010=\u001a\u00020:8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006>\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/bridge/UIManager;",
        "Lcom/facebook/react/bridge/PerformanceCounter;",
        "Landroid/view/View;",
        "T",
        "rootView",
        "Lcom/facebook/react/bridge/WritableMap;",
        "initialProps",
        "",
        "addRootView",
        "(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I",
        "",
        "moduleName",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "startSurface",
        "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I",
        "surfaceId",
        "Li7/B;",
        "stopSurface",
        "(I)V",
        "rootTag",
        "offsetX",
        "offsetY",
        "updateRootLayoutSpecs",
        "(IIIII)V",
        "reactTag",
        "commandId",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "commandArgs",
        "dispatchCommand",
        "(IILcom/facebook/react/bridge/ReadableArray;)V",
        "(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "props",
        "synchronouslyUpdateViewOnUIThread",
        "(ILcom/facebook/react/bridge/ReadableMap;)V",
        "eventType",
        "sendAccessibilityEvent",
        "(II)V",
        "Lcom/facebook/react/bridge/UIManagerListener;",
        "listener",
        "addUIManagerEventListener",
        "(Lcom/facebook/react/bridge/UIManagerListener;)V",
        "removeUIManagerEventListener",
        "resolveView",
        "(I)Landroid/view/View;",
        "eventName",
        "event",
        "receiveEvent",
        "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "resolveCustomDirectEventName",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "initialize",
        "()V",
        "invalidate",
        "markActiveTouchForTag",
        "sweepActiveTouchForTag",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "getEventDispatcher",
        "()Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "eventDispatcher",
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


# virtual methods
.method public abstract addRootView(Landroid/view/View;Lcom/facebook/react/bridge/WritableMap;)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Lcom/facebook/react/bridge/WritableMap;",
            ")I"
        }
    .end annotation
.end method

.method public abstract addUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
.end method

.method public abstract dispatchCommand(IILcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract dispatchCommand(ILjava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
.end method

.method public abstract getEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;
.end method

.method public abstract initialize()V
.end method

.method public abstract invalidate()V
.end method

.method public abstract markActiveTouchForTag(II)V
.end method

.method public abstract receiveEvent(IILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract removeUIManagerEventListener(Lcom/facebook/react/bridge/UIManagerListener;)V
.end method

.method public abstract resolveCustomDirectEventName(Ljava/lang/String;)Ljava/lang/String;
.end method

.method public abstract resolveView(I)Landroid/view/View;
.end method

.method public abstract sendAccessibilityEvent(II)V
.end method

.method public abstract startSurface(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;II)I
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroid/view/View;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/WritableMap;",
            "II)I"
        }
    .end annotation
.end method

.method public abstract stopSurface(I)V
.end method

.method public abstract sweepActiveTouchForTag(II)V
.end method

.method public abstract synchronouslyUpdateViewOnUIThread(ILcom/facebook/react/bridge/ReadableMap;)V
.end method

.method public abstract updateRootLayoutSpecs(IIIII)V
.end method
