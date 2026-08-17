.class public final Lcom/swmansion/rnscreens/gamma/tabs/a;
.super Landroid/view/ViewGroup;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LO6/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/a$a;
    }
.end annotation


# static fields
.field public static final v:Lcom/swmansion/rnscreens/gamma/tabs/a$a;

.field static final synthetic w:[LC7/k;


# instance fields
.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private h:Ljava/lang/ref/WeakReference;

.field public i:Lcom/swmansion/rnscreens/gamma/tabs/c;

.field private j:Ljava/lang/String;

.field private final k:Lkotlin/properties/d;

.field private final l:Lkotlin/properties/d;

.field private final m:Lkotlin/properties/d;

.field private final n:Lkotlin/properties/d;

.field private final o:Lkotlin/properties/d;

.field private final p:Lkotlin/properties/d;

.field private final q:Lkotlin/properties/d;

.field private final r:Lkotlin/properties/d;

.field private s:Z

.field private t:Z

.field private u:Z


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Lkotlin/jvm/internal/p;

    .line 2
    .line 3
    const-class v1, Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 4
    .line 5
    const-string v2, "tabTitle"

    .line 6
    .line 7
    const-string v3, "getTabTitle()Ljava/lang/String;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/p;

    .line 18
    .line 19
    const-string v3, "badgeValue"

    .line 20
    .line 21
    const-string v5, "getBadgeValue()Ljava/lang/String;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/p;

    .line 31
    .line 32
    const-string v5, "tabBarItemBadgeTextColor"

    .line 33
    .line 34
    const-string v6, "getTabBarItemBadgeTextColor()Ljava/lang/Integer;"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v5, Lkotlin/jvm/internal/p;

    .line 44
    .line 45
    const-string v6, "tabBarItemBadgeBackgroundColor"

    .line 46
    .line 47
    const-string v7, "getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;"

    .line 48
    .line 49
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lkotlin/jvm/internal/p;

    .line 57
    .line 58
    const-string v7, "tabBarItemTestID"

    .line 59
    .line 60
    const-string v8, "getTabBarItemTestID()Ljava/lang/String;"

    .line 61
    .line 62
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Lkotlin/jvm/internal/p;

    .line 70
    .line 71
    const-string v8, "tabBarItemAccessibilityLabel"

    .line 72
    .line 73
    const-string v9, "getTabBarItemAccessibilityLabel()Ljava/lang/String;"

    .line 74
    .line 75
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v7}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    new-instance v8, Lkotlin/jvm/internal/p;

    .line 83
    .line 84
    const-string v9, "drawableIconResourceName"

    .line 85
    .line 86
    const-string v10, "getDrawableIconResourceName()Ljava/lang/String;"

    .line 87
    .line 88
    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    new-instance v9, Lkotlin/jvm/internal/p;

    .line 96
    .line 97
    const-string v10, "icon"

    .line 98
    .line 99
    const-string v11, "getIcon()Landroid/graphics/drawable/Drawable;"

    .line 100
    .line 101
    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v9}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const/16 v9, 0x8

    .line 109
    .line 110
    new-array v9, v9, [LC7/k;

    .line 111
    .line 112
    aput-object v0, v9, v4

    .line 113
    .line 114
    const/4 v0, 0x1

    .line 115
    aput-object v2, v9, v0

    .line 116
    .line 117
    const/4 v0, 0x2

    .line 118
    aput-object v3, v9, v0

    .line 119
    .line 120
    const/4 v0, 0x3

    .line 121
    aput-object v5, v9, v0

    .line 122
    .line 123
    const/4 v0, 0x4

    .line 124
    aput-object v6, v9, v0

    .line 125
    .line 126
    const/4 v0, 0x5

    .line 127
    aput-object v7, v9, v0

    .line 128
    .line 129
    const/4 v0, 0x6

    .line 130
    aput-object v8, v9, v0

    .line 131
    .line 132
    const/4 v0, 0x7

    .line 133
    aput-object v1, v9, v0

    .line 134
    .line 135
    sput-object v9, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 136
    .line 137
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/a$a;

    .line 138
    .line 139
    const/4 v1, 0x0

    .line 140
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 141
    .line 142
    .line 143
    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/a;->v:Lcom/swmansion/rnscreens/gamma/tabs/a$a;

    .line 144
    .line 145
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-direct {p1, v0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    .line 20
    .line 21
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$b;

    .line 22
    .line 23
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$b;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->k:Lkotlin/properties/d;

    .line 27
    .line 28
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$c;

    .line 29
    .line 30
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$c;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->l:Lkotlin/properties/d;

    .line 34
    .line 35
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$d;

    .line 36
    .line 37
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$d;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->m:Lkotlin/properties/d;

    .line 41
    .line 42
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$e;

    .line 43
    .line 44
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$e;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->n:Lkotlin/properties/d;

    .line 48
    .line 49
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$f;

    .line 50
    .line 51
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$f;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->o:Lkotlin/properties/d;

    .line 55
    .line 56
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$g;

    .line 57
    .line 58
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$g;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->p:Lkotlin/properties/d;

    .line 62
    .line 63
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$h;

    .line 64
    .line 65
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$h;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->q:Lkotlin/properties/d;

    .line 69
    .line 70
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/a$i;

    .line 71
    .line 72
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a$i;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 73
    .line 74
    .line 75
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->r:Lkotlin/properties/d;

    .line 76
    .line 77
    const/4 p1, 0x1

    .line 78
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->s:Z

    .line 79
    .line 80
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->t:Z

    .line 81
    .line 82
    return-void
.end method

.method public static final synthetic a(Lcom/swmansion/rnscreens/gamma/tabs/a;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->g(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/b;->a(Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method private final e()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->u:Z

    .line 12
    .line 13
    invoke-interface {v0, p0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/b;->b(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method private final g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->d()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(Lcom/swmansion/rnscreens/gamma/tabs/e;Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "fragment"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "config"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/b;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1, p0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/b;->e(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/content/res/Configuration;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/c;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/c;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/c;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "[RNScreens] TabScreen must have its tag set when registering event emitters"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public getAssociatedFragment()Landroidx/fragment/app/Fragment;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/swmansion/rnscreens/gamma/tabs/b;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-interface {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/b;->d(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroidx/fragment/app/Fragment;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return-object v0
.end method

.method public final getBadgeValue()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->l:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getDrawableIconResourceName()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->q:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->i:Lcom/swmansion/rnscreens/gamma/tabs/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "eventEmitter"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final getIcon()Landroid/graphics/drawable/Drawable;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->r:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getShouldUseRepeatedTabSelectionPopToRootSpecialEffect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->t:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getShouldUseRepeatedTabSelectionScrollToTopSpecialEffect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->s:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getTabBarItemAccessibilityLabel()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->p:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->n:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemBadgeTextColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->m:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemTestID()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->o:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTabTitle()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->k:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 1
    sget-object v0, LY6/e;->a:LY6/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "TabScreen ["

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "] attached to window"

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "TabScreen"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setBadgeValue(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->l:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setDrawableIconResourceName(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->q:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/c;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->i:Lcom/swmansion/rnscreens/gamma/tabs/c;

    .line 7
    .line 8
    return-void
.end method

.method public final setFocusedTab(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->u:Z

    .line 2
    .line 3
    if-eq v0, p1, :cond_0

    .line 4
    .line 5
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->u:Z

    .line 6
    .line 7
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->e()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->r:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setShouldUseRepeatedTabSelectionPopToRootSpecialEffect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setShouldUseRepeatedTabSelectionScrollToTopSpecialEffect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method public final setTabBarItemAccessibilityLabel(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->p:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemBadgeBackgroundColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->n:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemBadgeTextColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->m:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemTestID(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->o:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabKey(Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-static {p1}, LP8/q;->f0(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->j:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public final setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/b;)V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->h:Ljava/lang/ref/WeakReference;

    .line 7
    .line 8
    return-void
.end method

.method public final setTabTitle(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/a;->k:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/a;->w:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
