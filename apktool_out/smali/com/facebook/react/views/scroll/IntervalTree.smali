.class public final Lcom/facebook/react/views/scroll/IntervalTree;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/Collection;
.implements Lx7/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Collection<",
        "Lcom/facebook/react/views/scroll/VirtualView;",
        ">;",
        "Lx7/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010#\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0008\r\n\u0002\u0010\u001e\n\u0002\u0008\u0005\n\u0002\u0010)\n\u0002\u0008\u000c\n\u0002\u0010%\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J#\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J!\u0010\"\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010!\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008$\u0010\u001aJ#\u0010&\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008&\u0010#J/\u0010*\u001a\u00020\u00132\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\'\u001a\u00020\u000b2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\t0(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\'\u0010-\u001a\u00020\u00132\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00020,H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\u001b\u00100\u001a\u0008\u0012\u0004\u0012\u00020\t0(2\u0006\u0010/\u001a\u00020\u0007\u00a2\u0006\u0004\u00080\u00101J\u0017\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u00102\u001a\u00020\t\u00a2\u0006\u0004\u00083\u00104J\u0013\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u00020,\u00a2\u0006\u0004\u00085\u00106J\u0017\u00108\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u00088\u00109J\u001d\u0010<\u001a\u00020\u00032\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00020:H\u0016\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010>\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008>\u0010?J\u0016\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u00020@H\u0096\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\u0017\u0010C\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008C\u00109J\u001d\u0010D\u001a\u00020\u00032\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00020:H\u0016\u00a2\u0006\u0004\u0008D\u0010=J\u001d\u0010E\u001a\u00020\u00032\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00020:H\u0016\u00a2\u0006\u0004\u0008E\u0010=J\u0018\u0010F\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\u0008F\u00109J\u001d\u0010G\u001a\u00020\u00032\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00020:H\u0016\u00a2\u0006\u0004\u0008G\u0010=J\u000f\u0010H\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008H\u0010IR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0M8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010R\u001a\u00020\u00108VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008P\u0010Q\u00a8\u0006S"
    }
    d2 = {
        "Lcom/facebook/react/views/scroll/IntervalTree;",
        "",
        "Lcom/facebook/react/views/scroll/VirtualView;",
        "",
        "horizontal",
        "<init>",
        "(Z)V",
        "Landroid/graphics/Rect;",
        "rect",
        "",
        "id",
        "Lcom/facebook/react/views/scroll/Interval;",
        "rectToInterval",
        "(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/Interval;",
        "Lcom/facebook/react/views/scroll/IntervalNode;",
        "node",
        "",
        "height",
        "(Lcom/facebook/react/views/scroll/IntervalNode;)I",
        "Li7/B;",
        "updateHeight",
        "(Lcom/facebook/react/views/scroll/IntervalNode;)V",
        "updateMax",
        "balanceFactor",
        "parent",
        "rotateRight",
        "(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;",
        "rotateLeft",
        "balance",
        "i1",
        "i2",
        "compareIntervals",
        "(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I",
        "intervalNode",
        "insert",
        "(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;",
        "findMin",
        "target",
        "delete",
        "interval",
        "",
        "results",
        "queryHelper",
        "(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V",
        "",
        "inorderTraversal",
        "(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V",
        "queryRect",
        "query",
        "(Landroid/graphics/Rect;)Ljava/util/Set;",
        "virtualViewID",
        "getVirtualView",
        "(Ljava/lang/String;)Lcom/facebook/react/views/scroll/VirtualView;",
        "traverse",
        "()Ljava/util/List;",
        "element",
        "add",
        "(Lcom/facebook/react/views/scroll/VirtualView;)Z",
        "",
        "elements",
        "addAll",
        "(Ljava/util/Collection;)Z",
        "clear",
        "()V",
        "",
        "iterator",
        "()Ljava/util/Iterator;",
        "remove",
        "removeAll",
        "retainAll",
        "contains",
        "containsAll",
        "isEmpty",
        "()Z",
        "Z",
        "root",
        "Lcom/facebook/react/views/scroll/IntervalNode;",
        "",
        "idToIntervalNode",
        "Ljava/util/Map;",
        "getSize",
        "()I",
        "size",
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


# instance fields
.field private final horizontal:Z

.field private final idToIntervalNode:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/react/views/scroll/IntervalNode;",
            ">;"
        }
    .end annotation
.end field

.field private root:Lcom/facebook/react/views/scroll/IntervalNode;


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->horizontal:Z

    .line 5
    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method

