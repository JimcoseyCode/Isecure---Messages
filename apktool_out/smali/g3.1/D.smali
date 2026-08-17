.class public Lg3/D;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lg3/B;

.field private b:Lcom/facebook/imagepipeline/memory/f;

.field private c:Lg3/i;

.field private d:Lcom/facebook/imagepipeline/memory/f;

.field private e:Lcom/facebook/imagepipeline/memory/d;

.field private f:Lcom/facebook/imagepipeline/memory/f;

.field private g:Lf2/i;

.field private h:Lf2/l;

.field private i:Lf2/a;


# direct methods
.method public constructor <init>(Lg3/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Lg3/B;

    .line 9
    .line 10
    iput-object p1, p0, Lg3/D;->a:Lg3/B;

    .line 11
    .line 12
    return-void
.end method

.method private a()Lcom/facebook/imagepipeline/memory/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/AshmemMemoryChunkPool;

    .line 7
    .line 8
    const-class v2, Lf2/d;

    .line 9
    .line 10
    const-class v3, Lg3/E;

    .line 11
    .line 12
    const-class v4, Lg3/F;

    .line 13
    .line 14
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 23
    .line 24
    invoke-virtual {v2}, Lg3/B;->i()Lf2/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Lg3/D;->a:Lg3/B;

    .line 29
    .line 30
    invoke-virtual {v3}, Lg3/B;->g()Lg3/E;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 35
    .line 36
    invoke-virtual {v4}, Lg3/B;->h()Lg3/F;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/facebook/imagepipeline/memory/f;

    .line 49
    .line 50
    iput-object v1, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    iput-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_1
    iput-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_2
    iput-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_3
    iput-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_4
    iput-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 66
    .line 67
    :cond_0
    :goto_0
    iget-object v0, p0, Lg3/D;->b:Lcom/facebook/imagepipeline/memory/f;

    .line 68
    .line 69
    return-object v0
.end method

.method private f(I)Lcom/facebook/imagepipeline/memory/f;
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lg3/D;->a()Lcom/facebook/imagepipeline/memory/f;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 15
    .line 16
    const-string v0, "Invalid MemoryChunkType"

    .line 17
    .line 18
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p1

    .line 22
    :cond_1
    invoke-virtual {p0}, Lg3/D;->c()Lcom/facebook/imagepipeline/memory/f;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :cond_2
    invoke-virtual {p0}, Lg3/D;->g()Lcom/facebook/imagepipeline/memory/f;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    return-object p1
.end method


# virtual methods
.method public b()Lg3/i;
    .locals 5

    .line 1
    iget-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, Lg3/D;->a:Lg3/B;

    .line 6
    .line 7
    invoke-virtual {v0}, Lg3/B;->e()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sparse-switch v1, :sswitch_data_0

    .line 16
    .line 17
    .line 18
    goto/16 :goto_1

    .line 19
    .line 20
    :sswitch_0
    const-string v1, "dummy"

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    new-instance v0, Lg3/r;

    .line 29
    .line 30
    invoke-direct {v0}, Lg3/r;-><init>()V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 34
    .line 35
    goto/16 :goto_2

    .line 36
    .line 37
    :sswitch_1
    const-string v1, "dummy_with_tracking"

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    new-instance v0, Lg3/s;

    .line 46
    .line 47
    invoke-direct {v0}, Lg3/s;-><init>()V

    .line 48
    .line 49
    .line 50
    iput-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 51
    .line 52
    goto/16 :goto_2

    .line 53
    .line 54
    :sswitch_2
    const-string v1, "experimental"

    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    new-instance v0, Lg3/t;

    .line 63
    .line 64
    iget-object v1, p0, Lg3/D;->a:Lg3/B;

    .line 65
    .line 66
    invoke-virtual {v1}, Lg3/B;->b()I

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 71
    .line 72
    invoke-virtual {v2}, Lg3/B;->a()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-static {}, Lg3/z;->h()Lg3/z;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 81
    .line 82
    invoke-virtual {v4}, Lg3/B;->m()Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_0

    .line 87
    .line 88
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 89
    .line 90
    invoke-virtual {v4}, Lg3/B;->i()Lf2/d;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const/4 v4, 0x0

    .line 96
    :goto_0
    invoke-direct {v0, v1, v2, v3, v4}, Lg3/t;-><init>(IILg3/F;Lf2/d;)V

    .line 97
    .line 98
    .line 99
    iput-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 100
    .line 101
    goto :goto_2

    .line 102
    :sswitch_3
    const-string v1, "legacy"

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    goto :goto_1

    .line 109
    :sswitch_4
    const-string v1, "legacy_default_params"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    if-eqz v0, :cond_1

    .line 116
    .line 117
    new-instance v0, Lcom/facebook/imagepipeline/memory/c;

    .line 118
    .line 119
    iget-object v1, p0, Lg3/D;->a:Lg3/B;

    .line 120
    .line 121
    invoke-virtual {v1}, Lg3/B;->i()Lf2/d;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {}, Lg3/n;->a()Lg3/E;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iget-object v3, p0, Lg3/D;->a:Lg3/B;

    .line 130
    .line 131
    invoke-virtual {v3}, Lg3/B;->d()Lg3/F;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 136
    .line 137
    invoke-virtual {v4}, Lg3/B;->l()Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/imagepipeline/memory/c;-><init>(Lf2/d;Lg3/E;Lg3/F;Z)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_1
    :goto_1
    new-instance v0, Lcom/facebook/imagepipeline/memory/c;

    .line 148
    .line 149
    iget-object v1, p0, Lg3/D;->a:Lg3/B;

    .line 150
    .line 151
    invoke-virtual {v1}, Lg3/B;->i()Lf2/d;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 156
    .line 157
    invoke-virtual {v2}, Lg3/B;->c()Lg3/E;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    iget-object v3, p0, Lg3/D;->a:Lg3/B;

    .line 162
    .line 163
    invoke-virtual {v3}, Lg3/B;->d()Lg3/F;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 168
    .line 169
    invoke-virtual {v4}, Lg3/B;->l()Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/facebook/imagepipeline/memory/c;-><init>(Lf2/d;Lg3/E;Lg3/F;Z)V

    .line 174
    .line 175
    .line 176
    iput-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 177
    .line 178
    :cond_2
    :goto_2
    iget-object v0, p0, Lg3/D;->c:Lg3/i;

    .line 179
    .line 180
    return-object v0

    .line 181
    :sswitch_data_0
    .sparse-switch
        -0x6f64eb86 -> :sswitch_4
        -0x41f50c37 -> :sswitch_3
        -0x181d2318 -> :sswitch_2
        -0x17f85147 -> :sswitch_1
        0x5b804a8 -> :sswitch_0
    .end sparse-switch
.end method

.method public c()Lcom/facebook/imagepipeline/memory/f;
    .locals 5

    .line 1
    iget-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    :try_start_0
    const-class v1, Lcom/facebook/imagepipeline/memory/BufferMemoryChunkPool;

    .line 7
    .line 8
    const-class v2, Lf2/d;

    .line 9
    .line 10
    const-class v3, Lg3/E;

    .line 11
    .line 12
    const-class v4, Lg3/F;

    .line 13
    .line 14
    filled-new-array {v2, v3, v4}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 23
    .line 24
    invoke-virtual {v2}, Lg3/B;->i()Lf2/d;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, Lg3/D;->a:Lg3/B;

    .line 29
    .line 30
    invoke-virtual {v3}, Lg3/B;->g()Lg3/E;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 35
    .line 36
    invoke-virtual {v4}, Lg3/B;->h()Lg3/F;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    filled-new-array {v2, v3, v4}, [Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Lcom/facebook/imagepipeline/memory/f;

    .line 49
    .line 50
    iput-object v1, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catch_0
    iput-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :catch_1
    iput-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_2
    iput-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :catch_3
    iput-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :catch_4
    iput-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 66
    .line 67
    :cond_0
    :goto_0
    iget-object v0, p0, Lg3/D;->d:Lcom/facebook/imagepipeline/memory/f;

    .line 68
    .line 69
    return-object v0
.end method

.method public d()Lcom/facebook/imagepipeline/memory/d;
    .locals 3

    .line 1
    iget-object v0, p0, Lg3/D;->e:Lcom/facebook/imagepipeline/memory/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/imagepipeline/memory/d;

    .line 6
    .line 7
    iget-object v1, p0, Lg3/D;->a:Lg3/B;

    .line 8
    .line 9
    invoke-virtual {v1}, Lg3/B;->i()Lf2/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 14
    .line 15
    invoke-virtual {v2}, Lg3/B;->f()Lg3/E;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0, v1, v2}, Lcom/facebook/imagepipeline/memory/d;-><init>(Lf2/d;Lg3/E;)V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lg3/D;->e:Lcom/facebook/imagepipeline/memory/d;

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lg3/D;->e:Lcom/facebook/imagepipeline/memory/d;

    .line 25
    .line 26
    return-object v0
.end method

.method public e()I
    .locals 1

    .line 1
    iget-object v0, p0, Lg3/D;->a:Lg3/B;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg3/B;->f()Lg3/E;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget v0, v0, Lg3/E;->g:I

    .line 8
    .line 9
    return v0
.end method

.method public g()Lcom/facebook/imagepipeline/memory/f;
    .locals 7

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "PoolFactory"

    .line 4
    .line 5
    iget-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    :try_start_0
    const-class v3, Lcom/facebook/imagepipeline/memory/NativeMemoryChunkPool;

    .line 11
    .line 12
    const-class v4, Lf2/d;

    .line 13
    .line 14
    const-class v5, Lg3/E;

    .line 15
    .line 16
    const-class v6, Lg3/F;

    .line 17
    .line 18
    filled-new-array {v4, v5, v6}, [Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    iget-object v4, p0, Lg3/D;->a:Lg3/B;

    .line 27
    .line 28
    invoke-virtual {v4}, Lg3/B;->i()Lf2/d;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    iget-object v5, p0, Lg3/D;->a:Lg3/B;

    .line 33
    .line 34
    invoke-virtual {v5}, Lg3/B;->g()Lg3/E;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    iget-object v6, p0, Lg3/D;->a:Lg3/B;

    .line 39
    .line 40
    invoke-virtual {v6}, Lg3/B;->h()Lg3/F;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    filled-new-array {v4, v5, v6}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    check-cast v3, Lcom/facebook/imagepipeline/memory/f;

    .line 53
    .line 54
    iput-object v3, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :catch_0
    move-exception v3

    .line 58
    goto :goto_0

    .line 59
    :catch_1
    move-exception v3

    .line 60
    goto :goto_1

    .line 61
    :catch_2
    move-exception v3

    .line 62
    goto :goto_2

    .line 63
    :catch_3
    move-exception v3

    .line 64
    goto :goto_3

    .line 65
    :catch_4
    move-exception v3

    .line 66
    goto :goto_4

    .line 67
    :goto_0
    invoke-static {v1, v0, v3}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 68
    .line 69
    .line 70
    iput-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 71
    .line 72
    goto :goto_5

    .line 73
    :goto_1
    invoke-static {v1, v0, v3}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 74
    .line 75
    .line 76
    iput-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 77
    .line 78
    goto :goto_5

    .line 79
    :goto_2
    invoke-static {v1, v0, v3}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    iput-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 83
    .line 84
    goto :goto_5

    .line 85
    :goto_3
    invoke-static {v1, v0, v3}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    iput-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :goto_4
    invoke-static {v1, v0, v3}, Ld2/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    iput-object v2, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 95
    .line 96
    :cond_0
    :goto_5
    iget-object v0, p0, Lg3/D;->f:Lcom/facebook/imagepipeline/memory/f;

    .line 97
    .line 98
    return-object v0
.end method

.method public h()Lf2/i;
    .locals 1

    .line 1
    invoke-static {}, LY2/z;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lg3/D;->i(I)Lf2/i;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public i(I)Lf2/i;
    .locals 3

    .line 1
    iget-object v0, p0, Lg3/D;->g:Lf2/i;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lg3/D;->f(I)Lcom/facebook/imagepipeline/memory/f;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "failed to get pool for chunk type: "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, Lc2/k;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    new-instance p1, Lg3/y;

    .line 30
    .line 31
    invoke-virtual {p0}, Lg3/D;->j()Lf2/l;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-direct {p1, v0, v1}, Lg3/y;-><init>(Lcom/facebook/imagepipeline/memory/f;Lf2/l;)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lg3/D;->g:Lf2/i;

    .line 39
    .line 40
    :cond_0
    iget-object p1, p0, Lg3/D;->g:Lf2/i;

    .line 41
    .line 42
    return-object p1
.end method

.method public j()Lf2/l;
    .locals 2

    .line 1
    iget-object v0, p0, Lg3/D;->h:Lf2/l;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lf2/l;

    .line 6
    .line 7
    invoke-virtual {p0}, Lg3/D;->k()Lf2/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-direct {v0, v1}, Lf2/l;-><init>(Lf2/a;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lg3/D;->h:Lf2/l;

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lg3/D;->h:Lf2/l;

    .line 17
    .line 18
    return-object v0
.end method

.method public k()Lf2/a;
    .locals 4

    .line 1
    iget-object v0, p0, Lg3/D;->i:Lf2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/facebook/imagepipeline/memory/e;

    .line 6
    .line 7
    iget-object v1, p0, Lg3/D;->a:Lg3/B;

    .line 8
    .line 9
    invoke-virtual {v1}, Lg3/B;->i()Lf2/d;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lg3/D;->a:Lg3/B;

    .line 14
    .line 15
    invoke-virtual {v2}, Lg3/B;->j()Lg3/E;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    iget-object v3, p0, Lg3/D;->a:Lg3/B;

    .line 20
    .line 21
    invoke-virtual {v3}, Lg3/B;->k()Lg3/F;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v0, v1, v2, v3}, Lcom/facebook/imagepipeline/memory/e;-><init>(Lf2/d;Lg3/E;Lg3/F;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lg3/D;->i:Lf2/a;

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lg3/D;->i:Lf2/a;

    .line 31
    .line 32
    return-object v0
.end method
