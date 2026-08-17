.class public final LC8/Y;
.super LC8/O0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final h:LB8/n;

.field private final i:Lw7/a;

.field private final j:LB8/i;


# direct methods
.method public constructor <init>(LB8/n;Lw7/a;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "computation"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, LC8/O0;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LC8/Y;->h:LB8/n;

    .line 15
    .line 16
    iput-object p2, p0, LC8/Y;->i:Lw7/a;

    .line 17
    .line 18
    invoke-interface {p1, p2}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LC8/Y;->j:LB8/i;

    .line 23
    .line 24
    return-void
.end method

.method static synthetic Q0(LD8/g;LC8/Y;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LC8/Y;->S0(LD8/g;LC8/Y;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final S0(LD8/g;LC8/Y;)LC8/S;
    .locals 0

    .line 1
    iget-object p1, p1, LC8/Y;->i:Lw7/a;

    .line 2
    .line 3
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, LG8/i;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LD8/g;->h(LG8/i;)LC8/S;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method


# virtual methods
.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LC8/Y;->R0(LD8/g;)LC8/Y;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected O0()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/Y;->j:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC8/S;

    .line 8
    .line 9
    return-object v0
.end method

.method public P0()Z
    .locals 1

    .line 1
    iget-object v0, p0, LC8/Y;->j:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, LB8/i;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public R0(LD8/g;)LC8/Y;
    .locals 3

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LC8/Y;

    .line 7
    .line 8
    iget-object v1, p0, LC8/Y;->h:LB8/n;

    .line 9
    .line 10
    new-instance v2, LC8/X;

    .line 11
    .line 12
    invoke-direct {v2, p1, p0}, LC8/X;-><init>(LD8/g;LC8/Y;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, v2}, LC8/Y;-><init>(LB8/n;Lw7/a;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
