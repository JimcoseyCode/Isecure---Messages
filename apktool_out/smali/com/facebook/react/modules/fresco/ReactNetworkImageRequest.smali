.class public final Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;
.super Lcom/facebook/imagepipeline/request/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B#\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;",
        "Lcom/facebook/imagepipeline/request/b;",
        "Lcom/facebook/imagepipeline/request/c;",
        "builder",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "headers",
        "Lcom/facebook/react/modules/fresco/ImageCacheControl;",
        "cacheControl",
        "<init>",
        "(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)V",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "getHeaders$ReactAndroid_release",
        "()Lcom/facebook/react/bridge/ReadableMap;",
        "Lcom/facebook/react/modules/fresco/ImageCacheControl;",
        "getCacheControl$ReactAndroid_release",
        "()Lcom/facebook/react/modules/fresco/ImageCacheControl;",
        "Companion",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;


# instance fields
.field private final cacheControl:Lcom/facebook/react/modules/fresco/ImageCacheControl;

.field private final headers:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->Companion:Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/facebook/imagepipeline/request/b;-><init>(Lcom/facebook/imagepipeline/request/c;)V

    .line 3
    iput-object p2, p0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->headers:Lcom/facebook/react/bridge/ReadableMap;

    .line 4
    iput-object p3, p0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->cacheControl:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;-><init>(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)V

    return-void
.end method

.method public static final fromBuilderWithHeaders(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->Companion:Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;->fromBuilderWithHeaders(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final fromBuilderWithHeaders(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;
    .locals 1

    .line 2
    sget-object v0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->Companion:Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest$Companion;->fromBuilderWithHeaders(Lcom/facebook/imagepipeline/request/c;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/modules/fresco/ImageCacheControl;)Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final getCacheControl$ReactAndroid_release()Lcom/facebook/react/modules/fresco/ImageCacheControl;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->cacheControl:Lcom/facebook/react/modules/fresco/ImageCacheControl;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getHeaders$ReactAndroid_release()Lcom/facebook/react/bridge/ReadableMap;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/modules/fresco/ReactNetworkImageRequest;->headers:Lcom/facebook/react/bridge/ReadableMap;

    .line 2
    .line 3
    return-object v0
.end method
