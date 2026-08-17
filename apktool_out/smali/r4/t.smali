.class final Lr4/t;
.super Lr4/v;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field final synthetic g:Landroid/content/Intent;

.field final synthetic h:Landroid/app/Activity;

.field final synthetic i:I


# direct methods
.method constructor <init>(Landroid/content/Intent;Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lr4/t;->g:Landroid/content/Intent;

    .line 2
    .line 3
    iput-object p2, p0, Lr4/t;->h:Landroid/app/Activity;

    .line 4
    .line 5
    iput p3, p0, Lr4/t;->i:I

    .line 6
    .line 7
    invoke-direct {p0}, Lr4/v;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr4/t;->g:Landroid/content/Intent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lr4/t;->h:Landroid/app/Activity;

    .line 6
    .line 7
    iget v2, p0, Lr4/t;->i:I

    .line 8
    .line 9
    invoke-virtual {v1, v0, v2}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method
