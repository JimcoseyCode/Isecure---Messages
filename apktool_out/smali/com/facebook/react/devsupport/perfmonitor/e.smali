.class public final synthetic Lcom/facebook/react/devsupport/perfmonitor/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;


# instance fields
.field public final synthetic g:F

.field public final synthetic h:Landroid/app/Dialog;


# direct methods
.method public synthetic constructor <init>(FLandroid/app/Dialog;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/devsupport/perfmonitor/e;->g:F

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/perfmonitor/e;->h:Landroid/app/Dialog;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 2

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/perfmonitor/e;->g:F

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/perfmonitor/e;->h:Landroid/app/Dialog;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/devsupport/perfmonitor/PerfMonitorOverlayView;->a(FLandroid/app/Dialog;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method
