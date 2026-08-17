.class public final enum LJ7/c;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/c$a;
    }
.end annotation


# static fields
.field public static final g:LJ7/c$a;

.field public static final enum h:LJ7/c;

.field public static final enum i:LJ7/c;

.field public static final enum j:LJ7/c;

.field public static final enum k:LJ7/c;

.field public static final enum l:LJ7/c;

.field private static final synthetic m:[LJ7/c;

.field private static final synthetic n:Lkotlin/enums/EnumEntries;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, LJ7/c;

    .line 2
    .line 3
    const-string v1, "Function"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, LJ7/c;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, LJ7/c;->h:LJ7/c;

    .line 10
    .line 11
    new-instance v0, LJ7/c;

    .line 12
    .line 13
    const-string v1, "SuspendFunction"

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    invoke-direct {v0, v1, v2}, LJ7/c;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v0, LJ7/c;->i:LJ7/c;

    .line 20
    .line 21
    new-instance v0, LJ7/c;

    .line 22
    .line 23
    const-string v1, "KFunction"

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v0, v1, v2}, LJ7/c;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v0, LJ7/c;->j:LJ7/c;

    .line 30
    .line 31
    new-instance v0, LJ7/c;

    .line 32
    .line 33
    const-string v1, "KSuspendFunction"

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    invoke-direct {v0, v1, v2}, LJ7/c;-><init>(Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    sput-object v0, LJ7/c;->k:LJ7/c;

    .line 40
    .line 41
    new-instance v0, LJ7/c;

    .line 42
    .line 43
    const-string v1, "UNKNOWN"

    .line 44
    .line 45
    const/4 v2, 0x4

    .line 46
    invoke-direct {v0, v1, v2}, LJ7/c;-><init>(Ljava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    sput-object v0, LJ7/c;->l:LJ7/c;

    .line 50
    .line 51
    invoke-static {}, LJ7/c;->h()[LJ7/c;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, LJ7/c;->m:[LJ7/c;

    .line 56
    .line 57
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, LJ7/c;->n:Lkotlin/enums/EnumEntries;

    .line 62
    .line 63
    new-instance v0, LJ7/c$a;

    .line 64
    .line 65
    const/4 v1, 0x0

    .line 66
    invoke-direct {v0, v1}, LJ7/c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 67
    .line 68
    .line 69
    sput-object v0, LJ7/c;->g:LJ7/c$a;

    .line 70
    .line 71
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

.method private static final synthetic h()[LJ7/c;
    .locals 5

    .line 1
    sget-object v0, LJ7/c;->h:LJ7/c;

    .line 2
    .line 3
    sget-object v1, LJ7/c;->i:LJ7/c;

    .line 4
    .line 5
    sget-object v2, LJ7/c;->j:LJ7/c;

    .line 6
    .line 7
    sget-object v3, LJ7/c;->k:LJ7/c;

    .line 8
    .line 9
    sget-object v4, LJ7/c;->l:LJ7/c;

    .line 10
    .line 11
    filled-new-array {v0, v1, v2, v3, v4}, [LJ7/c;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LJ7/c;
    .locals 1

    .line 1
    const-class v0, LJ7/c;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LJ7/c;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LJ7/c;
    .locals 1

    .line 1
    sget-object v0, LJ7/c;->m:[LJ7/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LJ7/c;

    .line 8
    .line 9
    return-object v0
.end method
