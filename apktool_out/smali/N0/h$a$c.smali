.class final LN0/h$a$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/h$a;->c(Ljava/util/List;LN0/s;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field h:Ljava/lang/Object;

.field i:Ljava/lang/Object;

.field j:I

.field synthetic k:Ljava/lang/Object;

.field final synthetic l:Ljava/util/List;

.field final synthetic m:Ljava/util/List;


# direct methods
.method constructor <init>(Ljava/util/List;Ljava/util/List;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/h$a$c;->l:Ljava/util/List;

    .line 2
    .line 3
    iput-object p2, p0, LN0/h$a$c;->m:Ljava/util/List;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN0/h$a$c;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LN0/h$a$c;

    .line 6
    .line 7
    sget-object p2, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LN0/h$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 3

    .line 1
    new-instance v0, LN0/h$a$c;

    .line 2
    .line 3
    iget-object v1, p0, LN0/h$a$c;->l:Ljava/util/List;

    .line 4
    .line 5
    iget-object v2, p0, LN0/h$a$c;->m:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {v0, v1, v2, p2}, LN0/h$a$c;-><init>(Ljava/util/List;Ljava/util/List;Ln7/f;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, v0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ln7/f;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LN0/h$a$c;->c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN0/h$a$c;->j:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    if-eq v1, v3, :cond_1

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, LN0/h$a$c;->g:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, Ljava/util/Iterator;

    .line 18
    .line 19
    iget-object v4, p0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Ljava/util/List;

    .line 22
    .line 23
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 28
    .line 29
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 30
    .line 31
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw p1

    .line 35
    :cond_1
    iget-object v1, p0, LN0/h$a$c;->i:Ljava/lang/Object;

    .line 36
    .line 37
    iget-object v4, p0, LN0/h$a$c;->h:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v4, LN0/g;

    .line 40
    .line 41
    iget-object v5, p0, LN0/h$a$c;->g:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v5, Ljava/util/Iterator;

    .line 44
    .line 45
    iget-object v6, p0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v6, Ljava/util/List;

    .line 48
    .line 49
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v8, v6

    .line 53
    move-object v6, v4

    .line 54
    move-object v4, v8

    .line 55
    goto :goto_1

    .line 56
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 60
    .line 61
    iget-object v1, p0, LN0/h$a$c;->l:Ljava/util/List;

    .line 62
    .line 63
    iget-object v4, p0, LN0/h$a$c;->m:Ljava/util/List;

    .line 64
    .line 65
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_6

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, LN0/g;

    .line 80
    .line 81
    iput-object v4, p0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 82
    .line 83
    iput-object v1, p0, LN0/h$a$c;->g:Ljava/lang/Object;

    .line 84
    .line 85
    iput-object v5, p0, LN0/h$a$c;->h:Ljava/lang/Object;

    .line 86
    .line 87
    iput-object p1, p0, LN0/h$a$c;->i:Ljava/lang/Object;

    .line 88
    .line 89
    iput v3, p0, LN0/h$a$c;->j:I

    .line 90
    .line 91
    invoke-interface {v5, p1, p0}, LN0/g;->c(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    if-ne v6, v0, :cond_3

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_3
    move-object v8, v1

    .line 99
    move-object v1, p1

    .line 100
    move-object p1, v6

    .line 101
    move-object v6, v5

    .line 102
    move-object v5, v8

    .line 103
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    new-instance p1, LN0/h$a$c$a;

    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    invoke-direct {p1, v6, v7}, LN0/h$a$c$a;-><init>(LN0/g;Ln7/f;)V

    .line 115
    .line 116
    .line 117
    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    iput-object v4, p0, LN0/h$a$c;->k:Ljava/lang/Object;

    .line 121
    .line 122
    iput-object v5, p0, LN0/h$a$c;->g:Ljava/lang/Object;

    .line 123
    .line 124
    iput-object v7, p0, LN0/h$a$c;->h:Ljava/lang/Object;

    .line 125
    .line 126
    iput-object v7, p0, LN0/h$a$c;->i:Ljava/lang/Object;

    .line 127
    .line 128
    iput v2, p0, LN0/h$a$c;->j:I

    .line 129
    .line 130
    invoke-interface {v6, v1, p0}, LN0/g;->b(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    if-ne p1, v0, :cond_4

    .line 135
    .line 136
    :goto_2
    return-object v0

    .line 137
    :cond_4
    :goto_3
    move-object v1, v5

    .line 138
    goto :goto_0

    .line 139
    :cond_5
    move-object p1, v1

    .line 140
    goto :goto_3

    .line 141
    :cond_6
    return-object p1
.end method
