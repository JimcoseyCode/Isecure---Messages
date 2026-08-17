.class final LR8/h0;
.super LR8/F0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final k:LR8/f0;


# direct methods
.method public constructor <init>(LR8/f0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/F0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/h0;->k:LR8/f0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget-object p1, p0, LR8/h0;->k:LR8/f0;

    .line 2
    .line 3
    invoke-interface {p1}, LR8/f0;->dispose()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
