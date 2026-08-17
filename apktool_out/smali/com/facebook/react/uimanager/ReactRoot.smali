.class public interface abstract Lcom/facebook/react/uimanager/ReactRoot;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/ReactRoot$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u0000 !2\u00020\u0001:\u0001!J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u0013\u0010\u000fJ\u000f\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u0017\u0010\nJ\u000f\u0010\u0018\u001a\u00020\u0008H&\u00a2\u0006\u0004\u0008\u0018\u0010\nJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H&\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\'\u00a2\u0006\u0004\u0008\u001d\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\u001eH&\u00a2\u0006\u0004\u0008\u001f\u0010 \u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\"\u00c0\u0006\u0001"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/ReactRoot;",
        "",
        "Landroid/os/Bundle;",
        "getAppProperties",
        "()Landroid/os/Bundle;",
        "",
        "getJSModuleName",
        "()Ljava/lang/String;",
        "",
        "getUIManagerType",
        "()I",
        "getRootViewTag",
        "rootViewTag",
        "Li7/B;",
        "setRootViewTag",
        "(I)V",
        "runApplication",
        "()V",
        "stage",
        "onStage",
        "Landroid/view/ViewGroup;",
        "getRootViewGroup",
        "()Landroid/view/ViewGroup;",
        "getWidthMeasureSpec",
        "getHeightMeasureSpec",
        "",
        "shouldLogContentAppeared",
        "setShouldLogContentAppeared",
        "(Z)V",
        "getSurfaceID",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "getState",
        "()Ljava/util/concurrent/atomic/AtomicInteger;",
        "Companion",
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


# static fields
.field public static final Companion:Lcom/facebook/react/uimanager/ReactRoot$Companion;

.field public static final STATE_STARTED:I = 0x1

.field public static final STATE_STOPPED:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactRoot$Companion;->$$INSTANCE:Lcom/facebook/react/uimanager/ReactRoot$Companion;

    .line 2
    .line 3
    sput-object v0, Lcom/facebook/react/uimanager/ReactRoot;->Companion:Lcom/facebook/react/uimanager/ReactRoot$Companion;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract getAppProperties()Landroid/os/Bundle;
.end method

.method public abstract getHeightMeasureSpec()I
.end method

.method public abstract getJSModuleName()Ljava/lang/String;
.end method

.method public abstract getRootViewGroup()Landroid/view/ViewGroup;
.end method

.method public abstract getRootViewTag()I
.end method

.method public abstract getState()Ljava/util/concurrent/atomic/AtomicInteger;
.end method

.method public abstract getSurfaceID()Ljava/lang/String;
.end method

.method public abstract getUIManagerType()I
.end method

.method public abstract getWidthMeasureSpec()I
.end method

.method public abstract onStage(I)V
.end method

.method public abstract runApplication()V
.end method

.method public abstract setRootViewTag(I)V
.end method

.method public abstract setShouldLogContentAppeared(Z)V
.end method
