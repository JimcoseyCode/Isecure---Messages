.class public final Lcom/facebook/imagepipeline/backends/okhttp3/d;
.super Ljava/lang/Exception;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/backends/okhttp3/d$a;
    }
.end annotation


# static fields
.field public static final i:Lcom/facebook/imagepipeline/backends/okhttp3/d$a;


# instance fields
.field private final g:Ljava/lang/Integer;

.field private final h:Le9/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/backends/okhttp3/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/backends/okhttp3/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/imagepipeline/backends/okhttp3/d;->i:Lcom/facebook/imagepipeline/backends/okhttp3/d$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Le9/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Exception;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/imagepipeline/backends/okhttp3/d;->g:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/imagepipeline/backends/okhttp3/d;->h:Le9/t;

    .line 7
    .line 8
    return-void
.end method
