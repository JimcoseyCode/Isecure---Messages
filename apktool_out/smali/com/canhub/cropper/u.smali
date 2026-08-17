.class public final Lcom/canhub/cropper/u;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/u$a;
    }
.end annotation


# instance fields
.field private final a:Landroid/graphics/RectF;

.field private final b:Landroid/graphics/RectF;

.field private c:F

.field private d:F

.field private e:F

.field private f:F

.field private g:F

.field private h:F

.field private i:F

.field private j:F

.field private k:F

.field private l:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/graphics/RectF;

    .line 5
    .line 6
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 10
    .line 11
    new-instance v0, Landroid/graphics/RectF;

    .line 12
    .line 13
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/canhub/cropper/u;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    const/high16 v0, 0x3f800000    # 1.0f

    .line 19
    .line 20
    iput v0, p0, Lcom/canhub/cropper/u;->k:F

    .line 21
    .line 22
    iput v0, p0, Lcom/canhub/cropper/u;->l:F

    .line 23
    .line 24
    return-void
.end method

.method private final a(FFFF)F
    .locals 0

    .line 1
    sub-float/2addr p1, p3

    .line 2
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    sub-float/2addr p2, p4

    .line 7
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-static {p1, p2}, Ljava/lang/Math;->max(FF)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    return p1
.end method

.method private final b()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/canhub/cropper/u;->x()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    xor-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    return v0
.end method

.method private final h(FFZ)Lcom/canhub/cropper/v$b;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x6

    .line 8
    int-to-float v1, v1

    .line 9
    div-float/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 11
    .line 12
    iget v3, v2, Landroid/graphics/RectF;->left:F

    .line 13
    .line 14
    add-float v4, v3, v0

    .line 15
    .line 16
    const/4 v5, 0x5

    .line 17
    int-to-float v5, v5

    .line 18
    mul-float/2addr v0, v5

    .line 19
    add-float/2addr v3, v0

    .line 20
    invoke-virtual {v2}, Landroid/graphics/RectF;->height()F

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    div-float/2addr v0, v1

    .line 25
    iget-object v1, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 26
    .line 27
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    add-float v2, v1, v0

    .line 30
    .line 31
    mul-float/2addr v5, v0

    .line 32
    add-float/2addr v1, v5

    .line 33
    cmpg-float v0, p1, v4

    .line 34
    .line 35
    if-gez v0, :cond_2

    .line 36
    .line 37
    cmpg-float p1, p2, v2

    .line 38
    .line 39
    if-gez p1, :cond_0

    .line 40
    .line 41
    sget-object p1, Lcom/canhub/cropper/v$b;->g:Lcom/canhub/cropper/v$b;

    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_0
    cmpg-float p1, p2, v1

    .line 45
    .line 46
    if-gez p1, :cond_1

    .line 47
    .line 48
    sget-object p1, Lcom/canhub/cropper/v$b;->k:Lcom/canhub/cropper/v$b;

    .line 49
    .line 50
    return-object p1

    .line 51
    :cond_1
    sget-object p1, Lcom/canhub/cropper/v$b;->i:Lcom/canhub/cropper/v$b;

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_2
    cmpg-float p1, p1, v3

    .line 55
    .line 56
    if-gez p1, :cond_6

    .line 57
    .line 58
    cmpg-float p1, p2, v2

    .line 59
    .line 60
    if-gez p1, :cond_3

    .line 61
    .line 62
    sget-object p1, Lcom/canhub/cropper/v$b;->l:Lcom/canhub/cropper/v$b;

    .line 63
    .line 64
    return-object p1

    .line 65
    :cond_3
    cmpg-float p1, p2, v1

    .line 66
    .line 67
    if-gez p1, :cond_5

    .line 68
    .line 69
    if-eqz p3, :cond_4

    .line 70
    .line 71
    sget-object p1, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_4
    const/4 p1, 0x0

    .line 75
    return-object p1

    .line 76
    :cond_5
    sget-object p1, Lcom/canhub/cropper/v$b;->n:Lcom/canhub/cropper/v$b;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_6
    cmpg-float p1, p2, v2

    .line 80
    .line 81
    if-gez p1, :cond_7

    .line 82
    .line 83
    sget-object p1, Lcom/canhub/cropper/v$b;->h:Lcom/canhub/cropper/v$b;

    .line 84
    .line 85
    return-object p1

    .line 86
    :cond_7
    cmpg-float p1, p2, v1

    .line 87
    .line 88
    if-gez p1, :cond_8

    .line 89
    .line 90
    sget-object p1, Lcom/canhub/cropper/v$b;->m:Lcom/canhub/cropper/v$b;

    .line 91
    .line 92
    return-object p1

    .line 93
    :cond_8
    sget-object p1, Lcom/canhub/cropper/v$b;->j:Lcom/canhub/cropper/v$b;

    .line 94
    .line 95
    return-object p1
