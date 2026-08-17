.class public final enum Lexpo/modules/crypto/aes/enums/KeyEncoding;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/crypto/aes/enums/KeyEncoding;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/enums/KeyEncoding;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "BASE64",
        "HEX",
        "expo-crypto_release"
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

.field private static final synthetic $VALUES:[Lexpo/modules/crypto/aes/enums/KeyEncoding;

.field public static final enum BASE64:Lexpo/modules/crypto/aes/enums/KeyEncoding;

.field public static final enum HEX:Lexpo/modules/crypto/aes/enums/KeyEncoding;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/crypto/aes/enums/KeyEncoding;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->BASE64:Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/crypto/aes/enums/KeyEncoding;->HEX:Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "base64"

    .line 5
    .line 6
    const-string v3, "BASE64"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/crypto/aes/enums/KeyEncoding;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->BASE64:Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "hex"

    .line 17
    .line 18
    const-string v3, "HEX"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/crypto/aes/enums/KeyEncoding;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->HEX:Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 24
    .line 25
    invoke-static {}, Lexpo/modules/crypto/aes/enums/KeyEncoding;->$values()[Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->$VALUES:[Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 30
    .line 31
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 36
    .line 37
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->value:Ljava/lang/String;

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
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/crypto/aes/enums/KeyEncoding;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/crypto/aes/enums/KeyEncoding;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->$VALUES:[Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/crypto/aes/enums/KeyEncoding;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/enums/KeyEncoding;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
