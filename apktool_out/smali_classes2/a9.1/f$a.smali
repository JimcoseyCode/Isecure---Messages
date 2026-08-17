.class final La9/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LR8/m;
.implements LR8/d1;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La9/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "a"
.end annotation


# instance fields
.field public final g:LR8/o;

.field public final h:Ljava/lang/Object;

.field final synthetic i:La9/f;


# direct methods
.method public constructor <init>(La9/f;LR8/o;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, La9/f$a;->i:La9/f;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, La9/f$a;->g:LR8/o;

    .line 7
    .line 8
    iput-object p3, p0, La9/f$a;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(La9/f;La9/f$a;Ljava/lang/Throwable;Li7/B;Ln7/j;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, La9/f$a;->k(La9/f;La9/f$a;Ljava/lang/Throwable;Li7/B;Ln7/j;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic c(La9/f;La9/f$a;Ljava/lang/Throwable;)Li7/B;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La9/f$a;->h(La9/f;La9/f$a;Ljava/lang/Throwable;)Li7/B;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final h(La9/f;La9/f$a;Ljava/lang/Throwable;)Li7/B;
    .locals 0

    .line 1
    iget-object p1, p1, La9/f$a;->h:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La9/f;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    sget-object p0, Li7/B;->a:Li7/B;

    .line 7
    .line 8
    return-object p0
.end method

.method private static final k(La9/f;La9/f$a;Ljava/lang/Throwable;Li7/B;Ln7/j;)Li7/B;
    .locals 0

    .line 1
    invoke-static {}, La9/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object p3, p1, La9/f$a;->h:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p2, p0, p3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, La9/f$a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, La9/f;->c(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    sget-object p0, Li7/B;->a:Li7/B;

    .line 16
    .line 17
    return-object p0
.end method


# virtual methods
.method public b(LW8/B;I)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, LR8/o;->b(LW8/B;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LR8/o;->d()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public e(Li7/B;Lw7/o;)V
    .locals 2

    .line 1
    invoke-static {}, La9/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, La9/f$a;->i:La9/f;

    .line 6
    .line 7
    iget-object v1, p0, La9/f$a;->h:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-object p2, p0, La9/f$a;->g:LR8/o;

    .line 13
    .line 14
    iget-object v0, p0, La9/f$a;->i:La9/f;

    .line 15
    .line 16
    new-instance v1, La9/e;

    .line 17
    .line 18
    invoke-direct {v1, v0, p0}, La9/e;-><init>(La9/f;La9/f$a;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, p1, v1}, LR8/o;->P(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public bridge synthetic f(Ljava/lang/Object;Lw7/o;)V
    .locals 0

    .line 1
    check-cast p1, Li7/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, La9/f$a;->e(Li7/B;Lw7/o;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public g(Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/o;->g(Lkotlin/jvm/functions/Function1;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public getContext()Ln7/j;
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LR8/o;->getContext()Ln7/j;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public i(Li7/B;Ljava/lang/Object;Lw7/o;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object p3, p0, La9/f$a;->i:La9/f;

    .line 2
    .line 3
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 4
    .line 5
    new-instance v1, La9/d;

    .line 6
    .line 7
    invoke-direct {v1, p3, p0}, La9/d;-><init>(La9/f;La9/f$a;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, v1}, LR8/o;->o(Ljava/lang/Object;Ljava/lang/Object;Lw7/o;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    invoke-static {}, La9/f;->v()Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    iget-object p3, p0, La9/f$a;->i:La9/f;

    .line 21
    .line 22
    iget-object v0, p0, La9/f$a;->h:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {p2, p3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    :cond_0
    return-object p1
.end method

.method public isCancelled()Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LR8/o;->isCancelled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public isCompleted()Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0}, LR8/o;->isCompleted()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(Ljava/lang/Throwable;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/o;->j(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public n(Ljava/lang/Throwable;)Z
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/o;->n(Ljava/lang/Throwable;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public bridge synthetic o(Ljava/lang/Object;Ljava/lang/Object;Lw7/o;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3}, La9/f$a;->i(Li7/B;Ljava/lang/Object;Lw7/o;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public q(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/o;->q(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public resumeWith(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La9/f$a;->g:LR8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LR8/o;->resumeWith(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
