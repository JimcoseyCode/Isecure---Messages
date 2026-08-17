.class public final synthetic Lcom/facebook/react/views/virtual/view/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# instance fields
.field public final synthetic a:Lcom/facebook/react/views/virtual/view/ReactVirtualView;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/views/virtual/view/ReactVirtualView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/views/virtual/view/a;->a:Lcom/facebook/react/views/virtual/view/ReactVirtualView;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/virtual/view/a;->a:Lcom/facebook/react/views/virtual/view/ReactVirtualView;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lcom/facebook/react/views/virtual/view/ReactVirtualView;->c(Lcom/facebook/react/views/virtual/view/ReactVirtualView;Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
