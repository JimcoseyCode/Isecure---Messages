.class public final LI6/g$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LI6/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LI6/g$a;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/view/View;)I
    .locals 0

    .line 1
    invoke-static {p0}, LI6/g$a;->d(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final b(Landroid/view/View;)Lcom/horcrux/svg/SvgView;
    .locals 3

    .line 1
    instance-of v0, p1, Lcom/horcrux/svg/VirtualView;

    .line 2
    .line 3
    const-string v1, "null cannot be cast to non-null type com.horcrux.svg.SvgView"

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast p1, Lcom/horcrux/svg/SvgView;

    .line 21
    .line 22
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "getParent(...)"

    .line 27
    .line 28
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, LI6/g$a;->e(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    instance-of v0, v0, Lcom/horcrux/svg/VirtualView;

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string v0, "null cannot be cast to non-null type com.horcrux.svg.VirtualView"

    .line 50
    .line 51
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, Lcom/horcrux/svg/VirtualView;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    check-cast p1, Lcom/horcrux/svg/SvgView;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    return-object p1
.end method

.method private static final d(Landroid/view/View;)I
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method


# virtual methods
.method public final c(Landroid/view/View;FF)Z
    .locals 10

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, LI6/g$a;->b(Landroid/view/View;)Lcom/horcrux/svg/SvgView;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    filled-new-array {v1, v1}, [I

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    filled-new-array {v1, v1}, [I

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {p1, v2}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v3}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 23
    .line 24
    .line 25
    aget v4, v2, v1

    .line 26
    .line 27
    int-to-float v4, v4

    .line 28
    add-float/2addr v4, p2

    .line 29
    aget v5, v3, v1

    .line 30
    .line 31
    int-to-float v5, v5

    .line 32
    sub-float/2addr v4, v5

    .line 33
    const/4 v5, 0x1

    .line 34
    aget v2, v2, v5

    .line 35
    .line 36
    int-to-float v2, v2

    .line 37
    add-float/2addr v2, p3

    .line 38
    aget v3, v3, v5

    .line 39
    .line 40
    int-to-float v3, v3

    .line 41
    sub-float/2addr v2, v3

    .line 42
    invoke-virtual {v0, v4, v2}, Lcom/horcrux/svg/SvgView;->reactTagForTouch(FF)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-ne v2, v0, :cond_0

    .line 51
    .line 52
    move v2, v5

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v2, v1

    .line 55
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    int-to-double v3, v3

    .line 60
    float-to-double v6, p2

    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    cmpg-double p2, v8, v6

    .line 64
    .line 65
    if-gtz p2, :cond_1

    .line 66
    .line 67
    cmpg-double p2, v6, v3

    .line 68
    .line 69
    if-gtz p2, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result p2

    .line 75
    int-to-double v3, p2

    .line 76
    float-to-double p2, p3

    .line 77
    cmpg-double v6, v8, p2

    .line 78
    .line 79
    if-gtz v6, :cond_1

    .line 80
    .line 81
    cmpg-double p2, p2, v3

    .line 82
    .line 83
    if-gtz p2, :cond_1

    .line 84
    .line 85
    move p2, v5

    .line 86
    goto :goto_1

    .line 87
    :cond_1
    move p2, v1

    .line 88
    :goto_1
    instance-of p3, p1, Lcom/horcrux/svg/SvgView;

    .line 89
    .line 90
    if-eqz p3, :cond_4

    .line 91
    .line 92
    check-cast p1, Landroid/view/ViewGroup;

    .line 93
    .line 94
    invoke-static {p1}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    new-instance p3, LI6/f;

    .line 99
    .line 100
    invoke-direct {p3}, LI6/f;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-static {p1, p3}, LO8/l;->J(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object p3

    .line 111
    invoke-static {p1, p3}, LO8/l;->u(LO8/i;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result p1

    .line 115
    if-nez v2, :cond_2

    .line 116
    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    :cond_2
    if-eqz p2, :cond_3

    .line 120
    .line 121
    return v5

    .line 122
    :cond_3
    return v1

    .line 123
    :cond_4
    if-eqz v2, :cond_5

    .line 124
    .line 125
    if-eqz p2, :cond_5

    .line 126
    .line 127
    return v5

    .line 128
    :cond_5
    return v1
.end method

.method public final e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/horcrux/svg/VirtualView;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    instance-of p1, p1, Lcom/horcrux/svg/SvgView;

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return p1

    .line 17
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 18
    return p1
.end method
