.class public final Lcom/facebook/react/devsupport/RedBoxContentView;
.super Landroid/widget/LinearLayout;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;,
        Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0002:;B#\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\r\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rJ#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\rJ5\u0010\u001e\u001a\u00020\u000b2\u000c\u0010\u0017\u001a\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u000b\u00a2\u0006\u0004\u0008 \u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010!R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010\'\u001a\u00020&8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0016\u0010/\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109\u00a8\u0006<"
    }
    d2 = {
        "Lcom/facebook/react/devsupport/RedBoxContentView;",
        "Landroid/widget/LinearLayout;",
        "Landroid/widget/AdapterView$OnItemClickListener;",
        "Landroid/content/Context;",
        "context",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "devSupportManager",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "redBoxHandler",
        "<init>",
        "(Landroid/content/Context;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)V",
        "Li7/B;",
        "init",
        "()V",
        "",
        "title",
        "",
        "Lcom/facebook/react/devsupport/interfaces/StackFrame;",
        "stack",
        "setExceptionDetails",
        "(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V",
        "resetReporting",
        "Landroid/widget/AdapterView;",
        "parent",
        "Landroid/view/View;",
        "view",
        "",
        "position",
        "",
        "id",
        "onItemClick",
        "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V",
        "refreshContentView",
        "Lcom/facebook/react/devsupport/interfaces/DevSupportManager;",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;",
        "Landroid/widget/ListView;",
        "stackView",
        "Landroid/widget/ListView;",
        "Landroid/widget/Button;",
        "reportButton",
        "Landroid/widget/Button;",
        "Landroid/widget/TextView;",
        "reportTextView",
        "Landroid/widget/TextView;",
        "Landroid/widget/ProgressBar;",
        "loadingIndicator",
        "Landroid/widget/ProgressBar;",
        "lineSeparator",
        "Landroid/view/View;",
        "",
        "isReporting",
        "Z",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;",
        "reportCompletedListener",
        "Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;",
        "Landroid/view/View$OnClickListener;",
        "reportButtonOnClickListener",
        "Landroid/view/View$OnClickListener;",
        "StackAdapter",
        "OpenStackFrameTask",
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
.field private final devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

.field private isReporting:Z

.field private lineSeparator:Landroid/view/View;

.field private loadingIndicator:Landroid/widget/ProgressBar;

.field private final redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

.field private reportButton:Landroid/widget/Button;

.field private final reportButtonOnClickListener:Landroid/view/View$OnClickListener;

.field private final reportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

.field private reportTextView:Landroid/widget/TextView;

.field private stackView:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/react/devsupport/interfaces/DevSupportManager;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;)V
    .locals 1

    .line 1
    const-string v0, "devSupportManager"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 10
    .line 11
    iput-object p3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 12
    .line 13
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/RedBoxContentView$reportCompletedListener$1;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 19
    .line 20
    new-instance p1, Lcom/facebook/react/devsupport/f0;

    .line 21
    .line 22
    invoke-direct {p1, p0}, Lcom/facebook/react/devsupport/f0;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 26
    .line 27
    return-void
.end method

