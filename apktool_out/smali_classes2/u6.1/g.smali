.class public final Lu6/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Landroid/view/View;

.field private final b:Lcom/facebook/react/views/view/ReactViewGroup;

.field private final c:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final d:I

.field private e:Landroid/widget/EditText;

.field private f:Lq6/b;

.field private g:Landroid/text/TextWatcher;

.field private h:Lw7/a;

.field private final i:Landroid/view/View$OnLayoutChangeListener;

.field private final j:Lkotlin/jvm/functions/Function1;

.field private final k:Lw7/r;

.field private final l:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# direct methods
.method public constructor <init>(Landroid/view/View;Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "eventPropagationView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lu6/g;->a:Landroid/view/View;

    .line 15
    .line 16
    iput-object p2, p0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 17
    .line 18
    iput-object p3, p0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 19
    .line 20
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    iput p2, p0, Lu6/g;->d:I

    .line 25
    .line 26
    invoke-static {}, Lu6/h;->a()Lq6/b;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    iput-object p2, p0, Lu6/g;->f:Lq6/b;

    .line 31
    .line 32
    new-instance p2, Lu6/b;

    .line 33
    .line 34
    invoke-direct {p2, p0}, Lu6/b;-><init>(Lu6/g;)V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Lu6/g;->i:Landroid/view/View$OnLayoutChangeListener;

    .line 38
    .line 39
    new-instance p2, Lu6/c;

    .line 40
    .line 41
    invoke-direct {p2, p0}, Lu6/c;-><init>(Lu6/g;)V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Lu6/g;->j:Lkotlin/jvm/functions/Function1;

    .line 45
    .line 46
    new-instance p2, Lu6/d;

    .line 47
    .line 48
    invoke-direct {p2, p0}, Lu6/d;-><init>(Lu6/g;)V

    .line 49
    .line 50
    .line 51
    iput-object p2, p0, Lu6/g;->k:Lw7/r;

    .line 52
    .line 53
    new-instance p2, Lu6/e;

    .line 54
    .line 55
    invoke-direct {p2, p0}, Lu6/e;-><init>(Lu6/g;)V

    .line 56
    .line 57
    .line 58
    iput-object p2, p0, Lu6/g;->l:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method

.method public static synthetic a(Lu6/g;Ljava/lang/String;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu6/g;->m(Lu6/g;Ljava/lang/String;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lu6/g;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu6/g;->h(Lu6/g;Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lu6/g;IIDDDD)Li7/B;
    .locals 0

    .line 1
    invoke-static/range {p0 .. p10}, Lu6/g;->k(Lu6/g;IIDDDD)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic d(Lu6/g;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p9}, Lu6/g;->j(Lu6/g;Landroid/view/View;IIIIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e(Landroid/widget/EditText;Landroid/text/TextWatcher;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu6/g;->i(Landroid/widget/EditText;Landroid/text/TextWatcher;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final g(Lq6/b;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lu6/g;->f:Lq6/b;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lu6/g;->f:Lq6/b;

    .line 10
    .line 11
    iget-object v0, p0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 12
    .line 13
    iget-object v1, p0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    new-instance v2, Lq6/a;

    .line 20
    .line 21
    iget v3, p0, Lu6/g;->d:I

    .line 22
    .line 23
    iget-object v4, p0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-direct {v2, v3, v4, p1}, Lq6/a;-><init>(IILq6/b;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, v2}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void
.end method

.method private static final h(Lu6/g;Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    if-eqz p1, :cond_4

    .line 5
    .line 6
    :cond_0
    iget-object p1, p0, Lu6/g;->e:Landroid/widget/EditText;

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    iget-object v1, p0, Lu6/g;->i:Landroid/view/View$OnLayoutChangeListener;

    .line 11
    .line 12
    invoke-virtual {p1, v1}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 13
    .line 14
    .line 15
    :cond_1
    iget-object p1, p0, Lu6/g;->e:Landroid/widget/EditText;

    .line 16
    .line 17
    if-eqz p1, :cond_2

    .line 18
    .line 19
    iget-object v1, p0, Lu6/g;->g:Landroid/text/TextWatcher;

    .line 20
    .line 21
    new-instance v2, Lu6/f;

    .line 22
    .line 23
    invoke-direct {v2, p1, v1}, Lu6/f;-><init>(Landroid/widget/EditText;Landroid/text/TextWatcher;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p1, p0, Lu6/g;->h:Lw7/a;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    :cond_3
    iput-object v0, p0, Lu6/g;->e:Landroid/widget/EditText;

    .line 37
    .line 38
    :cond_4
    instance-of p1, p2, Landroid/widget/EditText;

    .line 39
    .line 40
    if-eqz p1, :cond_7

    .line 41
    .line 42
    move-object p1, p2

    .line 43
    check-cast p1, Landroid/widget/EditText;

    .line 44
    .line 45
    iput-object p1, p0, Lu6/g;->e:Landroid/widget/EditText;

    .line 46
    .line 47
    iget-object v1, p0, Lu6/g;->i:Landroid/view/View$OnLayoutChangeListener;

    .line 48
    .line 49
    invoke-virtual {p1, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lu6/g;->l()V

    .line 53
    .line 54
    .line 55
    iget-object v1, p0, Lu6/g;->j:Lkotlin/jvm/functions/Function1;

    .line 56
    .line 57
    invoke-static {p1, v1}, Lr6/e;->d(Landroid/widget/EditText;Lkotlin/jvm/functions/Function1;)Landroid/text/TextWatcher;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p0, Lu6/g;->g:Landroid/text/TextWatcher;

    .line 62
    .line 63
    iget-object v1, p0, Lu6/g;->k:Lw7/r;

    .line 64
    .line 65
    invoke-static {p1, v1}, Lr6/e;->b(Landroid/widget/EditText;Lw7/r;)Lw7/a;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    iput-object v1, p0, Lu6/g;->h:Lw7/a;

    .line 70
    .line 71
    sget-object v1, LA6/a;->a:LA6/a;

    .line 72
    .line 73
    invoke-virtual {v1, p1}, LA6/a;->c(Landroid/widget/EditText;)V

    .line 74
    .line 75
    .line 76
    sget-object p1, LA6/c;->a:LA6/c;

    .line 77
    .line 78
    invoke-virtual {p1, p2}, LA6/c;->e(Landroid/view/View;)LB6/i;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    move-object v0, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_5
    iget-object v1, p0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    invoke-static {v1}, Lr6/h;->c(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    :cond_6
    :goto_0
    invoke-virtual {p1, v0}, LA6/c;->h(Landroid/view/View;)Ljava/util/List;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    iget-object v1, p0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 103
    .line 104
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    const-string v3, "current"

    .line 109
    .line 110
    invoke-interface {v2, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 111
    .line 112
    .line 113
    const-string v0, "count"

    .line 114
    .line 115
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    invoke-interface {v2, v0, p1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 120
    .line 121
    .line 122
    sget-object p1, Li7/B;->a:Li7/B;

    .line 123
    .line 124
    const-string p1, "KeyboardController::focusDidSet"

    .line 125
    .line 126
    invoke-static {v1, p1, v2}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 127
    .line 128
    .line 129
    :cond_7
    if-nez p2, :cond_8

    .line 130
    .line 131
    invoke-static {}, Lu6/h;->a()Lq6/b;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-direct {p0, p1}, Lu6/g;->g(Lq6/b;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    return-void
.end method

.method private static final i(Landroid/widget/EditText;Landroid/text/TextWatcher;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final j(Lu6/g;Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lu6/g;->l()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k(Lu6/g;IIDDDD)Li7/B;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lu6/g;->e:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    sget-object v0, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lu6/g;->l()V

    .line 11
    .line 12
    .line 13
    iget-object v2, v0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 14
    .line 15
    iget-object v3, v0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 16
    .line 17
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    new-instance v4, Lq6/c;

    .line 22
    .line 23
    iget v5, v0, Lu6/g;->d:I

    .line 24
    .line 25
    iget-object v0, v0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    new-instance v6, Lq6/d;

    .line 36
    .line 37
    move/from16 v16, p1

    .line 38
    .line 39
    move/from16 v17, p2

    .line 40
    .line 41
    move-wide/from16 v8, p3

    .line 42
    .line 43
    move-wide/from16 v10, p5

    .line 44
    .line 45
    move-wide/from16 v12, p7

    .line 46
    .line 47
    move-wide/from16 v14, p9

    .line 48
    .line 49
    invoke-direct/range {v6 .. v17}, Lq6/d;-><init>(IDDDDII)V

    .line 50
    .line 51
    .line 52
    invoke-direct {v4, v5, v0, v6}, Lq6/c;-><init>(IILq6/d;)V

    .line 53
    .line 54
    .line 55
    invoke-static {v2, v3, v4}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, Li7/B;->a:Li7/B;

    .line 59
    .line 60
    return-object v0
.end method

.method private static final m(Lu6/g;Ljava/lang/String;)Li7/B;
    .locals 4

    .line 1
    const-string v0, "text"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lu6/g;->l()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lu6/g;->c:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    iget-object v1, p0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Lq6/e;

    .line 18
    .line 19
    iget v3, p0, Lu6/g;->d:I

    .line 20
    .line 21
    iget-object p0, p0, Lu6/g;->b:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-direct {v2, v3, p0, p1}, Lq6/e;-><init>(IILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1, v2}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Li7/B;->a:Li7/B;

    .line 34
    .line 35
    return-object p0
.end method


# virtual methods
.method public final f()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/g;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu6/g;->l:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final l()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lu6/g;->e:Landroid/widget/EditText;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-static {v1}, Lr6/k;->b(Landroid/view/View;)[I

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const/4 v3, 0x0

    .line 13
    aget v3, v2, v3

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    aget v2, v2, v4

    .line 17
    .line 18
    new-instance v4, Lq6/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getX()F

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    invoke-static {v5}, Lr6/f;->a(F)D

    .line 25
    .line 26
    .line 27
    move-result-wide v5

    .line 28
    invoke-virtual {v1}, Landroid/view/View;->getY()F

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-static {v7}, Lr6/f;->a(F)D

    .line 33
    .line 34
    .line 35
    move-result-wide v7

    .line 36
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    int-to-float v9, v9

    .line 41
    invoke-static {v9}, Lr6/f;->a(F)D

    .line 42
    .line 43
    .line 44
    move-result-wide v9

    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    int-to-float v11, v11

    .line 50
    invoke-static {v11}, Lr6/f;->a(F)D

    .line 51
    .line 52
    .line 53
    move-result-wide v11

    .line 54
    int-to-float v3, v3

    .line 55
    invoke-static {v3}, Lr6/f;->a(F)D

    .line 56
    .line 57
    .line 58
    move-result-wide v13

    .line 59
    int-to-float v2, v2

    .line 60
    invoke-static {v2}, Lr6/f;->a(F)D

    .line 61
    .line 62
    .line 63
    move-result-wide v15

    .line 64
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 65
    .line 66
    .line 67
    move-result v17

    .line 68
    invoke-static {v1}, Lr6/e;->g(Landroid/widget/EditText;)I

    .line 69
    .line 70
    .line 71
    move-result v18

    .line 72
    invoke-direct/range {v4 .. v18}, Lq6/b;-><init>(DDDDDDII)V

    .line 73
    .line 74
    .line 75
    invoke-direct {v0, v4}, Lu6/g;->g(Lq6/b;)V

    .line 76
    .line 77
    .line 78
    return-void
.end method
