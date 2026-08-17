.class public final Lexpo/modules/kotlin/functions/FunctionBuilder;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\u00082\u0010\u0008\u0004\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006H\u0087\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ3\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0004\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\rJA\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0004\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0010JO\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0008\u0004\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00000\u0012H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0013J]\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022 \u0008\u0004\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00000\u0015H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0016Jk\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u0001\"\u0006\u0008\u0004\u0010\u0017\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022&\u0008\u0004\u0010\u0007\u001a \u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00000\u0018H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u0019Jy\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u0001\"\u0006\u0008\u0004\u0010\u0017\u0018\u0001\"\u0006\u0008\u0005\u0010\u001a\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022,\u0008\u0004\u0010\u0007\u001a&\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u00000\u001bH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u001cJ\u0087\u0001\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u0001\"\u0006\u0008\u0004\u0010\u0017\u0018\u0001\"\u0006\u0008\u0005\u0010\u001a\u0018\u0001\"\u0006\u0008\u0006\u0010\u001d\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000222\u0008\u0004\u0010\u0007\u001a,\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00000\u001eH\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u001fJ\u0095\u0001\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u0001\"\u0006\u0008\u0004\u0010\u0017\u0018\u0001\"\u0006\u0008\u0005\u0010\u001a\u0018\u0001\"\u0006\u0008\u0006\u0010\u001d\u0018\u0001\"\u0006\u0008\u0007\u0010 \u0018\u00012\u0006\u0010\u0003\u001a\u00020\u000228\u0008\u0004\u0010\u0007\u001a2\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u00000!H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\"J\u00a3\u0001\u0010\u000b\u001a\u00020\u0008\"\u0006\u0008\u0000\u0010\u000c\u0018\u0001\"\u0006\u0008\u0001\u0010\u000e\u0018\u0001\"\u0006\u0008\u0002\u0010\u0011\u0018\u0001\"\u0006\u0008\u0003\u0010\u0014\u0018\u0001\"\u0006\u0008\u0004\u0010\u0017\u0018\u0001\"\u0006\u0008\u0005\u0010\u001a\u0018\u0001\"\u0006\u0008\u0006\u0010\u001d\u0018\u0001\"\u0006\u0008\u0007\u0010 \u0018\u0001\"\u0006\u0008\u0008\u0010#\u0018\u00012\u0006\u0010\u0003\u001a\u00020\u00022>\u0008\u0004\u0010\u0007\u001a8\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\u0008\u0012\u0004\u0012\u00028\u00000$H\u0086\u0008\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u000b\u0010%J\u000f\u0010(\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008&\u0010\'R \u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010)\u0012\u0004\u0008,\u0010-\u001a\u0004\u0008*\u0010+R*\u0010.\u001a\u0004\u0018\u00010\u00088\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008.\u0010/\u0012\u0004\u00083\u0010-\u001a\u0004\u00080\u0010\'\"\u0004\u00081\u00102\u0082\u0002\u0007\n\u0005\u0008\u009920\u0001\u00a8\u00064"
    }
    d2 = {
        "Lexpo/modules/kotlin/functions/FunctionBuilder;",
        "",
        "",
        "name",
        "<init>",
        "(Ljava/lang/String;)V",
        "Lkotlin/Function0;",
        "body",
        "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "BodyWithoutArgs",
        "(Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "Body",
        "R",
        "(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P0",
        "Lkotlin/Function1;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P1",
        "Lkotlin/Function2;",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P2",
        "Lkotlin/Function3;",
        "(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P3",
        "Lkotlin/Function4;",
        "(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P4",
        "Lkotlin/Function5;",
        "(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P5",
        "Lkotlin/Function6;",
        "(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P6",
        "Lkotlin/Function7;",
        "(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "P7",
        "Lkotlin/Function8;",
        "(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "build$expo_modules_core_release",
        "()Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "build",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "getName$annotations",
        "()V",
        "functionComponent",
        "Lexpo/modules/kotlin/functions/SyncFunctionComponent;",
        "getFunctionComponent",
        "setFunctionComponent",
        "(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V",
        "getFunctionComponent$annotations",
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
.field private functionComponent:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

.field private final name:Ljava/lang/String;


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
    iput-object p1, p0, Lexpo/modules/kotlin/functions/FunctionBuilder;->name:Ljava/lang/String;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic getFunctionComponent$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getName$annotations()V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final synthetic Body(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "P0:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    new-instance v0, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v1, 0x4

    .line 8
    const-string v2, "P0"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 9
    sget-object v3, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 10
    new-instance v4, Lkotlin/Pair;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v5, Ljava/lang/Object;

    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v7, 0x3

    invoke-static {v7, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-direct {v4, v6, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_0

    .line 12
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$1;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$1;

    .line 13
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 14
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    .line 15
    invoke-static {v7, v2}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 16
    invoke-direct {v6, v9, v8, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v2, 0x0

    .line 17
    invoke-direct {v4, v6, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 18
    :cond_0
    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 19
    sget-object v3, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 20
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    const-string v6, "R"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v4, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_1

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v4, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 21
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    invoke-static {v1, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v1

    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    :cond_1
    new-instance v1, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$5;

    invoke-direct {v1, p2}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$5;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 23
    invoke-direct {v0, p1, v2, v4, v1}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 24
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic Body(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
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
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function2;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 26
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 27
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 28
    sget-object v6, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 29
    new-instance v7, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v8, Ljava/lang/Object;

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v10, 0x3

    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v11, 0x0

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v12

    invoke-direct {v7, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 30
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    const/4 v9, 0x0

    if-nez v7, :cond_0

    .line 31
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v7, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$2;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$2;

    .line 32
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 33
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 34
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 35
    invoke-direct {v14, v15, v11, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 36
    invoke-direct {v13, v14, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v13

    .line 37
    :cond_0
    new-instance v4, Lkotlin/Pair;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v13, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 38
    invoke-virtual {v6}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_1

    .line 39
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$3;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$3;

    .line 40
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 41
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    .line 42
    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 43
    invoke-direct {v12, v13, v11, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 44
    invoke-direct {v6, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v6

    .line 45
    :cond_1
    filled-new-array {v7, v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v4

    .line 46
    sget-object v5, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 47
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v6

    const-string v7, "R"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-interface {v6, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v6, :cond_2

    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 48
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v8}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-interface {v5, v3, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    :cond_2
    new-instance v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$7;

    invoke-direct {v3, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$7;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 50
    invoke-direct {v2, v0, v4, v6, v3}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 51
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v1, 0x0

    new-array v1, v1, [Lexpo/modules/kotlin/types/AnyType;

    .line 2
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 3
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x4

    const-string v5, "R"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v6, Ljava/lang/Object;

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v3, :cond_0

    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v3, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 4
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v2

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-interface {v2, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    :cond_0
    new-instance v2, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$3;

    invoke-direct {v2, p2}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$3;-><init>(Lw7/a;)V

    invoke-direct {v0, p1, v1, v3, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 6
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v0
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/o;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
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
            "Ljava/lang/String;",
            "Lw7/o;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 53
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 54
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 55
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 56
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 57
    new-instance v8, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v9, Ljava/lang/Object;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v11, 0x3

    invoke-static {v11, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-direct {v8, v10, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    const/4 v10, 0x0

    if-nez v8, :cond_0

    .line 59
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v8, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$4;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$4;

    .line 60
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    .line 61
    new-instance v15, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 62
    invoke-static {v11, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 63
    invoke-direct {v15, v3, v12, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 64
    invoke-direct {v14, v15, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v8, v14

    .line 65
    :cond_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 67
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$5;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$5;

    .line 68
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 69
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 70
    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 71
    invoke-direct {v14, v15, v12, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 72
    invoke-direct {v4, v14, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 73
    :cond_1
    new-instance v4, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 75
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$6;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$6;

    .line 76
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 77
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    .line 78
    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 79
    invoke-direct {v7, v13, v12, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 80
    invoke-direct {v5, v7, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    goto :goto_0

    :cond_2
    const/4 v15, 0x4

    .line 81
    :goto_0
    filled-new-array {v8, v3, v4}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 82
    sget-object v4, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 83
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    const-string v6, "R"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_3

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 84
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    :cond_3
    new-instance v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$9;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$9;-><init>(Lw7/o;)V

    .line 86
    invoke-direct {v2, v0, v3, v5, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 87
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/p;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
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
            "P3:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lw7/p;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 89
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 90
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 91
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 92
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 93
    sget-object v8, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 94
    new-instance v9, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v10, Ljava/lang/Object;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v12, 0x3

    invoke-static {v12, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v13, 0x0

    invoke-static {v13}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v14

    invoke-direct {v9, v11, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_0

    .line 96
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v9, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$7;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$7;

    .line 97
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 98
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 99
    invoke-static {v12, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 100
    invoke-direct {v11, v3, v13, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 101
    invoke-direct {v15, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v15

    .line 102
    :cond_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 104
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$8;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$8;

    .line 105
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 106
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 107
    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 108
    invoke-direct {v11, v15, v13, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 109
    invoke-direct {v4, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 110
    :cond_1
    new-instance v4, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 111
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 112
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$9;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$9;

    .line 113
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 114
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    .line 115
    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 116
    invoke-direct {v11, v15, v13, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 117
    invoke-direct {v5, v11, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 118
    :cond_2
    new-instance v5, Lkotlin/Pair;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 119
    invoke-virtual {v8}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3

    .line 120
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$10;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$10;

    .line 121
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 122
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v15, 0x4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    .line 123
    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 124
    invoke-direct {v8, v11, v13, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v5, 0x0

    .line 125
    invoke-direct {v6, v8, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    goto :goto_0

    :cond_3
    const/4 v15, 0x4

    .line 126
    :goto_0
    filled-new-array {v9, v3, v4, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 127
    sget-object v4, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 128
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    const-string v6, "R"

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_4

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 129
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    :cond_4
    new-instance v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$11;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$11;-><init>(Lw7/p;)V

    .line 131
    invoke-direct {v2, v0, v3, v5, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 132
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/q;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
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
            "P3:",
            "Ljava/lang/Object;",
            "P4:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lw7/q;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 134
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 135
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 136
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 137
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 138
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 139
    sget-object v9, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 140
    new-instance v10, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v11, Ljava/lang/Object;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v13, 0x3

    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v14, 0x0

    invoke-static {v14}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v10, v12, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 141
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/AnyType;

    if-nez v10, :cond_0

    .line 142
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v10, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$11;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$11;

    .line 143
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 144
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    .line 145
    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v4, 0x0

    .line 146
    invoke-direct {v14, v3, v4, v10}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 147
    invoke-direct {v12, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v10, v12

    .line 148
    :cond_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 150
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$12;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$12;

    .line 151
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 152
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 153
    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 154
    invoke-direct {v12, v14, v5, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 155
    invoke-direct {v4, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v4

    .line 156
    :cond_1
    new-instance v4, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v5, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 157
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    if-nez v4, :cond_2

    .line 158
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$13;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$13;

    .line 159
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 160
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 161
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 162
    invoke-direct {v12, v14, v6, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 163
    invoke-direct {v5, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v4, v5

    .line 164
    :cond_2
    new-instance v5, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v5, v6, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 165
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_3

    .line 166
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v5, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$14;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$14;

    .line 167
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 168
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    .line 169
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 170
    invoke-direct {v12, v14, v7, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v5, 0x0

    .line 171
    invoke-direct {v6, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v6

    .line 172
    :cond_3
    new-instance v6, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v6, v7, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 173
    invoke-virtual {v9}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_4

    .line 174
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v6, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$15;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$15;

    .line 175
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 176
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    .line 177
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v8, 0x0

    .line 178
    invoke-direct {v9, v12, v8, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v6, 0x0

    .line 179
    invoke-direct {v7, v9, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    goto :goto_0

    :cond_4
    const/4 v14, 0x4

    .line 180
    :goto_0
    filled-new-array {v10, v3, v4, v5, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 181
    sget-object v4, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 182
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    const-string v6, "R"

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_5

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 183
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    :cond_5
    new-instance v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$13;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$13;-><init>(Lw7/q;)V

    .line 185
    invoke-direct {v2, v0, v3, v5, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 186
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/r;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 24
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
            "Ljava/lang/String;",
            "Lw7/r;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 187
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 188
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 189
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 190
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 191
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 192
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 193
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 194
    sget-object v10, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 195
    new-instance v11, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v12, Ljava/lang/Object;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    invoke-static {v14, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v11, v13, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 196
    invoke-virtual {v10}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v13

    invoke-interface {v13, v11}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lexpo/modules/kotlin/types/AnyType;

    if-nez v11, :cond_0

    .line 197
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v11, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$16;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$16;

    .line 198
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 199
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v17, v10

    const/4 v10, 0x3

    .line 200
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 201
    invoke-direct {v14, v3, v4, v11}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 202
    invoke-direct {v13, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v18, v13

    goto :goto_0

    :cond_0
    move-object/from16 v17, v10

    move v10, v14

    move-object/from16 v18, v11

    .line 203
    :goto_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 205
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$17;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$17;

    .line 206
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 207
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 208
    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 209
    invoke-direct {v10, v13, v5, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 210
    invoke-direct {v4, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v4

    goto :goto_1

    :cond_1
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v19, v3

    .line 211
    :goto_1
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 212
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_2

    .line 213
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$18;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$18;

    .line 214
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 215
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v14, 0x3

    .line 216
    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 217
    invoke-direct {v5, v10, v6, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 218
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v4

    goto :goto_2

    :cond_2
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v3

    .line 219
    :goto_2
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 220
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_3

    .line 221
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$19;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$19;

    .line 222
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 223
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 224
    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 225
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 226
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v4

    goto :goto_3

    :cond_3
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v21, v3

    .line 227
    :goto_3
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 228
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_4

    .line 229
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$20;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$20;

    .line 230
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 231
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 232
    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 233
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 234
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v4

    goto :goto_4

    :cond_4
    const/4 v11, 0x4

    const/4 v14, 0x3

    move-object/from16 v22, v3

    .line 235
    :goto_4
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 236
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_5

    .line 237
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$21;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$21;

    .line 238
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 239
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v11, 0x4

    invoke-static {v11, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v14, 0x3

    .line 240
    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 241
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 242
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v4

    goto :goto_5

    :cond_5
    const/4 v11, 0x4

    move-object/from16 v23, v3

    .line 243
    :goto_5
    filled-new-array/range {v18 .. v23}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 244
    sget-object v4, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 245
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    const-string v6, "R"

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_6

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 246
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static {v11, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    :cond_6
    new-instance v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$15;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$15;-><init>(Lw7/r;)V

    .line 248
    invoke-direct {v2, v0, v3, v5, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 249
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/s;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 26
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
            "Ljava/lang/String;",
            "Lw7/s;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 250
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 251
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 252
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 253
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 254
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 255
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 256
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 257
    const-string v10, "P6"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 258
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 259
    new-instance v12, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v13, Ljava/lang/Object;

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x3

    invoke-static {v15, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v15

    invoke-direct {v12, v14, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 260
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    if-nez v12, :cond_0

    .line 261
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v12, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$22;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$22;

    .line 262
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v11

    .line 263
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static {v13}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v18, v13

    const/4 v13, 0x3

    .line 264
    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 265
    invoke-direct {v11, v3, v4, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 266
    invoke-direct {v14, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v14

    goto :goto_0

    :cond_0
    move-object/from16 v17, v11

    move-object/from16 v18, v13

    const/4 v13, 0x3

    move-object/from16 v19, v12

    .line 267
    :goto_0
    new-instance v3, Lkotlin/Pair;

    const/4 v4, 0x4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 268
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 269
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$23;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$23;

    .line 270
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 271
    new-instance v11, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v14, 0x3

    .line 272
    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 273
    invoke-direct {v11, v13, v5, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 274
    invoke-direct {v4, v11, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v4

    goto :goto_1

    :cond_1
    const/4 v12, 0x4

    const/4 v14, 0x3

    move-object/from16 v20, v3

    .line 275
    :goto_1
    new-instance v3, Lkotlin/Pair;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_2

    .line 277
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$24;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$24;

    .line 278
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 279
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v11

    const/4 v13, 0x3

    .line 280
    invoke-static {v13, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 281
    invoke-direct {v5, v11, v6, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 282
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v4

    goto :goto_2

    :cond_2
    const/4 v12, 0x4

    const/4 v13, 0x3

    move-object/from16 v21, v3

    .line 283
    :goto_2
    new-instance v3, Lkotlin/Pair;

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 284
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_3

    .line 285
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$25;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$25;

    .line 286
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 287
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v13, 0x3

    .line 288
    invoke-static {v13, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 289
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 290
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v4

    goto :goto_3

    :cond_3
    const/4 v12, 0x4

    const/4 v13, 0x3

    move-object/from16 v22, v3

    .line 291
    :goto_3
    new-instance v3, Lkotlin/Pair;

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 292
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_4

    .line 293
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$26;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$26;

    .line 294
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 295
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v13, 0x3

    .line 296
    invoke-static {v13, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 297
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 298
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v4

    goto :goto_4

    :cond_4
    const/4 v12, 0x4

    const/4 v13, 0x3

    move-object/from16 v23, v3

    .line 299
    :goto_4
    new-instance v3, Lkotlin/Pair;

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 300
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_5

    .line 301
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$27;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$27;

    .line 302
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 303
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v13, 0x3

    .line 304
    invoke-static {v13, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 305
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 306
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v4

    goto :goto_5

    :cond_5
    const/4 v12, 0x4

    const/4 v13, 0x3

    move-object/from16 v24, v3

    .line 307
    :goto_5
    new-instance v3, Lkotlin/Pair;

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v3, v4, v15}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 308
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_6

    .line 309
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$28;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$28;

    .line 310
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 311
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v12, 0x4

    invoke-static {v12, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v13, 0x3

    .line 312
    invoke-static {v13, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 313
    invoke-direct {v5, v6, v7, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v3, 0x0

    .line 314
    invoke-direct {v4, v5, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v4

    goto :goto_6

    :cond_6
    const/4 v12, 0x4

    move-object/from16 v25, v3

    .line 315
    :goto_6
    filled-new-array/range {v19 .. v25}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 316
    sget-object v4, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 317
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    const-string v6, "R"

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-interface {v5, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_7

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v5, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 318
    invoke-virtual {v4}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    :cond_7
    new-instance v4, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$17;

    invoke-direct {v4, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$17;-><init>(Lw7/s;)V

    .line 320
    invoke-direct {v2, v0, v3, v5, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 321
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final synthetic Body(Ljava/lang/String;Lw7/t;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
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
            "P7:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Lw7/t;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "name"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "body"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 322
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v3, 0x4

    .line 323
    const-string v4, "P0"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 324
    const-string v5, "P1"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 325
    const-string v6, "P2"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 326
    const-string v7, "P3"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 327
    const-string v8, "P4"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 328
    const-string v9, "P5"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 329
    const-string v10, "P6"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 330
    const-string v11, "P7"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    .line 331
    sget-object v12, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 332
    new-instance v13, Lkotlin/Pair;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const-class v14, Ljava/lang/Object;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v3, 0x3

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/16 v16, 0x0

    invoke-static/range {v16 .. v16}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-direct {v13, v15, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 333
    invoke-virtual {v12}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lexpo/modules/kotlin/types/AnyType;

    if-nez v13, :cond_0

    .line 334
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v13, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$29;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$29;

    .line 335
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v17, v12

    .line 336
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v14

    const/4 v14, 0x4

    invoke-static {v14, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v0, 0x3

    .line 337
    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    move/from16 v4, v16

    .line 338
    invoke-direct {v12, v14, v4, v13}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v4, 0x0

    .line 339
    invoke-direct {v15, v12, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v19, v15

    goto :goto_0

    :cond_0
    move-object/from16 v17, v12

    move-object/from16 v18, v14

    const/4 v0, 0x3

    move-object/from16 v19, v13

    .line 340
    :goto_0
    new-instance v4, Lkotlin/Pair;

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-static {v0, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v4, v12, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 341
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_1

    .line 342
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$30;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$30;

    .line 343
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 344
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v13

    const/4 v15, 0x3

    .line 345
    invoke-static {v15, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v5, 0x0

    .line 346
    invoke-direct {v12, v13, v5, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 347
    invoke-direct {v4, v12, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v20, v4

    goto :goto_1

    :cond_1
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v20, v0

    .line 348
    :goto_1
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_2

    .line 350
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$31;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$31;

    .line 351
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 352
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    const/4 v15, 0x3

    .line 353
    invoke-static {v15, v6}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v6, 0x0

    .line 354
    invoke-direct {v5, v12, v6, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 355
    invoke-direct {v4, v5, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v21, v4

    goto :goto_2

    :cond_2
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v21, v0

    .line 356
    :goto_2
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 357
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_3

    .line 358
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$32;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$32;

    .line 359
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 360
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 361
    invoke-static {v15, v7}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 362
    invoke-direct {v5, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 363
    invoke-direct {v4, v5, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v22, v4

    goto :goto_3

    :cond_3
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v22, v0

    .line 364
    :goto_3
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 365
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_4

    .line 366
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$33;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$33;

    .line 367
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 368
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 369
    invoke-static {v15, v8}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 370
    invoke-direct {v5, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 371
    invoke-direct {v4, v5, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v23, v4

    goto :goto_4

    :cond_4
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v23, v0

    .line 372
    :goto_4
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 373
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_5

    .line 374
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$34;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$34;

    .line 375
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 376
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 377
    invoke-static {v15, v9}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 378
    invoke-direct {v5, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 379
    invoke-direct {v4, v5, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v24, v4

    goto :goto_5

    :cond_5
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v24, v0

    .line 380
    :goto_5
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 381
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_6

    .line 382
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$35;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$35;

    .line 383
    new-instance v4, Lexpo/modules/kotlin/types/AnyType;

    .line 384
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    const/4 v15, 0x3

    .line 385
    invoke-static {v15, v10}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 386
    invoke-direct {v5, v6, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 387
    invoke-direct {v4, v5, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v25, v4

    goto :goto_6

    :cond_6
    const/4 v14, 0x4

    const/4 v15, 0x3

    move-object/from16 v25, v0

    .line 388
    :goto_6
    new-instance v0, Lkotlin/Pair;

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-direct {v0, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 389
    invoke-virtual/range {v17 .. v17}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    if-nez v0, :cond_7

    .line 390
    invoke-static {}, Lkotlin/jvm/internal/l;->l()V

    sget-object v0, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$36;->INSTANCE:Lexpo/modules/kotlin/functions/FunctionBuilder$Body$$inlined$toArgsArray$default$36;

    .line 391
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 392
    new-instance v4, Lexpo/modules/kotlin/types/LazyKType;

    const/4 v14, 0x4

    invoke-static {v14, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    const/4 v15, 0x3

    .line 393
    invoke-static {v15, v11}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    const/4 v7, 0x0

    .line 394
    invoke-direct {v4, v5, v7, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v0, 0x0

    .line 395
    invoke-direct {v3, v4, v0}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v26, v3

    goto :goto_7

    :cond_7
    const/4 v14, 0x4

    move-object/from16 v26, v0

    .line 396
    :goto_7
    filled-new-array/range {v19 .. v26}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v0

    .line 397
    sget-object v3, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 398
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    const-string v5, "R"

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_8

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v4, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 399
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    invoke-static {v14, v5}, Lkotlin/jvm/internal/l;->m(ILjava/lang/String;)V

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    :cond_8
    new-instance v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$19;

    invoke-direct {v3, v1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$19;-><init>(Lw7/t;)V

    move-object/from16 v1, p1

    .line 401
    invoke-direct {v2, v1, v0, v4, v3}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v0, p0

    .line 402
    invoke-virtual {v0, v2}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    return-object v2
.end method

.method public final BodyWithoutArgs(Lw7/a;)Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw7/a;",
            ")",
            "Lexpo/modules/kotlin/functions/SyncFunctionComponent;"
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
    invoke-virtual {p0}, Lexpo/modules/kotlin/functions/FunctionBuilder;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    new-array v2, v2, [Lexpo/modules/kotlin/types/AnyType;

    .line 14
    .line 15
    sget-object v3, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 16
    .line 17
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-class v5, Ljava/lang/Object;

    .line 22
    .line 23
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-interface {v4, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    .line 32
    .line 33
    if-nez v4, :cond_0

    .line 34
    .line 35
    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    .line 36
    .line 37
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    invoke-direct {v4, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    :cond_0
    new-instance v3, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$1;

    .line 56
    .line 57
    invoke-direct {v3, p1}, Lexpo/modules/kotlin/functions/FunctionBuilder$Body$1;-><init>(Lw7/a;)V

    .line 58
    .line 59
    .line 60
    invoke-direct {v0, v1, v2, v4, v3}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lexpo/modules/kotlin/functions/FunctionBuilder;->setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 64
    .line 65
    .line 66
    return-object v0
.end method

.method public final build$expo_modules_core_release()Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/FunctionBuilder;->functionComponent:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 7
    .line 8
    const-string v1, "Required value was null."

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method public final getFunctionComponent()Lexpo/modules/kotlin/functions/SyncFunctionComponent;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/FunctionBuilder;->functionComponent:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/functions/FunctionBuilder;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final setFunctionComponent(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/functions/FunctionBuilder;->functionComponent:Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 2
    .line 3
    return-void
.end method
