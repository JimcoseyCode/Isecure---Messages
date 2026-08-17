.class public abstract LC8/I;
.super LC8/M0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LG8/g;


# instance fields
.field private final h:LC8/d0;

.field private final i:LC8/d0;


# direct methods
.method public constructor <init>(LC8/d0;LC8/d0;)V
    .locals 1

    .line 1
    const-string v0, "lowerBound"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "upperBound"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, LC8/M0;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LC8/I;->h:LC8/d0;

    .line 16
    .line 17
    iput-object p2, p0, LC8/I;->i:LC8/d0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public I0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/I;->R0()LC8/d0;

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
    invoke-virtual {p0}, LC8/I;->R0()LC8/d0;

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
    invoke-virtual {p0}, LC8/I;->R0()LC8/d0;

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
    invoke-virtual {p0}, LC8/I;->R0()LC8/d0;

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

.method public abstract R0()LC8/d0;
.end method

.method public final S0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/I;->h:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final T0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/I;->i:LC8/d0;

    .line 2
    .line 3
    return-object v0
.end method

.method public abstract U0(Ln8/n;Ln8/w;)Ljava/lang/String;
.end method

.method public o()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LC8/I;->R0()LC8/d0;

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

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ln8/n;->k:Ln8/n;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ln8/n;->U(LC8/S;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
