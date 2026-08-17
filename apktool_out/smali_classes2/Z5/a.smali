.class public final synthetic LZ5/a;
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
    .locals 2

    .line 1
    new-instance v0, Ld6/a;

    .line 2
    .line 3
    const-class v1, Lc6/i;

    .line 4
    .line 5
    invoke-interface {p1, v1}, Lq5/d;->a(Ljava/lang/Class;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lc6/i;

    .line 10
    .line 11
    invoke-direct {v0, p1}, Ld6/a;-><init>(Lc6/i;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
