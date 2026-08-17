.class public final Lcom/facebook/react/uimanager/style/BackgroundRepeat;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BackgroundRepeat;",
        "",
        "x",
        "Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;",
        "y",
        "<init>",
        "(Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;)V",
        "getX",
        "()Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;",
        "getY",
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
.field public static final Companion:Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;


# instance fields
.field private final x:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

.field private final y:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/style/BackgroundRepeat;->Companion:Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/BackgroundRepeat;->x:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/facebook/react/uimanager/style/BackgroundRepeat;->y:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final getX()Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundRepeat;->x:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getY()Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BackgroundRepeat;->y:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 2
    .line 3
    return-object v0
.end method
