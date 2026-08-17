.class public final LS6/e;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP6/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LS6/e$a;
    }
.end annotation


# static fields
.field public static final d:LS6/e$a;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LS6/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LS6/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LS6/e;->d:LS6/e$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;IZ)V
    .locals 1

    .line 1
    const-string v0, "tabKey"

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
    iput-object p3, p0, LS6/e;->a:Ljava/lang/String;

    .line 10
    .line 11
    iput p4, p0, LS6/e;->b:I

    .line 12
    .line 13
    iput-boolean p5, p0, LS6/e;->c:Z

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "onNativeFocusChange"

    .line 2
    .line 3
    return-object v0
.end method

.method public getCoalescingKey()S
    .locals 2

    .line 1
    iget v0, p0, LS6/e;->b:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0xa

    .line 4
    .line 5
    iget-boolean v1, p0, LS6/e;->c:Z

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    int-to-short v0, v0

    .line 9
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "tabKey"

    .line 6
    .line 7
    iget-object v2, p0, LS6/e;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v1, "repeatedSelectionHandledBySpecialEffect"

    .line 13
    .line 14
    iget-boolean v2, p0, LS6/e;->c:Z

    .line 15
    .line 16
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topNativeFocusChange"

    .line 2
    .line 3
    return-object v0
.end method
