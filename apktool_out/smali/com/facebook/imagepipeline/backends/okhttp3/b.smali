.class public Lcom/facebook/imagepipeline/backends/okhttp3/b;
.super Lcom/facebook/imagepipeline/producers/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/backends/okhttp3/b$a;,
        Lcom/facebook/imagepipeline/backends/okhttp3/b$b;
    }
.end annotation


# static fields
.field private static final Companion:Lcom/facebook/imagepipeline/backends/okhttp3/b$a;

.field private static final FETCH_TIME:Ljava/lang/String; = "fetch_time"

.field private static final IMAGE_SIZE:Ljava/lang/String; = "image_size"

.field private static final QUEUE_TIME:Ljava/lang/String; = "queue_time"

.field private static final TOTAL_TIME:Ljava/lang/String; = "total_time"


# instance fields
.field private final cacheControl:Le9/d;

.field private final callFactory:Le9/e$a;

.field private final cancellationExecutor:Ljava/util/concurrent/Executor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/backends/okhttp3/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/backends/okhttp3/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->Companion:Lcom/facebook/imagepipeline/backends/okhttp3/b$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Le9/e$a;Ljava/util/concurrent/Executor;Z)V
    .locals 1

    const-string v0, "callFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cancellationExecutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lcom/facebook/imagepipeline/producers/d;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->callFactory:Le9/e$a;

    .line 4
    iput-object p2, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->cancellationExecutor:Ljava/util/concurrent/Executor;

    if-eqz p3, :cond_0

    .line 5
    new-instance p1, Le9/d$a;

    invoke-direct {p1}, Le9/d$a;-><init>()V

    invoke-virtual {p1}, Le9/d$a;->e()Le9/d$a;

    move-result-object p1

    invoke-virtual {p1}, Le9/d$a;->a()Le9/d;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->cacheControl:Le9/d;

    return-void
.end method

