.class public final LK7/a;
.super Lv8/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LK7/a$a;
    }
.end annotation


# static fields
.field public static final e:LK7/a$a;

.field private static final f:Lk8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LK7/a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LK7/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LK7/a;->e:LK7/a$a;

    .line 8
    .line 9
    const-string v0, "clone"

    .line 10
    .line 11
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "identifier(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    sput-object v0, LK7/a;->f:Lk8/f;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(LB8/n;LL7/e;)V
    .locals 1

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingClass"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2}, Lv8/f;-><init>(LB8/n;LL7/e;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static final synthetic n()Lk8/f;
    .locals 1

    .line 1
    sget-object v0, LK7/a;->f:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method protected j()Ljava/util/List;
    .locals 14

    .line 1
    invoke-virtual {p0}, Lv8/f;->m()LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 6
    .line 7
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    sget-object v2, LK7/a;->f:Lk8/f;

    .line 12
    .line 13
    sget-object v3, LL7/b$a;->g:LL7/b$a;

    .line 14
    .line 15
    sget-object v4, LL7/h0;->a:LL7/h0;

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3, v4}, LO7/O;->i1(LL7/m;LM7/h;Lk8/f;LL7/b$a;LL7/h0;)LO7/O;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-virtual {p0}, Lv8/f;->m()LL7/e;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, LL7/e;->G0()LL7/c0;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v10

    .line 41
    invoke-virtual {p0}, Lv8/f;->m()LL7/e;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-static {v0}, Ls8/e;->m(LL7/m;)LI7/i;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, LI7/i;->i()LC8/d0;

    .line 50
    .line 51
    .line 52
    move-result-object v11

    .line 53
    sget-object v12, LL7/E;->j:LL7/E;

    .line 54
    .line 55
    sget-object v13, LL7/t;->c:LL7/u;

    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-virtual/range {v5 .. v13}, LO7/O;->k1(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;)LO7/O;

    .line 59
    .line 60
    .line 61
    invoke-static {v5}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    return-object v0
.end method
