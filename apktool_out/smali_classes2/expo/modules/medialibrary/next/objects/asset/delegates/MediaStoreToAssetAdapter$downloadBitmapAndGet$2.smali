.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->downloadBitmapAndGet(Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;
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
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "LR8/N;",
        "",
        "<anonymous>",
        "(LR8/N;)I"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$downloadBitmapAndGet$2"
    f = "MediaStoreToAssetAdapter.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contentUri:Landroid/net/Uri;

.field final synthetic $extract:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field L$0:Ljava/lang/Object;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;",
            "Landroid/net/Uri;",
            "Lkotlin/jvm/functions/Function1;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$contentUri:Landroid/net/Uri;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$extract:Lkotlin/jvm/functions/Function1;

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
    new-instance p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;

    .line 2
    .line 3
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 4
    .line 5
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$contentUri:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$extract:Lkotlin/jvm/functions/Function1;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)V

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
    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->label:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->L$0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroid/graphics/BitmapFactory$Options;

    .line 15
    .line 16
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    new-instance p1, Landroid/graphics/BitmapFactory$Options;

    .line 32
    .line 33
    invoke-direct {p1}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-boolean v2, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    .line 37
    .line 38
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 39
    .line 40
    invoke-static {v1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->access$getContentResolver(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;)Landroid/content/ContentResolver;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v3, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$contentUri:Landroid/net/Uri;

    .line 45
    .line 46
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->L$0:Ljava/lang/Object;

    .line 47
    .line 48
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->label:I

    .line 49
    .line 50
    invoke-static {v1, v3, p0}, Lexpo/modules/medialibrary/next/extensions/resolver/AssetExtensionsKt;->queryAssetData(Landroid/content/ContentResolver;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-ne v1, v0, :cond_2

    .line 55
    .line 56
    return-object v0

    .line 57
    :cond_2
    move-object v0, p1

    .line 58
    move-object p1, v1

    .line 59
    :goto_0
    check-cast p1, Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1, v0}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$downloadBitmapAndGet$2;->$extract:Lkotlin/jvm/functions/Function1;

    .line 65
    .line 66
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method
