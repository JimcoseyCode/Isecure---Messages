.class final LX5/e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX5/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX5/e$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;

.field private final b:LX5/e$c;


# direct methods
.method private constructor <init>(LX5/e$c;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LX5/e;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 10
    .line 11
    iput-object p1, p0, LX5/e;->b:LX5/e$c;

    .line 12
    .line 13
    return-void
.end method

.method static b()LX5/e;
    .locals 2

    .line 1
    new-instance v0, LX5/e;

    .line 2
    .line 3
    new-instance v1, LX5/e$b;

    .line 4
    .line 5
    invoke-direct {v1}, LX5/e$b;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, LX5/e;-><init>(LX5/e$c;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method static c()LX5/e;
    .locals 2

    .line 1
    new-instance v0, LX5/e;

    .line 2
    .line 3
    new-instance v1, LX5/e$a;

    .line 4
    .line 5
    invoke-direct {v1}, LX5/e$a;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, v1}, LX5/e;-><init>(LX5/e$c;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public a(LT5/g;)V
    .locals 2

    .line 1
    iget-object v0, p0, LX5/e;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 2
    .line 3
    iget-object v1, p0, LX5/e;->b:LX5/e$c;

    .line 4
    .line 5
    invoke-interface {v1, p1}, LX5/e$c;->a(LT5/g;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method d()LX5/e$c;
    .locals 1

    .line 1
    iget-object v0, p0, LX5/e;->b:LX5/e$c;

    .line 2
    .line 3
    return-object v0
.end method

.method e(Ljava/lang/Object;)LT5/g;
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LX5/e;->a:Ljava/util/concurrent/ConcurrentMap;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, LT5/g;

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    return-object p1
.end method
