.class public final Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/LifecycleEventListener;


# annotations
.annotation build Lcom/facebook/jni/annotations/DoNotStrip;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0001\u0018\u0000 >2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0017\u001a\u00020\u00022\u0010\u0008\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u001dR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010)\u001a\u00020\'8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010+R\u0016\u0010/\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u00102\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00080\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u001c\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u0002078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u0016\u0010=\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008;\u0010<\u00a8\u0006@"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;",
        "Lcom/facebook/react/bridge/LifecycleEventListener;",
        "Lcom/facebook/react/bridge/ReactApplicationContext;",
        "reactContext",
        "<init>",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)V",
        "",
        "g",
        "(Lcom/facebook/react/bridge/ReactApplicationContext;)Z",
        "Landroid/content/Context;",
        "contextWithTheme",
        "Li7/B;",
        "f",
        "(Landroid/content/Context;)V",
        "",
        "fontSize",
        "isTitleEmpty",
        "",
        "computeDummyLayout",
        "(IZ)F",
        "Lkotlin/Function0;",
        "",
        "lazyMessage",
        "j",
        "(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;",
        "Landroid/app/Activity;",
        "i",
        "()Landroid/app/Activity;",
        "onHostResume",
        "()V",
        "onHostPause",
        "onHostDestroy",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
        "Landroidx/coordinatorlayout/widget/CoordinatorLayout;",
        "coordinatorLayout",
        "Lcom/google/android/material/appbar/AppBarLayout;",
        "h",
        "Lcom/google/android/material/appbar/AppBarLayout;",
        "appBarLayout",
        "Landroid/view/View;",
        "Landroid/view/View;",
        "dummyContentView",
        "Landroidx/appcompat/widget/Toolbar;",
        "Landroidx/appcompat/widget/Toolbar;",
        "toolbar",
        "k",
        "F",
        "defaultFontSize",
        "l",
        "I",
        "defaultContentInsetStartWithNavigation",
        "Lcom/swmansion/rnscreens/utils/a;",
        "m",
        "Lcom/swmansion/rnscreens/utils/a;",
        "cache",
        "Ljava/lang/ref/WeakReference;",
        "n",
        "Ljava/lang/ref/WeakReference;",
        "reactContextRef",
        "o",
        "Z",
        "isLayoutInitialized",
        "p",
        "a",
        "react-native-screens_release"
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
.field public static final p:Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;

.field private static q:Ljava/lang/ref/WeakReference;


# instance fields
.field private g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

.field private h:Lcom/google/android/material/appbar/AppBarLayout;

.field private i:Landroid/view/View;

.field private j:Landroidx/appcompat/widget/Toolbar;

.field private k:F

.field private l:I

.field private m:Lcom/swmansion/rnscreens/utils/a;

.field private n:Ljava/lang/ref/WeakReference;

.field private volatile o:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->p:Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;

    .line 8
    .line 9
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->q:Ljava/lang/ref/WeakReference;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactContext"

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
    sget-object v0, Lcom/swmansion/rnscreens/utils/a;->c:Lcom/swmansion/rnscreens/utils/a$a;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/utils/a$a;->a()Lcom/swmansion/rnscreens/utils/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->m:Lcom/swmansion/rnscreens/utils/a;

    .line 16
    .line 17
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 18
    .line 19
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->n:Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    :try_start_0
    const-string v0, "react_codegen_rnscreens"

    .line 25
    .line 26
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    .line 28
    .line 29
    :catch_0
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 30
    .line 31
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->q:Ljava/lang/ref/WeakReference;

    .line 35
    .line 36
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->hasCurrentActivity()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_0

    .line 41
    .line 42
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    :cond_0
    invoke-virtual {p1, p0}, Lcom/facebook/react/bridge/ReactContext;->addLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
.end method

