.class public final LK/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/V$i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK/k$a;
    }
.end annotation


# static fields
.field public static final e:LK/k$a;


# instance fields
.field private final a:Ly/V$i;

.field private final b:Ljava/lang/Object;

.field private c:Z

.field private d:Ly/V$j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK/k;->e:LK/k$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Ly/V$i;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/k;->a:Ly/V$i;

    .line 3
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LK/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ly/V$i;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LK/k;-><init>(Ly/V$i;)V

    return-void
.end method

.method public static synthetic b(LK/k;)V
    .locals 0

    .line 1
    invoke-static {p0}, LK/k;->c(LK/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final c(LK/k;)V
    .locals 3

    .line 1
    iget-object v0, p0, LK/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/k;->d:Ly/V$j;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    const-string v1, "ScreenFlashWrapper"

    .line 9
    .line 10
    const-string v2, "apply: pendingListener is null!"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-direct {p0}, LK/k;->e()V

    .line 19
    .line 20
    .line 21
    sget-object p0, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 22
    .line 23
    monitor-exit v0

    .line 24
    return-void

    .line 25
    :goto_1
    monitor-exit v0

    .line 26
    throw p0
.end method

.method private final d()V
    .locals 3

    .line 1
    iget-object v0, p0, LK/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-boolean v1, p0, LK/k;->c:Z

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    iget-object v1, p0, LK/k;->a:Ly/V$i;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-interface {v1}, Ly/V$i;->clear()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception v1

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    const-string v1, "ScreenFlashWrapper"

    .line 19
    .line 20
    const-string v2, "completePendingScreenFlashClear: screenFlash is null!"

    .line 21
    .line 22
    invoke-static {v1, v2}, Ly/h0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const-string v1, "ScreenFlashWrapper"

    .line 27
    .line 28
    const-string v2, "completePendingScreenFlashClear: none pending!"

    .line 29
    .line 30
    invoke-static {v1, v2}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    const/4 v1, 0x0

    .line 34
    iput-boolean v1, p0, LK/k;->c:Z

    .line 35
    .line 36
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    monitor-exit v0

    .line 41
    throw v1
.end method

.method private final e()V
    .locals 2

    .line 1
    iget-object v0, p0, LK/k;->b:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LK/k;->d:Ly/V$j;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-interface {v1}, Ly/V$j;->a()V

    .line 9
    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    goto :goto_1

    .line 14
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 15
    iput-object v1, p0, LK/k;->d:Ly/V$j;

    .line 16
    .line 17
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :goto_1
    monitor-exit v0

    .line 22
    throw v1
.end method

.method public static final g(Ly/V$i;)LK/k;
    .locals 1

    .line 1
    sget-object v0, LK/k;->e:LK/k$a;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LK/k$a;->a(Ly/V$i;)LK/k;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public a(JLy/V$j;)V
    .locals 2

    .line 1
    const-string v0, "screenFlashListener"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LK/k;->b:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 v1, 0x1

    .line 10
    :try_start_0
    iput-boolean v1, p0, LK/k;->c:Z

    .line 11
    .line 12
    iput-object p3, p0, LK/k;->d:Ly/V$j;

    .line 13
    .line 14
    sget-object p3, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    monitor-exit v0

    .line 17
    iget-object p3, p0, LK/k;->a:Ly/V$i;

    .line 18
    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    new-instance v0, LK/j;

    .line 22
    .line 23
    invoke-direct {v0, p0}, LK/j;-><init>(LK/k;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p3, p1, p2, v0}, Ly/V$i;->a(JLy/V$j;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    const-string p1, "ScreenFlashWrapper"

    .line 31
    .line 32
    const-string p2, "apply: screenFlash is null!"

    .line 33
    .line 34
    invoke-static {p1, p2}, Ly/h0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, LK/k;->e()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catchall_0
    move-exception p1

    .line 42
    monitor-exit v0

    .line 43
    throw p1
.end method

.method public clear()V
    .locals 0

    .line 1
    invoke-direct {p0}, LK/k;->d()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final f()V
    .locals 0

    .line 1
    invoke-direct {p0}, LK/k;->e()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LK/k;->d()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final h()Ly/V$i;
    .locals 1

    .line 1
    iget-object v0, p0, LK/k;->a:Ly/V$i;

    .line 2
    .line 3
    return-object v0
.end method
