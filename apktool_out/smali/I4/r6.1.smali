.class public final LI4/r6;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:LI4/s6;

.field private b:Ljava/lang/Integer;


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

.method static bridge synthetic c(LI4/r6;)LI4/s6;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/r6;->a:LI4/s6;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic e(LI4/r6;)Ljava/lang/Integer;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/r6;->b:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final a(LI4/s6;)LI4/r6;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/r6;->a:LI4/s6;

    .line 2
    .line 3
    return-object p0
.end method

.method public final b(Ljava/lang/Integer;)LI4/r6;
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
    iput-object p1, p0, LI4/r6;->b:Ljava/lang/Integer;

    .line 14
    .line 15
    return-object p0
.end method

.method public final d()LI4/u6;
    .locals 2

    .line 1
    new-instance v0, LI4/u6;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LI4/u6;-><init>(LI4/r6;LI4/t6;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
