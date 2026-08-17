.class Lcom/facebook/react/ReactActivity$1;
.super Landroidx/activity/L;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/ReactActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/ReactActivity;


# direct methods
.method constructor <init>(Lcom/facebook/react/ReactActivity;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/ReactActivity$1;->this$0:Lcom/facebook/react/ReactActivity;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroidx/activity/L;-><init>(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public handleOnBackPressed()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/activity/L;->setEnabled(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lcom/facebook/react/ReactActivity$1;->this$0:Lcom/facebook/react/ReactActivity;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/facebook/react/ReactActivity;->onBackPressed()V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-virtual {p0, v0}, Landroidx/activity/L;->setEnabled(Z)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
