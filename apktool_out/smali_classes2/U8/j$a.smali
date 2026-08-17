.class public final LU8/j$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/j;->a(LU8/b;Lkotlin/jvm/functions/Function2;)LU8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:LU8/b;

.field final synthetic h:Lkotlin/jvm/functions/Function2;


# direct methods
.method public constructor <init>(LU8/b;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU8/j$a;->g:LU8/b;

    .line 2
    .line 3
    iput-object p2, p0, LU8/j$a;->h:Lkotlin/jvm/functions/Function2;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public b(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/z;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LU8/j$a;->g:LU8/b;

    .line 7
    .line 8
    new-instance v2, LU8/j$b;

    .line 9
    .line 10
    iget-object v3, p0, LU8/j$a;->h:Lkotlin/jvm/functions/Function2;

    .line 11
    .line 12
    invoke-direct {v2, v0, p1, v3}, LU8/j$b;-><init>(Lkotlin/jvm/internal/z;LU8/c;Lkotlin/jvm/functions/Function2;)V

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v2, p2}, LU8/b;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-object p1

    .line 26
    :cond_0
    sget-object p1, Li7/B;->a:Li7/B;

    .line 27
    .line 28
    return-object p1
.end method
