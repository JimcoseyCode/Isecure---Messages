.class public final enum LF/w;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:LF/w;

.field public static final enum h:LF/w;

.field public static final enum i:LF/w;

.field public static final enum j:LF/w;

.field private static final synthetic k:[LF/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF/w;

    .line 2
    .line 3
    const-string v1, "UNKNOWN"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF/w;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/w;->g:LF/w;

    .line 10
    .line 11
    new-instance v0, LF/w;

    .line 12
    .line 13
    const-string v1, "OFF"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LF/w;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/w;->h:LF/w;

    .line 20
    .line 21
    new-instance v0, LF/w;

    .line 22
    .line 23
    const-string v1, "ON_MANUAL_AUTO"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LF/w;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LF/w;->i:LF/w;

    .line 30
    .line 31
    new-instance v0, LF/w;

    .line 32
    .line 33
    const-string v1, "ON_CONTINUOUS_AUTO"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LF/w;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LF/w;->j:LF/w;

    .line 40
    .line 41
    invoke-static {}, LF/w;->h()[LF/w;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    sput-object v0, LF/w;->k:[LF/w;

    .line 46
    .line 47
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

.method private static synthetic h()[LF/w;
    .locals 4

    .line 1
    sget-object v0, LF/w;->g:LF/w;

    .line 2
    .line 3
    sget-object v1, LF/w;->h:LF/w;

    .line 4
    .line 5
    sget-object v2, LF/w;->i:LF/w;

    .line 6
    .line 7
    sget-object v3, LF/w;->j:LF/w;

    .line 8
    .line 9
    filled-new-array {v0, v1, v2, v3}, [LF/w;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/w;
    .locals 1

    .line 1
    const-class v0, LF/w;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/w;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/w;
    .locals 1

    .line 1
    sget-object v0, LF/w;->k:[LF/w;

    .line 2
    .line 3
    invoke-virtual {v0}, [LF/w;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/w;

    .line 8
    .line 9
    return-object v0
.end method
