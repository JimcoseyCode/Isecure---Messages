.class public final Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEmitter;",
        "",
        "viewId",
        "surfaceId",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
        "dispatcher",
        "<init>",
        "(IILcom/facebook/react/uimanager/events/EventDispatcher;)V",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "mode",
        "Landroid/graphics/Rect;",
        "targetRect",
        "thresholdRect",
        "",
        "synchronous",
        "Li7/B;",
        "emitModeChange",
        "(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V",
        "I",
        "Lcom/facebook/react/uimanager/events/EventDispatcher;",
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
.field private final dispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

.field private final surfaceId:I

.field private final viewId:I


# direct methods
.method public constructor <init>(IILcom/facebook/react/uimanager/events/EventDispatcher;)V
    .locals 1

    .line 1
    const-string v0, "dispatcher"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput p1, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->viewId:I

    .line 10
    .line 11
    iput p2, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->surfaceId:I

    .line 12
    .line 13
    iput-object p3, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->dispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public emitModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V
    .locals 8

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "thresholdRect"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->dispatcher:Lcom/facebook/react/uimanager/events/EventDispatcher;

    .line 17
    .line 18
    new-instance v1, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;

    .line 19
    .line 20
    iget v2, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->surfaceId:I

    .line 21
    .line 22
    iget v3, p0, Lcom/facebook/react/views/virtual/view/VirtualViewEventEmitter;->viewId:I

    .line 23
    .line 24
    move-object v4, p1

    .line 25
    move-object v5, p2

    .line 26
    move-object v6, p3

    .line 27
    move v7, p4

    .line 28
    invoke-direct/range {v1 .. v7}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;-><init>(IILcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, v1}, Lcom/facebook/react/uimanager/events/EventDispatcher;->dispatchEvent(Lcom/facebook/react/uimanager/events/Event;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
