.class public abstract LH4/E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


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

.method public static d(Ljava/lang/String;)LH4/D;
    .locals 1

    .line 1
    new-instance p0, LH4/y;

    .line 2
    .line 3
    invoke-direct {p0}, LH4/y;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v0, "common"

    .line 7
    .line 8
    invoke-virtual {p0, v0}, LH4/y;->d(Ljava/lang/String;)LH4/D;

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    invoke-virtual {p0, v0}, LH4/D;->a(Z)LH4/D;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, LH4/D;->b(I)LH4/D;

    .line 16
    .line 17
    .line 18
    return-object p0
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract b()Ljava/lang/String;
.end method

.method public abstract c()Z
.end method
