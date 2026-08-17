.class public Lcom/canhub/cropper/CropImageView$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/canhub/cropper/CropImageView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final g:Landroid/graphics/Bitmap;

.field private final h:Landroid/net/Uri;

.field private final i:Landroid/graphics/Bitmap;

.field private final j:Landroid/net/Uri;

.field private final k:Ljava/lang/Exception;

.field private final l:[F

.field private final m:Landroid/graphics/Rect;

.field private final n:Landroid/graphics/Rect;

.field private final o:I

.field private final p:I


# direct methods
.method public constructor <init>(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/graphics/Bitmap;Landroid/net/Uri;Ljava/lang/Exception;[FLandroid/graphics/Rect;Landroid/graphics/Rect;II)V
    .locals 1

    .line 1
    const-string v0, "cropPoints"

    .line 2
    .line 3
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/canhub/cropper/CropImageView$c;->g:Landroid/graphics/Bitmap;

    .line 10
    .line 11
    iput-object p2, p0, Lcom/canhub/cropper/CropImageView$c;->h:Landroid/net/Uri;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/canhub/cropper/CropImageView$c;->i:Landroid/graphics/Bitmap;

    .line 14
    .line 15
    iput-object p4, p0, Lcom/canhub/cropper/CropImageView$c;->j:Landroid/net/Uri;

    .line 16
    .line 17
    iput-object p5, p0, Lcom/canhub/cropper/CropImageView$c;->k:Ljava/lang/Exception;

    .line 18
    .line 19
    iput-object p6, p0, Lcom/canhub/cropper/CropImageView$c;->l:[F

    .line 20
    .line 21
    iput-object p7, p0, Lcom/canhub/cropper/CropImageView$c;->m:Landroid/graphics/Rect;

    .line 22
    .line 23
    iput-object p8, p0, Lcom/canhub/cropper/CropImageView$c;->n:Landroid/graphics/Rect;

    .line 24
    .line 25
    iput p9, p0, Lcom/canhub/cropper/CropImageView$c;->o:I

    .line 26
    .line 27
    iput p10, p0, Lcom/canhub/cropper/CropImageView$c;->p:I

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public final a()[F
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->l:[F

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->m:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->k:Ljava/lang/Exception;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->h:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView$c;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/CropImageView$c;->p:I

    .line 2
    .line 3
    return v0
.end method

.method public final g()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->j:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Landroid/graphics/Rect;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/CropImageView$c;->n:Landroid/graphics/Rect;

    .line 2
    .line 3
    return-object v0
.end method
