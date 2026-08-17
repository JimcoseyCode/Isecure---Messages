.class public interface abstract Lcom/facebook/react/uimanager/StateWrapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\t8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000f\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0011\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/StateWrapper;",
        "",
        "Lcom/facebook/react/bridge/WritableMap;",
        "map",
        "Li7/B;",
        "updateState",
        "(Lcom/facebook/react/bridge/WritableMap;)V",
        "destroyState",
        "()V",
        "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
        "getStateDataMapBuffer",
        "()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
        "stateDataMapBuffer",
        "Lcom/facebook/react/bridge/ReadableNativeMap;",
        "getStateData",
        "()Lcom/facebook/react/bridge/ReadableNativeMap;",
        "stateData",
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
.method public abstract destroyState()V
.end method

.method public abstract getStateData()Lcom/facebook/react/bridge/ReadableNativeMap;
.end method

.method public abstract getStateDataMapBuffer()Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;
.end method

.method public abstract updateState(Lcom/facebook/react/bridge/WritableMap;)V
.end method
