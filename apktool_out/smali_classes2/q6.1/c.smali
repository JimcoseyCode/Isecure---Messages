.class public final Lq6/c;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lq6/c$a;
    }
.end annotation


# static fields
.field public static final b:Lq6/c$a;


# instance fields
.field private final a:Lq6/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lq6/c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lq6/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lq6/c;->b:Lq6/c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IILq6/d;)V
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
    iput-object p3, p0, Lq6/c;->a:Lq6/d;

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
    .locals 9

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lq6/c;->a:Lq6/d;

    .line 6
    .line 7
    invoke-virtual {v1}, Lq6/d;->g()I

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
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 25
    .line 26
    invoke-virtual {v3}, Lq6/d;->e()D

    .line 27
    .line 28
    .line 29
    move-result-wide v3

    .line 30
    const-string v5, "x"

    .line 31
    .line 32
    invoke-interface {v2, v5, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 33
    .line 34
    .line 35
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 36
    .line 37
    invoke-virtual {v3}, Lq6/d;->f()D

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    const-string v6, "y"

    .line 42
    .line 43
    invoke-interface {v2, v6, v3, v4}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 44
    .line 45
    .line 46
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 47
    .line 48
    invoke-virtual {v3}, Lq6/d;->d()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    const-string v4, "position"

    .line 53
    .line 54
    invoke-interface {v2, v4, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    sget-object v3, Li7/B;->a:Li7/B;

    .line 58
    .line 59
    const-string v3, "start"

    .line 60
    .line 61
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 69
    .line 70
    invoke-virtual {v3}, Lq6/d;->b()D

    .line 71
    .line 72
    .line 73
    move-result-wide v7

    .line 74
    invoke-interface {v2, v5, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 75
    .line 76
    .line 77
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 78
    .line 79
    invoke-virtual {v3}, Lq6/d;->c()D

    .line 80
    .line 81
    .line 82
    move-result-wide v7

    .line 83
    invoke-interface {v2, v6, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 84
    .line 85
    .line 86
    iget-object v3, p0, Lq6/c;->a:Lq6/d;

    .line 87
    .line 88
    invoke-virtual {v3}, Lq6/d;->a()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    invoke-interface {v2, v4, v3}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    const-string v3, "end"

    .line 96
    .line 97
    invoke-interface {v1, v3, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 98
    .line 99
    .line 100
    const-string v2, "selection"

    .line 101
    .line 102
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topFocusedInputSelectionChanged"

    .line 2
    .line 3
    return-object v0
.end method
