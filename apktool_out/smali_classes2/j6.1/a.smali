.class final Lj6/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lg6/a;


# instance fields
.field private final a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 5
    .line 6
    return-void
.end method

.method private static o(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lf6/a$b;
    .locals 9

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    new-instance v0, Lf6/a$b;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->t0()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->k0()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->e()I

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->s()I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->X()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->l0()I

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->A0()Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    invoke-virtual {p0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;->u0()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    invoke-direct/range {v0 .. v8}, Lf6/a$b;-><init>(IIIIIIZLjava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method


# virtual methods
.method public final a()Lf6/a$i;
    .locals 3

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->A0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$i;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->s()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->e()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-direct {v1, v2, v0}, Lf6/a$i;-><init>(Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final b()Lf6/a$e;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->l0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    new-instance v2, Lf6/a$e;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->t0()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->A0()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->N0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->L0()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v6

    .line 29
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->D0()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v7

    .line 33
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->X()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v8

    .line 37
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->e()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v9

    .line 41
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->s()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v10

    .line 45
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->k0()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v11

    .line 49
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->M0()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v12

    .line 53
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->J0()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v13

    .line 57
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->u0()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v14

    .line 61
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->l0()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v15

    .line 65
    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzor;->K0()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v16

    .line 69
    invoke-direct/range {v2 .. v16}, Lf6/a$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_0
    const/4 v1, 0x0

    .line 74
    return-object v1
.end method

.method public final c()Landroid/graphics/Rect;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->M0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final e()Lf6/a$c;
    .locals 9

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->X()Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->u0()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->X()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->k0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->l0()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v5

    .line 27
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->t0()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->s()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    invoke-static {v7}, Lj6/a;->o(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lf6/a$b;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzop;->e()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-static {v0}, Lj6/a;->o(Lcom/google/android/gms/internal/mlkit_code_scanner/zzoo;)Lf6/a$b;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-direct/range {v1 .. v8}, Lf6/a$c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lf6/a$b;Lf6/a$b;)V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_0
    const/4 v0, 0x0

    .line 52
    return-object v0
.end method

.method public final f()I
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->s()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final g()Lf6/a$j;
    .locals 3

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->D0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$j;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;->e()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzow;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v2, v0}, Lf6/a$j;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final getFormat()I
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->e()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final getUrl()Lf6/a$k;
    .locals 3

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->J0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$k;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;->e()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzox;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-direct {v1, v2, v0}, Lf6/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final h()Lf6/a$d;
    .locals 15

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->k0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    new-instance v2, Lf6/a$d;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->e()Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    if-nez v3, :cond_0

    .line 17
    .line 18
    move-object v3, v1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v4, Lf6/a$h;

    .line 21
    .line 22
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->s()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->t0()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v6

    .line 30
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->l0()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v7

    .line 34
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->e()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v8

    .line 38
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->k0()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v9

    .line 42
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->X()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    invoke-virtual {v3}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzou;->u0()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v11

    .line 50
    invoke-direct/range {v4 .. v11}, Lf6/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    move-object v3, v4

    .line 54
    :goto_0
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->s()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->X()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->t0()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    new-instance v6, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 69
    .line 70
    .line 71
    const/4 v7, 0x0

    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    move v8, v7

    .line 75
    :goto_1
    array-length v9, v1

    .line 76
    if-ge v8, v9, :cond_2

    .line 77
    .line 78
    aget-object v9, v1, v8

    .line 79
    .line 80
    if-eqz v9, :cond_1

    .line 81
    .line 82
    new-instance v10, Lf6/a$i;

    .line 83
    .line 84
    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->s()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v11

    .line 88
    invoke-virtual {v9}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzov;->e()I

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    invoke-direct {v10, v11, v9}, Lf6/a$i;-><init>(Ljava/lang/String;I)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->l0()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move v8, v7

    .line 106
    new-instance v7, Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    move v9, v8

    .line 114
    :goto_2
    array-length v10, v1

    .line 115
    if-ge v9, v10, :cond_4

    .line 116
    .line 117
    aget-object v10, v1, v9

    .line 118
    .line 119
    if-eqz v10, :cond_3

    .line 120
    .line 121
    new-instance v11, Lf6/a$f;

    .line 122
    .line 123
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->e()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->s()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v13

    .line 131
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->k0()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v14

    .line 135
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->X()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    invoke-direct {v11, v12, v13, v14, v10}, Lf6/a$f;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-interface {v7, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->u0()[Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    if-eqz v1, :cond_5

    .line 153
    .line 154
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->u0()[Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v1}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    check-cast v1, [Ljava/lang/String;

    .line 163
    .line 164
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    goto :goto_3

    .line 169
    :cond_5
    new-instance v1, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    :goto_3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoq;->k0()[Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    new-instance v9, Ljava/util/ArrayList;

    .line 179
    .line 180
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 181
    .line 182
    .line 183
    if-eqz v0, :cond_7

    .line 184
    .line 185
    :goto_4
    array-length v10, v0

    .line 186
    if-ge v8, v10, :cond_7

    .line 187
    .line 188
    aget-object v10, v0, v8

    .line 189
    .line 190
    if-eqz v10, :cond_6

    .line 191
    .line 192
    new-instance v11, Lf6/a$a;

    .line 193
    .line 194
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;->e()I

    .line 195
    .line 196
    .line 197
    move-result v12

    .line 198
    invoke-virtual {v10}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzon;->s()[Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v10

    .line 202
    invoke-direct {v11, v12, v10}, Lf6/a$a;-><init>(I[Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    invoke-interface {v9, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_6
    add-int/lit8 v8, v8, 0x1

    .line 209
    .line 210
    goto :goto_4

    .line 211
    :cond_7
    move-object v8, v1

    .line 212
    invoke-direct/range {v2 .. v9}, Lf6/a$d;-><init>(Lf6/a$h;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    .line 213
    .line 214
    .line 215
    return-object v2

    .line 216
    :cond_8
    return-object v1
.end method

.method public final i()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->L0()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final j()[B
    .locals 1

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->N0()[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final k()[Landroid/graphics/Point;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public final l()Lf6/a$f;
    .locals 5

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->t0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    new-instance v1, Lf6/a$f;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->e()I

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->s()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->k0()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzos;->X()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v1, v2, v3, v4, v0}, Lf6/a$f;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v1
.end method

.method public final m()Lf6/a$g;
    .locals 6

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->u0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$g;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;->e()D

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzot;->s()D

    .line 16
    .line 17
    .line 18
    move-result-wide v4

    .line 19
    invoke-direct {v1, v2, v3, v4, v5}, Lf6/a$g;-><init>(DD)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method

.method public final n()Lf6/a$l;
    .locals 4

    .line 1
    iget-object v0, p0, Lj6/a;->a:Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoz;->K0()Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v1, Lf6/a$l;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->X()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->s()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_code_scanner/zzoy;->e()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-direct {v1, v2, v3, v0}, Lf6/a$l;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    return-object v0
.end method
