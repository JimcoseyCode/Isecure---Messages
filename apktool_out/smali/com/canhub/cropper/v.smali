.class public final Lcom/canhub/cropper/v;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/canhub/cropper/v$a;,
        Lcom/canhub/cropper/v$b;,
        Lcom/canhub/cropper/v$c;
    }
.end annotation


# static fields
.field public static final g:Lcom/canhub/cropper/v$a;


# instance fields
.field private final a:Lcom/canhub/cropper/v$b;

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:Landroid/graphics/PointF;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/canhub/cropper/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/canhub/cropper/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/canhub/cropper/v;->g:Lcom/canhub/cropper/v$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/canhub/cropper/v$b;Lcom/canhub/cropper/u;FF)V
    .locals 1

    .line 1
    const-string v0, "type"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "cropWindowHandler"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/canhub/cropper/v;->a:Lcom/canhub/cropper/v$b;

    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/canhub/cropper/u;->f()F

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    iput p1, p0, Lcom/canhub/cropper/v;->b:F

    .line 21
    .line 22
    invoke-virtual {p2}, Lcom/canhub/cropper/u;->e()F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    iput p1, p0, Lcom/canhub/cropper/v;->c:F

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/canhub/cropper/u;->d()F

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    iput p1, p0, Lcom/canhub/cropper/v;->d:F

    .line 33
    .line 34
    invoke-virtual {p2}, Lcom/canhub/cropper/u;->c()F

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    iput p1, p0, Lcom/canhub/cropper/v;->e:F

    .line 39
    .line 40
    new-instance p1, Landroid/graphics/PointF;

    .line 41
    .line 42
    const/4 v0, 0x0

    .line 43
    invoke-direct {p1, v0, v0}, Landroid/graphics/PointF;-><init>(FF)V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 47
    .line 48
    invoke-virtual {p2}, Lcom/canhub/cropper/u;->i()Landroid/graphics/RectF;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-direct {p0, p1, p3, p4}, Lcom/canhub/cropper/v;->k(Landroid/graphics/RectF;FF)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method private final a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V
    .locals 4

    .line 1
    int-to-float p4, p4

    .line 2
    cmpl-float v0, p2, p4

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    sub-float/2addr p2, p4

    .line 7
    const v0, 0x3f866666    # 1.05f

    .line 8
    .line 9
    .line 10
    div-float/2addr p2, v0

    .line 11
    add-float/2addr p2, p4

    .line 12
    iget-object v0, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 15
    .line 16
    sub-float p4, p2, p4

    .line 17
    .line 18
    const v2, 0x3f8ccccd    # 1.1f

    .line 19
    .line 20
    .line 21
    div-float/2addr p4, v2

    .line 22
    sub-float/2addr v1, p4

    .line 23
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 24
    .line 25
    :cond_0
    iget p4, p3, Landroid/graphics/RectF;->bottom:F

    .line 26
    .line 27
    cmpl-float v0, p2, p4

    .line 28
    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/PointF;->y:F

    .line 34
    .line 35
    sub-float v2, p2, p4

    .line 36
    .line 37
    const/high16 v3, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v2, v3

    .line 40
    sub-float/2addr v1, v2

    .line 41
    iput v1, v0, Landroid/graphics/PointF;->y:F

    .line 42
    .line 43
    :cond_1
    sub-float v0, p4, p2

    .line 44
    .line 45
    cmpg-float v0, v0, p5

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    move p2, p4

    .line 50
    :cond_2
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 51
    .line 52
    sub-float v1, p2, v0

    .line 53
    .line 54
    iget v2, p0, Lcom/canhub/cropper/v;->c:F

    .line 55
    .line 56
    cmpg-float v1, v1, v2

    .line 57
    .line 58
    if-gez v1, :cond_3

    .line 59
    .line 60
    add-float p2, v0, v2

    .line 61
    .line 62
    :cond_3
    sub-float v1, p2, v0

    .line 63
    .line 64
    iget v2, p0, Lcom/canhub/cropper/v;->e:F

    .line 65
    .line 66
    cmpl-float v1, v1, v2

    .line 67
    .line 68
    if-lez v1, :cond_4

    .line 69
    .line 70
    add-float p2, v0, v2

    .line 71
    .line 72
    :cond_4
    sub-float v1, p4, p2

    .line 73
    .line 74
    cmpg-float p5, v1, p5

    .line 75
    .line 76
    if-gez p5, :cond_5

    .line 77
    .line 78
    move p2, p4

    .line 79
    :cond_5
    const/4 p5, 0x0

    .line 80
    cmpl-float p5, p6, p5

    .line 81
    .line 82
    if-lez p5, :cond_a

    .line 83
    .line 84
    sub-float p5, p2, v0

    .line 85
    .line 86
    mul-float/2addr p5, p6

    .line 87
    iget v1, p0, Lcom/canhub/cropper/v;->b:F

    .line 88
    .line 89
    cmpg-float v2, p5, v1

    .line 90
    .line 91
    if-gez v2, :cond_6

    .line 92
    .line 93
    div-float/2addr v1, p6

    .line 94
    add-float/2addr v0, v1

    .line 95
    invoke-static {p4, v0}, Ljava/lang/Math;->min(FF)F

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    iget p4, p1, Landroid/graphics/RectF;->top:F

    .line 100
    .line 101
    sub-float p4, p2, p4

    .line 102
    .line 103
    mul-float p5, p4, p6

    .line 104
    .line 105
    :cond_6
    iget p4, p0, Lcom/canhub/cropper/v;->d:F

    .line 106
    .line 107
    cmpl-float v0, p5, p4

    .line 108
    .line 109
    if-lez v0, :cond_7

    .line 110
    .line 111
    iget p2, p3, Landroid/graphics/RectF;->bottom:F

    .line 112
    .line 113
    iget p5, p1, Landroid/graphics/RectF;->top:F

    .line 114
    .line 115
    div-float/2addr p4, p6

    .line 116
    add-float/2addr p5, p4

    .line 117
    invoke-static {p2, p5}, Ljava/lang/Math;->min(FF)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget p4, p1, Landroid/graphics/RectF;->top:F

    .line 122
    .line 123
    sub-float p4, p2, p4

    .line 124
    .line 125
    mul-float p5, p4, p6

    .line 126
    .line 127
    :cond_7
    if-eqz p7, :cond_8

    .line 128
    .line 129
    if-eqz p8, :cond_8

    .line 130
    .line 131
    iget p4, p3, Landroid/graphics/RectF;->bottom:F

    .line 132
    .line 133
    iget p5, p1, Landroid/graphics/RectF;->top:F

    .line 134
    .line 135
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    div-float/2addr p3, p6

    .line 140
    add-float/2addr p5, p3

    .line 141
    invoke-static {p4, p5}, Ljava/lang/Math;->min(FF)F

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    goto :goto_0

    .line 150
    :cond_8
    if-eqz p7, :cond_9

    .line 151
    .line 152
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 153
    .line 154
    sub-float p7, p4, p5

    .line 155
    .line 156
    iget v0, p3, Landroid/graphics/RectF;->left:F

    .line 157
    .line 158
    cmpg-float p7, p7, v0

    .line 159
    .line 160
    if-gez p7, :cond_9

    .line 161
    .line 162
    iget p2, p3, Landroid/graphics/RectF;->bottom:F

    .line 163
    .line 164
    iget p5, p1, Landroid/graphics/RectF;->top:F

    .line 165
    .line 166
    sub-float/2addr p4, v0

    .line 167
    div-float/2addr p4, p6

    .line 168
    add-float/2addr p5, p4

    .line 169
    invoke-static {p2, p5}, Ljava/lang/Math;->min(FF)F

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iget p4, p1, Landroid/graphics/RectF;->top:F

    .line 174
    .line 175
    sub-float p4, p2, p4

    .line 176
    .line 177
    mul-float p5, p4, p6

    .line 178
    .line 179
    :cond_9
    if-eqz p8, :cond_a

    .line 180
    .line 181
    iget p4, p1, Landroid/graphics/RectF;->left:F

    .line 182
    .line 183
    add-float/2addr p5, p4

    .line 184
    iget p7, p3, Landroid/graphics/RectF;->right:F

    .line 185
    .line 186
    cmpl-float p5, p5, p7

    .line 187
    .line 188
    if-lez p5, :cond_a

    .line 189
    .line 190
    iget p3, p3, Landroid/graphics/RectF;->bottom:F

    .line 191
    .line 192
    iget p5, p1, Landroid/graphics/RectF;->top:F

    .line 193
    .line 194
    sub-float/2addr p7, p4

    .line 195
    div-float/2addr p7, p6

    .line 196
    add-float/2addr p5, p7

    .line 197
    invoke-static {p3, p5}, Ljava/lang/Math;->min(FF)F

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    :cond_a
    :goto_0
    iput p2, p1, Landroid/graphics/RectF;->bottom:F

    .line 206
    .line 207
    return-void
