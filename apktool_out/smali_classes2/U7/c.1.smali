.class public final enum LU7/c;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum h:LU7/c;

.field public static final enum i:LU7/c;

.field public static final enum j:LU7/c;

.field public static final enum k:LU7/c;

.field public static final enum l:LU7/c;

.field public static final enum m:LU7/c;

.field private static final synthetic n:[LU7/c;

.field private static final synthetic o:Lkotlin/enums/EnumEntries;


# instance fields
.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LU7/c;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "METHOD"

    .line 5
    .line 6
    const-string v3, "METHOD_RETURN_TYPE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LU7/c;->h:LU7/c;

    .line 12
    .line 13
    new-instance v0, LU7/c;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "PARAMETER"

    .line 17
    .line 18
    const-string v3, "VALUE_PARAMETER"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LU7/c;->i:LU7/c;

    .line 24
    .line 25
    new-instance v0, LU7/c;

    .line 26
    .line 27
    const-string v1, "FIELD"

    .line 28
    .line 29
    const/4 v2, 0x2

    .line 30
    invoke-direct {v0, v1, v2, v1}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sput-object v0, LU7/c;->j:LU7/c;

    .line 34
    .line 35
    new-instance v0, LU7/c;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    const-string v2, "TYPE_USE"

    .line 39
    .line 40
    invoke-direct {v0, v2, v1, v2}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 41
    .line 42
    .line 43
    sput-object v0, LU7/c;->k:LU7/c;

    .line 44
    .line 45
    new-instance v0, LU7/c;

    .line 46
    .line 47
    const-string v1, "TYPE_PARAMETER_BOUNDS"

    .line 48
    .line 49
    const/4 v3, 0x4

    .line 50
    invoke-direct {v0, v1, v3, v2}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sput-object v0, LU7/c;->l:LU7/c;

    .line 54
    .line 55
    new-instance v0, LU7/c;

    .line 56
    .line 57
    const-string v1, "TYPE_PARAMETER"

    .line 58
    .line 59
    const/4 v2, 0x5

    .line 60
    invoke-direct {v0, v1, v2, v1}, LU7/c;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 61
    .line 62
    .line 63
    sput-object v0, LU7/c;->m:LU7/c;

    .line 64
    .line 65
    invoke-static {}, LU7/c;->h()[LU7/c;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    sput-object v0, LU7/c;->n:[LU7/c;

    .line 70
    .line 71
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LU7/c;->o:Lkotlin/enums/EnumEntries;

    .line 76
    .line 77
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LU7/c;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic h()[LU7/c;
    .locals 6

    .line 1
    sget-object v0, LU7/c;->h:LU7/c;

    .line 2
    .line 3
    sget-object v1, LU7/c;->i:LU7/c;

    .line 4
    .line 5
    sget-object v2, LU7/c;->j:LU7/c;

    .line 6
    .line 7
    sget-object v3, LU7/c;->k:LU7/c;

    .line 8
    .line 9
    sget-object v4, LU7/c;->l:LU7/c;

    .line 10
    .line 11
    sget-object v5, LU7/c;->m:LU7/c;

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [LU7/c;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LU7/c;
    .locals 1

    .line 1
    const-class v0, LU7/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LU7/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LU7/c;
    .locals 1

    .line 1
    sget-object v0, LU7/c;->n:[LU7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LU7/c;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LU7/c;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
