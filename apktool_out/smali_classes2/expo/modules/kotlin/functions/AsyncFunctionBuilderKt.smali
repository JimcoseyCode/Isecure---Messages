.class public final Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a?\u0010\u0007\u001a\u00020\u0006\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u001e\u0008\u0004\u0010\u0005\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001aM\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001*\u00020\u00012$\u0008\u0004\u0010\u0005\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u000c\u001a[\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001*\u00020\u00012*\u0008\u0004\u0010\u0005\u001a$\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u000f\u001ai\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001*\u00020\u000120\u0008\u0004\u0010\u0005\u001a*\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0012\u001aw\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001\"\u0006\u0008\u0004\u0010\u0013\u0018\u0001*\u00020\u000126\u0008\u0004\u0010\u0005\u001a0\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0015\u001a\u0085\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001\"\u0006\u0008\u0004\u0010\u0013\u0018\u0001\"\u0006\u0008\u0005\u0010\u0016\u0018\u0001*\u00020\u00012<\u0008\u0004\u0010\u0005\u001a6\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017H\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0018\u001a\u0093\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001\"\u0006\u0008\u0004\u0010\u0013\u0018\u0001\"\u0006\u0008\u0005\u0010\u0016\u0018\u0001\"\u0006\u0008\u0006\u0010\u0019\u0018\u0001*\u00020\u00012B\u0008\u0004\u0010\u0005\u001a<\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aH\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u001b\u001a\u00a1\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001\"\u0006\u0008\u0004\u0010\u0013\u0018\u0001\"\u0006\u0008\u0005\u0010\u0016\u0018\u0001\"\u0006\u0008\u0006\u0010\u0019\u0018\u0001\"\u0006\u0008\u0007\u0010\u001c\u0018\u0001*\u00020\u00012H\u0008\u0004\u0010\u0005\u001aB\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001dH\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u001e\u001a\u00af\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\u0008\u0000\u0010\u0000\u0018\u0001\"\u0006\u0008\u0001\u0010\t\u0018\u0001\"\u0006\u0008\u0002\u0010\r\u0018\u0001\"\u0006\u0008\u0003\u0010\u0010\u0018\u0001\"\u0006\u0008\u0004\u0010\u0013\u0018\u0001\"\u0006\u0008\u0005\u0010\u0016\u0018\u0001\"\u0006\u0008\u0006\u0010\u0019\u0018\u0001\"\u0006\u0008\u0007\u0010\u001c\u0018\u0001\"\u0006\u0008\u0008\u0010\u001f\u0018\u0001*\u00020\u00012N\u0008\u0004\u0010\u0005\u001aH\u0008\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u0008\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040 H\u0086\u000c\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010!\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\""
    }
    d2 = {
        "R",
        "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
        "Lkotlin/Function1;",
        "Ln7/f;",
        "",
        "block",
        "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "Coroutine",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;",
        "P0",
        "Lkotlin/Function2;",
        "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P1",
        "Lkotlin/Function3;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P2",
        "Lkotlin/Function4;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P3",
        "Lkotlin/Function5;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P4",
        "Lkotlin/Function6;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P5",
        "Lkotlin/Function7;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P6",
        "Lkotlin/Function8;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "P7",
        "Lkotlin/Function9;",
        "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;",
        "expo-modules-core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lexpo/modules/kotlin/types/AnyType;

    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$1;-><init>(Lkotlin/jvm/functions/Function1;Ln7/f;)V

    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 2
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "block"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    new-instance v0, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    const/4 v3, 0x4

    .line 4
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 5
    sget-object v5, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 6
    new-instance v6, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v7, Ljava/lang/Object;

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v9, 0x3

    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v10, 0x0

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    invoke-direct {v6, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_0

    .line 8
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1;

    .line 9
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 10
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 11
    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 12
    invoke-direct {v8, v3, v10, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 13
    invoke-direct {v6, v8, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 14
    :cond_0
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 15
    new-instance v3, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3;

    const/4 v4, 0x0

    invoke-direct {v3, p1, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$3;-><init>(Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 16
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 17
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v0
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 19
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 20
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 21
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 22
    new-instance v9, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v9, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_0

    .line 24
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v9, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2;

    .line 25
    new-instance v11, Lexpo/modules/kotlin/types/AnyType;

    .line 26
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    .line 27
    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 28
    invoke-direct {v15, v5, v13, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 29
    invoke-direct {v11, v15, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v11

    .line 30
    :cond_0
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 32
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3;

    .line 33
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 34
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    .line 35
    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 36
    invoke-direct {v8, v10, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 37
    invoke-direct {v6, v8, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 38
    :cond_1
    filled-new-array {v9, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 39
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$5;-><init>(Lw7/o;Ln7/f;)V

    .line 40
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 41
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v2
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/p;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 43
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 44
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 45
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 46
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 47
    new-instance v10, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_0

    .line 49
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v10, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4;

    .line 50
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 51
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    .line 52
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 53
    invoke-direct {v14, v5, v6, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 54
    invoke-direct {v12, v14, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    .line 55
    :cond_0
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 56
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 57
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5;

    .line 58
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 59
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 60
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 61
    invoke-direct {v12, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 62
    invoke-direct {v6, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 63
    :cond_1
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2

    .line 65
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6;

    .line 66
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 67
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 68
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 69
    invoke-direct {v9, v11, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 70
    invoke-direct {v7, v9, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 71
    :cond_2
    filled-new-array {v10, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 72
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$7;-><init>(Lw7/p;Ln7/f;)V

    .line 73
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 74
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v2
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/q;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 76
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 77
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 78
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 79
    const-string v9, "P3"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 80
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 81
    new-instance v11, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v12, Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v11, v13, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_0

    .line 83
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v11, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7;

    .line 84
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 85
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v17, v10

    const/4 v10, 0x3

    .line 86
    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v6, v16

    .line 87
    invoke-direct {v14, v5, v6, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 88
    invoke-direct {v13, v14, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v11, v13

    goto :goto_0

    :cond_0
    move-object/from16 v17, v10

    move v10, v14

    .line 89
    :goto_0
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v10, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 91
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8;

    .line 92
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 93
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 94
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 95
    invoke-direct {v10, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 96
    invoke-direct {v6, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    goto :goto_1

    :cond_1
    const/4 v13, 0x3

    .line 97
    :goto_1
    new-instance v6, Lkotlin/Pair;

    const/4 v7, 0x4

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2

    .line 99
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9;

    .line 100
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 101
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 102
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 103
    invoke-direct {v10, v14, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 104
    invoke-direct {v7, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_2

    :cond_2
    const/4 v13, 0x3

    .line 105
    :goto_2
    new-instance v7, Lkotlin/Pair;

    const/4 v8, 0x4

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v7, v8, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 106
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_3

    .line 107
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v7, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10;

    .line 108
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 109
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    .line 110
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 111
    invoke-direct {v10, v12, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 112
    invoke-direct {v8, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    .line 113
    :cond_3
    filled-new-array {v11, v5, v6, v7}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 114
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9;-><init>(Lw7/q;Ln7/f;)V

    .line 115
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 116
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v2
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/r;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 117
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 118
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 119
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 120
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 121
    const-string v9, "P3"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 122
    const-string v10, "P4"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 123
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 124
    new-instance v12, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v13, Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v12, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 125
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_0

    .line 126
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v12, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11;

    .line 127
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v11

    .line 128
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v18, v13

    const/4 v13, 0x3

    .line 129
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v6, v16

    .line 130
    invoke-direct {v11, v5, v6, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 131
    invoke-direct {v14, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v12, v14

    goto :goto_0

    :cond_0
    move-object/from16 v17, v11

    move-object/from16 v18, v13

    const/4 v13, 0x3

    .line 132
    :goto_0
    new-instance v5, Lkotlin/Pair;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_1

    .line 134
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12;

    .line 135
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 136
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 137
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 138
    invoke-direct {v11, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 139
    invoke-direct {v6, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    goto :goto_1

    :cond_1
    const/4 v13, 0x3

    .line 140
    :goto_1
    new-instance v6, Lkotlin/Pair;

    const/4 v7, 0x4

    invoke-static {v7, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2

    .line 142
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13;

    .line 143
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 144
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 145
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 146
    invoke-direct {v11, v14, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 147
    invoke-direct {v7, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_2

    :cond_2
    const/4 v13, 0x3

    .line 148
    :goto_2
    new-instance v7, Lkotlin/Pair;

    const/4 v8, 0x4

    invoke-static {v8, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v7, v8, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_3

    .line 150
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v7, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14;

    .line 151
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 152
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v13, 0x3

    .line 153
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 154
    invoke-direct {v11, v14, v9, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 155
    invoke-direct {v8, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v8

    goto :goto_3

    :cond_3
    const/4 v13, 0x3

    .line 156
    :goto_3
    new-instance v8, Lkotlin/Pair;

    const/4 v9, 0x4

    invoke-static {v9, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v8, v9, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    if-nez v8, :cond_4

    .line 158
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v8, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15;

    .line 159
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 160
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v13, 0x4

    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 161
    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v10, 0x0

    .line 162
    invoke-direct {v11, v13, v10, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 163
    invoke-direct {v9, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v9

    .line 164
    :cond_4
    filled-new-array {v12, v5, v6, v7, v8}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 165
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$11;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$11;-><init>(Lw7/r;Ln7/f;)V

    .line 166
    invoke-direct {v2, v3, v4, v5}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    .line 167
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v2
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 25
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/s;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 168
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 169
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 170
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 171
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 172
    const-string v9, "P3"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 173
    const-string v10, "P4"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 174
    const-string v11, "P5"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 175
    sget-object v12, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 176
    new-instance v13, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v5, 0x3

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    invoke-direct {v13, v15, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    invoke-virtual {v12}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_0

    .line 178
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v13, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16;

    .line 179
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v12

    .line 180
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v14

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v0, 0x3

    .line 181
    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v6, v16

    .line 182
    invoke-direct {v12, v14, v6, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 183
    invoke-direct {v15, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v15

    goto :goto_0

    :cond_0
    move-object/from16 v17, v12

    move-object/from16 v18, v14

    const/4 v0, 0x3

    move-object/from16 v19, v13

    .line 184
    :goto_0
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-static {v0, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v12, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 185
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_1

    .line 186
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17;

    .line 187
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 188
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x3

    .line 189
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 190
    invoke-direct {v12, v13, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 191
    invoke-direct {v6, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v6

    goto :goto_1

    :cond_1
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v20, v0

    .line 192
    :goto_1
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 193
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_2

    .line 194
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18;

    .line 195
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 196
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x3

    .line 197
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 198
    invoke-direct {v7, v12, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 199
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v6

    goto :goto_2

    :cond_2
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v0

    .line 200
    :goto_2
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 201
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_3

    .line 202
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19;

    .line 203
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 204
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x3

    .line 205
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 206
    invoke-direct {v7, v8, v9, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 207
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v6

    goto :goto_3

    :cond_3
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v0

    .line 208
    :goto_3
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 209
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_4

    .line 210
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20;

    .line 211
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 212
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    const/4 v15, 0x3

    .line 213
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 214
    invoke-direct {v7, v8, v9, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 215
    invoke-direct {v6, v7, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v6

    goto :goto_4

    :cond_4
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v0

    .line 216
    :goto_4
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_5

    .line 218
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21;

    .line 219
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 220
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 221
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v9, 0x0

    .line 222
    invoke-direct {v6, v7, v9, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 223
    invoke-direct {v5, v6, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v5

    goto :goto_5

    :cond_5
    move-object/from16 v24, v0

    .line 224
    :goto_5
    filled-new-array/range {v19 .. v24}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 225
    new-instance v4, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$13;

    const/4 v5, 0x0

    invoke-direct {v4, v1, v5}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$13;-><init>(Lw7/s;Ln7/f;)V

    .line 226
    invoke-direct {v2, v3, v0, v4}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 227
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v2
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/t;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 229
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 230
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 231
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 232
    const-string v9, "P3"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 233
    const-string v10, "P4"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 234
    const-string v11, "P5"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 235
    const-string v12, "P6"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 236
    sget-object v13, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 237
    new-instance v14, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v15, Ljava/lang/Object;

    invoke-static {v15}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v16, v13

    const/4 v13, 0x3

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v14, v5, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_0

    .line 239
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$22;

    .line 240
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v18, v15

    .line 241
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v0, 0x4

    invoke-static {v0, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v0

    move-object/from16 v19, v2

    const/4 v2, 0x3

    .line 242
    invoke-static {v2, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v6, v17

    .line 243
    invoke-direct {v15, v0, v6, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 244
    invoke-direct {v14, v15, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v14

    goto :goto_0

    :cond_0
    move-object/from16 v19, v2

    move-object/from16 v18, v15

    const/4 v2, 0x3

    move-object/from16 v20, v5

    .line 245
    :goto_0
    new-instance v0, Lkotlin/Pair;

    const/4 v5, 0x4

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v2, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v5, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 246
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_1

    .line 247
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$23;

    .line 248
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 249
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    .line 250
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 251
    invoke-direct {v5, v14, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 252
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v2

    goto :goto_1

    :cond_1
    const/4 v6, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v0

    .line 253
    :goto_1
    new-instance v0, Lkotlin/Pair;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 254
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_2

    .line 255
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$24;

    .line 256
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 257
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 258
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 259
    invoke-direct {v5, v7, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 260
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v2

    goto :goto_2

    :cond_2
    const/4 v6, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v0

    .line 261
    :goto_2
    new-instance v0, Lkotlin/Pair;

    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 262
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_3

    .line 263
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$25;

    .line 264
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 265
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 266
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 267
    invoke-direct {v5, v7, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 268
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v2

    goto :goto_3

    :cond_3
    const/4 v6, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v0

    .line 269
    :goto_3
    new-instance v0, Lkotlin/Pair;

    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 270
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_4

    .line 271
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$26;

    .line 272
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 273
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 274
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 275
    invoke-direct {v5, v7, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 276
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v2

    goto :goto_4

    :cond_4
    const/4 v6, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v0

    .line 277
    :goto_4
    new-instance v0, Lkotlin/Pair;

    invoke-static {v6, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_5

    .line 279
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$27;

    .line 280
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 281
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    const/4 v15, 0x3

    .line 282
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 283
    invoke-direct {v5, v7, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 284
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v2

    goto :goto_5

    :cond_5
    const/4 v6, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v0

    .line 285
    :goto_5
    new-instance v0, Lkotlin/Pair;

    invoke-static {v6, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 286
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_6

    .line 287
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$28;

    .line 288
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 289
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v6, 0x4

    invoke-static {v6, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 290
    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 291
    invoke-direct {v5, v6, v8, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 292
    invoke-direct {v2, v5, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v2

    goto :goto_6

    :cond_6
    move-object/from16 v26, v0

    .line 293
    :goto_6
    filled-new-array/range {v20 .. v26}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 294
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$15;

    const/4 v4, 0x0

    invoke-direct {v2, v1, v4}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$15;-><init>(Lw7/t;Ln7/f;)V

    move-object/from16 v1, v19

    .line 295
    invoke-direct {v1, v3, v0, v2}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 296
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method

.method public static final synthetic Coroutine(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            "P1:",
            "Ljava/lang/Object;",
            "P2:",
            "Ljava/lang/Object;",
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            "P5:",
            "Ljava/lang/Object;",
            "P6:",
            "Ljava/lang/Object;",
            "P7:",
            "Ljava/lang/Object;",
            ">(",
            "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;",
            "Lw7/u;",
            ")",
            "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "block"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 297
    new-instance v2, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v4

    const/4 v5, 0x4

    .line 298
    const-string v6, "P0"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 299
    const-string v7, "P1"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 300
    const-string v8, "P2"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 301
    const-string v9, "P3"

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 302
    const-string v10, "P4"

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 303
    const-string v11, "P5"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 304
    const-string v12, "P6"

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 305
    const-string v13, "P7"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 306
    sget-object v14, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 307
    new-instance v15, Lkotlin/Pair;

    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v16, Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v17, v14

    const/4 v14, 0x3

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v18, 0x0

    invoke-static/range {v18 .. v18}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v15, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_0

    .line 309
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$29;

    .line 310
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 311
    new-instance v0, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v19, v2

    const/4 v2, 0x4

    invoke-static {v2, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    move-object/from16 v20, v3

    const/4 v3, 0x3

    .line 312
    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v6, v18

    .line 313
    invoke-direct {v0, v2, v6, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 314
    invoke-direct {v15, v0, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v15

    goto :goto_0

    :cond_0
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    const/4 v3, 0x3

    move-object/from16 v21, v5

    .line 315
    :goto_0
    new-instance v0, Lkotlin/Pair;

    const/4 v2, 0x4

    invoke-static {v2, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_1

    .line 317
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$30;

    .line 318
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 319
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 320
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 321
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 322
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v2

    goto :goto_1

    :cond_1
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v0

    .line 323
    :goto_1
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 324
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_2

    .line 325
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$31;

    .line 326
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 327
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 328
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 329
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 330
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v2

    goto :goto_2

    :cond_2
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v0

    .line 331
    :goto_2
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 332
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_3

    .line 333
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$32;

    .line 334
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 335
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 336
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 337
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 338
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v2

    goto :goto_3

    :cond_3
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v0

    .line 339
    :goto_3
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_4

    .line 341
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$33;

    .line 342
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 343
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 344
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 345
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 346
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v2

    goto :goto_4

    :cond_4
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v0

    .line 347
    :goto_4
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 348
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_5

    .line 349
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$34;

    .line 350
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 351
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 352
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 353
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 354
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v2

    goto :goto_5

    :cond_5
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v26, v0

    .line 355
    :goto_5
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 356
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_6

    .line 357
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$35;

    .line 358
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 359
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 360
    invoke-static {v15, v12}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 361
    invoke-direct {v3, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 362
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v27, v2

    goto :goto_6

    :cond_6
    const/4 v5, 0x4

    const/4 v15, 0x3

    move-object/from16 v27, v0

    .line 363
    :goto_6
    new-instance v0, Lkotlin/Pair;

    invoke-static {v5, v13}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-static {v15, v13}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 364
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_7

    .line 365
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36;->INSTANCE:Lexpo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$36;

    .line 366
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 367
    new-instance v3, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v5, 0x4

    invoke-static {v5, v13}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v15, 0x3

    .line 368
    invoke-static {v15, v13}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 369
    invoke-direct {v3, v5, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 370
    invoke-direct {v2, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v28, v2

    goto :goto_7

    :cond_7
    move-object/from16 v28, v0

    .line 371
    :goto_7
    filled-new-array/range {v21 .. v28}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 372
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$17;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$17;-><init>(Lw7/u;Ln7/f;)V

    move-object/from16 v1, v19

    move-object/from16 v3, v20

    .line 373
    invoke-direct {v1, v3, v0, v2}, Lexpo/modules/kotlin/functions/SuspendFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lw7/o;)V

    move-object/from16 v0, p0

    .line 374
    invoke-virtual {v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;->setAsyncFunctionComponent(Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;)V

    return-object v1
.end method
