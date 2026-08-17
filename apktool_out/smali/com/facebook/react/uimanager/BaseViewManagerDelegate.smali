.class public abstract Lcom/facebook/react/uimanager/BaseViewManagerDelegate;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/react/uimanager/ViewManagerDelegate;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        "U:",
        "Lcom/facebook/react/uimanager/BaseViewManager<",
        "TT;+",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        ">;>",
        "Ljava/lang/Object;",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000*\u0008\u0008\u0000\u0010\u0002*\u00020\u0001*\u0016\u0008\u0001\u0010\u0005*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0008\u0001\u0012\u00020\u00040\u00032\u0008\u0012\u0004\u0012\u00028\u00000\u0006B\u000f\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\'\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00028\u00018\u0004X\u0085\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/BaseViewManagerDelegate;",
        "Landroid/view/View;",
        "T",
        "Lcom/facebook/react/uimanager/BaseViewManager;",
        "Lcom/facebook/react/uimanager/LayoutShadowNode;",
        "U",
        "Lcom/facebook/react/uimanager/ViewManagerDelegate;",
        "mViewManager",
        "<init>",
        "(Lcom/facebook/react/uimanager/BaseViewManager;)V",
        "view",
        "",
        "propName",
        "",
        "value",
        "Li7/B;",
        "setProperty",
        "(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V",
        "commandName",
        "Lcom/facebook/react/bridge/ReadableArray;",
        "args",
        "receiveCommand",
        "(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V",
        "Lcom/facebook/react/uimanager/BaseViewManager;",
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
.field protected final mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TU;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/facebook/react/uimanager/BaseViewManager;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TU;)V"
        }
    .end annotation

    .line 1
    const-string v0, "mViewManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic kotlinCompat$receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public bridge synthetic kotlinCompat$setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public receiveCommand(Landroid/view/View;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Lcom/facebook/react/bridge/ReadableArray;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "commandName"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "args"

    .line 12
    .line 13
    invoke-static {p3, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setProperty(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "view"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "propName"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const-string v1, "getContext(...)"

    .line 16
    .line 17
    const/high16 v2, 0x3f800000    # 1.0f

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    const/4 v4, 0x0

    .line 21
    sparse-switch v0, :sswitch_data_0

    .line 22
    .line 23
    .line 24
    goto/16 :goto_7

    .line 25
    .line 26
    :sswitch_0
    const-string v0, "nativeID"

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    goto/16 :goto_7

    .line 35
    .line 36
    :cond_0
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 37
    .line 38
    check-cast p3, Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setNativeId(Landroid/view/View;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :sswitch_1
    const-string v0, "accessibilityCollectionItem"

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-nez p2, :cond_1

    .line 51
    .line 52
    goto/16 :goto_7

    .line 53
    .line 54
    :cond_1
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 55
    .line 56
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 57
    .line 58
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityCollectionItem(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :sswitch_2
    const-string v0, "accessibilityLabelledBy"

    .line 63
    .line 64
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p2

    .line 68
    if-nez p2, :cond_2

    .line 69
    .line 70
    goto/16 :goto_7

    .line 71
    .line 72
    :cond_2
    new-instance p2, Lcom/facebook/react/bridge/DynamicFromObject;

    .line 73
    .line 74
    invoke-direct {p2, p3}, Lcom/facebook/react/bridge/DynamicFromObject;-><init>(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    iget-object p3, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 78
    .line 79
    invoke-virtual {p3, p1, p2}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityLabelledBy(Landroid/view/View;Lcom/facebook/react/bridge/Dynamic;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :sswitch_3
    const-string v0, "accessibilityCollection"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result p2

    .line 89
    if-nez p2, :cond_3

    .line 90
    .line 91
    goto/16 :goto_7

    .line 92
    .line 93
    :cond_3
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 94
    .line 95
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 96
    .line 97
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityCollection(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :sswitch_4
    const-string v0, "accessibilityActions"

    .line 102
    .line 103
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p2

    .line 107
    if-nez p2, :cond_4

    .line 108
    .line 109
    goto/16 :goto_7

    .line 110
    .line 111
    :cond_4
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 112
    .line 113
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 114
    .line 115
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityActions(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :sswitch_5
    const-string v0, "outlineOffset"

    .line 120
    .line 121
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    if-nez p2, :cond_5

    .line 126
    .line 127
    goto/16 :goto_7

    .line 128
    .line 129
    :cond_5
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 130
    .line 131
    check-cast p3, Ljava/lang/Double;

    .line 132
    .line 133
    if-eqz p3, :cond_6

    .line 134
    .line 135
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 136
    .line 137
    .line 138
    move-result-wide v0

    .line 139
    double-to-float p3, v0

    .line 140
    goto :goto_0

    .line 141
    :cond_6
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 142
    .line 143
    :goto_0
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOutlineOffset(Landroid/view/View;F)V

    .line 144
    .line 145
    .line 146
    return-void

    .line 147
    :sswitch_6
    const-string v0, "borderRadius"

    .line 148
    .line 149
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    if-nez p2, :cond_7

    .line 154
    .line 155
    goto/16 :goto_7

    .line 156
    .line 157
    :cond_7
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 158
    .line 159
    check-cast p3, Ljava/lang/Double;

    .line 160
    .line 161
    if-eqz p3, :cond_8

    .line 162
    .line 163
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 164
    .line 165
    .line 166
    move-result-wide v0

    .line 167
    double-to-float p3, v0

    .line 168
    goto :goto_1

    .line 169
    :cond_8
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 170
    .line 171
    :goto_1
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBorderRadius(Landroid/view/View;F)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :sswitch_7
    const-string v0, "backgroundColor"

    .line 176
    .line 177
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result p2

    .line 181
    if-nez p2, :cond_9

    .line 182
    .line 183
    goto/16 :goto_7

    .line 184
    .line 185
    :cond_9
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 186
    .line 187
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-static {p3, v0, v4}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;I)I

    .line 195
    .line 196
    .line 197
    move-result p3

    .line 198
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBackgroundColor(Landroid/view/View;I)V

    .line 199
    .line 200
    .line 201
    return-void

    .line 202
    :sswitch_8
    const-string v0, "onPointerOver"

    .line 203
    .line 204
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    if-nez p2, :cond_a

    .line 209
    .line 210
    goto/16 :goto_7

    .line 211
    .line 212
    :cond_a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 213
    .line 214
    check-cast p3, Ljava/lang/Boolean;

    .line 215
    .line 216
    if-eqz p3, :cond_b

    .line 217
    .line 218
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 219
    .line 220
    .line 221
    move-result v4

    .line 222
    :cond_b
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerOver(Landroid/view/View;Z)V

    .line 223
    .line 224
    .line 225
    return-void

    .line 226
    :sswitch_9
    const-string v0, "onPointerMove"

    .line 227
    .line 228
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result p2

    .line 232
    if-nez p2, :cond_c

    .line 233
    .line 234
    goto/16 :goto_7

    .line 235
    .line 236
    :cond_c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 237
    .line 238
    check-cast p3, Ljava/lang/Boolean;

    .line 239
    .line 240
    if-eqz p3, :cond_d

    .line 241
    .line 242
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    :cond_d
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerMove(Landroid/view/View;Z)V

    .line 247
    .line 248
    .line 249
    return-void

    .line 250
    :sswitch_a
    const-string v0, "accessibilityValue"

    .line 251
    .line 252
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    move-result p2

    .line 256
    if-nez p2, :cond_e

    .line 257
    .line 258
    goto/16 :goto_7

    .line 259
    .line 260
    :cond_e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 261
    .line 262
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 263
    .line 264
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityValue(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 265
    .line 266
    .line 267
    return-void

    .line 268
    :sswitch_b
    const-string v0, "accessibilityState"

    .line 269
    .line 270
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result p2

    .line 274
    if-nez p2, :cond_f

    .line 275
    .line 276
    goto/16 :goto_7

    .line 277
    .line 278
    :cond_f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 279
    .line 280
    check-cast p3, Lcom/facebook/react/bridge/ReadableMap;

    .line 281
    .line 282
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setViewState(Landroid/view/View;Lcom/facebook/react/bridge/ReadableMap;)V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :sswitch_c
    const-string v0, "accessibilityLabel"

    .line 287
    .line 288
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result p2

    .line 292
    if-nez p2, :cond_10

    .line 293
    .line 294
    goto/16 :goto_7

    .line 295
    .line 296
    :cond_10
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 297
    .line 298
    check-cast p3, Ljava/lang/String;

    .line 299
    .line 300
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityLabel(Landroid/view/View;Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    return-void

    .line 304
    :sswitch_d
    const-string v0, "transform"

    .line 305
    .line 306
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 307
    .line 308
    .line 309
    move-result p2

    .line 310
    if-nez p2, :cond_11

    .line 311
    .line 312
    goto/16 :goto_7

    .line 313
    .line 314
    :cond_11
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 315
    .line 316
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 317
    .line 318
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTransform(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 319
    .line 320
    .line 321
    return-void

    .line 322
    :sswitch_e
    const-string v0, "importantForAccessibility"

    .line 323
    .line 324
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result p2

    .line 328
    if-nez p2, :cond_12

    .line 329
    .line 330
    goto/16 :goto_7

    .line 331
    .line 332
    :cond_12
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 333
    .line 334
    check-cast p3, Ljava/lang/String;

    .line 335
    .line 336
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setImportantForAccessibility(Landroid/view/View;Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    return-void

    .line 340
    :sswitch_f
    const-string v0, "boxShadow"

    .line 341
    .line 342
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result p2

    .line 346
    if-nez p2, :cond_13

    .line 347
    .line 348
    goto/16 :goto_7

    .line 349
    .line 350
    :cond_13
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 351
    .line 352
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 353
    .line 354
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBoxShadow(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :sswitch_10
    const-string v0, "borderBottomRightRadius"

    .line 359
    .line 360
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result p2

    .line 364
    if-nez p2, :cond_14

    .line 365
    .line 366
    goto/16 :goto_7

    .line 367
    .line 368
    :cond_14
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 369
    .line 370
    check-cast p3, Ljava/lang/Double;

    .line 371
    .line 372
    if-eqz p3, :cond_15

    .line 373
    .line 374
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 375
    .line 376
    .line 377
    move-result-wide v0

    .line 378
    double-to-float p3, v0

    .line 379
    goto :goto_2

    .line 380
    :cond_15
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 381
    .line 382
    :goto_2
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBorderBottomRightRadius(Landroid/view/View;F)V

    .line 383
    .line 384
    .line 385
    return-void

    .line 386
    :sswitch_11
    const-string v0, "borderBottomLeftRadius"

    .line 387
    .line 388
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result p2

    .line 392
    if-nez p2, :cond_16

    .line 393
    .line 394
    goto/16 :goto_7

    .line 395
    .line 396
    :cond_16
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 397
    .line 398
    check-cast p3, Ljava/lang/Double;

    .line 399
    .line 400
    if-eqz p3, :cond_17

    .line 401
    .line 402
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 403
    .line 404
    .line 405
    move-result-wide v0

    .line 406
    double-to-float p3, v0

    .line 407
    goto :goto_3

    .line 408
    :cond_17
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 409
    .line 410
    :goto_3
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBorderBottomLeftRadius(Landroid/view/View;F)V

    .line 411
    .line 412
    .line 413
    return-void

    .line 414
    :sswitch_12
    const-string v0, "borderTopRightRadius"

    .line 415
    .line 416
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result p2

    .line 420
    if-nez p2, :cond_18

    .line 421
    .line 422
    goto/16 :goto_7

    .line 423
    .line 424
    :cond_18
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 425
    .line 426
    check-cast p3, Ljava/lang/Double;

    .line 427
    .line 428
    if-eqz p3, :cond_19

    .line 429
    .line 430
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 431
    .line 432
    .line 433
    move-result-wide v0

    .line 434
    double-to-float p3, v0

    .line 435
    goto :goto_4

    .line 436
    :cond_19
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 437
    .line 438
    :goto_4
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBorderTopRightRadius(Landroid/view/View;F)V

    .line 439
    .line 440
    .line 441
    return-void

    .line 442
    :sswitch_13
    const-string v0, "onPointerOut"

    .line 443
    .line 444
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result p2

    .line 448
    if-nez p2, :cond_1a

    .line 449
    .line 450
    goto/16 :goto_7

    .line 451
    .line 452
    :cond_1a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 453
    .line 454
    check-cast p3, Ljava/lang/Boolean;

    .line 455
    .line 456
    if-eqz p3, :cond_1b

    .line 457
    .line 458
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    :cond_1b
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerOut(Landroid/view/View;Z)V

    .line 463
    .line 464
    .line 465
    return-void

    .line 466
    :sswitch_14
    const-string v0, "onPointerOverCapture"

    .line 467
    .line 468
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    move-result p2

    .line 472
    if-nez p2, :cond_1c

    .line 473
    .line 474
    goto/16 :goto_7

    .line 475
    .line 476
    :cond_1c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 477
    .line 478
    check-cast p3, Ljava/lang/Boolean;

    .line 479
    .line 480
    if-eqz p3, :cond_1d

    .line 481
    .line 482
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    :cond_1d
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerOverCapture(Landroid/view/View;Z)V

    .line 487
    .line 488
    .line 489
    return-void

    .line 490
    :sswitch_15
    const-string v0, "accessibilityLiveRegion"

    .line 491
    .line 492
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 493
    .line 494
    .line 495
    move-result p2

    .line 496
    if-nez p2, :cond_1e

    .line 497
    .line 498
    goto/16 :goto_7

    .line 499
    .line 500
    :cond_1e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 501
    .line 502
    check-cast p3, Ljava/lang/String;

    .line 503
    .line 504
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityLiveRegion(Landroid/view/View;Ljava/lang/String;)V

    .line 505
    .line 506
    .line 507
    return-void

    .line 508
    :sswitch_16
    const-string v0, "onPointerLeave"

    .line 509
    .line 510
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 511
    .line 512
    .line 513
    move-result p2

    .line 514
    if-nez p2, :cond_1f

    .line 515
    .line 516
    goto/16 :goto_7

    .line 517
    .line 518
    :cond_1f
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 519
    .line 520
    check-cast p3, Ljava/lang/Boolean;

    .line 521
    .line 522
    if-eqz p3, :cond_20

    .line 523
    .line 524
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 525
    .line 526
    .line 527
    move-result v4

    .line 528
    :cond_20
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerLeave(Landroid/view/View;Z)V

    .line 529
    .line 530
    .line 531
    return-void

    .line 532
    :sswitch_17
    const-string v0, "onPointerEnter"

    .line 533
    .line 534
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result p2

    .line 538
    if-nez p2, :cond_21

    .line 539
    .line 540
    goto/16 :goto_7

    .line 541
    .line 542
    :cond_21
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 543
    .line 544
    check-cast p3, Ljava/lang/Boolean;

    .line 545
    .line 546
    if-eqz p3, :cond_22

    .line 547
    .line 548
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 549
    .line 550
    .line 551
    move-result v4

    .line 552
    :cond_22
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerEnter(Landroid/view/View;Z)V

    .line 553
    .line 554
    .line 555
    return-void

    .line 556
    :sswitch_18
    const-string v0, "role"

    .line 557
    .line 558
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    move-result p2

    .line 562
    if-nez p2, :cond_23

    .line 563
    .line 564
    goto/16 :goto_7

    .line 565
    .line 566
    :cond_23
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 567
    .line 568
    check-cast p3, Ljava/lang/String;

    .line 569
    .line 570
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setRole(Landroid/view/View;Ljava/lang/String;)V

    .line 571
    .line 572
    .line 573
    return-void

    .line 574
    :sswitch_19
    const-string v0, "elevation"

    .line 575
    .line 576
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 577
    .line 578
    .line 579
    move-result p2

    .line 580
    if-nez p2, :cond_24

    .line 581
    .line 582
    goto/16 :goto_7

    .line 583
    .line 584
    :cond_24
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 585
    .line 586
    check-cast p3, Ljava/lang/Double;

    .line 587
    .line 588
    if-eqz p3, :cond_25

    .line 589
    .line 590
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 591
    .line 592
    .line 593
    move-result-wide v0

    .line 594
    double-to-float v3, v0

    .line 595
    :cond_25
    invoke-virtual {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManager;->setElevation(Landroid/view/View;F)V

    .line 596
    .line 597
    .line 598
    return-void

    .line 599
    :sswitch_1a
    const-string v0, "rotation"

    .line 600
    .line 601
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result p2

    .line 605
    if-nez p2, :cond_26

    .line 606
    .line 607
    goto/16 :goto_7

    .line 608
    .line 609
    :cond_26
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 610
    .line 611
    check-cast p3, Ljava/lang/Double;

    .line 612
    .line 613
    if-eqz p3, :cond_27

    .line 614
    .line 615
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 616
    .line 617
    .line 618
    move-result-wide v0

    .line 619
    double-to-float v3, v0

    .line 620
    :cond_27
    invoke-virtual {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManager;->setRotation(Landroid/view/View;F)V

    .line 621
    .line 622
    .line 623
    return-void

    .line 624
    :sswitch_1b
    const-string v0, "renderToHardwareTextureAndroid"

    .line 625
    .line 626
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    move-result p2

    .line 630
    if-nez p2, :cond_28

    .line 631
    .line 632
    goto/16 :goto_7

    .line 633
    .line 634
    :cond_28
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 635
    .line 636
    check-cast p3, Ljava/lang/Boolean;

    .line 637
    .line 638
    if-eqz p3, :cond_29

    .line 639
    .line 640
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 641
    .line 642
    .line 643
    move-result v4

    .line 644
    :cond_29
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setRenderToHardwareTexture(Landroid/view/View;Z)V

    .line 645
    .line 646
    .line 647
    return-void

    .line 648
    :sswitch_1c
    const-string v0, "accessibilityRole"

    .line 649
    .line 650
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result p2

    .line 654
    if-nez p2, :cond_2a

    .line 655
    .line 656
    goto/16 :goto_7

    .line 657
    .line 658
    :cond_2a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 659
    .line 660
    check-cast p3, Ljava/lang/String;

    .line 661
    .line 662
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityRole(Landroid/view/View;Ljava/lang/String;)V

    .line 663
    .line 664
    .line 665
    return-void

    .line 666
    :sswitch_1d
    const-string v0, "accessibilityHint"

    .line 667
    .line 668
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 669
    .line 670
    .line 671
    move-result p2

    .line 672
    if-nez p2, :cond_2b

    .line 673
    .line 674
    goto/16 :goto_7

    .line 675
    .line 676
    :cond_2b
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 677
    .line 678
    check-cast p3, Ljava/lang/String;

    .line 679
    .line 680
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setAccessibilityHint(Landroid/view/View;Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :sswitch_1e
    const-string v0, "onPointerLeaveCapture"

    .line 685
    .line 686
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 687
    .line 688
    .line 689
    move-result p2

    .line 690
    if-nez p2, :cond_2c

    .line 691
    .line 692
    goto/16 :goto_7

    .line 693
    .line 694
    :cond_2c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 695
    .line 696
    check-cast p3, Ljava/lang/Boolean;

    .line 697
    .line 698
    if-eqz p3, :cond_2d

    .line 699
    .line 700
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    :cond_2d
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerLeaveCapture(Landroid/view/View;Z)V

    .line 705
    .line 706
    .line 707
    return-void

    .line 708
    :sswitch_1f
    const-string v0, "zIndex"

    .line 709
    .line 710
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 711
    .line 712
    .line 713
    move-result p2

    .line 714
    if-nez p2, :cond_2e

    .line 715
    .line 716
    goto/16 :goto_7

    .line 717
    .line 718
    :cond_2e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 719
    .line 720
    check-cast p3, Ljava/lang/Double;

    .line 721
    .line 722
    if-eqz p3, :cond_2f

    .line 723
    .line 724
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 725
    .line 726
    .line 727
    move-result-wide v0

    .line 728
    double-to-float v3, v0

    .line 729
    :cond_2f
    invoke-virtual {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManager;->setZIndex(Landroid/view/View;F)V

    .line 730
    .line 731
    .line 732
    return-void

    .line 733
    :sswitch_20
    const-string v0, "transformOrigin"

    .line 734
    .line 735
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result p2

    .line 739
    if-nez p2, :cond_30

    .line 740
    .line 741
    goto/16 :goto_7

    .line 742
    .line 743
    :cond_30
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 744
    .line 745
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 746
    .line 747
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTransformOrigin(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 748
    .line 749
    .line 750
    return-void

    .line 751
    :sswitch_21
    const-string v0, "testID"

    .line 752
    .line 753
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 754
    .line 755
    .line 756
    move-result p2

    .line 757
    if-nez p2, :cond_31

    .line 758
    .line 759
    goto/16 :goto_7

    .line 760
    .line 761
    :cond_31
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 762
    .line 763
    check-cast p3, Ljava/lang/String;

    .line 764
    .line 765
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTestId(Landroid/view/View;Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    return-void

    .line 769
    :sswitch_22
    const-string v0, "scaleY"

    .line 770
    .line 771
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 772
    .line 773
    .line 774
    move-result p2

    .line 775
    if-nez p2, :cond_32

    .line 776
    .line 777
    goto/16 :goto_7

    .line 778
    .line 779
    :cond_32
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 780
    .line 781
    check-cast p3, Ljava/lang/Double;

    .line 782
    .line 783
    if-eqz p3, :cond_33

    .line 784
    .line 785
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 786
    .line 787
    .line 788
    move-result-wide v0

    .line 789
    double-to-float v2, v0

    .line 790
    :cond_33
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setScaleY(Landroid/view/View;F)V

    .line 791
    .line 792
    .line 793
    return-void

    .line 794
    :sswitch_23
    const-string v0, "scaleX"

    .line 795
    .line 796
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    move-result p2

    .line 800
    if-nez p2, :cond_34

    .line 801
    .line 802
    goto/16 :goto_7

    .line 803
    .line 804
    :cond_34
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 805
    .line 806
    check-cast p3, Ljava/lang/Double;

    .line 807
    .line 808
    if-eqz p3, :cond_35

    .line 809
    .line 810
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 811
    .line 812
    .line 813
    move-result-wide v0

    .line 814
    double-to-float v2, v0

    .line 815
    :cond_35
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setScaleX(Landroid/view/View;F)V

    .line 816
    .line 817
    .line 818
    return-void

    .line 819
    :sswitch_24
    const-string v0, "screenReaderFocusable"

    .line 820
    .line 821
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result p2

    .line 825
    if-nez p2, :cond_36

    .line 826
    .line 827
    goto/16 :goto_7

    .line 828
    .line 829
    :cond_36
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 830
    .line 831
    check-cast p3, Ljava/lang/Boolean;

    .line 832
    .line 833
    if-eqz p3, :cond_37

    .line 834
    .line 835
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 836
    .line 837
    .line 838
    move-result v4

    .line 839
    :cond_37
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setScreenReaderFocusable(Landroid/view/View;Z)V

    .line 840
    .line 841
    .line 842
    return-void

    .line 843
    :sswitch_25
    const-string v0, "onPointerMoveCapture"

    .line 844
    .line 845
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 846
    .line 847
    .line 848
    move-result p2

    .line 849
    if-nez p2, :cond_38

    .line 850
    .line 851
    goto/16 :goto_7

    .line 852
    .line 853
    :cond_38
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 854
    .line 855
    check-cast p3, Ljava/lang/Boolean;

    .line 856
    .line 857
    if-eqz p3, :cond_39

    .line 858
    .line 859
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 860
    .line 861
    .line 862
    move-result v4

    .line 863
    :cond_39
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerMoveCapture(Landroid/view/View;Z)V

    .line 864
    .line 865
    .line 866
    return-void

    .line 867
    :sswitch_26
    const-string v0, "onClickCapture"

    .line 868
    .line 869
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result p2

    .line 873
    if-nez p2, :cond_3a

    .line 874
    .line 875
    goto/16 :goto_7

    .line 876
    .line 877
    :cond_3a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 878
    .line 879
    check-cast p3, Ljava/lang/Boolean;

    .line 880
    .line 881
    if-eqz p3, :cond_3b

    .line 882
    .line 883
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 884
    .line 885
    .line 886
    move-result v4

    .line 887
    :cond_3b
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setClickCapture(Landroid/view/View;Z)V

    .line 888
    .line 889
    .line 890
    return-void

    .line 891
    :sswitch_27
    const-string v0, "borderTopLeftRadius"

    .line 892
    .line 893
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result p2

    .line 897
    if-nez p2, :cond_3c

    .line 898
    .line 899
    goto/16 :goto_7

    .line 900
    .line 901
    :cond_3c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 902
    .line 903
    check-cast p3, Ljava/lang/Double;

    .line 904
    .line 905
    if-eqz p3, :cond_3d

    .line 906
    .line 907
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 908
    .line 909
    .line 910
    move-result-wide v0

    .line 911
    double-to-float p3, v0

    .line 912
    goto :goto_5

    .line 913
    :cond_3d
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 914
    .line 915
    :goto_5
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setBorderTopLeftRadius(Landroid/view/View;F)V

    .line 916
    .line 917
    .line 918
    return-void

    .line 919
    :sswitch_28
    const-string v0, "onPointerOutCapture"

    .line 920
    .line 921
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 922
    .line 923
    .line 924
    move-result p2

    .line 925
    if-nez p2, :cond_3e

    .line 926
    .line 927
    goto/16 :goto_7

    .line 928
    .line 929
    :cond_3e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 930
    .line 931
    check-cast p3, Ljava/lang/Boolean;

    .line 932
    .line 933
    if-eqz p3, :cond_3f

    .line 934
    .line 935
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 936
    .line 937
    .line 938
    move-result v4

    .line 939
    :cond_3f
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerOutCapture(Landroid/view/View;Z)V

    .line 940
    .line 941
    .line 942
    return-void

    .line 943
    :sswitch_29
    const-string v0, "opacity"

    .line 944
    .line 945
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    move-result p2

    .line 949
    if-nez p2, :cond_40

    .line 950
    .line 951
    goto/16 :goto_7

    .line 952
    .line 953
    :cond_40
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 954
    .line 955
    check-cast p3, Ljava/lang/Double;

    .line 956
    .line 957
    if-eqz p3, :cond_41

    .line 958
    .line 959
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 960
    .line 961
    .line 962
    move-result-wide v0

    .line 963
    double-to-float v2, v0

    .line 964
    :cond_41
    invoke-virtual {p2, p1, v2}, Lcom/facebook/react/uimanager/BaseViewManager;->setOpacity(Landroid/view/View;F)V

    .line 965
    .line 966
    .line 967
    return-void

    .line 968
    :sswitch_2a
    const-string v0, "filter"

    .line 969
    .line 970
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 971
    .line 972
    .line 973
    move-result p2

    .line 974
    if-nez p2, :cond_42

    .line 975
    .line 976
    goto/16 :goto_7

    .line 977
    .line 978
    :cond_42
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 979
    .line 980
    check-cast p3, Lcom/facebook/react/bridge/ReadableArray;

    .line 981
    .line 982
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setFilter(Landroid/view/View;Lcom/facebook/react/bridge/ReadableArray;)V

    .line 983
    .line 984
    .line 985
    return-void

    .line 986
    :sswitch_2b
    const-string v0, "onClick"

    .line 987
    .line 988
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 989
    .line 990
    .line 991
    move-result p2

    .line 992
    if-nez p2, :cond_43

    .line 993
    .line 994
    goto/16 :goto_7

    .line 995
    .line 996
    :cond_43
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 997
    .line 998
    check-cast p3, Ljava/lang/Boolean;

    .line 999
    .line 1000
    if-eqz p3, :cond_44

    .line 1001
    .line 1002
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v4

    .line 1006
    :cond_44
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setClick(Landroid/view/View;Z)V

    .line 1007
    .line 1008
    .line 1009
    return-void

    .line 1010
    :sswitch_2c
    const-string v0, "outlineWidth"

    .line 1011
    .line 1012
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result p2

    .line 1016
    if-nez p2, :cond_45

    .line 1017
    .line 1018
    goto/16 :goto_7

    .line 1019
    .line 1020
    :cond_45
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1021
    .line 1022
    check-cast p3, Ljava/lang/Double;

    .line 1023
    .line 1024
    if-eqz p3, :cond_46

    .line 1025
    .line 1026
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 1027
    .line 1028
    .line 1029
    move-result-wide v0

    .line 1030
    double-to-float p3, v0

    .line 1031
    goto :goto_6

    .line 1032
    :cond_46
    sget p3, Lcom/facebook/yoga/g;->b:F

    .line 1033
    .line 1034
    :goto_6
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOutlineWidth(Landroid/view/View;F)V

    .line 1035
    .line 1036
    .line 1037
    return-void

    .line 1038
    :sswitch_2d
    const-string v0, "outlineStyle"

    .line 1039
    .line 1040
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1041
    .line 1042
    .line 1043
    move-result p2

    .line 1044
    if-nez p2, :cond_47

    .line 1045
    .line 1046
    goto/16 :goto_7

    .line 1047
    .line 1048
    :cond_47
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1049
    .line 1050
    check-cast p3, Ljava/lang/String;

    .line 1051
    .line 1052
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOutlineStyle(Landroid/view/View;Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    return-void

    .line 1056
    :sswitch_2e
    const-string v0, "outlineColor"

    .line 1057
    .line 1058
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    move-result p2

    .line 1062
    if-nez p2, :cond_48

    .line 1063
    .line 1064
    goto/16 :goto_7

    .line 1065
    .line 1066
    :cond_48
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1067
    .line 1068
    check-cast p3, Ljava/lang/Integer;

    .line 1069
    .line 1070
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setOutlineColor(Landroid/view/View;Ljava/lang/Integer;)V

    .line 1071
    .line 1072
    .line 1073
    return-void

    .line 1074
    :sswitch_2f
    const-string v0, "shadowColor"

    .line 1075
    .line 1076
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1077
    .line 1078
    .line 1079
    move-result p2

    .line 1080
    if-nez p2, :cond_49

    .line 1081
    .line 1082
    goto :goto_7

    .line 1083
    :cond_49
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1084
    .line 1085
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-static {p3, v0, v4}, Lcom/facebook/react/bridge/ColorPropConverter;->getColor(Ljava/lang/Object;Landroid/content/Context;I)I

    .line 1093
    .line 1094
    .line 1095
    move-result p3

    .line 1096
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setShadowColor(Landroid/view/View;I)V

    .line 1097
    .line 1098
    .line 1099
    return-void

    .line 1100
    :sswitch_30
    const-string v0, "translateY"

    .line 1101
    .line 1102
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    move-result p2

    .line 1106
    if-nez p2, :cond_4a

    .line 1107
    .line 1108
    goto :goto_7

    .line 1109
    :cond_4a
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1110
    .line 1111
    check-cast p3, Ljava/lang/Double;

    .line 1112
    .line 1113
    if-eqz p3, :cond_4b

    .line 1114
    .line 1115
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 1116
    .line 1117
    .line 1118
    move-result-wide v0

    .line 1119
    double-to-float v3, v0

    .line 1120
    :cond_4b
    invoke-virtual {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTranslateY(Landroid/view/View;F)V

    .line 1121
    .line 1122
    .line 1123
    return-void

    .line 1124
    :sswitch_31
    const-string v0, "translateX"

    .line 1125
    .line 1126
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1127
    .line 1128
    .line 1129
    move-result p2

    .line 1130
    if-nez p2, :cond_4c

    .line 1131
    .line 1132
    goto :goto_7

    .line 1133
    :cond_4c
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1134
    .line 1135
    check-cast p3, Ljava/lang/Double;

    .line 1136
    .line 1137
    if-eqz p3, :cond_4d

    .line 1138
    .line 1139
    invoke-virtual {p3}, Ljava/lang/Double;->doubleValue()D

    .line 1140
    .line 1141
    .line 1142
    move-result-wide v0

    .line 1143
    double-to-float v3, v0

    .line 1144
    :cond_4d
    invoke-virtual {p2, p1, v3}, Lcom/facebook/react/uimanager/BaseViewManager;->setTranslateX(Landroid/view/View;F)V

    .line 1145
    .line 1146
    .line 1147
    return-void

    .line 1148
    :sswitch_32
    const-string v0, "onPointerEnterCapture"

    .line 1149
    .line 1150
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1151
    .line 1152
    .line 1153
    move-result p2

    .line 1154
    if-nez p2, :cond_4e

    .line 1155
    .line 1156
    goto :goto_7

    .line 1157
    :cond_4e
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1158
    .line 1159
    check-cast p3, Ljava/lang/Boolean;

    .line 1160
    .line 1161
    if-eqz p3, :cond_4f

    .line 1162
    .line 1163
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1164
    .line 1165
    .line 1166
    move-result v4

    .line 1167
    :cond_4f
    invoke-virtual {p2, p1, v4}, Lcom/facebook/react/uimanager/BaseViewManager;->setPointerEnterCapture(Landroid/view/View;Z)V

    .line 1168
    .line 1169
    .line 1170
    return-void

    .line 1171
    :sswitch_33
    const-string v0, "mixBlendMode"

    .line 1172
    .line 1173
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    move-result p2

    .line 1177
    if-nez p2, :cond_50

    .line 1178
    .line 1179
    :goto_7
    return-void

    .line 1180
    :cond_50
    iget-object p2, p0, Lcom/facebook/react/uimanager/BaseViewManagerDelegate;->mViewManager:Lcom/facebook/react/uimanager/BaseViewManager;

    .line 1181
    .line 1182
    check-cast p3, Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-virtual {p2, p1, p3}, Lcom/facebook/react/uimanager/BaseViewManager;->setMixBlendMode(Landroid/view/View;Ljava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    return-void

    .line 1188
    nop

    .line 1189
    :sswitch_data_0
    .sparse-switch
        -0x784e6168 -> :sswitch_33
        -0x71291434 -> :sswitch_32
        -0x66a2c736 -> :sswitch_31
        -0x66a2c735 -> :sswitch_30
        -0x5ec185dd -> :sswitch_2f
        -0x58c6efbf -> :sswitch_2e
        -0x57e30171 -> :sswitch_2d
        -0x57aff15c -> :sswitch_2c
        -0x50946517 -> :sswitch_2b
        -0x4bf73488 -> :sswitch_2a
        -0x4b8807f5 -> :sswitch_29
        -0x4a6285ea -> :sswitch_28
        -0x4932ce1e -> :sswitch_27
        -0x48b2a3e3 -> :sswitch_26
        -0x3dcbd809 -> :sswitch_25
        -0x3b47bd5d -> :sswitch_24
        -0x3621dfb2 -> :sswitch_23
        -0x3621dfb1 -> :sswitch_22
        -0x34488ed3 -> :sswitch_21
        -0x2e963a4e -> :sswitch_20
        -0x2b988b88 -> :sswitch_1f
        -0x6af24f3 -> :sswitch_1e
        -0x60f430b -> :sswitch_1d
        -0x60aa11c -> :sswitch_1c
        -0x4d24f13 -> :sswitch_1b
        -0x266f082 -> :sswitch_1a
        -0x42d1a3 -> :sswitch_19
        0x358076 -> :sswitch_18
        0x111c21a -> :sswitch_17
        0x17009f9 -> :sswitch_16
        0x22936ee -> :sswitch_15
        0x7e38d94 -> :sswitch_14
        0x12ea5310 -> :sswitch_13
        0x13dfc885 -> :sswitch_12
        0x22a57450 -> :sswitch_11
        0x230fd3d7 -> :sswitch_10
        0x2c4a1ecb -> :sswitch_f
        0x2c861b47 -> :sswitch_e
        0x3ebe6b6c -> :sswitch_d
        0x445b6e46 -> :sswitch_c
        0x44c6b3e3 -> :sswitch_b
        0x44e880c3 -> :sswitch_a
        0x4a5f104f -> :sswitch_9
        0x4a601152 -> :sswitch_8
        0x4cb7f6d5 -> :sswitch_7
        0x506afbde -> :sswitch_6
        0x53e19f75 -> :sswitch_5
        0x59bdabcf -> :sswitch_4
        0x6904828c -> :sswitch_3
        0x6f2de13c -> :sswitch_2
        0x76cb4bbf -> :sswitch_1
        0x79eeaf72 -> :sswitch_0
    .end sparse-switch
.end method
