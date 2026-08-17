.class public final Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/OnLayoutEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ?\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000eR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "viewTag",
        "x",
        "y",
        "width",
        "height",
        "Lcom/facebook/react/uimanager/OnLayoutEvent;",
        "obtain",
        "(IIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;",
        "surfaceId",
        "(IIIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;",
        "LH0/f;",
        "EVENTS_POOL",
        "LH0/f;",
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final obtain(IIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;
    .locals 7

    const/4 v1, -0x1

    move-object v0, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    .line 1
    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;->obtain(IIIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;

    move-result-object p1

    return-object p1
.end method

.method public final obtain(IIIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;
    .locals 9

    .line 2
    invoke-static {}, Lcom/facebook/react/uimanager/OnLayoutEvent;->access$getEVENTS_POOL$cp()LH0/f;

    move-result-object v0

    invoke-virtual {v0}, LH0/f;->acquire()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/uimanager/OnLayoutEvent;

    if-nez v0, :cond_0

    .line 3
    new-instance v0, Lcom/facebook/react/uimanager/OnLayoutEvent;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/OnLayoutEvent;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move v7, p5

    move v8, p6

    move-object v2, v0

    .line 4
    invoke-virtual/range {v2 .. v8}, Lcom/facebook/react/uimanager/OnLayoutEvent;->init(IIIIII)V

    move-object v0, v2

    return-object v0
.end method
