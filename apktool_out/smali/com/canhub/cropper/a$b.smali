.class final Lcom/canhub/cropper/a$b;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/a;->w(Lcom/canhub/cropper/a$a;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field private synthetic h:Ljava/lang/Object;

.field final synthetic i:Lcom/canhub/cropper/a;

.field final synthetic j:Lcom/canhub/cropper/a$a;


# direct methods
.method constructor <init>(Lcom/canhub/cropper/a;Lcom/canhub/cropper/a$a;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/a$b;->i:Lcom/canhub/cropper/a;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/canhub/cropper/a$b;->j:Lcom/canhub/cropper/a$a;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3

    .line 1
    new-instance v0, Lcom/canhub/cropper/a$b;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/a$b;->i:Lcom/canhub/cropper/a;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/canhub/cropper/a$b;->j:Lcom/canhub/cropper/a$a;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Lcom/canhub/cropper/a$b;-><init>(Lcom/canhub/cropper/a;Lcom/canhub/cropper/a$a;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Lcom/canhub/cropper/a$b;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/a$b;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/a$b;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/a$b;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/canhub/cropper/a$b;->g:I

    .line 5
    .line 6
    if-nez v0, :cond_2

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lcom/canhub/cropper/a$b;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LR8/N;

    .line 14
    .line 15
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 16
    .line 17
    invoke-direct {v0}, Lkotlin/jvm/internal/z;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, LR8/O;->e(LR8/N;)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, Lcom/canhub/cropper/a$b;->i:Lcom/canhub/cropper/a;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/canhub/cropper/a;->e(Lcom/canhub/cropper/a;)Ljava/lang/ref/WeakReference;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    check-cast p1, Lcom/canhub/cropper/CropImageView;

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/canhub/cropper/a$b;->j:Lcom/canhub/cropper/a$a;

    .line 41
    .line 42
    const/4 v2, 0x1

    .line 43
    iput-boolean v2, v0, Lkotlin/jvm/internal/z;->g:Z

    .line 44
    .line 45
    invoke-virtual {p1, v1}, Lcom/canhub/cropper/CropImageView;->k(Lcom/canhub/cropper/a$a;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-boolean p1, v0, Lkotlin/jvm/internal/z;->g:Z

    .line 49
    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    iget-object p1, p0, Lcom/canhub/cropper/a$b;->j:Lcom/canhub/cropper/a$a;

    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_1

    .line 59
    .line 60
    iget-object p1, p0, Lcom/canhub/cropper/a$b;->j:Lcom/canhub/cropper/a$a;

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/canhub/cropper/a$a;->a()Landroid/graphics/Bitmap;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    .line 67
    .line 68
    .line 69
    :cond_1
    sget-object p1, Li7/B;->a:Li7/B;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 73
    .line 74
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 75
    .line 76
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    throw p1
.end method
