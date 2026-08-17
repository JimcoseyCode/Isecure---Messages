.class public final Lm9/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm9/f$b;,
        Lm9/f$e;,
        Lm9/f$d;,
        Lm9/f$c;
    }
.end annotation


# static fields
.field private static final I:Lm9/m;

.field public static final J:Lm9/f$c;


# instance fields
.field private A:J

.field private B:J

.field private C:J

.field private D:J

.field private final E:Ljava/net/Socket;

.field private final F:Lm9/j;

.field private final G:Lm9/f$e;

.field private final H:Ljava/util/Set;

.field private final g:Z

.field private final h:Lm9/f$d;

.field private final i:Ljava/util/Map;

.field private final j:Ljava/lang/String;

.field private k:I

.field private l:I

.field private m:Z

.field private final n:Li9/e;

.field private final o:Li9/d;

.field private final p:Li9/d;

.field private final q:Li9/d;

.field private final r:Lm9/l;

.field private s:J

.field private t:J

.field private u:J

.field private v:J

.field private w:J

.field private x:J

.field private final y:Lm9/m;

.field private z:Lm9/m;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lm9/f$c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lm9/f$c;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lm9/f;->J:Lm9/f$c;

    .line 8
    .line 9
    new-instance v0, Lm9/m;

    .line 10
    .line 11
    invoke-direct {v0}, Lm9/m;-><init>()V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x7

    .line 15
    const v2, 0xffff

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1, v2}, Lm9/m;->h(II)Lm9/m;

    .line 19
    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    const/16 v2, 0x4000

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lm9/m;->h(II)Lm9/m;

    .line 25
    .line 26
    .line 27
    sput-object v0, Lm9/f;->I:Lm9/m;

    .line 28
    .line 29
    return-void
.end method

.method public constructor <init>(Lm9/f$b;)V
    .locals 12

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lm9/f$b;->b()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-boolean v0, p0, Lm9/f;->g:Z

    .line 14
    .line 15
    invoke-virtual {p1}, Lm9/f$b;->d()Lm9/f$d;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, p0, Lm9/f;->h:Lm9/f$d;

    .line 20
    .line 21
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v1, p0, Lm9/f;->i:Ljava/util/Map;

    .line 27
    .line 28
    invoke-virtual {p1}, Lm9/f$b;->c()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, p0, Lm9/f;->j:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p1}, Lm9/f$b;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const/4 v2, 0x3

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v2, 0x2

    .line 43
    :goto_0
    iput v2, p0, Lm9/f;->l:I

    .line 44
    .line 45
    invoke-virtual {p1}, Lm9/f$b;->j()Li9/e;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    iput-object v2, p0, Lm9/f;->n:Li9/e;

    .line 50
    .line 51
    invoke-virtual {v2}, Li9/e;->i()Li9/d;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-object v3, p0, Lm9/f;->o:Li9/d;

    .line 56
    .line 57
    invoke-virtual {v2}, Li9/e;->i()Li9/d;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    iput-object v4, p0, Lm9/f;->p:Li9/d;

    .line 62
    .line 63
    invoke-virtual {v2}, Li9/e;->i()Li9/d;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    iput-object v2, p0, Lm9/f;->q:Li9/d;

    .line 68
    .line 69
    invoke-virtual {p1}, Lm9/f$b;->f()Lm9/l;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iput-object v2, p0, Lm9/f;->r:Lm9/l;

    .line 74
    .line 75
    new-instance v2, Lm9/m;

    .line 76
    .line 77
    invoke-direct {v2}, Lm9/m;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lm9/f$b;->b()Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_1

    .line 85
    .line 86
    const/4 v4, 0x7

    .line 87
    const/high16 v5, 0x1000000

    .line 88
    .line 89
    invoke-virtual {v2, v4, v5}, Lm9/m;->h(II)Lm9/m;

    .line 90
    .line 91
    .line 92
    :cond_1
    sget-object v4, Li7/B;->a:Li7/B;

    .line 93
    .line 94
    iput-object v2, p0, Lm9/f;->y:Lm9/m;

    .line 95
    .line 96
    sget-object v2, Lm9/f;->I:Lm9/m;

    .line 97
    .line 98
    iput-object v2, p0, Lm9/f;->z:Lm9/m;

    .line 99
    .line 100
    invoke-virtual {v2}, Lm9/m;->c()I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    int-to-long v4, v2

    .line 105
    iput-wide v4, p0, Lm9/f;->D:J

    .line 106
    .line 107
    invoke-virtual {p1}, Lm9/f$b;->h()Ljava/net/Socket;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    iput-object v2, p0, Lm9/f;->E:Ljava/net/Socket;

    .line 112
    .line 113
    new-instance v2, Lm9/j;

    .line 114
    .line 115
    invoke-virtual {p1}, Lm9/f$b;->g()Lt9/i;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-direct {v2, v4, v0}, Lm9/j;-><init>(Lt9/i;Z)V

    .line 120
    .line 121
    .line 122
    iput-object v2, p0, Lm9/f;->F:Lm9/j;

    .line 123
    .line 124
    new-instance v2, Lm9/f$e;

    .line 125
    .line 126
    new-instance v4, Lm9/h;

    .line 127
    .line 128
    invoke-virtual {p1}, Lm9/f$b;->i()Lt9/j;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-direct {v4, v5, v0}, Lm9/h;-><init>(Lt9/j;Z)V

    .line 133
    .line 134
    .line 135
    invoke-direct {v2, p0, v4}, Lm9/f$e;-><init>(Lm9/f;Lm9/h;)V

    .line 136
    .line 137
    .line 138
    iput-object v2, p0, Lm9/f;->G:Lm9/f$e;

    .line 139
    .line 140
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object v0, p0, Lm9/f;->H:Ljava/util/Set;

    .line 146
    .line 147
    invoke-virtual {p1}, Lm9/f$b;->e()I

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_2

    .line 152
    .line 153
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 154
    .line 155
    invoke-virtual {p1}, Lm9/f$b;->e()I

    .line 156
    .line 157
    .line 158
    move-result p1

    .line 159
    int-to-long v4, p1

    .line 160
    invoke-virtual {v0, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v10

    .line 164
    new-instance p1, Ljava/lang/StringBuilder;

    .line 165
    .line 166
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    const-string v0, " ping"

    .line 173
    .line 174
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    new-instance v6, Lm9/f$a;

    .line 182
    .line 183
    move-object v8, v7

    .line 184
    move-object v9, p0

    .line 185
    invoke-direct/range {v6 .. v11}, Lm9/f$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lm9/f;J)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3, v6, v10, v11}, Li9/d;->i(Li9/a;J)V

    .line 189
    .line 190
    .line 191
    :cond_2
    return-void
