.class public final Lcom/swmansion/rnscreens/gamma/tabs/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Landroidx/appcompat/view/d;

.field private final b:Lcom/google/android/material/bottomnavigation/c;


# direct methods
.method public constructor <init>(Landroidx/appcompat/view/d;Lcom/google/android/material/bottomnavigation/c;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "bottomNavigationView"

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
    iput-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->a:Landroidx/appcompat/view/d;

    .line 15
    .line 16
    iput-object p2, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 17
    .line 18
    return-void
.end method

.method private final a(I)I
    .locals 3

    .line 1
    new-instance v0, Landroid/util/TypedValue;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->a:Landroidx/appcompat/view/d;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroidx/appcompat/view/d;->getTheme()Landroid/content/res/Resources$Theme;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, p1, v0, v2}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 14
    .line 15
    .line 16
    iget p1, v0, Landroid/util/TypedValue;->data:I

    .line 17
    .line 18
    return p1
.end method


# virtual methods
.method public final b(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V
    .locals 3

    .line 1
    const-string v0, "menuItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tabScreen"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/google/android/material/navigation/NavigationBarView;->getMenu()Landroid/view/Menu;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const-string v1, "getMenu(...)"

    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Landroidx/core/view/A;->a(Landroid/view/Menu;)LO8/i;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0, p1}, LO8/l;->E(LO8/i;Ljava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getBadgeValue()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    iget-object p2, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, Lcom/google/android/material/navigation/NavigationBarView;->d(I)Lcom/google/android/material/badge/a;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    const/4 p2, 0x0

    .line 45
    invoke-virtual {p1, p2}, Lcom/google/android/material/badge/a;->X(Z)V

    .line 46
    .line 47
    .line 48
    :cond_0
    return-void

    .line 49
    :cond_1
    invoke-static {v0}, LP8/q;->n(Ljava/lang/String;)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    iget-object v2, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 54
    .line 55
    invoke-virtual {v2, p1}, Lcom/google/android/material/navigation/NavigationBarView;->e(I)Lcom/google/android/material/badge/a;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const-string v2, "getOrCreateBadge(...)"

    .line 60
    .line 61
    invoke-static {p1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v2, 0x1

    .line 65
    invoke-virtual {p1, v2}, Lcom/google/android/material/badge/a;->X(Z)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lcom/google/android/material/badge/a;->f()V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/google/android/material/badge/a;->e()V

    .line 72
    .line 73
    .line 74
    if-eqz v1, :cond_2

    .line 75
    .line 76
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, Lcom/google/android/material/badge/a;->V(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_2
    const-string v1, ""

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Lcom/google/android/material/badge/a;->W(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :cond_3
    :goto_0
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getTabBarItemBadgeTextColor()Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-eqz v0, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    goto :goto_1

    .line 106
    :cond_4
    sget v0, LQ4/a;->h:I

    .line 107
    .line 108
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    :goto_1
    invoke-virtual {p1, v0}, Lcom/google/android/material/badge/a;->U(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getTabBarItemBadgeBackgroundColor()Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p2

    .line 119
    if-eqz p2, :cond_5

    .line 120
    .line 121
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 122
    .line 123
    .line 124
    move-result p2

    .line 125
    goto :goto_2

    .line 126
    :cond_5
    sget p2, Lf/a;->v:I

    .line 127
    .line 128
    invoke-direct {p0, p2}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    :goto_2
    invoke-virtual {p1, p2}, Lcom/google/android/material/badge/a;->S(I)V

    .line 133
    .line 134
    .line 135
    return-void
.end method

.method public final c(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 11

    .line 1
    const-string v0, "tabsHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v2, "null cannot be cast to non-null type android.view.ViewGroup"

    .line 14
    .line 15
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    check-cast v0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-static {v0}, Landroidx/core/view/g0;->a(Landroid/view/ViewGroup;)LO8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-interface {v0}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_7

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    check-cast v2, Landroid/view/View;

    .line 39
    .line 40
    sget v3, LQ4/e;->N:I

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, Landroid/widget/TextView;

    .line 47
    .line 48
    sget v4, LQ4/e;->O:I

    .line 49
    .line 50
    invoke-virtual {v2, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    check-cast v2, Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontStyle()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    const-string v5, "italic"

    .line 61
    .line 62
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontWeight()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    const-string v6, "bold"

    .line 71
    .line 72
    invoke-static {v5, v6}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_0

    .line 77
    .line 78
    const/16 v5, 0x2bc

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_0
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontWeight()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    if-eqz v5, :cond_1

    .line 86
    .line 87
    invoke-static {v5}, LP8/q;->n(Ljava/lang/String;)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    goto :goto_1

    .line 98
    :cond_1
    const/16 v5, 0x190

    .line 99
    .line 100
    :goto_1
    sget-object v6, Lcom/facebook/react/common/assets/ReactFontManager;->Companion:Lcom/facebook/react/common/assets/ReactFontManager$Companion;

    .line 101
    .line 102
    invoke-virtual {v6}, Lcom/facebook/react/common/assets/ReactFontManager$Companion;->getInstance()Lcom/facebook/react/common/assets/ReactFontManager;

    .line 103
    .line 104
    .line 105
    move-result-object v6

    .line 106
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontFamily()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    if-nez v7, :cond_2

    .line 111
    .line 112
    const-string v7, ""

    .line 113
    .line 114
    :cond_2
    iget-object v8, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->a:Landroidx/appcompat/view/d;

    .line 115
    .line 116
    invoke-virtual {v8}, Landroidx/appcompat/view/d;->getAssets()Landroid/content/res/AssetManager;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-virtual {v6, v7, v5, v4, v8}, Lcom/facebook/react/common/assets/ReactFontManager;->getTypeface(Ljava/lang/String;IZLandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontSize()Ljava/lang/Float;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const/4 v6, 0x2

    .line 129
    const/4 v7, 0x0

    .line 130
    const/4 v8, 0x0

    .line 131
    if-eqz v5, :cond_4

    .line 132
    .line 133
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    cmpl-float v9, v9, v8

    .line 138
    .line 139
    if-lez v9, :cond_3

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    move-object v5, v7

    .line 143
    :goto_2
    if-eqz v5, :cond_4

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    invoke-static {v5, v8, v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP$default(FFILjava/lang/Object;)F

    .line 150
    .line 151
    .line 152
    move-result v5

    .line 153
    goto :goto_3

    .line 154
    :cond_4
    iget-object v5, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->a:Landroidx/appcompat/view/d;

    .line 155
    .line 156
    invoke-virtual {v5}, Landroidx/appcompat/view/d;->getResources()Landroid/content/res/Resources;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    sget v9, LQ4/c;->i:I

    .line 161
    .line 162
    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getDimension(I)F

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    :goto_3
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontSizeActive()Ljava/lang/Float;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    if-eqz v9, :cond_6

    .line 171
    .line 172
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result v10

    .line 176
    cmpl-float v10, v10, v8

    .line 177
    .line 178
    if-lez v10, :cond_5

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    move-object v9, v7

    .line 182
    :goto_4
    if-eqz v9, :cond_6

    .line 183
    .line 184
    invoke-virtual {v9}, Ljava/lang/Number;->floatValue()F

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    invoke-static {v9, v8, v6, v7}, Lcom/facebook/react/uimanager/PixelUtil;->toPixelFromSP$default(FFILjava/lang/Object;)F

    .line 189
    .line 190
    .line 191
    move-result v6

    .line 192
    goto :goto_5

    .line 193
    :cond_6
    iget-object v6, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->a:Landroidx/appcompat/view/d;

    .line 194
    .line 195
    invoke-virtual {v6}, Landroidx/appcompat/view/d;->getResources()Landroid/content/res/Resources;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    sget v7, LQ4/c;->i:I

    .line 200
    .line 201
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimension(I)F

    .line 202
    .line 203
    .line 204
    move-result v6

    .line 205
    :goto_5
    invoke-virtual {v2, v1, v5}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v3, v1, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 215
    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_7
    return-void
.end method

.method public final d(Landroid/view/MenuItem;Lcom/swmansion/rnscreens/gamma/tabs/a;)V
    .locals 2

    .line 1
    const-string v0, "menuItem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "tabScreen"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Landroid/view/MenuItem;->getTitle()Ljava/lang/CharSequence;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getTabTitle()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getTabTitle()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-interface {p1}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p2}, Lcom/swmansion/rnscreens/gamma/tabs/a;->getIcon()Landroid/graphics/drawable/Drawable;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-interface {p1, p2}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 51
    .line 52
    .line 53
    :cond_1
    return-void
.end method

.method public final e(Lcom/swmansion/rnscreens/gamma/tabs/l;)V
    .locals 5

    .line 1
    const-string v0, "tabsHost"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarHidden()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    move v1, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/16 v1, 0x8

    .line 18
    .line 19
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarBackgroundColor()Ljava/lang/Integer;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    sget v1, LQ4/a;->L:I

    .line 36
    .line 37
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 42
    .line 43
    .line 44
    const v0, -0x10100a0

    .line 45
    .line 46
    .line 47
    filled-new-array {v0}, [I

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const v1, 0x10100a0

    .line 52
    .line 53
    .line 54
    filled-new-array {v1}, [I

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    filled-new-array {v0, v1}, [[I

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontColor()Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    sget v1, LQ4/a;->t:I

    .line 74
    .line 75
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    :goto_2
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontColorActive()Ljava/lang/Integer;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    if-eqz v3, :cond_3

    .line 84
    .line 85
    :goto_3
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    goto :goto_4

    .line 90
    :cond_3
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemTitleFontColor()Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object v3

    .line 94
    if-eqz v3, :cond_4

    .line 95
    .line 96
    goto :goto_3

    .line 97
    :cond_4
    sget v3, LQ4/a;->F:I

    .line 98
    .line 99
    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    :goto_4
    filled-new-array {v1, v3}, [I

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    iget-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 108
    .line 109
    new-instance v4, Landroid/content/res/ColorStateList;

    .line 110
    .line 111
    invoke-direct {v4, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarView;->setItemTextColor(Landroid/content/res/ColorStateList;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemIconColor()Ljava/lang/Integer;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    if-eqz v1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v1

    .line 127
    goto :goto_5

    .line 128
    :cond_5
    sget v1, LQ4/a;->t:I

    .line 129
    .line 130
    invoke-direct {p0, v1}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    :goto_5
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemIconColorActive()Ljava/lang/Integer;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    if-eqz v3, :cond_6

    .line 139
    .line 140
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    goto :goto_7

    .line 145
    :cond_6
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemIconColor()Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    if-eqz v3, :cond_7

    .line 150
    .line 151
    goto :goto_6

    .line 152
    :cond_7
    sget v3, LQ4/a;->o:I

    .line 153
    .line 154
    invoke-direct {p0, v3}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 155
    .line 156
    .line 157
    move-result v3

    .line 158
    :goto_7
    filled-new-array {v1, v3}, [I

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    iget-object v3, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 163
    .line 164
    new-instance v4, Landroid/content/res/ColorStateList;

    .line 165
    .line 166
    invoke-direct {v4, v0, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3, v4}, Lcom/google/android/material/navigation/NavigationBarView;->setItemIconTintList(Landroid/content/res/ColorStateList;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemLabelVisibilityMode()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    if-eqz v0, :cond_d

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    const v3, -0x3c4616d

    .line 183
    .line 184
    .line 185
    if-eq v1, v3, :cond_b

    .line 186
    .line 187
    const v3, 0x4705f29b

    .line 188
    .line 189
    .line 190
    if-eq v1, v3, :cond_a

    .line 191
    .line 192
    const v2, 0x6243a1da

    .line 193
    .line 194
    .line 195
    if-eq v1, v2, :cond_8

    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_8
    const-string v1, "unlabeled"

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 201
    .line 202
    .line 203
    move-result v0

    .line 204
    if-nez v0, :cond_9

    .line 205
    .line 206
    goto :goto_8

    .line 207
    :cond_9
    const/4 v2, 0x2

    .line 208
    goto :goto_9

    .line 209
    :cond_a
    const-string v1, "selected"

    .line 210
    .line 211
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v0

    .line 215
    if-eqz v0, :cond_d

    .line 216
    .line 217
    goto :goto_9

    .line 218
    :cond_b
    const-string v1, "labeled"

    .line 219
    .line 220
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_c

    .line 225
    .line 226
    goto :goto_8

    .line 227
    :cond_c
    const/4 v2, 0x1

    .line 228
    goto :goto_9

    .line 229
    :cond_d
    :goto_8
    const/4 v2, -0x1

    .line 230
    :goto_9
    iget-object v0, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 231
    .line 232
    invoke-virtual {v0, v2}, Lcom/google/android/material/navigation/NavigationBarView;->setLabelVisibilityMode(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemRippleColor()Ljava/lang/Integer;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    if-eqz v0, :cond_e

    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v0

    .line 245
    goto :goto_a

    .line 246
    :cond_e
    sget v0, LQ4/a;->d0:I

    .line 247
    .line 248
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    :goto_a
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 253
    .line 254
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-virtual {v1, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setItemRippleColor(Landroid/content/res/ColorStateList;)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->getTabBarItemActiveIndicatorColor()Ljava/lang/Integer;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    if-eqz v0, :cond_f

    .line 266
    .line 267
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 268
    .line 269
    .line 270
    move-result v0

    .line 271
    goto :goto_b

    .line 272
    :cond_f
    sget v0, LQ4/a;->G:I

    .line 273
    .line 274
    invoke-direct {p0, v0}, Lcom/swmansion/rnscreens/gamma/tabs/p;->a(I)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    :goto_b
    iget-object v1, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 279
    .line 280
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/gamma/tabs/l;->y()Z

    .line 281
    .line 282
    .line 283
    move-result p1

    .line 284
    invoke-virtual {v1, p1}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorEnabled(Z)V

    .line 285
    .line 286
    .line 287
    iget-object p1, p0, Lcom/swmansion/rnscreens/gamma/tabs/p;->b:Lcom/google/android/material/bottomnavigation/c;

    .line 288
    .line 289
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    invoke-virtual {p1, v0}, Lcom/google/android/material/navigation/NavigationBarView;->setItemActiveIndicatorColor(Landroid/content/res/ColorStateList;)V

    .line 294
    .line 295
    .line 296
    return-void
.end method
