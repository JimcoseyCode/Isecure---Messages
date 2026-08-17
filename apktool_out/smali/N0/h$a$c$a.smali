.class final LN0/h$a$c$a;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/h$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field final synthetic h:LN0/g;


# direct methods
.method constructor <init>(LN0/g;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/h$a$c$a;->h:LN0/g;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ln7/f;)Ln7/f;
    .locals 2

    .line 1
    new-instance v0, LN0/h$a$c$a;

    .line 2
    .line 3
    iget-object v1, p0, LN0/h$a$c$a;->h:LN0/g;

    .line 4
    .line 5
    invoke-direct {v0, v1, p1}, LN0/h$a$c$a;-><init>(LN0/g;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ln7/f;

    invoke-virtual {p0, p1}, LN0/h$a$c$a;->invoke(Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 2
    invoke-virtual {p0, p1}, LN0/h$a$c$a;->create(Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, LN0/h$a$c$a;

    sget-object v0, Li7/B;->a:Li7/B;

    invoke-virtual {p1, v0}, LN0/h$a$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN0/h$a$c$a;->g:I

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
    goto :goto_0

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
    iget-object p1, p0, LN0/h$a$c$a;->h:LN0/g;

    .line 28
    .line 29
    iput v2, p0, LN0/h$a$c$a;->g:I

    .line 30
    .line 31
    invoke-interface {p1, p0}, LN0/g;->a(Ln7/f;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p1, v0, :cond_2

    .line 36
    .line 37
    return-object v0

    .line 38
    :cond_2
    :goto_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 39
    .line 40
    return-object p1
.end method
