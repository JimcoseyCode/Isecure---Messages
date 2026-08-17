.class public final Lexpo/modules/crypto/aes/AesCryptoModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/crypto/aes/AesCryptoModule$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\n\u001a\u00020\u000bH\u0016J2\u0010\u000c\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0002J\"\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u001aH\u0002JN\u0010\u001b\u001a\u00020\r2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u00122\u0014\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u000fH\u0002J\u001c\u0010 \u001a\u00020\u0010*\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000fj\u0002`\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006!"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/AesCryptoModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "rng",
        "Ljava/security/SecureRandom;",
        "getRng",
        "()Ljava/security/SecureRandom;",
        "rng$delegate",
        "Lkotlin/Lazy;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "encrypt",
        "Lexpo/modules/crypto/aes/objects/SealedData;",
        "plaintext",
        "Lexpo/modules/kotlin/types/Either;",
        "",
        "",
        "Lexpo/modules/crypto/aes/BinaryInput;",
        "key",
        "Lexpo/modules/crypto/aes/objects/EncryptionKey;",
        "options",
        "Lexpo/modules/crypto/aes/records/EncryptOptions;",
        "decrypt",
        "",
        "sealedData",
        "Lexpo/modules/crypto/aes/records/DecryptOptions;",
        "sealedDataFromParts",
        "iv",
        "ciphertext",
        "tag",
        "",
        "toBytes",
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
.field private final rng$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/crypto/aes/a;

    .line 5
    .line 6
    invoke-direct {v0}, Lexpo/modules/crypto/aes/a;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/crypto/aes/AesCryptoModule;->rng$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic access$decrypt(Lexpo/modules/crypto/aes/AesCryptoModule;Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/crypto/aes/AesCryptoModule;->decrypt(Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$encrypt(Lexpo/modules/crypto/aes/AesCryptoModule;Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/crypto/aes/AesCryptoModule;->encrypt(Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$sealedDataFromParts(Lexpo/modules/crypto/aes/AesCryptoModule;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/crypto/aes/AesCryptoModule;->sealedDataFromParts(Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic b()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/crypto/aes/AesCryptoModule;->rng_delegate$lambda$0()Ljava/security/SecureRandom;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method private final decrypt(Lexpo/modules/crypto/aes/objects/SealedData;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/DecryptOptions;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p2}, Lexpo/modules/crypto/aes/objects/EncryptionKey;->getCryptoKey()Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    :try_start_0
    const-string v0, "AES/GCM/NoPadding"

    .line 6
    .line 7
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v1, Ljavax/crypto/spec/GCMParameterSpec;

    .line 12
    .line 13
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/objects/SealedData;->getTagSize()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    mul-int/lit8 v2, v2, 0x8

    .line 18
    .line 19
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/objects/SealedData;->getIvBytes()[B

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-direct {v1, v2, v3}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[B)V

    .line 24
    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-virtual {v0, v2, p2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 28
    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/DecryptOptions;->getAdditionalData()Lexpo/modules/kotlin/types/Either;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    invoke-direct {p0, p2}, Lexpo/modules/crypto/aes/AesCryptoModule;->toBytes(Lexpo/modules/kotlin/types/Either;)[B

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    :cond_0
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-static {v0, p1}, Lexpo/modules/crypto/aes/extensions/CipherExtensionsKt;->decrypt(Ljavax/crypto/Cipher;Lexpo/modules/crypto/aes/objects/SealedData;)Ljava/nio/ByteBuffer;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string p2, "array(...)"

    .line 60
    .line 61
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    if-eqz p3, :cond_1

    .line 65
    .line 66
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/DecryptOptions;->getOutput()Lexpo/modules/crypto/aes/enums/DataFormat;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 p2, 0x0

    .line 72
    :goto_1
    invoke-static {p1, p2}, Lexpo/modules/crypto/aes/extensions/ByteArrayExtensionsKt;->formatted([BLexpo/modules/crypto/aes/enums/DataFormat;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    return-object p1

    .line 77
    :goto_2
    new-instance p2, Lexpo/modules/crypto/aes/DecryptionFailed;

    .line 78
    .line 79
    invoke-direct {p2, p1}, Lexpo/modules/crypto/aes/DecryptionFailed;-><init>(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    throw p2
.end method

.method private final encrypt(Lexpo/modules/kotlin/types/Either;Lexpo/modules/crypto/aes/objects/EncryptionKey;Lexpo/modules/crypto/aes/records/EncryptOptions;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;",
            "Lexpo/modules/crypto/aes/objects/EncryptionKey;",
            "Lexpo/modules/crypto/aes/records/EncryptOptions;",
            ")",
            "Lexpo/modules/crypto/aes/objects/SealedData;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lexpo/modules/crypto/aes/objects/EncryptionKey;->getCryptoKey()Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1}, Lexpo/modules/crypto/aes/AesCryptoModule;->toBytes(Lexpo/modules/kotlin/types/Either;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    :try_start_0
    const-string v0, "AES/GCM/NoPadding"

    .line 14
    .line 15
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    invoke-direct {p0}, Lexpo/modules/crypto/aes/AesCryptoModule;->getRng()Ljava/security/SecureRandom;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {p3, v1}, Lexpo/modules/crypto/aes/records/EncryptOptions;->gcmParameterSpec$expo_crypto_release(Ljava/security/SecureRandom;)Ljavax/crypto/spec/GCMParameterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    const/4 v1, 0x0

    .line 33
    :goto_0
    const/4 v2, 0x1

    .line 34
    invoke-virtual {v0, v2, p2, v1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 35
    .line 36
    .line 37
    if-eqz p3, :cond_1

    .line 38
    .line 39
    invoke-virtual {p3}, Lexpo/modules/crypto/aes/records/EncryptOptions;->getAdditionalData()Lexpo/modules/kotlin/types/Either;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    if-eqz p2, :cond_1

    .line 44
    .line 45
    invoke-direct {p0, p2}, Lexpo/modules/crypto/aes/AesCryptoModule;->toBytes(Lexpo/modules/kotlin/types/Either;)[B

    .line 46
    .line 47
    .line 48
    move-result-object p2

    .line 49
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v0, p1}, Lexpo/modules/crypto/aes/extensions/CipherExtensionsKt;->encrypt(Ljavax/crypto/Cipher;Ljava/nio/ByteBuffer;)Lexpo/modules/crypto/aes/objects/SealedData;

    .line 59
    .line 60
    .line 61
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 62
    return-object p1

    .line 63
    :goto_1
    new-instance p2, Lexpo/modules/crypto/aes/EncryptionFailed;

    .line 64
    .line 65
    invoke-direct {p2, p1}, Lexpo/modules/crypto/aes/EncryptionFailed;-><init>(Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    throw p2
.end method

.method private final getRng()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/AesCryptoModule;->rng$delegate:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/security/SecureRandom;

    .line 8
    .line 9
    return-object v0
.end method

.method private static final rng_delegate$lambda$0()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    new-instance v0, Ljava/security/SecureRandom;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/security/SecureRandom;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private final sealedDataFromParts(Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;Lexpo/modules/kotlin/types/Either;)Lexpo/modules/crypto/aes/objects/SealedData;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/Integer;",
            ">;)",
            "Lexpo/modules/crypto/aes/objects/SealedData;"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/crypto/aes/AesCryptoModule;->toBytes(Lexpo/modules/kotlin/types/Either;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-direct {p0, p2}, Lexpo/modules/crypto/aes/AesCryptoModule;->toBytes(Lexpo/modules/kotlin/types/Either;)[B

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const/4 v0, 0x1

    .line 10
    if-eqz p3, :cond_0

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {p3, v2}, Lexpo/modules/kotlin/types/Either;->isSecondType(LC7/d;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ne v2, v0, :cond_0

    .line 23
    .line 24
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {p3, v0}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p3

    .line 32
    check-cast p3, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result p3

    .line 38
    new-instance v0, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 39
    .line 40
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 41
    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_0
    if-eqz p3, :cond_1

    .line 45
    .line 46
    const-class v1, [B

    .line 47
    .line 48
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {p3, v2}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ne v2, v0, :cond_1

    .line 57
    .line 58
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p3, v0}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, [B

    .line 67
    .line 68
    new-instance v0, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 69
    .line 70
    invoke-static {p2, p3}, Lj7/j;->s([B[B)[B

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    array-length p3, p3

    .line 75
    invoke-direct {v0, p1, p2, p3}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 76
    .line 77
    .line 78
    return-object v0

    .line 79
    :cond_1
    new-instance p3, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 80
    .line 81
    const/16 v0, 0x10

    .line 82
    .line 83
    invoke-direct {p3, p1, p2, v0}, Lexpo/modules/crypto/aes/objects/SealedData;-><init>([B[BI)V

    .line 84
    .line 85
    .line 86
    return-object p3
.end method

.method private final toBytes(Lexpo/modules/kotlin/types/Either;)[B
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/types/Either<",
            "[B",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 1
    const-class v0, [B

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1, v1}, Lexpo/modules/kotlin/types/Either;->isFirstType(LC7/d;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->getFirstType(LC7/d;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, [B

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    const-class v0, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {p1, v0}, Lexpo/modules/kotlin/types/Either;->getSecondType(LC7/d;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    check-cast p1, Ljava/lang/String;

    .line 35
    .line 36
    const/4 v0, 0x2

    .line 37
    invoke-static {p1, v0}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "decode(...)"

    .line 42
    .line 43
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 37

    move-object/from16 v1, p0

    .line 1
    const-string v0, "constructor"

    const-class v2, Lexpo/modules/crypto/aes/records/DecryptOptions;

    const-class v3, Lexpo/modules/crypto/aes/records/EncryptOptions;

    const-string v4, "get"

    const-class v5, Lexpo/modules/crypto/aes/enums/KeyEncoding;

    const-class v6, Lexpo/modules/crypto/aes/enums/DataFormat;

    const-class v7, Lexpo/modules/crypto/aes/enums/KeySize;

    const-class v8, Ljava/lang/Integer;

    const-class v9, Lexpo/modules/kotlin/types/Either;

    const-class v10, Ljava/lang/Object;

    const-class v11, Lexpo/modules/crypto/aes/objects/EncryptionKey;

    const-class v12, Lexpo/modules/crypto/aes/objects/SealedData;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, ".ModuleDefinition"

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 3
    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "["

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "ExpoModulesCore"

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v15, "] "

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 4
    invoke-static {v13}, Ll1/a;->c(Ljava/lang/String;)V

    .line 5
    :try_start_0
    new-instance v13, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    invoke-direct {v13, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 6
    const-string v14, "ExpoCryptoAES"

    invoke-virtual {v13, v14}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 7
    const-string v14, "encryptAsync"

    .line 8
    invoke-virtual {v13}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v15

    .line 9
    sget-object v16, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    move-object/from16 v17, v2

    .line 10
    new-instance v2, Lkotlin/Pair;

    move-object/from16 v18, v3

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v19, v5

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v2, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_0

    .line 12
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$1;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$1;

    .line 13
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v20, v6

    .line 14
    new-instance v6, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v21, v8

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    move-object/from16 v22, v9

    const/4 v9, 0x0

    invoke-direct {v6, v8, v9, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 15
    invoke-direct {v3, v6, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v3

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_1c

    :cond_0
    move-object/from16 v20, v6

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    .line 16
    :goto_0
    new-instance v3, Lkotlin/Pair;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v3, v6, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 17
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_1

    .line 18
    sget-object v3, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$2;

    .line 19
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 20
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v11}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    move-object/from16 v23, v13

    const/4 v13, 0x0

    invoke-direct {v8, v9, v13, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 21
    invoke-direct {v6, v8, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v6

    goto :goto_1

    :cond_1
    move-object/from16 v23, v13

    .line 22
    :goto_1
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v6, v8, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 23
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v8

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_2

    .line 24
    sget-object v6, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$3;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$3;

    .line 25
    new-instance v13, Lexpo/modules/kotlin/types/AnyType;

    .line 26
    new-instance v8, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v24, v4

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v4

    move-object/from16 v18, v11

    const/4 v11, 0x1

    invoke-direct {v8, v4, v11, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 27
    invoke-direct {v13, v8, v15}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v13

    goto :goto_2

    :cond_2
    move-object/from16 v24, v4

    move-object/from16 v18, v11

    .line 28
    :goto_2
    filled-new-array {v2, v3, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 29
    new-instance v3, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$4;

    invoke-direct {v3, v1}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$4;-><init>(Lexpo/modules/crypto/aes/AesCryptoModule;)V

    .line 30
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v12, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    sget-object v11, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-class v15, Ljava/lang/String;

    if-eqz v6, :cond_3

    .line 31
    :try_start_1
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 32
    :cond_3
    invoke-static {v12, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    .line 33
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 34
    :cond_4
    invoke-static {v12, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    .line 35
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 36
    :cond_5
    invoke-static {v12, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    .line 37
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 38
    :cond_6
    invoke-static {v12, v15}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    .line 39
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_3

    .line 40
    :cond_7
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v6, v14, v2, v3}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 41
    :goto_3
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v14, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    const-string v2, "decryptAsync"

    .line 43
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v3

    .line 44
    new-instance v6, Lkotlin/Pair;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v6, v14, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v14

    invoke-interface {v14, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_8

    .line 46
    sget-object v6, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$5;

    .line 47
    new-instance v14, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v25, v12

    .line 48
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v26, v7

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    move-object/from16 v27, v15

    const/4 v15, 0x0

    invoke-direct {v12, v7, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 49
    invoke-direct {v14, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v14

    goto :goto_4

    :cond_8
    move-object/from16 v26, v7

    move-object/from16 v25, v12

    move-object/from16 v27, v15

    .line 50
    :goto_4
    new-instance v7, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v7, v12, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 51
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lexpo/modules/kotlin/types/AnyType;

    if-nez v7, :cond_9

    .line 52
    sget-object v7, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$6;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$6;

    .line 53
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 54
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v28, v5

    const/4 v5, 0x0

    invoke-direct {v14, v15, v5, v7}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 55
    invoke-direct {v12, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v7, v12

    goto :goto_5

    :cond_9
    move-object/from16 v28, v5

    .line 56
    :goto_5
    new-instance v5, Lkotlin/Pair;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v5, v12, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_a

    .line 58
    sget-object v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$7;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$7;

    .line 59
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 60
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v17, v9

    const/4 v9, 0x1

    invoke-direct {v14, v15, v9, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 61
    invoke-direct {v12, v14, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v12

    goto :goto_6

    :cond_a
    move-object/from16 v17, v9

    .line 62
    :goto_6
    filled-new-array {v6, v7, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 63
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;

    invoke-direct {v5, v1}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$AsyncFunction$8;-><init>(Lexpo/modules/crypto/aes/AesCryptoModule;)V

    .line 64
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    .line 65
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v6, v2, v3, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_7
    move-object v7, v6

    move-object/from16 v6, v27

    goto :goto_8

    .line 66
    :cond_b
    invoke-static {v10, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_c

    .line 67
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v6, v2, v3, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 68
    :cond_c
    invoke-static {v10, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 69
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v6, v2, v3, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    .line 70
    :cond_d
    invoke-static {v10, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    .line 71
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v6, v2, v3, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_7

    :cond_e
    move-object/from16 v6, v27

    .line 72
    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    .line 73
    new-instance v7, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_8

    .line 74
    :cond_f
    new-instance v7, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v7, v2, v3, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 75
    :goto_8
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    const-string v31, "EncryptionKey"

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v32

    .line 77
    new-instance v29, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 78
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v3, "Required value was null."

    if-eqz v2, :cond_58

    :try_start_2
    invoke-virtual {v2}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v30

    .line 79
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    move-object/from16 v7, v28

    invoke-direct {v2, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 80
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    const/4 v5, 0x0

    if-nez v2, :cond_10

    .line 81
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$Class$1;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$Class$1;

    .line 82
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 83
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 84
    invoke-direct {v9, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v33, v9

    goto :goto_9

    :cond_10
    move-object/from16 v33, v2

    .line 85
    :goto_9
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v34

    .line 86
    invoke-direct/range {v29 .. v34}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v2, v29

    .line 87
    new-instance v9, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v15, 0x0

    new-array v12, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 88
    sget-object v14, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 89
    invoke-virtual {v14}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v15

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v15, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_11

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-direct {v5, v15}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 90
    invoke-virtual {v14}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v15

    move-object/from16 v28, v14

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v15, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_a

    :cond_11
    move-object/from16 v28, v14

    .line 91
    :goto_a
    new-instance v14, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Constructor$1;

    invoke-direct {v14}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Constructor$1;-><init>()V

    invoke-direct {v9, v0, v12, v5, v14}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 92
    invoke-virtual {v2, v9}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 93
    const-string v5, "generate"

    .line 94
    const-class v9, Lexpo/modules/kotlin/Promise;

    move-object/from16 v12, v26

    invoke-static {v12, v9}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    .line 95
    new-instance v9, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v15, 0x0

    new-array v14, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 96
    new-instance v15, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$1;

    invoke-direct {v15}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$1;-><init>()V

    .line 97
    invoke-direct {v9, v5, v14, v15}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    move-object/from16 v29, v2

    move-object/from16 v30, v10

    move-object/from16 v26, v12

    move-object/from16 v2, v17

    move-object/from16 v10, v18

    move-object/from16 v17, v3

    goto/16 :goto_d

    .line 98
    :cond_12
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v9

    .line 99
    new-instance v14, Lkotlin/Pair;

    invoke-static {v12}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v29, v2

    move-object/from16 v2, v17

    invoke-direct {v14, v15, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 100
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v15

    invoke-interface {v15, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lexpo/modules/kotlin/types/AnyType;

    if-nez v14, :cond_13

    .line 101
    sget-object v14, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$2;

    .line 102
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    move-object/from16 v26, v12

    .line 103
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v17, v3

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    move-object/from16 v30, v10

    const/4 v10, 0x1

    invoke-direct {v12, v3, v10, v14}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 104
    invoke-direct {v15, v12, v9}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v14, v15

    goto :goto_b

    :cond_13
    move-object/from16 v17, v3

    move-object/from16 v30, v10

    move-object/from16 v26, v12

    .line 105
    :goto_b
    filled-new-array {v14}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 106
    new-instance v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$3;

    invoke-direct {v9}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$3;-><init>()V

    move-object/from16 v10, v18

    .line 107
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_14

    .line 108
    new-instance v12, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_c
    move-object v9, v12

    goto :goto_d

    .line 109
    :cond_14
    invoke-static {v10, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_15

    .line 110
    new-instance v12, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 111
    :cond_15
    invoke-static {v10, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_16

    .line 112
    new-instance v12, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 113
    :cond_16
    invoke-static {v10, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    .line 114
    new-instance v12, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 115
    :cond_17
    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_18

    .line 116
    new-instance v12, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 117
    :cond_18
    new-instance v12, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v12, v5, v3, v9}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_c

    .line 118
    :goto_d
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticAsyncFunctions()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v5, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    const-string v3, "import"

    .line 120
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 121
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v9, v12, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 122
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_19

    .line 123
    sget-object v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$4;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$4;

    .line 124
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 125
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v1, 0x0

    invoke-direct {v14, v15, v1, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 126
    invoke-direct {v12, v14, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v12

    .line 127
    :cond_19
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    invoke-direct {v1, v12, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 128
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_1a

    .line 129
    sget-object v1, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$5;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$5;

    .line 130
    new-instance v12, Lexpo/modules/kotlin/types/AnyType;

    .line 131
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v18, v2

    const/4 v2, 0x1

    invoke-direct {v14, v15, v2, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 132
    invoke-direct {v12, v14, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v12

    goto :goto_e

    :cond_1a
    move-object/from16 v18, v2

    .line 133
    :goto_e
    filled-new-array {v9, v1}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 134
    new-instance v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$6;

    invoke-direct {v2}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$StaticAsyncFunction$6;-><init>()V

    .line 135
    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    .line 136
    new-instance v5, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    .line 137
    :cond_1b
    invoke-static {v10, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    .line 138
    new-instance v5, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    .line 139
    :cond_1c
    invoke-static {v10, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1d

    .line 140
    new-instance v5, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    .line 141
    :cond_1d
    invoke-static {v10, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    .line 142
    new-instance v5, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    .line 143
    :cond_1e
    invoke-static {v10, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1f

    .line 144
    new-instance v5, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_f

    .line 145
    :cond_1f
    new-instance v5, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v5, v3, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 146
    :goto_f
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    const-string v1, "bytes"

    .line 148
    const-class v2, Lexpo/modules/kotlin/Promise;

    invoke-static {v10, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-class v3, [B

    if-eqz v2, :cond_20

    .line 149
    :try_start_3
    new-instance v2, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    const/4 v15, 0x0

    new-array v5, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 150
    new-instance v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$1;

    invoke-direct {v9}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$1;-><init>()V

    .line 151
    invoke-direct {v2, v1, v5, v9}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    goto/16 :goto_11

    .line 152
    :cond_20
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    .line 153
    new-instance v5, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v5, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 154
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_21

    .line 155
    sget-object v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$2;

    .line 156
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 157
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 158
    invoke-direct {v9, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v9

    .line 159
    :cond_21
    filled-new-array {v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 160
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$3;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$3;-><init>()V

    .line 161
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_22

    .line 162
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_10
    move-object v2, v9

    goto :goto_11

    .line 163
    :cond_22
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    .line 164
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    .line 165
    :cond_23
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_24

    .line 166
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    .line 167
    :cond_24
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_25

    .line 168
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    .line 169
    :cond_25
    invoke-static {v3, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_26

    .line 170
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    .line 171
    :cond_26
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_10

    .line 172
    :goto_11
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    const-string v1, "encoded"

    .line 174
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    .line 175
    new-instance v5, Lkotlin/Pair;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v5, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 176
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_27

    .line 177
    sget-object v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$4;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$4;

    .line 178
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 179
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v15, 0x0

    invoke-direct {v12, v10, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 180
    invoke-direct {v9, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v9

    .line 181
    :cond_27
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_28

    .line 183
    sget-object v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$5;

    .line 184
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 185
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v12, v14, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 186
    invoke-direct {v10, v12, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 187
    :cond_28
    filled-new-array {v5, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 188
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$6;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$AsyncFunction$6;-><init>()V

    .line 189
    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_29

    .line 190
    new-instance v9, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_12

    .line 191
    :cond_29
    invoke-static {v6, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2a

    .line 192
    new-instance v9, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_12

    .line 193
    :cond_2a
    invoke-static {v6, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2b

    .line 194
    new-instance v9, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_12

    .line 195
    :cond_2b
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2c

    .line 196
    new-instance v9, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_12

    .line 197
    :cond_2c
    invoke-static {v6, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2d

    .line 198
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_12

    .line 199
    :cond_2d
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v1, v2, v5}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 200
    :goto_12
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    const-string v1, "size"

    .line 202
    new-instance v2, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v5

    invoke-virtual {v5}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v5

    invoke-direct {v2, v5, v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 203
    new-instance v5, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v10

    const/4 v12, 0x2

    const/4 v14, 0x0

    invoke-direct {v9, v10, v14, v12, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v9

    .line 204
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v10, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v10, :cond_2e

    new-instance v10, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-direct {v10, v14}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 205
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v14

    invoke-static/range {v26 .. v26}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    invoke-interface {v14, v15, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    :cond_2e
    new-instance v14, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Property$1;

    invoke-direct {v14}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$8$$inlined$Property$1;-><init>()V

    move-object/from16 v15, v24

    .line 207
    invoke-direct {v5, v15, v9, v10, v14}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 208
    invoke-virtual {v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v9

    invoke-virtual {v5, v9}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v9, 0x1

    .line 209
    invoke-virtual {v5, v9}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 210
    invoke-virtual {v2, v5}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 211
    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {v29 .. v29}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 213
    const-string v33, "SealedData"

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v34

    .line 214
    new-instance v31, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;

    .line 215
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getModule()Lexpo/modules/kotlin/modules/Module;

    move-result-object v1

    if-eqz v1, :cond_57

    invoke-virtual {v1}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    move-result-object v32

    .line 216
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v2

    invoke-direct {v1, v2, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 217
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_2f

    .line 218
    sget-object v1, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$Class$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$$inlined$Class$2;

    .line 219
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 220
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v10, 0x0

    invoke-direct {v5, v9, v10, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    const/4 v14, 0x0

    .line 221
    invoke-direct {v2, v5, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v35, v2

    goto :goto_13

    :cond_2f
    move-object/from16 v35, v1

    .line 222
    :goto_13
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v36

    .line 223
    invoke-direct/range {v31 .. v36}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;-><init>(Lexpo/modules/kotlin/AppContext;Ljava/lang/String;LC7/d;Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object/from16 v1, v31

    .line 224
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    const/4 v5, 0x0

    new-array v9, v5, [Lexpo/modules/kotlin/types/AnyType;

    .line 225
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-interface {v5, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v5, :cond_30

    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v5, v10}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 226
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v10

    invoke-static/range {v30 .. v30}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    invoke-interface {v10, v14, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    :cond_30
    new-instance v10, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Constructor$1;

    invoke-direct {v10}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Constructor$1;-><init>()V

    invoke-direct {v2, v0, v9, v5, v10}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 228
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->setConstructor(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 229
    const-string v0, "fromParts"

    .line 230
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v5

    .line 231
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 232
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_31

    .line 233
    sget-object v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$1;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$1;

    .line 234
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 235
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v12

    move-object/from16 v31, v1

    const/4 v1, 0x0

    invoke-direct {v14, v12, v1, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 236
    invoke-direct {v10, v14, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    goto :goto_14

    :cond_31
    move-object/from16 v31, v1

    .line 237
    :goto_14
    new-instance v1, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v1, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 238
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    if-nez v1, :cond_32

    .line 239
    sget-object v1, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$2;

    .line 240
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 241
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    move-object/from16 v24, v3

    const/4 v3, 0x0

    invoke-direct {v12, v14, v3, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 242
    invoke-direct {v10, v12, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v1, v10

    goto :goto_15

    :cond_32
    move-object/from16 v24, v3

    .line 243
    :goto_15
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    move-object/from16 v12, v18

    invoke-direct {v3, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 244
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_33

    .line 245
    sget-object v3, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$3;

    .line 246
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 247
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    move-object/from16 v18, v15

    invoke-static/range {v22 .. v22}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    move-object/from16 v22, v6

    const/4 v6, 0x1

    invoke-direct {v14, v15, v6, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 248
    invoke-direct {v10, v14, v5}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v10

    goto :goto_16

    :cond_33
    move-object/from16 v22, v6

    move-object/from16 v18, v15

    .line 249
    :goto_16
    filled-new-array {v9, v1, v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 250
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v3, :cond_34

    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 251
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 252
    :cond_34
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$4;

    move-object/from16 v6, p0

    invoke-direct {v5, v6}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$4;-><init>(Lexpo/modules/crypto/aes/AesCryptoModule;)V

    .line 253
    invoke-direct {v2, v0, v1, v3, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 254
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticSyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    const-string v0, "fromCombined"

    .line 256
    new-instance v1, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v2

    .line 257
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 258
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_35

    .line 259
    sget-object v3, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$5;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$5;

    .line 260
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 261
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v24 .. v24}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v15, 0x0

    invoke-direct {v9, v10, v15, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 262
    invoke-direct {v5, v9, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v5

    .line 263
    :cond_35
    new-instance v5, Lkotlin/Pair;

    const-class v9, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    invoke-static {v9}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v5, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 264
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    if-nez v5, :cond_36

    .line 265
    sget-object v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$6;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$6;

    .line 266
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 267
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    const-class v14, Lexpo/modules/crypto/aes/records/SealedDataConfig;

    invoke-static {v14}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v10, v14, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 268
    invoke-direct {v9, v10, v2}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v5, v9

    .line 269
    :cond_36
    filled-new-array {v3, v5}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    .line 270
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v3

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v3, :cond_37

    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 271
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-interface {v5, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    :cond_37
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$7;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$StaticFunction$7;-><init>()V

    .line 273
    invoke-direct {v1, v0, v2, v3, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 274
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getStaticSyncFunctions()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    const-string v0, "iv"

    .line 276
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v1

    .line 277
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v3

    invoke-direct {v2, v3, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_38

    .line 279
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$1;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$1;

    .line 280
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 281
    new-instance v5, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v5, v9, v15, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 282
    invoke-direct {v3, v5, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v3

    .line 283
    :cond_38
    new-instance v3, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v3, v5, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 284
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v5

    invoke-interface {v5, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lexpo/modules/kotlin/types/AnyType;

    if-nez v3, :cond_39

    .line 285
    sget-object v3, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$2;

    .line 286
    new-instance v5, Lexpo/modules/kotlin/types/AnyType;

    .line 287
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v15, 0x1

    invoke-direct {v9, v10, v15, v3}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 288
    invoke-direct {v5, v9, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v3, v5

    .line 289
    :cond_39
    filled-new-array {v2, v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 290
    new-instance v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$3;

    invoke-direct {v2}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$3;-><init>()V

    move-object/from16 v3, v30

    .line 291
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3a

    .line 292
    new-instance v5, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v5, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    :goto_17
    move-object v9, v5

    move-object/from16 v5, v22

    goto :goto_18

    .line 293
    :cond_3a
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3b

    .line 294
    new-instance v5, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v5, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 295
    :cond_3b
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3c

    .line 296
    new-instance v5, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v5, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    .line 297
    :cond_3c
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3d

    .line 298
    new-instance v5, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v5, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_17

    :cond_3d
    move-object/from16 v5, v22

    .line 299
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_3e

    .line 300
    new-instance v9, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v9, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_18

    .line 301
    :cond_3e
    new-instance v9, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v9, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 302
    :goto_18
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    const-string v0, "tag"

    .line 304
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v1

    .line 305
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v2, v9, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 306
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_3f

    .line 307
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$4;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$4;

    .line 308
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 309
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x0

    invoke-direct {v10, v14, v15, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 310
    invoke-direct {v9, v10, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v9

    .line 311
    :cond_3f
    new-instance v9, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    invoke-direct {v9, v10, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 312
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v10

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    if-nez v9, :cond_40

    .line 313
    sget-object v9, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$5;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$5;

    .line 314
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 315
    new-instance v14, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v15

    const/4 v6, 0x1

    invoke-direct {v14, v15, v6, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 316
    invoke-direct {v10, v14, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v9, v10

    .line 317
    :cond_40
    filled-new-array {v2, v9}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 318
    new-instance v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$6;

    invoke-direct {v2}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$6;-><init>()V

    .line 319
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_41

    .line 320
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_19

    .line 321
    :cond_41
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_42

    .line 322
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_19

    .line 323
    :cond_42
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_43

    .line 324
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_19

    .line 325
    :cond_43
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_44

    .line 326
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_19

    .line 327
    :cond_44
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_45

    .line 328
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_19

    .line 329
    :cond_45
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 330
    :goto_19
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 331
    const-string v0, "combined"

    .line 332
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v1

    .line 333
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v2, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 334
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_46

    .line 335
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$7;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$7;

    .line 336
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 337
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v15, 0x0

    invoke-direct {v9, v10, v15, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 338
    invoke-direct {v6, v9, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v6

    .line 339
    :cond_46
    new-instance v6, Lkotlin/Pair;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    invoke-direct {v6, v9, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 340
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v9

    invoke-interface {v9, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_47

    .line 341
    sget-object v6, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$8;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$8;

    .line 342
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 343
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v20 .. v20}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v14

    const/4 v15, 0x1

    invoke-direct {v10, v14, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 344
    invoke-direct {v9, v10, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v9

    .line 345
    :cond_47
    filled-new-array {v2, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 346
    new-instance v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$9;

    invoke-direct {v2}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$9;-><init>()V

    .line 347
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_48

    .line 348
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1a

    .line 349
    :cond_48
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_49

    .line 350
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1a

    .line 351
    :cond_49
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4a

    .line 352
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1a

    .line 353
    :cond_4a
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4b

    .line 354
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1a

    .line 355
    :cond_4b
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4c

    .line 356
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1a

    .line 357
    :cond_4c
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v6, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 358
    :goto_1a
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    const-string v0, "ciphertext"

    .line 360
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    move-result-object v1

    .line 361
    new-instance v2, Lkotlin/Pair;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-direct {v2, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 362
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    if-nez v2, :cond_4d

    .line 363
    sget-object v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$10;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$10;

    .line 364
    new-instance v6, Lexpo/modules/kotlin/types/AnyType;

    .line 365
    new-instance v7, Lexpo/modules/kotlin/types/LazyKType;

    invoke-static/range {v25 .. v25}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v9

    const/4 v15, 0x0

    invoke-direct {v7, v9, v15, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 366
    invoke-direct {v6, v7, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v2, v6

    .line 367
    :cond_4d
    new-instance v6, Lkotlin/Pair;

    const-class v7, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    invoke-static {v7}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v7

    invoke-direct {v6, v7, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 368
    invoke-virtual/range {v16 .. v16}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    if-nez v6, :cond_4e

    .line 369
    sget-object v6, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$11;->INSTANCE:Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$11;

    .line 370
    new-instance v7, Lexpo/modules/kotlin/types/AnyType;

    .line 371
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    const-class v10, Lexpo/modules/crypto/aes/records/CiphertextOptions;

    invoke-static {v10}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v10

    const/4 v15, 0x1

    invoke-direct {v9, v10, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 372
    invoke-direct {v7, v9, v1}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    move-object v6, v7

    .line 373
    :cond_4e
    filled-new-array {v2, v6}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v1

    .line 374
    new-instance v2, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12;

    invoke-direct {v2}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$AsyncFunction$12;-><init>()V

    .line 375
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4f

    .line 376
    new-instance v3, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1b

    .line 377
    :cond_4f
    invoke-static {v3, v13}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_50

    .line 378
    new-instance v3, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1b

    .line 379
    :cond_50
    invoke-static {v3, v11}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_51

    .line 380
    new-instance v3, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1b

    .line 381
    :cond_51
    invoke-static {v3, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_52

    .line 382
    new-instance v3, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1b

    .line 383
    :cond_52
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_53

    .line 384
    new-instance v3, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1b

    .line 385
    :cond_53
    new-instance v3, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    invoke-direct {v3, v0, v1, v2}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 386
    :goto_1b
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    const-string v0, "combinedSize"

    .line 388
    new-instance v1, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    invoke-virtual {v2}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 389
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v14, 0x0

    invoke-direct {v3, v4, v14, v5, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 390
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_54

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 391
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    :cond_54
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$1;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$1;-><init>()V

    move-object/from16 v15, v18

    .line 393
    invoke-direct {v2, v15, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 394
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v3

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v6, 0x1

    .line 395
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 396
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 397
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    const-string v0, "ivSize"

    .line 399
    new-instance v1, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    invoke-virtual {v2}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 400
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v14, 0x0

    invoke-direct {v3, v4, v14, v5, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 401
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_55

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 402
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    :cond_55
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$2;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$2;-><init>()V

    .line 404
    invoke-direct {v2, v15, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 405
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v3

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v6, 0x1

    .line 406
    invoke-virtual {v2, v6}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 407
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 408
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    const-string v0, "tagSize"

    .line 410
    new-instance v1, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->getOwnerType()Lexpo/modules/kotlin/types/AnyType;

    move-result-object v2

    invoke-virtual {v2}, Lexpo/modules/kotlin/types/AnyType;->getKType()LC7/o;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;-><init>(LC7/o;Ljava/lang/String;)V

    .line 411
    new-instance v2, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v4

    const/4 v5, 0x2

    const/4 v14, 0x0

    invoke-direct {v3, v4, v14, v5, v14}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v3}, [Lexpo/modules/kotlin/types/AnyType;

    move-result-object v3

    .line 412
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v4

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lexpo/modules/kotlin/types/ReturnType;

    if-nez v4, :cond_56

    new-instance v4, Lexpo/modules/kotlin/types/ReturnType;

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v5

    invoke-direct {v4, v5}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 413
    invoke-virtual/range {v28 .. v28}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    move-result-object v5

    invoke-static/range {v21 .. v21}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    move-result-object v6

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    :cond_56
    new-instance v5, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$3;

    invoke-direct {v5}, Lexpo/modules/crypto/aes/AesCryptoModule$definition$lambda$20$lambda$19$$inlined$Property$3;-><init>()V

    .line 415
    invoke-direct {v2, v15, v3, v4, v5}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 416
    invoke-virtual {v1}, Lexpo/modules/kotlin/objects/PropertyComponentBuilderWithThis;->getThisType()LC7/o;

    move-result-object v3

    invoke-virtual {v2, v3}, Lexpo/modules/kotlin/functions/AnyFunction;->setOwnerType(LC7/o;)V

    const/4 v15, 0x1

    .line 417
    invoke-virtual {v2, v15}, Lexpo/modules/kotlin/functions/AnyFunction;->setCanTakeOwner(Z)V

    .line 418
    invoke-virtual {v1, v2}, Lexpo/modules/kotlin/objects/PropertyComponentBuilder;->setGetter(Lexpo/modules/kotlin/functions/SyncFunctionComponent;)V

    .line 419
    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getProperties()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 420
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getClassData()Ljava/util/List;

    move-result-object v0

    invoke-virtual/range {v31 .. v31}, Lexpo/modules/kotlin/classcomponent/ClassComponentBuilder;->buildClass()Lexpo/modules/kotlin/classcomponent/ClassDefinitionData;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 421
    invoke-virtual/range {v23 .. v23}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 422
    invoke-static {}, Ll1/a;->f()V

    return-object v0

    .line 423
    :cond_57
    :try_start_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    move-object/from16 v1, v17

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_58
    move-object v1, v3

    .line 424
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 425
    :goto_1c
    invoke-static {}, Ll1/a;->f()V

    throw v0
.end method
