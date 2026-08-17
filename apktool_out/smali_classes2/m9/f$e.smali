.class public final Lm9/f$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm9/h$c;
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation


# instance fields
.field private final g:Lm9/h;

.field final synthetic h:Lm9/f;


# direct methods
.method public constructor <init>(Lm9/f;Lm9/h;)V
    .locals 1

    .line 1
    const-string v0, "reader"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lm9/f$e;->g:Lm9/h;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    .line 1
    return-void
.end method

.method public c(ZIILjava/util/List;)V
    .locals 13

    .line 1
    move-object/from16 v9, p4

    .line 2
    .line 3
    const-string v0, "headerBlock"

    .line 4
    .line 5
    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 9
    .line 10
    invoke-virtual {v0, p2}, Lm9/f;->X0(I)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 17
    .line 18
    invoke-virtual {v0, p2, v9, p1}, Lm9/f;->U0(ILjava/util/List;Z)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    iget-object v11, p0, Lm9/f$e;->h:Lm9/f;

    .line 23
    .line 24
    monitor-enter v11

    .line 25
    :try_start_0
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 26
    .line 27
    invoke-virtual {v0, p2}, Lm9/f;->M0(I)Lm9/i;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    if-nez v7, :cond_4

    .line 32
    .line 33
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 34
    .line 35
    invoke-static {v0}, Lm9/f;->W(Lm9/f;)Z

    .line 36
    .line 37
    .line 38
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    monitor-exit v11

    .line 42
    return-void

    .line 43
    :cond_1
    :try_start_1
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 44
    .line 45
    invoke-virtual {v0}, Lm9/f;->A0()I

    .line 46
    .line 47
    .line 48
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 49
    if-gt p2, v0, :cond_2

    .line 50
    .line 51
    monitor-exit v11

    .line 52
    return-void

    .line 53
    :cond_2
    :try_start_2
    rem-int/lit8 v0, p2, 0x2

    .line 54
    .line 55
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 56
    .line 57
    invoke-virtual {v2}, Lm9/f;->J0()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    rem-int/lit8 v2, v2, 0x2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 62
    .line 63
    if-ne v0, v2, :cond_3

    .line 64
    .line 65
    monitor-exit v11

    .line 66
    return-void

    .line 67
    :cond_3
    :try_start_3
    invoke-static {v9}, Lf9/c;->M(Ljava/util/List;)Le9/t;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    new-instance v0, Lm9/i;

    .line 72
    .line 73
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    move v4, p1

    .line 77
    move v1, p2

    .line 78
    invoke-direct/range {v0 .. v5}, Lm9/i;-><init>(ILm9/f;ZZLe9/t;)V

    .line 79
    .line 80
    .line 81
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 82
    .line 83
    invoke-virtual {v2, p2}, Lm9/f;->a1(I)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 87
    .line 88
    invoke-virtual {v2}, Lm9/f;->N0()Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v2, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 100
    .line 101
    invoke-static {v2}, Lm9/f;->J(Lm9/f;)Li9/e;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-virtual {v2}, Li9/e;->i()Li9/d;

    .line 106
    .line 107
    .line 108
    move-result-object v12

    .line 109
    new-instance v2, Ljava/lang/StringBuilder;

    .line 110
    .line 111
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 112
    .line 113
    .line 114
    iget-object v3, p0, Lm9/f$e;->h:Lm9/f;

    .line 115
    .line 116
    invoke-virtual {v3}, Lm9/f;->y0()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    const/16 v3, 0x5b

    .line 124
    .line 125
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    const-string v3, "] onStream"

    .line 132
    .line 133
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    move-object v5, v0

    .line 141
    new-instance v0, Lm9/f$e$b;

    .line 142
    .line 143
    move-object v1, v2

    .line 144
    const/4 v2, 0x1

    .line 145
    move-object v3, v1

    .line 146
    move v4, v2

    .line 147
    move-object v6, p0

    .line 148
    move v10, p1

    .line 149
    move v8, p2

    .line 150
    invoke-direct/range {v0 .. v10}, Lm9/f$e$b;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/i;Lm9/f$e;Lm9/i;ILjava/util/List;Z)V

    .line 151
    .line 152
    .line 153
    const-wide/16 v1, 0x0

    .line 154
    .line 155
    invoke-virtual {v12, v0, v1, v2}, Li9/d;->i(Li9/a;J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 156
    .line 157
    .line 158
    monitor-exit v11

    .line 159
    return-void

    .line 160
    :catchall_0
    move-exception v0

    .line 161
    goto :goto_0

    .line 162
    :cond_4
    :try_start_4
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 163
    .line 164
    monitor-exit v11

    .line 165
    invoke-static/range {p4 .. p4}, Lf9/c;->M(Ljava/util/List;)Le9/t;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v7, v0, p1}, Lm9/i;->x(Le9/t;Z)V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :goto_0
    monitor-exit v11

    .line 174
    throw v0
