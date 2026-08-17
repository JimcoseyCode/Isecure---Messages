.class public abstract LO8/k;
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


# virtual methods
.method public abstract c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
.end method

.method public final e(LO8/i;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1, p2}, LO8/k;->i(Ljava/util/Iterator;Ln7/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 17
    .line 18
    return-object p1
.end method

.method public abstract i(Ljava/util/Iterator;Ln7/f;)Ljava/lang/Object;
.end method
