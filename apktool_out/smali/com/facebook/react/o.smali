.class public final synthetic Lcom/facebook/react/o;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/ReactInstanceManager;

.field public final synthetic h:[Lcom/facebook/react/ReactInstanceEventListener;

.field public final synthetic i:Lcom/facebook/react/bridge/ReactApplicationContext;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/ReactInstanceManager;[Lcom/facebook/react/ReactInstanceEventListener;Lcom/facebook/react/bridge/ReactApplicationContext;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/o;->g:Lcom/facebook/react/ReactInstanceManager;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/o;->h:[Lcom/facebook/react/ReactInstanceEventListener;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/o;->i:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/o;->g:Lcom/facebook/react/ReactInstanceManager;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/o;->h:[Lcom/facebook/react/ReactInstanceEventListener;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/o;->i:Lcom/facebook/react/bridge/ReactApplicationContext;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/react/ReactInstanceManager;->f(Lcom/facebook/react/ReactInstanceManager;[Lcom/facebook/react/ReactInstanceEventListener;Lcom/facebook/react/bridge/ReactApplicationContext;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
