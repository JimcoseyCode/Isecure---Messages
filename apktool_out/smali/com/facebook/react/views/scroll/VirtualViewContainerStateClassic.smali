.class public final Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;
.super Lcom/facebook/react/views/scroll/VirtualViewContainerState;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001f\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nR \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000b8\u0014X\u0094\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;",
        "Lcom/facebook/react/views/scroll/VirtualViewContainerState;",
        "Landroid/view/ViewGroup;",
        "scrollView",
        "<init>",
        "(Landroid/view/ViewGroup;)V",
        "Lcom/facebook/react/views/scroll/VirtualView;",
        "virtualView",
        "Li7/B;",
        "updateModes",
        "(Lcom/facebook/react/views/scroll/VirtualView;)V",
        "",
        "virtualViews",
        "Ljava/util/Collection;",
        "getVirtualViews",
        "()Ljava/util/Collection;",
        "ReactAndroid_release"
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
.field private final virtualViews:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lcom/facebook/react/views/scroll/VirtualView;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "scrollView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;->virtualViews:Ljava/util/Collection;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method protected getVirtualViews()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Lcom/facebook/react/views/scroll/VirtualView;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;->virtualViews:Ljava/util/Collection;

    .line 2
    .line 3
    return-object v0
.end method

.method protected updateModes(Lcom/facebook/react/views/scroll/VirtualView;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getScrollView()Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/View;->getDrawingRect(Landroid/graphics/Rect;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v1, "VirtualViewContainerStateClassic:"

    .line 21
    .line 22
    const-string v2, "updateModes"

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_9

    .line 31
    .line 32
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_9

    .line 37
    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string v0, "scrollView visibleRect is empty"

    .line 54
    .line 55
    invoke-static {p1, v0}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    neg-int v3, v3

    .line 83
    int-to-double v3, v3

    .line 84
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRatio()D

    .line 85
    .line 86
    .line 87
    move-result-wide v5

    .line 88
    mul-double/2addr v3, v5

    .line 89
    double-to-int v3, v3

    .line 90
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    neg-int v4, v4

    .line 99
    int-to-double v4, v4

    .line 100
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRatio()D

    .line 101
    .line 102
    .line 103
    move-result-wide v6

    .line 104
    mul-double/2addr v4, v6

    .line 105
    double-to-int v4, v4

    .line 106
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRatio()D

    .line 110
    .line 111
    .line 112
    move-result-wide v3

    .line 113
    const-wide/16 v5, 0x0

    .line 114
    .line 115
    cmpl-double v0, v3, v5

    .line 116
    .line 117
    if-lez v0, :cond_1

    .line 118
    .line 119
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRect()Landroid/graphics/Rect;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 124
    .line 125
    .line 126
    move-result-object v3

    .line 127
    invoke-virtual {v0, v3}, Landroid/graphics/Rect;->set(Landroid/graphics/Rect;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRect()Landroid/graphics/Rect;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 139
    .line 140
    .line 141
    move-result v3

    .line 142
    neg-int v3, v3

    .line 143
    int-to-double v3, v3

    .line 144
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRatio()D

    .line 145
    .line 146
    .line 147
    move-result-wide v7

    .line 148
    mul-double/2addr v3, v7

    .line 149
    double-to-int v3, v3

    .line 150
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v4}, Landroid/graphics/Rect;->height()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    neg-int v4, v4

    .line 159
    int-to-double v7, v4

    .line 160
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRatio()D

    .line 161
    .line 162
    .line 163
    move-result-wide v9

    .line 164
    mul-double/2addr v7, v9

    .line 165
    double-to-int v4, v7

    .line 166
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Rect;->inset(II)V

    .line 167
    .line 168
    .line 169
    :cond_1
    if-eqz p1, :cond_2

    .line 170
    .line 171
    invoke-static {p1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    goto :goto_0

    .line 176
    :cond_2
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerStateClassic;->getVirtualViews()Ljava/util/Collection;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-static {p1}, Lj7/q;->S0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    :goto_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    :cond_3
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_9

    .line 193
    .line 194
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    check-cast v0, Lcom/facebook/react/views/scroll/VirtualView;

    .line 199
    .line 200
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/VirtualView;->getContainerRelativeRect()Landroid/graphics/Rect;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    sget-object v4, Lcom/facebook/react/views/virtual/VirtualViewMode;->Hidden:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 205
    .line 206
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getEmptyRect()Landroid/graphics/Rect;

    .line 207
    .line 208
    .line 209
    move-result-object v7

    .line 210
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 211
    .line 212
    .line 213
    move-result-object v8

    .line 214
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 215
    .line 216
    .line 217
    move-result v8

    .line 218
    if-eqz v8, :cond_6

    .line 219
    .line 220
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getVisibleRect()Landroid/graphics/Rect;

    .line 221
    .line 222
    .line 223
    move-result-object v7

    .line 224
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getOnWindowFocusChangeListener()Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    if-eqz v4, :cond_5

    .line 229
    .line 230
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getScrollView()Landroid/view/ViewGroup;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v4}, Landroid/view/View;->hasWindowFocus()Z

    .line 235
    .line 236
    .line 237
    move-result v4

    .line 238
    if-eqz v4, :cond_4

    .line 239
    .line 240
    sget-object v4, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 241
    .line 242
    goto :goto_2

    .line 243
    :cond_4
    sget-object v4, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_5
    sget-object v4, Lcom/facebook/react/views/virtual/VirtualViewMode;->Visible:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_6
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 250
    .line 251
    .line 252
    move-result-object v8

    .line 253
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 254
    .line 255
    .line 256
    move-result v8

    .line 257
    if-eqz v8, :cond_7

    .line 258
    .line 259
    sget-object v4, Lcom/facebook/react/views/virtual/VirtualViewMode;->Prerender:Lcom/facebook/react/views/virtual/VirtualViewMode;

    .line 260
    .line 261
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getPrerenderRect()Landroid/graphics/Rect;

    .line 262
    .line 263
    .line 264
    move-result-object v7

    .line 265
    goto :goto_2

    .line 266
    :cond_7
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRatio()D

    .line 267
    .line 268
    .line 269
    move-result-wide v8

    .line 270
    cmpl-double v8, v8, v5

    .line 271
    .line 272
    if-lez v8, :cond_8

    .line 273
    .line 274
    invoke-virtual {p0}, Lcom/facebook/react/views/scroll/VirtualViewContainerState;->getHysteresisRect()Landroid/graphics/Rect;

    .line 275
    .line 276
    .line 277
    move-result-object v8

    .line 278
    invoke-static {v3, v8}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->rectsOverlap(Landroid/graphics/Rect;Landroid/graphics/Rect;)Z

    .line 279
    .line 280
    .line 281
    move-result v8

    .line 282
    if-eqz v8, :cond_8

    .line 283
    .line 284
    const/4 v4, 0x0

    .line 285
    :cond_8
    :goto_2
    if-eqz v4, :cond_3

    .line 286
    .line 287
    invoke-interface {v0, v4, v7}, Lcom/facebook/react/views/scroll/VirtualView;->onModeChange(Lcom/facebook/react/views/virtual/VirtualViewMode;Landroid/graphics/Rect;)V

    .line 288
    .line 289
    .line 290
    invoke-static {}, Lcom/facebook/react/views/scroll/VirtualViewContainerKt;->getIS_DEBUG_BUILD()Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-eqz v8, :cond_3

    .line 295
    .line 296
    invoke-static {}, Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlags;->enableVirtualViewDebugFeatures()Z

    .line 297
    .line 298
    .line 299
    move-result v8

    .line 300
    if-eqz v8, :cond_3

    .line 301
    .line 302
    new-instance v8, Ljava/lang/StringBuilder;

    .line 303
    .line 304
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v8, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 308
    .line 309
    .line 310
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v8

    .line 317
    invoke-interface {v0}, Lcom/facebook/react/views/scroll/VirtualView;->getVirtualViewID()Ljava/lang/String;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    new-instance v9, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 324
    .line 325
    .line 326
    const-string v10, "virtualView="

    .line 327
    .line 328
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 329
    .line 330
    .line 331
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 332
    .line 333
    .line 334
    const-string v0, " mode="

    .line 335
    .line 336
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    const-string v0, "  rect="

    .line 343
    .line 344
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 348
    .line 349
    .line 350
    const-string v0, " thresholdRect="

    .line 351
    .line 352
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 356
    .line 357
    .line 358
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v0

    .line 362
    invoke-static {v8, v0}, Ld2/a;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    goto/16 :goto_1

    .line 366
    .line 367
    :cond_9
    return-void
.end method
