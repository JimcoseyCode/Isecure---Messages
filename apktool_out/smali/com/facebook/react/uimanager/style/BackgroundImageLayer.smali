.class public final Lcom/facebook/react/uimanager/style/BackgroundImageLayer;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0018\u0000 \u000c2\u00020\u0001:\u0001\u000cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;",
        "",
        "<init>",
        "()V",
        "gradient",
        "Lcom/facebook/react/uimanager/style/Gradient;",
        "(Lcom/facebook/react/uimanager/style/Gradient;)V",
        "getShader",
        "Landroid/graphics/Shader;",
        "width",
        "",
        "height",
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
.field public static final Companion:Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;


# instance fields
.field private gradient:Lcom/facebook/react/uimanager/style/Gradient;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;->Companion:Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/react/uimanager/style/Gradient;)V
    .locals 0

    .line 3
    invoke-direct {p0}, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;-><init>()V

    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;->gradient:Lcom/facebook/react/uimanager/style/Gradient;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/style/Gradient;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;-><init>(Lcom/facebook/react/uimanager/style/Gradient;)V

    return-void
.end method


# virtual methods
.method public final getShader(FF)Landroid/graphics/Shader;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundImageLayer;->gradient:Lcom/facebook/react/uimanager/style/Gradient;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "gradient"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    invoke-interface {v0, p1, p2}, Lcom/facebook/react/uimanager/style/Gradient;->getShader(FF)Landroid/graphics/Shader;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
