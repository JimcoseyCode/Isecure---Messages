.class public final Lm9/i$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lt9/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation


# instance fields
.field private final g:Lt9/h;

.field private h:Le9/t;

.field private i:Z

.field private j:Z

.field final synthetic k:Lm9/i;


# direct methods
.method public constructor <init>(Lm9/i;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lm9/i$b;->j:Z

    .line 7
    .line 8
    new-instance p1, Lt9/h;

    .line 9
    .line 10
    invoke-direct {p1}, Lt9/h;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lm9/i$b;->g:Lt9/h;

    .line 14
    .line 15
    return-void
.end method

.method private final d(Z)V
    .locals 12

    .line 1
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 5
    .line 6
    invoke-virtual {v0}, Lm9/i;->s()Lm9/i$d;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Lt9/f;->v()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    .line 12
    .line 13
    :goto_0
    :try_start_1
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 14
    .line 15
    invoke-virtual {v0}, Lm9/i;->r()J

    .line 16
    .line 17
    .line 18
    move-result-wide v2

    .line 19
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 20
    .line 21
    invoke-virtual {v0}, Lm9/i;->q()J

    .line 22
    .line 23
    .line 24
    move-result-wide v4

    .line 25
    cmp-long v0, v2, v4

    .line 26
    .line 27
    if-ltz v0, :cond_0

    .line 28
    .line 29
    iget-boolean v0, p0, Lm9/i$b;->j:Z

    .line 30
    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    iget-boolean v0, p0, Lm9/i$b;->i:Z

    .line 34
    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 38
    .line 39
    invoke-virtual {v0}, Lm9/i;->h()Lm9/b;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-nez v0, :cond_0

    .line 44
    .line 45
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 46
    .line 47
    invoke-virtual {v0}, Lm9/i;->D()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    move-object p1, v0

    .line 53
    goto/16 :goto_3

    .line 54
    .line 55
    :cond_0
    :try_start_2
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 56
    .line 57
    invoke-virtual {v0}, Lm9/i;->s()Lm9/i$d;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Lm9/i$d;->C()V

    .line 62
    .line 63
    .line 64
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 65
    .line 66
    invoke-virtual {v0}, Lm9/i;->c()V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 70
    .line 71
    invoke-virtual {v0}, Lm9/i;->q()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 76
    .line 77
    invoke-virtual {v0}, Lm9/i;->r()J

    .line 78
    .line 79
    .line 80
    move-result-wide v4

    .line 81
    sub-long/2addr v2, v4

    .line 82
    iget-object v0, p0, Lm9/i$b;->g:Lt9/h;

    .line 83
    .line 84
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 85
    .line 86
    .line 87
    move-result-wide v4

    .line 88
    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    .line 89
    .line 90
    .line 91
    move-result-wide v10

    .line 92
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 93
    .line 94
    invoke-virtual {v0}, Lm9/i;->r()J

    .line 95
    .line 96
    .line 97
    move-result-wide v2

    .line 98
    add-long/2addr v2, v10

    .line 99
    invoke-virtual {v0, v2, v3}, Lm9/i;->B(J)V

    .line 100
    .line 101
    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    iget-object p1, p0, Lm9/i$b;->g:Lt9/h;

    .line 105
    .line 106
    invoke-virtual {p1}, Lt9/h;->size()J

    .line 107
    .line 108
    .line 109
    move-result-wide v2

    .line 110
    cmp-long p1, v10, v2

    .line 111
    .line 112
    if-nez p1, :cond_1

    .line 113
    .line 114
    iget-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 115
    .line 116
    invoke-virtual {p1}, Lm9/i;->h()Lm9/b;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    if-nez p1, :cond_1

    .line 121
    .line 122
    const/4 p1, 0x1

    .line 123
    :goto_1
    move v8, p1

    .line 124
    goto :goto_2

    .line 125
    :catchall_1
    move-exception v0

    .line 126
    move-object p1, v0

    .line 127
    goto :goto_4

    .line 128
    :cond_1
    const/4 p1, 0x0

    .line 129
    goto :goto_1

    .line 130
    :goto_2
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 131
    .line 132
    monitor-exit v1

    .line 133
    iget-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 134
    .line 135
    invoke-virtual {p1}, Lm9/i;->s()Lm9/i$d;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1}, Lt9/f;->v()V

    .line 140
    .line 141
    .line 142
    :try_start_3
    iget-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 143
    .line 144
    invoke-virtual {p1}, Lm9/i;->g()Lm9/f;

    .line 145
    .line 146
    .line 147
    move-result-object v6

    .line 148
    iget-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 149
    .line 150
    invoke-virtual {p1}, Lm9/i;->j()I

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    iget-object v9, p0, Lm9/i$b;->g:Lt9/h;

    .line 155
    .line 156
    invoke-virtual/range {v6 .. v11}, Lm9/f;->g1(IZLt9/h;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 157
    .line 158
    .line 159
    iget-object p1, p0, Lm9/i$b;->k:Lm9/i;

    .line 160
    .line 161
    invoke-virtual {p1}, Lm9/i;->s()Lm9/i$d;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-virtual {p1}, Lm9/i$d;->C()V

    .line 166
    .line 167
    .line 168
    return-void

    .line 169
    :catchall_2
    move-exception v0

    .line 170
    move-object p1, v0

    .line 171
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 172
    .line 173
    invoke-virtual {v0}, Lm9/i;->s()Lm9/i$d;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v0}, Lm9/i$d;->C()V

    .line 178
    .line 179
    .line 180
    throw p1

    .line 181
    :goto_3
    :try_start_4
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 182
    .line 183
    invoke-virtual {v0}, Lm9/i;->s()Lm9/i$d;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    invoke-virtual {v0}, Lm9/i$d;->C()V

    .line 188
    .line 189
    .line 190
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 191
    :goto_4
    monitor-exit v1

    .line 192
    throw p1
