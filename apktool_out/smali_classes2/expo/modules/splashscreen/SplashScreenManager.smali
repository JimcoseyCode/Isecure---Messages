.class public final Lexpo/modules/splashscreen/SplashScreenManager;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\r\u0010\r\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\r\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u0008J\r\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000f\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\"\u0010\u0013\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0012\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lexpo/modules/splashscreen/SplashScreenManager;",
        "",
        "<init>",
        "()V",
        "Lexpo/modules/splashscreen/SplashScreenOptions;",
        "options",
        "Li7/B;",
        "configureSplashScreen",
        "(Lexpo/modules/splashscreen/SplashScreenOptions;)V",
        "Landroid/app/Activity;",
        "activity",
        "registerOnActivity",
        "(Landroid/app/Activity;)V",
        "hide",
        "setSplashScreenOptions",
        "unregisterContentAppearedListener",
        "",
        "keepSplashScreenOnScreen",
        "Z",
        "preventAutoHideCalled",
        "getPreventAutoHideCalled",
        "()Z",
        "setPreventAutoHideCalled",
        "(Z)V",
        "LF0/g;",
        "splashScreen",
        "LF0/g;",
        "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;",
        "contentAppearedListener",
        "Lcom/facebook/react/bridge/ReactMarker$MarkerListener;",
        "expo-splash-screen_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lexpo/modules/splashscreen/SplashScreenManager;

.field private static final contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

.field private static keepSplashScreenOnScreen:Z

.field private static preventAutoHideCalled:Z

