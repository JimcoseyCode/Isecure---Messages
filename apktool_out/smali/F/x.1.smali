.class public final enum LF/x;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:LF/x;

.field public static final enum h:LF/x;

.field public static final enum i:LF/x;

.field public static final enum j:LF/x;

.field public static final enum k:LF/x;

.field public static final enum l:LF/x;

.field public static final enum m:LF/x;

.field private static final synthetic n:[LF/x;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF/x;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/x;->g:LF/x;

    .line 10
    .line 11
    new-instance v0, LF/x;

    .line 12
    .line 13
    const-string v1, "INACTIVE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/x;->h:LF/x;

    .line 20
    .line 21
    new-instance v0, LF/x;

    .line 22
    .line 23
    const-string v1, "SCANNING"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LF/x;->i:LF/x;

    .line 30
    .line 31
    new-instance v0, LF/x;

    .line 32
    .line 33
    const-string v1, "PASSIVE_FOCUSED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LF/x;->j:LF/x;

    .line 40
    .line 41
    new-instance v0, LF/x;

    .line 42
    .line 43
    const-string v1, "PASSIVE_NOT_FOCUSED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LF/x;->k:LF/x;

    .line 50
    .line 51
    new-instance v0, LF/x;

    .line 52
    .line 53
    const-string v1, "LOCKED_FOCUSED"

    .line 54
    .line 55
    const/4 v2, 0x5

    .line 56
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LF/x;->l:LF/x;

    .line 60
    .line 61
    new-instance v0, LF/x;

    .line 62
    .line 63
    const-string v1, "LOCKED_NOT_FOCUSED"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2}, LF/x;-><init>(Ljava/lang/String;I)V

    .line 67
    .line 68
    .line 69
    sput-object v0, LF/x;->m:LF/x;

    .line 70
    .line 71
    invoke-static {}, LF/x;->h()[LF/x;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LF/x;->n:[LF/x;

    .line 76
    .line 77
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

.method private static synthetic h()[LF/x;
    .locals 7

    .line 1
    sget-object v0, LF/x;->g:LF/x;

    .line 2
    .line 3
    sget-object v1, LF/x;->h:LF/x;

    .line 4
    .line 5
    sget-object v2, LF/x;->i:LF/x;

    .line 6
    .line 7
    sget-object v3, LF/x;->j:LF/x;

    .line 8
    .line 9
    sget-object v4, LF/x;->k:LF/x;

    .line 10
    .line 11
    sget-object v5, LF/x;->l:LF/x;

    .line 12
    .line 13
    sget-object v6, LF/x;->m:LF/x;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [LF/x;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/x;
    .locals 1

    .line 1
    const-class v0, LF/x;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/x;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/x;
    .locals 1

    .line 1
    sget-object v0, LF/x;->n:[LF/x;

    .line 2
    .line 3
    invoke-virtual {v0}, [LF/x;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/x;

    .line 8
    .line 9
    return-object v0
.end method
