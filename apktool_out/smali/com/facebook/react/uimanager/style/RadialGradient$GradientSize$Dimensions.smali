.class public final Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;
.super Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Dimensions"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;",
        "Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;",
        "x",
        "Lcom/facebook/react/uimanager/LengthPercentage;",
        "y",
        "<init>",
        "(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V",
        "getX",
        "()Lcom/facebook/react/uimanager/LengthPercentage;",
        "getY",
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
.field private final x:Lcom/facebook/react/uimanager/LengthPercentage;

.field private final y:Lcom/facebook/react/uimanager/LengthPercentage;


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/LengthPercentage;Lcom/facebook/react/uimanager/LengthPercentage;)V
    .locals 1

    .line 1
    const-string v0, "x"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "y"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-direct {p0, v0}, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->x:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 16
    .line 17
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->y:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final getX()Lcom/facebook/react/uimanager/LengthPercentage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->x:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getY()Lcom/facebook/react/uimanager/LengthPercentage;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/RadialGradient$GradientSize$Dimensions;->y:Lcom/facebook/react/uimanager/LengthPercentage;

    .line 2
    .line 3
    return-object v0
.end method