.method public synthetic constructor <init>(Le9/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x1

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/backends/okhttp3/b;-><init>(Le9/e$a;Ljava/util/concurrent/Executor;Z)V

    return-void
.end method

.method public constructor <init>(Le9/z;)V
    .locals 7

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-virtual {p1}, Le9/z;->r()Le9/p;

    move-result-object v0

    invoke-virtual {v0}, Le9/p;->c()Ljava/util/concurrent/ExecutorService;

    move-result-object v3

    const-string v0, "executorService(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/backends/okhttp3/b;-><init>(Le9/e$a;Ljava/util/concurrent/Executor;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method private final a(Le9/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-interface {p1}, Le9/e;->s()Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-interface {p3}, Lcom/facebook/imagepipeline/producers/X$a;->a()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-interface {p3, p2}, Lcom/facebook/imagepipeline/producers/X$a;->onFailure(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic access$getCancellationExecutor$p(Lcom/facebook/imagepipeline/backends/okhttp3/b;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->cancellationExecutor:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$handleException(Lcom/facebook/imagepipeline/backends/okhttp3/b;Le9/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->a(Le9/e;Ljava/lang/Exception;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$makeExceptionFromResponse(Lcom/facebook/imagepipeline/backends/okhttp3/b;Ljava/lang/String;Le9/D;)Ljava/io/IOException;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->b(Ljava/lang/String;Le9/D;)Ljava/io/IOException;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b(Ljava/lang/String;Le9/D;)Ljava/io/IOException;
    .locals 2

    .line 1
    new-instance v0, Ljava/io/IOException;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/imagepipeline/backends/okhttp3/d;->i:Lcom/facebook/imagepipeline/backends/okhttp3/d$a;

    .line 4
    .line 5
    invoke-virtual {v1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/d$a;->a(Le9/D;)Lcom/facebook/imagepipeline/backends/okhttp3/d;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-direct {v0, p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public createFetchState(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/backends/okhttp3/b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/producers/n;",
            "Lcom/facebook/imagepipeline/producers/e0;",
            ")",
            "Lcom/facebook/imagepipeline/backends/okhttp3/b$b;"
        }
    .end annotation

    const-string v0, "consumer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v0, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;

    invoke-direct {v0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    return-object v0
.end method

.method public bridge synthetic createFetchState(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/producers/C;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->createFetchState(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)Lcom/facebook/imagepipeline/backends/okhttp3/b$b;

    move-result-object p1

    return-object p1
.end method

.method public fetch(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 3

    const-string v0, "fetchState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->f:J

    .line 3
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->g()Landroid/net/Uri;

    move-result-object v0

    const-string v1, "getUri(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    :try_start_0
    new-instance v1, Le9/B$a;

    invoke-direct {v1}, Le9/B$a;-><init>()V

    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Le9/B$a;->m(Ljava/lang/String;)Le9/B$a;

    move-result-object v0

    invoke-virtual {v0}, Le9/B$a;->d()Le9/B$a;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->cacheControl:Le9/d;

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Le9/B$a;->c(Le9/d;)Le9/B$a;

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    .line 6
    :cond_0
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    move-result-object v1

    invoke-interface {v1}, Lcom/facebook/imagepipeline/producers/e0;->e()Lcom/facebook/imagepipeline/request/b;

    move-result-object v1

    invoke-virtual {v1}, Lcom/facebook/imagepipeline/request/b;->getBytesRange()LX2/b;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 7
    const-string v2, "Range"

    invoke-virtual {v1}, LX2/b;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Le9/B$a;->a(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 8
    :cond_1
    invoke-virtual {v0}, Le9/B$a;->b()Le9/B;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->fetchWithRequest(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/producers/X$a;Le9/B;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    .line 9
    :goto_1
    invoke-interface {p2, p1}, Lcom/facebook/imagepipeline/producers/X$a;->onFailure(Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic fetch(Lcom/facebook/imagepipeline/producers/C;Lcom/facebook/imagepipeline/producers/X$a;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->fetch(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/producers/X$a;)V

    return-void
.end method

.method protected fetchWithRequest(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/producers/X$a;Le9/B;)V
    .locals 2

    .line 1
    const-string v0, "fetchState"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "request"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/imagepipeline/backends/okhttp3/b;->callFactory:Le9/e$a;

    .line 17
    .line 18
    invoke-interface {v0, p3}, Le9/e$a;->a(Le9/B;)Le9/e;

    .line 19
    .line 20
    .line 21
    move-result-object p3

    .line 22
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/producers/C;->b()Lcom/facebook/imagepipeline/producers/e0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    new-instance v1, Lcom/facebook/imagepipeline/backends/okhttp3/b$c;

    .line 27
    .line 28
    invoke-direct {v1, p3, p0}, Lcom/facebook/imagepipeline/backends/okhttp3/b$c;-><init>(Le9/e;Lcom/facebook/imagepipeline/backends/okhttp3/b;)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/facebook/imagepipeline/producers/e0;->k(Lcom/facebook/imagepipeline/producers/f0;)V

    .line 32
    .line 33
    .line 34
    new-instance v0, Lcom/facebook/imagepipeline/backends/okhttp3/b$d;

    .line 35
    .line 36
    invoke-direct {v0, p1, p0, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b$d;-><init>(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;Lcom/facebook/imagepipeline/backends/okhttp3/b;Lcom/facebook/imagepipeline/producers/X$a;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p3, v0}, Le9/e;->t0(Le9/f;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public getExtraMap(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;I)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/imagepipeline/backends/okhttp3/b$b;",
            "I)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-string v0, "fetchState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-wide v0, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->g:J

    iget-wide v2, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->f:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0

    const-string v1, "queue_time"

    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    .line 3
    iget-wide v1, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->h:J

    iget-wide v3, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->g:J

    sub-long/2addr v1, v3

    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v1

    const-string v2, "fetch_time"

    invoke-static {v2, v1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    .line 4
    iget-wide v2, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->h:J

    iget-wide v4, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->f:J

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    const-string v2, "total_time"

    invoke-static {v2, p1}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    .line 5
    const-string v2, "image_size"

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-static {v2, p2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p2

    filled-new-array {v0, v1, p1, p2}, [Lkotlin/Pair;

    move-result-object p1

    .line 6
    invoke-static {p1}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic getExtraMap(Lcom/facebook/imagepipeline/producers/C;I)Ljava/util/Map;
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->getExtraMap(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;I)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public onFetchCompletion(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;I)V
    .locals 2

    const-string p2, "fetchState"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;->h:J

    return-void
.end method

.method public bridge synthetic onFetchCompletion(Lcom/facebook/imagepipeline/producers/C;I)V
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/imagepipeline/backends/okhttp3/b$b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/imagepipeline/backends/okhttp3/b;->onFetchCompletion(Lcom/facebook/imagepipeline/backends/okhttp3/b$b;I)V

    return-void
.end method
