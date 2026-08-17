.class public final enum Lexpo/modules/image/enums/ImageCacheType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/image/enums/ImageCacheType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/image/enums/ImageCacheType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u0000 \u00082\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0008B\u001d\u0008\u0002\u0012\u0012\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0007j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lexpo/modules/image/enums/ImageCacheType;",
        "",
        "",
        "Lv1/a;",
        "dataSources",
        "<init>",
        "(Ljava/lang/String;I[Lv1/a;)V",
        "[Lv1/a;",
        "Companion",
        "NONE",
        "DISK",
        "MEMORY",
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

.field private static final synthetic $VALUES:[Lexpo/modules/image/enums/ImageCacheType;

.field public static final Companion:Lexpo/modules/image/enums/ImageCacheType$Companion;

.field public static final enum DISK:Lexpo/modules/image/enums/ImageCacheType;

.field public static final enum MEMORY:Lexpo/modules/image/enums/ImageCacheType;

.field public static final enum NONE:Lexpo/modules/image/enums/ImageCacheType;


# instance fields
.field private final dataSources:[Lv1/a;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/image/enums/ImageCacheType;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/image/enums/ImageCacheType;->NONE:Lexpo/modules/image/enums/ImageCacheType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/image/enums/ImageCacheType;->DISK:Lexpo/modules/image/enums/ImageCacheType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/image/enums/ImageCacheType;->MEMORY:Lexpo/modules/image/enums/ImageCacheType;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lexpo/modules/image/enums/ImageCacheType;

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
    new-instance v0, Lexpo/modules/image/enums/ImageCacheType;

    .line 2
    .line 3
    sget-object v1, Lv1/a;->g:Lv1/a;

    .line 4
    .line 5
    sget-object v2, Lv1/a;->h:Lv1/a;

    .line 6
    .line 7
    filled-new-array {v1, v2}, [Lv1/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v2, "NONE"

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-direct {v0, v2, v3, v1}, Lexpo/modules/image/enums/ImageCacheType;-><init>(Ljava/lang/String;I[Lv1/a;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->NONE:Lexpo/modules/image/enums/ImageCacheType;

    .line 18
    .line 19
    new-instance v0, Lexpo/modules/image/enums/ImageCacheType;

    .line 20
    .line 21
    sget-object v1, Lv1/a;->i:Lv1/a;

    .line 22
    .line 23
    sget-object v2, Lv1/a;->j:Lv1/a;

    .line 24
    .line 25
    filled-new-array {v1, v2}, [Lv1/a;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "DISK"

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    invoke-direct {v0, v2, v3, v1}, Lexpo/modules/image/enums/ImageCacheType;-><init>(Ljava/lang/String;I[Lv1/a;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->DISK:Lexpo/modules/image/enums/ImageCacheType;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/image/enums/ImageCacheType;

    .line 38
    .line 39
    sget-object v1, Lv1/a;->k:Lv1/a;

    .line 40
    .line 41
    filled-new-array {v1}, [Lv1/a;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    const-string v2, "MEMORY"

    .line 46
    .line 47
    const/4 v3, 0x2

    .line 48
    invoke-direct {v0, v2, v3, v1}, Lexpo/modules/image/enums/ImageCacheType;-><init>(Ljava/lang/String;I[Lv1/a;)V

    .line 49
    .line 50
    .line 51
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->MEMORY:Lexpo/modules/image/enums/ImageCacheType;

    .line 52
    .line 53
    invoke-static {}, Lexpo/modules/image/enums/ImageCacheType;->$values()[Lexpo/modules/image/enums/ImageCacheType;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->$VALUES:[Lexpo/modules/image/enums/ImageCacheType;

    .line 58
    .line 59
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 64
    .line 65
    new-instance v0, Lexpo/modules/image/enums/ImageCacheType$Companion;

    .line 66
    .line 67
    const/4 v1, 0x0

    .line 68
    invoke-direct {v0, v1}, Lexpo/modules/image/enums/ImageCacheType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lexpo/modules/image/enums/ImageCacheType;->Companion:Lexpo/modules/image/enums/ImageCacheType$Companion;

    .line 72
    .line 73
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;I[Lv1/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lv1/a;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/image/enums/ImageCacheType;->dataSources:[Lv1/a;

    .line 5
    .line 6
    return-void
.end method

.method public static final synthetic access$getDataSources$p(Lexpo/modules/image/enums/ImageCacheType;)[Lv1/a;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/image/enums/ImageCacheType;->dataSources:[Lv1/a;

    .line 2
    .line 3
    return-object p0
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
    sget-object v0, Lexpo/modules/image/enums/ImageCacheType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/image/enums/ImageCacheType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/image/enums/ImageCacheType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/image/enums/ImageCacheType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/image/enums/ImageCacheType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/image/enums/ImageCacheType;->$VALUES:[Lexpo/modules/image/enums/ImageCacheType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/image/enums/ImageCacheType;

    .line 8
    .line 9
    return-object v0
.end method