.end method


# virtual methods
.method public close()V
    .locals 10

    .line 1
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 2
    .line 3
    sget-boolean v1, Lf9/c;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 59
    .line 60
    monitor-enter v1

    .line 61
    :try_start_0
    iget-boolean v0, p0, Lm9/i$b;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    monitor-exit v1

    .line 66
    return-void

    .line 67
    :cond_2
    :try_start_1
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 68
    .line 69
    invoke-virtual {v0}, Lm9/i;->h()Lm9/b;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const/4 v2, 0x0

    .line 74
    const/4 v3, 0x1

    .line 75
    if-nez v0, :cond_3

    .line 76
    .line 77
    move v0, v3

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    move v0, v2

    .line 80
    :goto_1
    sget-object v4, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    monitor-exit v1

    .line 83
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 84
    .line 85
    invoke-virtual {v1}, Lm9/i;->o()Lm9/i$b;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    iget-boolean v1, v1, Lm9/i$b;->j:Z

    .line 90
    .line 91
    if-nez v1, :cond_8

    .line 92
    .line 93
    iget-object v1, p0, Lm9/i$b;->g:Lt9/h;

    .line 94
    .line 95
    invoke-virtual {v1}, Lt9/h;->size()J

    .line 96
    .line 97
    .line 98
    move-result-wide v4

    .line 99
    const-wide/16 v6, 0x0

    .line 100
    .line 101
    cmp-long v1, v4, v6

    .line 102
    .line 103
    if-lez v1, :cond_4

    .line 104
    .line 105
    move v1, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move v1, v2

    .line 108
    :goto_2
    iget-object v4, p0, Lm9/i$b;->h:Le9/t;

    .line 109
    .line 110
    if-eqz v4, :cond_6

    .line 111
    .line 112
    :goto_3
    iget-object v1, p0, Lm9/i$b;->g:Lt9/h;

    .line 113
    .line 114
    invoke-virtual {v1}, Lt9/h;->size()J

    .line 115
    .line 116
    .line 117
    move-result-wide v4

    .line 118
    cmp-long v1, v4, v6

    .line 119
    .line 120
    if-lez v1, :cond_5

    .line 121
    .line 122
    invoke-direct {p0, v2}, Lm9/i$b;->d(Z)V

    .line 123
    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_5
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 127
    .line 128
    invoke-virtual {v1}, Lm9/i;->g()Lm9/f;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    iget-object v2, p0, Lm9/i$b;->k:Lm9/i;

    .line 133
    .line 134
    invoke-virtual {v2}, Lm9/i;->j()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    iget-object v4, p0, Lm9/i$b;->h:Le9/t;

    .line 139
    .line 140
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v4}, Lf9/c;->L(Le9/t;)Ljava/util/List;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v1, v2, v0, v4}, Lm9/f;->h1(IZLjava/util/List;)V

    .line 148
    .line 149
    .line 150
    goto :goto_5

    .line 151
    :cond_6
    if-eqz v1, :cond_7

    .line 152
    .line 153
    :goto_4
    iget-object v0, p0, Lm9/i$b;->g:Lt9/h;

    .line 154
    .line 155
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 156
    .line 157
    .line 158
    move-result-wide v0

    .line 159
    cmp-long v0, v0, v6

    .line 160
    .line 161
    if-lez v0, :cond_8

    .line 162
    .line 163
    invoke-direct {p0, v3}, Lm9/i$b;->d(Z)V

    .line 164
    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_7
    if-eqz v0, :cond_8

    .line 168
    .line 169
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 170
    .line 171
    invoke-virtual {v0}, Lm9/i;->g()Lm9/f;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 176
    .line 177
    invoke-virtual {v0}, Lm9/i;->j()I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    const/4 v7, 0x0

    .line 182
    const-wide/16 v8, 0x0

    .line 183
    .line 184
    const/4 v6, 0x1

    .line 185
    invoke-virtual/range {v4 .. v9}, Lm9/f;->g1(IZLt9/h;J)V

    .line 186
    .line 187
    .line 188
    :cond_8
    :goto_5
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 189
    .line 190
    monitor-enter v1

    .line 191
    :try_start_2
    iput-boolean v3, p0, Lm9/i$b;->i:Z

    .line 192
    .line 193
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    .line 195
    monitor-exit v1

    .line 196
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 197
    .line 198
    invoke-virtual {v0}, Lm9/i;->g()Lm9/f;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Lm9/f;->flush()V

    .line 203
    .line 204
    .line 205
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 206
    .line 207
    invoke-virtual {v0}, Lm9/i;->b()V

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :catchall_0
    move-exception v0

    .line 212
    monitor-exit v1

    .line 213
    throw v0

    .line 214
    :catchall_1
    move-exception v0

    .line 215
    monitor-exit v1

    .line 216
    throw v0
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm9/i$b;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public flush()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 2
    .line 3
    sget-boolean v1, Lf9/c;->h:Z

    .line 4
    .line 5
    if-eqz v1, :cond_1

    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 19
    .line 20
    .line 21
    const-string v3, "Thread "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    const-string v4, "Thread.currentThread()"

    .line 31
    .line 32
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v3, " MUST NOT hold lock on "

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    throw v1

    .line 58
    :cond_1
    :goto_0
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 59
    .line 60
    monitor-enter v0

    .line 61
    :try_start_0
    iget-object v1, p0, Lm9/i$b;->k:Lm9/i;

    .line 62
    .line 63
    invoke-virtual {v1}, Lm9/i;->c()V

    .line 64
    .line 65
    .line 66
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    monitor-exit v0

    .line 69
    :goto_1
    iget-object v0, p0, Lm9/i$b;->g:Lt9/h;

    .line 70
    .line 71
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 72
    .line 73
    .line 74
    move-result-wide v0

    .line 75
    const-wide/16 v2, 0x0

    .line 76
    .line 77
    cmp-long v0, v0, v2

    .line 78
    .line 79
    if-lez v0, :cond_2

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    invoke-direct {p0, v0}, Lm9/i$b;->d(Z)V

    .line 83
    .line 84
    .line 85
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 86
    .line 87
    invoke-virtual {v0}, Lm9/i;->g()Lm9/f;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, Lm9/f;->flush()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    return-void

    .line 96
    :catchall_0
    move-exception v1

    .line 97
    monitor-exit v0

    .line 98
    throw v1
