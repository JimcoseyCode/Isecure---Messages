.class Landroidx/camera/core/l$b;
.super Landroidx/camera/core/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field final j:Ljava/lang/ref/WeakReference;


# direct methods
.method constructor <init>(Landroidx/camera/core/o;Landroidx/camera/core/l;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/e;-><init>(Landroidx/camera/core/o;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Landroidx/camera/core/l$b;->j:Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    new-instance p1, Landroidx/camera/core/n;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Landroidx/camera/core/n;-><init>(Landroidx/camera/core/l$b;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Landroidx/camera/core/e;->d(Landroidx/camera/core/e$a;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public static synthetic k(Landroidx/camera/core/l$b;Landroidx/camera/core/o;)V
    .locals 1

    .line 1
    iget-object p0, p0, Landroidx/camera/core/l$b;->j:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroidx/camera/core/l;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Landroidx/camera/core/l;->v:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance v0, Landroidx/camera/core/m;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Landroidx/camera/core/m;-><init>(Landroidx/camera/core/l;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public static synthetic m(Landroidx/camera/core/l;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/l;->w()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
