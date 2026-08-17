.class LI4/F;
.super LI4/D;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/List;


# instance fields
.field final synthetic l:LI4/G;


# direct methods
.method constructor <init>(LI4/G;Ljava/lang/Object;Ljava/util/List;LI4/D;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI4/F;->l:LI4/G;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, LI4/D;-><init>(LI4/G;Ljava/lang/Object;Ljava/util/Collection;LI4/D;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final add(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    iget-object v1, p0, LI4/D;->h:Ljava/util/Collection;

    .line 11
    .line 12
    check-cast v1, Ljava/util/List;

    .line 13
    .line 14
    invoke-interface {v1, p1, p2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LI4/F;->l:LI4/G;

    .line 18
    .line 19
    invoke-static {p1}, LI4/G;->i(LI4/G;)I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    add-int/lit8 p2, p2, 0x1

    .line 24
    .line 25
    invoke-static {p1, p2}, LI4/G;->m(LI4/G;I)V

    .line 26
    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-virtual {p0}, LI4/D;->d()V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final addAll(ILjava/util/Collection;)Z
    .locals 3

    .line 1
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-virtual {p0}, LI4/D;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, LI4/D;->h:Ljava/util/Collection;

    .line 14
    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v1, p1, p2}, Ljava/util/List;->addAll(ILjava/util/Collection;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, LI4/D;->h:Ljava/util/Collection;

    .line 24
    .line 25
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    iget-object v1, p0, LI4/F;->l:LI4/G;

    .line 30
    .line 31
    sub-int/2addr p2, v0

    .line 32
    invoke-static {v1}, LI4/G;->i(LI4/G;)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    add-int/2addr v2, p2

    .line 37
    invoke-static {v1, v2}, LI4/G;->m(LI4/G;I)V

    .line 38
    .line 39
    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    invoke-virtual {p0}, LI4/D;->d()V

    .line 43
    .line 44
    .line 45
    const/4 p1, 0x1

    .line 46
    :cond_1
    return p1
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final indexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final lastIndexOf(Ljava/lang/Object;)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->lastIndexOf(Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final listIterator()Ljava/util/ListIterator;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    new-instance v0, LI4/E;

    .line 2
    invoke-direct {v0, p0}, LI4/E;-><init>(LI4/F;)V

    return-object v0
.end method

.method public final listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 3
    invoke-virtual {p0}, LI4/D;->zzb()V

    new-instance v0, LI4/E;

    .line 4
    invoke-direct {v0, p0, p1}, LI4/E;-><init>(LI4/F;I)V

    return-object v0
.end method

.method public final remove(I)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object v0, p0, LI4/F;->l:LI4/G;

    .line 13
    .line 14
    invoke-static {v0}, LI4/G;->i(LI4/G;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/lit8 v1, v1, -0x1

    .line 19
    .line 20
    invoke-static {v0, v1}, LI4/G;->m(LI4/G;I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, LI4/D;->o()V

    .line 24
    .line 25
    .line 26
    return-object p1
.end method

.method public final set(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final subList(II)Ljava/util/List;
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/D;->zzb()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/D;->h:Ljava/util/Collection;

    .line 5
    .line 6
    check-cast v0, Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, Ljava/util/List;->subList(II)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iget-object p2, p0, LI4/D;->i:LI4/D;

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    move-object p2, p0

    .line 17
    :cond_0
    iget-object v0, p0, LI4/D;->g:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v1, p0, LI4/F;->l:LI4/G;

    .line 20
    .line 21
    invoke-virtual {v1, v0, p1, p2}, LI4/G;->k(Ljava/lang/Object;Ljava/util/List;LI4/D;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method