.end method

.method private final j(FFFZ)Lcom/canhub/cropper/v$b;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    invoke-direct {p0, p1, p2, v1, v0}, Lcom/canhub/cropper/u;->a(FFFF)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    cmpg-float v0, v0, p3

    .line 14
    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    sget-object p1, Lcom/canhub/cropper/v$b;->k:Lcom/canhub/cropper/v$b;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v1, v0, Landroid/graphics/RectF;->right:F

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerY()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    invoke-direct {p0, p1, p2, v1, v0}, Lcom/canhub/cropper/u;->a(FFFF)F

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    cmpg-float p3, v0, p3

    .line 33
    .line 34
    if-gtz p3, :cond_1

    .line 35
    .line 36
    sget-object p1, Lcom/canhub/cropper/v$b;->m:Lcom/canhub/cropper/v$b;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    if-eqz p4, :cond_2

    .line 40
    .line 41
    iget-object p3, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 42
    .line 43
    iget v3, p3, Landroid/graphics/RectF;->left:F

    .line 44
    .line 45
    iget v4, p3, Landroid/graphics/RectF;->top:F

    .line 46
    .line 47
    iget v5, p3, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    iget v6, p3, Landroid/graphics/RectF;->bottom:F

    .line 50
    .line 51
    move-object v0, p0

    .line 52
    move v1, p1

    .line 53
    move v2, p2

    .line 54
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->o(FFFFFF)Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    sget-object p1, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 61
    .line 62
    return-object p1

    .line 63
    :cond_2
    move-object v0, p0

    .line 64
    move v1, p1

    .line 65
    move v2, p2

    .line 66
    :cond_3
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/u;->h(FFZ)Lcom/canhub/cropper/v$b;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method private final k(FFFZ)Lcom/canhub/cropper/v$b;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget v4, v0, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    iget v5, v0, Landroid/graphics/RectF;->top:F

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    move v2, p1

    .line 9
    move v3, p2

    .line 10
    move v6, p3

    .line 11
    invoke-direct/range {v1 .. v6}, Lcom/canhub/cropper/u;->p(FFFFF)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    move-object v0, v1

    .line 16
    move v1, v2

    .line 17
    move v2, v3

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    sget-object p1, Lcom/canhub/cropper/v$b;->g:Lcom/canhub/cropper/v$b;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 24
    .line 25
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 28
    .line 29
    move v5, v6

    .line 30
    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/u;->p(FFFFF)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    sget-object p1, Lcom/canhub/cropper/v$b;->h:Lcom/canhub/cropper/v$b;

    .line 37
    .line 38
    return-object p1

    .line 39
    :cond_1
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 40
    .line 41
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 42
    .line 43
    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    .line 44
    .line 45
    move v5, v6

    .line 46
    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/u;->p(FFFFF)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eqz p1, :cond_2

    .line 51
    .line 52
    sget-object p1, Lcom/canhub/cropper/v$b;->i:Lcom/canhub/cropper/v$b;

    .line 53
    .line 54
    return-object p1

    .line 55
    :cond_2
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 56
    .line 57
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 58
    .line 59
    iget v4, p1, Landroid/graphics/RectF;->bottom:F

    .line 60
    .line 61
    move v5, v6

    .line 62
    invoke-direct/range {v0 .. v5}, Lcom/canhub/cropper/u;->p(FFFFF)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    move p2, v5

    .line 67
    if-eqz p1, :cond_3

    .line 68
    .line 69
    sget-object p1, Lcom/canhub/cropper/v$b;->j:Lcom/canhub/cropper/v$b;

    .line 70
    .line 71
    return-object p1

    .line 72
    :cond_3
    if-eqz p4, :cond_4

    .line 73
    .line 74
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 75
    .line 76
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 77
    .line 78
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 79
    .line 80
    iget v5, p1, Landroid/graphics/RectF;->right:F

    .line 81
    .line 82
    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    .line 83
    .line 84
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->o(FFFFFF)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_4

    .line 89
    .line 90
    invoke-direct {p0}, Lcom/canhub/cropper/u;->b()Z

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    sget-object p1, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 97
    .line 98
    return-object p1

    .line 99
    :cond_4
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 100
    .line 101
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 102
    .line 103
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 104
    .line 105
    iget v5, p1, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    move v6, p2

    .line 108
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->q(FFFFFF)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_5

    .line 113
    .line 114
    sget-object p1, Lcom/canhub/cropper/v$b;->l:Lcom/canhub/cropper/v$b;

    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_5
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 118
    .line 119
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 120
    .line 121
    iget v4, p1, Landroid/graphics/RectF;->right:F

    .line 122
    .line 123
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 124
    .line 125
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->q(FFFFFF)Z

    .line 126
    .line 127
    .line 128
    move-result p1

    .line 129
    if-eqz p1, :cond_6

    .line 130
    .line 131
    sget-object p1, Lcom/canhub/cropper/v$b;->n:Lcom/canhub/cropper/v$b;

    .line 132
    .line 133
    return-object p1

    .line 134
    :cond_6
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 135
    .line 136
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 137
    .line 138
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 139
    .line 140
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 141
    .line 142
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->r(FFFFFF)Z

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    if-eqz p1, :cond_7

    .line 147
    .line 148
    sget-object p1, Lcom/canhub/cropper/v$b;->k:Lcom/canhub/cropper/v$b;

    .line 149
    .line 150
    return-object p1

    .line 151
    :cond_7
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 152
    .line 153
    iget v3, p1, Landroid/graphics/RectF;->right:F

    .line 154
    .line 155
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 156
    .line 157
    iget v5, p1, Landroid/graphics/RectF;->bottom:F

    .line 158
    .line 159
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->r(FFFFFF)Z

    .line 160
    .line 161
    .line 162
    move-result p1

    .line 163
    if-eqz p1, :cond_8

    .line 164
    .line 165
    sget-object p1, Lcom/canhub/cropper/v$b;->m:Lcom/canhub/cropper/v$b;

    .line 166
    .line 167
    return-object p1

    .line 168
    :cond_8
    if-eqz p4, :cond_9

    .line 169
    .line 170
    iget-object p1, v0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 171
    .line 172
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 173
    .line 174
    iget v4, p1, Landroid/graphics/RectF;->top:F

    .line 175
    .line 176
    iget v5, p1, Landroid/graphics/RectF;->right:F

    .line 177
    .line 178
    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    .line 179
    .line 180
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->o(FFFFFF)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    if-eqz p1, :cond_9

    .line 185
    .line 186
    invoke-direct {p0}, Lcom/canhub/cropper/u;->b()Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    if-nez p1, :cond_9

    .line 191
    .line 192
    sget-object p1, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 193
    .line 194
    return-object p1

    .line 195
    :cond_9
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/u;->h(FFZ)Lcom/canhub/cropper/v$b;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    return-object p1
.end method

