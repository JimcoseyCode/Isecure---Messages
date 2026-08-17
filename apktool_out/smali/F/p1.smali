.class public final enum LF/p1;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final enum h:LF/p1;

.field public static final enum i:LF/p1;

.field public static final enum j:LF/p1;

.field public static final enum k:LF/p1;

.field public static final enum l:LF/p1;

.field public static final enum m:LF/p1;

.field public static final enum n:LF/p1;

.field private static final synthetic o:[LF/p1;

.field private static final synthetic p:Lkotlin/enums/EnumEntries;


# instance fields
.field private final g:J


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LF/p1;

    .line 2
    .line 3
    const-string v1, "DEFAULT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/p1;->h:LF/p1;

    .line 10
    .line 11
    new-instance v0, LF/p1;

    .line 12
    .line 13
    const-string v1, "PREVIEW"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2, v2}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/p1;->i:LF/p1;

    .line 20
    .line 21
    new-instance v0, LF/p1;

    .line 22
    .line 23
    const-string v1, "VIDEO_RECORD"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    const/4 v3, 0x3

    .line 27
    invoke-direct {v0, v1, v2, v3}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 28
    .line 29
    .line 30
    sput-object v0, LF/p1;->j:LF/p1;

    .line 31
    .line 32
    new-instance v0, LF/p1;

    .line 33
    .line 34
    const-string v1, "STILL_CAPTURE"

    .line 35
    .line 36
    invoke-direct {v0, v1, v3, v2}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LF/p1;->k:LF/p1;

    .line 40
    .line 41
    new-instance v0, LF/p1;

    .line 42
    .line 43
    const-string v1, "VIDEO_CALL"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    const/4 v3, 0x5

    .line 47
    invoke-direct {v0, v1, v2, v3}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 48
    .line 49
    .line 50
    sput-object v0, LF/p1;->l:LF/p1;

    .line 51
    .line 52
    new-instance v0, LF/p1;

    .line 53
    .line 54
    const-string v1, "PREVIEW_VIDEO_STILL"

    .line 55
    .line 56
    invoke-direct {v0, v1, v3, v2}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 57
    .line 58
    .line 59
    sput-object v0, LF/p1;->m:LF/p1;

    .line 60
    .line 61
    new-instance v0, LF/p1;

    .line 62
    .line 63
    const-string v1, "CROPPED_RAW"

    .line 64
    .line 65
    const/4 v2, 0x6

    .line 66
    invoke-direct {v0, v1, v2, v2}, LF/p1;-><init>(Ljava/lang/String;II)V

    .line 67
    .line 68
    .line 69
    sput-object v0, LF/p1;->n:LF/p1;

    .line 70
    .line 71
    invoke-static {}, LF/p1;->h()[LF/p1;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sput-object v0, LF/p1;->o:[LF/p1;

    .line 76
    .line 77
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sput-object v0, LF/p1;->p:Lkotlin/enums/EnumEntries;

    .line 82
    .line 83
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    int-to-long p1, p3

    .line 5
    iput-wide p1, p0, LF/p1;->g:J

    .line 6
    .line 7
    return-void
.end method

.method private static final synthetic h()[LF/p1;
    .locals 7

    .line 1
    sget-object v0, LF/p1;->h:LF/p1;

    .line 2
    .line 3
    sget-object v1, LF/p1;->i:LF/p1;

    .line 4
    .line 5
    sget-object v2, LF/p1;->j:LF/p1;

    .line 6
    .line 7
    sget-object v3, LF/p1;->k:LF/p1;

    .line 8
    .line 9
    sget-object v4, LF/p1;->l:LF/p1;

    .line 10
    .line 11
    sget-object v5, LF/p1;->m:LF/p1;

    .line 12
    .line 13
    sget-object v6, LF/p1;->n:LF/p1;

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [LF/p1;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/p1;
    .locals 1

    .line 1
    const-class v0, LF/p1;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/p1;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/p1;
    .locals 1

    .line 1
    sget-object v0, LF/p1;->o:[LF/p1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/p1;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j()J
    .locals 2

    .line 1
    iget-wide v0, p0, LF/p1;->g:J

    .line 2
    .line 3
    return-wide v0
.end method
