.class public final Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0016\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n\u0012\n\u0010\r\u001a\u00060\tj\u0002`\u000c\u0012\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B/\u0008\u0016\u0012\u0006\u0010\u0019\u001a\u00020\t\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u001a\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u001b\u00a2\u0006\u0004\u0008\u0017\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0014\u0010 \u001a\u00060\u0002j\u0002`\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0010\u0010$\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0014\u0010&\u001a\u00060\tj\u0002`\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0014\u0010(\u001a\u00060\tj\u0002`\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010\'J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0010\u0010+\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0010\u0010/\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010!J\u0010\u00100\u001a\u00020\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0098\u0001\u00102\u001a\u00020\u00002\u000c\u0008\u0002\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000c\u0008\u0002\u0010\u000b\u001a\u00060\tj\u0002`\n2\u000c\u0008\u0002\u0010\r\u001a\u00060\tj\u0002`\u000c2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0016\u001a\u00020\u0015H\u00c6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010!J\u0010\u00106\u001a\u000205H\u00d6\u0001\u00a2\u0006\u0004\u00086\u00107J\u001a\u0010:\u001a\u00020\u00102\u0008\u00109\u001a\u0004\u0018\u000108H\u00d6\u0003\u00a2\u0006\u0004\u0008:\u0010;R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010<\u001a\u0004\u0008=\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010<\u001a\u0004\u0008>\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010<\u001a\u0004\u0008?\u0010!R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010@\u001a\u0004\u0008A\u0010%R\u001b\u0010\u000b\u001a\u00060\tj\u0002`\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010B\u001a\u0004\u0008C\u0010\'R\u001b\u0010\r\u001a\u00060\tj\u0002`\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010B\u001a\u0004\u0008D\u0010\'R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010E\u001a\u0004\u0008F\u0010*R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010G\u001a\u0004\u0008H\u0010,R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010I\u001a\u0004\u0008J\u0010.R\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010<\u001a\u0004\u0008K\u0010!R\u0017\u0010\u0016\u001a\u00020\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010L\u001a\u0004\u0008M\u00101\u00a8\u0006N"
    }
    d2 = {
        "Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;",
        "Lexpo/modules/kotlin/devtools/cdp/JsonSerializable;",
        "",
        "Lexpo/modules/kotlin/devtools/cdp/RequestId;",
        "requestId",
        "loaderId",
        "documentURL",
        "Lexpo/modules/kotlin/devtools/cdp/Request;",
        "request",
        "Ljava/math/BigDecimal;",
        "Lexpo/modules/kotlin/devtools/cdp/MonotonicTime;",
        "timestamp",
        "Lexpo/modules/kotlin/devtools/cdp/TimeSinceEpoch;",
        "wallTime",
        "",
        "initiator",
        "",
        "redirectHasExtraInfo",
        "Lexpo/modules/kotlin/devtools/cdp/Response;",
        "redirectResponse",
        "referrerPolicy",
        "Lexpo/modules/kotlin/devtools/cdp/ResourceType;",
        "type",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)V",
        "now",
        "Le9/B;",
        "Le9/D;",
        "(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;Le9/D;)V",
        "Lorg/json/JSONObject;",
        "toJSONObject",
        "()Lorg/json/JSONObject;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Lexpo/modules/kotlin/devtools/cdp/Request;",
        "component5",
        "()Ljava/math/BigDecimal;",
        "component6",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "()Z",
        "component9",
        "()Lexpo/modules/kotlin/devtools/cdp/Response;",
        "component10",
        "component11",
        "()Lexpo/modules/kotlin/devtools/cdp/ResourceType;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;",
        "toString",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getRequestId",
        "getLoaderId",
        "getDocumentURL",
        "Lexpo/modules/kotlin/devtools/cdp/Request;",
        "getRequest",
        "Ljava/math/BigDecimal;",
        "getTimestamp",
        "getWallTime",
        "Ljava/util/Map;",
        "getInitiator",
        "Z",
        "getRedirectHasExtraInfo",
        "Lexpo/modules/kotlin/devtools/cdp/Response;",
        "getRedirectResponse",
        "getReferrerPolicy",
        "Lexpo/modules/kotlin/devtools/cdp/ResourceType;",
        "getType",
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
.field private final documentURL:Ljava/lang/String;

.field private final initiator:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final loaderId:Ljava/lang/String;

