.class final LN0/k$d;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LN0/k;-><init>(LN0/E;Ljava/util/List;LN0/e;LR8/N;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:Ljava/lang/Object;

.field h:I

.field private synthetic i:Ljava/lang/Object;

.field final synthetic j:LN0/k;


# direct methods
.method constructor <init>(LN0/k;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, LN0/k$d;->j:LN0/k;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/l;-><init>(ILn7/f;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c(LU8/c;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, LN0/k$d;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, LN0/k$d;

    .line 6
    .line 7
    sget-object p2, Li7/B;->a:Li7/B;

    .line 8
    .line 9
    invoke-virtual {p1, p2}, LN0/k$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2

    .line 1
    new-instance v0, LN0/k$d;

    .line 2
    .line 3
    iget-object v1, p0, LN0/k$d;->j:LN0/k;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, LN0/k$d;-><init>(LN0/k;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, LN0/k$d;->i:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LU8/c;

    .line 2
    .line 3
    check-cast p2, Ln7/f;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, LN0/k$d;->c(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget v1, p0, LN0/k$d;->h:I

    .line 6
    .line 7
    const/4 v2, 0x3

    .line 8
    const/4 v3, 0x2

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    if-eq v1, v4, :cond_2

    .line 13
    .line 14
    if-eq v1, v3, :cond_1

    .line 15
    .line 16
    if-ne v1, v2, :cond_0

    .line 17
    .line 18
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    goto/16 :goto_4

    .line 22
    .line 23
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :cond_1
    iget-object v1, p0, LN0/k$d;->g:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, LN0/D;

    .line 34
    .line 35
    iget-object v3, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v3, LU8/c;

    .line 38
    .line 39
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    iget-object v1, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v1, LU8/c;

    .line 46
    .line 47
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_3
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast p1, LU8/c;

    .line 57
    .line 58
    iget-object v1, p0, LN0/k$d;->j:LN0/k;

    .line 59
    .line 60
    iput-object p1, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 61
    .line 62
    iput v4, p0, LN0/k$d;->h:I

    .line 63
    .line 64
    const/4 v4, 0x0

    .line 65
    invoke-static {v1, v4, p0}, LN0/k;->p(LN0/k;ZLn7/f;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-ne v1, v0, :cond_4

    .line 70
    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_4
    move-object v7, v1

    .line 74
    move-object v1, p1

    .line 75
    move-object p1, v7

    .line 76
    :goto_0
    check-cast p1, LN0/D;

    .line 77
    .line 78
    instance-of v4, p1, LN0/f;

    .line 79
    .line 80
    if-eqz v4, :cond_6

    .line 81
    .line 82
    move-object v4, p1

    .line 83
    check-cast v4, LN0/f;

    .line 84
    .line 85
    invoke-virtual {v4}, LN0/f;->c()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    iput-object v1, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 90
    .line 91
    iput-object p1, p0, LN0/k$d;->g:Ljava/lang/Object;

    .line 92
    .line 93
    iput v3, p0, LN0/k$d;->h:I

    .line 94
    .line 95
    invoke-interface {v1, v4, p0}, LU8/c;->l(Ljava/lang/Object;Ln7/f;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v3

    .line 99
    if-ne v3, v0, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move-object v3, v1

    .line 103
    move-object v1, p1

    .line 104
    :goto_1
    move-object p1, v1

    .line 105
    move-object v1, v3

    .line 106
    goto :goto_2

    .line 107
    :cond_6
    instance-of v3, p1, LN0/H;

    .line 108
    .line 109
    if-nez v3, :cond_a

    .line 110
    .line 111
    instance-of v3, p1, LN0/x;

    .line 112
    .line 113
    if-nez v3, :cond_9

    .line 114
    .line 115
    instance-of v3, p1, LN0/r;

    .line 116
    .line 117
    if-eqz v3, :cond_7

    .line 118
    .line 119
    sget-object p1, Li7/B;->a:Li7/B;

    .line 120
    .line 121
    return-object p1

    .line 122
    :cond_7
    :goto_2
    iget-object v3, p0, LN0/k$d;->j:LN0/k;

    .line 123
    .line 124
    invoke-static {v3}, LN0/k;->e(LN0/k;)LN0/l;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    invoke-virtual {v3}, LN0/l;->b()LU8/b;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    new-instance v4, LN0/k$d$a;

    .line 133
    .line 134
    iget-object v5, p0, LN0/k$d;->j:LN0/k;

    .line 135
    .line 136
    const/4 v6, 0x0

    .line 137
    invoke-direct {v4, v5, v6}, LN0/k$d$a;-><init>(LN0/k;Ln7/f;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v3, v4}, LU8/d;->k(LU8/b;Lkotlin/jvm/functions/Function2;)LU8/b;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    new-instance v4, LN0/k$d$b;

    .line 145
    .line 146
    invoke-direct {v4, v6}, LN0/k$d$b;-><init>(Ln7/f;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v3, v4}, LU8/d;->l(LU8/b;Lkotlin/jvm/functions/Function2;)LU8/b;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    new-instance v4, LN0/k$d$c;

    .line 154
    .line 155
    invoke-direct {v4, p1, v6}, LN0/k$d$c;-><init>(LN0/D;Ln7/f;)V

    .line 156
    .line 157
    .line 158
    invoke-static {v3, v4}, LU8/d;->d(LU8/b;Lkotlin/jvm/functions/Function2;)LU8/b;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v3, LN0/k$d$e;

    .line 163
    .line 164
    invoke-direct {v3, p1}, LN0/k$d$e;-><init>(LU8/b;)V

    .line 165
    .line 166
    .line 167
    new-instance p1, LN0/k$d$d;

    .line 168
    .line 169
    iget-object v4, p0, LN0/k$d;->j:LN0/k;

    .line 170
    .line 171
    invoke-direct {p1, v4, v6}, LN0/k$d$d;-><init>(LN0/k;Ln7/f;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v3, p1}, LU8/d;->j(LU8/b;Lw7/o;)LU8/b;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object v6, p0, LN0/k$d;->i:Ljava/lang/Object;

    .line 179
    .line 180
    iput-object v6, p0, LN0/k$d;->g:Ljava/lang/Object;

    .line 181
    .line 182
    iput v2, p0, LN0/k$d;->h:I

    .line 183
    .line 184
    invoke-static {v1, p1, p0}, LU8/d;->f(LU8/c;LU8/b;Ln7/f;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    if-ne p1, v0, :cond_8

    .line 189
    .line 190
    :goto_3
    return-object v0

    .line 191
    :cond_8
    :goto_4
    sget-object p1, Li7/B;->a:Li7/B;

    .line 192
    .line 193
    return-object p1

    .line 194
    :cond_9
    check-cast p1, LN0/x;

    .line 195
    .line 196
    invoke-virtual {p1}, LN0/x;->b()Ljava/lang/Throwable;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    throw p1

    .line 201
    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v0, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    .line 204
    .line 205
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p1
.end method
