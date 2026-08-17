.class public final Lcom/swmansion/gesturehandler/react/m;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/gesturehandler/react/m$a;
    }
.end annotation


# static fields
.field public static final d:Lcom/swmansion/gesturehandler/react/m$a;

.field private static final e:LH0/f;


# instance fields
.field private a:LK6/b;

.field private b:I

.field private c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/swmansion/gesturehandler/react/m$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/swmansion/gesturehandler/react/m$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/swmansion/gesturehandler/react/m;->d:Lcom/swmansion/gesturehandler/react/m$a;

    .line 8
    .line 9
    new-instance v0, LH0/f;

    .line 10
    .line 11
    const/4 v1, 0x7

    .line 12
    invoke-direct {v0, v1}, LH0/f;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lcom/swmansion/gesturehandler/react/m;->e:LH0/f;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/Event;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/gesturehandler/react/m;-><init>()V

    return-void
.end method

.method public static final synthetic access$getEVENTS_POOL$cp()LH0/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/swmansion/gesturehandler/react/m;->e:LH0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Lcom/swmansion/gesturehandler/react/m;LJ6/d;IILK6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/swmansion/gesturehandler/react/m;->c(LJ6/d;IILK6/b;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final c(LJ6/d;IILK6/b;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LJ6/d;->W()Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-super {p0, v0, p1}, Lcom/facebook/react/uimanager/events/Event;->init(II)V

    .line 17
    .line 18
    .line 19
    iput-object p4, p0, Lcom/swmansion/gesturehandler/react/m;->a:LK6/b;

    .line 20
    .line 21
    iput p2, p0, Lcom/swmansion/gesturehandler/react/m;->b:I

    .line 22
    .line 23
    iput p3, p0, Lcom/swmansion/gesturehandler/react/m;->c:I

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 4

    .line 1
    sget-object v0, Lcom/swmansion/gesturehandler/react/m;->d:Lcom/swmansion/gesturehandler/react/m$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/gesturehandler/react/m;->a:LK6/b;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    iget v2, p0, Lcom/swmansion/gesturehandler/react/m;->b:I

    .line 9
    .line 10
    iget v3, p0, Lcom/swmansion/gesturehandler/react/m;->c:I

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2, v3}, Lcom/swmansion/gesturehandler/react/m$a;->a(LK6/b;II)Lcom/facebook/react/bridge/WritableMap;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "onGestureHandlerStateChange"

    .line 2
    .line 3
    return-object v0
.end method

.method public onDispose()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/swmansion/gesturehandler/react/m;->a:LK6/b;

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/swmansion/gesturehandler/react/m;->b:I

    .line 6
    .line 7
    iput v0, p0, Lcom/swmansion/gesturehandler/react/m;->c:I

    .line 8
    .line 9
    sget-object v0, Lcom/swmansion/gesturehandler/react/m;->e:LH0/f;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, LH0/f;->release(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void
.end method