.end method

.method public d(IJ)V
    .locals 3

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    :try_start_0
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-virtual {v0}, Lm9/f;->O0()J

    .line 9
    .line 10
    .line 11
    move-result-wide v1

    .line 12
    add-long/2addr v1, p2

    .line 13
    invoke-static {v0, v1, v2}, Lm9/f;->l0(Lm9/f;J)V

    .line 14
    .line 15
    .line 16
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 21
    .line 22
    .line 23
    sget-object p2, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    monitor-exit p1

    .line 26
    return-void

    .line 27
    :catchall_0
    move-exception p2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    :try_start_1
    new-instance p2, Ljava/lang/NullPointerException;

    .line 30
    .line 31
    const-string p3, "null cannot be cast to non-null type java.lang.Object"

    .line 32
    .line 33
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 37
    :goto_0
    monitor-exit p1

    .line 38
    throw p2

    .line 39
    :cond_1
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 40
    .line 41
    invoke-virtual {v0, p1}, Lm9/f;->M0(I)Lm9/i;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    monitor-enter p1

    .line 48
    :try_start_2
    invoke-virtual {p1, p2, p3}, Lm9/i;->a(J)V

    .line 49
    .line 50
    .line 51
    sget-object p2, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 52
    .line 53
    monitor-exit p1

    .line 54
    return-void

    .line 55
    :catchall_1
    move-exception p2

    .line 56
    monitor-exit p1

    .line 57
    throw p2

    .line 58
    :cond_2
    return-void
.end method

