.class public final Lexpo/modules/image/blurhash/BlurhashModelLoaderFactory;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LB1/o;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\u0005\u00a8\u0006\r"
    }
    d2 = {
        "Lexpo/modules/image/blurhash/BlurhashModelLoaderFactory;",
        "LB1/o;",
        "Lexpo/modules/image/blurhash/BlurhashModel;",
        "Landroid/graphics/Bitmap;",
        "<init>",
        "()V",
        "LB1/r;",
        "multiFactory",
        "LB1/n;",
        "build",
        "(LB1/r;)LB1/n;",
        "Li7/B;",
        "teardown",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LB1/r;",
            ")",
            "LB1/n;"
        }
    .end annotation

    .line 1
    const-string v0, "multiFactory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lexpo/modules/image/blurhash/BlurhashModelLoader;

    .line 7
    .line 8
    invoke-direct {p1}, Lexpo/modules/image/blurhash/BlurhashModelLoader;-><init>()V

    .line 9
    .line 10
    .line 11
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
