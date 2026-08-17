.class public final Lu6/k;
.super Landroidx/core/view/q0$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/core/view/I;
.implements Lu6/n;


# instance fields
.field private final g:Lcom/facebook/react/views/view/ReactViewGroup;

.field private final h:Landroid/view/View;

.field private final i:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final j:Lu6/l;

.field private final k:I

.field private l:D

.field private m:D

.field private n:Z

.field private o:Z

.field private p:I

.field private q:I

.field private r:Ljava/util/HashSet;

.field private s:Z

.field private final t:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

.field private u:Lu6/g;


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/view/ReactViewGroup;Landroid/view/View;Lcom/facebook/react/uimanager/ThemedReactContext;Lu6/l;)V
    .locals 2

    .line 1
    const-string v0, "eventPropagationView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "view"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "config"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p4}, Lu6/l;->b()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-direct {p0, v0}, Landroidx/core/view/q0$b;-><init>(I)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 24
    .line 25
    iput-object p2, p0, Lu6/k;->h:Landroid/view/View;

    .line 26
    .line 27
    iput-object p3, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 28
    .line 29
    iput-object p4, p0, Lu6/k;->j:Lu6/l;

    .line 30
    .line 31
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput v0, p0, Lu6/k;->k:I

    .line 36
    .line 37
    const/4 v0, -0x1

    .line 38
    iput v0, p0, Lu6/k;->q:I

    .line 39
    .line 40
    new-instance v0, Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 43
    .line 44
    .line 45
    iput-object v0, p0, Lu6/k;->r:Ljava/util/HashSet;

    .line 46
    .line 47
    new-instance v0, Lu6/j;

    .line 48
    .line 49
    invoke-direct {v0, p0}, Lu6/j;-><init>(Lu6/k;)V

    .line 50
    .line 51
    .line 52
    iput-object v0, p0, Lu6/k;->t:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 53
    .line 54
    invoke-virtual {p4}, Lu6/l;->d()I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    invoke-virtual {p4}, Lu6/l;->a()I

    .line 59
    .line 60
    .line 61
    move-result p4

    .line 62
    and-int/2addr p4, v1

    .line 63
    if-nez p4, :cond_0

    .line 64
    .line 65
    new-instance p4, Lu6/g;

    .line 66
    .line 67
    invoke-direct {p4, p2, p1, p3}, Lu6/g;-><init>(Landroid/view/View;Lcom/facebook/react/views/view/ReactViewGroup;Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 68
    .line 69
    .line 70
    iput-object p4, p0, Lu6/k;->u:Lu6/g;

    .line 71
    .line 72
    invoke-virtual {p2}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, v0}, Landroid/view/ViewTreeObserver;->addOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 81
    .line 82
    const-string p2, "persistentInsetTypes and deferredInsetTypes can not contain any of  same WindowInsetsCompat.Type values"

    .line 83
    .line 84
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw p1
.end method

