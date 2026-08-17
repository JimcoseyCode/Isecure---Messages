.class public final Lexpo/modules/crypto/aes/records/DecryptOptions;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/records/Record;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u0006\u0010\u0003\u001a\u0004\u0008\u0007\u0010\u0008R0\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\nj\u0004\u0018\u0001`\r8\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\u0008\u000e\u0010\u0003\u001a\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/records/DecryptOptions;",
        "Lexpo/modules/kotlin/records/Record;",
        "<init>",
        "()V",
        "output",
        "Lexpo/modules/crypto/aes/enums/DataFormat;",
        "getOutput$annotations",
        "getOutput",
        "()Lexpo/modules/crypto/aes/enums/DataFormat;",
        "additionalData",
        "Lexpo/modules/kotlin/types/Either;",
        "",
        "",
        "Lexpo/modules/crypto/aes/BinaryInput;",
        "getAdditionalData$annotations",
        "getAdditionalData",
        "()Lexpo/modules/kotlin/types/Either;",
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


# instance fields
.field private final additionalData:Lexpo/modules/kotlin/types/Either;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final output:Lexpo/modules/crypto/aes/enums/DataFormat;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lexpo/modules/crypto/aes/enums/DataFormat;->BYTES:Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 5
    .line 6
    iput-object v0, p0, Lexpo/modules/crypto/aes/records/DecryptOptions;->output:Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic getAdditionalData$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method

.method public static synthetic getOutput$annotations()V
    .locals 0
    .annotation runtime Lexpo/modules/kotlin/records/Field;
    .end annotation

    .line 1
    return-void
.end method


# virtual methods
.method public final getAdditionalData()Lexpo/modules/kotlin/types/Either;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/DecryptOptions;->additionalData:Lexpo/modules/kotlin/types/Either;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getOutput()Lexpo/modules/crypto/aes/enums/DataFormat;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/records/DecryptOptions;->output:Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 2
    .line 3
    return-object v0
.end method
