.class public abstract LM3/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LM3/h$a;
    }
.end annotation


# direct methods
.method private static a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x47

    .line 6
    .line 7
    if-ne v0, v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/16 v1, 0x49

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x46

    .line 22
    .line 23
    if-ne v0, v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/16 v1, 0x38

    .line 30
    .line 31
    if-ne v0, v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    const/16 v1, 0x37

    .line 38
    .line 39
    if-eq v0, v1, :cond_0

    .line 40
    .line 41
    const/16 v1, 0x39

    .line 42
    .line 43
    if-ne v0, v1, :cond_1

    .line 44
    .line 45
    :cond_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    const/16 v0, 0x61

    .line 50
    .line 51
    if-ne p0, v0, :cond_1

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    new-instance p0, LM3/h$a;

    .line 55
    .line 56
    invoke-direct {p0}, LM3/h$a;-><init>()V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method public static b(Lcom/github/penfeizhou/animation/io/Reader;)Z
    .locals 1

    .line 1
    :try_start_0
    instance-of v0, p0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Lcom/github/penfeizhou/animation/gif/io/GifReader;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lcom/github/penfeizhou/animation/gif/io/GifReader;-><init>(Lcom/github/penfeizhou/animation/io/Reader;)V

    .line 11
    .line 12
    .line 13
    move-object p0, v0

    .line 14
    :goto_0
    invoke-static {p0}, LM3/h;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :catch_0
    move-exception p0

    .line 20
    instance-of v0, p0, LM3/h$a;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public static c(Lcom/github/penfeizhou/animation/gif/io/GifReader;)Ljava/util/List;
    .locals 3

    .line 1
    invoke-static {p0}, LM3/h;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, LM3/k;

    .line 10
    .line 11
    invoke-direct {v1}, LM3/k;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, p0}, LM3/k;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 15
    .line 16
    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, LM3/k;->b()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    new-instance v2, LM3/c;

    .line 27
    .line 28
    invoke-virtual {v1}, LM3/k;->c()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-direct {v2, v1}, LM3/c;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2, p0}, LM3/c;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    :cond_0
    :goto_0
    :try_start_0
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    const/16 v2, 0x3b

    .line 46
    .line 47
    if-eq v1, v2, :cond_4

    .line 48
    .line 49
    const/16 v2, 0x21

    .line 50
    .line 51
    if-eq v1, v2, :cond_2

    .line 52
    .line 53
    const/16 v2, 0x2c

    .line 54
    .line 55
    if-eq v1, v2, :cond_1

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    goto :goto_1

    .line 59
    :cond_1
    new-instance v1, LM3/j;

    .line 60
    .line 61
    invoke-direct {v1}, LM3/j;-><init>()V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catch_0
    move-exception p0

    .line 66
    goto :goto_2

    .line 67
    :cond_2
    invoke-static {p0}, LM3/f;->b(Lcom/github/penfeizhou/animation/gif/io/GifReader;)LM3/f;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_1
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-interface {v1, p0}, LM3/b;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    new-instance p0, LM3/h$a;

    .line 81
    .line 82
    invoke-direct {p0}, LM3/h$a;-><init>()V

    .line 83
    .line 84
    .line 85
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 86
    :cond_4
    return-object v0

    .line 87
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 88
    .line 89
    .line 90
    return-object v0
.end method
