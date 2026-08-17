.class Lcom/facebook/imagepipeline/producers/L$a;
.super Lcom/facebook/imagepipeline/producers/m0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/imagepipeline/producers/L;->b(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic l:Lcom/facebook/imagepipeline/request/b;

.field final synthetic m:Lcom/facebook/imagepipeline/producers/g0;

.field final synthetic n:Lcom/facebook/imagepipeline/producers/e0;

.field final synthetic o:Lcom/facebook/imagepipeline/producers/L;


# direct methods
.method constructor <init>(Lcom/facebook/imagepipeline/producers/L;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Lcom/facebook/imagepipeline/request/b;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/L$a;->o:Lcom/facebook/imagepipeline/producers/L;

    .line 2
    .line 3
    iput-object p6, p0, Lcom/facebook/imagepipeline/producers/L$a;->l:Lcom/facebook/imagepipeline/request/b;

    .line 4
    .line 5
    iput-object p7, p0, Lcom/facebook/imagepipeline/producers/L$a;->m:Lcom/facebook/imagepipeline/producers/g0;

    .line 6
    .line 7
    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 8
    .line 9
    invoke-direct {p0, p2, p3, p4, p5}, Lcom/facebook/imagepipeline/producers/m0;-><init>(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/g0;Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method protected bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ld3/k;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/facebook/imagepipeline/producers/L$a;->j(Ld3/k;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method protected bridge synthetic c()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/L$a;->k()Ld3/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected j(Ld3/k;)V
    .locals 0

    .line 1
    invoke-static {p1}, Ld3/k;->k(Ld3/k;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method protected k()Ld3/k;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/L$a;->o:Lcom/facebook/imagepipeline/producers/L;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/L$a;->l:Lcom/facebook/imagepipeline/request/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/facebook/imagepipeline/producers/L;->d(Lcom/facebook/imagepipeline/request/b;)Ld3/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "fetch"

    .line 10
    .line 11
    const-string v2, "local"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/L$a;->m:Lcom/facebook/imagepipeline/producers/g0;

    .line 16
    .line 17
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 18
    .line 19
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/L$a;->o:Lcom/facebook/imagepipeline/producers/L;

    .line 20
    .line 21
    invoke-virtual {v4}, Lcom/facebook/imagepipeline/producers/L;->f()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-interface {v0, v3, v4, v5}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 30
    .line 31
    invoke-interface {v0, v2, v1}, Lcom/facebook/imagepipeline/producers/e0;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    return-object v0

    .line 36
    :cond_0
    invoke-virtual {v0}, Ld3/k;->w0()V

    .line 37
    .line 38
    .line 39
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/L$a;->m:Lcom/facebook/imagepipeline/producers/g0;

    .line 40
    .line 41
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 42
    .line 43
    iget-object v5, p0, Lcom/facebook/imagepipeline/producers/L$a;->o:Lcom/facebook/imagepipeline/producers/L;

    .line 44
    .line 45
    invoke-virtual {v5}, Lcom/facebook/imagepipeline/producers/L;->f()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const/4 v6, 0x1

    .line 50
    invoke-interface {v3, v4, v5, v6}, Lcom/facebook/imagepipeline/producers/g0;->c(Lcom/facebook/imagepipeline/producers/e0;Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    iget-object v3, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 54
    .line 55
    invoke-interface {v3, v2, v1}, Lcom/facebook/imagepipeline/producers/e0;->r(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/L$a;->n:Lcom/facebook/imagepipeline/producers/e0;

    .line 59
    .line 60
    const-string v2, "image_color_space"

    .line 61
    .line 62
    invoke-virtual {v0}, Ld3/k;->A()Landroid/graphics/ColorSpace;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    invoke-interface {v1, v2, v3}, LM2/a;->J(Ljava/lang/String;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    return-object v0
.end method
