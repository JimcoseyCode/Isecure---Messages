.class public final LN0/k$d$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:LU8/b;


# direct methods
.method public constructor <init>(LU8/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$d$e;->g:LU8/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LN0/k$d$e;->g:LU8/b;

    .line 2
    .line 3
    new-instance v1, LN0/k$d$e$a;

    .line 4
    .line 5
    invoke-direct {v1, p1}, LN0/k$d$e$a;-><init>(LU8/c;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1, p2}, LU8/b;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    if-ne p1, p2, :cond_0

    .line 17
    .line 18
    return-object p1

    .line 19
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 20
    .line 21
    return-object p1
.end method
