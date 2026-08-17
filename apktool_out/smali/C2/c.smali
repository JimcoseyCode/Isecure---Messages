.class public LC2/c;
.super LC2/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LC2/c$b;
    }
.end annotation


# instance fields
.field private final f:Lj2/b;

.field private final g:Ljava/util/concurrent/ScheduledExecutorService;

.field private h:Z

.field private i:J

.field private j:J

.field private k:J

.field private l:LC2/c$b;

.field private final m:Ljava/lang/Runnable;


# direct methods
.method private constructor <init>(LC2/a;LC2/c$b;Lj2/b;Ljava/util/concurrent/ScheduledExecutorService;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LC2/b;-><init>(LC2/a;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-boolean p1, p0, LC2/c;->h:Z

    .line 6
    .line 7
    const-wide/16 v0, 0x7d0

    .line 8
    .line 9
    iput-wide v0, p0, LC2/c;->j:J

    .line 10
    .line 11
    const-wide/16 v0, 0x3e8

    .line 12
    .line 13
    iput-wide v0, p0, LC2/c;->k:J

    .line 14
    .line 15
    new-instance p1, LC2/c$a;

    .line 16
    .line 17
    invoke-direct {p1, p0}, LC2/c$a;-><init>(LC2/c;)V

    .line 18
    .line 19
    .line 20
    iput-object p1, p0, LC2/c;->m:Ljava/lang/Runnable;

    .line 21
    .line 22
    iput-object p2, p0, LC2/c;->l:LC2/c$b;

    .line 23
    .line 24
    iput-object p3, p0, LC2/c;->f:Lj2/b;

    .line 25
    .line 26
    iput-object p4, p0, LC2/c;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 27
    .line 28
    return-void
.end method

.method static bridge synthetic f(LC2/c;)LC2/c$b;
    .locals 0

    .line 1
    iget-object p0, p0, LC2/c;->l:LC2/c$b;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic o(LC2/c;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LC2/c;->h:Z

    .line 2
    .line 3
    return-void
.end method

.method static bridge synthetic p(LC2/c;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, LC2/c;->t()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method static bridge synthetic q(LC2/c;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LC2/c;->u()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static r(LC2/a;LC2/c$b;Lj2/b;Ljava/util/concurrent/ScheduledExecutorService;)LC2/b;
    .locals 1

    .line 1
    new-instance v0, LC2/c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2, p3}, LC2/c;-><init>(LC2/a;LC2/c$b;Lj2/b;Ljava/util/concurrent/ScheduledExecutorService;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static s(LC2/a;Lj2/b;Ljava/util/concurrent/ScheduledExecutorService;)LC2/b;
    .locals 1

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, LC2/c$b;

    .line 3
    .line 4
    invoke-static {p0, v0, p1, p2}, LC2/c;->r(LC2/a;LC2/c$b;Lj2/b;Ljava/util/concurrent/ScheduledExecutorService;)LC2/b;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    return-object p0
.end method

.method private t()Z
    .locals 4

    .line 1
    iget-object v0, p0, LC2/c;->f:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-wide v2, p0, LC2/c;->i:J

    .line 8
    .line 9
    sub-long/2addr v0, v2

    .line 10
    iget-wide v2, p0, LC2/c;->j:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private declared-synchronized u()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, LC2/c;->h:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LC2/c;->h:Z

    .line 8
    .line 9
    iget-object v0, p0, LC2/c;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 10
    .line 11
    iget-object v1, p0, LC2/c;->m:Ljava/lang/Runnable;

    .line 12
    .line 13
    iget-wide v2, p0, LC2/c;->k:J

    .line 14
    .line 15
    sget-object v4, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3, v4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v0

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    monitor-exit p0

    .line 24
    return-void

    .line 25
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
.end method


# virtual methods
.method public n(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, LC2/c;->f:Lj2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Lj2/b;->now()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iput-wide v0, p0, LC2/c;->i:J

    .line 8
    .line 9
    invoke-super {p0, p1, p2, p3}, LC2/b;->n(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-direct {p0}, LC2/c;->u()V

    .line 14
    .line 15
    .line 16
    return p1
.end method