.method private final balance(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->balanceFactor(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    if-le v0, v1, :cond_2

    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->balanceFactor(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-gez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->rotateLeft(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/IntervalNode;->setLeft(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 39
    .line 40
    const-string v0, "[IntervalTree] node.left must not be null when performing left rotation around it"

    .line 41
    .line 42
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw p1

    .line 46
    :cond_1
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->rotateRight(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    const/4 v1, -0x1

    .line 52
    if-ge v0, v1, :cond_5

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->balanceFactor(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-lez v0, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-eqz v0, :cond_3

    .line 69
    .line 70
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->rotateRight(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 79
    .line 80
    const-string v0, "[IntervalTree] node.right must not be null when performing right rotation around it"

    .line 81
    .line 82
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw p1

    .line 86
    :cond_4
    :goto_1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->rotateLeft(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    :cond_5
    return-object p1
.end method

.method private final balanceFactor(Lcom/facebook/react/views/scroll/IntervalNode;)I
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->height(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->height(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    sub-int/2addr v0, p1

    .line 22
    return v0
.end method

.method private final compareIntervals(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->i(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eq v0, v1, :cond_1

    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->i(II)I

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    return p1

    .line 47
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/Interval;->getId()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getId()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    return p1
.end method

.method private final delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/IntervalTree;->compareIntervals(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-gez v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/IntervalNode;->setLeft(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-direct {p0, v1, v2}, Lcom/facebook/react/views/scroll/IntervalTree;->compareIntervals(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-lez v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    if-nez p2, :cond_3

    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    goto :goto_0

    .line 68
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    if-nez p2, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    goto :goto_0

    .line 79
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    if-eqz p2, :cond_6

    .line 84
    .line 85
    invoke-direct {p0, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->findMin(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/IntervalNode;->setVirtualView(Lcom/facebook/react/views/scroll/VirtualView;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/IntervalNode;->setInterval(Lcom/facebook/react/views/scroll/Interval;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-direct {p0, v1, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 112
    .line 113
    .line 114
    :goto_0
    if-nez p1, :cond_5

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_5
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->balance(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 123
    .line 124
    const-string p2, "[IntervalTree] node.right must not be null when finding node\'s successor"

    .line 125
    .line 126
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw p1
.end method

.method private final findMin(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->findMin(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object v0

    .line 15
    :cond_1
    :goto_0
    return-object p1
.end method

.method private final height(Lcom/facebook/react/views/scroll/IntervalNode;)I
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return p1
.end method

.method private final inorderTraversal(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/views/scroll/IntervalNode;",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/scroll/VirtualView;",
            ">;)V"
        }
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->inorderTraversal(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {p2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->inorderTraversal(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method private final insert(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p2

    .line 4
    :cond_0
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {p0, v0, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->compareIntervals(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/Interval;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-gez v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->insert(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/IntervalNode;->setLeft(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-direct {p0, v0, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->insert(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-virtual {p1, p2}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->balance(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    return-object p1
.end method

.method private final queryHelper(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/views/scroll/IntervalNode;",
            "Lcom/facebook/react/views/scroll/Interval;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    new-instance v0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 16
    .line 17
    .line 18
    const-string v1, "VirtualViewContainerStateExperimental:"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, "queryHelper"

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const/4 v1, 0x0

    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    if-eqz v2, :cond_0

    .line 40
    .line 41
    invoke-interface {v2}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    move-object v2, v1

    .line 47
    :goto_0
    if-eqz p1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    if-eqz v3, :cond_1

    .line 54
    .line 55
    invoke-interface {v3}, Lcom/facebook/react/views/scroll/VirtualView;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    :cond_1
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    new-instance v5, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string v6, "Check node ("

    .line 73
    .line 74
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, ", "

    .line 81
    .line 82
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v1, ") against interval("

    .line 89
    .line 90
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string v1, ")"

    .line 103
    .line 104
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v0, v1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    :cond_2
    if-eqz p1, :cond_5

    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getMax()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-gt v0, v1, :cond_3

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_3
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-direct {p0, v0, p2, p3}, Lcom/facebook/react/views/scroll/IntervalTree;->queryHelper(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-virtual {v0, p2}, Lcom/facebook/react/views/scroll/Interval;->intersects(Lcom/facebook/react/views/scroll/Interval;)Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-eqz v0, :cond_4

    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-interface {p3, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/Interval;->getStart()I

    .line 160
    .line 161
    .line 162
    move-result v0

    .line 163
    invoke-virtual {p2}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 164
    .line 165
    .line 166
    move-result v1

    .line 167
    if-ge v0, v1, :cond_5

    .line 168
    .line 169
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/views/scroll/IntervalTree;->queryHelper(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V

    .line 174
    .line 175
    .line 176
    :cond_5
    :goto_1
    return-void
.end method

.method private final rectToInterval(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/Interval;
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->horizontal:Z

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    new-instance v0, Lcom/facebook/react/views/scroll/Interval;

    .line 8
    .line 9
    iget v2, p1, Landroid/graphics/Rect;->left:I

    .line 10
    .line 11
    iget p1, p1, Landroid/graphics/Rect;->right:I

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    move-object p2, v1

    .line 16
    :cond_0
    invoke-direct {v0, v2, p1, p2}, Lcom/facebook/react/views/scroll/Interval;-><init>(IILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object v0

    .line 20
    :cond_1
    new-instance v0, Lcom/facebook/react/views/scroll/Interval;

    .line 21
    .line 22
    iget v2, p1, Landroid/graphics/Rect;->top:I

    .line 23
    .line 24
    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    .line 25
    .line 26
    if-nez p2, :cond_2

    .line 27
    .line 28
    move-object p2, v1

    .line 29
    :cond_2
    invoke-direct {v0, v2, p1, p2}, Lcom/facebook/react/views/scroll/Interval;-><init>(IILjava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method static synthetic rectToInterval$default(Lcom/facebook/react/views/scroll/IntervalTree;Landroid/graphics/Rect;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/react/views/scroll/Interval;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const-string p2, ""

    .line 6
    .line 7
    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/views/scroll/IntervalTree;->rectToInterval(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/Interval;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method private final rotateLeft(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/IntervalNode;->setLeft(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "[IntervalTree] AVL node\'s right must not be null when rotating left."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method private final rotateRight(Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v0, p1}, Lcom/facebook/react/views/scroll/IntervalNode;->setRight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lcom/facebook/react/views/scroll/IntervalNode;->setLeft(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 21
    .line 22
    .line 23
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V

    .line 27
    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    const-string v0, "[IntervalTree] AVL node\'s left must not be null when rotating right."

    .line 33
    .line 34
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method

.method private final updateHeight(Lcom/facebook/react/views/scroll/IntervalNode;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->height(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-direct {p0, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->height(Lcom/facebook/react/views/scroll/IntervalNode;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    add-int/lit8 v0, v0, 0x1

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/IntervalNode;->setHeight(I)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private final updateMax(Lcom/facebook/react/views/scroll/IntervalNode;)V
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/facebook/react/views/scroll/Interval;->getEnd()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getLeft()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/facebook/react/views/scroll/IntervalNode;->getMax()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v1, v2

    .line 23
    :goto_0
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getRight()Lcom/facebook/react/views/scroll/IntervalNode;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/IntervalNode;->getMax()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    :cond_1
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    invoke-virtual {p1, v0}, Lcom/facebook/react/views/scroll/IntervalNode;->setMax(I)V

    .line 42
    .line 43
    .line 44
    return-void
.end method


# virtual methods
.method public add(Lcom/facebook/react/views/scroll/VirtualView;)Z
    .locals 12

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    move-result-object v0

    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/react/views/scroll/IntervalNode;

    if-eqz v1, :cond_0

    .line 4
    iget-object v2, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    invoke-direct {p0, v2, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    move-result-object v1

    iput-object v1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    .line 5
    :goto_0
    invoke-interface {p1}, Lcom/facebook/react/views/scroll/VirtualView;->getContainerRelativeRect()Landroid/graphics/Rect;

    move-result-object v2

    invoke-direct {p0, v2, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->rectToInterval(Landroid/graphics/Rect;Ljava/lang/String;)Lcom/facebook/react/views/scroll/Interval;

    move-result-object v4

    .line 6
    new-instance v3, Lcom/facebook/react/views/scroll/IntervalNode;

    const/16 v10, 0x3c

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, p1

    invoke-direct/range {v3 .. v11}, Lcom/facebook/react/views/scroll/IntervalNode;-><init>(Lcom/facebook/react/views/scroll/Interval;Lcom/facebook/react/views/scroll/VirtualView;IILcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    iget-object p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    invoke-direct {p0, p1, v3}, Lcom/facebook/react/views/scroll/IntervalTree;->insert(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 8
    iget-object p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    invoke-interface {p1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    move-result p1

    if-eqz p1, :cond_1

    .line 10
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "VirtualViewContainerStateExperimental:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "IntervalTree: add"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 11
    invoke-interface {v5}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v5}, Lcom/facebook/react/views/scroll/VirtualView;->getContainerRelativeRect()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/IntervalNode;->getInterval()Lcom/facebook/react/views/scroll/Interval;

    move-result-object v3

    invoke-virtual {v3}, Lcom/facebook/react/views/scroll/Interval;->getId()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "New VirtualView: ("

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "). Node interval "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 12
    invoke-static {p1, v0}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return v1
.end method

.method public bridge synthetic add(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, Lcom/facebook/react/views/scroll/VirtualView;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->add(Lcom/facebook/react/views/scroll/VirtualView;)Z

    move-result p1

    return p1
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lcom/facebook/react/views/scroll/VirtualView;",
            ">;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/facebook/react/views/scroll/VirtualView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->add(Lcom/facebook/react/views/scroll/VirtualView;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v0
.end method

.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public contains(Lcom/facebook/react/views/scroll/VirtualView;)Z
    .locals 1

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/scroll/VirtualView;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/facebook/react/views/scroll/VirtualView;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->contains(Lcom/facebook/react/views/scroll/VirtualView;)Z

    move-result p1

    return p1
.end method

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return v1

    .line 14
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lcom/facebook/react/views/scroll/VirtualView;

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->contains(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    const/4 p1, 0x0

    .line 37
    return p1

    .line 38
    :cond_2
    return v1
.end method

.method public getSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getVirtualView(Ljava/lang/String;)Lcom/facebook/react/views/scroll/VirtualView;
    .locals 1

    .line 1
    const-string v0, "virtualViewID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/facebook/react/views/scroll/IntervalNode;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/facebook/react/views/scroll/IntervalNode;->getVirtualView()Lcom/facebook/react/views/scroll/VirtualView;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    return-object p1

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public isEmpty()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/IntervalTree;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Lcom/facebook/react/views/scroll/VirtualView;",
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
    iget-object v1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 7
    .line 8
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->inorderTraversal(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public final query(Landroid/graphics/Rect;)Ljava/util/Set;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Rect;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-string v0, "queryRect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x2

    .line 8
    invoke-static {p0, p1, v0, v1, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->rectToInterval$default(Lcom/facebook/react/views/scroll/IntervalTree;Landroid/graphics/Rect;Ljava/lang/String;ILjava/lang/Object;)Lcom/facebook/react/views/scroll/Interval;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const-string v3, "VirtualViewContainerStateExperimental:"

    .line 22
    .line 23
    const-string v4, "query"

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    new-instance v5, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    const-string v6, "Querying tree for rect "

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-static {v2, p1}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_0
    iget-object p1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 69
    .line 70
    invoke-direct {p0, p1, v0, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->queryHelper(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/Interval;Ljava/util/Set;)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_1

    .line 84
    .line 85
    new-instance p1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    new-instance v0, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v2, "Query results: "

    .line 106
    .line 107
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {p1, v0}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :cond_1
    return-object v1
.end method

.method public remove(Lcom/facebook/react/views/scroll/VirtualView;)Z
    .locals 2

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/react/views/scroll/IntervalNode;

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    invoke-direct {p0, v1, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->delete(Lcom/facebook/react/views/scroll/IntervalNode;Lcom/facebook/react/views/scroll/IntervalNode;)Lcom/facebook/react/views/scroll/IntervalNode;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 4
    iget-object v0, p0, Lcom/facebook/react/views/scroll/IntervalTree;->idToIntervalNode:Ljava/util/Map;

    invoke-interface {p1}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/facebook/react/views/scroll/VirtualView;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lcom/facebook/react/views/scroll/VirtualView;

    invoke-virtual {p0, p1}, Lcom/facebook/react/views/scroll/IntervalTree;->remove(Lcom/facebook/react/views/scroll/VirtualView;)Z

    move-result p1

    return p1
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lcom/facebook/react/views/scroll/VirtualView;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/facebook/react/views/scroll/IntervalTree;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return v0
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "*>;)Z"
        }
    .end annotation

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Ljava/lang/Error;

    .line 7
    .line 8
    const-string v0, "IntervalTree does not support retainAll yet"

    .line 9
    .line 10
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p1
.end method

.method public final bridge size()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/IntervalTree;->getSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/f;->a(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .line 2
    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/f;->b(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final traverse()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/facebook/react/views/scroll/VirtualView;",
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
    iget-object v1, p0, Lcom/facebook/react/views/scroll/IntervalTree;->root:Lcom/facebook/react/views/scroll/IntervalNode;

    .line 7
    .line 8
    invoke-direct {p0, v1, v0}, Lcom/facebook/react/views/scroll/IntervalTree;->inorderTraversal(Lcom/facebook/react/views/scroll/IntervalNode;Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
