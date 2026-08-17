.class public final Lcom/swmansion/rnscreens/gamma/tabs/l;
.super Landroid/widget/FrameLayout;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/swmansion/rnscreens/gamma/tabs/b;
.implements Lcom/swmansion/rnscreens/safearea/c;
.implements Landroid/view/View$OnLayoutChangeListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/gamma/tabs/l$a;,
        Lcom/swmansion/rnscreens/gamma/tabs/l$b;,
        Lcom/swmansion/rnscreens/gamma/tabs/l$c;
    }
.end annotation


# static fields
.field public static final L:Lcom/swmansion/rnscreens/gamma/tabs/l$a;

.field static final synthetic M:[LC7/k;


# instance fields
.field private final A:Lkotlin/properties/d;

.field private final B:Lkotlin/properties/d;

.field private final C:Lkotlin/properties/d;

.field private final D:Lkotlin/properties/d;

.field private final E:Lkotlin/properties/d;

.field private final F:Lkotlin/properties/d;

.field private final G:Lkotlin/properties/d;

.field private final H:Lkotlin/properties/d;

.field private final I:Lkotlin/properties/d;

.field private final J:Lkotlin/properties/d;

.field private final K:Landroid/view/Choreographer$FrameCallback;

.field private final g:Lcom/facebook/react/uimanager/ThemedReactContext;

.field private final h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

.field private final i:Lcom/swmansion/rnscreens/gamma/tabs/l$c;

.field private final j:Landroidx/appcompat/view/d;

.field private final k:Lcom/google/android/material/bottomnavigation/c;

.field private final l:Landroid/widget/FrameLayout;

.field public m:Lcom/swmansion/rnscreens/gamma/tabs/s;

.field private n:Landroidx/fragment/app/FragmentManager;

.field private final o:Ljava/util/List;

.field private p:Ljava/lang/Integer;

.field private q:Z

.field private r:Lcom/swmansion/rnscreens/safearea/d;

.field private final s:Lcom/swmansion/rnscreens/gamma/tabs/q;

.field private final t:Lcom/swmansion/rnscreens/gamma/tabs/o;

.field private final u:Lkotlin/properties/d;

.field private final v:Lkotlin/properties/d;

.field private final w:Lkotlin/properties/d;

.field private final x:Lkotlin/properties/d;

.field private final y:Lkotlin/properties/d;

.field private final z:Lkotlin/properties/d;


# direct methods
.method static constructor <clinit>()V
    .locals 20

    .line 1
    new-instance v0, Lkotlin/jvm/internal/p;

    .line 2
    .line 3
    const-class v1, Lcom/swmansion/rnscreens/gamma/tabs/l;

    .line 4
    .line 5
    const-string v2, "tabBarBackgroundColor"

    .line 6
    .line 7
    const-string v3, "getTabBarBackgroundColor()Ljava/lang/Integer;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/p;

    .line 18
    .line 19
    const-string v3, "tabBarItemActiveIndicatorColor"

    .line 20
    .line 21
    const-string v5, "getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/p;

    .line 31
    .line 32
    const-string v5, "isTabBarItemActiveIndicatorEnabled"

    .line 33
    .line 34
    const-string v6, "isTabBarItemActiveIndicatorEnabled()Z"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v5, Lkotlin/jvm/internal/p;

    .line 44
    .line 45
    const-string v6, "tabBarItemIconColor"

    .line 46
    .line 47
    const-string v7, "getTabBarItemIconColor()Ljava/lang/Integer;"

    .line 48
    .line 49
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lkotlin/jvm/internal/p;

    .line 57
    .line 58
    const-string v7, "tabBarItemTitleFontFamily"

    .line 59
    .line 60
    const-string v8, "getTabBarItemTitleFontFamily()Ljava/lang/String;"

    .line 61
    .line 62
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Lkotlin/jvm/internal/p;

    .line 70
    .line 71
    const-string v8, "tabBarItemIconColorActive"

    .line 72
    .line 73
    const-string v9, "getTabBarItemIconColorActive()Ljava/lang/Integer;"

    .line 74
    .line 75
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v7}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    new-instance v8, Lkotlin/jvm/internal/p;

    .line 83
    .line 84
    const-string v9, "tabBarItemTitleFontColor"

    .line 85
    .line 86
    const-string v10, "getTabBarItemTitleFontColor()Ljava/lang/Integer;"

    .line 87
    .line 88
    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 92
    .line 93
    .line 94
    move-result-object v8

    .line 95
    new-instance v9, Lkotlin/jvm/internal/p;

    .line 96
    .line 97
    const-string v10, "tabBarItemTitleFontColorActive"

    .line 98
    .line 99
    const-string v11, "getTabBarItemTitleFontColorActive()Ljava/lang/Integer;"

    .line 100
    .line 101
    invoke-direct {v9, v1, v10, v11, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 102
    .line 103
    .line 104
    invoke-static {v9}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    new-instance v10, Lkotlin/jvm/internal/p;

    .line 109
    .line 110
    const-string v11, "tabBarItemTitleFontSize"

    .line 111
    .line 112
    const-string v12, "getTabBarItemTitleFontSize()Ljava/lang/Float;"

    .line 113
    .line 114
    invoke-direct {v10, v1, v11, v12, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 115
    .line 116
    .line 117
    invoke-static {v10}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 118
    .line 119
    .line 120
    move-result-object v10

    .line 121
    new-instance v11, Lkotlin/jvm/internal/p;

    .line 122
    .line 123
    const-string v12, "tabBarItemTitleFontSizeActive"

    .line 124
    .line 125
    const-string v13, "getTabBarItemTitleFontSizeActive()Ljava/lang/Float;"

    .line 126
    .line 127
    invoke-direct {v11, v1, v12, v13, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 128
    .line 129
    .line 130
    invoke-static {v11}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 131
    .line 132
    .line 133
    move-result-object v11

    .line 134
    new-instance v12, Lkotlin/jvm/internal/p;

    .line 135
    .line 136
    const-string v13, "tabBarItemTitleFontWeight"

    .line 137
    .line 138
    const-string v14, "getTabBarItemTitleFontWeight()Ljava/lang/String;"

    .line 139
    .line 140
    invoke-direct {v12, v1, v13, v14, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 141
    .line 142
    .line 143
    invoke-static {v12}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    new-instance v13, Lkotlin/jvm/internal/p;

    .line 148
    .line 149
    const-string v14, "tabBarItemTitleFontStyle"

    .line 150
    .line 151
    const-string v15, "getTabBarItemTitleFontStyle()Ljava/lang/String;"

    .line 152
    .line 153
    invoke-direct {v13, v1, v14, v15, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v13}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 157
    .line 158
    .line 159
    move-result-object v13

    .line 160
    new-instance v14, Lkotlin/jvm/internal/p;

    .line 161
    .line 162
    const-string v15, "tabBarItemRippleColor"

    .line 163
    .line 164
    move-object/from16 v16, v0

    .line 165
    .line 166
    const-string v0, "getTabBarItemRippleColor()Ljava/lang/Integer;"

    .line 167
    .line 168
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    invoke-static {v14}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    new-instance v14, Lkotlin/jvm/internal/p;

    .line 176
    .line 177
    const-string v15, "tabBarItemLabelVisibilityMode"

    .line 178
    .line 179
    move-object/from16 v17, v0

    .line 180
    .line 181
    const-string v0, "getTabBarItemLabelVisibilityMode()Ljava/lang/String;"

    .line 182
    .line 183
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 184
    .line 185
    .line 186
    invoke-static {v14}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    new-instance v14, Lkotlin/jvm/internal/p;

    .line 191
    .line 192
    const-string v15, "tabBarHidden"

    .line 193
    .line 194
    move-object/from16 v18, v0

    .line 195
    .line 196
    const-string v0, "getTabBarHidden()Z"

    .line 197
    .line 198
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 199
    .line 200
    .line 201
    invoke-static {v14}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    new-instance v14, Lkotlin/jvm/internal/p;

    .line 206
    .line 207
    const-string v15, "nativeContainerBackgroundColor"

    .line 208
    .line 209
    move-object/from16 v19, v0

    .line 210
    .line 211
    const-string v0, "getNativeContainerBackgroundColor()Ljava/lang/Integer;"

    .line 212
    .line 213
    invoke-direct {v14, v1, v15, v0, v4}, Lkotlin/jvm/internal/p;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 214
    .line 215
    .line 216
    invoke-static {v14}, Lkotlin/jvm/internal/D;->e(Lkotlin/jvm/internal/o;)LC7/i;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    const/16 v1, 0x10

    .line 221
    .line 222
    new-array v1, v1, [LC7/k;

    .line 223
    .line 224
    aput-object v16, v1, v4

    .line 225
    .line 226
    const/4 v4, 0x1

    .line 227
    aput-object v2, v1, v4

    .line 228
    .line 229
    const/4 v2, 0x2

    .line 230
    aput-object v3, v1, v2

    .line 231
    .line 232
    const/4 v2, 0x3

    .line 233
    aput-object v5, v1, v2

    .line 234
    .line 235
    const/4 v2, 0x4

    .line 236
    aput-object v6, v1, v2

    .line 237
    .line 238
    const/4 v2, 0x5

    .line 239
    aput-object v7, v1, v2

    .line 240
    .line 241
    const/4 v2, 0x6

    .line 242
    aput-object v8, v1, v2

    .line 243
    .line 244
    const/4 v2, 0x7

    .line 245
    aput-object v9, v1, v2

    .line 246
    .line 247
    const/16 v2, 0x8

    .line 248
    .line 249
    aput-object v10, v1, v2

    .line 250
    .line 251
    const/16 v2, 0x9

    .line 252
    .line 253
    aput-object v11, v1, v2

    .line 254
    .line 255
    const/16 v2, 0xa

    .line 256
    .line 257
    aput-object v12, v1, v2

    .line 258
    .line 259
    const/16 v2, 0xb

    .line 260
    .line 261
    aput-object v13, v1, v2

    .line 262
    .line 263
    const/16 v2, 0xc

    .line 264
    .line 265
    aput-object v17, v1, v2

    .line 266
    .line 267
    const/16 v2, 0xd

    .line 268
    .line 269
    aput-object v18, v1, v2

    .line 270
    .line 271
    const/16 v2, 0xe

    .line 272
    .line 273
    aput-object v19, v1, v2

    .line 274
    .line 275
    const/16 v2, 0xf

    .line 276
    .line 277
    aput-object v0, v1, v2

    .line 278
    .line 279
    sput-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 280
    .line 281
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/l$a;

    .line 282
    .line 283
    const/4 v1, 0x0

    .line 284
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/l$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 285
    .line 286
    .line 287
    sput-object v0, Lcom/swmansion/rnscreens/gamma/tabs/l;->L:Lcom/swmansion/rnscreens/gamma/tabs/l$a;

    .line 288
    .line 289
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/ThemedReactContext;)V
    .locals 6

    .line 1
    const-string v0, "reactContext"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 10
    .line 11
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 17
    .line 18
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/l$c;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$c;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->i:Lcom/swmansion/rnscreens/gamma/tabs/l$c;

    .line 24
    .line 25
    new-instance v0, Landroidx/appcompat/view/d;

    .line 26
    .line 27
    sget v1, LQ4/j;->f:I

    .line 28
    .line 29
    invoke-direct {v0, p1, v1}, Landroidx/appcompat/view/d;-><init>(Landroid/content/Context;I)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->j:Landroidx/appcompat/view/d;

    .line 33
    .line 34
    new-instance v1, Lcom/google/android/material/bottomnavigation/c;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lcom/google/android/material/bottomnavigation/c;-><init>(Landroid/content/Context;)V

    .line 37
    .line 38
    .line 39
    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    .line 40
    .line 41
    const/4 v3, -0x2

    .line 42
    const/16 v4, 0x50

    .line 43
    .line 44
    const/4 v5, -0x1

    .line 45
    invoke-direct {v2, v5, v3, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 49
    .line 50
    .line 51
    iput-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 52
    .line 53
    new-instance v2, Landroid/widget/FrameLayout;

    .line 54
    .line 55
    invoke-direct {v2, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 56
    .line 57
    .line 58
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 59
    .line 60
    invoke-direct {p1, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 64
    .line 65
    .line 66
    sget-object p1, LQ6/g;->a:LQ6/g;

    .line 67
    .line 68
    invoke-virtual {p1}, LQ6/g;->a()I

    .line 69
    .line 70
    .line 71
    move-result p1

    .line 72
    invoke-virtual {v2, p1}, Landroid/view/View;->setId(I)V

    .line 73
    .line 74
    .line 75
    iput-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->l:Landroid/widget/FrameLayout;

    .line 76
    .line 77
    new-instance p1, Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 80
    .line 81
    .line 82
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 83
    .line 84
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/q;

    .line 85
    .line 86
    invoke-direct {v3, v0, v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/q;-><init>(Landroidx/appcompat/view/d;Lcom/google/android/material/bottomnavigation/c;Ljava/util/List;)V

    .line 87
    .line 88
    .line 89
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->s:Lcom/swmansion/rnscreens/gamma/tabs/q;

    .line 90
    .line 91
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/o;

    .line 92
    .line 93
    invoke-direct {v0, v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/o;-><init>(Lcom/google/android/material/bottomnavigation/c;Ljava/util/List;)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->t:Lcom/swmansion/rnscreens/gamma/tabs/o;

    .line 97
    .line 98
    sget-object p1, Lkotlin/properties/a;->a:Lkotlin/properties/a;

    .line 99
    .line 100
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$k;

    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$k;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 104
    .line 105
    .line 106
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->u:Lkotlin/properties/d;

    .line 107
    .line 108
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$l;

    .line 109
    .line 110
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$l;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->v:Lkotlin/properties/d;

    .line 114
    .line 115
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 116
    .line 117
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/l$m;

    .line 118
    .line 119
    invoke-direct {v3, p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$m;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 120
    .line 121
    .line 122
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->w:Lkotlin/properties/d;

    .line 123
    .line 124
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$n;

    .line 125
    .line 126
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$n;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->x:Lkotlin/properties/d;

    .line 130
    .line 131
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$o;

    .line 132
    .line 133
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$o;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 134
    .line 135
    .line 136
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->y:Lkotlin/properties/d;

    .line 137
    .line 138
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$p;

    .line 139
    .line 140
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$p;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 141
    .line 142
    .line 143
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->z:Lkotlin/properties/d;

    .line 144
    .line 145
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$q;

    .line 146
    .line 147
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$q;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->A:Lkotlin/properties/d;

    .line 151
    .line 152
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$r;

    .line 153
    .line 154
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$r;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 155
    .line 156
    .line 157
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->B:Lkotlin/properties/d;

    .line 158
    .line 159
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$s;

    .line 160
    .line 161
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$s;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 162
    .line 163
    .line 164
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->C:Lkotlin/properties/d;

    .line 165
    .line 166
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$d;

    .line 167
    .line 168
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$d;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 169
    .line 170
    .line 171
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->D:Lkotlin/properties/d;

    .line 172
    .line 173
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$e;

    .line 174
    .line 175
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$e;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 176
    .line 177
    .line 178
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->E:Lkotlin/properties/d;

    .line 179
    .line 180
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$f;

    .line 181
    .line 182
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$f;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 183
    .line 184
    .line 185
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->F:Lkotlin/properties/d;

    .line 186
    .line 187
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$g;

    .line 188
    .line 189
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$g;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 190
    .line 191
    .line 192
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->G:Lkotlin/properties/d;

    .line 193
    .line 194
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$h;

    .line 195
    .line 196
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$h;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 197
    .line 198
    .line 199
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->H:Lkotlin/properties/d;

    .line 200
    .line 201
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 202
    .line 203
    new-instance v3, Lcom/swmansion/rnscreens/gamma/tabs/l$i;

    .line 204
    .line 205
    invoke-direct {v3, p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$i;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 206
    .line 207
    .line 208
    iput-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->I:Lkotlin/properties/d;

    .line 209
    .line 210
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/l$j;

    .line 211
    .line 212
    invoke-direct {p1, v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/l$j;-><init>(Ljava/lang/Object;Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 213
    .line 214
    .line 215
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->J:Lkotlin/properties/d;

    .line 216
    .line 217
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 221
    .line 222
    .line 223
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/f;

    .line 224
    .line 225
    invoke-direct {p1}, Lcom/swmansion/rnscreens/gamma/tabs/f;-><init>()V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v1, p1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 229
    .line 230
    .line 231
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/g;

    .line 232
    .line 233
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/g;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setOnItemSelectedListener(Lcom/google/android/material/navigation/NavigationBarView$c;)V

    .line 237
    .line 238
    .line 239
    new-instance p1, Lcom/swmansion/rnscreens/gamma/tabs/h;

    .line 240
    .line 241
    invoke-direct {p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/h;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 242
    .line 243
    .line 244
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->K:Landroid/view/Choreographer$FrameCallback;

    .line 245
    .line 246
    return-void
.end method

.method private final C()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->q:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->K:Landroid/view/Choreographer$FrameCallback;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    iput-boolean v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->q:Z

    .line 11
    .line 12
    sget-object v0, Lcom/facebook/react/modules/core/ReactChoreographer;->Companion:Lcom/facebook/react/modules/core/ReactChoreographer$Companion;

    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/facebook/react/modules/core/ReactChoreographer$Companion;->getInstance()Lcom/facebook/react/modules/core/ReactChoreographer;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sget-object v1, Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;->NATIVE_ANIMATED_MODULE:Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;

    .line 19
    .line 20
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->K:Landroid/view/Choreographer$FrameCallback;

    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, Lcom/facebook/react/modules/core/ReactChoreographer;->postFrameCallback(Lcom/facebook/react/modules/core/ReactChoreographer$CallbackType;Landroid/view/Choreographer$FrameCallback;)V

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void
.end method

.method private static final E(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/swmansion/rnscreens/gamma/tabs/e;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    if-ne p1, p0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0
.end method

.method private static final F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method private final I()V
    .locals 3

    .line 1
    sget-object v0, LY6/e;->a:LY6/e;

    .line 2
    .line 3
    const-string v1, "TabsHost"

    .line 4
    .line 5
    const-string v2, "updateBottomNavigationViewAppearance"

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->s:Lcom/swmansion/rnscreens/gamma/tabs/q;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/q;->c(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getSelectedTabScreenFragmentId()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/google/android/material/navigation/NavigationBarView;->getSelectedItemId()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eq v1, v0, :cond_0

    .line 32
    .line 33
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setSelectedItemId(I)V

    .line 36
    .line 37
    .line 38
    :cond_0
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/k;

    .line 39
    .line 40
    invoke-direct {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/k;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    const-string v1, "[RNScreens] A single selected tab must be present"

    .line 50
    .line 51
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v0
.end method

.method private static final J(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->C()V

    .line 2
    .line 3
    .line 4
    sget-object p0, LY6/e;->a:LY6/e;

    .line 5
    .line 6
    const-string v0, "TabsHost"

    .line 7
    .line 8
    const-string v1, "BottomNavigationView request layout"

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final K(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarHidden()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    :goto_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->r:Lcom/swmansion/rnscreens/safearea/d;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    new-instance v1, Lcom/swmansion/rnscreens/safearea/a;

    .line 27
    .line 28
    int-to-float p1, p1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-direct {v1, v2, v2, v2, p1}, Lcom/swmansion/rnscreens/safearea/a;-><init>(FFFF)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1}, Lcom/swmansion/rnscreens/safearea/d;->e(Lcom/swmansion/rnscreens/safearea/a;)V

    .line 34
    .line 35
    .line 36
    :cond_2
    return-void
.end method

.method static synthetic L(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->K(Ljava/lang/Integer;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final M(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->c()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method private final N()V
    .locals 5

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getCurrentFocusedTab()Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->v0()Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "getFragments(...)"

    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    instance-of v4, v3, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 38
    .line 39
    if-eqz v4, :cond_0

    .line 40
    .line 41
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    const/4 v3, 0x1

    .line 50
    if-gt v1, v3, :cond_4

    .line 51
    .line 52
    invoke-static {v2}, Lj7/q;->g0(Ljava/util/List;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 57
    .line 58
    if-ne v0, v1, :cond_2

    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->o()Landroidx/fragment/app/I;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    invoke-virtual {v2, v3}, Landroidx/fragment/app/I;->u(Z)Landroidx/fragment/app/I;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    if-eqz v1, :cond_3

    .line 74
    .line 75
    invoke-virtual {v2, v1}, Landroidx/fragment/app/I;->n(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 76
    .line 77
    .line 78
    :cond_3
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->l:Landroid/widget/FrameLayout;

    .line 79
    .line 80
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    invoke-virtual {v2, v1, v0}, Landroidx/fragment/app/I;->b(ILandroidx/fragment/app/Fragment;)Landroidx/fragment/app/I;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Landroidx/fragment/app/I;->k()V

    .line 88
    .line 89
    .line 90
    return-void

    .line 91
    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 92
    .line 93
    const-string v1, "[RNScreens] There can be only a single focused tab"

    .line 94
    .line 95
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw v0
.end method

.method public static synthetic f(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->J(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic g(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-static/range {p0 .. p8}, Lcom/swmansion/rnscreens/gamma/tabs/l;->l(Landroid/view/View;IIIIIIII)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final getCurrentFocusedTab()Lcom/swmansion/rnscreens/gamma/tabs/e;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    :goto_0
    if-eqz v1, :cond_2

    .line 33
    .line 34
    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 35
    .line 36
    return-object v1

    .line 37
    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 38
    .line 39
    const-string v1, "[RNScreens] No focused tab present"

    .line 40
    .line 41
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw v0
.end method

.method private final getRequireFragmentManager()Landroidx/fragment/app/FragmentManager;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->n:Landroidx/fragment/app/FragmentManager;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string v1, "[RNScreens] Nullish fragment manager"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0
.end method

.method private final getSelectedTabScreenFragmentId()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return-object v0

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x0

    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->b()Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v1, -0x1

    .line 45
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0
.end method

.method public static synthetic h(Lcom/swmansion/rnscreens/gamma/tabs/l;J)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->z(Lcom/swmansion/rnscreens/gamma/tabs/l;J)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->F(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic j(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/MenuItem;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->m(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/MenuItem;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic k(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/swmansion/rnscreens/gamma/tabs/e;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->E(Lcom/swmansion/rnscreens/gamma/tabs/a;Lcom/swmansion/rnscreens/gamma/tabs/e;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final l(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    sget-object p0, LY6/e;->a:LY6/e;

    .line 2
    .line 3
    sub-int/2addr p3, p1

    .line 4
    sub-int/2addr p4, p2

    .line 5
    new-instance p5, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p5}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string p6, "BottomNavigationView layout changed {"

    .line 11
    .line 12
    invoke-virtual {p5, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p1, ", "

    .line 19
    .line 20
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string p2, "} {"

    .line 27
    .line 28
    invoke-virtual {p5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p5, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p5, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, "}"

    .line 41
    .line 42
    invoke-virtual {p5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "TabsHost"

    .line 50
    .line 51
    invoke-virtual {p0, p2, p1}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method private static final m(Lcom/swmansion/rnscreens/gamma/tabs/l;Landroid/view/MenuItem;)Z
    .locals 3

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LY6/e;->a:LY6/e;

    .line 7
    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 11
    .line 12
    .line 13
    const-string v2, "Item selected "

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "TabsHost"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->v(I)Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getCurrentFocusedTab()Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->i:Lcom/swmansion/rnscreens/gamma/tabs/l$c;

    .line 49
    .line 50
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/l$c;->a()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    const/4 v1, 0x0

    .line 56
    :goto_0
    if-eqz v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getTabKey()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_2

    .line 69
    .line 70
    :cond_1
    const-string v0, "undefined"

    .line 71
    .line 72
    :cond_2
    invoke-virtual {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/s;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-virtual {p0, v0, p1, v1}, Lcom/swmansion/rnscreens/gamma/tabs/s;->h(Ljava/lang/String;IZ)V

    .line 81
    .line 82
    .line 83
    const/4 p0, 0x1

    .line 84
    return p0
.end method

.method public static final synthetic n(Lcom/swmansion/rnscreens/gamma/tabs/l;)Lcom/swmansion/rnscreens/gamma/tabs/o;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->t:Lcom/swmansion/rnscreens/gamma/tabs/o;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(Lcom/swmansion/rnscreens/gamma/tabs/l;)Landroid/widget/FrameLayout;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->l:Landroid/widget/FrameLayout;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic p(Lcom/swmansion/rnscreens/gamma/tabs/l;)Lcom/swmansion/rnscreens/gamma/tabs/e;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getCurrentFocusedTab()Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic q(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->I()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic r(Lcom/swmansion/rnscreens/gamma/tabs/l;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->M(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic s(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->N()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final t(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->p:Ljava/lang/Integer;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eq p1, v0, :cond_3

    .line 11
    .line 12
    :goto_0
    const/16 v0, 0x10

    .line 13
    .line 14
    if-eq p1, v0, :cond_2

    .line 15
    .line 16
    const/16 v0, 0x20

    .line 17
    .line 18
    if-eq p1, v0, :cond_1

    .line 19
    .line 20
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->j:Landroidx/appcompat/view/d;

    .line 21
    .line 22
    sget v1, LQ4/j;->f:I

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroidx/appcompat/view/d;->setTheme(I)V

    .line 25
    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->j:Landroidx/appcompat/view/d;

    .line 29
    .line 30
    sget v1, LQ4/j;->e:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroidx/appcompat/view/d;->setTheme(I)V

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->j:Landroidx/appcompat/view/d;

    .line 37
    .line 38
    sget v1, LQ4/j;->j:I

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Landroidx/appcompat/view/d;->setTheme(I)V

    .line 41
    .line 42
    .line 43
    :goto_1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->s:Lcom/swmansion/rnscreens/gamma/tabs/q;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Lcom/swmansion/rnscreens/gamma/tabs/q;->c(Lcom/swmansion/rnscreens/gamma/tabs/l;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->p:Ljava/lang/Integer;

    .line 53
    .line 54
    :cond_3
    return-void
.end method

.method private final u()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x40000000    # 2.0f

    .line 6
    .line 7
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->measure(II)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getRight()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getBottom()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method private final v(I)Lcom/swmansion/rnscreens/gamma/tabs/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lj7/q;->h0(Ljava/util/List;I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 8
    .line 9
    return-object p1
.end method

.method private final x(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroid/view/MenuItem;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, -0x1

    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    if-ne v2, p1, :cond_0

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move v1, v3

    .line 32
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    const/4 v1, 0x0

    .line 41
    if-eq v0, v3, :cond_2

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    move-object p1, v1

    .line 45
    :goto_2
    if-eqz p1, :cond_3

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-interface {v0, p1}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1

    .line 62
    :cond_3
    return-object v1
.end method

.method private static final z(Lcom/swmansion/rnscreens/gamma/tabs/l;J)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->q:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->u()V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final A(Lcom/swmansion/rnscreens/gamma/tabs/a;I)V
    .locals 2

    .line 1
    const-string v0, "tabScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/google/android/material/bottomnavigation/c;->getMaxItemCount()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-ge p2, v0, :cond_0

    .line 13
    .line 14
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 15
    .line 16
    invoke-direct {v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/e;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1, p2, v0}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, p0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/b;)V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/google/android/material/bottomnavigation/c;->getMaxItemCount()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    new-instance v0, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    .line 47
    const-string v1, "[RNScreens] Attempt to insert TabScreen at index "

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p2, "; BottomNavigationView supports at most "

    .line 56
    .line 57
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p1, " items"

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p2
.end method

.method public final B()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    new-instance v0, Lcom/swmansion/rnscreens/gamma/tabs/s;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-direct {v0, v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/s;-><init>(Lcom/facebook/react/bridge/ReactContext;I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/s;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 24
    .line 25
    const-string v1, "[RNScreens] TabsHost must have its tag set when registering event emitters"

    .line 26
    .line 27
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    throw v0
.end method

.method public final D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 18
    .line 19
    invoke-virtual {v1}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-virtual {v1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/b;)V

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 31
    .line 32
    .line 33
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final G(Lcom/swmansion/rnscreens/gamma/tabs/a;)V
    .locals 3

    .line 1
    const-string v0, "reactSubview"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 7
    .line 8
    new-instance v1, Lcom/swmansion/rnscreens/gamma/tabs/i;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Lcom/swmansion/rnscreens/gamma/tabs/i;-><init>(Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lcom/swmansion/rnscreens/gamma/tabs/j;

    .line 14
    .line 15
    invoke-direct {v2, v1}, Lcom/swmansion/rnscreens/gamma/tabs/j;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0, v2}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const/4 v2, 0x0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v1, v2

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1, v2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/b;)V

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 42
    .line 43
    .line 44
    :cond_1
    return-void
.end method

.method public final H(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    invoke-virtual {p1, v0}, Lcom/swmansion/rnscreens/gamma/tabs/a;->setTabScreenDelegate$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/b;)V

    .line 15
    .line 16
    .line 17
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public a(Lcom/swmansion/rnscreens/gamma/tabs/a;)V
    .locals 2

    .line 1
    const-string v0, "tabScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->x(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroid/view/MenuItem;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->s:Lcom/swmansion/rnscreens/gamma/tabs/q;

    .line 13
    .line 14
    invoke-virtual {v1, v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/q;->a(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->t:Lcom/swmansion/rnscreens/gamma/tabs/o;

    .line 18
    .line 19
    invoke-virtual {v1, v0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/o;->b(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public b(Lcom/swmansion/rnscreens/gamma/tabs/a;Z)V
    .locals 0

    .line 1
    const-string p2, "tabScreen"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->g()V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public c(Lcom/swmansion/rnscreens/safearea/d;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->r:Lcom/swmansion/rnscreens/safearea/d;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->r:Lcom/swmansion/rnscreens/safearea/d;

    .line 16
    .line 17
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 18
    .line 19
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public bridge synthetic d(Lcom/swmansion/rnscreens/gamma/tabs/a;)Landroidx/fragment/app/Fragment;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->w(Lcom/swmansion/rnscreens/gamma/tabs/a;)Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1

    .line 12
    :cond_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/view/WindowInsets;->isConsumed()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    :goto_0
    if-eqz v0, :cond_2

    .line 21
    .line 22
    goto :goto_2

    .line 23
    :cond_2
    invoke-static {p0}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    check-cast v1, Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v1, p1}, Landroid/view/View;->dispatchApplyWindowInsets(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_3
    :goto_2
    return-object p1
.end method

.method public e(Lcom/swmansion/rnscreens/gamma/tabs/a;Landroid/content/res/Configuration;)V
    .locals 1

    .line 1
    const-string v0, "tabScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "config"

    .line 7
    .line 8
    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/l;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final getEventEmitter$react_native_screens_release()Lcom/swmansion/rnscreens/gamma/tabs/s;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->m:Lcom/swmansion/rnscreens/gamma/tabs/s;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "eventEmitter"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public getInterfaceInsets()Lcom/swmansion/rnscreens/safearea/a;
    .locals 3

    .line 1
    new-instance v0, Lcom/swmansion/rnscreens/safearea/a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    int-to-float v1, v1

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v2, v2, v2, v1}, Lcom/swmansion/rnscreens/safearea/a;-><init>(FFFF)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public final getNativeContainerBackgroundColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->J:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getReactContext()Lcom/facebook/react/uimanager/ThemedReactContext;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->g:Lcom/facebook/react/uimanager/ThemedReactContext;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getTabBarBackgroundColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->u:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarHidden()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->I:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0
.end method

.method public final getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->v:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemIconColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->x:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemIconColorActive()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->z:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemLabelVisibilityMode()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->H:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getTabBarItemRippleColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->G:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getTabBarItemTitleFontColor()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->A:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemTitleFontColorActive()Ljava/lang/Integer;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->B:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemTitleFontFamily()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->y:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    return-object v0
.end method

.method public final getTabBarItemTitleFontSize()Ljava/lang/Float;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->C:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Float;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getTabBarItemTitleFontSizeActive()Ljava/lang/Float;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->D:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/Float;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getTabBarItemTitleFontStyle()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->F:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
.end method

.method public final getTabBarItemTitleFontWeight()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->E:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/String;

    .line 14
    .line 15
    return-object v0
.end method

.method protected onAttachedToWindow()V
    .locals 4

    .line 1
    sget-object v0, LY6/e;->a:LY6/e;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    new-instance v2, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    .line 12
    const-string v3, "TabsHost ["

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, "] attached to window"

    .line 21
    .line 22
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "TabsHost"

    .line 30
    .line 31
    invoke-virtual {v0, v2, v1}, LY6/e;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 35
    .line 36
    .line 37
    sget-object v0, LQ6/b;->a:LQ6/b;

    .line 38
    .line 39
    invoke-virtual {v0, p0}, LQ6/b;->a(Landroid/view/ViewGroup;)Landroidx/fragment/app/FragmentManager;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    iput-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->n:Landroidx/fragment/app/FragmentManager;

    .line 46
    .line 47
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->h:Lcom/swmansion/rnscreens/gamma/tabs/l$b;

    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->b()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/swmansion/rnscreens/gamma/tabs/l$b;->h()V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v1, "[RNScreens] Nullish fragment manager - can\'t run container operations"

    .line 59
    .line 60
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iget p1, p1, Landroid/content/res/Configuration;->uiMode:I

    .line 7
    .line 8
    and-int/lit8 p1, p1, 0x30

    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->t(I)V

    .line 11
    .line 12
    .line 13
    :cond_0
    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    instance-of p2, p1, Lcom/google/android/material/bottomnavigation/c;

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    sub-int/2addr p9, p7

    .line 6
    sub-int/2addr p5, p3

    .line 7
    if-eq p5, p9, :cond_0

    .line 8
    .line 9
    invoke-static {p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {p0, p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->K(Ljava/lang/Integer;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void

    .line 17
    :cond_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string p3, "[RNScreens] TabsHost\'s onLayoutChange expects BottomNavigationView, received "

    .line 23
    .line 24
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string p1, " instead"

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, Ljava/lang/IllegalArgumentException;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw p2
.end method

.method public requestLayout()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lcom/swmansion/rnscreens/gamma/tabs/l;->C()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final setEventEmitter$react_native_screens_release(Lcom/swmansion/rnscreens/gamma/tabs/s;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->m:Lcom/swmansion/rnscreens/gamma/tabs/s;

    .line 7
    .line 8
    return-void
.end method

.method public final setNativeContainerBackgroundColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->J:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xf

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public setOnInterfaceInsetsChangeListener(Lcom/swmansion/rnscreens/safearea/d;)V
    .locals 1

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->r:Lcom/swmansion/rnscreens/safearea/d;

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->k:Lcom/google/android/material/bottomnavigation/c;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->r:Lcom/swmansion/rnscreens/safearea/d;

    .line 16
    .line 17
    return-void
.end method

.method public final setTabBarBackgroundColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->u:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarHidden(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->I:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setTabBarItemActiveIndicatorColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->v:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemActiveIndicatorEnabled(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->w:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final setTabBarItemIconColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->x:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemIconColorActive(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->z:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemLabelVisibilityMode(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->H:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xd

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTabBarItemRippleColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->G:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTabBarItemTitleFontColor(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->A:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemTitleFontColorActive(Ljava/lang/Integer;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->B:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemTitleFontFamily(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->y:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setTabBarItemTitleFontSize(Ljava/lang/Float;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->C:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTabBarItemTitleFontSizeActive(Ljava/lang/Float;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->D:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTabBarItemTitleFontStyle(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->F:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final setTabBarItemTitleFontWeight(Ljava/lang/String;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->E:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    invoke-interface {v0, p0, v1, p1}, Lkotlin/properties/d;->setValue(Ljava/lang/Object;LC7/k;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public w(Lcom/swmansion/rnscreens/gamma/tabs/a;)Lcom/swmansion/rnscreens/gamma/tabs/e;
    .locals 3

    .line 1
    const-string v0, "tabScreen"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->o:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/swmansion/rnscreens/gamma/tabs/e;->w()Lcom/swmansion/rnscreens/gamma/tabs/a;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    if-ne v2, p1, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v1, 0x0

    .line 33
    :goto_0
    check-cast v1, Lcom/swmansion/rnscreens/gamma/tabs/e;

    .line 34
    .line 35
    return-object v1
.end method

.method public final y()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/l;->w:Lkotlin/properties/d;

    .line 2
    .line 3
    sget-object v1, Lcom/swmansion/rnscreens/gamma/tabs/l;->M:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-interface {v0, p0, v1}, Lkotlin/properties/d;->getValue(Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
