.class public final synthetic Lr/w1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lr/K1;

.field public final synthetic h:Landroidx/concurrent/futures/c$a;

.field public final synthetic i:Ly/J;

.field public final synthetic j:J


# direct methods
.method public synthetic constructor <init>(Lr/K1;Landroidx/concurrent/futures/c$a;Ly/J;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lr/w1;->g:Lr/K1;

    .line 5
    .line 6
    iput-object p2, p0, Lr/w1;->h:Landroidx/concurrent/futures/c$a;

    .line 7
    .line 8
    iput-object p3, p0, Lr/w1;->i:Ly/J;

    .line 9
    .line 10
    iput-wide p4, p0, Lr/w1;->j:J

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lr/w1;->g:Lr/K1;

    .line 2
    .line 3
    iget-object v1, p0, Lr/w1;->h:Landroidx/concurrent/futures/c$a;

    .line 4
    .line 5
    iget-object v2, p0, Lr/w1;->i:Ly/J;

    .line 6
    .line 7
    iget-wide v3, p0, Lr/w1;->j:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v4}, Lr/K1;->o(Lr/K1;Landroidx/concurrent/futures/c$a;Ly/J;J)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
