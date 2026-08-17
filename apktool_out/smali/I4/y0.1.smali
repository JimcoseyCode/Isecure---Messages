.class final LI4/y0;
.super LI4/k0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final transient i:LI4/j0;

.field private final transient j:LI4/h0;


# direct methods
.method constructor <init>(LI4/j0;LI4/h0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LI4/k0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LI4/y0;->i:LI4/j0;

    .line 5
    .line 6
    iput-object p2, p0, LI4/y0;->j:LI4/h0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LI4/y0;->i:LI4/j0;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI4/j0;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v0, p0, LI4/y0;->j:LI4/h0;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LI4/c0;->d([Ljava/lang/Object;I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-object v0, p0, LI4/y0;->j:LI4/h0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {v0, v1}, LI4/h0;->u(I)LI4/F0;

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
    const/4 v0, 0x1

    .line 2
    return v0
.end method
