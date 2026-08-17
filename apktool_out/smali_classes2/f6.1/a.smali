.class public Lf6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf6/a$l;,
        Lf6/a$k;,
        Lf6/a$j;,
        Lf6/a$g;,
        Lf6/a$d;,
        Lf6/a$f;,
        Lf6/a$i;,
        Lf6/a$h;,
        Lf6/a$e;,
        Lf6/a$c;,
        Lf6/a$b;,
        Lf6/a$a;
    }
.end annotation


# instance fields
.field private final a:Lg6/a;

.field private final b:Landroid/graphics/Rect;

.field private final c:[Landroid/graphics/Point;


# direct methods
.method public constructor <init>(Lg6/a;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lf6/a;-><init>(Lg6/a;Landroid/graphics/Matrix;)V

    return-void
.end method

.method public constructor <init>(Lg6/a;Landroid/graphics/Matrix;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg6/a;

    iput-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 3
    invoke-interface {p1}, Lg6/a;->c()Landroid/graphics/Rect;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p2, :cond_0

    .line 4
    invoke-static {v0, p2}, Ll6/b;->c(Landroid/graphics/Rect;Landroid/graphics/Matrix;)V

    :cond_0
    iput-object v0, p0, Lf6/a;->b:Landroid/graphics/Rect;

    .line 5
    invoke-interface {p1}, Lg6/a;->k()[Landroid/graphics/Point;

    move-result-object p1

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    .line 6
    invoke-static {p1, p2}, Ll6/b;->b([Landroid/graphics/Point;Landroid/graphics/Matrix;)V

    :cond_1
    iput-object p1, p0, Lf6/a;->c:[Landroid/graphics/Point;

    return-void
.end method


# virtual methods
.method public a()Lf6/a$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->e()Lf6/a$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public b()Lf6/a$d;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->h()Lf6/a$d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()[Landroid/graphics/Point;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->c:[Landroid/graphics/Point;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->i()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public e()Lf6/a$e;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->b()Lf6/a$e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public f()Lf6/a$f;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->l()Lf6/a$f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public g()I
    .locals 3

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->getFormat()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1000

    .line 8
    .line 9
    const/4 v2, -0x1

    .line 10
    if-gt v0, v1, :cond_1

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    return v2

    .line 15
    :cond_0
    return v0

    .line 16
    :cond_1
    return v2
.end method

.method public h()Lf6/a$g;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->m()Lf6/a$g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i()Lf6/a$i;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->a()Lf6/a$i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public j()[B
    .locals 2

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->j()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    array-length v1, v0

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return-object v0
.end method

.method public k()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public l()Lf6/a$j;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->g()Lf6/a$j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public m()Lf6/a$k;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->getUrl()Lf6/a$k;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public n()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->f()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public o()Lf6/a$l;
    .locals 1

    .line 1
    iget-object v0, p0, Lf6/a;->a:Lg6/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lg6/a;->n()Lf6/a$l;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