.field private final redirectHasExtraInfo:Z

.field private final redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

.field private final referrerPolicy:Ljava/lang/String;

.field private final request:Lexpo/modules/kotlin/devtools/cdp/Request;

.field private final requestId:Ljava/lang/String;

.field private final timestamp:Ljava/math/BigDecimal;

.field private final type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

.field private final wallTime:Ljava/math/BigDecimal;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/devtools/cdp/Request;",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lexpo/modules/kotlin/devtools/cdp/Response;",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/devtools/cdp/ResourceType;",
            ")V"
        }
    .end annotation

    const-string v0, "requestId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "loaderId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentURL"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "request"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timestamp"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "wallTime"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initiator"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referrerPolicy"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "type"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 6
    iput-object p5, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 7
    iput-object p6, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 8
    iput-object p7, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 9
    iput-boolean p8, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 10
    iput-object p9, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 11
    iput-object p10, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 12
    iput-object p11, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 14

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 13
    const-string v1, ""

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object/from16 v4, p2

    :goto_0
    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_1

    .line 14
    const-string v1, "mobile"

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p3

    :goto_1
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_2

    .line 15
    const-string v1, "type"

    const-string v2, "script"

    invoke-static {v1, v2}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, Lj7/K;->f(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    move-object/from16 v9, p7

    :goto_2
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_3

    .line 16
    const-string v0, "no-referrer"

    move-object v12, v0

    :goto_3
    move-object v2, p0

    move-object v3, p1

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v13, p11

    goto :goto_4

    :cond_3
    move-object/from16 v12, p10

    goto :goto_3

    .line 17
    :goto_4
    invoke-direct/range {v2 .. v13}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)V

    return-void
.end method

.method public constructor <init>(Ljava/math/BigDecimal;Ljava/lang/String;Le9/B;Le9/D;)V
    .locals 17

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "now"

    move-object/from16 v8, p1

    invoke-static {v8, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "requestId"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "request"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v7, Lexpo/modules/kotlin/devtools/cdp/Request;

    invoke-direct {v7, v0}, Lexpo/modules/kotlin/devtools/cdp/Request;-><init>(Le9/B;)V

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    move v11, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-eqz v1, :cond_1

    .line 19
    new-instance v0, Lexpo/modules/kotlin/devtools/cdp/Response;

    invoke-direct {v0, v1}, Lexpo/modules/kotlin/devtools/cdp/Response;-><init>(Le9/D;)V

    :goto_2
    move-object v12, v0

    goto :goto_3

    :cond_1
    const/4 v0, 0x0

    goto :goto_2

    .line 20
    :goto_3
    sget-object v14, Lexpo/modules/kotlin/devtools/cdp/ResourceType;->OTHER:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    const/16 v15, 0x246

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v9, p1

    move-object/from16 v3, p0

    .line 21
    invoke-direct/range {v3 .. v16}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;ILjava/lang/Object;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;
    .locals 0

    .line 1
    and-int/lit8 p13, p12, 0x1

    if-eqz p13, :cond_0

    iget-object p1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p13, p12, 0x2

    if-eqz p13, :cond_1

    iget-object p2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    :cond_1
    and-int/lit8 p13, p12, 0x4

    if-eqz p13, :cond_2

    iget-object p3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    :cond_2
    and-int/lit8 p13, p12, 0x8

    if-eqz p13, :cond_3

    iget-object p4, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    :cond_3
    and-int/lit8 p13, p12, 0x10

    if-eqz p13, :cond_4

    iget-object p5, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    :cond_4
    and-int/lit8 p13, p12, 0x20

    if-eqz p13, :cond_5

    iget-object p6, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    :cond_5
    and-int/lit8 p13, p12, 0x40

    if-eqz p13, :cond_6

    iget-object p7, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    :cond_6
    and-int/lit16 p13, p12, 0x80

    if-eqz p13, :cond_7

    iget-boolean p8, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    :cond_7
    and-int/lit16 p13, p12, 0x100

    if-eqz p13, :cond_8

    iget-object p9, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    :cond_8
    and-int/lit16 p13, p12, 0x200

    if-eqz p13, :cond_9

    iget-object p10, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    :cond_9
    and-int/lit16 p12, p12, 0x400

    if-eqz p12, :cond_a

    iget-object p11, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    :cond_a
    move-object p12, p10

    move-object p13, p11

    move p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p13}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component10()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component11()Lexpo/modules/kotlin/devtools/cdp/ResourceType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component4()Lexpo/modules/kotlin/devtools/cdp/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component5()Ljava/math/BigDecimal;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component6()Ljava/math/BigDecimal;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component7()Ljava/util/Map;
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
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component8()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 2
    .line 3
    return v0
