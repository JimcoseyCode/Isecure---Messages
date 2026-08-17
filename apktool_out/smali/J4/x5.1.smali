.class public final LJ4/x5;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static k:LJ4/N5;

.field private static final l:LJ4/P5;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:LJ4/q5;

.field private final d:Lc6/m;

.field private final e:LP4/l;

.field private final f:LP4/l;

.field private final g:Ljava/lang/String;

.field private final h:I

.field private final i:Ljava/util/Map;

.field private final j:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "optional-module-barcode"

    .line 2
    .line 3
    const-string v1, "com.google.android.gms.vision.barcode"

    .line 4
    .line 5
    invoke-static {v0, v1}, LJ4/P5;->c(Ljava/lang/Object;Ljava/lang/Object;)LJ4/P5;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LJ4/x5;->l:LJ4/P5;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lc6/m;LJ4/q5;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LJ4/x5;->i:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LJ4/x5;->j:Ljava/util/Map;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, LJ4/x5;->a:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Lc6/c;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    iput-object v0, p0, LJ4/x5;->b:Ljava/lang/String;

    .line 29
    .line 30
    iput-object p2, p0, LJ4/x5;->d:Lc6/m;

    .line 31
    .line 32
    iput-object p3, p0, LJ4/x5;->c:LJ4/q5;

    .line 33
    .line 34
    invoke-static {}, LJ4/K5;->a()LJ4/K5;

    .line 35
    .line 36
    .line 37
    iput-object p4, p0, LJ4/x5;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {}, Lc6/g;->a()Lc6/g;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    new-instance v0, LJ4/u5;

    .line 44
    .line 45
    invoke-direct {v0, p0}, LJ4/u5;-><init>(LJ4/x5;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p3, v0}, Lc6/g;->b(Ljava/util/concurrent/Callable;)LP4/l;

    .line 49
    .line 50
    .line 51
    move-result-object p3

    .line 52
    iput-object p3, p0, LJ4/x5;->e:LP4/l;

    .line 53
    .line 54
    invoke-static {}, Lc6/g;->a()Lc6/g;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, LJ4/v5;

    .line 62
    .line 63
    invoke-direct {v0, p2}, LJ4/v5;-><init>(Lc6/m;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p3, v0}, Lc6/g;->b(Ljava/util/concurrent/Callable;)LP4/l;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    iput-object p2, p0, LJ4/x5;->f:LP4/l;

    .line 71
    .line 72
    sget-object p2, LJ4/x5;->l:LJ4/P5;

    .line 73
    .line 74
    invoke-virtual {p2, p4}, LJ4/P5;->containsKey(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result p3

    .line 78
    if-eqz p3, :cond_0

    .line 79
    .line 80
    invoke-virtual {p2, p4}, LJ4/P5;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p1, p2}, Lcom/google/android/gms/dynamite/DynamiteModule;->b(Landroid/content/Context;Ljava/lang/String;)I

    .line 87
    .line 88
    .line 89
    move-result p1

    .line 90
    goto :goto_0

    .line 91
    :cond_0
    const/4 p1, -0x1

    .line 92
    :goto_0
    iput p1, p0, LJ4/x5;->h:I

    .line 93
    .line 94
    return-void
.end method

.method private static declared-synchronized d()LJ4/N5;
    .locals 5

    .line 1
    const-class v0, LJ4/x5;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LJ4/x5;->k:LJ4/N5;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    monitor-exit v0

    .line 9
    return-object v1

    .line 10
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-static {v1}, LD0/e;->a(Landroid/content/res/Configuration;)LD0/h;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    new-instance v2, LJ4/n5;

    .line 23
    .line 24
    invoke-direct {v2}, LJ4/n5;-><init>()V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    :goto_0
    invoke-virtual {v1}, LD0/h;->f()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-ge v3, v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v3}, LD0/h;->c(I)Ljava/util/Locale;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-static {v4}, Lc6/c;->b(Ljava/util/Locale;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v2, v4}, LJ4/n5;->c(Ljava/lang/Object;)LJ4/n5;

    .line 43
    .line 44
    .line 45
    add-int/lit8 v3, v3, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {v2}, LJ4/n5;->d()LJ4/N5;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    sput-object v1, LJ4/x5;->k:LJ4/N5;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    monitor-exit v0

    .line 57
    return-object v1

    .line 58
    :goto_1
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 59
    throw v1
.end method


