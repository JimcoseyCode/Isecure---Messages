.class public final enum Lexpo/modules/image/records/CachePolicy;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/image/records/CachePolicy;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/image/records/CachePolicy;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "NONE",
        "DISK",
        "MEMORY",
        "MEMORY_AND_DISK",
        "expo-image_release"
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

.field private static final synthetic $VALUES:[Lexpo/modules/image/records/CachePolicy;

.field public static final enum DISK:Lexpo/modules/image/records/CachePolicy;

.field public static final enum MEMORY:Lexpo/modules/image/records/CachePolicy;

.field public static final enum MEMORY_AND_DISK:Lexpo/modules/image/records/CachePolicy;

.field public static final enum NONE:Lexpo/modules/image/records/CachePolicy;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/image/records/CachePolicy;
    .locals 4

    .line 1
    sget-object v0, Lexpo/modules/image/records/CachePolicy;->NONE:Lexpo/modules/image/records/CachePolicy;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/image/records/CachePolicy;->DISK:Lexpo/modules/image/records/CachePolicy;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/image/records/CachePolicy;->MEMORY:Lexpo/modules/image/records/CachePolicy;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/image/records/CachePolicy;->MEMORY_AND_DISK:Lexpo/modules/image/records/CachePolicy;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lexpo/modules/image/records/CachePolicy;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/image/records/CachePolicy;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "none"

    .line 5
    .line 6
    const-string v3, "NONE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/records/CachePolicy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->NONE:Lexpo/modules/image/records/CachePolicy;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/image/records/CachePolicy;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "disk"

    .line 17
    .line 18
    const-string v3, "DISK"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/records/CachePolicy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->DISK:Lexpo/modules/image/records/CachePolicy;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/image/records/CachePolicy;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "memory"

    .line 29
    .line 30
    const-string v3, "MEMORY"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/records/CachePolicy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->MEMORY:Lexpo/modules/image/records/CachePolicy;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/image/records/CachePolicy;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "memory-disk"

    .line 41
    .line 42
    const-string v3, "MEMORY_AND_DISK"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/image/records/CachePolicy;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->MEMORY_AND_DISK:Lexpo/modules/image/records/CachePolicy;

    .line 48
    .line 49
    invoke-static {}, Lexpo/modules/image/records/CachePolicy;->$values()[Lexpo/modules/image/records/CachePolicy;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->$VALUES:[Lexpo/modules/image/records/CachePolicy;

    .line 54
    .line 55
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lexpo/modules/image/records/CachePolicy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
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
    iput-object p3, p0, Lexpo/modules/image/records/CachePolicy;->value:Ljava/lang/String;

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
    sget-object v0, Lexpo/modules/image/records/CachePolicy;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/image/records/CachePolicy;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/image/records/CachePolicy;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/image/records/CachePolicy;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/image/records/CachePolicy;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/image/records/CachePolicy;->$VALUES:[Lexpo/modules/image/records/CachePolicy;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/image/records/CachePolicy;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/records/CachePolicy;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
