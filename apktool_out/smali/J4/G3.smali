.class public final LJ4/G3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:LJ4/N4;

.field private b:LJ4/F3;

.field private c:LJ4/A3;


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

.method static bridge synthetic a(LJ4/G3;)LJ4/A3;
    .locals 0

    .line 1
    iget-object p0, p0, LJ4/G3;->c:LJ4/A3;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic b(LJ4/G3;)LJ4/F3;
    .locals 0

    .line 1
    iget-object p0, p0, LJ4/G3;->b:LJ4/F3;

    .line 2
    .line 3
    return-object p0
.end method

.method static bridge synthetic g(LJ4/G3;)LJ4/N4;
    .locals 0

    .line 1
    iget-object p0, p0, LJ4/G3;->a:LJ4/N4;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final c(LJ4/F3;)LJ4/G3;
    .locals 0

    .line 1
    iput-object p1, p0, LJ4/G3;->b:LJ4/F3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d(LJ4/A3;)LJ4/G3;
    .locals 0

    .line 1
    iput-object p1, p0, LJ4/G3;->c:LJ4/A3;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(LJ4/N4;)LJ4/G3;
    .locals 0

    .line 1
    iput-object p1, p0, LJ4/G3;->a:LJ4/N4;

    .line 2
    .line 3
    return-object p0
.end method

.method public final f()LJ4/I3;
    .locals 2

    .line 1
    new-instance v0, LJ4/I3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LJ4/I3;-><init>(LJ4/G3;LJ4/H3;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
