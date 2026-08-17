.class public final Lcom/swmansion/rnscreens/a0;
.super Lcom/swmansion/rnscreens/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/ReactPointerEventsView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/a0$a;,
        Lcom/swmansion/rnscreens/a0$b;
    }
.end annotation


# static fields
.field public static final J:Lcom/swmansion/rnscreens/a0$a;


# instance fields
.field private A:Z

.field private B:Z

.field private C:I

.field private D:Z

.field private final E:I

.field private final F:I

.field private final G:Landroid/view/View$OnClickListener;

.field private H:Z

.field private final I:Lcom/swmansion/rnscreens/c0;

.field private final m:Lcom/facebook/react/uimanager/ReactPointerEventsView;

.field private final n:Ljava/util/ArrayList;

.field private final o:Lcom/swmansion/rnscreens/e;

.field private p:Z

.field private q:Z

.field private r:Ljava/lang/String;

.field private s:I

.field private t:Ljava/lang/String;

.field private u:Ljava/lang/String;

.field private v:F

.field private w:I

.field private x:Ljava/lang/Integer;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/a0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/a0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/a0;->J:Lcom/swmansion/rnscreens/a0$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    new-instance v0, Lcom/swmansion/rnscreens/q;

    invoke-direct {v0}, Lcom/swmansion/rnscreens/q;-><init>()V

    invoke-direct {p0, p1, v0}, Lcom/swmansion/rnscreens/a0;-><init>(Landroid/content/Context;Lcom/facebook/react/uimanager/ReactPointerEventsView;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/uimanager/ReactPointerEventsView;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pointerEventsImpl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/f;-><init>(Landroid/content/Context;)V

    .line 2
    iput-object p2, p0, Lcom/swmansion/rnscreens/a0;->m:Lcom/facebook/react/uimanager/ReactPointerEventsView;

    .line 3
    new-instance p2, Ljava/util/ArrayList;

    const/4 v0, 0x3

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p2, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 4
    new-instance p2, Lcom/swmansion/rnscreens/Z;

    invoke-direct {p2, p0}, Lcom/swmansion/rnscreens/Z;-><init>(Lcom/swmansion/rnscreens/a0;)V

    iput-object p2, p0, Lcom/swmansion/rnscreens/a0;->G:Landroid/view/View$OnClickListener;

    .line 5
    new-instance p2, Lcom/swmansion/rnscreens/c0;

    invoke-direct {p2}, Lcom/swmansion/rnscreens/c0;-><init>()V

    iput-object p2, p0, Lcom/swmansion/rnscreens/a0;->I:Lcom/swmansion/rnscreens/c0;

    const/16 p2, 0x8

    .line 6
    invoke-virtual {p0, p2}, Landroid/view/View;->setVisibility(I)V

    .line 7
    new-instance p2, Lcom/swmansion/rnscreens/e;

    invoke-direct {p2, p1, p0}, Lcom/swmansion/rnscreens/e;-><init>(Landroid/content/Context;Lcom/swmansion/rnscreens/a0;)V

    .line 8
    iput-object p2, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 9
    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStart()I

    move-result v0

    iput v0, p0, Lcom/swmansion/rnscreens/a0;->E:I

    .line 10
    invoke-virtual {p2}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStartWithNavigation()I

    move-result v0

    iput v0, p0, Lcom/swmansion/rnscreens/a0;->F:I

    .line 11
    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 12
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p1

    const v1, 0x1010433

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 13
    iget p1, v0, Landroid/util/TypedValue;->data:I

    invoke-virtual {p2, p1}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_0
    const/4 p1, 0x0

    .line 14
    invoke-virtual {p2, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    return-void
.end method

.method public static synthetic c(Lcom/swmansion/rnscreens/a0;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/a0;->e(Lcom/swmansion/rnscreens/a0;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final e(Lcom/swmansion/rnscreens/a0;Landroid/view/View;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-eqz p1, :cond_3

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreenStack()Lcom/swmansion/rnscreens/S;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-eqz p0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/S;->getRootScreen()Lcom/swmansion/rnscreens/y;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/F;->j()Lcom/swmansion/rnscreens/y;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    instance-of p1, p0, Lcom/swmansion/rnscreens/X;

    .line 32
    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    check-cast p0, Lcom/swmansion/rnscreens/X;

    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/F;->j()Lcom/swmansion/rnscreens/y;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getNativeBackButtonDismissalEnabled()Z

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    if-eqz p1, :cond_0

    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/X;->Y()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/F;->y()V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/F;->j()Lcom/swmansion/rnscreens/y;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getNativeBackButtonDismissalEnabled()Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_2

    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/X;->Y()V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/F;->y()V

    .line 70
    .line 71
    .line 72
    :cond_3
    return-void
.end method

.method private final getScreen()Lcom/swmansion/rnscreens/y;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method private final getScreenStack()Lcom/swmansion/rnscreens/S;
    .locals 3

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getContainer()Lcom/swmansion/rnscreens/A;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    instance-of v2, v0, Lcom/swmansion/rnscreens/S;

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    check-cast v0, Lcom/swmansion/rnscreens/S;

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    return-object v1
.end method

.method private final j()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->A:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->n()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->l()V

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method


# virtual methods
.method public final d(Lcom/swmansion/rnscreens/d0;I)V
    .locals 1

    .line 1
    const-string v0, "child"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->j()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final f()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->A:Z

    .line 3
    .line 4
    return-void
.end method

.method public final g(I)Lcom/swmansion/rnscreens/d0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "get(...)"

    .line 8
    .line 9
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    check-cast p1, Lcom/swmansion/rnscreens/d0;

    .line 13
    .line 14
    return-object p1
.end method

.method public final getConfigSubviewsCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getHeaderHeightUpdateProxy()Lcom/swmansion/rnscreens/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->I:Lcom/swmansion/rnscreens/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->m:Lcom/facebook/react/uimanager/ReactPointerEventsView;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/uimanager/ReactPointerEventsView;->getPointerEvents()Lcom/facebook/react/uimanager/PointerEvents;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getPreferredContentInsetEnd()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/a0;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPreferredContentInsetStart()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/swmansion/rnscreens/a0;->E:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPreferredContentInsetStartWithNavigation()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Lcom/swmansion/rnscreens/a0;->F:I

    .line 8
    .line 9
    return v0
.end method

.method public final getScreenFragment()Lcom/swmansion/rnscreens/X;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/y;->getFragment()Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    instance-of v1, v0, Lcom/swmansion/rnscreens/X;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast v0, Lcom/swmansion/rnscreens/X;

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    return-object v0
.end method

.method public final getToolbar()Lcom/swmansion/rnscreens/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->p:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->q:Z

    .line 2
    .line 3
    return v0
.end method

.method public final k(Landroidx/appcompat/widget/Toolbar;Z)V
    .locals 4

    .line 1
    const-string v0, "toolbar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-eqz p2, :cond_1

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    add-int/2addr p2, v0

    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetStart()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-virtual {p1}, Landroid/view/View;->getPaddingStart()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    :goto_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    move-object v2, v1

    .line 54
    check-cast v2, Lcom/swmansion/rnscreens/d0;

    .line 55
    .line 56
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/d0;->getType()Lcom/swmansion/rnscreens/d0$a;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    sget-object v3, Lcom/swmansion/rnscreens/d0$a;->g:Lcom/swmansion/rnscreens/d0$a;

    .line 61
    .line 62
    if-ne v2, v3, :cond_2

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_3
    const/4 v1, 0x0

    .line 66
    :goto_1
    check-cast v1, Lcom/swmansion/rnscreens/d0;

    .line 67
    .line 68
    if-eqz v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    :cond_4
    invoke-virtual {p1}, Landroidx/appcompat/widget/Toolbar;->getCurrentContentInsetEnd()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getPaddingEnd()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    add-int/2addr v0, v1

    .line 83
    iget-object v1, p0, Lcom/swmansion/rnscreens/a0;->I:Lcom/swmansion/rnscreens/c0;

    .line 84
    .line 85
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    invoke-virtual {v1, p0, v2}, Lcom/swmansion/rnscreens/c0;->a(Lcom/swmansion/rnscreens/a0;Lcom/swmansion/rnscreens/y;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    invoke-virtual {p0, v1, p1, p2, v0}, Lcom/swmansion/rnscreens/f;->a(IIII)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public final l()V
    .locals 11

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreenStack()Lcom/swmansion/rnscreens/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/S;->getTopScreen()Lcom/swmansion/rnscreens/y;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v1

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v0, v2

    .line 27
    :goto_1
    iget-boolean v3, p0, Lcom/swmansion/rnscreens/a0;->D:Z

    .line 28
    .line 29
    if-eqz v3, :cond_22

    .line 30
    .line 31
    if-eqz v0, :cond_22

    .line 32
    .line 33
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->A:Z

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    goto/16 :goto_b

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/q;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    goto :goto_2

    .line 51
    :cond_3
    move-object v0, v3

    .line 52
    :goto_2
    check-cast v0, Landroidx/appcompat/app/d;

    .line 53
    .line 54
    if-nez v0, :cond_4

    .line 55
    .line 56
    goto/16 :goto_b

    .line 57
    .line 58
    :cond_4
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->u:Ljava/lang/String;

    .line 59
    .line 60
    if-eqz v4, :cond_6

    .line 61
    .line 62
    const-string v5, "rtl"

    .line 63
    .line 64
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    if-eqz v4, :cond_5

    .line 69
    .line 70
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 71
    .line 72
    invoke-virtual {v4, v2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 73
    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_5
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->u:Ljava/lang/String;

    .line 77
    .line 78
    const-string v5, "ltr"

    .line 79
    .line 80
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-eqz v4, :cond_6

    .line 85
    .line 86
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 87
    .line 88
    invoke-virtual {v4, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 89
    .line 90
    .line 91
    :cond_6
    :goto_3
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    if-eqz v4, :cond_9

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    instance-of v5, v5, Lcom/facebook/react/bridge/ReactContext;

    .line 102
    .line 103
    if-eqz v5, :cond_7

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    const-string v6, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 110
    .line 111
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    check-cast v5, Lcom/facebook/react/bridge/ReactContext;

    .line 115
    .line 116
    goto :goto_4

    .line 117
    :cond_7
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/y;->getFragmentWrapper()Lcom/swmansion/rnscreens/G;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    if-eqz v5, :cond_8

    .line 122
    .line 123
    invoke-interface {v5}, Lcom/swmansion/rnscreens/G;->i()Lcom/facebook/react/bridge/ReactContext;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    goto :goto_4

    .line 128
    :cond_8
    move-object v5, v3

    .line 129
    :goto_4
    sget-object v6, Lcom/swmansion/rnscreens/g0;->a:Lcom/swmansion/rnscreens/g0;

    .line 130
    .line 131
    invoke-virtual {v6, v4, v0, v5}, Lcom/swmansion/rnscreens/g0;->p(Lcom/swmansion/rnscreens/y;Landroid/app/Activity;Lcom/facebook/react/bridge/ReactContext;)V

    .line 132
    .line 133
    .line 134
    :cond_9
    iget-boolean v4, p0, Lcom/swmansion/rnscreens/a0;->p:Z

    .line 135
    .line 136
    if-eqz v4, :cond_b

    .line 137
    .line 138
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 139
    .line 140
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_a

    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    if-eqz v0, :cond_a

    .line 151
    .line 152
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/X;->h0()V

    .line 153
    .line 154
    .line 155
    :cond_a
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->I:Lcom/swmansion/rnscreens/c0;

    .line 156
    .line 157
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {v0, p0, v1}, Lcom/swmansion/rnscreens/c0;->a(Lcom/swmansion/rnscreens/a0;Lcom/swmansion/rnscreens/y;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_b
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 166
    .line 167
    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-nez v4, :cond_c

    .line 172
    .line 173
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    if-eqz v4, :cond_c

    .line 178
    .line 179
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 180
    .line 181
    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/X;->o0(Landroidx/appcompat/widget/Toolbar;)V

    .line 182
    .line 183
    .line 184
    :cond_c
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 185
    .line 186
    invoke-virtual {v0, v4}, Landroidx/appcompat/app/d;->setSupportActionBar(Landroidx/appcompat/widget/Toolbar;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Landroidx/appcompat/app/d;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    if-eqz v0, :cond_21

    .line 194
    .line 195
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    if-eqz v4, :cond_d

    .line 200
    .line 201
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/X;->U()Z

    .line 202
    .line 203
    .line 204
    move-result v4

    .line 205
    if-ne v4, v2, :cond_d

    .line 206
    .line 207
    iget-boolean v4, p0, Lcom/swmansion/rnscreens/a0;->y:Z

    .line 208
    .line 209
    if-nez v4, :cond_d

    .line 210
    .line 211
    move v4, v2

    .line 212
    goto :goto_5

    .line 213
    :cond_d
    move v4, v1

    .line 214
    :goto_5
    invoke-virtual {v0, v4}, Landroidx/appcompat/app/a;->s(Z)V

    .line 215
    .line 216
    .line 217
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->r:Ljava/lang/String;

    .line 218
    .line 219
    invoke-virtual {v0, v4}, Landroidx/appcompat/app/a;->w(Ljava/lang/CharSequence;)V

    .line 220
    .line 221
    .line 222
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->r:Ljava/lang/String;

    .line 223
    .line 224
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-eqz v4, :cond_e

    .line 229
    .line 230
    iput-boolean v2, p0, Lcom/swmansion/rnscreens/a0;->H:Z

    .line 231
    .line 232
    :cond_e
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 233
    .line 234
    invoke-virtual {v4}, Lcom/swmansion/rnscreens/e;->V()V

    .line 235
    .line 236
    .line 237
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 238
    .line 239
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->G:Landroid/view/View$OnClickListener;

    .line 240
    .line 241
    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/Toolbar;->setNavigationOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 245
    .line 246
    .line 247
    move-result-object v4

    .line 248
    if-eqz v4, :cond_f

    .line 249
    .line 250
    iget-boolean v5, p0, Lcom/swmansion/rnscreens/a0;->z:Z

    .line 251
    .line 252
    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/X;->p0(Z)V

    .line 253
    .line 254
    .line 255
    :cond_f
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->getScreenFragment()Lcom/swmansion/rnscreens/X;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    if-eqz v4, :cond_10

    .line 260
    .line 261
    iget-boolean v5, p0, Lcom/swmansion/rnscreens/a0;->q:Z

    .line 262
    .line 263
    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/X;->q0(Z)V

    .line 264
    .line 265
    .line 266
    :cond_10
    sget-object v4, Lcom/swmansion/rnscreens/a0;->J:Lcom/swmansion/rnscreens/a0$a;

    .line 267
    .line 268
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 269
    .line 270
    invoke-virtual {v4, v5}, Lcom/swmansion/rnscreens/a0$a;->a(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/TextView;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    iget v5, p0, Lcom/swmansion/rnscreens/a0;->s:I

    .line 275
    .line 276
    if-eqz v5, :cond_11

    .line 277
    .line 278
    iget-object v6, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 279
    .line 280
    invoke-virtual {v6, v5}, Landroidx/appcompat/widget/Toolbar;->setTitleTextColor(I)V

    .line 281
    .line 282
    .line 283
    :cond_11
    if-eqz v4, :cond_14

    .line 284
    .line 285
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->t:Ljava/lang/String;

    .line 286
    .line 287
    if-nez v5, :cond_12

    .line 288
    .line 289
    iget v6, p0, Lcom/swmansion/rnscreens/a0;->w:I

    .line 290
    .line 291
    if-lez v6, :cond_13

    .line 292
    .line 293
    :cond_12
    iget v6, p0, Lcom/swmansion/rnscreens/a0;->w:I

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 296
    .line 297
    .line 298
    move-result-object v7

    .line 299
    invoke-virtual {v7}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 300
    .line 301
    .line 302
    move-result-object v7

    .line 303
    const-string v8, "getAssets(...)"

    .line 304
    .line 305
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    invoke-static {v3, v1, v6, v5, v7}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->applyStyles(Landroid/graphics/Typeface;IILjava/lang/String;Landroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 309
    .line 310
    .line 311
    move-result-object v5

    .line 312
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 313
    .line 314
    .line 315
    :cond_13
    iget v5, p0, Lcom/swmansion/rnscreens/a0;->v:F

    .line 316
    .line 317
    const/4 v6, 0x0

    .line 318
    cmpl-float v6, v5, v6

    .line 319
    .line 320
    if-lez v6, :cond_14

    .line 321
    .line 322
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    .line 323
    .line 324
    .line 325
    :cond_14
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->x:Ljava/lang/Integer;

    .line 326
    .line 327
    if-eqz v4, :cond_15

    .line 328
    .line 329
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 330
    .line 331
    .line 332
    move-result v4

    .line 333
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 334
    .line 335
    invoke-virtual {v5, v4}, Landroid/view/View;->setBackgroundColor(I)V

    .line 336
    .line 337
    .line 338
    :cond_15
    iget v4, p0, Lcom/swmansion/rnscreens/a0;->C:I

    .line 339
    .line 340
    if-eqz v4, :cond_16

    .line 341
    .line 342
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 343
    .line 344
    invoke-virtual {v4}, Landroidx/appcompat/widget/Toolbar;->getNavigationIcon()Landroid/graphics/drawable/Drawable;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    if-eqz v4, :cond_16

    .line 349
    .line 350
    new-instance v5, Landroid/graphics/PorterDuffColorFilter;

    .line 351
    .line 352
    iget v6, p0, Lcom/swmansion/rnscreens/a0;->C:I

    .line 353
    .line 354
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_ATOP:Landroid/graphics/PorterDuff$Mode;

    .line 355
    .line 356
    invoke-direct {v5, v6, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v5}, Landroid/graphics/drawable/Drawable;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 360
    .line 361
    .line 362
    :cond_16
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 363
    .line 364
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    sub-int/2addr v4, v2

    .line 369
    :goto_6
    const/4 v5, -0x1

    .line 370
    if-ge v5, v4, :cond_18

    .line 371
    .line 372
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 373
    .line 374
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 375
    .line 376
    .line 377
    move-result-object v5

    .line 378
    instance-of v5, v5, Lcom/swmansion/rnscreens/d0;

    .line 379
    .line 380
    if-eqz v5, :cond_17

    .line 381
    .line 382
    iget-object v5, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 383
    .line 384
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 385
    .line 386
    .line 387
    :cond_17
    add-int/lit8 v4, v4, -0x1

    .line 388
    .line 389
    goto :goto_6

    .line 390
    :cond_18
    iget-object v4, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 391
    .line 392
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 393
    .line 394
    .line 395
    move-result v4

    .line 396
    move v6, v1

    .line 397
    :goto_7
    if-ge v6, v4, :cond_20

    .line 398
    .line 399
    iget-object v7, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 400
    .line 401
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v7

    .line 405
    const-string v8, "get(...)"

    .line 406
    .line 407
    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 408
    .line 409
    .line 410
    check-cast v7, Lcom/swmansion/rnscreens/d0;

    .line 411
    .line 412
    invoke-virtual {v7}, Lcom/swmansion/rnscreens/d0;->getType()Lcom/swmansion/rnscreens/d0$a;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    sget-object v9, Lcom/swmansion/rnscreens/d0$a;->j:Lcom/swmansion/rnscreens/d0$a;

    .line 417
    .line 418
    if-ne v8, v9, :cond_1b

    .line 419
    .line 420
    invoke-virtual {v7, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v7

    .line 424
    instance-of v8, v7, Landroid/widget/ImageView;

    .line 425
    .line 426
    if-eqz v8, :cond_19

    .line 427
    .line 428
    check-cast v7, Landroid/widget/ImageView;

    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_19
    move-object v7, v3

    .line 432
    :goto_8
    if-eqz v7, :cond_1a

    .line 433
    .line 434
    invoke-virtual {v7}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 435
    .line 436
    .line 437
    move-result-object v7

    .line 438
    invoke-virtual {v0, v7}, Landroidx/appcompat/app/a;->u(Landroid/graphics/drawable/Drawable;)V

    .line 439
    .line 440
    .line 441
    :goto_9
    add-int/lit8 v6, v6, 0x1

    .line 442
    .line 443
    goto :goto_7

    .line 444
    :cond_1a
    new-instance v0, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;

    .line 445
    .line 446
    const-string v1, "Back button header config view should have Image as first child"

    .line 447
    .line 448
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/JSApplicationIllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v0

    .line 452
    :cond_1b
    new-instance v9, Landroidx/appcompat/widget/Toolbar$g;

    .line 453
    .line 454
    const/4 v10, -0x2

    .line 455
    invoke-direct {v9, v10, v5}, Landroidx/appcompat/widget/Toolbar$g;-><init>(II)V

    .line 456
    .line 457
    .line 458
    sget-object v10, Lcom/swmansion/rnscreens/a0$b;->a:[I

    .line 459
    .line 460
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    aget v8, v10, v8

    .line 465
    .line 466
    if-eq v8, v2, :cond_1e

    .line 467
    .line 468
    const/4 v10, 0x2

    .line 469
    if-eq v8, v10, :cond_1d

    .line 470
    .line 471
    const/4 v10, 0x3

    .line 472
    if-eq v8, v10, :cond_1c

    .line 473
    .line 474
    goto :goto_a

    .line 475
    :cond_1c
    iput v5, v9, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 476
    .line 477
    iput v2, v9, Landroidx/appcompat/app/a$a;->a:I

    .line 478
    .line 479
    iget-object v8, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 480
    .line 481
    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 482
    .line 483
    .line 484
    goto :goto_a

    .line 485
    :cond_1d
    const v8, 0x800005

    .line 486
    .line 487
    .line 488
    iput v8, v9, Landroidx/appcompat/app/a$a;->a:I

    .line 489
    .line 490
    goto :goto_a

    .line 491
    :cond_1e
    iget-boolean v8, p0, Lcom/swmansion/rnscreens/a0;->B:Z

    .line 492
    .line 493
    if-nez v8, :cond_1f

    .line 494
    .line 495
    iget-object v8, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 496
    .line 497
    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setNavigationIcon(Landroid/graphics/drawable/Drawable;)V

    .line 498
    .line 499
    .line 500
    :cond_1f
    iget-object v8, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 501
    .line 502
    invoke-virtual {v8, v3}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 503
    .line 504
    .line 505
    const v8, 0x800003

    .line 506
    .line 507
    .line 508
    iput v8, v9, Landroidx/appcompat/app/a$a;->a:I

    .line 509
    .line 510
    :goto_a
    invoke-virtual {v7, v9}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 511
    .line 512
    .line 513
    iget-object v8, p0, Lcom/swmansion/rnscreens/a0;->o:Lcom/swmansion/rnscreens/e;

    .line 514
    .line 515
    invoke-virtual {v8, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 516
    .line 517
    .line 518
    goto :goto_9

    .line 519
    :cond_20
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->I:Lcom/swmansion/rnscreens/c0;

    .line 520
    .line 521
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->getScreen()Lcom/swmansion/rnscreens/y;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    invoke-virtual {v0, p0, v1}, Lcom/swmansion/rnscreens/c0;->a(Lcom/swmansion/rnscreens/a0;Lcom/swmansion/rnscreens/y;)V

    .line 526
    .line 527
    .line 528
    return-void

    .line 529
    :cond_21
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 530
    .line 531
    const-string v1, "Required value was null."

    .line 532
    .line 533
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 534
    .line 535
    .line 536
    throw v0

    .line 537
    :cond_22
    :goto_b
    return-void
.end method

.method public final m()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->j()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/a0;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/swmansion/rnscreens/a0;->j()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->D:Z

    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v2, LM6/a;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-direct {v2, v0, v3}, LM6/a;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/a0;->l()V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 4

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/a0;->D:Z

    .line 6
    .line 7
    invoke-static {p0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    new-instance v2, LM6/c;

    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-direct {v2, v0, v3}, LM6/c;-><init>(II)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setBackButtonInCustomView(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->B:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setBackgroundColor(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/a0;->x:Ljava/lang/Integer;

    .line 2
    .line 3
    return-void
.end method

.method public final setDirection(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/a0;->u:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaderHidden(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHeaderTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->q:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHidden(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->p:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideBackButton(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->y:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setHideShadow(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->z:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTintColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/a0;->C:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/a0;->r:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitleColor(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/a0;->s:I

    .line 2
    .line 3
    return-void
.end method

.method public final setTitleEmpty(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->H:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTitleFontFamily(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/rnscreens/a0;->t:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method

.method public final setTitleFontSize(F)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/swmansion/rnscreens/a0;->v:F

    .line 2
    .line 3
    return-void
.end method

.method public final setTitleFontWeight(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/facebook/react/views/text/ReactTypefaceUtils;->parseFontWeight(Ljava/lang/String;)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iput p1, p0, Lcom/swmansion/rnscreens/a0;->w:I

    .line 6
    .line 7
    return-void
.end method

.method public final setTranslucent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/a0;->q:Z

    .line 2
    .line 3
    return-void
.end method
