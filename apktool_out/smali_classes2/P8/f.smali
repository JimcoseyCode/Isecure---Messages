.class public abstract LP8/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:[I

.field private static final b:[I

.field private static final c:[I

.field private static final d:[J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    const-string v4, "0123456789abcdef"

    .line 8
    .line 9
    if-ge v3, v0, :cond_0

    .line 10
    .line 11
    shr-int/lit8 v5, v3, 0x4

    .line 12
    .line 13
    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    shl-int/lit8 v5, v5, 0x8

    .line 18
    .line 19
    and-int/lit8 v6, v3, 0xf

    .line 20
    .line 21
    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    or-int/2addr v4, v5

    .line 26
    aput v4, v1, v3

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    sput-object v1, LP8/f;->a:[I

    .line 32
    .line 33
    new-array v1, v0, [I

    .line 34
    .line 35
    move v3, v2

    .line 36
    :goto_1
    const-string v5, "0123456789ABCDEF"

    .line 37
    .line 38
    if-ge v3, v0, :cond_1

    .line 39
    .line 40
    shr-int/lit8 v6, v3, 0x4

    .line 41
    .line 42
    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    shl-int/lit8 v6, v6, 0x8

    .line 47
    .line 48
    and-int/lit8 v7, v3, 0xf

    .line 49
    .line 50
    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    or-int/2addr v5, v6

    .line 55
    aput v5, v1, v3

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sput-object v1, LP8/f;->b:[I

    .line 61
    .line 62
    new-array v1, v0, [I

    .line 63
    .line 64
    move v3, v2

    .line 65
    :goto_2
    if-ge v3, v0, :cond_2

    .line 66
    .line 67
    const/4 v6, -0x1

    .line 68
    aput v6, v1, v3

    .line 69
    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v3, v2

    .line 74
    move v6, v3

    .line 75
    :goto_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v7

    .line 79
    if-ge v3, v7, :cond_3

    .line 80
    .line 81
    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    add-int/lit8 v8, v6, 0x1

    .line 86
    .line 87
    aput v6, v1, v7

    .line 88
    .line 89
    add-int/lit8 v3, v3, 0x1

    .line 90
    .line 91
    move v6, v8

    .line 92
    goto :goto_3

    .line 93
    :cond_3
    move v3, v2

    .line 94
    move v6, v3

    .line 95
    :goto_4
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    if-ge v3, v7, :cond_4

    .line 100
    .line 101
    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    add-int/lit8 v8, v6, 0x1

    .line 106
    .line 107
    aput v6, v1, v7

    .line 108
    .line 109
    add-int/lit8 v3, v3, 0x1

    .line 110
    .line 111
    move v6, v8

    .line 112
    goto :goto_4

    .line 113
    :cond_4
    sput-object v1, LP8/f;->c:[I

    .line 114
    .line 115
    new-array v1, v0, [J

    .line 116
    .line 117
    move v3, v2

    .line 118
    :goto_5
    if-ge v3, v0, :cond_5

    .line 119
    .line 120
    const-wide/16 v6, -0x1

    .line 121
    .line 122
    aput-wide v6, v1, v3

    .line 123
    .line 124
    add-int/lit8 v3, v3, 0x1

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_5
    move v0, v2

    .line 128
    move v3, v0

    .line 129
    :goto_6
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    if-ge v0, v6, :cond_6

    .line 134
    .line 135
    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    add-int/lit8 v7, v3, 0x1

    .line 140
    .line 141
    int-to-long v8, v3

    .line 142
    aput-wide v8, v1, v6

    .line 143
    .line 144
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    move v3, v7

    .line 147
    goto :goto_6

    .line 148
    :cond_6
    move v0, v2

    .line 149
    :goto_7
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 150
    .line 151
    .line 152
    move-result v3

    .line 153
    if-ge v2, v3, :cond_7

    .line 154
    .line 155
    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    add-int/lit8 v4, v0, 0x1

    .line 160
    .line 161
    int-to-long v6, v0

    .line 162
    aput-wide v6, v1, v3

    .line 163
    .line 164
    add-int/lit8 v2, v2, 0x1

    .line 165
    .line 166
    move v0, v4

    .line 167
    goto :goto_7

    .line 168
    :cond_7
    sput-object v1, LP8/f;->d:[J

    .line 169
    .line 170
    return-void
.end method

.method private static final A(JJI)J
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v2, p0, v0

    .line 4
    .line 5
    if-lez v2, :cond_1

    .line 6
    .line 7
    cmp-long v2, p2, v0

    .line 8
    .line 9
    if-gtz v2, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    int-to-long v0, p4

    .line 13
    add-long/2addr p0, v0

    .line 14
    add-long/2addr p2, v0

    .line 15
    div-long/2addr p0, p2

    .line 16
    return-wide p0

    .line 17
    :cond_1
    :goto_0
    return-wide v0
.end method

.method private static final a(JII)J
    .locals 4

    .line 1
    if-lez p2, :cond_0

    .line 2
    .line 3
    int-to-long v0, p2

    .line 4
    mul-long/2addr p0, v0

    .line 5
    int-to-long p2, p3

    .line 6
    const-wide/16 v2, 0x1

    .line 7
    .line 8
    sub-long/2addr v0, v2

    .line 9
    mul-long/2addr p2, v0

    .line 10
    add-long/2addr p0, p2

    .line 11
    return-wide p0

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 13
    .line 14
    const-string p1, "Failed requirement."

    .line 15
    .line 16
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private static final b(J)I
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    cmp-long v0, v0, p0

    .line 4
    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    const-wide/32 v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    cmp-long v0, p0, v0

    .line 11
    .line 12
    if-gtz v0, :cond_0

    .line 13
    .line 14
    long-to-int p0, p0

    .line 15
    return p0

    .line 16
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "The resulting string length is too big: "

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-static {p0, p1}, Li7/x;->j(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide p0

    .line 32
    invoke-static {p0, p1}, Li7/x;->p(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method private static final c(Ljava/lang/String;II)I
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0xd

    .line 6
    .line 7
    const/16 v2, 0xa

    .line 8
    .line 9
    if-ne v0, v1, :cond_1

    .line 10
    .line 11
    add-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    if-ge v0, p2, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-ne p0, v2, :cond_0

    .line 20
    .line 21
    add-int/lit8 p1, p1, 0x2

    .line 22
    .line 23
    return p1

    .line 24
    :cond_0
    return v0

    .line 25
    :cond_1
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    if-ne p2, v2, :cond_2

    .line 30
    .line 31
    add-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    return p1

    .line 34
    :cond_2
    new-instance p2, Ljava/lang/NumberFormatException;

    .line 35
    .line 36
    new-instance v0, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 39
    .line 40
    .line 41
    const-string v1, "Expected a new line at index "

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v1, ", but was "

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-direct {p2, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw p2
.end method

.method private static final d([BILjava/lang/String;Ljava/lang/String;[I[CI)I
    .locals 0

    .line 1
    invoke-static {p2, p5, p6}, LP8/f;->s(Ljava/lang/String;[CI)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p0, p1, p4, p5, p2}, LP8/f;->e([BI[I[CI)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p3, p5, p0}, LP8/f;->s(Ljava/lang/String;[CI)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method private static final e([BI[I[CI)I
    .locals 0

    .line 1
    aget-byte p0, p0, p1

    .line 2
    .line 3
    and-int/lit16 p0, p0, 0xff

    .line 4
    .line 5
    aget p0, p2, p0

    .line 6
    .line 7
    shr-int/lit8 p1, p0, 0x8

    .line 8
    .line 9
    int-to-char p1, p1

    .line 10
    aput-char p1, p3, p4

    .line 11
    .line 12
    add-int/lit8 p1, p4, 0x1

    .line 13
    .line 14
    and-int/lit16 p0, p0, 0xff

    .line 15
    .line 16
    int-to-char p0, p0

    .line 17
    aput-char p0, p3, p1

    .line 18
    .line 19
    add-int/lit8 p4, p4, 0x2

    .line 20
    .line 21
    return p4
.end method

.method private static final f(IIII)I
    .locals 4

    .line 1
    if-lez p0, :cond_0

    .line 2
    .line 3
    const-wide/16 v0, 0x2

    .line 4
    .line 5
    int-to-long v2, p2

    .line 6
    add-long/2addr v2, v0

    .line 7
    int-to-long p2, p3

    .line 8
    add-long/2addr v2, p2

    .line 9
    int-to-long p1, p1

    .line 10
    add-long/2addr v2, p1

    .line 11
    int-to-long v0, p0

    .line 12
    mul-long/2addr v0, v2

    .line 13
    sub-long/2addr v0, p1

    .line 14
    invoke-static {v0, v1}, LP8/f;->b(J)I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0

    .line 19
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 20
    .line 21
    const-string p1, "Failed requirement."

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public static final g(IIIIIII)I
    .locals 5

    .line 1
    if-lez p0, :cond_1

    .line 2
    .line 3
    add-int/lit8 v0, p0, -0x1

    .line 4
    .line 5
    div-int v1, v0, p1

    .line 6
    .line 7
    add-int/lit8 v2, p1, -0x1

    .line 8
    .line 9
    div-int/2addr v2, p2

    .line 10
    rem-int v3, p0, p1

    .line 11
    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v3

    .line 16
    :goto_0
    add-int/lit8 p1, p1, -0x1

    .line 17
    .line 18
    div-int/2addr p1, p2

    .line 19
    mul-int/2addr v2, v1

    .line 20
    add-int/2addr v2, p1

    .line 21
    sub-int/2addr v0, v1

    .line 22
    sub-int/2addr v0, v2

    .line 23
    int-to-long p1, v1

    .line 24
    int-to-long v1, v2

    .line 25
    int-to-long v3, p3

    .line 26
    mul-long/2addr v1, v3

    .line 27
    add-long/2addr p1, v1

    .line 28
    int-to-long v0, v0

    .line 29
    int-to-long p3, p4

    .line 30
    mul-long/2addr v0, p3

    .line 31
    add-long/2addr p1, v0

    .line 32
    int-to-long p3, p0

    .line 33
    int-to-long v0, p5

    .line 34
    const-wide/16 v2, 0x2

    .line 35
    .line 36
    add-long/2addr v0, v2

    .line 37
    int-to-long p5, p6

    .line 38
    add-long/2addr v0, p5

    .line 39
    mul-long/2addr p3, v0

    .line 40
    add-long/2addr p1, p3

    .line 41
    invoke-static {p1, p2}, LP8/f;->b(J)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    return p0

    .line 46
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 47
    .line 48
    const-string p1, "Failed requirement."

    .line 49
    .line 50
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p0
.end method

.method private static final h(Ljava/lang/String;IILP8/g;)[B
    .locals 2

    .line 1
    sget-object v0, Lj7/d;->g:Lj7/d$a;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {v0, p1, p2, v1}, Lj7/d$a;->a(III)V

    .line 8
    .line 9
    .line 10
    if-ne p1, p2, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    new-array p0, p0, [B

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-virtual {p3}, LP8/g;->b()LP8/g$a;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    invoke-virtual {p3}, LP8/g$a;->j()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-static {p0, p1, p2, p3}, LP8/f;->j(Ljava/lang/String;IILP8/g$a;)[B

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    invoke-static {p0, p1, p2, p3}, LP8/f;->m(Ljava/lang/String;IILP8/g$a;)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public static final i(Ljava/lang/String;LP8/g;)[B
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "format"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    invoke-static {p0, v0, v1, p1}, LP8/f;->h(Ljava/lang/String;IILP8/g;)[B

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method private static final j(Ljava/lang/String;IILP8/g$a;)[B
    .locals 1

    .line 1
    invoke-virtual {p3}, LP8/g$a;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3}, LP8/f;->l(Ljava/lang/String;IILP8/g$a;)[B

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0, p1, p2, p3}, LP8/f;->k(Ljava/lang/String;IILP8/g$a;)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final k(Ljava/lang/String;IILP8/g$a;)[B
    .locals 12

    .line 1
    invoke-virtual {p3}, LP8/g$a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p3}, LP8/g$a;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    int-to-long v4, v4

    .line 22
    const-wide/16 v6, 0x2

    .line 23
    .line 24
    add-long/2addr v4, v6

    .line 25
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 26
    .line 27
    .line 28
    move-result v6

    .line 29
    int-to-long v6, v6

    .line 30
    add-long/2addr v4, v6

    .line 31
    int-to-long v6, v3

    .line 32
    add-long/2addr v4, v6

    .line 33
    sub-int v3, p2, p1

    .line 34
    .line 35
    int-to-long v8, v3

    .line 36
    add-long v10, v8, v6

    .line 37
    .line 38
    div-long/2addr v10, v4

    .line 39
    long-to-int v3, v10

    .line 40
    int-to-long v10, v3

    .line 41
    mul-long/2addr v10, v4

    .line 42
    sub-long/2addr v10, v6

    .line 43
    cmp-long v4, v10, v8

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_0
    invoke-virtual {p3}, LP8/g$a;->i()Z

    .line 50
    .line 51
    .line 52
    move-result p3

    .line 53
    new-array v4, v3, [B

    .line 54
    .line 55
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    const/4 v6, 0x0

    .line 60
    if-nez v5, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    move v7, v6

    .line 68
    :goto_0
    if-ge v7, v5, :cond_3

    .line 69
    .line 70
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    add-int v9, p1, v7

    .line 75
    .line 76
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 77
    .line 78
    .line 79
    move-result v9

    .line 80
    invoke-static {v8, v9, p3}, LP8/c;->d(CCZ)Z

    .line 81
    .line 82
    .line 83
    move-result v8

    .line 84
    if-nez v8, :cond_2

    .line 85
    .line 86
    const-string v8, "byte prefix"

    .line 87
    .line 88
    invoke-static {p0, p1, p2, v0, v8}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    add-int/lit8 v7, v7, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    add-int/2addr p1, v5

    .line 99
    :goto_1
    new-instance v5, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    add-int/lit8 v3, v3, -0x1

    .line 118
    .line 119
    move v2, v6

    .line 120
    :goto_2
    if-ge v2, v3, :cond_7

    .line 121
    .line 122
    invoke-static {p0, p1}, LP8/f;->n(Ljava/lang/String;I)B

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    aput-byte v5, v4, v2

    .line 127
    .line 128
    add-int/lit8 p1, p1, 0x2

    .line 129
    .line 130
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 131
    .line 132
    .line 133
    move-result v5

    .line 134
    if-nez v5, :cond_4

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    move v7, v6

    .line 142
    :goto_3
    if-ge v7, v5, :cond_6

    .line 143
    .line 144
    invoke-virtual {v0, v7}, Ljava/lang/String;->charAt(I)C

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    add-int v9, p1, v7

    .line 149
    .line 150
    invoke-virtual {p0, v9}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v9

    .line 154
    invoke-static {v8, v9, p3}, LP8/c;->d(CCZ)Z

    .line 155
    .line 156
    .line 157
    move-result v8

    .line 158
    if-nez v8, :cond_5

    .line 159
    .line 160
    const-string v8, "byte suffix + byte separator + byte prefix"

    .line 161
    .line 162
    invoke-static {p0, p1, p2, v0, v8}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    :cond_5
    add-int/lit8 v7, v7, 0x1

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 169
    .line 170
    .line 171
    move-result v5

    .line 172
    add-int/2addr p1, v5

    .line 173
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_7
    invoke-static {p0, p1}, LP8/f;->n(Ljava/lang/String;I)B

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    aput-byte v0, v4, v3

    .line 181
    .line 182
    add-int/lit8 p1, p1, 0x2

    .line 183
    .line 184
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    if-nez v0, :cond_8

    .line 189
    .line 190
    return-object v4

    .line 191
    :cond_8
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 192
    .line 193
    .line 194
    move-result v0

    .line 195
    :goto_5
    if-ge v6, v0, :cond_a

    .line 196
    .line 197
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    add-int v3, p1, v6

    .line 202
    .line 203
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    invoke-static {v2, v3, p3}, LP8/c;->d(CCZ)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_9

    .line 212
    .line 213
    const-string v2, "byte suffix"

    .line 214
    .line 215
    invoke-static {p0, p1, p2, v1, v2}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 219
    .line 220
    goto :goto_5

    .line 221
    :cond_a
    return-object v4
.end method

.method private static final l(Ljava/lang/String;IILP8/g$a;)[B
    .locals 11

    .line 1
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-gt v0, v1, :cond_9

    .line 11
    .line 12
    sub-int p1, p2, p1

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x2

    .line 16
    const/4 v4, 0x0

    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    and-int/lit8 p2, p1, 0x1

    .line 20
    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    return-object v2

    .line 24
    :cond_0
    shr-int/2addr p1, v1

    .line 25
    new-array p2, p1, [B

    .line 26
    .line 27
    move p3, v4

    .line 28
    :goto_0
    if-ge v4, p1, :cond_1

    .line 29
    .line 30
    invoke-static {p0, p3}, LP8/f;->n(Ljava/lang/String;I)B

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    aput-byte v0, p2, v4

    .line 35
    .line 36
    add-int/2addr p3, v3

    .line 37
    add-int/lit8 v4, v4, 0x1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-object p2

    .line 41
    :cond_2
    rem-int/lit8 v0, p1, 0x3

    .line 42
    .line 43
    if-eq v0, v3, :cond_3

    .line 44
    .line 45
    return-object v2

    .line 46
    :cond_3
    div-int/lit8 p1, p1, 0x3

    .line 47
    .line 48
    add-int/2addr p1, v1

    .line 49
    new-array v0, p1, [B

    .line 50
    .line 51
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    invoke-static {p0, v4}, LP8/f;->n(Ljava/lang/String;I)B

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    aput-byte v5, v0, v4

    .line 64
    .line 65
    :goto_1
    if-ge v1, p1, :cond_8

    .line 66
    .line 67
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eq v5, v2, :cond_7

    .line 72
    .line 73
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-virtual {p3}, LP8/g$a;->i()Z

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 89
    .line 90
    .line 91
    move-result v7

    .line 92
    move v8, v4

    .line 93
    :goto_2
    if-ge v8, v7, :cond_6

    .line 94
    .line 95
    invoke-virtual {v5, v8}, Ljava/lang/String;->charAt(I)C

    .line 96
    .line 97
    .line 98
    move-result v9

    .line 99
    add-int v10, v3, v8

    .line 100
    .line 101
    invoke-virtual {p0, v10}, Ljava/lang/String;->charAt(I)C

    .line 102
    .line 103
    .line 104
    move-result v10

    .line 105
    invoke-static {v9, v10, v6}, LP8/c;->d(CCZ)Z

    .line 106
    .line 107
    .line 108
    move-result v9

    .line 109
    if-nez v9, :cond_5

    .line 110
    .line 111
    const-string v9, "byte separator"

    .line 112
    .line 113
    invoke-static {p0, v3, p2, v5, v9}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_6
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 120
    .line 121
    .line 122
    :cond_7
    :goto_3
    add-int/lit8 v5, v3, 0x1

    .line 123
    .line 124
    invoke-static {p0, v5}, LP8/f;->n(Ljava/lang/String;I)B

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    aput-byte v5, v0, v1

    .line 129
    .line 130
    add-int/lit8 v3, v3, 0x3

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x1

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_8
    return-object v0

    .line 136
    :cond_9
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 137
    .line 138
    const-string p1, "Failed requirement."

    .line 139
    .line 140
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    throw p0
.end method

.method private static final m(Ljava/lang/String;IILP8/g$a;)[B
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->g()I

    .line 6
    .line 7
    .line 8
    move-result v3

    .line 9
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->f()I

    .line 10
    .line 11
    .line 12
    move-result v4

    .line 13
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->c()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->e()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v10

    .line 21
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v11

    .line 25
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->h()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->i()Z

    .line 30
    .line 31
    .line 32
    move-result v13

    .line 33
    sub-int v2, v1, p1

    .line 34
    .line 35
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    invoke-static/range {v2 .. v8}, LP8/f;->o(IIIIIII)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    new-array v5, v2, [B

    .line 56
    .line 57
    move/from16 v7, p1

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v14, 0x0

    .line 61
    const/4 v15, 0x0

    .line 62
    :goto_0
    if-ge v7, v1, :cond_10

    .line 63
    .line 64
    if-ne v14, v3, :cond_0

    .line 65
    .line 66
    invoke-static {v0, v7, v1}, LP8/f;->c(Ljava/lang/String;II)I

    .line 67
    .line 68
    .line 69
    move-result v7

    .line 70
    move/from16 v16, v3

    .line 71
    .line 72
    move/from16 v17, v4

    .line 73
    .line 74
    const/4 v14, 0x0

    .line 75
    :goto_1
    const/4 v15, 0x0

    .line 76
    goto/16 :goto_4

    .line 77
    .line 78
    :cond_0
    if-ne v15, v4, :cond_4

    .line 79
    .line 80
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 81
    .line 82
    .line 83
    move-result v15

    .line 84
    if-nez v15, :cond_1

    .line 85
    .line 86
    move/from16 v16, v3

    .line 87
    .line 88
    move/from16 v17, v4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-interface {v12}, Ljava/lang/CharSequence;->length()I

    .line 92
    .line 93
    .line 94
    move-result v15

    .line 95
    const/4 v6, 0x0

    .line 96
    :goto_2
    if-ge v6, v15, :cond_3

    .line 97
    .line 98
    move/from16 v16, v3

    .line 99
    .line 100
    invoke-virtual {v12, v6}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    move/from16 v17, v4

    .line 105
    .line 106
    add-int v4, v7, v6

    .line 107
    .line 108
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 109
    .line 110
    .line 111
    move-result v4

    .line 112
    invoke-static {v3, v4, v13}, LP8/c;->d(CCZ)Z

    .line 113
    .line 114
    .line 115
    move-result v3

    .line 116
    if-nez v3, :cond_2

    .line 117
    .line 118
    const-string v3, "group separator"

    .line 119
    .line 120
    invoke-static {v0, v7, v1, v12, v3}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 124
    .line 125
    move/from16 v3, v16

    .line 126
    .line 127
    move/from16 v4, v17

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_3
    move/from16 v16, v3

    .line 131
    .line 132
    move/from16 v17, v4

    .line 133
    .line 134
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    add-int/2addr v7, v3

    .line 139
    goto :goto_1

    .line 140
    :cond_4
    move/from16 v16, v3

    .line 141
    .line 142
    move/from16 v17, v4

    .line 143
    .line 144
    if-eqz v15, :cond_8

    .line 145
    .line 146
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-nez v3, :cond_5

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_5
    invoke-interface {v11}, Ljava/lang/CharSequence;->length()I

    .line 154
    .line 155
    .line 156
    move-result v3

    .line 157
    const/4 v4, 0x0

    .line 158
    :goto_3
    if-ge v4, v3, :cond_7

    .line 159
    .line 160
    invoke-virtual {v11, v4}, Ljava/lang/String;->charAt(I)C

    .line 161
    .line 162
    .line 163
    move-result v6

    .line 164
    move/from16 p1, v3

    .line 165
    .line 166
    add-int v3, v7, v4

    .line 167
    .line 168
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 169
    .line 170
    .line 171
    move-result v3

    .line 172
    invoke-static {v6, v3, v13}, LP8/c;->d(CCZ)Z

    .line 173
    .line 174
    .line 175
    move-result v3

    .line 176
    if-nez v3, :cond_6

    .line 177
    .line 178
    const-string v3, "byte separator"

    .line 179
    .line 180
    invoke-static {v0, v7, v1, v11, v3}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 184
    .line 185
    move/from16 v3, p1

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_7
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v3

    .line 192
    add-int/2addr v7, v3

    .line 193
    :cond_8
    :goto_4
    add-int/lit8 v14, v14, 0x1

    .line 194
    .line 195
    add-int/lit8 v15, v15, 0x1

    .line 196
    .line 197
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-nez v3, :cond_9

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_9
    invoke-interface {v9}, Ljava/lang/CharSequence;->length()I

    .line 205
    .line 206
    .line 207
    move-result v3

    .line 208
    const/4 v4, 0x0

    .line 209
    :goto_5
    if-ge v4, v3, :cond_b

    .line 210
    .line 211
    invoke-virtual {v9, v4}, Ljava/lang/String;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    move/from16 p1, v3

    .line 216
    .line 217
    add-int v3, v7, v4

    .line 218
    .line 219
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 220
    .line 221
    .line 222
    move-result v3

    .line 223
    invoke-static {v6, v3, v13}, LP8/c;->d(CCZ)Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v3, :cond_a

    .line 228
    .line 229
    const-string v3, "byte prefix"

    .line 230
    .line 231
    invoke-static {v0, v7, v1, v9, v3}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    :cond_a
    add-int/lit8 v4, v4, 0x1

    .line 235
    .line 236
    move/from16 v3, p1

    .line 237
    .line 238
    goto :goto_5

    .line 239
    :cond_b
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    add-int/2addr v7, v3

    .line 244
    :goto_6
    add-int/lit8 v3, v1, -0x2

    .line 245
    .line 246
    if-ge v3, v7, :cond_c

    .line 247
    .line 248
    const-string v3, "exactly"

    .line 249
    .line 250
    const/4 v4, 0x2

    .line 251
    invoke-static {v0, v7, v1, v3, v4}, LP8/f;->q(Ljava/lang/String;IILjava/lang/String;I)V

    .line 252
    .line 253
    .line 254
    :cond_c
    add-int/lit8 v3, v8, 0x1

    .line 255
    .line 256
    invoke-static {v0, v7}, LP8/f;->n(Ljava/lang/String;I)B

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    aput-byte v4, v5, v8

    .line 261
    .line 262
    add-int/lit8 v7, v7, 0x2

    .line 263
    .line 264
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 265
    .line 266
    .line 267
    move-result v4

    .line 268
    if-nez v4, :cond_d

    .line 269
    .line 270
    move/from16 p1, v3

    .line 271
    .line 272
    goto :goto_8

    .line 273
    :cond_d
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    .line 274
    .line 275
    .line 276
    move-result v4

    .line 277
    const/4 v6, 0x0

    .line 278
    :goto_7
    if-ge v6, v4, :cond_f

    .line 279
    .line 280
    invoke-virtual {v10, v6}, Ljava/lang/String;->charAt(I)C

    .line 281
    .line 282
    .line 283
    move-result v8

    .line 284
    move/from16 p1, v3

    .line 285
    .line 286
    add-int v3, v7, v6

    .line 287
    .line 288
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 289
    .line 290
    .line 291
    move-result v3

    .line 292
    invoke-static {v8, v3, v13}, LP8/c;->d(CCZ)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-nez v3, :cond_e

    .line 297
    .line 298
    const-string v3, "byte suffix"

    .line 299
    .line 300
    invoke-static {v0, v7, v1, v10, v3}, LP8/f;->r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    :cond_e
    add-int/lit8 v6, v6, 0x1

    .line 304
    .line 305
    move/from16 v3, p1

    .line 306
    .line 307
    goto :goto_7

    .line 308
    :cond_f
    move/from16 p1, v3

    .line 309
    .line 310
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 311
    .line 312
    .line 313
    move-result v3

    .line 314
    add-int/2addr v7, v3

    .line 315
    :goto_8
    move/from16 v8, p1

    .line 316
    .line 317
    move/from16 v3, v16

    .line 318
    .line 319
    move/from16 v4, v17

    .line 320
    .line 321
    goto/16 :goto_0

    .line 322
    .line 323
    :cond_10
    if-ne v8, v2, :cond_11

    .line 324
    .line 325
    return-object v5

    .line 326
    :cond_11
    invoke-static {v5, v8}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    const-string v1, "copyOf(...)"

    .line 331
    .line 332
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 333
    .line 334
    .line 335
    return-object v0
.end method

.method private static final n(Ljava/lang/String;I)B
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x8

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    sget-object v1, LP8/f;->c:[I

    .line 10
    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    if-ltz v0, :cond_1

    .line 14
    .line 15
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    ushr-int/lit8 v3, v2, 0x8

    .line 22
    .line 23
    if-nez v3, :cond_0

    .line 24
    .line 25
    aget v1, v1, v2

    .line 26
    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    shl-int/lit8 p0, v0, 0x4

    .line 30
    .line 31
    or-int/2addr p0, v1

    .line 32
    int-to-byte p0, p0

    .line 33
    return p0

    .line 34
    :cond_0
    invoke-static {p0, p1}, LP8/f;->p(Ljava/lang/String;I)Ljava/lang/Void;

    .line 35
    .line 36
    .line 37
    new-instance p0, Li7/e;

    .line 38
    .line 39
    invoke-direct {p0}, Li7/e;-><init>()V

    .line 40
    .line 41
    .line 42
    throw p0

    .line 43
    :cond_1
    invoke-static {p0, p1}, LP8/f;->p(Ljava/lang/String;I)Ljava/lang/Void;

    .line 44
    .line 45
    .line 46
    new-instance p0, Li7/e;

    .line 47
    .line 48
    invoke-direct {p0}, Li7/e;-><init>()V

    .line 49
    .line 50
    .line 51
    throw p0
.end method

.method public static final o(IIIIIII)I
    .locals 17

    .line 1
    move/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    if-lez v0, :cond_3

    .line 12
    .line 13
    move/from16 v5, p5

    .line 14
    .line 15
    int-to-long v5, v5

    .line 16
    const-wide/16 v7, 0x2

    .line 17
    .line 18
    add-long/2addr v5, v7

    .line 19
    move/from16 v7, p6

    .line 20
    .line 21
    int-to-long v7, v7

    .line 22
    add-long/2addr v5, v7

    .line 23
    invoke-static {v5, v6, v2, v4}, LP8/f;->a(JII)J

    .line 24
    .line 25
    .line 26
    move-result-wide v7

    .line 27
    if-gt v1, v2, :cond_0

    .line 28
    .line 29
    invoke-static {v5, v6, v1, v4}, LP8/f;->a(JII)J

    .line 30
    .line 31
    .line 32
    move-result-wide v9

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    div-int v9, v1, v2

    .line 35
    .line 36
    invoke-static {v7, v8, v9, v3}, LP8/f;->a(JII)J

    .line 37
    .line 38
    .line 39
    move-result-wide v9

    .line 40
    rem-int v11, v1, v2

    .line 41
    .line 42
    if-eqz v11, :cond_1

    .line 43
    .line 44
    int-to-long v12, v3

    .line 45
    add-long/2addr v9, v12

    .line 46
    invoke-static {v5, v6, v11, v4}, LP8/f;->a(JII)J

    .line 47
    .line 48
    .line 49
    move-result-wide v11

    .line 50
    add-long/2addr v9, v11

    .line 51
    :cond_1
    :goto_0
    int-to-long v11, v0

    .line 52
    const/4 v0, 0x1

    .line 53
    invoke-static {v11, v12, v9, v10, v0}, LP8/f;->A(JJI)J

    .line 54
    .line 55
    .line 56
    move-result-wide v13

    .line 57
    const-wide/16 v15, 0x1

    .line 58
    .line 59
    add-long/2addr v9, v15

    .line 60
    mul-long/2addr v9, v13

    .line 61
    sub-long/2addr v11, v9

    .line 62
    invoke-static {v11, v12, v7, v8, v3}, LP8/f;->A(JJI)J

    .line 63
    .line 64
    .line 65
    move-result-wide v9

    .line 66
    int-to-long v0, v3

    .line 67
    add-long/2addr v7, v0

    .line 68
    mul-long/2addr v7, v9

    .line 69
    sub-long/2addr v11, v7

    .line 70
    invoke-static {v11, v12, v5, v6, v4}, LP8/f;->A(JJI)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    int-to-long v3, v4

    .line 75
    add-long/2addr v5, v3

    .line 76
    mul-long/2addr v5, v0

    .line 77
    sub-long/2addr v11, v5

    .line 78
    const-wide/16 v3, 0x0

    .line 79
    .line 80
    cmp-long v3, v11, v3

    .line 81
    .line 82
    if-lez v3, :cond_2

    .line 83
    .line 84
    const/4 v3, 0x1

    .line 85
    :goto_1
    move/from16 v4, p1

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 v3, 0x0

    .line 89
    goto :goto_1

    .line 90
    :goto_2
    int-to-long v4, v4

    .line 91
    mul-long/2addr v13, v4

    .line 92
    int-to-long v4, v2

    .line 93
    mul-long/2addr v9, v4

    .line 94
    add-long/2addr v13, v9

    .line 95
    add-long/2addr v13, v0

    .line 96
    int-to-long v0, v3

    .line 97
    add-long/2addr v13, v0

    .line 98
    long-to-int v0, v13

    .line 99
    return v0

    .line 100
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 101
    .line 102
    const-string v1, "Failed requirement."

    .line 103
    .line 104
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    throw v0
.end method

.method private static final p(Ljava/lang/String;I)Ljava/lang/Void;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Expected a hexadecimal digit at index "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v2, ", but was "

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method

.method private static final q(Ljava/lang/String;IILjava/lang/String;I)V
    .locals 3

    .line 1
    const-string v0, "null cannot be cast to non-null type java.lang.String"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const-string v0, "substring(...)"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v0, Ljava/lang/NumberFormatException;

    .line 16
    .line 17
    new-instance v1, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v2, "Expected "

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 p3, 0x20

    .line 31
    .line 32
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p3, " hexadecimal digits at index "

    .line 39
    .line 40
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p3, ", but was \""

    .line 47
    .line 48
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p0, "\" of length "

    .line 55
    .line 56
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    sub-int/2addr p2, p1

    .line 60
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw v0
.end method

.method private static final r(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/2addr v0, p1

    .line 6
    invoke-static {v0, p2}, LB7/d;->h(II)I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    const-string v0, "null cannot be cast to non-null type java.lang.String"

    .line 11
    .line 12
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p2, "substring(...)"

    .line 20
    .line 21
    invoke-static {p0, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    new-instance p2, Ljava/lang/NumberFormatException;

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v1, "Expected "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p4, " \""

    .line 40
    .line 41
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p3, "\" at index "

    .line 48
    .line 49
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p1, ", but was "

    .line 56
    .line 57
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-direct {p2, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p2
.end method

.method private static final s(Ljava/lang/String;[CI)I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "null cannot be cast to non-null type java.lang.String"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v2, v0, p1, p2}, Ljava/lang/String;->getChars(II[CI)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    aput-char v0, p1, p2

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p2, p0

    .line 35
    return p2
.end method

.method public static final t([BIILP8/g;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "format"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sget-object v0, Lj7/d;->g:Lj7/d$a;

    .line 12
    .line 13
    array-length v1, p0

    .line 14
    invoke-virtual {v0, p1, p2, v1}, Lj7/d$a;->a(III)V

    .line 15
    .line 16
    .line 17
    if-ne p1, p2, :cond_0

    .line 18
    .line 19
    const-string p0, ""

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-virtual {p3}, LP8/g;->c()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    sget-object v0, LP8/f;->b:[I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    sget-object v0, LP8/f;->a:[I

    .line 32
    .line 33
    :goto_0
    invoke-virtual {p3}, LP8/g;->b()LP8/g$a;

    .line 34
    .line 35
    .line 36
    move-result-object p3

    .line 37
    invoke-virtual {p3}, LP8/g$a;->j()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-static {p0, p1, p2, p3, v0}, LP8/f;->w([BIILP8/g$a;[I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-static {p0, p1, p2, p3, v0}, LP8/f;->z([BIILP8/g$a;[I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method

.method public static final u([BLP8/g;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "format"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    array-length v1, p0

    .line 13
    invoke-static {p0, v0, v1, p1}, LP8/f;->t([BIILP8/g;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static synthetic v([BLP8/g;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    sget-object p1, LP8/g;->d:LP8/g$b;

    .line 6
    .line 7
    invoke-virtual {p1}, LP8/g$b;->a()LP8/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-static {p0, p1}, LP8/f;->u([BLP8/g;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method private static final w([BIILP8/g$a;[I)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p3}, LP8/g$a;->k()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1, p2, p3, p4}, LP8/f;->y([BIILP8/g$a;[I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LP8/f;->x([BIILP8/g$a;[I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method private static final x([BIILP8/g$a;[I)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p3}, LP8/g$a;->c()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    invoke-virtual {p3}, LP8/g$a;->e()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v3

    .line 9
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p3

    .line 13
    sub-int v0, p2, p1

    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-static {v0, v1, v4, v5}, LP8/f;->f(IIII)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    new-array v5, v0, [C

    .line 32
    .line 33
    const/4 v6, 0x0

    .line 34
    move-object v0, p0

    .line 35
    move v1, p1

    .line 36
    move-object v4, p4

    .line 37
    invoke-static/range {v0 .. v6}, LP8/f;->d([BILjava/lang/String;Ljava/lang/String;[I[CI)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    add-int/lit8 p1, v1, 0x1

    .line 42
    .line 43
    move v1, p1

    .line 44
    :goto_0
    if-ge v1, p2, :cond_0

    .line 45
    .line 46
    invoke-static {p3, v5, p0}, LP8/f;->s(Ljava/lang/String;[CI)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    invoke-static/range {v0 .. v6}, LP8/f;->d([BILjava/lang/String;Ljava/lang/String;[I[CI)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-static {v5}, LP8/B;->s([C)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method private static final y([BIILP8/g$a;[I)Ljava/lang/String;
    .locals 8

    .line 1
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-gt v0, v1, :cond_3

    .line 11
    .line 12
    sub-int v2, p2, p1

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    const-wide/16 v0, 0x2

    .line 18
    .line 19
    int-to-long v4, v2

    .line 20
    mul-long/2addr v4, v0

    .line 21
    invoke-static {v4, v5}, LP8/f;->b(J)I

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    new-array p3, p3, [C

    .line 26
    .line 27
    :goto_0
    if-ge p1, p2, :cond_0

    .line 28
    .line 29
    invoke-static {p0, p1, p4, p3, v3}, LP8/f;->e([BI[I[CI)I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    add-int/lit8 p1, p1, 0x1

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-static {p3}, LP8/B;->s([C)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    const-wide/16 v4, 0x3

    .line 42
    .line 43
    int-to-long v6, v2

    .line 44
    mul-long/2addr v6, v4

    .line 45
    const-wide/16 v4, 0x1

    .line 46
    .line 47
    sub-long/2addr v6, v4

    .line 48
    invoke-static {v6, v7}, LP8/f;->b(J)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    new-array v0, v0, [C

    .line 53
    .line 54
    invoke-virtual {p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p3

    .line 58
    invoke-virtual {p3, v3}, Ljava/lang/String;->charAt(I)C

    .line 59
    .line 60
    .line 61
    move-result p3

    .line 62
    invoke-static {p0, p1, p4, v0, v3}, LP8/f;->e([BI[I[CI)I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    add-int/2addr p1, v1

    .line 67
    :goto_1
    if-ge p1, p2, :cond_2

    .line 68
    .line 69
    add-int/lit8 v1, v2, 0x1

    .line 70
    .line 71
    aput-char p3, v0, v2

    .line 72
    .line 73
    invoke-static {p0, p1, p4, v0, v1}, LP8/f;->e([BI[I[CI)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    add-int/lit8 p1, p1, 0x1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_2
    invoke-static {v0}, LP8/B;->s([C)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 86
    .line 87
    const-string p1, "Failed requirement."

    .line 88
    .line 89
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p0
.end method

.method private static final z([BIILP8/g$a;[I)Ljava/lang/String;
    .locals 17

    .line 1
    move/from16 v0, p2

    .line 2
    .line 3
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->g()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->f()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->c()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v8

    .line 15
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->e()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v9

    .line 19
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->d()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v11

    .line 23
    invoke-virtual/range {p3 .. p3}, LP8/g$a;->h()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v12

    .line 27
    sub-int v1, v0, p1

    .line 28
    .line 29
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v5

    .line 37
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 42
    .line 43
    .line 44
    move-result v7

    .line 45
    invoke-static/range {v1 .. v7}, LP8/f;->g(IIIIIII)I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    move-object v7, v9

    .line 50
    new-array v9, v1, [C

    .line 51
    .line 52
    const/4 v13, 0x0

    .line 53
    move/from16 v5, p1

    .line 54
    .line 55
    move v4, v13

    .line 56
    move v6, v4

    .line 57
    move v10, v6

    .line 58
    :goto_0
    if-ge v5, v0, :cond_3

    .line 59
    .line 60
    if-ne v6, v2, :cond_0

    .line 61
    .line 62
    add-int/lit8 v6, v4, 0x1

    .line 63
    .line 64
    const/16 v10, 0xa

    .line 65
    .line 66
    aput-char v10, v9, v4

    .line 67
    .line 68
    move v4, v6

    .line 69
    move v14, v13

    .line 70
    move v15, v14

    .line 71
    goto :goto_1

    .line 72
    :cond_0
    if-ne v10, v3, :cond_1

    .line 73
    .line 74
    invoke-static {v12, v9, v4}, LP8/f;->s(Ljava/lang/String;[CI)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    move v14, v6

    .line 79
    move v15, v13

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    move v14, v6

    .line 82
    move v15, v10

    .line 83
    :goto_1
    if-eqz v15, :cond_2

    .line 84
    .line 85
    invoke-static {v11, v9, v4}, LP8/f;->s(Ljava/lang/String;[CI)I

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    :cond_2
    move v10, v4

    .line 90
    move-object v6, v8

    .line 91
    move-object/from16 v4, p0

    .line 92
    .line 93
    move-object/from16 v8, p4

    .line 94
    .line 95
    invoke-static/range {v4 .. v10}, LP8/f;->d([BILjava/lang/String;Ljava/lang/String;[I[CI)I

    .line 96
    .line 97
    .line 98
    move-result v10

    .line 99
    add-int/lit8 v4, v15, 0x1

    .line 100
    .line 101
    add-int/lit8 v8, v14, 0x1

    .line 102
    .line 103
    add-int/lit8 v5, v5, 0x1

    .line 104
    .line 105
    move/from16 v16, v10

    .line 106
    .line 107
    move v10, v4

    .line 108
    move/from16 v4, v16

    .line 109
    .line 110
    move/from16 v16, v8

    .line 111
    .line 112
    move-object v8, v6

    .line 113
    move/from16 v6, v16

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_3
    if-ne v4, v1, :cond_4

    .line 117
    .line 118
    invoke-static {v9}, LP8/B;->s([C)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    return-object v0

    .line 123
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 124
    .line 125
    const-string v1, "Check failed."

    .line 126
    .line 127
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    throw v0
.end method
