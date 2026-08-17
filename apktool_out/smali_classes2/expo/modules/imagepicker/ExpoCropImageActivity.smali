.class public final Lexpo/modules/imagepicker/ExpoCropImageActivity;
.super Lcom/canhub/cropper/CropImageActivity;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0012\u001a\u0010\u0012\u000c\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00082\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u001b\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lexpo/modules/imagepicker/ExpoCropImageActivity;",
        "Lcom/canhub/cropper/CropImageActivity;",
        "<init>",
        "()V",
        "",
        "isNight",
        "Lcom/canhub/cropper/CropImageOptions;",
        "options",
        "Li7/B;",
        "applyCustomization",
        "(ZLcom/canhub/cropper/CropImageOptions;)V",
        "getCropOptions",
        "()Lcom/canhub/cropper/CropImageOptions;",
        "Li7/o;",
        "",
        "kotlin.jvm.PlatformType",
        "invokeSetCustomizations-d1pmJ48",
        "()Ljava/lang/Object;",
        "invokeSetCustomizations",
        "Landroid/view/Menu;",
        "menu",
        "tintAllMenuItems",
        "(Landroid/view/Menu;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onDestroy",
        "onCreateOptionsMenu",
        "(Landroid/view/Menu;)Z",
        "onPrepareOptionsMenu",
        "Lcom/canhub/cropper/CropImageView;",
        "cropImageView",
        "setCropImageView",
        "(Lcom/canhub/cropper/CropImageView;)V",
        "",
        "currentIconColor",
        "I",
        "cropImageViewRef",
        "Lcom/canhub/cropper/CropImageView;",
        "expo-image-picker_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private cropImageViewRef:Lcom/canhub/cropper/CropImageView;

