.class LI4/C;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field final g:Ljava/util/Iterator;

.field final h:Ljava/util/Collection;

.field final synthetic i:LI4/D;


# direct methods
.method constructor <init>(LI4/D;)V
    .locals 1

    .line 2
    iput-object p1, p0, LI4/C;->i:LI4/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LI4/D;->h:Ljava/util/Collection;

    iput-object p1, p0, LI4/C;->h:Ljava/util/Collection;

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->listIterator()Ljava/util/ListIterator;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 5
    :goto_0
    iput-object p1, p0, LI4/C;->g:Ljava/util/Iterator;

    return-void
.end method

.method constructor <init>(LI4/D;Ljava/util/Iterator;)V
    .locals 0

    .line 1
    iput-object p1, p0, LI4/C;->i:LI4/D;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iget-object p1, p1, LI4/D;->h:Ljava/util/Collection;

    iput-object p1, p0, LI4/C;->h:Ljava/util/Collection;

    iput-object p2, p0, LI4/C;->g:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method final b()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/C;->i:LI4/D;

    .line 2
    .line 3
    invoke-virtual {v0}, LI4/D;->zzb()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI4/C;->i:LI4/D;

    .line 7
    .line 8
    iget-object v0, v0, LI4/D;->h:Ljava/util/Collection;

    .line 9
    .line 10
    iget-object v1, p0, LI4/C;->h:Ljava/util/Collection;

    .line 11
    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    .line 18
    .line 19
    .line 20
    throw v0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/C;->b()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/C;->g:Ljava/util/Iterator;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LI4/C;->i:LI4/D;

    .line 7
    .line 8
    iget-object v0, v0, LI4/D;->k:LI4/G;

    .line 9
    .line 10
    invoke-static {v0}, LI4/G;->i(LI4/G;)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    invoke-static {v0, v1}, LI4/G;->m(LI4/G;I)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LI4/C;->i:LI4/D;

    .line 20
    .line 21
    invoke-virtual {v0}, LI4/D;->o()V

    .line 22
    .line 23
    .line 24
    return-void
.end method
