.class final synthetic Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$enable$1$1;
.super Lkotlin/jvm/internal/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->enable()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Lw7/a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;)V
    .locals 7

    .line 1
    const-string v5, "handleRecordingButtonPress()V"

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const-class v3, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    .line 6
    .line 7
    const-string v4, "handleRecordingButtonPress"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    move-object v2, p1

    .line 11
    invoke-direct/range {v0 .. v6}, Lkotlin/jvm/internal/j;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager$enable$1$1;->invoke()V

    sget-object v0, Li7/B;->a:Li7/B;

    return-object v0
.end method

.method public final invoke()V
    .locals 1

    .line 2
    iget-object v0, p0, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;

    invoke-static {v0}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;->access$handleRecordingButtonPress(Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayManager;)V

    return-void
.end method
