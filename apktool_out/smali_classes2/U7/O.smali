.class public final enum LU7/O;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU7/O$a;
    }
.end annotation


# static fields
.field public static final h:LU7/O$a;

.field public static final enum i:LU7/O;

.field public static final enum j:LU7/O;

.field public static final enum k:LU7/O;

.field private static final synthetic l:[LU7/O;

.field private static final synthetic m:Lkotlin/enums/EnumEntries;


# instance fields
.field private final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LU7/O;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "ignore"

    .line 5
    .line 6
    const-string v3, "IGNORE"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, LU7/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LU7/O;->i:LU7/O;

    .line 12
    .line 13
    new-instance v0, LU7/O;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "warn"

    .line 17
    .line 18
    const-string v3, "WARN"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, LU7/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LU7/O;->j:LU7/O;

    .line 24
    .line 25
    new-instance v0, LU7/O;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "strict"

    .line 29
    .line 30
    const-string v3, "STRICT"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, LU7/O;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LU7/O;->k:LU7/O;

    .line 36
    .line 37
    invoke-static {}, LU7/O;->h()[LU7/O;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, LU7/O;->l:[LU7/O;

    .line 42
    .line 43
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, LU7/O;->m:Lkotlin/enums/EnumEntries;

    .line 48
    .line 49
    new-instance v0, LU7/O$a;

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-direct {v0, v1}, LU7/O$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 53
    .line 54
    .line 55
    sput-object v0, LU7/O;->h:LU7/O$a;

    .line 56
    .line 57
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, LU7/O;->g:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method private static final synthetic h()[LU7/O;
    .locals 3

    .line 1
    sget-object v0, LU7/O;->i:LU7/O;

    .line 2
    .line 3
    sget-object v1, LU7/O;->j:LU7/O;

    .line 4
    .line 5
    sget-object v2, LU7/O;->k:LU7/O;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [LU7/O;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)LU7/O;
    .locals 1

    .line 1
    const-class v0, LU7/O;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, LU7/O;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[LU7/O;
    .locals 1

    .line 1
    sget-object v0, LU7/O;->l:[LU7/O;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [LU7/O;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final j()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LU7/O;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Z
    .locals 1

    .line 1
    sget-object v0, LU7/O;->i:LU7/O;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final m()Z
    .locals 1

    .line 1
    sget-object v0, LU7/O;->j:LU7/O;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
