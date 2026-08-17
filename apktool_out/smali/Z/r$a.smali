.class public abstract LZ/r$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZ/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract a()LZ/r;
.end method

.method public b(LH0/a;)LZ/r$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LZ/r$a;->c()LZ/z0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, LZ/z0;->f()LZ/z0$a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, v0}, LH0/a;->accept(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, LZ/z0$a;->a()LZ/z0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, LZ/r$a;->f(LZ/z0;)LZ/r$a;

    .line 17
    .line 18
    .line 19
    return-object p0
.end method

.method abstract c()LZ/z0;
.end method

.method public abstract d(LZ/a;)LZ/r$a;
.end method

.method public abstract e(I)LZ/r$a;
.end method

.method public abstract f(LZ/z0;)LZ/r$a;
.end method
