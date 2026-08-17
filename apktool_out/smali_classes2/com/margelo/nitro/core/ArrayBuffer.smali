.class public final Lcom/margelo/nitro/core/ArrayBuffer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/margelo/nitro/core/ArrayBuffer$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0012\n\u0002\u0008\u000e\u0008\u0007\u0018\u0000 /2\u00020\u0001:\u00010B\u0011\u0008\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u0011\u0008\u0011\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B\u0011\u0008\u0013\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u0002H\u0082 \u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001c\u0010\u0011\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u0001j\u0002`\u000fH\u0083 \u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0018\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0082 \u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0014\u0010\u0017\u001a\u00060\u0001j\u0002`\u000fH\u0082 \u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0013H\u0083 \u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013H\u0083 \u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0013H\u0083 \u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u001dH\u0083 \u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008 \u0010\u0016J\u000f\u0010!\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008!\u0010\"J\r\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008$\u0010%J\r\u0010&\u001a\u00020\u0000\u00a2\u0006\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008(\u0010)R\u0011\u0010*\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010\u001aR\u0011\u0010+\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010\u001aR\u0011\u0010,\u001a\u00020\u00138F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010\u001aR\u0011\u0010.\u001a\u00020\u001d8F\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010\u001f\u00a8\u00061"
    }
    d2 = {
        "Lcom/margelo/nitro/core/ArrayBuffer;",
        "",
        "Ljava/nio/ByteBuffer;",
        "byteBuffer",
        "<init>",
        "(Ljava/nio/ByteBuffer;)V",
        "Landroid/hardware/HardwareBuffer;",
        "hardwareBuffer",
        "(Landroid/hardware/HardwareBuffer;)V",
        "Lcom/facebook/jni/HybridData;",
        "hybridData",
        "(Lcom/facebook/jni/HybridData;)V",
        "buffer",
        "initHybrid",
        "(Ljava/nio/ByteBuffer;)Lcom/facebook/jni/HybridData;",
        "Lcom/margelo/nitro/core/BoxedHardwareBuffer;",
        "hardwareBufferBoxed",
        "initHybridBoxedHardwareBuffer",
        "(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;",
        "",
        "copyIfNeeded",
        "getByteBuffer",
        "(Z)Ljava/nio/ByteBuffer;",
        "getHardwareBufferBoxed",
        "()Ljava/lang/Object;",
        "getIsOwner",
        "()Z",
        "getIsByteBuffer",
        "getIsHardwareBuffer",
        "",
        "getBufferSize",
        "()I",
        "getBuffer",
        "getHardwareBuffer",
        "()Landroid/hardware/HardwareBuffer;",
        "",
        "toByteArray",
        "()[B",
        "asOwning",
        "()Lcom/margelo/nitro/core/ArrayBuffer;",
        "mHybridData",
        "Lcom/facebook/jni/HybridData;",
        "isOwner",
        "isByteBuffer",
        "isHardwareBuffer",
        "getSize",
        "size",
        "Companion",
        "a",
        "react-native-nitro-modules_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lq3/a;
.end annotation


# static fields
.field public static final Companion:Lcom/margelo/nitro/core/ArrayBuffer$a;


# instance fields
.field private final mHybridData:Lcom/facebook/jni/HybridData;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/margelo/nitro/core/ArrayBuffer$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/margelo/nitro/core/ArrayBuffer$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/margelo/nitro/core/ArrayBuffer;->Companion:Lcom/margelo/nitro/core/ArrayBuffer$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/hardware/HardwareBuffer;)V
    .locals 1

    const-string v0, "hardwareBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-static {p1}, Lcom/margelo/nitro/core/a;->a(Landroid/hardware/HardwareBuffer;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 9
    invoke-direct {p0, p1}, Lcom/margelo/nitro/core/ArrayBuffer;->initHybridBoxedHardwareBuffer(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/margelo/nitro/core/ArrayBuffer;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/Error;

    const-string v0, "Cannot create ArrayBuffer from an already-closed HardwareBuffer!"

    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private constructor <init>(Lcom/facebook/jni/HybridData;)V
    .locals 0
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation build Lq3/a;
    .end annotation

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/margelo/nitro/core/ArrayBuffer;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const-string v0, "byteBuffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->isDirect()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    invoke-direct {p0, p1}, Lcom/margelo/nitro/core/ArrayBuffer;->initHybrid(Ljava/nio/ByteBuffer;)Lcom/facebook/jni/HybridData;

    move-result-object p1

    iput-object p1, p0, Lcom/margelo/nitro/core/ArrayBuffer;->mHybridData:Lcom/facebook/jni/HybridData;

    return-void

    .line 4
    :cond_0
    new-instance p1, Ljava/lang/Error;

    .line 5
    const-string v0, "ArrayBuffers can only be created from direct ByteBuffers, and the given ByteBuffer is not direct!"

    .line 6
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final native getBufferSize()I
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native getByteBuffer(Z)Ljava/nio/ByteBuffer;
.end method

.method private final native getHardwareBufferBoxed()Ljava/lang/Object;
.end method

.method private final native getIsByteBuffer()Z
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native getIsHardwareBuffer()Z
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native getIsOwner()Z
    .annotation build Ldalvik/annotation/optimization/FastNative;
    .end annotation
.end method

.method private final native initHybrid(Ljava/nio/ByteBuffer;)Lcom/facebook/jni/HybridData;
.end method

.method private final native initHybridBoxedHardwareBuffer(Ljava/lang/Object;)Lcom/facebook/jni/HybridData;
.end method


# virtual methods
.method public final asOwning()Lcom/margelo/nitro/core/ArrayBuffer;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->isOwner()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Lcom/margelo/nitro/core/ArrayBuffer;->Companion:Lcom/margelo/nitro/core/ArrayBuffer$a;

    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lcom/margelo/nitro/core/ArrayBuffer$a;->b(Lcom/margelo/nitro/core/ArrayBuffer;)Lcom/margelo/nitro/core/ArrayBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    return-object p0
.end method

.method public final getBuffer(Z)Ljava/nio/ByteBuffer;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/margelo/nitro/core/ArrayBuffer;->getByteBuffer(Z)Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final getHardwareBuffer()Landroid/hardware/HardwareBuffer;
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getHardwareBufferBoxed()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type android.hardware.HardwareBuffer"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lcom/margelo/nitro/core/b;->a(Ljava/lang/Object;)Landroid/hardware/HardwareBuffer;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final getSize()I
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getBufferSize()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isByteBuffer()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getIsByteBuffer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isHardwareBuffer()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getIsHardwareBuffer()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final isOwner()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getIsOwner()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method

.method public final toByteArray()[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lcom/margelo/nitro/core/ArrayBuffer;->getBuffer(Z)Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->hasArray()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    array-length v2, v1

    .line 17
    invoke-virtual {p0}, Lcom/margelo/nitro/core/ArrayBuffer;->getSize()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    invoke-virtual {v0}, Ljava/nio/Buffer;->capacity()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    const-string v1, "array(...)"

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method
