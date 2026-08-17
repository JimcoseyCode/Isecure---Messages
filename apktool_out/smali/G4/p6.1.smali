.class final LG4/p6;
.super LG4/C6;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field final transient j:I

.field final transient k:I

.field final synthetic l:LG4/C6;


# direct methods
.method constructor <init>(LG4/C6;II)V
    .locals 0

    .line 1
    iput-object p1, p0, LG4/p6;->l:LG4/C6;

    .line 2
    .line 3
    invoke-direct {p0}, LG4/C6;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, LG4/p6;->j:I

    .line 7
    .line 8
    iput p3, p0, LG4/p6;->k:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final get(I)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, LG4/p6;->k:I

    .line 2
    .line 3
    const-string v1, "index"

    .line 4
    .line 5
    invoke-static {p1, v0, v1}, LG4/G1;->a(IILjava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LG4/p6;->l:LG4/C6;

    .line 9
    .line 10
    iget v1, p0, LG4/p6;->j:I

    .line 11
    .line 12
    add-int/2addr p1, v1

    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method final o()I
    .locals 2

    .line 1
    iget-object v0, p0, LG4/p6;->l:LG4/C6;

    .line 2
    .line 3
    invoke-virtual {v0}, LG4/M4;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LG4/p6;->j:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    iget v1, p0, LG4/p6;->k:I

    .line 11
    .line 12
    add-int/2addr v0, v1

    .line 13
    return v0
.end method

.method final p()I
    .locals 2

    .line 1
    iget-object v0, p0, LG4/p6;->l:LG4/C6;

    .line 2
    .line 3
    invoke-virtual {v0}, LG4/M4;->p()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, LG4/p6;->j:I

    .line 8
    .line 9
    add-int/2addr v0, v1

    .line 10
    return v0
.end method

.method final q()[Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LG4/p6;->l:LG4/C6;

    .line 2
    .line 3
    invoke-virtual {v0}, LG4/M4;->q()[Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final r(II)LG4/C6;
    .locals 2

    .line 1
    iget v0, p0, LG4/p6;->k:I

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, LG4/G1;->c(III)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LG4/p6;->l:LG4/C6;

    .line 7
    .line 8
    iget v1, p0, LG4/p6;->j:I

    .line 9
    .line 10
    add-int/2addr p1, v1

    .line 11
    add-int/2addr p2, v1

    .line 12
    invoke-virtual {v0, p1, p2}, LG4/C6;->r(II)LG4/C6;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LG4/p6;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LG4/C6;->r(II)LG4/C6;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
