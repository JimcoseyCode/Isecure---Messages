.class public final Ls9/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field private final g:Lt9/h;

.field private final h:Lt9/h;

.field private i:Z

.field private j:Ls9/a;

.field private final k:[B

.field private final l:Lt9/h$a;

.field private final m:Z

.field private final n:Lt9/i;

.field private final o:Ljava/util/Random;

.field private final p:Z

.field private final q:Z

.field private final r:J


# direct methods
.method public constructor <init>(ZLt9/i;Ljava/util/Random;ZZJ)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "random"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-boolean p1, p0, Ls9/h;->m:Z

    .line 15
    .line 16
    iput-object p2, p0, Ls9/h;->n:Lt9/i;

    .line 17
    .line 18
    iput-object p3, p0, Ls9/h;->o:Ljava/util/Random;

    .line 19
    .line 20
    iput-boolean p4, p0, Ls9/h;->p:Z

    .line 21
    .line 22
    iput-boolean p5, p0, Ls9/h;->q:Z

    .line 23
    .line 24
    iput-wide p6, p0, Ls9/h;->r:J

    .line 25
    .line 26
    new-instance p3, Lt9/h;

    .line 27
    .line 28
    invoke-direct {p3}, Lt9/h;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p3, p0, Ls9/h;->g:Lt9/h;

    .line 32
    .line 33
    invoke-interface {p2}, Lt9/i;->c()Lt9/h;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    iput-object p2, p0, Ls9/h;->h:Lt9/h;

    .line 38
    .line 39
    const/4 p2, 0x0

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    const/4 p3, 0x4

    .line 43
    new-array p3, p3, [B

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object p3, p2

    .line 47
    :goto_0
    iput-object p3, p0, Ls9/h;->k:[B

    .line 48
    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    new-instance p2, Lt9/h$a;

    .line 52
    .line 53
    invoke-direct {p2}, Lt9/h$a;-><init>()V

    .line 54
    .line 55
    .line 56
    :cond_1
    iput-object p2, p0, Ls9/h;->l:Lt9/h$a;

    .line 57
    .line 58
    return-void
.end method

.method private final e(ILt9/k;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Ls9/h;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    invoke-virtual {p2}, Lt9/k;->E()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    int-to-long v1, v0

    .line 10
    const-wide/16 v3, 0x7d

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-gtz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-eqz v1, :cond_3

    .line 20
    .line 21
    or-int/lit16 p1, p1, 0x80

    .line 22
    .line 23
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 24
    .line 25
    invoke-virtual {v1, p1}, Lt9/h;->W0(I)Lt9/h;

    .line 26
    .line 27
    .line 28
    iget-boolean p1, p0, Ls9/h;->m:Z

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    or-int/lit16 p1, v0, 0x80

    .line 33
    .line 34
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 35
    .line 36
    invoke-virtual {v1, p1}, Lt9/h;->W0(I)Lt9/h;

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Ls9/h;->o:Ljava/util/Random;

    .line 40
    .line 41
    iget-object v1, p0, Ls9/h;->k:[B

    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 50
    .line 51
    iget-object v1, p0, Ls9/h;->k:[B

    .line 52
    .line 53
    invoke-virtual {p1, v1}, Lt9/h;->U0([B)Lt9/h;

    .line 54
    .line 55
    .line 56
    if-lez v0, :cond_2

    .line 57
    .line 58
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 59
    .line 60
    invoke-virtual {p1}, Lt9/h;->size()J

    .line 61
    .line 62
    .line 63
    move-result-wide v0

    .line 64
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 65
    .line 66
    invoke-virtual {p1, p2}, Lt9/h;->S0(Lt9/k;)Lt9/h;

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 70
    .line 71
    iget-object p2, p0, Ls9/h;->l:Lt9/h$a;

    .line 72
    .line 73
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Lt9/h;->D0(Lt9/h$a;)Lt9/h$a;

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, Ls9/h;->l:Lt9/h$a;

    .line 80
    .line 81
    invoke-virtual {p1, v0, v1}, Lt9/h$a;->m(J)I

    .line 82
    .line 83
    .line 84
    sget-object p1, Ls9/f;->a:Ls9/f;

    .line 85
    .line 86
    iget-object p2, p0, Ls9/h;->l:Lt9/h$a;

    .line 87
    .line 88
    iget-object v0, p0, Ls9/h;->k:[B

    .line 89
    .line 90
    invoke-virtual {p1, p2, v0}, Ls9/f;->b(Lt9/h$a;[B)V

    .line 91
    .line 92
    .line 93
    iget-object p1, p0, Ls9/h;->l:Lt9/h$a;

    .line 94
    .line 95
    invoke-virtual {p1}, Lt9/h$a;->close()V

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_1
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lt9/h;->W0(I)Lt9/h;

    .line 102
    .line 103
    .line 104
    iget-object p1, p0, Ls9/h;->h:Lt9/h;

    .line 105
    .line 106
    invoke-virtual {p1, p2}, Lt9/h;->S0(Lt9/k;)Lt9/h;

    .line 107
    .line 108
    .line 109
    :cond_2
    :goto_1
    iget-object p1, p0, Ls9/h;->n:Lt9/i;

    .line 110
    .line 111
    invoke-interface {p1}, Lt9/i;->flush()V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 116
    .line 117
    const-string p2, "Payload size must be less than or equal to 125"

    .line 118
    .line 119
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p1

    .line 123
    :cond_4
    new-instance p1, Ljava/io/IOException;

    .line 124
    .line 125
    const-string p2, "closed"

    .line 126
    .line 127
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw p1
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls9/h;->j:Ls9/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ls9/a;->close()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final d(ILt9/k;)V
    .locals 1

    .line 1
    sget-object v0, Lt9/k;->k:Lt9/k;

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_3

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    sget-object v0, Ls9/f;->a:Ls9/f;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ls9/f;->c(I)V

    .line 12
    .line 13
    .line 14
    :cond_1
    new-instance v0, Lt9/h;

    .line 15
    .line 16
    invoke-direct {v0}, Lt9/h;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Lt9/h;->b1(I)Lt9/h;

    .line 20
    .line 21
    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0, p2}, Lt9/h;->S0(Lt9/k;)Lt9/h;

    .line 25
    .line 26
    .line 27
    :cond_2
    invoke-virtual {v0}, Lt9/h;->c0()Lt9/k;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :cond_3
    const/16 p1, 0x8

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    :try_start_0
    invoke-direct {p0, p1, v0}, Ls9/h;->e(ILt9/k;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    .line 37
    iput-boolean p2, p0, Ls9/h;->i:Z

    .line 38
    .line 39
    return-void

    .line 40
    :catchall_0
    move-exception p1

    .line 41
    iput-boolean p2, p0, Ls9/h;->i:Z

    .line 42
    .line 43
    throw p1
.end method

.method public final k(ILt9/k;)V
    .locals 5

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ls9/h;->i:Z

    .line 7
    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    iget-object v0, p0, Ls9/h;->g:Lt9/h;

    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lt9/h;->S0(Lt9/k;)Lt9/h;

    .line 13
    .line 14
    .line 15
    or-int/lit16 v0, p1, 0x80

    .line 16
    .line 17
    iget-boolean v1, p0, Ls9/h;->p:Z

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    invoke-virtual {p2}, Lt9/k;->E()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    int-to-long v1, p2

    .line 26
    iget-wide v3, p0, Ls9/h;->r:J

    .line 27
    .line 28
    cmp-long p2, v1, v3

    .line 29
    .line 30
    if-ltz p2, :cond_1

    .line 31
    .line 32
    iget-object p2, p0, Ls9/h;->j:Ls9/a;

    .line 33
    .line 34
    if-eqz p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p2, Ls9/a;

    .line 38
    .line 39
    iget-boolean v0, p0, Ls9/h;->q:Z

    .line 40
    .line 41
    invoke-direct {p2, v0}, Ls9/a;-><init>(Z)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Ls9/h;->j:Ls9/a;

    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, Ls9/h;->g:Lt9/h;

    .line 47
    .line 48
    invoke-virtual {p2, v0}, Ls9/a;->d(Lt9/h;)V

    .line 49
    .line 50
    .line 51
    or-int/lit16 v0, p1, 0xc0

    .line 52
    .line 53
    :cond_1
    iget-object p1, p0, Ls9/h;->g:Lt9/h;

    .line 54
    .line 55
    invoke-virtual {p1}, Lt9/h;->size()J

    .line 56
    .line 57
    .line 58
    move-result-wide p1

    .line 59
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 60
    .line 61
    invoke-virtual {v1, v0}, Lt9/h;->W0(I)Lt9/h;

    .line 62
    .line 63
    .line 64
    iget-boolean v0, p0, Ls9/h;->m:Z

    .line 65
    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    const/16 v0, 0x80

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_2
    const/4 v0, 0x0

    .line 72
    :goto_1
    const-wide/16 v1, 0x7d

    .line 73
    .line 74
    cmp-long v1, p1, v1

    .line 75
    .line 76
    if-gtz v1, :cond_3

    .line 77
    .line 78
    long-to-int v1, p1

    .line 79
    or-int/2addr v0, v1

    .line 80
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Lt9/h;->W0(I)Lt9/h;

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const-wide/32 v1, 0xffff

    .line 87
    .line 88
    .line 89
    cmp-long v1, p1, v1

    .line 90
    .line 91
    if-gtz v1, :cond_4

    .line 92
    .line 93
    or-int/lit8 v0, v0, 0x7e

    .line 94
    .line 95
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, Lt9/h;->W0(I)Lt9/h;

    .line 98
    .line 99
    .line 100
    iget-object v0, p0, Ls9/h;->h:Lt9/h;

    .line 101
    .line 102
    long-to-int v1, p1

    .line 103
    invoke-virtual {v0, v1}, Lt9/h;->b1(I)Lt9/h;

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    or-int/lit8 v0, v0, 0x7f

    .line 108
    .line 109
    iget-object v1, p0, Ls9/h;->h:Lt9/h;

    .line 110
    .line 111
    invoke-virtual {v1, v0}, Lt9/h;->W0(I)Lt9/h;

    .line 112
    .line 113
    .line 114
    iget-object v0, p0, Ls9/h;->h:Lt9/h;

    .line 115
    .line 116
    invoke-virtual {v0, p1, p2}, Lt9/h;->a1(J)Lt9/h;

    .line 117
    .line 118
    .line 119
    :goto_2
    iget-boolean v0, p0, Ls9/h;->m:Z

    .line 120
    .line 121
    if-eqz v0, :cond_5

    .line 122
    .line 123
    iget-object v0, p0, Ls9/h;->o:Ljava/util/Random;

    .line 124
    .line 125
    iget-object v1, p0, Ls9/h;->k:[B

    .line 126
    .line 127
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/util/Random;->nextBytes([B)V

    .line 131
    .line 132
    .line 133
    iget-object v0, p0, Ls9/h;->h:Lt9/h;

    .line 134
    .line 135
    iget-object v1, p0, Ls9/h;->k:[B

    .line 136
    .line 137
    invoke-virtual {v0, v1}, Lt9/h;->U0([B)Lt9/h;

    .line 138
    .line 139
    .line 140
    const-wide/16 v0, 0x0

    .line 141
    .line 142
    cmp-long v2, p1, v0

    .line 143
    .line 144
    if-lez v2, :cond_5

    .line 145
    .line 146
    iget-object v2, p0, Ls9/h;->g:Lt9/h;

    .line 147
    .line 148
    iget-object v3, p0, Ls9/h;->l:Lt9/h$a;

    .line 149
    .line 150
    invoke-static {v3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v3}, Lt9/h;->D0(Lt9/h$a;)Lt9/h$a;

    .line 154
    .line 155
    .line 156
    iget-object v2, p0, Ls9/h;->l:Lt9/h$a;

    .line 157
    .line 158
    invoke-virtual {v2, v0, v1}, Lt9/h$a;->m(J)I

    .line 159
    .line 160
    .line 161
    sget-object v0, Ls9/f;->a:Ls9/f;

    .line 162
    .line 163
    iget-object v1, p0, Ls9/h;->l:Lt9/h$a;

    .line 164
    .line 165
    iget-object v2, p0, Ls9/h;->k:[B

    .line 166
    .line 167
    invoke-virtual {v0, v1, v2}, Ls9/f;->b(Lt9/h$a;[B)V

    .line 168
    .line 169
    .line 170
    iget-object v0, p0, Ls9/h;->l:Lt9/h$a;

    .line 171
    .line 172
    invoke-virtual {v0}, Lt9/h$a;->close()V

    .line 173
    .line 174
    .line 175
    :cond_5
    iget-object v0, p0, Ls9/h;->h:Lt9/h;

    .line 176
    .line 177
    iget-object v1, p0, Ls9/h;->g:Lt9/h;

    .line 178
    .line 179
    invoke-virtual {v0, v1, p1, p2}, Lt9/h;->write(Lt9/h;J)V

    .line 180
    .line 181
    .line 182
    iget-object p1, p0, Ls9/h;->n:Lt9/i;

    .line 183
    .line 184
    invoke-interface {p1}, Lt9/i;->x()Lt9/i;

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_6
    new-instance p1, Ljava/io/IOException;

    .line 189
    .line 190
    const-string p2, "closed"

    .line 191
    .line 192
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    throw p1
.end method

.method public final m(Lt9/k;)V
    .locals 1

    .line 1
    const-string v0, "payload"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x9

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Ls9/h;->e(ILt9/k;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final r(Lt9/k;)V
    .locals 1

    .line 1
    const-string v0, "payload"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0xa

    .line 7
    .line 8
    invoke-direct {p0, v0, p1}, Ls9/h;->e(ILt9/k;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
