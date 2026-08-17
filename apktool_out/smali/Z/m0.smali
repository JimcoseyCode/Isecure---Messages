.class public final LZ/m0;
.super Ly/J0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/m0$d;,
        LZ/m0$e;,
        LZ/m0$f;
    }
.end annotation


# static fields
.field private static final G:LZ/m0$e;


# instance fields
.field private A:I

.field private B:Z

.field private C:LZ/m0$f;

.field private D:LF/k1$c;

.field private E:Ljava/util/Map;

.field private final F:LF/V0$a;

.field r:LF/q0;

.field private s:LP/L;

.field t:LZ/d0;

.field u:LF/k1$b;

.field v:Lm5/a;

.field private w:Ly/I0;

.field x:LZ/x0$a;

.field private y:LP/U;

.field private z:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LZ/m0$e;

    .line 2
    .line 3
    invoke-direct {v0}, LZ/m0$e;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LZ/m0;->G:LZ/m0$e;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>(La0/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly/J0;-><init>(LF/D1;)V

    .line 2
    .line 3
    .line 4
    sget-object p1, LZ/d0;->a:LZ/d0;

    .line 5
    .line 6
    iput-object p1, p0, LZ/m0;->t:LZ/d0;

    .line 7
    .line 8
    new-instance p1, LF/k1$b;

    .line 9
    .line 10
    invoke-direct {p1}, LF/k1$b;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, LZ/m0;->u:LF/k1$b;

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, LZ/m0;->v:Lm5/a;

    .line 17
    .line 18
    sget-object p1, LZ/x0$a;->i:LZ/x0$a;

    .line 19
    .line 20
    iput-object p1, p0, LZ/m0;->x:LZ/x0$a;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    iput-boolean p1, p0, LZ/m0;->B:Z

    .line 24
    .line 25
    sget-object p1, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 26
    .line 27
    iput-object p1, p0, LZ/m0;->E:Ljava/util/Map;

    .line 28
    .line 29
    new-instance p1, LZ/m0$a;

    .line 30
    .line 31
    invoke-direct {p1, p0}, LZ/m0$a;-><init>(LZ/m0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LZ/m0;->F:LF/V0$a;

    .line 35
    .line 36
    return-void
.end method

.method private A0(Landroid/util/Size;Lg0/s0;)Landroid/graphics/Rect;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ly/J0;->E()Landroid/graphics/Rect;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Ly/J0;->E()Landroid/graphics/Rect;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-direct {v0, v3, v3, v1, v2}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 24
    .line 25
    .line 26
    :goto_0
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-interface {p2, v1, v2}, Lg0/s0;->a(II)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-static {v0, p1, p2}, LZ/m0;->t0(Landroid/graphics/Rect;Landroid/util/Size;Lg0/s0;)Landroid/graphics/Rect;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_2
    :goto_1
    return-object v0
.end method

.method private B0()V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LZ/m0;->D:LF/k1$c;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LF/k1$c;->b()V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, LZ/m0;->D:LF/k1$c;

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, LZ/m0;->r:LF/q0;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0}, LF/q0;->d()V

    .line 19
    .line 20
    .line 21
    iput-object v1, p0, LZ/m0;->r:LF/q0;

    .line 22
    .line 23
    :cond_1
    iget-object v0, p0, LZ/m0;->y:LP/U;

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    invoke-virtual {v0}, LP/U;->f()V

    .line 28
    .line 29
    .line 30
    iput-object v1, p0, LZ/m0;->y:LP/U;

    .line 31
    .line 32
    :cond_2
    iget-object v0, p0, LZ/m0;->s:LP/L;

    .line 33
    .line 34
    if-eqz v0, :cond_3

    .line 35
    .line 36
    invoke-virtual {v0}, LP/L;->i()V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, LZ/m0;->s:LP/L;

    .line 40
    .line 41
    :cond_3
    iput-object v1, p0, LZ/m0;->z:Landroid/graphics/Rect;

    .line 42
    .line 43
    iput-object v1, p0, LZ/m0;->w:Ly/I0;

    .line 44
    .line 45
    sget-object v0, LZ/d0;->a:LZ/d0;

    .line 46
    .line 47
    iput-object v0, p0, LZ/m0;->t:LZ/d0;

    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput v0, p0, LZ/m0;->A:I

    .line 51
    .line 52
    iput-boolean v0, p0, LZ/m0;->B:Z

    .line 53
    .line 54
    return-void
.end method

.method private C0(LF/M;La0/a;ILandroid/graphics/Rect;Landroid/util/Size;Ly/H;)LP/U;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LZ/m0;->S0(LF/M;La0/a;ILandroid/graphics/Rect;Landroid/util/Size;Ly/H;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string p1, "VideoCapture"

    .line 8
    .line 9
    const-string p2, "Surface processing is enabled."

    .line 10
    .line 11
    invoke-static {p1, p2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, LP/U;

    .line 15
    .line 16
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    check-cast p2, LF/M;

    .line 24
    .line 25
    invoke-virtual {p0}, Ly/J0;->n()Ly/k;

    .line 26
    .line 27
    .line 28
    invoke-static {p6}, LP/t$a;->a(Ly/H;)LP/P;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    invoke-direct {p1, p2, p3}, LP/U;-><init>(LF/M;LP/P;)V

    .line 33
    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    return-object p1
.end method

.method private D0(LF/L;LZ/r;Ly/H;LZ/e0;ILandroid/util/Range;Lg0/s0$a;Ljava/util/List;)Ljava/util/LinkedHashMap;
    .locals 3

    .line 1
    invoke-virtual {p2}, LZ/r;->d()LZ/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LZ/z0;->b()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    move-object v1, p6

    .line 10
    invoke-static {p4, p3}, LZ/y;->h(LZ/e0;Ly/H;)Ljava/util/Map;

    .line 11
    .line 12
    .line 13
    move-result-object p6

    .line 14
    invoke-direct {p0, p1, p5, v1}, LZ/m0;->P0(LF/L;ILandroid/util/Range;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    new-instance v1, LZ/x;

    .line 19
    .line 20
    invoke-direct {v1, p1, p6}, LZ/x;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 21
    .line 22
    .line 23
    new-instance p5, Ljava/util/LinkedHashMap;

    .line 24
    .line 25
    invoke-direct {p5}, Ljava/util/LinkedHashMap;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-interface {p8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p8

    .line 32
    :goto_0
    invoke-interface {p8}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    invoke-interface {p8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, LZ/v;

    .line 43
    .line 44
    invoke-virtual {v1, p1, v0}, LZ/x;->g(LZ/v;I)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {p5, p1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object p1, p7

    .line 53
    invoke-static/range {p1 .. p6}, LZ/m0;->G0(Lg0/s0$a;LZ/r;Ly/H;LZ/e0;Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    return-object p1
.end method

.method private E0(La0/a;LF/o1;)LF/k1$b;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static {}, LH/y;->b()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Ly/J0;->i()LF/M;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LF/M;

    .line 15
    .line 16
    invoke-virtual/range {p2 .. p2}, LF/o1;->f()Landroid/util/Size;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    new-instance v7, LZ/g0;

    .line 21
    .line 22
    invoke-direct {v7, v0}, LZ/g0;-><init>(LZ/m0;)V

    .line 23
    .line 24
    .line 25
    invoke-static/range {p2 .. p2}, LZ/m0;->W0(LF/o1;)Landroid/util/Range;

    .line 26
    .line 27
    .line 28
    move-result-object v8

    .line 29
    invoke-direct {v0}, LZ/m0;->J0()LZ/r;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    invoke-virtual/range {p2 .. p2}, LF/o1;->g()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-interface {v1}, LF/M;->d()Ly/q;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-direct {v0, v4, v3}, LZ/m0;->R0(Ly/q;I)LZ/e0;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual/range {p2 .. p2}, LF/o1;->b()Ly/H;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-interface {v4, v5, v6}, LZ/e0;->a(Landroid/util/Size;Ly/H;)Lb0/i;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    invoke-virtual/range {p1 .. p1}, La0/a;->f0()Lg0/s0$a;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-static {v9, v4, v2, v6}, LZ/m0;->Y0(Lg0/s0$a;Lb0/i;LZ/r;Ly/H;)Lg0/s0;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-direct {v0, v1}, LZ/m0;->I0(LF/M;)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    iput v2, v0, LZ/m0;->A:I

    .line 69
    .line 70
    invoke-direct {v0, v5, v9}, LZ/m0;->A0(Landroid/util/Size;Lg0/s0;)Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iget v4, v0, LZ/m0;->A:I

    .line 75
    .line 76
    invoke-direct {v0, v2, v4}, LZ/m0;->u0(Landroid/graphics/Rect;I)Landroid/graphics/Rect;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iput-object v4, v0, LZ/m0;->z:Landroid/graphics/Rect;

    .line 81
    .line 82
    invoke-direct {v0, v5, v2, v4}, LZ/m0;->v0(Landroid/util/Size;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/util/Size;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-direct {v0}, LZ/m0;->d1()Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v11, 0x1

    .line 91
    if-eqz v2, :cond_0

    .line 92
    .line 93
    iput-boolean v11, v0, LZ/m0;->B:Z

    .line 94
    .line 95
    :cond_0
    iget-object v4, v0, LZ/m0;->z:Landroid/graphics/Rect;

    .line 96
    .line 97
    iget v12, v0, LZ/m0;->A:I

    .line 98
    .line 99
    move-object/from16 v2, p1

    .line 100
    .line 101
    invoke-direct/range {v0 .. v6}, LZ/m0;->S0(LF/M;La0/a;ILandroid/graphics/Rect;Landroid/util/Size;Ly/H;)Z

    .line 102
    .line 103
    .line 104
    move-result v13

    .line 105
    invoke-static {v4, v12, v13, v9}, LZ/m0;->s0(Landroid/graphics/Rect;IZLg0/s0;)Landroid/graphics/Rect;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iput-object v4, v0, LZ/m0;->z:Landroid/graphics/Rect;

    .line 110
    .line 111
    invoke-direct/range {v0 .. v6}, LZ/m0;->C0(LF/M;La0/a;ILandroid/graphics/Rect;Landroid/util/Size;Ly/H;)LP/U;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    move v9, v3

    .line 116
    iput-object v4, v0, LZ/m0;->y:LP/U;

    .line 117
    .line 118
    invoke-interface {v1}, LF/M;->o()Z

    .line 119
    .line 120
    .line 121
    move-result v2

    .line 122
    const/4 v3, 0x0

    .line 123
    if-eqz v2, :cond_2

    .line 124
    .line 125
    iget-object v2, v0, LZ/m0;->y:LP/U;

    .line 126
    .line 127
    if-eqz v2, :cond_1

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_1
    move v6, v3

    .line 131
    goto :goto_1

    .line 132
    :cond_2
    :goto_0
    move v6, v11

    .line 133
    :goto_1
    iget-object v2, v0, LZ/m0;->y:LP/U;

    .line 134
    .line 135
    invoke-static {v1, v2}, LZ/m0;->X0(LF/M;LP/U;)LF/v1;

    .line 136
    .line 137
    .line 138
    move-result-object v5

    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v4, "camera timebase = "

    .line 145
    .line 146
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-interface {v1}, LF/M;->r()LF/L;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-interface {v4}, LF/L;->m()LF/v1;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    const-string v4, ", processing timebase = "

    .line 161
    .line 162
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    const-string v4, "VideoCapture"

    .line 173
    .line 174
    invoke-static {v4, v2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual/range {p2 .. p2}, LF/o1;->i()LF/o1$a;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-virtual {v2, v10}, LF/o1$a;->f(Landroid/util/Size;)LF/o1$a;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v2, v8}, LF/o1$a;->c(Landroid/util/Range;)LF/o1$a;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, LF/o1$a;->a()LF/o1;

    .line 190
    .line 191
    .line 192
    move-result-object v15

    .line 193
    iget-object v2, v0, LZ/m0;->s:LP/L;

    .line 194
    .line 195
    if-nez v2, :cond_3

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_3
    move v11, v3

    .line 199
    :goto_2
    invoke-static {v11}, LH0/g;->i(Z)V

    .line 200
    .line 201
    .line 202
    new-instance v12, LP/L;

    .line 203
    .line 204
    invoke-virtual {v0}, Ly/J0;->y()Landroid/graphics/Matrix;

    .line 205
    .line 206
    .line 207
    move-result-object v16

    .line 208
    invoke-interface {v1}, LF/M;->o()Z

    .line 209
    .line 210
    .line 211
    move-result v17

    .line 212
    iget-object v2, v0, LZ/m0;->z:Landroid/graphics/Rect;

    .line 213
    .line 214
    iget v3, v0, LZ/m0;->A:I

    .line 215
    .line 216
    invoke-virtual {v0}, Ly/J0;->f()I

    .line 217
    .line 218
    .line 219
    move-result v20

    .line 220
    invoke-direct {v0, v1}, LZ/m0;->i1(LF/M;)Z

    .line 221
    .line 222
    .line 223
    move-result v21

    .line 224
    const/4 v13, 0x2

    .line 225
    const/16 v14, 0x22

    .line 226
    .line 227
    move-object/from16 v18, v2

    .line 228
    .line 229
    move/from16 v19, v3

    .line 230
    .line 231
    invoke-direct/range {v12 .. v21}, LP/L;-><init>(IILF/o1;Landroid/graphics/Matrix;ZLandroid/graphics/Rect;IIZ)V

    .line 232
    .line 233
    .line 234
    iput-object v12, v0, LZ/m0;->s:LP/L;

    .line 235
    .line 236
    invoke-virtual {v12, v7}, LP/L;->e(Ljava/lang/Runnable;)V

    .line 237
    .line 238
    .line 239
    iget-object v2, v0, LZ/m0;->y:LP/U;

    .line 240
    .line 241
    if-eqz v2, :cond_4

    .line 242
    .line 243
    iget-object v2, v0, LZ/m0;->s:LP/L;

    .line 244
    .line 245
    invoke-static {v2}, LR/f;->j(LP/L;)LR/f;

    .line 246
    .line 247
    .line 248
    move-result-object v2

    .line 249
    iget-object v3, v0, LZ/m0;->s:LP/L;

    .line 250
    .line 251
    invoke-static {v2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-static {v3, v4}, LP/U$b;->c(LP/L;Ljava/util/List;)LP/U$b;

    .line 256
    .line 257
    .line 258
    move-result-object v3

    .line 259
    iget-object v4, v0, LZ/m0;->y:LP/U;

    .line 260
    .line 261
    invoke-virtual {v4, v3}, LP/U;->j(LP/U$b;)LP/U$c;

    .line 262
    .line 263
    .line 264
    move-result-object v3

    .line 265
    invoke-virtual {v3, v2}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, LP/L;

    .line 270
    .line 271
    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    new-instance v0, LZ/h0;

    .line 275
    .line 276
    move-object/from16 v4, p1

    .line 277
    .line 278
    move-object v3, v1

    .line 279
    move-object/from16 v1, p0

    .line 280
    .line 281
    invoke-direct/range {v0 .. v6}, LZ/h0;-><init>(LZ/m0;LP/L;LF/M;La0/a;LF/v1;Z)V

    .line 282
    .line 283
    .line 284
    move-object/from16 v22, v3

    .line 285
    .line 286
    move-object v3, v0

    .line 287
    move-object v0, v1

    .line 288
    move-object/from16 v1, v22

    .line 289
    .line 290
    invoke-virtual {v2, v3}, LP/L;->e(Ljava/lang/Runnable;)V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v2, v1}, LP/L;->k(LF/M;)Ly/I0;

    .line 294
    .line 295
    .line 296
    move-result-object v1

    .line 297
    iput-object v1, v0, LZ/m0;->w:Ly/I0;

    .line 298
    .line 299
    iget-object v1, v0, LZ/m0;->s:LP/L;

    .line 300
    .line 301
    invoke-virtual {v1}, LP/L;->o()LF/q0;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iput-object v1, v0, LZ/m0;->r:LF/q0;

    .line 306
    .line 307
    invoke-virtual {v1}, LF/q0;->k()Lm5/a;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    new-instance v3, LZ/i0;

    .line 312
    .line 313
    invoke-direct {v3, v0, v1}, LZ/i0;-><init>(LZ/m0;LF/q0;)V

    .line 314
    .line 315
    .line 316
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-interface {v2, v3, v1}, Lm5/a;->h(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 321
    .line 322
    .line 323
    goto :goto_3

    .line 324
    :cond_4
    iget-object v2, v0, LZ/m0;->s:LP/L;

    .line 325
    .line 326
    invoke-virtual {v2, v1}, LP/L;->k(LF/M;)Ly/I0;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    iput-object v1, v0, LZ/m0;->w:Ly/I0;

    .line 331
    .line 332
    invoke-virtual {v1}, Ly/I0;->n()LF/q0;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    iput-object v1, v0, LZ/m0;->r:LF/q0;

    .line 337
    .line 338
    :goto_3
    invoke-virtual/range {p1 .. p1}, La0/a;->g0()LZ/x0;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    iget-object v2, v0, LZ/m0;->w:Ly/I0;

    .line 343
    .line 344
    invoke-interface {v1, v2, v5, v6}, LZ/x0;->b(Ly/I0;LF/v1;Z)V

    .line 345
    .line 346
    .line 347
    invoke-direct {v0}, LZ/m0;->Z0()V

    .line 348
    .line 349
    .line 350
    iget-object v1, v0, LZ/m0;->r:LF/q0;

    .line 351
    .line 352
    const-class v2, Landroid/media/MediaCodec;

    .line 353
    .line 354
    invoke-virtual {v1, v2}, LF/q0;->p(Ljava/lang/Class;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual/range {p2 .. p2}, LF/o1;->f()Landroid/util/Size;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object/from16 v2, p1

    .line 362
    .line 363
    invoke-static {v2, v1}, LF/k1$b;->r(LF/D1;Landroid/util/Size;)LF/k1$b;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    invoke-virtual {v1, v9}, LF/k1$b;->A(I)LF/k1$b;

    .line 368
    .line 369
    .line 370
    move-object/from16 v3, p2

    .line 371
    .line 372
    invoke-virtual {v0, v1, v3}, Ly/J0;->b(LF/k1$b;LF/o1;)V

    .line 373
    .line 374
    .line 375
    invoke-interface {v2}, LF/D1;->H()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    invoke-virtual {v1, v2}, LF/k1$b;->C(I)LF/k1$b;

    .line 380
    .line 381
    .line 382
    iget-object v2, v0, LZ/m0;->D:LF/k1$c;

    .line 383
    .line 384
    if-eqz v2, :cond_5

    .line 385
    .line 386
    invoke-virtual {v2}, LF/k1$c;->b()V

    .line 387
    .line 388
    .line 389
    :cond_5
    new-instance v2, LF/k1$c;

    .line 390
    .line 391
    new-instance v4, LZ/j0;

    .line 392
    .line 393
    invoke-direct {v4, v0}, LZ/j0;-><init>(LZ/m0;)V

    .line 394
    .line 395
    .line 396
    invoke-direct {v2, v4}, LF/k1$c;-><init>(LF/k1$d;)V

    .line 397
    .line 398
    .line 399
    iput-object v2, v0, LZ/m0;->D:LF/k1$c;

    .line 400
    .line 401
    invoke-virtual {v1, v2}, LF/k1$b;->u(LF/k1$d;)LF/k1$b;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v3}, LF/o1;->d()LF/j0;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    if-eqz v2, :cond_6

    .line 409
    .line 410
    invoke-virtual {v3}, LF/o1;->d()LF/j0;

    .line 411
    .line 412
    .line 413
    move-result-object v2

    .line 414
    invoke-virtual {v1, v2}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 415
    .line 416
    .line 417
    :cond_6
    return-object v1
.end method

.method private static F0(LF/V0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-interface {p0}, LF/V0;->d()Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 19
    .line 20
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw p1
.end method

.method private static G0(Lg0/s0$a;LZ/r;Ly/H;LZ/e0;Ljava/util/LinkedHashMap;Ljava/util/Map;)Ljava/util/LinkedHashMap;
    .locals 7

    .line 1
    invoke-virtual {p4}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p4}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p4

    .line 22
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    :cond_1
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_6

    .line 31
    .line 32
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    check-cast v1, Ljava/util/Map$Entry;

    .line 37
    .line 38
    new-instance v2, Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/util/Collection;

    .line 45
    .line 46
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_5

    .line 58
    .line 59
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    check-cast v4, Landroid/util/Size;

    .line 64
    .line 65
    invoke-interface {p5, v4}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    invoke-interface {p3, v4, p2}, LZ/e0;->a(Landroid/util/Size;Ly/H;)Lb0/i;

    .line 73
    .line 74
    .line 75
    move-result-object v5

    .line 76
    if-nez v5, :cond_4

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_4
    invoke-static {p0, v5, p2, p1}, LZ/m0;->H0(Lg0/s0$a;Lb0/i;Ly/H;LZ/r;)Lg0/s0;

    .line 80
    .line 81
    .line 82
    move-result-object v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-virtual {v4}, Landroid/util/Size;->getWidth()I

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-interface {v5, v6, v4}, Lg0/s0;->a(II)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-nez v4, :cond_2

    .line 98
    .line 99
    invoke-interface {v3}, Ljava/util/Iterator;->remove()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-nez v3, :cond_1

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    check-cast v1, LZ/v;

    .line 114
    .line 115
    invoke-virtual {v0, v1, v2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_6
    return-object v0
.end method

.method private static H0(Lg0/s0$a;Lb0/i;Ly/H;LZ/r;)Lg0/s0;
    .locals 6

    .line 1
    invoke-virtual {p2}, Ly/H;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p3, p2}, LZ/m0;->Y0(Lg0/s0$a;Lb0/i;LZ/r;Ly/H;)Lg0/s0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-interface {p1}, LF/w0;->d()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x0

    .line 21
    const/high16 v2, -0x80000000

    .line 22
    .line 23
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, LF/w0$c;

    .line 34
    .line 35
    invoke-static {v3, p2}, Lh0/b;->f(LF/w0$c;Ly/H;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    new-instance v4, Ly/H;

    .line 42
    .line 43
    invoke-virtual {v3}, LF/w0$c;->g()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-static {v5}, Lh0/b;->h(I)I

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    invoke-virtual {v3}, LF/w0$c;->b()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    invoke-static {v3}, Lh0/b;->g(I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-direct {v4, v5, v3}, Ly/H;-><init>(II)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1, p3, v4}, LZ/m0;->Y0(Lg0/s0$a;Lb0/i;LZ/r;Ly/H;)Lg0/s0;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    if-nez v3, :cond_2

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    invoke-interface {v3}, Lg0/s0;->h()Landroid/util/Range;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Ljava/lang/Integer;

    .line 78
    .line 79
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    invoke-interface {v3}, Lg0/s0;->j()Landroid/util/Range;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v5}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/lang/Integer;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    invoke-static {v4, v5}, LO/d;->b(II)I

    .line 98
    .line 99
    .line 100
    move-result v4

    .line 101
    if-le v4, v2, :cond_1

    .line 102
    .line 103
    move-object v1, v3

    .line 104
    move v2, v4

    .line 105
    goto :goto_0

    .line 106
    :cond_3
    return-object v1
.end method

.method private I0(LF/M;)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ly/J0;->H(LF/M;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0, p1, v0}, Ly/J0;->u(LF/M;Z)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0}, LZ/m0;->d1()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, LZ/m0;->t:LZ/d0;

    .line 16
    .line 17
    invoke-virtual {v1}, LZ/d0;->b()Ly/I0$h;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ly/I0$h;->b()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {v1}, Ly/I0$h;->f()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eq v0, v1, :cond_0

    .line 33
    .line 34
    neg-int v2, v2

    .line 35
    :cond_0
    sub-int/2addr p1, v2

    .line 36
    invoke-static {p1}, LH/z;->v(I)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    :cond_1
    return p1
.end method

.method private J0()LZ/r;
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LZ/x0;->d()LF/V0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, LZ/m0;->F0(LF/V0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, LZ/r;

    .line 15
    .line 16
    return-object v0
.end method

.method private K0()LZ/r;
    .locals 2

    .line 1
    invoke-direct {p0}, LZ/m0;->J0()LZ/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v1, "MediaSpec can\'t be null"

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v0
.end method

.method private M0(Ljava/util/List;LZ/y;)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p2, p1}, LZ/y;->f(Ljava/util/List;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "Found selectedQualities "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " by "

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const-string v0, "VideoCapture"

    .line 31
    .line 32
    invoke-static {v0, p2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    if-nez p2, :cond_0

    .line 40
    .line 41
    return-object p1

    .line 42
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    const-string p2, "Unable to find selected quality"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1
.end method

.method private N0(La0/a;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, LF/D1;->q(I)I

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    return p1
.end method

.method private O0(Ly/H;LZ/e0;I)Ljava/util/List;
    .locals 1

    .line 1
    invoke-interface {p2, p1}, LZ/e0;->d(Ly/H;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v0, "supportedQualities = "

    .line 11
    .line 12
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    const-string v0, "VideoCapture"

    .line 23
    .line 24
    invoke-static {v0, p2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-eqz p2, :cond_1

    .line 32
    .line 33
    const/4 p2, 0x1

    .line 34
    if-eq p3, p2, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 38
    .line 39
    const-string p2, "No supported quality on the device for high-speed capture."

    .line 40
    .line 41
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    :goto_0
    return-object p1
.end method

.method private P0(LF/L;ILandroid/util/Range;)Ljava/util/List;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_1

    .line 3
    .line 4
    sget-object p2, LF/o1;->a:Landroid/util/Range;

    .line 5
    .line 6
    invoke-virtual {p2, p3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, LF/L;->v()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1

    .line 17
    :cond_0
    invoke-interface {p1, p3}, LF/L;->h(Landroid/util/Range;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    return-object p1

    .line 22
    :cond_1
    invoke-virtual {p0}, Ly/J0;->p()I

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    invoke-interface {p1, p2}, LF/L;->x(I)Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method private Q0(La0/a;)Landroid/util/Range;
    .locals 1

    .line 1
    sget-object v0, LF/o1;->a:Landroid/util/Range;

    .line 2
    .line 3
    invoke-interface {p1, v0}, LF/D1;->K(Landroid/util/Range;)Landroid/util/Range;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-object p1
.end method

.method private R0(Ly/q;I)LZ/e0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0, p1, p2}, LZ/x0;->c(Ly/q;I)LZ/e0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method private S0(LF/M;La0/a;ILandroid/graphics/Rect;Landroid/util/Size;Ly/H;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-ne p3, v1, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ly/J0;->n()Ly/k;

    .line 7
    .line 8
    .line 9
    invoke-static {p1, p2}, LZ/m0;->g1(LF/M;La0/a;)Z

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-nez p2, :cond_2

    .line 14
    .line 15
    invoke-static {p1}, LZ/m0;->h1(LF/M;)Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    if-nez p2, :cond_2

    .line 20
    .line 21
    invoke-static {p1, p6}, LZ/m0;->f1(LF/M;Ly/H;)Z

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    invoke-static {p4, p5}, LZ/m0;->e1(Landroid/graphics/Rect;Landroid/util/Size;)Z

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    if-nez p2, :cond_2

    .line 32
    .line 33
    invoke-direct {p0, p1}, LZ/m0;->i1(LF/M;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_2

    .line 38
    .line 39
    invoke-direct {p0}, LZ/m0;->d1()Z

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    if-eqz p1, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return v0

    .line 47
    :cond_2
    :goto_0
    return v1
.end method

.method private U0(LP/L;LF/M;La0/a;LF/v1;Z)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1, p2}, LP/L;->k(LF/M;)Ly/I0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, LZ/m0;->w:Ly/I0;

    .line 12
    .line 13
    invoke-virtual {p3}, La0/a;->g0()LZ/x0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object p2, p0, LZ/m0;->w:Ly/I0;

    .line 18
    .line 19
    invoke-interface {p1, p2, p4, p5}, LZ/x0;->b(Ly/I0;LF/v1;Z)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, LZ/m0;->Z0()V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private static W0(LF/o1;)Landroid/util/Range;
    .locals 2

    .line 1
    invoke-virtual {p0}, LF/o1;->c()Landroid/util/Range;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LF/o1;->a:Landroid/util/Range;

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, LF/o1;->g()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const/4 v0, 0x1

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    sget-object p0, LZ/m0$e;->f:Landroid/util/Range;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_0
    sget-object p0, LZ/m0$e;->e:Landroid/util/Range;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_1
    return-object v0
.end method

.method private static X0(LF/M;LP/U;)LF/v1;
    .locals 0

    .line 1
    if-nez p1, :cond_1

    .line 2
    .line 3
    invoke-interface {p0}, LF/M;->o()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    sget-object p0, LF/v1;->g:LF/v1;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    :goto_0
    invoke-interface {p0}, LF/M;->r()LF/L;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, LF/L;->m()LF/v1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method private static Y0(Lg0/s0$a;Lb0/i;LZ/r;Ly/H;)Lg0/s0;
    .locals 0

    .line 1
    invoke-static {p2, p3, p1}, Lf0/m;->e(LZ/r;Ly/H;Lb0/i;)Lf0/p;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-virtual {p2}, Lf0/l;->a()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-interface {p0, p2}, Lg0/s0$a;->a(Ljava/lang/String;)Lg0/s0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p2, 0x0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    const-string p0, "VideoCapture"

    .line 17
    .line 18
    const-string p1, "Can\'t find videoEncoderInfo"

    .line 19
    .line 20
    invoke-static {p0, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object p2

    .line 24
    :cond_0
    if-eqz p1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Lb0/i;->k()LF/w0$c;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, LF/w0$c;->k()Landroid/util/Size;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    :cond_1
    invoke-static {p0, p2}, Li0/g;->l(Lg0/s0;Landroid/util/Size;)Lg0/s0;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0
.end method

.method private Z0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, LZ/m0;->s:LP/L;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-direct {p0, v0}, LZ/m0;->I0(LF/M;)I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iput v0, p0, LZ/m0;->A:I

    .line 16
    .line 17
    invoke-virtual {p0}, Ly/J0;->f()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    invoke-virtual {v1, v0, v2}, LP/L;->z(II)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private a1(LF/D1$b;Ljava/util/LinkedHashMap;)V
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    check-cast v2, Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    const-string v2, "Set custom ordered resolutions = "

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "VideoCapture"

    .line 48
    .line 49
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Ly/I;->b()LF/R0;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    sget-object v1, LF/E0;->v:LF/j0$a;

    .line 57
    .line 58
    invoke-interface {p1, v1, v0}, LF/R0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p2, p0, LZ/m0;->E:Ljava/util/Map;

    .line 62
    .line 63
    return-void
.end method

.method private c1(LF/k1$b;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/m0;->v:Lm5/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const-string v0, "VideoCapture"

    .line 13
    .line 14
    const-string v1, "A newer surface update is requested. Previous surface update cancelled."

    .line 15
    .line 16
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    new-instance v0, LZ/f0;

    .line 20
    .line 21
    invoke-direct {v0, p0, p1}, LZ/f0;-><init>(LZ/m0;LF/k1$b;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, LZ/m0;->v:Lm5/a;

    .line 29
    .line 30
    new-instance v0, LZ/m0$c;

    .line 31
    .line 32
    invoke-direct {v0, p0, p1, p2}, LZ/m0$c;-><init>(LZ/m0;Lm5/a;Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-static {p1, v0, p2}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method private d1()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ/m0;->t:LZ/d0;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/d0;->b()Ly/I0$h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method private static e1(Landroid/graphics/Rect;Landroid/util/Size;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eq p1, p0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return p0

    .line 24
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 25
    return p0
.end method

.method private static f1(LF/M;Ly/H;)Z
    .locals 1

    .line 1
    const-class v0, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;

    .line 8
    .line 9
    invoke-interface {p0}, LF/M;->o()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Landroidx/camera/video/internal/compat/quirk/HdrRepeatingRequestFailureQuirk;->i(Ly/H;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static synthetic g0(LZ/m0;LP/L;LF/M;La0/a;LF/v1;Z)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LZ/m0;->U0(LP/L;LF/M;La0/a;LF/v1;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static g1(LF/M;La0/a;)Z
    .locals 0

    .line 1
    invoke-interface {p0}, LF/M;->o()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, La0/a;->h0()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static synthetic h0(LZ/m0;LF/k1;LF/k1$g;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LZ/m0;->V0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static h1(LF/M;)Z
    .locals 1

    .line 1
    invoke-interface {p0}, LF/M;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-static {}, Landroidx/camera/video/internal/compat/quirk/a;->c()LF/g1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;->d(LF/g1;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    invoke-interface {p0}, LF/M;->r()LF/L;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-interface {p0}, LF/L;->w()LF/g1;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, Landroidx/camera/core/internal/compat/quirk/SurfaceProcessingQuirk;->d(LF/g1;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    :cond_0
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public static synthetic i0(Landroid/graphics/Rect;Landroid/util/Size;Landroid/util/Size;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    sub-int/2addr p1, v1

    .line 23
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/2addr v0, p1

    .line 28
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    sub-int/2addr p1, v1

    .line 37
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    sub-int/2addr p2, p0

    .line 50
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/2addr p1, p0

    .line 55
    sub-int/2addr v0, p1

    .line 56
    return v0
.end method

.method private i1(LF/M;)Z
    .locals 1

    .line 1
    invoke-interface {p1}, LF/M;->o()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Ly/J0;->H(LF/M;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1
.end method

.method public static synthetic j0(LZ/m0;LF/q0;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/m0;->r:LF/q0;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LZ/m0;->B0()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public static synthetic k0(LZ/m0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly/J0;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private k1(LF/L;LF/D1$b;)V
    .locals 10

    .line 1
    invoke-direct {p0}, LZ/m0;->K0()LZ/r;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {v2}, LZ/r;->d()LZ/z0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, LZ/z0;->e()LZ/y;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p2}, LF/D1$b;->c()LF/D1;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, La0/a;

    .line 18
    .line 19
    sget-object v3, LF/E0;->v:LF/j0$a;

    .line 20
    .line 21
    invoke-interface {v1, v3}, LF/h1;->b(LF/j0$a;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    sget-object p1, LZ/z0;->b:LZ/y;

    .line 28
    .line 29
    if-ne v0, p1, :cond_0

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 p1, 0x0

    .line 34
    :goto_0
    const-string p2, "Custom ordered resolutions and QualitySelector can\'t both be set"

    .line 35
    .line 36
    invoke-static {p1, p2}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_1
    invoke-interface {v1}, LF/D0;->l()Ly/H;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-direct {p0, v1}, LZ/m0;->N0(La0/a;)I

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    invoke-direct {p0, v1}, LZ/m0;->Q0(La0/a;)Landroid/util/Range;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-direct {p0, p1, v5}, LZ/m0;->R0(Ly/q;I)LZ/e0;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v7, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 59
    .line 60
    .line 61
    const-string v8, "Update custom order resolutions: requestedDynamicRange = "

    .line 62
    .line 63
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v8, ", sessionType = "

    .line 70
    .line 71
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v8, ", targetFrameRate = "

    .line 78
    .line 79
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    const-string v8, "VideoCapture"

    .line 90
    .line 91
    invoke-static {v8, v7}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-direct {p0, v3, v4, v5}, LZ/m0;->O0(Ly/H;LZ/e0;I)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-eqz v9, :cond_2

    .line 103
    .line 104
    const-string p1, "Can\'t find any supported quality on the device."

    .line 105
    .line 106
    invoke-static {v8, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_2
    invoke-direct {p0, v7, v0}, LZ/m0;->M0(Ljava/util/List;LZ/y;)Ljava/util/List;

    .line 111
    .line 112
    .line 113
    move-result-object v8

    .line 114
    invoke-virtual {v1}, La0/a;->f0()Lg0/s0$a;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    move-object v0, p0

    .line 119
    move-object v1, p1

    .line 120
    invoke-direct/range {v0 .. v8}, LZ/m0;->D0(LF/L;LZ/r;Ly/H;LZ/e0;ILandroid/util/Range;Lg0/s0$a;Ljava/util/List;)Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    invoke-direct {p0, p2, p1}, LZ/m0;->a1(LF/D1$b;Ljava/util/LinkedHashMap;)V

    .line 125
    .line 126
    .line 127
    return-void
.end method

.method public static synthetic l0(Ljava/util/concurrent/atomic/AtomicBoolean;LF/k1$b;LF/r;)V
    .locals 2

    .line 1
    invoke-static {}, LH/y;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Surface update cancellation should only occur on main thread."

    .line 6
    .line 7
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, p2}, LF/k1$b;->t(LF/r;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public static synthetic m0(LZ/m0;LF/k1$b;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "androidx.camera.video.VideoCapture.streamUpdate"

    .line 13
    .line 14
    invoke-virtual {p1, v1, v0}, LF/k1$b;->o(Ljava/lang/String;Ljava/lang/Object;)LF/k1$b;

    .line 15
    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    invoke-direct {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 21
    .line 22
    .line 23
    new-instance v2, LZ/m0$b;

    .line 24
    .line 25
    invoke-direct {v2, p0, v0, p2, p1}, LZ/m0$b;-><init>(LZ/m0;Ljava/util/concurrent/atomic/AtomicBoolean;Landroidx/concurrent/futures/c$a;LF/k1$b;)V

    .line 26
    .line 27
    .line 28
    new-instance p0, LZ/k0;

    .line 29
    .line 30
    invoke-direct {p0, v0, p1, v2}, LZ/k0;-><init>(Ljava/util/concurrent/atomic/AtomicBoolean;LF/k1$b;LF/r;)V

    .line 31
    .line 32
    .line 33
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {p2, p0, v0}, Landroidx/concurrent/futures/c$a;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v2}, LF/k1$b;->j(LF/r;)LF/k1$b;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    filled-new-array {v1, p0}, [Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    const-string p1, "%s[0x%x]"

    .line 56
    .line 57
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method static synthetic n0(LZ/m0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly/J0;->d0(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic o0(LZ/m0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly/J0;->L()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic p0(LZ/m0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Ly/J0;->d0(Ljava/util/List;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic q0(LZ/m0;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Ly/J0;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static r0(Ljava/util/Set;IILandroid/util/Size;Lg0/s0;)V
    .locals 3

    .line 1
    const-string v0, "VideoCapture"

    .line 2
    .line 3
    invoke-virtual {p3}, Landroid/util/Size;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-gt p1, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p3}, Landroid/util/Size;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    if-le p2, p3, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    :try_start_0
    invoke-interface {p4, p1}, Lg0/s0;->f(I)Landroid/util/Range;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    new-instance v1, Landroid/util/Size;

    .line 21
    .line 22
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {p3, v2}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    check-cast p3, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    invoke-direct {v1, p1, p3}, Landroid/util/Size;-><init>(II)V

    .line 37
    .line 38
    .line 39
    invoke-interface {p0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catch_0
    move-exception p3

    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "No supportedHeights for width: "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v0, v1, p3}, Ly/h0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    :try_start_1
    invoke-interface {p4, p2}, Lg0/s0;->e(I)Landroid/util/Range;

    .line 65
    .line 66
    .line 67
    move-result-object p3

    .line 68
    new-instance p4, Landroid/util/Size;

    .line 69
    .line 70
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p3, p1}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/Integer;

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    invoke-direct {p4, p1, p2}, Landroid/util/Size;-><init>(II)V

    .line 85
    .line 86
    .line 87
    invoke-interface {p0, p4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :catch_1
    move-exception p0

    .line 92
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    const-string p3, "No supportedWidths for height: "

    .line 98
    .line 99
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {v0, p1, p0}, Ly/h0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    :cond_1
    :goto_1
    return-void
.end method

.method private static s0(Landroid/graphics/Rect;IZLg0/s0;)Landroid/graphics/Rect;
    .locals 1

    .line 1
    const-class v0, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    :goto_0
    invoke-virtual {v0, p0, p1, p3}, Landroidx/camera/video/internal/compat/quirk/SizeCannotEncodeVideoQuirk;->g(Landroid/graphics/Rect;ILg0/s0;)Landroid/graphics/Rect;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    return-object p0
.end method

.method private static t0(Landroid/graphics/Rect;Landroid/util/Size;Lg0/s0;)Landroid/graphics/Rect;
    .locals 7

    .line 1
    invoke-static {p0}, LH/z;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {p2}, Lg0/s0;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {p2}, Lg0/s0;->g()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {p2}, Lg0/s0;->h()Landroid/util/Range;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-interface {p2}, Lg0/s0;->j()Landroid/util/Range;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    filled-new-array {v0, v1, v2, v3, v4}, [Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"

    .line 34
    .line 35
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    const-string v1, "VideoCapture"

    .line 40
    .line 41
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Lg0/s0;->h()Landroid/util/Range;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    invoke-interface {p2}, Lg0/s0;->j()Landroid/util/Range;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    invoke-interface {p2}, Lg0/s0;->d()Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    if-eqz v0, :cond_1

    .line 86
    .line 87
    invoke-interface {p2}, Lg0/s0;->j()Landroid/util/Range;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_1

    .line 104
    .line 105
    invoke-interface {p2}, Lg0/s0;->h()Landroid/util/Range;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    invoke-virtual {v0, v2}, Landroid/util/Range;->contains(Ljava/lang/Comparable;)Z

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    new-instance v0, Lg0/n0;

    .line 124
    .line 125
    invoke-direct {v0, p2}, Lg0/n0;-><init>(Lg0/s0;)V

    .line 126
    .line 127
    .line 128
    move-object p2, v0

    .line 129
    :cond_1
    :goto_0
    invoke-interface {p2}, Lg0/s0;->b()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    invoke-interface {p2}, Lg0/s0;->g()I

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-interface {p2}, Lg0/s0;->h()Landroid/util/Range;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-interface {p2}, Lg0/s0;->j()Landroid/util/Range;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-static {v5, v0, v3}, LZ/m0;->x0(IILandroid/util/Range;)I

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    invoke-static {v6, v0, v3}, LZ/m0;->y0(IILandroid/util/Range;)I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    invoke-static {v3, v2, v4}, LZ/m0;->x0(IILandroid/util/Range;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 170
    .line 171
    .line 172
    move-result v6

    .line 173
    invoke-static {v6, v2, v4}, LZ/m0;->y0(IILandroid/util/Range;)I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    new-instance v4, Ljava/util/HashSet;

    .line 178
    .line 179
    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v4, v5, v3, p1, p2}, LZ/m0;->r0(Ljava/util/Set;IILandroid/util/Size;Lg0/s0;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v4, v5, v2, p1, p2}, LZ/m0;->r0(Ljava/util/Set;IILandroid/util/Size;Lg0/s0;)V

    .line 186
    .line 187
    .line 188
    invoke-static {v4, v0, v3, p1, p2}, LZ/m0;->r0(Ljava/util/Set;IILandroid/util/Size;Lg0/s0;)V

    .line 189
    .line 190
    .line 191
    invoke-static {v4, v0, v2, p1, p2}, LZ/m0;->r0(Ljava/util/Set;IILandroid/util/Size;Lg0/s0;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 195
    .line 196
    .line 197
    move-result p2

    .line 198
    if-eqz p2, :cond_2

    .line 199
    .line 200
    const-string p1, "Can\'t find valid cropped size"

    .line 201
    .line 202
    invoke-static {v1, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    return-object p0

    .line 206
    :cond_2
    new-instance p2, Ljava/util/ArrayList;

    .line 207
    .line 208
    invoke-direct {p2, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 209
    .line 210
    .line 211
    new-instance v0, Ljava/lang/StringBuilder;

    .line 212
    .line 213
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    const-string v2, "candidatesList = "

    .line 217
    .line 218
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v0, LZ/l0;

    .line 232
    .line 233
    invoke-direct {v0, p0}, LZ/l0;-><init>(Landroid/graphics/Rect;)V

    .line 234
    .line 235
    .line 236
    invoke-static {p2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 237
    .line 238
    .line 239
    new-instance v0, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 242
    .line 243
    .line 244
    const-string v2, "sorted candidatesList = "

    .line 245
    .line 246
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 v0, 0x0

    .line 260
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    check-cast p2, Landroid/util/Size;

    .line 265
    .line 266
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    if-ne v2, v3, :cond_3

    .line 279
    .line 280
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-ne p2, v3, :cond_3

    .line 285
    .line 286
    const-string p1, "No need to adjust cropRect because crop size is valid."

    .line 287
    .line 288
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    return-object p0

    .line 292
    :cond_3
    rem-int/lit8 v3, v2, 0x2

    .line 293
    .line 294
    if-nez v3, :cond_4

    .line 295
    .line 296
    rem-int/lit8 v3, p2, 0x2

    .line 297
    .line 298
    if-nez v3, :cond_4

    .line 299
    .line 300
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-gt v2, v3, :cond_4

    .line 305
    .line 306
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-gt p2, v3, :cond_4

    .line 311
    .line 312
    const/4 v3, 0x1

    .line 313
    goto :goto_1

    .line 314
    :cond_4
    move v3, v0

    .line 315
    :goto_1
    invoke-static {v3}, LH0/g;->i(Z)V

    .line 316
    .line 317
    .line 318
    new-instance v3, Landroid/graphics/Rect;

    .line 319
    .line 320
    invoke-direct {v3, p0}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {p0}, Landroid/graphics/Rect;->width()I

    .line 324
    .line 325
    .line 326
    move-result v4

    .line 327
    if-eq v2, v4, :cond_5

    .line 328
    .line 329
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    div-int/lit8 v5, v2, 0x2

    .line 334
    .line 335
    sub-int/2addr v4, v5

    .line 336
    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    .line 337
    .line 338
    .line 339
    move-result v4

    .line 340
    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 341
    .line 342
    add-int/2addr v4, v2

    .line 343
    iput v4, v3, Landroid/graphics/Rect;->right:I

    .line 344
    .line 345
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-le v4, v5, :cond_5

    .line 350
    .line 351
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 352
    .line 353
    .line 354
    move-result v4

    .line 355
    iput v4, v3, Landroid/graphics/Rect;->right:I

    .line 356
    .line 357
    sub-int/2addr v4, v2

    .line 358
    iput v4, v3, Landroid/graphics/Rect;->left:I

    .line 359
    .line 360
    :cond_5
    invoke-virtual {p0}, Landroid/graphics/Rect;->height()I

    .line 361
    .line 362
    .line 363
    move-result v2

    .line 364
    if-eq p2, v2, :cond_6

    .line 365
    .line 366
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerY()I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    div-int/lit8 v4, p2, 0x2

    .line 371
    .line 372
    sub-int/2addr v2, v4

    .line 373
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    iput v0, v3, Landroid/graphics/Rect;->top:I

    .line 378
    .line 379
    add-int/2addr v0, p2

    .line 380
    iput v0, v3, Landroid/graphics/Rect;->bottom:I

    .line 381
    .line 382
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 383
    .line 384
    .line 385
    move-result v2

    .line 386
    if-le v0, v2, :cond_6

    .line 387
    .line 388
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 389
    .line 390
    .line 391
    move-result p1

    .line 392
    iput p1, v3, Landroid/graphics/Rect;->bottom:I

    .line 393
    .line 394
    sub-int/2addr p1, p2

    .line 395
    iput p1, v3, Landroid/graphics/Rect;->top:I

    .line 396
    .line 397
    :cond_6
    invoke-static {p0}, LH/z;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 398
    .line 399
    .line 400
    move-result-object p0

    .line 401
    invoke-static {v3}, LH/z;->n(Landroid/graphics/Rect;)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object p1

    .line 405
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    const-string p1, "Adjust cropRect from %s to %s"

    .line 410
    .line 411
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object p0

    .line 415
    invoke-static {v1, p0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 416
    .line 417
    .line 418
    return-object v3
.end method

.method private u0(Landroid/graphics/Rect;I)Landroid/graphics/Rect;
    .locals 1

    .line 1
    invoke-direct {p0}, LZ/m0;->d1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, LZ/m0;->t:LZ/d0;

    .line 8
    .line 9
    invoke-virtual {p1}, LZ/d0;->b()Ly/I0$h;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Ly/I0$h;

    .line 18
    .line 19
    invoke-virtual {p1}, Ly/I0$h;->a()Landroid/graphics/Rect;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-static {p1, p2}, LH/z;->f(Landroid/graphics/Rect;I)Landroid/util/Size;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {p1}, LH/z;->q(Landroid/util/Size;)Landroid/graphics/Rect;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_0
    return-object p1
.end method

.method private v0(Landroid/util/Size;Landroid/graphics/Rect;Landroid/graphics/Rect;)Landroid/util/Size;
    .locals 3

    .line 1
    invoke-direct {p0}, LZ/m0;->d1()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3, p2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p3}, Landroid/graphics/Rect;->height()I

    .line 14
    .line 15
    .line 16
    move-result p3

    .line 17
    int-to-float p3, p3

    .line 18
    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    int-to-float p2, p2

    .line 23
    div-float/2addr p3, p2

    .line 24
    new-instance p2, Landroid/util/Size;

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    int-to-float v0, v0

    .line 31
    mul-float/2addr v0, p3

    .line 32
    float-to-double v0, v0

    .line 33
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    double-to-int v0, v0

    .line 38
    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    int-to-float p1, p1

    .line 43
    mul-float/2addr p1, p3

    .line 44
    float-to-double v1, p1

    .line 45
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    double-to-int p1, v1

    .line 50
    invoke-direct {p2, v0, p1}, Landroid/util/Size;-><init>(II)V

    .line 51
    .line 52
    .line 53
    return-object p2

    .line 54
    :cond_0
    return-object p1
.end method

.method private static w0(ZIILandroid/util/Range;)I
    .locals 1

    .line 1
    rem-int v0, p1, p2

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    if-eqz p0, :cond_1

    .line 7
    .line 8
    sub-int/2addr p1, v0

    .line 9
    goto :goto_0

    .line 10
    :cond_1
    sub-int/2addr p2, v0

    .line 11
    add-int/2addr p1, p2

    .line 12
    :goto_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p3, p0}, Landroid/util/Range;->clamp(Ljava/lang/Comparable;)Ljava/lang/Comparable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    return p0
.end method

.method private static x0(IILandroid/util/Range;)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0, p1, p2}, LZ/m0;->w0(ZIILandroid/util/Range;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method

.method private static y0(IILandroid/util/Range;)I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0, p0, p1, p2}, LZ/m0;->w0(ZIILandroid/util/Range;)I

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    return p0
.end method


# virtual methods
.method public A(LF/L;)Ljava/util/Set;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, v0}, LZ/m0;->R0(Ly/q;I)LZ/e0;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-interface {p1}, LZ/e0;->b()Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public B()Ljava/util/Set;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public D(LF/j0;)LF/D1$b;
    .locals 0

    .line 1
    invoke-static {p1}, LZ/m0$d;->g(LF/j0;)LZ/m0$d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public L0()LZ/x0;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La0/a;

    .line 6
    .line 7
    invoke-virtual {v0}, La0/a;->g0()LZ/x0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method protected Q(LF/L;LF/D1$b;)LF/D1;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZ/m0;->k1(LF/L;LF/D1$b;)V

    .line 2
    .line 3
    .line 4
    invoke-interface {p2}, LF/D1$b;->c()LF/D1;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public R()V
    .locals 3

    .line 1
    invoke-super {p0}, Ly/J0;->R()V

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
    const-string v1, "VideoCapture#onStateAttached: cameraID = "

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ly/J0;->k()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "VideoCapture"

    .line 26
    .line 27
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget-object v0, p0, LZ/m0;->w:Ly/I0;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, LF/o1;

    .line 50
    .line 51
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-interface {v1}, LZ/x0;->e()LF/V0;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    sget-object v2, LZ/d0;->a:LZ/d0;

    .line 60
    .line 61
    invoke-static {v1, v2}, LZ/m0;->F0(LF/V0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    check-cast v1, LZ/d0;

    .line 66
    .line 67
    iput-object v1, p0, LZ/m0;->t:LZ/d0;

    .line 68
    .line 69
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, La0/a;

    .line 74
    .line 75
    invoke-direct {p0, v1, v0}, LZ/m0;->E0(La0/a;LF/o1;)LF/k1$b;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    iput-object v1, p0, LZ/m0;->u:LF/k1$b;

    .line 80
    .line 81
    iget-object v2, p0, LZ/m0;->t:LZ/d0;

    .line 82
    .line 83
    invoke-virtual {p0, v1, v2, v0}, LZ/m0;->z0(LF/k1$b;LZ/d0;LF/o1;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p0, LZ/m0;->u:LF/k1$b;

    .line 87
    .line 88
    invoke-virtual {v0}, LF/k1$b;->p()LF/k1;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-static {v0}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    invoke-virtual {p0, v0}, Ly/J0;->d0(Ljava/util/List;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Ly/J0;->J()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-interface {v0}, LZ/x0;->e()LF/V0;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v2, p0, LZ/m0;->F:LF/V0$a;

    .line 115
    .line 116
    invoke-interface {v0, v1, v2}, LF/V0;->c(Ljava/util/concurrent/Executor;LF/V0$a;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, LZ/m0;->C:LZ/m0$f;

    .line 120
    .line 121
    if-eqz v0, :cond_1

    .line 122
    .line 123
    invoke-virtual {v0}, LZ/m0$f;->b()V

    .line 124
    .line 125
    .line 126
    :cond_1
    new-instance v0, LZ/m0$f;

    .line 127
    .line 128
    invoke-virtual {p0}, Ly/J0;->j()LF/I;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-direct {v0, v1}, LZ/m0$f;-><init>(LF/I;)V

    .line 133
    .line 134
    .line 135
    iput-object v0, p0, LZ/m0;->C:LZ/m0$f;

    .line 136
    .line 137
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    invoke-interface {v0}, LZ/x0;->f()LF/V0;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    iget-object v2, p0, LZ/m0;->C:LZ/m0$f;

    .line 150
    .line 151
    invoke-interface {v0, v1, v2}, LF/V0;->c(Ljava/util/concurrent/Executor;LF/V0$a;)V

    .line 152
    .line 153
    .line 154
    sget-object v0, LZ/x0$a;->h:LZ/x0$a;

    .line 155
    .line 156
    invoke-virtual {p0, v0}, LZ/m0;->b1(LZ/x0$a;)V

    .line 157
    .line 158
    .line 159
    :cond_2
    :goto_0
    return-void
.end method

.method public S()V
    .locals 3

    .line 1
    const-string v0, "VideoCapture#onStateDetached"

    .line 2
    .line 3
    const-string v1, "VideoCapture"

    .line 4
    .line 5
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, LH/y;->d()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const-string v2, "VideoCapture can only be detached on the main thread."

    .line 13
    .line 14
    invoke-static {v0, v2}, LH0/g;->j(ZLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, LZ/m0;->C:LZ/m0$f;

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, LZ/x0;->f()LF/V0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, LZ/m0;->C:LZ/m0$f;

    .line 30
    .line 31
    invoke-interface {v0, v2}, LF/V0;->e(LF/V0$a;)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, LZ/m0;->C:LZ/m0$f;

    .line 35
    .line 36
    invoke-virtual {v0}, LZ/m0$f;->b()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    iput-object v0, p0, LZ/m0;->C:LZ/m0$f;

    .line 41
    .line 42
    :cond_0
    sget-object v0, LZ/x0$a;->i:LZ/x0$a;

    .line 43
    .line 44
    invoke-virtual {p0, v0}, LZ/m0;->b1(LZ/x0$a;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-interface {v0}, LZ/x0;->e()LF/V0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v2, p0, LZ/m0;->F:LF/V0$a;

    .line 56
    .line 57
    invoke-interface {v0, v2}, LF/V0;->e(LF/V0$a;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, LZ/m0;->v:Lm5/a;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    const/4 v2, 0x0

    .line 65
    invoke-interface {v0, v2}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    const-string v0, "VideoCapture is detached from the camera. Surface update cancelled."

    .line 72
    .line 73
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    invoke-direct {p0}, LZ/m0;->B0()V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method protected T(LF/j0;)LF/o1;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/m0;->u:LF/k1$b;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LF/k1$b;->g(LF/j0;)LF/k1$b;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ/m0;->u:LF/k1$b;

    .line 7
    .line 8
    invoke-virtual {v0}, LF/k1$b;->p()LF/k1;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {p0, v0}, Ly/J0;->d0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, LF/o1;->i()LF/o1$a;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0, p1}, LF/o1$a;->d(LF/j0;)LF/o1$a;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, LF/o1$a;->a()LF/o1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method T0(II)Z
    .locals 2

    .line 1
    sget-object v0, LZ/d0;->b:Ljava/util/Set;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    if-eq p1, p2, :cond_0

    .line 24
    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
.end method

.method protected U(LF/o1;LF/o1;)LF/o1;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "onSuggestedStreamSpecUpdated: primaryStreamSpec = "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string v1, ", secondaryStreamSpec "

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    const-string v0, "VideoCapture"

    .line 27
    .line 28
    invoke-static {v0, p2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    check-cast p2, La0/a;

    .line 36
    .line 37
    const/4 v1, 0x0

    .line 38
    invoke-interface {p2, v1}, LF/E0;->p(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-eqz p2, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, LF/o1;->f()Landroid/util/Size;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {p2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    new-instance v1, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "suggested resolution "

    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, LF/o1;->f()Landroid/util/Size;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string v2, " is not in custom ordered resolutions "

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-static {v0, p2}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    :cond_0
    return-object p1
.end method

.method V0()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ly/J0;->i()LF/M;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-direct {p0}, LZ/m0;->B0()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ly/J0;->l()LF/D1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, La0/a;

    .line 16
    .line 17
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-static {v1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, LF/o1;

    .line 26
    .line 27
    invoke-direct {p0, v0, v1}, LZ/m0;->E0(La0/a;LF/o1;)LF/k1$b;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, LZ/m0;->u:LF/k1$b;

    .line 32
    .line 33
    iget-object v1, p0, LZ/m0;->t:LZ/d0;

    .line 34
    .line 35
    invoke-virtual {p0}, Ly/J0;->g()LF/o1;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-virtual {p0, v0, v1, v2}, LZ/m0;->z0(LF/k1$b;LZ/d0;LF/o1;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, p0, LZ/m0;->u:LF/k1$b;

    .line 43
    .line 44
    invoke-virtual {v0}, LF/k1$b;->p()LF/k1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Ly/M;->a(Ljava/lang/Object;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {p0, v0}, Ly/J0;->d0(Ljava/util/List;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Ly/J0;->L()V

    .line 56
    .line 57
    .line 58
    return-void
.end method

.method public b0(Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ly/J0;->b0(Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, LZ/m0;->Z0()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method b1(LZ/x0$a;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/m0;->x:LZ/x0$a;

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    iput-object p1, p0, LZ/m0;->x:LZ/x0$a;

    .line 6
    .line 7
    invoke-virtual {p0}, LZ/m0;->L0()LZ/x0;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, p1}, LZ/x0;->g(LZ/x0$a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method j1(LZ/d0;LZ/d0;)Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LZ/m0;->B:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, LZ/d0;->b()Ly/I0$h;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, LZ/d0;->b()Ly/I0$h;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public m(ZLF/E1;)LF/D1;
    .locals 3

    .line 1
    sget-object v0, LZ/m0;->G:LZ/m0$e;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/m0$e;->a()La0/a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v1}, LF/D1;->G()LF/E1$b;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x1

    .line 12
    invoke-interface {p2, v1, v2}, LF/E1;->a(LF/E1$b;I)LF/j0;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, LZ/m0$e;->a()La0/a;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {p2, p1}, LF/j0;->W(LF/j0;LF/j0;)LF/j0;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :cond_0
    if-nez p2, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    return-object p1

    .line 30
    :cond_1
    invoke-virtual {p0, p2}, LZ/m0;->D(LF/j0;)LF/D1$b;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-interface {p1}, LF/D1$b;->c()LF/D1;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "VideoCapture:"

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ly/J0;->r()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method z0(LF/k1$b;LZ/d0;LF/o1;)V
    .locals 5

    .line 1
    invoke-virtual {p2}, LZ/d0;->a()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    const/4 v3, -0x1

    .line 8
    if-ne v0, v3, :cond_0

    .line 9
    .line 10
    move v0, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move v0, v1

    .line 13
    :goto_0
    invoke-virtual {p2}, LZ/d0;->c()LZ/d0$a;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    sget-object v4, LZ/d0$a;->g:LZ/d0$a;

    .line 18
    .line 19
    if-ne p2, v4, :cond_1

    .line 20
    .line 21
    move v1, v2

    .line 22
    :cond_1
    if-eqz v0, :cond_3

    .line 23
    .line 24
    if-nez v1, :cond_2

    .line 25
    .line 26
    goto :goto_1

    .line 27
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string p2, "Unexpected stream state, stream is error but active"

    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_3
    :goto_1
    invoke-virtual {p1}, LF/k1$b;->q()LF/k1$b;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, LF/o1;->b()Ly/H;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    if-nez v0, :cond_5

    .line 43
    .line 44
    iget-object p3, p0, LZ/m0;->r:LF/q0;

    .line 45
    .line 46
    if-eqz p3, :cond_5

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    const/4 v0, 0x0

    .line 51
    invoke-virtual {p1, p3, p2, v0, v3}, LF/k1$b;->n(LF/q0;Ly/H;Ljava/lang/String;I)LF/k1$b;

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_4
    invoke-virtual {p1, p3, p2}, LF/k1$b;->i(LF/q0;Ly/H;)LF/k1$b;

    .line 56
    .line 57
    .line 58
    :cond_5
    :goto_2
    invoke-direct {p0, p1, v1}, LZ/m0;->c1(LF/k1$b;Z)V

    .line 59
    .line 60
    .line 61
    return-void
.end method
