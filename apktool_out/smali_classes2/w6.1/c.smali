.class public final Lw6/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw6/c$a;
    }
.end annotation


# static fields
.field public static final c:Lw6/c$a;


# instance fields
.field private a:Lu6/p;

.field private b:Lcom/facebook/react/uimanager/ThemedReactContext;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lw6/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lw6/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lw6/c;->c:Lw6/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lcom/facebook/react/uimanager/ThemedReactContext;)LB6/d;
    .locals 2

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lw6/c;->a:Lu6/p;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lw6/c;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 11
    .line 12
    if-eq v1, p1, :cond_2

    .line 13
    .line 14
    :cond_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Lu6/p;->d()V

    .line 17
    .line 18
    .line 19
    :cond_1
    new-instance v0, Lu6/p;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lu6/p;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lw6/c;->a:Lu6/p;

    .line 25
    .line 26
    invoke-virtual {v0}, Lu6/p;->b()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lw6/c;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 30
    .line 31
    :cond_2
    new-instance v0, LB6/d;

    .line 32
    .line 33
    invoke-direct {v0, p1}, LB6/d;-><init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 16

    .line 1
    sget-object v0, Lq6/f;->f:Lq6/f$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lq6/f$a;->c()Lq6/f$a$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lq6/f$a$a;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v1, "onKeyboardMove"

    .line 12
    .line 13
    const-string v3, "registrationName"

    .line 14
    .line 15
    invoke-static {v3, v1}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Lq6/f$a;->d()Lq6/f$a$a;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Lq6/f$a$a;->j()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    const-string v5, "onKeyboardMoveStart"

    .line 28
    .line 29
    invoke-static {v3, v5}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    invoke-virtual {v0}, Lq6/f$a;->a()Lq6/f$a$a;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    invoke-virtual {v6}, Lq6/f$a$a;->j()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-string v7, "onKeyboardMoveEnd"

    .line 42
    .line 43
    invoke-static {v3, v7}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v0}, Lq6/f$a;->b()Lq6/f$a$a;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {v0}, Lq6/f$a$a;->j()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v8

    .line 55
    const-string v0, "onKeyboardMoveInteractive"

    .line 56
    .line 57
    invoke-static {v3, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    const-string v0, "onFocusedInputLayoutChanged"

    .line 62
    .line 63
    invoke-static {v3, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 64
    .line 65
    .line 66
    move-result-object v11

    .line 67
    const-string v0, "onFocusedInputTextChanged"

    .line 68
    .line 69
    invoke-static {v3, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 70
    .line 71
    .line 72
    move-result-object v13

    .line 73
    const-string v0, "onFocusedInputSelectionChanged"

    .line 74
    .line 75
    invoke-static {v3, v0}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 76
    .line 77
    .line 78
    move-result-object v15

    .line 79
    const-string v10, "topFocusedInputLayoutChanged"

    .line 80
    .line 81
    const-string v12, "topFocusedInputTextChanged"

    .line 82
    .line 83
    const-string v14, "topFocusedInputSelectionChanged"

    .line 84
    .line 85
    move-object v3, v1

    .line 86
    invoke-static/range {v2 .. v15}, Lcom/facebook/react/common/MapBuilder;->of(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    return-object v0
.end method

.method public final c()V
    .locals 1

    .line 1
    iget-object v0, p0, Lw6/c;->a:Lu6/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lu6/p;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lw6/c;->a:Lu6/p;

    .line 10
    .line 11
    iput-object v0, p0, Lw6/c;->b:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 12
    .line 13
    return-void
.end method

.method public final d(LB6/d;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LB6/d;->n()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final e(LB6/d;Z)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, LB6/d;->setActive(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final f(LB6/d;Z)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, LB6/d;->setNavigationBarTranslucent(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final g(LB6/d;Z)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, LB6/d;->setPreserveEdgeToEdge(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final h(LB6/d;Z)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p2}, LB6/d;->setStatusBarTranslucent(Z)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final i(LB6/d;)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LB6/d;->getCallback$react_native_keyboard_controller_release()Lu6/k;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Lu6/k;->i()Lu6/g;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-virtual {v0}, Lu6/g;->l()V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, LB6/d;->getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "KeyboardController::layoutDidSynchronize"

    .line 26
    .line 27
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-static {p1, v0, v1}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
