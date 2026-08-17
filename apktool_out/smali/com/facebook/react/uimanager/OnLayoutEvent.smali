.class public final Lcom/facebook/react/uimanager/OnLayoutEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/uimanager/OnLayoutEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0007\u0018\u0000 $2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001$B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0006H\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0014\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R(\u0010\t\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\t\u0010\u0015\u0012\u0004\u0008\u001a\u0010\u0003\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R(\u0010\n\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\n\u0010\u0015\u0012\u0004\u0008\u001d\u0010\u0003\u001a\u0004\u0008\u001b\u0010\u0017\"\u0004\u0008\u001c\u0010\u0019R(\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000b\u0010\u0015\u0012\u0004\u0008 \u0010\u0003\u001a\u0004\u0008\u001e\u0010\u0017\"\u0004\u0008\u001f\u0010\u0019R(\u0010\u000c\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000c\u0010\u0015\u0012\u0004\u0008#\u0010\u0003\u001a\u0004\u0008!\u0010\u0017\"\u0004\u0008\"\u0010\u0019\u00a8\u0006%"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/OnLayoutEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "<init>",
        "()V",
        "Li7/B;",
        "onDispose",
        "",
        "surfaceId",
        "viewTag",
        "x",
        "y",
        "width",
        "height",
        "init",
        "(IIIIII)V",
        "",
        "getEventName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/bridge/WritableMap;",
        "getEventData",
        "()Lcom/facebook/react/bridge/WritableMap;",
        "I",
        "getX$ReactAndroid_release",
        "()I",
        "setX$ReactAndroid_release",
        "(I)V",
        "getX$ReactAndroid_release$annotations",
        "getY$ReactAndroid_release",
        "setY$ReactAndroid_release",
        "getY$ReactAndroid_release$annotations",
        "getWidth$ReactAndroid_release",
        "setWidth$ReactAndroid_release",
        "getWidth$ReactAndroid_release$annotations",
        "getHeight$ReactAndroid_release",
        "setHeight$ReactAndroid_release",
        "getHeight$ReactAndroid_release$annotations",
        "Companion",
        "ReactAndroid_release"
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
.field public static final Companion:Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;

.field private static final EVENTS_POOL:LH0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LH0/f;"
        }
    .end annotation
.end field


# instance fields
.field private height:I

.field private width:I

.field private x:I

.field private y:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->Companion:Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;

    .line 8
    .line 9
    const-string v0, "OnLayoutEvent"

    .line 10
    .line 11
    sget-object v1, Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;->WARNING:Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogger;->assertLegacyArchitecture(Ljava/lang/String;Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, LH0/f;

    .line 17
    .line 18
    const/16 v1, 0x14

    .line 19
    .line 20
    invoke-direct {v0, v1}, LH0/f;-><init>(I)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->EVENTS_POOL:LH0/f;

    .line 24
    .line 25
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
    invoke-direct {p0}, Lcom/facebook/react/uimanager/OnLayoutEvent;-><init>()V

    return-void
.end method

.method public static final synthetic access$getEVENTS_POOL$cp()LH0/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->EVENTS_POOL:LH0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic getHeight$ReactAndroid_release$annotations()V
    .locals 0
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getWidth$ReactAndroid_release$annotations()V
    .locals 0
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getX$ReactAndroid_release$annotations()V
    .locals 0
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getY$ReactAndroid_release$annotations()V
    .locals 0
    .annotation runtime Lcom/facebook/react/common/annotations/VisibleForTesting;
    .end annotation

    .line 1
    return-void
.end method

.method public static final obtain(IIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;
    .locals 6

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->Companion:Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;->obtain(IIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;

    move-result-object p0

    return-object p0
.end method

.method public static final obtain(IIIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;
    .locals 7

    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->Companion:Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-virtual/range {v0 .. v6}, Lcom/facebook/react/uimanager/OnLayoutEvent$Companion;->obtain(IIIIII)Lcom/facebook/react/uimanager/OnLayoutEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method protected getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 5

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->x:I

    .line 11
    .line 12
    int-to-float v2, v2

    .line 13
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    float-to-double v2, v2

    .line 18
    const-string v4, "x"

    .line 19
    .line 20
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 21
    .line 22
    .line 23
    iget v2, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->y:I

    .line 24
    .line 25
    int-to-float v2, v2

    .line 26
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    float-to-double v2, v2

    .line 31
    const-string v4, "y"

    .line 32
    .line 33
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 34
    .line 35
    .line 36
    iget v2, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->width:I

    .line 37
    .line 38
    int-to-float v2, v2

    .line 39
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    float-to-double v2, v2

    .line 44
    const-string v4, "width"

    .line 45
    .line 46
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 47
    .line 48
    .line 49
    iget v2, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->height:I

    .line 50
    .line 51
    int-to-float v2, v2

    .line 52
    invoke-static {v2}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    float-to-double v2, v2

    .line 57
    const-string v4, "height"

    .line 58
    .line 59
    invoke-virtual {v1, v4, v2, v3}, Lcom/facebook/react/bridge/ReadableMapBuilder;->put(Ljava/lang/String;D)V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    const-string v2, "layout"

    .line 67
    .line 68
    invoke-interface {v1, v2, v0}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "target"

    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    invoke-interface {v1, v0, v2}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 78
    .line 79
    .line 80
    return-object v1
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "topLayout"

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeight$ReactAndroid_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->height:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWidth$ReactAndroid_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->width:I

    .line 2
    .line 3
    return v0
.end method

.method public final getX$ReactAndroid_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final getY$ReactAndroid_release()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->y:I

    .line 2
    .line 3
    return v0
.end method

.method protected final init(IIIIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;->init(II)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->x:I

    .line 5
    .line 6
    iput p4, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->y:I

    .line 7
    .line 8
    iput p5, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->width:I

    .line 9
    .line 10
    iput p6, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->height:I

    .line 11
    .line 12
    return-void
.end method

.method public onDispose()V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/OnLayoutEvent;->EVENTS_POOL:LH0/f;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, LH0/f;->release(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setHeight$ReactAndroid_release(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->height:I

    .line 2
    .line 3
    return-void
.end method

.method public final setWidth$ReactAndroid_release(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->width:I

    .line 2
    .line 3
    return-void
.end method

.method public final setX$ReactAndroid_release(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->x:I

    .line 2
    .line 3
    return-void
.end method

.method public final setY$ReactAndroid_release(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/facebook/react/uimanager/OnLayoutEvent;->y:I

    .line 2
    .line 3
    return-void
.end method
