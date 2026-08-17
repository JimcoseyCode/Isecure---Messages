.class public final Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->buildObject()Lexpo/modules/kotlin/objects/ObjectDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $type$inlined:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;

.field final synthetic this$0:Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;


# direct methods
.method public constructor <init>(Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;->this$0:Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;->$type$inlined:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 5
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "promise"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    check-cast p2, Ljava/lang/String;

    .line 2
    iget-object p1, p0, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;->this$0:Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;

    invoke-static {p1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->access$getEventObservers$p(Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;)Ljava/util/List;

    move-result-object p1

    .line 3
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/objects/EventObservingDefinition;

    .line 4
    iget-object v1, p0, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder$buildObject$lambda$3$$inlined$AsyncFunction$1;->$type$inlined:Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;

    invoke-virtual {v0, v1, p2}, Lexpo/modules/kotlin/objects/EventObservingDefinition;->invokedIfNeed(Lexpo/modules/kotlin/objects/EventObservingDefinition$Type;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method
