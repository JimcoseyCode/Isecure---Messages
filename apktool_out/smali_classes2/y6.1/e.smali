.class public final synthetic Ly6/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic g:Landroid/view/View;

.field public final synthetic h:Z


# direct methods
.method public synthetic constructor <init>(Landroid/view/View;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly6/e;->g:Landroid/view/View;

    .line 5
    .line 6
    iput-boolean p2, p0, Ly6/e;->h:Z

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ly6/e;->g:Landroid/view/View;

    .line 2
    .line 3
    iget-boolean v1, p0, Ly6/e;->h:Z

    .line 4
    .line 5
    check-cast p1, Landroidx/core/view/K0;

    .line 6
    .line 7
    invoke-static {v0, v1, p1}, Ly6/g;->f(Landroid/view/View;ZLandroidx/core/view/K0;)Li7/B;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method
