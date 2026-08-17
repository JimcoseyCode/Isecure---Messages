.class final LN0/k$i$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field final synthetic g:LN0/k;


# direct methods
.method constructor <init>(LN0/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$i$a;->g:LN0/k;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Li7/B;Ln7/f;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p1, p0, LN0/k$i$a;->g:LN0/k;

    .line 2
    .line 3
    invoke-static {p1}, LN0/k;->e(LN0/k;)LN0/l;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, LN0/l;->a()LN0/D;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    instance-of p1, p1, LN0/r;

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    iget-object p1, p0, LN0/k$i$a;->g:LN0/k;

    .line 16
    .line 17
    const/4 v0, 0x1

    .line 18
    invoke-static {p1, v0, p2}, LN0/k;->m(LN0/k;ZLn7/f;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    if-ne p1, p2, :cond_0

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 30
    .line 31
    return-object p1

    .line 32
    :cond_1
    sget-object p1, Li7/B;->a:Li7/B;

    .line 33
    .line 34
    return-object p1
.end method

.method public bridge synthetic l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Li7/B;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LN0/k$i$a;->b(Li7/B;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
