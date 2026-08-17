.class public final enum Lexpo/modules/camera/records/CameraRatio;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/kotlin/types/Enumerable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/camera/records/CameraRatio$WhenMappings;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/camera/records/CameraRatio;",
        ">;",
        "Lexpo/modules/kotlin/types/Enumerable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0086\u0081\u0002\u0018\u00002\u00020\u00012\u0008\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\u0008\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lexpo/modules/camera/records/CameraRatio;",
        "Lexpo/modules/kotlin/types/Enumerable;",
        "",
        "",
        "value",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "LS/a;",
        "mapToStrategy",
        "()LS/a;",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "FOUR_THREE",
        "SIXTEEN_NINE",
        "ONE_ONE",
        "expo-camera_release"
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

.field private static final synthetic $VALUES:[Lexpo/modules/camera/records/CameraRatio;

.field public static final enum FOUR_THREE:Lexpo/modules/camera/records/CameraRatio;

.field public static final enum ONE_ONE:Lexpo/modules/camera/records/CameraRatio;

.field public static final enum SIXTEEN_NINE:Lexpo/modules/camera/records/CameraRatio;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/camera/records/CameraRatio;
    .locals 3

    .line 1
    sget-object v0, Lexpo/modules/camera/records/CameraRatio;->FOUR_THREE:Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/camera/records/CameraRatio;->SIXTEEN_NINE:Lexpo/modules/camera/records/CameraRatio;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/camera/records/CameraRatio;->ONE_ONE:Lexpo/modules/camera/records/CameraRatio;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [Lexpo/modules/camera/records/CameraRatio;

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
    new-instance v0, Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "4:3"

    .line 5
    .line 6
    const-string v3, "FOUR_THREE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/CameraRatio;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/camera/records/CameraRatio;->FOUR_THREE:Lexpo/modules/camera/records/CameraRatio;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/camera/records/CameraRatio;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "16:9"

    .line 17
    .line 18
    const-string v3, "SIXTEEN_NINE"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/CameraRatio;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/camera/records/CameraRatio;->SIXTEEN_NINE:Lexpo/modules/camera/records/CameraRatio;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/camera/records/CameraRatio;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "1:1"

    .line 29
    .line 30
    const-string v3, "ONE_ONE"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/camera/records/CameraRatio;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/camera/records/CameraRatio;->ONE_ONE:Lexpo/modules/camera/records/CameraRatio;

    .line 36
    .line 37
    invoke-static {}, Lexpo/modules/camera/records/CameraRatio;->$values()[Lexpo/modules/camera/records/CameraRatio;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lexpo/modules/camera/records/CameraRatio;->$VALUES:[Lexpo/modules/camera/records/CameraRatio;

    .line 42
    .line 43
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, Lexpo/modules/camera/records/CameraRatio;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
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
    iput-object p3, p0, Lexpo/modules/camera/records/CameraRatio;->value:Ljava/lang/String;

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
    sget-object v0, Lexpo/modules/camera/records/CameraRatio;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/camera/records/CameraRatio;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/camera/records/CameraRatio;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/camera/records/CameraRatio;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/camera/records/CameraRatio;->$VALUES:[Lexpo/modules/camera/records/CameraRatio;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/camera/records/CameraRatio;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/records/CameraRatio;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final mapToStrategy()LS/a;
    .locals 2

    .line 1
    sget-object v0, Lexpo/modules/camera/records/CameraRatio$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_1

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    sget-object v0, LS/a;->c:LS/a;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, LS/a;->d:LS/a;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, LS/a;->c:LS/a;

    .line 22
    .line 23
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method
