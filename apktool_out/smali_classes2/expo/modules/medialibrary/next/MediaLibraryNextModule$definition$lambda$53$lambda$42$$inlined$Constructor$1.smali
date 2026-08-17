.class public final Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;
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
    iput-object p1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

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

    .line 1
    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;->invoke([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lexpo/modules/medialibrary/next/objects/query/Query;

    iget-object v0, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-static {v0}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getAssetFactory(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;

    move-result-object v0

    iget-object v1, p0, Lexpo/modules/medialibrary/next/MediaLibraryNextModule$definition$lambda$53$lambda$42$$inlined$Constructor$1;->this$0:Lexpo/modules/medialibrary/next/MediaLibraryNextModule;

    invoke-static {v1}, Lexpo/modules/medialibrary/next/MediaLibraryNextModule;->access$getContext(Lexpo/modules/medialibrary/next/MediaLibraryNextModule;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {p1, v0, v1}, Lexpo/modules/medialibrary/next/objects/query/Query;-><init>(Lexpo/modules/medialibrary/next/objects/asset/factories/AssetFactory;Landroid/content/Context;)V

    return-object p1
.end method
