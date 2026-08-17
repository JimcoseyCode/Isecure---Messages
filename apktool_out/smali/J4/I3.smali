.class public final LJ4/I3;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LJ4/N4;

.field private final b:LJ4/F3;

.field private final c:LJ4/A3;


# direct methods
.method synthetic constructor <init>(LJ4/G3;LJ4/H3;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LJ4/G3;->g(LJ4/G3;)LJ4/N4;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, LJ4/I3;->a:LJ4/N4;

    .line 9
    .line 10
    invoke-static {p1}, LJ4/G3;->b(LJ4/G3;)LJ4/F3;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iput-object p2, p0, LJ4/I3;->b:LJ4/F3;

    .line 15
    .line 16
    invoke-static {p1}, LJ4/G3;->a(LJ4/G3;)LJ4/A3;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, LJ4/I3;->c:LJ4/A3;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()LJ4/A3;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/I3;->c:LJ4/A3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LJ4/F3;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/I3;->b:LJ4/F3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LJ4/N4;
    .locals 1

    .line 1
    iget-object v0, p0, LJ4/I3;->a:LJ4/N4;

    .line 2
    .line 3
    return-object v0
.end method