# virtual methods
.method final synthetic a()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-static {}, Lr4/g;->a()Lr4/g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LJ4/x5;->g:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lr4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method final synthetic b(LJ4/p5;LJ4/F3;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-interface {p1, p2}, LJ4/p5;->d(LJ4/F3;)LJ4/p5;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, LJ4/p5;->a()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    new-instance v0, LJ4/K4;

    .line 9
    .line 10
    invoke-direct {v0}, LJ4/K4;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, LJ4/x5;->a:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, LJ4/K4;->b(Ljava/lang/String;)LJ4/K4;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LJ4/x5;->b:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, LJ4/K4;->c(Ljava/lang/String;)LJ4/K4;

    .line 21
    .line 22
    .line 23
    invoke-static {}, LJ4/x5;->d()LJ4/N5;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, LJ4/K4;->h(LJ4/N5;)LJ4/K4;

    .line 28
    .line 29
    .line 30
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, LJ4/K4;->g(Ljava/lang/Boolean;)LJ4/K4;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p2}, LJ4/K4;->l(Ljava/lang/String;)LJ4/K4;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p3}, LJ4/K4;->j(Ljava/lang/String;)LJ4/K4;

    .line 39
    .line 40
    .line 41
    iget-object p2, p0, LJ4/x5;->f:LP4/l;

    .line 42
    .line 43
    invoke-virtual {p2}, LP4/l;->p()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    iget-object p2, p0, LJ4/x5;->f:LP4/l;

    .line 50
    .line 51
    invoke-virtual {p2}, LP4/l;->l()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Ljava/lang/String;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    iget-object p2, p0, LJ4/x5;->d:Lc6/m;

    .line 59
    .line 60
    invoke-virtual {p2}, Lc6/m;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :goto_0
    invoke-virtual {v0, p2}, LJ4/K4;->i(Ljava/lang/String;)LJ4/K4;

    .line 65
    .line 66
    .line 67
    const/16 p2, 0xa

    .line 68
    .line 69
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {v0, p2}, LJ4/K4;->d(Ljava/lang/Integer;)LJ4/K4;

    .line 74
    .line 75
    .line 76
    iget p2, p0, LJ4/x5;->h:I

    .line 77
    .line 78
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    invoke-virtual {v0, p2}, LJ4/K4;->k(Ljava/lang/Integer;)LJ4/K4;

    .line 83
    .line 84
    .line 85
    invoke-interface {p1, v0}, LJ4/p5;->c(LJ4/K4;)LJ4/p5;

    .line 86
    .line 87
    .line 88
    iget-object p2, p0, LJ4/x5;->c:LJ4/q5;

    .line 89
    .line 90
    invoke-interface {p2, p1}, LJ4/q5;->a(LJ4/p5;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method

.method public final c(LJ4/H5;LJ4/F3;)V
    .locals 9

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, LJ4/x5;->i:Ljava/util/Map;

    .line 6
    .line 7
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v2, p0, LJ4/x5;->i:Ljava/util/Map;

    .line 15
    .line 16
    invoke-interface {v2, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    check-cast v2, Ljava/lang/Long;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    sub-long v2, v0, v2

    .line 27
    .line 28
    sget-object v4, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    const-wide/16 v5, 0x1e

    .line 31
    .line 32
    invoke-virtual {v4, v5, v6}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    cmp-long v2, v2, v4

    .line 37
    .line 38
    if-gtz v2, :cond_1

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    :goto_0
    iget-object v2, p0, LJ4/x5;->i:Ljava/util/Map;

    .line 42
    .line 43
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v2, p2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    iget v0, p1, LJ4/H5;->a:I

    .line 51
    .line 52
    iget v1, p1, LJ4/H5;->b:I

    .line 53
    .line 54
    iget v2, p1, LJ4/H5;->c:I

    .line 55
    .line 56
    iget v3, p1, LJ4/H5;->d:I

    .line 57
    .line 58
    iget v4, p1, LJ4/H5;->e:I

    .line 59
    .line 60
    iget-wide v5, p1, LJ4/H5;->f:J

    .line 61
    .line 62
    iget p1, p1, LJ4/H5;->g:I

    .line 63
    .line 64
    new-instance v7, LJ4/x3;

    .line 65
    .line 66
    invoke-direct {v7}, LJ4/x3;-><init>()V

    .line 67
    .line 68
    .line 69
    const/4 v8, -0x1

    .line 70
    if-eq v0, v8, :cond_6

    .line 71
    .line 72
    const/16 v8, 0x23

    .line 73
    .line 74
    if-eq v0, v8, :cond_5

    .line 75
    .line 76
    const v8, 0x32315659

    .line 77
    .line 78
    .line 79
    if-eq v0, v8, :cond_4

    .line 80
    .line 81
    const/16 v8, 0x10

    .line 82
    .line 83
    if-eq v0, v8, :cond_3

    .line 84
    .line 85
    const/16 v8, 0x11

    .line 86
    .line 87
    if-eq v0, v8, :cond_2

    .line 88
    .line 89
    sget-object v0, LJ4/s3;->h:LJ4/s3;

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    sget-object v0, LJ4/s3;->j:LJ4/s3;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_3
    sget-object v0, LJ4/s3;->i:LJ4/s3;

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    sget-object v0, LJ4/s3;->k:LJ4/s3;

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_5
    sget-object v0, LJ4/s3;->l:LJ4/s3;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_6
    sget-object v0, LJ4/s3;->n:LJ4/s3;

    .line 105
    .line 106
    :goto_1
    invoke-virtual {v7, v0}, LJ4/x3;->d(LJ4/s3;)LJ4/x3;

    .line 107
    .line 108
    .line 109
    const/4 v0, 0x1

    .line 110
    if-eq v1, v0, :cond_a

    .line 111
    .line 112
    const/4 v0, 0x2

    .line 113
    if-eq v1, v0, :cond_9

    .line 114
    .line 115
    const/4 v0, 0x3

    .line 116
    if-eq v1, v0, :cond_8

    .line 117
    .line 118
    const/4 v0, 0x4

    .line 119
    if-eq v1, v0, :cond_7

    .line 120
    .line 121
    sget-object v0, LJ4/y3;->m:LJ4/y3;

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_7
    sget-object v0, LJ4/y3;->l:LJ4/y3;

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_8
    sget-object v0, LJ4/y3;->k:LJ4/y3;

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_9
    sget-object v0, LJ4/y3;->j:LJ4/y3;

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_a
    sget-object v0, LJ4/y3;->i:LJ4/y3;

    .line 134
    .line 135
    :goto_2
    invoke-virtual {v7, v0}, LJ4/x3;->f(LJ4/y3;)LJ4/x3;

    .line 136
    .line 137
    .line 138
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v7, v0}, LJ4/x3;->c(Ljava/lang/Integer;)LJ4/x3;

    .line 143
    .line 144
    .line 145
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v7, v0}, LJ4/x3;->e(Ljava/lang/Integer;)LJ4/x3;

    .line 150
    .line 151
    .line 152
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v7, v0}, LJ4/x3;->g(Ljava/lang/Integer;)LJ4/x3;

    .line 157
    .line 158
    .line 159
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-virtual {v7, v0}, LJ4/x3;->b(Ljava/lang/Long;)LJ4/x3;

    .line 164
    .line 165
    .line 166
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {v7, p1}, LJ4/x3;->h(Ljava/lang/Integer;)LJ4/x3;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v7}, LJ4/x3;->j()LJ4/A3;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    new-instance v0, LJ4/G3;

    .line 178
    .line 179
    invoke-direct {v0}, LJ4/G3;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, p1}, LJ4/G3;->d(LJ4/A3;)LJ4/G3;

    .line 183
    .line 184
    .line 185
    invoke-static {v0}, LJ4/y5;->e(LJ4/G3;)LJ4/p5;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iget-object v0, p0, LJ4/x5;->e:LP4/l;

    .line 190
    .line 191
    invoke-virtual {v0}, LP4/l;->p()Z

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    if-eqz v0, :cond_b

    .line 196
    .line 197
    iget-object v0, p0, LJ4/x5;->e:LP4/l;

    .line 198
    .line 199
    invoke-virtual {v0}, LP4/l;->l()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, Ljava/lang/String;

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_b
    invoke-static {}, Lr4/g;->a()Lr4/g;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    iget-object v1, p0, LJ4/x5;->g:Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lr4/g;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    :goto_3
    invoke-static {}, Lc6/g;->d()Ljava/util/concurrent/Executor;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    new-instance v2, LJ4/w5;

    .line 221
    .line 222
    invoke-direct {v2, p0, p1, p2, v0}, LJ4/w5;-><init>(LJ4/x5;LJ4/p5;LJ4/F3;Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 226
    .line 227
    .line 228
    return-void
.end method
