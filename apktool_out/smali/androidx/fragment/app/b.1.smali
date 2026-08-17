.class public final synthetic Landroidx/fragment/app/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:Landroidx/fragment/app/Q$c;

.field public final synthetic i:Landroidx/fragment/app/i;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/b;->g:Ljava/util/List;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/b;->h:Landroidx/fragment/app/Q$c;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/b;->i:Landroidx/fragment/app/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/b;->g:Ljava/util/List;

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/b;->h:Landroidx/fragment/app/Q$c;

    .line 4
    .line 5
    iget-object v2, p0, Landroidx/fragment/app/b;->i:Landroidx/fragment/app/i;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Landroidx/fragment/app/i;->w(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
