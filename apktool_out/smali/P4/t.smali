.class final LP4/t;
.super LP4/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LP4/N;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LP4/a;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP4/N;

    .line 5
    .line 6
    invoke-direct {v0}, LP4/N;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LP4/t;->a:LP4/N;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LP4/t;->a:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0}, LP4/N;->o()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final b(LP4/i;)LP4/a;
    .locals 2

    .line 1
    new-instance v0, LP4/p;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LP4/p;-><init>(LP4/t;LP4/i;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LP4/t;->a:LP4/N;

    .line 7
    .line 8
    sget-object v1, LP4/n;->a:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-virtual {p1, v1, v0}, LP4/N;->h(Ljava/util/concurrent/Executor;LP4/h;)LP4/l;

    .line 11
    .line 12
    .line 13
    return-object p0
.end method

.method public final c()V
    .locals 2

    .line 1
    iget-object v0, p0, LP4/t;->a:LP4/N;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LP4/N;->w(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    return-void
.end method
