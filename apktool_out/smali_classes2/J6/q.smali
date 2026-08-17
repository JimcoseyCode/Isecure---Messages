.class public final LJ6/q;
.super LJ6/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ6/q$b;,
        LJ6/q$c;,
        LJ6/q$d;,
        LJ6/q$e;,
        LJ6/q$f;,
        LJ6/q$g;,
        LJ6/q$h;,
        LJ6/q$i;
    }
.end annotation


# static fields
.field public static final R:LJ6/q$b;

.field private static final S:LJ6/q$a;


# instance fields
.field private O:Z

.field private P:Z

.field private Q:LJ6/q$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ6/q$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ6/q$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ6/q;->R:LJ6/q$b;

    .line 8
    .line 9
    new-instance v0, LJ6/q$a;

    .line 10
    .line 11
    invoke-direct {v0}, LJ6/q$a;-><init>()V

    .line 12
    .line 13
    .line 14
    sput-object v0, LJ6/q;->S:LJ6/q$a;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, LJ6/d;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, LJ6/q;->S:LJ6/q$a;

    .line 5
    .line 6
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final synthetic U0(LJ6/q;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ6/q;->P:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic V0(LJ6/q;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, LJ6/q;->O:Z

    .line 2
    .line 3
    return-void
.end method

.method private final W0()V
    .locals 8

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    const/4 v4, 0x3

    .line 8
    const/4 v5, 0x0

    .line 9
    move-wide v2, v0

    .line 10
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x3

    .line 15
    invoke-virtual {v0, v1}, Landroid/view/MotionEvent;->setAction(I)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, LJ6/q;->Q:LJ6/q$e;

    .line 19
    .line 20
    invoke-virtual {p0}, LJ6/d;->W()Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v1, v2, v0}, LJ6/q$e;->g(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public K0(LJ6/d;)Z
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, LJ6/q;->P:Z

    .line 7
    .line 8
    xor-int/lit8 p1, p1, 0x1

    .line 9
    .line 10
    return p1
.end method

.method public L0(LJ6/d;)Z
    .locals 6

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 7
    .line 8
    invoke-interface {v0, p1}, LJ6/q$e;->b(LJ6/d;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    :cond_0
    invoke-super {p0, p1}, LJ6/d;->L0(LJ6/d;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x1

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    instance-of v0, p1, LJ6/q;

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    const/4 v3, 0x4

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-ne v0, v3, :cond_2

    .line 38
    .line 39
    move-object v0, p1

    .line 40
    check-cast v0, LJ6/q;

    .line 41
    .line 42
    iget-boolean v0, v0, LJ6/q;->P:Z

    .line 43
    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    return v2

    .line 47
    :cond_2
    iget-boolean v0, p0, LJ6/q;->P:Z

    .line 48
    .line 49
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne v5, v3, :cond_3

    .line 58
    .line 59
    if-ne v4, v3, :cond_3

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    return v2

    .line 64
    :cond_3
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-ne v4, v3, :cond_5

    .line 69
    .line 70
    if-nez v0, :cond_5

    .line 71
    .line 72
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 73
    .line 74
    invoke-interface {v0}, LJ6/q$e;->a()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_4

    .line 79
    .line 80
    invoke-virtual {p1}, LJ6/d;->T()I

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-lez p1, :cond_5

    .line 85
    .line 86
    :cond_4
    return v1

    .line 87
    :cond_5
    return v2
.end method

.method public final X0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LJ6/q;->P:Z

    .line 2
    .line 3
    return v0
.end method

.method protected j0()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ6/q;->W0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected k0()V
    .locals 0

    .line 1
    invoke-direct {p0}, LJ6/q;->W0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected l0(Landroid/view/MotionEvent;Landroid/view/MotionEvent;)V
    .locals 3

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
    invoke-virtual {p0}, LJ6/d;->W()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    const-string v1, "getContext(...)"

    .line 23
    .line 24
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lcom/swmansion/gesturehandler/react/a;->d(Landroid/content/Context;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    instance-of v1, p2, Lcom/swmansion/gesturehandler/react/RNGestureHandlerButtonViewManager$a;

    .line 32
    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto/16 :goto_2

    .line 38
    .line 39
    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v1, 0x1

    .line 44
    const/4 v2, 0x2

    .line 45
    if-ne v0, v1, :cond_5

    .line 46
    .line 47
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 54
    .line 55
    invoke-interface {v0, p1}, LJ6/q$e;->c(Landroid/view/MotionEvent;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    invoke-virtual {p0}, LJ6/d;->q()V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 66
    .line 67
    invoke-interface {v0, p2, p1}, LJ6/q$e;->g(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_2

    .line 75
    .line 76
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-ne v0, v2, :cond_3

    .line 81
    .line 82
    :cond_2
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 83
    .line 84
    invoke-interface {v0, p2}, LJ6/q$e;->e(Landroid/view/View;)Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-eqz p2, :cond_3

    .line 89
    .line 90
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-nez p2, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0}, LJ6/d;->q()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_4
    invoke-virtual {p0}, LJ6/d;->B()V

    .line 104
    .line 105
    .line 106
    :goto_0
    iget-object p2, p0, LJ6/q;->Q:LJ6/q$e;

    .line 107
    .line 108
    invoke-interface {p2, p1}, LJ6/q$e;->h(Landroid/view/MotionEvent;)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_5
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_7

    .line 117
    .line 118
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-ne v0, v2, :cond_6

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_6
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    const/4 v1, 0x4

    .line 130
    if-ne v0, v1, :cond_b

    .line 131
    .line 132
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 133
    .line 134
    invoke-interface {v0, p2, p1}, LJ6/q$e;->g(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_7
    :goto_1
    iget-boolean v0, p0, LJ6/q;->O:Z

    .line 139
    .line 140
    if-eqz v0, :cond_8

    .line 141
    .line 142
    sget-object v0, LJ6/q;->R:LJ6/q$b;

    .line 143
    .line 144
    invoke-static {v0, p2, p1}, LJ6/q$b;->a(LJ6/q$b;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 145
    .line 146
    .line 147
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 148
    .line 149
    invoke-interface {v0, p2, p1}, LJ6/q$e;->g(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 153
    .line 154
    .line 155
    return-void

    .line 156
    :cond_8
    sget-object v0, LJ6/q;->R:LJ6/q$b;

    .line 157
    .line 158
    invoke-static {v0, p2, p1}, LJ6/q$b;->a(LJ6/q$b;Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 159
    .line 160
    .line 161
    move-result v0

    .line 162
    if-eqz v0, :cond_9

    .line 163
    .line 164
    iget-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 165
    .line 166
    invoke-interface {v0, p2, p1}, LJ6/q$e;->g(Landroid/view/View;Landroid/view/MotionEvent;)Ljava/lang/Boolean;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, LJ6/d;->k()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_9
    iget-object p2, p0, LJ6/q;->Q:LJ6/q$e;

    .line 174
    .line 175
    invoke-interface {p2}, LJ6/q$e;->d()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eqz p2, :cond_a

    .line 180
    .line 181
    iget-object p2, p0, LJ6/q;->Q:LJ6/q$e;

    .line 182
    .line 183
    invoke-interface {p2, p1}, LJ6/q$e;->f(Landroid/view/MotionEvent;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_a
    invoke-virtual {p0}, LJ6/d;->S()I

    .line 188
    .line 189
    .line 190
    move-result p2

    .line 191
    if-eq p2, v2, :cond_b

    .line 192
    .line 193
    iget-object p2, p0, LJ6/q;->Q:LJ6/q$e;

    .line 194
    .line 195
    invoke-interface {p2, p1}, LJ6/q$e;->c(Landroid/view/MotionEvent;)Z

    .line 196
    .line 197
    .line 198
    move-result p1

    .line 199
    if-eqz p1, :cond_b

    .line 200
    .line 201
    invoke-virtual {p0}, LJ6/d;->p()V

    .line 202
    .line 203
    .line 204
    :cond_b
    :goto_2
    return-void
.end method

.method protected n0()V
    .locals 2

    .line 1
    invoke-virtual {p0}, LJ6/d;->W()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, LJ6/q$e;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, LJ6/q$e;

    .line 10
    .line 11
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    instance-of v1, v0, Lcom/facebook/react/views/textinput/ReactEditText;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    new-instance v1, LJ6/q$c;

    .line 19
    .line 20
    check-cast v0, Lcom/facebook/react/views/textinput/ReactEditText;

    .line 21
    .line 22
    invoke-direct {v1, p0, v0}, LJ6/q$c;-><init>(LJ6/q;Lcom/facebook/react/views/textinput/ReactEditText;)V

    .line 23
    .line 24
    .line 25
    iput-object v1, p0, LJ6/q;->Q:LJ6/q$e;

    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    instance-of v1, v0, Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    new-instance v1, LJ6/q$h;

    .line 33
    .line 34
    check-cast v0, Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;

    .line 35
    .line 36
    invoke-direct {v1, p0, v0}, LJ6/q$h;-><init>(LJ6/q;Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;)V

    .line 37
    .line 38
    .line 39
    iput-object v1, p0, LJ6/q;->Q:LJ6/q$e;

    .line 40
    .line 41
    return-void

    .line 42
    :cond_2
    instance-of v1, v0, Lcom/facebook/react/views/scroll/ReactScrollView;

    .line 43
    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    new-instance v0, LJ6/q$g;

    .line 47
    .line 48
    invoke-direct {v0}, LJ6/q$g;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_3
    instance-of v1, v0, Lcom/facebook/react/views/scroll/ReactHorizontalScrollView;

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    new-instance v0, LJ6/q$g;

    .line 59
    .line 60
    invoke-direct {v0}, LJ6/q$g;-><init>()V

    .line 61
    .line 62
    .line 63
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 64
    .line 65
    return-void

    .line 66
    :cond_4
    instance-of v1, v0, Lcom/facebook/react/views/text/ReactTextView;

    .line 67
    .line 68
    if-eqz v1, :cond_5

    .line 69
    .line 70
    new-instance v0, LJ6/q$i;

    .line 71
    .line 72
    invoke-direct {v0}, LJ6/q$i;-><init>()V

    .line 73
    .line 74
    .line 75
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_5
    instance-of v0, v0, Lcom/facebook/react/views/view/ReactViewGroup;

    .line 79
    .line 80
    if-eqz v0, :cond_6

    .line 81
    .line 82
    new-instance v0, LJ6/q$f;

    .line 83
    .line 84
    invoke-direct {v0}, LJ6/q$f;-><init>()V

    .line 85
    .line 86
    .line 87
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 88
    .line 89
    :cond_6
    return-void
.end method

.method protected o0()V
    .locals 1

    .line 1
    sget-object v0, LJ6/q;->S:LJ6/q$a;

    .line 2
    .line 3
    iput-object v0, p0, LJ6/q;->Q:LJ6/q$e;

    .line 4
    .line 5
    return-void
.end method

.method public s0()V
    .locals 1

    .line 1
    invoke-super {p0}, LJ6/d;->s0()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, LJ6/q;->O:Z

    .line 6
    .line 7
    iput-boolean v0, p0, LJ6/q;->P:Z

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-virtual {p0, v0}, LJ6/d;->G0(Z)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
