.class public final synthetic LI4/D9;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC5/b;


# instance fields
.field public final synthetic a:LU3/i;


# direct methods
.method public synthetic constructor <init>(LU3/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/D9;->a:LU3/i;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 1
    const-string v0, "proto"

    .line 2
    .line 3
    invoke-static {v0}, LU3/c;->b(Ljava/lang/String;)LU3/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, LI4/B9;

    .line 8
    .line 9
    invoke-direct {v1}, LI4/B9;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v2, p0, LI4/D9;->a:LU3/i;

    .line 13
    .line 14
    const-string v3, "FIREBASE_ML_SDK"

    .line 15
    .line 16
    const-class v4, [B

    .line 17
    .line 18
    invoke-interface {v2, v3, v4, v0, v1}, LU3/i;->a(Ljava/lang/String;Ljava/lang/Class;LU3/c;LU3/g;)LU3/h;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method
