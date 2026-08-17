.class public abstract LC8/A;
.super LC8/d0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LC8/d0;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public I0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->I0()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public J0()LC8/r0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->J0()LC8/r0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public K0()LC8/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public L0()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->L0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/A;->U0(LD8/g;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic P0(LD8/g;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/A;->U0(LD8/g;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected abstract T0()LC8/d0;
.end method

.method public U0(LD8/g;)LC8/d0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p1, v0}, LD8/g;->h(LG8/i;)LC8/S;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, LC8/d0;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, LC8/A;->V0(LC8/d0;)LC8/A;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public abstract V0(LC8/d0;)LC8/A;
.end method

.method public o()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/A;->T0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LC8/S;->o()Lv8/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
