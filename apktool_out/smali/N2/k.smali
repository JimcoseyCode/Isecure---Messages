.class public final enum LN2/k;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:LN2/k;

.field public static final enum h:LN2/k;

.field public static final enum i:LN2/k;

.field public static final enum j:LN2/k;

.field private static final synthetic k:[LN2/k;

.field private static final synthetic l:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LN2/k;

    .line 2
    .line 3
    const-string v1, "VITO_V2"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LN2/k;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LN2/k;->g:LN2/k;

    .line 10
    .line 11
    new-instance v0, LN2/k;

    .line 12
    .line 13
    const-string v1, "VITO_V1"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LN2/k;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LN2/k;->h:LN2/k;

    .line 20
    .line 21
    new-instance v0, LN2/k;

    .line 22
    .line 23
    const-string v1, "DRAWEE"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LN2/k;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LN2/k;->i:LN2/k;

    .line 30
    .line 31
    new-instance v0, LN2/k;

    .line 32
    .line 33
    const-string v1, "OTHER"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LN2/k;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LN2/k;->j:LN2/k;

    .line 40
    .line 41
    invoke-static {}, LN2/k;->h()[LN2/k;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LN2/k;->k:[LN2/k;

    .line 46
    .line 47
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, LN2/k;->l:Lkotlin/enums/EnumEntries;

    .line 52
    .line 53
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final synthetic h()[LN2/k;
    .locals 4

    .line 1
    sget-object v0, LN2/k;->g:LN2/k;

    .line 2
    .line 3
    sget-object v1, LN2/k;->h:LN2/k;

    .line 4
    .line 5
    sget-object v2, LN2/k;->i:LN2/k;

    .line 6
    .line 7
    sget-object v3, LN2/k;->j:LN2/k;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LN2/k;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LN2/k;
    .locals 1

    .line 1
    const-class v0, LN2/k;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LN2/k;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LN2/k;
    .locals 1

    .line 1
    sget-object v0, LN2/k;->k:[LN2/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LN2/k;

    .line 8
    .line 9
    return-object v0
.end method
