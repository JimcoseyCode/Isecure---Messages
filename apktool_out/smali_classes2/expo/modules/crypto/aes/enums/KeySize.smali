.class public final enum Lexpo/modules/crypto/aes/enums/KeySize;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/crypto/aes/enums/KeySize$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/crypto/aes/enums/KeySize;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u000c\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000f"
    }
    d2 = {
        "Lexpo/modules/crypto/aes/enums/KeySize;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "bitSize",
        "",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getBitSize",
        "()I",
        "AES128",
        "AES192",
        "AES256",
        "byteSize",
        "getByteSize",
        "Companion",
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

.field private static final synthetic $VALUES:[Lexpo/modules/crypto/aes/enums/KeySize;

.field public static final enum AES128:Lexpo/modules/crypto/aes/enums/KeySize;

.field public static final enum AES192:Lexpo/modules/crypto/aes/enums/KeySize;

.field public static final enum AES256:Lexpo/modules/crypto/aes/enums/KeySize;

.field public static final Companion:Lexpo/modules/crypto/aes/enums/KeySize$Companion;


# instance fields
.field private final bitSize:I


# direct methods
.method private static final synthetic $values()[Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->AES128:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/crypto/aes/enums/KeySize;->AES192:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/crypto/aes/enums/KeySize;->AES256:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lexpo/modules/crypto/aes/enums/KeySize;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x80

    .line 5
    .line 6
    const-string v3, "AES128"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/crypto/aes/enums/KeySize;-><init>(Ljava/lang/String;II)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->AES128:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const/16 v2, 0xc0

    .line 17
    .line 18
    const-string v3, "AES192"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/crypto/aes/enums/KeySize;-><init>(Ljava/lang/String;II)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->AES192:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const/16 v2, 0x100

    .line 29
    .line 30
    const-string v3, "AES256"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/crypto/aes/enums/KeySize;-><init>(Ljava/lang/String;II)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->AES256:Lexpo/modules/crypto/aes/enums/KeySize;

    .line 36
    .line 37
    invoke-static {}, Lexpo/modules/crypto/aes/enums/KeySize;->$values()[Lexpo/modules/crypto/aes/enums/KeySize;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->$VALUES:[Lexpo/modules/crypto/aes/enums/KeySize;

    .line 42
    .line 43
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/crypto/aes/enums/KeySize$Companion;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, Lexpo/modules/crypto/aes/enums/KeySize$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->Companion:Lexpo/modules/crypto/aes/enums/KeySize$Companion;

    .line 56
    .line 57
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
    iput p3, p0, Lexpo/modules/crypto/aes/enums/KeySize;->bitSize:I

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
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/crypto/aes/enums/KeySize;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/crypto/aes/enums/KeySize;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/crypto/aes/enums/KeySize;->$VALUES:[Lexpo/modules/crypto/aes/enums/KeySize;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/crypto/aes/enums/KeySize;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getBitSize()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/crypto/aes/enums/KeySize;->bitSize:I

    .line 2
    .line 3
    return v0
.end method

.method public final getByteSize()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/crypto/aes/enums/KeySize;->bitSize:I

    .line 2
    .line 3
    div-int/lit8 v0, v0, 0x8

    .line 4
    .line 5
    return v0
.end method
