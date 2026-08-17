.class final Landroidx/camera/core/k;
.super Landroidx/camera/core/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/camera/core/j;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method d(LF/F0;)Landroidx/camera/core/o;
    .locals 0

    .line 1
    invoke-interface {p1}, LF/F0;->g()Landroidx/camera/core/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method f()V
    .locals 0

    .line 1
    return-void
.end method

.method l(Landroidx/camera/core/o;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, Landroidx/camera/core/j;->e(Landroidx/camera/core/o;)Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Landroidx/camera/core/k$a;

    .line 6
    .line 7
    invoke-direct {v1, p0, p1}, Landroidx/camera/core/k$a;-><init>(Landroidx/camera/core/k;Landroidx/camera/core/o;)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-static {v0, v1, p1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
