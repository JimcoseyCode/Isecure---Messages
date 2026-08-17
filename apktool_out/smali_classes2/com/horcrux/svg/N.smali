.class Lcom/horcrux/svg/N;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static d:Ljava/util/ArrayList;

.field private static e:I

.field private static f:Lcom/horcrux/svg/L;

.field private static g:Lcom/horcrux/svg/L;

.field private static h:Lcom/horcrux/svg/L;

.field private static i:Lcom/horcrux/svg/L;

.field private static j:Z


# instance fields
.field a:Lcom/horcrux/svg/O;

.field b:Lcom/horcrux/svg/L;

.field c:D


# direct methods
.method private constructor <init>(Lcom/horcrux/svg/O;Lcom/horcrux/svg/L;D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/horcrux/svg/N;->a:Lcom/horcrux/svg/O;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/horcrux/svg/N;->b:Lcom/horcrux/svg/L;

    .line 7
    .line 8
    iput-wide p3, p0, Lcom/horcrux/svg/N;->c:D

    .line 9
    .line 10
    return-void
.end method

.method private static a(DD)D
    .locals 4

    .line 1
    sub-double v0, p0, p2

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Math;->abs(D)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, 0x4066800000000000L    # 180.0

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmpl-double v0, v0, v2

    .line 13
    .line 14
    if-lez v0, :cond_0

    .line 15
    .line 16
    const-wide v0, 0x4076800000000000L    # 360.0

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    add-double/2addr p0, v0

    .line 22
    :cond_0
    add-double/2addr p0, p2

    .line 23
    const-wide/high16 p2, 0x4000000000000000L    # 2.0

    .line 24
    .line 25
    div-double/2addr p0, p2

    .line 26
    return-wide p0
.end method

.method private static b(Lcom/horcrux/svg/S;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)V
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 6
    .line 7
    invoke-static {p3, p2}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 14
    .line 15
    invoke-static {p1}, Lcom/horcrux/svg/N;->i(Lcom/horcrux/svg/L;)Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    iget-object p1, p0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 22
    .line 23
    iput-object p1, p0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    iget-object p1, p0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 27
    .line 28
    invoke-static {p1}, Lcom/horcrux/svg/N;->i(Lcom/horcrux/svg/L;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    iget-object p1, p0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 35
    .line 36
    iput-object p1, p0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method private static c(Lcom/horcrux/svg/O;)D
    .locals 5

    .line 1
    sget-object v0, Lcom/horcrux/svg/N;->h:Lcom/horcrux/svg/L;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/N;->f(Lcom/horcrux/svg/L;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Lcom/horcrux/svg/N;->j(D)D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    sget-object v2, Lcom/horcrux/svg/N;->i:Lcom/horcrux/svg/L;

    .line 12
    .line 13
    invoke-static {v2}, Lcom/horcrux/svg/N;->f(Lcom/horcrux/svg/L;)D

    .line 14
    .line 15
    .line 16
    move-result-wide v2

    .line 17
    invoke-static {v2, v3}, Lcom/horcrux/svg/N;->j(D)D

    .line 18
    .line 19
    .line 20
    move-result-wide v2

    .line 21
    sget-object v4, Lcom/horcrux/svg/N$a;->a:[I

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    aget p0, v4, p0

    .line 28
    .line 29
    const/4 v4, 0x1

    .line 30
    if-eq p0, v4, :cond_2

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    if-eq p0, v4, :cond_1

    .line 34
    .line 35
    const/4 v2, 0x3

    .line 36
    if-eq p0, v2, :cond_0

    .line 37
    .line 38
    const-wide/16 v0, 0x0

    .line 39
    .line 40
    :cond_0
    return-wide v0

    .line 41
    :cond_1
    invoke-static {v0, v1, v2, v3}, Lcom/horcrux/svg/N;->a(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0

    .line 46
    :cond_2
    sget-boolean p0, Lcom/horcrux/svg/N;->j:Z

    .line 47
    .line 48
    if-eqz p0, :cond_3

    .line 49
    .line 50
    const-wide v0, 0x4066800000000000L    # 180.0

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    add-double/2addr v2, v0

    .line 56
    :cond_3
    return-wide v2
.end method

.method private static d(Lcom/horcrux/svg/H;)Lcom/horcrux/svg/S;
    .locals 6

    .line 1
    new-instance v0, Lcom/horcrux/svg/S;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/horcrux/svg/S;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/horcrux/svg/H;->b:[Lcom/horcrux/svg/L;

    .line 7
    .line 8
    sget-object v2, Lcom/horcrux/svg/N$a;->b:[I

    .line 9
    .line 10
    iget-object p0, p0, Lcom/horcrux/svg/H;->a:Lcom/horcrux/svg/g;

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    aget p0, v2, p0

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x1

    .line 21
    if-eq p0, v4, :cond_3

    .line 22
    .line 23
    if-eq p0, v2, :cond_2

    .line 24
    .line 25
    const/4 v2, 0x3

    .line 26
    if-eq p0, v2, :cond_1

    .line 27
    .line 28
    const/4 v2, 0x4

    .line 29
    if-eq p0, v2, :cond_1

    .line 30
    .line 31
    const/4 v1, 0x5

    .line 32
    if-eq p0, v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object p0, Lcom/horcrux/svg/N;->g:Lcom/horcrux/svg/L;

    .line 36
    .line 37
    iput-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 38
    .line 39
    sget-object v1, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 40
    .line 41
    invoke-static {p0, v1}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    iput-object p0, v0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 46
    .line 47
    iget-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 48
    .line 49
    sget-object v1, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 50
    .line 51
    invoke-static {p0, v1}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    iput-object p0, v0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_1
    aget-object p0, v1, v3

    .line 59
    .line 60
    iput-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 61
    .line 62
    sget-object v1, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 63
    .line 64
    invoke-static {p0, v1}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    iput-object p0, v0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 69
    .line 70
    iget-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 71
    .line 72
    sget-object v1, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 73
    .line 74
    invoke-static {p0, v1}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    iput-object p0, v0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 79
    .line 80
    return-object v0

    .line 81
    :cond_2
    aget-object p0, v1, v4

    .line 82
    .line 83
    iput-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 84
    .line 85
    sget-object v2, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 86
    .line 87
    aget-object v1, v1, v3

    .line 88
    .line 89
    invoke-static {v0, v2, v1, p0}, Lcom/horcrux/svg/N;->b(Lcom/horcrux/svg/S;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)V

    .line 90
    .line 91
    .line 92
    return-object v0

    .line 93
    :cond_3
    aget-object p0, v1, v2

    .line 94
    .line 95
    iput-object p0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 96
    .line 97
    aget-object p0, v1, v3

    .line 98
    .line 99
    sget-object v5, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 100
    .line 101
    invoke-static {p0, v5}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    iput-object p0, v0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 106
    .line 107
    aget-object p0, v1, v2

    .line 108
    .line 109
    aget-object v5, v1, v4

    .line 110
    .line 111
    invoke-static {p0, v5}, Lcom/horcrux/svg/N;->k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    iput-object p0, v0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 116
    .line 117
    iget-object p0, v0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 118
    .line 119
    invoke-static {p0}, Lcom/horcrux/svg/N;->i(Lcom/horcrux/svg/L;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-eqz p0, :cond_4

    .line 124
    .line 125
    aget-object p0, v1, v3

    .line 126
    .line 127
    aget-object v3, v1, v4

    .line 128
    .line 129
    aget-object v1, v1, v2

    .line 130
    .line 131
    invoke-static {v0, p0, v3, v1}, Lcom/horcrux/svg/N;->b(Lcom/horcrux/svg/S;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)V

    .line 132
    .line 133
    .line 134
    return-object v0

    .line 135
    :cond_4
    iget-object p0, v0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 136
    .line 137
    invoke-static {p0}, Lcom/horcrux/svg/N;->i(Lcom/horcrux/svg/L;)Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-eqz p0, :cond_5

    .line 142
    .line 143
    sget-object p0, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 144
    .line 145
    aget-object v2, v1, v3

    .line 146
    .line 147
    aget-object v1, v1, v4

    .line 148
    .line 149
    invoke-static {v0, p0, v2, v1}, Lcom/horcrux/svg/N;->b(Lcom/horcrux/svg/S;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)V

    .line 150
    .line 151
    .line 152
    :cond_5
    :goto_0
    return-object v0
.end method

.method private static e()V
    .locals 6

    .line 1
    sget-object v0, Lcom/horcrux/svg/O;->i:Lcom/horcrux/svg/O;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/horcrux/svg/N;->c(Lcom/horcrux/svg/O;)D

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    sget-object v3, Lcom/horcrux/svg/N;->d:Ljava/util/ArrayList;

    .line 8
    .line 9
    new-instance v4, Lcom/horcrux/svg/N;

    .line 10
    .line 11
    sget-object v5, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 12
    .line 13
    invoke-direct {v4, v0, v5, v1, v2}, Lcom/horcrux/svg/N;-><init>(Lcom/horcrux/svg/O;Lcom/horcrux/svg/L;D)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private static f(Lcom/horcrux/svg/L;)D
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/L;->b:D

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/horcrux/svg/L;->a:D

    .line 4
    .line 5
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->atan2(DD)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method private static g(Lcom/horcrux/svg/H;)V
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/horcrux/svg/N;->d(Lcom/horcrux/svg/H;)Lcom/horcrux/svg/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, v0, Lcom/horcrux/svg/S;->a:Lcom/horcrux/svg/L;

    .line 6
    .line 7
    sput-object v1, Lcom/horcrux/svg/N;->i:Lcom/horcrux/svg/L;

    .line 8
    .line 9
    sget v1, Lcom/horcrux/svg/N;->e:I

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-lez v1, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    sget-object v1, Lcom/horcrux/svg/O;->g:Lcom/horcrux/svg/O;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    sget-object v1, Lcom/horcrux/svg/O;->h:Lcom/horcrux/svg/O;

    .line 20
    .line 21
    :goto_0
    invoke-static {v1}, Lcom/horcrux/svg/N;->c(Lcom/horcrux/svg/O;)D

    .line 22
    .line 23
    .line 24
    move-result-wide v3

    .line 25
    sget-object v5, Lcom/horcrux/svg/N;->d:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v6, Lcom/horcrux/svg/N;

    .line 28
    .line 29
    sget-object v7, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 30
    .line 31
    invoke-direct {v6, v1, v7, v3, v4}, Lcom/horcrux/svg/N;-><init>(Lcom/horcrux/svg/O;Lcom/horcrux/svg/L;D)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    :cond_1
    iget-object v1, v0, Lcom/horcrux/svg/S;->b:Lcom/horcrux/svg/L;

    .line 38
    .line 39
    sput-object v1, Lcom/horcrux/svg/N;->h:Lcom/horcrux/svg/L;

    .line 40
    .line 41
    iget-object v0, v0, Lcom/horcrux/svg/S;->c:Lcom/horcrux/svg/L;

    .line 42
    .line 43
    sput-object v0, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 44
    .line 45
    iget-object v0, p0, Lcom/horcrux/svg/H;->a:Lcom/horcrux/svg/g;

    .line 46
    .line 47
    sget-object v1, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 48
    .line 49
    if-ne v0, v1, :cond_2

    .line 50
    .line 51
    iget-object p0, p0, Lcom/horcrux/svg/H;->b:[Lcom/horcrux/svg/L;

    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    aget-object p0, p0, v0

    .line 55
    .line 56
    sput-object p0, Lcom/horcrux/svg/N;->g:Lcom/horcrux/svg/L;

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    sget-object p0, Lcom/horcrux/svg/g;->k:Lcom/horcrux/svg/g;

    .line 60
    .line 61
    if-ne v0, p0, :cond_3

    .line 62
    .line 63
    new-instance p0, Lcom/horcrux/svg/L;

    .line 64
    .line 65
    const-wide/16 v0, 0x0

    .line 66
    .line 67
    invoke-direct {p0, v0, v1, v0, v1}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 68
    .line 69
    .line 70
    sput-object p0, Lcom/horcrux/svg/N;->g:Lcom/horcrux/svg/L;

    .line 71
    .line 72
    :cond_3
    :goto_1
    sget p0, Lcom/horcrux/svg/N;->e:I

    .line 73
    .line 74
    add-int/2addr p0, v2

    .line 75
    sput p0, Lcom/horcrux/svg/N;->e:I

    .line 76
    .line 77
    return-void
.end method

.method static h(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/horcrux/svg/N;->d:Ljava/util/ArrayList;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    sput v0, Lcom/horcrux/svg/N;->e:I

    .line 10
    .line 11
    new-instance v0, Lcom/horcrux/svg/L;

    .line 12
    .line 13
    const-wide/16 v1, 0x0

    .line 14
    .line 15
    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lcom/horcrux/svg/N;->f:Lcom/horcrux/svg/L;

    .line 19
    .line 20
    new-instance v0, Lcom/horcrux/svg/L;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2, v1, v2}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lcom/horcrux/svg/N;->g:Lcom/horcrux/svg/L;

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, Lcom/horcrux/svg/H;

    .line 42
    .line 43
    invoke-static {v0}, Lcom/horcrux/svg/N;->g(Lcom/horcrux/svg/H;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lcom/horcrux/svg/N;->e()V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lcom/horcrux/svg/N;->d:Ljava/util/ArrayList;

    .line 51
    .line 52
    return-object p0
.end method

.method private static i(Lcom/horcrux/svg/L;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/L;->a:D

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmpl-double v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/horcrux/svg/L;->b:D

    .line 10
    .line 11
    cmpl-double p0, v0, v2

    .line 12
    .line 13
    if-nez p0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method private static j(D)D
    .locals 2

    .line 1
    const-wide v0, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    mul-double/2addr p0, v0

    .line 7
    return-wide p0
.end method

.method private static k(Lcom/horcrux/svg/L;Lcom/horcrux/svg/L;)Lcom/horcrux/svg/L;
    .locals 5

    .line 1
    new-instance v0, Lcom/horcrux/svg/L;

    .line 2
    .line 3
    iget-wide v1, p1, Lcom/horcrux/svg/L;->a:D

    .line 4
    .line 5
    iget-wide v3, p0, Lcom/horcrux/svg/L;->a:D

    .line 6
    .line 7
    sub-double/2addr v1, v3

    .line 8
    iget-wide v3, p1, Lcom/horcrux/svg/L;->b:D

    .line 9
    .line 10
    iget-wide p0, p0, Lcom/horcrux/svg/L;->b:D

    .line 11
    .line 12
    sub-double/2addr v3, p0

    .line 13
    invoke-direct {v0, v1, v2, v3, v4}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
