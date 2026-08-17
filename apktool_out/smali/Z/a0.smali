.class public LZ/a0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LZ/e0;


# instance fields
.field private final b:LF/v0;

.field private final c:Z

.field private final d:I

.field private final e:Ljava/util/Map;

.field private final f:Ljava/util/Map;


# direct methods
.method constructor <init>(ILF/L;ILg0/s0$a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZ/a0;->e:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, LZ/a0;->f:Ljava/util/Map;

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    if-ne p1, v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    :goto_0
    move v1, v0

    .line 27
    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v3, "Not a supported video capabilities source: "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v1, v2}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    if-ne p3, v1, :cond_2

    .line 49
    .line 50
    move v0, v1

    .line 51
    :cond_2
    iput v0, p0, LZ/a0;->d:I

    .line 52
    .line 53
    invoke-static {p1, p2, p4, v0}, LZ/a0;->h(ILF/L;Lg0/s0$a;I)LF/v0;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    iput-object p1, p0, LZ/a0;->b:LF/v0;

    .line 58
    .line 59
    invoke-interface {p2}, LF/L;->b()Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result p3

    .line 71
    if-eqz p3, :cond_4

    .line 72
    .line 73
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p3

    .line 77
    check-cast p3, Ly/H;

    .line 78
    .line 79
    new-instance p4, Lb0/e;

    .line 80
    .line 81
    iget-object v0, p0, LZ/a0;->b:LF/v0;

    .line 82
    .line 83
    invoke-direct {p4, v0, p3}, Lb0/e;-><init>(LF/v0;Ly/H;)V

    .line 84
    .line 85
    .line 86
    new-instance v0, LZ/o;

    .line 87
    .line 88
    iget v1, p0, LZ/a0;->d:I

    .line 89
    .line 90
    invoke-direct {v0, p4, v1}, LZ/o;-><init>(LF/v0;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, LZ/o;->g()Ljava/util/List;

    .line 94
    .line 95
    .line 96
    move-result-object p4

    .line 97
    invoke-interface {p4}, Ljava/util/List;->isEmpty()Z

    .line 98
    .line 99
    .line 100
    move-result p4

    .line 101
    if-nez p4, :cond_3

    .line 102
    .line 103
    iget-object p4, p0, LZ/a0;->e:Ljava/util/Map;

    .line 104
    .line 105
    invoke-interface {p4, p3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_4
    invoke-interface {p2}, LF/L;->e()Z

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    iput-boolean p1, p0, LZ/a0;->c:Z

    .line 114
    .line 115
    return-void
.end method

.method private f(Ly/H;)LZ/o;
    .locals 2

    .line 1
    invoke-virtual {p0}, LZ/a0;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p1, v0}, LF/u0;->c(Ly/H;Ljava/util/Set;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1

    .line 13
    :cond_0
    new-instance v0, Lb0/e;

    .line 14
    .line 15
    iget-object v1, p0, LZ/a0;->b:LF/v0;

    .line 16
    .line 17
    invoke-direct {v0, v1, p1}, Lb0/e;-><init>(LF/v0;Ly/H;)V

    .line 18
    .line 19
    .line 20
    new-instance p1, LZ/o;

    .line 21
    .line 22
    iget v1, p0, LZ/a0;->d:I

    .line 23
    .line 24
    invoke-direct {p1, v0, v1}, LZ/o;-><init>(LF/v0;I)V

    .line 25
    .line 26
    .line 27
    return-object p1
.end method

.method private g(Ly/H;)LZ/o;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ly/H;->e()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LZ/a0;->e:Ljava/util/Map;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, LZ/o;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object v0, p0, LZ/a0;->f:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, p0, LZ/a0;->f:Ljava/util/Map;

    .line 25
    .line 26
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p1, LZ/o;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    invoke-direct {p0, p1}, LZ/a0;->f(Ly/H;)LZ/o;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iget-object v1, p0, LZ/a0;->f:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method private static h(ILF/L;Lg0/s0$a;I)LF/v0;
    .locals 7

    .line 1
    invoke-interface {p1}, LF/L;->u()LF/v0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne p3, v1, :cond_1

    .line 7
    .line 8
    invoke-interface {p1}, LF/L;->j()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    sget-object p0, LF/v0;->a:LF/v0;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    return-object v0

    .line 18
    :cond_1
    invoke-static {v0, p3}, LZ/o;->b(LF/v0;I)Z

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    if-nez p3, :cond_2

    .line 23
    .line 24
    const-string p3, "RecorderVideoCapabilities"

    .line 25
    .line 26
    const-string v0, "Camera EncoderProfilesProvider doesn\'t contain any supported Quality."

    .line 27
    .line 28
    invoke-static {p3, v0}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object p3, LZ/v;->c:LZ/v;

    .line 32
    .line 33
    sget-object v0, LZ/v;->b:LZ/v;

    .line 34
    .line 35
    sget-object v1, LZ/v;->a:LZ/v;

    .line 36
    .line 37
    filled-new-array {p3, v0, v1}, [LZ/v;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p3

    .line 45
    new-instance v0, Li0/c;

    .line 46
    .line 47
    invoke-direct {v0, p1, p3, p2}, Li0/c;-><init>(LF/L;Ljava/util/List;Lg0/s0$a;)V

    .line 48
    .line 49
    .line 50
    :cond_2
    invoke-static {}, Landroidx/camera/video/internal/compat/quirk/a;->c()LF/g1;

    .line 51
    .line 52
    .line 53
    move-result-object p3

    .line 54
    new-instance v2, Li0/d;

    .line 55
    .line 56
    invoke-direct {v2, v0, p3, p1, p2}, Li0/d;-><init>(LF/v0;LF/g1;LF/L;Lg0/s0$a;)V

    .line 57
    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-ne p0, v0, :cond_3

    .line 61
    .line 62
    new-instance v1, Lb0/h;

    .line 63
    .line 64
    invoke-static {}, LZ/v;->b()Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object p0, Ly/H;->d:Ly/H;

    .line 69
    .line 70
    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    const/16 p0, 0x22

    .line 75
    .line 76
    invoke-interface {p1, p0}, LF/L;->x(I)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    move-object v6, p2

    .line 81
    invoke-direct/range {v1 .. v6}, Lb0/h;-><init>(LF/v0;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lg0/s0$a;)V

    .line 82
    .line 83
    .line 84
    move-object v2, v1

    .line 85
    goto :goto_0

    .line 86
    :cond_3
    move-object v6, p2

    .line 87
    :goto_0
    new-instance p0, Li0/e;

    .line 88
    .line 89
    invoke-direct {p0, v2, p3}, Li0/e;-><init>(LF/v0;LF/g1;)V

    .line 90
    .line 91
    .line 92
    invoke-static {p1}, LZ/a0;->i(LF/L;)Z

    .line 93
    .line 94
    .line 95
    move-result p2

    .line 96
    if-eqz p2, :cond_4

    .line 97
    .line 98
    new-instance p2, Lb0/b;

    .line 99
    .line 100
    invoke-direct {p2, p0, v6}, Lb0/b;-><init>(LF/v0;Lg0/s0$a;)V

    .line 101
    .line 102
    .line 103
    move-object p0, p2

    .line 104
    :cond_4
    new-instance p2, Li0/f;

    .line 105
    .line 106
    invoke-direct {p2, p0, p1, p3}, Li0/f;-><init>(LF/v0;LF/L;LF/g1;)V

    .line 107
    .line 108
    .line 109
    return-object p2
.end method

.method private static i(LF/L;)Z
    .locals 3

    .line 1
    invoke-interface {p0}, LF/L;->b()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ly/H;

    .line 20
    .line 21
    invoke-virtual {v0}, Ly/H;->b()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0}, Ly/H;->a()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    const/4 v2, 0x3

    .line 34
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/Integer;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    const/16 v1, 0xa

    .line 45
    .line 46
    if-ne v0, v1, :cond_0

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_1
    const/4 p0, 0x0

    .line 51
    return p0
.end method


# virtual methods
.method public a(Landroid/util/Size;Ly/H;)Lb0/i;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LZ/a0;->g(Ly/H;)LZ/o;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p2, p1}, LZ/o;->c(Landroid/util/Size;)Lb0/i;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public b()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/a0;->e:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c(LZ/v;Ly/H;)Lb0/i;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LZ/a0;->g(Ly/H;)LZ/o;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p2, p1}, LZ/o;->f(LZ/v;)Lb0/i;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public d(Ly/H;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ/a0;->g(Ly/H;)LZ/o;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    new-instance p1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    invoke-virtual {p1}, LZ/o;->g()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method

.method public e(Landroid/util/Size;Ly/H;)LZ/v;
    .locals 0

    .line 1
    invoke-direct {p0, p2}, LZ/a0;->g(Ly/H;)LZ/o;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    if-nez p2, :cond_0

    .line 6
    .line 7
    sget-object p1, LZ/v;->g:LZ/v;

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p2, p1}, LZ/o;->d(Landroid/util/Size;)LZ/v;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method
