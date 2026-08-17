.class public interface abstract Lcom/facebook/react/modules/appregistry/AppRegistry;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/JavaScriptModule;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\t\u0008f\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\'\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0012\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/modules/appregistry/AppRegistry;",
        "Lcom/facebook/react/bridge/JavaScriptModule;",
        "",
        "appKey",
        "Lcom/facebook/react/bridge/WritableMap;",
        "appParameters",
        "Li7/B;",
        "runApplication",
        "(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
        "",
        "rootNodeTag",
        "unmountApplicationComponentAtRootTag",
        "(I)V",
        "taskId",
        "taskKey",
        "data",
        "startHeadlessTask",
        "(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V",
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
.method public abstract runApplication(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract startHeadlessTask(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
.end method

.method public abstract unmountApplicationComponentAtRootTag(I)V
.end method
