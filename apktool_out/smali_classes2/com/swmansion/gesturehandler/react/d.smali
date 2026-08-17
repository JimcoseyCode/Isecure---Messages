.class public final Lcom/swmansion/gesturehandler/react/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ6/r;


# instance fields
.field private final a:Lcom/facebook/react/bridge/ReactApplicationContext;

.field private final b:LI6/i;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 1

    .line 1
    const-string v0, "reactApplicationContext"

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
    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/d;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 10
    .line 11
    new-instance p1, LI6/i;

    .line 12
    .line 13
    invoke-direct {p1}, LI6/i;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/swmansion/gesturehandler/react/d;->b:LI6/i;

    .line 17
    .line 18
    return-void
.end method

.method private final d(LJ6/d;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, LJ6/d;->T()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ltz v0, :cond_6

    .line 6
    .line 7
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x4

    .line 12
    if-eq v0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, Lcom/swmansion/gesturehandler/react/e;->a:Lcom/swmansion/gesturehandler/react/e;

    .line 16
    .line 17
    invoke-virtual {v0, p1}, Lcom/swmansion/gesturehandler/react/e;->a(LJ6/d;)LJ6/d$c;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-virtual {p1}, LJ6/d;->F()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x1

    .line 29
    if-eq v2, v3, :cond_5

    .line 30
    .line 31
    const/4 v4, 0x2

    .line 32
    if-eq v2, v4, :cond_4

    .line 33
    .line 34
    const/4 v3, 0x3

    .line 35
    const-string v4, "onGestureHandlerEvent"

    .line 36
    .line 37
    if-eq v2, v3, :cond_3

    .line 38
    .line 39
    if-eq v2, v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    sget-object v1, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {v1, p1}, Lcom/swmansion/gesturehandler/react/c$a;->a(LK6/b;)Lcom/facebook/react/bridge/WritableMap;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, v4, p1}, Lcom/swmansion/gesturehandler/react/d;->g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_3
    sget-object v1, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 57
    .line 58
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v1, p1}, Lcom/swmansion/gesturehandler/react/c$a;->a(LK6/b;)Lcom/facebook/react/bridge/WritableMap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-direct {p0, v4, p1}, Lcom/swmansion/gesturehandler/react/d;->g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    sget-object v1, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 71
    .line 72
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v1, p1, v0, v3}, Lcom/swmansion/gesturehandler/react/c$a;->b(LJ6/d;LK6/b;Z)Lcom/swmansion/gesturehandler/react/c;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->h(Lcom/swmansion/gesturehandler/react/c;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_5
    move-object v1, v0

    .line 85
    sget-object v0, Lcom/swmansion/gesturehandler/react/c;->d:Lcom/swmansion/gesturehandler/react/c$a;

    .line 86
    .line 87
    invoke-virtual {v1, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v4, 0x4

    .line 92
    const/4 v5, 0x0

    .line 93
    const/4 v3, 0x0

    .line 94
    move-object v1, p1

    .line 95
    invoke-static/range {v0 .. v5}, Lcom/swmansion/gesturehandler/react/c$a;->c(Lcom/swmansion/gesturehandler/react/c$a;LJ6/d;LK6/b;ZILjava/lang/Object;)Lcom/swmansion/gesturehandler/react/c;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->i(Lcom/facebook/react/uimanager/events/Event;)V

    .line 100
    .line 101
    .line 102
    :cond_6
    :goto_0
    return-void
.end method

.method private final e(LJ6/d;II)V
    .locals 4

    .line 1
    invoke-virtual {p1}, LJ6/d;->T()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lcom/swmansion/gesturehandler/react/e;->a:Lcom/swmansion/gesturehandler/react/e;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lcom/swmansion/gesturehandler/react/e;->a(LJ6/d;)LJ6/d$c;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p1}, LJ6/d;->F()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v2, 0x1

    .line 22
    if-eq v1, v2, :cond_4

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    const-string v3, "onGestureHandlerStateChange"

    .line 26
    .line 27
    if-eq v1, v2, :cond_3

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    if-eq v1, v2, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x4

    .line 33
    if-eq v1, v2, :cond_2

    .line 34
    .line 35
    :goto_0
    return-void

    .line 36
    :cond_2
    sget-object v1, Lcom/swmansion/gesturehandler/react/m;->d:Lcom/swmansion/gesturehandler/react/m$a;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1, p2, p3}, Lcom/swmansion/gesturehandler/react/m$a;->a(LK6/b;II)Lcom/facebook/react/bridge/WritableMap;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-direct {p0, v3, p1}, Lcom/swmansion/gesturehandler/react/d;->g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :cond_3
    sget-object v1, Lcom/swmansion/gesturehandler/react/m;->d:Lcom/swmansion/gesturehandler/react/m$a;

    .line 51
    .line 52
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    invoke-virtual {v1, p1, p2, p3}, Lcom/swmansion/gesturehandler/react/m$a;->a(LK6/b;II)Lcom/facebook/react/bridge/WritableMap;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-direct {p0, v3, p1}, Lcom/swmansion/gesturehandler/react/d;->g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_4
    sget-object v1, Lcom/swmansion/gesturehandler/react/m;->d:Lcom/swmansion/gesturehandler/react/m$a;

    .line 65
    .line 66
    invoke-virtual {v0, p1}, LJ6/d$c;->c(LJ6/d;)LK6/b;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, p1, p2, p3, v0}, Lcom/swmansion/gesturehandler/react/m$a;->b(LJ6/d;IILK6/b;)Lcom/swmansion/gesturehandler/react/m;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->i(Lcom/facebook/react/uimanager/events/Event;)V

    .line 75
    .line 76
    .line 77
    return-void
