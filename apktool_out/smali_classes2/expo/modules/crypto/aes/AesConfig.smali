.class public final Lexpo/modules/crypto/aes/AesConfig;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0008X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/AesConfig;",
        "",
        "<init>",
        "()V",
        "DEFAULT_IV_SIZE",
        "",
        "DEFAULT_TAG_SIZE",
        "CRYPTO_KEY_ALGORITHM",
        "",
        "CIPHER_TRANSFORMATION_NAME",
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
.field public static final CIPHER_TRANSFORMATION_NAME:Ljava/lang/String; = "AES/GCM/NoPadding"

.field public static final CRYPTO_KEY_ALGORITHM:Ljava/lang/String; = "AES"

.field public static final DEFAULT_IV_SIZE:I = 0xc

.field public static final DEFAULT_TAG_SIZE:I = 0x10

.field public static final INSTANCE:Lexpo/modules/crypto/aes/AesConfig;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/crypto/aes/AesConfig;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/crypto/aes/AesConfig;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/crypto/aes/AesConfig;->INSTANCE:Lexpo/modules/crypto/aes/AesConfig;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
