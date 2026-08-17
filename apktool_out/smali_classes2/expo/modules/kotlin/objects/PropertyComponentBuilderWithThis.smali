.class public final Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;
.super Lexpo/modules/kotlin/objects/PropertyComponentBuilder;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ThisType:",
        "Ljava/lang/Object;",
        ">",
        "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J7\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\u0008\u0001\u0010\t\u0018\u00012\u0014\u0008\u0004\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\rJ=\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0000\"\u0006\u0008\u0001\u0010\u000e\u0018\u00012\u001a\u0008\u0004\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00100\u000fH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u0006\u0016"
    }
    d2 = {
        "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;",
        "ThisType",
        "Lexpo/modules/kotlin/objects/PropertyComponentBuilder;",
        "LC7/o;",
        "thisType",
        "",
        "name",
        "<init>",
        "(LC7/o;Ljava/lang/String;)V",
        "R",
        "Lkotlin/Function1;",
        "body",
        "get",
        "(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;",
        "T",
        "Lkotlin/Function2;",
        "Li7/B;",
        "set",
        "(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;",
        "LC7/o;",
        "getThisType",
        "()LC7/o;",
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
.field private final thisType:LC7/o;


# direct methods
.method public constructor <init>(LC7/o;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "thisType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "name"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->thisType:LC7/o;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final synthetic get(Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis<",
            "TThisType;>;"
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
    new-instance v1, Lexpo/modules/kotlin/types/AnyType;

    .line 9
    .line 10
    invoke-virtual {p0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x0

    .line 15
    const/4 v4, 0x2

    .line 16
    invoke-direct {v1, v2, v3, v4, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v1}, [Lexpo/modules/kotlin/types/AnyType;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 24
    .line 25
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    const/4 v4, 0x4

    .line 30
    const-string v5, "R"

    .line 31
    .line 32
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const-class v6, Ljava/lang/Object;

    .line 36
    .line 37
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 46
    .line 47
    if-nez v3, :cond_0

    .line 48
    .line 49
    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 50
    .line 51
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-direct {v3, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 69
    .line 70
    .line 71
    move-result-object v4

    .line 72
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_0
    new-instance v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$get$1$1;

    .line 76
    .line 77
    invoke-direct {v2, p1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$get$1$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 78
    .line 79
    .line 80
    const-string p1, "get"

    .line 81
    .line 82
    invoke-direct {v0, p1, v1, v3, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x1

    .line 93
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 97
    .line 98
    .line 99
    return-object p0
.end method

.method public final getThisType()LC7/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->thisType:LC7/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final synthetic set(Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis<",
            "TThisType;>;"
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
    new-instance v1, Lexpo/modules/kotlin/types/AnyType;

    .line 9
    .line 10
    invoke-virtual {p0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const/4 v3, 0x2

    .line 15
    const/4 v4, 0x0

    .line 16
    invoke-direct {v1, v2, v4, v3, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 17
    .line 18
    .line 19
    sget-object v2, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 20
    .line 21
    new-instance v3, Lkotlin/Pair;

    .line 22
    .line 23
    const/4 v5, 0x4

    .line 24
    const-string v6, "T"

    .line 25
    .line 26
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-class v7, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 32
    .line 33
    .line 34
    move-result-object v8

    .line 35
    const/4 v9, 0x3

    .line 36
    invoke-static {v9, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const/4 v10, 0x0

    .line 40
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 41
    .line 42
    .line 43
    move-result-object v11

    .line 44
    invoke-direct {v3, v8, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    .line 56
    .line 57
    if-nez v2, :cond_0

    .line 58
    .line 59
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 60
    .line 61
    .line 62
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 63
    .line 64
    .line 65
    sget-object v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1;->INSTANCE:Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$set$$inlined$apply$lambda$1;

    .line 66
    .line 67
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 68
    .line 69
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    .line 70
    .line 71
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v9, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-direct {v8, v5, v10, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 82
    .line 83
    .line 84
    invoke-direct {v3, v8, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 85
    .line 86
    .line 87
    move-object v2, v3

    .line 88
    :cond_0
    filled-new-array {v1, v2}, [Lexpo/modules/kotlin/types/AnyType;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 93
    .line 94
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object v3

    .line 98
    const-class v4, Li7/B;

    .line 99
    .line 100
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v3

    .line 108
    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 109
    .line 110
    if-nez v3, :cond_1

    .line 111
    .line 112
    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 113
    .line 114
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-direct {v3, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v4}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    .line 133
    .line 134
    .line 135
    new-instance v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$set$1$1;

    .line 136
    .line 137
    invoke-direct {v2, p1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis$set$1$1;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    const-string p1, "set"

    .line 141
    .line 142
    invoke-direct {v0, p1, v1, v3, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    .line 150
    .line 151
    .line 152
    const/4 p1, 0x1

    .line 153
    invoke-virtual {v0, p1}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setSetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 157
    .line 158
    .line 159
    return-object p0
.end method
