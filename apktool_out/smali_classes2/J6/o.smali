.class public final LJ6/o;
.super LJ6/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/o$a;,
        LJ6/o$b;
    }
.end annotation


# static fields
.field public static final Y:LJ6/o$a;


# instance fields
.field private O:J

.field private final P:F

.field private Q:F

.field private R:I

.field private S:F

.field private T:F

.field private U:J

.field private V:J

.field private W:Landroid/os/Handler;

.field private X:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ6/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ6/o$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ6/o;->Y:LJ6/o$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LJ6/d;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v0, 0x1f4

    .line 10
    .line 11
    iput-wide v0, p0, LJ6/o;->O:J

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 26
    .line 27
    const/high16 v1, 0x41200000    # 10.0f

    .line 28
    .line 29
    mul-float/2addr p1, v1

    .line 30
    iput p1, p0, LJ6/o;->P:F

    .line 31
    .line 32
    iput p1, p0, LJ6/o;->Q:F

    .line 33
    .line 34
    iput v0, p0, LJ6/o;->R:I

    .line 35
    .line 36
    return-void
.end method

.method public static synthetic U0(LJ6/o;)V
    .locals 0

    .line 1
    invoke-static {p0}, LJ6/o;->Z0(LJ6/o;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic V0(LJ6/o;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/o;->Q:F

    .line 2
    .line 3
    return-void
.end method

.method private final W0(Landroid/view/MotionEvent;Z)Lkotlin/Pair;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_2

    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 5
    .line 6
    .line 7
    move-result p2

    .line 8
    invoke-static {v0, p2}, LB7/d;->p(II)LB7/c;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    const/16 v2, 0xa

    .line 15
    .line 16
    invoke-static {p2, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    move-object v3, p2

    .line 34
    check-cast v3, Lj7/J;

    .line 35
    .line 36
    invoke-virtual {v3}, Lj7/J;->nextInt()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    invoke-static {v1}, Lj7/q;->W(Ljava/lang/Iterable;)D

    .line 53
    .line 54
    .line 55
    move-result-wide v3

    .line 56
    double-to-float p2, v3

    .line 57
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    invoke-static {v0, v1}, LB7/d;->p(II)LB7/c;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_1

    .line 83
    .line 84
    move-object v2, v0

    .line 85
    check-cast v2, Lj7/J;

    .line 86
    .line 87
    invoke-virtual {v2}, Lj7/J;->nextInt()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_1
    invoke-static {v1}, Lj7/q;->W(Ljava/lang/Iterable;)D

    .line 104
    .line 105
    .line 106
    move-result-wide v0

    .line 107
    double-to-float p1, v0

    .line 108
    new-instance v0, Lkotlin/Pair;

    .line 109
    .line 110
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v0, p2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    return-object v0

    .line 122
    :cond_2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    const/4 v1, 0x0

    .line 127
    move v2, v1

    .line 128
    :goto_2
    if-ge v0, p2, :cond_4

    .line 129
    .line 130
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-ne v0, v3, :cond_3

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    add-float/2addr v1, v3

    .line 142
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 143
    .line 144
    .line 145
    move-result v3

    .line 146
    add-float/2addr v2, v3

    .line 147
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    add-int/lit8 p2, p2, -0x1

    .line 155
    .line 156
    int-to-float p2, p2

    .line 157
    div-float/2addr v1, p2

    .line 158
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 159
    .line 160
    .line 161
    move-result p1

    .line 162
    add-int/lit8 p1, p1, -0x1

    .line 163
    .line 164
    int-to-float p1, p1

    .line 165
    div-float/2addr v2, p1

    .line 166
    new-instance p1, Lkotlin/Pair;

    .line 167
    .line 168
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-direct {p1, p2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-object p1
.end method

.method static synthetic X0(LJ6/o;Landroid/view/MotionEvent;ZILjava/lang/Object;)Lkotlin/Pair;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2}, LJ6/o;->W0(Landroid/view/MotionEvent;Z)Lkotlin/Pair;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final Z0(LJ6/o;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final Y0()I
    .locals 4

    .line 1
    iget-wide v0, p0, LJ6/o;->V:J

    .line 2
    .line 3
    iget-wide v2, p0, LJ6/o;->U:J

    .line 4
    .line 5
    sub-long/2addr v0, v2

    .line 6
    long-to-int v0, v0

    .line 7
    return v0
.end method

.method public final a1(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/o;->O:J

    .line 2
    .line 3
    return-void
.end method

.method protected l0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 9

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "sourceEvent"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, LJ6/d;->J0(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-nez p1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_1

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/4 v0, 0x1

    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x0

    .line 26
    const/4 v3, 0x0

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 30
    .line 31
    .line 32
    move-result-wide v4

    .line 33
    iput-wide v4, p0, LJ6/o;->V:J

    .line 34
    .line 35
    iput-wide v4, p0, LJ6/o;->U:J

    .line 36
    .line 37
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 38
    .line 39
    .line 40
    invoke-static {p0, p2, v3, v1, v2}, LJ6/o;->X0(LJ6/o;Landroid/view/MotionEvent;ZILjava/lang/Object;)Lkotlin/Pair;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    check-cast v4, Ljava/lang/Number;

    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    check-cast p1, Ljava/lang/Number;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    iput v4, p0, LJ6/o;->S:F

    .line 65
    .line 66
    iput p1, p0, LJ6/o;->T:F

    .line 67
    .line 68
    iget p1, p0, LJ6/o;->X:I

    .line 69
    .line 70
    add-int/2addr p1, v0

    .line 71
    iput p1, p0, LJ6/o;->X:I

    .line 72
    .line 73
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 v4, 0x5

    .line 78
    if-ne p1, v4, :cond_2

    .line 79
    .line 80
    iget p1, p0, LJ6/o;->X:I

    .line 81
    .line 82
    add-int/2addr p1, v0

    .line 83
    iput p1, p0, LJ6/o;->X:I

    .line 84
    .line 85
    invoke-static {p0, p2, v3, v1, v2}, LJ6/o;->X0(LJ6/o;Landroid/view/MotionEvent;ZILjava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, Ljava/lang/Number;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    iput v5, p0, LJ6/o;->S:F

    .line 110
    .line 111
    iput p1, p0, LJ6/o;->T:F

    .line 112
    .line 113
    iget p1, p0, LJ6/o;->X:I

    .line 114
    .line 115
    iget v5, p0, LJ6/o;->R:I

    .line 116
    .line 117
    if-le p1, v5, :cond_2

    .line 118
    .line 119
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 120
    .line 121
    .line 122
    iput v3, p0, LJ6/o;->X:I

    .line 123
    .line 124
    :cond_2
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-ne p1, v1, :cond_5

    .line 129
    .line 130
    iget p1, p0, LJ6/o;->X:I

    .line 131
    .line 132
    iget v5, p0, LJ6/o;->R:I

    .line 133
    .line 134
    if-ne p1, v5, :cond_5

    .line 135
    .line 136
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 137
    .line 138
    .line 139
    move-result p1

    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-ne p1, v4, :cond_5

    .line 147
    .line 148
    :cond_3
    new-instance p1, Landroid/os/Handler;

    .line 149
    .line 150
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-direct {p1, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, LJ6/o;->W:Landroid/os/Handler;

    .line 158
    .line 159
    iget-wide v4, p0, LJ6/o;->O:J

    .line 160
    .line 161
    const-wide/16 v6, 0x0

    .line 162
    .line 163
    cmp-long v8, v4, v6

    .line 164
    .line 165
    if-lez v8, :cond_4

    .line 166
    .line 167
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    new-instance v4, LJ6/n;

    .line 171
    .line 172
    invoke-direct {v4, p0}, LJ6/n;-><init>(LJ6/o;)V

    .line 173
    .line 174
    .line 175
    iget-wide v5, p0, LJ6/o;->O:J

    .line 176
    .line 177
    invoke-virtual {p1, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 178
    .line 179
    .line 180
    goto :goto_0

    .line 181
    :cond_4
    cmp-long p1, v4, v6

    .line 182
    .line 183
    if-nez p1, :cond_5

    .line 184
    .line 185
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 186
    .line 187
    .line 188
    :cond_5
    :goto_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    const/4 v4, 0x4

    .line 193
    if-eq p1, v0, :cond_b

    .line 194
    .line 195
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    const/16 v5, 0xc

    .line 200
    .line 201
    if-ne p1, v5, :cond_6

    .line 202
    .line 203
    goto :goto_2

    .line 204
    :cond_6
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    const/4 v5, 0x6

    .line 209
    if-ne p1, v5, :cond_8

    .line 210
    .line 211
    iget p1, p0, LJ6/o;->X:I

    .line 212
    .line 213
    add-int/lit8 p1, p1, -0x1

    .line 214
    .line 215
    iput p1, p0, LJ6/o;->X:I

    .line 216
    .line 217
    iget v1, p0, LJ6/o;->R:I

    .line 218
    .line 219
    if-ge p1, v1, :cond_7

    .line 220
    .line 221
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 222
    .line 223
    .line 224
    move-result p1

    .line 225
    if-eq p1, v4, :cond_7

    .line 226
    .line 227
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 228
    .line 229
    .line 230
    iput v3, p0, LJ6/o;->X:I

    .line 231
    .line 232
    return-void

    .line 233
    :cond_7
    invoke-direct {p0, p2, v0}, LJ6/o;->W0(Landroid/view/MotionEvent;Z)Lkotlin/Pair;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    check-cast p2, Ljava/lang/Number;

    .line 242
    .line 243
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 244
    .line 245
    .line 246
    move-result p2

    .line 247
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    iput p2, p0, LJ6/o;->S:F

    .line 258
    .line 259
    iput p1, p0, LJ6/o;->T:F

    .line 260
    .line 261
    return-void

    .line 262
    :cond_8
    invoke-static {p0, p2, v3, v1, v2}, LJ6/o;->X0(LJ6/o;Landroid/view/MotionEvent;ZILjava/lang/Object;)Lkotlin/Pair;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p1}, Lkotlin/Pair;->a()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object p2

    .line 270
    check-cast p2, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 273
    .line 274
    .line 275
    move-result p2

    .line 276
    invoke-virtual {p1}, Lkotlin/Pair;->b()Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    check-cast p1, Ljava/lang/Number;

    .line 281
    .line 282
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    iget v0, p0, LJ6/o;->S:F

    .line 287
    .line 288
    sub-float/2addr p2, v0

    .line 289
    iget v0, p0, LJ6/o;->T:F

    .line 290
    .line 291
    sub-float/2addr p1, v0

    .line 292
    mul-float/2addr p2, p2

    .line 293
    mul-float/2addr p1, p1

    .line 294
    add-float/2addr p2, p1

    .line 295
    iget p1, p0, LJ6/o;->Q:F

    .line 296
    .line 297
    mul-float/2addr p1, p1

    .line 298
    cmpl-float p1, p2, p1

    .line 299
    .line 300
    if-lez p1, :cond_a

    .line 301
    .line 302
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 303
    .line 304
    .line 305
    move-result p1

    .line 306
    if-ne p1, v4, :cond_9

    .line 307
    .line 308
    invoke-virtual {p0}, LJ6/d;->q()V

    .line 309
    .line 310
    .line 311
    return-void

    .line 312
    :cond_9
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 313
    .line 314
    .line 315
    :cond_a
    :goto_1
    return-void

    .line 316
    :cond_b
    :goto_2
    iget p1, p0, LJ6/o;->X:I

    .line 317
    .line 318
    add-int/lit8 p1, p1, -0x1

    .line 319
    .line 320
    iput p1, p0, LJ6/o;->X:I

    .line 321
    .line 322
    iget-object p1, p0, LJ6/o;->W:Landroid/os/Handler;

    .line 323
    .line 324
    if-eqz p1, :cond_c

    .line 325
    .line 326
    invoke-virtual {p1, v2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    iput-object v2, p0, LJ6/o;->W:Landroid/os/Handler;

    .line 330
    .line 331
    :cond_c
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 332
    .line 333
    .line 334
    move-result p1

    .line 335
    if-ne p1, v4, :cond_d

    .line 336
    .line 337
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 338
    .line 339
    .line 340
    return-void

    .line 341
    :cond_d
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 342
    .line 343
    .line 344
    return-void
.end method

.method protected o0()V
    .locals 1

    .line 1
    invoke-super {p0}, LJ6/d;->o0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, LJ6/o;->X:I

    .line 6
    .line 7
    return-void
.end method

.method protected p0(II)V
    .locals 0

    .line 1
    iget-object p1, p0, LJ6/o;->W:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, LJ6/o;->W:Landroid/os/Handler;

    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public s0()V
    .locals 2

    .line 1
    invoke-super {p0}, LJ6/d;->s0()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x1f4

    .line 5
    .line 6
    iput-wide v0, p0, LJ6/o;->O:J

    .line 7
    .line 8
    iget v0, p0, LJ6/o;->P:F

    .line 9
    .line 10
    iput v0, p0, LJ6/o;->Q:F

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public v(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    iput-wide v0, p0, LJ6/o;->V:J

    .line 11
    .line 12
    invoke-super {p0, p1}, LJ6/d;->v(Landroid/view/MotionEvent;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public w(II)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iput-wide v0, p0, LJ6/o;->V:J

    .line 6
    .line 7
    invoke-super {p0, p1, p2}, LJ6/d;->w(II)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
