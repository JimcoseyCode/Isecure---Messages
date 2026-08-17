.class public final synthetic Lcom/facebook/react/uimanager/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lw7/a;


# instance fields
.field public final synthetic g:Ljava/util/List;

.field public final synthetic h:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/uimanager/Q;->g:Ljava/util/List;

    .line 5
    .line 6
    iput p2, p0, Lcom/facebook/react/uimanager/Q;->h:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/facebook/react/uimanager/Q;->g:Ljava/util/List;

    .line 2
    .line 3
    iget v1, p0, Lcom/facebook/react/uimanager/Q;->h:I

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/ViewManagerRegistry;->d(Ljava/util/List;I)Li7/B;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method
