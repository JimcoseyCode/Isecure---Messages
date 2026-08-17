.class final LL7/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/m0;


# instance fields
.field private final g:LL7/m0;

.field private final h:LL7/m;

.field private final i:I


# direct methods
.method public constructor <init>(LL7/m0;LL7/m;I)V
    .locals 1

    .line 1
    const-string v0, "originalDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "declarationDescriptor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LL7/c;->g:LL7/m0;

    .line 15
    .line 16
    iput-object p2, p0, LL7/c;->h:LL7/m;

    .line 17
    .line 18
    iput p3, p0, LL7/c;->i:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public E()Z
    .locals 1

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/m0;->E()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LL7/m;->E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic a()LL7/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LL7/c;->a()LL7/m0;

    move-result-object v0

    return-object v0
.end method

.method public a()LL7/m0;
    .locals 2

    .line 3
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    invoke-interface {v0}, LL7/m0;->a()LL7/m0;

    move-result-object v0

    const-string v1, "getOriginal(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic a()LL7/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LL7/c;->a()LL7/m0;

    move-result-object v0

    return-object v0
.end method

.method public b()LL7/m;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/c;->h:LL7/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public c0()LB8/n;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/m0;->c0()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getStorageManager(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public g()LL7/h0;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/p;->g()LL7/h0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getSource(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LM7/a;->getAnnotations()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getIndex()I
    .locals 2

    .line 1
    iget v0, p0, LL7/c;->i:I

    .line 2
    .line 3
    iget-object v1, p0, LL7/c;->g:LL7/m0;

    .line 4
    .line 5
    invoke-interface {v1}, LL7/m0;->getIndex()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method public getName()Lk8/f;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/J;->getName()Lk8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getName(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getUpperBounds()Ljava/util/List;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/m0;->getUpperBounds()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getUpperBounds(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public j()LC8/v0;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/m0;->j()LC8/v0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getTypeConstructor(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public j0()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public m()LC8/N0;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/m0;->m()LC8/N0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getVariance(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public r()LC8/d0;
    .locals 2

    .line 1
    iget-object v0, p0, LL7/c;->g:LL7/m0;

    .line 2
    .line 3
    invoke-interface {v0}, LL7/h;->r()LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "getDefaultType(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LL7/c;->g:LL7/m0;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, "[inner-copy]"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method
