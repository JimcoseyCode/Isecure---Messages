.class final LF2/c$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field private final g:LC2/a;

.field private final h:LD2/b;

.field private final i:I

.field private final j:I

.field final synthetic k:LF2/c;


# direct methods
.method public constructor <init>(LF2/c;LC2/a;LD2/b;II)V
    .locals 1

    .line 1
    const-string v0, "animationBackend"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bitmapFrameCache"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LF2/c$a;->k:LF2/c;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p2, p0, LF2/c$a;->g:LC2/a;

    .line 17
    .line 18
    iput-object p3, p0, LF2/c$a;->h:LD2/b;

    .line 19
    .line 20
    iput p4, p0, LF2/c$a;->i:I

    .line 21
    .line 22
    iput p5, p0, LF2/c$a;->j:I

    .line 23
    .line 24
    return-void
.end method

.method private final a(II)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x2

    .line 4
    const/4 v3, 0x0

    .line 5
    if-eq p2, v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eq p2, v2, :cond_0

    .line 9
    .line 10
    invoke-static {v3}, Lg2/a;->B(Lg2/a;)V

    .line 11
    .line 12
    .line 13
    return v0

    .line 14
    :cond_0
    :try_start_0
    iget-object v2, p0, LF2/c$a;->k:LF2/c;

    .line 15
    .line 16
    invoke-static {v2}, LF2/c;->e(LF2/c;)LV2/d;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    iget-object v4, p0, LF2/c$a;->g:LC2/a;

    .line 21
    .line 22
    invoke-interface {v4}, LC2/a;->e()I

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    iget-object v5, p0, LF2/c$a;->g:LC2/a;

    .line 27
    .line 28
    invoke-interface {v5}, LC2/a;->c()I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    iget-object v6, p0, LF2/c$a;->k:LF2/c;

    .line 33
    .line 34
    invoke-static {v6}, LF2/c;->b(LF2/c;)Landroid/graphics/Bitmap$Config;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v2, v4, v5, v6}, LV2/d;->b(IILandroid/graphics/Bitmap$Config;)Lg2/a;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    move v2, v1

    .line 43
    :goto_0
    move-object v3, v0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    goto :goto_3

    .line 47
    :catch_0
    move-exception p1

    .line 48
    :try_start_1
    iget-object p2, p0, LF2/c$a;->k:LF2/c;

    .line 49
    .line 50
    invoke-static {p2}, LF2/c;->f(LF2/c;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    const-string v1, "Failed to create frame bitmap"

    .line 55
    .line 56
    invoke-static {p2, v1, p1}, Ld2/a;->F(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 57
    .line 58
    .line 59
    invoke-static {v3}, Lg2/a;->B(Lg2/a;)V

    .line 60
    .line 61
    .line 62
    return v0

    .line 63
    :cond_1
    :try_start_2
    iget-object v0, p0, LF2/c$a;->h:LD2/b;

    .line 64
    .line 65
    iget-object v4, p0, LF2/c$a;->g:LC2/a;

    .line 66
    .line 67
    invoke-interface {v4}, LC2/a;->e()I

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    iget-object v5, p0, LF2/c$a;->g:LC2/a;

    .line 72
    .line 73
    invoke-interface {v5}, LC2/a;->c()I

    .line 74
    .line 75
    .line 76
    move-result v5

    .line 77
    invoke-interface {v0, p1, v4, v5}, LD2/b;->a(III)Lg2/a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    goto :goto_0

    .line 82
    :goto_1
    invoke-direct {p0, p1, v3, p2}, LF2/c$a;->b(ILg2/a;I)Z

    .line 83
    .line 84
    .line 85
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 86
    invoke-static {v3}, Lg2/a;->B(Lg2/a;)V

    .line 87
    .line 88
    .line 89
    if-nez p2, :cond_3

    .line 90
    .line 91
    if-ne v2, v1, :cond_2

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_2
    invoke-direct {p0, p1, v2}, LF2/c$a;->a(II)Z

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    return p1

    .line 99
    :cond_3
    :goto_2
    return p2

    .line 100
    :goto_3
    invoke-static {v3}, Lg2/a;->B(Lg2/a;)V

    .line 101
    .line 102
    .line 103
    throw p1
.end method

.method private final b(ILg2/a;I)Z
    .locals 4

    .line 1
    invoke-static {p2}, Lg2/a;->d0(Lg2/a;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    if-eqz p2, :cond_2

    .line 10
    .line 11
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 12
    .line 13
    invoke-static {v0}, LF2/c;->c(LF2/c;)LD2/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p2}, Lg2/a;->J()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "get(...)"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    check-cast v2, Landroid/graphics/Bitmap;

    .line 27
    .line 28
    invoke-interface {v0, p1, v2}, LD2/c;->a(ILandroid/graphics/Bitmap;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 36
    .line 37
    invoke-static {v0}, LF2/c;->f(LF2/c;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v1, "Frame %d ready."

    .line 42
    .line 43
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v0, v1, v2}, Ld2/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 51
    .line 52
    invoke-static {v0}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    monitor-enter v0

    .line 57
    :try_start_0
    iget-object v1, p0, LF2/c$a;->h:LD2/b;

    .line 58
    .line 59
    invoke-interface {v1, p1, p2, p3}, LD2/b;->b(ILg2/a;I)V

    .line 60
    .line 61
    .line 62
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    monitor-exit v0

    .line 65
    const/4 p1, 0x1

    .line 66
    return p1

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    monitor-exit v0

    .line 69
    throw p1

    .line 70
    :cond_2
    :goto_0
    return v1
.end method


# virtual methods
.method public run()V
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, LF2/c$a;->h:LD2/b;

    .line 2
    .line 3
    iget v1, p0, LF2/c$a;->i:I

    .line 4
    .line 5
    invoke-interface {v0, v1}, LD2/b;->contains(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 12
    .line 13
    invoke-static {v0}, LF2/c;->f(LF2/c;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "Frame %d is cached already."

    .line 18
    .line 19
    iget v2, p0, LF2/c$a;->i:I

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0, v1, v2}, Ld2/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 29
    .line 30
    invoke-static {v0}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iget-object v1, p0, LF2/c$a;->k:LF2/c;

    .line 35
    .line 36
    monitor-enter v0

    .line 37
    :try_start_1
    invoke-static {v1}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iget v2, p0, LF2/c$a;->j:I

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 44
    .line 45
    .line 46
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    .line 48
    monitor-exit v0

    .line 49
    return-void

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    monitor-exit v0

    .line 52
    throw v1

    .line 53
    :catchall_1
    move-exception v0

    .line 54
    goto :goto_1

    .line 55
    :cond_0
    :try_start_2
    iget v0, p0, LF2/c$a;->i:I

    .line 56
    .line 57
    const/4 v1, 0x1

    .line 58
    invoke-direct {p0, v0, v1}, LF2/c$a;->a(II)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 65
    .line 66
    invoke-static {v0}, LF2/c;->f(LF2/c;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    const-string v1, "Prepared frame %d."

    .line 71
    .line 72
    iget v2, p0, LF2/c$a;->i:I

    .line 73
    .line 74
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    invoke-static {v0, v1, v2}, Ld2/a;->y(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 83
    .line 84
    invoke-static {v0}, LF2/c;->f(LF2/c;)Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "Could not prepare frame %d."

    .line 89
    .line 90
    iget v2, p0, LF2/c$a;->i:I

    .line 91
    .line 92
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {v0, v1, v2}, Ld2/a;->k(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 101
    .line 102
    .line 103
    :goto_0
    iget-object v0, p0, LF2/c$a;->k:LF2/c;

    .line 104
    .line 105
    invoke-static {v0}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    iget-object v1, p0, LF2/c$a;->k:LF2/c;

    .line 110
    .line 111
    monitor-enter v0

    .line 112
    :try_start_3
    invoke-static {v1}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    iget v2, p0, LF2/c$a;->j:I

    .line 117
    .line 118
    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->remove(I)V

    .line 119
    .line 120
    .line 121
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 122
    .line 123
    monitor-exit v0

    .line 124
    return-void

    .line 125
    :catchall_2
    move-exception v1

    .line 126
    monitor-exit v0

    .line 127
    throw v1

    .line 128
    :goto_1
    iget-object v1, p0, LF2/c$a;->k:LF2/c;

    .line 129
    .line 130
    invoke-static {v1}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    iget-object v2, p0, LF2/c$a;->k:LF2/c;

    .line 135
    .line 136
    monitor-enter v1

    .line 137
    :try_start_4
    invoke-static {v2}, LF2/c;->d(LF2/c;)Landroid/util/SparseArray;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    iget v3, p0, LF2/c$a;->j:I

    .line 142
    .line 143
    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->remove(I)V

    .line 144
    .line 145
    .line 146
    sget-object v2, Li7/B;->a:Li7/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 147
    .line 148
    monitor-exit v1

    .line 149
    throw v0

    .line 150
    :catchall_3
    move-exception v0

    .line 151
    monitor-exit v1

    .line 152
    throw v0
.end method
