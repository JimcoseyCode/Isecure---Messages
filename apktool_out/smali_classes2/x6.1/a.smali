.class public final synthetic Lx6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic g:Lu6/k;

.field public final synthetic h:Lcom/facebook/react/views/view/ReactViewGroup;

.field public final synthetic i:Lx6/b;


# direct methods
.method public synthetic constructor <init>(Lu6/k;Lcom/facebook/react/views/view/ReactViewGroup;Lx6/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx6/a;->g:Lu6/k;

    .line 5
    .line 6
    iput-object p2, p0, Lx6/a;->h:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 7
    .line 8
    iput-object p3, p0, Lx6/a;->i:Lx6/b;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onDismiss(Landroid/content/DialogInterface;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lx6/a;->g:Lu6/k;

    .line 2
    .line 3
    iget-object v1, p0, Lx6/a;->h:Lcom/facebook/react/views/view/ReactViewGroup;

    .line 4
    .line 5
    iget-object v2, p0, Lx6/a;->i:Lx6/b;

    .line 6
    .line 7
    invoke-static {v0, v1, v2, p1}, Lx6/b;->a(Lu6/k;Lcom/facebook/react/views/view/ReactViewGroup;Lx6/b;Landroid/content/DialogInterface;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
