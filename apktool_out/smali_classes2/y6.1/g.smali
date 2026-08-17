.class public final Ly6/g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly6/g$a;
    }
.end annotation


# static fields
.field public static final e:Ly6/g$a;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:Lcom/facebook/react/bridge/UIManager;

.field private final c:Ls6/f;

.field private final d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ly6/g$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ly6/g$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ly6/g;->e:Ly6/g$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "mReactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ly6/g;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    invoke-static {p1}, Lr6/h;->d(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/bridge/UIManager;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Ly6/g;->b:Lcom/facebook/react/bridge/UIManager;

    .line 16
    .line 17
    new-instance v0, Ls6/f;

    .line 18
    .line 19
    invoke-direct {v0}, Ls6/f;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Ly6/g;->c:Ls6/f;

    .line 23
    .line 24
    invoke-static {p1}, Lr6/h;->e(Lcom/facebook/react/bridge/ReactContext;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    iput p1, p0, Ly6/g;->d:I

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic a(ZLandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly6/g;->j(ZLandroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b(Ly6/g;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly6/g;->s(Ly6/g;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ly6/g;DLcom/facebook/react/bridge/Promise;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Ly6/g;->u(Ly6/g;DLcom/facebook/react/bridge/Promise;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Ly6/g;->h(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic e()V
    .locals 0

    .line 1
    invoke-static {}, Ly6/g;->p()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic f(Landroid/view/View;ZLandroidx/core/view/K0;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Ly6/g;->i(Landroid/view/View;ZLandroidx/core/view/K0;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p1, Ly6/g;->c:Ls6/f;

    .line 10
    .line 11
    new-instance p1, Ly6/e;

    .line 12
    .line 13
    invoke-direct {p1, p2, p4}, Ly6/e;-><init>(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p2, p1}, Ls6/f;->x(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    const-string p1, "input_method"

    .line 24
    .line 25
    invoke-virtual {p3, p1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object p1, p0

    .line 31
    :goto_0
    instance-of p3, p1, Landroid/view/inputmethod/InputMethodManager;

    .line 32
    .line 33
    if-eqz p3, :cond_2

    .line 34
    .line 35
    move-object p0, p1

    .line 36
    check-cast p0, Landroid/view/inputmethod/InputMethodManager;

    .line 37
    .line 38
    :cond_2
    if-eqz p0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    const/4 p3, 0x0

    .line 45
    invoke-virtual {p0, p1, p3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 46
    .line 47
    .line 48
    :cond_3
    invoke-static {p4, p2}, Ly6/g;->k(ZLandroid/view/View;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method private static final i(Landroid/view/View;ZLandroidx/core/view/K0;)Li7/B;
    .locals 1

    .line 1
    const-string v0, "insetsController"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p2, v0}, Landroidx/core/view/K0;->a(Z)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Ly6/f;

    .line 11
    .line 12
    invoke-direct {p2, p1, p0}, Ly6/f;-><init>(ZLandroid/view/View;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    sget-object p0, Li7/B;->a:Li7/B;

    .line 19
    .line 20
    return-object p0
.end method

.method private static final j(ZLandroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ly6/g;->k(ZLandroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final k(ZLandroid/view/View;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->clearFocus()V

    .line 4
    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method private static final p()V
    .locals 1

    .line 1
    sget-object v0, LA6/a;->a:LA6/a;

    .line 2
    .line 3
    invoke-virtual {v0}, LA6/a;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final r(I)V
    .locals 1

    .line 1
    new-instance v0, Ly6/d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ly6/d;-><init>(Ly6/g;I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private static final s(Ly6/g;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Ly6/g;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-static {v0}, Lr6/h;->e(Lcom/facebook/react/bridge/ReactContext;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eq v0, p1, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Ly6/g;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method private static final u(Ly6/g;DLcom/facebook/react/bridge/Promise;)V
    .locals 3

    .line 1
    iget-object p0, p0, Ly6/g;->b:Lcom/facebook/react/bridge/UIManager;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    double-to-int p1, p1

    .line 6
    invoke-interface {p0, p1}, Lcom/facebook/react/bridge/UIManager;->resolveView(I)Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    :goto_0
    if-nez p0, :cond_1

    .line 13
    .line 14
    const-string p0, "E_VIEW_NOT_FOUND"

    .line 15
    .line 16
    const-string p1, "Could not find view for tag"

    .line 17
    .line 18
    invoke-interface {p3, p0, p1}, Lcom/facebook/react/bridge/Promise;->reject(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :cond_1
    invoke-static {p0}, Lr6/k;->b(Landroid/view/View;)[I

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 v0, 0x0

    .line 31
    aget v0, p1, v0

    .line 32
    .line 33
    int-to-float v0, v0

    .line 34
    invoke-static {v0}, Lr6/f;->a(F)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-string v2, "x"

    .line 39
    .line 40
    invoke-interface {p2, v2, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 41
    .line 42
    .line 43
    const/4 v0, 0x1

    .line 44
    aget p1, p1, v0

    .line 45
    .line 46
    int-to-float p1, p1

    .line 47
    invoke-static {p1}, Lr6/f;->a(F)D

    .line 48
    .line 49
    .line 50
    move-result-wide v0

    .line 51
    const-string p1, "y"

    .line 52
    .line 53
    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    int-to-float p1, p1

    .line 61
    invoke-static {p1}, Lr6/f;->a(F)D

    .line 62
    .line 63
    .line 64
    move-result-wide v0

    .line 65
    const-string p1, "width"

    .line 66
    .line 67
    invoke-interface {p2, p1, v0, v1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    int-to-float p0, p0

    .line 75
    invoke-static {p0}, Lr6/f;->a(F)D

    .line 76
    .line 77
    .line 78
    move-result-wide p0

    .line 79
    const-string v0, "height"

    .line 80
    .line 81
    invoke-interface {p2, v0, p0, p1}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p3, p2}, Lcom/facebook/react/bridge/Promise;->resolve(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final g(ZZ)V
    .locals 7

    .line 1
    iget-object v0, p0, Ly6/g;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    sget-object v0, LA6/a;->a:LA6/a;

    .line 8
    .line 9
    invoke-virtual {v0}, LA6/a;->b()Landroid/widget/EditText;

    .line 10
    .line 11
    .line 12
    move-result-object v4

    .line 13
    if-eqz v4, :cond_0

    .line 14
    .line 15
    new-instance v1, Ly6/a;

    .line 16
    .line 17
    move-object v3, p0

    .line 18
    move v6, p1

    .line 19
    move v2, p2

    .line 20
    invoke-direct/range {v1 .. v6}, Ly6/a;-><init>(ZLy6/g;Landroid/view/View;Landroid/app/Activity;Z)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final l()Ljava/util/Map;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "keyboardBorderRadius"

    .line 7
    .line 8
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-static {v0}, Lj7/K;->m([Lkotlin/Pair;)Ljava/util/Map;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public final m()V
    .locals 0

    .line 1
    return-void
.end method

.method public final n()V
    .locals 1

    .line 1
    iget v0, p0, Ly6/g;->d:I

    .line 2
    .line 3
    invoke-direct {p0, v0}, Ly6/g;->r(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final o(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "direction"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "current"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    new-instance p1, Ly6/c;

    .line 15
    .line 16
    invoke-direct {p1}, Ly6/c;-><init>()V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    sget-object v0, LA6/a;->a:LA6/a;

    .line 24
    .line 25
    invoke-virtual {v0}, LA6/a;->b()Landroid/widget/EditText;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v1, LA6/c;->a:LA6/c;

    .line 32
    .line 33
    invoke-virtual {v1, p1, v0}, LA6/c;->k(Ljava/lang/String;Landroid/view/View;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    return-void
.end method

.method public final q(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ly6/g;->r(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final t(DLcom/facebook/react/bridge/Promise;)V
    .locals 1

    .line 1
    const-string v0, "promise"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Ly6/b;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1, p2, p3}, Ly6/b;-><init>(Ly6/g;DLcom/facebook/react/bridge/Promise;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/facebook/react/bridge/UiThreadUtil;->runOnUiThread(Ljava/lang/Runnable;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
