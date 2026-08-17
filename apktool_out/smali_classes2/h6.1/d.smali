.class public final synthetic Lh6/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lq5/g;


# direct methods
.method public synthetic constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a(Lq5/d;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lh6/f;

    .line 2
    .line 3
    const-class v1, Lh6/h;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Lq5/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lh6/h;

    .line 10
    .line 11
    const-class v2, Lc6/d;

    .line 12
    .line 13
    invoke-interface {p1, v2}, Lq5/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lc6/d;

    .line 18
    .line 19
    const-class v3, Lc6/i;

    .line 20
    .line 21
    invoke-interface {p1, v3}, Lq5/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    check-cast p1, Lc6/i;

    .line 26
    .line 27
    invoke-direct {v0, v1, v2, p1}, Lh6/f;-><init>(Lh6/h;Lc6/d;Lc6/i;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method