.field private currentIconColor:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/canhub/cropper/CropImageActivity;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, -0x1000000

    .line 5
    .line 6
    iput v0, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic Z(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->setCropImageView$lambda$3(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic a0(Landroid/view/View;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->applyCustomization$lambda$8$lambda$7(Landroid/view/View;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final applyCustomization(ZLcom/canhub/cropper/CropImageOptions;)V
    .locals 11

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    move v2, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v2, v1

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    move v0, v1

    .line 12
    :cond_1
    sget-object v3, Lexpo/modules/imagepicker/ExpoCropImageUtils;->INSTANCE:Lexpo/modules/imagepicker/ExpoCropImageUtils;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    const-string v5, "getTheme(...)"

    .line 19
    .line 20
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sget v6, Lexpo/modules/imagepicker/R$attr;->expoCropBackButtonIconColor:I

    .line 24
    .line 25
    invoke-virtual {v3, v4, v6}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const-string v6, "getResources(...)"

    .line 30
    .line 31
    if-nez v4, :cond_2

    .line 32
    .line 33
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget v7, Lexpo/modules/imagepicker/R$color;->expoCropBackButtonIconColor:I

    .line 41
    .line 42
    invoke-virtual {v3, v4, v7}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_2
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    invoke-static {v7, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    sget v8, Lexpo/modules/imagepicker/R$attr;->expoCropBackgroundColor:I

    .line 54
    .line 55
    invoke-virtual {v3, v7, v8}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    if-nez v7, :cond_3

    .line 60
    .line 61
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 62
    .line 63
    .line 64
    move-result-object v7

    .line 65
    invoke-static {v7, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    sget v8, Lexpo/modules/imagepicker/R$color;->expoCropBackgroundColor:I

    .line 69
    .line 70
    invoke-virtual {v3, v7, v8}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    :cond_3
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    invoke-static {v8, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget v9, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarActionTextColor:I

    .line 82
    .line 83
    invoke-virtual {v3, v8, v9}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    if-nez v8, :cond_4

    .line 88
    .line 89
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object v8

    .line 93
    invoke-static {v8, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    sget v9, Lexpo/modules/imagepicker/R$color;->expoCropToolbarActionTextColor:I

    .line 97
    .line 98
    invoke-virtual {v3, v8, v9}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    :cond_4
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    invoke-static {v9, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    sget v10, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarColor:I

    .line 110
    .line 111
    invoke-virtual {v3, v9, v10}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    .line 112
    .line 113
    .line 114
    move-result-object v9

    .line 115
    if-nez v9, :cond_5

    .line 116
    .line 117
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    invoke-static {v9, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    sget v10, Lexpo/modules/imagepicker/R$color;->expoCropToolbarColor:I

    .line 125
    .line 126
    invoke-virtual {v3, v9, v10}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    :cond_5
    invoke-virtual {p0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-static {v10, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    sget v5, Lexpo/modules/imagepicker/R$attr;->expoCropToolbarIconColor:I

    .line 138
    .line 139
    invoke-virtual {v3, v10, v5}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getThemeColor(Landroid/content/res/Resources$Theme;I)Ljava/lang/Integer;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    if-nez v5, :cond_6

    .line 144
    .line 145
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    sget v6, Lexpo/modules/imagepicker/R$color;->expoCropToolbarIconColor:I

    .line 153
    .line 154
    invoke-virtual {v3, v5, v6}, Lexpo/modules/imagepicker/ExpoCropImageUtils;->getColorResource(Landroid/content/res/Resources;I)Ljava/lang/Integer;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    :cond_6
    if-eqz v7, :cond_7

    .line 159
    .line 160
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v3

    .line 164
    goto :goto_1

    .line 165
    :cond_7
    move v3, v2

    .line 166
    :goto_1
    if-eqz v9, :cond_8

    .line 167
    .line 168
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    :cond_8
    if-eqz v5, :cond_9

    .line 173
    .line 174
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 175
    .line 176
    .line 177
    move-result v5

    .line 178
    goto :goto_2

    .line 179
    :cond_9
    move v5, v0

    .line 180
    :goto_2
    iput v5, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    .line 181
    .line 182
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getSupportActionBar()Landroidx/appcompat/app/a;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    if-eqz v6, :cond_a

    .line 187
    .line 188
    const/4 v7, 0x0

    .line 189
    invoke-virtual {v6, v7}, Landroidx/appcompat/app/a;->t(F)V

    .line 190
    .line 191
    .line 192
    :cond_a
    iput v3, p2, Lcom/canhub/cropper/CropImageOptions;->t0:I

    .line 193
    .line 194
    iput v5, p2, Lcom/canhub/cropper/CropImageOptions;->T:I

    .line 195
    .line 196
    if-nez v8, :cond_b

    .line 197
    .line 198
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v8

    .line 202
    :cond_b
    iput-object v8, p2, Lcom/canhub/cropper/CropImageOptions;->U:Ljava/lang/Integer;

    .line 203
    .line 204
    if-nez v4, :cond_c

    .line 205
    .line 206
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    :cond_c
    iput-object v4, p2, Lcom/canhub/cropper/CropImageOptions;->w0:Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v0, p2, Lcom/canhub/cropper/CropImageOptions;->u0:Ljava/lang/Integer;

    .line 217
    .line 218
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iput-object v0, p2, Lcom/canhub/cropper/CropImageOptions;->v0:Ljava/lang/Integer;

    .line 223
    .line 224
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 225
    .line 226
    .line 227
    move-result-object p2

    .line 228
    new-instance v0, Landroid/view/View;

    .line 229
    .line 230
    invoke-virtual {p2}, Landroid/view/Window;->getContext()Landroid/content/Context;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-direct {v0, v4}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    .line 238
    .line 239
    .line 240
    invoke-static {p2}, Landroidx/core/view/p0;->a(Landroid/view/Window;)V

    .line 241
    .line 242
    .line 243
    new-instance v2, Landroidx/core/view/l1;

    .line 244
    .line 245
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    invoke-direct {v2, p2, v4}, Landroidx/core/view/l1;-><init>(Landroid/view/Window;Landroid/view/View;)V

    .line 250
    .line 251
    .line 252
    xor-int/lit8 v4, p1, 0x1

    .line 253
    .line 254
    invoke-virtual {v2, v4}, Landroidx/core/view/l1;->e(Z)V

    .line 255
    .line 256
    .line 257
    xor-int/lit8 p1, p1, 0x1

    .line 258
    .line 259
    invoke-virtual {v2, p1}, Landroidx/core/view/l1;->d(Z)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    invoke-virtual {p1, v3}, Landroid/view/View;->setBackgroundColor(I)V

    .line 267
    .line 268
    .line 269
    new-instance p1, Landroid/view/ViewGroup$LayoutParams;

    .line 270
    .line 271
    const/4 v2, 0x0

    .line 272
    invoke-direct {p1, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p2, v0, p1}, Landroid/view/Window;->addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    new-instance p2, Lexpo/modules/imagepicker/a;

    .line 283
    .line 284
    invoke-direct {p2, v0}, Lexpo/modules/imagepicker/a;-><init>(Landroid/view/View;)V

    .line 285
    .line 286
    .line 287
    invoke-static {p1, p2}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 288
    .line 289
    .line 290
    return-void
.end method

.method private static final applyCustomization$lambda$8$lambda$7(Landroid/view/View;Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 1

    .line 1
    const-string v0, "<unused var>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "insets"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/L0$p;->f()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    or-int/2addr p1, v0

    .line 20
    invoke-virtual {p2, p1}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const-string v0, "getInsets(...)"

    .line 25
    .line 26
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget p1, p1, Lx0/e;->b:I

    .line 36
    .line 37
    iput p1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 44
    .line 45
    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"

    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p0
.end method

.method private final getCropOptions()Lcom/canhub/cropper/CropImageOptions;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, Li7/o;->h:Li7/o$a;

    .line 3
    .line 4
    const-class v1, Lcom/canhub/cropper/CropImageActivity;

    .line 5
    .line 6
    const-string v2, "cropImageOptions"

    .line 7
    .line 8
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    instance-of v2, v1, Lcom/canhub/cropper/CropImageOptions;

    .line 21
    .line 22
    if-eqz v2, :cond_0

    .line 23
    .line 24
    check-cast v1, Lcom/canhub/cropper/CropImageOptions;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    move-object v1, v0

    .line 30
    :goto_0
    invoke-static {v1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_2

    .line 35
    :goto_1
    sget-object v2, Li7/o;->h:Li7/o$a;

    .line 36
    .line 37
    invoke-static {v1}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-static {v1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_2
    invoke-static {v1}, Li7/o;->f(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_1
    move-object v0, v1

    .line 53
    :goto_3
    check-cast v0, Lcom/canhub/cropper/CropImageOptions;

    .line 54
    .line 55
    return-object v0
.end method

.method private final invokeSetCustomizations-d1pmJ48()Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 2
    .line 3
    const-class v0, Lcom/canhub/cropper/CropImageActivity;

    .line 4
    .line 5
    const-string v1, "U"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    return-object v0

    .line 25
    :catchall_0
    move-exception v0

    .line 26
    sget-object v1, Li7/o;->h:Li7/o$a;

    .line 27
    .line 28
    invoke-static {v0}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    return-object v0
.end method

.method private static final setCropImageView$lambda$3(Landroid/view/View;Landroidx/core/view/L0;)Landroidx/core/view/L0;
    .locals 5

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "insets"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroidx/core/view/L0$p;->g()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-static {}, Landroidx/core/view/L0$p;->a()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    or-int/2addr v0, v1

    .line 20
    invoke-virtual {p1, v0}, Landroidx/core/view/L0;->f(I)Lx0/e;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "getInsets(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    if-eqz v1, :cond_0

    .line 34
    .line 35
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 36
    .line 37
    iget v2, v0, Lx0/e;->a:I

    .line 38
    .line 39
    iget v3, v0, Lx0/e;->b:I

    .line 40
    .line 41
    iget v4, v0, Lx0/e;->c:I

    .line 42
    .line 43
    iget v0, v0, Lx0/e;->d:I

    .line 44
    .line 45
    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    return-object p1

    .line 52
    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    .line 53
    .line 54
    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    .line 55
    .line 56
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p0
.end method

.method private final tintAllMenuItems(Landroid/view/Menu;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Landroid/view/Menu;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-interface {p1, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {v2}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget v3, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->currentIconColor:I

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    .line 29
    .line 30
    .line 31
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-void
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->getCropOptions()Lcom/canhub/cropper/CropImageOptions;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v0, v0, Landroid/content/res/Configuration;->uiMode:I

    .line 19
    .line 20
    and-int/lit8 v0, v0, 0x30

    .line 21
    .line 22
    const/16 v1, 0x20

    .line 23
    .line 24
    if-ne v0, v1, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x0

    .line 29
    :goto_0
    invoke-direct {p0, v0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->applyCustomization(ZLcom/canhub/cropper/CropImageOptions;)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->invokeSetCustomizations-d1pmJ48()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/appcompat/app/d;->invalidateOptionsMenu()V

    .line 36
    .line 37
    .line 38
    :cond_1
    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->onCreateOptionsMenu(Landroid/view/Menu;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->tintAllMenuItems(Landroid/view/Menu;)V

    .line 11
    .line 12
    .line 13
    return v0
.end method

.method protected onDestroy()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->cropImageViewRef:Lcom/canhub/cropper/CropImageView;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-static {v0, v1}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object v1, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->cropImageViewRef:Lcom/canhub/cropper/CropImageView;

    .line 21
    .line 22
    invoke-super {p0}, Landroidx/appcompat/app/d;->onDestroy()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)Z
    .locals 1

    .line 1
    const-string v0, "menu"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/app/Activity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-direct {p0, p1}, Lexpo/modules/imagepicker/ExpoCropImageActivity;->tintAllMenuItems(Landroid/view/Menu;)V

    .line 11
    .line 12
    .line 13
    return v0
.end method

.method public setCropImageView(Lcom/canhub/cropper/CropImageView;)V
    .locals 1

    .line 1
    const-string v0, "cropImageView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lcom/canhub/cropper/CropImageActivity;->setCropImageView(Lcom/canhub/cropper/CropImageView;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/imagepicker/ExpoCropImageActivity;->cropImageViewRef:Lcom/canhub/cropper/CropImageView;

    .line 10
    .line 11
    new-instance v0, Lexpo/modules/imagepicker/b;

    .line 12
    .line 13
    invoke-direct {v0}, Lexpo/modules/imagepicker/b;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {p1, v0}, Landroidx/core/view/a0;->w0(Landroid/view/View;Landroidx/core/view/I;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
