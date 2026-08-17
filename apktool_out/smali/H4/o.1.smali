.class final LH4/o;
.super LH4/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final transient i:LH4/i;

.field private final transient j:LH4/f;


# direct methods
.method constructor <init>(LH4/i;LH4/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LH4/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH4/o;->i:LH4/i;

    .line 5
    .line 6
    iput-object p2, p0, LH4/o;->j:LH4/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LH4/o;->i:LH4/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LH4/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method final d([Ljava/lang/Object;I)I
    .locals 1

    .line 1
    iget-object p2, p0, LH4/o;->j:LH4/f;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-virtual {p2, p1, v0}, LH4/c;->d([Ljava/lang/Object;I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, LH4/o;->j:LH4/f;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LH4/f;->v(I)LH4/t;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 1
    iget-object v0, p0, LH4/o;->i:LH4/i;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
