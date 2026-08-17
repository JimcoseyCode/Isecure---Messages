.class Lcom/horcrux/svg/b0;
.super Lcom/horcrux/svg/o0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final A:Ljava/util/ArrayList;

.field private final B:Landroid/content/res/AssetManager;

.field private w:Landroid/graphics/Path;

.field x:Ljava/lang/String;

.field private y:Lcom/horcrux/svg/c0;

.field private final z:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/o0;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/horcrux/svg/b0;->z:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance p1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lcom/horcrux/svg/b0;->A:Ljava/util/ArrayList;

    .line 17
    .line 18
    iget-object p1, p0, Lcom/horcrux/svg/VirtualView;->mContext:Lcom/facebook/react/bridge/ReactContext;

    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, Landroid/content/res/Resources;->getAssets()Landroid/content/res/AssetManager;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 29
    .line 30
    return-void
.end method

.method private E(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V
    .locals 7

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    iget-wide v1, p2, Lcom/horcrux/svg/x;->n:D

    .line 4
    .line 5
    iget-wide v3, p2, Lcom/horcrux/svg/x;->a:D

    .line 6
    .line 7
    iget v5, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 8
    .line 9
    float-to-double v5, v5

    .line 10
    mul-double/2addr v3, v5

    .line 11
    div-double v3, v1, v3

    .line 12
    .line 13
    double-to-float v3, v3

    .line 14
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 15
    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    cmpl-double v1, v1, v3

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    iget-object v1, p2, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/f0;

    .line 24
    .line 25
    sget-object v2, Lcom/horcrux/svg/f0;->g:Lcom/horcrux/svg/f0;

    .line 26
    .line 27
    if-ne v1, v2, :cond_0

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    iget-object v2, p2, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    .line 58
    .line 59
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object v2, p2, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    .line 63
    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    const/16 v1, 0x1a

    .line 75
    .line 76
    if-lt v0, v1, :cond_1

    .line 77
    .line 78
    new-instance v0, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 81
    .line 82
    .line 83
    const-string v1, "\'wght\' "

    .line 84
    .line 85
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    iget v1, p2, Lcom/horcrux/svg/x;->f:I

    .line 89
    .line 90
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    iget-object p2, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 94
    .line 95
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    invoke-static {p1, p2}, Lcom/horcrux/svg/U;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 103
    .line 104
    .line 105
    :cond_1
    return-void
.end method

.method private F(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V
    .locals 10

    .line 1
    iget-object v0, p2, Lcom/horcrux/svg/x;->e:Lcom/horcrux/svg/g0;

    .line 2
    .line 3
    sget-object v1, Lcom/horcrux/svg/g0;->i:Lcom/horcrux/svg/g0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    if-eq v0, v1, :cond_1

    .line 8
    .line 9
    iget v0, p2, Lcom/horcrux/svg/x;->f:I

    .line 10
    .line 11
    const/16 v1, 0x226

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v2

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    :goto_0
    move v0, v3

    .line 19
    :goto_1
    iget-object v1, p2, Lcom/horcrux/svg/x;->c:Lcom/horcrux/svg/e0;

    .line 20
    .line 21
    sget-object v4, Lcom/horcrux/svg/e0;->h:Lcom/horcrux/svg/e0;

    .line 22
    .line 23
    if-ne v1, v4, :cond_2

    .line 24
    .line 25
    move v1, v3

    .line 26
    goto :goto_2

    .line 27
    :cond_2
    move v1, v2

    .line 28
    :goto_2
    if-eqz v0, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    const/4 v2, 0x3

    .line 33
    goto :goto_3

    .line 34
    :cond_3
    if-eqz v0, :cond_4

    .line 35
    .line 36
    move v2, v3

    .line 37
    goto :goto_3

    .line 38
    :cond_4
    if-eqz v1, :cond_5

    .line 39
    .line 40
    const/4 v2, 0x2

    .line 41
    :cond_5
    :goto_3
    iget v0, p2, Lcom/horcrux/svg/x;->f:I

    .line 42
    .line 43
    iget-object v4, p2, Lcom/horcrux/svg/x;->b:Ljava/lang/String;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    if-eqz v4, :cond_7

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    if-lez v6, :cond_7

    .line 53
    .line 54
    new-instance v6, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v7, "fonts/"

    .line 60
    .line 61
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v8, ".otf"

    .line 68
    .line 69
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, ".ttf"

    .line 88
    .line 89
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 97
    .line 98
    const/16 v9, 0x1a

    .line 99
    .line 100
    if-lt v8, v9, :cond_6

    .line 101
    .line 102
    invoke-static {}, Lcom/horcrux/svg/a0;->a()V

    .line 103
    .line 104
    .line 105
    iget-object v5, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 106
    .line 107
    invoke-static {v5, v6}, Lcom/horcrux/svg/Z;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    new-instance v6, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 114
    .line 115
    .line 116
    const-string v8, "\'wght\' "

    .line 117
    .line 118
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget-object v9, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-static {v5, v6}, Lcom/horcrux/svg/V;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 134
    .line 135
    .line 136
    invoke-static {v5, v0}, Lcom/horcrux/svg/W;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 137
    .line 138
    .line 139
    invoke-static {v5, v1}, Lcom/horcrux/svg/X;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 140
    .line 141
    .line 142
    invoke-static {v5}, Lcom/horcrux/svg/Y;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 143
    .line 144
    .line 145
    move-result-object v5

    .line 146
    if-nez v5, :cond_7

    .line 147
    .line 148
    invoke-static {}, Lcom/horcrux/svg/a0;->a()V

    .line 149
    .line 150
    .line 151
    iget-object v5, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 152
    .line 153
    invoke-static {v5, v7}, Lcom/horcrux/svg/Z;->a(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    new-instance v6, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    iget-object v7, p2, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    .line 169
    .line 170
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-static {v5, v6}, Lcom/horcrux/svg/V;->a(Landroid/graphics/Typeface$Builder;Ljava/lang/String;)Landroid/graphics/Typeface$Builder;

    .line 178
    .line 179
    .line 180
    invoke-static {v5, v0}, Lcom/horcrux/svg/W;->a(Landroid/graphics/Typeface$Builder;I)Landroid/graphics/Typeface$Builder;

    .line 181
    .line 182
    .line 183
    invoke-static {v5, v1}, Lcom/horcrux/svg/X;->a(Landroid/graphics/Typeface$Builder;Z)Landroid/graphics/Typeface$Builder;

    .line 184
    .line 185
    .line 186
    invoke-static {v5}, Lcom/horcrux/svg/Y;->a(Landroid/graphics/Typeface$Builder;)Landroid/graphics/Typeface;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    goto :goto_4

    .line 191
    :cond_6
    :try_start_0
    iget-object v8, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 192
    .line 193
    invoke-static {v8, v6}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 198
    .line 199
    .line 200
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 201
    goto :goto_4

    .line 202
    :catch_0
    :try_start_1
    iget-object v6, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 203
    .line 204
    invoke-static {v6, v7}, Landroid/graphics/Typeface;->createFromAsset(Landroid/content/res/AssetManager;Ljava/lang/String;)Landroid/graphics/Typeface;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    invoke-static {v5, v2}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    .line 209
    .line 210
    .line 211
    move-result-object v5
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 212
    :catch_1
    :cond_7
    :goto_4
    if-nez v5, :cond_8

    .line 213
    .line 214
    :try_start_2
    invoke-static {}, Lcom/facebook/react/views/text/ReactFontManager;->getInstance()Lcom/facebook/react/views/text/ReactFontManager;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    iget-object v7, p0, Lcom/horcrux/svg/b0;->B:Landroid/content/res/AssetManager;

    .line 219
    .line 220
    invoke-virtual {v6, v4, v2, v7}, Lcom/facebook/react/views/text/ReactFontManager;->getTypeface(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 221
    .line 222
    .line 223
    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 224
    :catch_2
    :cond_8
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 225
    .line 226
    const/16 v4, 0x1c

    .line 227
    .line 228
    if-lt v2, v4, :cond_9

    .line 229
    .line 230
    invoke-static {v5, v0, v1}, Lcom/facebook/react/common/assets/a;->a(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 231
    .line 232
    .line 233
    move-result-object v5

    .line 234
    :cond_9
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setLinearText(Z)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setSubpixelText(Z)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {p1, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 241
    .line 242
    .line 243
    iget-wide v0, p2, Lcom/horcrux/svg/x;->a:D

    .line 244
    .line 245
    iget p2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 246
    .line 247
    float-to-double v2, p2

    .line 248
    mul-double/2addr v0, v2

    .line 249
    double-to-float p2, v0

    .line 250
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 251
    .line 252
    .line 253
    const/4 p2, 0x0

    .line 254
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    .line 255
    .line 256
    .line 257
    return-void
.end method

.method private G(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->i()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    new-instance v3, Landroid/text/TextPaint;

    .line 13
    .line 14
    invoke-direct {v3, p2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/b0;->F(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, v3, v1}, Lcom/horcrux/svg/b0;->E(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->c()D

    .line 24
    .line 25
    .line 26
    move-result-wide v11

    .line 27
    sget-object p2, Lcom/horcrux/svg/b0$a;->a:[I

    .line 28
    .line 29
    iget-object v1, v1, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    aget p2, p2, v1

    .line 36
    .line 37
    const/4 v1, 0x2

    .line 38
    if-eq p2, v1, :cond_1

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    if-eq p2, v1, :cond_0

    .line 42
    .line 43
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-object p2, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 50
    .line 51
    :goto_0
    new-instance v1, Landroid/text/SpannableString;

    .line 52
    .line 53
    iget-object v2, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 54
    .line 55
    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lcom/horcrux/svg/o0;->l:Lcom/horcrux/svg/SVGLength;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    int-to-double v5, v2

    .line 65
    iget v2, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 66
    .line 67
    float-to-double v9, v2

    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    invoke-static/range {v4 .. v12}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v4

    .line 74
    double-to-int v7, v4

    .line 75
    const/4 v5, 0x1

    .line 76
    move-object v2, p0

    .line 77
    move-object v4, p2

    .line 78
    move-object v6, v1

    .line 79
    invoke-direct/range {v2 .. v7}, Lcom/horcrux/svg/b0;->J(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    const/4 v1, 0x0

    .line 84
    invoke-virtual {p2, v1}, Landroid/text/Layout;->getLineAscent(I)I

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    const-wide/16 v2, 0x0

    .line 89
    .line 90
    invoke-virtual {v0, v2, v3}, Lcom/horcrux/svg/z;->l(D)D

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    double-to-float v2, v2

    .line 95
    invoke-virtual {v0}, Lcom/horcrux/svg/z;->m()D

    .line 96
    .line 97
    .line 98
    move-result-wide v3

    .line 99
    int-to-double v0, v1

    .line 100
    add-double/2addr v3, v0

    .line 101
    double-to-float v0, v3

    .line 102
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->h()V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {p2, p1}, Landroid/text/Layout;->draw(Landroid/graphics/Canvas;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 115
    .line 116
    .line 117
    return-void
.end method

.method private H(Lcom/horcrux/svg/SVGLength;DD)D
    .locals 10

    .line 1
    iget v0, p0, Lcom/horcrux/svg/VirtualView;->mScale:F

    .line 2
    .line 3
    float-to-double v6, v0

    .line 4
    const-wide/16 v4, 0x0

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    move-wide v2, p2

    .line 8
    move-wide v8, p4

    .line 9
    invoke-static/range {v1 .. v9}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    .line 10
    .line 11
    .line 12
    move-result-wide p1

    .line 13
    return-wide p1
.end method

.method private I(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;
    .locals 68

    move-object/from16 v0, p0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    .line 1
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v8

    .line 2
    new-instance v9, Landroid/graphics/Path;

    invoke-direct {v9}, Landroid/graphics/Path;-><init>()V

    .line 3
    iget-object v1, v0, Lcom/horcrux/svg/b0;->z:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 4
    iget-object v1, v0, Lcom/horcrux/svg/b0;->A:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    if-nez v8, :cond_0

    :goto_0
    move-object v7, v0

    :goto_1
    move-object v1, v9

    goto/16 :goto_21

    .line 5
    :cond_0
    iget-object v1, v0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    const/4 v10, 0x0

    if-eqz v1, :cond_1

    const/4 v12, 0x1

    goto :goto_2

    :cond_1
    move v12, v10

    :goto_2
    const-wide/16 v13, 0x0

    if-eqz v12, :cond_3

    .line 6
    new-instance v1, Landroid/graphics/PathMeasure;

    iget-object v2, v0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    invoke-virtual {v2, v7, v6}, Lcom/horcrux/svg/c0;->H(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    move-result-object v2

    invoke-direct {v1, v2, v10}, Landroid/graphics/PathMeasure;-><init>(Landroid/graphics/Path;Z)V

    .line 7
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->getLength()F

    move-result v2

    float-to-double v2, v2

    .line 8
    invoke-virtual {v1}, Landroid/graphics/PathMeasure;->isClosed()Z

    move-result v4

    cmpl-double v5, v2, v13

    if-nez v5, :cond_2

    goto :goto_0

    :cond_2
    move/from16 v16, v4

    :goto_3
    move-object v15, v1

    goto :goto_4

    :cond_3
    const/4 v1, 0x0

    move/from16 v16, v10

    move-wide v2, v13

    goto :goto_3

    .line 9
    :goto_4
    invoke-virtual {v0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    move-result-object v4

    .line 11
    invoke-direct {v0, v6, v4}, Lcom/horcrux/svg/b0;->F(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 12
    new-instance v5, Lcom/horcrux/svg/A;

    invoke-direct {v5, v6}, Lcom/horcrux/svg/A;-><init>(Landroid/graphics/Paint;)V

    move-wide/from16 v17, v13

    .line 13
    new-array v13, v8, [Z

    .line 14
    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->toCharArray()[C

    move-result-object v14

    .line 15
    iget-wide v10, v4, Lcom/horcrux/svg/x;->l:D

    move-wide/from16 v20, v10

    .line 16
    iget-wide v10, v4, Lcom/horcrux/svg/x;->m:D

    move-wide/from16 v22, v10

    .line 17
    iget-wide v10, v4, Lcom/horcrux/svg/x;->n:D

    move-wide/from16 v24, v10

    .line 18
    iget-boolean v10, v4, Lcom/horcrux/svg/x;->o:Z

    cmpl-double v11, v24, v17

    if-nez v11, :cond_4

    .line 19
    iget-object v11, v4, Lcom/horcrux/svg/x;->i:Lcom/horcrux/svg/f0;

    move-object/from16 v26, v1

    sget-object v1, Lcom/horcrux/svg/f0;->g:Lcom/horcrux/svg/f0;

    if-ne v11, v1, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_4
    move-object/from16 v26, v1

    :cond_5
    const/4 v1, 0x0

    .line 20
    :goto_5
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    if-eqz v1, :cond_6

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    move-wide/from16 v27, v2

    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'hlig\', \'cala\', "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v4, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    move-wide/from16 v27, v2

    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'rlig\', \'liga\', \'clig\', \'calt\', \'locl\', \'ccmp\', \'mark\', \'mkmk\',\'kern\', \'liga\' 0, \'clig\' 0, \'dlig\' 0, \'hlig\' 0, \'cala\' 0, "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v4, Lcom/horcrux/svg/x;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v6, v1}, Landroid/graphics/Paint;->setFontFeatureSettings(Ljava/lang/String;)V

    :goto_6
    const/16 v1, 0x1a

    if-lt v11, v1, :cond_7

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\'wght\' "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, v4, Lcom/horcrux/svg/x;->f:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    iget-object v2, v4, Lcom/horcrux/svg/x;->h:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v6, v1}, Lcom/horcrux/svg/U;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    .line 24
    :cond_7
    iget-object v11, v4, Lcom/horcrux/svg/x;->d:Lcom/facebook/react/bridge/ReadableMap;

    .line 25
    new-array v1, v8, [F

    move-object/from16 v2, p1

    .line 26
    invoke-virtual {v6, v2, v1}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I

    .line 27
    iget-object v2, v4, Lcom/horcrux/svg/x;->j:Lcom/horcrux/svg/h0;

    .line 28
    invoke-virtual {v0}, Lcom/horcrux/svg/o0;->r()Lcom/horcrux/svg/o0;

    move-result-object v3

    .line 29
    invoke-virtual {v3, v6}, Lcom/horcrux/svg/o0;->q(Landroid/graphics/Paint;)D

    move-result-wide v3

    .line 30
    invoke-direct {v0, v2, v3, v4}, Lcom/horcrux/svg/b0;->K(Lcom/horcrux/svg/h0;D)D

    move-result-wide v29

    .line 31
    invoke-virtual/range {v26 .. v26}, Lcom/horcrux/svg/z;->c()D

    move-result-wide v36

    const/16 v40, -0x1

    const-wide/high16 v41, 0x4000000000000000L    # 2.0

    if-eqz v12, :cond_c

    move-object/from16 v31, v1

    .line 32
    iget-object v1, v0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    invoke-virtual {v1}, Lcom/horcrux/svg/c0;->E()Lcom/horcrux/svg/l0;

    move-result-object v1

    move-object/from16 v32, v2

    sget-object v2, Lcom/horcrux/svg/l0;->g:Lcom/horcrux/svg/l0;

    if-ne v1, v2, :cond_8

    const/16 v33, 0x1

    goto :goto_7

    :cond_8
    const/16 v33, 0x0

    .line 33
    :goto_7
    iget-object v1, v0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    invoke-virtual {v1}, Lcom/horcrux/svg/c0;->F()Lcom/horcrux/svg/m0;

    move-result-object v1

    sget-object v2, Lcom/horcrux/svg/m0;->h:Lcom/horcrux/svg/m0;

    if-ne v1, v2, :cond_9

    move/from16 v34, v40

    goto :goto_8

    :cond_9
    const/16 v34, 0x1

    .line 34
    :goto_8
    iget-object v1, v0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    .line 35
    invoke-virtual {v1}, Lcom/horcrux/svg/c0;->G()Lcom/horcrux/svg/SVGLength;

    move-result-object v1

    move-wide/from16 v44, v3

    move/from16 v43, v10

    move-object/from16 v10, v26

    move-wide/from16 v2, v27

    move-object/from16 v27, v31

    move/from16 v26, v12

    move-object/from16 v28, v13

    move-object/from16 v13, v32

    move-object v12, v5

    move-wide/from16 v4, v36

    invoke-direct/range {v0 .. v5}, Lcom/horcrux/svg/b0;->H(Lcom/horcrux/svg/SVGLength;DD)D

    move-result-wide v31

    move-wide/from16 v66, v2

    move-object v2, v0

    move-wide/from16 v0, v66

    add-double v29, v29, v31

    move-wide/from16 v38, v4

    if-eqz v16, :cond_b

    div-double v3, v0, v41

    .line 36
    sget-object v5, Lcom/horcrux/svg/h0;->h:Lcom/horcrux/svg/h0;

    if-ne v13, v5, :cond_a

    neg-double v3, v3

    goto :goto_9

    :cond_a
    move-wide/from16 v3, v17

    :goto_9
    add-double v31, v31, v3

    add-double v3, v31, v0

    move-wide/from16 v46, v29

    move-wide/from16 v48, v31

    move/from16 v13, v33

    move-wide/from16 v29, v3

    move/from16 v3, v34

    goto :goto_b

    :cond_b
    move-wide/from16 v48, v17

    move-wide/from16 v46, v29

    move/from16 v13, v33

    move/from16 v3, v34

    :goto_a
    move-wide/from16 v29, v0

    goto :goto_b

    :cond_c
    move-object v2, v0

    move-wide/from16 v44, v3

    move/from16 v43, v10

    move-object/from16 v10, v26

    move-wide/from16 v38, v36

    move/from16 v26, v12

    move-object v12, v5

    move-wide/from16 v66, v27

    move-object/from16 v27, v1

    move-object/from16 v28, v13

    move-wide/from16 v0, v66

    move-wide/from16 v48, v17

    move-wide/from16 v46, v29

    const/4 v3, 0x1

    const/4 v13, 0x0

    goto :goto_a

    .line 37
    :goto_b
    iget-object v4, v2, Lcom/horcrux/svg/o0;->m:Lcom/horcrux/svg/SVGLength;

    const-wide/high16 v50, 0x3ff0000000000000L    # 1.0

    if-eqz v4, :cond_f

    .line 38
    invoke-virtual {v7}, Landroid/graphics/Canvas;->getWidth()I

    move-result v5

    move-object/from16 v31, v4

    int-to-double v4, v5

    move-wide/from16 v32, v4

    iget v4, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v4, v4

    const-wide/16 v34, 0x0

    move-wide/from16 v36, v4

    invoke-static/range {v31 .. v39}, Lcom/horcrux/svg/M;->a(Lcom/horcrux/svg/SVGLength;DDDD)D

    move-result-wide v4

    cmpg-double v16, v4, v17

    if-ltz v16, :cond_e

    .line 39
    sget-object v16, Lcom/horcrux/svg/b0$a;->b:[I

    move-wide/from16 v31, v4

    iget-object v4, v2, Lcom/horcrux/svg/o0;->o:Lcom/horcrux/svg/j0;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v16, v4

    const/4 v5, 0x2

    if-eq v4, v5, :cond_d

    sub-double v4, v31, v44

    move-wide/from16 v31, v4

    add-int/lit8 v4, v8, -0x1

    int-to-double v4, v4

    div-double v4, v31, v4

    add-double v4, v24, v4

    move-wide/from16 v24, v4

    goto :goto_c

    :cond_d
    div-double v50, v31, v44

    goto :goto_c

    .line 40
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Negative textLength value"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_f
    :goto_c
    int-to-double v4, v3

    move-wide/from16 v44, v4

    mul-double v4, v50, v44

    move/from16 v16, v13

    .line 41
    invoke-virtual {v6}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;

    move-result-object v13

    move-object/from16 v52, v14

    .line 42
    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->descent:F

    move/from16 v53, v3

    move-wide/from16 v54, v4

    float-to-double v3, v14

    .line 43
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->leading:F

    move-wide/from16 v56, v0

    float-to-double v0, v5

    add-double/2addr v0, v3

    .line 44
    iget v14, v13, Landroid/graphics/Paint$FontMetrics;->ascent:F

    neg-float v14, v14

    add-float/2addr v14, v5

    move-wide/from16 v31, v0

    float-to-double v0, v14

    .line 45
    iget v5, v13, Landroid/graphics/Paint$FontMetrics;->top:F

    neg-float v5, v5

    float-to-double v13, v5

    add-double v33, v13, v31

    .line 46
    invoke-virtual {v2}, Lcom/horcrux/svg/o0;->o()Ljava/lang/String;

    move-result-object v5

    .line 47
    invoke-virtual {v2}, Lcom/horcrux/svg/o0;->n()Lcom/horcrux/svg/d0;

    move-result-object v35

    if-eqz v35, :cond_10

    .line 48
    sget-object v36, Lcom/horcrux/svg/b0$a;->c:[I

    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    move-result v37

    aget v36, v36, v37

    packed-switch v36, :pswitch_data_0

    move-wide/from16 v0, v17

    :goto_d
    :pswitch_0
    const/4 v13, 0x0

    goto :goto_f

    :pswitch_1
    move-wide v0, v13

    goto :goto_d

    :pswitch_2
    div-double v0, v33, v41

    goto :goto_d

    :pswitch_3
    move-wide/from16 v0, v31

    goto :goto_d

    :pswitch_4
    const-wide v3, 0x3fe999999999999aL    # 0.8

    :goto_e
    mul-double/2addr v0, v3

    goto :goto_d

    :pswitch_5
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    goto :goto_e

    :pswitch_6
    sub-double/2addr v0, v3

    div-double v0, v0, v41

    goto :goto_d

    .line 49
    :pswitch_7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 50
    const-string v1, "x"

    const/4 v3, 0x1

    const/4 v13, 0x0

    invoke-virtual {v6, v1, v13, v3, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 51
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    int-to-double v0, v0

    div-double v0, v0, v41

    goto :goto_f

    :pswitch_8
    const/4 v13, 0x0

    neg-double v0, v3

    goto :goto_f

    :cond_10
    :pswitch_9
    const/4 v13, 0x0

    move-wide/from16 v0, v17

    :goto_f
    if-eqz v5, :cond_14

    .line 52
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_14

    .line 53
    sget-object v3, Lcom/horcrux/svg/b0$a;->c:[I

    invoke-virtual/range {v35 .. v35}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v3, v3, v4

    const/16 v4, 0xe

    if-eq v3, v4, :cond_14

    const/16 v4, 0x10

    if-eq v3, v4, :cond_14

    .line 54
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v3

    sparse-switch v3, :sswitch_data_0

    goto :goto_10

    :sswitch_0
    const-string v3, "super"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    goto :goto_10

    :cond_11
    const/16 v40, 0x2

    goto :goto_10

    :sswitch_1
    const-string v3, "sub"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    goto :goto_10

    :cond_12
    const/16 v40, 0x1

    goto :goto_10

    :sswitch_2
    const-string v3, "baseline"

    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    goto :goto_10

    :cond_13
    move/from16 v40, v13

    .line 55
    :goto_10
    const-string v3, "os2"

    const-string v4, "unitsPerEm"

    const-string v14, "tables"

    packed-switch v40, :pswitch_data_1

    iget v3, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v13, v3

    mul-double v32, v13, v38

    float-to-double v3, v3

    move-wide/from16 v34, v3

    move-object/from16 v31, v5

    move-wide/from16 v36, v38

    .line 56
    invoke-static/range {v31 .. v37}, Lcom/horcrux/svg/M;->b(Ljava/lang/String;DDD)D

    move-result-wide v3

    sub-double/2addr v0, v3

    :cond_14
    :goto_11
    :pswitch_a
    move-wide/from16 v31, v0

    goto/16 :goto_12

    :pswitch_b
    if-eqz v11, :cond_14

    .line 57
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_14

    .line 58
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v4

    .line 59
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v5

    .line 60
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_15

    .line 61
    invoke-interface {v5, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v3

    .line 62
    const-string v5, "ySuperscriptYOffset"

    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_15

    .line 63
    invoke-interface {v3, v5}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v13

    .line 64
    iget v3, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    move-wide/from16 v31, v0

    float-to-double v0, v3

    mul-double v0, v0, v38

    mul-double/2addr v0, v13

    int-to-double v3, v4

    div-double/2addr v0, v3

    sub-double v0, v31, v0

    goto :goto_11

    :cond_15
    move-wide/from16 v31, v0

    :cond_16
    move-wide/from16 v0, v31

    goto :goto_11

    :pswitch_c
    move-wide/from16 v31, v0

    if-eqz v11, :cond_17

    .line 65
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 66
    invoke-interface {v11, v4}, Lcom/facebook/react/bridge/ReadableMap;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 67
    invoke-interface {v11, v14}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v1

    .line 68
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 69
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getMap(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableMap;

    move-result-object v1

    .line 70
    const-string v3, "ySubscriptYOffset"

    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_16

    .line 71
    invoke-interface {v1, v3}, Lcom/facebook/react/bridge/ReadableMap;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    .line 72
    iget v1, v2, Lcom/horcrux/svg/VirtualView;->mScale:F

    float-to-double v13, v1

    mul-double v13, v13, v38

    mul-double/2addr v13, v3

    int-to-double v0, v0

    div-double/2addr v13, v0

    add-double v0, v31, v13

    goto :goto_11

    .line 73
    :cond_17
    :goto_12
    new-instance v11, Landroid/graphics/Matrix;

    invoke-direct {v11}, Landroid/graphics/Matrix;-><init>()V

    .line 74
    new-instance v13, Landroid/graphics/Matrix;

    invoke-direct {v13}, Landroid/graphics/Matrix;-><init>()V

    .line 75
    new-instance v14, Landroid/graphics/Matrix;

    invoke-direct {v14}, Landroid/graphics/Matrix;-><init>()V

    const/16 v0, 0x9

    .line 76
    new-array v1, v0, [F

    .line 77
    new-array v0, v0, [F

    const/4 v3, 0x0

    :goto_13
    if-ge v3, v8, :cond_29

    .line 78
    aget-char v4, v52, v3

    .line 79
    invoke-static {v4}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v5

    .line 80
    aget-boolean v33, v28, v3

    if-eqz v33, :cond_18

    .line 81
    const-string v5, ""

    const/16 v34, 0x0

    const/16 v36, 0x0

    goto :goto_15

    :cond_18
    move/from16 v19, v3

    const/16 v34, 0x0

    const/16 v36, 0x0

    :goto_14
    const/16 v35, 0x1

    add-int/lit8 v2, v19, 0x1

    if-ge v2, v8, :cond_1a

    .line 82
    aget v35, v27, v2

    cmpl-float v35, v35, v36

    if-lez v35, :cond_19

    goto :goto_15

    :cond_19
    move/from16 v35, v2

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    aget-char v5, v52, v35

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/16 v19, 0x1

    .line 84
    aput-boolean v19, v28, v35

    move/from16 v19, v35

    const/16 v34, 0x1

    goto :goto_14

    .line 85
    :cond_1a
    :goto_15
    invoke-virtual {v6, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v2

    move/from16 v35, v3

    float-to-double v2, v2

    mul-double v2, v2, v50

    move-wide/from16 v37, v2

    if-nez v43, :cond_1b

    .line 86
    aget v2, v27, v35

    float-to-double v2, v2

    mul-double v2, v2, v50

    sub-double v2, v2, v37

    move-wide/from16 v20, v2

    :cond_1b
    const/16 v2, 0x20

    if-ne v4, v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_16

    :cond_1c
    const/4 v2, 0x0

    :goto_16
    if-eqz v2, :cond_1d

    move-wide/from16 v39, v22

    goto :goto_17

    :cond_1d
    move-wide/from16 v39, v17

    :goto_17
    add-double v39, v39, v24

    add-double v39, v37, v39

    if-eqz v33, :cond_1e

    move/from16 v60, v2

    move-wide/from16 v2, v17

    goto :goto_18

    :cond_1e
    add-double v58, v20, v39

    move/from16 v60, v2

    move-wide/from16 v2, v58

    .line 87
    :goto_18
    invoke-virtual {v10, v2, v3}, Lcom/horcrux/svg/z;->l(D)D

    move-result-wide v2

    move-wide/from16 v58, v2

    .line 88
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->m()D

    move-result-wide v2

    .line 89
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->i()D

    move-result-wide v61

    .line 90
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->j()D

    move-result-wide v63

    move-object/from16 v65, v5

    .line 91
    invoke-virtual {v10}, Lcom/horcrux/svg/z;->k()D

    move-result-wide v5

    if-nez v33, :cond_1f

    if-eqz v60, :cond_20

    :cond_1f
    move-object/from16 v62, v0

    move-object v3, v7

    move/from16 v33, v8

    move-object/from16 v40, v10

    move-object v2, v12

    move-object v10, v13

    const/4 v4, 0x1

    move-object/from16 v7, p0

    move-object/from16 v0, p2

    move-object v8, v1

    move-object v1, v9

    const/4 v9, 0x2

    goto/16 :goto_20

    :cond_20
    mul-double v39, v39, v44

    mul-double v37, v37, v44

    add-double v58, v58, v61

    mul-double v58, v58, v44

    add-double v58, v46, v58

    move/from16 v33, v8

    move-object/from16 v60, v9

    sub-double v8, v58, v39

    if-eqz v26, :cond_26

    move/from16 v39, v4

    move-wide/from16 v58, v5

    add-double v4, v8, v37

    div-double v6, v37, v41

    move-wide/from16 v37, v2

    add-double v2, v8, v6

    cmpl-double v40, v2, v29

    if-lez v40, :cond_21

    :goto_19
    move-object/from16 v7, p0

    move-object/from16 v3, p3

    move-object/from16 v62, v0

    move-object v8, v1

    move-object/from16 v40, v10

    move-object v2, v12

    move-object v10, v13

    move-object/from16 v1, v60

    const/4 v4, 0x1

    const/4 v9, 0x2

    move-object/from16 v0, p2

    goto/16 :goto_20

    :cond_21
    cmpg-double v40, v2, v48

    if-gez v40, :cond_22

    goto :goto_19

    :cond_22
    move-object/from16 v40, v10

    const/4 v10, 0x3

    if-eqz v16, :cond_23

    double-to-float v2, v2

    .line 92
    invoke-virtual {v15, v2, v13, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    move-object/from16 v62, v0

    move-object/from16 v61, v12

    move-object v10, v13

    move-wide/from16 v2, v56

    const/16 p1, 0x2

    move-object/from16 v57, v1

    goto :goto_1c

    :cond_23
    cmpg-double v61, v8, v17

    if-gez v61, :cond_24

    move-object/from16 v61, v12

    move/from16 v12, v36

    .line 93
    invoke-virtual {v15, v12, v11, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    double-to-float v8, v8

    .line 94
    invoke-virtual {v11, v8, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    const/4 v9, 0x1

    goto :goto_1a

    :cond_24
    move-object/from16 v61, v12

    double-to-float v8, v8

    const/4 v9, 0x1

    .line 95
    invoke-virtual {v15, v8, v11, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    :goto_1a
    double-to-float v2, v2

    .line 96
    invoke-virtual {v15, v2, v13, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    cmpl-double v2, v4, v56

    if-lez v2, :cond_25

    move-wide/from16 v2, v56

    double-to-float v8, v2

    .line 97
    invoke-virtual {v15, v8, v14, v10}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    sub-double/2addr v4, v2

    double-to-float v4, v4

    const/4 v12, 0x0

    .line 98
    invoke-virtual {v14, v4, v12}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    goto :goto_1b

    :cond_25
    move-wide/from16 v2, v56

    double-to-float v4, v4

    .line 99
    invoke-virtual {v15, v4, v14, v9}, Landroid/graphics/PathMeasure;->getMatrix(FLandroid/graphics/Matrix;I)Z

    .line 100
    :goto_1b
    invoke-virtual {v11, v1}, Landroid/graphics/Matrix;->getValues([F)V

    .line 101
    invoke-virtual {v14, v0}, Landroid/graphics/Matrix;->getValues([F)V

    const/4 v5, 0x2

    .line 102
    aget v4, v1, v5

    float-to-double v8, v4

    const/4 v4, 0x5

    .line 103
    aget v10, v1, v4

    move v12, v4

    move/from16 p1, v5

    float-to-double v4, v10

    .line 104
    aget v10, v0, p1

    move/from16 v57, v12

    move-object/from16 v56, v13

    float-to-double v12, v10

    .line 105
    aget v10, v0, v57

    move-object/from16 v62, v0

    move-object/from16 v57, v1

    float-to-double v0, v10

    sub-double/2addr v12, v8

    sub-double/2addr v0, v4

    .line 106
    invoke-static {v0, v1, v12, v13}, Ljava/lang/Math;->atan2(DD)D

    move-result-wide v0

    const-wide v4, 0x404ca5dc1a63c1f8L    # 57.29577951308232

    mul-double/2addr v0, v4

    mul-double v0, v0, v44

    double-to-float v0, v0

    move-object/from16 v10, v56

    .line 107
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    :goto_1c
    neg-double v0, v6

    double-to-float v0, v0

    add-double v4, v63, v31

    double-to-float v1, v4

    .line 108
    invoke-virtual {v10, v0, v1}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    move-wide/from16 v4, v54

    double-to-float v0, v4

    move/from16 v1, v53

    int-to-float v6, v1

    .line 109
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->preScale(FF)Z

    move-wide/from16 v6, v37

    double-to-float v0, v6

    const/4 v12, 0x0

    .line 110
    invoke-virtual {v10, v12, v0}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    :goto_1d
    move-wide/from16 v6, v58

    goto :goto_1e

    :cond_26
    move-object/from16 v62, v0

    move/from16 v39, v4

    move-wide/from16 v58, v5

    move-object/from16 v40, v10

    move-object/from16 v61, v12

    move-object v10, v13

    move/from16 v12, v36

    move-wide/from16 v4, v54

    const/16 p1, 0x2

    move-wide v6, v2

    move-wide/from16 v2, v56

    move-object/from16 v57, v1

    move/from16 v1, v53

    double-to-float v0, v8

    add-double v6, v6, v63

    add-double v6, v6, v31

    double-to-float v6, v6

    .line 111
    invoke-virtual {v10, v0, v6}, Landroid/graphics/Matrix;->setTranslate(FF)V

    goto :goto_1d

    :goto_1e
    double-to-float v0, v6

    .line 112
    invoke-virtual {v10, v0}, Landroid/graphics/Matrix;->preRotate(F)Z

    if-eqz v34, :cond_27

    .line 113
    new-instance v6, Landroid/graphics/Path;

    invoke-direct {v6}, Landroid/graphics/Path;-><init>()V

    move-wide v7, v2

    .line 114
    invoke-virtual/range {v65 .. v65}, Ljava/lang/String;->length()I

    move-result v3

    move-wide/from16 v54, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-wide/from16 v66, v7

    move-object/from16 v8, v57

    move-wide/from16 v56, v66

    move-object/from16 v7, p0

    move/from16 v9, p1

    move-object/from16 v0, p2

    move/from16 v53, v1

    move-object/from16 v1, v65

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Paint;->getTextPath(Ljava/lang/String;IIFFLandroid/graphics/Path;)V

    move-object/from16 v2, v61

    goto :goto_1f

    :cond_27
    move-object/from16 v7, p0

    move/from16 v9, p1

    move-object/from16 v0, p2

    move/from16 v53, v1

    move-wide/from16 v54, v4

    move-object/from16 v8, v57

    move-object/from16 v1, v65

    move-wide/from16 v56, v2

    move/from16 v3, v39

    move-object/from16 v2, v61

    .line 115
    invoke-virtual {v2, v3, v1}, Lcom/horcrux/svg/A;->b(CLjava/lang/String;)Landroid/graphics/Path;

    move-result-object v6

    .line 116
    :goto_1f
    new-instance v3, Landroid/graphics/RectF;

    invoke-direct {v3}, Landroid/graphics/RectF;-><init>()V

    const/4 v4, 0x1

    .line 117
    invoke-virtual {v6, v3, v4}, Landroid/graphics/Path;->computeBounds(Landroid/graphics/RectF;Z)V

    .line 118
    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    cmpl-float v3, v3, v12

    if-nez v3, :cond_28

    .line 119
    invoke-virtual/range {p3 .. p3}, Landroid/graphics/Canvas;->save()I

    move-object/from16 v3, p3

    .line 120
    invoke-virtual {v3, v10}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 121
    iget-object v5, v7, Lcom/horcrux/svg/b0;->z:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 122
    iget-object v5, v7, Lcom/horcrux/svg/b0;->A:Ljava/util/ArrayList;

    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6, v10}, Landroid/graphics/Matrix;-><init>(Landroid/graphics/Matrix;)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 123
    invoke-virtual {v3, v1, v12, v12, v0}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 124
    invoke-virtual {v3}, Landroid/graphics/Canvas;->restore()V

    move-object/from16 v1, v60

    goto :goto_20

    :cond_28
    move-object/from16 v3, p3

    .line 125
    invoke-virtual {v6, v10}, Landroid/graphics/Path;->transform(Landroid/graphics/Matrix;)V

    move-object/from16 v1, v60

    .line 126
    invoke-virtual {v1, v6}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    :goto_20
    add-int/lit8 v5, v35, 0x1

    move-object v6, v0

    move-object v9, v1

    move-object v12, v2

    move-object v2, v7

    move-object v1, v8

    move-object v13, v10

    move/from16 v8, v33

    move-object/from16 v10, v40

    move-object/from16 v0, v62

    move-object v7, v3

    move v3, v5

    goto/16 :goto_13

    :cond_29
    move-object v7, v2

    goto/16 :goto_1

    :goto_21
    return-object v1

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x669119bb -> :sswitch_2
        0x1be40 -> :sswitch_1
        0x68b6f7b -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_a
        :pswitch_c
        :pswitch_b
    .end packed-switch
.end method

.method private J(Landroid/text/TextPaint;Landroid/text/Layout$Alignment;ZLandroid/text/SpannableString;I)Landroid/text/StaticLayout;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p4}, Landroid/text/SpannableString;->length()I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-static {p4, v0, v1, p1, p5}, Landroid/text/StaticLayout$Builder;->obtain(Ljava/lang/CharSequence;IILandroid/text/TextPaint;I)Landroid/text/StaticLayout$Builder;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setAlignment(Landroid/text/Layout$Alignment;)Landroid/text/StaticLayout$Builder;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 p2, 0x0

    .line 15
    const/high16 p4, 0x3f800000    # 1.0f

    .line 16
    .line 17
    invoke-virtual {p1, p2, p4}, Landroid/text/StaticLayout$Builder;->setLineSpacing(FF)Landroid/text/StaticLayout$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {p1, p3}, Landroid/text/StaticLayout$Builder;->setIncludePad(Z)Landroid/text/StaticLayout$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const/4 p2, 0x1

    .line 26
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setBreakStrategy(I)Landroid/text/StaticLayout$Builder;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1, p2}, Landroid/text/StaticLayout$Builder;->setHyphenationFrequency(I)Landroid/text/StaticLayout$Builder;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/text/StaticLayout$Builder;->build()Landroid/text/StaticLayout;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    return-object p1
.end method

.method private K(Lcom/horcrux/svg/h0;D)D
    .locals 2

    .line 1
    sget-object v0, Lcom/horcrux/svg/b0$a;->a:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x3

    .line 13
    if-eq p1, v0, :cond_0

    .line 14
    .line 15
    const-wide/16 p1, 0x0

    .line 16
    .line 17
    return-wide p1

    .line 18
    :cond_0
    neg-double p1, p2

    .line 19
    return-wide p1

    .line 20
    :cond_1
    neg-double p1, p2

    .line 21
    const-wide/high16 v0, 0x4000000000000000L    # 2.0

    .line 22
    .line 23
    div-double/2addr p1, v0

    .line 24
    return-wide p1
.end method

.method private M()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-class v2, Lcom/horcrux/svg/c0;

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/horcrux/svg/c0;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/horcrux/svg/b0;->y:Lcom/horcrux/svg/c0;

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    instance-of v1, v0, Lcom/horcrux/svg/o0;

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_2
    :goto_1
    return-void
.end method

.method public static N(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    .line 1
    if-eqz p0, :cond_6

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_3

    .line 10
    :cond_0
    new-instance v0, Ljava/text/Bidi;

    .line 11
    .line 12
    const/4 v1, -0x2

    .line 13
    invoke-direct {v0, p0, v1}, Ljava/text/Bidi;-><init>(Ljava/lang/String;I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/text/Bidi;->isLeftToRight()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {v0}, Ljava/text/Bidi;->getRunCount()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    new-array v2, v1, [B

    .line 28
    .line 29
    new-array v3, v1, [Ljava/lang/Integer;

    .line 30
    .line 31
    const/4 v4, 0x0

    .line 32
    move v5, v4

    .line 33
    :goto_0
    if-ge v5, v1, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0, v5}, Ljava/text/Bidi;->getRunLevel(I)I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    int-to-byte v6, v6

    .line 40
    aput-byte v6, v2, v5

    .line 41
    .line 42
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    aput-object v6, v3, v5

    .line 47
    .line 48
    add-int/lit8 v5, v5, 0x1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    invoke-static {v2, v4, v3, v4, v1}, Ljava/text/Bidi;->reorderVisually([BI[Ljava/lang/Object;II)V

    .line 52
    .line 53
    .line 54
    new-instance v5, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 57
    .line 58
    .line 59
    :goto_1
    if-ge v4, v1, :cond_5

    .line 60
    .line 61
    aget-object v6, v3, v4

    .line 62
    .line 63
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunStart(I)I

    .line 68
    .line 69
    .line 70
    move-result v7

    .line 71
    invoke-virtual {v0, v6}, Ljava/text/Bidi;->getRunLimit(I)I

    .line 72
    .line 73
    .line 74
    move-result v8

    .line 75
    aget-byte v6, v2, v6

    .line 76
    .line 77
    and-int/lit8 v6, v6, 0x1

    .line 78
    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    :goto_2
    add-int/lit8 v8, v8, -0x1

    .line 82
    .line 83
    if-lt v8, v7, :cond_4

    .line 84
    .line 85
    invoke-virtual {p0, v8}, Ljava/lang/String;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_3
    invoke-virtual {v5, p0, v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    :cond_6
    :goto_3
    return-object p0
.end method


# virtual methods
.method public L(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/horcrux/svg/b0;->invalidate()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method clearCache()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/o0;->clearCache()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget-object v0, p0, Lcom/horcrux/svg/o0;->l:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-wide v0, v0, Lcom/horcrux/svg/SVGLength;->a:D

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmpl-double v0, v0, v2

    .line 14
    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->fillOpacity:F

    .line 18
    .line 19
    mul-float/2addr v0, p3

    .line 20
    invoke-virtual {p0, p2, v0}, Lcom/horcrux/svg/RenderableView;->setupFillPaint(Landroid/graphics/Paint;F)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/b0;->G(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget v0, p0, Lcom/horcrux/svg/RenderableView;->strokeOpacity:F

    .line 30
    .line 31
    mul-float/2addr p3, v0

    .line 32
    invoke-virtual {p0, p2, p3}, Lcom/horcrux/svg/RenderableView;->setupStrokePaint(Landroid/graphics/Paint;F)Z

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-direct {p0, p1, p2}, Lcom/horcrux/svg/b0;->G(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    return-void

    .line 42
    :cond_2
    iget-object v0, p0, Lcom/horcrux/svg/b0;->z:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-lez v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-direct {p0, p2, v1}, Lcom/horcrux/svg/b0;->F(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x0

    .line 62
    :goto_0
    if-ge v1, v0, :cond_3

    .line 63
    .line 64
    iget-object v2, p0, Lcom/horcrux/svg/b0;->z:Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    iget-object v3, p0, Lcom/horcrux/svg/b0;->A:Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    check-cast v3, Landroid/graphics/Matrix;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 84
    .line 85
    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-virtual {p1, v2, v3, v3, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 91
    .line 92
    .line 93
    add-int/lit8 v1, v1, 0x1

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->d(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 97
    .line 98
    .line 99
    return-void

    .line 100
    :cond_4
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/VirtualView;->clip(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0, p1, p2, p3}, Lcom/horcrux/svg/B;->c(Landroid/graphics/Canvas;Landroid/graphics/Paint;F)V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lcom/horcrux/svg/o0;->p(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 15
    .line 16
    return-object p1

    .line 17
    :cond_1
    invoke-direct {p0}, Lcom/horcrux/svg/b0;->M()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/horcrux/svg/o0;->i()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0}, Lcom/horcrux/svg/b0;->N(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p0, v0, p2, p1}, Lcom/horcrux/svg/b0;->I(Ljava/lang/String;Landroid/graphics/Paint;Landroid/graphics/Canvas;)Landroid/graphics/Path;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 34
    .line 35
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->h()V

    .line 36
    .line 37
    .line 38
    iget-object p1, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 39
    .line 40
    return-object p1
.end method

.method hitTest([F)I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Lcom/horcrux/svg/B;->hitTest([F)I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/VirtualView;->mPath:Landroid/graphics/Path;

    .line 11
    .line 12
    const/4 v1, -0x1

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    iget-boolean v0, p0, Lcom/horcrux/svg/VirtualView;->mInvertible:Z

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v0, 0x2

    .line 21
    new-array v0, v0, [F

    .line 22
    .line 23
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mInvMatrix:Landroid/graphics/Matrix;

    .line 24
    .line 25
    invoke-virtual {v2, v0, p1}, Landroid/graphics/Matrix;->mapPoints([F[F)V

    .line 26
    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    aget p1, v0, p1

    .line 30
    .line 31
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    const/4 v2, 0x1

    .line 36
    aget v0, v0, v2

    .line 37
    .line 38
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-virtual {p0}, Lcom/horcrux/svg/RenderableView;->initBounds()V

    .line 43
    .line 44
    .line 45
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mRegion:Landroid/graphics/Region;

    .line 46
    .line 47
    if-eqz v2, :cond_2

    .line 48
    .line 49
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_3

    .line 54
    .line 55
    :cond_2
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mStrokeRegion:Landroid/graphics/Region;

    .line 56
    .line 57
    if-eqz v2, :cond_5

    .line 58
    .line 59
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->getClipPath()Landroid/graphics/Path;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    if-eqz v2, :cond_4

    .line 71
    .line 72
    iget-object v2, p0, Lcom/horcrux/svg/VirtualView;->mClipRegion:Landroid/graphics/Region;

    .line 73
    .line 74
    invoke-virtual {v2, p1, v0}, Landroid/graphics/Region;->contains(II)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-nez p1, :cond_4

    .line 79
    .line 80
    return v1

    .line 81
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    return p1

    .line 86
    :cond_5
    :goto_0
    return v1
.end method

.method public invalidate()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/horcrux/svg/b0;->w:Landroid/graphics/Path;

    .line 3
    .line 4
    invoke-super {p0}, Lcom/horcrux/svg/o0;->invalidate()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method q(Landroid/graphics/Paint;)D
    .locals 5

    .line 1
    iget-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lcom/horcrux/svg/b0;->x:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v1, 0x0

    .line 15
    .line 16
    if-nez v0, :cond_3

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ge v0, v3, :cond_2

    .line 24
    .line 25
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    instance-of v4, v3, Lcom/horcrux/svg/o0;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    check-cast v3, Lcom/horcrux/svg/o0;

    .line 34
    .line 35
    invoke-virtual {v3, p1}, Lcom/horcrux/svg/o0;->q(Landroid/graphics/Paint;)D

    .line 36
    .line 37
    .line 38
    move-result-wide v3

    .line 39
    add-double/2addr v1, v3

    .line 40
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_2
    iput-wide v1, p0, Lcom/horcrux/svg/o0;->v:D

    .line 44
    .line 45
    return-wide v1

    .line 46
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-nez v3, :cond_4

    .line 51
    .line 52
    iput-wide v1, p0, Lcom/horcrux/svg/o0;->v:D

    .line 53
    .line 54
    return-wide v1

    .line 55
    :cond_4
    invoke-virtual {p0}, Lcom/horcrux/svg/B;->g()Lcom/horcrux/svg/z;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {v1}, Lcom/horcrux/svg/z;->b()Lcom/horcrux/svg/x;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/b0;->F(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1, v1}, Lcom/horcrux/svg/b0;->E(Landroid/graphics/Paint;Lcom/horcrux/svg/x;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    float-to-double v0, p1

    .line 74
    iput-wide v0, p0, Lcom/horcrux/svg/o0;->v:D

    .line 75
    .line 76
    return-wide v0
.end method
