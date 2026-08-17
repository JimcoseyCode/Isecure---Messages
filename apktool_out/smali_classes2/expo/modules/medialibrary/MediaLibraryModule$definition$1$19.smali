.class final Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/medialibrary/MediaLibraryModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw7/a;"
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
.field final synthetic this$0:Lexpo/modules/medialibrary/MediaLibraryModule;


# direct methods
.method constructor <init>(Lexpo/modules/medialibrary/MediaLibraryModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->invoke()V

    sget-object v0, Li7/B;->a:Li7/B;

    return-object v0
.end method

.method public final invoke()V
    .locals 7

    .line 2
    iget-object v0, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    invoke-static {v0}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$getImagesObserver$p(Lexpo/modules/medialibrary/MediaLibraryModule;)Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;

    move-result-object v0

    if-eqz v0, :cond_0

    return-void

    .line 3
    :cond_0
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    iget-object v1, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    invoke-static {v1}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$getContext(Lexpo/modules/medialibrary/MediaLibraryModule;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    .line 5
    iget-object v2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 6
    new-instance v3, Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;

    iget-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    const/4 v5, 0x1

    invoke-direct {v3, v4, v0, v5}, Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;-><init>(Lexpo/modules/medialibrary/MediaLibraryModule;Landroid/os/Handler;I)V

    .line 7
    sget-object v4, Landroid/provider/MediaStore$Images$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 8
    invoke-virtual {v1, v4, v5, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 9
    invoke-static {v2, v3}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$setImagesObserver$p(Lexpo/modules/medialibrary/MediaLibraryModule;Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;)V

    .line 10
    iget-object v2, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    .line 11
    new-instance v3, Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;

    iget-object v4, p0, Lexpo/modules/medialibrary/MediaLibraryModule$definition$1$19;->this$0:Lexpo/modules/medialibrary/MediaLibraryModule;

    const/4 v6, 0x3

    invoke-direct {v3, v4, v0, v6}, Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;-><init>(Lexpo/modules/medialibrary/MediaLibraryModule;Landroid/os/Handler;I)V

    .line 12
    sget-object v0, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    .line 13
    invoke-virtual {v1, v0, v5, v3}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 14
    invoke-static {v2, v3}, Lexpo/modules/medialibrary/MediaLibraryModule;->access$setVideosObserver$p(Lexpo/modules/medialibrary/MediaLibraryModule;Lexpo/modules/medialibrary/MediaLibraryModule$MediaStoreContentObserver;)V

    return-void
.end method
