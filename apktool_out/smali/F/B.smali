.class public interface abstract LF/B;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/B$a;
    }
.end annotation


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()LF/u1;
.end method

.method public abstract c()LF/A;
.end method

.method public d(LH/i$b;)V
    .locals 1

    .line 1
    invoke-interface {p0}, LF/B;->c()LF/A;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1, v0}, LH/i$b;->g(LF/A;)LH/i$b;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract e()LF/z;
.end method

.method public abstract f()LF/y;
.end method

.method public abstract g()LF/w;
.end method

.method public abstract h()LF/v;
.end method

.method public i()Landroid/hardware/camera2/CaptureResult;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public abstract j()LF/u;
.end method

.method public abstract k()LF/x;
.end method
