.class public final synthetic Lcom/facebook/react/devsupport/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/lang/Integer;

.field public final synthetic h:Ljava/lang/Integer;

.field public final synthetic i:Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/n;->g:Ljava/lang/Integer;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/n;->h:Ljava/lang/Integer;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/devsupport/n;->i:Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/facebook/react/devsupport/n;->j:Ljava/lang/String;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/n;->g:Ljava/lang/Integer;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/n;->h:Ljava/lang/Integer;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/devsupport/n;->i:Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;

    .line 6
    .line 7
    iget-object v3, p0, Lcom/facebook/react/devsupport/n;->j:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;->a(Ljava/lang/Integer;Ljava/lang/Integer;Lcom/facebook/react/devsupport/DefaultDevLoadingViewImplementation;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
