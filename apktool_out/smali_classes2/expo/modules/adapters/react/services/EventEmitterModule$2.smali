.class Lexpo/modules/adapters/react/services/EventEmitterModule$2;
.super Lcom/facebook/react/uimanager/events/Event;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/adapters/react/services/EventEmitterModule;->getReactEventFromEvent(ILexpo/modules/core/interfaces/services/EventEmitter$Event;)Lcom/facebook/react/uimanager/events/Event;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

.field final synthetic val$viewId:I


# direct methods
.method constructor <init>(ILexpo/modules/core/interfaces/services/EventEmitter$Event;I)V
    .locals 0

    .line 1
    iput-object p2, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

    .line 2
    .line 3
    iput p3, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$viewId:I

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/facebook/react/uimanager/events/Event;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public canCoalesce()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/core/interfaces/services/EventEmitter$Event;->canCoalesce()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public dispatch(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V
    .locals 3

    .line 1
    iget v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$viewId:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->getEventName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

    .line 8
    .line 9
    invoke-interface {v2}, Lexpo/modules/core/interfaces/services/EventEmitter$Event;->getEventBody()Landroid/os/Bundle;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2}, Lcom/facebook/react/bridge/Arguments;->fromBundle(Landroid/os/Bundle;)Lcom/facebook/react/bridge/WritableMap;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-interface {p1, v0, v1, v2}, Lcom/facebook/react/uimanager/events/RCTEventEmitter;->receiveEvent(ILjava/lang/String;Lcom/facebook/react/bridge/WritableMap;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public getCoalescingKey()S
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/core/interfaces/services/EventEmitter$Event;->getCoalescingKey()S

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getEventName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/adapters/react/services/EventEmitterModule$2;->val$event:Lexpo/modules/core/interfaces/services/EventEmitter$Event;

    .line 2
    .line 3
    invoke-interface {v0}, Lexpo/modules/core/interfaces/services/EventEmitter$Event;->getEventName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lexpo/modules/adapters/react/views/ViewManagerAdapterUtils;->normalizeEventName(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
