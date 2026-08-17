.class final Ls5/c$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ls5/c;->k(LR0/f$a;Ljava/lang/Object;)LR0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field final synthetic h:Ls5/c;

.field final synthetic i:LR0/f$a;

.field final synthetic j:Ljava/lang/Object;


# direct methods
.method constructor <init>(Ls5/c;LR0/f$a;Ljava/lang/Object;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls5/c$d;->h:Ls5/c;

    .line 2
    .line 3
    iput-object p2, p0, Ls5/c$d;->i:LR0/f$a;

    .line 4
    .line 5
    iput-object p3, p0, Ls5/c$d;->j:Ljava/lang/Object;

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1, p4}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3

    .line 1
    new-instance p1, Ls5/c$d;

    .line 2
    .line 3
    iget-object v0, p0, Ls5/c$d;->h:Ls5/c;

    .line 4
    .line 5
    iget-object v1, p0, Ls5/c$d;->i:LR0/f$a;

    .line 6
    .line 7
    iget-object v2, p0, Ls5/c$d;->j:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p1, v0, v1, v2, p2}, Ls5/c$d;-><init>(Ls5/c;LR0/f$a;Ljava/lang/Object;Ln7/f;)V

    .line 10
    .line 11
    .line 12
    return-object p1
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Ls5/c$d;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Ls5/c$d;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Ls5/c$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Ls5/c$d;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, Ls5/c$d;->g:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eqz v1, :cond_1

    .line 9
    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :cond_1
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Ls5/c$d;->h:Ls5/c;

    .line 28
    .line 29
    invoke-static {p1}, Ls5/c;->c(Ls5/c;)LN0/i;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    new-instance v1, Ls5/c$d$a;

    .line 34
    .line 35
    iget-object v3, p0, Ls5/c$d;->i:LR0/f$a;

    .line 36
    .line 37
    iget-object v4, p0, Ls5/c$d;->j:Ljava/lang/Object;

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    invoke-direct {v1, v3, v4, v5}, Ls5/c$d$a;-><init>(LR0/f$a;Ljava/lang/Object;Ln7/f;)V

    .line 41
    .line 42
    .line 43
    iput v2, p0, Ls5/c$d;->g:I

    .line 44
    .line 45
    invoke-static {p1, v1, p0}, LR0/j;->a(LN0/i;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    if-ne p1, v0, :cond_2

    .line 50
    .line 51
    return-object v0

    .line 52
    :cond_2
    return-object p1
.end method
