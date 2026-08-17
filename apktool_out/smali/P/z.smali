.class public abstract LP/z;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


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

.method public static i(Landroid/graphics/Bitmap;LH/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)LP/z;
    .locals 9

    .line 1
    new-instance v0, LP/b;

    .line 2
    .line 3
    new-instance v4, Landroid/util/Size;

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    invoke-direct {v4, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 14
    .line 15
    .line 16
    const/16 v3, 0x2a

    .line 17
    .line 18
    move-object v1, p0

    .line 19
    move-object v2, p1

    .line 20
    move-object v5, p2

    .line 21
    move v6, p3

    .line 22
    move-object v7, p4

    .line 23
    move-object v8, p5

    .line 24
    invoke-direct/range {v0 .. v8}, LP/b;-><init>(Ljava/lang/Object;LH/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)V

    .line 25
    .line 26
    .line 27
    return-object v0
.end method

.method public static j(Landroidx/camera/core/o;LH/g;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)LP/z;
    .locals 7

    .line 1
    new-instance v2, Landroid/util/Size;

    .line 2
    .line 3
    invoke-interface {p0}, Landroidx/camera/core/o;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-interface {p0}, Landroidx/camera/core/o;->getHeight()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v2, v0, v1}, Landroid/util/Size;-><init>(II)V

    .line 12
    .line 13
    .line 14
    move-object v0, p0

    .line 15
    move-object v1, p1

    .line 16
    move-object v3, p2

    .line 17
    move v4, p3

    .line 18
    move-object v5, p4

    .line 19
    move-object v6, p5

    .line 20
    invoke-static/range {v0 .. v6}, LP/z;->k(Landroidx/camera/core/o;LH/g;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)LP/z;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static k(Landroidx/camera/core/o;LH/g;Landroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)LP/z;
    .locals 10

    .line 1
    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, LO/b;->i(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const-string v0, "JPEG image must have Exif."

    .line 12
    .line 13
    invoke-static {p1, v0}, LH0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    new-instance v1, LP/b;

    .line 17
    .line 18
    invoke-interface {p0}, Landroidx/camera/core/o;->getFormat()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-object v5, p2

    .line 25
    move-object v6, p3

    .line 26
    move v7, p4

    .line 27
    move-object v8, p5

    .line 28
    move-object/from16 v9, p6

    .line 29
    .line 30
    invoke-direct/range {v1 .. v9}, LP/b;-><init>(Ljava/lang/Object;LH/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)V

    .line 31
    .line 32
    .line 33
    return-object v1
.end method

.method public static l([BLH/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)LP/z;
    .locals 9

    .line 1
    new-instance v0, LP/b;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v3, p2

    .line 6
    move-object v4, p3

    .line 7
    move-object v5, p4

    .line 8
    move v6, p5

    .line 9
    move-object v7, p6

    .line 10
    move-object/from16 v8, p7

    .line 11
    .line 12
    invoke-direct/range {v0 .. v8}, LP/b;-><init>(Ljava/lang/Object;LH/g;ILandroid/util/Size;Landroid/graphics/Rect;ILandroid/graphics/Matrix;LF/B;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method


# virtual methods
.method public abstract a()LF/B;
.end method

.method public abstract b()Landroid/graphics/Rect;
.end method

.method public abstract c()Ljava/lang/Object;
.end method

.method public abstract d()LH/g;
.end method

.method public abstract e()I
.end method

.method public abstract f()I
.end method

.method public abstract g()Landroid/graphics/Matrix;
.end method

.method public abstract h()Landroid/util/Size;
.end method
