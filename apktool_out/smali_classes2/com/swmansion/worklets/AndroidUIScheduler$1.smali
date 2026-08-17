.class Lcom/swmansion/worklets/AndroidUIScheduler$1;
.super Lcom/facebook/react/bridge/GuardedRunnable;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/swmansion/worklets/AndroidUIScheduler;->scheduleTriggerOnUI()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/swmansion/worklets/AndroidUIScheduler;


# direct methods
.method constructor <init>(Lcom/swmansion/worklets/AndroidUIScheduler;Lcom/facebook/react/bridge/JSExceptionHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/swmansion/worklets/AndroidUIScheduler$1;->this$0:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lcom/facebook/react/bridge/GuardedRunnable;-><init>(Lcom/facebook/react/bridge/JSExceptionHandler;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public runGuarded()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/worklets/AndroidUIScheduler$1;->this$0:Lcom/swmansion/worklets/AndroidUIScheduler;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/swmansion/worklets/AndroidUIScheduler;->b(Lcom/swmansion/worklets/AndroidUIScheduler;)Ljava/lang/Runnable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 8
    .line 9
    .line 10
    return-void
.end method
