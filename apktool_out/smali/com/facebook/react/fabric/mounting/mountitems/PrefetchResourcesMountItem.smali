.class public final Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/fabric/mounting/mountitems/MountItem;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;",
        "Lcom/facebook/react/fabric/mounting/mountitems/MountItem;",
        "",
        "surfaceId",
        "",
        "componentName",
        "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
        "params",
        "<init>",
        "(ILjava/lang/String;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V",
        "Lcom/facebook/react/fabric/mounting/MountingManager;",
        "mountingManager",
        "Li7/B;",
        "execute",
        "(Lcom/facebook/react/fabric/mounting/MountingManager;)V",
        "getSurfaceId",
        "()I",
        "toString",
        "()Ljava/lang/String;",
        "I",
        "Ljava/lang/String;",
        "Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;",
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


# instance fields
.field private final componentName:Ljava/lang/String;

.field private final params:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

.field private final surfaceId:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;)V
    .locals 1

    .line 1
    const-string v0, "componentName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "params"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->surfaceId:I

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->componentName:Ljava/lang/String;

    .line 17
    .line 18
    iput-object p3, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->params:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public execute(Lcom/facebook/react/fabric/mounting/MountingManager;)V
    .locals 3

    .line 1
    const-string v0, "mountingManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->surfaceId:I

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lcom/facebook/react/fabric/mounting/MountingManager;->getSurfaceManager(I)Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->surfaceId:I

    .line 15
    .line 16
    iget-object v1, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->componentName:Ljava/lang/String;

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->params:Lcom/facebook/react/common/mapbuffer/ReadableMapBuffer;

    .line 19
    .line 20
    invoke-virtual {p1, v0, v1, v2}, Lcom/facebook/react/fabric/mounting/SurfaceMountingManager;->experimental_prefetchResources(ILjava/lang/String;Lcom/facebook/react/common/mapbuffer/MapBuffer;)V

    .line 21
    .line 22
    .line 23
    :cond_0
    return-void
.end method

.method public getSurfaceId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/fabric/mounting/mountitems/PrefetchResourcesMountItem;->surfaceId:I

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "PrefetchResourcesMountItem"

    .line 2
    .line 3
    return-object v0
.end method