.method public static synthetic a(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->init$lambda$2(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$getLoadingIndicator$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/ProgressBar;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->loadingIndicator:Landroid/widget/ProgressBar;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getReportButton$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/Button;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButton:Landroid/widget/Button;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$getReportTextView$p(Lcom/facebook/react/devsupport/RedBoxContentView;)Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportTextView:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setReporting$p(Lcom/facebook/react/devsupport/RedBoxContentView;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic b(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->init$lambda$3(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButtonOnClickListener$lambda$0(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final init$lambda$2(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->handleReloadJS()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final init$lambda$3(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->hideRedboxDialog()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private static final reportButtonOnClickListener$lambda$0(Lcom/facebook/react/devsupport/RedBoxContentView;Landroid/view/View;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_9

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-ne v0, v1, :cond_9

    .line 11
    .line 12
    iget-boolean v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    iput-boolean v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 18
    .line 19
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportTextView:Landroid/widget/TextView;

    .line 20
    .line 21
    const-string v1, "reportTextView"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    move-object v0, v2

    .line 30
    :cond_1
    const-string v3, "Reporting..."

    .line 31
    .line 32
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportTextView:Landroid/widget/TextView;

    .line 36
    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    move-object v0, v2

    .line 43
    :cond_2
    const/4 v1, 0x0

    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->loadingIndicator:Landroid/widget/ProgressBar;

    .line 48
    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    const-string v0, "loadingIndicator"

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move-object v0, v2

    .line 57
    :cond_3
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->lineSeparator:Landroid/view/View;

    .line 61
    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    const-string v0, "lineSeparator"

    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    move-object v0, v2

    .line 70
    :cond_4
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButton:Landroid/widget/Button;

    .line 74
    .line 75
    if-nez v0, :cond_5

    .line 76
    .line 77
    const-string v0, "reportButton"

    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    move-object v2, v0

    .line 84
    :goto_0
    invoke-virtual {v2, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 85
    .line 86
    .line 87
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 88
    .line 89
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    const-string v0, "Required value was null."

    .line 94
    .line 95
    if-eqz v3, :cond_8

    .line 96
    .line 97
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 98
    .line 99
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_7

    .line 104
    .line 105
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 106
    .line 107
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getSourceUrl()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    if-eqz v5, :cond_6

    .line 112
    .line 113
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 114
    .line 115
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    const-string p1, "getContext(...)"

    .line 120
    .line 121
    invoke-static {v2, p1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v6, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportCompletedListener:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;

    .line 125
    .line 126
    invoke-interface/range {v1 .. v6}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->reportRedbox(Landroid/content/Context;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Ljava/lang/String;Lcom/facebook/react/devsupport/interfaces/RedBoxHandler$ReportCompletedListener;)V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :cond_6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_7
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw p0

    .line 142
    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 143
    .line 144
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p0

    .line 148
    :cond_9
    return-void
.end method


# virtual methods
.method public final init()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sget v1, Lcom/facebook/react/R$layout;->redbox_view:I

    .line 10
    .line 11
    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 12
    .line 13
    .line 14
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_stack:I

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/widget/ListView;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->stackView:Landroid/widget/ListView;

    .line 26
    .line 27
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_reload_button:I

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Landroid/widget/Button;

    .line 34
    .line 35
    new-instance v1, Lcom/facebook/react/devsupport/g0;

    .line 36
    .line 37
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/g0;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 41
    .line 42
    .line 43
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_dismiss_button:I

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Landroid/widget/Button;

    .line 50
    .line 51
    new-instance v1, Lcom/facebook/react/devsupport/h0;

    .line 52
    .line 53
    invoke-direct {v1, p0}, Lcom/facebook/react/devsupport/h0;-><init>(Lcom/facebook/react/devsupport/RedBoxContentView;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 60
    .line 61
    if-eqz v0, :cond_0

    .line 62
    .line 63
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    const/4 v1, 0x1

    .line 68
    if-ne v0, v1, :cond_0

    .line 69
    .line 70
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_loading_indicator:I

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    check-cast v0, Landroid/widget/ProgressBar;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->loadingIndicator:Landroid/widget/ProgressBar;

    .line 79
    .line 80
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_line_separator:I

    .line 81
    .line 82
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->lineSeparator:Landroid/view/View;

    .line 87
    .line 88
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_label:I

    .line 89
    .line 90
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    check-cast v0, Landroid/widget/TextView;

    .line 95
    .line 96
    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    .line 101
    .line 102
    .line 103
    const/4 v1, 0x0

    .line 104
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setHighlightColor(I)V

    .line 105
    .line 106
    .line 107
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportTextView:Landroid/widget/TextView;

    .line 108
    .line 109
    sget v0, Lcom/facebook/react/R$id;->rn_redbox_report_button:I

    .line 110
    .line 111
    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    check-cast v0, Landroid/widget/Button;

    .line 116
    .line 117
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButtonOnClickListener:Landroid/view/View$OnClickListener;

    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    .line 121
    .line 122
    iput-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButton:Landroid/widget/Button;

    .line 123
    .line 124
    :cond_0
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView<",
            "*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .line 1
    const-string p1, "view"

    .line 2
    .line 3
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance p1, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;

    .line 7
    .line 8
    iget-object p2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 9
    .line 10
    invoke-direct {p1, p2}, Lcom/facebook/react/devsupport/RedBoxContentView$OpenStackFrameTask;-><init>(Lcom/facebook/react/devsupport/interfaces/DevSupportManager;)V

    .line 11
    .line 12
    .line 13
    sget-object p2, Landroid/os/AsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    .line 14
    .line 15
    const/4 p4, 0x1

    .line 16
    new-array p4, p4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 17
    .line 18
    iget-object p5, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->stackView:Landroid/widget/ListView;

    .line 19
    .line 20
    if-nez p5, :cond_0

    .line 21
    .line 22
    const-string p5, "stackView"

    .line 23
    .line 24
    invoke-static {p5}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p5, 0x0

    .line 28
    :cond_0
    invoke-virtual {p5}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    invoke-interface {p5, p3}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    const-string p5, "null cannot be cast to non-null type com.facebook.react.devsupport.interfaces.StackFrame"

    .line 37
    .line 38
    invoke-static {p3, p5}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 p5, 0x0

    .line 42
    aput-object p3, p4, p5

    .line 43
    .line 44
    invoke-virtual {p1, p2, p4}, Landroid/os/AsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final refreshContentView()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorTitle()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 8
    .line 9
    invoke-interface {v1}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorStack()[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    new-array v1, v1, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 17
    .line 18
    :cond_0
    iget-object v2, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 19
    .line 20
    invoke-interface {v2}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getLastErrorType()Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "Required value was null."

    .line 25
    .line 26
    if-eqz v2, :cond_3

    .line 27
    .line 28
    iget-object v4, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/util/Pair;->create(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;

    .line 31
    .line 32
    .line 33
    move-result-object v5

    .line 34
    const-string v6, "create(...)"

    .line 35
    .line 36
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v4, v5}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->processErrorCustomizers(Landroid/util/Pair;)Landroid/util/Pair;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    iget-object v3, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 46
    .line 47
    const-string v5, "first"

    .line 48
    .line 49
    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    check-cast v3, Ljava/lang/String;

    .line 53
    .line 54
    iget-object v4, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 55
    .line 56
    const-string v5, "second"

    .line 57
    .line 58
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    check-cast v4, [Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 62
    .line 63
    invoke-virtual {p0, v3, v4}, Lcom/facebook/react/devsupport/RedBoxContentView;->setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->devSupportManager:Lcom/facebook/react/devsupport/interfaces/DevSupportManager;

    .line 67
    .line 68
    invoke-interface {v3}, Lcom/facebook/react/devsupport/interfaces/DevSupportManager;->getRedBoxHandler()Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_1

    .line 73
    .line 74
    invoke-interface {v3, v0, v1, v2}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->handleRedbox(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;Lcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/facebook/react/devsupport/RedBoxContentView;->resetReporting()V

    .line 78
    .line 79
    .line 80
    :cond_1
    return-void

    .line 81
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v0
.end method

.method public final resetReporting()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->redBoxHandler:Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/facebook/react/devsupport/interfaces/RedBoxHandler;->isReportEnabled()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->isReporting:Z

    .line 14
    .line 15
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportTextView:Landroid/widget/TextView;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    const-string v1, "reportTextView"

    .line 21
    .line 22
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    move-object v1, v2

    .line 26
    :cond_1
    const/16 v3, 0x8

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->loadingIndicator:Landroid/widget/ProgressBar;

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const-string v1, "loadingIndicator"

    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    move-object v1, v2

    .line 41
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->lineSeparator:Landroid/view/View;

    .line 45
    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    const-string v1, "lineSeparator"

    .line 49
    .line 50
    invoke-static {v1}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v1, v2

    .line 54
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButton:Landroid/widget/Button;

    .line 58
    .line 59
    const-string v3, "reportButton"

    .line 60
    .line 61
    if-nez v1, :cond_4

    .line 62
    .line 63
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    move-object v1, v2

    .line 67
    :cond_4
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->reportButton:Landroid/widget/Button;

    .line 71
    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    invoke-static {v3}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_5
    move-object v2, v0

    .line 79
    :goto_0
    const/4 v0, 0x1

    .line 80
    invoke-virtual {v2, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    return-void
.end method

.method public final setExceptionDetails(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 2

    .line 1
    const-string v0, "title"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "stack"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/devsupport/RedBoxContentView;->stackView:Landroid/widget/ListView;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const-string v0, "stackView"

    .line 16
    .line 17
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    :cond_0
    new-instance v1, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;

    .line 22
    .line 23
    invoke-direct {v1, p1, p2}, Lcom/facebook/react/devsupport/RedBoxContentView$StackAdapter;-><init>(Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
