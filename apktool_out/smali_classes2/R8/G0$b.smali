.class final LR8/G0$b;
.super LR8/F0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LR8/G0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private final k:LR8/G0;

.field private final l:LR8/G0$c;

.field private final m:LR8/u;

.field private final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LR8/G0;LR8/G0$c;LR8/u;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LR8/F0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LR8/G0$b;->k:LR8/G0;

    .line 5
    .line 6
    iput-object p2, p0, LR8/G0$b;->l:LR8/G0$c;

    .line 7
    .line 8
    iput-object p3, p0, LR8/G0$b;->m:LR8/u;

    .line 9
    .line 10
    iput-object p4, p0, LR8/G0$b;->n:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public v()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public w(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object p1, p0, LR8/G0$b;->k:LR8/G0;

    .line 2
    .line 3
    iget-object v0, p0, LR8/G0$b;->l:LR8/G0$c;

    .line 4
    .line 5
    iget-object v1, p0, LR8/G0$b;->m:LR8/u;

    .line 6
    .line 7
    iget-object v2, p0, LR8/G0$b;->n:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, LR8/G0;->p(LR8/G0;LR8/G0$c;LR8/u;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
