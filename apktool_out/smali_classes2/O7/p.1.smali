.class public final LO7/p;
.super LO7/H;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>(LL7/H;Lk8/c;)V
    .locals 1

    .line 1
    const-string v0, "module"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fqName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, LO7/H;-><init>(LL7/H;Lk8/c;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public C0()Lv8/k$b;
    .locals 1

    .line 1
    sget-object v0, Lv8/k$b;->b:Lv8/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic o()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/p;->C0()Lv8/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
