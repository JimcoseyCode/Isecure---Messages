.class public final synthetic Ly/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ly/C;

.field public final synthetic h:Landroid/content/Context;

.field public final synthetic i:Ljava/util/concurrent/Executor;

.field public final synthetic j:I

.field public final synthetic k:Landroidx/concurrent/futures/c$a;

.field public final synthetic l:J


# direct methods
.method public synthetic constructor <init>(Ly/C;Landroid/content/Context;Ljava/util/concurrent/Executor;ILandroidx/concurrent/futures/c$a;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly/y;->g:Ly/C;

    .line 5
    .line 6
    iput-object p2, p0, Ly/y;->h:Landroid/content/Context;

    .line 7
    .line 8
    iput-object p3, p0, Ly/y;->i:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    iput p4, p0, Ly/y;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Ly/y;->k:Landroidx/concurrent/futures/c$a;

    .line 13
    .line 14
    iput-wide p6, p0, Ly/y;->l:J

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Ly/y;->g:Ly/C;

    .line 2
    .line 3
    iget-object v1, p0, Ly/y;->h:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, p0, Ly/y;->i:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iget v3, p0, Ly/y;->j:I

    .line 8
    .line 9
    iget-object v4, p0, Ly/y;->k:Landroidx/concurrent/futures/c$a;

    .line 10
    .line 11
    iget-wide v5, p0, Ly/y;->l:J

    .line 12
    .line 13
    invoke-static/range {v0 .. v6}, Ly/C;->a(Ly/C;Landroid/content/Context;Ljava/util/concurrent/Executor;ILandroidx/concurrent/futures/c$a;J)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
