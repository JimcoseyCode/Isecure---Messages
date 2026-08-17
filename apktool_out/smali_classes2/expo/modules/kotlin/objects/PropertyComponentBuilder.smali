.class public Lexpo/modules/kotlin/objects/PropertyComponentBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\t\u001a\u00020\u0000\"\u0006\u0008\u0000\u0010\u0006\u0018\u00012\u000e\u0008\u0004\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0007H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ1\u0010\u000e\u001a\u00020\u0000\"\u0006\u0008\u0000\u0010\u000b\u0018\u00012\u0014\u0008\u0004\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u000cH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001a\"\u0004\u0008\u001f\u0010\u001c\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006 "
    }
    d2 = {
        "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;",
        "",
        "",
        "name",
        "<init>",
        "(Ljava/lang/String;)V",
        "R",
        "Lkotlin/Function0;",
        "body",
        "get",
        "(Lw7/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;",
        "T",
        "Lkotlin/Function1;",
        "Li7/B;",
        "set",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;",
        "Lexpo/modules/kotlin/objects/PropertyComponent;",
        "build",
        "()Lexpo/modules/kotlin/objects/PropertyComponent;",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "getter",
        "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "getGetter",
        "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "setGetter",
        "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V",
        "setter",
        "getSetter",
        "setSetter",
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
.field private getter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

.field private final name:Ljava/lang/String;

.field private setter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "name"

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
    iput-object p1, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->name:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final build()Lexpo/modules/kotlin/objects/PropertyComponent;
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/kotlin/objects/PropertyComponent;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->name:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->getter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 8
    .line 9
    invoke-direct {v0, v1, v2, v3}, Lexpo/modules/kotlin/objects/PropertyComponent;-><init>(Ljava/lang/String;Lexpo/modules/kotlin/functions/SyncFunctionComponent;Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final synthetic get(Lw7/a;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    new-array v1, v1, [Lexpo/modules/kotlin/types/AnyType;

    .line 10
    .line 11
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 12
    .line 13
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const/4 v4, 0x4

    .line 18
    const-string v5, "R"

    .line 19
    .line 20
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const-class v6, Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 34
    .line 35
    if-nez v3, :cond_0

    .line 36
    .line 37
    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 38
    .line 39
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    invoke-direct {v3, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_0
    new-instance v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilder$get$1$1;

    .line 64
    .line 65
    invoke-direct {v2, p1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder$get$1$1;-><init>(Lw7/a;)V

    .line 66
    .line 67
    .line 68
    const-string p1, "get"

    .line 69
    .line 70
    invoke-direct {v0, p1, v1, v3, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 74
    .line 75
    .line 76
    return-object p0
.end method

.method public final getGetter()Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->getter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSetter()Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic set(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilder;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;"
        }
    .end annotation

    .line 1
    const-string v0, "body"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 7
    .line 8
    sget-object v1, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 9
    .line 10
    new-instance v2, Lkotlin/Pair;

    .line 11
    .line 12
    const/4 v3, 0x4

    .line 13
    const-string v4, "T"

    .line 14
    .line 15
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-class v5, Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    const/4 v7, 0x3

    .line 25
    invoke-static {v7, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 v8, 0x0

    .line 29
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 30
    .line 31
    .line 32
    move-result-object v9

    .line 33
    invoke-direct {v2, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    .line 45
    .line 46
    if-nez v1, :cond_0

    .line 47
    .line 48
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 52
    .line 53
    .line 54
    sget-object v1, Lexpo/modules/kotlin/objects/PropertyComponentBuilder$set$$inlined$apply$lambda$1;->INSTANCE:Lexpo/modules/kotlin/objects/PropertyComponentBuilder$set$$inlined$apply$lambda$1;

    .line 55
    .line 56
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 57
    .line 58
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    .line 59
    .line 60
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-static {v7, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v6, v3, v8, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x0

    .line 74
    invoke-direct {v2, v6, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :cond_0
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 83
    .line 84
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const-class v4, Li7/B;

    .line 89
    .line 90
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 99
    .line 100
    if-nez v3, :cond_1

    .line 101
    .line 102
    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 103
    .line 104
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    invoke-direct {v3, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 116
    .line 117
    .line 118
    move-result-object v4

    .line 119
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 123
    .line 124
    .line 125
    new-instance v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilder$set$1$1;

    .line 126
    .line 127
    invoke-direct {v2, p1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder$set$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 128
    .line 129
    .line 130
    const-string p1, "set"

    .line 131
    .line 132
    invoke-direct {v0, p1, v1, v3, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setSetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 136
    .line 137
    .line 138
    return-object p0
.end method

.method public final setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->getter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-void
.end method

.method public final setSetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setter:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-void
.end method
