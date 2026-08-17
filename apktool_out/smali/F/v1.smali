.class public final enum LF/v1;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum g:LF/v1;

.field public static final enum h:LF/v1;

.field private static final synthetic i:[LF/v1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF/v1;

    .line 2
    .line 3
    const-string v1, "UPTIME"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF/v1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/v1;->g:LF/v1;

    .line 10
    .line 11
    new-instance v0, LF/v1;

    .line 12
    .line 13
    const-string v1, "REALTIME"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LF/v1;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/v1;->h:LF/v1;

    .line 20
    .line 21
    invoke-static {}, LF/v1;->h()[LF/v1;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, LF/v1;->i:[LF/v1;

    .line 26
    .line 27
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

.method private static synthetic h()[LF/v1;
    .locals 2

    .line 1
    sget-object v0, LF/v1;->g:LF/v1;

    .line 2
    .line 3
    sget-object v1, LF/v1;->h:LF/v1;

    .line 4
    .line 5
    filled-new-array {v0, v1}, [LF/v1;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/v1;
    .locals 1

    .line 1
    const-class v0, LF/v1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/v1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/v1;
    .locals 1

    .line 1
    sget-object v0, LF/v1;->i:[LF/v1;

    .line 2
    .line 3
    invoke-virtual {v0}, [LF/v1;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/v1;

    .line 8
    .line 9
    return-object v0
.end method
