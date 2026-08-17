.class public abstract LW2/s;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static a(LW2/x;LW2/t;)LW2/u;
    .locals 1

    .line 1
    invoke-interface {p1, p0}, LW2/t;->b(LW2/x;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LW2/s$a;

    .line 5
    .line 6
    invoke-direct {v0, p1}, LW2/s$a;-><init>(LW2/t;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, LW2/u;

    .line 10
    .line 11
    invoke-direct {p1, p0, v0}, LW2/u;-><init>(LW2/x;LW2/z;)V

    .line 12
    .line 13
    .line 14
    return-object p1
.end method
