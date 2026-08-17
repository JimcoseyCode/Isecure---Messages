.class public final synthetic Lcom/facebook/react/defaults/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/bridge/UIManagerProvider;


# instance fields
.field public final synthetic a:Lcom/facebook/react/defaults/DefaultReactNativeHost;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/defaults/DefaultReactNativeHost;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/defaults/c;->a:Lcom/facebook/react/defaults/DefaultReactNativeHost;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final createUIManager(Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/defaults/c;->a:Lcom/facebook/react/defaults/DefaultReactNativeHost;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/defaults/DefaultReactNativeHost;->b(Lcom/facebook/react/defaults/DefaultReactNativeHost;Lcom/facebook/react/bridge/ReactApplicationContext;)Lcom/facebook/react/bridge/UIManager;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