.method public static synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->l()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic b()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->h()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final computeDummyLayout(IZ)F
    .locals 10
    .annotation build Lcom/facebook/jni/annotations/DoNotStrip;
    .end annotation

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LY6/f;

    .line 6
    .line 7
    invoke-direct {v0}, LY6/f;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->m:Lcom/swmansion/rnscreens/utils/a;

    .line 23
    .line 24
    new-instance v1, Lcom/swmansion/rnscreens/utils/b;

    .line 25
    .line 26
    invoke-direct {v1, p1, p2}, Lcom/swmansion/rnscreens/utils/b;-><init>(IZ)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/utils/a;->c(Lcom/swmansion/rnscreens/utils/b;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    iget-object p1, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->m:Lcom/swmansion/rnscreens/utils/a;

    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/utils/a;->b()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :cond_1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->i()Landroid/app/Activity;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    const-string v1, "getDecorView(...)"

    .line 55
    .line 56
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, LY6/a;->a(Landroid/view/View;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/high16 v3, 0x40000000    # 2.0f

    .line 72
    .line 73
    invoke-static {v2, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    const/4 v5, 0x0

    .line 82
    const-string v6, "toolbar"

    .line 83
    .line 84
    const/4 v7, 0x0

    .line 85
    if-eqz p2, :cond_4

    .line 86
    .line 87
    iget-object v8, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 88
    .line 89
    if-nez v8, :cond_2

    .line 90
    .line 91
    invoke-static {v6}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    move-object v8, v7

    .line 95
    :cond_2
    const-string v9, ""

    .line 96
    .line 97
    invoke-virtual {v8, v9}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    iget-object v8, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 101
    .line 102
    if-nez v8, :cond_3

    .line 103
    .line 104
    invoke-static {v6}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    move-object v8, v7

    .line 108
    :cond_3
    invoke-virtual {v8, v5}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_4
    iget-object v8, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 113
    .line 114
    if-nez v8, :cond_5

    .line 115
    .line 116
    invoke-static {v6}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    move-object v8, v7

    .line 120
    :cond_5
    const-string v9, "FontSize123!#$"

    .line 121
    .line 122
    invoke-virtual {v8, v9}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 123
    .line 124
    .line 125
    iget-object v8, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 126
    .line 127
    if-nez v8, :cond_6

    .line 128
    .line 129
    invoke-static {v6}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    move-object v8, v7

    .line 133
    :cond_6
    iget v9, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->l:I

    .line 134
    .line 135
    invoke-virtual {v8, v9}, Landroidx/appcompat/widget/Toolbar;->setContentInsetStartWithNavigation(I)V

    .line 136
    .line 137
    .line 138
    :goto_0
    sget-object v8, Lcom/swmansion/rnscreens/a0;->J:Lcom/swmansion/rnscreens/a0$a;

    .line 139
    .line 140
    iget-object v9, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 141
    .line 142
    if-nez v9, :cond_7

    .line 143
    .line 144
    invoke-static {v6}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    move-object v9, v7

    .line 148
    :cond_7
    invoke-virtual {v8, v9}, Lcom/swmansion/rnscreens/a0$a;->a(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/TextView;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    if-eqz v6, :cond_9

    .line 153
    .line 154
    const/4 v8, -0x1

    .line 155
    if-eq p1, v8, :cond_8

    .line 156
    .line 157
    int-to-float v8, p1

    .line 158
    goto :goto_1

    .line 159
    :cond_8
    iget v8, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->k:F

    .line 160
    .line 161
    :goto_1
    invoke-virtual {v6, v8}, Landroid/widget/TextView;->setTextSize(F)V

    .line 162
    .line 163
    .line 164
    :cond_9
    iget-object v6, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 165
    .line 166
    const-string v8, "coordinatorLayout"

    .line 167
    .line 168
    if-nez v6, :cond_a

    .line 169
    .line 170
    invoke-static {v8}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    move-object v6, v7

    .line 174
    :cond_a
    invoke-virtual {v6, v4, v3}, Landroid/view/View;->measure(II)V

    .line 175
    .line 176
    .line 177
    iget-object v3, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 178
    .line 179
    if-nez v3, :cond_b

    .line 180
    .line 181
    invoke-static {v8}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    move-object v3, v7

    .line 185
    :cond_b
    invoke-virtual {v3, v5, v5, v2, v0}, Landroid/view/View;->layout(IIII)V

    .line 186
    .line 187
    .line 188
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 189
    .line 190
    if-nez v0, :cond_c

    .line 191
    .line 192
    const-string v0, "appBarLayout"

    .line 193
    .line 194
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_c
    move-object v7, v0

    .line 199
    :goto_2
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    .line 200
    .line 201
    .line 202
    move-result v0

    .line 203
    int-to-float v0, v0

    .line 204
    int-to-float v1, v1

    .line 205
    add-float/2addr v0, v1

    .line 206
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 207
    .line 208
    .line 209
    move-result v0

    .line 210
    new-instance v1, Lcom/swmansion/rnscreens/utils/a;

    .line 211
    .line 212
    new-instance v2, Lcom/swmansion/rnscreens/utils/b;

    .line 213
    .line 214
    invoke-direct {v2, p1, p2}, Lcom/swmansion/rnscreens/utils/b;-><init>(IZ)V

    .line 215
    .line 216
    .line 217
    invoke-direct {v1, v2, v0}, Lcom/swmansion/rnscreens/utils/a;-><init>(Lcom/swmansion/rnscreens/utils/b;F)V

    .line 218
    .line 219
    .line 220
    iput-object v1, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->m:Lcom/swmansion/rnscreens/utils/a;

    .line 221
    .line 222
    return v0
.end method

.method public static final synthetic d()Ljava/lang/ref/WeakReference;
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->q:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object v0
.end method

.method private static final e()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "[RNScreens] Context was null-ed before dummy layout was initialized"

    .line 2
    .line 3
    return-object v0
.end method

.method private final f(Landroid/content/Context;)V
    .locals 6

    .line 1
    new-instance v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 7
    .line 8
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout;

    .line 9
    .line 10
    invoke-direct {v0, p1}, Lcom/google/android/material/appbar/AppBarLayout;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 14
    .line 15
    const/4 v2, -0x1

    .line 16
    const/4 v3, -0x2

    .line 17
    invoke-direct {v1, v2, v3}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;-><init>(II)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 24
    .line 25
    new-instance v0, Landroidx/appcompat/widget/Toolbar;

    .line 26
    .line 27
    invoke-direct {v0, p1}, Landroidx/appcompat/widget/Toolbar;-><init>(Landroid/content/Context;)V

    .line 28
    .line 29
    .line 30
    const-string v1, "FontSize123!#$"

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/Toolbar;->setTitle(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Lcom/google/android/material/appbar/AppBarLayout$d;

    .line 36
    .line 37
    invoke-direct {v1, v2, v3}, Lcom/google/android/material/appbar/AppBarLayout$d;-><init>(II)V

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    invoke-virtual {v1, v3}, Lcom/google/android/material/appbar/AppBarLayout$d;->g(I)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 48
    .line 49
    sget-object v1, Lcom/swmansion/rnscreens/a0;->J:Lcom/swmansion/rnscreens/a0$a;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Lcom/swmansion/rnscreens/a0$a;->a(Landroidx/appcompat/widget/Toolbar;)Landroid/widget/TextView;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/widget/TextView;->getTextSize()F

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iput v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->k:F

    .line 63
    .line 64
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 65
    .line 66
    const-string v1, "toolbar"

    .line 67
    .line 68
    const/4 v3, 0x0

    .line 69
    if-nez v0, :cond_0

    .line 70
    .line 71
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    move-object v0, v3

    .line 75
    :cond_0
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->getContentInsetStartWithNavigation()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    iput v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->l:I

    .line 80
    .line 81
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 82
    .line 83
    const-string v4, "appBarLayout"

    .line 84
    .line 85
    if-nez v0, :cond_1

    .line 86
    .line 87
    invoke-static {v4}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v3

    .line 91
    :cond_1
    iget-object v5, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j:Landroidx/appcompat/widget/Toolbar;

    .line 92
    .line 93
    if-nez v5, :cond_2

    .line 94
    .line 95
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    move-object v5, v3

    .line 99
    :cond_2
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    new-instance v0, Landroid/view/View;

    .line 103
    .line 104
    invoke-direct {v0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 105
    .line 106
    .line 107
    new-instance p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;

    .line 108
    .line 109
    invoke-direct {p1, v2, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout$f;-><init>(II)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 113
    .line 114
    .line 115
    iput-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->i:Landroid/view/View;

    .line 116
    .line 117
    iget-object p1, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 118
    .line 119
    if-nez p1, :cond_3

    .line 120
    .line 121
    const-string p1, "coordinatorLayout"

    .line 122
    .line 123
    invoke-static {p1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    move-object p1, v3

    .line 127
    :cond_3
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->h:Lcom/google/android/material/appbar/AppBarLayout;

    .line 128
    .line 129
    if-nez v0, :cond_4

    .line 130
    .line 131
    invoke-static {v4}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    move-object v0, v3

    .line 135
    :cond_4
    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->i:Landroid/view/View;

    .line 139
    .line 140
    if-nez v0, :cond_5

    .line 141
    .line 142
    const-string v0, "dummyContentView"

    .line 143
    .line 144
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_5
    move-object v3, v0

    .line 149
    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x1

    .line 153
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->o:Z

    .line 154
    .line 155
    return-void
.end method

.method private final g(Lcom/facebook/react/bridge/ReactApplicationContext;)Z
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->o:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->hasCurrentActivity()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    const/4 p1, 0x0

    .line 14
    return p1

    .line 15
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_3

    .line 20
    .line 21
    monitor-enter p0

    .line 22
    :try_start_0
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    monitor-exit p0

    .line 27
    return v1

    .line 28
    :cond_2
    :try_start_1
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->f(Landroid/content/Context;)V

    .line 29
    .line 30
    .line 31
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 32
    .line 33
    monitor-exit p0

    .line 34
    return v1

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1

    .line 38
    :cond_3
    const-string p1, "[RNScreens] Attempt to use context detached from activity. This could happen only due to race-condition."

    .line 39
    .line 40
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0
.end method

.method public static final getInstance()Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;
    .locals 1
    .annotation build Lcom/facebook/jni/annotations/DoNotStrip;
    .end annotation

    .line 1
    sget-object v0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->p:Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper$a;->getInstance()Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method private static final h()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "[RNScreens] ReactContext missing in onHostResume! This should not happen."

    .line 2
    .line 3
    return-object v0
.end method

.method private final i()Landroid/app/Activity;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {p0, v0, v1, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->k(Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;Lw7/a;ILjava/lang/Object;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/bridge/ReactContext;->getCurrentActivity()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v1, "[RNScreens] Attempt to use context detached from activity"

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method private final j(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, LY6/h;

    .line 10
    .line 11
    invoke-direct {p1}, LY6/h;-><init>()V

    .line 12
    .line 13
    .line 14
    :cond_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method static synthetic k(Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;Lw7/a;ILjava/lang/Object;)Lcom/facebook/react/bridge/ReactApplicationContext;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final l()Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "[RNScreens] Attempt to require missing react context"

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public onHostDestroy()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->n:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public onHostPause()V
    .locals 0

    .line 1
    return-void
.end method

.method public onHostResume()V
    .locals 2

    .line 1
    new-instance v0, LY6/g;

    .line 2
    .line 3
    invoke-direct {v0}, LY6/g;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->j(Lw7/a;)Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/utils/ScreenDummyLayoutHelper;->g(Lcom/facebook/react/bridge/ReactApplicationContext;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, p0}, Lcom/facebook/react/bridge/ReactContext;->removeLifecycleEventListener(Lcom/facebook/react/bridge/LifecycleEventListener;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method
