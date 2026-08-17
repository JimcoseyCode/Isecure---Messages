.class public final Lcom/th3rdwave/safeareacontext/p;
.super Lcom/facebook/react/uimanager/LayoutShadowNode;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:Lcom/th3rdwave/safeareacontext/n;

.field private final b:[F

.field private final c:[F

.field private d:Z


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lcom/facebook/react/uimanager/LayoutShadowNode;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 5
    .line 6
    array-length v1, v0

    .line 7
    new-array v1, v1, [F

    .line 8
    .line 9
    iput-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 10
    .line 11
    array-length v1, v0

    .line 12
    new-array v1, v1, [F

    .line 13
    .line 14
    iput-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 15
    .line 16
    array-length v0, v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    if-ge v1, v0, :cond_0

    .line 19
    .line 20
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 21
    .line 22
    const/high16 v3, 0x7fc00000    # Float.NaN

    .line 23
    .line 24
    aput v3, v2, v1

    .line 25
    .line 26
    iget-object v2, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 27
    .line 28
    aput v3, v2, v1

    .line 29
    .line 30
    add-int/lit8 v1, v1, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-void
.end method

.method private final a(Lcom/th3rdwave/safeareacontext/l;FF)F
    .locals 1

    .line 1
    sget-object v0, Lcom/th3rdwave/safeareacontext/l;->g:Lcom/th3rdwave/safeareacontext/l;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return p3

    .line 6
    :cond_0
    sget-object v0, Lcom/th3rdwave/safeareacontext/l;->i:Lcom/th3rdwave/safeareacontext/l;

    .line 7
    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    invoke-static {p2, p3}, Ljava/lang/Math;->max(FF)F

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :cond_1
    add-float/2addr p2, p3

    .line 16
    return p2
.end method

.method private final b(Lcom/th3rdwave/safeareacontext/o;)V
    .locals 5

    .line 1
    sget-object v0, Lcom/th3rdwave/safeareacontext/o;->g:Lcom/th3rdwave/safeareacontext/o;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 10
    .line 11
    aget p1, p1, v4

    .line 12
    .line 13
    invoke-super {p0, v4, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 14
    .line 15
    .line 16
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 17
    .line 18
    aget p1, p1, v3

    .line 19
    .line 20
    invoke-super {p0, v3, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 21
    .line 22
    .line 23
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 24
    .line 25
    aget p1, p1, v2

    .line 26
    .line 27
    invoke-super {p0, v2, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 28
    .line 29
    .line 30
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 31
    .line 32
    aget p1, p1, v1

    .line 33
    .line 34
    invoke-super {p0, v1, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 39
    .line 40
    aget p1, p1, v4

    .line 41
    .line 42
    invoke-super {p0, v4, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 46
    .line 47
    aget p1, p1, v3

    .line 48
    .line 49
    invoke-super {p0, v3, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 53
    .line 54
    aget p1, p1, v2

    .line 55
    .line 56
    invoke-super {p0, v2, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 60
    .line 61
    aget p1, p1, v1

    .line 62
    .line 63
    invoke-super {p0, v1, p1}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 64
    .line 65
    .line 66
    :goto_0
    invoke-virtual {p0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->markUpdated()V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method private final c()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/p;->a:Lcom/th3rdwave/safeareacontext/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->c()Lcom/th3rdwave/safeareacontext/o;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/th3rdwave/safeareacontext/o;->g:Lcom/th3rdwave/safeareacontext/o;

    .line 11
    .line 12
    if-ne v1, v2, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 18
    .line 19
    :goto_0
    const/16 v3, 0x8

    .line 20
    .line 21
    aget v3, v1, v3

    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    :goto_1
    move v4, v3

    .line 30
    move v5, v4

    .line 31
    move v6, v5

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v3, 0x0

    .line 34
    goto :goto_1

    .line 35
    :goto_2
    const/4 v7, 0x7

    .line 36
    aget v7, v1, v7

    .line 37
    .line 38
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    if-nez v8, :cond_3

    .line 43
    .line 44
    move v3, v7

    .line 45
    move v5, v3

    .line 46
    :cond_3
    const/4 v7, 0x6

    .line 47
    aget v7, v1, v7

    .line 48
    .line 49
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-nez v8, :cond_4

    .line 54
    .line 55
    move v4, v7

    .line 56
    move v6, v4

    .line 57
    :cond_4
    const/4 v7, 0x1

    .line 58
    aget v8, v1, v7

    .line 59
    .line 60
    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    .line 61
    .line 62
    .line 63
    move-result v9

    .line 64
    if-nez v9, :cond_5

    .line 65
    .line 66
    move v3, v8

    .line 67
    :cond_5
    const/4 v8, 0x2

    .line 68
    aget v9, v1, v8

    .line 69
    .line 70
    invoke-static {v9}, Ljava/lang/Float;->isNaN(F)Z

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    if-nez v10, :cond_6

    .line 75
    .line 76
    move v4, v9

    .line 77
    :cond_6
    const/4 v9, 0x3

    .line 78
    aget v10, v1, v9

    .line 79
    .line 80
    invoke-static {v10}, Ljava/lang/Float;->isNaN(F)Z

    .line 81
    .line 82
    .line 83
    move-result v11

    .line 84
    if-nez v11, :cond_7

    .line 85
    .line 86
    move v5, v10

    .line 87
    :cond_7
    const/4 v10, 0x0

    .line 88
    aget v1, v1, v10

    .line 89
    .line 90
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 91
    .line 92
    .line 93
    move-result v11

    .line 94
    if-nez v11, :cond_8

    .line 95
    .line 96
    move v6, v1

    .line 97
    :cond_8
    invoke-static {v3}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    invoke-static {v4}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    invoke-static {v5}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    invoke-static {v6}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromDIP(F)F

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->a()Lcom/th3rdwave/safeareacontext/m;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->b()Lcom/th3rdwave/safeareacontext/a;

    .line 118
    .line 119
    .line 120
    move-result-object v11

    .line 121
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->c()Lcom/th3rdwave/safeareacontext/o;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-ne v0, v2, :cond_9

    .line 126
    .line 127
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->d()Lcom/th3rdwave/safeareacontext/l;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->d()F

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    invoke-direct {p0, v0, v2, v1}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-super {p0, v7, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->c()Lcom/th3rdwave/safeareacontext/l;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->c()F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    invoke-direct {p0, v0, v1, v3}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 151
    .line 152
    .line 153
    move-result v0

    .line 154
    invoke-super {p0, v8, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->a()Lcom/th3rdwave/safeareacontext/l;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->a()F

    .line 162
    .line 163
    .line 164
    move-result v1

    .line 165
    invoke-direct {p0, v0, v1, v4}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    invoke-super {p0, v9, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->b()Lcom/th3rdwave/safeareacontext/l;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->b()F

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    invoke-direct {p0, v0, v1, v5}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 181
    .line 182
    .line 183
    move-result v0

    .line 184
    invoke-super {p0, v10, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setPadding(IF)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_9
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->d()Lcom/th3rdwave/safeareacontext/l;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->d()F

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-direct {p0, v0, v2, v1}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 197
    .line 198
    .line 199
    move-result v0

    .line 200
    invoke-super {p0, v7, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->c()Lcom/th3rdwave/safeareacontext/l;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->c()F

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    invoke-direct {p0, v0, v1, v3}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    invoke-super {p0, v8, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->a()Lcom/th3rdwave/safeareacontext/l;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->a()F

    .line 223
    .line 224
    .line 225
    move-result v1

    .line 226
    invoke-direct {p0, v0, v1, v4}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    invoke-super {p0, v9, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v6}, Lcom/th3rdwave/safeareacontext/m;->b()Lcom/th3rdwave/safeareacontext/l;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-virtual {v11}, Lcom/th3rdwave/safeareacontext/a;->b()F

    .line 238
    .line 239
    .line 240
    move-result v1

    .line 241
    invoke-direct {p0, v0, v1, v5}, Lcom/th3rdwave/safeareacontext/p;->a(Lcom/th3rdwave/safeareacontext/l;FF)F

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    invoke-super {p0, v10, v0}, Lcom/facebook/react/uimanager/ReactShadowNodeImpl;->setMargin(IF)V

    .line 246
    .line 247
    .line 248
    return-void
.end method


# virtual methods
.method public onBeforeLayout(Lcom/facebook/react/uimanager/NativeViewHierarchyOptimizer;)V
    .locals 1

    .line 1
    const-string v0, "nativeViewHierarchyOptimizer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p1, p0, Lcom/th3rdwave/safeareacontext/p;->d:Z

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/p;->d:Z

    .line 12
    .line 13
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/p;->c()V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public setLocalData(Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    instance-of v0, p1, Lcom/th3rdwave/safeareacontext/n;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/th3rdwave/safeareacontext/p;->a:Lcom/th3rdwave/safeareacontext/n;

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->c()Lcom/th3rdwave/safeareacontext/o;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    move-object v2, p1

    .line 20
    check-cast v2, Lcom/th3rdwave/safeareacontext/n;

    .line 21
    .line 22
    invoke-virtual {v2}, Lcom/th3rdwave/safeareacontext/n;->c()Lcom/th3rdwave/safeareacontext/o;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    if-eq v1, v2, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/th3rdwave/safeareacontext/n;->c()Lcom/th3rdwave/safeareacontext/o;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-direct {p0, v0}, Lcom/th3rdwave/safeareacontext/p;->b(Lcom/th3rdwave/safeareacontext/o;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    check-cast p1, Lcom/th3rdwave/safeareacontext/n;

    .line 36
    .line 37
    iput-object p1, p0, Lcom/th3rdwave/safeareacontext/p;->a:Lcom/th3rdwave/safeareacontext/n;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/p;->d:Z

    .line 41
    .line 42
    invoke-direct {p0}, Lcom/th3rdwave/safeareacontext/p;->c()V

    .line 43
    .line 44
    .line 45
    return-void
.end method

.method public setMargins(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactPropGroup;
        names = {
            "margin",
            "marginVertical",
            "marginHorizontal",
            "marginStart",
            "marginEnd",
            "marginTop",
            "marginBottom",
            "marginLeft",
            "marginRight"
        }
    .end annotation

    .line 1
    const-string v0, "margin"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 7
    .line 8
    aget v0, v0, p1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->c:[F

    .line 11
    .line 12
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    double-to-float v2, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 27
    .line 28
    :goto_0
    aput v2, v1, v0

    .line 29
    .line 30
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/LayoutShadowNode;->setMargins(ILcom/facebook/react/bridge/Dynamic;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/p;->d:Z

    .line 35
    .line 36
    return-void
.end method

.method public setPaddings(ILcom/facebook/react/bridge/Dynamic;)V
    .locals 4
    .annotation runtime Lcom/facebook/react/uimanager/annotations/ReactPropGroup;
        names = {
            "padding",
            "paddingVertical",
            "paddingHorizontal",
            "paddingStart",
            "paddingEnd",
            "paddingTop",
            "paddingBottom",
            "paddingLeft",
            "paddingRight"
        }
    .end annotation

    .line 1
    const-string v0, "padding"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lcom/facebook/react/uimanager/ViewProps;->PADDING_MARGIN_SPACING_TYPES:[I

    .line 7
    .line 8
    aget v0, v0, p1

    .line 9
    .line 10
    iget-object v1, p0, Lcom/th3rdwave/safeareacontext/p;->b:[F

    .line 11
    .line 12
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->getType()Lcom/facebook/react/bridge/ReadableType;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    sget-object v3, Lcom/facebook/react/bridge/ReadableType;->Number:Lcom/facebook/react/bridge/ReadableType;

    .line 17
    .line 18
    if-ne v2, v3, :cond_0

    .line 19
    .line 20
    invoke-interface {p2}, Lcom/facebook/react/bridge/Dynamic;->asDouble()D

    .line 21
    .line 22
    .line 23
    move-result-wide v2

    .line 24
    double-to-float v2, v2

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/high16 v2, 0x7fc00000    # Float.NaN

    .line 27
    .line 28
    :goto_0
    aput v2, v1, v0

    .line 29
    .line 30
    invoke-super {p0, p1, p2}, Lcom/facebook/react/uimanager/LayoutShadowNode;->setPaddings(ILcom/facebook/react/bridge/Dynamic;)V

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Lcom/th3rdwave/safeareacontext/p;->d:Z

    .line 35
    .line 36
    return-void
.end method
