.class public final Lexpo/modules/camera/utils/ImageDimensions;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c2\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u000f2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000bR\u0011\u0010\u0013\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u0014\u0010\u000b\u00a8\u0006\u001f"
    }
    d2 = {
        "Lexpo/modules/camera/utils/ImageDimensions;",
        "",
        "mWidth",
        "",
        "mHeight",
        "rotation",
        "facing",
        "Lexpo/modules/camera/records/CameraType;",
        "<init>",
        "(IIILexpo/modules/camera/records/CameraType;)V",
        "getRotation",
        "()I",
        "getFacing",
        "()Lexpo/modules/camera/records/CameraType;",
        "isLandscape",
        "",
        "()Z",
        "width",
        "getWidth",
        "height",
        "getHeight",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
        "expo-camera_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final facing:Lexpo/modules/camera/records/CameraType;

.field private final mHeight:I

.field private final mWidth:I

.field private final rotation:I


# direct methods
.method public constructor <init>(II)V
    .locals 7

    .line 1
    const/16 v5, 0xc

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    invoke-direct/range {v0 .. v6}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(III)V
    .locals 7

    .line 2
    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    invoke-direct/range {v0 .. v6}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIILexpo/modules/camera/records/CameraType;)V
    .locals 1

    const-string v0, "facing"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    iput p2, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    iput p3, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    iput-object p4, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    return-void
.end method

.method public synthetic constructor <init>(IIILexpo/modules/camera/records/CameraType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    .line 4
    sget-object p4, Lexpo/modules/camera/records/CameraType;->BACK:Lexpo/modules/camera/records/CameraType;

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;)V

    return-void
.end method

.method private final component1()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 2
    .line 3
    return v0
.end method

.method private final component2()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic copy$default(Lexpo/modules/camera/utils/ImageDimensions;IIILexpo/modules/camera/records/CameraType;ILjava/lang/Object;)Lexpo/modules/camera/utils/ImageDimensions;
    .locals 0

    .line 1
    and-int/lit8 p6, p5, 0x1

    .line 2
    .line 3
    if-eqz p6, :cond_0

    .line 4
    .line 5
    iget p1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x2

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    iget p2, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p6, p5, 0x4

    .line 14
    .line 15
    if-eqz p6, :cond_2

    .line 16
    .line 17
    iget p3, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p5, p5, 0x8

    .line 20
    .line 21
    if-eqz p5, :cond_3

    .line 22
    .line 23
    iget-object p4, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 24
    .line 25
    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;->copy(IIILexpo/modules/camera/records/CameraType;)Lexpo/modules/camera/utils/ImageDimensions;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method

.method private final isLandscape()Z
    .locals 2

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 2
    .line 3
    rem-int/lit16 v0, v0, 0xb4

    .line 4
    .line 5
    const/16 v1, 0x5a

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method


# virtual methods
.method public final component3()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 2
    .line 3
    return v0
.end method

.method public final component4()Lexpo/modules/camera/records/CameraType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(IIILexpo/modules/camera/records/CameraType;)Lexpo/modules/camera/utils/ImageDimensions;
    .locals 1

    .line 1
    const-string v0, "facing"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/camera/utils/ImageDimensions;

    .line 7
    .line 8
    invoke-direct {v0, p1, p2, p3, p4}, Lexpo/modules/camera/utils/ImageDimensions;-><init>(IIILexpo/modules/camera/records/CameraType;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/camera/utils/ImageDimensions;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/camera/utils/ImageDimensions;

    .line 12
    .line 13
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 14
    .line 15
    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 21
    .line 22
    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 28
    .line 29
    iget v3, p1, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 35
    .line 36
    iget-object p1, p1, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 37
    .line 38
    if-eq v1, p1, :cond_5

    .line 39
    .line 40
    return v2

    .line 41
    :cond_5
    return v0
.end method

.method public final getFacing()Lexpo/modules/camera/records/CameraType;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/utils/ImageDimensions;->isLandscape()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 11
    .line 12
    return v0
.end method

.method public final getRotation()I
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 2
    .line 3
    return v0
.end method

.method public final getWidth()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lexpo/modules/camera/utils/ImageDimensions;->isLandscape()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 8
    .line 9
    return v0

    .line 10
    :cond_0
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 11
    .line 12
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    mul-int/lit8 v0, v0, 0x1f

    .line 17
    .line 18
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 19
    .line 20
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    add-int/2addr v0, v1

    .line 25
    mul-int/lit8 v0, v0, 0x1f

    .line 26
    .line 27
    iget-object v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    add-int/2addr v0, v1

    .line 34
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lexpo/modules/camera/utils/ImageDimensions;->mWidth:I

    .line 2
    .line 3
    iget v1, p0, Lexpo/modules/camera/utils/ImageDimensions;->mHeight:I

    .line 4
    .line 5
    iget v2, p0, Lexpo/modules/camera/utils/ImageDimensions;->rotation:I

    .line 6
    .line 7
    iget-object v3, p0, Lexpo/modules/camera/utils/ImageDimensions;->facing:Lexpo/modules/camera/records/CameraType;

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v5, "ImageDimensions(mWidth="

    .line 15
    .line 16
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string v0, ", mHeight="

    .line 23
    .line 24
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, ", rotation="

    .line 31
    .line 32
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v0, ", facing="

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ")"

    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0
.end method
