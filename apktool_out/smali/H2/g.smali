.class public final LH2/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH2/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH2/g$a;,
        LH2/g$b;
    }
.end annotation


# static fields
.field public static final n:LH2/g$b;


# instance fields
.field private final a:LV2/d;

.field private final b:LD2/c;

.field private final c:LG2/c;

.field private final d:LC2/d;

.field private final e:I

.field private final f:I

.field private final g:Ljava/util/concurrent/ConcurrentHashMap;

.field private volatile h:I

.field private volatile i:Z

.field private final j:LH2/h;

.field private k:I

.field private l:Ljava/util/Map;

.field private m:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH2/g$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH2/g$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH2/g;->n:LH2/g$b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LV2/d;LD2/c;LG2/c;LC2/d;I)V
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
    const-string v0, "fpsCompressor"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "animationInformation"

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
    iput-object p1, p0, LH2/g;->a:LV2/d;

    .line 25
    .line 26
    iput-object p2, p0, LH2/g;->b:LD2/c;

    .line 27
    .line 28
    iput-object p3, p0, LH2/g;->c:LG2/c;

    .line 29
    .line 30
    iput-object p4, p0, LH2/g;->d:LC2/d;

    .line 31
    .line 32
    iput p5, p0, LH2/g;->e:I

    .line 33
    .line 34
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {p0, p1}, LH2/g;->j(LC2/d;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    mul-int/2addr p1, p5

    .line 43
    div-int/lit16 p1, p1, 0x3e8

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    invoke-static {p1, p2}, LB7/d;->d(II)I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, LH2/g;->f:I

    .line 51
    .line 52
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 53
    .line 54
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    new-instance p2, LH2/h;

    .line 60
    .line 61
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 62
    .line 63
    .line 64
    move-result-object p3

    .line 65
    invoke-interface {p3}, LC2/d;->a()I

    .line 66
    .line 67
    .line 68
    move-result p3

    .line 69
    invoke-direct {p2, p3}, LH2/h;-><init>(I)V

    .line 70
    .line 71
    .line 72
    iput-object p2, p0, LH2/g;->j:LH2/h;

    .line 73
    .line 74
    const/4 p2, -0x1

    .line 75
    iput p2, p0, LH2/g;->k:I

    .line 76
    .line 77
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    iput-object p2, p0, LH2/g;->l:Ljava/util/Map;

    .line 82
    .line 83
    invoke-static {}, Lj7/T;->e()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    iput-object p2, p0, LH2/g;->m:Ljava/util/Set;

    .line 88
    .line 89
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 90
    .line 91
    .line 92
    move-result-object p2

    .line 93
    invoke-direct {p0, p2}, LH2/g;->j(LC2/d;)I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    invoke-virtual {p0, p2}, LH2/g;->c(I)V

    .line 98
    .line 99
    .line 100
    int-to-float p1, p1

    .line 101
    const/high16 p2, 0x3f000000    # 0.5f

    .line 102
    .line 103
    mul-float/2addr p1, p2

    .line 104
    float-to-int p1, p1

    .line 105
    iput p1, p0, LH2/g;->h:I

    .line 106
    .line 107
    return-void
.end method

.method public static synthetic d(LH2/g;II)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, LH2/g;->m(LH2/g;II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e(Lg2/a;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lg2/a;->W()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v0, Landroid/graphics/Canvas;

    .line 8
    .line 9
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, Landroid/graphics/Bitmap;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    sget-object v1, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private final f(IIII)Z
    .locals 10

    .line 1
    iget-object p4, p0, LH2/g;->j:LH2/h;

    .line 2
    .line 3
    iget v0, p0, LH2/g;->f:I

    .line 4
    .line 5
    invoke-virtual {p4, p1, v0}, LH2/h;->d(II)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {p4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Ljava/lang/Number;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    iget-object v2, p0, LH2/g;->m:Ljava/util/Set;

    .line 36
    .line 37
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-interface {p4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    invoke-static {p4}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance v0, Ljava/util/ArrayDeque;

    .line 56
    .line 57
    iget-object v1, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    const-string v2, "<get-keys>(...)"

    .line 64
    .line 65
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v1, p1}, Lj7/T;->i(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-direct {v0, v1}, Ljava/util/ArrayDeque;-><init>(Ljava/util/Collection;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    const/4 v3, 0x1

    .line 84
    const/4 v4, 0x0

    .line 85
    if-eqz v2, :cond_7

    .line 86
    .line 87
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    iget-object v5, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    .line 99
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    invoke-virtual {v5, v6}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-eqz v5, :cond_2

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_2
    iget v5, p0, LH2/g;->k:I

    .line 111
    .line 112
    const/4 v6, -0x1

    .line 113
    if-eq v5, v6, :cond_3

    .line 114
    .line 115
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    invoke-interface {p1, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_3

    .line 124
    .line 125
    return v4

    .line 126
    :cond_3
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->pollFirst()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    check-cast v5, Ljava/lang/Integer;

    .line 131
    .line 132
    if-eqz v5, :cond_4

    .line 133
    .line 134
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 135
    .line 136
    .line 137
    move-result v6

    .line 138
    :cond_4
    iget-object v5, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 139
    .line 140
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    invoke-virtual {v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v5

    .line 148
    check-cast v5, LH2/g$a;

    .line 149
    .line 150
    const/4 v7, 0x0

    .line 151
    if-eqz v5, :cond_5

    .line 152
    .line 153
    invoke-virtual {v5}, LH2/g$a;->a()Lg2/a;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    if-eqz v8, :cond_5

    .line 158
    .line 159
    invoke-virtual {v8}, Lg2/a;->m()Lg2/a;

    .line 160
    .line 161
    .line 162
    move-result-object v8

    .line 163
    goto :goto_2

    .line 164
    :cond_5
    move-object v8, v7

    .line 165
    :goto_2
    if-eqz v8, :cond_6

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    new-instance v5, LH2/g$a;

    .line 169
    .line 170
    iget-object v8, p0, LH2/g;->a:LV2/d;

    .line 171
    .line 172
    invoke-virtual {v8, p2, p3}, LV2/d;->a(II)Lg2/a;

    .line 173
    .line 174
    .line 175
    move-result-object v8

    .line 176
    const-string v9, "createBitmap(...)"

    .line 177
    .line 178
    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v5, v8}, LH2/g$a;-><init>(Lg2/a;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v5}, LH2/g$a;->a()Lg2/a;

    .line 185
    .line 186
    .line 187
    move-result-object v8

    .line 188
    invoke-virtual {v8}, Lg2/a;->k()Lg2/a;

    .line 189
    .line 190
    .line 191
    move-result-object v8

    .line 192
    :goto_3
    invoke-virtual {v5, v3}, LH2/g$a;->d(Z)V

    .line 193
    .line 194
    .line 195
    :try_start_0
    invoke-direct {p0, v8, v2, p2, p3}, LH2/g;->n(Lg2/a;III)V

    .line 196
    .line 197
    .line 198
    sget-object v3, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    .line 200
    invoke-static {v8, v7}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 201
    .line 202
    .line 203
    iget-object v3, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 204
    .line 205
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v3, v6}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v5, v4}, LH2/g$a;->d(Z)V

    .line 213
    .line 214
    .line 215
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    iget-object v3, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 220
    .line 221
    invoke-interface {v3, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :catchall_0
    move-exception p1

    .line 227
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 228
    :catchall_1
    move-exception p2

    .line 229
    invoke-static {v8, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw p2

    .line 233
    :cond_7
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 234
    .line 235
    .line 236
    move-result p1

    .line 237
    const/high16 p2, 0x3f000000    # 0.5f

    .line 238
    .line 239
    if-eqz p1, :cond_8

    .line 240
    .line 241
    iget p1, p0, LH2/g;->f:I

    .line 242
    .line 243
    int-to-float p1, p1

    .line 244
    mul-float/2addr p1, p2

    .line 245
    float-to-int p1, p1

    .line 246
    goto :goto_4

    .line 247
    :cond_8
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 248
    .line 249
    .line 250
    move-result p1

    .line 251
    int-to-float p3, p1

    .line 252
    mul-float/2addr p3, p2

    .line 253
    float-to-int p2, p3

    .line 254
    sub-int/2addr p1, v3

    .line 255
    invoke-static {p2, v4, p1}, LB7/d;->l(III)I

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object p1

    .line 263
    check-cast p1, Ljava/lang/Number;

    .line 264
    .line 265
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 266
    .line 267
    .line 268
    move-result p1

    .line 269
    :goto_4
    iput p1, p0, LH2/g;->h:I

    .line 270
    .line 271
    return v3
.end method

.method static synthetic g(LH2/g;IIIIILjava/lang/Object;)Z
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    const/4 p4, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LH2/g;->f(IIII)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private final h(I)LH2/a;
    .locals 5

    .line 1
    new-instance v0, LB7/c;

    .line 2
    .line 3
    iget-object v1, p0, LH2/g;->j:LH2/h;

    .line 4
    .line 5
    invoke-virtual {v1}, LH2/h;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, v2, v1}, LB7/c;-><init>(II)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Lj7/J;

    .line 26
    .line 27
    invoke-virtual {v1}, Lj7/J;->nextInt()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    iget-object v3, p0, LH2/g;->j:LH2/h;

    .line 32
    .line 33
    sub-int v1, p1, v1

    .line 34
    .line 35
    invoke-virtual {v3, v1}, LH2/h;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    iget-object v3, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-virtual {v3, v4}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, LH2/g$a;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    invoke-virtual {v3}, LH2/g$a;->b()Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-eqz v4, :cond_1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    move-object v3, v2

    .line 61
    :goto_0
    if-eqz v3, :cond_2

    .line 62
    .line 63
    new-instance v2, LH2/a;

    .line 64
    .line 65
    invoke-virtual {v3}, LH2/g$a;->a()Lg2/a;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-direct {v2, v1, v3}, LH2/a;-><init>(ILg2/a;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    if-eqz v2, :cond_0

    .line 73
    .line 74
    :cond_3
    return-object v2
.end method

.method private final i(I)LH2/l;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, LH2/g;->h(I)LH2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, LH2/a;->d()Lg2/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lg2/a;->k()Lg2/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "clone(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, LH2/a;->e()I

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    iput p1, p0, LH2/g;->k:I

    .line 25
    .line 26
    new-instance p1, LH2/l;

    .line 27
    .line 28
    sget-object v1, LH2/l$a;->h:LH2/l$a;

    .line 29
    .line 30
    invoke-direct {p1, v0, v1}, LH2/l;-><init>(Lg2/a;LH2/l$a;)V

    .line 31
    .line 32
    .line 33
    return-object p1

    .line 34
    :cond_0
    new-instance p1, LH2/l;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    sget-object v1, LH2/l$a;->i:LH2/l$a;

    .line 38
    .line 39
    invoke-direct {p1, v0, v1}, LH2/l;-><init>(Lg2/a;LH2/l$a;)V

    .line 40
    .line 41
    .line 42
    return-object p1
.end method

.method private final j(LC2/d;)I
    .locals 7

    .line 1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    .line 3
    const-wide/16 v1, 0x1

    .line 4
    .line 5
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    .line 6
    .line 7
    .line 8
    move-result-wide v3

    .line 9
    invoke-interface {p1}, LC2/d;->i()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-interface {p1}, LC2/d;->a()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    div-int/2addr v0, p1

    .line 18
    int-to-long v5, v0

    .line 19
    div-long/2addr v3, v5

    .line 20
    invoke-static {v3, v4, v1, v2}, LB7/d;->e(JJ)J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    long-to-int p1, v0

    .line 25
    return p1
.end method

.method private final l(II)V
    .locals 2

    .line 1
    iget-boolean v0, p0, LH2/g;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, LH2/g;->i:Z

    .line 8
    .line 9
    sget-object v0, LG2/b;->a:LG2/b;

    .line 10
    .line 11
    new-instance v1, LH2/f;

    .line 12
    .line 13
    invoke-direct {v1, p0, p1, p2}, LH2/f;-><init>(LH2/g;II)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, LG2/b;->b(Ljava/lang/Runnable;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static final m(LH2/g;II)V
    .locals 9

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :goto_0
    iget v0, p0, LH2/g;->k:I

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v0, v1}, LB7/d;->d(II)I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/16 v7, 0x8

    .line 14
    .line 15
    const/4 v8, 0x0

    .line 16
    const/4 v6, 0x0

    .line 17
    move-object v2, p0

    .line 18
    move v4, p1

    .line 19
    move v5, p2

    .line 20
    invoke-static/range {v2 .. v8}, LH2/g;->g(LH2/g;IIIIILjava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    iput-boolean v1, v2, LH2/g;->i:Z

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    move-object p0, v2

    .line 30
    move p1, v4

    .line 31
    move p2, v5

    .line 32
    goto :goto_0
.end method

.method private final n(Lg2/a;III)V
    .locals 4

    .line 1
    invoke-direct {p0, p2}, LH2/g;->h(I)LH2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    const-string p4, "get(...)"

    .line 6
    .line 7
    if-eqz p3, :cond_2

    .line 8
    .line 9
    invoke-virtual {p3}, LH2/a;->d()Lg2/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {v0}, Lg2/a;->m()Lg2/a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    :try_start_0
    invoke-virtual {p3}, LH2/a;->e()I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    const/4 v1, 0x0

    .line 26
    if-ge p3, p2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Lg2/a;->J()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2, p4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    check-cast v2, Landroid/graphics/Bitmap;

    .line 36
    .line 37
    invoke-direct {p0, p1, v2}, LH2/g;->o(Lg2/a;Landroid/graphics/Bitmap;)Lg2/a;

    .line 38
    .line 39
    .line 40
    new-instance v2, LB7/c;

    .line 41
    .line 42
    add-int/lit8 p3, p3, 0x1

    .line 43
    .line 44
    invoke-direct {v2, p3, p2}, LB7/c;-><init>(II)V

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_0

    .line 56
    .line 57
    move-object p3, p2

    .line 58
    check-cast p3, Lj7/J;

    .line 59
    .line 60
    invoke-virtual {p3}, Lj7/J;->nextInt()I

    .line 61
    .line 62
    .line 63
    move-result p3

    .line 64
    iget-object v2, p0, LH2/g;->b:LD2/c;

    .line 65
    .line 66
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    invoke-static {v3, p4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    check-cast v3, Landroid/graphics/Bitmap;

    .line 74
    .line 75
    invoke-interface {v2, p3, v3}, LD2/c;->a(ILandroid/graphics/Bitmap;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :catchall_0
    move-exception p1

    .line 80
    goto :goto_1

    .line 81
    :cond_0
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_1
    :try_start_1
    sget-object p3, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    .line 87
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    goto :goto_2

    .line 91
    :goto_1
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 92
    :catchall_1
    move-exception p2

    .line 93
    invoke-static {v0, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw p2

    .line 97
    :cond_2
    :goto_2
    invoke-direct {p0, p1}, LH2/g;->e(Lg2/a;)V

    .line 98
    .line 99
    .line 100
    new-instance p3, LB7/c;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {p3, v0, p2}, LB7/c;-><init>(II)V

    .line 104
    .line 105
    .line 106
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 111
    .line 112
    .line 113
    move-result p3

    .line 114
    if-eqz p3, :cond_3

    .line 115
    .line 116
    move-object p3, p2

    .line 117
    check-cast p3, Lj7/J;

    .line 118
    .line 119
    invoke-virtual {p3}, Lj7/J;->nextInt()I

    .line 120
    .line 121
    .line 122
    move-result p3

    .line 123
    iget-object v0, p0, LH2/g;->b:LD2/c;

    .line 124
    .line 125
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    invoke-static {v1, p4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v1, Landroid/graphics/Bitmap;

    .line 133
    .line 134
    invoke-interface {v0, p3, v1}, LD2/c;->a(ILandroid/graphics/Bitmap;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_3

    .line 138
    :cond_3
    return-void
.end method

.method private final o(Lg2/a;Landroid/graphics/Bitmap;)Lg2/a;
    .locals 3

    .line 1
    invoke-virtual {p1}, Lg2/a;->W()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance v0, Landroid/graphics/Canvas;

    .line 18
    .line 19
    invoke-virtual {p1}, Lg2/a;->J()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    check-cast v1, Landroid/graphics/Bitmap;

    .line 24
    .line 25
    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 26
    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    sget-object v2, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    .line 30
    .line 31
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    .line 32
    .line 33
    .line 34
    const/4 v1, 0x0

    .line 35
    const/4 v2, 0x0

    .line 36
    invoke-virtual {v0, p2, v2, v2, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    return-object p1
.end method


# virtual methods
.method public a(IILw7/a;)V
    .locals 1

    .line 1
    const-string v0, "onAnimationLoaded"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, LH2/g;->l(II)V

    .line 7
    .line 8
    .line 9
    invoke-interface {p3}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public b(III)LH2/l;
    .locals 4

    .line 1
    iget-object v0, p0, LH2/g;->l:Ljava/util/Map;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/Integer;

    .line 12
    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput p1, p0, LH2/g;->k:I

    .line 20
    .line 21
    iget-object v1, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, LH2/g$a;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0}, LH2/g$a;->b()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move-object v0, v1

    .line 40
    :goto_0
    if-eqz v0, :cond_2

    .line 41
    .line 42
    iget-object v1, p0, LH2/g;->j:LH2/h;

    .line 43
    .line 44
    iget v2, p0, LH2/g;->h:I

    .line 45
    .line 46
    iget v3, p0, LH2/g;->f:I

    .line 47
    .line 48
    invoke-virtual {v1, v2, p1, v3}, LH2/h;->c(III)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-eqz p1, :cond_1

    .line 53
    .line 54
    invoke-direct {p0, p2, p3}, LH2/g;->l(II)V

    .line 55
    .line 56
    .line 57
    :cond_1
    new-instance p1, LH2/l;

    .line 58
    .line 59
    invoke-virtual {v0}, LH2/g$a;->a()Lg2/a;

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-virtual {p2}, Lg2/a;->k()Lg2/a;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    sget-object p3, LH2/l$a;->g:LH2/l$a;

    .line 68
    .line 69
    invoke-direct {p1, p2, p3}, LH2/l;-><init>(Lg2/a;LH2/l$a;)V

    .line 70
    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_2
    invoke-direct {p0, p2, p3}, LH2/g;->l(II)V

    .line 74
    .line 75
    .line 76
    invoke-direct {p0, p1}, LH2/g;->i(I)LH2/l;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1

    .line 81
    :cond_3
    invoke-direct {p0, p1}, LH2/g;->i(I)LH2/l;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    return-object p1
.end method

.method public c(I)V
    .locals 4

    .line 1
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LC2/d;->i()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v1}, LC2/d;->b()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-static {v1, v2}, LB7/d;->d(II)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int/2addr v0, v1

    .line 23
    iget-object v1, p0, LH2/g;->c:LG2/c;

    .line 24
    .line 25
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-interface {v2}, LC2/d;->a()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    invoke-virtual {p0}, LH2/g;->k()LC2/d;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-direct {p0, v3}, LH2/g;->j(LC2/d;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-static {p1, v3}, LB7/d;->h(II)I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    invoke-virtual {v1, v0, v2, p1}, LG2/c;->a(III)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, LH2/g;->l:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-static {p1}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, LH2/g;->m:Ljava/util/Set;

    .line 60
    .line 61
    return-void
.end method

.method public clear()V
    .locals 2

    .line 1
    iget-object v0, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "<get-values>(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_0

    .line 21
    .line 22
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, LH2/g$a;

    .line 27
    .line 28
    invoke-virtual {v1}, LH2/g$a;->c()V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v0, p0, LH2/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 35
    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, LH2/g;->k:I

    .line 39
    .line 40
    return-void
.end method

.method public k()LC2/d;
    .locals 1

    .line 1
    iget-object v0, p0, LH2/g;->d:LC2/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public onStop()V
    .locals 0

    .line 1
    invoke-static {p0}, LH2/j$a;->a(LH2/j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
