.class public final Lexpo/modules/crypto/CryptoModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/crypto/CryptoModule$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/crypto/CryptoModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "Lexpo/modules/crypto/DigestAlgorithm;",
        "algorithm",
        "",
        "data",
        "Lexpo/modules/crypto/DigestOptions;",
        "options",
        "digestString",
        "(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;",
        "Lexpo/modules/kotlin/typedarray/TypedArray;",
        "output",
        "Li7/B;",
        "digest",
        "(Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V",
        "typedArray",
        "getRandomValues",
        "(Lexpo/modules/kotlin/typedarray/TypedArray;)V",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "definition",
        "()Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "Ljava/security/SecureRandom;",
        "secureRandom$delegate",
        "Lkotlin/Lazy;",
        "getSecureRandom",
        "()Ljava/security/SecureRandom;",
        "secureRandom",
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
.field private final secureRandom$delegate:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lexpo/modules/crypto/b;

    .line 5
    .line 6
    invoke-direct {v0}, Lexpo/modules/crypto/b;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lexpo/modules/crypto/CryptoModule;->secureRandom$delegate:Lkotlin/Lazy;

    .line 14
    .line 15
    return-void
.end method

.method public static final synthetic access$digest(Lexpo/modules/crypto/CryptoModule;Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/crypto/CryptoModule;->digest(Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$digestString(Lexpo/modules/crypto/CryptoModule;Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lexpo/modules/crypto/CryptoModule;->digestString(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getRandomValues(Lexpo/modules/crypto/CryptoModule;Lexpo/modules/kotlin/typedarray/TypedArray;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/crypto/CryptoModule;->getRandomValues(Lexpo/modules/kotlin/typedarray/TypedArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic b()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    invoke-static {}, Lexpo/modules/crypto/CryptoModule;->secureRandom_delegate$lambda$0()Ljava/security/SecureRandom;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic c(B)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/crypto/CryptoModule;->digestString$lambda$7(B)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final digest(Lexpo/modules/crypto/DigestAlgorithm;Lexpo/modules/kotlin/typedarray/TypedArray;Lexpo/modules/kotlin/typedarray/TypedArray;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lexpo/modules/crypto/DigestAlgorithm;->getValue()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-interface {p3}, Lexpo/modules/kotlin/typedarray/TypedArray;->toDirectBuffer()Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    invoke-virtual {p1, p3}, Ljava/security/MessageDigest;->update(Ljava/nio/ByteBuffer;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const-string p3, "digest(...)"

    .line 21
    .line 22
    invoke-static {p1, p3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    array-length p3, p1

    .line 26
    invoke-interface {p2}, Lexpo/modules/kotlin/typedarray/TypedArray;->getByteLength()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 31
    .line 32
    .line 33
    move-result p3

    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-interface {p2, p1, v0, p3}, Lexpo/modules/kotlin/typedarray/TypedArray;->write([BII)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final digestString(Lexpo/modules/crypto/DigestAlgorithm;Ljava/lang/String;Lexpo/modules/crypto/DigestOptions;)Ljava/lang/String;
    .locals 10

    .line 1
    invoke-virtual {p1}, Lexpo/modules/crypto/DigestAlgorithm;->getValue()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    sget-object v0, LP8/d;->b:Ljava/nio/charset/Charset;

    .line 10
    .line 11
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    const-string v0, "getBytes(...)"

    .line 16
    .line 17
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/security/MessageDigest;->update([B)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-string p1, "digest(...)"

    .line 28
    .line 29
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Lexpo/modules/crypto/DigestOptions;->getEncoding()Lexpo/modules/crypto/DigestOptions$Encoding;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object p2, Lexpo/modules/crypto/CryptoModule$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    aget p1, p2, p1

    .line 43
    .line 44
    const/4 p2, 0x1

    .line 45
    const/4 p3, 0x2

    .line 46
    if-eq p1, p2, :cond_1

    .line 47
    .line 48
    if-ne p1, p3, :cond_0

    .line 49
    .line 50
    new-instance v7, Lexpo/modules/crypto/a;

    .line 51
    .line 52
    invoke-direct {v7}, Lexpo/modules/crypto/a;-><init>()V

    .line 53
    .line 54
    .line 55
    const/16 v8, 0x1e

    .line 56
    .line 57
    const/4 v9, 0x0

    .line 58
    const-string v2, ""

    .line 59
    .line 60
    const/4 v3, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v5, 0x0

    .line 63
    const/4 v6, 0x0

    .line 64
    invoke-static/range {v1 .. v9}, Lj7/j;->Y([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    return-object p1

    .line 69
    :cond_0
    new-instance p1, Li7/m;

    .line 70
    .line 71
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 72
    .line 73
    .line 74
    throw p1

    .line 75
    :cond_1
    invoke-static {v1, p3}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    return-object p1
.end method

.method private static final digestString$lambda$7(B)Ljava/lang/CharSequence;
    .locals 1

    .line 1
    and-int/lit16 p0, p0, 0xff

    .line 2
    .line 3
    add-int/lit16 p0, p0, 0x100

    .line 4
    .line 5
    const/16 v0, 0x10

    .line 6
    .line 7
    invoke-static {v0}, LP8/a;->a(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-static {p0, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v0, "toString(...)"

    .line 16
    .line 17
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    const-string v0, "substring(...)"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p0
.end method

.method private final getRandomValues(Lexpo/modules/kotlin/typedarray/TypedArray;)V
    .locals 3

    .line 1
    invoke-interface {p1}, Lexpo/modules/kotlin/typedarray/TypedArray;->getByteLength()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-array v0, v0, [B

    .line 6
    .line 7
    invoke-direct {p0}, Lexpo/modules/crypto/CryptoModule;->getSecureRandom()Ljava/security/SecureRandom;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {v1, v0}, Ljava/security/SecureRandom;->nextBytes([B)V

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-interface {p1}, Lexpo/modules/kotlin/typedarray/TypedArray;->getByteLength()I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-interface {p1, v0, v1, v2}, Lexpo/modules/kotlin/typedarray/TypedArray;->write([BII)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private final getSecureRandom()Ljava/security/SecureRandom;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/crypto/CryptoModule;->secureRandom$delegate:Lkotlin/Lazy;

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

.method private static final secureRandom_delegate$lambda$0()Ljava/security/SecureRandom;
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


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    const-class v2, Lexpo/modules/crypto/DigestOptions;

    .line 6
    .line 7
    const-class v3, Li7/B;

    .line 8
    .line 9
    const-class v4, Lexpo/modules/kotlin/typedarray/TypedArray;

    .line 10
    .line 11
    const-class v5, Lexpo/modules/crypto/DigestAlgorithm;

    .line 12
    .line 13
    const-class v6, Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v7

    .line 19
    new-instance v8, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v7, ".ModuleDefinition"

    .line 28
    .line 29
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    new-instance v8, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v9, "["

    .line 42
    .line 43
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v9, "ExpoModulesCore"

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v9, "] "

    .line 52
    .line 53
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    invoke-static {v7}, Ll1/a;->c(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    :try_start_0
    new-instance v7, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 67
    .line 68
    invoke-direct {v7, v1}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 69
    .line 70
    .line 71
    const-string v8, "ExpoCrypto"

    .line 72
    .line 73
    invoke-virtual {v7, v8}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const-string v8, "digestString"

    .line 77
    .line 78
    new-instance v9, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 79
    .line 80
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 81
    .line 82
    .line 83
    move-result-object v10

    .line 84
    sget-object v11, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 85
    .line 86
    new-instance v12, Lkotlin/Pair;

    .line 87
    .line 88
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 89
    .line 90
    .line 91
    move-result-object v13

    .line 92
    sget-object v14, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 93
    .line 94
    invoke-direct {v12, v13, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-interface {v13, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v12

    .line 105
    check-cast v12, Lexpo/modules/kotlin/types/AnyType;

    .line 106
    .line 107
    if-nez v12, :cond_0

    .line 108
    .line 109
    sget-object v12, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$1;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$1;

    .line 110
    .line 111
    new-instance v15, Lexpo/modules/kotlin/types/AnyType;

    .line 112
    .line 113
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 114
    .line 115
    move-object/from16 v16, v0

    .line 116
    .line 117
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    move-object/from16 v17, v2

    .line 122
    .line 123
    const/4 v2, 0x0

    .line 124
    invoke-direct {v13, v0, v2, v12}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 125
    .line 126
    .line 127
    invoke-direct {v15, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 128
    .line 129
    .line 130
    move-object v12, v15

    .line 131
    goto :goto_0

    .line 132
    :catchall_0
    move-exception v0

    .line 133
    goto/16 :goto_4

    .line 134
    .line 135
    :cond_0
    move-object/from16 v16, v0

    .line 136
    .line 137
    move-object/from16 v17, v2

    .line 138
    .line 139
    :goto_0
    new-instance v0, Lkotlin/Pair;

    .line 140
    .line 141
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-direct {v0, v2, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, Lexpo/modules/kotlin/types/AnyType;

    .line 157
    .line 158
    if-nez v0, :cond_1

    .line 159
    .line 160
    sget-object v0, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$2;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$2;

    .line 161
    .line 162
    new-instance v2, Lexpo/modules/kotlin/types/AnyType;

    .line 163
    .line 164
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 165
    .line 166
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 167
    .line 168
    .line 169
    move-result-object v15

    .line 170
    move-object/from16 v18, v3

    .line 171
    .line 172
    const/4 v3, 0x0

    .line 173
    invoke-direct {v13, v15, v3, v0}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 174
    .line 175
    .line 176
    invoke-direct {v2, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 177
    .line 178
    .line 179
    move-object v0, v2

    .line 180
    goto :goto_1

    .line 181
    :cond_1
    move-object/from16 v18, v3

    .line 182
    .line 183
    :goto_1
    new-instance v2, Lkotlin/Pair;

    .line 184
    .line 185
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-direct {v2, v3, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v2

    .line 200
    check-cast v2, Lexpo/modules/kotlin/types/AnyType;

    .line 201
    .line 202
    if-nez v2, :cond_2

    .line 203
    .line 204
    sget-object v2, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$3;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$3;

    .line 205
    .line 206
    new-instance v3, Lexpo/modules/kotlin/types/AnyType;

    .line 207
    .line 208
    new-instance v13, Lexpo/modules/kotlin/types/LazyKType;

    .line 209
    .line 210
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    move-object/from16 v19, v4

    .line 215
    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-direct {v13, v15, v4, v2}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {v3, v13, v10}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 221
    .line 222
    .line 223
    move-object v2, v3

    .line 224
    goto :goto_2

    .line 225
    :cond_2
    move-object/from16 v19, v4

    .line 226
    .line 227
    :goto_2
    filled-new-array {v12, v0, v2}, [Lexpo/modules/kotlin/types/AnyType;

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    sget-object v2, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 232
    .line 233
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 238
    .line 239
    .line 240
    move-result-object v4

    .line 241
    invoke-interface {v3, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v3

    .line 245
    check-cast v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 246
    .line 247
    if-nez v3, :cond_3

    .line 248
    .line 249
    new-instance v3, Lexpo/modules/kotlin/types/ReturnType;

    .line 250
    .line 251
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 252
    .line 253
    .line 254
    move-result-object v4

    .line 255
    invoke-direct {v3, v4}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 259
    .line 260
    .line 261
    move-result-object v4

    .line 262
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 263
    .line 264
    .line 265
    move-result-object v10

    .line 266
    invoke-interface {v4, v10, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    :cond_3
    new-instance v4, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$4;

    .line 270
    .line 271
    invoke-direct {v4, v1}, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$4;-><init>(Lexpo/modules/crypto/CryptoModule;)V

    .line 272
    .line 273
    .line 274
    invoke-direct {v9, v8, v0, v3, v4}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    const-string v0, "digestStringAsync"

    .line 285
    .line 286
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 287
    .line 288
    .line 289
    move-result-object v3

    .line 290
    new-instance v4, Lkotlin/Pair;

    .line 291
    .line 292
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-direct {v4, v8, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    invoke-interface {v8, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v4

    .line 307
    check-cast v4, Lexpo/modules/kotlin/types/AnyType;

    .line 308
    .line 309
    if-nez v4, :cond_4

    .line 310
    .line 311
    sget-object v4, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$1;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$1;

    .line 312
    .line 313
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 314
    .line 315
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 316
    .line 317
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    const/4 v12, 0x0

    .line 322
    invoke-direct {v9, v10, v12, v4}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 323
    .line 324
    .line 325
    invoke-direct {v8, v9, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 326
    .line 327
    .line 328
    move-object v4, v8

    .line 329
    :cond_4
    new-instance v8, Lkotlin/Pair;

    .line 330
    .line 331
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    invoke-direct {v8, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 339
    .line 340
    .line 341
    move-result-object v9

    .line 342
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v8

    .line 346
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 347
    .line 348
    if-nez v8, :cond_5

    .line 349
    .line 350
    sget-object v8, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$2;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$2;

    .line 351
    .line 352
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 353
    .line 354
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 355
    .line 356
    invoke-static {v6}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 357
    .line 358
    .line 359
    move-result-object v12

    .line 360
    const/4 v13, 0x0

    .line 361
    invoke-direct {v10, v12, v13, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 362
    .line 363
    .line 364
    invoke-direct {v9, v10, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 365
    .line 366
    .line 367
    move-object v8, v9

    .line 368
    :cond_5
    new-instance v9, Lkotlin/Pair;

    .line 369
    .line 370
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 371
    .line 372
    .line 373
    move-result-object v10

    .line 374
    invoke-direct {v9, v10, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    check-cast v9, Lexpo/modules/kotlin/types/AnyType;

    .line 386
    .line 387
    if-nez v9, :cond_6

    .line 388
    .line 389
    sget-object v9, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$3;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$3;

    .line 390
    .line 391
    new-instance v10, Lexpo/modules/kotlin/types/AnyType;

    .line 392
    .line 393
    new-instance v12, Lexpo/modules/kotlin/types/LazyKType;

    .line 394
    .line 395
    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    const/4 v15, 0x0

    .line 400
    invoke-direct {v12, v13, v15, v9}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 401
    .line 402
    .line 403
    invoke-direct {v10, v12, v3}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 404
    .line 405
    .line 406
    move-object v9, v10

    .line 407
    :cond_6
    filled-new-array {v4, v8, v9}, [Lexpo/modules/kotlin/types/AnyType;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    new-instance v4, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$4;

    .line 412
    .line 413
    invoke-direct {v4, v1}, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$AsyncFunction$4;-><init>(Lexpo/modules/crypto/CryptoModule;)V

    .line 414
    .line 415
    .line 416
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 417
    .line 418
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 419
    .line 420
    .line 421
    move-result v8

    .line 422
    if-eqz v8, :cond_7

    .line 423
    .line 424
    new-instance v6, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;

    .line 425
    .line 426
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/IntAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 427
    .line 428
    .line 429
    goto :goto_3

    .line 430
    :cond_7
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 431
    .line 432
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 433
    .line 434
    .line 435
    move-result v8

    .line 436
    if-eqz v8, :cond_8

    .line 437
    .line 438
    new-instance v6, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;

    .line 439
    .line 440
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/BoolAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 441
    .line 442
    .line 443
    goto :goto_3

    .line 444
    :cond_8
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 445
    .line 446
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    move-result v8

    .line 450
    if-eqz v8, :cond_9

    .line 451
    .line 452
    new-instance v6, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;

    .line 453
    .line 454
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/DoubleAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 455
    .line 456
    .line 457
    goto :goto_3

    .line 458
    :cond_9
    sget-object v8, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 459
    .line 460
    invoke-static {v6, v8}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v8

    .line 464
    if-eqz v8, :cond_a

    .line 465
    .line 466
    new-instance v6, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;

    .line 467
    .line 468
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/FloatAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 469
    .line 470
    .line 471
    goto :goto_3

    .line 472
    :cond_a
    invoke-static {v6, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 473
    .line 474
    .line 475
    move-result v6

    .line 476
    if-eqz v6, :cond_b

    .line 477
    .line 478
    new-instance v6, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;

    .line 479
    .line 480
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/StringAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 481
    .line 482
    .line 483
    goto :goto_3

    .line 484
    :cond_b
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 485
    .line 486
    invoke-direct {v6, v0, v3, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 487
    .line 488
    .line 489
    :goto_3
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    invoke-interface {v3, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    const-string v0, "getRandomValues"

    .line 497
    .line 498
    new-instance v3, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 499
    .line 500
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 501
    .line 502
    .line 503
    move-result-object v4

    .line 504
    new-instance v6, Lkotlin/Pair;

    .line 505
    .line 506
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 507
    .line 508
    .line 509
    move-result-object v8

    .line 510
    invoke-direct {v6, v8, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 514
    .line 515
    .line 516
    move-result-object v8

    .line 517
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    .line 522
    .line 523
    if-nez v6, :cond_c

    .line 524
    .line 525
    sget-object v6, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$5;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$5;

    .line 526
    .line 527
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 528
    .line 529
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 530
    .line 531
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 532
    .line 533
    .line 534
    move-result-object v10

    .line 535
    const/4 v15, 0x0

    .line 536
    invoke-direct {v9, v10, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 537
    .line 538
    .line 539
    invoke-direct {v8, v9, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 540
    .line 541
    .line 542
    move-object v6, v8

    .line 543
    :cond_c
    filled-new-array {v6}, [Lexpo/modules/kotlin/types/AnyType;

    .line 544
    .line 545
    .line 546
    move-result-object v4

    .line 547
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 548
    .line 549
    .line 550
    move-result-object v6

    .line 551
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 552
    .line 553
    .line 554
    move-result-object v8

    .line 555
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 560
    .line 561
    if-nez v6, :cond_d

    .line 562
    .line 563
    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 564
    .line 565
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 566
    .line 567
    .line 568
    move-result-object v8

    .line 569
    invoke-direct {v6, v8}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 570
    .line 571
    .line 572
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 573
    .line 574
    .line 575
    move-result-object v8

    .line 576
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 577
    .line 578
    .line 579
    move-result-object v9

    .line 580
    invoke-interface {v8, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    :cond_d
    new-instance v8, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$6;

    .line 584
    .line 585
    invoke-direct {v8, v1}, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$6;-><init>(Lexpo/modules/crypto/CryptoModule;)V

    .line 586
    .line 587
    .line 588
    invoke-direct {v3, v0, v4, v6, v8}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    const-string v0, "digest"

    .line 599
    .line 600
    new-instance v3, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 601
    .line 602
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 603
    .line 604
    .line 605
    move-result-object v4

    .line 606
    new-instance v6, Lkotlin/Pair;

    .line 607
    .line 608
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 609
    .line 610
    .line 611
    move-result-object v8

    .line 612
    invoke-direct {v6, v8, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 616
    .line 617
    .line 618
    move-result-object v8

    .line 619
    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v6

    .line 623
    check-cast v6, Lexpo/modules/kotlin/types/AnyType;

    .line 624
    .line 625
    if-nez v6, :cond_e

    .line 626
    .line 627
    sget-object v6, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$7;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$7;

    .line 628
    .line 629
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 630
    .line 631
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 632
    .line 633
    invoke-static {v5}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 634
    .line 635
    .line 636
    move-result-object v5

    .line 637
    const/4 v15, 0x0

    .line 638
    invoke-direct {v9, v5, v15, v6}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 639
    .line 640
    .line 641
    invoke-direct {v8, v9, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 642
    .line 643
    .line 644
    move-object v6, v8

    .line 645
    :cond_e
    new-instance v5, Lkotlin/Pair;

    .line 646
    .line 647
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 648
    .line 649
    .line 650
    move-result-object v8

    .line 651
    invoke-direct {v5, v8, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    invoke-interface {v8, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v5

    .line 662
    check-cast v5, Lexpo/modules/kotlin/types/AnyType;

    .line 663
    .line 664
    if-nez v5, :cond_f

    .line 665
    .line 666
    sget-object v5, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$8;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$8;

    .line 667
    .line 668
    new-instance v8, Lexpo/modules/kotlin/types/AnyType;

    .line 669
    .line 670
    new-instance v9, Lexpo/modules/kotlin/types/LazyKType;

    .line 671
    .line 672
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 673
    .line 674
    .line 675
    move-result-object v10

    .line 676
    const/4 v15, 0x0

    .line 677
    invoke-direct {v9, v10, v15, v5}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 678
    .line 679
    .line 680
    invoke-direct {v8, v9, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 681
    .line 682
    .line 683
    move-object v5, v8

    .line 684
    :cond_f
    new-instance v8, Lkotlin/Pair;

    .line 685
    .line 686
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 687
    .line 688
    .line 689
    move-result-object v9

    .line 690
    invoke-direct {v8, v9, v14}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 691
    .line 692
    .line 693
    invoke-virtual {v11}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 694
    .line 695
    .line 696
    move-result-object v9

    .line 697
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v8

    .line 701
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 702
    .line 703
    if-nez v8, :cond_10

    .line 704
    .line 705
    sget-object v8, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$9;->INSTANCE:Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$9;

    .line 706
    .line 707
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 708
    .line 709
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 710
    .line 711
    invoke-static/range {v19 .. v19}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 712
    .line 713
    .line 714
    move-result-object v11

    .line 715
    const/4 v15, 0x0

    .line 716
    invoke-direct {v10, v11, v15, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 717
    .line 718
    .line 719
    invoke-direct {v9, v10, v4}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 720
    .line 721
    .line 722
    move-object v8, v9

    .line 723
    :cond_10
    filled-new-array {v6, v5, v8}, [Lexpo/modules/kotlin/types/AnyType;

    .line 724
    .line 725
    .line 726
    move-result-object v4

    .line 727
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 728
    .line 729
    .line 730
    move-result-object v5

    .line 731
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 732
    .line 733
    .line 734
    move-result-object v6

    .line 735
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 740
    .line 741
    if-nez v5, :cond_11

    .line 742
    .line 743
    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 744
    .line 745
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 746
    .line 747
    .line 748
    move-result-object v6

    .line 749
    invoke-direct {v5, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 750
    .line 751
    .line 752
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 753
    .line 754
    .line 755
    move-result-object v6

    .line 756
    invoke-static/range {v18 .. v18}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 757
    .line 758
    .line 759
    move-result-object v8

    .line 760
    invoke-interface {v6, v8, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    :cond_11
    new-instance v6, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$10;

    .line 764
    .line 765
    invoke-direct {v6, v1}, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$Function$10;-><init>(Lexpo/modules/crypto/CryptoModule;)V

    .line 766
    .line 767
    .line 768
    invoke-direct {v3, v0, v4, v5, v6}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 772
    .line 773
    .line 774
    move-result-object v4

    .line 775
    invoke-interface {v4, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 776
    .line 777
    .line 778
    const-string v0, "randomUUID"

    .line 779
    .line 780
    new-instance v3, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 781
    .line 782
    const/4 v15, 0x0

    .line 783
    new-array v4, v15, [Lexpo/modules/kotlin/types/AnyType;

    .line 784
    .line 785
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 786
    .line 787
    .line 788
    move-result-object v5

    .line 789
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 790
    .line 791
    .line 792
    move-result-object v6

    .line 793
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v5

    .line 797
    check-cast v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 798
    .line 799
    if-nez v5, :cond_12

    .line 800
    .line 801
    new-instance v5, Lexpo/modules/kotlin/types/ReturnType;

    .line 802
    .line 803
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 804
    .line 805
    .line 806
    move-result-object v6

    .line 807
    invoke-direct {v5, v6}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v2}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 815
    .line 816
    .line 817
    move-result-object v6

    .line 818
    invoke-interface {v2, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    :cond_12
    new-instance v2, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$FunctionWithoutArgs$1;

    .line 822
    .line 823
    invoke-direct {v2}, Lexpo/modules/crypto/CryptoModule$definition$lambda$5$$inlined$FunctionWithoutArgs$1;-><init>()V

    .line 824
    .line 825
    .line 826
    invoke-direct {v3, v0, v4, v5, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v7}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 834
    .line 835
    .line 836
    invoke-virtual {v7}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 837
    .line 838
    .line 839
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 840
    invoke-static {}, Ll1/a;->f()V

    .line 841
    .line 842
    .line 843
    return-object v0

    .line 844
    :goto_4
    invoke-static {}, Ll1/a;->f()V

    .line 845
    .line 846
    .line 847
    throw v0
.end method
