.class public final LF2/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF2/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF2/c$a;
    }
.end annotation


# instance fields
.field private final a:LV2/d;

.field private final b:LD2/c;

.field private final c:Landroid/graphics/Bitmap$Config;

.field private final d:Ljava/util/concurrent/ExecutorService;

.field private final e:Ljava/lang/Class;

.field private final f:Landroid/util/SparseArray;


# direct methods
.method public constructor <init>(LV2/d;LD2/c;Landroid/graphics/Bitmap$Config;Ljava/util/concurrent/ExecutorService;)V
    .locals 1

    .line 1
    const-string v0, "platformBitmapFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bitmapFrameRenderer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "bitmapConfig"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "executorService"

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
    iput-object p1, p0, LF2/c;->a:LV2/d;

    .line 25
    .line 26
    iput-object p2, p0, LF2/c;->b:LD2/c;

    .line 27
    .line 28
    iput-object p3, p0, LF2/c;->c:Landroid/graphics/Bitmap$Config;

    .line 29
    .line 30
    iput-object p4, p0, LF2/c;->d:Ljava/util/concurrent/ExecutorService;

    .line 31
    .line 32
    const-class p1, LF2/c;

    .line 33
    .line 34
    iput-object p1, p0, LF2/c;->e:Ljava/lang/Class;

    .line 35
    .line 36
    new-instance p1, Landroid/util/SparseArray;

    .line 37
    .line 38
    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p1, p0, LF2/c;->f:Landroid/util/SparseArray;

    .line 42
    .line 43
    return-void
.end method

.method public static final synthetic b(LF2/c;)Landroid/graphics/Bitmap$Config;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/c;->c:Landroid/graphics/Bitmap$Config;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(LF2/c;)LD2/c;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/c;->b:LD2/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LF2/c;)Landroid/util/SparseArray;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/c;->f:Landroid/util/SparseArray;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LF2/c;)LV2/d;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/c;->a:LV2/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic f(LF2/c;)Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, LF2/c;->e:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method private final g(LC2/a;I)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    mul-int/lit8 p1, p1, 0x1f

    .line 6
    .line 7
    add-int/2addr p1, p2

    .line 8
    return p1
.end method


# virtual methods
.method public a(LD2/b;LC2/a;I)Z
    .locals 9

    .line 1
    const-string v0, "bitmapFrameCache"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "animationBackend"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2, p3}, LF2/c;->g(LC2/a;I)I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget-object v7, p0, LF2/c;->f:Landroid/util/SparseArray;

    .line 16
    .line 17
    monitor-enter v7

    .line 18
    :try_start_0
    iget-object v0, p0, LF2/c;->f:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v0, v6}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 24
    const/4 v8, 0x1

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    :try_start_1
    iget-object p1, p0, LF2/c;->e:Ljava/lang/Class;

    .line 28
    .line 29
    const-string p2, "Already scheduled decode job for frame %d"

    .line 30
    .line 31
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    invoke-static {p1, p2, p3}, Ld2/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    monitor-exit v7

    .line 39
    return v8

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    move-object p1, v0

    .line 42
    move-object v2, p0

    .line 43
    goto :goto_1

    .line 44
    :cond_0
    :try_start_2
    invoke-interface {p1, p3}, LD2/b;->contains(I)Z

    .line 45
    .line 46
    .line 47
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    :try_start_3
    iget-object p1, p0, LF2/c;->e:Ljava/lang/Class;

    .line 51
    .line 52
    const-string p2, "Frame %d is cached already."

    .line 53
    .line 54
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-static {p1, p2, p3}, Ld2/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 59
    .line 60
    .line 61
    monitor-exit v7

    .line 62
    return v8

    .line 63
    :cond_1
    :try_start_4
    new-instance v1, LF2/c$a;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 64
    .line 65
    move-object v2, p0

    .line 66
    move-object v4, p1

    .line 67
    move-object v3, p2

    .line 68
    move v5, p3

    .line 69
    :try_start_5
    invoke-direct/range {v1 .. v6}, LF2/c$a;-><init>(LF2/c;LC2/a;LD2/b;II)V

    .line 70
    .line 71
    .line 72
    iget-object p1, v2, LF2/c;->f:Landroid/util/SparseArray;

    .line 73
    .line 74
    invoke-virtual {p1, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p1, v2, LF2/c;->d:Ljava/util/concurrent/ExecutorService;

    .line 78
    .line 79
    invoke-interface {p1, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 83
    .line 84
    monitor-exit v7

    .line 85
    return v8

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    :goto_0
    move-object p1, v0

    .line 88
    goto :goto_1

    .line 89
    :catchall_2
    move-exception v0

    .line 90
    move-object v2, p0

    .line 91
    goto :goto_0

    .line 92
    :goto_1
    monitor-exit v7

    .line 93
    throw p1
.end method
