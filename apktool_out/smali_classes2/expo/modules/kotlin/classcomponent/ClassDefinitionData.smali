.class public final Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u001d\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u0019R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\u001b8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;",
        "",
        "name",
        "",
        "constructor",
        "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "staticSyncFunctions",
        "",
        "staticAsyncFunctions",
        "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "objectDefinition",
        "Lexpo/modules/kotlin/objects/ObjectDefinitionData;",
        "isSharedRef",
        "",
        "<init>",
        "(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Z)V",
        "getName",
        "()Ljava/lang/String;",
        "getConstructor",
        "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "getStaticSyncFunctions",
        "()Ljava/util/Map;",
        "getStaticAsyncFunctions",
        "getObjectDefinition",
        "()Lexpo/modules/kotlin/objects/ObjectDefinitionData;",
        "()Z",
        "staticFunctions",
        "Lexpo/modules/kotlin/ConcatIterator;",
        "Lexpo/modules/kotlin/functions/AnyFunction;",
        "getStaticFunctions",
        "()Lexpo/modules/kotlin/ConcatIterator;",
        "expo-modules-core_release"
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
.field private final constructor:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

.field private final isSharedRef:Z

.field private final name:Ljava/lang/String;

.field private final objectDefinition:Lexpo/modules/kotlin/objects/ObjectDefinitionData;

.field private final staticAsyncFunctions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
            ">;"
        }
    .end annotation
.end field

.field private final staticSyncFunctions:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/objects/ObjectDefinitionData;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
            ">;",
            "Lexpo/modules/kotlin/objects/ObjectDefinitionData;",
            "Z)V"
        }
    .end annotation

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "constructor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "staticSyncFunctions"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "staticAsyncFunctions"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "objectDefinition"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object p1, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->name:Ljava/lang/String;

    .line 30
    .line 31
    iput-object p2, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->constructor:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 32
    .line 33
    iput-object p3, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticSyncFunctions:Ljava/util/Map;

    .line 34
    .line 35
    iput-object p4, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticAsyncFunctions:Ljava/util/Map;

    .line 36
    .line 37
    iput-object p5, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->objectDefinition:Lexpo/modules/kotlin/objects/ObjectDefinitionData;

    .line 38
    .line 39
    iput-boolean p6, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->isSharedRef:Z

    .line 40
    .line 41
    return-void
.end method


# virtual methods
.method public final getConstructor()Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->constructor:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getObjectDefinition()Lexpo/modules/kotlin/objects/ObjectDefinitionData;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->objectDefinition:Lexpo/modules/kotlin/objects/ObjectDefinitionData;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStaticAsyncFunctions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticAsyncFunctions:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStaticFunctions()Lexpo/modules/kotlin/ConcatIterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/ConcatIterator<",
            "Lexpo/modules/kotlin/functions/AnyFunction;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/kotlin/ConcatIterator;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticSyncFunctions:Ljava/util/Map;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticAsyncFunctions:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-direct {v0, v1, v2}, Lexpo/modules/kotlin/ConcatIterator;-><init>(Ljava/util/Iterator;Ljava/util/Iterator;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final getStaticSyncFunctions()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->staticSyncFunctions:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isSharedRef()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;->isSharedRef:Z

    .line 2
    .line 3
    return v0
.end method
