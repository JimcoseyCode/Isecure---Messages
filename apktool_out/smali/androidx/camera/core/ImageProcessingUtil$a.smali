.class Landroidx/camera/core/ImageProcessingUtil$a;
.super Landroidx/camera/core/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/ImageProcessingUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private final j:[Landroidx/camera/core/o$a;

.field private final k:I

.field private final l:I


# direct methods
.method constructor <init>(Landroidx/camera/core/o;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;III)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/core/e;-><init>(Landroidx/camera/core/o;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p3, p4, p5}, Landroidx/camera/core/ImageProcessingUtil$a;->k(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/o$a;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Landroidx/camera/core/ImageProcessingUtil$a;->j:[Landroidx/camera/core/o$a;

    .line 9
    .line 10
    iput p5, p0, Landroidx/camera/core/ImageProcessingUtil$a;->k:I

    .line 11
    .line 12
    iput p6, p0, Landroidx/camera/core/ImageProcessingUtil$a;->l:I

    .line 13
    .line 14
    return-void
.end method

.method private k(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;I)[Landroidx/camera/core/o$a;
    .locals 1

    .line 1
    new-instance v0, Landroidx/camera/core/ImageProcessingUtil$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0, p4, p1}, Landroidx/camera/core/ImageProcessingUtil$a$a;-><init>(Landroidx/camera/core/ImageProcessingUtil$a;ILjava/nio/ByteBuffer;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Landroidx/camera/core/ImageProcessingUtil$b;

    .line 7
    .line 8
    invoke-direct {p1, p2, p4}, Landroidx/camera/core/ImageProcessingUtil$b;-><init>(Ljava/nio/ByteBuffer;I)V

    .line 9
    .line 10
    .line 11
    new-instance p2, Landroidx/camera/core/ImageProcessingUtil$b;

    .line 12
    .line 13
    invoke-direct {p2, p3, p4}, Landroidx/camera/core/ImageProcessingUtil$b;-><init>(Ljava/nio/ByteBuffer;I)V

    .line 14
    .line 15
    .line 16
    const/4 p3, 0x3

    .line 17
    new-array p3, p3, [Landroidx/camera/core/o$a;

    .line 18
    .line 19
    const/4 p4, 0x0

    .line 20
    aput-object v0, p3, p4

    .line 21
    .line 22
    const/4 p4, 0x1

    .line 23
    aput-object p1, p3, p4

    .line 24
    .line 25
    const/4 p1, 0x2

    .line 26
    aput-object p2, p3, p1

    .line 27
    .line 28
    return-object p3
.end method


# virtual methods
.method public getHeight()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public getWidth()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public p()[Landroidx/camera/core/o$a;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/camera/core/ImageProcessingUtil$a;->j:[Landroidx/camera/core/o$a;

    .line 2
    .line 3
    return-object v0
.end method
