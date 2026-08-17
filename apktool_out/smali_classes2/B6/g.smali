.class public final LB6/g;
.super Lcom/facebook/react/views/view/ReactViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LB6/g$a;
    }
.end annotation


# static fields
.field public static final t:LB6/g$a;


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private h:Z

.field private i:F

.field private j:F

.field private k:I

.field private l:I

.field private m:I

.field private n:Lt6/a;

.field private o:Z

.field private p:Z

.field private final q:Landroid/graphics/Rect;

.field private final r:Ls6/f;

.field private s:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LB6/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LB6/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LB6/g;->t:LB6/g$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/view/ReactViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LB6/g;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    new-instance p1, Lt6/c;

    .line 12
    .line 13
    invoke-direct {p1}, Lt6/c;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, LB6/g;->n:Lt6/a;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, LB6/g;->p:Z

    .line 20
    .line 21
    new-instance p1, Landroid/graphics/Rect;

    .line 22
    .line 23
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 27
    .line 28
    new-instance p1, Ls6/f;

    .line 29
    .line 30
    invoke-direct {p1}, Ls6/f;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LB6/g;->r:Ls6/f;

    .line 34
    .line 35
    return-void
.end method

.method private final c()V
    .locals 1

    .line 1
    iget-object v0, p0, LB6/g;->r:Ls6/f;

    .line 2
    .line 3
    invoke-virtual {v0}, Ls6/f;->n()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LB6/g;->g()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final d(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    iget-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iput v0, p0, LB6/g;->i:F

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput p1, p0, LB6/g;->j:F

    .line 19
    .line 20
    iget-object p1, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 21
    .line 22
    invoke-static {p0, p1}, Lr6/k;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 26
    .line 27
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 28
    .line 29
    iput p1, p0, LB6/g;->k:I

    .line 30
    .line 31
    return-void
.end method

.method private final e(Landroid/view/MotionEvent;)V
    .locals 5

    .line 1
    iget-object v0, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 2
    .line 3
    invoke-static {p0, v0}, Lr6/k;->a(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 7
    .line 8
    iget v0, v0, Landroid/graphics/Rect;->top:I

    .line 9
    .line 10
    iget v1, p0, LB6/g;->k:I

    .line 11
    .line 12
    sub-int/2addr v0, v1

    .line 13
    invoke-static {p1}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    int-to-float v0, v0

    .line 19
    invoke-virtual {v1, v2, v0}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    iget v2, p0, LB6/g;->i:F

    .line 34
    .line 35
    sub-float/2addr v0, v2

    .line 36
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    iget v2, p0, LB6/g;->j:F

    .line 41
    .line 42
    sub-float/2addr v1, v2

    .line 43
    iget-boolean v2, p0, LB6/g;->h:Z

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    const/4 v4, 0x1

    .line 47
    if-nez v2, :cond_2

    .line 48
    .line 49
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    cmpl-float v0, v2, v0

    .line 58
    .line 59
    if-lez v0, :cond_1

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    int-to-float v2, v2

    .line 78
    cmpl-float v0, v0, v2

    .line 79
    .line 80
    if-ltz v0, :cond_1

    .line 81
    .line 82
    move v0, v4

    .line 83
    goto :goto_0

    .line 84
    :cond_1
    move v0, v3

    .line 85
    :goto_0
    iput-boolean v0, p0, LB6/g;->h:Z

    .line 86
    .line 87
    :cond_2
    iget-boolean v0, p0, LB6/g;->h:Z

    .line 88
    .line 89
    if-eqz v0, :cond_7

    .line 90
    .line 91
    iget-object v0, p0, LB6/g;->r:Ls6/f;

    .line 92
    .line 93
    invoke-virtual {v0}, Ls6/f;->t()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_4

    .line 98
    .line 99
    iget v0, p0, LB6/g;->l:I

    .line 100
    .line 101
    if-nez v0, :cond_3

    .line 102
    .line 103
    iget-object v0, p0, LB6/g;->r:Ls6/f;

    .line 104
    .line 105
    invoke-virtual {v0}, Ls6/f;->q()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    iput v0, p0, LB6/g;->l:I

    .line 110
    .line 111
    :cond_3
    iget-object v0, p0, LB6/g;->n:Lt6/a;

    .line 112
    .line 113
    invoke-static {v1}, Ly7/a;->c(F)I

    .line 114
    .line 115
    .line 116
    move-result v1

    .line 117
    invoke-direct {p0}, LB6/g;->getWindowHeight()I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getRawY()F

    .line 122
    .line 123
    .line 124
    move-result v3

    .line 125
    float-to-int v3, v3

    .line 126
    sub-int/2addr v2, v3

    .line 127
    iget-object v3, p0, LB6/g;->r:Ls6/f;

    .line 128
    .line 129
    invoke-virtual {v3}, Ls6/f;->q()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    iget v4, p0, LB6/g;->m:I

    .line 134
    .line 135
    invoke-interface {v0, v1, v2, v3, v4}, Lt6/a;->a(IIII)I

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    if-eqz v0, :cond_6

    .line 140
    .line 141
    iget-object v1, p0, LB6/g;->r:Ls6/f;

    .line 142
    .line 143
    invoke-virtual {v1, v0}, Ls6/f;->r(I)I

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_4
    iget-object v0, p0, LB6/g;->r:Ls6/f;

    .line 148
    .line 149
    invoke-virtual {v0}, Ls6/f;->u()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_6

    .line 154
    .line 155
    invoke-static {p0}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-eqz v0, :cond_5

    .line 160
    .line 161
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    invoke-virtual {v0, v2}, Landroidx/core/view/L0;->q(I)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-ne v0, v4, :cond_5

    .line 170
    .line 171
    move v3, v4

    .line 172
    :cond_5
    invoke-direct {p0, v1, v3}, LB6/g;->h(FZ)Z

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    if-eqz v0, :cond_6

    .line 177
    .line 178
    iget-object v0, p0, LB6/g;->r:Ls6/f;

    .line 179
    .line 180
    const/4 v1, 0x2

    .line 181
    const/4 v2, 0x0

    .line 182
    invoke-static {v0, p0, v2, v1, v2}, Ls6/f;->y(Ls6/f;Landroid/view/View;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_6
    :goto_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iput v0, p0, LB6/g;->j:F

    .line 190
    .line 191
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 192
    .line 193
    .line 194
    move-result p1

    .line 195
    iput p1, p0, LB6/g;->i:F

    .line 196
    .line 197
    iget-object p1, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 198
    .line 199
    iget p1, p1, Landroid/graphics/Rect;->top:I

    .line 200
    .line 201
    iput p1, p0, LB6/g;->k:I

    .line 202
    .line 203
    :cond_7
    return-void
.end method

.method private final f(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    iget-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/16 v0, 0x1f4

    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    .line 15
    .line 16
    .line 17
    :cond_1
    iget-object p1, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    if-eqz p1, :cond_2

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->getYVelocity()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    move-object p1, v0

    .line 32
    :goto_0
    iget-object v1, p0, LB6/g;->r:Ls6/f;

    .line 33
    .line 34
    invoke-virtual {v1}, Ls6/f;->t()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    iget v1, p0, LB6/g;->l:I

    .line 41
    .line 42
    iget-object v2, p0, LB6/g;->r:Ls6/f;

    .line 43
    .line 44
    invoke-virtual {v2}, Ls6/f;->q()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eq v1, v2, :cond_4

    .line 49
    .line 50
    :cond_3
    move-object v0, p1

    .line 51
    :cond_4
    iget-object p1, p0, LB6/g;->r:Ls6/f;

    .line 52
    .line 53
    invoke-virtual {p1, v0}, Ls6/f;->l(Ljava/lang/Float;)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, LB6/g;->g()V

    .line 57
    .line 58
    .line 59
    return-void
.end method

.method private final g()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, LB6/g;->h:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    iput v1, p0, LB6/g;->i:F

    .line 6
    .line 7
    iput v1, p0, LB6/g;->j:F

    .line 8
    .line 9
    iput v0, p0, LB6/g;->k:I

    .line 10
    .line 11
    iput v0, p0, LB6/g;->l:I

    .line 12
    .line 13
    iget-object v0, p0, LB6/g;->q:Landroid/graphics/Rect;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/Rect;->setEmpty()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    iput-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 27
    .line 28
    return-void
.end method

.method private final getWindowHeight()I
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-lt v0, v1, :cond_1

    .line 7
    .line 8
    iget-object v0, p0, LB6/g;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ThemedReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {v0}, Lr6/a;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    :goto_0
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-static {v0}, Lr6/b;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    return v0

    .line 41
    :cond_1
    return v2
.end method

.method private final h(FZ)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p1, v0

    .line 3
    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-gez v1, :cond_1

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    iget-boolean p1, p0, LB6/g;->o:Z

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    return v3

    .line 16
    :cond_1
    cmpl-float p1, p1, v0

    .line 17
    .line 18
    if-lez p1, :cond_2

    .line 19
    .line 20
    if-eqz p2, :cond_2

    .line 21
    .line 22
    iget-boolean p1, p0, LB6/g;->p:Z

    .line 23
    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    return v2

    .line 27
    :cond_2
    return v3
.end method


# virtual methods
.method public dispatchTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iput-object v0, p0, LB6/g;->s:Landroid/view/VelocityTracker;

    .line 10
    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x0

    .line 23
    :goto_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    invoke-direct {p0, p1}, LB6/g;->d(Landroid/view/MotionEvent;)V

    .line 33
    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_3
    :goto_1
    if-nez v0, :cond_4

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x2

    .line 44
    if-ne v1, v2, :cond_5

    .line 45
    .line 46
    invoke-direct {p0, p1}, LB6/g;->e(Landroid/view/MotionEvent;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_5
    :goto_2
    if-nez v0, :cond_6

    .line 51
    .line 52
    goto :goto_3

    .line 53
    :cond_6
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    const/4 v2, 0x1

    .line 58
    if-ne v1, v2, :cond_7

    .line 59
    .line 60
    invoke-direct {p0, p1}, LB6/g;->f(Landroid/view/MotionEvent;)V

    .line 61
    .line 62
    .line 63
    goto :goto_4

    .line 64
    :cond_7
    :goto_3
    if-nez v0, :cond_8

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/4 v1, 0x3

    .line 72
    if-ne v0, v1, :cond_9

    .line 73
    .line 74
    invoke-direct {p0}, LB6/g;->c()V

    .line 75
    .line 76
    .line 77
    :cond_9
    :goto_4
    invoke-super {p0, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    return p1
.end method

.method public final setInterpolator(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "interpolator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, LB6/h;->a()Ljava/util/Map;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    check-cast p1, Lt6/a;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    new-instance p1, Lt6/c;

    .line 19
    .line 20
    invoke-direct {p1}, Lt6/c;-><init>()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iput-object p1, p0, LB6/g;->n:Lt6/a;

    .line 24
    .line 25
    return-void
.end method

.method public final setOffset(D)V
    .locals 0

    .line 1
    double-to-float p1, p1

    .line 2
    invoke-static {p1}, Lr6/f;->b(F)D

    .line 3
    .line 4
    .line 5
    move-result-wide p1

    .line 6
    double-to-int p1, p1

    .line 7
    iput p1, p0, LB6/g;->m:I

    .line 8
    .line 9
    return-void
.end method

.method public final setScrollKeyboardOffScreenWhenVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB6/g;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setScrollKeyboardOnScreenWhenNotVisible(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LB6/g;->o:Z

    .line 2
    .line 3
    return-void
.end method
