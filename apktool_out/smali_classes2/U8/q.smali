.class final LU8/q;
.super LV8/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/l;
.implements LU8/b;
.implements LV8/k;


# static fields
.field private static final synthetic k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;


# instance fields
.field private volatile synthetic _state$volatile:Ljava/lang/Object;

.field private j:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    const-string v1, "_state$volatile"

    .line 4
    .line 5
    const-class v2, LU8/q;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, LU8/q;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LV8/b;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LU8/q;->_state$volatile:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic k()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .locals 1

    .line 1
    sget-object v0, LU8/q;->k:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    return-object v0
.end method

.method private final m(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-static {}, LU8/q;->k()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    monitor-exit p0

    .line 20
    return v1

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    goto :goto_3

    .line 23
    :cond_0
    :try_start_1
    invoke-static {v0, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    const/4 v0, 0x1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    return v0

    .line 32
    :cond_1
    :try_start_2
    invoke-static {}, LU8/q;->k()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1, p0, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    iget p1, p0, LU8/q;->j:I

    .line 40
    .line 41
    and-int/lit8 p2, p1, 0x1

    .line 42
    .line 43
    if-nez p2, :cond_5

    .line 44
    .line 45
    add-int/2addr p1, v0

    .line 46
    iput p1, p0, LU8/q;->j:I

    .line 47
    .line 48
    invoke-virtual {p0}, LV8/b;->h()[LV8/d;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    sget-object v2, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 53
    .line 54
    monitor-exit p0

    .line 55
    :goto_0
    check-cast p2, [LU8/s;

    .line 56
    .line 57
    if-eqz p2, :cond_3

    .line 58
    .line 59
    array-length v2, p2

    .line 60
    move v3, v1

    .line 61
    :goto_1
    if-ge v3, v2, :cond_3

    .line 62
    .line 63
    aget-object v4, p2, v3

    .line 64
    .line 65
    if-eqz v4, :cond_2

    .line 66
    .line 67
    invoke-virtual {v4}, LU8/s;->g()V

    .line 68
    .line 69
    .line 70
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    monitor-enter p0

    .line 74
    :try_start_3
    iget p2, p0, LU8/q;->j:I

    .line 75
    .line 76
    if-ne p2, p1, :cond_4

    .line 77
    .line 78
    add-int/2addr p1, v0

    .line 79
    iput p1, p0, LU8/q;->j:I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 80
    .line 81
    monitor-exit p0

    .line 82
    return v0

    .line 83
    :catchall_1
    move-exception p1

    .line 84
    goto :goto_2

    .line 85
    :cond_4
    :try_start_4
    invoke-virtual {p0}, LV8/b;->h()[LV8/d;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    sget-object v2, Li7/B;->a:Li7/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 90
    .line 91
    monitor-exit p0

    .line 92
    move v5, p2

    .line 93
    move-object p2, p1

    .line 94
    move p1, v5

    .line 95
    goto :goto_0

    .line 96
    :goto_2
    monitor-exit p0

    .line 97
    throw p1

    .line 98
    :cond_5
    add-int/lit8 p1, p1, 0x2

    .line 99
    .line 100
    :try_start_5
    iput p1, p0, LU8/q;->j:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return v0

    .line 104
    :goto_3
    monitor-exit p0

    .line 105
    throw p1
.end method


# virtual methods
.method public a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LV8/m;->a:LW8/E;

    .line 4
    .line 5
    :cond_0
    if-nez p2, :cond_1

    .line 6
    .line 7
    sget-object p2, LV8/m;->a:LW8/E;

    .line 8
    .line 9
    :cond_1
    invoke-direct {p0, p1, p2}, LU8/q;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public b(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p2, LU8/q$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LU8/q$a;

    .line 7
    .line 8
    iget v1, v0, LU8/q$a;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LU8/q$a;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LU8/q$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LU8/q$a;-><init>(LU8/q;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LU8/q$a;->l:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LU8/q$a;->n:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x3

    .line 35
    const/4 v5, 0x2

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    if-eq v2, p1, :cond_3

    .line 40
    .line 41
    if-eq v2, v5, :cond_2

    .line 42
    .line 43
    if-ne v2, v4, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, LU8/q$a;->k:Ljava/lang/Object;

    .line 46
    .line 47
    iget-object v2, v0, LU8/q$a;->j:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v2, LR8/A0;

    .line 50
    .line 51
    iget-object v6, v0, LU8/q$a;->i:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v6, LU8/s;

    .line 54
    .line 55
    iget-object v7, v0, LU8/q$a;->h:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v7, LU8/c;

    .line 58
    .line 59
    iget-object v8, v0, LU8/q$a;->g:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v8, LU8/q;

    .line 62
    .line 63
    :try_start_0
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception p1

    .line 68
    goto/16 :goto_6

    .line 69
    .line 70
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 71
    .line 72
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    throw p1

    .line 78
    :cond_2
    iget-object p1, v0, LU8/q$a;->k:Ljava/lang/Object;

    .line 79
    .line 80
    iget-object v2, v0, LU8/q$a;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v2, LR8/A0;

    .line 83
    .line 84
    iget-object v6, v0, LU8/q$a;->i:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v6, LU8/s;

    .line 87
    .line 88
    iget-object v7, v0, LU8/q$a;->h:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v7, LU8/c;

    .line 91
    .line 92
    iget-object v8, v0, LU8/q$a;->g:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, LU8/q;

    .line 95
    .line 96
    :try_start_1
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 97
    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_3
    iget-object p1, v0, LU8/q$a;->i:Ljava/lang/Object;

    .line 101
    .line 102
    move-object v6, p1

    .line 103
    check-cast v6, LU8/s;

    .line 104
    .line 105
    iget-object p1, v0, LU8/q$a;->h:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, LU8/c;

    .line 108
    .line 109
    iget-object v2, v0, LU8/q$a;->g:Ljava/lang/Object;

    .line 110
    .line 111
    move-object v8, v2

    .line 112
    check-cast v8, LU8/q;

    .line 113
    .line 114
    :try_start_2
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, LV8/b;->d()LV8/d;

    .line 122
    .line 123
    .line 124
    move-result-object p2

    .line 125
    check-cast p2, LU8/s;

    .line 126
    .line 127
    move-object v8, p0

    .line 128
    move-object v6, p2

    .line 129
    :goto_1
    :try_start_3
    invoke-interface {v0}, Ln7/f;->getContext()Ln7/j;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    sget-object v2, LR8/A0;->c:LR8/A0$b;

    .line 134
    .line 135
    invoke-interface {p2, v2}, Ln7/j;->e(Ln7/j$c;)Ln7/j$b;

    .line 136
    .line 137
    .line 138
    move-result-object p2

    .line 139
    check-cast p2, LR8/A0;

    .line 140
    .line 141
    move-object v7, p1

    .line 142
    move-object v2, p2

    .line 143
    move-object p1, v3

    .line 144
    :cond_5
    :goto_2
    invoke-static {}, LU8/q;->k()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2, v8}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    if-eqz v2, :cond_6

    .line 153
    .line 154
    invoke-static {v2}, LR8/D0;->f(LR8/A0;)V

    .line 155
    .line 156
    .line 157
    :cond_6
    if-eqz p1, :cond_7

    .line 158
    .line 159
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-nez v9, :cond_a

    .line 164
    .line 165
    :cond_7
    sget-object p1, LV8/m;->a:LW8/E;

    .line 166
    .line 167
    if-ne p2, p1, :cond_8

    .line 168
    .line 169
    move-object p1, v3

    .line 170
    goto :goto_3

    .line 171
    :cond_8
    move-object p1, p2

    .line 172
    :goto_3
    iput-object v8, v0, LU8/q$a;->g:Ljava/lang/Object;

    .line 173
    .line 174
    iput-object v7, v0, LU8/q$a;->h:Ljava/lang/Object;

    .line 175
    .line 176
    iput-object v6, v0, LU8/q$a;->i:Ljava/lang/Object;

    .line 177
    .line 178
    iput-object v2, v0, LU8/q$a;->j:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object p2, v0, LU8/q$a;->k:Ljava/lang/Object;

    .line 181
    .line 182
    iput v5, v0, LU8/q$a;->n:I

    .line 183
    .line 184
    invoke-interface {v7, p1, v0}, LU8/c;->l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v1, :cond_9

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    move-object p1, p2

    .line 192
    :cond_a
    :goto_4
    invoke-virtual {v6}, LU8/s;->h()Z

    .line 193
    .line 194
    .line 195
    move-result p2

    .line 196
    if-nez p2, :cond_5

    .line 197
    .line 198
    iput-object v8, v0, LU8/q$a;->g:Ljava/lang/Object;

    .line 199
    .line 200
    iput-object v7, v0, LU8/q$a;->h:Ljava/lang/Object;

    .line 201
    .line 202
    iput-object v6, v0, LU8/q$a;->i:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object v2, v0, LU8/q$a;->j:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object p1, v0, LU8/q$a;->k:Ljava/lang/Object;

    .line 207
    .line 208
    iput v4, v0, LU8/q$a;->n:I

    .line 209
    .line 210
    invoke-virtual {v6, v0}, LU8/s;->e(Ln7/f;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 214
    if-ne p2, v1, :cond_5

    .line 215
    .line 216
    :goto_5
    return-object v1

    .line 217
    :goto_6
    invoke-virtual {v8, v6}, LV8/b;->g(LV8/d;)V

    .line 218
    .line 219
    .line 220
    throw p1
.end method

.method public c(Ln7/j;ILT8/a;)LU8/b;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LU8/r;->d(LU8/p;Ln7/j;ILT8/a;)LU8/b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic e()LV8/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LU8/q;->i()LU8/s;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic f(I)[LV8/d;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU8/q;->j(I)[LU8/s;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2

    .line 1
    sget-object v0, LV8/m;->a:LW8/E;

    .line 2
    .line 3
    invoke-static {}, LU8/q;->k()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-ne v1, v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    return-object v0

    .line 15
    :cond_0
    return-object v1
.end method

.method protected i()LU8/s;
    .locals 1

    .line 1
    new-instance v0, LU8/s;

    .line 2
    .line 3
    invoke-direct {v0}, LU8/s;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method protected j(I)[LU8/s;
    .locals 0

    .line 1
    new-array p1, p1, [LU8/s;

    .line 2
    .line 3
    return-object p1
.end method

.method public l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LU8/q;->setValue(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, Li7/B;->a:Li7/B;

    .line 5
    .line 6
    return-object p1
.end method

.method public setValue(Ljava/lang/Object;)V
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    sget-object p1, LV8/m;->a:LW8/E;

    .line 4
    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    invoke-direct {p0, v0, p1}, LU8/q;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method
