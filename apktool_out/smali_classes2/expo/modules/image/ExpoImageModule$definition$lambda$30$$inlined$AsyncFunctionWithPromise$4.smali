.class public final Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/ExpoImageModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
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
.field final synthetic this$0:Lexpo/modules/image/ExpoImageModule;


# direct methods
.method public constructor <init>(Lexpo/modules/image/ExpoImageModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;->this$0:Lexpo/modules/image/ExpoImageModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 18
    check-cast p1, [Ljava/lang/Object;

    check-cast p2, Lexpo/modules/kotlin/Promise;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;->invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V

    sget-object p1, Li7/B;->a:Li7/B;

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;Lexpo/modules/kotlin/Promise;)V
    .locals 11

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "promise"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object v1, p1, v0

    const/4 v2, 0x1

    aget-object v3, p1, v2

    const/4 v4, 0x2

    aget-object p1, p1, v4

    .line 1
    check-cast p1, Ljava/util/Map;

    check-cast v3, Lexpo/modules/image/records/CachePolicy;

    check-cast v1, Ljava/util/List;

    .line 2
    iget-object v4, p0, Lexpo/modules/image/ExpoImageModule$definition$lambda$30$$inlined$AsyncFunctionWithPromise$4;->this$0:Lexpo/modules/image/ExpoImageModule;

    invoke-virtual {v4}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v4

    invoke-virtual {v4}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    move-result-object v4

    if-nez v4, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v5, Lkotlin/jvm/internal/A;

    invoke-direct {v5}, Lkotlin/jvm/internal/A;-><init>()V

    .line 4
    new-instance v6, Lkotlin/jvm/internal/z;

    invoke-direct {v6}, Lkotlin/jvm/internal/z;-><init>()V

    if-eqz p1, :cond_2

    .line 5
    new-instance v7, LB1/k$a;

    invoke-direct {v7}, LB1/k$a;-><init>()V

    .line 6
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map$Entry;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-interface {v8}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 7
    invoke-virtual {v7, v9, v8}, LB1/k$a;->b(Ljava/lang/String;Ljava/lang/String;)LB1/k$a;

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v7}, LB1/k$a;->c()LB1/k;

    move-result-object p1

    if-eqz p1, :cond_2

    goto :goto_1

    .line 9
    :cond_2
    sget-object p1, LB1/i;->b:LB1/i;

    .line 10
    :goto_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    .line 11
    invoke-static {v4}, Lcom/bumptech/glide/b;->v(Landroid/content/Context;)Lcom/bumptech/glide/k;

    move-result-object v9

    .line 12
    new-instance v10, LB1/h;

    invoke-direct {v10, v8, p1}, LB1/h;-><init>(Ljava/lang/String;LB1/i;)V

    invoke-virtual {v9, v10}, Lcom/bumptech/glide/k;->j(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    move-result-object v8

    const/16 v9, 0x64

    .line 13
    invoke-virtual {v8, v9}, LM1/a;->i(I)LM1/a;

    move-result-object v8

    check-cast v8, Lcom/bumptech/glide/j;

    .line 14
    sget-object v9, Lexpo/modules/image/NoopDownsampleStrategy;->INSTANCE:Lexpo/modules/image/NoopDownsampleStrategy;

    invoke-virtual {v8, v9}, LM1/a;->h(Lcom/bumptech/glide/load/resource/bitmap/n;)LM1/a;

    move-result-object v8

    const-string v9, "downsample(...)"

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Lcom/bumptech/glide/j;

    .line 15
    sget-object v9, Lexpo/modules/image/records/CachePolicy;->MEMORY:Lexpo/modules/image/records/CachePolicy;

    if-ne v3, v9, :cond_3

    move v9, v2

    goto :goto_3

    :cond_3
    move v9, v0

    :goto_3
    sget-object v10, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$1;->INSTANCE:Lexpo/modules/image/ExpoImageModule$definition$1$3$1$1;

    invoke-static {v8, v9, v10}, Lexpo/modules/image/GlideExtensionsKt;->customize(Lcom/bumptech/glide/j;ZLkotlin/jvm/functions/Function1;)Lcom/bumptech/glide/j;

    move-result-object v8

    .line 16
    new-instance v9, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;

    invoke-direct {v9, v6, p2, v5, v1}, Lexpo/modules/image/ExpoImageModule$definition$1$3$1$2;-><init>(Lkotlin/jvm/internal/z;Lexpo/modules/kotlin/Promise;Lkotlin/jvm/internal/A;Ljava/util/List;)V

    invoke-virtual {v8, v9}, Lcom/bumptech/glide/j;->w0(LM1/e;)Lcom/bumptech/glide/j;

    move-result-object v8

    .line 17
    invoke-virtual {v8}, Lcom/bumptech/glide/j;->B0()LM1/b;

    goto :goto_2

    :cond_4
    return-void
.end method
