.class public interface abstract Lcom/facebook/react/uimanager/events/EventDispatcher;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\u0008\u00030\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000eH&\u00a2\u0006\u0004\u0008\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0004H\'\u00a2\u0006\u0004\u0008\u0012\u0010\u0008\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0013\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "",
        "Lcom/facebook/react/uimanager/events/Event;",
        "event",
        "Li7/B;",
        "dispatchEvent",
        "(Lcom/facebook/react/uimanager/events/Event;)V",
        "dispatchAllEvents",
        "()V",
        "Lcom/facebook/react/uimanager/events/EventDispatcherListener;",
        "listener",
        "addListener",
        "(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V",
        "removeListener",
        "Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;",
        "addBatchEventDispatchedListener",
        "(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V",
        "removeBatchEventDispatchedListener",
        "onCatalystInstanceDestroyed",
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
.method public abstract addBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
.end method

.method public abstract addListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
.end method

.method public abstract dispatchAllEvents()V
.end method

.method public abstract dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/events/Event<",
            "*>;)V"
        }
    .end annotation
.end method

.method public abstract onCatalystInstanceDestroyed()V
.end method

.method public abstract removeBatchEventDispatchedListener(Lcom/facebook/react/uimanager/events/BatchEventDispatchedListener;)V
.end method

.method public abstract removeListener(Lcom/facebook/react/uimanager/events/EventDispatcherListener;)V
.end method
