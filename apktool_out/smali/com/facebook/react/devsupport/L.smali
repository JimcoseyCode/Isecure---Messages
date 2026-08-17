.class public final synthetic Lcom/facebook/react/devsupport/L;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lcom/facebook/react/devsupport/DevSupportManagerBase;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

.field public final synthetic j:I

.field public final synthetic k:Lcom/facebook/react/devsupport/interfaces/ErrorType;


# direct methods
.method public synthetic constructor <init>(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/facebook/react/devsupport/L;->g:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/facebook/react/devsupport/L;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/facebook/react/devsupport/L;->i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 9
    .line 10
    iput p4, p0, Lcom/facebook/react/devsupport/L;->j:I

    .line 11
    .line 12
    iput-object p5, p0, Lcom/facebook/react/devsupport/L;->k:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/facebook/react/devsupport/L;->g:Lcom/facebook/react/devsupport/DevSupportManagerBase;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/devsupport/L;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/facebook/react/devsupport/L;->i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 6
    .line 7
    iget v3, p0, Lcom/facebook/react/devsupport/L;->j:I

    .line 8
    .line 9
    iget-object v4, p0, Lcom/facebook/react/devsupport/L;->k:Lcom/facebook/react/devsupport/interfaces/ErrorType;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lcom/facebook/react/devsupport/DevSupportManagerBase;->i(Lcom/facebook/react/devsupport/DevSupportManagerBase;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;ILcom/facebook/react/devsupport/interfaces/ErrorType;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
