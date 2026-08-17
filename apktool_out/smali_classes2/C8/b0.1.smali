.class final LC8/b0;
.super LC8/B;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


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
    invoke-direct {p0, p1}, LC8/B;-><init>(LC8/d0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public L0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public bridge synthetic V0(LC8/d0;)LC8/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/b0;->W0(LC8/d0;)LC8/b0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public W0(LC8/d0;)LC8/b0;
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/b0;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LC8/b0;-><init>(LC8/d0;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
