.class public abstract LR3/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR3/m$a;
    }
.end annotation


# direct methods
.method public static a(Lcom/github/penfeizhou/animation/io/Reader;)Z
    .locals 3

    .line 1
    instance-of v0, p0, LS3/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, LS3/a;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, LS3/a;

    .line 9
    .line 10
    invoke-direct {v0, p0}, LS3/a;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 11
    .line 12
    .line 13
    move-object p0, v0

    .line 14
    :goto_0
    const/4 v0, 0x0

    .line 15
    :try_start_0
    const-string v1, "RIFF"

    .line 16
    .line 17
    invoke-virtual {p0, v1}, LS3/a;->f(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    return v0

    .line 24
    :cond_1
    const-wide/16 v1, 0x4

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 27
    .line 28
    .line 29
    const-string v1, "WEBP"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, LS3/a;->f(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    return v0

    .line 38
    :cond_2
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-lez v1, :cond_3

    .line 43
    .line 44
    invoke-static {p0}, LR3/m;->c(LS3/a;)LR3/e;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    instance-of v2, v1, LR3/k;

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    check-cast v1, LR3/k;

    .line 53
    .line 54
    invoke-virtual {v1}, LR3/k;->e()Z

    .line 55
    .line 56
    .line 57
    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 58
    return p0

    .line 59
    :catch_0
    move-exception p0

    .line 60
    instance-of v1, p0, LR3/m$a;

    .line 61
    .line 62
    if-nez v1, :cond_3

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 65
    .line 66
    .line 67
    :cond_3
    return v0
.end method

.method public static b(LS3/a;)Ljava/util/List;
    .locals 2

    .line 1
    const-string v0, "RIFF"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LS3/a;->f(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    const-wide/16 v0, 0x4

    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 12
    .line 13
    .line 14
    const-string v0, "WEBP"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, LS3/a;->f(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    :goto_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->available()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-lez v1, :cond_0

    .line 32
    .line 33
    invoke-static {p0}, LR3/m;->c(LS3/a;)LR3/e;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    return-object v0

    .line 42
    :cond_1
    new-instance p0, LR3/m$a;

    .line 43
    .line 44
    invoke-direct {p0}, LR3/m$a;-><init>()V

    .line 45
    .line 46
    .line 47
    throw p0

    .line 48
    :cond_2
    new-instance p0, LR3/m$a;

    .line 49
    .line 50
    invoke-direct {p0}, LR3/m$a;-><init>()V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method static c(LS3/a;)LR3/e;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, LS3/a;->b()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {p0}, LS3/a;->e()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    sget v3, LR3/k;->g:I

    .line 14
    .line 15
    if-ne v3, v1, :cond_0

    .line 16
    .line 17
    new-instance v3, LR3/k;

    .line 18
    .line 19
    invoke-direct {v3}, LR3/k;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v3, LR3/b;->f:I

    .line 24
    .line 25
    if-ne v3, v1, :cond_1

    .line 26
    .line 27
    new-instance v3, LR3/b;

    .line 28
    .line 29
    invoke-direct {v3}, LR3/b;-><init>()V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    sget v3, LR3/c;->m:I

    .line 34
    .line 35
    if-ne v3, v1, :cond_2

    .line 36
    .line 37
    new-instance v3, LR3/c;

    .line 38
    .line 39
    invoke-direct {v3}, LR3/c;-><init>()V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    sget v3, LR3/a;->d:I

    .line 44
    .line 45
    if-ne v3, v1, :cond_3

    .line 46
    .line 47
    new-instance v3, LR3/a;

    .line 48
    .line 49
    invoke-direct {v3}, LR3/a;-><init>()V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    sget v3, LR3/i;->d:I

    .line 54
    .line 55
    if-ne v3, v1, :cond_4

    .line 56
    .line 57
    new-instance v3, LR3/i;

    .line 58
    .line 59
    invoke-direct {v3}, LR3/i;-><init>()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_4
    sget v3, LR3/j;->d:I

    .line 64
    .line 65
    if-ne v3, v1, :cond_5

    .line 66
    .line 67
    new-instance v3, LR3/j;

    .line 68
    .line 69
    invoke-direct {v3}, LR3/j;-><init>()V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_5
    sget v3, LR3/g;->d:I

    .line 74
    .line 75
    if-ne v3, v1, :cond_6

    .line 76
    .line 77
    new-instance v3, LR3/g;

    .line 78
    .line 79
    invoke-direct {v3}, LR3/g;-><init>()V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_6
    sget v3, LR3/n;->d:I

    .line 84
    .line 85
    if-ne v3, v1, :cond_7

    .line 86
    .line 87
    new-instance v3, LR3/n;

    .line 88
    .line 89
    invoke-direct {v3}, LR3/n;-><init>()V

    .line 90
    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_7
    sget v3, LR3/f;->d:I

    .line 94
    .line 95
    if-ne v3, v1, :cond_8

    .line 96
    .line 97
    new-instance v3, LR3/f;

    .line 98
    .line 99
    invoke-direct {v3}, LR3/f;-><init>()V

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_8
    new-instance v3, LR3/e;

    .line 104
    .line 105
    invoke-direct {v3}, LR3/e;-><init>()V

    .line 106
    .line 107
    .line 108
    :goto_0
    iput v1, v3, LR3/e;->a:I

    .line 109
    .line 110
    iput v2, v3, LR3/e;->b:I

    .line 111
    .line 112
    iput v0, v3, LR3/e;->c:I

    .line 113
    .line 114
    invoke-virtual {v3, p0}, LR3/e;->c(LS3/a;)V

    .line 115
    .line 116
    .line 117
    return-object v3
.end method
