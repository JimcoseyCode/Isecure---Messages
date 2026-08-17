.class public final LI4/y6;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Ljava/lang/Long;

.field private b:LI4/L6;

.field private c:Ljava/lang/Boolean;

.field private d:Ljava/lang/Boolean;

.field private e:Ljava/lang/Boolean;


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

.method static bridge synthetic g(LI4/y6;)LI4/L6;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/y6;->b:LI4/L6;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic h(LI4/y6;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/y6;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic i(LI4/y6;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/y6;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic j(LI4/y6;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/y6;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic k(LI4/y6;)Ljava/lang/Long;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/y6;->a:Ljava/lang/Long;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Boolean;)LI4/y6;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/y6;->d:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/lang/Boolean;)LI4/y6;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/y6;->e:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(Ljava/lang/Long;)LI4/y6;
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
    iput-object p1, p0, LI4/y6;->a:Ljava/lang/Long;

    .line 16
    .line 17
    return-object p0
.end method

.method public final d(LI4/L6;)LI4/y6;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/y6;->b:LI4/L6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(Ljava/lang/Boolean;)LI4/y6;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/y6;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()LI4/A6;
    .locals 2

    .line 1
    new-instance v0, LI4/A6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LI4/A6;-><init>(LI4/y6;LI4/z6;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
