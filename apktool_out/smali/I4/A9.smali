.class public final LI4/A9;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI4/m9;


# instance fields
.field private final a:LI4/N6;

.field private b:LI4/I8;

.field private final c:I


# direct methods
.method private constructor <init>(LI4/N6;I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LI4/I8;

    .line 5
    .line 6
    invoke-direct {v0}, LI4/I8;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LI4/A9;->b:LI4/I8;

    .line 10
    .line 11
    iput-object p1, p0, LI4/A9;->a:LI4/N6;

    .line 12
    .line 13
    invoke-static {}, LI4/K9;->a()LI4/K9;

    .line 14
    .line 15
    .line 16
    iput p2, p0, LI4/A9;->c:I

    .line 17
    .line 18
    return-void
.end method

.method public static a(LI4/N6;)LI4/m9;
    .locals 2

    .line 1
    new-instance v0, LI4/A9;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LI4/A9;-><init>(LI4/N6;I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public static f(LI4/N6;I)LI4/m9;
    .locals 1

    .line 1
    new-instance p1, LI4/A9;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    invoke-direct {p1, p0, v0}, LI4/A9;-><init>(LI4/N6;I)V

    .line 5
    .line 6
    .line 7
    return-object p1
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, LI4/A9;->a:LI4/N6;

    .line 2
    .line 3
    invoke-virtual {v0}, LI4/N6;->j()LI4/P6;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LI4/P6;->g()LI4/K8;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {v0}, LI4/K8;->k()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, LI4/t;->b(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    invoke-virtual {v0}, LI4/K8;->k()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Ljava/lang/String;

    .line 32
    .line 33
    return-object v0

    .line 34
    :cond_0
    const-string v0, "NA"

    .line 35
    .line 36
    return-object v0
.end method

.method public final c(LI4/M6;)LI4/m9;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/A9;->a:LI4/N6;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LI4/N6;->f(LI4/M6;)LI4/N6;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final d(IZ)[B
    .locals 2

    .line 1
    xor-int/lit8 p2, p1, 0x1

    .line 2
    .line 3
    iget-object v0, p0, LI4/A9;->b:LI4/I8;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eq v1, p2, :cond_0

    .line 7
    .line 8
    const/4 p2, 0x0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move p2, v1

    .line 11
    :goto_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p2}, LI4/I8;->f(Ljava/lang/Boolean;)LI4/I8;

    .line 16
    .line 17
    .line 18
    iget-object p2, p0, LI4/A9;->b:LI4/I8;

    .line 19
    .line 20
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p2, v0}, LI4/I8;->e(Ljava/lang/Boolean;)LI4/I8;

    .line 23
    .line 24
    .line 25
    iget-object p2, p0, LI4/A9;->b:LI4/I8;

    .line 26
    .line 27
    invoke-virtual {p2}, LI4/I8;->m()LI4/K8;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iget-object v0, p0, LI4/A9;->a:LI4/N6;

    .line 32
    .line 33
    invoke-virtual {v0, p2}, LI4/N6;->i(LI4/K8;)LI4/N6;

    .line 34
    .line 35
    .line 36
    :try_start_0
    invoke-static {}, LI4/K9;->a()LI4/K9;

    .line 37
    .line 38
    .line 39
    if-nez p1, :cond_1

    .line 40
    .line 41
    iget-object p1, p0, LI4/A9;->a:LI4/N6;

    .line 42
    .line 43
    invoke-virtual {p1}, LI4/N6;->j()LI4/P6;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    new-instance p2, Lx5/d;

    .line 48
    .line 49
    invoke-direct {p2}, Lx5/d;-><init>()V

    .line 50
    .line 51
    .line 52
    sget-object v0, LI4/H5;->a:Lw5/a;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Lx5/d;->j(Lw5/a;)Lx5/d;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-virtual {p2, v1}, Lx5/d;->k(Z)Lx5/d;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p2}, Lx5/d;->i()Lv5/a;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2, p1}, Lv5/a;->b(Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-string p2, "utf-8"

    .line 71
    .line 72
    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :catch_0
    move-exception p1

    .line 78
    goto :goto_1

    .line 79
    :cond_1
    iget-object p1, p0, LI4/A9;->a:LI4/N6;

    .line 80
    .line 81
    invoke-virtual {p1}, LI4/N6;->j()LI4/P6;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    new-instance p2, LI4/R0;

    .line 86
    .line 87
    invoke-direct {p2}, LI4/R0;-><init>()V

    .line 88
    .line 89
    .line 90
    sget-object v0, LI4/H5;->a:Lw5/a;

    .line 91
    .line 92
    invoke-interface {v0, p2}, Lw5/a;->a(Lw5/b;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2}, LI4/R0;->b()LI4/S0;

    .line 96
    .line 97
    .line 98
    move-result-object p2

    .line 99
    invoke-virtual {p2, p1}, LI4/S0;->a(Ljava/lang/Object;)[B

    .line 100
    .line 101
    .line 102
    move-result-object p1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    return-object p1

    .line 104
    :goto_1
    new-instance p2, Ljava/lang/UnsupportedOperationException;

    .line 105
    .line 106
    const-string v0, "Failed to covert logging to UTF-8 byte array"

    .line 107
    .line 108
    invoke-direct {p2, v0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 109
    .line 110
    .line 111
    throw p2
.end method

.method public final e(LI4/I8;)LI4/m9;
    .locals 0

    .line 1
    iput-object p1, p0, LI4/A9;->b:LI4/I8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final zza()I
    .locals 1

    .line 1
    iget v0, p0, LI4/A9;->c:I

    .line 2
    .line 3
    return v0
.end method
