.class public final LJ6/t;
.super LJ6/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/t$a;,
        LJ6/t$b;
    }
.end annotation


# static fields
.field public static final r0:LJ6/t$a;


# instance fields
.field private O:F

.field private P:F

.field private final Q:F

.field private R:F

.field private S:F

.field private T:F

.field private U:F

.field private V:F

.field private W:F

.field private X:F

.field private Y:F

.field private Z:F

.field private a0:F

.field private b0:F

.field private c0:F

.field private d0:I

.field private e0:I

.field private f0:F

.field private g0:F

.field private h0:F

.field private i0:F

.field private j0:F

.field private k0:F

.field private l0:Landroid/view/VelocityTracker;

.field private m0:Z

.field private n0:J

.field private final o0:Ljava/lang/Runnable;

.field private p0:Landroid/os/Handler;

.field private q0:LJ6/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ6/t$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ6/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ6/t;->r0:LJ6/t$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 14

    .line 1
    invoke-direct {p0}, LJ6/d;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput v0, p0, LJ6/t;->R:F

    .line 6
    .line 7
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 8
    .line 9
    .line 10
    iput v1, p0, LJ6/t;->S:F

    .line 11
    .line 12
    iput v0, p0, LJ6/t;->T:F

    .line 13
    .line 14
    iput v0, p0, LJ6/t;->U:F

    .line 15
    .line 16
    iput v1, p0, LJ6/t;->V:F

    .line 17
    .line 18
    iput v1, p0, LJ6/t;->W:F

    .line 19
    .line 20
    iput v0, p0, LJ6/t;->X:F

    .line 21
    .line 22
    iput v0, p0, LJ6/t;->Y:F

    .line 23
    .line 24
    iput v1, p0, LJ6/t;->Z:F

    .line 25
    .line 26
    iput v1, p0, LJ6/t;->a0:F

    .line 27
    .line 28
    iput v1, p0, LJ6/t;->b0:F

    .line 29
    .line 30
    iput v1, p0, LJ6/t;->c0:F

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    iput v0, p0, LJ6/t;->d0:I

    .line 34
    .line 35
    const/16 v0, 0xa

    .line 36
    .line 37
    iput v0, p0, LJ6/t;->e0:I

    .line 38
    .line 39
    new-instance v0, LJ6/s;

    .line 40
    .line 41
    invoke-direct {v0, p0}, LJ6/s;-><init>(LJ6/t;)V

    .line 42
    .line 43
    .line 44
    iput-object v0, p0, LJ6/t;->o0:Ljava/lang/Runnable;

    .line 45
    .line 46
    new-instance v1, LJ6/z;

    .line 47
    .line 48
    const/16 v12, 0x1f

    .line 49
    .line 50
    const/4 v13, 0x0

    .line 51
    const-wide/16 v2, 0x0

    .line 52
    .line 53
    const-wide/16 v4, 0x0

    .line 54
    .line 55
    const-wide/16 v6, 0x0

    .line 56
    .line 57
    const-wide/16 v8, 0x0

    .line 58
    .line 59
    const-wide/16 v10, 0x0

    .line 60
    .line 61
    invoke-direct/range {v1 .. v13}, LJ6/z;-><init>(DDDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 62
    .line 63
    .line 64
    iput-object v1, p0, LJ6/t;->q0:LJ6/z;

    .line 65
    .line 66
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-virtual {p1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    int-to-float p1, p1

    .line 78
    iput p1, p0, LJ6/t;->Q:F

    .line 79
    .line 80
    iput p1, p0, LJ6/t;->R:F

    .line 81
    .line 82
    return-void
.end method

.method public static synthetic U0(LJ6/t;)V
    .locals 0

    .line 1
    invoke-static {p0}, LJ6/t;->l1(LJ6/t;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic V0(LJ6/t;J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LJ6/t;->n0:J

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic W0(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->T:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic X0(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->S:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Y0(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->X:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic Z0(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->W:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic a1(LJ6/t;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ6/t;->m0:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic b1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->V:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic c1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->U:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic d1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->Z:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic e1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->Y:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic f1(LJ6/t;I)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->e0:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic g1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->R:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic h1(LJ6/t;I)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->d0:I

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic i1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->c0:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic j1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->a0:F

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic k1(LJ6/t;F)V
    .locals 0

    .line 1
    iput p1, p0, LJ6/t;->b0:F

    .line 2
    .line 3
    return-void
.end method

.method private static final l1(LJ6/t;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final r1()Z
    .locals 7

    .line 1
    iget v0, p0, LJ6/t;->j0:F

    .line 2
    .line 3
    iget v1, p0, LJ6/t;->f0:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, LJ6/t;->h0:F

    .line 7
    .line 8
    add-float/2addr v0, v1

    .line 9
    iget v1, p0, LJ6/t;->S:F

    .line 10
    .line 11
    const v2, 0x7f7fffff    # Float.MAX_VALUE

    .line 12
    .line 13
    .line 14
    cmpg-float v3, v1, v2

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    cmpg-float v1, v0, v1

    .line 21
    .line 22
    if-gez v1, :cond_1

    .line 23
    .line 24
    return v4

    .line 25
    :cond_1
    :goto_0
    iget v1, p0, LJ6/t;->T:F

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    cmpg-float v5, v1, v3

    .line 29
    .line 30
    if-nez v5, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    cmpl-float v1, v0, v1

    .line 34
    .line 35
    if-lez v1, :cond_3

    .line 36
    .line 37
    return v4

    .line 38
    :cond_3
    :goto_1
    iget v1, p0, LJ6/t;->k0:F

    .line 39
    .line 40
    iget v5, p0, LJ6/t;->g0:F

    .line 41
    .line 42
    sub-float/2addr v1, v5

    .line 43
    iget v5, p0, LJ6/t;->i0:F

    .line 44
    .line 45
    add-float/2addr v1, v5

    .line 46
    iget v5, p0, LJ6/t;->W:F

    .line 47
    .line 48
    cmpg-float v6, v5, v2

    .line 49
    .line 50
    if-nez v6, :cond_4

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_4
    cmpg-float v5, v1, v5

    .line 54
    .line 55
    if-gez v5, :cond_5

    .line 56
    .line 57
    return v4

    .line 58
    :cond_5
    :goto_2
    iget v5, p0, LJ6/t;->X:F

    .line 59
    .line 60
    cmpg-float v3, v5, v3

    .line 61
    .line 62
    if-nez v3, :cond_6

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_6
    cmpl-float v3, v1, v5

    .line 66
    .line 67
    if-lez v3, :cond_7

    .line 68
    .line 69
    return v4

    .line 70
    :cond_7
    :goto_3
    mul-float/2addr v0, v0

    .line 71
    mul-float/2addr v1, v1

    .line 72
    add-float/2addr v0, v1

    .line 73
    iget v1, p0, LJ6/t;->R:F

    .line 74
    .line 75
    cmpg-float v3, v1, v2

    .line 76
    .line 77
    if-nez v3, :cond_8

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_8
    mul-float/2addr v1, v1

    .line 81
    cmpl-float v0, v0, v1

    .line 82
    .line 83
    if-ltz v0, :cond_9

    .line 84
    .line 85
    return v4

    .line 86
    :cond_9
    :goto_4
    iget v0, p0, LJ6/t;->O:F

    .line 87
    .line 88
    iget v1, p0, LJ6/t;->a0:F

    .line 89
    .line 90
    cmpg-float v3, v1, v2

    .line 91
    .line 92
    const/4 v5, 0x0

    .line 93
    if-nez v3, :cond_a

    .line 94
    .line 95
    goto :goto_5

    .line 96
    :cond_a
    cmpg-float v3, v1, v5

    .line 97
    .line 98
    if-gez v3, :cond_b

    .line 99
    .line 100
    cmpg-float v3, v0, v1

    .line 101
    .line 102
    if-lez v3, :cond_c

    .line 103
    .line 104
    :cond_b
    cmpg-float v3, v5, v1

    .line 105
    .line 106
    if-gtz v3, :cond_d

    .line 107
    .line 108
    cmpg-float v1, v1, v0

    .line 109
    .line 110
    if-gtz v1, :cond_d

    .line 111
    .line 112
    :cond_c
    return v4

    .line 113
    :cond_d
    :goto_5
    iget v1, p0, LJ6/t;->P:F

    .line 114
    .line 115
    iget v3, p0, LJ6/t;->b0:F

    .line 116
    .line 117
    cmpg-float v6, v3, v2

    .line 118
    .line 119
    if-nez v6, :cond_e

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_e
    cmpg-float v6, v3, v5

    .line 123
    .line 124
    if-gez v6, :cond_f

    .line 125
    .line 126
    cmpg-float v6, v0, v3

    .line 127
    .line 128
    if-lez v6, :cond_10

    .line 129
    .line 130
    :cond_f
    cmpg-float v5, v5, v3

    .line 131
    .line 132
    if-gtz v5, :cond_11

    .line 133
    .line 134
    cmpg-float v3, v3, v0

    .line 135
    .line 136
    if-gtz v3, :cond_11

    .line 137
    .line 138
    :cond_10
    return v4

    .line 139
    :cond_11
    :goto_6
    mul-float/2addr v0, v0

    .line 140
    mul-float/2addr v1, v1

    .line 141
    add-float/2addr v0, v1

    .line 142
    iget v1, p0, LJ6/t;->c0:F

    .line 143
    .line 144
    cmpg-float v2, v1, v2

    .line 145
    .line 146
    if-nez v2, :cond_12

    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_12
    mul-float/2addr v1, v1

    .line 150
    cmpl-float v0, v0, v1

    .line 151
    .line 152
    if-ltz v0, :cond_13

    .line 153
    .line 154
    return v4

    .line 155
    :cond_13
    :goto_7
    const/4 v0, 0x0

    .line 156
    return v0
.end method

.method private final s1()Z
    .locals 7

    .line 1
    iget v0, p0, LJ6/t;->j0:F

    .line 2
    .line 3
    iget v1, p0, LJ6/t;->f0:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, LJ6/t;->h0:F

    .line 7
    .line 8
    add-float/2addr v0, v1

    .line 9
    iget v1, p0, LJ6/t;->k0:F

    .line 10
    .line 11
    iget v2, p0, LJ6/t;->g0:F

    .line 12
    .line 13
    sub-float/2addr v1, v2

    .line 14
    iget v2, p0, LJ6/t;->i0:F

    .line 15
    .line 16
    add-float/2addr v1, v2

    .line 17
    iget-wide v2, p0, LJ6/t;->n0:J

    .line 18
    .line 19
    const-wide/16 v4, 0x0

    .line 20
    .line 21
    cmp-long v2, v2, v4

    .line 22
    .line 23
    const/4 v3, 0x1

    .line 24
    if-lez v2, :cond_1

    .line 25
    .line 26
    mul-float v2, v0, v0

    .line 27
    .line 28
    mul-float v4, v1, v1

    .line 29
    .line 30
    add-float/2addr v2, v4

    .line 31
    iget v4, p0, LJ6/t;->Q:F

    .line 32
    .line 33
    mul-float/2addr v4, v4

    .line 34
    cmpl-float v2, v2, v4

    .line 35
    .line 36
    if-lez v2, :cond_1

    .line 37
    .line 38
    iget-object v0, p0, LJ6/t;->p0:Landroid/os/Handler;

    .line 39
    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    :cond_0
    return v3

    .line 47
    :cond_1
    iget v2, p0, LJ6/t;->U:F

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    cmpg-float v5, v2, v4

    .line 51
    .line 52
    if-nez v5, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    cmpg-float v2, v0, v2

    .line 56
    .line 57
    if-gez v2, :cond_3

    .line 58
    .line 59
    return v3

    .line 60
    :cond_3
    :goto_0
    iget v2, p0, LJ6/t;->V:F

    .line 61
    .line 62
    const v5, 0x7f7fffff    # Float.MAX_VALUE

    .line 63
    .line 64
    .line 65
    cmpg-float v6, v2, v5

    .line 66
    .line 67
    if-nez v6, :cond_4

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_4
    cmpl-float v0, v0, v2

    .line 71
    .line 72
    if-lez v0, :cond_5

    .line 73
    .line 74
    return v3

    .line 75
    :cond_5
    :goto_1
    iget v0, p0, LJ6/t;->Y:F

    .line 76
    .line 77
    cmpg-float v2, v0, v4

    .line 78
    .line 79
    if-nez v2, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    cmpg-float v0, v1, v0

    .line 83
    .line 84
    if-gez v0, :cond_7

    .line 85
    .line 86
    return v3

    .line 87
    :cond_7
    :goto_2
    iget v0, p0, LJ6/t;->Z:F

    .line 88
    .line 89
    cmpg-float v2, v0, v5

    .line 90
    .line 91
    if-nez v2, :cond_8

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_8
    cmpl-float v0, v1, v0

    .line 95
    .line 96
    if-lez v0, :cond_9

    .line 97
    .line 98
    return v3

    .line 99
    :cond_9
    :goto_3
    const/4 v0, 0x0

    .line 100
    return v0
.end method


# virtual methods
.method protected j0()V
    .locals 2

    .line 1
    iget-object v0, p0, LJ6/t;->p0:Landroid/os/Handler;

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
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x4

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, LJ6/t;->t0()V

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-super {p0, p1}, LJ6/d;->l(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method protected l0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 8

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "sourceEvent"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, LJ6/d;->J0(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto/16 :goto_2

    .line 18
    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v1, 0x2

    .line 25
    if-ne v0, v1, :cond_1

    .line 26
    .line 27
    sget-object v0, LJ6/z;->f:LJ6/z$a;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, LJ6/z$a;->a(Landroid/view/MotionEvent;)LJ6/z;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LJ6/t;->q0:LJ6/z;

    .line 34
    .line 35
    :cond_1
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, 0x6

    .line 44
    const/4 v3, 0x5

    .line 45
    if-eq v0, v3, :cond_2

    .line 46
    .line 47
    if-eq v0, v2, :cond_2

    .line 48
    .line 49
    sget-object v4, LJ6/k;->a:LJ6/k;

    .line 50
    .line 51
    iget-boolean v5, p0, LJ6/t;->m0:Z

    .line 52
    .line 53
    invoke-virtual {v4, p2, v5}, LJ6/k;->b(Landroid/view/MotionEvent;Z)F

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    iput v5, p0, LJ6/t;->j0:F

    .line 58
    .line 59
    iget-boolean v5, p0, LJ6/t;->m0:Z

    .line 60
    .line 61
    invoke-virtual {v4, p2, v5}, LJ6/k;->c(Landroid/view/MotionEvent;Z)F

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    iput v4, p0, LJ6/t;->k0:F

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    iget v4, p0, LJ6/t;->h0:F

    .line 69
    .line 70
    iget v5, p0, LJ6/t;->j0:F

    .line 71
    .line 72
    iget v6, p0, LJ6/t;->f0:F

    .line 73
    .line 74
    sub-float/2addr v5, v6

    .line 75
    add-float/2addr v4, v5

    .line 76
    iput v4, p0, LJ6/t;->h0:F

    .line 77
    .line 78
    iget v4, p0, LJ6/t;->i0:F

    .line 79
    .line 80
    iget v5, p0, LJ6/t;->k0:F

    .line 81
    .line 82
    iget v6, p0, LJ6/t;->g0:F

    .line 83
    .line 84
    sub-float/2addr v5, v6

    .line 85
    add-float/2addr v4, v5

    .line 86
    iput v4, p0, LJ6/t;->i0:F

    .line 87
    .line 88
    sget-object v4, LJ6/k;->a:LJ6/k;

    .line 89
    .line 90
    iget-boolean v5, p0, LJ6/t;->m0:Z

    .line 91
    .line 92
    invoke-virtual {v4, p2, v5}, LJ6/k;->b(Landroid/view/MotionEvent;Z)F

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    iput v5, p0, LJ6/t;->j0:F

    .line 97
    .line 98
    iget-boolean v5, p0, LJ6/t;->m0:Z

    .line 99
    .line 100
    invoke-virtual {v4, p2, v5}, LJ6/k;->c(Landroid/view/MotionEvent;Z)F

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    iput v4, p0, LJ6/t;->k0:F

    .line 105
    .line 106
    iget v5, p0, LJ6/t;->j0:F

    .line 107
    .line 108
    iput v5, p0, LJ6/t;->f0:F

    .line 109
    .line 110
    iput v4, p0, LJ6/t;->g0:F

    .line 111
    .line 112
    :goto_0
    if-nez p1, :cond_4

    .line 113
    .line 114
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    iget v5, p0, LJ6/t;->d0:I

    .line 119
    .line 120
    if-lt v4, v5, :cond_4

    .line 121
    .line 122
    invoke-virtual {p0}, LJ6/t;->t0()V

    .line 123
    .line 124
    .line 125
    const/4 v4, 0x0

    .line 126
    iput v4, p0, LJ6/t;->h0:F

    .line 127
    .line 128
    iput v4, p0, LJ6/t;->i0:F

    .line 129
    .line 130
    iput v4, p0, LJ6/t;->O:F

    .line 131
    .line 132
    iput v4, p0, LJ6/t;->P:F

    .line 133
    .line 134
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    iput-object v4, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 139
    .line 140
    sget-object v5, LJ6/t;->r0:LJ6/t$a;

    .line 141
    .line 142
    invoke-static {v5, v4, p2}, LJ6/t$a;->a(LJ6/t$a;Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 146
    .line 147
    .line 148
    iget-wide v4, p0, LJ6/t;->n0:J

    .line 149
    .line 150
    const-wide/16 v6, 0x0

    .line 151
    .line 152
    cmp-long v4, v4, v6

    .line 153
    .line 154
    if-lez v4, :cond_5

    .line 155
    .line 156
    iget-object v4, p0, LJ6/t;->p0:Landroid/os/Handler;

    .line 157
    .line 158
    if-nez v4, :cond_3

    .line 159
    .line 160
    new-instance v4, Landroid/os/Handler;

    .line 161
    .line 162
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 163
    .line 164
    .line 165
    move-result-object v5

    .line 166
    invoke-direct {v4, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 167
    .line 168
    .line 169
    iput-object v4, p0, LJ6/t;->p0:Landroid/os/Handler;

    .line 170
    .line 171
    :cond_3
    iget-object v4, p0, LJ6/t;->p0:Landroid/os/Handler;

    .line 172
    .line 173
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    iget-object v5, p0, LJ6/t;->o0:Ljava/lang/Runnable;

    .line 177
    .line 178
    iget-wide v6, p0, LJ6/t;->n0:J

    .line 179
    .line 180
    invoke-virtual {v4, v5, v6, v7}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 181
    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_4
    iget-object v4, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 185
    .line 186
    if-eqz v4, :cond_5

    .line 187
    .line 188
    sget-object v5, LJ6/t;->r0:LJ6/t$a;

    .line 189
    .line 190
    invoke-static {v5, v4, p2}, LJ6/t$a;->a(LJ6/t$a;Landroid/view/VelocityTracker;Landroid/view/MotionEvent;)V

    .line 191
    .line 192
    .line 193
    iget-object v4, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 194
    .line 195
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    const/16 v5, 0x3e8

    .line 199
    .line 200
    invoke-virtual {v4, v5}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 201
    .line 202
    .line 203
    iget-object v4, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 204
    .line 205
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getXVelocity()F

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    iput v4, p0, LJ6/t;->O:F

    .line 213
    .line 214
    iget-object v4, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 215
    .line 216
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {v4}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    iput v4, p0, LJ6/t;->P:F

    .line 224
    .line 225
    :cond_5
    :goto_1
    const/4 v4, 0x1

    .line 226
    const/4 v5, 0x4

    .line 227
    if-eq v0, v4, :cond_c

    .line 228
    .line 229
    const/16 v4, 0xc

    .line 230
    .line 231
    if-ne v0, v4, :cond_6

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :cond_6
    if-ne v0, v3, :cond_8

    .line 235
    .line 236
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 237
    .line 238
    .line 239
    move-result v3

    .line 240
    iget v4, p0, LJ6/t;->e0:I

    .line 241
    .line 242
    if-le v3, v4, :cond_8

    .line 243
    .line 244
    if-ne p1, v5, :cond_7

    .line 245
    .line 246
    invoke-virtual {p0}, LJ6/d;->q()V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :cond_7
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 251
    .line 252
    .line 253
    return-void

    .line 254
    :cond_8
    if-ne v0, v2, :cond_9

    .line 255
    .line 256
    if-ne p1, v5, :cond_9

    .line 257
    .line 258
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    iget v0, p0, LJ6/t;->d0:I

    .line 263
    .line 264
    if-ge p2, v0, :cond_9

    .line 265
    .line 266
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 267
    .line 268
    .line 269
    return-void

    .line 270
    :cond_9
    if-ne p1, v1, :cond_b

    .line 271
    .line 272
    invoke-direct {p0}, LJ6/t;->s1()Z

    .line 273
    .line 274
    .line 275
    move-result p1

    .line 276
    if-eqz p1, :cond_a

    .line 277
    .line 278
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 279
    .line 280
    .line 281
    return-void

    .line 282
    :cond_a
    invoke-direct {p0}, LJ6/t;->r1()Z

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    if-eqz p1, :cond_b

    .line 287
    .line 288
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 289
    .line 290
    .line 291
    :cond_b
    :goto_2
    return-void

    .line 292
    :cond_c
    :goto_3
    if-ne p1, v5, :cond_d

    .line 293
    .line 294
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 295
    .line 296
    .line 297
    return-void

    .line 298
    :cond_d
    invoke-virtual {p0}, LJ6/d;->D()V

    .line 299
    .line 300
    .line 301
    return-void
.end method

.method public final m1()LJ6/z;
    .locals 1

    .line 1
    iget-object v0, p0, LJ6/t;->q0:LJ6/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n1()F
    .locals 2

    .line 1
    iget v0, p0, LJ6/t;->j0:F

    .line 2
    .line 3
    iget v1, p0, LJ6/t;->f0:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, LJ6/t;->h0:F

    .line 7
    .line 8
    add-float/2addr v0, v1

    .line 9
    return v0
.end method

.method protected o0()V
    .locals 15

    .line 1
    iget-object v0, p0, LJ6/t;->p0:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, LJ6/t;->l0:Landroid/view/VelocityTracker;

    .line 17
    .line 18
    :cond_1
    new-instance v2, LJ6/z;

    .line 19
    .line 20
    const/16 v13, 0x1f

    .line 21
    .line 22
    const/4 v14, 0x0

    .line 23
    const-wide/16 v3, 0x0

    .line 24
    .line 25
    const-wide/16 v5, 0x0

    .line 26
    .line 27
    const-wide/16 v7, 0x0

    .line 28
    .line 29
    const-wide/16 v9, 0x0

    .line 30
    .line 31
    const-wide/16 v11, 0x0

    .line 32
    .line 33
    invoke-direct/range {v2 .. v14}, LJ6/z;-><init>(DDDDDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 34
    .line 35
    .line 36
    iput-object v2, p0, LJ6/t;->q0:LJ6/z;

    .line 37
    .line 38
    return-void
.end method

.method public final o1()F
    .locals 2

    .line 1
    iget v0, p0, LJ6/t;->k0:F

    .line 2
    .line 3
    iget v1, p0, LJ6/t;->g0:F

    .line 4
    .line 5
    sub-float/2addr v0, v1

    .line 6
    iget v1, p0, LJ6/t;->i0:F

    .line 7
    .line 8
    add-float/2addr v0, v1

    .line 9
    return v0
.end method

.method public final p1()F
    .locals 1

    .line 1
    iget v0, p0, LJ6/t;->O:F

    .line 2
    .line 3
    return v0
.end method

.method public final q1()F
    .locals 1

    .line 1
    iget v0, p0, LJ6/t;->P:F

    .line 2
    .line 3
    return v0
.end method

.method public s0()V
    .locals 2

    .line 1
    invoke-super {p0}, LJ6/d;->s0()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 5
    .line 6
    .line 7
    iput v0, p0, LJ6/t;->S:F

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    iput v1, p0, LJ6/t;->T:F

    .line 11
    .line 12
    iput v1, p0, LJ6/t;->U:F

    .line 13
    .line 14
    iput v0, p0, LJ6/t;->V:F

    .line 15
    .line 16
    iput v0, p0, LJ6/t;->W:F

    .line 17
    .line 18
    iput v1, p0, LJ6/t;->X:F

    .line 19
    .line 20
    iput v1, p0, LJ6/t;->Y:F

    .line 21
    .line 22
    iput v0, p0, LJ6/t;->Z:F

    .line 23
    .line 24
    iput v0, p0, LJ6/t;->a0:F

    .line 25
    .line 26
    iput v0, p0, LJ6/t;->b0:F

    .line 27
    .line 28
    iput v0, p0, LJ6/t;->c0:F

    .line 29
    .line 30
    iget v0, p0, LJ6/t;->Q:F

    .line 31
    .line 32
    iput v0, p0, LJ6/t;->R:F

    .line 33
    .line 34
    const/4 v0, 0x1

    .line 35
    iput v0, p0, LJ6/t;->d0:I

    .line 36
    .line 37
    const/16 v0, 0xa

    .line 38
    .line 39
    iput v0, p0, LJ6/t;->e0:I

    .line 40
    .line 41
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    iput-wide v0, p0, LJ6/t;->n0:J

    .line 44
    .line 45
    const/4 v0, 0x0

    .line 46
    iput-boolean v0, p0, LJ6/t;->m0:Z

    .line 47
    .line 48
    return-void
.end method

.method public t0()V
    .locals 1

    .line 1
    iget v0, p0, LJ6/t;->j0:F

    .line 2
    .line 3
    iput v0, p0, LJ6/t;->f0:F

    .line 4
    .line 5
    iget v0, p0, LJ6/t;->k0:F

    .line 6
    .line 7
    iput v0, p0, LJ6/t;->g0:F

    .line 8
    .line 9
    return-void
.end method
