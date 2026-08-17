.class public final Lcom/canhub/cropper/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR8/N;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/b$a;
    }
.end annotation


# instance fields
.field private final g:Landroid/content/Context;

.field private final h:Landroid/net/Uri;

.field private final i:I

.field private final j:I

.field private final k:Ljava/lang/ref/WeakReference;

.field private l:LR8/A0;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/canhub/cropper/CropImageView;Landroid/net/Uri;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cropImageView"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "uri"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/canhub/cropper/b;->g:Landroid/content/Context;

    .line 20
    .line 21
    iput-object p3, p0, Lcom/canhub/cropper/b;->h:Landroid/net/Uri;

    .line 22
    .line 23
    new-instance p1, Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object p1, p0, Lcom/canhub/cropper/b;->k:Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    const/4 p3, 0x1

    .line 32
    invoke-static {p1, p3, p1}, LR8/D0;->b(LR8/A0;ILjava/lang/Object;)LR8/z;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iput-object p1, p0, Lcom/canhub/cropper/b;->l:LR8/A0;

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    iget p2, p1, Landroid/util/DisplayMetrics;->density:F

    .line 47
    .line 48
    const/high16 p3, 0x3f800000    # 1.0f

    .line 49
    .line 50
    cmpl-float p3, p2, p3

    .line 51
    .line 52
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 53
    .line 54
    if-lez p3, :cond_0

    .line 55
    .line 56
    float-to-double p2, p2

    .line 57
    div-double/2addr v0, p2

    .line 58
    :cond_0
    iget p2, p1, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 59
    .line 60
    int-to-double p2, p2

    .line 61
    mul-double/2addr p2, v0

    .line 62
    double-to-int p2, p2

    .line 63
    iput p2, p0, Lcom/canhub/cropper/b;->i:I

    .line 64
    .line 65
    iget p1, p1, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 66
    .line 67
    int-to-double p1, p1

    .line 68
    mul-double/2addr p1, v0

    .line 69
    double-to-int p1, p1

    .line 70
    iput p1, p0, Lcom/canhub/cropper/b;->j:I

    .line 71
    .line 72
    return-void
.end method

.method public static final synthetic a(Lcom/canhub/cropper/b;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/b;->g:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(Lcom/canhub/cropper/b;)Ljava/lang/ref/WeakReference;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/canhub/cropper/b;->k:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic c(Lcom/canhub/cropper/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/b;->j:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic d(Lcom/canhub/cropper/b;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/canhub/cropper/b;->i:I

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(Lcom/canhub/cropper/b;Lcom/canhub/cropper/b$a;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/canhub/cropper/b;->h(Lcom/canhub/cropper/b$a;Ln7/f;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final h(Lcom/canhub/cropper/b$a;Ln7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, LR8/d0;->c()LR8/K0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lcom/canhub/cropper/b$b;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v1, p0, p1, v2}, Lcom/canhub/cropper/b$b;-><init>(Lcom/canhub/cropper/b;Lcom/canhub/cropper/b$a;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, p2}, LR8/i;->g(Ln7/j;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p2

    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 23
    .line 24
    return-object p1
.end method


# virtual methods
.method public final f()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/b;->l:LR8/A0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    invoke-static {v0, v1, v2, v1}, LR8/A0$a;->a(LR8/A0;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final g()Landroid/net/Uri;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/b;->h:Landroid/net/Uri;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Ln7/j;
    .locals 2

    .line 1
    invoke-static {}, LR8/d0;->c()LR8/K0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/canhub/cropper/b;->l:LR8/A0;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ln7/a;->X(Ln7/j;)Ln7/j;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public final j()V
    .locals 6

    .line 1
    invoke-static {}, LR8/d0;->a()LR8/J;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    new-instance v3, Lcom/canhub/cropper/b$c;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {v3, p0, v0}, Lcom/canhub/cropper/b$c;-><init>(Lcom/canhub/cropper/b;Ln7/f;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x2

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    move-object v0, p0

    .line 15
    invoke-static/range {v0 .. v5}, LR8/i;->d(LR8/N;Ln7/j;LR8/P;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LR8/A0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    iput-object v1, v0, Lcom/canhub/cropper/b;->l:LR8/A0;

    .line 20
    .line 21
    return-void
.end method