.end method

.method private final f(LJ6/d;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, LJ6/d;->T()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x2

    .line 13
    const/4 v2, 0x4

    .line 14
    if-eq v0, v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eq v0, v2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p1}, LJ6/d;->S()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1}, LJ6/d;->W()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {p1}, LJ6/d;->F()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v1, 0x1

    .line 40
    if-eq v0, v1, :cond_3

    .line 41
    .line 42
    if-eq v0, v2, :cond_2

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :cond_2
    sget-object v0, Lcom/swmansion/gesturehandler/react/n;->c:Lcom/swmansion/gesturehandler/react/n$a;

    .line 46
    .line 47
    invoke-virtual {v0, p1}, Lcom/swmansion/gesturehandler/react/n$a;->a(LJ6/d;)Lcom/facebook/react/bridge/WritableMap;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v0, "onGestureHandlerEvent"

    .line 52
    .line 53
    invoke-direct {p0, v0, p1}, Lcom/swmansion/gesturehandler/react/d;->g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :cond_3
    sget-object v0, Lcom/swmansion/gesturehandler/react/n;->c:Lcom/swmansion/gesturehandler/react/n$a;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Lcom/swmansion/gesturehandler/react/n$a;->b(LJ6/d;)Lcom/swmansion/gesturehandler/react/n;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->i(Lcom/facebook/react/uimanager/events/Event;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method private final g(Ljava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/d;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/swmansion/gesturehandler/react/a;->a(Lcom/facebook/react/bridge/ReactContext;)Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/modules/core/DeviceEventManagerModule$RCTDeviceEventEmitter;->emit(Ljava/lang/String;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final h(Lcom/swmansion/gesturehandler/react/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/d;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 2
    .line 3
    invoke-static {v0, p1}, LI6/h;->a(Lcom/facebook/react/bridge/ReactContext;Lcom/facebook/react/uimanager/events/Event;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final i(Lcom/facebook/react/uimanager/events/Event;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/gesturehandler/react/d;->b:LI6/i;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/gesturehandler/react/d;->a:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 4
    .line 5
    invoke-virtual {v0, p1, v1}, LI6/i;->a(Lcom/facebook/react/uimanager/events/Event;Lcom/facebook/react/bridge/ReactContext;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LJ6/d;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->f(LJ6/d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public b(LJ6/d;Landroid/view/MotionEvent;)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "event"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, Lcom/swmansion/gesturehandler/react/d;->d(LJ6/d;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(LJ6/d;II)V
    .locals 1

    .line 1
    const-string v0, "handler"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2, p3}, Lcom/swmansion/gesturehandler/react/d;->e(LJ6/d;II)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