.end method

.method public final k()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm9/i$b;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public timeout()Lt9/G;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm9/i;->s()Lm9/i$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public write(Lt9/h;J)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/i$b;->k:Lm9/i;

    .line 7
    .line 8
    sget-boolean v1, Lf9/c;->h:Z

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 20
    .line 21
    new-instance p2, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string p3, "Thread "

    .line 27
    .line 28
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 32
    .line 33
    .line 34
    move-result-object p3

    .line 35
    const-string v1, "Thread.currentThread()"

    .line 36
    .line 37
    invoke-static {p3, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p3

    .line 44
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p3, " MUST NOT hold lock on "

    .line 48
    .line 49
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_1
    :goto_0
    iget-object v0, p0, Lm9/i$b;->g:Lt9/h;

    .line 64
    .line 65
    invoke-virtual {v0, p1, p2, p3}, Lt9/h;->write(Lt9/h;J)V

    .line 66
    .line 67
    .line 68
    :goto_1
    iget-object p1, p0, Lm9/i$b;->g:Lt9/h;

    .line 69
    .line 70
    invoke-virtual {p1}, Lt9/h;->size()J

    .line 71
    .line 72
    .line 73
    move-result-wide p1

    .line 74
    const-wide/16 v0, 0x4000

    .line 75
    .line 76
    cmp-long p1, p1, v0

    .line 77
    .line 78
    if-ltz p1, :cond_2

    .line 79
    .line 80
    const/4 p1, 0x0

    .line 81
    invoke-direct {p0, p1}, Lm9/i$b;->d(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    return-void
.end method
