.class public LZ2/c;
.super LZ2/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method private constructor <init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;Lf3/d;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LZ2/a;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;Lf3/d;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static F(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;Lf3/d;)Lm2/c;
    .locals 1

    .line 1
    invoke-static {}, Lj3/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "CloseableProducerToDataSourceAdapter#create"

    .line 8
    .line 9
    invoke-static {v0}, Lj3/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, LZ2/c;

    .line 13
    .line 14
    invoke-direct {v0, p0, p1, p2}, LZ2/c;-><init>(Lcom/facebook/imagepipeline/producers/d0;Lcom/facebook/imagepipeline/producers/l0;Lf3/d;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lj3/b;->d()Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    invoke-static {}, Lj3/b;->b()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-object v0
.end method


# virtual methods
.method protected bridge synthetic D(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    check-cast p1, Lg2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, LZ2/c;->H(Lg2/a;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected E(Lg2/a;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lg2/a;->B(Lg2/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public G()Lg2/a;
    .locals 1

    .line 1
    invoke-super {p0}, Lm2/a;->getResult()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lg2/a;

    .line 6
    .line 7
    invoke-static {v0}, Lg2/a;->r(Lg2/a;)Lg2/a;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method protected H(Lg2/a;ILcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lg2/a;->r(Lg2/a;)Lg2/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-super {p0, p1, p2, p3}, LZ2/a;->D(Ljava/lang/Object;ILcom/facebook/imagepipeline/producers/e0;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method protected bridge synthetic f(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lg2/a;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LZ2/c;->E(Lg2/a;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public bridge synthetic getResult()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ2/c;->G()Lg2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
