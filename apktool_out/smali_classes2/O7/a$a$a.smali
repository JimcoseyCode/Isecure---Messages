.class LO7/a$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO7/a$a;->a()LC8/d0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LO7/a$a;


# direct methods
.method constructor <init>(LO7/a$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO7/a$a$a;->g:LO7/a$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LD8/g;)LC8/d0;
    .locals 2

    .line 1
    iget-object v0, p0, LO7/a$a$a;->g:LO7/a$a;

    .line 2
    .line 3
    iget-object v0, v0, LO7/a$a;->g:LO7/a;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, LD8/g;->f(LL7/m;)LL7/h;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, LO7/a$a$a;->g:LO7/a$a;

    .line 12
    .line 13
    iget-object p1, p1, LO7/a$a;->g:LO7/a;

    .line 14
    .line 15
    iget-object p1, p1, LO7/a;->i:LB8/i;

    .line 16
    .line 17
    invoke-interface {p1}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    check-cast p1, LC8/d0;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    instance-of v1, v0, LL7/l0;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    move-object p1, v0

    .line 29
    check-cast p1, LL7/l0;

    .line 30
    .line 31
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-interface {v0}, LC8/v0;->getParameters()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-static {v0}, LC8/J0;->g(Ljava/util/List;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {p1, v0}, LC8/V;->c(LL7/l0;Ljava/util/List;)LC8/d0;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    return-object p1

    .line 48
    :cond_1
    instance-of v1, v0, LO7/z;

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1, p1}, LC8/v0;->o(LD8/g;)LC8/v0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v0, LO7/z;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, LO7/z;->L(LD8/g;)Lv8/k;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-static {v1, p1, p0}, LC8/J0;->u(LC8/v0;Lv8/k;Lkotlin/jvm/functions/Function1;)LC8/d0;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_2
    invoke-interface {v0}, LL7/h;->r()LC8/d0;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LD8/g;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LO7/a$a$a;->a(LD8/g;)LC8/d0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
