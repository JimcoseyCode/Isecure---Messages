.class public final LJ6/B;
.super LJ6/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/B$a;,
        LJ6/B$b;
    }
.end annotation


# static fields
.field public static final f0:LJ6/B$a;


# instance fields
.field private O:F

.field private P:F

.field private Q:F

.field private R:J

.field private S:J

.field private T:I

.field private U:I

.field private V:I

.field private W:F

.field private X:F

.field private Y:F

.field private Z:F

.field private a0:F

.field private b0:F

.field private c0:Landroid/os/Handler;

.field private d0:I

.field private final e0:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ6/B$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ6/B$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ6/B;->f0:LJ6/B$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, LJ6/d;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LJ6/B;->O:F

    .line 6
    .line 7
    iput v0, p0, LJ6/B;->P:F

    .line 8
    .line 9
    iput v0, p0, LJ6/B;->Q:F

    .line 10
    .line 11
    const-wide/16 v0, 0x1f4

    .line 12
    .line 13
    iput-wide v0, p0, LJ6/B;->R:J

    .line 14
    .line 15
    const-wide/16 v0, 0xc8

    .line 16
    .line 17
    iput-wide v0, p0, LJ6/B;->S:J

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput v0, p0, LJ6/B;->T:I

    .line 21
    .line 22
    iput v0, p0, LJ6/B;->U:I

    .line 23
    .line 24
    iput v0, p0, LJ6/B;->V:I

    .line 25
    .line 26
    new-instance v1, LJ6/A;

    .line 27
    .line 28
    invoke-direct {v1, p0}, LJ6/A;-><init>(LJ6/B;)V

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, LJ6/B;->e0:Ljava/lang/Runnable;

    .line 32
    .line 33
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public static synthetic U0(LJ6/B;)V
    .locals 0

    .line 1
    invoke-static {p0}, LJ6/B;->d1(LJ6/B;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic V0(LJ6/B;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/B;->S:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic W0(LJ6/B;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/B;->O:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic X0(LJ6/B;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/B;->P:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Y0(LJ6/B;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/B;->Q:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Z0(LJ6/B;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/B;->R:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic a1(LJ6/B;I)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/B;->U:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b1(LJ6/B;I)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/B;->T:I

    .line 2
    .line 3
    return-void
.end method

.method private final c1()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget v0, p0, LJ6/B;->d0:I

    .line 25
    .line 26
    add-int/lit8 v0, v0, 0x1

    .line 27
    .line 28
    iput v0, p0, LJ6/B;->d0:I

    .line 29
    .line 30
    iget v1, p0, LJ6/B;->T:I

    .line 31
    .line 32
    if-ne v0, v1, :cond_1

    .line 33
    .line 34
    iget v0, p0, LJ6/B;->V:I

    .line 35
    .line 36
    iget v1, p0, LJ6/B;->U:I

    .line 37
    .line 38
    if-lt v0, v1, :cond_1

    .line 39
    .line 40
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, LJ6/B;->e0:Ljava/lang/Runnable;

    .line 50
    .line 51
    iget-wide v2, p0, LJ6/B;->S:J

    .line 52
    .line 53
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method private static final d1(LJ6/B;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e1()Z
    .locals 6

    .line 1
    iget v0, p0, LJ6/B;->a0:F

    .line 2
    .line 3
    iget v1, p0, LJ6/B;->W:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, LJ6/B;->Y:F

    .line 7
    .line 8
    add-float/2addr v0, v1

    .line 9
    iget v1, p0, LJ6/B;->O:F

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    cmpg-float v1, v1, v2

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v4, p0, LJ6/B;->O:F

    .line 23
    .line 24
    cmpl-float v1, v1, v4

    .line 25
    .line 26
    if-lez v1, :cond_1

    .line 27
    .line 28
    return v3

    .line 29
    :cond_1
    :goto_0
    iget v1, p0, LJ6/B;->b0:F

    .line 30
    .line 31
    iget v4, p0, LJ6/B;->X:F

    .line 32
    .line 33
    sub-float/2addr v1, v4

    .line 34
    iget v4, p0, LJ6/B;->Z:F

    .line 35
    .line 36
    add-float/2addr v1, v4

    .line 37
    iget v4, p0, LJ6/B;->P:F

    .line 38
    .line 39
    cmpg-float v4, v4, v2

    .line 40
    .line 41
    if-nez v4, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    iget v5, p0, LJ6/B;->P:F

    .line 49
    .line 50
    cmpl-float v4, v4, v5

    .line 51
    .line 52
    if-lez v4, :cond_3

    .line 53
    .line 54
    return v3

    .line 55
    :cond_3
    :goto_1
    mul-float/2addr v1, v1

    .line 56
    mul-float/2addr v0, v0

    .line 57
    add-float/2addr v1, v0

    .line 58
    iget v0, p0, LJ6/B;->Q:F

    .line 59
    .line 60
    cmpg-float v2, v0, v2

    .line 61
    .line 62
    if-nez v2, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    mul-float/2addr v0, v0

    .line 66
    cmpl-float v0, v1, v0

    .line 67
    .line 68
    if-lez v0, :cond_5

    .line 69
    .line 70
    return v3

    .line 71
    :cond_5
    :goto_2
    const/4 v0, 0x0

    .line 72
    return v0
.end method

.method private final f1()V
    .locals 4

    .line 1
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Handler;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x0

    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LJ6/B;->e0:Ljava/lang/Runnable;

    .line 30
    .line 31
    iget-wide v2, p0, LJ6/B;->R:J

    .line 32
    .line 33
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method protected j0()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method public l(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, LJ6/d;->l(Z)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method protected l0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 5

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
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    iput v2, p0, LJ6/B;->Y:F

    .line 32
    .line 33
    iput v2, p0, LJ6/B;->Z:F

    .line 34
    .line 35
    sget-object v2, LJ6/k;->a:LJ6/k;

    .line 36
    .line 37
    invoke-virtual {v2, p2, v1}, LJ6/k;->b(Landroid/view/MotionEvent;Z)F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iput v3, p0, LJ6/B;->W:F

    .line 42
    .line 43
    invoke-virtual {v2, p2, v1}, LJ6/k;->c(Landroid/view/MotionEvent;Z)F

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    iput v2, p0, LJ6/B;->X:F

    .line 48
    .line 49
    :cond_1
    const/4 v2, 0x5

    .line 50
    if-eq v0, v2, :cond_2

    .line 51
    .line 52
    const/4 v2, 0x6

    .line 53
    if-eq v0, v2, :cond_2

    .line 54
    .line 55
    sget-object v2, LJ6/k;->a:LJ6/k;

    .line 56
    .line 57
    invoke-virtual {v2, p2, v1}, LJ6/k;->b(Landroid/view/MotionEvent;Z)F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    iput v3, p0, LJ6/B;->a0:F

    .line 62
    .line 63
    invoke-virtual {v2, p2, v1}, LJ6/k;->c(Landroid/view/MotionEvent;Z)F

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    iput v2, p0, LJ6/B;->b0:F

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    iget v2, p0, LJ6/B;->Y:F

    .line 71
    .line 72
    iget v3, p0, LJ6/B;->a0:F

    .line 73
    .line 74
    iget v4, p0, LJ6/B;->W:F

    .line 75
    .line 76
    sub-float/2addr v3, v4

    .line 77
    add-float/2addr v2, v3

    .line 78
    iput v2, p0, LJ6/B;->Y:F

    .line 79
    .line 80
    iget v2, p0, LJ6/B;->Z:F

    .line 81
    .line 82
    iget v3, p0, LJ6/B;->b0:F

    .line 83
    .line 84
    iget v4, p0, LJ6/B;->X:F

    .line 85
    .line 86
    sub-float/2addr v3, v4

    .line 87
    add-float/2addr v2, v3

    .line 88
    iput v2, p0, LJ6/B;->Z:F

    .line 89
    .line 90
    sget-object v2, LJ6/k;->a:LJ6/k;

    .line 91
    .line 92
    invoke-virtual {v2, p2, v1}, LJ6/k;->b(Landroid/view/MotionEvent;Z)F

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    iput v3, p0, LJ6/B;->a0:F

    .line 97
    .line 98
    invoke-virtual {v2, p2, v1}, LJ6/k;->c(Landroid/view/MotionEvent;Z)F

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    iput v2, p0, LJ6/B;->b0:F

    .line 103
    .line 104
    iget v3, p0, LJ6/B;->a0:F

    .line 105
    .line 106
    iput v3, p0, LJ6/B;->W:F

    .line 107
    .line 108
    iput v2, p0, LJ6/B;->X:F

    .line 109
    .line 110
    :goto_0
    iget v2, p0, LJ6/B;->V:I

    .line 111
    .line 112
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-ge v2, v3, :cond_3

    .line 117
    .line 118
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    iput p2, p0, LJ6/B;->V:I

    .line 123
    .line 124
    :cond_3
    invoke-direct {p0}, LJ6/B;->e1()Z

    .line 125
    .line 126
    .line 127
    move-result p2

    .line 128
    if-eqz p2, :cond_4

    .line 129
    .line 130
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 131
    .line 132
    .line 133
    return-void

    .line 134
    :cond_4
    const/16 p2, 0xb

    .line 135
    .line 136
    if-nez p1, :cond_6

    .line 137
    .line 138
    if-eqz v0, :cond_5

    .line 139
    .line 140
    if-eq v0, p2, :cond_5

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_5
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 144
    .line 145
    .line 146
    :goto_1
    invoke-direct {p0}, LJ6/B;->f1()V

    .line 147
    .line 148
    .line 149
    return-void

    .line 150
    :cond_6
    const/4 v2, 0x2

    .line 151
    if-ne p1, v2, :cond_9

    .line 152
    .line 153
    if-eqz v0, :cond_8

    .line 154
    .line 155
    if-eq v0, v1, :cond_7

    .line 156
    .line 157
    if-eq v0, p2, :cond_8

    .line 158
    .line 159
    const/16 p1, 0xc

    .line 160
    .line 161
    if-eq v0, p1, :cond_7

    .line 162
    .line 163
    goto :goto_2

    .line 164
    :cond_7
    invoke-direct {p0}, LJ6/B;->c1()V

    .line 165
    .line 166
    .line 167
    return-void

    .line 168
    :cond_8
    invoke-direct {p0}, LJ6/B;->f1()V

    .line 169
    .line 170
    .line 171
    :cond_9
    :goto_2
    return-void
.end method

.method protected o0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LJ6/B;->d0:I

    .line 3
    .line 4
    iput v0, p0, LJ6/B;->V:I

    .line 5
    .line 6
    iget-object v0, p0, LJ6/B;->c0:Landroid/os/Handler;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
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
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LJ6/B;->O:F

    .line 6
    .line 7
    iput v0, p0, LJ6/B;->P:F

    .line 8
    .line 9
    iput v0, p0, LJ6/B;->Q:F

    .line 10
    .line 11
    const-wide/16 v0, 0x1f4

    .line 12
    .line 13
    iput-wide v0, p0, LJ6/B;->R:J

    .line 14
    .line 15
    const-wide/16 v0, 0xc8

    .line 16
    .line 17
    iput-wide v0, p0, LJ6/B;->S:J

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    iput v0, p0, LJ6/B;->T:I

    .line 21
    .line 22
    iput v0, p0, LJ6/B;->U:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
