.class public final Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/react/uimanager/events/Event<",
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0008\u0010\u0011\u001a\u00020\u0012H\u0016J\u0008\u0010\u0013\u001a\u00020\u0014H\u0017J\u0008\u0010\u0015\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;",
        "Lcom/facebook/react/uimanager/events/Event;",
        "surfaceId",
        "",
        "viewTag",
        "mode",
        "Lcom/facebook/react/views/virtual/VirtualViewMode;",
        "targetRect",
        "Landroid/graphics/Rect;",
        "thresholdRect",
        "synchronous",
        "",
        "<init>",
        "(IILcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V",
        "targetRectAsMap",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "thresholdRectAsMap",
        "getEventName",
        "",
        "getEventData",
        "Lcom/facebook/react/bridge/WritableMap;",
        "experimental_isSynchronous",
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
.field private final mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

.field private final synchronous:Z

.field private final targetRectAsMap:Lcom/facebook/react/bridge/ReadableMap;

.field private final thresholdRectAsMap:Lcom/facebook/react/bridge/ReadableMap;


# direct methods
.method public constructor <init>(IILcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;Landroid/graphics/Rect;Z)V
    .locals 1

    .line 1
    const-string v0, "mode"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "targetRect"

    .line 7
    .line 8
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "thresholdRect"

    .line 12
    .line 13
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(II)V

    .line 17
    .line 18
    .line 19
    iput-object p3, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 20
    .line 21
    iput-boolean p6, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->synchronous:Z

    .line 22
    .line 23
    invoke-static {p4}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEventKt;->access$toReadableMap(Landroid/graphics/Rect;)Lcom/facebook/react/bridge/ReadableMap;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->targetRectAsMap:Lcom/facebook/react/bridge/ReadableMap;

    .line 28
    .line 29
    invoke-static {p5}, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEventKt;->access$toReadableMap(Landroid/graphics/Rect;)Lcom/facebook/react/bridge/ReadableMap;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->thresholdRectAsMap:Lcom/facebook/react/bridge/ReadableMap;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method protected experimental_isSynchronous()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->synchronous:Z

    .line 2
    .line 3
    return v0
.end method

.method public getEventData()Lcom/facebook/react/bridge/WritableMap;
    .locals 3

    .line 1
    invoke-static {}, Lcom/facebook/react/bridge/Arguments;->createMap()Lcom/facebook/react/bridge/WritableMap;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->mode:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/facebook/react/views/virtual/VirtualViewMode;->getValue()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const-string v2, "mode"

    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Lcom/facebook/react/bridge/WritableMap;->putInt(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    const-string v1, "targetRect"

    .line 17
    .line 18
    iget-object v2, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->targetRectAsMap:Lcom/facebook/react/bridge/ReadableMap;

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 21
    .line 22
    .line 23
    const-string v1, "thresholdRect"

    .line 24
    .line 25
    iget-object v2, p0, Lcom/facebook/react/views/virtual/VirtualViewModeChangeEvent;->thresholdRectAsMap:Lcom/facebook/react/bridge/ReadableMap;

    .line 26
    .line 27
    invoke-interface {v0, v1, v2}, Lcom/facebook/react/bridge/WritableMap;->putMap(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 28
    .line 29
    .line 30
    return-object v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "modeChange"

    .line 2
    .line 3
    return-object v0
.end method
