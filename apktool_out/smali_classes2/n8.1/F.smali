.class public abstract enum Ln8/F;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln8/F$a;,
        Ln8/F$b;
    }
.end annotation


# static fields
.field public static final enum g:Ln8/F;

.field public static final enum h:Ln8/F;

.field private static final synthetic i:[Ln8/F;

.field private static final synthetic j:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ln8/F$b;

    .line 2
    .line 3
    const-string v1, "PLAIN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ln8/F$b;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Ln8/F;->g:Ln8/F;

    .line 10
    .line 11
    new-instance v0, Ln8/F$a;

    .line 12
    .line 13
    const-string v1, "HTML"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, Ln8/F$a;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, Ln8/F;->h:Ln8/F;

    .line 20
    .line 21
    invoke-static {}, Ln8/F;->h()[Ln8/F;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Ln8/F;->i:[Ln8/F;

    .line 26
    .line 27
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Ln8/F;->j:Lkotlin/enums/EnumEntries;

    .line 32
    .line 33
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ln8/F;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic h()[Ln8/F;
    .locals 2

    .line 1
    sget-object v0, Ln8/F;->g:Ln8/F;

    .line 2
    .line 3
    sget-object v1, Ln8/F;->h:Ln8/F;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ln8/F;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln8/F;
    .locals 1

    .line 1
    const-class v0, Ln8/F;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ln8/F;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Ln8/F;
    .locals 1

    .line 1
    sget-object v0, Ln8/F;->i:[Ln8/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Ln8/F;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public abstract j(Ljava/lang/String;)Ljava/lang/String;
.end method
