.class public final Ls9/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Le9/H;
.implements Ls9/g$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls9/d$c;,
        Ls9/d$a;,
        Ls9/d$d;,
        Ls9/d$e;,
        Ls9/d$b;
    }
.end annotation


# static fields
.field public static final A:Ls9/d$b;

.field private static final z:Ljava/util/List;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Le9/e;

.field private c:Li9/a;

.field private d:Ls9/g;

.field private e:Ls9/h;

.field private f:Li9/d;

.field private g:Ljava/lang/String;

.field private h:Ls9/d$d;

.field private final i:Ljava/util/ArrayDeque;

.field private final j:Ljava/util/ArrayDeque;

.field private k:J

.field private l:Z

.field private m:I

.field private n:Ljava/lang/String;

.field private o:Z

.field private p:I

.field private q:I

.field private r:I

.field private s:Z

.field private final t:Le9/B;

.field private final u:Le9/I;

.field private final v:Ljava/util/Random;

.field private final w:J

.field private x:Ls9/e;

.field private y:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ls9/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ls9/d$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ls9/d;->A:Ls9/d$b;

    .line 8
    .line 9
    sget-object v0, Le9/A;->i:Le9/A;

    .line 10
    .line 11
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Ls9/d;->z:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Li9/e;Le9/B;Le9/I;Ljava/util/Random;JLs9/e;J)V
    .locals 1

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "originalRequest"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "listener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "random"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p2, p0, Ls9/d;->t:Le9/B;

    .line 25
    .line 26
    iput-object p3, p0, Ls9/d;->u:Le9/I;

    .line 27
    .line 28
    iput-object p4, p0, Ls9/d;->v:Ljava/util/Random;

    .line 29
    .line 30
    iput-wide p5, p0, Ls9/d;->w:J

    .line 31
    .line 32
    iput-object p7, p0, Ls9/d;->x:Ls9/e;

    .line 33
    .line 34
    iput-wide p8, p0, Ls9/d;->y:J

    .line 35
    .line 36
    invoke-virtual {p1}, Li9/e;->i()Li9/d;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iput-object p1, p0, Ls9/d;->f:Li9/d;

    .line 41
    .line 42
    new-instance p1, Ljava/util/ArrayDeque;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Ls9/d;->i:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    new-instance p1, Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 55
    .line 56
    const/4 p1, -0x1

    .line 57
    iput p1, p0, Ls9/d;->m:I

    .line 58
    .line 59
    const-string p1, "GET"

    .line 60
    .line 61
    invoke-virtual {p2}, Le9/B;->l()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eqz p1, :cond_0

    .line 70
    .line 71
    sget-object p2, Lt9/k;->j:Lt9/k$a;

    .line 72
    .line 73
    const/16 p1, 0x10

    .line 74
    .line 75
    new-array p3, p1, [B

    .line 76
    .line 77
    invoke-virtual {p4, p3}, Ljava/util/Random;->nextBytes([B)V

    .line 78
    .line 79
    .line 80
    sget-object p1, Li7/B;->a:Li7/B;

    .line 81
    .line 82
    const/4 p6, 0x3

    .line 83
    const/4 p7, 0x0

    .line 84
    const/4 p4, 0x0

    .line 85
    const/4 p5, 0x0

    .line 86
    invoke-static/range {p2 .. p7}, Lt9/k$a;->j(Lt9/k$a;[BIIILjava/lang/Object;)Lt9/k;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-virtual {p1}, Lt9/k;->j()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iput-object p1, p0, Ls9/d;->a:Ljava/lang/String;

    .line 95
    .line 96
    return-void

    .line 97
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string p3, "Request must be GET: "

    .line 103
    .line 104
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p2}, Le9/B;->l()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 119
    .line 120
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    throw p2
.end method

.method public static final synthetic h(Ls9/d;)Ljava/util/ArrayDeque;
    .locals 0

    .line 1
    iget-object p0, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic i(Ls9/d;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Ls9/d;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic j(Ls9/d;Ls9/e;)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ls9/d;->s(Ls9/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic k(Ls9/d;Ls9/e;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls9/d;->x:Ls9/e;

    .line 2
    .line 3
    return-void
.end method

.method private final s(Ls9/e;)Z
    .locals 2

    .line 1
    iget-boolean v0, p1, Ls9/e;->f:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    iget-object v0, p1, Ls9/e;->b:Ljava/lang/Integer;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return v1

    .line 12
    :cond_1
    iget-object p1, p1, Ls9/e;->d:Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz p1, :cond_3

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    if-gt v0, p1, :cond_2

    .line 23
    .line 24
    const/16 v0, 0xf

    .line 25
    .line 26
    if-ge v0, p1, :cond_3

    .line 27
    .line 28
    :cond_2
    return v1

    .line 29
    :cond_3
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method private final u()V
    .locals 8

    .line 1
    sget-boolean v0, Lf9/c;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 17
    .line 18
    .line 19
    const-string v2, "Thread "

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const-string v3, "Thread.currentThread()"

    .line 29
    .line 30
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, " MUST hold lock on "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_1
    :goto_0
    iget-object v3, p0, Ls9/d;->c:Li9/a;

    .line 57
    .line 58
    if-eqz v3, :cond_2

    .line 59
    .line 60
    iget-object v2, p0, Ls9/d;->f:Li9/d;

    .line 61
    .line 62
    const/4 v6, 0x2

    .line 63
    const/4 v7, 0x0

    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    invoke-static/range {v2 .. v7}, Li9/d;->j(Li9/d;Li9/a;JILjava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    :cond_2
    return-void
.end method

.method private final declared-synchronized v(Lt9/k;I)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ls9/d;->o:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    iget-boolean v0, p0, Ls9/d;->l:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iget-wide v2, p0, Ls9/d;->k:J

    .line 13
    .line 14
    invoke-virtual {p1}, Lt9/k;->E()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    int-to-long v4, v0

    .line 19
    add-long/2addr v2, v4

    .line 20
    const-wide/32 v4, 0x1000000

    .line 21
    .line 22
    .line 23
    cmp-long v0, v2, v4

    .line 24
    .line 25
    if-lez v0, :cond_1

    .line 26
    .line 27
    const/16 p1, 0x3e9

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-virtual {p0, p1, p2}, Ls9/d;->d(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return v1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    :try_start_1
    iget-wide v0, p0, Ls9/d;->k:J

    .line 38
    .line 39
    invoke-virtual {p1}, Lt9/k;->E()I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    int-to-long v2, v2

    .line 44
    add-long/2addr v0, v2

    .line 45
    iput-wide v0, p0, Ls9/d;->k:J

    .line 46
    .line 47
    iget-object v0, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 48
    .line 49
    new-instance v1, Ls9/d$c;

    .line 50
    .line 51
    invoke-direct {v1, p2, p1}, Ls9/d$c;-><init>(ILt9/k;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, Ls9/d;->u()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    .line 59
    .line 60
    monitor-exit p0

    .line 61
    const/4 p1, 0x1

    .line 62
    return p1

    .line 63
    :cond_2
    :goto_0
    monitor-exit p0

    .line 64
    return v1

    .line 65
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 66
    throw p1
.end method


# virtual methods
.method public declared-synchronized a(Lt9/k;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-boolean v0, p0, Ls9/d;->o:Z

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    iget-boolean v0, p0, Ls9/d;->l:Z

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception p1

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    iget-object v0, p0, Ls9/d;->i:Ljava/util/ArrayDeque;

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Ls9/d;->u()V

    .line 32
    .line 33
    .line 34
    iget p1, p0, Ls9/d;->q:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, 0x1

    .line 37
    .line 38
    iput p1, p0, Ls9/d;->q:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    monitor-exit p0

    .line 41
    return-void

    .line 42
    :cond_1
    :goto_0
    monitor-exit p0

    .line 43
    return-void

    .line 44
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 45
    throw p1
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls9/d;->u:Le9/I;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Le9/I;->onMessage(Le9/H;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public c(Lt9/k;)Z
    .locals 1

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    invoke-direct {p0, p1, v0}, Ls9/d;->v(Lt9/k;I)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method

.method public d(ILjava/lang/String;)Z
    .locals 2

    .line 1
    const-wide/32 v0, 0xea60

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, p1, p2, v0, v1}, Ls9/d;->n(ILjava/lang/String;J)Z

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public declared-synchronized e(Lt9/k;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "payload"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget p1, p0, Ls9/d;->r:I

    .line 8
    .line 9
    add-int/lit8 p1, p1, 0x1

    .line 10
    .line 11
    iput p1, p0, Ls9/d;->r:I

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    iput-boolean p1, p0, Ls9/d;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit p0

    .line 17
    return-void

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw p1
.end method

.method public f(Lt9/k;)V
    .locals 1

    .line 1
    const-string v0, "bytes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls9/d;->u:Le9/I;

    .line 7
    .line 8
    invoke-virtual {v0, p0, p1}, Le9/I;->onMessage(Le9/H;Lt9/k;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g(ILjava/lang/String;)V
    .locals 4

    .line 1
    const-string v0, "reason"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, -0x1

    .line 9
    if-eq p1, v2, :cond_0

    .line 10
    .line 11
    move v3, v1

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v0

    .line 14
    :goto_0
    if-eqz v3, :cond_b

    .line 15
    .line 16
    monitor-enter p0

    .line 17
    :try_start_0
    iget v3, p0, Ls9/d;->m:I

    .line 18
    .line 19
    if-ne v3, v2, :cond_1

    .line 20
    .line 21
    move v0, v1

    .line 22
    :cond_1
    if-eqz v0, :cond_a

    .line 23
    .line 24
    iput p1, p0, Ls9/d;->m:I

    .line 25
    .line 26
    iput-object p2, p0, Ls9/d;->n:Ljava/lang/String;

    .line 27
    .line 28
    iget-boolean v0, p0, Ls9/d;->l:Z

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v0, p0, Ls9/d;->h:Ls9/d$d;

    .line 42
    .line 43
    iput-object v1, p0, Ls9/d;->h:Ls9/d$d;

    .line 44
    .line 45
    iget-object v2, p0, Ls9/d;->d:Ls9/g;

    .line 46
    .line 47
    iput-object v1, p0, Ls9/d;->d:Ls9/g;

    .line 48
    .line 49
    iget-object v3, p0, Ls9/d;->e:Ls9/h;

    .line 50
    .line 51
    iput-object v1, p0, Ls9/d;->e:Ls9/h;

    .line 52
    .line 53
    iget-object v1, p0, Ls9/d;->f:Li9/d;

    .line 54
    .line 55
    invoke-virtual {v1}, Li9/d;->n()V

    .line 56
    .line 57
    .line 58
    move-object v1, v0

    .line 59
    goto :goto_1

    .line 60
    :catchall_0
    move-exception p1

    .line 61
    goto :goto_4

    .line 62
    :cond_2
    move-object v2, v1

    .line 63
    move-object v3, v2

    .line 64
    :goto_1
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    monitor-exit p0

    .line 67
    :try_start_1
    iget-object v0, p0, Ls9/d;->u:Le9/I;

    .line 68
    .line 69
    invoke-virtual {v0, p0, p1, p2}, Le9/I;->onClosing(Le9/H;ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    iget-object v0, p0, Ls9/d;->u:Le9/I;

    .line 75
    .line 76
    invoke-virtual {v0, p0, p1, p2}, Le9/I;->onClosed(Le9/H;ILjava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_2

    .line 80
    :catchall_1
    move-exception p1

    .line 81
    goto :goto_3

    .line 82
    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 83
    .line 84
    invoke-static {v1}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    if-eqz v2, :cond_5

    .line 88
    .line 89
    invoke-static {v2}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 90
    .line 91
    .line 92
    :cond_5
    if-eqz v3, :cond_6

    .line 93
    .line 94
    invoke-static {v3}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 95
    .line 96
    .line 97
    :cond_6
    return-void

    .line 98
    :goto_3
    if-eqz v1, :cond_7

    .line 99
    .line 100
    invoke-static {v1}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 101
    .line 102
    .line 103
    :cond_7
    if-eqz v2, :cond_8

    .line 104
    .line 105
    invoke-static {v2}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 106
    .line 107
    .line 108
    :cond_8
    if-eqz v3, :cond_9

    .line 109
    .line 110
    invoke-static {v3}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 111
    .line 112
    .line 113
    :cond_9
    throw p1

    .line 114
    :cond_a
    :try_start_2
    const-string p1, "already closed"

    .line 115
    .line 116
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 117
    .line 118
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 122
    :goto_4
    monitor-exit p0

    .line 123
    throw p1

    .line 124
    :cond_b
    const-string p1, "Failed requirement."

    .line 125
    .line 126
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 127
    .line 128
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p2
.end method

.method public l()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d;->b:Le9/e;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {v0}, Le9/e;->cancel()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final m(Le9/D;Lj9/c;)V
    .locals 7

    .line 1
    const-string v0, "response"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Le9/D;->I()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0x65

    .line 11
    .line 12
    const/16 v2, 0x27

    .line 13
    .line 14
    if-ne v0, v1, :cond_4

    .line 15
    .line 16
    const-string v0, "Connection"

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v3, 0x2

    .line 20
    invoke-static {p1, v0, v1, v3, v1}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v4, "Upgrade"

    .line 25
    .line 26
    const/4 v5, 0x1

    .line 27
    invoke-static {v4, v0, v5}, LP8/q;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-eqz v6, :cond_3

    .line 32
    .line 33
    invoke-static {p1, v4, v1, v3, v1}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const-string v4, "websocket"

    .line 38
    .line 39
    invoke-static {v4, v0, v5}, LP8/q;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const-string v0, "Sec-WebSocket-Accept"

    .line 46
    .line 47
    invoke-static {p1, v0, v1, v3, v1}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    sget-object v0, Lt9/k;->j:Lt9/k$a;

    .line 52
    .line 53
    new-instance v1, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v3, p0, Ls9/d;->a:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v3, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Lt9/k$a;->g(Ljava/lang/String;)Lt9/k;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0}, Lt9/k;->C()Lt9/k;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v0}, Lt9/k;->j()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    if-eqz p2, :cond_0

    .line 91
    .line 92
    return-void

    .line 93
    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    .line 94
    .line 95
    const-string p2, "Web Socket exchange missing: bad interceptor?"

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :cond_1
    new-instance p2, Ljava/net/ProtocolException;

    .line 102
    .line 103
    new-instance v1, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 106
    .line 107
    .line 108
    const-string v3, "Expected \'Sec-WebSocket-Accept\' header value \'"

    .line 109
    .line 110
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, "\' but was \'"

    .line 117
    .line 118
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    throw p2

    .line 135
    :cond_2
    new-instance p1, Ljava/net/ProtocolException;

    .line 136
    .line 137
    new-instance p2, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    const-string v1, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    .line 143
    .line 144
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object p2

    .line 157
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    throw p1

    .line 161
    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    .line 162
    .line 163
    new-instance p2, Ljava/lang/StringBuilder;

    .line 164
    .line 165
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 166
    .line 167
    .line 168
    const-string v1, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    .line 169
    .line 170
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    throw p1

    .line 187
    :cond_4
    new-instance p2, Ljava/net/ProtocolException;

    .line 188
    .line 189
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 192
    .line 193
    .line 194
    const-string v1, "Expected HTTP 101 response but was \'"

    .line 195
    .line 196
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Le9/D;->I()I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    const/16 v1, 0x20

    .line 207
    .line 208
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Le9/D;->l0()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p1

    .line 225
    invoke-direct {p2, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    throw p2
.end method

.method public final declared-synchronized n(ILjava/lang/String;J)Z
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-object v0, Ls9/f;->a:Ls9/f;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ls9/f;->c(I)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz p2, :cond_2

    .line 10
    .line 11
    sget-object v2, Lt9/k;->j:Lt9/k$a;

    .line 12
    .line 13
    invoke-virtual {v2, p2}, Lt9/k$a;->g(Ljava/lang/String;)Lt9/k;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Lt9/k;->E()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    int-to-long v3, v3

    .line 22
    const-wide/16 v5, 0x7b

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-gtz v3, :cond_0

    .line 27
    .line 28
    move v3, v1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v3, v0

    .line 31
    :goto_0
    if-eqz v3, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    .line 39
    const-string p3, "reason.size() > 123: "

    .line 40
    .line 41
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    throw p2

    .line 61
    :catchall_0
    move-exception p1

    .line 62
    goto :goto_3

    .line 63
    :cond_2
    const/4 v2, 0x0

    .line 64
    :goto_1
    iget-boolean p2, p0, Ls9/d;->o:Z

    .line 65
    .line 66
    if-nez p2, :cond_4

    .line 67
    .line 68
    iget-boolean p2, p0, Ls9/d;->l:Z

    .line 69
    .line 70
    if-eqz p2, :cond_3

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    iput-boolean v1, p0, Ls9/d;->l:Z

    .line 74
    .line 75
    iget-object p2, p0, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 76
    .line 77
    new-instance v0, Ls9/d$a;

    .line 78
    .line 79
    invoke-direct {v0, p1, v2, p3, p4}, Ls9/d$a;-><init>(ILt9/k;J)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2, v0}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    invoke-direct {p0}, Ls9/d;->u()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    monitor-exit p0

    .line 89
    return v1

    .line 90
    :cond_4
    :goto_2
    monitor-exit p0

    .line 91
    return v0

    .line 92
    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 93
    throw p1
.end method

.method public final o(Le9/z;)V
    .locals 4

    .line 1
    const-string v0, "client"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls9/d;->t:Le9/B;

    .line 7
    .line 8
    const-string v1, "Sec-WebSocket-Extensions"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Le9/B;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    new-instance p1, Ljava/net/ProtocolException;

    .line 17
    .line 18
    const-string v0, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-virtual {p0, p1, v0}, Ls9/d;->p(Ljava/lang/Exception;Le9/D;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, Le9/z;->C()Le9/z$a;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    sget-object v0, Le9/r;->a:Le9/r;

    .line 33
    .line 34
    invoke-virtual {p1, v0}, Le9/z$a;->h(Le9/r;)Le9/z$a;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    sget-object v0, Ls9/d;->z:Ljava/util/List;

    .line 39
    .line 40
    invoke-virtual {p1, v0}, Le9/z$a;->O(Ljava/util/List;)Le9/z$a;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Le9/z$a;->c()Le9/z;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iget-object v0, p0, Ls9/d;->t:Le9/B;

    .line 49
    .line 50
    invoke-virtual {v0}, Le9/B;->m()Le9/B$a;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v2, "websocket"

    .line 55
    .line 56
    const-string v3, "Upgrade"

    .line 57
    .line 58
    invoke-virtual {v0, v3, v2}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v2, "Connection"

    .line 63
    .line 64
    invoke-virtual {v0, v2, v3}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v2, "Sec-WebSocket-Key"

    .line 69
    .line 70
    iget-object v3, p0, Ls9/d;->a:Ljava/lang/String;

    .line 71
    .line 72
    invoke-virtual {v0, v2, v3}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    const-string v2, "Sec-WebSocket-Version"

    .line 77
    .line 78
    const-string v3, "13"

    .line 79
    .line 80
    invoke-virtual {v0, v2, v3}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    const-string v2, "permessage-deflate"

    .line 85
    .line 86
    invoke-virtual {v0, v1, v2}, Le9/B$a;->e(Ljava/lang/String;Ljava/lang/String;)Le9/B$a;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-virtual {v0}, Le9/B$a;->b()Le9/B;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v1, Lj9/e;

    .line 95
    .line 96
    const/4 v2, 0x1

    .line 97
    invoke-direct {v1, p1, v0, v2}, Lj9/e;-><init>(Le9/z;Le9/B;Z)V

    .line 98
    .line 99
    .line 100
    iput-object v1, p0, Ls9/d;->b:Le9/e;

    .line 101
    .line 102
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    new-instance p1, Ls9/d$f;

    .line 106
    .line 107
    invoke-direct {p1, p0, v0}, Ls9/d$f;-><init>(Ls9/d;Le9/B;)V

    .line 108
    .line 109
    .line 110
    invoke-interface {v1, p1}, Le9/e;->t0(Le9/f;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public final p(Ljava/lang/Exception;Le9/D;)V
    .locals 4

    .line 1
    const-string v0, "e"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-boolean v0, p0, Ls9/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    monitor-exit p0

    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    :try_start_1
    iput-boolean v0, p0, Ls9/d;->o:Z

    .line 15
    .line 16
    iget-object v0, p0, Ls9/d;->h:Ls9/d$d;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    iput-object v1, p0, Ls9/d;->h:Ls9/d$d;

    .line 20
    .line 21
    iget-object v2, p0, Ls9/d;->d:Ls9/g;

    .line 22
    .line 23
    iput-object v1, p0, Ls9/d;->d:Ls9/g;

    .line 24
    .line 25
    iget-object v3, p0, Ls9/d;->e:Ls9/h;

    .line 26
    .line 27
    iput-object v1, p0, Ls9/d;->e:Ls9/h;

    .line 28
    .line 29
    iget-object v1, p0, Ls9/d;->f:Li9/d;

    .line 30
    .line 31
    invoke-virtual {v1}, Li9/d;->n()V

    .line 32
    .line 33
    .line 34
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    monitor-exit p0

    .line 37
    :try_start_2
    iget-object v1, p0, Ls9/d;->u:Le9/I;

    .line 38
    .line 39
    invoke-virtual {v1, p0, p1, p2}, Le9/I;->onFailure(Le9/H;Ljava/lang/Throwable;Le9/D;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 45
    .line 46
    .line 47
    :cond_1
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-static {v2}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    if-eqz v3, :cond_3

    .line 53
    .line 54
    invoke-static {v3}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void

    .line 58
    :catchall_0
    move-exception p1

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 62
    .line 63
    .line 64
    :cond_4
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-static {v2}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 67
    .line 68
    .line 69
    :cond_5
    if-eqz v3, :cond_6

    .line 70
    .line 71
    invoke-static {v3}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 72
    .line 73
    .line 74
    :cond_6
    throw p1

    .line 75
    :catchall_1
    move-exception p1

    .line 76
    monitor-exit p0

    .line 77
    throw p1
.end method

.method public final q()Le9/I;
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/d;->u:Le9/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r(Ljava/lang/String;Ls9/d$d;)V
    .locals 17

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    const-string v0, "name"

    .line 8
    .line 9
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v0, "streams"

    .line 13
    .line 14
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v8, v3, Ls9/d;->x:Ls9/e;

    .line 18
    .line 19
    invoke-static {v8}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    monitor-enter p0

    .line 23
    :try_start_0
    iput-object v6, v3, Ls9/d;->g:Ljava/lang/String;

    .line 24
    .line 25
    iput-object v7, v3, Ls9/d;->h:Ls9/d$d;

    .line 26
    .line 27
    new-instance v9, Ls9/h;

    .line 28
    .line 29
    invoke-virtual {v7}, Ls9/d$d;->d()Z

    .line 30
    .line 31
    .line 32
    move-result v10

    .line 33
    invoke-virtual {v7}, Ls9/d$d;->e()Lt9/i;

    .line 34
    .line 35
    .line 36
    move-result-object v11

    .line 37
    iget-object v12, v3, Ls9/d;->v:Ljava/util/Random;

    .line 38
    .line 39
    iget-boolean v13, v8, Ls9/e;->a:Z

    .line 40
    .line 41
    invoke-virtual {v7}, Ls9/d$d;->d()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    invoke-virtual {v8, v0}, Ls9/e;->a(Z)Z

    .line 46
    .line 47
    .line 48
    move-result v14

    .line 49
    iget-wide v0, v3, Ls9/d;->y:J

    .line 50
    .line 51
    move-wide v15, v0

    .line 52
    invoke-direct/range {v9 .. v16}, Ls9/h;-><init>(ZLt9/i;Ljava/util/Random;ZZJ)V

    .line 53
    .line 54
    .line 55
    iput-object v9, v3, Ls9/d;->e:Ls9/h;

    .line 56
    .line 57
    new-instance v0, Ls9/d$e;

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ls9/d$e;-><init>(Ls9/d;)V

    .line 60
    .line 61
    .line 62
    iput-object v0, v3, Ls9/d;->c:Li9/a;

    .line 63
    .line 64
    iget-wide v0, v3, Ls9/d;->w:J

    .line 65
    .line 66
    const-wide/16 v4, 0x0

    .line 67
    .line 68
    cmp-long v2, v0, v4

    .line 69
    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 73
    .line 74
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    iget-object v9, v3, Ls9/d;->f:Li9/d;

    .line 79
    .line 80
    new-instance v2, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v4, " ping"

    .line 89
    .line 90
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    move-wide v3, v0

    .line 98
    :try_start_1
    new-instance v0, Ls9/d$g;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 99
    .line 100
    move-object v1, v2

    .line 101
    move-object v2, v1

    .line 102
    move-object/from16 v5, p0

    .line 103
    .line 104
    :try_start_2
    invoke-direct/range {v0 .. v8}, Ls9/d$g;-><init>(Ljava/lang/String;Ljava/lang/String;JLs9/d;Ljava/lang/String;Ls9/d$d;Ls9/e;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 105
    .line 106
    .line 107
    move-object v2, v0

    .line 108
    move-wide v0, v3

    .line 109
    move-object v3, v5

    .line 110
    :try_start_3
    invoke-virtual {v9, v2, v0, v1}, Li9/d;->i(Li9/a;J)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto :goto_1

    .line 116
    :catchall_1
    move-exception v0

    .line 117
    move-object v3, v5

    .line 118
    goto :goto_1

    .line 119
    :catchall_2
    move-exception v0

    .line 120
    move-object/from16 v3, p0

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_0
    :goto_0
    iget-object v0, v3, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 124
    .line 125
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-nez v0, :cond_1

    .line 130
    .line 131
    invoke-direct {v3}, Ls9/d;->u()V

    .line 132
    .line 133
    .line 134
    :cond_1
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 135
    .line 136
    monitor-exit p0

    .line 137
    new-instance v0, Ls9/g;

    .line 138
    .line 139
    invoke-virtual/range {p2 .. p2}, Ls9/d$d;->d()Z

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-virtual/range {p2 .. p2}, Ls9/d$d;->k()Lt9/j;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    iget-boolean v4, v8, Ls9/e;->a:Z

    .line 148
    .line 149
    invoke-virtual/range {p2 .. p2}, Ls9/d$d;->d()Z

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    xor-int/lit8 v5, v5, 0x1

    .line 154
    .line 155
    invoke-virtual {v8, v5}, Ls9/e;->a(Z)Z

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    invoke-direct/range {v0 .. v5}, Ls9/g;-><init>(ZLt9/j;Ls9/g$a;ZZ)V

    .line 160
    .line 161
    .line 162
    iput-object v0, v3, Ls9/d;->d:Ls9/g;

    .line 163
    .line 164
    return-void

    .line 165
    :goto_1
    monitor-exit p0

    .line 166
    throw v0
.end method

.method public send(Ljava/lang/String;)Z
    .locals 1

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lt9/k;->j:Lt9/k$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lt9/k$a;->g(Ljava/lang/String;)Lt9/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p0, p1, v0}, Ls9/d;->v(Lt9/k;I)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public final t()V
    .locals 2

    .line 1
    :goto_0
    iget v0, p0, Ls9/d;->m:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    iget-object v0, p0, Ls9/d;->d:Ls9/g;

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ls9/g;->d()V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method public final w()Z
    .locals 19

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    new-instance v8, Lkotlin/jvm/internal/C;

    .line 4
    .line 5
    invoke-direct {v8}, Lkotlin/jvm/internal/C;-><init>()V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, v8, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v9, Lkotlin/jvm/internal/A;

    .line 12
    .line 13
    invoke-direct {v9}, Lkotlin/jvm/internal/A;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, -0x1

    .line 17
    iput v1, v9, Lkotlin/jvm/internal/A;->g:I

    .line 18
    .line 19
    new-instance v10, Lkotlin/jvm/internal/C;

    .line 20
    .line 21
    invoke-direct {v10}, Lkotlin/jvm/internal/C;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object v0, v10, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 25
    .line 26
    new-instance v11, Lkotlin/jvm/internal/C;

    .line 27
    .line 28
    invoke-direct {v11}, Lkotlin/jvm/internal/C;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object v0, v11, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 32
    .line 33
    new-instance v12, Lkotlin/jvm/internal/C;

    .line 34
    .line 35
    invoke-direct {v12}, Lkotlin/jvm/internal/C;-><init>()V

    .line 36
    .line 37
    .line 38
    iput-object v0, v12, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 39
    .line 40
    new-instance v13, Lkotlin/jvm/internal/C;

    .line 41
    .line 42
    invoke-direct {v13}, Lkotlin/jvm/internal/C;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, v13, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 46
    .line 47
    monitor-enter p0

    .line 48
    :try_start_0
    iget-boolean v2, v5, Ls9/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return v3

    .line 55
    :cond_0
    :try_start_1
    iget-object v6, v5, Ls9/d;->e:Ls9/h;

    .line 56
    .line 57
    iget-object v2, v5, Ls9/d;->i:Ljava/util/ArrayDeque;

    .line 58
    .line 59
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    move-object v7, v2

    .line 64
    check-cast v7, Lt9/k;

    .line 65
    .line 66
    if-nez v7, :cond_4

    .line 67
    .line 68
    iget-object v2, v5, Ls9/d;->j:Ljava/util/ArrayDeque;

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v8, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 75
    .line 76
    instance-of v4, v2, Ls9/d$a;

    .line 77
    .line 78
    if-eqz v4, :cond_3

    .line 79
    .line 80
    iget v2, v5, Ls9/d;->m:I

    .line 81
    .line 82
    iput v2, v9, Lkotlin/jvm/internal/A;->g:I

    .line 83
    .line 84
    iget-object v3, v5, Ls9/d;->n:Ljava/lang/String;

    .line 85
    .line 86
    iput-object v3, v10, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 87
    .line 88
    if-eq v2, v1, :cond_1

    .line 89
    .line 90
    iget-object v1, v5, Ls9/d;->h:Ls9/d$d;

    .line 91
    .line 92
    iput-object v1, v11, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 93
    .line 94
    iput-object v0, v5, Ls9/d;->h:Ls9/d$d;

    .line 95
    .line 96
    iget-object v1, v5, Ls9/d;->d:Ls9/g;

    .line 97
    .line 98
    iput-object v1, v12, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 99
    .line 100
    iput-object v0, v5, Ls9/d;->d:Ls9/g;

    .line 101
    .line 102
    iget-object v1, v5, Ls9/d;->e:Ls9/h;

    .line 103
    .line 104
    iput-object v1, v13, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 105
    .line 106
    iput-object v0, v5, Ls9/d;->e:Ls9/h;

    .line 107
    .line 108
    iget-object v0, v5, Ls9/d;->f:Li9/d;

    .line 109
    .line 110
    invoke-virtual {v0}, Li9/d;->n()V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto/16 :goto_3

    .line 116
    .line 117
    :cond_1
    iget-object v0, v8, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 118
    .line 119
    if-eqz v0, :cond_2

    .line 120
    .line 121
    check-cast v0, Ls9/d$a;

    .line 122
    .line 123
    invoke-virtual {v0}, Ls9/d$a;->a()J

    .line 124
    .line 125
    .line 126
    move-result-wide v0

    .line 127
    iget-object v14, v5, Ls9/d;->f:Li9/d;

    .line 128
    .line 129
    new-instance v2, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    iget-object v3, v5, Ls9/d;->g:Ljava/lang/String;

    .line 135
    .line 136
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    const-string v3, " cancel"

    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 149
    .line 150
    invoke-virtual {v3, v0, v1}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 151
    .line 152
    .line 153
    move-result-wide v0

    .line 154
    move-wide v3, v0

    .line 155
    new-instance v0, Ls9/d$h;

    .line 156
    .line 157
    move-object v1, v2

    .line 158
    const/4 v2, 0x1

    .line 159
    move-wide v15, v3

    .line 160
    move-object v3, v1

    .line 161
    move v4, v2

    .line 162
    move-wide/from16 v17, v15

    .line 163
    .line 164
    invoke-direct/range {v0 .. v13}, Ls9/d$h;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLs9/d;Ls9/h;Lt9/k;Lkotlin/jvm/internal/C;Lkotlin/jvm/internal/A;Lkotlin/jvm/internal/C;Lkotlin/jvm/internal/C;Lkotlin/jvm/internal/C;Lkotlin/jvm/internal/C;)V

    .line 165
    .line 166
    .line 167
    move-wide/from16 v3, v17

    .line 168
    .line 169
    invoke-virtual {v14, v0, v3, v4}, Li9/d;->i(Li9/a;J)V

    .line 170
    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 174
    .line 175
    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    .line 176
    .line 177
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 181
    :cond_3
    if-nez v2, :cond_4

    .line 182
    .line 183
    monitor-exit p0

    .line 184
    return v3

    .line 185
    :cond_4
    :goto_0
    :try_start_2
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 186
    .line 187
    monitor-exit p0

    .line 188
    if-eqz v7, :cond_5

    .line 189
    .line 190
    :try_start_3
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v6, v7}, Ls9/h;->r(Lt9/k;)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :catchall_1
    move-exception v0

    .line 198
    goto/16 :goto_2

    .line 199
    .line 200
    :cond_5
    iget-object v0, v8, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 201
    .line 202
    instance-of v1, v0, Ls9/d$c;

    .line 203
    .line 204
    if-eqz v1, :cond_7

    .line 205
    .line 206
    if-eqz v0, :cond_6

    .line 207
    .line 208
    check-cast v0, Ls9/d$c;

    .line 209
    .line 210
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ls9/d$c;->b()I

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    invoke-virtual {v0}, Ls9/d$c;->a()Lt9/k;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    invoke-virtual {v6, v1, v2}, Ls9/h;->k(ILt9/k;)V

    .line 222
    .line 223
    .line 224
    monitor-enter p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 225
    :try_start_4
    iget-wide v1, v5, Ls9/d;->k:J

    .line 226
    .line 227
    invoke-virtual {v0}, Ls9/d$c;->a()Lt9/k;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-virtual {v0}, Lt9/k;->E()I

    .line 232
    .line 233
    .line 234
    move-result v0

    .line 235
    int-to-long v3, v0

    .line 236
    sub-long/2addr v1, v3

    .line 237
    iput-wide v1, v5, Ls9/d;->k:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 238
    .line 239
    :try_start_5
    monitor-exit p0

    .line 240
    goto :goto_1

    .line 241
    :catchall_2
    move-exception v0

    .line 242
    monitor-exit p0

    .line 243
    throw v0

    .line 244
    :cond_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 245
    .line 246
    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Message"

    .line 247
    .line 248
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v0

    .line 252
    :cond_7
    instance-of v1, v0, Ls9/d$a;

    .line 253
    .line 254
    if-eqz v1, :cond_d

    .line 255
    .line 256
    if-eqz v0, :cond_c

    .line 257
    .line 258
    check-cast v0, Ls9/d$a;

    .line 259
    .line 260
    invoke-static {v6}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Ls9/d$a;->b()I

    .line 264
    .line 265
    .line 266
    move-result v1

    .line 267
    invoke-virtual {v0}, Ls9/d$a;->c()Lt9/k;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-virtual {v6, v1, v0}, Ls9/h;->d(ILt9/k;)V

    .line 272
    .line 273
    .line 274
    iget-object v0, v11, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 275
    .line 276
    check-cast v0, Ls9/d$d;

    .line 277
    .line 278
    if-eqz v0, :cond_8

    .line 279
    .line 280
    iget-object v0, v5, Ls9/d;->u:Le9/I;

    .line 281
    .line 282
    iget v1, v9, Lkotlin/jvm/internal/A;->g:I

    .line 283
    .line 284
    iget-object v2, v10, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 285
    .line 286
    check-cast v2, Ljava/lang/String;

    .line 287
    .line 288
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v5, v1, v2}, Le9/I;->onClosed(Le9/H;ILjava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 292
    .line 293
    .line 294
    :cond_8
    :goto_1
    iget-object v0, v11, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v0, Ls9/d$d;

    .line 297
    .line 298
    if-eqz v0, :cond_9

    .line 299
    .line 300
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 301
    .line 302
    .line 303
    :cond_9
    iget-object v0, v12, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast v0, Ls9/g;

    .line 306
    .line 307
    if-eqz v0, :cond_a

    .line 308
    .line 309
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 310
    .line 311
    .line 312
    :cond_a
    iget-object v0, v13, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 313
    .line 314
    check-cast v0, Ls9/h;

    .line 315
    .line 316
    const/4 v1, 0x1

    .line 317
    if-eqz v0, :cond_b

    .line 318
    .line 319
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 320
    .line 321
    .line 322
    :cond_b
    return v1

    .line 323
    :cond_c
    :try_start_6
    new-instance v0, Ljava/lang/NullPointerException;

    .line 324
    .line 325
    const-string v1, "null cannot be cast to non-null type okhttp3.internal.ws.RealWebSocket.Close"

    .line 326
    .line 327
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    throw v0

    .line 331
    :cond_d
    new-instance v0, Ljava/lang/AssertionError;

    .line 332
    .line 333
    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    .line 334
    .line 335
    .line 336
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 337
    :goto_2
    iget-object v1, v11, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 338
    .line 339
    check-cast v1, Ls9/d$d;

    .line 340
    .line 341
    if-eqz v1, :cond_e

    .line 342
    .line 343
    invoke-static {v1}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 344
    .line 345
    .line 346
    :cond_e
    iget-object v1, v12, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v1, Ls9/g;

    .line 349
    .line 350
    if-eqz v1, :cond_f

    .line 351
    .line 352
    invoke-static {v1}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 353
    .line 354
    .line 355
    :cond_f
    iget-object v1, v13, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 356
    .line 357
    check-cast v1, Ls9/h;

    .line 358
    .line 359
    if-eqz v1, :cond_10

    .line 360
    .line 361
    invoke-static {v1}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 362
    .line 363
    .line 364
    :cond_10
    throw v0

    .line 365
    :goto_3
    monitor-exit p0

    .line 366
    throw v0
.end method

.method public final x()V
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Ls9/d;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    iget-object v0, p0, Ls9/d;->e:Ls9/h;

    .line 9
    .line 10
    if-eqz v0, :cond_3

    .line 11
    .line 12
    iget-boolean v1, p0, Ls9/d;->s:Z

    .line 13
    .line 14
    const/4 v2, -0x1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget v1, p0, Ls9/d;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v1, v2

    .line 23
    :goto_0
    iget v3, p0, Ls9/d;->p:I

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    add-int/2addr v3, v4

    .line 27
    iput v3, p0, Ls9/d;->p:I

    .line 28
    .line 29
    iput-boolean v4, p0, Ls9/d;->s:Z

    .line 30
    .line 31
    sget-object v3, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    const/4 v3, 0x0

    .line 35
    if-eq v1, v2, :cond_2

    .line 36
    .line 37
    new-instance v0, Ljava/net/SocketTimeoutException;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v5, "sent ping but didn\'t receive pong within "

    .line 45
    .line 46
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-wide v5, p0, Ls9/d;->w:J

    .line 50
    .line 51
    invoke-virtual {v2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v5, "ms (after "

    .line 55
    .line 56
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sub-int/2addr v1, v4

    .line 60
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, " successful ping/pongs)"

    .line 64
    .line 65
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v0, v3}, Ls9/d;->p(Ljava/lang/Exception;Le9/D;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_2
    :try_start_2
    sget-object v1, Lt9/k;->k:Lt9/k;

    .line 80
    .line 81
    invoke-virtual {v0, v1}, Ls9/h;->m(Lt9/k;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :catch_0
    move-exception v0

    .line 86
    invoke-virtual {p0, v0, v3}, Ls9/d;->p(Ljava/lang/Exception;Le9/D;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    monitor-exit p0

    .line 91
    return-void

    .line 92
    :goto_1
    monitor-exit p0

    .line 93
    throw v0
.end method
