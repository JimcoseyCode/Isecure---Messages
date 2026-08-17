.class public Lm8/w;
.super Ljava/util/AbstractList;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/RandomAccess;
.implements Lm8/n;


# instance fields
.field private final g:Lm8/n;


# direct methods
.method public constructor <init>(Lm8/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8/w;->g:Lm8/n;

    .line 5
    .line 6
    return-void
.end method

.method static synthetic d(Lm8/w;)Lm8/n;
    .locals 0

    .line 1
    iget-object p0, p0, Lm8/w;->g:Lm8/n;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public g()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/w;->g:Lm8/n;

    .line 2
    .line 3
    invoke-interface {v0}, Lm8/n;->g()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lm8/w;->o(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public i(Lm8/d;)V
    .locals 0

    .line 1
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Lm8/w$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lm8/w$b;-><init>(Lm8/w;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public j(I)Lm8/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/w;->g:Lm8/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lm8/n;->j(I)Lm8/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public k()Lm8/n;
    .locals 0

    .line 1
    return-object p0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1

    .line 1
    new-instance v0, Lm8/w$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lm8/w$a;-><init>(Lm8/w;I)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public o(I)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/w;->g:Lm8/n;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/String;

    .line 8
    .line 9
    return-object p1
.end method

.method public size()I
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/w;->g:Lm8/n;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
