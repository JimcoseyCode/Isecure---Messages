.class public final Lq6/a;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/a$a;
    }
.end annotation


# static fields
.field public static final b:Lq6/a$a;


# instance fields
.field private final a:Lq6/b;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq6/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lq6/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq6/a;->b:Lq6/a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IILq6/b;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 7
    .line 8
    .line 9
    iput-object p3, p0, Lq6/a;->a:Lq6/b;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public getCoalescingKey()S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lq6/a;->a:Lq6/b;

    .line 6
    .line 7
    invoke-virtual {v1}, Lq6/b;->e()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "target"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lq6/a;->a:Lq6/b;

    .line 17
    .line 18
    invoke-virtual {v1}, Lq6/b;->d()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const-string v2, "parentScrollViewTarget"

    .line 23
    .line 24
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 32
    .line 33
    invoke-virtual {v2}, Lq6/b;->g()D

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    const-string v4, "x"

    .line 38
    .line 39
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 40
    .line 41
    .line 42
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 43
    .line 44
    invoke-virtual {v2}, Lq6/b;->h()D

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    const-string v4, "y"

    .line 49
    .line 50
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 51
    .line 52
    .line 53
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 54
    .line 55
    invoke-virtual {v2}, Lq6/b;->f()D

    .line 56
    .line 57
    .line 58
    move-result-wide v2

    .line 59
    const-string v4, "width"

    .line 60
    .line 61
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 62
    .line 63
    .line 64
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 65
    .line 66
    invoke-virtual {v2}, Lq6/b;->c()D

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    const-string v4, "height"

    .line 71
    .line 72
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 76
    .line 77
    invoke-virtual {v2}, Lq6/b;->a()D

    .line 78
    .line 79
    .line 80
    move-result-wide v2

    .line 81
    const-string v4, "absoluteX"

    .line 82
    .line 83
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 84
    .line 85
    .line 86
    iget-object v2, p0, Lq6/a;->a:Lq6/b;

    .line 87
    .line 88
    invoke-virtual {v2}, Lq6/b;->b()D

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    const-string v4, "absoluteY"

    .line 93
    .line 94
    invoke-interface {v1, v4, v2, v3}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 95
    .line 96
    .line 97
    sget-object v2, Li7/B;->a:Li7/B;

    .line 98
    .line 99
    const-string v2, "layout"

    .line 100
    .line 101
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 102
    .line 103
    .line 104
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topFocusedInputLayoutChanged"

    .line 2
    .line 3
    return-object v0
.end method
