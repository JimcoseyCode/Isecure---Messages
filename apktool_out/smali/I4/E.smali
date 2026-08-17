.class final LI4/E;
.super LI4/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field final synthetic j:LI4/F;


# direct methods
.method constructor <init>(LI4/F;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI4/E;->j:LI4/F;

    invoke-direct {p0, p1}, LI4/C;-><init>(LI4/D;)V

    return-void
.end method

.method public constructor <init>(LI4/F;I)V
    .locals 1

    .line 2
    iput-object p1, p0, LI4/E;->j:LI4/F;

    iget-object v0, p1, LI4/D;->h:Ljava/util/Collection;

    check-cast v0, Ljava/util/List;

    .line 3
    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, LI4/C;-><init>(LI4/D;Ljava/util/Iterator;)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/E;->j:LI4/F;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0}, LI4/C;->b()V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 11
    .line 12
    check-cast v1, Ljava/util/ListIterator;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, LI4/E;->j:LI4/F;

    .line 18
    .line 19
    iget-object p1, p1, LI4/F;->l:LI4/G;

    .line 20
    .line 21
    invoke-static {p1}, LI4/G;->i(LI4/G;)I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    invoke-static {p1, v1}, LI4/G;->m(LI4/G;I)V

    .line 28
    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, LI4/E;->j:LI4/F;

    .line 33
    .line 34
    invoke-virtual {p1}, LI4/D;->d()V

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method

.method public final hasPrevious()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final nextIndex()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    check-cast v0, Ljava/util/ListIterator;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
