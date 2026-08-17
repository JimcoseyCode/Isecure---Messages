.class public final Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\n\u0008\u0086\u0008\u0018\u00002\u00020\u0001BI\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0016\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cB%\u0008\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u000b\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0014\u0010\u0015\u001a\u00060\u0002j\u0002`\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJX\u0010\u001c\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0014\u0008\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00052\u0018\u0008\u0002\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u0016J\u0010\u0010 \u001a\u00020\u001fH\u00d6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u001a\u0010%\u001a\u00020$2\u0008\u0010#\u001a\u0004\u0018\u00010\"H\u00d6\u0003\u00a2\u0006\u0004\u0008%\u0010&R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\'\u001a\u0004\u0008(\u0010\u0016R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010)\u001a\u0004\u0008*\u0010\u0018R\'\u0010\u0008\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005j\u0002`\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010)\u001a\u0004\u0008+\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010,\u001a\u0004\u0008-\u0010\u001b\u00a8\u0006."
    }
    d2 = {
        "Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;",
        "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;",
        "",
        "Lexpo/modules/kotlin/devtools/cdp/RequestId;",
        "requestId",
        "",
        "associatedCookies",
        "Lexpo/modules/kotlin/devtools/cdp/Headers;",
        "headers",
        "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;",
        "connectTiming",
        "<init>",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)V",
        "Ljava/math/BigDecimal;",
        "now",
        "Le9/B;",
        "request",
        "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;)V",
        "Lorg/json/JSONObject;",
        "toJSONObject",
        "()Lorg/json/JSONObject;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/Map;",
        "component3",
        "component4",
        "()Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;",
        "copy",
        "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getRequestId",
        "Ljava/util/Map;",
        "getAssociatedCookies",
        "getHeaders",
        "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;",
        "getConnectTiming",
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
.field private final associatedCookies:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

.field private final headers:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final requestId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;",
            ")V"
        }
    .end annotation

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "associatedCookies"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "connectTiming"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 4
    iput-object p3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 5
    iput-object p4, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    .line 6
    invoke-static {}, Lj7/K;->i()Ljava/util/Map;

    move-result-object p2

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)V

    return-void
.end method

.method public constructor <init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;)V
    .locals 7

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p3}, Le9/B;->i()Le9/t;

    move-result-object p3

    invoke-static {p3}, Lexpo/modules/kotlin/devtools/OkHttpExtensionsKt;->toSingleMap(Le9/t;)Ljava/util/Map;

    move-result-object v3

    .line 9
    new-instance v4, Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    invoke-direct {v4, p1}, Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;-><init>(Ljava/math/BigDecimal;)V

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p2

    .line 10
    invoke-direct/range {v0 .. v6}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;ILjava/lang/Object;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget-object p3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->copy(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;",
            ")",
            "Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;"
        }
    .end annotation

    .line 1
    const-string v0, "requestId"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "associatedCookies"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "headers"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "connectTiming"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2, p3, p4}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 25
    .line 26
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 36
    .line 37
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 38
    .line 39
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-nez v1, :cond_4

    .line 44
    .line 45
    return v2

    .line 46
    :cond_4
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 47
    .line 48
    iget-object p1, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 49
    .line 50
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    return v0
.end method

.method public final getAssociatedCookies()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getConnectTiming()Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeaders()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRequestId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 28
    .line 29
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    return v0
.end method

.method public toJSONObject()Lorg/json/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lorg/json/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "requestId"

    .line 7
    .line 8
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    new-instance v1, Lorg/json/JSONObject;

    .line 14
    .line 15
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 16
    .line 17
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 18
    .line 19
    .line 20
    const-string v2, "associatedCookies"

    .line 21
    .line 22
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    .line 24
    .line 25
    new-instance v1, Lorg/json/JSONObject;

    .line 26
    .line 27
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 28
    .line 29
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 30
    .line 31
    .line 32
    const-string v2, "headers"

    .line 33
    .line 34
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 38
    .line 39
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;->toJSONObject()Lorg/json/JSONObject;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "connectTiming"

    .line 44
    .line 45
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 46
    .line 47
    .line 48
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->associatedCookies:Ljava/util/Map;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->headers:Ljava/util/Map;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentExtraInfoParams;->connectTiming:Lexpo/modules/kotlin/devtools/cdp/ConnectTiming;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "RequestWillBeSentExtraInfoParams(requestId="

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", associatedCookies="

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ", headers="

    .line 31
    .line 32
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", connectTiming="

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
