.class final Lexpo/modules/image/ImageLoadTask$load$drawable$1;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/ImageLoadTask;->load(Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LR8/N;",
        "Landroid/graphics/drawable/Drawable;",
        "kotlin.jvm.PlatformType",
        "<anonymous>",
        "(LR8/N;)Landroid/graphics/drawable/Drawable;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.image.ImageLoadTask$load$drawable$1"
    f = "ImageLoadTask.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $context:Landroid/content/Context;

.field final synthetic $model:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/image/ImageLoadTask;


# direct methods
.method constructor <init>(Landroid/content/Context;Ljava/lang/Object;Lexpo/modules/image/ImageLoadTask;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/Object;",
            "Lexpo/modules/image/ImageLoadTask;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$context:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$model:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->this$0:Lexpo/modules/image/ImageLoadTask;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance p1, Lexpo/modules/image/ImageLoadTask$load$drawable$1;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$context:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$model:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->this$0:Lexpo/modules/image/ImageLoadTask;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/image/ImageLoadTask$load$drawable$1;-><init>(Landroid/content/Context;Ljava/lang/Object;Lexpo/modules/image/ImageLoadTask;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LR8/N;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/image/ImageLoadTask$load$drawable$1;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

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
    iget v0, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->label:I

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$context:Landroid/content/Context;

    .line 12
    .line 13
    invoke-static {p1}, Lcom/bumptech/glide/b;->v(Landroid/content/Context;)Lcom/bumptech/glide/k;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1}, Lcom/bumptech/glide/k;->c()Lcom/bumptech/glide/j;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    iget-object v0, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->$model:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->x0(Ljava/lang/Object;)Lcom/bumptech/glide/j;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, LM1/a;->c()LM1/a;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const-string v0, "centerInside(...)"

    .line 32
    .line 33
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    check-cast p1, Lcom/bumptech/glide/j;

    .line 37
    .line 38
    iget-object v0, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->this$0:Lexpo/modules/image/ImageLoadTask;

    .line 39
    .line 40
    invoke-static {v0}, Lexpo/modules/image/ImageLoadTask;->access$getOptions$p(Lexpo/modules/image/ImageLoadTask;)Lexpo/modules/image/records/ImageLoadOptions;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v0}, Lexpo/modules/image/records/ImageLoadOptions;->getTintColor()Landroid/graphics/Color;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-nez v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v1, LM1/f;

    .line 52
    .line 53
    invoke-direct {v1}, LM1/f;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v2, Lexpo/modules/image/CustomOptions;->INSTANCE:Lexpo/modules/image/CustomOptions;

    .line 57
    .line 58
    invoke-virtual {v2}, Lexpo/modules/image/CustomOptions;->getTintColor()Lv1/g;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-static {v0}, Lcom/facebook/react/bridge/m;->a(Landroid/graphics/Color;)I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/b;->c(I)Ljava/lang/Integer;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v1, v2, v0}, LM1/a;->W(Lv1/g;Ljava/lang/Object;)LM1/a;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p1, v0}, Lcom/bumptech/glide/j;->h0(LM1/a;)Lcom/bumptech/glide/j;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v0, "apply(...)"

    .line 79
    .line 80
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_0
    iget-object v0, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->this$0:Lexpo/modules/image/ImageLoadTask;

    .line 84
    .line 85
    invoke-static {v0}, Lexpo/modules/image/ImageLoadTask;->access$getOptions$p(Lexpo/modules/image/ImageLoadTask;)Lexpo/modules/image/records/ImageLoadOptions;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v0}, Lexpo/modules/image/records/ImageLoadOptions;->getMaxWidth()I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iget-object v1, p0, Lexpo/modules/image/ImageLoadTask$load$drawable$1;->this$0:Lexpo/modules/image/ImageLoadTask;

    .line 94
    .line 95
    invoke-static {v1}, Lexpo/modules/image/ImageLoadTask;->access$getOptions$p(Lexpo/modules/image/ImageLoadTask;)Lexpo/modules/image/records/ImageLoadOptions;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {v1}, Lexpo/modules/image/records/ImageLoadOptions;->getMaxHeight()I

    .line 100
    .line 101
    .line 102
    move-result v1

    .line 103
    invoke-virtual {p1, v0, v1}, Lcom/bumptech/glide/j;->C0(II)LM1/b;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    return-object p1

    .line 112
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 113
    .line 114
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 115
    .line 116
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p1
.end method
