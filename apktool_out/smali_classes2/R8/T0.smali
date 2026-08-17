.class public abstract LR8/T0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static final a(LR8/A0;)LR8/z;
    .locals 1

    .line 1
    new-instance v0, LR8/S0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LR8/S0;-><init>(LR8/A0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static synthetic b(LR8/A0;ILjava/lang/Object;)LR8/z;
    .locals 0

    .line 1
    and-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    :cond_0
    invoke-static {p0}, LR8/T0;->a(LR8/A0;)LR8/z;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method
