.class public final Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;
.super Lcom/bumptech/glide/GeneratedAppGlideModule;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;",
        "Lcom/bumptech/glide/GeneratedAppGlideModule;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/bumptech/glide/b;",
        "glide",
        "Lcom/bumptech/glide/h;",
        "registry",
        "Li7/B;",
        "registerComponents",
        "(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V",
        "Lcom/bumptech/glide/c;",
        "builder",
        "applyOptions",
        "(Landroid/content/Context;Lcom/bumptech/glide/c;)V",
        "",
        "isManifestParsingEnabled",
        "()Z",
        "Lexpo/modules/image/ExpoImageAppGlideModule;",
        "a",
        "Lexpo/modules/image/ExpoImageAppGlideModule;",
        "appGlideModule",
        "expo-image_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lexpo/modules/image/ExpoImageAppGlideModule;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lcom/bumptech/glide/GeneratedAppGlideModule;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Lexpo/modules/image/ExpoImageAppGlideModule;

    .line 10
    .line 11
    invoke-direct {p1}, Lexpo/modules/image/ExpoImageAppGlideModule;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lexpo/modules/image/ExpoImageAppGlideModule;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public applyOptions(Landroid/content/Context;Lcom/bumptech/glide/c;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "builder"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lexpo/modules/image/ExpoImageAppGlideModule;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lexpo/modules/image/ExpoImageAppGlideModule;->applyOptions(Landroid/content/Context;Lcom/bumptech/glide/c;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public isManifestParsingEnabled()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "glide"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "registry"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/github/penfeizhou/animation/glide/GlideAnimationModule;

    .line 17
    .line 18
    invoke-direct {v0}, Lcom/github/penfeizhou/animation/glide/GlideAnimationModule;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1, p2, p3}, Lcom/github/penfeizhou/animation/glide/GlideAnimationModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 22
    .line 23
    .line 24
    new-instance v0, Lcom/bumptech/glide/integration/avif/AvifGlideModule;

    .line 25
    .line 26
    invoke-direct {v0}, Lcom/bumptech/glide/integration/avif/AvifGlideModule;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/integration/avif/AvifGlideModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 30
    .line 31
    .line 32
    new-instance v0, Lcom/bumptech/glide/integration/okhttp3/OkHttpLibraryGlideModule;

    .line 33
    .line 34
    invoke-direct {v0}, Lcom/bumptech/glide/integration/okhttp3/OkHttpLibraryGlideModule;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1, p2, p3}, Lcom/bumptech/glide/integration/okhttp3/OkHttpLibraryGlideModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 38
    .line 39
    .line 40
    new-instance v0, Lexpo/modules/image/svg/SVGModule;

    .line 41
    .line 42
    invoke-direct {v0}, Lexpo/modules/image/svg/SVGModule;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/svg/SVGModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 46
    .line 47
    .line 48
    new-instance v0, Lexpo/modules/image/blurhash/BlurhashModule;

    .line 49
    .line 50
    invoke-direct {v0}, Lexpo/modules/image/blurhash/BlurhashModule;-><init>()V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/blurhash/BlurhashModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 54
    .line 55
    .line 56
    new-instance v0, Lexpo/modules/image/dataurls/Base64Module;

    .line 57
    .line 58
    invoke-direct {v0}, Lexpo/modules/image/dataurls/Base64Module;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/dataurls/Base64Module;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 62
    .line 63
    .line 64
    new-instance v0, Lexpo/modules/image/decodedsource/DecodedModule;

    .line 65
    .line 66
    invoke-direct {v0}, Lexpo/modules/image/decodedsource/DecodedModule;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/decodedsource/DecodedModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lexpo/modules/image/thumbhash/ThumbhashModule;

    .line 73
    .line 74
    invoke-direct {v0}, Lexpo/modules/image/thumbhash/ThumbhashModule;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/thumbhash/ThumbhashModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;

    .line 81
    .line 82
    invoke-direct {v0}, Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, p2, p3}, Lexpo/modules/image/okhttp/ExpoImageOkHttpClientGlideModule;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, Lcom/bumptech/glide/GeneratedAppGlideModuleImpl;->a:Lexpo/modules/image/ExpoImageAppGlideModule;

    .line 89
    .line 90
    invoke-virtual {v0, p1, p2, p3}, LK1/b;->registerComponents(Landroid/content/Context;Lcom/bumptech/glide/b;Lcom/bumptech/glide/h;)V

    .line 91
    .line 92
    .line 93
    return-void
.end method
