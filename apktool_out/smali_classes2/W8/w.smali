.class public final LW8/w;
.super LR8/J;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR8/X;


# instance fields
.field private final synthetic i:LR8/X;

.field private final j:LR8/J;

.field private final k:Ljava/lang/String;


# direct methods
.method public constructor <init>(LR8/J;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, LR8/J;-><init>()V

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, LR8/X;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    move-object v0, p1

    .line 9
    check-cast v0, LR8/X;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-static {}, LR8/U;->a()LR8/X;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_1
    iput-object v0, p0, LW8/w;->i:LR8/X;

    .line 20
    .line 21
    iput-object p1, p0, LW8/w;->j:LR8/J;

    .line 22
    .line 23
    iput-object p2, p0, LW8/w;->k:Ljava/lang/String;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public D0(JLjava/lang/Runnable;Ln7/j;)LR8/f0;
    .locals 1

    .line 1
    iget-object v0, p0, LW8/w;->i:LR8/X;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3, p4}, LR8/X;->D0(JLjava/lang/Runnable;Ln7/j;)LR8/f0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public J0(Ln7/j;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW8/w;->j:LR8/J;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LR8/J;->J0(Ln7/j;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public K0(Ln7/j;Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW8/w;->j:LR8/J;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LR8/J;->K0(Ln7/j;Ljava/lang/Runnable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public L0(Ln7/j;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LW8/w;->j:LR8/J;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/J;->L0(Ln7/j;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LW8/w;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
