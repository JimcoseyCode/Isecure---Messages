.class public abstract Lcom/bumptech/glide/load/resource/bitmap/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/bumptech/glide/load/resource/bitmap/n$a;,
        Lcom/bumptech/glide/load/resource/bitmap/n$b;,
        Lcom/bumptech/glide/load/resource/bitmap/n$e;,
        Lcom/bumptech/glide/load/resource/bitmap/n$c;,
        Lcom/bumptech/glide/load/resource/bitmap/n$d;,
        Lcom/bumptech/glide/load/resource/bitmap/n$f;,
        Lcom/bumptech/glide/load/resource/bitmap/n$g;
    }
.end annotation


# static fields
.field public static final AT_LEAST:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final AT_MOST:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final CENTER_INSIDE:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final CENTER_OUTSIDE:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final DEFAULT:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final FIT_CENTER:Lcom/bumptech/glide/load/resource/bitmap/n;

.field static final IS_BITMAP_FACTORY_SCALING_SUPPORTED:Z

.field public static final NONE:Lcom/bumptech/glide/load/resource/bitmap/n;

.field public static final OPTION:Lv1/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv1/g;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/n$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/n$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->AT_LEAST:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 7
    .line 8
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/n$b;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/n$b;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->AT_MOST:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 14
    .line 15
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/n$e;

    .line 16
    .line 17
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/n$e;-><init>()V

    .line 18
    .line 19
    .line 20
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->FIT_CENTER:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 21
    .line 22
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/n$c;

    .line 23
    .line 24
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/n$c;-><init>()V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->CENTER_INSIDE:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 28
    .line 29
    new-instance v0, Lcom/bumptech/glide/load/resource/bitmap/n$d;

    .line 30
    .line 31
    invoke-direct {v0}, Lcom/bumptech/glide/load/resource/bitmap/n$d;-><init>()V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->CENTER_OUTSIDE:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 35
    .line 36
    new-instance v1, Lcom/bumptech/glide/load/resource/bitmap/n$f;

    .line 37
    .line 38
    invoke-direct {v1}, Lcom/bumptech/glide/load/resource/bitmap/n$f;-><init>()V

    .line 39
    .line 40
    .line 41
    sput-object v1, Lcom/bumptech/glide/load/resource/bitmap/n;->NONE:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 42
    .line 43
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->DEFAULT:Lcom/bumptech/glide/load/resource/bitmap/n;

    .line 44
    .line 45
    const-string v1, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy"

    .line 46
    .line 47
    invoke-static {v1, v0}, Lv1/g;->f(Ljava/lang/String;Ljava/lang/Object;)Lv1/g;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    sput-object v0, Lcom/bumptech/glide/load/resource/bitmap/n;->OPTION:Lv1/g;

    .line 52
    .line 53
    const/4 v0, 0x1

    .line 54
    sput-boolean v0, Lcom/bumptech/glide/load/resource/bitmap/n;->IS_BITMAP_FACTORY_SCALING_SUPPORTED:Z

    .line 55
    .line 56
    return-void
.end method

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
.method public abstract getSampleSizeRounding(IIII)Lcom/bumptech/glide/load/resource/bitmap/n$g;
.end method

.method public abstract getScaleFactor(IIII)F
.end method
