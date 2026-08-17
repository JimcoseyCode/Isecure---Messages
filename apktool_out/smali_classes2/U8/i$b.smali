.class public final LU8/i$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LU8/i;->d(LU8/b;Lw7/o;)LU8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:LU8/b;

.field final synthetic h:Lw7/o;


# direct methods
.method public constructor <init>(LU8/b;Lw7/o;)V
    .locals 0

    .line 1
    iput-object p1, p0, LU8/i$b;->g:LU8/b;

    .line 2
    .line 3
    iput-object p2, p0, LU8/i$b;->h:Lw7/o;

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
    .locals 8

    .line 1
    instance-of v0, p2, LU8/i$b$a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, LU8/i$b$a;

    .line 7
    .line 8
    iget v1, v0, LU8/i$b$a;->h:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, LU8/i$b$a;->h:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, LU8/i$b$a;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, LU8/i$b$a;-><init>(LU8/i$b;Ln7/f;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, LU8/i$b$a;->g:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, LU8/i$b$a;->h:I

    .line 32
    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    const/4 v6, 0x0

    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    iget-object p1, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, LV8/o;

    .line 48
    .line 49
    :try_start_0
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    goto :goto_2

    .line 53
    :catchall_0
    move-exception p2

    .line 54
    goto :goto_3

    .line 55
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    iget-object p1, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Throwable;

    .line 66
    .line 67
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_3
    iget-object p1, v0, LU8/i$b$a;->k:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, LU8/c;

    .line 75
    .line 76
    iget-object v2, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, LU8/i$b;

    .line 79
    .line 80
    :try_start_1
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :catchall_1
    move-exception p1

    .line 85
    goto :goto_4

    .line 86
    :cond_4
    invoke-static {p2}, Li7/p;->b(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    :try_start_2
    iget-object p2, p0, LU8/i$b;->g:LU8/b;

    .line 90
    .line 91
    iput-object p0, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p1, v0, LU8/i$b$a;->k:Ljava/lang/Object;

    .line 94
    .line 95
    iput v5, v0, LU8/i$b$a;->h:I

    .line 96
    .line 97
    invoke-interface {p2, p1, v0}, LU8/b;->b(LU8/c;Ln7/f;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 101
    if-ne p2, v1, :cond_5

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    move-object v2, p0

    .line 105
    :goto_1
    new-instance p2, LV8/o;

    .line 106
    .line 107
    invoke-interface {v0}, Ln7/f;->getContext()Ln7/j;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-direct {p2, p1, v4}, LV8/o;-><init>(LU8/c;Ln7/j;)V

    .line 112
    .line 113
    .line 114
    :try_start_3
    iget-object p1, v2, LU8/i$b;->h:Lw7/o;

    .line 115
    .line 116
    iput-object p2, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 117
    .line 118
    iput-object v6, v0, LU8/i$b$a;->k:Ljava/lang/Object;

    .line 119
    .line 120
    iput v3, v0, LU8/i$b$a;->h:I

    .line 121
    .line 122
    const/4 v2, 0x6

    .line 123
    invoke-static {v2}, Lkotlin/jvm/internal/k;->c(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {p1, p2, v6, v0}, Lw7/o;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    const/4 v0, 0x7

    .line 131
    invoke-static {v0}, Lkotlin/jvm/internal/k;->c(I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 132
    .line 133
    .line 134
    if-ne p1, v1, :cond_6

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_6
    move-object p1, p2

    .line 138
    :goto_2
    invoke-virtual {p1}, LV8/o;->releaseIntercepted()V

    .line 139
    .line 140
    .line 141
    sget-object p1, Li7/B;->a:Li7/B;

    .line 142
    .line 143
    return-object p1

    .line 144
    :catchall_2
    move-exception p1

    .line 145
    move-object v7, p2

    .line 146
    move-object p2, p1

    .line 147
    move-object p1, v7

    .line 148
    :goto_3
    invoke-virtual {p1}, LV8/o;->releaseIntercepted()V

    .line 149
    .line 150
    .line 151
    throw p2

    .line 152
    :catchall_3
    move-exception p1

    .line 153
    move-object v2, p0

    .line 154
    :goto_4
    new-instance p2, LU8/t;

    .line 155
    .line 156
    invoke-direct {p2, p1}, LU8/t;-><init>(Ljava/lang/Throwable;)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v2, LU8/i$b;->h:Lw7/o;

    .line 160
    .line 161
    iput-object p1, v0, LU8/i$b$a;->j:Ljava/lang/Object;

    .line 162
    .line 163
    iput-object v6, v0, LU8/i$b$a;->k:Ljava/lang/Object;

    .line 164
    .line 165
    iput v4, v0, LU8/i$b$a;->h:I

    .line 166
    .line 167
    invoke-static {p2, v2, p1, v0}, LU8/i;->a(LU8/c;Lw7/o;Ljava/lang/Throwable;Ln7/f;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p2

    .line 171
    if-ne p2, v1, :cond_7

    .line 172
    .line 173
    :goto_5
    return-object v1

    .line 174
    :cond_7
    :goto_6
    throw p1
.end method
