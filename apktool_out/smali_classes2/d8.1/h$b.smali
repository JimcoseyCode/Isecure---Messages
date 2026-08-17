.class public final Ld8/h$b;
.super Ld8/h$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld8/h;->x(Lk8/b;LL7/h0;Ljava/util/List;)Ld8/x$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final b:Ljava/util/HashMap;

.field final synthetic c:Ld8/h;

.field final synthetic d:LL7/e;

.field final synthetic e:Lk8/b;

.field final synthetic f:Ljava/util/List;

.field final synthetic g:LL7/h0;


# direct methods
.method constructor <init>(Ld8/h;LL7/e;Lk8/b;Ljava/util/List;LL7/h0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ld8/h$b;->c:Ld8/h;

    .line 2
    .line 3
    iput-object p2, p0, Ld8/h$b;->d:LL7/e;

    .line 4
    .line 5
    iput-object p3, p0, Ld8/h$b;->e:Lk8/b;

    .line 6
    .line 7
    iput-object p4, p0, Ld8/h$b;->f:Ljava/util/List;

    .line 8
    .line 9
    iput-object p5, p0, Ld8/h$b;->g:LL7/h0;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Ld8/h$a;-><init>(Ld8/h;)V

    .line 12
    .line 13
    .line 14
    new-instance p1, Ljava/util/HashMap;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Ld8/h$b;->b:Ljava/util/HashMap;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Ld8/h$b;->c:Ld8/h;

    .line 2
    .line 3
    iget-object v1, p0, Ld8/h$b;->e:Lk8/b;

    .line 4
    .line 5
    iget-object v2, p0, Ld8/h$b;->b:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ld8/d;->F(Lk8/b;Ljava/util/Map;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v0, p0, Ld8/h$b;->c:Ld8/h;

    .line 15
    .line 16
    iget-object v1, p0, Ld8/h$b;->e:Lk8/b;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ld8/e;->w(Lk8/b;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    :goto_0
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Ld8/h$b;->f:Ljava/util/List;

    .line 26
    .line 27
    new-instance v1, LM7/d;

    .line 28
    .line 29
    iget-object v2, p0, Ld8/h$b;->d:LL7/e;

    .line 30
    .line 31
    invoke-interface {v2}, LL7/e;->r()LC8/d0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v3, p0, Ld8/h$b;->b:Ljava/util/HashMap;

    .line 36
    .line 37
    iget-object v4, p0, Ld8/h$b;->g:LL7/h0;

    .line 38
    .line 39
    invoke-direct {v1, v2, v3, v4}, LM7/d;-><init>(LC8/S;Ljava/util/Map;LL7/h0;)V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public g(Lk8/f;Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    const-string v0, "elements"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    iget-object v0, p0, Ld8/h$b;->d:LL7/e;

    .line 10
    .line 11
    invoke-static {p1, v0}, LV7/a;->b(Lk8/f;LL7/e;)LL7/t0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Ld8/h$b;->b:Ljava/util/HashMap;

    .line 18
    .line 19
    sget-object v2, Lq8/i;->a:Lq8/i;

    .line 20
    .line 21
    invoke-static {p2}, LM8/a;->c(Ljava/util/ArrayList;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {v0}, LL7/s0;->getType()LC8/S;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v3, "getType(...)"

    .line 30
    .line 31
    invoke-static {v0, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2, p2, v0}, Lq8/i;->b(Ljava/util/List;LC8/S;)Lq8/b;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-interface {v1, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :cond_1
    iget-object v0, p0, Ld8/h$b;->c:Ld8/h;

    .line 43
    .line 44
    iget-object v1, p0, Ld8/h$b;->e:Lk8/b;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ld8/e;->w(Lk8/b;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p1}, Lk8/f;->j()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const-string v0, "value"

    .line 57
    .line 58
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_4

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-eqz v0, :cond_3

    .line 78
    .line 79
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    instance-of v1, v0, Lq8/a;

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    iget-object p2, p0, Ld8/h$b;->f:Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_4

    .line 102
    .line 103
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lq8/a;

    .line 108
    .line 109
    invoke-virtual {v0}, Lq8/g;->b()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, LM7/c;

    .line 114
    .line 115
    invoke-interface {p2, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    :goto_2
    return-void
.end method

.method public h(Lk8/f;Lq8/g;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Ld8/h$b;->b:Ljava/util/HashMap;

    .line 9
    .line 10
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method
