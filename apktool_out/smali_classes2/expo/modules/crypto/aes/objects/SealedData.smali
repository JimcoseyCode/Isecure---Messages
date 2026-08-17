.class public final Lexpo/modules/crypto/aes/objects/SealedData;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007B!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0006\u0010\u000cB!\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0006\u0010\u000eJ\u000e\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020-J\u0008\u0010.\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00108BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0018\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00108@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010\u0012R\u0011\u0010\u001b\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u001dR\u0011\u0010\"\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\u001dR\u0011\u0010$\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010&R\u0011\u0010\'\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010&R\u0011\u0010)\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010&\u00a8\u0006/"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/objects/SealedData;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "config",
        "Lexpo/modules/crypto/aes/records/SealedDataConfig;",
        "content",
        "",
        "<init>",
        "(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V",
        "iv",
        "ciphertextLength",
        "",
        "tagLength",
        "([BII)V",
        "ciphertextWithTag",
        "([B[BI)V",
        "ivBuffer",
        "Ljava/nio/ByteBuffer;",
        "getIvBuffer",
        "()Ljava/nio/ByteBuffer;",
        "tagBuffer",
        "getTagBuffer",
        "combinedBuffer",
        "getCombinedBuffer",
        "ciphertextBuffer",
        "getCiphertextBuffer",
        "taggedCiphertextBuffer",
        "getTaggedCiphertextBuffer$expo_crypto_release",
        "combinedSize",
        "getCombinedSize",
        "()I",
        "ivSize",
        "getIvSize",
        "tagSize",
        "getTagSize",
        "ciphertextSize",
        "getCiphertextSize",
        "ivBytes",
        "getIvBytes",
        "()[B",
        "tagBytes",
        "getTagBytes",
        "combinedArray",
        "getCombinedArray",
        "ciphertextBytes",
        "withTag",
        "",
        "getAdditionalMemoryPressure",
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
.field private final config:Lexpo/modules/crypto/aes/records/SealedDataConfig;

.field private final content:[B


# direct methods
.method public constructor <init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V
    .locals 2

    const-string v0, "config"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/runtime/Runtime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/SealedData;->config:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 3
    iput-object p2, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 4
    array-length p1, p2

    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvSize()I

    move-result p2

    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    move-result v0

    add-int/2addr p2, v0

    if-lt p1, p2, :cond_0

    return-void

    .line 5
    :cond_0
    new-instance p1, Lexpo/modules/crypto/aes/InvalidSealedDataConfigException;

    invoke-direct {p1}, Lexpo/modules/crypto/aes/InvalidSealedDataConfigException;-><init>()V

    throw p1
.end method

.method public constructor <init>([BII)V
    .locals 2

    const-string v0, "iv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance v0, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    array-length v1, p1

    invoke-direct {v0, v1, p3}, Lexpo/modules/crypto/aes/records/SealedDataConfig;-><init>(II)V

    .line 7
    array-length v1, p1

    add-int/2addr v1, p2

    add-int/2addr v1, p3

    new-array p2, v1, [B

    .line 8
    invoke-static {p2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p3

    invoke-static {p3}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 9
    invoke-virtual {p3, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 10
    sget-object p1, Li7/B;->a:Li7/B;

    .line 11
    invoke-direct {p0, v0, p2}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V

    return-void
.end method

.method public constructor <init>([B[BI)V
    .locals 2

    const-string v0, "iv"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ciphertextWithTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    new-instance v0, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    array-length v1, p1

    invoke-direct {v0, v1, p3}, Lexpo/modules/crypto/aes/records/SealedDataConfig;-><init>(II)V

    .line 13
    invoke-static {p1, p2}, Lj7/j;->s([B[B)[B

    move-result-object p1

    .line 14
    invoke-direct {p0, v0, p1}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>(Lexpo/modules/crypto/aes/records/SealedDataConfig;[B)V

    return-void
.end method

.method private final getCiphertextBuffer()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvSize()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getCiphertextSize()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "wrap(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private final getCombinedBuffer()Ljava/nio/ByteBuffer;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "wrap(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method private final getIvBuffer()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvSize()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "wrap(...)"

    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method private final getTagBuffer()Ljava/nio/ByteBuffer;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    .line 5
    .line 6
    .line 7
    move-result v2

    .line 8
    sub-int/2addr v1, v2

    .line 9
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "wrap(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method public final ciphertextBytes(Z)[B
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTaggedCiphertextBuffer$expo_crypto_release()Ljava/nio/ByteBuffer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getCiphertextBuffer()Ljava/nio/ByteBuffer;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    :goto_0
    invoke-static {p1}, Lexpo/modules/crypto/aes/extensions/ByteArrayExtensionsKt;->copiedArray(Ljava/nio/ByteBuffer;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public getAdditionalMemoryPressure()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final getCiphertextSize()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getCombinedSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvSize()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    sub-int/2addr v0, v1

    .line 15
    return v0
.end method

.method public final getCombinedArray()[B
    .locals 2

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getCombinedBuffer()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "array(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getCombinedSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    array-length v0, v0

    .line 4
    return v0
.end method

.method public final getIvBytes()[B
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvBuffer()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lexpo/modules/crypto/aes/extensions/ByteArrayExtensionsKt;->copiedArray(Ljava/nio/ByteBuffer;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getIvSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->config:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/records/SealedDataConfig;->getIvLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getTagBytes()[B
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagBuffer()Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lexpo/modules/crypto/aes/extensions/ByteArrayExtensionsKt;->copiedArray(Ljava/nio/ByteBuffer;)[B

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public final getTagSize()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->config:Lexpo/modules/crypto/aes/records/SealedDataConfig;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/records/SealedDataConfig;->getTagLength()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getTaggedCiphertextBuffer$expo_crypto_release()Ljava/nio/ByteBuffer;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/SealedData;->content:[B

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvSize()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getCiphertextSize()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-virtual {p0}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    add-int/2addr v2, v3

    .line 16
    invoke-static {v0, v1, v2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "wrap(...)"

    .line 21
    .line 22
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method
