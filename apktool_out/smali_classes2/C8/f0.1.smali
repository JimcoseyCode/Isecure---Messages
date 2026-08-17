.class final LC8/f0;
.super LC8/B;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final i:LC8/r0;


# direct methods
.method public constructor <init>(LC8/d0;LC8/r0;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "attributes"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1}, LC8/B;-><init>(LC8/d0;)V

    .line 12
    .line 13
    .line 14
    iput-object p2, p0, LC8/f0;->i:LC8/r0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public J0()LC8/r0;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/f0;->i:LC8/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic V0(LC8/d0;)LC8/A;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/f0;->W0(LC8/d0;)LC8/f0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public W0(LC8/d0;)LC8/f0;
    .locals 2

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/f0;

    .line 7
    .line 8
    invoke-virtual {p0}, LC8/f0;->J0()LC8/r0;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-direct {v0, p1, v1}, LC8/f0;-><init>(LC8/d0;LC8/r0;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