.method private final l(FFFZ)Lcom/canhub/cropper/v$b;
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/RectF;->top:F

    .line 10
    .line 11
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/u;->a(FFFF)F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    cmpg-float v0, v0, p3

    .line 16
    .line 17
    if-gtz v0, :cond_0

    .line 18
    .line 19
    sget-object p1, Lcom/canhub/cropper/v$b;->l:Lcom/canhub/cropper/v$b;

    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_0
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/graphics/RectF;->centerX()F

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v1, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 29
    .line 30
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 31
    .line 32
    invoke-direct {p0, p1, p2, v0, v1}, Lcom/canhub/cropper/u;->a(FFFF)F

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    cmpg-float p3, v0, p3

    .line 37
    .line 38
    if-gtz p3, :cond_1

    .line 39
    .line 40
    sget-object p1, Lcom/canhub/cropper/v$b;->n:Lcom/canhub/cropper/v$b;

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_1
    if-eqz p4, :cond_2

    .line 44
    .line 45
    iget-object p3, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 46
    .line 47
    iget v3, p3, Landroid/graphics/RectF;->left:F

    .line 48
    .line 49
    iget v4, p3, Landroid/graphics/RectF;->top:F

    .line 50
    .line 51
    iget v5, p3, Landroid/graphics/RectF;->right:F

    .line 52
    .line 53
    iget v6, p3, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    move-object v0, p0

    .line 56
    move v1, p1

    .line 57
    move v2, p2

    .line 58
    invoke-direct/range {v0 .. v6}, Lcom/canhub/cropper/u;->o(FFFFFF)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_3

    .line 63
    .line 64
    sget-object p1, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 65
    .line 66
    return-object p1

    .line 67
    :cond_2
    move-object v0, p0

    .line 68
    move v1, p1

    .line 69
    move v2, p2

    .line 70
    :cond_3
    invoke-direct {p0, v1, v2, p4}, Lcom/canhub/cropper/u;->h(FFZ)Lcom/canhub/cropper/v$b;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    return-object p1