.method public static synthetic c(Lu6/k;Landroidx/core/view/q0;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu6/k;->m(Lu6/k;Landroidx/core/view/q0;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Lu6/k;Landroid/view/View;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lu6/k;->f(Lu6/k;Landroid/view/View;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final f(Lu6/k;Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .line 1
    instance-of v0, p2, Landroid/widget/EditText;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Landroid/widget/EditText;

    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    iput p2, p0, Lu6/k;->q:I

    .line 12
    .line 13
    iget-boolean p2, p0, Lu6/k;->n:Z

    .line 14
    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 20
    .line 21
    iget-object p2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 22
    .line 23
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    new-instance v0, Lq6/f;

    .line 28
    .line 29
    iget v1, p0, Lu6/k;->k:I

    .line 30
    .line 31
    iget-object v2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 32
    .line 33
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    sget-object v10, Lq6/f;->f:Lq6/f$a;

    .line 38
    .line 39
    invoke-virtual {v10}, Lq6/f$a;->d()Lq6/f$a$a;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    iget-wide v4, p0, Lu6/k;->l:D

    .line 44
    .line 45
    const/4 v8, 0x0

    .line 46
    iget v9, p0, Lu6/k;->q:I

    .line 47
    .line 48
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 49
    .line 50
    invoke-direct/range {v0 .. v9}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2, v0}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 57
    .line 58
    iget-object p2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 59
    .line 60
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    new-instance v0, Lq6/f;

    .line 65
    .line 66
    iget v1, p0, Lu6/k;->k:I

    .line 67
    .line 68
    iget-object v2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 69
    .line 70
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    invoke-virtual {v10}, Lq6/f$a;->a()Lq6/f$a$a;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iget-wide v4, p0, Lu6/k;->l:D

    .line 79
    .line 80
    iget v9, p0, Lu6/k;->q:I

    .line 81
    .line 82
    invoke-direct/range {v0 .. v9}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2, v0}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 89
    .line 90
    iget-wide v0, p0, Lu6/k;->l:D

    .line 91
    .line 92
    invoke-direct {p0, v0, v1}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    const-string v0, "KeyboardController::keyboardWillShow"

    .line 97
    .line 98
    invoke-static {p1, v0, p2}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 99
    .line 100
    .line 101
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 102
    .line 103
    iget-wide v0, p0, Lu6/k;->l:D

    .line 104
    .line 105
    invoke-direct {p0, v0, v1}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    const-string p2, "KeyboardController::keyboardDidShow"

    .line 110
    .line 111
    invoke-static {p1, p2, p0}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 112
    .line 113
    .line 114
    :cond_0
    return-void
.end method

.method private final g()D
    .locals 4

    .line 1
    iget-object v0, p0, Lu6/k;->h:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    invoke-virtual {v0, v2}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iget v2, v2, Lx0/e;->d:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v2, v1

    .line 24
    :goto_0
    iget-object v3, p0, Lu6/k;->j:Lu6/l;

    .line 25
    .line 26
    invoke-virtual {v3}, Lu6/l;->c()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-static {}, Landroidx/core/view/L0$p;->e()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    invoke-virtual {v0, v3}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    iget v1, v0, Lx0/e;->d:I

    .line 46
    .line 47
    :cond_2
    :goto_1
    sub-int/2addr v2, v1

    .line 48
    int-to-float v0, v2

    .line 49
    invoke-static {v0}, Lr6/f;->a(F)D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    const-wide/16 v2, 0x0

    .line 54
    .line 55
    invoke-static {v0, v1, v2, v3}, LB7/d;->b(DD)D

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    return-wide v0
.end method

.method private final h(D)Lcom/facebook/react/bridge/WritableMap;
    .locals 2

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "height"

    .line 6
    .line 7
    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 8
    .line 9
    .line 10
    const-string p1, "duration"

    .line 11
    .line 12
    iget p2, p0, Lu6/k;->p:I

    .line 13
    .line 14
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    .line 19
    .line 20
    move-result-wide p1

    .line 21
    long-to-double p1, p1

    .line 22
    const-string v1, "timestamp"

    .line 23
    .line 24
    invoke-interface {v0, v1, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 25
    .line 26
    .line 27
    const-string p1, "target"

    .line 28
    .line 29
    iget p2, p0, Lu6/k;->q:I

    .line 30
    .line 31
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, LA6/a;->a:LA6/a;

    .line 35
    .line 36
    invoke-virtual {p1}, LA6/a;->b()Landroid/widget/EditText;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    invoke-static {p1}, Lr6/e;->f(Landroid/widget/EditText;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 p1, 0x0

    .line 48
    :goto_0
    const-string p2, "type"

    .line 49
    .line 50
    invoke-interface {v0, p2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 54
    .line 55
    invoke-static {p1}, Lr6/i;->c(Lcom/facebook/react/uimanager/ThemedReactContext;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p2, "appearance"

    .line 60
    .line 61
    invoke-interface {v0, p2, p1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v0
.end method

.method private final j()Z
    .locals 2

    .line 1
    iget v0, p0, Lu6/k;->p:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    return v0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method private final k()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/k;->h:Landroid/view/View;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/core/view/a0;->F(Landroid/view/View;)Landroidx/core/view/L0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Landroidx/core/view/L0$p;->b()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-virtual {v0, v1}, Landroidx/core/view/L0;->q(I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method private static final m(Lu6/k;Landroidx/core/view/q0;)V
    .locals 12

    .line 1
    invoke-direct {p0}, Lu6/k;->g()D

    .line 2
    .line 3
    .line 4
    move-result-wide v4

    .line 5
    invoke-direct {p0}, Lu6/k;->k()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput-boolean v0, p0, Lu6/k;->n:Z

    .line 10
    .line 11
    iput-wide v4, p0, Lu6/k;->m:D

    .line 12
    .line 13
    iget-object v0, p0, Lu6/k;->r:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v10, 0x0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iput v10, p0, Lu6/k;->p:I

    .line 23
    .line 24
    iget-object p0, p0, Lu6/k;->r:Ljava/util/HashSet;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 31
    .line 32
    iget-boolean v0, p0, Lu6/k;->n:Z

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const-string v0, "keyboardDidHide"

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string v0, "keyboardDidShow"

    .line 40
    .line 41
    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v2, "KeyboardController::"

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0, v4, v5}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-static {p1, v0, v1}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 66
    .line 67
    iget-object v0, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    new-instance v0, Lq6/f;

    .line 74
    .line 75
    iget v1, p0, Lu6/k;->k:I

    .line 76
    .line 77
    iget-object v2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 78
    .line 79
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    sget-object v3, Lq6/f;->f:Lq6/f$a;

    .line 84
    .line 85
    invoke-virtual {v3}, Lq6/f$a;->a()Lq6/f$a$a;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    iget-boolean v6, p0, Lu6/k;->n:Z

    .line 90
    .line 91
    if-nez v6, :cond_2

    .line 92
    .line 93
    const-wide/16 v6, 0x0

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_2
    const-wide/high16 v6, 0x3ff0000000000000L    # 1.0

    .line 97
    .line 98
    :goto_1
    iget v8, p0, Lu6/k;->p:I

    .line 99
    .line 100
    iget v9, p0, Lu6/k;->q:I

    .line 101
    .line 102
    invoke-direct/range {v0 .. v9}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 103
    .line 104
    .line 105
    invoke-static {p1, v11, v0}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 106
    .line 107
    .line 108
    iput v10, p0, Lu6/k;->p:I

    .line 109
    .line 110
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 111
    .line 112
    iget-object p0, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 113
    .line 114
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    invoke-static {p1, p0}, Lr6/i;->d(Lcom/facebook/react/uimanager/ThemedReactContext;I)V

    .line 119
    .line 120
    .line 121
    return-void
.end method

.method private final n(D)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lu6/k;->p:I

    .line 3
    .line 4
    iget-object v0, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    const-string v1, "KeyboardController::keyboardWillShow"

    .line 7
    .line 8
    invoke-direct {p0, p1, p2}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {v0, v1, v2}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 13
    .line 14
    .line 15
    sget-object v0, Lq6/f;->f:Lq6/f$a;

    .line 16
    .line 17
    invoke-virtual {v0}, Lq6/f$a;->d()Lq6/f$a$a;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0}, Lq6/f$a;->c()Lq6/f$a$a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v0}, Lq6/f$a;->a()Lq6/f$a$a;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    filled-new-array {v1, v2, v0}, [Lq6/f$a$a;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eqz v1, :cond_0

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    move-object v5, v1

    .line 52
    check-cast v5, Lq6/f$a$a;

    .line 53
    .line 54
    iget-object v1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 55
    .line 56
    iget-object v2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 57
    .line 58
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 59
    .line 60
    .line 61
    move-result v12

    .line 62
    new-instance v2, Lq6/f;

    .line 63
    .line 64
    iget v3, p0, Lu6/k;->k:I

    .line 65
    .line 66
    iget-object v4, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    const/4 v10, 0x0

    .line 73
    iget v11, p0, Lu6/k;->q:I

    .line 74
    .line 75
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 76
    .line 77
    move-wide v6, p1

    .line 78
    invoke-direct/range {v2 .. v11}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v12, v2}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    move-wide v6, p1

    .line 86
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 87
    .line 88
    const-string p2, "KeyboardController::keyboardDidShow"

    .line 89
    .line 90
    invoke-direct {p0, v6, v7}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {p1, p2, v0}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 98
    .line 99
    iget-object p2, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 100
    .line 101
    invoke-virtual {p2}, Landroid/view/View;->getId()I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    invoke-static {p1, p2}, Lr6/i;->d(Lcom/facebook/react/uimanager/ThemedReactContext;I)V

    .line 106
    .line 107
    .line 108
    iput-wide v6, p0, Lu6/k;->l:D

    .line 109
    .line 110
    return-void
.end method

.method public static synthetic q(Lu6/k;Ljava/lang/Double;Ljava/lang/Boolean;ILjava/lang/Object;)V
    .locals 1

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p4, :cond_0

    .line 5
    .line 6
    move-object p1, v0

    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    move-object p2, v0

    .line 12
    :cond_1
    invoke-virtual {p0, p1, p2}, Lu6/k;->p(Ljava/lang/Double;Ljava/lang/Boolean;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 8

    .line 1
    const-string v0, "v"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "insets"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lu6/k;->g()D

    .line 12
    .line 13
    .line 14
    move-result-wide v0

    .line 15
    iget-boolean p1, p0, Lu6/k;->n:Z

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lu6/k;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    move p1, v3

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v2

    .line 30
    :goto_0
    iget-boolean v4, p0, Lu6/k;->o:Z

    .line 31
    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    sget-object v4, Ls6/a;->a:Ls6/a;

    .line 35
    .line 36
    invoke-virtual {v4}, Ls6/a;->a()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v4, v2

    .line 44
    goto :goto_2

    .line 45
    :cond_2
    :goto_1
    move v4, v3

    .line 46
    :goto_2
    if-eqz p1, :cond_3

    .line 47
    .line 48
    if-nez v4, :cond_3

    .line 49
    .line 50
    move p1, v3

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move p1, v2

    .line 53
    :goto_3
    iget-wide v4, p0, Lu6/k;->l:D

    .line 54
    .line 55
    cmpg-double v4, v4, v0

    .line 56
    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    move v2, v3

    .line 60
    :cond_4
    if-eqz p1, :cond_6

    .line 61
    .line 62
    if-nez v2, :cond_6

    .line 63
    .line 64
    invoke-static {}, Lu6/m;->b()Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-nez p1, :cond_6

    .line 69
    .line 70
    sget-object v2, Lv6/a;->a:Lv6/a;

    .line 71
    .line 72
    invoke-static {}, Lu6/m;->a()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    iget-wide v4, p0, Lu6/k;->l:D

    .line 77
    .line 78
    new-instance p1, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v6, "onApplyWindowInsets: "

    .line 84
    .line 85
    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v4, " -> "

    .line 92
    .line 93
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    const/4 v6, 0x4

    .line 104
    const/4 v7, 0x0

    .line 105
    const/4 v5, 0x0

    .line 106
    invoke-static/range {v2 .. v7}, Lv6/a;->b(Lv6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    iget-object p1, p0, Lu6/k;->u:Lu6/g;

    .line 110
    .line 111
    if-eqz p1, :cond_5

    .line 112
    .line 113
    invoke-virtual {p1}, Lu6/g;->l()V

    .line 114
    .line 115
    .line 116
    :cond_5
    invoke-direct {p0, v0, v1}, Lu6/k;->n(D)V

    .line 117
    .line 118
    .line 119
    :cond_6
    return-object p2
.end method

.method public b(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lu6/k;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/k;->h:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lu6/k;->t:Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalFocusChangeListener(Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lu6/k;->u:Lu6/g;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Lu6/g;->f()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final i()Lu6/g;
    .locals 1

    .line 1
    iget-object v0, p0, Lu6/k;->u:Lu6/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lu6/k;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public o(Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu6/n$a;->a(Lu6/n;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public onEnd(Landroidx/core/view/q0;)V
    .locals 3

    .line 1
    const-string v0, "animation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/core/view/q0$b;->onEnd(Landroidx/core/view/q0;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p1}, Lr6/l;->a(Landroidx/core/view/q0;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lu6/k;->l()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    iput-boolean v0, p0, Lu6/k;->o:Z

    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/core/view/q0;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    long-to-int v0, v0

    .line 30
    iput v0, p0, Lu6/k;->p:I

    .line 31
    .line 32
    new-instance v0, Lu6/i;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, Lu6/i;-><init>(Lu6/k;Landroidx/core/view/q0;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, Lu6/k;->j()Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, Lu6/k;->h:Landroid/view/View;

    .line 44
    .line 45
    sget-object v1, Lp6/b;->a:Lp6/b;

    .line 46
    .line 47
    invoke-virtual {v1}, Lp6/b;->a()J

    .line 48
    .line 49
    .line 50
    move-result-wide v1

    .line 51
    invoke-virtual {p1, v0, v1, v2}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 56
    .line 57
    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method public onProgress(Landroidx/core/view/L0;Ljava/util/List;)Landroidx/core/view/L0;
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    const-string v0, "insets"

    .line 6
    .line 7
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v0, "runningAnimations"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    move-object v4, v3

    .line 32
    check-cast v4, Landroidx/core/view/q0;

    .line 33
    .line 34
    invoke-static {v4}, Lr6/l;->a(Landroidx/core/view/q0;)Z

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-eqz v5, :cond_0

    .line 39
    .line 40
    iget-object v5, v1, Lu6/k;->r:Ljava/util/HashSet;

    .line 41
    .line 42
    invoke-virtual {v5, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    if-nez v4, :cond_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    const/4 v3, 0x0

    .line 50
    :goto_0
    if-nez v3, :cond_2

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 v0, 0x0

    .line 55
    :goto_1
    invoke-virtual {v1}, Lu6/k;->l()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-nez v3, :cond_8

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    goto/16 :goto_7

    .line 64
    .line 65
    :cond_3
    iget-object v0, v1, Lu6/k;->j:Lu6/l;

    .line 66
    .line 67
    invoke-virtual {v0}, Lu6/l;->a()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-virtual {v2, v0}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const-string v3, "getInsets(...)"

    .line 76
    .line 77
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object v4, v1, Lu6/k;->j:Lu6/l;

    .line 81
    .line 82
    invoke-virtual {v4}, Lu6/l;->d()I

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    invoke-virtual {v2, v4}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v3, v1, Lu6/k;->j:Lu6/l;

    .line 94
    .line 95
    invoke-virtual {v3}, Lu6/l;->c()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_4

    .line 100
    .line 101
    sget-object v4, Lx0/e;->e:Lx0/e;

    .line 102
    .line 103
    const-string v3, "NONE"

    .line 104
    .line 105
    invoke-static {v4, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :cond_4
    invoke-static {v0, v4}, Lx0/e;->e(Lx0/e;Lx0/e;)Lx0/e;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v3, Lx0/e;->e:Lx0/e;

    .line 113
    .line 114
    invoke-static {v0, v3}, Lx0/e;->b(Lx0/e;Lx0/e;)Lx0/e;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    const-string v3, "let(...)"

    .line 119
    .line 120
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    iget v3, v0, Lx0/e;->d:I

    .line 124
    .line 125
    iget v0, v0, Lx0/e;->b:I

    .line 126
    .line 127
    sub-int/2addr v3, v0

    .line 128
    int-to-float v3, v3

    .line 129
    invoke-static {v3}, Lr6/f;->a(F)D

    .line 130
    .line 131
    .line 132
    move-result-wide v8

    .line 133
    const-wide/16 v4, 0x0

    .line 134
    .line 135
    :try_start_0
    iget-wide v6, v1, Lu6/k;->l:D

    .line 136
    .line 137
    div-double v6, v8, v6

    .line 138
    .line 139
    invoke-static {v6, v7}, Ljava/lang/Math;->abs(D)D

    .line 140
    .line 141
    .line 142
    move-result-wide v6

    .line 143
    invoke-static {v6, v7}, Ljava/lang/Double;->isNaN(D)Z

    .line 144
    .line 145
    .line 146
    move-result v0

    .line 147
    if-nez v0, :cond_6

    .line 148
    .line 149
    invoke-static {v6, v7}, Ljava/lang/Double;->isInfinite(D)Z

    .line 150
    .line 151
    .line 152
    move-result v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    if-eqz v0, :cond_5

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_5
    move-wide v4, v6

    .line 157
    goto :goto_2

    .line 158
    :catch_0
    move-exception v0

    .line 159
    goto :goto_3

    .line 160
    :cond_6
    :goto_2
    move-wide v10, v4

    .line 161
    goto :goto_4

    .line 162
    :goto_3
    sget-object v10, Lv6/a;->a:Lv6/a;

    .line 163
    .line 164
    invoke-static {}, Lu6/m;->a()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v11

    .line 168
    new-instance v6, Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 171
    .line 172
    .line 173
    const-string v7, "Caught arithmetic exception during `progress` calculation: "

    .line 174
    .line 175
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v12

    .line 185
    const/4 v14, 0x4

    .line 186
    const/4 v15, 0x0

    .line 187
    const/4 v13, 0x0

    .line 188
    invoke-static/range {v10 .. v15}, Lv6/a;->d(Lv6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto :goto_2

    .line 192
    :goto_4
    sget-object v12, Lv6/a;->a:Lv6/a;

    .line 193
    .line 194
    invoke-static {}, Lu6/m;->a()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v13

    .line 198
    sget-object v0, Ls6/a;->a:Ls6/a;

    .line 199
    .line 200
    invoke-virtual {v0}, Ls6/a;->a()Z

    .line 201
    .line 202
    .line 203
    move-result v4

    .line 204
    iget v5, v1, Lu6/k;->q:I

    .line 205
    .line 206
    new-instance v6, Ljava/lang/StringBuilder;

    .line 207
    .line 208
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 209
    .line 210
    .line 211
    const-string v7, "DiffY: "

    .line 212
    .line 213
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v3, " "

    .line 220
    .line 221
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v6, v10, v11}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v14

    .line 249
    const/16 v16, 0x4

    .line 250
    .line 251
    const/16 v17, 0x0

    .line 252
    .line 253
    const/4 v15, 0x0

    .line 254
    invoke-static/range {v12 .. v17}, Lv6/a;->b(Lv6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0}, Ls6/a;->a()Z

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    if-eqz v0, :cond_7

    .line 262
    .line 263
    sget-object v0, Lq6/f;->f:Lq6/f$a;

    .line 264
    .line 265
    invoke-virtual {v0}, Lq6/f$a;->b()Lq6/f$a$a;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    :goto_5
    move-object v7, v0

    .line 270
    goto :goto_6

    .line 271
    :cond_7
    sget-object v0, Lq6/f;->f:Lq6/f$a;

    .line 272
    .line 273
    invoke-virtual {v0}, Lq6/f$a;->c()Lq6/f$a$a;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    goto :goto_5

    .line 278
    :goto_6
    iget-object v0, v1, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 279
    .line 280
    iget-object v3, v1, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 281
    .line 282
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 283
    .line 284
    .line 285
    move-result v3

    .line 286
    new-instance v4, Lq6/f;

    .line 287
    .line 288
    iget v5, v1, Lu6/k;->k:I

    .line 289
    .line 290
    iget-object v6, v1, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 291
    .line 292
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 293
    .line 294
    .line 295
    move-result v6

    .line 296
    iget v12, v1, Lu6/k;->p:I

    .line 297
    .line 298
    iget v13, v1, Lu6/k;->q:I

    .line 299
    .line 300
    invoke-direct/range {v4 .. v13}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 301
    .line 302
    .line 303
    invoke-static {v0, v3, v4}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 304
    .line 305
    .line 306
    :cond_8
    :goto_7
    return-object v2
.end method

.method public onStart(Landroidx/core/view/q0;Landroidx/core/view/q0$a;)Landroidx/core/view/q0$a;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "animation"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "bounds"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lr6/l;->a(Landroidx/core/view/q0;)Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_a

    .line 22
    .line 23
    invoke-virtual {v0}, Lu6/k;->l()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    goto/16 :goto_4

    .line 30
    .line 31
    :cond_0
    const/4 v3, 0x1

    .line 32
    iput-boolean v3, v0, Lu6/k;->o:Z

    .line 33
    .line 34
    invoke-direct {v0}, Lu6/k;->k()Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iput-boolean v4, v0, Lu6/k;->n:Z

    .line 39
    .line 40
    invoke-virtual {v1}, Landroidx/core/view/q0;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v4

    .line 44
    long-to-int v4, v4

    .line 45
    iput v4, v0, Lu6/k;->p:I

    .line 46
    .line 47
    invoke-direct {v0}, Lu6/k;->g()D

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    iget-boolean v4, v0, Lu6/k;->n:Z

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    iput-wide v9, v0, Lu6/k;->l:D

    .line 56
    .line 57
    :cond_1
    iget-object v4, v0, Lu6/k;->u:Lu6/g;

    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4}, Lu6/g;->l()V

    .line 62
    .line 63
    .line 64
    :cond_2
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    cmpg-double v6, v9, v4

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    if-nez v6, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    iget-wide v11, v0, Lu6/k;->m:D

    .line 73
    .line 74
    cmpg-double v6, v11, v9

    .line 75
    .line 76
    if-nez v6, :cond_4

    .line 77
    .line 78
    :goto_0
    move v6, v7

    .line 79
    goto :goto_1

    .line 80
    :cond_4
    move v6, v3

    .line 81
    :goto_1
    iget-boolean v8, v0, Lu6/k;->n:Z

    .line 82
    .line 83
    if-eqz v8, :cond_5

    .line 84
    .line 85
    iget-wide v11, v0, Lu6/k;->m:D

    .line 86
    .line 87
    cmpg-double v8, v11, v4

    .line 88
    .line 89
    if-nez v8, :cond_6

    .line 90
    .line 91
    :cond_5
    move v3, v7

    .line 92
    :cond_6
    if-eqz v6, :cond_7

    .line 93
    .line 94
    if-eqz v3, :cond_7

    .line 95
    .line 96
    invoke-static {}, Lu6/m;->b()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    if-eqz v3, :cond_7

    .line 101
    .line 102
    invoke-direct {v0, v9, v10}, Lu6/k;->n(D)V

    .line 103
    .line 104
    .line 105
    iget-object v3, v0, Lu6/k;->r:Ljava/util/HashSet;

    .line 106
    .line 107
    invoke-virtual {v3, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    return-object v2

    .line 111
    :cond_7
    iget-object v3, v0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 112
    .line 113
    iget-boolean v6, v0, Lu6/k;->n:Z

    .line 114
    .line 115
    if-nez v6, :cond_8

    .line 116
    .line 117
    const-string v6, "keyboardWillHide"

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_8
    const-string v6, "keyboardWillShow"

    .line 121
    .line 122
    :goto_2
    new-instance v7, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    const-string v8, "KeyboardController::"

    .line 128
    .line 129
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    invoke-direct {v0, v9, v10}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 140
    .line 141
    .line 142
    move-result-object v7

    .line 143
    invoke-static {v3, v6, v7}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 144
    .line 145
    .line 146
    sget-object v11, Lv6/a;->a:Lv6/a;

    .line 147
    .line 148
    invoke-static {}, Lu6/m;->a()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v12

    .line 152
    iget v3, v0, Lu6/k;->q:I

    .line 153
    .line 154
    new-instance v6, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 157
    .line 158
    .line 159
    const-string v7, "HEIGHT:: "

    .line 160
    .line 161
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v6, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v7, " TAG:: "

    .line 168
    .line 169
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v13

    .line 179
    const/4 v15, 0x4

    .line 180
    const/16 v16, 0x0

    .line 181
    .line 182
    const/4 v14, 0x0

    .line 183
    invoke-static/range {v11 .. v16}, Lv6/a;->b(Lv6/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    iget-object v3, v0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 187
    .line 188
    iget-object v6, v0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 189
    .line 190
    invoke-virtual {v6}, Landroid/view/View;->getId()I

    .line 191
    .line 192
    .line 193
    move-result v15

    .line 194
    move-wide v6, v4

    .line 195
    new-instance v5, Lq6/f;

    .line 196
    .line 197
    move-wide v7, v6

    .line 198
    iget v6, v0, Lu6/k;->k:I

    .line 199
    .line 200
    iget-object v4, v0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 201
    .line 202
    invoke-virtual {v4}, Landroid/view/View;->getId()I

    .line 203
    .line 204
    .line 205
    move-result v4

    .line 206
    sget-object v11, Lq6/f;->f:Lq6/f$a;

    .line 207
    .line 208
    invoke-virtual {v11}, Lq6/f$a;->d()Lq6/f$a$a;

    .line 209
    .line 210
    .line 211
    move-result-object v11

    .line 212
    iget-boolean v12, v0, Lu6/k;->n:Z

    .line 213
    .line 214
    if-nez v12, :cond_9

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_9
    const-wide/high16 v7, 0x3ff0000000000000L    # 1.0

    .line 218
    .line 219
    :goto_3
    iget v13, v0, Lu6/k;->p:I

    .line 220
    .line 221
    iget v14, v0, Lu6/k;->q:I

    .line 222
    .line 223
    move-wide/from16 v17, v7

    .line 224
    .line 225
    move-object v8, v11

    .line 226
    move-wide/from16 v11, v17

    .line 227
    .line 228
    move v7, v4

    .line 229
    invoke-direct/range {v5 .. v14}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 230
    .line 231
    .line 232
    invoke-static {v3, v15, v5}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 233
    .line 234
    .line 235
    invoke-super/range {p0 .. p2}, Landroidx/core/view/q0$b;->onStart(Landroidx/core/view/q0;Landroidx/core/view/q0$a;)Landroidx/core/view/q0$a;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    const-string v2, "onStart(...)"

    .line 240
    .line 241
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    return-object v1

    .line 245
    :cond_a
    :goto_4
    return-object v2
.end method

.method public final p(Ljava/lang/Double;Ljava/lang/Boolean;)V
    .locals 12

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    :goto_0
    move-wide v6, v0

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    invoke-direct {p0}, Lu6/k;->g()D

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    goto :goto_0

    .line 14
    :goto_1
    if-eqz p2, :cond_1

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    goto :goto_2

    .line 21
    :cond_1
    invoke-direct {p0}, Lu6/k;->k()Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    :goto_2
    iput-boolean p1, p0, Lu6/k;->n:Z

    .line 26
    .line 27
    iput-wide v6, p0, Lu6/k;->m:D

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    iput-boolean p2, p0, Lu6/k;->o:Z

    .line 31
    .line 32
    iput p2, p0, Lu6/k;->p:I

    .line 33
    .line 34
    iget-object p2, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 35
    .line 36
    if-nez p1, :cond_2

    .line 37
    .line 38
    const-string p1, "keyboardDidHide"

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_2
    const-string p1, "keyboardDidShow"

    .line 42
    .line 43
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v1, "KeyboardController::"

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, v6, v7}, Lu6/k;->h(D)Lcom/facebook/react/bridge/WritableMap;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-static {p2, p1, v0}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 65
    .line 66
    .line 67
    sget-object p1, Lq6/f;->f:Lq6/f$a;

    .line 68
    .line 69
    invoke-virtual {p1}, Lq6/f$a;->c()Lq6/f$a$a;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-virtual {p1}, Lq6/f$a;->a()Lq6/f$a$a;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    filled-new-array {p2, p1}, [Lq6/f$a$a;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-static {p1}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result p2

    .line 93
    if-eqz p2, :cond_4

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    move-object v5, p2

    .line 100
    check-cast v5, Lq6/f$a$a;

    .line 101
    .line 102
    iget-object p2, p0, Lu6/k;->i:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 103
    .line 104
    iget-object v0, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    new-instance v2, Lq6/f;

    .line 111
    .line 112
    iget v3, p0, Lu6/k;->k:I

    .line 113
    .line 114
    iget-object v1, p0, Lu6/k;->g:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 115
    .line 116
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    iget-boolean v1, p0, Lu6/k;->n:Z

    .line 121
    .line 122
    if-nez v1, :cond_3

    .line 123
    .line 124
    const-wide/16 v8, 0x0

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_3
    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    .line 128
    .line 129
    :goto_5
    iget v10, p0, Lu6/k;->p:I

    .line 130
    .line 131
    iget v11, p0, Lu6/k;->q:I

    .line 132
    .line 133
    invoke-direct/range {v2 .. v11}, Lq6/f;-><init>(IILq6/f$a$a;DDII)V

    .line 134
    .line 135
    .line 136
    invoke-static {p2, v0, v2}, Lr6/i;->a(Lcom/facebook/react/uimanager/ThemedReactContext;ILcom/facebook/react/uimanager/events/Event;)V

    .line 137
    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_4
    return-void
.end method
