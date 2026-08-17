.class public final enum LF/z;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:LF/z;

.field public static final enum h:LF/z;

.field public static final enum i:LF/z;

.field public static final enum j:LF/z;

.field public static final enum k:LF/z;

.field private static final synthetic l:[LF/z;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF/z;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF/z;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/z;->g:LF/z;

    .line 10
    .line 11
    new-instance v0, LF/z;

    .line 12
    .line 13
    const-string v1, "INACTIVE"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LF/z;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/z;->h:LF/z;

    .line 20
    .line 21
    new-instance v0, LF/z;

    .line 22
    .line 23
    const-string v1, "METERING"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LF/z;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LF/z;->i:LF/z;

    .line 30
    .line 31
    new-instance v0, LF/z;

    .line 32
    .line 33
    const-string v1, "CONVERGED"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LF/z;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LF/z;->j:LF/z;

    .line 40
    .line 41
    new-instance v0, LF/z;

    .line 42
    .line 43
    const-string v1, "LOCKED"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LF/z;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LF/z;->k:LF/z;

    .line 50
    .line 51
    invoke-static {}, LF/z;->h()[LF/z;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LF/z;->l:[LF/z;

    .line 56
    .line 57
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

.method private static synthetic h()[LF/z;
    .locals 5

    .line 1
    sget-object v0, LF/z;->g:LF/z;

    .line 2
    .line 3
    sget-object v1, LF/z;->h:LF/z;

    .line 4
    .line 5
    sget-object v2, LF/z;->i:LF/z;

    .line 6
    .line 7
    sget-object v3, LF/z;->j:LF/z;

    .line 8
    .line 9
    sget-object v4, LF/z;->k:LF/z;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [LF/z;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/z;
    .locals 1

    .line 1
    const-class v0, LF/z;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/z;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/z;
    .locals 1

    .line 1
    sget-object v0, LF/z;->l:[LF/z;

    .line 2
    .line 3
    invoke-virtual {v0}, [LF/z;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/z;

    .line 8
    .line 9
    return-object v0
.end method
