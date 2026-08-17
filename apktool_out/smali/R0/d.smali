.class public final LR0/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LN0/i;


# instance fields
.field private final a:LN0/i;


# direct methods
.method public constructor <init>(LN0/i;)V
    .locals 1

    .line 1
    const-string v0, "delegate"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LR0/d;->a:LN0/i;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public b()LU8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LR0/d;->a:LN0/i;

    .line 2
    .line 3
    invoke-interface {v0}, LN0/i;->b()LU8/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-object v0, p0, LR0/d;->a:LN0/i;

    .line 2
    .line 3
    new-instance v1, LR0/d$a;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v1, p1, v2}, LR0/d$a;-><init>(Lkotlin/jvm/functions/Function2;Ln7/f;)V

    .line 7
    .line 8
    .line 9
    invoke-interface {v0, v1, p2}, LN0/i;->c(Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method