.method public f(ILm9/b;Lt9/k;)V
    .locals 3

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p2, "debugData"

    .line 7
    .line 8
    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p3}, Lt9/k;->E()I

    .line 12
    .line 13
    .line 14
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 15
    .line 16
    monitor-enter p2

    .line 17
    :try_start_0
    iget-object p3, p0, Lm9/f$e;->h:Lm9/f;

    .line 18
    .line 19
    invoke-virtual {p3}, Lm9/f;->N0()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p3

    .line 23
    invoke-interface {p3}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const/4 v0, 0x0

    .line 28
    new-array v1, v0, [Lm9/i;

    .line 29
    .line 30
    invoke-interface {p3, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    if-eqz p3, :cond_2

    .line 35
    .line 36
    check-cast p3, [Lm9/i;

    .line 37
    .line 38
    iget-object v1, p0, Lm9/f$e;->h:Lm9/f;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-static {v1, v2}, Lm9/f;->k0(Lm9/f;Z)V

    .line 42
    .line 43
    .line 44
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    monitor-exit p2

    .line 47
    array-length p2, p3

    .line 48
    :goto_0
    if-ge v0, p2, :cond_1

    .line 49
    .line 50
    aget-object v1, p3, v0

    .line 51
    .line 52
    invoke-virtual {v1}, Lm9/i;->j()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-le v2, p1, :cond_0

    .line 57
    .line 58
    invoke-virtual {v1}, Lm9/i;->t()Z

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    if-eqz v2, :cond_0

    .line 63
    .line 64
    sget-object v2, Lm9/b;->o:Lm9/b;

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Lm9/i;->y(Lm9/b;)V

    .line 67
    .line 68
    .line 69
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 70
    .line 71
    invoke-virtual {v1}, Lm9/i;->j()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {v2, v1}, Lm9/f;->Y0(I)Lm9/i;

    .line 76
    .line 77
    .line 78
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_1
    return-void

    .line 82
    :catchall_0
    move-exception p1

    .line 83
    goto :goto_1

    .line 84
    :cond_2
    :try_start_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 85
    .line 86
    const-string p3, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 87
    .line 88
    invoke-direct {p1, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 92
    :goto_1
    monitor-exit p2

    .line 93
    throw p1
.end method

.method public g(ZILt9/j;I)V
    .locals 2

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-virtual {v0, p2}, Lm9/f;->X0(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 15
    .line 16
    invoke-virtual {v0, p2, p3, p4, p1}, Lm9/f;->T0(ILt9/j;IZ)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 21
    .line 22
    invoke-virtual {v0, p2}, Lm9/f;->M0(I)Lm9/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 29
    .line 30
    sget-object v0, Lm9/b;->i:Lm9/b;

    .line 31
    .line 32
    invoke-virtual {p1, p2, v0}, Lm9/f;->k1(ILm9/b;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 36
    .line 37
    int-to-long v0, p4

    .line 38
    invoke-virtual {p1, v0, v1}, Lm9/f;->f1(J)V

    .line 39
    .line 40
    .line 41
    invoke-interface {p3, v0, v1}, Lt9/j;->skip(J)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    invoke-virtual {v0, p3, p4}, Lm9/i;->w(Lt9/j;I)V

    .line 46
    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    sget-object p1, Lf9/c;->b:Le9/t;

    .line 51
    .line 52
    const/4 p2, 0x1

    .line 53
    invoke-virtual {v0, p1, p2}, Lm9/i;->x(Le9/t;Z)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm9/f$e;->u()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Li7/B;->a:Li7/B;

    .line 5
    .line 6
    return-object v0
.end method

.method public j(ILm9/b;)V
    .locals 1

    .line 1
    const-string v0, "errorCode"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lm9/f;->X0(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 15
    .line 16
    invoke-virtual {v0, p1, p2}, Lm9/f;->W0(ILm9/b;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lm9/f;->Y0(I)Lm9/i;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Lm9/i;->y(Lm9/b;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public l(ZII)V
    .locals 10

    .line 1
    if-eqz p1, :cond_4

    .line 2
    .line 3
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 4
    .line 5
    monitor-enter p1

    .line 6
    const/4 p3, 0x1

    .line 7
    const-wide/16 v0, 0x1

    .line 8
    .line 9
    if-eq p2, p3, :cond_3

    .line 10
    .line 11
    const/4 p3, 0x2

    .line 12
    if-eq p2, p3, :cond_2

    .line 13
    .line 14
    const/4 p3, 0x3

    .line 15
    if-eq p2, p3, :cond_0

    .line 16
    .line 17
    :goto_0
    :try_start_0
    sget-object p2, Li7/B;->a:Li7/B;

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    move-object p2, v0

    .line 22
    goto :goto_2

    .line 23
    :cond_0
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 24
    .line 25
    invoke-static {p2}, Lm9/f;->e(Lm9/f;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v2

    .line 29
    add-long/2addr v2, v0

    .line 30
    invoke-static {p2, v2, v3}, Lm9/f;->X(Lm9/f;J)V

    .line 31
    .line 32
    .line 33
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Ljava/lang/Object;->notifyAll()V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p2, Ljava/lang/NullPointerException;

    .line 42
    .line 43
    const-string p3, "null cannot be cast to non-null type java.lang.Object"

    .line 44
    .line 45
    invoke-direct {p2, p3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2

    .line 49
    :cond_2
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 50
    .line 51
    invoke-static {p2}, Lm9/f;->r(Lm9/f;)J

    .line 52
    .line 53
    .line 54
    move-result-wide v2

    .line 55
    add-long/2addr v2, v0

    .line 56
    invoke-static {p2, v2, v3}, Lm9/f;->d0(Lm9/f;J)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    iget-object p2, p0, Lm9/f$e;->h:Lm9/f;

    .line 61
    .line 62
    invoke-static {p2}, Lm9/f;->A(Lm9/f;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v2

    .line 66
    add-long/2addr v2, v0

    .line 67
    invoke-static {p2, v2, v3}, Lm9/f;->i0(Lm9/f;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    .line 69
    .line 70
    :goto_1
    monitor-exit p1

    .line 71
    return-void

    .line 72
    :goto_2
    monitor-exit p1

    .line 73
    throw p2

    .line 74
    :cond_4
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 75
    .line 76
    invoke-static {p1}, Lm9/f;->M(Lm9/f;)Li9/d;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, Lm9/f$e;->h:Lm9/f;

    .line 86
    .line 87
    invoke-virtual {v1}, Lm9/f;->y0()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, " ping"

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    new-instance v2, Lm9/f$e$c;

    .line 104
    .line 105
    const/4 v4, 0x1

    .line 106
    move-object v5, v3

    .line 107
    move v6, v4

    .line 108
    move-object v7, p0

    .line 109
    move v8, p2

    .line 110
    move v9, p3

    .line 111
    invoke-direct/range {v2 .. v9}, Lm9/f$e$c;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f$e;II)V

    .line 112
    .line 113
    .line 114
    const-wide/16 p2, 0x0

    .line 115
    .line 116
    invoke-virtual {p1, v2, p2, p3}, Li9/d;->i(Li9/a;J)V

    .line 117
    .line 118
    .line 119
    return-void
.end method

.method public n(IIIZ)V
    .locals 0

    .line 1
    return-void
.end method

.method public o(ZLm9/m;)V
    .locals 11

    .line 1
    const-string v0, "settings"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-static {v0}, Lm9/f;->M(Lm9/f;)Li9/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 18
    .line 19
    invoke-virtual {v2}, Lm9/f;->y0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, " applyAndAckSettings"

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
    new-instance v3, Lm9/f$e$d;

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
    invoke-direct/range {v3 .. v10}, Lm9/f$e$d;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f$e;ZLm9/m;)V

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

.method public q(IILjava/util/List;)V
    .locals 0

    .line 1
    const-string p1, "requestHeaders"

    .line 2
    .line 3
    invoke-static {p3, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lm9/f$e;->h:Lm9/f;

    .line 7
    .line 8
    invoke-virtual {p1, p2, p3}, Lm9/f;->V0(ILjava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final t(ZLm9/m;)V
    .locals 16

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    move-object/from16 v8, p2

    .line 4
    .line 5
    const-string v0, "settings"

    .line 6
    .line 7
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v9, Lkotlin/jvm/internal/B;

    .line 11
    .line 12
    invoke-direct {v9}, Lkotlin/jvm/internal/B;-><init>()V

    .line 13
    .line 14
    .line 15
    new-instance v10, Lkotlin/jvm/internal/C;

    .line 16
    .line 17
    invoke-direct {v10}, Lkotlin/jvm/internal/C;-><init>()V

    .line 18
    .line 19
    .line 20
    new-instance v6, Lkotlin/jvm/internal/C;

    .line 21
    .line 22
    invoke-direct {v6}, Lkotlin/jvm/internal/C;-><init>()V

    .line 23
    .line 24
    .line 25
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 26
    .line 27
    invoke-virtual {v0}, Lm9/f;->P0()Lm9/j;

    .line 28
    .line 29
    .line 30
    move-result-object v11

    .line 31
    monitor-enter v11

    .line 32
    :try_start_0
    iget-object v12, v5, Lm9/f$e;->h:Lm9/f;

    .line 33
    .line 34
    monitor-enter v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    :try_start_1
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 36
    .line 37
    invoke-virtual {v0}, Lm9/f;->L0()Lm9/m;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    move-object v1, v8

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance v1, Lm9/m;

    .line 46
    .line 47
    invoke-direct {v1}, Lm9/m;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v0}, Lm9/m;->g(Lm9/m;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v8}, Lm9/m;->g(Lm9/m;)V

    .line 54
    .line 55
    .line 56
    sget-object v2, Li7/B;->a:Li7/B;

    .line 57
    .line 58
    :goto_0
    iput-object v1, v6, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 59
    .line 60
    invoke-virtual {v1}, Lm9/m;->c()I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    int-to-long v1, v1

    .line 65
    invoke-virtual {v0}, Lm9/m;->c()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    int-to-long v3, v0

    .line 70
    sub-long/2addr v1, v3

    .line 71
    iput-wide v1, v9, Lkotlin/jvm/internal/B;->g:J

    .line 72
    .line 73
    const-wide/16 v13, 0x0

    .line 74
    .line 75
    cmp-long v0, v1, v13

    .line 76
    .line 77
    const/4 v15, 0x0

    .line 78
    if-eqz v0, :cond_3

    .line 79
    .line 80
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 81
    .line 82
    invoke-virtual {v0}, Lm9/f;->N0()Ljava/util/Map;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_1
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 94
    .line 95
    invoke-virtual {v0}, Lm9/f;->N0()Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    new-array v1, v15, [Lm9/i;

    .line 104
    .line 105
    invoke-interface {v0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    if-eqz v0, :cond_2

    .line 110
    .line 111
    check-cast v0, [Lm9/i;

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    goto/16 :goto_5

    .line 116
    .line 117
    :cond_2
    new-instance v0, Ljava/lang/NullPointerException;

    .line 118
    .line 119
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 120
    .line 121
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw v0

    .line 125
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 126
    :goto_2
    iput-object v0, v10, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 129
    .line 130
    iget-object v1, v6, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v1, Lm9/m;

    .line 133
    .line 134
    invoke-virtual {v0, v1}, Lm9/f;->b1(Lm9/m;)V

    .line 135
    .line 136
    .line 137
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 138
    .line 139
    invoke-static {v0}, Lm9/f;->I(Lm9/f;)Li9/d;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    new-instance v1, Ljava/lang/StringBuilder;

    .line 144
    .line 145
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 146
    .line 147
    .line 148
    iget-object v2, v5, Lm9/f$e;->h:Lm9/f;

    .line 149
    .line 150
    invoke-virtual {v2}, Lm9/f;->y0()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string v2, " onSettings"

    .line 158
    .line 159
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move-object v2, v0

    .line 167
    new-instance v0, Lm9/f$e$a;

    .line 168
    .line 169
    move-object v3, v2

    .line 170
    const/4 v2, 0x1

    .line 171
    move-object v4, v3

    .line 172
    move-object v3, v1

    .line 173
    move-object v7, v4

    .line 174
    move v4, v2

    .line 175
    move-object v15, v7

    .line 176
    move/from16 v7, p1

    .line 177
    .line 178
    invoke-direct/range {v0 .. v10}, Lm9/f$e$a;-><init>(Ljava/lang/String;ZLjava/lang/String;ZLm9/f$e;Lkotlin/jvm/internal/C;ZLm9/m;Lkotlin/jvm/internal/B;Lkotlin/jvm/internal/C;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v15, v0, v13, v14}, Li9/d;->i(Li9/a;J)V

    .line 182
    .line 183
    .line 184
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 185
    .line 186
    :try_start_2
    monitor-exit v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 187
    :try_start_3
    iget-object v0, v5, Lm9/f$e;->h:Lm9/f;

    .line 188
    .line 189
    invoke-virtual {v0}, Lm9/f;->P0()Lm9/j;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iget-object v1, v6, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v1, Lm9/m;

    .line 196
    .line 197
    invoke-virtual {v0, v1}, Lm9/j;->d(Lm9/m;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 198
    .line 199
    .line 200
    goto :goto_3

    .line 201
    :catchall_1
    move-exception v0

    .line 202
    goto :goto_6

    .line 203
    :catch_0
    move-exception v0

    .line 204
    :try_start_4
    iget-object v1, v5, Lm9/f$e;->h:Lm9/f;

    .line 205
    .line 206
    invoke-static {v1, v0}, Lm9/f;->d(Lm9/f;Ljava/io/IOException;)V

    .line 207
    .line 208
    .line 209
    :goto_3
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 210
    .line 211
    monitor-exit v11

    .line 212
    iget-object v0, v10, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v1, v0

    .line 215
    check-cast v1, [Lm9/i;

    .line 216
    .line 217
    if-eqz v1, :cond_4

    .line 218
    .line 219
    check-cast v0, [Lm9/i;

    .line 220
    .line 221
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 222
    .line 223
    .line 224
    array-length v1, v0

    .line 225
    const/4 v15, 0x0

    .line 226
    :goto_4
    if-ge v15, v1, :cond_4

    .line 227
    .line 228
    aget-object v2, v0, v15

    .line 229
    .line 230
    monitor-enter v2

    .line 231
    :try_start_5
    iget-wide v3, v9, Lkotlin/jvm/internal/B;->g:J

    .line 232
    .line 233
    invoke-virtual {v2, v3, v4}, Lm9/i;->a(J)V

    .line 234
    .line 235
    .line 236
    sget-object v3, Li7/B;->a:Li7/B;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 237
    .line 238
    monitor-exit v2

    .line 239
    add-int/lit8 v15, v15, 0x1

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :catchall_2
    move-exception v0

    .line 243
    monitor-exit v2

    .line 244
    throw v0

    .line 245
    :cond_4
    return-void

    .line 246
    :goto_5
    :try_start_6
    monitor-exit v12

    .line 247
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 248
    :goto_6
    monitor-exit v11

    .line 249
    throw v0
.end method

.method public u()V
    .locals 5

    .line 1
    sget-object v0, Lm9/b;->j:Lm9/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p0, Lm9/f$e;->g:Lm9/h;

    .line 5
    .line 6
    invoke-virtual {v2, p0}, Lm9/h;->k(Lm9/h$c;)V

    .line 7
    .line 8
    .line 9
    :goto_0
    iget-object v2, p0, Lm9/f$e;->g:Lm9/h;

    .line 10
    .line 11
    const/4 v3, 0x0

    .line 12
    invoke-virtual {v2, v3, p0}, Lm9/h;->e(ZLm9/h$c;)Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v2, Lm9/b;->h:Lm9/b;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 20
    .line 21
    :try_start_1
    sget-object v0, Lm9/b;->p:Lm9/b;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    iget-object v3, p0, Lm9/f$e;->h:Lm9/f;

    .line 24
    .line 25
    invoke-virtual {v3, v2, v0, v1}, Lm9/f;->t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V

    .line 26
    .line 27
    .line 28
    :goto_1
    iget-object v0, p0, Lm9/f$e;->g:Lm9/h;

    .line 29
    .line 30
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :catchall_0
    move-exception v3

    .line 35
    goto :goto_3

    .line 36
    :catch_0
    move-exception v1

    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception v3

    .line 39
    move-object v2, v0

    .line 40
    goto :goto_3

    .line 41
    :catch_1
    move-exception v1

    .line 42
    move-object v2, v0

    .line 43
    :goto_2
    :try_start_2
    sget-object v0, Lm9/b;->i:Lm9/b;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 44
    .line 45
    iget-object v2, p0, Lm9/f$e;->h:Lm9/f;

    .line 46
    .line 47
    invoke-virtual {v2, v0, v0, v1}, Lm9/f;->t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :goto_3
    iget-object v4, p0, Lm9/f$e;->h:Lm9/f;

    .line 52
    .line 53
    invoke-virtual {v4, v2, v0, v1}, Lm9/f;->t0(Lm9/b;Lm9/b;Ljava/io/IOException;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, p0, Lm9/f$e;->g:Lm9/h;

    .line 57
    .line 58
    invoke-static {v0}, Lf9/c;->j(Ljava/io/Closeable;)V

    .line 59
    .line 60
    .line 61
    throw v3
.end method
