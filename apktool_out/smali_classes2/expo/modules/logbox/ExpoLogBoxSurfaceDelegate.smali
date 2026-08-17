.class public final Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/common/SurfaceDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019RT\u0010\u001e\u001aB\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00080\u001b\u0012\u0014\u0012\u0012\u0012\u0008\u0012\u00060\u001cj\u0002`\u001d\u0012\u0004\u0012\u00020\u00080\u001b\u0012\u0004\u0012\u00020\u00080\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;",
        "Lcom/facebook/react/common/SurfaceDelegate;",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "devSupportManager",
        "<init>",
        "(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V",
        "",
        "appKey",
        "Li7/B;",
        "createContentView",
        "(Ljava/lang/String;)V",
        "",
        "isContentViewReady",
        "()Z",
        "destroyContentView",
        "()V",
        "show",
        "hide",
        "isShowing",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "Landroid/app/Dialog;",
        "dialog",
        "Landroid/app/Dialog;",
        "Lkotlin/Function0;",
        "onReload",
        "Lw7/a;",
        "Lkotlin/Function5;",
        "Lkotlin/Function1;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "fetchTextAsync",
        "Lw7/q;",
        "Companion",
        "expo-log-box_release"
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
.field public static final Companion:Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;


# instance fields
.field private final devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private dialog:Landroid/app/Dialog;

.field private final fetchTextAsync:Lw7/q;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/q;"
        }
    .end annotation
.end field

.field private final onReload:Lw7/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw7/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->Companion:Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

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
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 10
    .line 11
    new-instance p1, Lexpo/modules/logbox/c;

    .line 12
    .line 13
    invoke-direct {p1, p0}, Lexpo/modules/logbox/c;-><init>(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->onReload:Lw7/a;

    .line 17
    .line 18
    new-instance p1, Lexpo/modules/logbox/d;

    .line 19
    .line 20
    invoke-direct {p1}, Lexpo/modules/logbox/d;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->fetchTextAsync:Lw7/q;

    .line 24
    .line 25
    return-void
.end method

.method public static synthetic a(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->onReload$lambda$4(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->show$lambda$1$lambda$0(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->fetchTextAsync$lambda$5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final fetchTextAsync$lambda$5(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Li7/B;
    .locals 6

    .line 1
    const-string v0, "url"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "method"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "body"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onResult"

    .line 17
    .line 18
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "onFailure"

    .line 22
    .line 23
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v0, Le9/z;

    .line 27
    .line 28
    invoke-direct {v0}, Le9/z;-><init>()V

    .line 29
    .line 30
    .line 31
    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "toUpperCase(...)"

    .line 38
    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const-string v4, "GET"

    .line 43
    .line 44
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-nez v2, :cond_0

    .line 49
    .line 50
    sget-object v2, Le9/C;->Companion:Le9/C$a;

    .line 51
    .line 52
    sget-object v4, Le9/x;->g:Le9/x$a;

    .line 53
    .line 54
    const-string v5, "application/json; charset=utf-8"

    .line 55
    .line 56
    invoke-virtual {v4, v5}, Le9/x$a;->c(Ljava/lang/String;)Le9/x;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-virtual {v2, p2, v4}, Le9/C$a;->f(Ljava/lang/String;Le9/x;)Le9/C;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    const/4 p2, 0x0

    .line 66
    :goto_0
    new-instance v2, Le9/B$a;

    .line 67
    .line 68
    invoke-direct {v2}, Le9/B$a;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, p0}, Le9/B$a;->m(Ljava/lang/String;)Le9/B$a;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p1, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0, p1, p2}, Le9/B$a;->g(Ljava/lang/String;Le9/C;)Le9/B$a;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Le9/B$a;->b()Le9/B;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-virtual {v0, p0}, Le9/z;->a(Le9/B;)Le9/e;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    new-instance p1, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$fetchTextAsync$1$1;

    .line 95
    .line 96
    invoke-direct {p1, p4, p3}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$fetchTextAsync$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {p0, p1}, Le9/e;->t0(Le9/f;)V

    .line 100
    .line 101
    .line 102
    sget-object p0, Li7/B;->a:Li7/B;

    .line 103
    .line 104
    return-object p0
.end method

.method private static final onReload$lambda$4(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)Li7/B;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 4
    .line 5
    .line 6
    sget-object p0, Li7/B;->a:Li7/B;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final show$lambda$1$lambda$0(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->show()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public createContentView(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "appKey"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public destroyContentView()V
    .locals 0

    .line 1
    return-void
.end method

.method public hide()V
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public isContentViewReady()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public isShowing()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->dialog:Landroid/app/Dialog;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-ne v0, v2, :cond_0

    .line 12
    .line 13
    return v2

    .line 14
    :cond_0
    return v1
.end method

.method public show()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 4
    .line 5
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getCurrentActivity()Landroid/app/Activity;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v1, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 20
    .line 21
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getCurrentReactContext()Lcom/facebook/react/bridge/ReactContext;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    if-eqz v1, :cond_5

    .line 26
    .line 27
    sget-object v2, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->Companion:Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;

    .line 28
    .line 29
    new-instance v3, Lexpo/modules/logbox/e;

    .line 30
    .line 31
    invoke-direct {v3, v0}, Lexpo/modules/logbox/e;-><init>(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;)V

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v1, v3}, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;->access$runAfterHostResume(Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate$Companion;Lcom/facebook/react/bridge/ReactContext;Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    new-instance v2, Landroid/app/Dialog;

    .line 39
    .line 40
    const v3, 0x1030006

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v1, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 44
    .line 45
    .line 46
    iput-object v2, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->dialog:Landroid/app/Dialog;

    .line 47
    .line 48
    new-instance v2, Landroid/widget/FrameLayout;

    .line 49
    .line 50
    invoke-direct {v2, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    const/4 v3, 0x1

    .line 54
    invoke-virtual {v2, v3}, Landroid/view/View;->setFitsSystemWindows(Z)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 58
    .line 59
    invoke-interface {v4}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    iget-object v5, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 64
    .line 65
    invoke-interface {v5}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const/4 v6, 0x0

    .line 70
    const/4 v7, 0x0

    .line 71
    if-eqz v5, :cond_2

    .line 72
    .line 73
    new-instance v8, Ljava/util/ArrayList;

    .line 74
    .line 75
    array-length v9, v5

    .line 76
    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 77
    .line 78
    .line 79
    array-length v9, v5

    .line 80
    move v10, v6

    .line 81
    :goto_0
    if-ge v10, v9, :cond_3

    .line 82
    .line 83
    aget-object v11, v5, v10

    .line 84
    .line 85
    const-string v12, "file"

    .line 86
    .line 87
    invoke-interface {v11}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->getFile()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    invoke-static {v12, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 92
    .line 93
    .line 94
    move-result-object v14

    .line 95
    const-string v12, "methodName"

    .line 96
    .line 97
    invoke-interface {v11}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->getMethod()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-static {v12, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object v15

    .line 105
    const-string v12, "arguments"

    .line 106
    .line 107
    new-array v13, v6, [Ljava/lang/String;

    .line 108
    .line 109
    invoke-static {v12, v13}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    invoke-interface {v11}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->getLine()I

    .line 114
    .line 115
    .line 116
    move-result v12

    .line 117
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v12

    .line 121
    const-string v13, "lineNumber"

    .line 122
    .line 123
    invoke-static {v13, v12}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 124
    .line 125
    .line 126
    move-result-object v17

    .line 127
    invoke-interface {v11}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->getColumn()I

    .line 128
    .line 129
    .line 130
    move-result v12

    .line 131
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 132
    .line 133
    .line 134
    move-result-object v12

    .line 135
    const-string v13, "column"

    .line 136
    .line 137
    invoke-static {v13, v12}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 138
    .line 139
    .line 140
    move-result-object v18

    .line 141
    invoke-interface {v11}, Lcom/facebook/react/devsupport/interfaces/StackFrame;->isCollapsed()Z

    .line 142
    .line 143
    .line 144
    move-result v11

    .line 145
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 146
    .line 147
    .line 148
    move-result-object v11

    .line 149
    const-string v12, "collapse"

    .line 150
    .line 151
    invoke-static {v12, v11}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 152
    .line 153
    .line 154
    move-result-object v19

    .line 155
    filled-new-array/range {v14 .. v19}, [Lkotlin/Pair;

    .line 156
    .line 157
    .line 158
    move-result-object v11

    .line 159
    invoke-static {v11}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 160
    .line 161
    .line 162
    move-result-object v11

    .line 163
    invoke-interface {v8, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    add-int/lit8 v10, v10, 0x1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_2
    move-object v8, v7

    .line 170
    :cond_3
    new-instance v5, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;

    .line 171
    .line 172
    new-instance v9, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 173
    .line 174
    new-instance v10, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 175
    .line 176
    iget-object v11, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->onReload:Lw7/a;

    .line 177
    .line 178
    const/4 v12, 0x2

    .line 179
    invoke-direct {v10, v11, v7, v12, v7}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;-><init>(Lw7/a;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 180
    .line 181
    .line 182
    new-instance v11, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 183
    .line 184
    iget-object v13, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->fetchTextAsync:Lw7/q;

    .line 185
    .line 186
    invoke-direct {v11, v13, v7, v12, v7}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;-><init>(Lw7/q;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 187
    .line 188
    .line 189
    invoke-direct {v9, v10, v11}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V

    .line 190
    .line 191
    .line 192
    const-string v7, "platform"

    .line 193
    .line 194
    const-string v10, "android"

    .line 195
    .line 196
    invoke-static {v7, v10}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 197
    .line 198
    .line 199
    move-result-object v7

    .line 200
    const-string v10, "message"

    .line 201
    .line 202
    invoke-static {v10, v4}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    const-string v10, "stack"

    .line 207
    .line 208
    invoke-static {v10, v8}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    filled-new-array {v4, v8}, [Lkotlin/Pair;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    invoke-static {v4}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v4

    .line 220
    new-array v3, v3, [Ljava/util/Map;

    .line 221
    .line 222
    aput-object v4, v3, v6

    .line 223
    .line 224
    const-string v4, "nativeLogs"

    .line 225
    .line 226
    invoke-static {v4, v3}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 227
    .line 228
    .line 229
    move-result-object v3

    .line 230
    filled-new-array {v7, v3}, [Lkotlin/Pair;

    .line 231
    .line 232
    .line 233
    move-result-object v3

    .line 234
    invoke-static {v3}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    invoke-direct {v5, v9, v3, v1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;Ljava/util/Map;Landroid/app/Activity;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v5}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;->getWebView()Landroid/webkit/WebView;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-virtual {v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 246
    .line 247
    .line 248
    iget-object v1, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->dialog:Landroid/app/Dialog;

    .line 249
    .line 250
    if-eqz v1, :cond_4

    .line 251
    .line 252
    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 253
    .line 254
    .line 255
    :cond_4
    iget-object v1, v0, Lexpo/modules/logbox/ExpoLogBoxSurfaceDelegate;->dialog:Landroid/app/Dialog;

    .line 256
    .line 257
    if-eqz v1, :cond_5

    .line 258
    .line 259
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 260
    .line 261
    .line 262
    :cond_5
    :goto_1
    return-void
.end method
