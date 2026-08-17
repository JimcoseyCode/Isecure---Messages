.class public Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;
.super Landroidx/customview/widget/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityActionEvent;,
        Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;,
        Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;,
        Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Role;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\n\u0002\u0010!\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0016\u0018\u0000 =2\u00020\u0001:\u0004>?@=B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J)\u0010\u0019\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0014\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001d\u0010\"\u001a\u00020\u000b2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00060 H\u0014\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010&\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008&\u0010\'J)\u0010)\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00062\u0008\u0010(\u001a\u0004\u0018\u00010\u0017H\u0014\u00a2\u0006\u0004\u0008)\u0010*J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008,\u0010-J\u0019\u0010.\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\u0002H\u0004\u00a2\u0006\u0004\u0008.\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u00101R\u001a\u00103\u001a\u0002028\u0002X\u0082\u0004\u00a2\u0006\u000c\n\u0004\u00083\u00104\u0012\u0004\u00085\u00106R4\u0010:\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010807j\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u000108`98\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010/\u00a8\u0006A"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;",
        "Landroidx/customview/widget/a;",
        "Landroid/view/View;",
        "hostView",
        "",
        "originalFocus",
        "",
        "originalImportantForAccessibility",
        "<init>",
        "(Landroid/view/View;ZI)V",
        "host",
        "Li7/B;",
        "scheduleAccessibilityEventSender",
        "(Landroid/view/View;)V",
        "LI0/z;",
        "info",
        "onInitializeAccessibilityNodeInfo",
        "(Landroid/view/View;LI0/z;)V",
        "Landroid/view/accessibility/AccessibilityEvent;",
        "event",
        "onInitializeAccessibilityEvent",
        "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V",
        "action",
        "Landroid/os/Bundle;",
        "args",
        "performAccessibilityAction",
        "(Landroid/view/View;ILandroid/os/Bundle;)Z",
        "",
        "x",
        "y",
        "getVirtualViewAt",
        "(FF)I",
        "",
        "virtualViewIds",
        "getVisibleVirtualViews",
        "(Ljava/util/List;)V",
        "virtualViewId",
        "node",
        "onPopulateNodeForVirtualView",
        "(ILI0/z;)V",
        "arguments",
        "onPerformActionForVirtualView",
        "(IILandroid/os/Bundle;)Z",
        "LI0/A;",
        "getAccessibilityNodeProvider",
        "(Landroid/view/View;)LI0/A;",
        "superGetAccessibilityNodeProvider",
        "Landroid/view/View;",
        "getHostView",
        "()Landroid/view/View;",
        "Landroid/os/Handler;",
        "accessibilityEventHandler",
        "Landroid/os/Handler;",
        "getAccessibilityEventHandler$annotations",
        "()V",
        "Ljava/util/HashMap;",
        "",
        "Lkotlin/collections/HashMap;",
        "accessibilityActionsMap",
        "Ljava/util/HashMap;",
        "accessibilityLabelledBy",
        "Companion",
        "Role",
        "AccessibilityActionEvent",
        "AccessibilityRole",
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
.field public static final Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

.field private static final SEND_EVENT:I = 0x1

.field private static final STATE_CHECKED:Ljava/lang/String; = "checked"

.field private static final STATE_DISABLED:Ljava/lang/String; = "disabled"

.field private static final STATE_SELECTED:Ljava/lang/String; = "selected"

.field private static final TAG:Ljava/lang/String; = "ReactAccessibilityDelegate"

.field private static final TIMEOUT_SEND_ACCESSIBILITY_EVENT:I = 0xc8

.field public static final TOP_ACCESSIBILITY_ACTION_EVENT:Ljava/lang/String; = "topAccessibilityAction"

.field private static final actionIdMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static customActionCounter:I = 0x0

.field private static final customActionIdMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private static final delimiter:Ljava/lang/String; = ", "

.field private static final delimiterLength:I = 0x2


# instance fields
.field private final accessibilityActionsMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Integer;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final accessibilityEventHandler:Landroid/os/Handler;

