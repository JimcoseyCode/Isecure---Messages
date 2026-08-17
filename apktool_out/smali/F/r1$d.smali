.class public final enum LF/r1$d;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/r1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation


# static fields
.field public static final enum g:LF/r1$d;

.field public static final enum h:LF/r1$d;

.field public static final enum i:LF/r1$d;

.field public static final enum j:LF/r1$d;

.field public static final enum k:LF/r1$d;

.field private static final synthetic l:[LF/r1$d;

.field private static final synthetic m:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LF/r1$d;

    .line 2
    .line 3
    const-string v1, "PRIV"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LF/r1$d;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LF/r1$d;->g:LF/r1$d;

    .line 10
    .line 11
    new-instance v0, LF/r1$d;

    .line 12
    .line 13
    const-string v1, "YUV"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LF/r1$d;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LF/r1$d;->h:LF/r1$d;

    .line 20
    .line 21
    new-instance v0, LF/r1$d;

    .line 22
    .line 23
    const-string v1, "JPEG"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LF/r1$d;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LF/r1$d;->i:LF/r1$d;

    .line 30
    .line 31
    new-instance v0, LF/r1$d;

    .line 32
    .line 33
    const-string v1, "JPEG_R"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LF/r1$d;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LF/r1$d;->j:LF/r1$d;

    .line 40
    .line 41
    new-instance v0, LF/r1$d;

    .line 42
    .line 43
    const-string v1, "RAW"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LF/r1$d;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LF/r1$d;->k:LF/r1$d;

    .line 50
    .line 51
    invoke-static {}, LF/r1$d;->h()[LF/r1$d;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LF/r1$d;->l:[LF/r1$d;

    .line 56
    .line 57
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, LF/r1$d;->m:Lkotlin/enums/EnumEntries;

    .line 62
    .line 63
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

.method private static final synthetic h()[LF/r1$d;
    .locals 5

    .line 1
    sget-object v0, LF/r1$d;->g:LF/r1$d;

    .line 2
    .line 3
    sget-object v1, LF/r1$d;->h:LF/r1$d;

    .line 4
    .line 5
    sget-object v2, LF/r1$d;->i:LF/r1$d;

    .line 6
    .line 7
    sget-object v3, LF/r1$d;->j:LF/r1$d;

    .line 8
    .line 9
    sget-object v4, LF/r1$d;->k:LF/r1$d;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [LF/r1$d;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LF/r1$d;
    .locals 1

    .line 1
    const-class v0, LF/r1$d;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LF/r1$d;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LF/r1$d;
    .locals 1

    .line 1
    sget-object v0, LF/r1$d;->l:[LF/r1$d;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LF/r1$d;

    .line 8
    .line 9
    return-object v0
.end method
