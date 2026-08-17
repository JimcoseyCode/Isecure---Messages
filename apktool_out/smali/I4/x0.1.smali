.class final LI4/x0;
.super LI4/k0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final transient i:LI4/j0;

.field private final transient j:[Ljava/lang/Object;

.field private final transient k:I


# direct methods
.method constructor <init>(LI4/j0;[Ljava/lang/Object;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, LI4/k0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/x0;->i:LI4/j0;

    .line 5
    .line 6
    iput-object p2, p0, LI4/x0;->j:[Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x1

    .line 9
    iput p1, p0, LI4/x0;->k:I

    .line 10
    .line 11
    return-void
.end method

.method static bridge synthetic t(LI4/x0;)I
    .locals 0

    .line 1
    iget p0, p0, LI4/x0;->k:I

    .line 2
    .line 3
    return p0
.end method

.method static bridge synthetic u(LI4/x0;)[Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, LI4/x0;->j:[Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/util/Map$Entry;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Ljava/util/Map$Entry;

    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object v2, p0, LI4/x0;->i:LI4/j0;

    .line 19
    .line 20
    invoke-virtual {v2, v0}, LI4/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    return p1

    .line 32
    :cond_0
    return v1
.end method

.method final d([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    invoke-virtual {p0}, LI4/k0;->r()LI4/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, LI4/c0;->d([Ljava/lang/Object;I)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/k0;->r()LI4/h0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, LI4/h0;->u(I)LI4/F0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method

.method final s()LI4/h0;
    .locals 1

    .line 1
    new-instance v0, LI4/w0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LI4/w0;-><init>(LI4/x0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, LI4/x0;->k:I

    .line 2
    .line 3
    return v0
.end method
