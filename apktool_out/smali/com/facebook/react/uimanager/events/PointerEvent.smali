.class public final Lcom/facebook/react/uimanager/events/PointerEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/events/PointerEvent$Companion;,
        Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/uimanager/events/PointerEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 :2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0002;:B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fH\u0017\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008#\u0010\u0003J\u000f\u0010$\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u0017\u0010\'\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(R\u0018\u0010)\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010+\u001a\u00020\u00048\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008+\u0010,R\u0016\u0010\r\u001a\u00020\u000c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\r\u0010-R\u001e\u0010.\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u0010\t\u001a\u00020\u00088\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\t\u00100R\u001b\u00106\u001a\u0002018VX\u0096\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00082\u00103\u001a\u0004\u00084\u00105R\u0014\u00108\u001a\u0002078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00088\u00109\u00a8\u0006<"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/events/PointerEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "<init>",
        "()V",
        "",
        "eventName",
        "",
        "targetTag",
        "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;",
        "eventState",
        "Landroid/view/MotionEvent;",
        "motionEventToCopy",
        "",
        "coalescingKey",
        "Li7/B;",
        "init",
        "(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)V",
        "",
        "Lcom/facebook/react/bridge/WritableMap;",
        "createW3CPointerEvents",
        "()Ljava/util/List;",
        "pointerEvent",
        "modifierKeyMask",
        "addModifierKeyData",
        "(Lcom/facebook/react/bridge/WritableMap;I)V",
        "index",
        "createW3CPointerEvent",
        "(I)Lcom/facebook/react/bridge/WritableMap;",
        "createPointersEventData",
        "getEventName",
        "()Ljava/lang/String;",
        "Lcom/facebook/react/uimanager/events/RCTEventEmitter;",
        "rctEventEmitter",
        "dispatch",
        "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V",
        "onDispose",
        "getCoalescingKey",
        "()S",
        "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;",
        "dispatchModern",
        "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V",
        "motionEvent",
        "Landroid/view/MotionEvent;",
        "_eventName",
        "Ljava/lang/String;",
        "S",
        "pointersEventData",
        "Ljava/util/List;",
        "Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;",
        "Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;",
        "eventAnimationDriverMatchSpec$delegate",
        "Lkotlin/Lazy;",
        "getEventAnimationDriverMatchSpec",
        "()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;",
        "eventAnimationDriverMatchSpec",
        "",
        "isClickEvent",
        "()Z",
        "Companion",
        "PointerEventState",
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
.field public static final Companion:Lcom/facebook/react/uimanager/events/PointerEvent$Companion;

.field private static final EVENTS_POOL:LH0/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LH0/f;"
        }
    .end annotation
.end field

.field private static final POINTER_EVENTS_POOL_SIZE:I = 0x6

.field private static final TAG:Ljava/lang/String;

.field private static final UNSET_COALESCING_KEY:S = -0x1s


# instance fields
.field private _eventName:Ljava/lang/String;

.field private coalescingKey:S

.field private final eventAnimationDriverMatchSpec$delegate:Lkotlin/Lazy;

.field private eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

.field private motionEvent:Landroid/view/MotionEvent;

.field private pointersEventData:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lcom/facebook/react/bridge/WritableMap;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/PointerEvent$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/events/PointerEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->Companion:Lcom/facebook/react/uimanager/events/PointerEvent$Companion;

    .line 8
    .line 9
    const-class v0, Lcom/facebook/react/uimanager/events/PointerEvent;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "getSimpleName(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->TAG:Ljava/lang/String;

    .line 21
    .line 22
    new-instance v0, LH0/f;

    .line 23
    .line 24
    const/4 v1, 0x6

    .line 25
    invoke-direct {v0, v1}, LH0/f;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->EVENTS_POOL:LH0/f;

    .line 29
    .line 30
    return-void
.end method