.end method

.method public static final synthetic A(Lm9/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm9/f;->t:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic B(Lm9/f;)Lm9/l;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/f;->r:Lm9/l;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I(Lm9/f;)Li9/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/f;->q:Li9/d;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J(Lm9/f;)Li9/e;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/f;->n:Li9/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M(Lm9/f;)Li9/d;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/f;->o:Li9/d;

    .line 2
    .line 3
    return-object p0
.end method

.method private final R0(ILjava/util/List;Z)Lm9/i;
    .locals 9

    .line 1
    xor-int/lit8 v3, p3, 0x1

    .line 2
    .line 3
    iget-object v6, p0, Lm9/f;->F:Lm9/j;

    .line 4
    .line 5
    monitor-enter v6

    .line 6
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    .line 7
    :try_start_1
    iget v0, p0, Lm9/f;->l:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 8
    .line 9
    const v1, 0x3fffffff    # 1.9999999f

    .line 10
    .line 11
    .line 12
    if-le v0, v1, :cond_0

    .line 13
    .line 14
    :try_start_2
    sget-object v0, Lm9/b;->o:Lm9/b;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lm9/f;->c1(Lm9/b;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    move-object p1, v0

    .line 22
    move-object v2, p0

    .line 23
    goto/16 :goto_6

    .line 24
    .line 25
    :cond_0
    :goto_0
    :try_start_3
    iget-boolean v0, p0, Lm9/f;->m:Z

    .line 26
    .line 27
    if-nez v0, :cond_7

    .line 28
    .line 29
    iget v1, p0, Lm9/f;->l:I

    .line 30
    .line 31
    add-int/lit8 v0, v1, 0x2

    .line 32
    .line 33
    iput v0, p0, Lm9/f;->l:I

    .line 34
    .line 35
    new-instance v0, Lm9/i;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 36
    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    move-object v2, p0

    .line 40
    :try_start_4
    invoke-direct/range {v0 .. v5}, Lm9/i;-><init>(ILm9/f;ZZLe9/t;)V

    .line 41
    .line 42
    .line 43
    if-eqz p3, :cond_2

    .line 44
    .line 45
    iget-wide v4, v2, Lm9/f;->C:J

    .line 46
    .line 47
    iget-wide v7, v2, Lm9/f;->D:J

    .line 48
    .line 49
    cmp-long p3, v4, v7

    .line 50
    .line 51
    if-gez p3, :cond_2

    .line 52
    .line 53
    invoke-virtual {v0}, Lm9/i;->r()J

    .line 54
    .line 55
    .line 56
    move-result-wide v4

    .line 57
    invoke-virtual {v0}, Lm9/i;->q()J

    .line 58
    .line 59
    .line 60
    move-result-wide v7

    .line 61
    cmp-long p3, v4, v7

    .line 62
    .line 63
    if-ltz p3, :cond_1

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_1
    const/4 p3, 0x0

    .line 67
    goto :goto_3

    .line 68
    :catchall_1
    move-exception v0

    .line 69
    :goto_1
    move-object p1, v0

    .line 70
    goto :goto_6

    .line 71
    :cond_2
    :goto_2
    const/4 p3, 0x1

    .line 72
    :goto_3
    invoke-virtual {v0}, Lm9/i;->u()Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-eqz v4, :cond_3

    .line 77
    .line 78
    iget-object v4, v2, Lm9/f;->i:Ljava/util/Map;

    .line 79
    .line 80
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 81
    .line 82
    .line 83
    move-result-object v5

    .line 84
    invoke-interface {v4, v5, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    :cond_3
    sget-object v4, Li7/B;->a:Li7/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 88
    .line 89
    :try_start_5
    monitor-exit p0

    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    iget-object p1, v2, Lm9/f;->F:Lm9/j;

    .line 93
    .line 94
    invoke-virtual {p1, v3, v1, p2}, Lm9/j;->A(ZILjava/util/List;)V

    .line 95
    .line 96
    .line 97
    goto :goto_5

    .line 98
    :catchall_2
    move-exception v0

    .line 99
    :goto_4
    move-object p1, v0

    .line 100
    goto :goto_7

    .line 101
    :cond_4
    iget-boolean v3, v2, Lm9/f;->g:Z

    .line 102
    .line 103
    if-nez v3, :cond_6

    .line 104
    .line 105
    iget-object v3, v2, Lm9/f;->F:Lm9/j;

    .line 106
    .line 107
    invoke-virtual {v3, p1, v1, p2}, Lm9/j;->J(IILjava/util/List;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 108
    .line 109
    .line 110
    :goto_5
    monitor-exit v6

    .line 111
    if-eqz p3, :cond_5

    .line 112
    .line 113
    iget-object p1, v2, Lm9/f;->F:Lm9/j;

    .line 114
    .line 115
    invoke-virtual {p1}, Lm9/j;->flush()V

    .line 116
    .line 117
    .line 118
    :cond_5
    return-object v0

    .line 119
    :cond_6
    :try_start_6
    const-string p1, "client streams shouldn\'t have associated stream IDs"

    .line 120
    .line 121
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 122
    .line 123
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    throw p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 127
    :catchall_3
    move-exception v0

    .line 128
    move-object v2, p0

    .line 129
    goto :goto_1

    .line 130
    :cond_7
    move-object v2, p0

    .line 131
    :try_start_7
    new-instance p1, Lm9/a;

    .line 132
    .line 133
    invoke-direct {p1}, Lm9/a;-><init>()V

    .line 134
    .line 135
    .line 136
    throw p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 137
    :goto_6
    :try_start_8
    monitor-exit p0

    .line 138
    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_2

    .line 139
    :catchall_4
    move-exception v0

    .line 140
    move-object v2, p0

    .line 141
    goto :goto_4

    .line 142
    :goto_7
    monitor-exit v6

    .line 143
    throw p1
.end method

.method public static final synthetic W(Lm9/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lm9/f;->m:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic X(Lm9/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm9/f;->w:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic d(Lm9/f;Ljava/io/IOException;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm9/f;->u0(Ljava/io/IOException;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic d0(Lm9/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm9/f;->v:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic e(Lm9/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm9/f;->w:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static synthetic e1(Lm9/f;ZLi9/e;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 7
    .line 8
    if-eqz p3, :cond_1

    .line 9
    .line 10
    sget-object p2, Li9/e;->h:Li9/e;

    .line 11
    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lm9/f;->d1(ZLi9/e;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic g0(Lm9/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm9/f;->s:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic i0(Lm9/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm9/f;->t:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic k(Lm9/f;)Ljava/util/Set;
    .locals 0

    .line 1
    iget-object p0, p0, Lm9/f;->H:Ljava/util/Set;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic k0(Lm9/f;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lm9/f;->m:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic l0(Lm9/f;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lm9/f;->D:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic m()Lm9/m;
    .locals 1

    .line 1
    sget-object v0, Lm9/f;->I:Lm9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic r(Lm9/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm9/f;->v:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public static final synthetic s(Lm9/f;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm9/f;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method private final u0(Ljava/io/IOException;)V
    .locals 1

    .line 1
    sget-object v0, Lm9/b;->i:Lm9/b;

    .line 2
    .line 3
    invoke-virtual {p0, v0, v0, p1}, Lm9/f;->t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final A0()I
    .locals 1

    .line 1
    iget v0, p0, Lm9/f;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final D0()Lm9/f$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->h:Lm9/f$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J0()I
    .locals 1

    .line 1
    iget v0, p0, Lm9/f;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public final K0()Lm9/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->y:Lm9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L0()Lm9/m;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->z:Lm9/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized M0(I)Lm9/i;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm9/f;->i:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lm9/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    monitor-exit p0

    .line 15
    return-object p1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw p1
.end method

.method public final N0()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->i:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lm9/f;->D:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final P0()Lm9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final declared-synchronized Q0(J)Z
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lm9/f;->m:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return v1

    .line 9
    :cond_0
    :try_start_1
    iget-wide v2, p0, Lm9/f;->v:J

    .line 10
    .line 11
    iget-wide v4, p0, Lm9/f;->u:J

    .line 12
    .line 13
    cmp-long v0, v2, v4

    .line 14
    .line 15
    if-gez v0, :cond_1

    .line 16
    .line 17
    iget-wide v2, p0, Lm9/f;->x:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    cmp-long p1, p1, v2

    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    monitor-exit p0

    .line 24
    return v1

    .line 25
    :catchall_0
    move-exception p1

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    monitor-exit p0

    .line 28
    const/4 p1, 0x1

    .line 29
    return p1

    .line 30
    :goto_0
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    throw p1
.end method

.method public final S0(Ljava/util/List;Z)Lm9/i;
    .locals 1

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0, p1, p2}, Lm9/f;->R0(ILjava/util/List;Z)Lm9/i;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public final T0(ILt9/j;IZ)V
    .locals 11

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v8, Lt9/h;

    .line 7
    .line 8
    invoke-direct {v8}, Lt9/h;-><init>()V

    .line 9
    .line 10
    .line 11
    int-to-long v0, p3

    .line 12
    invoke-interface {p2, v0, v1}, Lt9/j;->B0(J)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p2, v8, v0, v1}, Lt9/F;->read(Lt9/h;J)J

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, Lm9/f;->p:Li9/d;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lm9/f;->j:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v1, 0x5b

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v1, "] onData"

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    new-instance v1, Lm9/f$f;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    move-object v4, v2

    .line 51
    move v5, v3

    .line 52
    move-object v6, p0

    .line 53
    move v7, p1

    .line 54
    move v9, p3

    .line 55
    move v10, p4

    .line 56
    invoke-direct/range {v1 .. v10}, Lm9/f$f;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILt9/h;IZ)V

    .line 57
    .line 58
    .line 59
    const-wide/16 p3, 0x0

    .line 60
    .line 61
    invoke-virtual {p2, v1, p3, p4}, Li9/d;->i(Li9/a;J)V

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method public final U0(ILjava/util/List;Z)V
    .locals 12

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->p:Li9/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] onHeaders"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v3, Lm9/f$g;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    move-object v6, v4

    .line 39
    move v7, v5

    .line 40
    move-object v8, p0

    .line 41
    move v9, p1

    .line 42
    move-object v10, p2

    .line 43
    move v11, p3

    .line 44
    invoke-direct/range {v3 .. v11}, Lm9/f$g;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILjava/util/List;Z)V

    .line 45
    .line 46
    .line 47
    const-wide/16 p1, 0x0

    .line 48
    .line 49
    invoke-virtual {v0, v3, p1, p2}, Li9/d;->i(Li9/a;J)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final V0(ILjava/util/List;)V
    .locals 11

    .line 1
    const-string v0, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    monitor-enter p0

    .line 7
    :try_start_0
    iget-object v0, p0, Lm9/f;->H:Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    :try_start_1
    sget-object p2, Lm9/b;->i:Lm9/b;

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Lm9/f;->k1(ILm9/b;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    monitor-exit p0

    .line 25
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    move-object v8, p0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    :try_start_2
    iget-object v0, p0, Lm9/f;->H:Ljava/util/Set;

    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    .line 39
    monitor-exit p0

    .line 40
    iget-object v0, p0, Lm9/f;->p:Li9/d;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const/16 v2, 0x5b

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v2, "] onRequest"

    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    new-instance v3, Lm9/f$h;

    .line 70
    .line 71
    const/4 v5, 0x1

    .line 72
    move-object v6, v4

    .line 73
    move v7, v5

    .line 74
    move-object v8, p0

    .line 75
    move v9, p1

    .line 76
    move-object v10, p2

    .line 77
    invoke-direct/range {v3 .. v10}, Lm9/f$h;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILjava/util/List;)V

    .line 78
    .line 79
    .line 80
    const-wide/16 p1, 0x0

    .line 81
    .line 82
    invoke-virtual {v0, v3, p1, p2}, Li9/d;->i(Li9/a;J)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :catchall_1
    move-exception v0

    .line 87
    move-object v8, p0

    .line 88
    move-object p1, v0

    .line 89
    :goto_0
    monitor-exit p0

    .line 90
    throw p1
.end method

.method public final W0(ILm9/b;)V
    .locals 11

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->p:Li9/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] onReset"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v3, Lm9/f$i;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    move-object v6, v4

    .line 39
    move v7, v5

    .line 40
    move-object v8, p0

    .line 41
    move v9, p1

    .line 42
    move-object v10, p2

    .line 43
    invoke-direct/range {v3 .. v10}, Lm9/f$i;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILm9/b;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 p1, 0x0

    .line 47
    .line 48
    invoke-virtual {v0, v3, p1, p2}, Li9/d;->i(Li9/a;J)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final X0(I)Z
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    and-int/2addr p1, v0

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method public final declared-synchronized Y0(I)Lm9/i;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lm9/f;->i:Ljava/util/Map;

    .line 3
    .line 4
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lm9/i;

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit p0

    .line 18
    return-object p1

    .line 19
    :catchall_0
    move-exception p1

    .line 20
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 21
    throw p1
.end method

.method public final Z0()V
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lm9/f;->v:J

    .line 3
    .line 4
    iget-wide v2, p0, Lm9/f;->u:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-gez v0, :cond_0

    .line 9
    .line 10
    monitor-exit p0

    .line 11
    return-void

    .line 12
    :cond_0
    const-wide/16 v0, 0x1

    .line 13
    .line 14
    add-long/2addr v2, v0

    .line 15
    :try_start_1
    iput-wide v2, p0, Lm9/f;->u:J

    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 18
    .line 19
    .line 20
    move-result-wide v0

    .line 21
    const v2, 0x3b9aca00

    .line 22
    .line 23
    .line 24
    int-to-long v2, v2

    .line 25
    add-long/2addr v0, v2

    .line 26
    iput-wide v0, p0, Lm9/f;->x:J

    .line 27
    .line 28
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    monitor-exit p0

    .line 31
    iget-object v0, p0, Lm9/f;->o:Li9/d;

    .line 32
    .line 33
    new-instance v1, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " ping"

    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v3, Lm9/f$j;

    .line 53
    .line 54
    const/4 v5, 0x1

    .line 55
    move-object v6, v4

    .line 56
    move v7, v5

    .line 57
    move-object v8, p0

    .line 58
    invoke-direct/range {v3 .. v8}, Lm9/f$j;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;)V

    .line 59
    .line 60
    .line 61
    const-wide/16 v1, 0x0

    .line 62
    .line 63
    invoke-virtual {v0, v3, v1, v2}, Li9/d;->i(Li9/a;J)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :catchall_0
    move-exception v0

    .line 68
    move-object v8, p0

    .line 69
    monitor-exit p0

    .line 70
    throw v0
.end method

.method public final a1(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm9/f;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public final b1(Lm9/m;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm9/f;->z:Lm9/m;

    .line 7
    .line 8
    return-void
.end method

.method public final c1(Lm9/b;)V
    .locals 4

    .line 1
    const-string v0, "statusCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    monitor-enter p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    :try_start_1
    iget-boolean v1, p0, Lm9/f;->m:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 15
    monitor-exit v0

    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x1

    .line 20
    :try_start_3
    iput-boolean v1, p0, Lm9/f;->m:Z

    .line 21
    .line 22
    iget v1, p0, Lm9/f;->k:I

    .line 23
    .line 24
    sget-object v2, Li7/B;->a:Li7/B;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 25
    .line 26
    :try_start_4
    monitor-exit p0

    .line 27
    iget-object v2, p0, Lm9/f;->F:Lm9/j;

    .line 28
    .line 29
    sget-object v3, Lf9/c;->a:[B

    .line 30
    .line 31
    invoke-virtual {v2, v1, p1, v3}, Lm9/j;->s(ILm9/b;[B)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 32
    .line 33
    .line 34
    monitor-exit v0

    .line 35
    return-void

    .line 36
    :catchall_1
    move-exception p1

    .line 37
    :try_start_5
    monitor-exit p0

    .line 38
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 39
    :goto_0
    monitor-exit v0

    .line 40
    throw p1
.end method

.method public close()V
    .locals 3

    .line 1
    sget-object v0, Lm9/b;->h:Lm9/b;

    .line 2
    .line 3
    sget-object v1, Lm9/b;->p:Lm9/b;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-virtual {p0, v0, v1, v2}, Lm9/f;->t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final d1(ZLi9/e;)V
    .locals 6

    .line 1
    const-string v0, "taskRunner"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p0, Lm9/f;->F:Lm9/j;

    .line 9
    .line 10
    invoke-virtual {p1}, Lm9/j;->e()V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, Lm9/f;->F:Lm9/j;

    .line 14
    .line 15
    iget-object v0, p0, Lm9/f;->y:Lm9/m;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Lm9/j;->W(Lm9/m;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lm9/f;->y:Lm9/m;

    .line 21
    .line 22
    invoke-virtual {p1}, Lm9/m;->c()I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const v0, 0xffff

    .line 27
    .line 28
    .line 29
    if-eq p1, v0, :cond_0

    .line 30
    .line 31
    iget-object v1, p0, Lm9/f;->F:Lm9/j;

    .line 32
    .line 33
    sub-int/2addr p1, v0

    .line 34
    int-to-long v2, p1

    .line 35
    const/4 p1, 0x0

    .line 36
    invoke-virtual {v1, p1, v2, v3}, Lm9/j;->X(IJ)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {p2}, Li9/e;->i()Li9/d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v1, p0, Lm9/f;->G:Lm9/f$e;

    .line 46
    .line 47
    new-instance v0, Li9/c;

    .line 48
    .line 49
    const/4 v3, 0x1

    .line 50
    move-object v4, v2

    .line 51
    move v5, v3

    .line 52
    invoke-direct/range {v0 .. v5}, Li9/c;-><init>(Lw7/a;Ljava/lang/String;ZLjava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v1, 0x0

    .line 56
    .line 57
    invoke-virtual {p1, v0, v1, v2}, Li9/d;->i(Li9/a;J)V

    .line 58
    .line 59
    .line 60
    return-void
.end method

.method public final declared-synchronized f1(J)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-wide v0, p0, Lm9/f;->A:J

    .line 3
    .line 4
    add-long/2addr v0, p1

    .line 5
    iput-wide v0, p0, Lm9/f;->A:J

    .line 6
    .line 7
    iget-wide p1, p0, Lm9/f;->B:J

    .line 8
    .line 9
    sub-long/2addr v0, p1

    .line 10
    iget-object p1, p0, Lm9/f;->y:Lm9/m;

    .line 11
    .line 12
    invoke-virtual {p1}, Lm9/m;->c()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    div-int/lit8 p1, p1, 0x2

    .line 17
    .line 18
    int-to-long p1, p1

    .line 19
    cmp-long p1, v0, p1

    .line 20
    .line 21
    if-ltz p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    invoke-virtual {p0, p1, v0, v1}, Lm9/f;->l1(IJ)V

    .line 25
    .line 26
    .line 27
    iget-wide p1, p0, Lm9/f;->B:J

    .line 28
    .line 29
    add-long/2addr p1, v0

    .line 30
    iput-wide p1, p0, Lm9/f;->B:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    :goto_0
    monitor-exit p0

    .line 36
    return-void

    .line 37
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 38
    throw p1
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm9/j;->flush()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final g1(IZLt9/h;J)V
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p4, v0

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    iget-object p4, p0, Lm9/f;->F:Lm9/j;

    .line 9
    .line 10
    invoke-virtual {p4, p2, p1, p3, v3}, Lm9/j;->k(ZILt9/h;I)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    :goto_0
    cmp-long v2, p4, v0

    .line 15
    .line 16
    if-lez v2, :cond_4

    .line 17
    .line 18
    monitor-enter p0

    .line 19
    :goto_1
    :try_start_0
    iget-wide v4, p0, Lm9/f;->C:J

    .line 20
    .line 21
    iget-wide v6, p0, Lm9/f;->D:J

    .line 22
    .line 23
    cmp-long v2, v4, v6

    .line 24
    .line 25
    if-ltz v2, :cond_2

    .line 26
    .line 27
    iget-object v2, p0, Lm9/f;->i:Ljava/util/Map;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->wait()V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    move-exception p1

    .line 44
    goto :goto_3

    .line 45
    :cond_1
    new-instance p1, Ljava/io/IOException;

    .line 46
    .line 47
    const-string p2, "stream closed"

    .line 48
    .line 49
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    :cond_2
    sub-long/2addr v6, v4

    .line 54
    :try_start_1
    invoke-static {p4, p5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    .line 55
    .line 56
    .line 57
    move-result-wide v4

    .line 58
    long-to-int v2, v4

    .line 59
    iget-object v4, p0, Lm9/f;->F:Lm9/j;

    .line 60
    .line 61
    invoke-virtual {v4}, Lm9/j;->B()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    iget-wide v4, p0, Lm9/f;->C:J

    .line 70
    .line 71
    int-to-long v6, v2

    .line 72
    add-long/2addr v4, v6

    .line 73
    iput-wide v4, p0, Lm9/f;->C:J

    .line 74
    .line 75
    sget-object v4, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    monitor-exit p0

    .line 78
    sub-long/2addr p4, v6

    .line 79
    iget-object v4, p0, Lm9/f;->F:Lm9/j;

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    cmp-long v5, p4, v0

    .line 84
    .line 85
    if-nez v5, :cond_3

    .line 86
    .line 87
    const/4 v5, 0x1

    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v5, v3

    .line 90
    :goto_2
    invoke-virtual {v4, v5, p1, p3, v2}, Lm9/j;->k(ZILt9/h;I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catch_0
    :try_start_2
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 99
    .line 100
    .line 101
    new-instance p1, Ljava/io/InterruptedIOException;

    .line 102
    .line 103
    invoke-direct {p1}, Ljava/io/InterruptedIOException;-><init>()V

    .line 104
    .line 105
    .line 106
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 107
    :goto_3
    monitor-exit p0

    .line 108
    throw p1

    .line 109
    :cond_4
    return-void
.end method

.method public final h1(IZLjava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "alternating"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 7
    .line 8
    invoke-virtual {v0, p2, p1, p3}, Lm9/j;->A(ZILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final i1(ZII)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Lm9/j;->I(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    invoke-direct {p0, p1}, Lm9/f;->u0(Ljava/io/IOException;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final j1(ILm9/b;)V
    .locals 1

    .line 1
    const-string v0, "statusCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->F:Lm9/j;

    .line 7
    .line 8
    invoke-virtual {v0, p1, p2}, Lm9/j;->M(ILm9/b;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final k1(ILm9/b;)V
    .locals 11

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f;->o:Li9/d;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v2, 0x5b

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "] writeSynReset"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    new-instance v3, Lm9/f$k;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    move-object v6, v4

    .line 39
    move v7, v5

    .line 40
    move-object v8, p0

    .line 41
    move v9, p1

    .line 42
    move-object v10, p2

    .line 43
    invoke-direct/range {v3 .. v10}, Lm9/f$k;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;ILm9/b;)V

    .line 44
    .line 45
    .line 46
    const-wide/16 p1, 0x0

    .line 47
    .line 48
    invoke-virtual {v0, v3, p1, p2}, Li9/d;->i(Li9/a;J)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final l1(IJ)V
    .locals 12

    .line 1
    iget-object v0, p0, Lm9/f;->o:Li9/d;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lm9/f;->j:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 v2, 0x5b

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, "] windowUpdate"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    new-instance v3, Lm9/f$l;

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    move-object v6, v4

    .line 34
    move v7, v5

    .line 35
    move-object v8, p0

    .line 36
    move v9, p1

    .line 37
    move-wide v10, p2

    .line 38
    invoke-direct/range {v3 .. v11}, Lm9/f$l;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f;IJ)V

    .line 39
    .line 40
    .line 41
    const-wide/16 p1, 0x0

    .line 42
    .line 43
    invoke-virtual {v0, v3, p1, p2}, Li9/d;->i(Li9/a;J)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V
    .locals 3

    .line 1
    const-string v0, "connectionCode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "streamCode"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-boolean v0, Lf9/c;->h:Z

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 23
    .line 24
    new-instance p2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 27
    .line 28
    .line 29
    const-string p3, "Thread "

    .line 30
    .line 31
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    const-string v0, "Thread.currentThread()"

    .line 39
    .line 40
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p3}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p3

    .line 47
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string p3, " MUST NOT hold lock on "

    .line 51
    .line 52
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw p1

    .line 66
    :cond_1
    :goto_0
    :try_start_0
    invoke-virtual {p0, p1}, Lm9/f;->c1(Lm9/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    :catch_0
    monitor-enter p0

    .line 70
    :try_start_1
    iget-object p1, p0, Lm9/f;->i:Ljava/util/Map;

    .line 71
    .line 72
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    .line 73
    .line 74
    .line 75
    move-result p1

    .line 76
    const/4 v0, 0x0

    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    iget-object p1, p0, Lm9/f;->i:Ljava/util/Map;

    .line 80
    .line 81
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-array v1, v0, [Lm9/i;

    .line 86
    .line 87
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-eqz p1, :cond_2

    .line 92
    .line 93
    check-cast p1, [Lm9/i;

    .line 94
    .line 95
    iget-object v1, p0, Lm9/f;->i:Ljava/util/Map;

    .line 96
    .line 97
    invoke-interface {v1}, Ljava/util/Map;->clear()V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :catchall_0
    move-exception p1

    .line 102
    goto :goto_3

    .line 103
    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    .line 104
    .line 105
    const-string p2, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 106
    .line 107
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :cond_3
    const/4 p1, 0x0

    .line 112
    :goto_1
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 113
    .line 114
    monitor-exit p0

    .line 115
    if-eqz p1, :cond_4

    .line 116
    .line 117
    array-length v1, p1

    .line 118
    :goto_2
    if-ge v0, v1, :cond_4

    .line 119
    .line 120
    aget-object v2, p1, v0

    .line 121
    .line 122
    :try_start_2
    invoke-virtual {v2, p2, p3}, Lm9/i;->d(Lm9/b;Ljava/io/IOException;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    .line 123
    .line 124
    .line 125
    :catch_1
    add-int/lit8 v0, v0, 0x1

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    :try_start_3
    iget-object p1, p0, Lm9/f;->F:Lm9/j;

    .line 129
    .line 130
    invoke-virtual {p1}, Lm9/j;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 131
    .line 132
    .line 133
    :catch_2
    :try_start_4
    iget-object p1, p0, Lm9/f;->E:Ljava/net/Socket;

    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/net/Socket;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    .line 136
    .line 137
    .line 138
    :catch_3
    iget-object p1, p0, Lm9/f;->o:Li9/d;

    .line 139
    .line 140
    invoke-virtual {p1}, Li9/d;->n()V

    .line 141
    .line 142
    .line 143
    iget-object p1, p0, Lm9/f;->p:Li9/d;

    .line 144
    .line 145
    invoke-virtual {p1}, Li9/d;->n()V

    .line 146
    .line 147
    .line 148
    iget-object p1, p0, Lm9/f;->q:Li9/d;

    .line 149
    .line 150
    invoke-virtual {p1}, Li9/d;->n()V

    .line 151
    .line 152
    .line 153
    return-void

    .line 154
    :goto_3
    monitor-exit p0

    .line 155
    throw p1
.end method

.method public final w0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm9/f;->g:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm9/f;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
