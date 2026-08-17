.class Lcom/horcrux/svg/C$a;
.super LZ2/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/horcrux/svg/C;->g(LY2/t;Lcom/facebook/imagepipeline/request/b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/horcrux/svg/C;


# direct methods
.method constructor <init>(Lcom/horcrux/svg/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 2
    .line 3
    invoke-direct {p0}, LZ2/b;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Bitmap;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 2
    .line 3
    iget-object v1, v0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-static {v1, v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    new-instance v1, Lcom/horcrux/svg/events/SvgLoadEvent;

    .line 14
    .line 15
    iget-object v2, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 16
    .line 17
    invoke-static {v2}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/view/View;)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    iget-object v3, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 22
    .line 23
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    iget-object v4, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 28
    .line 29
    move-object v5, v4

    .line 30
    iget-object v4, v5, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 31
    .line 32
    invoke-static {v5}, Lcom/horcrux/svg/C;->d(Lcom/horcrux/svg/C;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    int-to-float v6, v6

    .line 41
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    int-to-float v7, p1

    .line 46
    invoke-direct/range {v1 .. v7}, Lcom/horcrux/svg/events/SvgLoadEvent;-><init>(IILcom/facebook/react/bridge/ReactContext;Ljava/lang/String;FF)V

    .line 47
    .line 48
    .line 49
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 53
    .line 54
    invoke-static {p1}, Lcom/horcrux/svg/C;->c(Lcom/horcrux/svg/C;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 60
    .line 61
    .line 62
    iget-object p1, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 63
    .line 64
    invoke-virtual {p1}, Lcom/horcrux/svg/VirtualView;->getSvgView()Lcom/horcrux/svg/SvgView;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    if-eqz p1, :cond_0

    .line 69
    .line 70
    invoke-virtual {p1}, Lcom/horcrux/svg/SvgView;->invalidate()V

    .line 71
    .line 72
    .line 73
    :cond_0
    return-void
.end method

.method public onFailureImpl(Lm2/c;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/C$a;->a:Lcom/horcrux/svg/C;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/C;->c(Lcom/horcrux/svg/C;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lm2/c;->b()Ljava/lang/Throwable;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    const-string v0, "RNSVG: fetchDecodedImage failed!"

    .line 16
    .line 17
    new-array v1, v1, [Ljava/lang/Object;

    .line 18
    .line 19
    const-string v2, "ReactNative"

    .line 20
    .line 21
    invoke-static {v2, p1, v0, v1}, Ld2/a;->L(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
