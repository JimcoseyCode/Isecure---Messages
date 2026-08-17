.class public final synthetic Lexpo/modules/logbox/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;


# direct methods
.method public synthetic constructor <init>(Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lexpo/modules/logbox/a;->g:Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;

    .line 5
    .line 6
    iput-object p2, p0, Lexpo/modules/logbox/a;->h:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, Lexpo/modules/logbox/a;->i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/a;->g:Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/logbox/a;->h:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lexpo/modules/logbox/a;->i:[Lcom/facebook/react/devsupport/interfaces/StackFrame;

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;->B(Lexpo/modules/logbox/ExpoLogBoxDevSupportManager;Ljava/lang/String;[Lcom/facebook/react/devsupport/interfaces/StackFrame;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
