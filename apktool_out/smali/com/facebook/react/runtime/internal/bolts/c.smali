.class public final synthetic Lcom/facebook/react/runtime/internal/bolts/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/runtime/internal/bolts/Continuation;


# instance fields
.field public final synthetic a:Lcom/facebook/react/runtime/internal/bolts/Continuation;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/runtime/internal/bolts/Continuation;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/runtime/internal/bolts/c;->a:Lcom/facebook/react/runtime/internal/bolts/Continuation;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final then(Lcom/facebook/react/runtime/internal/bolts/Task;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/runtime/internal/bolts/c;->a:Lcom/facebook/react/runtime/internal/bolts/Continuation;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/runtime/internal/bolts/Task;->e(Lcom/facebook/react/runtime/internal/bolts/Continuation;Lcom/facebook/react/runtime/internal/bolts/Task;)Lcom/facebook/react/runtime/internal/bolts/Task;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