.field private static splashScreen:LF0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/splashscreen/SplashScreenManager;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/splashscreen/SplashScreenManager;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->INSTANCE:Lexpo/modules/splashscreen/SplashScreenManager;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    sput-boolean v0, Lexpo/modules/splashscreen/SplashScreenManager;->keepSplashScreenOnScreen:Z

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/splashscreen/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lexpo/modules/splashscreen/b;-><init>()V

    .line 14
    .line 15
    .line 16
    sput-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 17
    .line 18
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic a(LF0/s;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/splashscreen/SplashScreenManager;->configureSplashScreen$lambda$2$lambda$1(LF0/s;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getKeepSplashScreenOnScreen$p()Z
    .locals 1

    .line 1
    sget-boolean v0, Lexpo/modules/splashscreen/SplashScreenManager;->keepSplashScreenOnScreen:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic b(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/splashscreen/SplashScreenManager;->contentAppearedListener$lambda$0(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(JLF0/s;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/splashscreen/SplashScreenManager;->configureSplashScreen$lambda$2(JLF0/s;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final configureSplashScreen(Lexpo/modules/splashscreen/SplashScreenOptions;)V
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->splashScreen:LF0/g;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p1}, Lexpo/modules/splashscreen/SplashScreenOptions;->getDuration()J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sget-object p1, Lexpo/modules/splashscreen/SplashScreenManager;->splashScreen:LF0/g;

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    const-string p1, "splashScreen"

    .line 15
    .line 16
    invoke-static {p1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    :cond_1
    new-instance v2, Lexpo/modules/splashscreen/a;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Lexpo/modules/splashscreen/a;-><init>(J)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v2}, LF0/g;->c(LF0/g$e;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method static synthetic configureSplashScreen$default(Lexpo/modules/splashscreen/SplashScreenManager;Lexpo/modules/splashscreen/SplashScreenOptions;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Lexpo/modules/splashscreen/SplashScreenOptions;

    .line 6
    .line 7
    invoke-direct {p1}, Lexpo/modules/splashscreen/SplashScreenOptions;-><init>()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-direct {p0, p1}, Lexpo/modules/splashscreen/SplashScreenManager;->configureSplashScreen(Lexpo/modules/splashscreen/SplashScreenOptions;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static final configureSplashScreen$lambda$2(JLF0/s;)V
    .locals 2

    .line 1
    const-string v0, "splashScreenViewProvider"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, LF0/s;->a()Landroid/view/View;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v1, p0, p1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    new-instance p1, Landroid/view/animation/AccelerateInterpolator;

    .line 24
    .line 25
    invoke-direct {p1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    new-instance p1, Lexpo/modules/splashscreen/c;

    .line 33
    .line 34
    invoke-direct {p1, p2, v0}, Lexpo/modules/splashscreen/c;-><init>(LF0/s;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method private static final configureSplashScreen$lambda$2$lambda$1(LF0/s;Landroid/view/View;)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, LF0/s;->b()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    const-string p0, "null cannot be cast to non-null type android.window.SplashScreenView"

    .line 12
    .line 13
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, LF0/r;->a(Ljava/lang/Object;)Landroid/window/SplashScreenView;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-static {p0}, LF0/t;->a(Landroid/window/SplashScreenView;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method private static final contentAppearedListener$lambda$0(Lcom/facebook/react/bridge/ReactMarkerConstants;Ljava/lang/String;I)V
    .locals 0

    .line 1
    const-string p1, "name"

    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lcom/facebook/react/bridge/ReactMarkerConstants;->CONTENT_APPEARED:Lcom/facebook/react/bridge/ReactMarkerConstants;

    .line 7
    .line 8
    if-ne p0, p1, :cond_0

    .line 9
    .line 10
    sget-boolean p0, Lexpo/modules/splashscreen/SplashScreenManager;->preventAutoHideCalled:Z

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    sget-object p0, Lexpo/modules/splashscreen/SplashScreenManager;->INSTANCE:Lexpo/modules/splashscreen/SplashScreenManager;

    .line 15
    .line 16
    invoke-virtual {p0}, Lexpo/modules/splashscreen/SplashScreenManager;->hide()V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method


# virtual methods
.method public final getPreventAutoHideCalled()Z
    .locals 1

    .line 1
    sget-boolean v0, Lexpo/modules/splashscreen/SplashScreenManager;->preventAutoHideCalled:Z

    .line 2
    .line 3
    return v0
.end method

.method public final hide()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    sput-boolean v0, Lexpo/modules/splashscreen/SplashScreenManager;->keepSplashScreenOnScreen:Z

    .line 3
    .line 4
    return-void
.end method

.method public final registerOnActivity(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LF0/g;->b:LF0/g$a;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LF0/g$a;->a(Landroid/app/Activity;)LF0/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sput-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->splashScreen:LF0/g;

    .line 13
    .line 14
    sget-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->addListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 17
    .line 18
    .line 19
    const v0, 0x1020002

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    new-instance v1, Lexpo/modules/splashscreen/SplashScreenManager$registerOnActivity$1;

    .line 31
    .line 32
    invoke-direct {v1, p1}, Lexpo/modules/splashscreen/SplashScreenManager$registerOnActivity$1;-><init>(Landroid/view/View;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 36
    .line 37
    .line 38
    const/4 p1, 0x0

    .line 39
    const/4 v0, 0x1

    .line 40
    invoke-static {p0, p1, v0, p1}, Lexpo/modules/splashscreen/SplashScreenManager;->configureSplashScreen$default(Lexpo/modules/splashscreen/SplashScreenManager;Lexpo/modules/splashscreen/SplashScreenOptions;ILjava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-void
.end method

.method public final setPreventAutoHideCalled(Z)V
    .locals 0

    .line 1
    sput-boolean p1, Lexpo/modules/splashscreen/SplashScreenManager;->preventAutoHideCalled:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setSplashScreenOptions(Lexpo/modules/splashscreen/SplashScreenOptions;)V
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lexpo/modules/splashscreen/SplashScreenManager;->configureSplashScreen(Lexpo/modules/splashscreen/SplashScreenOptions;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final unregisterContentAppearedListener()V
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/splashscreen/SplashScreenManager;->contentAppearedListener:Lcom/facebook/react/bridge/ReactMarker$MarkerListener;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/facebook/react/bridge/ReactMarker;->removeListener(Lcom/facebook/react/bridge/ReactMarker$MarkerListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
