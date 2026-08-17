.class final LR8/u;
.super LR8/F0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR8/t;


# instance fields
.field public final k:LR8/v;


# direct methods
.method public constructor <init>(LR8/v;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/F0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/u;->k:LR8/v;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getParent()LR8/A0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LR8/F0;->u()LR8/G0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public j(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LR8/F0;->u()LR8/G0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, LR8/G0;->F(Ljava/lang/Throwable;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object p1, p0, LR8/u;->k:LR8/v;

    .line 2
    .line 3
    invoke-virtual {p0}, LR8/F0;->u()LR8/G0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {p1, v0}, LR8/v;->d0(LR8/P0;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
