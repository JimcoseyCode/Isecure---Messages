.class final LP4/H;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/h;
.implements LP4/g;
.implements LP4/e;
.implements LP4/I;


# instance fields
.field private final a:Ljava/util/concurrent/Executor;

.field private final b:LP4/k;

.field private final c:LP4/N;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;LP4/k;LP4/N;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LP4/H;->a:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, LP4/H;->b:LP4/k;

    .line 7
    .line 8
    iput-object p3, p0, LP4/H;->c:LP4/N;

    .line 9
    .line 10
    return-void
.end method

.method static bridge synthetic b(LP4/H;)LP4/k;
    .locals 0

    .line 1
    iget-object p0, p0, LP4/H;->b:LP4/k;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a(LP4/l;)V
    .locals 1

    .line 1
    new-instance v0, LP4/G;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LP4/G;-><init>(LP4/H;LP4/l;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LP4/H;->a:Ljava/util/concurrent/Executor;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final onCanceled()V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/H;->c:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0}, LP4/N;->u()Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onFailure(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/H;->c:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->s(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/H;->c:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->t(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
