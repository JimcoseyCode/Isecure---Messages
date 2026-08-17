.class public final synthetic Lexpo/modules/imagepicker/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Ljava/io/File;

.field public final synthetic h:Landroid/net/Uri;

.field public final synthetic i:Landroid/content/ContentResolver;


# direct methods
.method public synthetic constructor <init>(Ljava/io/File;Landroid/net/Uri;Landroid/content/ContentResolver;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/imagepicker/f;->g:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/imagepicker/f;->h:Landroid/net/Uri;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/imagepicker/f;->i:Landroid/content/ContentResolver;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/f;->g:Ljava/io/File;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/imagepicker/f;->h:Landroid/net/Uri;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/imagepicker/f;->i:Landroid/content/ContentResolver;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lexpo/modules/imagepicker/ImagePickerUtilsKt;->a(Ljava/io/File;Landroid/net/Uri;Landroid/content/ContentResolver;)Li7/B;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
