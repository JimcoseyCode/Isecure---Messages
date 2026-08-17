.class public final Lexpo/modules/securestore/encryptors/HybridAESEncryptor;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/securestore/encryptors/HybridAESEncryptor$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor<",
        "Ljava/security/KeyStore$PrivateKeyEntry;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 +2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J8\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ8\u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008 \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010*\u001a\u00020\'8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008(\u0010)\u00a8\u0006,"
    }
    d2 = {
        "Lexpo/modules/securestore/encryptors/HybridAESEncryptor;",
        "Lexpo/modules/securestore/encryptors/KeyBasedEncryptor;",
        "Ljava/security/KeyStore$PrivateKeyEntry;",
        "Landroid/content/Context;",
        "mContext",
        "Lexpo/modules/securestore/encryptors/AESEncryptor;",
        "mAESEncryptor",
        "<init>",
        "(Landroid/content/Context;Lexpo/modules/securestore/encryptors/AESEncryptor;)V",
        "Lexpo/modules/securestore/SecureStoreOptions;",
        "options",
        "",
        "requireAuthentication",
        "",
        "getExtendedKeyStoreAlias",
        "(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;",
        "getKeyStoreAlias",
        "(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;",
        "Ljava/security/KeyStore;",
        "keyStore",
        "initializeKeyStoreEntry",
        "(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;",
        "plaintextValue",
        "keyStoreEntry",
        "authenticationPrompt",
        "Lexpo/modules/securestore/AuthenticationHelper;",
        "authenticationHelper",
        "Lorg/json/JSONObject;",
        "createEncryptedItem",
        "(Ljava/lang/String;Ljava/security/KeyStore$PrivateKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;",
        "key",
        "encryptedItem",
        "decryptItem",
        "(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$PrivateKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "Lexpo/modules/securestore/encryptors/AESEncryptor;",
        "Ljava/security/SecureRandom;",
        "mSecureRandom",
        "Ljava/security/SecureRandom;",
        "Ljavax/crypto/Cipher;",
        "getRSACipher",
        "()Ljavax/crypto/Cipher;",
        "rSACipher",
        "Companion",
        "expo-secure-store_release"
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
.field public static final Companion:Lexpo/modules/securestore/encryptors/HybridAESEncryptor$Companion;

.field private static final ENCRYPTED_SECRET_KEY_PROPERTY:Ljava/lang/String; = "esk"

.field public static final NAME:Ljava/lang/String; = "hybrid"

.field private static final RSA_CIPHER:Ljava/lang/String; = "RSA/None/PKCS1Padding"


# instance fields
.field private final mAESEncryptor:Lexpo/modules/securestore/encryptors/AESEncryptor;

.field private mContext:Landroid/content/Context;

.field private final mSecureRandom:Ljava/security/SecureRandom;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->Companion:Lexpo/modules/securestore/encryptors/HybridAESEncryptor$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lexpo/modules/securestore/encryptors/AESEncryptor;)V
    .locals 1

    .line 1
    const-string v0, "mContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "mAESEncryptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->mContext:Landroid/content/Context;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->mAESEncryptor:Lexpo/modules/securestore/encryptors/AESEncryptor;

    .line 17
    .line 18
    new-instance p1, Ljava/security/SecureRandom;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/security/SecureRandom;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->mSecureRandom:Ljava/security/SecureRandom;

    .line 24
    .line 25
    return-void
.end method

.method private final getRSACipher()Ljavax/crypto/Cipher;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/NoSuchProviderException;,
            Ljavax/crypto/NoSuchPaddingException;
        }
    .end annotation

    .line 1
    const-string v0, "RSA/None/PKCS1Padding"

    .line 2
    .line 3
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getInstance(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public bridge synthetic createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$Entry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/security/KeyStore$PrivateKeyEntry;

    invoke-virtual/range {p0 .. p6}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$PrivateKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public createEncryptedItem(Ljava/lang/String;Ljava/security/KeyStore$PrivateKeyEntry;ZLjava/lang/String;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/security/KeyStore$PrivateKeyEntry;",
            "Z",
            "Ljava/lang/String;",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    new-instance v0, Lexpo/modules/securestore/EncryptException;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const-string v1, "HybridAESEncryption should not be used on Android SDK >= 23. This shouldn\'t happen. If you see this message report an issue at https://github.com/expo/expo."

    const-string v2, "unknown"

    const-string v3, "unknown"

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lexpo/modules/securestore/EncryptException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v0
.end method

.method public bridge synthetic decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$Entry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p3, Ljava/security/KeyStore$PrivateKeyEntry;

    invoke-virtual/range {p0 .. p6}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$PrivateKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$PrivateKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONObject;",
            "Ljava/security/KeyStore$PrivateKeyEntry;",
            "Lexpo/modules/securestore/SecureStoreOptions;",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    const-string v0, "esk"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    .line 3
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object v0

    .line 4
    invoke-direct {p0}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->getRSACipher()Ljavax/crypto/Cipher;

    move-result-object v1

    const/4 v2, 0x2

    .line 5
    invoke-virtual {p3}, Ljava/security/KeyStore$PrivateKeyEntry;->getPrivateKey()Ljava/security/PrivateKey;

    move-result-object p3

    invoke-virtual {v1, v2, p3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V

    .line 6
    invoke-virtual {v1, v0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p3

    .line 7
    new-instance v0, Ljavax/crypto/spec/SecretKeySpec;

    const-string v1, "AES"

    invoke-direct {v0, p3, v1}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 8
    new-instance v5, Ljava/security/KeyStore$SecretKeyEntry;

    invoke-direct {v5, v0}, Ljava/security/KeyStore$SecretKeyEntry;-><init>(Ljavax/crypto/SecretKey;)V

    .line 9
    iget-object v2, p0, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->mAESEncryptor:Lexpo/modules/securestore/encryptors/AESEncryptor;

    move-object v3, p1

    move-object v4, p2

    move-object v6, p4

    move-object v7, p5

    move-object v8, p6

    invoke-virtual/range {v2 .. v8}, Lexpo/modules/securestore/encryptors/AESEncryptor;->decryptItem(Ljava/lang/String;Lorg/json/JSONObject;Ljava/security/KeyStore$SecretKeyEntry;Lexpo/modules/securestore/SecureStoreOptions;Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public getExtendedKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;Z)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    const-string p2, "keystoreAuthenticated"

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string p2, "keystoreUnauthenticated"

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->getKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    new-instance v0, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string p1, ":"

    .line 26
    .line 27
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    return-object p1
.end method

.method public getKeyStoreAlias(Lexpo/modules/securestore/SecureStoreOptions;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lexpo/modules/securestore/SecureStoreOptions;->getKeychainService()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "RSA/None/PKCS1Padding:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method

.method public bridge synthetic initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$Entry;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/securestore/encryptors/HybridAESEncryptor;->initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;

    move-result-object p1

    return-object p1
.end method

.method public initializeKeyStoreEntry(Ljava/security/KeyStore;Lexpo/modules/securestore/SecureStoreOptions;)Ljava/security/KeyStore$PrivateKeyEntry;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;
        }
    .end annotation

    const-string v0, "keyStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "options"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lexpo/modules/securestore/KeyStoreException;

    .line 3
    const-string p2, "Tried to initialize HybridAESEncryptor key store entry on Android SDK >= 23. This shouldn\'t happen. If you see this message report an issue at https://github.com/expo/expo."

    .line 4
    invoke-direct {p1, p2}, Lexpo/modules/securestore/KeyStoreException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
