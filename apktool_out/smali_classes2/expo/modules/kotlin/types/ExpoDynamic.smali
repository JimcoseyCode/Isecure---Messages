.class public final Lexpo/modules/kotlin/types/ExpoDynamic;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/kotlin/types/ExpoDynamic$Type;,
        Lexpo/modules/kotlin/types/ExpoDynamic$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000eJ\u0006\u0010\u000f\u001a\u00020\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0015J\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lexpo/modules/kotlin/types/ExpoDynamic;",
        "",
        "dynamic",
        "Lcom/facebook/react/bridge/Dynamic;",
        "<init>",
        "(Lcom/facebook/react/bridge/Dynamic;)V",
        "type",
        "Lexpo/modules/kotlin/types/ExpoDynamic$Type;",
        "getType",
        "()Lexpo/modules/kotlin/types/ExpoDynamic$Type;",
        "isNull",
        "",
        "()Z",
        "asArray",
        "",
        "asBoolean",
        "asDouble",
        "",
        "asInt",
        "",
        "asMap",
        "",
        "",
        "asString",
        "Type",
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
.field private final dynamic:Lcom/facebook/react/bridge/Dynamic;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 1

    .line 1
    const-string v0, "dynamic"

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
    iput-object p1, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final asArray()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asArray()Lcom/facebook/react/bridge/ReadableArray;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableArray;->toArrayList()Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 15
    .line 16
    const-class v1, Lcom/facebook/react/bridge/ReadableArray;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(LC7/d;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final asBoolean()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asBoolean()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final asDouble()D
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public final asInt()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asInt()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final asMap()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asMap()Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface {v0}, Lcom/facebook/react/bridge/ReadableMap;->toHashMap()Ljava/util/HashMap;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 15
    .line 16
    const-class v1, Lcom/facebook/react/bridge/ReadableMap;

    .line 17
    .line 18
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(LC7/d;)V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method public final asString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->asString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/DynamicCastException;

    .line 11
    .line 12
    const-class v1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-direct {v0, v1}, Lexpo/modules/kotlin/exception/DynamicCastException;-><init>(LC7/d;)V

    .line 19
    .line 20
    .line 21
    throw v0
.end method

.method public final getType()Lexpo/modules/kotlin/types/ExpoDynamic$Type;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lexpo/modules/kotlin/types/ExpoDynamic$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    aget v0, v1, v0

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance v0, Li7/m;

    .line 19
    .line 20
    invoke-direct {v0}, Li7/m;-><init>()V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :pswitch_0
    sget-object v0, Lexpo/modules/kotlin/types/ExpoDynamic$Type;->Array:Lexpo/modules/kotlin/types/ExpoDynamic$Type;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_1
    sget-object v0, Lexpo/modules/kotlin/types/ExpoDynamic$Type;->Map:Lexpo/modules/kotlin/types/ExpoDynamic$Type;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_2
    sget-object v0, Lexpo/modules/kotlin/types/ExpoDynamic$Type;->String:Lexpo/modules/kotlin/types/ExpoDynamic$Type;

    .line 31
    .line 32
    return-object v0

    .line 33
    :pswitch_3
    sget-object v0, Lexpo/modules/kotlin/types/ExpoDynamic$Type;->Number:Lexpo/modules/kotlin/types/ExpoDynamic$Type;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_4
    sget-object v0, Lexpo/modules/kotlin/types/ExpoDynamic$Type;->Boolean:Lexpo/modules/kotlin/types/ExpoDynamic$Type;

    .line 37
    .line 38
    return-object v0

    .line 39
    :pswitch_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 40
    .line 41
    const-string v1, "ExpoDynamic is null"

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final isNull()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/types/ExpoDynamic;->dynamic:Lcom/facebook/react/bridge/Dynamic;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/bridge/Dynamic;->isNull()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "ExpoDynamic is null"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method