.end method

.method private final o(FFFFFF)Z
    .locals 0

    .line 1
    cmpl-float p3, p1, p3

    .line 2
    .line 3
    if-lez p3, :cond_0

    .line 4
    .line 5
    cmpg-float p1, p1, p5

    .line 6
    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    cmpl-float p1, p2, p4

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    cmpg-float p1, p2, p6

    .line 14
    .line 15
    if-gez p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method private final p(FFFFF)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/canhub/cropper/u;->a(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    cmpg-float p1, p1, p5

    .line 6
    .line 7
    if-gtz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    return p1

    .line 11
    :cond_0
    const/4 p1, 0x0

    .line 12
    return p1
.end method

.method private final q(FFFFFF)Z
    .locals 0

    .line 1
    cmpl-float p3, p1, p3

    .line 2
    .line 3
    if-lez p3, :cond_0

    .line 4
    .line 5
    cmpg-float p1, p1, p4

    .line 6
    .line 7
    if-gez p1, :cond_0

    .line 8
    .line 9
    sub-float/2addr p2, p5

    .line 10
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    cmpg-float p1, p1, p6

    .line 15
    .line 16
    if-gtz p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method

.method private final r(FFFFFF)Z
    .locals 0

    .line 1
    sub-float/2addr p1, p3

    .line 2
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 3
    .line 4
    .line 5
    move-result p1

    .line 6
    cmpg-float p1, p1, p6

    .line 7
    .line 8
    if-gtz p1, :cond_0

    .line 9
    .line 10
    cmpl-float p1, p2, p4

    .line 11
    .line 12
    if-lez p1, :cond_0

    .line 13
    .line 14
    cmpg-float p1, p2, p5

    .line 15
    .line 16
    if-gez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    return p1

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1
.end method


# virtual methods
.method public final c()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->f:F

    .line 2
    .line 3
    iget v1, p0, Lcom/canhub/cropper/u;->j:F

    .line 4
    .line 5
    iget v2, p0, Lcom/canhub/cropper/u;->l:F

    .line 6
    .line 7
    div-float/2addr v1, v2

    .line 8
    invoke-static {v0, v1}, LB7/d;->g(FF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final d()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->e:F

    .line 2
    .line 3
    iget v1, p0, Lcom/canhub/cropper/u;->i:F

    .line 4
    .line 5
    iget v2, p0, Lcom/canhub/cropper/u;->k:F

    .line 6
    .line 7
    div-float/2addr v1, v2

    .line 8
    invoke-static {v0, v1}, LB7/d;->g(FF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final e()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->d:F

    .line 2
    .line 3
    iget v1, p0, Lcom/canhub/cropper/u;->h:F

    .line 4
    .line 5
    iget v2, p0, Lcom/canhub/cropper/u;->l:F

    .line 6
    .line 7
    div-float/2addr v1, v2

    .line 8
    invoke-static {v0, v1}, LB7/d;->c(FF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final f()F
    .locals 3

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->c:F

    .line 2
    .line 3
    iget v1, p0, Lcom/canhub/cropper/u;->g:F

    .line 4
    .line 5
    iget v2, p0, Lcom/canhub/cropper/u;->k:F

    .line 6
    .line 7
    div-float/2addr v1, v2

    .line 8
    invoke-static {v0, v1}, LB7/d;->c(FF)F

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    return v0
.end method

.method public final g(FFFLcom/canhub/cropper/CropImageView$d;Z)Lcom/canhub/cropper/v;
    .locals 1

    .line 1
    const-string v0, "cropShape"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/canhub/cropper/u$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p4

    .line 12
    aget p4, v0, p4

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p4, v0, :cond_3

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p4, v0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-eq p4, v0, :cond_1

    .line 22
    .line 23
    const/4 v0, 0x4

    .line 24
    if-ne p4, v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/u;->j(FFFZ)Lcom/canhub/cropper/v$b;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p1, Li7/m;

    .line 32
    .line 33
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 34
    .line 35
    .line 36
    throw p1

    .line 37
    :cond_1
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/u;->l(FFFZ)Lcom/canhub/cropper/v$b;

    .line 38
    .line 39
    .line 40
    move-result-object p3

    .line 41
    goto :goto_0

    .line 42
    :cond_2
    invoke-direct {p0, p1, p2, p5}, Lcom/canhub/cropper/u;->h(FFZ)Lcom/canhub/cropper/v$b;

    .line 43
    .line 44
    .line 45
    move-result-object p3

    .line 46
    goto :goto_0

    .line 47
    :cond_3
    invoke-direct {p0, p1, p2, p3, p5}, Lcom/canhub/cropper/u;->k(FFFZ)Lcom/canhub/cropper/v$b;

    .line 48
    .line 49
    .line 50
    move-result-object p3

    .line 51
    :goto_0
    if-eqz p3, :cond_4

    .line 52
    .line 53
    new-instance p4, Lcom/canhub/cropper/v;

    .line 54
    .line 55
    invoke-direct {p4, p3, p0, p1, p2}, Lcom/canhub/cropper/v;-><init>(Lcom/canhub/cropper/v$b;Lcom/canhub/cropper/u;FF)V

    .line 56
    .line 57
    .line 58
    return-object p4

    .line 59
    :cond_4
    const/4 p1, 0x0

    .line 60
    return-object p1
.end method

.method public final i()Landroid/graphics/RectF;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->b:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/canhub/cropper/u;->b:Landroid/graphics/RectF;

    .line 9
    .line 10
    return-object v0
.end method

.method public final m()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->l:F

    .line 2
    .line 3
    return v0
.end method

.method public final n()F
    .locals 1

    .line 1
    iget v0, p0, Lcom/canhub/cropper/u;->k:F

    .line 2
    .line 3
    return v0
.end method

.method public final s(FFFF)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/canhub/cropper/u;->e:F

    .line 2
    .line 3
    iput p2, p0, Lcom/canhub/cropper/u;->f:F

    .line 4
    .line 5
    iput p3, p0, Lcom/canhub/cropper/u;->k:F

    .line 6
    .line 7
    iput p4, p0, Lcom/canhub/cropper/u;->l:F

    .line 8
    .line 9
    return-void
.end method

.method public final t(Lcom/canhub/cropper/CropImageOptions;)V
    .locals 1

    .line 1
    const-string v0, "options"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->M:I

    .line 7
    .line 8
    int-to-float v0, v0

    .line 9
    iput v0, p0, Lcom/canhub/cropper/u;->c:F

    .line 10
    .line 11
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->N:I

    .line 12
    .line 13
    int-to-float v0, v0

    .line 14
    iput v0, p0, Lcom/canhub/cropper/u;->d:F

    .line 15
    .line 16
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->O:I

    .line 17
    .line 18
    int-to-float v0, v0

    .line 19
    iput v0, p0, Lcom/canhub/cropper/u;->g:F

    .line 20
    .line 21
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->P:I

    .line 22
    .line 23
    int-to-float v0, v0

    .line 24
    iput v0, p0, Lcom/canhub/cropper/u;->h:F

    .line 25
    .line 26
    iget v0, p1, Lcom/canhub/cropper/CropImageOptions;->Q:I

    .line 27
    .line 28
    int-to-float v0, v0

    .line 29
    iput v0, p0, Lcom/canhub/cropper/u;->i:F

    .line 30
    .line 31
    iget p1, p1, Lcom/canhub/cropper/CropImageOptions;->R:I

    .line 32
    .line 33
    int-to-float p1, p1

    .line 34
    iput p1, p0, Lcom/canhub/cropper/u;->j:F

    .line 35
    .line 36
    return-void
.end method

.method public final u(II)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/canhub/cropper/u;->i:F

    .line 3
    .line 4
    int-to-float p1, p2

    .line 5
    iput p1, p0, Lcom/canhub/cropper/u;->j:F

    .line 6
    .line 7
    return-void
.end method

.method public final v(II)V
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    iput p1, p0, Lcom/canhub/cropper/u;->g:F

    .line 3
    .line 4
    int-to-float p1, p2

    .line 5
    iput p1, p0, Lcom/canhub/cropper/u;->h:F

    .line 6
    .line 7
    return-void
.end method

.method public final w(Landroid/graphics/RectF;)V
    .locals 1

    .line 1
    const-string v0, "rect"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final x()Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x42c80000    # 100.0f

    .line 8
    .line 9
    cmpg-float v0, v0, v1

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcom/canhub/cropper/u;->a:Landroid/graphics/RectF;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/graphics/RectF;->height()F

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    cmpg-float v0, v0, v1

    .line 20
    .line 21
    if-ltz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    return v0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    return v0
.end method
