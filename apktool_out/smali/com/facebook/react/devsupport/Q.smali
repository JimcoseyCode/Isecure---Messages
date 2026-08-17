.class public final synthetic Lcom/facebook/react/devsupport/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic g:[Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;

.field public final synthetic h:Lcom/facebook/react/devsupport/DevSupportManagerBase;


# direct methods
.method public synthetic constructor <init>([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/Q;->g:[Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/Q;->h:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/Q;->g:[Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/Q;->h:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 4
    .line 5
    invoke-static {v0, v1, p1, p2}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->r([Lcom/facebook/react/devsupport/interfaces/DevOptionHandler;Lcom/facebook/react/devsupport/DevSupportManagerBase;Landroid/content/DialogInterface;I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
