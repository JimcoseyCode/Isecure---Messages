.class final LR8/s;
.super LR8/F0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field public final k:LR8/o;


# direct methods
.method public constructor <init>(LR8/o;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/F0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/s;->k:LR8/o;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
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
    iget-object p1, p0, LR8/s;->k:LR8/o;

    .line 2
    .line 3
    invoke-virtual {p0}, LR8/F0;->u()LR8/G0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p1, v0}, LR8/o;->x(LR8/A0;)Ljava/lang/Throwable;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p1, v0}, LR8/o;->M(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
