.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->transformHeight(Ljava/lang/Integer;Landroid/net/Uri;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/coroutines/jvm/internal/l;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0008\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.delegates.MediaStoreToAssetAdapter$transformHeight$2"
    f = "MediaStoreToAssetAdapter.kt"
    l = {
        0x1c
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field final synthetic $contentUri:Landroid/net/Uri;

.field label:I

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;Landroid/net/Uri;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;",
            "Landroid/net/Uri;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->$contentUri:Landroid/net/Uri;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic c(Landroid/graphics/BitmapFactory$Options;)I
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->invokeSuspend$lambda$0(Landroid/graphics/BitmapFactory$Options;)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final invokeSuspend$lambda$0(Landroid/graphics/BitmapFactory$Options;)I
    .locals 0

    .line 1
    iget p0, p0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    .line 2
    .line 3
    return p0
.end method


# virtual methods
.method public final create(Ln7/f;)Ln7/f;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ln7/f;"
        }
    .end annotation

    .line 1
    new-instance v0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->$contentUri:Landroid/net/Uri;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;-><init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;Landroid/net/Uri;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln7/f;

    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->invoke(Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln7/f;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->create(Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;

    sget-object v0, Li7/B;->a:Li7/B;

    invoke-virtual {p1, v0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->label:I

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
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;

    .line 28
    .line 29
    iget-object v1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->$contentUri:Landroid/net/Uri;

    .line 30
    .line 31
    new-instance v3, Lexpo/modules/medialibrary/next/objects/asset/delegates/c;

    .line 32
    .line 33
    invoke-direct {v3}, Lexpo/modules/medialibrary/next/objects/asset/delegates/c;-><init>()V

    .line 34
    .line 35
    .line 36
    iput v2, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter$transformHeight$2;->label:I

    .line 37
    .line 38
    invoke-static {p1, v1, v3, p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;->access$downloadBitmapAndGet(Lexpo/modules/medialibrary/next/objects/asset/delegates/MediaStoreToAssetAdapter;Landroid/net/Uri;Lkotlin/jvm/functions/Function1;Ln7/f;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    .line 44
    return-object v0

    .line 45
    :cond_2
    return-object p1
.end method
