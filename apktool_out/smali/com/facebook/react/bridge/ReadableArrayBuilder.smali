.class public final Lcom/facebook/react/bridge/ReadableArrayBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\t\u0010\u000cJ\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\r\u00a2\u0006\u0004\u0008\t\u0010\u000eJ\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\t\u0010\u0010J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\t\u0010\u0012J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\t\u0010\u0014J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\t\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u00082\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00082\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00080\u0019\u00a2\u0006\u0004\u0008\u001e\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lcom/facebook/react/bridge/ReadableArrayBuilder;",
        "",
        "Lcom/facebook/react/bridge/WritableArray;",
        "array",
        "<init>",
        "(Lcom/facebook/react/bridge/WritableArray;)V",
        "",
        "value",
        "Li7/B;",
        "add",
        "(Ljava/lang/String;)V",
        "",
        "(I)V",
        "",
        "(Z)V",
        "",
        "(D)V",
        "",
        "(J)V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "(Lcom/facebook/react/bridge/ReadableMap;)V",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "(Lcom/facebook/react/bridge/ReadableArray;)V",
        "addNull",
        "()V",
        "Lkotlin/Function1;",
        "Lcom/facebook/react/bridge/ReadableMapBuilder;",
        "builder",
        "addMap",
        "(Lkotlin/jvm/functions/Function1;)V",
        "addArray",
        "Lcom/facebook/react/bridge/WritableArray;",
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
.field private final array:Lcom/facebook/react/bridge/WritableArray;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/WritableArray;)V
    .locals 1

    .line 1
    const-string v0, "array"

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
    iput-object p1, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final add(D)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    return-void
.end method

.method public final add(I)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushInt(I)V

    return-void
.end method

.method public final add(J)V
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    long-to-double p1, p1

    invoke-interface {v0, p1, p2}, Lcom/facebook/react/bridge/WritableArray;->pushDouble(D)V

    return-void
.end method

.method public final add(Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    return-void
.end method

.method public final add(Lcom/facebook/react/bridge/ReadableMap;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    return-void
.end method

.method public final add(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushString(Ljava/lang/String;)V

    return-void
.end method

.method public final add(Z)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/WritableArray;->pushBoolean(Z)V

    return-void
.end method

.method public final addArray(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    .line 7
    .line 8
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createArray()Lcom/facebook/react/bridge/WritableArray;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/facebook/react/bridge/ReadableArrayBuilder;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Lcom/facebook/react/bridge/ReadableArrayBuilder;-><init>(Lcom/facebook/react/bridge/WritableArray;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushArray(Lcom/facebook/react/bridge/ReadableArray;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final addMap(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "builder"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    .line 7
    .line 8
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v2, Lcom/facebook/react/bridge/ReadableMapBuilder;

    .line 13
    .line 14
    invoke-direct {v2, v1}, Lcom/facebook/react/bridge/ReadableMapBuilder;-><init>(Lcom/facebook/react/bridge/WritableMap;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1}, Lcom/facebook/react/bridge/WritableArray;->pushMap(Lcom/facebook/react/bridge/ReadableMap;)V

    .line 21
    .line 22
    .line 23
    return-void
.end method

.method public final addNull()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/bridge/ReadableArrayBuilder;->array:Lcom/facebook/react/bridge/WritableArray;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/WritableArray;->pushNull()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
