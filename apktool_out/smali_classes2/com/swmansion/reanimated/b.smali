.class public final synthetic Lcom/swmansion/reanimated/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/UIManagerModule$CustomEventNamesResolver;


# instance fields
.field public final synthetic a:Lcom/facebook/react/bridge/UIManager;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/bridge/UIManager;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/swmansion/reanimated/b;->a:Lcom/facebook/react/bridge/UIManager;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final resolveCustomEventName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/reanimated/b;->a:Lcom/facebook/react/bridge/UIManager;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/facebook/react/bridge/UIManager;->resolveCustomDirectEventName(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
