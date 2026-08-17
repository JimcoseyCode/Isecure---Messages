.class public final enum Lexpo/modules/fetch/ResponseState;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/fetch/ResponseState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0008\u0080\u0081\u0002\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lexpo/modules/fetch/ResponseState;",
        "",
        "intValue",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getIntValue",
        "()I",
        "INITIALIZED",
        "STARTED",
        "RESPONSE_RECEIVED",
        "BODY_COMPLETED",
        "BODY_STREAMING_STARTED",
        "BODY_STREAMING_CANCELED",
        "ERROR_RECEIVED",
        "expo_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/fetch/ResponseState;

.field public static final enum BODY_COMPLETED:Lexpo/modules/fetch/ResponseState;

.field public static final enum BODY_STREAMING_CANCELED:Lexpo/modules/fetch/ResponseState;

.field public static final enum BODY_STREAMING_STARTED:Lexpo/modules/fetch/ResponseState;

.field public static final enum ERROR_RECEIVED:Lexpo/modules/fetch/ResponseState;

.field public static final enum INITIALIZED:Lexpo/modules/fetch/ResponseState;

.field public static final enum RESPONSE_RECEIVED:Lexpo/modules/fetch/ResponseState;

.field public static final enum STARTED:Lexpo/modules/fetch/ResponseState;


# instance fields
.field private final intValue:I


# direct methods
.method private static final synthetic $values()[Lexpo/modules/fetch/ResponseState;
    .locals 7

    .line 1
    sget-object v0, Lexpo/modules/fetch/ResponseState;->INITIALIZED:Lexpo/modules/fetch/ResponseState;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/fetch/ResponseState;->STARTED:Lexpo/modules/fetch/ResponseState;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/fetch/ResponseState;->RESPONSE_RECEIVED:Lexpo/modules/fetch/ResponseState;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/fetch/ResponseState;->BODY_COMPLETED:Lexpo/modules/fetch/ResponseState;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/fetch/ResponseState;->BODY_STREAMING_STARTED:Lexpo/modules/fetch/ResponseState;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/fetch/ResponseState;->BODY_STREAMING_CANCELED:Lexpo/modules/fetch/ResponseState;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/fetch/ResponseState;->ERROR_RECEIVED:Lexpo/modules/fetch/ResponseState;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Lexpo/modules/fetch/ResponseState;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 2
    .line 3
    const-string v1, "INITIALIZED"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lexpo/modules/fetch/ResponseState;->INITIALIZED:Lexpo/modules/fetch/ResponseState;

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 12
    .line 13
    const-string v1, "STARTED"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Lexpo/modules/fetch/ResponseState;->STARTED:Lexpo/modules/fetch/ResponseState;

    .line 20
    .line 21
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 22
    .line 23
    const-string v1, "RESPONSE_RECEIVED"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v0, Lexpo/modules/fetch/ResponseState;->RESPONSE_RECEIVED:Lexpo/modules/fetch/ResponseState;

    .line 30
    .line 31
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 32
    .line 33
    const-string v1, "BODY_COMPLETED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lexpo/modules/fetch/ResponseState;->BODY_COMPLETED:Lexpo/modules/fetch/ResponseState;

    .line 40
    .line 41
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 42
    .line 43
    const-string v1, "BODY_STREAMING_STARTED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v0, Lexpo/modules/fetch/ResponseState;->BODY_STREAMING_STARTED:Lexpo/modules/fetch/ResponseState;

    .line 50
    .line 51
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 52
    .line 53
    const-string v1, "BODY_STREAMING_CANCELED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/fetch/ResponseState;->BODY_STREAMING_CANCELED:Lexpo/modules/fetch/ResponseState;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/fetch/ResponseState;

    .line 62
    .line 63
    const-string v1, "ERROR_RECEIVED"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2}, Lexpo/modules/fetch/ResponseState;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, Lexpo/modules/fetch/ResponseState;->ERROR_RECEIVED:Lexpo/modules/fetch/ResponseState;

    .line 70
    .line 71
    invoke-static {}, Lexpo/modules/fetch/ResponseState;->$values()[Lexpo/modules/fetch/ResponseState;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, Lexpo/modules/fetch/ResponseState;->$VALUES:[Lexpo/modules/fetch/ResponseState;

    .line 76
    .line 77
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, Lexpo/modules/fetch/ResponseState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput p3, p0, Lexpo/modules/fetch/ResponseState;->intValue:I

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/fetch/ResponseState;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/fetch/ResponseState;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/fetch/ResponseState;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/fetch/ResponseState;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/fetch/ResponseState;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/fetch/ResponseState;->$VALUES:[Lexpo/modules/fetch/ResponseState;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/fetch/ResponseState;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getIntValue()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/fetch/ResponseState;->intValue:I

    .line 2
    .line 3
    return v0
.end method
