.class public final Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;",
        "",
        "id",
        "",
        "rectangle",
        "Landroid/graphics/RectF;",
        "color",
        "<init>",
        "(ILandroid/graphics/RectF;I)V",
        "getId",
        "()I",
        "getRectangle",
        "()Landroid/graphics/RectF;",
        "getColor",
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


# instance fields
.field private final color:I

.field private final id:I

.field private final rectangle:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(ILandroid/graphics/RectF;I)V
    .locals 1

    .line 1
    const-string v0, "rectangle"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->id:I

    .line 10
    .line 11
    iput-object p2, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->rectangle:Landroid/graphics/RectF;

    .line 12
    .line 13
    iput p3, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->color:I

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->color:I

    .line 2
    .line 3
    return v0
.end method

.method public final getId()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->id:I

    .line 2
    .line 3
    return v0
.end method

.method public final getRectangle()Landroid/graphics/RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/debuggingoverlay/TraceUpdate;->rectangle:Landroid/graphics/RectF;

    .line 2
    .line 3
    return-object v0
.end method
