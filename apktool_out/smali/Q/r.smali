.class public LQ/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LQ/r$b;,
        LQ/r$c;
    }
.end annotation


# instance fields
.field final a:LP/P;

.field final b:LF/M;

.field final c:LF/M;

.field private d:LQ/r$c;

.field private e:LQ/r$b;


# direct methods
.method public constructor <init>(LF/M;LF/M;LP/P;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LQ/r;->b:LF/M;

    .line 5
    .line 6
    iput-object p2, p0, LQ/r;->c:LF/M;

    .line 7
    .line 8
    iput-object p3, p0, LQ/r;->a:LP/P;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(LQ/r;)V
    .locals 1

    .line 1
    iget-object p0, p0, LQ/r;->d:LQ/r$c;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/util/AbstractMap;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LP/L;

    .line 24
    .line 25
    invoke-virtual {v0}, LP/L;->i()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    return-void
.end method

.method public static synthetic b(LQ/r;LF/M;LF/M;LP/L;LP/L;Ljava/util/Map$Entry;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LQ/r;->c(LF/M;LF/M;LP/L;LP/L;Ljava/util/Map$Entry;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private c(LF/M;LF/M;LP/L;LP/L;Ljava/util/Map$Entry;)V
    .locals 5

    .line 1
    invoke-interface {p5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LP/L;

    .line 6
    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v2, "     -> outputEdge = "

    .line 13
    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const-string v2, "DualSurfaceProcessorNode"

    .line 25
    .line 26
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p3}, LP/L;->s()LF/o1;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, LF/o1;->f()Landroid/util/Size;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, LQ/d;

    .line 42
    .line 43
    invoke-virtual {v2}, LQ/d;->a()LR/f;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {v2}, LR/f;->a()Landroid/graphics/Rect;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {p3}, LP/L;->u()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    const/4 v3, 0x0

    .line 56
    if-eqz p3, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move-object p1, v3

    .line 60
    :goto_0
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p3

    .line 64
    check-cast p3, LQ/d;

    .line 65
    .line 66
    invoke-virtual {p3}, LQ/d;->a()LR/f;

    .line 67
    .line 68
    .line 69
    move-result-object p3

    .line 70
    invoke-virtual {p3}, LR/f;->c()I

    .line 71
    .line 72
    .line 73
    move-result p3

    .line 74
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    check-cast v4, LQ/d;

    .line 79
    .line 80
    invoke-virtual {v4}, LQ/d;->a()LR/f;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-virtual {v4}, LR/f;->g()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {v1, v2, p1, p3, v4}, Ly/w0$a;->f(Landroid/util/Size;Landroid/graphics/Rect;LF/M;IZ)Ly/w0$a;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p4}, LP/L;->s()LF/o1;

    .line 93
    .line 94
    .line 95
    move-result-object p3

    .line 96
    invoke-virtual {p3}, LF/o1;->f()Landroid/util/Size;

    .line 97
    .line 98
    .line 99
    move-result-object p3

    .line 100
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, LQ/d;

    .line 105
    .line 106
    invoke-virtual {v1}, LQ/d;->b()LR/f;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, LR/f;->a()Landroid/graphics/Rect;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-virtual {p4}, LP/L;->u()Z

    .line 115
    .line 116
    .line 117
    move-result p4

    .line 118
    if-eqz p4, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    move-object p2, v3

    .line 122
    :goto_1
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p4

    .line 126
    check-cast p4, LQ/d;

    .line 127
    .line 128
    invoke-virtual {p4}, LQ/d;->b()LR/f;

    .line 129
    .line 130
    .line 131
    move-result-object p4

    .line 132
    invoke-virtual {p4}, LR/f;->c()I

    .line 133
    .line 134
    .line 135
    move-result p4

    .line 136
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    check-cast v2, LQ/d;

    .line 141
    .line 142
    invoke-virtual {v2}, LQ/d;->b()LR/f;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-virtual {v2}, LR/f;->g()Z

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    invoke-static {p3, v1, p2, p4, v2}, Ly/w0$a;->f(Landroid/util/Size;Landroid/graphics/Rect;LF/M;IZ)Ly/w0$a;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-interface {p5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    check-cast p3, LQ/d;

    .line 159
    .line 160
    invoke-virtual {p3}, LQ/d;->a()LR/f;

    .line 161
    .line 162
    .line 163
    move-result-object p3

    .line 164
    invoke-virtual {p3}, LR/f;->b()I

    .line 165
    .line 166
    .line 167
    move-result p3

    .line 168
    invoke-virtual {v0, p3, p1, p2}, LP/L;->j(ILy/w0$a;Ly/w0$a;)Lm5/a;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    new-instance p2, LQ/r$a;

    .line 173
    .line 174
    invoke-direct {p2, p0, v0}, LQ/r$a;-><init>(LQ/r;LP/L;)V

    .line 175
    .line 176
    .line 177
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 178
    .line 179
    .line 180
    move-result-object p3

    .line 181
    invoke-static {p1, p2, p3}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 182
    .line 183
    .line 184
    return-void
.end method

.method private e(LF/M;LF/M;LP/L;LP/L;Ljava/util/Map;)V
    .locals 8

    .line 1
    invoke-interface {p5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p5

    .line 5
    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p5

    .line 9
    :goto_0
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    move-object v6, v0

    .line 20
    check-cast v6, Ljava/util/Map$Entry;

    .line 21
    .line 22
    move-object v1, p0

    .line 23
    move-object v2, p1

    .line 24
    move-object v3, p2

    .line 25
    move-object v4, p3

    .line 26
    move-object v5, p4

    .line 27
    invoke-direct/range {v1 .. v6}, LQ/r;->c(LF/M;LF/M;LP/L;LP/L;Ljava/util/Map$Entry;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, LP/L;

    .line 35
    .line 36
    new-instance v1, LQ/q;

    .line 37
    .line 38
    move-object v7, v6

    .line 39
    move-object v6, v5

    .line 40
    move-object v5, v4

    .line 41
    move-object v4, v3

    .line 42
    move-object v3, v2

    .line 43
    move-object v2, p0

    .line 44
    invoke-direct/range {v1 .. v7}, LQ/q;-><init>(LQ/r;LF/M;LF/M;LP/L;LP/L;Ljava/util/Map$Entry;)V

    .line 45
    .line 46
    .line 47
    move-object v2, v3

    .line 48
    move-object v3, v4

    .line 49
    move-object v4, v5

    .line 50
    move-object v5, v6

    .line 51
    invoke-virtual {p1, v1}, LP/L;->e(Ljava/lang/Runnable;)V

    .line 52
    .line 53
    .line 54
    move-object p1, v2

    .line 55
    move-object p2, v3

    .line 56
    move-object p3, v4

    .line 57
    move-object p4, v5

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    return-void
.end method

.method private f(LF/M;LP/L;Z)V
    .locals 0

    .line 1
    invoke-virtual {p2, p1, p3}, LP/L;->l(LF/M;Z)Ly/I0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LQ/r;->a:LP/P;

    .line 6
    .line 7
    invoke-interface {p2, p1}, Ly/x0;->b(Ly/I0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private h(LP/L;LR/f;)LP/L;
    .locals 13

    .line 1
    invoke-virtual {p2}, LR/f;->a()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p2}, LR/f;->c()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p2}, LR/f;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    new-instance v7, Landroid/graphics/Matrix;

    .line 14
    .line 15
    invoke-virtual {p1}, LP/L;->r()Landroid/graphics/Matrix;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-direct {v7, v3}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    .line 20
    .line 21
    .line 22
    new-instance v3, Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-direct {v3, v0}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2}, LR/f;->d()Landroid/util/Size;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    invoke-static {v4}, LH/z;->s(Landroid/util/Size;)Landroid/graphics/RectF;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    invoke-static {v3, v4, v1, v2}, LH/z;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;IZ)Landroid/graphics/Matrix;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1}, LH/z;->f(Landroid/graphics/Rect;I)Landroid/util/Size;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {p2}, LR/f;->d()Landroid/util/Size;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v0, v3}, LH/z;->j(Landroid/util/Size;Landroid/util/Size;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    invoke-static {v0}, LH0/g;->a(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, LR/f;->d()Landroid/util/Size;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, LH/z;->q(Landroid/util/Size;)Landroid/graphics/Rect;

    .line 62
    .line 63
    .line 64
    move-result-object v9

    .line 65
    invoke-virtual {p1}, LP/L;->s()LF/o1;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, LF/o1;->i()LF/o1$a;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {p2}, LR/f;->d()Landroid/util/Size;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-virtual {v0, v3}, LF/o1$a;->f(Landroid/util/Size;)LF/o1$a;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, LF/o1$a;->a()LF/o1;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    new-instance v3, LP/L;

    .line 86
    .line 87
    invoke-virtual {p2}, LR/f;->e()I

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    invoke-virtual {p2}, LR/f;->b()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-virtual {p1}, LP/L;->q()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    sub-int v10, p2, v1

    .line 100
    .line 101
    invoke-virtual {p1}, LP/L;->w()Z

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    if-eq p1, v2, :cond_0

    .line 106
    .line 107
    const/4 p1, 0x1

    .line 108
    :goto_0
    move v12, p1

    .line 109
    goto :goto_1

    .line 110
    :cond_0
    const/4 p1, 0x0

    .line 111
    goto :goto_0

    .line 112
    :goto_1
    const/4 v8, 0x0

    .line 113
    const/4 v11, -0x1

    .line 114
    invoke-direct/range {v3 .. v12}, LP/L;-><init>(IILF/o1;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 115
    .line 116
    .line 117
    return-object v3
.end method


# virtual methods
.method public d()V
    .locals 1

    .line 1
    iget-object v0, p0, LQ/r;->a:LP/P;

    .line 2
    .line 3
    invoke-interface {v0}, LP/P;->a()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LQ/p;

    .line 7
    .line 8
    invoke-direct {v0, p0}, LQ/p;-><init>(LQ/r;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, LH/y;->e(Ljava/lang/Runnable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public g(LQ/r$b;)LQ/r$c;
    .locals 6

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "DualSurfaceProcessorNode Transform Processor = "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, LQ/r;->a:LP/P;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "\n   primary input = "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, LQ/r$b;->b()LP/L;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, "\n   secondary input = "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, LQ/r$b;->c()LP/L;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "DualSurfaceProcessorNode"

    .line 48
    .line 49
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1}, LQ/r$b;->a()Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_0

    .line 65
    .line 66
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, LQ/d;

    .line 71
    .line 72
    new-instance v2, Ljava/lang/StringBuilder;

    .line 73
    .line 74
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 75
    .line 76
    .line 77
    const-string v3, "   outputConfig = "

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v2, "SurfaceProcessorNode"

    .line 90
    .line 91
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    iput-object p1, p0, LQ/r;->e:LQ/r$b;

    .line 96
    .line 97
    new-instance p1, LQ/r$c;

    .line 98
    .line 99
    invoke-direct {p1}, LQ/r$c;-><init>()V

    .line 100
    .line 101
    .line 102
    iput-object p1, p0, LQ/r;->d:LQ/r$c;

    .line 103
    .line 104
    iget-object p1, p0, LQ/r;->e:LQ/r$b;

    .line 105
    .line 106
    invoke-virtual {p1}, LQ/r$b;->b()LP/L;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    iget-object p1, p0, LQ/r;->e:LQ/r$b;

    .line 111
    .line 112
    invoke-virtual {p1}, LQ/r$b;->c()LP/L;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    iget-object p1, p0, LQ/r;->e:LQ/r$b;

    .line 117
    .line 118
    invoke-virtual {p1}, LQ/r$b;->a()Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    if-eqz v0, :cond_1

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, LQ/d;

    .line 137
    .line 138
    iget-object v1, p0, LQ/r;->d:LQ/r$c;

    .line 139
    .line 140
    invoke-virtual {v0}, LQ/d;->a()LR/f;

    .line 141
    .line 142
    .line 143
    move-result-object v2

    .line 144
    invoke-direct {p0, v3, v2}, LQ/r;->h(LP/L;LR/f;)LP/L;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-virtual {v1, v0, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    iget-object p1, p0, LQ/r;->b:LF/M;

    .line 153
    .line 154
    const/4 v0, 0x1

    .line 155
    invoke-direct {p0, p1, v3, v0}, LQ/r;->f(LF/M;LP/L;Z)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p0, LQ/r;->c:LF/M;

    .line 159
    .line 160
    const/4 v0, 0x0

    .line 161
    invoke-direct {p0, p1, v4, v0}, LQ/r;->f(LF/M;LP/L;Z)V

    .line 162
    .line 163
    .line 164
    iget-object v1, p0, LQ/r;->b:LF/M;

    .line 165
    .line 166
    iget-object v2, p0, LQ/r;->c:LF/M;

    .line 167
    .line 168
    iget-object v5, p0, LQ/r;->d:LQ/r$c;

    .line 169
    .line 170
    move-object v0, p0

    .line 171
    invoke-direct/range {v0 .. v5}, LQ/r;->e(LF/M;LF/M;LP/L;LP/L;Ljava/util/Map;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, v0, LQ/r;->d:LQ/r$c;

    .line 175
    .line 176
    return-object p1
.end method
