.class public final Lexpo/modules/crypto/aes/objects/EncryptionKey;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0012\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0008J\u0008\u0010\u0012\u001a\u00020\u0013H\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u00078F\u00a2\u0006\u0006\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/objects/EncryptionKey;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "size",
        "Lexpo/modules/crypto/aes/enums/KeySize;",
        "<init>",
        "(Lexpo/modules/crypto/aes/enums/KeySize;)V",
        "bytes",
        "",
        "([B)V",
        "keySize",
        "getKeySize",
        "()Lexpo/modules/crypto/aes/enums/KeySize;",
        "cryptoKey",
        "Ljavax/crypto/SecretKey;",
        "getCryptoKey",
        "()Ljavax/crypto/SecretKey;",
        "getBytes",
        "()[B",
        "getAdditionalMemoryPressure",
        "",
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
.field private final cryptoKey:Ljavax/crypto/SecretKey;

.field private final keySize:Lexpo/modules/crypto/aes/enums/KeySize;


# direct methods
.method public constructor <init>(Lexpo/modules/crypto/aes/enums/KeySize;)V
    .locals 2

    const-string v0, "size"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/runtime/Runtime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    const-string v0, "AES"

    invoke-static {v0}, Ljavax/crypto/KeyGenerator;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyGenerator;

    move-result-object v0

    .line 3
    invoke-virtual {p1}, Lexpo/modules/crypto/aes/enums/KeySize;->getBitSize()I

    move-result v1

    invoke-virtual {v0, v1}, Ljavax/crypto/KeyGenerator;->init(I)V

    .line 4
    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->keySize:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 5
    invoke-virtual {v0}, Ljavax/crypto/KeyGenerator;->generateKey()Ljavax/crypto/SecretKey;

    move-result-object p1

    const-string v0, "generateKey(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->cryptoKey:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 2

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    .line 6
    invoke-direct {p0, v0, v1, v0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(Lexpo/modules/kotlin/runtime/Runtime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->Companion:Lexpo/modules/crypto/aes/enums/KeySize$Companion;

    array-length v1, p1

    invoke-virtual {v0, v1}, Lexpo/modules/crypto/aes/enums/KeySize$Companion;->fromByteLength(I)Lexpo/modules/crypto/aes/enums/KeySize;

    move-result-object v0

    iput-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->keySize:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 8
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p1, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    iput-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->cryptoKey:Ljavax/crypto/SecretKey;

    return-void
.end method


# virtual methods
.method public getAdditionalMemoryPressure()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->keySize:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/crypto/aes/enums/KeySize;->getByteSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getBytes()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->cryptoKey:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getEncoded(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final getCryptoKey()Ljavax/crypto/SecretKey;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->cryptoKey:Ljavax/crypto/SecretKey;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getKeySize()Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/aes/objects/EncryptionKey;->keySize:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    return-object v0
.end method