.end method

.method public final component9()Lexpo/modules/kotlin/devtools/cdp/Response;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/devtools/cdp/Request;",
            "Ljava/math/BigDecimal;",
            "Ljava/math/BigDecimal;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z",
            "Lexpo/modules/kotlin/devtools/cdp/Response;",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/devtools/cdp/ResourceType;",
            ")",
            "Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;"
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
    const-string v0, "loaderId"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "documentURL"

    .line 12
    .line 13
    move-object/from16 v4, p3

    .line 14
    .line 15
    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string v0, "request"

    .line 19
    .line 20
    move-object/from16 v5, p4

    .line 21
    .line 22
    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v0, "timestamp"

    .line 26
    .line 27
    move-object/from16 v6, p5

    .line 28
    .line 29
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, "wallTime"

    .line 33
    .line 34
    move-object/from16 v7, p6

    .line 35
    .line 36
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string v0, "initiator"

    .line 40
    .line 41
    move-object/from16 v8, p7

    .line 42
    .line 43
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "referrerPolicy"

    .line 47
    .line 48
    move-object/from16 v11, p10

    .line 49
    .line 50
    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v0, "type"

    .line 54
    .line 55
    move-object/from16 v12, p11

    .line 56
    .line 57
    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    new-instance v1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;

    .line 61
    .line 62
    move-object v2, p1

    .line 63
    move-object v3, p2

    .line 64
    move/from16 v9, p8

    .line 65
    .line 66
    move-object/from16 v10, p9

    .line 67
    .line 68
    invoke-direct/range {v1 .. v12}, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/Request;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/util/Map;ZLexpo/modules/kotlin/devtools/cdp/Response;Ljava/lang/String;Lexpo/modules/kotlin/devtools/cdp/ResourceType;)V

    .line 69
    .line 70
    .line 71
    return-object v1
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
    instance-of v1, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;

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
    check-cast p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 47
    .line 48
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_5

    .line 55
    .line 56
    return v2

    .line 57
    :cond_5
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 58
    .line 59
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 60
    .line 61
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_6

    .line 66
    .line 67
    return v2

    .line 68
    :cond_6
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 69
    .line 70
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 71
    .line 72
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_7

    .line 77
    .line 78
    return v2

    .line 79
    :cond_7
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 80
    .line 81
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 82
    .line 83
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    if-nez v1, :cond_8

    .line 88
    .line 89
    return v2

    .line 90
    :cond_8
    iget-boolean v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 91
    .line 92
    iget-boolean v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 93
    .line 94
    if-eq v1, v3, :cond_9

    .line 95
    .line 96
    return v2

    .line 97
    :cond_9
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 98
    .line 99
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 100
    .line 101
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    if-nez v1, :cond_a

    .line 106
    .line 107
    return v2

    .line 108
    :cond_a
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v3, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v1

    .line 116
    if-nez v1, :cond_b

    .line 117
    .line 118
    return v2

    .line 119
    :cond_b
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 120
    .line 121
    iget-object p1, p1, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 122
    .line 123
    if-eq v1, p1, :cond_c

    .line 124
    .line 125
    return v2

    .line 126
    :cond_c
    return v0
.end method

.method public final getDocumentURL()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getInitiator()Ljava/util/Map;
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
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getLoaderId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRedirectHasExtraInfo()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 2
    .line 3
    return v0
.end method

