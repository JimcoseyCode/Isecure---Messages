.class Lexpo/modules/adapters/react/services/EventEmitterModule$1;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/adapters/react/services/EventEmitterModule;->emit(ILjava/lang/String;Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lexpo/modules/adapters/react/services/EventEmitterModule;

.field final synthetic val$eventBody:Landroid/os/Bundle;

.field final synthetic val$eventName:Ljava/lang/String;

.field final synthetic val$viewId:I


# direct methods
.method constructor <init>(Lexpo/modules/adapters/react/services/EventEmitterModule;ILjava/lang/String;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->this$0:Lexpo/modules/adapters/react/services/EventEmitterModule;

    .line 2
    .line 3
    iput-object p3, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$eventName:Ljava/lang/String;

    .line 4
    .line 5
    iput p4, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$viewId:I

    .line 6
    .line 7
    iput-object p5, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$eventBody:Landroid/os/Bundle;

    .line 8
    .line 9
    invoke-direct {p0, p2}, Lcom/facebook/react/uimanager/events/Event;-><init>(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3

    .line 1
    iget v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$viewId:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->getEventName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$eventBody:Landroid/os/Bundle;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v2, 0x0

    .line 17
    :goto_0
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$1;->val$eventName:Ljava/lang/String;

    .line 2
    .line 3
    invoke-static {v0}, Lexpo/modules/adapters/react/views/ViewManagerAdapterUtils;->normalizeEventName(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
