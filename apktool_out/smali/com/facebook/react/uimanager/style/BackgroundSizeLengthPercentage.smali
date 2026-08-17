.class public final Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0008\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u001b\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\u000c\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;",
        "",
        "x",
        "Lcom/facebook/react/uimanager/LengthPercentage;",
        "y",
        "<init>",
        "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V",
        "getX",
        "()Lcom/facebook/react/uimanager/LengthPercentage;",
        "getY",
        "isXAuto",
        "",
        "isYAuto",
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
.field public static final Companion:Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;


# instance fields
.field private final x:Lcom/facebook/react/uimanager/LengthPercentage;

.field private final y:Lcom/facebook/react/uimanager/LengthPercentage;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->Companion:Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->x:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->y:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getX()Lcom/facebook/react/uimanager/LengthPercentage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->x:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getY()Lcom/facebook/react/uimanager/LengthPercentage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->y:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final isXAuto()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->x:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final isYAuto()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundSizeLengthPercentage;->y:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method
