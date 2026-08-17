.class public final LI4/Z0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:LI4/c1;

.field private b:Ljava/lang/Integer;

.field private c:LI4/n6;


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

.method static bridge synthetic d(LI4/Z0;)LI4/c1;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/Z0;->a:LI4/c1;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic f(LI4/Z0;)LI4/n6;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/Z0;->c:LI4/n6;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LI4/Z0;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/Z0;->b:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;)LI4/Z0;
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
    iput-object p1, p0, LI4/Z0;->b:Ljava/lang/Integer;

    .line 14
    .line 15
    return-object p0
.end method

.method public final b(LI4/n6;)LI4/Z0;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/Z0;->c:LI4/n6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c(LI4/c1;)LI4/Z0;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/Z0;->a:LI4/c1;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()LI4/e1;
    .locals 2

    .line 1
    new-instance v0, LI4/e1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LI4/e1;-><init>(LI4/Z0;LI4/d1;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
