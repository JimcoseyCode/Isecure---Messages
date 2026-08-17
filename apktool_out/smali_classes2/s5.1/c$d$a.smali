.class final Ls5/c$d$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls5/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field synthetic h:Ljava/lang/Object;

.field final synthetic i:LR0/f$a;

.field final synthetic j:Ljava/lang/Object;


# direct methods
.method constructor <init>(LR0/f$a;Ljava/lang/Object;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls5/c$d$a;->i:LR0/f$a;

    .line 2
    .line 3
    iput-object p2, p0, Ls5/c$d$a;->j:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(LR0/c;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ls5/c$d$a;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ls5/c$d$a;

    .line 6
    .line 7
    sget-object p2, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, Ls5/c$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3

    .line 1
    new-instance v0, Ls5/c$d$a;

    .line 2
    .line 3
    iget-object v1, p0, Ls5/c$d$a;->i:LR0/f$a;

    .line 4
    .line 5
    iget-object v2, p0, Ls5/c$d$a;->j:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, Ls5/c$d$a;-><init>(LR0/f$a;Ljava/lang/Object;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, Ls5/c$d$a;->h:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LR0/c;

    .line 2
    .line 3
    check-cast p2, Ln7/f;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ls5/c$d$a;->c(LR0/c;Ln7/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Ls5/c$d$a;->g:I

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, Ls5/c$d$a;->h:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LR0/c;

    .line 14
    .line 15
    iget-object v0, p0, Ls5/c$d$a;->i:LR0/f$a;

    .line 16
    .line 17
    iget-object v1, p0, Ls5/c$d$a;->j:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, LR0/c;->i(LR0/f$a;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    sget-object p1, Li7/B;->a:Li7/B;

    .line 23
    .line 24
    return-object p1

    .line 25
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 28
    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1
.end method
