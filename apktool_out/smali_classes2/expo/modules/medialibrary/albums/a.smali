.class public final synthetic Lexpo/modules/medialibrary/albums/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/media/MediaScannerConnection$OnScanCompletedListener;


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final synthetic b:LR8/w;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/medialibrary/albums/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/medialibrary/albums/a;->b:LR8/w;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onScanCompleted(Ljava/lang/String;Landroid/net/Uri;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/medialibrary/albums/a;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/medialibrary/albums/a;->b:LR8/w;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lexpo/modules/medialibrary/albums/AddAssetsToAlbumKt$addAssetsToAlbum$2;->c(Ljava/util/concurrent/atomic/AtomicInteger;LR8/w;Ljava/lang/String;Landroid/net/Uri;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
