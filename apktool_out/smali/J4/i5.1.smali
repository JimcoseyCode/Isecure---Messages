.class final LJ4/i5;
.super LJ4/k5;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final o:LJ4/i5;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LJ4/i5;

    .line 2
    .line 3
    const-string v1, "unusedTag"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LJ4/i5;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LJ4/i5;->o:LJ4/i5;

    .line 9
    .line 10
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string p1, "unusedTag"

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, p1, v0}, LJ4/k5;-><init>(Ljava/lang/String;LJ4/j5;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method static bridge synthetic s()LJ4/i5;
    .locals 1

    .line 1
    sget-object v0, LJ4/i5;->o:LJ4/i5;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    return-void
.end method

.method public final bridge synthetic e()LJ4/k5;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final k(J)V
    .locals 0

    .line 1
    return-void
.end method

.method public final m(J)V
    .locals 0

    .line 1
    return-void
.end method
