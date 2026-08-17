.class final Lo8/o$g;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo8/o;->p(LL7/b;Ljava/util/Queue;Lo8/n;)Ljava/util/Collection;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic g:Lo8/n;

.field final synthetic h:LL7/b;


# direct methods
.method constructor <init>(Lo8/n;LL7/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo8/o$g;->g:Lo8/n;

    .line 2
    .line 3
    iput-object p2, p0, Lo8/o$g;->h:LL7/b;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(LL7/b;)Li7/B;
    .locals 2

    .line 1
    iget-object v0, p0, Lo8/o$g;->g:Lo8/n;

    .line 2
    .line 3
    iget-object v1, p0, Lo8/o$g;->h:LL7/b;

    .line 4
    .line 5
    invoke-virtual {v0, v1, p1}, Lo8/n;->b(LL7/b;LL7/b;)V

    .line 6
    .line 7
    .line 8
    sget-object p1, Li7/B;->a:Li7/B;

    .line 9
    .line 10
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LL7/b;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lo8/o$g;->a(LL7/b;)Li7/B;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
