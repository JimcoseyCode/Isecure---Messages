.class public final Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/views/textinput/ContentSizeWatcher;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;",
        "Lcom/facebook/react/views/textinput/ContentSizeWatcher;",
        "Lcom/facebook/react/views/textinput/ReactEditText;",
        "editText",
        "<init>",
        "(Lcom/facebook/react/views/textinput/ReactEditText;)V",
        "Li7/B;",
        "onLayout",
        "()V",
        "Lcom/facebook/react/views/textinput/ReactEditText;",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "eventDispatcher",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "",
        "surfaceId",
        "I",
        "previousContentWidth",
        "previousContentHeight",
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
.field private final editText:Lcom/facebook/react/views/textinput/ReactEditText;

.field private final eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private previousContentHeight:I

.field private previousContentWidth:I

.field private final surfaceId:I


# direct methods
.method public constructor <init>(Lcom/facebook/react/views/textinput/ReactEditText;)V
    .locals 1

    .line 1
    const-string v0, "editText"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 10
    .line 11
    invoke-static {p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getReactContext(Landroid/view/View;)Lcom/facebook/react/bridge/ReactContext;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/UIManagerHelper;->getEventDispatcherForReactTag(Lcom/facebook/react/bridge/ReactContext;I)Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/facebook/react/uimanager/UIManagerHelper;->getSurfaceId(Landroid/content/Context;)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->surfaceId:I

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public onLayout()V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 14
    .line 15
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 22
    .line 23
    invoke-virtual {v0}, Landroid/widget/TextView;->getCompoundPaddingLeft()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {v1}, Landroid/text/Layout;->getWidth()I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    add-int/2addr v0, v1

    .line 38
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 39
    .line 40
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingRight()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/2addr v0, v1

    .line 45
    iget-object v1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 46
    .line 47
    invoke-virtual {v1}, Landroid/widget/TextView;->getCompoundPaddingTop()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 52
    .line 53
    invoke-virtual {v2}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Landroid/text/Layout;->getHeight()I

    .line 58
    .line 59
    .line 60
    move-result v2

    .line 61
    add-int/2addr v1, v2

    .line 62
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 63
    .line 64
    invoke-virtual {v2}, Landroid/widget/TextView;->getCompoundPaddingBottom()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v1, v2

    .line 69
    :cond_0
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->previousContentWidth:I

    .line 70
    .line 71
    if-ne v0, v2, :cond_1

    .line 72
    .line 73
    iget v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->previousContentHeight:I

    .line 74
    .line 75
    if-eq v1, v2, :cond_2

    .line 76
    .line 77
    :cond_1
    iput v1, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->previousContentHeight:I

    .line 78
    .line 79
    iput v0, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->previousContentWidth:I

    .line 80
    .line 81
    iget-object v2, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->eventDispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 82
    .line 83
    if-eqz v2, :cond_2

    .line 84
    .line 85
    new-instance v3, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;

    .line 86
    .line 87
    iget v4, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->surfaceId:I

    .line 88
    .line 89
    iget-object v5, p0, Lcom/facebook/react/views/textinput/ReactTextContentSizeWatcher;->editText:Lcom/facebook/react/views/textinput/ReactEditText;

    .line 90
    .line 91
    invoke-virtual {v5}, Landroid/view/View;->getId()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    int-to-float v0, v0

    .line 96
    invoke-static {v0}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    int-to-float v1, v1

    .line 101
    invoke-static {v1}, Lcom/facebook/react/uimanager/PixelUtil;->toDIPFromPixel(F)F

    .line 102
    .line 103
    .line 104
    move-result v1

    .line 105
    invoke-direct {v3, v4, v5, v0, v1}, Lcom/facebook/react/views/textinput/ReactContentSizeChangedEvent;-><init>(IIFF)V

    .line 106
    .line 107
    .line 108
    invoke-interface {v2, v3}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    return-void
.end method
