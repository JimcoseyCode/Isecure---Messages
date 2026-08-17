.class public final synthetic Ls3/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

.field public final synthetic h:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/jstasks/HeadlessJsTaskContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ls3/a;->g:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    .line 5
    .line 6
    iput-object p2, p0, Ls3/a;->h:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    .line 7
    .line 8
    iput p3, p0, Ls3/a;->i:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Ls3/a;->g:Lcom/facebook/react/jstasks/HeadlessJsTaskContext;

    .line 2
    .line 3
    iget-object v1, p0, Ls3/a;->h:Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;

    .line 4
    .line 5
    iget v2, p0, Ls3/a;->i:I

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lcom/facebook/react/jstasks/HeadlessJsTaskContext;->b(Lcom/facebook/react/jstasks/HeadlessJsTaskContext;Lcom/facebook/react/jstasks/HeadlessJsTaskConfig;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
