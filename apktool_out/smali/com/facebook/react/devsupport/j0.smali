.class public final synthetic Lcom/facebook/react/devsupport/j0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/facebook/react/devsupport/j0;->g:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/devsupport/j0;->g:I

    .line 2
    .line 3
    invoke-static {v0, p1, p2}, Lcom/facebook/react/devsupport/RedBoxDialogSurfaceDelegate$show$2;->a(ILandroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
