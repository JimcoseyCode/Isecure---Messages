.class public final Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/react/devsupport/RedBoxContentView;-><init>(Landroid/content/Context;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "com/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;",
        "Landroid/text/SpannedString;",
        "spannedString",
        "Li7/B;",
        "onReportSuccess",
        "(Landroid/text/SpannedString;)V",
        "onReportError",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/facebook/react/devsupport/RedBoxContentView;


# direct methods
.method constructor <init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReportError(Landroid/text/SpannedString;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$setReporting$p(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getReportButton$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "reportButton"

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_0
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getLoadingIndicator$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "loadingIndicator"

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :cond_1
    const/16 v2, 0x8

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getReportTextView$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    const-string v0, "reportTextView"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v1, v0

    .line 60
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public onReportSuccess(Landroid/text/SpannedString;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v0, v1}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$setReporting$p(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getReportButton$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const/4 v1, 0x0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const-string v0, "reportButton"

    .line 17
    .line 18
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    move-object v0, v1

    .line 22
    :cond_0
    const/4 v2, 0x1

    .line 23
    invoke-virtual {v0, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 27
    .line 28
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getLoadingIndicator$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_1

    .line 33
    .line 34
    const-string v0, "loadingIndicator"

    .line 35
    .line 36
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :cond_1
    const/16 v2, 0x8

    .line 41
    .line 42
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;->this$0:Lcom/facebook/react/devsupport/RedBoxContentView;

    .line 46
    .line 47
    invoke-static {v0}, Lcom/facebook/react/devsupport/RedBoxContentView;->access$getReportTextView$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    if-nez v0, :cond_2

    .line 52
    .line 53
    const-string v0, "reportTextView"

    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    move-object v1, v0

    .line 60
    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method