.field private accessibilityLabelledBy:Landroid/view/View;

.field private final hostView:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 8
    .line 9
    sget-object v0, LI0/z$a;->i:LI0/z$a;

    .line 10
    .line 11
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const-string v1, "activate"

    .line 20
    .line 21
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    sget-object v0, LI0/z$a;->j:LI0/z$a;

    .line 26
    .line 27
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const-string v1, "longpress"

    .line 36
    .line 37
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    sget-object v0, LI0/z$a;->q:LI0/z$a;

    .line 42
    .line 43
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "increment"

    .line 52
    .line 53
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    sget-object v0, LI0/z$a;->r:LI0/z$a;

    .line 58
    .line 59
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    const-string v1, "decrement"

    .line 68
    .line 69
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    sget-object v0, LI0/z$a;->w:LI0/z$a;

    .line 74
    .line 75
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    const-string v1, "expand"

    .line 84
    .line 85
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    sget-object v0, LI0/z$a;->x:LI0/z$a;

    .line 90
    .line 91
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-string v1, "collapse"

    .line 100
    .line 101
    invoke-static {v1, v0}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    filled-new-array/range {v2 .. v7}, [Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lj7/K;->l([Lkotlin/Pair;)Ljava/util/Map;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    sput-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->actionIdMap:Ljava/util/Map;

    .line 114
    .line 115
    const/high16 v0, 0x3f000000    # 0.5f

    .line 116
    .line 117
    sput v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->customActionCounter:I

    .line 118
    .line 119
    new-instance v0, Ljava/util/HashMap;

    .line 120
    .line 121
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 122
    .line 123
    .line 124
    sput-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->customActionIdMap:Ljava/util/Map;

    .line 125
    .line 126
    return-void
.end method

.method public constructor <init>(Landroid/view/View;ZI)V
    .locals 1

    .line 1
    const-string v0, "hostView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/customview/widget/a;-><init>(Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->hostView:Landroid/view/View;

    .line 10
    .line 11
    new-instance v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$accessibilityEventHandler$1;

    .line 12
    .line 13
    invoke-direct {v0}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$accessibilityEventHandler$1;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityEventHandler:Landroid/os/Handler;

    .line 17
    .line 18
    new-instance v0, Ljava/util/HashMap;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityActionsMap:Ljava/util/HashMap;

    .line 24
    .line 25
    invoke-virtual {p1, p2}, Landroid/view/View;->setFocusable(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p3}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final createNodeInfoFromView(Landroid/view/View;)LI0/z;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->createNodeInfoFromView(Landroid/view/View;)LI0/z;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method private static synthetic getAccessibilityEventHandler$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static final getTalkbackDescription(Landroid/view/View;LI0/z;)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->getTalkbackDescription(Landroid/view/View;LI0/z;)Ljava/lang/CharSequence;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static final hasNonActionableSpeakingDescendants(LI0/z;Landroid/view/View;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->hasNonActionableSpeakingDescendants(LI0/z;Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final hasText(LI0/z;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->hasText(LI0/z;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final hasValidRangeInfo(LI0/z;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->hasValidRangeInfo(LI0/z;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final isAccessibilityFocusable(LI0/z;Landroid/view/View;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->isAccessibilityFocusable(LI0/z;Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final isActionableForAccessibility(LI0/z;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->isActionableForAccessibility(LI0/z;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final isSpeakingNode(LI0/z;Landroid/view/View;)Z
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->isSpeakingNode(LI0/z;Landroid/view/View;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static final resetDelegate(Landroid/view/View;ZI)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->resetDelegate(Landroid/view/View;ZI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final scheduleAccessibilityEventSender(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityEventHandler:Landroid/os/Handler;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityEventHandler:Landroid/os/Handler;

    .line 11
    .line 12
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityEventHandler:Landroid/os/Handler;

    .line 16
    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    const-string v0, "obtainMessage(...)"

    .line 22
    .line 23
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityEventHandler:Landroid/os/Handler;

    .line 27
    .line 28
    const-wide/16 v1, 0xc8

    .line 29
    .line 30
    invoke-virtual {v0, p1, v1, v2}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final setDelegate(Landroid/view/View;ZI)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->setDelegate(Landroid/view/View;ZI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final setRole(LI0/z;Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->setRole(LI0/z;Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getAccessibilityNodeProvider(Landroid/view/View;)LI0/A;
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method protected final getHostView()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->hostView:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method protected getVirtualViewAt(FF)I
    .locals 0

    .line 1
    const/high16 p1, -0x80000000

    .line 2
    .line 3
    return p1
.end method

.method protected getVisibleVirtualViews(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "virtualViewIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 4

    .line 1
    const-string v0, "host"

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
    invoke-super {p0, p1, p2}, Landroidx/customview/widget/a;->onInitializeAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/facebook/react/R$id;->accessibility_value:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    check-cast p1, Lcom/facebook/react/bridge/ReadableMap;

    .line 21
    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    const-string v0, "min"

    .line 25
    .line 26
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    const-string v1, "now"

    .line 33
    .line 34
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    const-string v2, "max"

    .line 41
    .line 42
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    invoke-interface {p1, v0}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {p1, v1}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {p1, v2}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 65
    .line 66
    if-ne v2, v3, :cond_0

    .line 67
    .line 68
    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    if-ne v2, v3, :cond_0

    .line 73
    .line 74
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 75
    .line 76
    .line 77
    move-result-object v2

    .line 78
    if-ne v2, v3, :cond_0

    .line 79
    .line 80
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    invoke-interface {v1}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    invoke-interface {p1}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    if-le p1, v0, :cond_0

    .line 93
    .line 94
    if-lt v1, v0, :cond_0

    .line 95
    .line 96
    if-lt p1, v1, :cond_0

    .line 97
    .line 98
    sub-int/2addr p1, v0

    .line 99
    invoke-virtual {p2, p1}, Landroid/view/accessibility/AccessibilityRecord;->setItemCount(I)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p2, v1}, Landroid/view/accessibility/AccessibilityRecord;->setCurrentItemIndex(I)V

    .line 103
    .line 104
    .line 105
    :cond_0
    return-void
.end method

.method public onInitializeAccessibilityNodeInfo(Landroid/view/View;LI0/z;)V
    .locals 12

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "info"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1, p2}, Landroidx/customview/widget/a;->onInitializeAccessibilityNodeInfo(Landroid/view/View;LI0/z;)V

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/facebook/react/R$id;->accessibility_state_expanded:I

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget v0, Lcom/facebook/react/R$id;->accessibility_state_expanded:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "null cannot be cast to non-null type kotlin.Boolean"

    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v0, Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    const/high16 v0, 0x80000

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    const/high16 v0, 0x40000

    .line 45
    .line 46
    :goto_0
    invoke-virtual {p2, v0}, LI0/z;->a(I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole$Companion;

    .line 50
    .line 51
    invoke-virtual {v0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole$Companion;->fromViewTag(Landroid/view/View;)Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sget v1, Lcom/facebook/react/R$id;->accessibility_hint:I

    .line 56
    .line 57
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/String;

    .line 62
    .line 63
    if-eqz v0, :cond_2

    .line 64
    .line 65
    sget-object v2, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v4, "getContext(...)"

    .line 72
    .line 73
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2, v0, v3}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->setRole(LI0/z;Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;Landroid/content/Context;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    if-eqz v1, :cond_3

    .line 80
    .line 81
    invoke-virtual {p2, v1}, LI0/z;->Y0(Ljava/lang/CharSequence;)V

    .line 82
    .line 83
    .line 84
    :cond_3
    sget v1, Lcom/facebook/react/R$id;->labelled_by:I

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    invoke-virtual {p1}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const-string v3, "getRootView(...)"

    .line 97
    .line 98
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    move-object v3, v1

    .line 102
    check-cast v3, Ljava/lang/String;

    .line 103
    .line 104
    invoke-static {v2, v3}, Lcom/facebook/react/uimanager/util/ReactFindViewUtil;->findView(Landroid/view/View;Ljava/lang/String;)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    iput-object v2, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityLabelledBy:Landroid/view/View;

    .line 109
    .line 110
    if-eqz v2, :cond_4

    .line 111
    .line 112
    invoke-virtual {p2, v2}, LI0/z;->I0(Landroid/view/View;)V

    .line 113
    .line 114
    .line 115
    :cond_4
    sget v2, Lcom/facebook/react/R$id;->accessibility_state:I

    .line 116
    .line 117
    invoke-virtual {p1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Lcom/facebook/react/bridge/ReadableMap;

    .line 122
    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    sget-object v3, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 126
    .line 127
    invoke-static {v3, p2, v2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->access$setState(Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;LI0/z;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 128
    .line 129
    .line 130
    :cond_5
    sget v3, Lcom/facebook/react/R$id;->accessibility_actions:I

    .line 131
    .line 132
    invoke-virtual {p1, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    check-cast v3, Lcom/facebook/react/bridge/ReadableArray;

    .line 137
    .line 138
    sget v4, Lcom/facebook/react/R$id;->accessibility_collection_item:I

    .line 139
    .line 140
    invoke-virtual {p1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v4

    .line 144
    check-cast v4, Lcom/facebook/react/bridge/ReadableMap;

    .line 145
    .line 146
    if-eqz v4, :cond_6

    .line 147
    .line 148
    const-string v5, "rowIndex"

    .line 149
    .line 150
    invoke-interface {v4, v5}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    const-string v6, "columnIndex"

    .line 155
    .line 156
    invoke-interface {v4, v6}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v6

    .line 160
    const-string v7, "rowSpan"

    .line 161
    .line 162
    invoke-interface {v4, v7}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v7

    .line 166
    const-string v8, "columnSpan"

    .line 167
    .line 168
    invoke-interface {v4, v8}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result v8

    .line 172
    const-string v9, "heading"

    .line 173
    .line 174
    invoke-interface {v4, v9}, Lcom/facebook/react/bridge/ReadableMap;->getBoolean(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    invoke-static {v5, v7, v6, v8, v4}, LI0/z$g;->a(IIIIZ)LI0/z$g;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    invoke-virtual {p2, v4}, LI0/z;->z0(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_6
    const/4 v4, 0x0

    .line 186
    if-eqz v3, :cond_b

    .line 187
    .line 188
    invoke-interface {v3}, Lcom/facebook/react/bridge/ReadableArray;->size()I

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    move v6, v4

    .line 193
    :goto_1
    if-ge v6, v5, :cond_b

    .line 194
    .line 195
    invoke-interface {v3, v6}, Lcom/facebook/react/bridge/ReadableArray;->getMap(I)Lcom/facebook/react/bridge/ReadableMap;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    if-eqz v7, :cond_a

    .line 200
    .line 201
    const-string v8, "name"

    .line 202
    .line 203
    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 204
    .line 205
    .line 206
    move-result v9

    .line 207
    if-eqz v9, :cond_a

    .line 208
    .line 209
    invoke-interface {v7, v8}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    const-string v9, "label"

    .line 214
    .line 215
    invoke-interface {v7, v9}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v10

    .line 219
    if-eqz v10, :cond_7

    .line 220
    .line 221
    invoke-interface {v7, v9}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v7

    .line 225
    invoke-static {v7}, Lo3/a;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    check-cast v7, Ljava/lang/String;

    .line 230
    .line 231
    goto :goto_2

    .line 232
    :cond_7
    const-string v7, ""

    .line 233
    .line 234
    :goto_2
    sget-object v9, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->actionIdMap:Ljava/util/Map;

    .line 235
    .line 236
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v9

    .line 240
    check-cast v9, Ljava/lang/Integer;

    .line 241
    .line 242
    if-eqz v9, :cond_8

    .line 243
    .line 244
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 245
    .line 246
    .line 247
    move-result v9

    .line 248
    goto :goto_3

    .line 249
    :cond_8
    sget-object v9, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->customActionIdMap:Ljava/util/Map;

    .line 250
    .line 251
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v10

    .line 255
    if-nez v10, :cond_9

    .line 256
    .line 257
    sget v10, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->customActionCounter:I

    .line 258
    .line 259
    add-int/lit8 v11, v10, 0x1

    .line 260
    .line 261
    sput v11, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->customActionCounter:I

    .line 262
    .line 263
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 264
    .line 265
    .line 266
    move-result-object v10

    .line 267
    invoke-interface {v9, v8, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    :cond_9
    check-cast v10, Ljava/lang/Number;

    .line 271
    .line 272
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 273
    .line 274
    .line 275
    move-result v9

    .line 276
    :goto_3
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 277
    .line 278
    .line 279
    move-result-object v10

    .line 280
    iget-object v11, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityActionsMap:Ljava/util/HashMap;

    .line 281
    .line 282
    invoke-interface {v11, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    new-instance v8, LI0/z$a;

    .line 286
    .line 287
    invoke-direct {v8, v9, v7}, LI0/z$a;-><init>(ILjava/lang/CharSequence;)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {p2, v8}, LI0/z;->b(LI0/z$a;)V

    .line 291
    .line 292
    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 294
    .line 295
    goto :goto_1

    .line 296
    :cond_a
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 297
    .line 298
    const-string p2, "Unknown accessibility action."

    .line 299
    .line 300
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw p1

    .line 304
    :cond_b
    sget v5, Lcom/facebook/react/R$id;->accessibility_value:I

    .line 305
    .line 306
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    check-cast v5, Lcom/facebook/react/bridge/ReadableMap;

    .line 311
    .line 312
    if-eqz v5, :cond_c

    .line 313
    .line 314
    const-string v6, "min"

    .line 315
    .line 316
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    if-eqz v7, :cond_c

    .line 321
    .line 322
    const-string v7, "now"

    .line 323
    .line 324
    invoke-interface {v5, v7}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 325
    .line 326
    .line 327
    move-result v8

    .line 328
    if-eqz v8, :cond_c

    .line 329
    .line 330
    const-string v8, "max"

    .line 331
    .line 332
    invoke-interface {v5, v8}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 333
    .line 334
    .line 335
    move-result v9

    .line 336
    if-eqz v9, :cond_c

    .line 337
    .line 338
    invoke-interface {v5, v6}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 339
    .line 340
    .line 341
    move-result-object v6

    .line 342
    invoke-interface {v5, v7}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 343
    .line 344
    .line 345
    move-result-object v7

    .line 346
    invoke-interface {v5, v8}, Lcom/facebook/react/bridge/ReadableMap;->getDynamic(Ljava/lang/String;)Lcom/facebook/react/bridge/Dynamic;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    invoke-interface {v6}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 351
    .line 352
    .line 353
    move-result-object v8

    .line 354
    sget-object v9, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 355
    .line 356
    if-ne v8, v9, :cond_c

    .line 357
    .line 358
    invoke-interface {v7}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 359
    .line 360
    .line 361
    move-result-object v8

    .line 362
    if-ne v8, v9, :cond_c

    .line 363
    .line 364
    invoke-interface {v5}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 365
    .line 366
    .line 367
    move-result-object v8

    .line 368
    if-ne v8, v9, :cond_c

    .line 369
    .line 370
    invoke-interface {v6}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 371
    .line 372
    .line 373
    move-result v6

    .line 374
    invoke-interface {v7}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 375
    .line 376
    .line 377
    move-result v7

    .line 378
    invoke-interface {v5}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 379
    .line 380
    .line 381
    move-result v5

    .line 382
    if-le v5, v6, :cond_c

    .line 383
    .line 384
    if-lt v7, v6, :cond_c

    .line 385
    .line 386
    if-lt v5, v7, :cond_c

    .line 387
    .line 388
    int-to-float v6, v6

    .line 389
    int-to-float v5, v5

    .line 390
    int-to-float v7, v7

    .line 391
    invoke-static {v4, v6, v5, v7}, LI0/z$h;->d(IFFF)LI0/z$h;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-virtual {p2, v5}, LI0/z;->O0(LI0/z$h;)V

    .line 396
    .line 397
    .line 398
    :cond_c
    sget v5, Lcom/facebook/react/R$id;->react_test_id:I

    .line 399
    .line 400
    invoke-virtual {p1, v5}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v5

    .line 404
    check-cast v5, Ljava/lang/String;

    .line 405
    .line 406
    if-eqz v5, :cond_d

    .line 407
    .line 408
    invoke-virtual {p2, v5}, LI0/z;->a1(Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    :cond_d
    invoke-virtual {p2}, LI0/z;->w()Ljava/lang/CharSequence;

    .line 412
    .line 413
    .line 414
    move-result-object v5

    .line 415
    const/4 v6, 0x1

    .line 416
    if-eqz v5, :cond_f

    .line 417
    .line 418
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 419
    .line 420
    .line 421
    move-result v5

    .line 422
    if-nez v5, :cond_e

    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_e
    move v5, v4

    .line 426
    goto :goto_5

    .line 427
    :cond_f
    :goto_4
    move v5, v6

    .line 428
    :goto_5
    invoke-virtual {p2}, LI0/z;->J()Ljava/lang/CharSequence;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    if-eqz v7, :cond_11

    .line 433
    .line 434
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 435
    .line 436
    .line 437
    move-result v7

    .line 438
    if-nez v7, :cond_10

    .line 439
    .line 440
    goto :goto_6

    .line 441
    :cond_10
    move v7, v4

    .line 442
    goto :goto_7

    .line 443
    :cond_11
    :goto_6
    move v7, v6

    .line 444
    :goto_7
    if-eqz v5, :cond_12

    .line 445
    .line 446
    if-eqz v7, :cond_12

    .line 447
    .line 448
    move v5, v6

    .line 449
    goto :goto_8

    .line 450
    :cond_12
    move v5, v4

    .line 451
    :goto_8
    if-nez v3, :cond_13

    .line 452
    .line 453
    if-nez v2, :cond_13

    .line 454
    .line 455
    if-nez v1, :cond_13

    .line 456
    .line 457
    if-eqz v0, :cond_14

    .line 458
    .line 459
    :cond_13
    move v4, v6

    .line 460
    :cond_14
    if-eqz v5, :cond_15

    .line 461
    .line 462
    if-eqz v4, :cond_15

    .line 463
    .line 464
    sget-object v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->Companion:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;

    .line 465
    .line 466
    invoke-virtual {v0, p1, p2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$Companion;->getTalkbackDescription(Landroid/view/View;LI0/z;)Ljava/lang/CharSequence;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    invoke-virtual {p2, p1}, LI0/z;->A0(Ljava/lang/CharSequence;)V

    .line 471
    .line 472
    .line 473
    :cond_15
    return-void
.end method

.method protected onPerformActionForVirtualView(IILandroid/os/Bundle;)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method protected onPopulateNodeForVirtualView(ILI0/z;)V
    .locals 2

    .line 1
    const-string p1, "node"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, ""

    .line 7
    .line 8
    invoke-virtual {p2, p1}, LI0/z;->A0(Ljava/lang/CharSequence;)V

    .line 9
    .line 10
    .line 11
    new-instance p1, Landroid/graphics/Rect;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, v0, v0, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2, p1}, LI0/z;->s0(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z
    .locals 5

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/high16 v0, 0x80000

    .line 7
    .line 8
    if-ne p2, v0, :cond_0

    .line 9
    .line 10
    sget v0, Lcom/facebook/react/R$id;->accessibility_state_expanded:I

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/high16 v0, 0x40000

    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    sget v0, Lcom/facebook/react/R$id;->accessibility_state_expanded:I

    .line 22
    .line 23
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityActionsMap:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_7

    .line 39
    .line 40
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    iget-object v1, p0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->accessibilityActionsMap:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/String;

    .line 55
    .line 56
    const-string v2, "actionName"

    .line 57
    .line 58
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext"

    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    check-cast v1, Lcom/facebook/react/bridge/ReactContext;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/facebook/react/bridge/ReactContext;->hasActiveReactInstance()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_2

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    invoke-static {v1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    invoke-static {v2}, Lcom/facebook/react/uimanager/common/ViewUtil;->getUIManagerType(I)I

    .line 87
    .line 88
    .line 89
    move-result v4

    .line 90
    invoke-static {v1, v4}, Lcom/facebook/react/uimanager/UIManagerHelper;->getUIManager(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/bridge/UIManager;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    if-eqz v1, :cond_3

    .line 95
    .line 96
    invoke-interface {v1}, Lcom/facebook/react/bridge/UIManager;->getEventDispatcher()Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    new-instance v4, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityActionEvent;

    .line 101
    .line 102
    invoke-direct {v4, v0, v3, v2}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityActionEvent;-><init>(Lcom/facebook/react/bridge/WritableMap;II)V

    .line 103
    .line 104
    .line 105
    invoke-interface {v1, v4}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    new-instance v0, Lcom/facebook/react/bridge/ReactNoCrashSoftException;

    .line 110
    .line 111
    const-string v1, "Cannot get RCTEventEmitter, no CatalystInstance"

    .line 112
    .line 113
    invoke-direct {v0, v1}, Lcom/facebook/react/bridge/ReactNoCrashSoftException;-><init>(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    const-string v1, "ReactAccessibilityDelegate"

    .line 117
    .line 118
    invoke-static {v1, v0}, Lcom/facebook/react/bridge/ReactSoftExceptionLogger;->logSoftException(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 119
    .line 120
    .line 121
    :cond_3
    :goto_0
    sget v0, Lcom/facebook/react/R$id;->accessibility_role:I

    .line 122
    .line 123
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    const-string v1, "null cannot be cast to non-null type com.facebook.react.uimanager.ReactAccessibilityDelegate.AccessibilityRole"

    .line 128
    .line 129
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    check-cast v0, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 133
    .line 134
    sget v1, Lcom/facebook/react/R$id;->accessibility_value:I

    .line 135
    .line 136
    invoke-virtual {p1, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    check-cast v1, Lcom/facebook/react/bridge/ReadableMap;

    .line 141
    .line 142
    sget-object v2, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;->ADJUSTABLE:Lcom/facebook/react/uimanager/ReactAccessibilityDelegate$AccessibilityRole;

    .line 143
    .line 144
    if-ne v0, v2, :cond_6

    .line 145
    .line 146
    sget-object v0, LI0/z$a;->q:LI0/z$a;

    .line 147
    .line 148
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 149
    .line 150
    .line 151
    move-result v0

    .line 152
    if-eq p2, v0, :cond_4

    .line 153
    .line 154
    sget-object v0, LI0/z$a;->r:LI0/z$a;

    .line 155
    .line 156
    invoke-virtual {v0}, LI0/z$a;->b()I

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-ne p2, v0, :cond_6

    .line 161
    .line 162
    :cond_4
    if-eqz v1, :cond_5

    .line 163
    .line 164
    const-string v0, "text"

    .line 165
    .line 166
    invoke-interface {v1, v0}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-nez v0, :cond_5

    .line 171
    .line 172
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/ReactAccessibilityDelegate;->scheduleAccessibilityEventSender(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    :cond_5
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/a;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    return p1

    .line 180
    :cond_6
    const/4 p1, 0x1

    .line 181
    return p1

    .line 182
    :cond_7
    invoke-super {p0, p1, p2, p3}, Landroidx/core/view/a;->performAccessibilityAction(Landroid/view/View;ILandroid/os/Bundle;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    return p1
.end method

.method protected final superGetAccessibilityNodeProvider(Landroid/view/View;)LI0/A;
    .locals 1

    .line 1
    const-string v0, "host"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroidx/customview/widget/a;->getAccessibilityNodeProvider(Landroid/view/View;)LI0/A;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method
