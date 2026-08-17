.class public interface abstract Lg0/s0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lg0/g0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg0/s0$a;
    }
.end annotation


# virtual methods
.method public a(II)Z
    .locals 1

    .line 1
    invoke-interface {p0, p1, p2}, Lg0/s0;->i(II)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-interface {p0}, Lg0/s0;->d()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0, p2, p1}, Lg0/s0;->i(II)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public abstract b()I
.end method

.method public abstract c()Landroid/util/Range;
.end method

.method public abstract d()Z
.end method

.method public abstract e(I)Landroid/util/Range;
.end method

.method public abstract f(I)Landroid/util/Range;
.end method

.method public abstract g()I
.end method

.method public abstract h()Landroid/util/Range;
.end method

.method public abstract i(II)Z
.end method

.method public abstract j()Landroid/util/Range;
.end method
