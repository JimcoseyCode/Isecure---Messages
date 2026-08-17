.class public final synthetic Lexpo/modules/imagepicker/exporters/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

.field public final synthetic h:Landroid/net/Uri;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/imagepicker/exporters/b;->g:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/imagepicker/exporters/b;->h:Landroid/net/Uri;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/imagepicker/exporters/b;->g:Lexpo/modules/imagepicker/exporters/CompressionImageExporter;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/imagepicker/exporters/b;->h:Landroid/net/Uri;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lexpo/modules/imagepicker/exporters/CompressionImageExporter;->a(Lexpo/modules/imagepicker/exporters/CompressionImageExporter;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