.end method

.method private final b(Landroid/graphics/RectF;F)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-float/2addr v1, p2

    .line 8
    add-float/2addr v0, v1

    .line 9
    iput v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    return-void
.end method

.method private final c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p2, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    const v1, 0x3f866666    # 1.05f

    .line 7
    .line 8
    .line 9
    div-float/2addr p2, v1

    .line 10
    iget-object v1, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 11
    .line 12
    iget v2, v1, Landroid/graphics/PointF;->x:F

    .line 13
    .line 14
    const v3, 0x3f8ccccd    # 1.1f

    .line 15
    .line 16
    .line 17
    div-float v3, p2, v3

    .line 18
    .line 19
    sub-float/2addr v2, v3

    .line 20
    iput v2, v1, Landroid/graphics/PointF;->x:F

    .line 21
    .line 22
    :cond_0
    iget v1, p3, Landroid/graphics/RectF;->left:F

    .line 23
    .line 24
    cmpg-float v2, p2, v1

    .line 25
    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 29
    .line 30
    iget v3, v2, Landroid/graphics/PointF;->x:F

    .line 31
    .line 32
    sub-float v4, p2, v1

    .line 33
    .line 34
    const/high16 v5, 0x40000000    # 2.0f

    .line 35
    .line 36
    div-float/2addr v4, v5

    .line 37
    sub-float/2addr v3, v4

    .line 38
    iput v3, v2, Landroid/graphics/PointF;->x:F

    .line 39
    .line 40
    :cond_1
    sub-float v2, p2, v1

    .line 41
    .line 42
    cmpg-float v2, v2, p4

    .line 43
    .line 44
    if-gez v2, :cond_2

    .line 45
    .line 46
    move p2, v1

    .line 47
    :cond_2
    iget v2, p1, Landroid/graphics/RectF;->right:F

    .line 48
    .line 49
    sub-float v3, v2, p2

    .line 50
    .line 51
    iget v4, p0, Lcom/canhub/cropper/v;->b:F

    .line 52
    .line 53
    cmpg-float v3, v3, v4

    .line 54
    .line 55
    if-gez v3, :cond_3

    .line 56
    .line 57
    sub-float p2, v2, v4

    .line 58
    .line 59
    :cond_3
    sub-float v3, v2, p2

    .line 60
    .line 61
    iget v4, p0, Lcom/canhub/cropper/v;->d:F

    .line 62
    .line 63
    cmpl-float v3, v3, v4

    .line 64
    .line 65
    if-lez v3, :cond_4

    .line 66
    .line 67
    sub-float p2, v2, v4

    .line 68
    .line 69
    :cond_4
    sub-float v3, p2, v1

    .line 70
    .line 71
    cmpg-float p4, v3, p4

    .line 72
    .line 73
    if-gez p4, :cond_5

    .line 74
    .line 75
    move p2, v1

    .line 76
    :cond_5
    cmpl-float p4, p5, v0

    .line 77
    .line 78
    if-lez p4, :cond_a

    .line 79
    .line 80
    sub-float p4, v2, p2

    .line 81
    .line 82
    div-float/2addr p4, p5

    .line 83
    iget v0, p0, Lcom/canhub/cropper/v;->c:F

    .line 84
    .line 85
    cmpg-float v3, p4, v0

    .line 86
    .line 87
    if-gez v3, :cond_6

    .line 88
    .line 89
    mul-float/2addr v0, p5

    .line 90
    sub-float/2addr v2, v0

    .line 91
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 96
    .line 97
    sub-float/2addr p4, p2

    .line 98
    div-float/2addr p4, p5

    .line 99
    :cond_6
    iget v0, p0, Lcom/canhub/cropper/v;->e:F

    .line 100
    .line 101
    cmpl-float v1, p4, v0

    .line 102
    .line 103
    if-lez v1, :cond_7

    .line 104
    .line 105
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 106
    .line 107
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 108
    .line 109
    mul-float/2addr v0, p5

    .line 110
    sub-float/2addr p4, v0

    .line 111
    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 116
    .line 117
    sub-float/2addr p4, p2

    .line 118
    div-float/2addr p4, p5

    .line 119
    :cond_7
    if-eqz p6, :cond_8

    .line 120
    .line 121
    if-eqz p7, :cond_8

    .line 122
    .line 123
    iget p4, p3, Landroid/graphics/RectF;->left:F

    .line 124
    .line 125
    iget p6, p1, Landroid/graphics/RectF;->right:F

    .line 126
    .line 127
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    mul-float/2addr p3, p5

    .line 132
    sub-float/2addr p6, p3

    .line 133
    invoke-static {p4, p6}, Ljava/lang/Math;->max(FF)F

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    goto :goto_0

    .line 142
    :cond_8
    if-eqz p6, :cond_9

    .line 143
    .line 144
    iget p6, p1, Landroid/graphics/RectF;->bottom:F

    .line 145
    .line 146
    sub-float v0, p6, p4

    .line 147
    .line 148
    iget v1, p3, Landroid/graphics/RectF;->top:F

    .line 149
    .line 150
    cmpg-float v0, v0, v1

    .line 151
    .line 152
    if-gez v0, :cond_9

    .line 153
    .line 154
    iget p2, p3, Landroid/graphics/RectF;->left:F

    .line 155
    .line 156
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 157
    .line 158
    sub-float/2addr p6, v1

    .line 159
    mul-float/2addr p6, p5

    .line 160
    sub-float/2addr p4, p6

    .line 161
    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 166
    .line 167
    sub-float/2addr p4, p2

    .line 168
    div-float/2addr p4, p5

    .line 169
    :cond_9
    if-eqz p7, :cond_a

    .line 170
    .line 171
    iget p6, p1, Landroid/graphics/RectF;->top:F

    .line 172
    .line 173
    add-float/2addr p4, p6

    .line 174
    iget p7, p3, Landroid/graphics/RectF;->bottom:F

    .line 175
    .line 176
    cmpl-float p4, p4, p7

    .line 177
    .line 178
    if-lez p4, :cond_a

    .line 179
    .line 180
    iget p3, p3, Landroid/graphics/RectF;->left:F

    .line 181
    .line 182
    iget p4, p1, Landroid/graphics/RectF;->right:F

    .line 183
    .line 184
    sub-float/2addr p7, p6

    .line 185
    mul-float/2addr p7, p5

    .line 186
    sub-float/2addr p4, p7

    .line 187
    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    .line 188
    .line 189
    .line 190
    move-result p3

    .line 191
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    :cond_a
    :goto_0
    iput p2, p1, Landroid/graphics/RectF;->left:F

    .line 196
    .line 197
    return-void
