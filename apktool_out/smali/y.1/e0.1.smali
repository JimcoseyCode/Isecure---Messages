.class public abstract Ly/e0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/Y;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static f(LF/u1;JILandroid/graphics/Matrix;I)Ly/Y;
    .locals 7

    .line 1
    new-instance v0, Ly/d;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-wide v2, p1

    .line 5
    move v4, p3

    .line 6
    move-object v5, p4

    .line 7
    move v6, p5

    .line 8
    invoke-direct/range {v0 .. v6}, Ly/d;-><init>(LF/u1;JILandroid/graphics/Matrix;I)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()LF/u1;
.end method

.method public abstract c()I
.end method

.method public d(LH/i$b;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly/e0;->e()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, LH/i$b;->m(I)LH/i$b;

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public abstract e()I
.end method

.method public abstract g()Landroid/graphics/Matrix;
.end method
