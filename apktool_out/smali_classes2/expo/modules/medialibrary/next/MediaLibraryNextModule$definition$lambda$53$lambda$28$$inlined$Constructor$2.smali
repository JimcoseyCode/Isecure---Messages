.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
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


# instance fields
.field final synthetic this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;


# direct methods
.method public constructor <init>(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 3
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    const-string v0, "<destruct>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    aget-object p1, p1, v0

    .line 1
    check-cast p1, Ljava/lang/String;

    .line 2
    new-instance v0, Lexpo/modules/medialibrary/next/objects/album/Album;

    iget-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-static {v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAssetDeleter(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;

    move-result-object v1

    iget-object v2, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-static {v2}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAssetFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    move-result-object v2

    iget-object v3, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$28$$inlined$Constructor$2;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-static {v3}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getContext(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v0, p1, v1, v2, v3}, Lexpo/modules/medialibrary/next/objects/album/Album;-><init>(Ljava/lang/String;Lexpo/modules/medialibrary/next/objects/asset/deleters/AssetDeleter;Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    return-object v0
.end method
