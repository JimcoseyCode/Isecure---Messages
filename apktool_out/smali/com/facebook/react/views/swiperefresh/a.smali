.class public final synthetic Lcom/facebook/react/views/swiperefresh/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$j;


# instance fields
.field public final synthetic a:Lcom/facebook/react/uimanager/ThemedReactContext;

.field public final synthetic b:Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/swiperefresh/a;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/views/swiperefresh/a;->b:Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/swiperefresh/a;->a:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/views/swiperefresh/a;->b:Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/views/swiperefresh/SwipeRefreshLayoutManager;->a(Lcom/facebook/react/uimanager/ThemedReactContext;Lcom/facebook/react/views/swiperefresh/ReactSwipeRefreshLayout;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
