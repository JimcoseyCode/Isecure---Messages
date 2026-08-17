.class public final Lcom/swmansion/rnscreens/S;
.super Lcom/swmansion/rnscreens/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/S$a;,
        Lcom/swmansion/rnscreens/S$b;,
        Lcom/swmansion/rnscreens/S$c;
    }
.end annotation


# static fields
.field public static final x:Lcom/swmansion/rnscreens/S$a;


# instance fields
.field private final n:Ljava/util/ArrayList;

.field private final o:Ljava/util/Set;

.field private p:Ljava/util/List;

.field private final q:Ljava/util/List;

.field private r:Ljava/util/List;

.field private s:Lcom/swmansion/rnscreens/Y;

.field private t:Z

.field private u:LW6/a;

.field private v:Ljava/util/List;

.field private w:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/S$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/S$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/S;->x:Lcom/swmansion/rnscreens/S$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/A;-><init>(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/HashSet;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 17
    .line 18
    new-instance p1, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->p:Ljava/util/List;

    .line 24
    .line 25
    new-instance p1, Ljava/util/ArrayList;

    .line 26
    .line 27
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->q:Ljava/util/List;

    .line 31
    .line 32
    new-instance p1, Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->r:Ljava/util/List;

    .line 38
    .line 39
    new-instance p1, Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/swmansion/rnscreens/S;->v:Ljava/util/List;

    .line 45
    .line 46
    return-void
.end method

.method public static synthetic B(Lcom/swmansion/rnscreens/G;)Lcom/swmansion/rnscreens/Y;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/S;->W(Lcom/swmansion/rnscreens/G;)Lcom/swmansion/rnscreens/Y;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic C(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/Y;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/S;->a0(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/Y;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic D(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/S;->Y(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic E(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/S;->T(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic F(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/Y;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/S;->R(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/Y;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic G(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/S;->S(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic H(Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/S;->Z(Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic I(Lcom/swmansion/rnscreens/G;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/S;->V(Lcom/swmansion/rnscreens/G;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic J(Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/S;->X(Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic K(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/S;->U(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic L(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/S$b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/S;->c0(Lcom/swmansion/rnscreens/S$b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final O()V
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 10
    .line 11
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v1, v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    new-instance v2, LM6/t;

    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    invoke-direct {v2, v0, v3}, LM6/t;-><init>(II)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method private final P()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->r:Ljava/util/List;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object v1, p0, Lcom/swmansion/rnscreens/S;->r:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lcom/swmansion/rnscreens/S$b;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/S$b;->a()V

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, Lcom/swmansion/rnscreens/S;->q:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    return-void
.end method

.method private final Q()Lcom/swmansion/rnscreens/S$b;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->q:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/swmansion/rnscreens/S$b;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/S$b;-><init>(Lcom/swmansion/rnscreens/S;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->q:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v0}, Lj7/q;->l(Ljava/util/List;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Lcom/swmansion/rnscreens/S$b;

    .line 26
    .line 27
    return-object v0
.end method

.method private static final R(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/Y;)Z
    .locals 1

    .line 1
    const-string v0, "wrapper"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object p0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0

    .line 25
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 26
    return p0
.end method

.method private static final S(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 7
    .line 8
    if-eq p1, p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private static final T(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 7
    .line 8
    if-eq p2, p0, :cond_0

    .line 9
    .line 10
    iget-object p0, p1, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 11
    .line 12
    invoke-static {p0, p2}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-interface {p2}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getActivityState()Lcom/swmansion/rnscreens/y$a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    sget-object p1, Lcom/swmansion/rnscreens/y$a;->g:Lcom/swmansion/rnscreens/y$a;

    .line 27
    .line 28
    if-ne p0, p1, :cond_2

    .line 29
    .line 30
    :cond_1
    const/4 p0, 0x1

    .line 31
    return p0

    .line 32
    :cond_2
    const/4 p0, 0x0

    .line 33
    return p0
.end method

.method private static final U(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 7
    .line 8
    if-eq p1, p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method private static final V(Lcom/swmansion/rnscreens/G;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/view/View;->bringToFront()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private static final W(Lcom/swmansion/rnscreens/G;)Lcom/swmansion/rnscreens/Y;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    check-cast p0, Lcom/swmansion/rnscreens/Y;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final X(Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getActivityState()Lcom/swmansion/rnscreens/y$a;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, Lcom/swmansion/rnscreens/y$a;->g:Lcom/swmansion/rnscreens/y$a;

    .line 15
    .line 16
    if-ne p0, v0, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method private static final Y(Lcom/swmansion/rnscreens/S;Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 7
    .line 8
    invoke-static {p0, p1}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/y;->getActivityState()Lcom/swmansion/rnscreens/y$a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lcom/swmansion/rnscreens/y$a;->g:Lcom/swmansion/rnscreens/y$a;

    .line 23
    .line 24
    if-eq p0, p1, :cond_0

    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method private static final Z(Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p0}, Lcom/swmansion/rnscreens/G;->b()Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0
.end method

.method private static final a0(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/Y;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 7
    .line 8
    if-eq p1, p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lcom/swmansion/rnscreens/G;->b()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0
.end method

.method private final c0(Lcom/swmansion/rnscreens/S$b;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/S$b;->b()Landroid/graphics/Canvas;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/S$b;->c()Landroid/view/View;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/S$b;->d()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    invoke-super {p0, v0, v1, v2, v3}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final e0(Lcom/swmansion/rnscreens/G;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    if-le v0, v2, :cond_1

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Lcom/swmansion/rnscreens/G;->b()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    sub-int/2addr v3, v2

    .line 30
    invoke-static {v1, v3}, LB7/d;->p(II)LB7/c;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v0, v2}, Lj7/q;->F0(Ljava/util/List;LB7/c;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v0}, Lj7/q;->N(Ljava/util/List;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    if-eqz v2, :cond_1

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Lcom/swmansion/rnscreens/G;

    .line 57
    .line 58
    invoke-interface {v2}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    const/4 v4, 0x4

    .line 63
    invoke-virtual {v3, v4}, Lcom/swmansion/rnscreens/y;->h(I)V

    .line 64
    .line 65
    .line 66
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    :cond_1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/S;->getTopScreen()Lcom/swmansion/rnscreens/y;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    if-eqz p1, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1, v1}, Lcom/swmansion/rnscreens/y;->h(I)V

    .line 79
    .line 80
    .line 81
    :cond_2
    return-void
.end method


# virtual methods
.method protected M(Lcom/swmansion/rnscreens/y;)Lcom/swmansion/rnscreens/Y;
    .locals 2

    .line 1
    const-string v0, "screen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/y;->getStackPresentation()Lcom/swmansion/rnscreens/y$e;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sget-object v1, Lcom/swmansion/rnscreens/S$c;->a:[I

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    aget v0, v1, v0

    .line 17
    .line 18
    const/4 v1, 0x1

    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    new-instance v0, Lcom/swmansion/rnscreens/X;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/X;-><init>(Lcom/swmansion/rnscreens/y;)V

    .line 24
    .line 25
    .line 26
    return-object v0

    .line 27
    :cond_0
    new-instance v0, Lcom/swmansion/rnscreens/X;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/X;-><init>(Lcom/swmansion/rnscreens/y;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public final N(Lcom/swmansion/rnscreens/Y;)V
    .locals 1

    .line 1
    const-string v0, "screenFragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/A;->w()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final b0()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/S;->t:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/swmansion/rnscreens/S;->O()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public bridge synthetic c(Lcom/swmansion/rnscreens/y;)Lcom/swmansion/rnscreens/G;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/S;->M(Lcom/swmansion/rnscreens/y;)Lcom/swmansion/rnscreens/Y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final d0()Z
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    const/4 v4, -0x1

    .line 14
    if-eqz v3, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, Lcom/swmansion/rnscreens/G;

    .line 21
    .line 22
    invoke-interface {v3}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Lcom/swmansion/rnscreens/y;->getActivityState()Lcom/swmansion/rnscreens/y$a;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    sget-object v5, Lcom/swmansion/rnscreens/y$a;->g:Lcom/swmansion/rnscreens/y$a;

    .line 31
    .line 32
    if-eq v3, v5, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    move v2, v4

    .line 39
    :goto_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-interface {v0, v3}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    check-cast v3, Lcom/swmansion/rnscreens/G;

    .line 60
    .line 61
    invoke-interface {v3}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-virtual {v3}, Lcom/swmansion/rnscreens/y;->getActivityState()Lcom/swmansion/rnscreens/y$a;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    sget-object v5, Lcom/swmansion/rnscreens/y$a;->g:Lcom/swmansion/rnscreens/y$a;

    .line 70
    .line 71
    if-eq v3, v5, :cond_2

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    :cond_3
    if-ltz v2, :cond_5

    .line 78
    .line 79
    if-le v4, v2, :cond_5

    .line 80
    .line 81
    const/4 v0, 0x1

    .line 82
    add-int/2addr v2, v0

    .line 83
    if-gt v2, v4, :cond_4

    .line 84
    .line 85
    :goto_2
    iget-object v1, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 86
    .line 87
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, Lcom/swmansion/rnscreens/G;

    .line 92
    .line 93
    invoke-interface {v1}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {p0, v1}, Lcom/swmansion/rnscreens/A;->p(Lcom/swmansion/rnscreens/y;)V

    .line 98
    .line 99
    .line 100
    if-eq v2, v4, :cond_4

    .line 101
    .line 102
    add-int/lit8 v2, v2, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_4
    return v0

    .line 106
    :cond_5
    return v1
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/View;->dispatchDraw(Landroid/graphics/Canvas;)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->r:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p1, v0}, LW6/a;->a(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-direct {p0}, Lcom/swmansion/rnscreens/S;->P()V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 2

    .line 1
    const-string v0, "canvas"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "child"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->r:Ljava/util/List;

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/swmansion/rnscreens/S;->Q()Lcom/swmansion/rnscreens/S$b;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1, p1}, Lcom/swmansion/rnscreens/S$b;->e(Landroid/graphics/Canvas;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p2}, Lcom/swmansion/rnscreens/S$b;->f(Landroid/view/View;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p3, p4}, Lcom/swmansion/rnscreens/S$b;->g(J)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x1

    .line 30
    return p1
.end method

.method public endViewTransition(Landroid/view/View;)V
    .locals 1

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->v:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lcom/swmansion/rnscreens/S;->v:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    iget-object p1, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    invoke-interface {p1}, LW6/a;->disable()V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-boolean p1, p0, Lcom/swmansion/rnscreens/S;->t:Z

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    const/4 p1, 0x0

    .line 34
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/S;->t:Z

    .line 35
    .line 36
    invoke-direct {p0}, Lcom/swmansion/rnscreens/S;->O()V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public final getFragments()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Lcom/swmansion/rnscreens/Y;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGoingForward()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/S;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRootScreen()Lcom/swmansion/rnscreens/y;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/swmansion/rnscreens/G;

    .line 19
    .line 20
    iget-object v3, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 21
    .line 22
    invoke-static {v3, v2}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x0

    .line 30
    :goto_0
    check-cast v1, Lcom/swmansion/rnscreens/G;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v1}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    return-object v0

    .line 41
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 42
    .line 43
    const-string v1, "[RNScreens] Stack has no root screen set"

    .line 44
    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method

.method public final getScreenIds()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/swmansion/rnscreens/G;

    .line 29
    .line 30
    invoke-interface {v2}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/y;->getScreenId()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    return-object v1
.end method

.method public getTopScreen()Lcom/swmansion/rnscreens/y;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public n(Lcom/swmansion/rnscreens/G;)Z
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/swmansion/rnscreens/A;->n(Lcom/swmansion/rnscreens/G;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method protected o()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/swmansion/rnscreens/Y;

    .line 18
    .line 19
    invoke-interface {v1}, Lcom/swmansion/rnscreens/G;->n()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-void
.end method

.method public final setGoingForward(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/S;->w:Z

    .line 2
    .line 3
    return-void
.end method

.method public startViewTransition(Landroid/view/View;)V
    .locals 2

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, LW6/e;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    move-object v0, p1

    .line 14
    check-cast v0, LW6/e;

    .line 15
    .line 16
    invoke-virtual {v0}, LW6/e;->getFragment$react_native_screens_release()Lcom/swmansion/rnscreens/X;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->isRemoving()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->v:Ljava/util/List;

    .line 27
    .line 28
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/S;->v:Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    iget-object p1, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    invoke-interface {p1}, LW6/a;->enable()V

    .line 44
    .line 45
    .line 46
    :cond_1
    const/4 p1, 0x1

    .line 47
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/S;->t:Z

    .line 48
    .line 49
    return-void

    .line 50
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v1, "[RNScreens] Unexpected type of ScreenStack direct subview "

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    throw v0
.end method

.method public u()V
    .locals 10

    .line 1
    new-instance v0, Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/C;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lkotlin/jvm/internal/C;

    .line 7
    .line 8
    invoke-direct {v1}, Lkotlin/jvm/internal/C;-><init>()V

    .line 9
    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    iput-object v2, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 13
    .line 14
    iget-object v3, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-static {v3}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    invoke-static {v3}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    new-instance v4, Lcom/swmansion/rnscreens/H;

    .line 25
    .line 26
    invoke-direct {v4, p0}, Lcom/swmansion/rnscreens/H;-><init>(Lcom/swmansion/rnscreens/S;)V

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v4}, LO8/l;->y(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, LO8/l;->C(LO8/i;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iput-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 38
    .line 39
    new-instance v4, Lcom/swmansion/rnscreens/I;

    .line 40
    .line 41
    invoke-direct {v4}, Lcom/swmansion/rnscreens/I;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v3, v4}, LO8/l;->x(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3}, LO8/l;->C(LO8/i;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/swmansion/rnscreens/G;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 57
    .line 58
    if-ne v3, v4, :cond_1

    .line 59
    .line 60
    :cond_0
    move-object v3, v2

    .line 61
    :cond_1
    iput-object v3, v1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 62
    .line 63
    iget-object v3, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 64
    .line 65
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v3, v4}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v4, 0x0

    .line 72
    const/4 v5, 0x1

    .line 73
    if-eqz v3, :cond_2

    .line 74
    .line 75
    iget-object v3, p0, Lcom/swmansion/rnscreens/S;->p:Ljava/util/List;

    .line 76
    .line 77
    iget-object v6, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 78
    .line 79
    invoke-static {v3, v6}, Lj7/q;->X(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    if-nez v3, :cond_2

    .line 84
    .line 85
    move v3, v5

    .line 86
    goto :goto_0

    .line 87
    :cond_2
    move v3, v4

    .line 88
    :goto_0
    iget-object v6, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v7, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 91
    .line 92
    if-eq v6, v7, :cond_3

    .line 93
    .line 94
    move v8, v5

    .line 95
    goto :goto_1

    .line 96
    :cond_3
    move v8, v4

    .line 97
    :goto_1
    if-eqz v6, :cond_b

    .line 98
    .line 99
    if-nez v3, :cond_b

    .line 100
    .line 101
    if-eqz v7, :cond_a

    .line 102
    .line 103
    if-eqz v7, :cond_4

    .line 104
    .line 105
    iget-object v6, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 106
    .line 107
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v6

    .line 111
    if-ne v6, v5, :cond_4

    .line 112
    .line 113
    move v6, v5

    .line 114
    goto :goto_2

    .line 115
    :cond_4
    move v6, v4

    .line 116
    :goto_2
    iget-object v7, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v7, Lcom/swmansion/rnscreens/G;

    .line 119
    .line 120
    invoke-interface {v7}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    invoke-virtual {v7}, Lcom/swmansion/rnscreens/y;->getReplaceAnimation()Lcom/swmansion/rnscreens/y$c;

    .line 125
    .line 126
    .line 127
    move-result-object v7

    .line 128
    sget-object v8, Lcom/swmansion/rnscreens/y$c;->g:Lcom/swmansion/rnscreens/y$c;

    .line 129
    .line 130
    if-ne v7, v8, :cond_5

    .line 131
    .line 132
    move v7, v5

    .line 133
    goto :goto_3

    .line 134
    :cond_5
    move v7, v4

    .line 135
    :goto_3
    if-nez v6, :cond_7

    .line 136
    .line 137
    if-eqz v7, :cond_6

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_6
    move v6, v4

    .line 141
    goto :goto_5

    .line 142
    :cond_7
    :goto_4
    move v6, v5

    .line 143
    :goto_5
    if-eqz v6, :cond_8

    .line 144
    .line 145
    iget-object v7, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v7, Lcom/swmansion/rnscreens/G;

    .line 148
    .line 149
    invoke-interface {v7}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 150
    .line 151
    .line 152
    move-result-object v7

    .line 153
    :goto_6
    invoke-virtual {v7}, Lcom/swmansion/rnscreens/y;->getStackAnimation()Lcom/swmansion/rnscreens/y$d;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    goto :goto_9

    .line 158
    :cond_8
    iget-object v7, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 159
    .line 160
    if-eqz v7, :cond_9

    .line 161
    .line 162
    invoke-interface {v7}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    if-eqz v7, :cond_9

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_9
    move-object v7, v2

    .line 170
    goto :goto_9

    .line 171
    :cond_a
    sget-object v7, Lcom/swmansion/rnscreens/y$d;->h:Lcom/swmansion/rnscreens/y$d;

    .line 172
    .line 173
    iput-boolean v5, p0, Lcom/swmansion/rnscreens/S;->w:Z

    .line 174
    .line 175
    :goto_7
    move v6, v5

    .line 176
    goto :goto_9

    .line 177
    :cond_b
    if-eqz v6, :cond_d

    .line 178
    .line 179
    if-eqz v7, :cond_d

    .line 180
    .line 181
    if-eqz v8, :cond_d

    .line 182
    .line 183
    if-eqz v7, :cond_c

    .line 184
    .line 185
    invoke-interface {v7}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    if-eqz v6, :cond_c

    .line 190
    .line 191
    invoke-virtual {v6}, Lcom/swmansion/rnscreens/y;->getStackAnimation()Lcom/swmansion/rnscreens/y$d;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    move-object v7, v6

    .line 196
    goto :goto_8

    .line 197
    :cond_c
    move-object v7, v2

    .line 198
    :goto_8
    move v6, v4

    .line 199
    goto :goto_9

    .line 200
    :cond_d
    move-object v7, v2

    .line 201
    goto :goto_7

    .line 202
    :goto_9
    iput-boolean v6, p0, Lcom/swmansion/rnscreens/S;->w:Z

    .line 203
    .line 204
    if-eqz v6, :cond_e

    .line 205
    .line 206
    iget-object v8, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 207
    .line 208
    if-eqz v8, :cond_e

    .line 209
    .line 210
    sget-object v9, Lcom/swmansion/rnscreens/S;->x:Lcom/swmansion/rnscreens/S$a;

    .line 211
    .line 212
    check-cast v8, Lcom/swmansion/rnscreens/G;

    .line 213
    .line 214
    invoke-static {v9, v8, v7}, Lcom/swmansion/rnscreens/S$a;->a(Lcom/swmansion/rnscreens/S$a;Lcom/swmansion/rnscreens/G;Lcom/swmansion/rnscreens/y$d;)Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-eqz v8, :cond_e

    .line 219
    .line 220
    iget-object v8, v1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 221
    .line 222
    if-nez v8, :cond_e

    .line 223
    .line 224
    new-instance v3, LW6/d;

    .line 225
    .line 226
    invoke-direct {v3}, LW6/d;-><init>()V

    .line 227
    .line 228
    .line 229
    iput-object v3, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_e
    iget-object v8, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 233
    .line 234
    if-eqz v8, :cond_f

    .line 235
    .line 236
    if-eqz v3, :cond_f

    .line 237
    .line 238
    iget-object v3, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 239
    .line 240
    if-eqz v3, :cond_f

    .line 241
    .line 242
    invoke-interface {v3}, Lcom/swmansion/rnscreens/G;->b()Z

    .line 243
    .line 244
    .line 245
    move-result v3

    .line 246
    if-ne v3, v5, :cond_f

    .line 247
    .line 248
    iget-object v3, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 249
    .line 250
    check-cast v3, Lcom/swmansion/rnscreens/G;

    .line 251
    .line 252
    invoke-interface {v3}, Lcom/swmansion/rnscreens/G;->b()Z

    .line 253
    .line 254
    .line 255
    move-result v3

    .line 256
    if-nez v3, :cond_f

    .line 257
    .line 258
    iget-object v3, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 259
    .line 260
    invoke-static {v3}, Lj7/q;->O(Ljava/util/List;)Ljava/util/List;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    new-instance v8, Lcom/swmansion/rnscreens/J;

    .line 269
    .line 270
    invoke-direct {v8, v0}, Lcom/swmansion/rnscreens/J;-><init>(Lkotlin/jvm/internal/C;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v3, v8}, LO8/l;->Q(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v3}, LO8/l;->v(LO8/i;)I

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    if-le v3, v5, :cond_f

    .line 282
    .line 283
    new-instance v8, LW6/c;

    .line 284
    .line 285
    iget-object v9, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-static {v9}, Lj7/q;->l(Ljava/util/List;)I

    .line 288
    .line 289
    .line 290
    move-result v9

    .line 291
    sub-int/2addr v9, v3

    .line 292
    add-int/2addr v9, v5

    .line 293
    invoke-static {v9, v4}, Ljava/lang/Math;->max(II)I

    .line 294
    .line 295
    .line 296
    move-result v3

    .line 297
    invoke-direct {v8, v3}, LW6/c;-><init>(I)V

    .line 298
    .line 299
    .line 300
    iput-object v8, p0, Lcom/swmansion/rnscreens/S;->u:LW6/a;

    .line 301
    .line 302
    :cond_f
    :goto_a
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/A;->g()Landroidx/fragment/app/I;

    .line 303
    .line 304
    .line 305
    move-result-object v3

    .line 306
    if-eqz v7, :cond_10

    .line 307
    .line 308
    invoke-static {v3, v7, v6}, LY6/c;->a(Landroidx/fragment/app/I;Lcom/swmansion/rnscreens/y$d;Z)V

    .line 309
    .line 310
    .line 311
    :cond_10
    iget-object v4, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 312
    .line 313
    invoke-static {v4}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 314
    .line 315
    .line 316
    move-result-object v4

    .line 317
    new-instance v5, Lcom/swmansion/rnscreens/K;

    .line 318
    .line 319
    invoke-direct {v5, p0}, Lcom/swmansion/rnscreens/K;-><init>(Lcom/swmansion/rnscreens/S;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v4, v5}, LO8/l;->y(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    invoke-interface {v4}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 327
    .line 328
    .line 329
    move-result-object v4

    .line 330
    :goto_b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    if-eqz v5, :cond_11

    .line 335
    .line 336
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v5

    .line 340
    check-cast v5, Lcom/swmansion/rnscreens/Y;

    .line 341
    .line 342
    invoke-interface {v5}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 343
    .line 344
    .line 345
    move-result-object v5

    .line 346
    invoke-virtual {v3, v5}, Landroidx/fragment/app/I;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 347
    .line 348
    .line 349
    goto :goto_b

    .line 350
    :cond_11
    iget-object v4, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 351
    .line 352
    invoke-static {v4}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    new-instance v5, Lcom/swmansion/rnscreens/L;

    .line 357
    .line 358
    invoke-direct {v5, v1}, Lcom/swmansion/rnscreens/L;-><init>(Lkotlin/jvm/internal/C;)V

    .line 359
    .line 360
    .line 361
    invoke-static {v4, v5}, LO8/l;->Q(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 362
    .line 363
    .line 364
    move-result-object v4

    .line 365
    new-instance v5, Lcom/swmansion/rnscreens/M;

    .line 366
    .line 367
    invoke-direct {v5, v0, p0}, Lcom/swmansion/rnscreens/M;-><init>(Lkotlin/jvm/internal/C;Lcom/swmansion/rnscreens/S;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v4, v5}, LO8/l;->y(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-interface {v4}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    :goto_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-eqz v5, :cond_12

    .line 383
    .line 384
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object v5

    .line 388
    check-cast v5, Lcom/swmansion/rnscreens/G;

    .line 389
    .line 390
    invoke-interface {v5}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 391
    .line 392
    .line 393
    move-result-object v5

    .line 394
    invoke-virtual {v3, v5}, Landroidx/fragment/app/I;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 395
    .line 396
    .line 397
    goto :goto_c

    .line 398
    :cond_12
    iget-object v4, v1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 399
    .line 400
    if-eqz v4, :cond_13

    .line 401
    .line 402
    check-cast v4, Lcom/swmansion/rnscreens/G;

    .line 403
    .line 404
    invoke-interface {v4}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 405
    .line 406
    .line 407
    move-result-object v4

    .line 408
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    if-nez v4, :cond_13

    .line 413
    .line 414
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v4, Lcom/swmansion/rnscreens/G;

    .line 417
    .line 418
    iget-object v5, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 419
    .line 420
    invoke-static {v5}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 421
    .line 422
    .line 423
    move-result-object v5

    .line 424
    new-instance v6, Lcom/swmansion/rnscreens/N;

    .line 425
    .line 426
    invoke-direct {v6, v1}, Lcom/swmansion/rnscreens/N;-><init>(Lkotlin/jvm/internal/C;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v5, v6}, LO8/l;->x(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    invoke-interface {v5}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 434
    .line 435
    .line 436
    move-result-object v5

    .line 437
    :goto_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 438
    .line 439
    .line 440
    move-result v6

    .line 441
    if-eqz v6, :cond_15

    .line 442
    .line 443
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v6

    .line 447
    check-cast v6, Lcom/swmansion/rnscreens/G;

    .line 448
    .line 449
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 450
    .line 451
    .line 452
    move-result v7

    .line 453
    invoke-interface {v6}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 454
    .line 455
    .line 456
    move-result-object v6

    .line 457
    invoke-virtual {v3, v7, v6}, Landroidx/fragment/app/I;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 458
    .line 459
    .line 460
    move-result-object v6

    .line 461
    new-instance v7, Lcom/swmansion/rnscreens/O;

    .line 462
    .line 463
    invoke-direct {v7, v4}, Lcom/swmansion/rnscreens/O;-><init>(Lcom/swmansion/rnscreens/G;)V

    .line 464
    .line 465
    .line 466
    invoke-virtual {v6, v7}, Landroidx/fragment/app/I;->q(Ljava/lang/Runnable;)Landroidx/fragment/app/I;

    .line 467
    .line 468
    .line 469
    goto :goto_d

    .line 470
    :cond_13
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 471
    .line 472
    if-eqz v4, :cond_15

    .line 473
    .line 474
    check-cast v4, Lcom/swmansion/rnscreens/G;

    .line 475
    .line 476
    invoke-interface {v4}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 477
    .line 478
    .line 479
    move-result-object v4

    .line 480
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 481
    .line 482
    .line 483
    move-result v4

    .line 484
    if-nez v4, :cond_15

    .line 485
    .line 486
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v4, Lcom/swmansion/rnscreens/G;

    .line 489
    .line 490
    invoke-interface {v4}, Lcom/swmansion/rnscreens/G;->j()Lcom/swmansion/rnscreens/y;

    .line 491
    .line 492
    .line 493
    move-result-object v4

    .line 494
    invoke-static {v4}, LL6/r;->c(Lcom/swmansion/rnscreens/y;)Z

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    if-eqz v4, :cond_14

    .line 499
    .line 500
    iget-object v4, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v4, Lcom/swmansion/rnscreens/G;

    .line 503
    .line 504
    invoke-interface {v4}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 505
    .line 506
    .line 507
    move-result-object v4

    .line 508
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->postponeEnterTransition()V

    .line 509
    .line 510
    .line 511
    :cond_14
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 512
    .line 513
    .line 514
    move-result v4

    .line 515
    iget-object v5, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 516
    .line 517
    check-cast v5, Lcom/swmansion/rnscreens/G;

    .line 518
    .line 519
    invoke-interface {v5}, Lcom/swmansion/rnscreens/j;->f()Landroidx/fragment/app/Fragment;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    invoke-virtual {v3, v4, v5}, Landroidx/fragment/app/I;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 524
    .line 525
    .line 526
    :cond_15
    iget-object v0, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 527
    .line 528
    instance-of v4, v0, Lcom/swmansion/rnscreens/Y;

    .line 529
    .line 530
    if-eqz v4, :cond_16

    .line 531
    .line 532
    move-object v2, v0

    .line 533
    check-cast v2, Lcom/swmansion/rnscreens/Y;

    .line 534
    .line 535
    :cond_16
    iput-object v2, p0, Lcom/swmansion/rnscreens/S;->s:Lcom/swmansion/rnscreens/Y;

    .line 536
    .line 537
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 540
    .line 541
    .line 542
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->n:Ljava/util/ArrayList;

    .line 543
    .line 544
    iget-object v2, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 545
    .line 546
    invoke-static {v2}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 547
    .line 548
    .line 549
    move-result-object v2

    .line 550
    new-instance v4, Lcom/swmansion/rnscreens/P;

    .line 551
    .line 552
    invoke-direct {v4}, Lcom/swmansion/rnscreens/P;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-static {v2, v4}, LO8/l;->J(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 556
    .line 557
    .line 558
    move-result-object v2

    .line 559
    invoke-static {v0, v2}, Lj7/q;->z(Ljava/util/Collection;LO8/i;)Z

    .line 560
    .line 561
    .line 562
    iget-object v0, p0, Lcom/swmansion/rnscreens/A;->g:Ljava/util/ArrayList;

    .line 563
    .line 564
    invoke-static {v0}, Lj7/q;->V(Ljava/lang/Iterable;)LO8/i;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    new-instance v2, Lcom/swmansion/rnscreens/Q;

    .line 569
    .line 570
    invoke-direct {v2}, Lcom/swmansion/rnscreens/Q;-><init>()V

    .line 571
    .line 572
    .line 573
    invoke-static {v0, v2}, LO8/l;->y(LO8/i;Lkotlin/jvm/functions/Function1;)LO8/i;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-static {v0}, LO8/l;->S(LO8/i;)Ljava/util/List;

    .line 578
    .line 579
    .line 580
    move-result-object v0

    .line 581
    iput-object v0, p0, Lcom/swmansion/rnscreens/S;->p:Ljava/util/List;

    .line 582
    .line 583
    iget-object v0, v1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, Lcom/swmansion/rnscreens/G;

    .line 586
    .line 587
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/S;->e0(Lcom/swmansion/rnscreens/G;)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {v3}, Landroidx/fragment/app/I;->k()V

    .line 591
    .line 592
    .line 593
    return-void
.end method

.method public x()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lcom/swmansion/rnscreens/A;->x()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public z(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/S;->o:Ljava/util/Set;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/A;->m(I)Lcom/swmansion/rnscreens/G;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/I;->a(Ljava/lang/Object;)Ljava/util/Collection;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {v0, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1}, Lcom/swmansion/rnscreens/A;->z(I)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