.method public final getRedirectResponse()Lexpo/modules/kotlin/devtools/cdp/Response;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getReferrerPolicy()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRequest()Lexpo/modules/kotlin/devtools/cdp/Request;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getRequestId()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTimestamp()Ljava/math/BigDecimal;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Lexpo/modules/kotlin/devtools/cdp/ResourceType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getWallTime()Ljava/math/BigDecimal;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

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
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 28
    .line 29
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/Request;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    mul-int/lit8 v0, v0, 0x1f

    .line 35
    .line 36
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/math/BigDecimal;->hashCode()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    add-int/2addr v0, v1

    .line 43
    mul-int/lit8 v0, v0, 0x1f

    .line 44
    .line 45
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/math/BigDecimal;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    add-int/2addr v0, v1

    .line 52
    mul-int/lit8 v0, v0, 0x1f

    .line 53
    .line 54
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    add-int/2addr v0, v1

    .line 61
    mul-int/lit8 v0, v0, 0x1f

    .line 62
    .line 63
    iget-boolean v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 64
    .line 65
    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    add-int/2addr v0, v1

    .line 70
    mul-int/lit8 v0, v0, 0x1f

    .line 71
    .line 72
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 73
    .line 74
    if-nez v1, :cond_0

    .line 75
    .line 76
    const/4 v1, 0x0

    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/Response;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :goto_0
    add-int/2addr v0, v1

    .line 83
    mul-int/lit8 v0, v0, 0x1f

    .line 84
    .line 85
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    add-int/2addr v0, v1

    .line 92
    mul-int/lit8 v0, v0, 0x1f

    .line 93
    .line 94
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    add-int/2addr v0, v1

    .line 101
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
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 11
    .line 12
    .line 13
    const-string v1, "loaderId"

    .line 14
    .line 15
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    const-string v1, "documentURL"

    .line 21
    .line 22
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 28
    .line 29
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/Request;->toJSONObject()Lorg/json/JSONObject;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const-string v2, "request"

    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    const-string v1, "timestamp"

    .line 39
    .line 40
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    const-string v1, "wallTime"

    .line 46
    .line 47
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 48
    .line 49
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 50
    .line 51
    .line 52
    new-instance v1, Lorg/json/JSONObject;

    .line 53
    .line 54
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 55
    .line 56
    invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 57
    .line 58
    .line 59
    const-string v2, "initiator"

    .line 60
    .line 61
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    .line 63
    .line 64
    const-string v1, "redirectHasExtraInfo"

    .line 65
    .line 66
    iget-boolean v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 67
    .line 68
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 72
    .line 73
    if-eqz v1, :cond_0

    .line 74
    .line 75
    const-string v2, "redirectResponse"

    .line 76
    .line 77
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/Response;->toJSONObject()Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 82
    .line 83
    .line 84
    :cond_0
    const-string v1, "referrerPolicy"

    .line 85
    .line 86
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 89
    .line 90
    .line 91
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 92
    .line 93
    invoke-virtual {v1}, Lexpo/modules/kotlin/devtools/cdp/ResourceType;->getValue()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-string v2, "type"

    .line 98
    .line 99
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    .line 102
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->requestId:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->loaderId:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->documentURL:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->request:Lexpo/modules/kotlin/devtools/cdp/Request;

    .line 8
    .line 9
    iget-object v4, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->timestamp:Ljava/math/BigDecimal;

    .line 10
    .line 11
    iget-object v5, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->wallTime:Ljava/math/BigDecimal;

    .line 12
    .line 13
    iget-object v6, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->initiator:Ljava/util/Map;

    .line 14
    .line 15
    iget-boolean v7, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectHasExtraInfo:Z

    .line 16
    .line 17
    iget-object v8, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->redirectResponse:Lexpo/modules/kotlin/devtools/cdp/Response;

    .line 18
    .line 19
    iget-object v9, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->referrerPolicy:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v10, p0, Lexpo/modules/kotlin/devtools/cdp/RequestWillBeSentParams;->type:Lexpo/modules/kotlin/devtools/cdp/ResourceType;

    .line 22
    .line 23
    new-instance v11, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v12, "RequestWillBeSentParams(requestId="

    .line 29
    .line 30
    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v0, ", loaderId="

    .line 37
    .line 38
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ", documentURL="

    .line 45
    .line 46
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", request="

    .line 53
    .line 54
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v0, ", timestamp="

    .line 61
    .line 62
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", wallTime="

    .line 69
    .line 70
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v0, ", initiator="

    .line 77
    .line 78
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    const-string v0, ", redirectHasExtraInfo="

    .line 85
    .line 86
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string v0, ", redirectResponse="

    .line 93
    .line 94
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string v0, ", referrerPolicy="

    .line 101
    .line 102
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    const-string v0, ", type="

    .line 109
    .line 110
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    const-string v0, ")"

    .line 117
    .line 118
    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    return-object v0
.end method
