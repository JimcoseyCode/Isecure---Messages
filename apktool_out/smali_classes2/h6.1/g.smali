.class public final Lh6/g;
.super Ll6/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le6/a;


# static fields
.field private static final s:Le6/b;


# instance fields
.field private final n:Z

.field private final o:Le6/b;

.field final p:LI4/M9;

.field private q:I

.field private r:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Le6/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Le6/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Le6/b$a;->a()Le6/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lh6/g;->s:Le6/b;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Le6/b;Lh6/k;Ljava/util/concurrent/Executor;LI4/x9;Lc6/i;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Le6/b;->b()Le6/d;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p3}, Ll6/e;-><init>(Lc6/f;Ljava/util/concurrent/Executor;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lh6/g;->o:Le6/b;

    .line 8
    .line 9
    invoke-static {}, Lh6/b;->f()Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    iput-boolean p2, p0, Lh6/g;->n:Z

    .line 14
    .line 15
    new-instance p3, LI4/Z6;

    .line 16
    .line 17
    invoke-direct {p3}, LI4/Z6;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lh6/b;->c(Le6/b;)LI4/g9;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p3, p1}, LI4/Z6;->i(LI4/g9;)LI4/Z6;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p3}, LI4/Z6;->j()LI4/b7;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    new-instance p3, LI4/N6;

    .line 32
    .line 33
    invoke-direct {p3}, LI4/N6;-><init>()V

    .line 34
    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    sget-object p2, LI4/K6;->j:LI4/K6;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    sget-object p2, LI4/K6;->i:LI4/K6;

    .line 42
    .line 43
    :goto_0
    invoke-virtual {p3, p2}, LI4/N6;->e(LI4/K6;)LI4/N6;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p3, p1}, LI4/N6;->g(LI4/b7;)LI4/N6;

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    invoke-static {p3, p1}, LI4/A9;->f(LI4/N6;I)LI4/m9;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    sget-object p2, LI4/M6;->r:LI4/M6;

    .line 55
    .line 56
    invoke-virtual {p4, p1, p2}, LI4/x9;->d(LI4/m9;LI4/M6;)V

    .line 57
    .line 58
    .line 59
    const/4 p1, 0x0

    .line 60
    iput-object p1, p0, Lh6/g;->p:LI4/M9;

    .line 61
    .line 62
    return-void
.end method

.method private final I(LP4/l;II)LP4/l;
    .locals 1

    .line 1
    new-instance v0, Lh6/e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p2, p3}, Lh6/e;-><init>(Lh6/g;II)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, LP4/l;->q(LP4/k;)LP4/l;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method


# virtual methods
.method final synthetic B(IILjava/util/List;)LP4/l;
    .locals 0

    .line 1
    invoke-static {p3}, LP4/o;->f(Ljava/lang/Object;)LP4/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final declared-synchronized close()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-super {p0}, Ll6/e;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    monitor-exit p0

    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 9
    throw v0
.end method

.method public final d()[Lcom/google/android/gms/common/Feature;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lh6/g;->n:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lc6/l;->a:[Lcom/google/android/gms/common/Feature;

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    const/4 v0, 0x1

    .line 9
    new-array v0, v0, [Lcom/google/android/gms/common/Feature;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    sget-object v2, Lc6/l;->b:Lcom/google/android/gms/common/Feature;

    .line 13
    .line 14
    aput-object v2, v0, v1

    .line 15
    .line 16
    return-object v0
.end method

.method public final s0(Lk6/a;)LP4/l;
    .locals 2

    .line 1
    invoke-super {p0, p1}, Ll6/e;->r(Lk6/a;)LP4/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lk6/a;->k()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p1}, Lk6/a;->g()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0, v0, v1, p1}, Lh6/g;->I(LP4/l;II)LP4/l;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
