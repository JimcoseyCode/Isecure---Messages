.class final Lr4/u;
.super Lr4/v;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field final synthetic g:Landroid/content/Intent;

.field final synthetic h:Lp4/e;


# direct methods
.method constructor <init>(Landroid/content/Intent;Lp4/e;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/u;->g:Landroid/content/Intent;

    .line 2
    .line 3
    iput-object p2, p0, Lr4/u;->h:Lp4/e;

    .line 4
    .line 5
    invoke-direct {p0}, Lr4/v;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/u;->g:Landroid/content/Intent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lr4/u;->h:Lp4/e;

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-interface {v1, v0, v2}, Lp4/e;->startActivityForResult(Landroid/content/Intent;I)V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method
