.class public final Lcom/facebook/react/uimanager/ShadowNodeRegistry;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;,
        Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u0000 #2\u00020\u0001:\u0002#$B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\r\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\u0008\u00030\u0004\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u001b\u0010\u000f\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001e\u0010\u0018\u001a\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00040\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u00060\u001dR\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010!\u00a8\u0006%"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/ShadowNodeRegistry;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/react/uimanager/ReactShadowNode;",
        "node",
        "Li7/B;",
        "addRootNode",
        "(Lcom/facebook/react/uimanager/ReactShadowNode;)V",
        "",
        "tag",
        "removeRootNode",
        "(I)V",
        "addNode",
        "removeNode",
        "getNode",
        "(I)Lcom/facebook/react/uimanager/ReactShadowNode;",
        "",
        "isRootNode",
        "(I)Z",
        "index",
        "getRootTag",
        "(I)I",
        "Landroid/util/SparseArray;",
        "tagsToCSSNodes",
        "Landroid/util/SparseArray;",
        "Landroid/util/SparseBooleanArray;",
        "rootTags",
        "Landroid/util/SparseBooleanArray;",
        "Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;",
        "threadAsserter",
        "Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;",
        "getRootNodeCount",
        "()I",
        "rootNodeCount",
        "Companion",
        "SingleThreadAsserter",
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
.field private static final Companion:Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;


# instance fields
.field private final rootTags:Landroid/util/SparseBooleanArray;

.field private final tagsToCSSNodes:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lcom/facebook/react/uimanager/ReactShadowNode<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->Companion:Lcom/facebook/react/uimanager/ShadowNodeRegistry$Companion;

    .line 8
    .line 9
    const-string v0, "ShadowNodeRegistry"

    .line 10
    .line 11
    sget-object v1, Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;->ERROR:Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;

    .line 12
    .line 13
    invoke-static {v0, v1}, Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogger;->assertLegacyArchitecture(Ljava/lang/String;Lcom/facebook/react/common/annotations/internal/LegacyArchitectureLogLevel;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/util/SparseArray;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 10
    .line 11
    new-instance v0, Landroid/util/SparseBooleanArray;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 17
    .line 18
    new-instance v0, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;-><init>(Lcom/facebook/react/uimanager/ShadowNodeRegistry;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final addNode(Lcom/facebook/react/uimanager/ReactShadowNode;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/ReactShadowNode<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 12
    .line 13
    invoke-interface {p1}, Lcom/facebook/react/uimanager/ReactShadowNode;->getReactTag()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {v0, v1, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final addRootNode(Lcom/facebook/react/uimanager/ReactShadowNode;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/react/uimanager/ReactShadowNode<",
            "*>;)V"
        }
    .end annotation

    .line 1
    const-string v0, "node"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lcom/facebook/react/uimanager/ReactShadowNode;->getReactTag()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    iget-object v1, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 16
    .line 17
    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object p1, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 21
    .line 22
    const/4 v1, 0x1

    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final getNode(I)Lcom/facebook/react/uimanager/ReactShadowNode;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/facebook/react/uimanager/ReactShadowNode<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lcom/facebook/react/uimanager/ReactShadowNode;

    .line 13
    .line 14
    return-object p1
.end method

.method public final getRootNodeCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/util/SparseBooleanArray;->size()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final getRootTag(I)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final isRootNode(I)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final removeNode(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    new-instance v0, Lcom/facebook/react/uimanager/IllegalViewOperationException;

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v2, "Trying to remove root node "

    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p1, " without using removeRootNode!"

    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/IllegalViewOperationException;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    throw v0
.end method

.method public final removeRootNode(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->threadAsserter:Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/uimanager/ShadowNodeRegistry$SingleThreadAsserter;->assertNow()V

    .line 4
    .line 5
    .line 6
    const/4 v0, -0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->tagsToCSSNodes:Landroid/util/SparseArray;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/facebook/react/uimanager/ShadowNodeRegistry;->rootTags:Landroid/util/SparseBooleanArray;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    new-instance v0, Lcom/facebook/react/uimanager/IllegalViewOperationException;

    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 34
    .line 35
    .line 36
    const-string v2, "View with tag "

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string p1, " is not registered as a root view"

    .line 45
    .line 46
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-direct {v0, p1}, Lcom/facebook/react/uimanager/IllegalViewOperationException;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0
.end method
