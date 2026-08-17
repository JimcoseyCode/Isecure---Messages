.class final LN0/k$u;
.super Lkotlin/jvm/internal/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k;-><init>(LN0/E;Ljava/util/List;LN0/e;LR8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic h:LN0/k;


# direct methods
.method constructor <init>(LN0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$u;->h:LN0/k;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/n;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, LN0/k$u;->h:LN0/k;

    .line 4
    .line 5
    invoke-static {v0}, LN0/k;->e(LN0/k;)LN0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, LN0/r;

    .line 10
    .line 11
    invoke-direct {v1, p1}, LN0/r;-><init>(Ljava/lang/Throwable;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, LN0/l;->c(LN0/D;)LN0/D;

    .line 15
    .line 16
    .line 17
    :cond_0
    iget-object p1, p0, LN0/k$u;->h:LN0/k;

    .line 18
    .line 19
    invoke-static {p1}, LN0/k;->h(LN0/k;)Lkotlin/Lazy;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p1}, Lkotlin/Lazy;->e()Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, LN0/k$u;->h:LN0/k;

    .line 30
    .line 31
    invoke-virtual {p1}, LN0/k;->t()LN0/F;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-interface {p1}, LN0/c;->close()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LN0/k$u;->a(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Li7/B;->a:Li7/B;

    .line 7
    .line 8
    return-object p1
.end method