.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/Event;-><init>()V

    const/4 v0, -0x1

    .line 3
    iput-short v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->coalescingKey:S

    .line 4
    sget-object v0, Li7/l;->i:Li7/l;

    new-instance v1, Lcom/facebook/react/uimanager/events/h;

    invoke-direct {v1, p0}, Lcom/facebook/react/uimanager/events/h;-><init>(Lcom/facebook/react/uimanager/events/PointerEvent;)V

    invoke-static {v0, v1}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventAnimationDriverMatchSpec$delegate:Lkotlin/Lazy;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/PointerEvent;-><init>()V

    return-void
.end method

.method public static final synthetic access$getEVENTS_POOL$cp()LH0/f;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->EVENTS_POOL:LH0/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$init(Lcom/facebook/react/uimanager/events/PointerEvent;Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, Lcom/facebook/react/uimanager/events/PointerEvent;->init(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final addModifierKeyData(Lcom/facebook/react/bridge/WritableMap;I)V
    .locals 4

    .line 1
    and-int/lit16 v0, p2, 0x1000

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move v0, v2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    const-string v3, "ctrlKey"

    .line 11
    .line 12
    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, p2, 0x1

    .line 16
    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    move v0, v2

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move v0, v1

    .line 22
    :goto_1
    const-string v3, "shiftKey"

    .line 23
    .line 24
    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 25
    .line 26
    .line 27
    and-int/lit8 v0, p2, 0x2

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    move v0, v2

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    move v0, v1

    .line 34
    :goto_2
    const-string v3, "altKey"

    .line 35
    .line 36
    invoke-interface {p1, v3, v0}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    const/high16 v0, 0x10000

    .line 40
    .line 41
    and-int/2addr p2, v0

    .line 42
    if-eqz p2, :cond_3

    .line 43
    .line 44
    move v1, v2

    .line 45
    :cond_3
    const-string p2, "metaKey"

    .line 46
    .line 47
    invoke-interface {p1, p2, v1}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/uimanager/events/PointerEvent;ILjava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/facebook/react/uimanager/events/PointerEvent;->eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(Lcom/facebook/react/uimanager/events/PointerEvent;ILjava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic c(Lcom/facebook/react/uimanager/events/PointerEvent;)Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/facebook/react/uimanager/events/PointerEvent;->eventAnimationDriverMatchSpec_delegate$lambda$1(Lcom/facebook/react/uimanager/events/PointerEvent;)Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final createPointersEventData()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/WritableMap;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "_eventName"

    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    move-object v1, v2

    .line 20
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    sparse-switch v3, :sswitch_data_0

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_0
    const-string v3, "topPointerOut"

    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_1
    const-string v0, "topPointerCancel"

    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :sswitch_2
    const-string v3, "topClick"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_2

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :sswitch_3
    const-string v3, "topPointerUp"

    .line 56
    .line 57
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :sswitch_4
    const-string v3, "topPointerOver"

    .line 65
    .line 66
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_2

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :sswitch_5
    const-string v0, "topPointerMove"

    .line 74
    .line 75
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/PointerEvent;->createW3CPointerEvents()Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :sswitch_6
    const-string v3, "topPointerDown"

    .line 88
    .line 89
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_2

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :sswitch_7
    const-string v3, "topPointerLeave"

    .line 97
    .line 98
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-nez v1, :cond_2

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :sswitch_8
    const-string v3, "topPointerEnter"

    .line 106
    .line 107
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_2

    .line 112
    .line 113
    :goto_0
    return-object v2

    .line 114
    :cond_2
    invoke-direct {p0, v0}, Lcom/facebook/react/uimanager/events/PointerEvent;->createW3CPointerEvent(I)Lcom/facebook/react/bridge/WritableMap;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    invoke-static {v0}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v1, "Required value was null."

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :sswitch_data_0
    .sparse-switch
        -0x6a7c0b70 -> :sswitch_8
        -0x6a1dc391 -> :sswitch_7
        -0x4dc26016 -> :sswitch_6
        -0x4dbe48e7 -> :sswitch_5
        -0x4dbd47e4 -> :sswitch_4
        -0x3f7b441d -> :sswitch_3
        -0x3b225ecd -> :sswitch_2
        0x16d6f7c2 -> :sswitch_1
        0x5012ab06 -> :sswitch_0
    .end sparse-switch
.end method

.method private final createW3CPointerEvent(I)Lcom/facebook/react/bridge/WritableMap;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 10
    .line 11
    const-string v4, "Required value was null."

    .line 12
    .line 13
    if-eqz v3, :cond_10

    .line 14
    .line 15
    invoke-virtual {v3, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    const-string v6, "pointerId"

    .line 20
    .line 21
    int-to-double v7, v5

    .line 22
    invoke-interface {v2, v6, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v1}, Landroid/view/MotionEvent;->getToolType(I)I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    invoke-static {v6}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->getW3CPointerType(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const-string v7, "pointerType"

    .line 34
    .line 35
    invoke-interface {v2, v7, v6}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/PointerEvent;->isClickEvent()Z

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x1

    .line 43
    const/4 v9, 0x0

    .line 44
    const-string v10, "eventState"

    .line 45
    .line 46
    if-nez v7, :cond_3

    .line 47
    .line 48
    iget-object v7, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 49
    .line 50
    if-nez v7, :cond_0

    .line 51
    .line 52
    invoke-static {v10}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    :cond_0
    invoke-virtual {v7, v5}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->supportsHover(I)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_2

    .line 61
    .line 62
    iget-object v7, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 63
    .line 64
    if-nez v7, :cond_1

    .line 65
    .line 66
    invoke-static {v10}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    :cond_1
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getPrimaryPointerId()I

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-ne v5, v7, :cond_3

    .line 75
    .line 76
    :cond_2
    move v7, v8

    .line 77
    goto :goto_0

    .line 78
    :cond_3
    move v7, v9

    .line 79
    :goto_0
    const-string v12, "isPrimary"

    .line 80
    .line 81
    invoke-interface {v2, v12, v7}, Lcom/facebook/react/bridge/WritableMap;->putBoolean(Ljava/lang/String;Z)V

    .line 82
    .line 83
    .line 84
    iget-object v7, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 85
    .line 86
    if-nez v7, :cond_4

    .line 87
    .line 88
    invoke-static {v10}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    const/4 v7, 0x0

    .line 92
    :cond_4
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getEventCoordinatesByPointerId()Ljava/util/Map;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object v12

    .line 100
    invoke-interface {v7, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    if-eqz v7, :cond_f

    .line 105
    .line 106
    check-cast v7, [F

    .line 107
    .line 108
    aget v12, v7, v9

    .line 109
    .line 110
    invoke-static {v12}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    float-to-double v12, v12

    .line 115
    aget v7, v7, v8

    .line 116
    .line 117
    invoke-static {v7}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 118
    .line 119
    .line 120
    move-result v7

    .line 121
    float-to-double v14, v7

    .line 122
    const-string v7, "clientX"

    .line 123
    .line 124
    invoke-interface {v2, v7, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 125
    .line 126
    .line 127
    const-string v7, "clientY"

    .line 128
    .line 129
    invoke-interface {v2, v7, v14, v15}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 130
    .line 131
    .line 132
    iget-object v7, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 133
    .line 134
    if-nez v7, :cond_5

    .line 135
    .line 136
    invoke-static {v10}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 v7, 0x0

    .line 140
    :cond_5
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getScreenCoordinatesByPointerId()Ljava/util/Map;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    move/from16 v16, v8

    .line 145
    .line 146
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    if-eqz v7, :cond_e

    .line 155
    .line 156
    check-cast v7, [F

    .line 157
    .line 158
    aget v8, v7, v9

    .line 159
    .line 160
    invoke-static {v8}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    move/from16 v17, v9

    .line 165
    .line 166
    move-object/from16 v18, v10

    .line 167
    .line 168
    float-to-double v9, v8

    .line 169
    aget v7, v7, v16

    .line 170
    .line 171
    invoke-static {v7}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    float-to-double v7, v7

    .line 176
    const-string v11, "screenX"

    .line 177
    .line 178
    invoke-interface {v2, v11, v9, v10}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 179
    .line 180
    .line 181
    const-string v9, "screenY"

    .line 182
    .line 183
    invoke-interface {v2, v9, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 184
    .line 185
    .line 186
    const-string v7, "x"

    .line 187
    .line 188
    invoke-interface {v2, v7, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 189
    .line 190
    .line 191
    const-string v7, "y"

    .line 192
    .line 193
    invoke-interface {v2, v7, v14, v15}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 194
    .line 195
    .line 196
    const-string v7, "pageX"

    .line 197
    .line 198
    invoke-interface {v2, v7, v12, v13}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 199
    .line 200
    .line 201
    const-string v7, "pageY"

    .line 202
    .line 203
    invoke-interface {v2, v7, v14, v15}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 204
    .line 205
    .line 206
    iget-object v7, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 207
    .line 208
    if-nez v7, :cond_6

    .line 209
    .line 210
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    const/4 v7, 0x0

    .line 214
    :cond_6
    invoke-virtual {v7}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getOffsetByPointerId()Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v5

    .line 222
    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v5

    .line 226
    if-eqz v5, :cond_d

    .line 227
    .line 228
    check-cast v5, [F

    .line 229
    .line 230
    aget v4, v5, v17

    .line 231
    .line 232
    invoke-static {v4}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 233
    .line 234
    .line 235
    move-result v4

    .line 236
    float-to-double v7, v4

    .line 237
    const-string v4, "offsetX"

    .line 238
    .line 239
    invoke-interface {v2, v4, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 240
    .line 241
    .line 242
    aget v4, v5, v16

    .line 243
    .line 244
    invoke-static {v4}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 245
    .line 246
    .line 247
    move-result v4

    .line 248
    float-to-double v4, v4

    .line 249
    const-string v7, "offsetY"

    .line 250
    .line 251
    invoke-interface {v2, v7, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 252
    .line 253
    .line 254
    const-string v4, "target"

    .line 255
    .line 256
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 261
    .line 262
    .line 263
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/events/Event;->getTimestampMs()J

    .line 264
    .line 265
    .line 266
    move-result-wide v4

    .line 267
    long-to-double v4, v4

    .line 268
    const-string v7, "timestamp"

    .line 269
    .line 270
    invoke-interface {v2, v7, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 271
    .line 272
    .line 273
    const-string v4, "detail"

    .line 274
    .line 275
    move/from16 v5, v17

    .line 276
    .line 277
    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 278
    .line 279
    .line 280
    const-string v4, "tiltX"

    .line 281
    .line 282
    const-wide/16 v7, 0x0

    .line 283
    .line 284
    invoke-interface {v2, v4, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 285
    .line 286
    .line 287
    const-string v4, "tiltY"

    .line 288
    .line 289
    invoke-interface {v2, v4, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 290
    .line 291
    .line 292
    const-string v4, "twist"

    .line 293
    .line 294
    invoke-interface {v2, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 295
    .line 296
    .line 297
    const-string v4, "mouse"

    .line 298
    .line 299
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    const-string v5, "height"

    .line 304
    .line 305
    const-string v9, "width"

    .line 306
    .line 307
    if-nez v4, :cond_8

    .line 308
    .line 309
    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/PointerEvent;->isClickEvent()Z

    .line 310
    .line 311
    .line 312
    move-result v4

    .line 313
    if-eqz v4, :cond_7

    .line 314
    .line 315
    goto :goto_1

    .line 316
    :cond_7
    invoke-virtual {v3, v1}, Landroid/view/MotionEvent;->getTouchMajor(I)F

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    float-to-double v10, v1

    .line 325
    invoke-interface {v2, v9, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 326
    .line 327
    .line 328
    invoke-interface {v2, v5, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 329
    .line 330
    .line 331
    goto :goto_2

    .line 332
    :cond_8
    :goto_1
    const-wide/high16 v10, 0x3ff0000000000000L    # 1.0

    .line 333
    .line 334
    invoke-interface {v2, v9, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 335
    .line 336
    .line 337
    invoke-interface {v2, v5, v10, v11}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 338
    .line 339
    .line 340
    :goto_2
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getButtonState()I

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    iget-object v4, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 345
    .line 346
    if-nez v4, :cond_9

    .line 347
    .line 348
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 349
    .line 350
    .line 351
    const/4 v4, 0x0

    .line 352
    :cond_9
    invoke-virtual {v4}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getLastButtonState()I

    .line 353
    .line 354
    .line 355
    move-result v4

    .line 356
    invoke-static {v6, v4, v1}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->getButtonChange(Ljava/lang/String;II)I

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    const-string v5, "button"

    .line 361
    .line 362
    invoke-interface {v2, v5, v4}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 363
    .line 364
    .line 365
    iget-object v4, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 366
    .line 367
    const-string v5, "_eventName"

    .line 368
    .line 369
    if-nez v4, :cond_a

    .line 370
    .line 371
    invoke-static {v5}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 372
    .line 373
    .line 374
    const/4 v4, 0x0

    .line 375
    :cond_a
    invoke-static {v4, v6, v1}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->getButtons(Ljava/lang/String;Ljava/lang/String;I)I

    .line 376
    .line 377
    .line 378
    move-result v1

    .line 379
    const-string v4, "buttons"

    .line 380
    .line 381
    invoke-interface {v2, v4, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 382
    .line 383
    .line 384
    invoke-direct {v0}, Lcom/facebook/react/uimanager/events/PointerEvent;->isClickEvent()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_b

    .line 389
    .line 390
    move-wide v4, v7

    .line 391
    goto :goto_4

    .line 392
    :cond_b
    invoke-interface {v2, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 393
    .line 394
    .line 395
    move-result v1

    .line 396
    iget-object v4, v0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 397
    .line 398
    if-nez v4, :cond_c

    .line 399
    .line 400
    invoke-static {v5}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    const/4 v11, 0x0

    .line 404
    goto :goto_3

    .line 405
    :cond_c
    move-object v11, v4

    .line 406
    :goto_3
    invoke-static {v1, v11}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->getPressure(ILjava/lang/String;)D

    .line 407
    .line 408
    .line 409
    move-result-wide v4

    .line 410
    :goto_4
    const-string v1, "pressure"

    .line 411
    .line 412
    invoke-interface {v2, v1, v4, v5}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 413
    .line 414
    .line 415
    const-string v1, "tangentialPressure"

    .line 416
    .line 417
    invoke-interface {v2, v1, v7, v8}, Lcom/facebook/react/bridge/WritableMap;->putDouble(Ljava/lang/String;D)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v3}, Landroid/view/MotionEvent;->getMetaState()I

    .line 421
    .line 422
    .line 423
    move-result v1

    .line 424
    invoke-direct {v0, v2, v1}, Lcom/facebook/react/uimanager/events/PointerEvent;->addModifierKeyData(Lcom/facebook/react/bridge/WritableMap;I)V

    .line 425
    .line 426
    .line 427
    return-object v2

    .line 428
    :cond_d
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 429
    .line 430
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    throw v1

    .line 434
    :cond_e
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 435
    .line 436
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 437
    .line 438
    .line 439
    throw v1

    .line 440
    :cond_f
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 441
    .line 442
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    throw v1

    .line 446
    :cond_10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 447
    .line 448
    invoke-direct {v1, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v1
.end method

.method private final createW3CPointerEvents()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/bridge/WritableMap;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 7
    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    :goto_0
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0, v2}, Lcom/facebook/react/uimanager/events/PointerEvent;->createW3CPointerEvent(I)Lcom/facebook/react/bridge/WritableMap;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    add-int/lit8 v2, v2, 0x1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-object v0

    .line 28
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 29
    .line 30
    const-string v1, "Required value was null."

    .line 31
    .line 32
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method private static final eventAnimationDriverMatchSpec_delegate$lambda$1(Lcom/facebook/react/uimanager/events/PointerEvent;)Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;
    .locals 1

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/events/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/events/g;-><init>(Lcom/facebook/react/uimanager/events/PointerEvent;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static final eventAnimationDriverMatchSpec_delegate$lambda$1$lambda$0(Lcom/facebook/react/uimanager/events/PointerEvent;ILjava/lang/String;)Z
    .locals 3

    .line 1
    const-string v0, "eventName"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const-string v0, "_eventName"

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    move-object v0, v1

    .line 17
    :cond_0
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v2, 0x0

    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    invoke-static {p2}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->isBubblingEvent(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    const/4 v0, 0x1

    .line 30
    if-eqz p2, :cond_5

    .line 31
    .line 32
    iget-object p0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 33
    .line 34
    if-nez p0, :cond_2

    .line 35
    .line 36
    const-string p0, "eventState"

    .line 37
    .line 38
    invoke-static {p0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    move-object v1, p0

    .line 43
    :goto_0
    invoke-virtual {v1}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getHitPathForActivePointer()Ljava/util/List;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p2

    .line 55
    if-eqz p2, :cond_4

    .line 56
    .line 57
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    check-cast p2, Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;

    .line 62
    .line 63
    invoke-virtual {p2}, Lcom/facebook/react/uimanager/TouchTargetHelper$ViewTarget;->getViewId()I

    .line 64
    .line 65
    .line 66
    move-result p2

    .line 67
    if-ne p2, p1, :cond_3

    .line 68
    .line 69
    return v0

    .line 70
    :cond_4
    return v2

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    if-ne p0, p1, :cond_6

    .line 76
    .line 77
    return v0

    .line 78
    :cond_6
    return v2
.end method

.method private final init(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)V
    .locals 3

    .line 1
    invoke-virtual {p3}, Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;->getSurfaceId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p4}, Landroid/view/MotionEvent;->getEventTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-super {p0, v0, p2, v1, v2}, Lcom/facebook/react/uimanager/events/Event;->init(IIJ)V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {p4}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 19
    .line 20
    iput-short p5, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->coalescingKey:S

    .line 21
    .line 22
    iput-object p3, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventState:Lcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;

    .line 23
    .line 24
    return-void
.end method

.method private final isClickEvent()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "_eventName"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    const-string v1, "topClick"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    return v0
.end method

.method public static final obtain(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/PointerEvent;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->Companion:Lcom/facebook/react/uimanager/events/PointerEvent$Companion;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/facebook/react/uimanager/events/PointerEvent$Companion;->obtain(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;)Lcom/facebook/react/uimanager/events/PointerEvent;

    move-result-object p0

    return-object p0
.end method

.method public static final obtain(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/PointerEvent;
    .locals 6

    .line 2
    sget-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->Companion:Lcom/facebook/react/uimanager/events/PointerEvent$Companion;

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/facebook/react/uimanager/events/PointerEvent$Companion;->obtain(Ljava/lang/String;ILcom/facebook/react/uimanager/events/PointerEvent$PointerEventState;Landroid/view/MotionEvent;S)Lcom/facebook/react/uimanager/events/PointerEvent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 5

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/facebook/react/uimanager/events/PointerEvent;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/PointerEvent;->createPointersEventData()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    if-le v1, v2, :cond_3

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_3
    const/4 v2, 0x0

    .line 47
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_6

    .line 56
    .line 57
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Lcom/facebook/react/bridge/WritableMap;

    .line 62
    .line 63
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-interface {v1}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_4
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 74
    .line 75
    if-nez v4, :cond_5

    .line 76
    .line 77
    const-string v4, "_eventName"

    .line 78
    .line 79
    invoke-static {v4}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    const/4 v4, 0x0

    .line 83
    :cond_5
    invoke-interface {p1, v3, v4, v1}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    :goto_2
    return-void
.end method

.method public dispatchModern(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V
    .locals 13

    .line 1
    const-string v0, "rctEventEmitter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object p1, Lcom/facebook/react/uimanager/events/PointerEvent;->TAG:Ljava/lang/String;

    .line 11
    .line 12
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "Cannot dispatch a Pointer that has no MotionEvent; the PointerEvent has been recycled"

    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    invoke-direct {p0}, Lcom/facebook/react/uimanager/events/PointerEvent;->createPointersEventData()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    goto :goto_4

    .line 38
    :cond_2
    if-eqz v0, :cond_9

    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    const/4 v2, 0x0

    .line 45
    const/4 v3, 0x1

    .line 46
    if-le v1, v3, :cond_3

    .line 47
    .line 48
    move v1, v3

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    move v1, v2

    .line 51
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    if-eqz v4, :cond_8

    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    check-cast v4, Lcom/facebook/react/bridge/WritableMap;

    .line 66
    .line 67
    if-eqz v1, :cond_4

    .line 68
    .line 69
    invoke-interface {v4}, Lcom/facebook/react/bridge/WritableMap;->copy()Lcom/facebook/react/bridge/WritableMap;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    :cond_4
    move-object v11, v4

    .line 74
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getSurfaceId()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/events/Event;->getViewTag()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    iget-object v4, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    const-string v8, "_eventName"

    .line 86
    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    invoke-static {v8}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    move-object v4, v5

    .line 93
    :cond_5
    iget-short v10, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->coalescingKey:S

    .line 94
    .line 95
    const/4 v9, -0x1

    .line 96
    if-eq v10, v9, :cond_6

    .line 97
    .line 98
    move v9, v3

    .line 99
    goto :goto_2

    .line 100
    :cond_6
    move v9, v2

    .line 101
    :goto_2
    iget-object v12, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 102
    .line 103
    if-nez v12, :cond_7

    .line 104
    .line 105
    invoke-static {v8}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    move-object v5, v12

    .line 110
    :goto_3
    invoke-static {v5}, Lcom/facebook/react/uimanager/events/PointerEventHelper;->getEventCategory(Ljava/lang/String;)I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    move-object v5, p1

    .line 115
    move-object v8, v4

    .line 116
    invoke-interface/range {v5 .. v12}, Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;->receiveEvent(IILjava/lang/String;ZILcom/facebook/react/bridge/WritableMap;I)V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_8
    :goto_4
    return-void

    .line 121
    :cond_9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 122
    .line 123
    const-string v0, "Required value was null."

    .line 124
    .line 125
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    throw p1
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    iget-short v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->coalescingKey:S

    .line 2
    .line 3
    return v0
.end method

.method public getEventAnimationDriverMatchSpec()Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->eventAnimationDriverMatchSpec$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/facebook/react/uimanager/events/Event$EventAnimationDriverMatchSpec;

    .line 8
    .line 9
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->_eventName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "_eventName"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method

.method public onDispose()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->pointersEventData:Ljava/util/List;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/uimanager/events/PointerEvent;->motionEvent:Landroid/view/MotionEvent;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Landroid/view/MotionEvent;->recycle()V

    .line 11
    .line 12
    .line 13
    :cond_0
    :try_start_0
    sget-object v0, Lcom/facebook/react/uimanager/events/PointerEvent;->EVENTS_POOL:LH0/f;

    .line 14
    .line 15
    invoke-virtual {v0, p0}, LH0/f;->release(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :catch_0
    move-exception v0

    .line 20
    sget-object v1, Lcom/facebook/react/uimanager/events/PointerEvent;->TAG:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
