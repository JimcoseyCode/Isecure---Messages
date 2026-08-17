.class final Lcom/canhub/cropper/b$c;
.super Lkotlin/coroutines/jvm/internal/l;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/canhub/cropper/b;->j()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# instance fields
.field g:I

.field private synthetic h:Ljava/lang/Object;

.field final synthetic i:Lcom/canhub/cropper/b;


# direct methods
.method constructor <init>(Lcom/canhub/cropper/b;Ln7/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

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
.method public final create(Ljava/lang/Object;Ln7/f;)Ln7/f;
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/b$c;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 4
    .line 5
    invoke-direct {v0, v1, p2}, Lcom/canhub/cropper/b$c;-><init>(Lcom/canhub/cropper/b;Ln7/f;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lcom/canhub/cropper/b$c;->h:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
.end method

.method public final invoke(LR8/N;Ln7/f;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/b$c;->create(Ljava/lang/Object;Ln7/f;)Ln7/f;

    move-result-object p1

    check-cast p1, Lcom/canhub/cropper/b$c;

    sget-object p2, Li7/B;->a:Li7/B;

    invoke-virtual {p1, p2}, Lcom/canhub/cropper/b$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, LR8/N;

    check-cast p2, Ln7/f;

    invoke-virtual {p0, p1, p2}, Lcom/canhub/cropper/b$c;->invoke(LR8/N;Ln7/f;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    iget v0, p0, Lcom/canhub/cropper/b$c;->g:I

    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    goto/16 :goto_2

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :try_start_0
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto/16 :goto_2

    .line 32
    .line 33
    :catch_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    move-object v10, p1

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    invoke-static {p1}, Li7/p;->b(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/canhub/cropper/b$c;->h:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, LR8/N;

    .line 43
    .line 44
    :try_start_1
    invoke-static {p1}, LR8/O;->e(LR8/N;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    sget-object v0, Lcom/canhub/cropper/d;->a:Lcom/canhub/cropper/d;

    .line 51
    .line 52
    iget-object v4, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 53
    .line 54
    invoke-static {v4}, Lcom/canhub/cropper/b;->a(Lcom/canhub/cropper/b;)Landroid/content/Context;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    iget-object v5, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 59
    .line 60
    invoke-virtual {v5}, Lcom/canhub/cropper/b;->g()Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    iget-object v6, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 65
    .line 66
    invoke-static {v6}, Lcom/canhub/cropper/b;->d(Lcom/canhub/cropper/b;)I

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    iget-object v7, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 71
    .line 72
    invoke-static {v7}, Lcom/canhub/cropper/b;->c(Lcom/canhub/cropper/b;)I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    invoke-virtual {v0, v4, v5, v6, v7}, Lcom/canhub/cropper/d;->l(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/d$a;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    invoke-static {p1}, LR8/O;->e(LR8/N;)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    invoke-virtual {v4}, Lcom/canhub/cropper/d$a;->a()Landroid/graphics/Bitmap;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    iget-object v5, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 91
    .line 92
    invoke-static {v5}, Lcom/canhub/cropper/b;->a(Lcom/canhub/cropper/b;)Landroid/content/Context;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    iget-object v6, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 97
    .line 98
    invoke-virtual {v6}, Lcom/canhub/cropper/b;->g()Landroid/net/Uri;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-virtual {v0, p1, v5, v6}, Lcom/canhub/cropper/d;->F(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/net/Uri;)Lcom/canhub/cropper/d$b;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iget-object v0, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 107
    .line 108
    new-instance v5, Lcom/canhub/cropper/b$a;

    .line 109
    .line 110
    invoke-virtual {v0}, Lcom/canhub/cropper/b;->g()Landroid/net/Uri;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-virtual {p1}, Lcom/canhub/cropper/d$b;->a()Landroid/graphics/Bitmap;

    .line 115
    .line 116
    .line 117
    move-result-object v7

    .line 118
    invoke-virtual {v4}, Lcom/canhub/cropper/d$a;->b()I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    invoke-virtual {p1}, Lcom/canhub/cropper/d$b;->b()I

    .line 123
    .line 124
    .line 125
    move-result v9

    .line 126
    invoke-virtual {p1}, Lcom/canhub/cropper/d$b;->c()Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    invoke-virtual {p1}, Lcom/canhub/cropper/d$b;->d()Z

    .line 131
    .line 132
    .line 133
    move-result v11

    .line 134
    const/4 v12, 0x0

    .line 135
    invoke-direct/range {v5 .. v12}, Lcom/canhub/cropper/b$a;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 136
    .line 137
    .line 138
    iput v3, p0, Lcom/canhub/cropper/b$c;->g:I

    .line 139
    .line 140
    invoke-static {v0, v5, p0}, Lcom/canhub/cropper/b;->e(Lcom/canhub/cropper/b;Lcom/canhub/cropper/b$a;Ln7/f;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 144
    if-ne p1, v1, :cond_3

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :goto_0
    iget-object p1, p0, Lcom/canhub/cropper/b$c;->i:Lcom/canhub/cropper/b;

    .line 148
    .line 149
    new-instance v3, Lcom/canhub/cropper/b$a;

    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/canhub/cropper/b;->g()Landroid/net/Uri;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    const/4 v8, 0x0

    .line 156
    const/4 v9, 0x0

    .line 157
    const/4 v5, 0x0

    .line 158
    const/4 v6, 0x0

    .line 159
    const/4 v7, 0x0

    .line 160
    invoke-direct/range {v3 .. v10}, Lcom/canhub/cropper/b$a;-><init>(Landroid/net/Uri;Landroid/graphics/Bitmap;IIZZLjava/lang/Exception;)V

    .line 161
    .line 162
    .line 163
    iput v2, p0, Lcom/canhub/cropper/b$c;->g:I

    .line 164
    .line 165
    invoke-static {p1, v3, p0}, Lcom/canhub/cropper/b;->e(Lcom/canhub/cropper/b;Lcom/canhub/cropper/b$a;Ln7/f;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    if-ne p1, v1, :cond_3

    .line 170
    .line 171
    :goto_1
    return-object v1

    .line 172
    :cond_3
    :goto_2
    sget-object p1, Li7/B;->a:Li7/B;

    .line 173
    .line 174
    return-object p1
.end method
