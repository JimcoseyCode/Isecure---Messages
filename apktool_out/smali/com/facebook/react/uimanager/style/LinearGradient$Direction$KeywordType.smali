.class public final enum Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/style/LinearGradient$Direction;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "KeywordType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\n\u0008\u0086\u0081\u0002\u0018\u0000 \u000c2\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000cB\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;",
        "",
        "value",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getValue",
        "()Ljava/lang/String;",
        "TO_TOP_RIGHT",
        "TO_BOTTOM_RIGHT",
        "TO_TOP_LEFT",
        "TO_BOTTOM_LEFT",
        "Companion",
        "ReactAndroid_release"
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

.field private static final synthetic $VALUES:[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

.field public static final Companion:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;

.field public static final enum TO_BOTTOM_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

.field public static final enum TO_BOTTOM_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

.field public static final enum TO_TOP_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

.field public static final enum TO_TOP_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;
    .locals 4

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_TOP_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 2
    .line 3
    sget-object v1, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_BOTTOM_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 4
    .line 5
    sget-object v2, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_TOP_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 6
    .line 7
    sget-object v3, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_BOTTOM_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

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
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "to top right"

    .line 5
    .line 6
    const-string v3, "TO_TOP_RIGHT"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_TOP_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 12
    .line 13
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "to bottom right"

    .line 17
    .line 18
    const-string v3, "TO_BOTTOM_RIGHT"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_BOTTOM_RIGHT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 24
    .line 25
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "to top left"

    .line 29
    .line 30
    const-string v3, "TO_TOP_LEFT"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_TOP_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 36
    .line 37
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "to bottom left"

    .line 41
    .line 42
    const-string v3, "TO_BOTTOM_LEFT"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->TO_BOTTOM_LEFT:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 48
    .line 49
    invoke-static {}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->$values()[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->$VALUES:[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 54
    .line 55
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 60
    .line 61
    new-instance v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;

    .line 62
    .line 63
    const/4 v1, 0x0

    .line 64
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->Companion:Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType$Companion;

    .line 68
    .line 69
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
    iput-object p3, p0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->value:Ljava/lang/String;

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
    sget-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;
    .locals 1

    .line 1
    const-class v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->$VALUES:[Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/LinearGradient$Direction$KeywordType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
