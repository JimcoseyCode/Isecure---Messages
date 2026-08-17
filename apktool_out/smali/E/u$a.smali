.class LE/u$a;
.super LF/r;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/u;->s(LE/u$c;)LE/Q$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE/u;


# direct methods
.method constructor <init>(LE/u;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/u$a;->a:LE/u;

    .line 2
    .line 3
    invoke-direct {p0}, LF/r;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic e(LE/u$a;)V
    .locals 0

    .line 1
    iget-object p0, p0, LE/u$a;->a:LE/u;

    .line 2
    .line 3
    iget-object p0, p0, LE/u;->a:LE/S;

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LE/S;->p()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public d(I)V
    .locals 1

    .line 1
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, LE/t;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LE/t;-><init>(LE/u$a;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
