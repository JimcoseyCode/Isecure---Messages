.class public final LG4/F3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Ljava/lang/Long;

.field private c:LG4/m4;

.field private d:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static bridge synthetic f(LG4/F3;)LG4/m4;
    .locals 0

    .line 1
    iget-object p0, p0, LG4/F3;->c:LG4/m4;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LG4/F3;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, LG4/F3;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(LG4/F3;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, LG4/F3;->a:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic i(LG4/F3;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, LG4/F3;->b:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LG4/F3;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/F3;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/lang/Long;)LG4/F3;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    const-wide v2, 0x7fffffffffffffffL

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    and-long/2addr v0, v2

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, LG4/F3;->b:Ljava/lang/Long;

    .line 16
    .line 17
    return-object p0
.end method

.method public final c(LG4/m4;)LG4/F3;
    .locals 0

    .line 1
    iput-object p1, p0, LG4/F3;->c:LG4/m4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(Ljava/lang/Integer;)LG4/F3;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const v0, 0x7fffffff

    .line 6
    .line 7
    .line 8
    and-int/2addr p1, v0

    .line 9
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, LG4/F3;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    return-object p0
.end method

.method public final e()LG4/H3;
    .locals 2

    .line 1
    new-instance v0, LG4/H3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LG4/H3;-><init>(LG4/F3;LG4/G3;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
