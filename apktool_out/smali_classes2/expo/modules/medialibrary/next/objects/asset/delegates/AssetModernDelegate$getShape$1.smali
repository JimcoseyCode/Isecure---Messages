.class final Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->getShape(Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.medialibrary.next.objects.asset.delegates.AssetModernDelegate"
    f = "AssetModernDelegate.kt"
    l = {
        0x5c,
        0x5d
    }
    m = "getShape"
.end annotation


# instance fields
.field I$0:I

.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ln7/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate$getShape$1;->this$0:Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, Lexpo/modules/medialibrary/next/objects/asset/delegates/AssetModernDelegate;->getShape(Ln7/f;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method