.end method

.method private final d(Landroid/graphics/RectF;F)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-float/2addr v1, p2

    .line 8
    sub-float/2addr v0, v1

    .line 9
    iput v0, p1, Landroid/graphics/RectF;->left:F

    .line 10
    .line 11
    return-void
.end method

.method private final e(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    mul-float/2addr v1, p3

    .line 10
    sub-float/2addr v0, v1

    .line 11
    const/4 p3, 0x2

    .line 12
    int-to-float p3, p3

    .line 13
    div-float/2addr v0, p3

    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-virtual {p1, v0, p3}, Landroid/graphics/RectF;->inset(FF)V

    .line 16
    .line 17
    .line 18
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 19
    .line 20
    iget v1, p2, Landroid/graphics/RectF;->left:F

    .line 21
    .line 22
    cmpg-float v2, v0, v1

    .line 23
    .line 24
    if-gez v2, :cond_0

    .line 25
    .line 26
    sub-float/2addr v1, v0

    .line 27
    invoke-virtual {p1, v1, p3}, Landroid/graphics/RectF;->offset(FF)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 31
    .line 32
    iget p2, p2, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    cmpl-float v1, v0, p2

    .line 35
    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    sub-float/2addr p2, v0

    .line 39
    invoke-virtual {p1, p2, p3}, Landroid/graphics/RectF;->offset(FF)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method private final f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V
    .locals 4

    .line 1
    int-to-float p4, p4

    .line 2
    cmpl-float v0, p2, p4

    .line 3
    .line 4
    if-lez v0, :cond_0

    .line 5
    .line 6
    sub-float/2addr p2, p4

    .line 7
    const v0, 0x3f866666    # 1.05f

    .line 8
    .line 9
    .line 10
    div-float/2addr p2, v0

    .line 11
    add-float/2addr p2, p4

    .line 12
    iget-object v0, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 13
    .line 14
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 15
    .line 16
    sub-float p4, p2, p4

    .line 17
    .line 18
    const v2, 0x3f8ccccd    # 1.1f

    .line 19
    .line 20
    .line 21
    div-float/2addr p4, v2

    .line 22
    sub-float/2addr v1, p4

    .line 23
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 24
    .line 25
    :cond_0
    iget p4, p3, Landroid/graphics/RectF;->right:F

    .line 26
    .line 27
    cmpl-float v0, p2, p4

    .line 28
    .line 29
    if-lez v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 32
    .line 33
    iget v1, v0, Landroid/graphics/PointF;->x:F

    .line 34
    .line 35
    sub-float v2, p2, p4

    .line 36
    .line 37
    const/high16 v3, 0x40000000    # 2.0f

    .line 38
    .line 39
    div-float/2addr v2, v3

    .line 40
    sub-float/2addr v1, v2

    .line 41
    iput v1, v0, Landroid/graphics/PointF;->x:F

    .line 42
    .line 43
    :cond_1
    sub-float v0, p4, p2

    .line 44
    .line 45
    cmpg-float v0, v0, p5

    .line 46
    .line 47
    if-gez v0, :cond_2

    .line 48
    .line 49
    move p2, p4

    .line 50
    :cond_2
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 51
    .line 52
    sub-float v1, p2, v0

    .line 53
    .line 54
    iget v2, p0, Lcom/canhub/cropper/v;->b:F

    .line 55
    .line 56
    cmpg-float v1, v1, v2

    .line 57
    .line 58
    if-gez v1, :cond_3

    .line 59
    .line 60
    add-float p2, v0, v2

    .line 61
    .line 62
    :cond_3
    sub-float v1, p2, v0

    .line 63
    .line 64
    iget v2, p0, Lcom/canhub/cropper/v;->d:F

    .line 65
    .line 66
    cmpl-float v1, v1, v2

    .line 67
    .line 68
    if-lez v1, :cond_4

    .line 69
    .line 70
    add-float p2, v0, v2

    .line 71
    .line 72
    :cond_4
    sub-float v1, p4, p2

    .line 73
    .line 74
    cmpg-float p5, v1, p5

    .line 75
    .line 76
    if-gez p5, :cond_5

    .line 77
    .line 78
    move p2, p4

    .line 79
    :cond_5
    const/4 p5, 0x0

    .line 80
    cmpl-float p5, p6, p5

    .line 81
    .line 82
    if-lez p5, :cond_a

    .line 83
    .line 84
    sub-float p5, p2, v0

    .line 85
    .line 86
    div-float/2addr p5, p6

    .line 87
    iget v1, p0, Lcom/canhub/cropper/v;->c:F

    .line 88
    .line 89
    cmpg-float v2, p5, v1

    .line 90
    .line 91
    if-gez v2, :cond_6

    .line 92
    .line 93
    mul-float/2addr v1, p6

    .line 94
    add-float/2addr v0, v1

    .line 95
    invoke-static {p4, v0}, Ljava/lang/Math;->min(FF)F

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    iget p4, p1, Landroid/graphics/RectF;->left:F

    .line 100
    .line 101
    sub-float p4, p2, p4

    .line 102
    .line 103
    div-float p5, p4, p6

    .line 104
    .line 105
    :cond_6
    iget p4, p0, Lcom/canhub/cropper/v;->e:F

    .line 106
    .line 107
    cmpl-float v0, p5, p4

    .line 108
    .line 109
    if-lez v0, :cond_7

    .line 110
    .line 111
    iget p2, p3, Landroid/graphics/RectF;->right:F

    .line 112
    .line 113
    iget p5, p1, Landroid/graphics/RectF;->left:F

    .line 114
    .line 115
    mul-float/2addr p4, p6

    .line 116
    add-float/2addr p5, p4

    .line 117
    invoke-static {p2, p5}, Ljava/lang/Math;->min(FF)F

    .line 118
    .line 119
    .line 120
    move-result p2

    .line 121
    iget p4, p1, Landroid/graphics/RectF;->left:F

    .line 122
    .line 123
    sub-float p4, p2, p4

    .line 124
    .line 125
    div-float p5, p4, p6

    .line 126
    .line 127
    :cond_7
    if-eqz p7, :cond_8

    .line 128
    .line 129
    if-eqz p8, :cond_8

    .line 130
    .line 131
    iget p4, p3, Landroid/graphics/RectF;->right:F

    .line 132
    .line 133
    iget p5, p1, Landroid/graphics/RectF;->left:F

    .line 134
    .line 135
    invoke-virtual {p3}, Landroid/graphics/RectF;->height()F

    .line 136
    .line 137
    .line 138
    move-result p3

    .line 139
    mul-float/2addr p3, p6

    .line 140
    add-float/2addr p5, p3

    .line 141
    invoke-static {p4, p5}, Ljava/lang/Math;->min(FF)F

    .line 142
    .line 143
    .line 144
    move-result p3

    .line 145
    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    .line 146
    .line 147
    .line 148
    move-result p2

    .line 149
    goto :goto_0

    .line 150
    :cond_8
    if-eqz p7, :cond_9

    .line 151
    .line 152
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 153
    .line 154
    sub-float p7, p4, p5

    .line 155
    .line 156
    iget v0, p3, Landroid/graphics/RectF;->top:F

    .line 157
    .line 158
    cmpg-float p7, p7, v0

    .line 159
    .line 160
    if-gez p7, :cond_9

    .line 161
    .line 162
    iget p2, p3, Landroid/graphics/RectF;->right:F

    .line 163
    .line 164
    iget p5, p1, Landroid/graphics/RectF;->left:F

    .line 165
    .line 166
    sub-float/2addr p4, v0

    .line 167
    mul-float/2addr p4, p6

    .line 168
    add-float/2addr p5, p4

    .line 169
    invoke-static {p2, p5}, Ljava/lang/Math;->min(FF)F

    .line 170
    .line 171
    .line 172
    move-result p2

    .line 173
    iget p4, p1, Landroid/graphics/RectF;->left:F

    .line 174
    .line 175
    sub-float p4, p2, p4

    .line 176
    .line 177
    div-float p5, p4, p6

    .line 178
    .line 179
    :cond_9
    if-eqz p8, :cond_a

    .line 180
    .line 181
    iget p4, p1, Landroid/graphics/RectF;->top:F

    .line 182
    .line 183
    add-float/2addr p5, p4

    .line 184
    iget p7, p3, Landroid/graphics/RectF;->bottom:F

    .line 185
    .line 186
    cmpl-float p5, p5, p7

    .line 187
    .line 188
    if-lez p5, :cond_a

    .line 189
    .line 190
    iget p3, p3, Landroid/graphics/RectF;->right:F

    .line 191
    .line 192
    iget p5, p1, Landroid/graphics/RectF;->left:F

    .line 193
    .line 194
    sub-float/2addr p7, p4

    .line 195
    mul-float/2addr p7, p6

    .line 196
    add-float/2addr p5, p7

    .line 197
    invoke-static {p3, p5}, Ljava/lang/Math;->min(FF)F

    .line 198
    .line 199
    .line 200
    move-result p3

    .line 201
    invoke-static {p2, p3}, Ljava/lang/Math;->min(FF)F

    .line 202
    .line 203
    .line 204
    move-result p2

    .line 205
    :cond_a
    :goto_0
    iput p2, p1, Landroid/graphics/RectF;->right:F

    .line 206
    .line 207
    return-void
.end method

.method private final g(Landroid/graphics/RectF;F)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    mul-float/2addr v1, p2

    .line 8
    add-float/2addr v0, v1

    .line 9
    iput v0, p1, Landroid/graphics/RectF;->right:F

    .line 10
    .line 11
    return-void
.end method

.method private final h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v1, p2, v0

    .line 3
    .line 4
    if-gez v1, :cond_0

    .line 5
    .line 6
    const v1, 0x3f866666    # 1.05f

    .line 7
    .line 8
    .line 9
    div-float/2addr p2, v1

    .line 10
    iget-object v1, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 11
    .line 12
    iget v2, v1, Landroid/graphics/PointF;->y:F

    .line 13
    .line 14
    const v3, 0x3f8ccccd    # 1.1f

    .line 15
    .line 16
    .line 17
    div-float v3, p2, v3

    .line 18
    .line 19
    sub-float/2addr v2, v3

    .line 20
    iput v2, v1, Landroid/graphics/PointF;->y:F

    .line 21
    .line 22
    :cond_0
    iget v1, p3, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    cmpg-float v2, p2, v1

    .line 25
    .line 26
    if-gez v2, :cond_1

    .line 27
    .line 28
    iget-object v2, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 29
    .line 30
    iget v3, v2, Landroid/graphics/PointF;->y:F

    .line 31
    .line 32
    sub-float v4, p2, v1

    .line 33
    .line 34
    const/high16 v5, 0x40000000    # 2.0f

    .line 35
    .line 36
    div-float/2addr v4, v5

    .line 37
    sub-float/2addr v3, v4

    .line 38
    iput v3, v2, Landroid/graphics/PointF;->y:F

    .line 39
    .line 40
    :cond_1
    sub-float v2, p2, v1

    .line 41
    .line 42
    cmpg-float v2, v2, p4

    .line 43
    .line 44
    if-gez v2, :cond_2

    .line 45
    .line 46
    move p2, v1

    .line 47
    :cond_2
    iget v2, p1, Landroid/graphics/RectF;->bottom:F

    .line 48
    .line 49
    sub-float v3, v2, p2

    .line 50
    .line 51
    iget v4, p0, Lcom/canhub/cropper/v;->c:F

    .line 52
    .line 53
    cmpg-float v3, v3, v4

    .line 54
    .line 55
    if-gez v3, :cond_3

    .line 56
    .line 57
    sub-float p2, v2, v4

    .line 58
    .line 59
    :cond_3
    sub-float v3, v2, p2

    .line 60
    .line 61
    iget v4, p0, Lcom/canhub/cropper/v;->e:F

    .line 62
    .line 63
    cmpl-float v3, v3, v4

    .line 64
    .line 65
    if-lez v3, :cond_4

    .line 66
    .line 67
    sub-float p2, v2, v4

    .line 68
    .line 69
    :cond_4
    sub-float v3, p2, v1

    .line 70
    .line 71
    cmpg-float p4, v3, p4

    .line 72
    .line 73
    if-gez p4, :cond_5

    .line 74
    .line 75
    move p2, v1

    .line 76
    :cond_5
    cmpl-float p4, p5, v0

    .line 77
    .line 78
    if-lez p4, :cond_a

    .line 79
    .line 80
    sub-float p4, v2, p2

    .line 81
    .line 82
    mul-float/2addr p4, p5

    .line 83
    iget v0, p0, Lcom/canhub/cropper/v;->b:F

    .line 84
    .line 85
    cmpg-float v3, p4, v0

    .line 86
    .line 87
    if-gez v3, :cond_6

    .line 88
    .line 89
    div-float/2addr v0, p5

    .line 90
    sub-float/2addr v2, v0

    .line 91
    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    sub-float/2addr p4, p2

    .line 98
    mul-float/2addr p4, p5

    .line 99
    :cond_6
    iget v0, p0, Lcom/canhub/cropper/v;->d:F

    .line 100
    .line 101
    cmpl-float v1, p4, v0

    .line 102
    .line 103
    if-lez v1, :cond_7

    .line 104
    .line 105
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 106
    .line 107
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 108
    .line 109
    div-float/2addr v0, p5

    .line 110
    sub-float/2addr p4, v0

    .line 111
    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    .line 112
    .line 113
    .line 114
    move-result p2

    .line 115
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 116
    .line 117
    sub-float/2addr p4, p2

    .line 118
    mul-float/2addr p4, p5

    .line 119
    :cond_7
    if-eqz p6, :cond_8

    .line 120
    .line 121
    if-eqz p7, :cond_8

    .line 122
    .line 123
    iget p4, p3, Landroid/graphics/RectF;->top:F

    .line 124
    .line 125
    iget p6, p1, Landroid/graphics/RectF;->bottom:F

    .line 126
    .line 127
    invoke-virtual {p3}, Landroid/graphics/RectF;->width()F

    .line 128
    .line 129
    .line 130
    move-result p3

    .line 131
    div-float/2addr p3, p5

    .line 132
    sub-float/2addr p6, p3

    .line 133
    invoke-static {p4, p6}, Ljava/lang/Math;->max(FF)F

    .line 134
    .line 135
    .line 136
    move-result p3

    .line 137
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 138
    .line 139
    .line 140
    move-result p2

    .line 141
    goto :goto_0

    .line 142
    :cond_8
    if-eqz p6, :cond_9

    .line 143
    .line 144
    iget p6, p1, Landroid/graphics/RectF;->right:F

    .line 145
    .line 146
    sub-float v0, p6, p4

    .line 147
    .line 148
    iget v1, p3, Landroid/graphics/RectF;->left:F

    .line 149
    .line 150
    cmpg-float v0, v0, v1

    .line 151
    .line 152
    if-gez v0, :cond_9

    .line 153
    .line 154
    iget p2, p3, Landroid/graphics/RectF;->top:F

    .line 155
    .line 156
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 157
    .line 158
    sub-float/2addr p6, v1

    .line 159
    div-float/2addr p6, p5

    .line 160
    sub-float/2addr p4, p6

    .line 161
    invoke-static {p2, p4}, Ljava/lang/Math;->max(FF)F

    .line 162
    .line 163
    .line 164
    move-result p2

    .line 165
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 166
    .line 167
    sub-float/2addr p4, p2

    .line 168
    mul-float/2addr p4, p5

    .line 169
    :cond_9
    if-eqz p7, :cond_a

    .line 170
    .line 171
    iget p6, p1, Landroid/graphics/RectF;->left:F

    .line 172
    .line 173
    add-float/2addr p4, p6

    .line 174
    iget p7, p3, Landroid/graphics/RectF;->right:F

    .line 175
    .line 176
    cmpl-float p4, p4, p7

    .line 177
    .line 178
    if-lez p4, :cond_a

    .line 179
    .line 180
    iget p3, p3, Landroid/graphics/RectF;->top:F

    .line 181
    .line 182
    iget p4, p1, Landroid/graphics/RectF;->bottom:F

    .line 183
    .line 184
    sub-float/2addr p7, p6

    .line 185
    div-float/2addr p7, p5

    .line 186
    sub-float/2addr p4, p7

    .line 187
    invoke-static {p3, p4}, Ljava/lang/Math;->max(FF)F

    .line 188
    .line 189
    .line 190
    move-result p3

    .line 191
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 192
    .line 193
    .line 194
    move-result p2

    .line 195
    :cond_a
    :goto_0
    iput p2, p1, Landroid/graphics/RectF;->top:F

    .line 196
    .line 197
    return-void
.end method

.method private final i(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    div-float/2addr v1, p3

    .line 10
    sub-float/2addr v0, v1

    .line 11
    const/4 p3, 0x2

    .line 12
    int-to-float p3, p3

    .line 13
    div-float/2addr v0, p3

    .line 14
    const/4 p3, 0x0

    .line 15
    invoke-virtual {p1, p3, v0}, Landroid/graphics/RectF;->inset(FF)V

    .line 16
    .line 17
    .line 18
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    iget v1, p2, Landroid/graphics/RectF;->top:F

    .line 21
    .line 22
    cmpg-float v2, v0, v1

    .line 23
    .line 24
    if-gez v2, :cond_0

    .line 25
    .line 26
    sub-float/2addr v1, v0

    .line 27
    invoke-virtual {p1, p3, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 31
    .line 32
    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    .line 33
    .line 34
    cmpl-float v1, v0, p2

    .line 35
    .line 36
    if-lez v1, :cond_1

    .line 37
    .line 38
    sub-float/2addr p2, v0

    .line 39
    invoke-virtual {p1, p3, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method private final j(Landroid/graphics/RectF;F)V
    .locals 2

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    div-float/2addr v1, p2

    .line 8
    sub-float/2addr v0, v1

    .line 9
    iput v0, p1, Landroid/graphics/RectF;->top:F

    .line 10
    .line 11
    return-void
.end method

.method private final k(Landroid/graphics/RectF;FF)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/v;->a:Lcom/canhub/cropper/v$b;

    .line 2
    .line 3
    sget-object v1, Lcom/canhub/cropper/v$c;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    new-instance p1, Li7/m;

    .line 16
    .line 17
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 18
    .line 19
    .line 20
    throw p1

    .line 21
    :pswitch_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sub-float v1, v0, p2

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    :goto_0
    sub-float/2addr p1, p3

    .line 32
    goto :goto_2

    .line 33
    :pswitch_1
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :pswitch_2
    iget p1, p1, Landroid/graphics/RectF;->right:F

    .line 37
    .line 38
    :goto_1
    sub-float/2addr p1, p2

    .line 39
    move v2, v1

    .line 40
    move v1, p1

    .line 41
    move p1, v2

    .line 42
    goto :goto_2

    .line 43
    :pswitch_3
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :pswitch_4
    iget p1, p1, Landroid/graphics/RectF;->left:F

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :pswitch_5
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 50
    .line 51
    sub-float v1, v0, p2

    .line 52
    .line 53
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_6
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 57
    .line 58
    sub-float v1, v0, p2

    .line 59
    .line 60
    iget p1, p1, Landroid/graphics/RectF;->bottom:F

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :pswitch_7
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 64
    .line 65
    sub-float v1, v0, p2

    .line 66
    .line 67
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :pswitch_8
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 71
    .line 72
    sub-float v1, v0, p2

    .line 73
    .line 74
    iget p1, p1, Landroid/graphics/RectF;->top:F

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :goto_2
    iget-object p2, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 78
    .line 79
    iput v1, p2, Landroid/graphics/PointF;->x:F

    .line 80
    .line 81
    iput p1, p2, Landroid/graphics/PointF;->y:F

    .line 82
    .line 83
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final m(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIF)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    sub-float/2addr p2, v0

    .line 6
    invoke-virtual {p1}, Landroid/graphics/RectF;->centerY()F

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    sub-float/2addr p3, v0

    .line 11
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 12
    .line 13
    add-float v1, v0, p2

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    cmpg-float v1, v1, v2

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    const v4, 0x3f866666    # 1.05f

    .line 20
    .line 21
    .line 22
    if-ltz v1, :cond_0

    .line 23
    .line 24
    iget v1, p1, Landroid/graphics/RectF;->right:F

    .line 25
    .line 26
    add-float v5, v1, p2

    .line 27
    .line 28
    int-to-float p5, p5

    .line 29
    cmpl-float p5, v5, p5

    .line 30
    .line 31
    if-gtz p5, :cond_0

    .line 32
    .line 33
    add-float/2addr v0, p2

    .line 34
    iget p5, p4, Landroid/graphics/RectF;->left:F

    .line 35
    .line 36
    cmpg-float p5, v0, p5

    .line 37
    .line 38
    if-ltz p5, :cond_0

    .line 39
    .line 40
    add-float/2addr v1, p2

    .line 41
    iget p5, p4, Landroid/graphics/RectF;->right:F

    .line 42
    .line 43
    cmpl-float p5, v1, p5

    .line 44
    .line 45
    if-lez p5, :cond_1

    .line 46
    .line 47
    :cond_0
    div-float/2addr p2, v4

    .line 48
    iget-object p5, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 49
    .line 50
    iget v0, p5, Landroid/graphics/PointF;->x:F

    .line 51
    .line 52
    int-to-float v1, v3

    .line 53
    div-float v1, p2, v1

    .line 54
    .line 55
    sub-float/2addr v0, v1

    .line 56
    iput v0, p5, Landroid/graphics/PointF;->x:F

    .line 57
    .line 58
    :cond_1
    iget p5, p1, Landroid/graphics/RectF;->top:F

    .line 59
    .line 60
    add-float v0, p5, p3

    .line 61
    .line 62
    cmpg-float v0, v0, v2

    .line 63
    .line 64
    if-ltz v0, :cond_2

    .line 65
    .line 66
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 67
    .line 68
    add-float v1, v0, p3

    .line 69
    .line 70
    int-to-float p6, p6

    .line 71
    cmpl-float p6, v1, p6

    .line 72
    .line 73
    if-gtz p6, :cond_2

    .line 74
    .line 75
    add-float/2addr p5, p3

    .line 76
    iget p6, p4, Landroid/graphics/RectF;->top:F

    .line 77
    .line 78
    cmpg-float p5, p5, p6

    .line 79
    .line 80
    if-ltz p5, :cond_2

    .line 81
    .line 82
    add-float/2addr v0, p3

    .line 83
    iget p5, p4, Landroid/graphics/RectF;->bottom:F

    .line 84
    .line 85
    cmpl-float p5, v0, p5

    .line 86
    .line 87
    if-lez p5, :cond_3

    .line 88
    .line 89
    :cond_2
    div-float/2addr p3, v4

    .line 90
    iget-object p5, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 91
    .line 92
    iget p6, p5, Landroid/graphics/PointF;->y:F

    .line 93
    .line 94
    int-to-float v0, v3

    .line 95
    div-float v0, p3, v0

    .line 96
    .line 97
    sub-float/2addr p6, v0

    .line 98
    iput p6, p5, Landroid/graphics/PointF;->y:F

    .line 99
    .line 100
    :cond_3
    invoke-virtual {p1, p2, p3}, Landroid/graphics/RectF;->offset(FF)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p0, p1, p4, p7}, Lcom/canhub/cropper/v;->p(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method private final n(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFF)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/canhub/cropper/v;->a:Lcom/canhub/cropper/v$b;

    .line 2
    .line 3
    sget-object v1, Lcom/canhub/cropper/v$c;->a:[I

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    aget v0, v1, v0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance p1, Li7/m;

    .line 15
    .line 16
    invoke-direct {p1}, Li7/m;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1

    .line 20
    :pswitch_0
    return-void

    .line 21
    :pswitch_1
    const/4 v7, 0x1

    .line 22
    const/4 v8, 0x1

    .line 23
    move-object v0, p0

    .line 24
    move-object v1, p1

    .line 25
    move v2, p3

    .line 26
    move-object v3, p4

    .line 27
    move v4, p6

    .line 28
    move/from16 v5, p7

    .line 29
    .line 30
    move/from16 v6, p8

    .line 31
    .line 32
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 33
    .line 34
    .line 35
    move v5, v6

    .line 36
    invoke-direct {p0, p1, p4, v5}, Lcom/canhub/cropper/v;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_2
    move/from16 v5, p8

    .line 41
    .line 42
    const/4 v7, 0x1

    .line 43
    const/4 v8, 0x1

    .line 44
    move-object v0, p0

    .line 45
    move-object v1, p1

    .line 46
    move v2, p2

    .line 47
    move-object v3, p4

    .line 48
    move v4, p5

    .line 49
    move v6, v5

    .line 50
    move/from16 v5, p7

    .line 51
    .line 52
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 53
    .line 54
    .line 55
    move v5, v6

    .line 56
    invoke-direct {p0, p1, p4, v5}, Lcom/canhub/cropper/v;->i(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_3
    move/from16 v5, p8

    .line 61
    .line 62
    const/4 v6, 0x1

    .line 63
    const/4 v7, 0x1

    .line 64
    move-object v0, p0

    .line 65
    move-object v1, p1

    .line 66
    move v2, p3

    .line 67
    move-object v3, p4

    .line 68
    move/from16 v4, p7

    .line 69
    .line 70
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0, p1, p4, v5}, Lcom/canhub/cropper/v;->e(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_4
    move/from16 v5, p8

    .line 78
    .line 79
    const/4 v6, 0x1

    .line 80
    const/4 v7, 0x1

    .line 81
    move-object v0, p0

    .line 82
    move-object v1, p1

    .line 83
    move v2, p2

    .line 84
    move-object v3, p4

    .line 85
    move/from16 v4, p7

    .line 86
    .line 87
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, p1, p4, v5}, Lcom/canhub/cropper/v;->i(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_5
    move/from16 v5, p8

    .line 95
    .line 96
    sget-object v6, Lcom/canhub/cropper/v;->g:Lcom/canhub/cropper/v$a;

    .line 97
    .line 98
    iget v7, p1, Landroid/graphics/RectF;->left:F

    .line 99
    .line 100
    iget v8, p1, Landroid/graphics/RectF;->top:F

    .line 101
    .line 102
    invoke-virtual {v6, v7, v8, p2, p3}, Lcom/canhub/cropper/v$a;->a(FFFF)F

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    cmpg-float v6, v6, v5

    .line 107
    .line 108
    if-gez v6, :cond_0

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    const/4 v8, 0x1

    .line 112
    move-object v0, p0

    .line 113
    move-object v1, p1

    .line 114
    move v2, p3

    .line 115
    move-object v3, p4

    .line 116
    move v4, p6

    .line 117
    move v6, v5

    .line 118
    move/from16 v5, p7

    .line 119
    .line 120
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 121
    .line 122
    .line 123
    move v5, v6

    .line 124
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->g(Landroid/graphics/RectF;F)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_0
    const/4 v7, 0x0

    .line 129
    const/4 v8, 0x1

    .line 130
    move-object v0, p0

    .line 131
    move-object v1, p1

    .line 132
    move v2, p2

    .line 133
    move-object v3, p4

    .line 134
    move v4, p5

    .line 135
    move v6, v5

    .line 136
    move/from16 v5, p7

    .line 137
    .line 138
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 139
    .line 140
    .line 141
    move v5, v6

    .line 142
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->b(Landroid/graphics/RectF;F)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :pswitch_6
    move/from16 v5, p8

    .line 147
    .line 148
    sget-object p5, Lcom/canhub/cropper/v;->g:Lcom/canhub/cropper/v$a;

    .line 149
    .line 150
    iget v3, p1, Landroid/graphics/RectF;->top:F

    .line 151
    .line 152
    iget v6, p1, Landroid/graphics/RectF;->right:F

    .line 153
    .line 154
    invoke-virtual {p5, p2, v3, v6, p3}, Lcom/canhub/cropper/v$a;->a(FFFF)F

    .line 155
    .line 156
    .line 157
    move-result p5

    .line 158
    cmpg-float p5, p5, v5

    .line 159
    .line 160
    if-gez p5, :cond_1

    .line 161
    .line 162
    const/4 v7, 0x1

    .line 163
    const/4 v8, 0x0

    .line 164
    move-object v0, p0

    .line 165
    move-object v1, p1

    .line 166
    move v2, p3

    .line 167
    move-object v3, p4

    .line 168
    move v4, p6

    .line 169
    move v6, v5

    .line 170
    move/from16 v5, p7

    .line 171
    .line 172
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 173
    .line 174
    .line 175
    move v5, v6

    .line 176
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->d(Landroid/graphics/RectF;F)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_1
    const/4 v6, 0x0

    .line 181
    const/4 v7, 0x1

    .line 182
    move-object v0, p0

    .line 183
    move-object v1, p1

    .line 184
    move v2, p2

    .line 185
    move-object v3, p4

    .line 186
    move/from16 v4, p7

    .line 187
    .line 188
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 189
    .line 190
    .line 191
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->b(Landroid/graphics/RectF;F)V

    .line 192
    .line 193
    .line 194
    return-void

    .line 195
    :pswitch_7
    move/from16 v5, p8

    .line 196
    .line 197
    sget-object p6, Lcom/canhub/cropper/v;->g:Lcom/canhub/cropper/v$a;

    .line 198
    .line 199
    iget v3, p1, Landroid/graphics/RectF;->left:F

    .line 200
    .line 201
    iget v6, p1, Landroid/graphics/RectF;->bottom:F

    .line 202
    .line 203
    invoke-virtual {p6, v3, p3, p2, v6}, Lcom/canhub/cropper/v$a;->a(FFFF)F

    .line 204
    .line 205
    .line 206
    move-result p6

    .line 207
    cmpg-float p6, p6, v5

    .line 208
    .line 209
    if-gez p6, :cond_2

    .line 210
    .line 211
    const/4 v6, 0x0

    .line 212
    const/4 v7, 0x1

    .line 213
    move-object v0, p0

    .line 214
    move-object v1, p1

    .line 215
    move v2, p3

    .line 216
    move-object v3, p4

    .line 217
    move/from16 v4, p7

    .line 218
    .line 219
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 220
    .line 221
    .line 222
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->g(Landroid/graphics/RectF;F)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :cond_2
    const/4 v7, 0x1

    .line 227
    const/4 v8, 0x0

    .line 228
    move-object v0, p0

    .line 229
    move-object v1, p1

    .line 230
    move v2, p2

    .line 231
    move-object v3, p4

    .line 232
    move v4, p5

    .line 233
    move v6, v5

    .line 234
    move/from16 v5, p7

    .line 235
    .line 236
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 237
    .line 238
    .line 239
    move v5, v6

    .line 240
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->j(Landroid/graphics/RectF;F)V

    .line 241
    .line 242
    .line 243
    return-void

    .line 244
    :pswitch_8
    move/from16 v5, p8

    .line 245
    .line 246
    sget-object p5, Lcom/canhub/cropper/v;->g:Lcom/canhub/cropper/v$a;

    .line 247
    .line 248
    iget p6, p1, Landroid/graphics/RectF;->right:F

    .line 249
    .line 250
    iget v3, p1, Landroid/graphics/RectF;->bottom:F

    .line 251
    .line 252
    invoke-virtual {p5, p2, p3, p6, v3}, Lcom/canhub/cropper/v$a;->a(FFFF)F

    .line 253
    .line 254
    .line 255
    move-result p5

    .line 256
    cmpg-float p5, p5, v5

    .line 257
    .line 258
    if-gez p5, :cond_3

    .line 259
    .line 260
    const/4 v6, 0x1

    .line 261
    const/4 v7, 0x0

    .line 262
    move-object v0, p0

    .line 263
    move-object v1, p1

    .line 264
    move v2, p3

    .line 265
    move-object v3, p4

    .line 266
    move/from16 v4, p7

    .line 267
    .line 268
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 269
    .line 270
    .line 271
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->d(Landroid/graphics/RectF;F)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_3
    const/4 v6, 0x1

    .line 276
    const/4 v7, 0x0

    .line 277
    move-object v0, p0

    .line 278
    move-object v1, p1

    .line 279
    move v2, p2

    .line 280
    move-object v3, p4

    .line 281
    move/from16 v4, p7

    .line 282
    .line 283
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 284
    .line 285
    .line 286
    invoke-direct {p0, p1, v5}, Lcom/canhub/cropper/v;->j(Landroid/graphics/RectF;F)V

    .line 287
    .line 288
    .line 289
    return-void

    .line 290
    nop

    .line 291
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final o(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIF)V
    .locals 9

    .line 1
    iget-object v1, p0, Lcom/canhub/cropper/v;->a:Lcom/canhub/cropper/v$b;

    .line 2
    .line 3
    sget-object v2, Lcom/canhub/cropper/v$c;->a:[I

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v1, v2, v1

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    new-instance v1, Li7/m;

    .line 15
    .line 16
    invoke-direct {v1}, Li7/m;-><init>()V

    .line 17
    .line 18
    .line 19
    throw v1

    .line 20
    :pswitch_0
    return-void

    .line 21
    :pswitch_1
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v0, p0

    .line 25
    move-object v1, p1

    .line 26
    move v2, p3

    .line 27
    move-object v3, p4

    .line 28
    move v4, p6

    .line 29
    move/from16 v5, p7

    .line 30
    .line 31
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_2
    const/4 v7, 0x0

    .line 36
    const/4 v8, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    move-object v0, p0

    .line 39
    move-object v1, p1

    .line 40
    move v2, p2

    .line 41
    move-object v3, p4

    .line 42
    move v4, p5

    .line 43
    move/from16 v5, p7

    .line 44
    .line 45
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :pswitch_3
    const/4 v6, 0x0

    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v5, 0x0

    .line 52
    move-object v0, p0

    .line 53
    move-object v1, p1

    .line 54
    move v2, p3

    .line 55
    move-object v3, p4

    .line 56
    move/from16 v4, p7

    .line 57
    .line 58
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :pswitch_4
    const/4 v6, 0x0

    .line 63
    const/4 v7, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    move-object v0, p0

    .line 66
    move-object v1, p1

    .line 67
    move v2, p2

    .line 68
    move-object v3, p4

    .line 69
    move/from16 v4, p7

    .line 70
    .line 71
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :pswitch_5
    const/4 v7, 0x0

    .line 76
    const/4 v8, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    move-object v0, p0

    .line 79
    move-object v1, p1

    .line 80
    move v2, p3

    .line 81
    move-object v3, p4

    .line 82
    move v4, p6

    .line 83
    move/from16 v5, p7

    .line 84
    .line 85
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 86
    .line 87
    .line 88
    move v2, p2

    .line 89
    move v4, p5

    .line 90
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :pswitch_6
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v6, 0x0

    .line 97
    move-object v0, p0

    .line 98
    move-object v1, p1

    .line 99
    move v2, p3

    .line 100
    move-object v3, p4

    .line 101
    move v4, p6

    .line 102
    move/from16 v5, p7

    .line 103
    .line 104
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->a(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 105
    .line 106
    .line 107
    const/4 v6, 0x0

    .line 108
    const/4 v5, 0x0

    .line 109
    move v2, p2

    .line 110
    move/from16 v4, p7

    .line 111
    .line 112
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :pswitch_7
    const/4 v6, 0x0

    .line 117
    const/4 v7, 0x0

    .line 118
    const/4 v5, 0x0

    .line 119
    move-object v0, p0

    .line 120
    move-object v1, p1

    .line 121
    move v2, p3

    .line 122
    move-object v3, p4

    .line 123
    move/from16 v4, p7

    .line 124
    .line 125
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 126
    .line 127
    .line 128
    const/4 v8, 0x0

    .line 129
    const/4 v6, 0x0

    .line 130
    move v2, p2

    .line 131
    move v4, p5

    .line 132
    move/from16 v5, p7

    .line 133
    .line 134
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->f(Landroid/graphics/RectF;FLandroid/graphics/RectF;IFFZZ)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :pswitch_8
    const/4 v6, 0x0

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v5, 0x0

    .line 141
    move-object v0, p0

    .line 142
    move-object v1, p1

    .line 143
    move v2, p3

    .line 144
    move-object v3, p4

    .line 145
    move/from16 v4, p7

    .line 146
    .line 147
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->h(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 148
    .line 149
    .line 150
    move v2, p2

    .line 151
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->c(Landroid/graphics/RectF;FLandroid/graphics/RectF;FFZZ)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final p(Landroid/graphics/RectF;Landroid/graphics/RectF;F)V
    .locals 4

    .line 1
    iget v0, p1, Landroid/graphics/RectF;->left:F

    .line 2
    .line 3
    iget v1, p2, Landroid/graphics/RectF;->left:F

    .line 4
    .line 5
    add-float v2, v1, p3

    .line 6
    .line 7
    cmpg-float v2, v0, v2

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    if-gez v2, :cond_0

    .line 11
    .line 12
    sub-float/2addr v1, v0

    .line 13
    invoke-virtual {p1, v1, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget v0, p1, Landroid/graphics/RectF;->top:F

    .line 17
    .line 18
    iget v1, p2, Landroid/graphics/RectF;->top:F

    .line 19
    .line 20
    add-float v2, v1, p3

    .line 21
    .line 22
    cmpg-float v2, v0, v2

    .line 23
    .line 24
    if-gez v2, :cond_1

    .line 25
    .line 26
    sub-float/2addr v1, v0

    .line 27
    invoke-virtual {p1, v3, v1}, Landroid/graphics/RectF;->offset(FF)V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget v0, p1, Landroid/graphics/RectF;->right:F

    .line 31
    .line 32
    iget v1, p2, Landroid/graphics/RectF;->right:F

    .line 33
    .line 34
    sub-float v2, v1, p3

    .line 35
    .line 36
    cmpl-float v2, v0, v2

    .line 37
    .line 38
    if-lez v2, :cond_2

    .line 39
    .line 40
    sub-float/2addr v1, v0

    .line 41
    invoke-virtual {p1, v1, v3}, Landroid/graphics/RectF;->offset(FF)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v0, p1, Landroid/graphics/RectF;->bottom:F

    .line 45
    .line 46
    iget p2, p2, Landroid/graphics/RectF;->bottom:F

    .line 47
    .line 48
    sub-float p3, p2, p3

    .line 49
    .line 50
    cmpl-float p3, v0, p3

    .line 51
    .line 52
    if-lez p3, :cond_3

    .line 53
    .line 54
    sub-float/2addr p2, v0

    .line 55
    invoke-virtual {p1, v3, p2}, Landroid/graphics/RectF;->offset(FF)V

    .line 56
    .line 57
    .line 58
    :cond_3
    return-void
.end method


# virtual methods
.method public final l(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFZF)V
    .locals 9

    .line 1
    const-string v1, "rect"

    .line 2
    .line 3
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v1, "bounds"

    .line 7
    .line 8
    invoke-static {p4, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lcom/canhub/cropper/v;->f:Landroid/graphics/PointF;

    .line 12
    .line 13
    iget v3, v1, Landroid/graphics/PointF;->x:F

    .line 14
    .line 15
    add-float/2addr v3, p2

    .line 16
    iget v1, v1, Landroid/graphics/PointF;->y:F

    .line 17
    .line 18
    add-float/2addr v1, p3

    .line 19
    iget-object v5, p0, Lcom/canhub/cropper/v;->a:Lcom/canhub/cropper/v$b;

    .line 20
    .line 21
    sget-object v6, Lcom/canhub/cropper/v$b;->o:Lcom/canhub/cropper/v$b;

    .line 22
    .line 23
    if-ne v5, v6, :cond_0

    .line 24
    .line 25
    move-object v0, p0

    .line 26
    move-object v4, p4

    .line 27
    move v5, p5

    .line 28
    move v6, p6

    .line 29
    move/from16 v7, p7

    .line 30
    .line 31
    move v2, v3

    .line 32
    move v3, v1

    .line 33
    move-object v1, p1

    .line 34
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->m(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIF)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    move v2, v3

    .line 39
    move v3, v1

    .line 40
    if-eqz p8, :cond_1

    .line 41
    .line 42
    move-object v0, p0

    .line 43
    move-object v1, p1

    .line 44
    move-object v4, p4

    .line 45
    move v5, p5

    .line 46
    move v6, p6

    .line 47
    move/from16 v7, p7

    .line 48
    .line 49
    move/from16 v8, p9

    .line 50
    .line 51
    invoke-direct/range {v0 .. v8}, Lcom/canhub/cropper/v;->n(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIFF)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_1
    move-object v0, p0

    .line 56
    move-object v1, p1

    .line 57
    move-object v4, p4

    .line 58
    move v5, p5

    .line 59
    move v6, p6

    .line 60
    move/from16 v7, p7

    .line 61
    .line 62
    invoke-direct/range {v0 .. v7}, Lcom/canhub/cropper/v;->o(Landroid/graphics/RectF;FFLandroid/graphics/RectF;IIF)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
