.class public abstract LC8/B;
.super LC8/A;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final h:LC8/d0;


# direct methods
.method public constructor <init>(LC8/d0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LC8/A;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LC8/B;->h:LC8/d0;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic O0(Z)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/B;->R0(Z)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic Q0(LC8/r0;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/B;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public R0(Z)LC8/d0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->L0()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    invoke-virtual {p0}, LC8/B;->T0()LC8/d0;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, LC8/d0;->R0(Z)LC8/d0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, LC8/A;->J0()LC8/r0;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {p1, v0}, LC8/d0;->S0(LC8/r0;)LC8/d0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 1

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LC8/A;->J0()LC8/r0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    new-instance v0, LC8/f0;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1}, LC8/f0;-><init>(LC8/d0;LC8/r0;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    return-object p0
.end method

.method protected T0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/B;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method
