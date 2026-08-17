.class public LW2/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW2/a;


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


# virtual methods
.method public a(Lc2/n;Lf2/d;LW2/x$a;ZZLW2/n$b;)LW2/n;
    .locals 7

    .line 1
    new-instance v1, LW2/l$a;

    .line 2
    .line 3
    invoke-direct {v1, p0}, LW2/l$a;-><init>(LW2/l;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LW2/w;

    .line 7
    .line 8
    move-object v3, p1

    .line 9
    move-object v2, p3

    .line 10
    move v5, p4

    .line 11
    move v6, p5

    .line 12
    move-object v4, p6

    .line 13
    invoke-direct/range {v0 .. v6}, LW2/w;-><init>(LW2/D;LW2/x$a;Lc2/n;LW2/n$b;ZZ)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p2, v0}, Lf2/d;->a(Lf2/c;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
