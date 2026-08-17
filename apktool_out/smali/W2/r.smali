.class public abstract LW2/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static a(Lc2/n;Lf2/d;LW2/x$a;)LW2/n;
    .locals 7

    .line 1
    new-instance v1, LW2/r$a;

    .line 2
    .line 3
    invoke-direct {v1}, LW2/r$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, LW2/w;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    move-object v3, p0

    .line 12
    move-object v2, p2

    .line 13
    invoke-direct/range {v0 .. v6}, LW2/w;-><init>(LW2/D;LW2/x$a;Lc2/n;LW2/n$b;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1, v0}, Lf2/d;->a(Lf2/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
