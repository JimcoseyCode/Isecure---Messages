.class LJ1/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ1/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJ1/m;->b(Landroid/content/Context;Lcom/bumptech/glide/b;Landroidx/lifecycle/k;Landroidx/fragment/app/FragmentManager;Z)Lcom/bumptech/glide/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Landroidx/lifecycle/k;

.field final synthetic h:LJ1/m;


# direct methods
.method constructor <init>(LJ1/m;Landroidx/lifecycle/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LJ1/m$a;->h:LJ1/m;

    .line 2
    .line 3
    iput-object p2, p0, LJ1/m$a;->g:Landroidx/lifecycle/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onDestroy()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ1/m$a;->h:LJ1/m;

    .line 2
    .line 3
    iget-object v0, v0, LJ1/m;->a:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v1, p0, LJ1/m$a;->g:Landroidx/lifecycle/k;

    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public onStart()V
    .locals 0

    .line 1
    return-void
.end method

.method public onStop()V
    .locals 0

    .line 1
    return-void
.end method
