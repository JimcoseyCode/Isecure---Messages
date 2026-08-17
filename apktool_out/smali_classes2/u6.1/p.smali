.class public final Lu6/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu6/p$a;
    }
.end annotation


# static fields
.field public static final e:Lu6/p$a;

.field private static f:I


# instance fields
.field private final a:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private b:Lu6/a;

.field private c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

.field private d:Landroid/view/ViewGroup;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lu6/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lu6/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lu6/p;->e:Lu6/p$a;

    .line 8
    .line 9
    const/4 v0, -0x1

    .line 10
    sput v0, Lu6/p;->f:I

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu6/p;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    new-instance p1, Lu6/a;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-direct {p1, v0, v1, v0, v1}, Lu6/a;-><init>(DD)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lu6/p;->b:Lu6/a;

    .line 14
    .line 15
    return-void
.end method

.method public static synthetic a(Lu6/p;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lu6/p;->c(Lu6/p;Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final c(Lu6/p;Landroid/view/ViewGroup;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lu6/p;->e(Landroid/view/ViewGroup;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final e(Landroid/view/ViewGroup;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    new-instance v0, Lu6/a;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    int-to-float v1, v1

    .line 11
    invoke-static {v1}, Lr6/f;->a(F)D

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    int-to-float p1, p1

    .line 20
    invoke-static {p1}, Lr6/f;->a(F)D

    .line 21
    .line 22
    .line 23
    move-result-wide v3

    .line 24
    invoke-direct {v0, v1, v2, v3, v4}, Lu6/a;-><init>(DD)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lu6/p;->b:Lu6/a;

    .line 28
    .line 29
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_1

    .line 34
    .line 35
    iput-object v0, p0, Lu6/p;->b:Lu6/a;

    .line 36
    .line 37
    iget-object p1, p0, Lu6/p;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 38
    .line 39
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "height"

    .line 44
    .line 45
    invoke-virtual {v0}, Lu6/a;->a()D

    .line 46
    .line 47
    .line 48
    move-result-wide v3

    .line 49
    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 50
    .line 51
    .line 52
    const-string v2, "width"

    .line 53
    .line 54
    invoke-virtual {v0}, Lu6/a;->b()D

    .line 55
    .line 56
    .line 57
    move-result-wide v3

    .line 58
    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Li7/B;->a:Li7/B;

    .line 62
    .line 63
    const-string v0, "KeyboardController::windowDidResize"

    .line 64
    .line 65
    invoke-static {p1, v0, v1}, Lr6/i;->b(Lcom/facebook/react/uimanager/ThemedReactContext;Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/p;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget v1, Lu6/p;->f:I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eq v1, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lu6/p;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    sput v0, Lu6/p;->f:I

    .line 20
    .line 21
    iget-object v0, p0, Lu6/p;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 22
    .line 23
    invoke-static {v0}, Lr6/h;->a(Lcom/facebook/react/bridge/ReactContext;)Landroid/view/ViewGroup;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, Lu6/p;->d:Landroid/view/ViewGroup;

    .line 28
    .line 29
    invoke-direct {p0, v0}, Lu6/p;->e(Landroid/view/ViewGroup;)V

    .line 30
    .line 31
    .line 32
    new-instance v1, Lu6/o;

    .line 33
    .line 34
    invoke-direct {v1, p0, v0}, Lu6/o;-><init>(Lu6/p;Landroid/view/ViewGroup;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lu6/p;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    iget-object v1, p0, Lu6/p;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu6/p;->d:Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v1, p0, Lu6/p;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p0, Lu6/p;->d:Landroid/view/ViewGroup;

    .line 18
    .line 19
    iput-object v0, p0, Lu6/p;->c:Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;

    .line 20
    .line 21
    const/4 v0, -0x1

    .line 22
    sput v0, Lu6/p;->f:I

    .line 23
    .line 24
    return-void
.end method
