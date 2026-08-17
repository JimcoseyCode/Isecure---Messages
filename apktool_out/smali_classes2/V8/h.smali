.class public final LV8/h;
.super LV8/g;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public constructor <init>(LU8/b;Ln7/j;ILT8/a;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2, p3, p4}, LV8/g;-><init>(LU8/b;Ln7/j;ILT8/a;)V

    return-void
.end method

.method public synthetic constructor <init>(LU8/b;Ln7/j;ILT8/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, Ln7/k;->g:Ln7/k;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LT8/a;->g:LT8/a;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LV8/h;-><init>(LU8/b;Ln7/j;ILT8/a;)V

    return-void
.end method


# virtual methods
.method protected g(Ln7/j;ILT8/a;)LV8/e;
    .locals 2

    .line 1
    new-instance v0, LV8/h;

    .line 2
    .line 3
    iget-object v1, p0, LV8/g;->j:LU8/b;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1, p2, p3}, LV8/h;-><init>(LU8/b;Ln7/j;ILT8/a;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method protected n(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LV8/g;->j:LU8/b;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LU8/b;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    if-ne p1, p2, :cond_0

    .line 12
    .line 13
    return-object p1

    .line 14
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 15
    .line 16
    return-object p1
.end method
