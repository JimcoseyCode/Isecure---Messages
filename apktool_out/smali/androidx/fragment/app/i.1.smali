.class public final Landroidx/fragment/app/i;
.super Landroidx/fragment/app/Q;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/fragment/app/i$a;,
        Landroidx/fragment/app/i$b;,
        Landroidx/fragment/app/i$c;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 1

    .line 1
    const-string v0, "container"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Landroidx/fragment/app/Q;-><init>(Landroid/view/ViewGroup;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic A(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/fragment/app/i;->N(Ljava/util/ArrayList;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B(Landroidx/fragment/app/i$c;Landroidx/fragment/app/Q$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/i;->O(Landroidx/fragment/app/i$c;Landroidx/fragment/app/Q$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic C(Landroidx/fragment/app/L;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/i;->M(Landroidx/fragment/app/L;Landroid/view/View;Landroid/graphics/Rect;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final D(Landroidx/fragment/app/Q$c;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 6
    .line 7
    invoke-virtual {p1}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const-string v1, "view"

    .line 12
    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroidx/fragment/app/Q$c$b;->j(Landroid/view/View;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method private final E(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Landroid/view/ViewGroup;

    .line 7
    .line 8
    invoke-static {v0}, Landroidx/core/view/f0;->c(Landroid/view/ViewGroup;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_3

    .line 19
    .line 20
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, p2, :cond_3

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-nez v3, :cond_1

    .line 40
    .line 41
    const-string v3, "child"

    .line 42
    .line 43
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0, p1, v2}, Landroidx/fragment/app/i;->E(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    :cond_3
    return-void
.end method

.method private static final F(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V
    .locals 1

    .line 1
    const-string v0, "$awaitingContainerChanges"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$operation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "this$0"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-direct {p2, p1}, Landroidx/fragment/app/i;->D(Landroidx/fragment/app/Q$c;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method private final G(Ljava/util/Map;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p2}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p2, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_2

    .line 22
    .line 23
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-nez v3, :cond_1

    .line 32
    .line 33
    const-string v3, "child"

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0, p1, v2}, Landroidx/fragment/app/i;->G(Ljava/util/Map;Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method

.method private final H(Lm0/a;Ljava/util/Collection;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lm0/a;->entrySet()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "entries"

    .line 6
    .line 7
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Landroidx/fragment/app/i$d;

    .line 11
    .line 12
    invoke-direct {v0, p2}, Landroidx/fragment/app/i$d;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p1, v0}, Lj7/q;->I(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final I(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V
    .locals 15

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v6

    .line 9
    new-instance v7, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v8

    .line 18
    const/4 v9, 0x0

    .line 19
    move v0, v9

    .line 20
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const-string v2, "context"

    .line 25
    .line 26
    const/4 v10, 0x2

    .line 27
    if-eqz v1, :cond_8

    .line 28
    .line 29
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    move-object v5, v1

    .line 34
    check-cast v5, Landroidx/fragment/app/i$a;

    .line 35
    .line 36
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->d()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->a()V

    .line 43
    .line 44
    .line 45
    :goto_1
    move-object/from16 v12, p4

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    invoke-static {v6, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v5, v6}, Landroidx/fragment/app/i$a;->e(Landroid/content/Context;)Landroidx/fragment/app/r$a;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    if-nez v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->a()V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    iget-object v11, v1, Landroidx/fragment/app/r$a;->b:Landroid/animation/Animator;

    .line 62
    .line 63
    if-nez v11, :cond_2

    .line 64
    .line 65
    invoke-interface {v7, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    move-object/from16 v12, p4

    .line 78
    .line 79
    invoke-interface {v12, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    invoke-static {v10}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    :cond_3
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->a()V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_4
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v2, Landroidx/fragment/app/Q$c$b;->j:Landroidx/fragment/app/Q$c$b;

    .line 109
    .line 110
    const/4 v13, 0x1

    .line 111
    if-ne v0, v2, :cond_5

    .line 112
    .line 113
    move v3, v13

    .line 114
    goto :goto_2

    .line 115
    :cond_5
    move v3, v9

    .line 116
    :goto_2
    move-object/from16 v14, p2

    .line 117
    .line 118
    if-eqz v3, :cond_6

    .line 119
    .line 120
    invoke-interface {v14, v4}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :cond_6
    iget-object v2, v1, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    new-instance v0, Landroidx/fragment/app/i$e;

    .line 133
    .line 134
    move-object v1, p0

    .line 135
    invoke-direct/range {v0 .. v5}, Landroidx/fragment/app/i$e;-><init>(Landroidx/fragment/app/i;Landroid/view/View;ZLandroidx/fragment/app/Q$c;Landroidx/fragment/app/i$a;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v11, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v11, v2}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v11}, Landroid/animation/Animator;->start()V

    .line 145
    .line 146
    .line 147
    invoke-static {v10}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_7

    .line 152
    .line 153
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    :cond_7
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->c()LD0/d;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    new-instance v2, Landroidx/fragment/app/c;

    .line 161
    .line 162
    invoke-direct {v2, v11, v4}, Landroidx/fragment/app/c;-><init>(Landroid/animation/Animator;Landroidx/fragment/app/Q$c;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0, v2}, LD0/d;->c(LD0/d$a;)V

    .line 166
    .line 167
    .line 168
    move v0, v13

    .line 169
    goto/16 :goto_0

    .line 170
    .line 171
    :cond_8
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 176
    .line 177
    .line 178
    move-result v4

    .line 179
    if-eqz v4, :cond_11

    .line 180
    .line 181
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    check-cast v4, Landroidx/fragment/app/i$a;

    .line 186
    .line 187
    invoke-virtual {v4}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v5}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 192
    .line 193
    .line 194
    move-result-object v7

    .line 195
    if-eqz p3, :cond_a

    .line 196
    .line 197
    invoke-static {v10}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 198
    .line 199
    .line 200
    move-result v5

    .line 201
    if-eqz v5, :cond_9

    .line 202
    .line 203
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    :cond_9
    invoke-virtual {v4}, Landroidx/fragment/app/i$b;->a()V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    if-eqz v0, :cond_c

    .line 211
    .line 212
    invoke-static {v10}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 213
    .line 214
    .line 215
    move-result v5

    .line 216
    if-eqz v5, :cond_b

    .line 217
    .line 218
    invoke-static {v7}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    :cond_b
    invoke-virtual {v4}, Landroidx/fragment/app/i$b;->a()V

    .line 222
    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_c
    iget-object v7, v7, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 226
    .line 227
    invoke-static {v6, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {v4, v6}, Landroidx/fragment/app/i$a;->e(Landroid/content/Context;)Landroidx/fragment/app/r$a;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    const-string v9, "Required value was null."

    .line 235
    .line 236
    if-eqz v8, :cond_10

    .line 237
    .line 238
    iget-object v8, v8, Landroidx/fragment/app/r$a;->a:Landroid/view/animation/Animation;

    .line 239
    .line 240
    if-eqz v8, :cond_f

    .line 241
    .line 242
    invoke-virtual {v5}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    sget-object v11, Landroidx/fragment/app/Q$c$b;->h:Landroidx/fragment/app/Q$c$b;

    .line 247
    .line 248
    if-eq v9, v11, :cond_d

    .line 249
    .line 250
    invoke-virtual {v7, v8}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4}, Landroidx/fragment/app/i$b;->a()V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_d
    invoke-virtual {p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-virtual {v9, v7}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    .line 262
    .line 263
    .line 264
    new-instance v9, Landroidx/fragment/app/r$b;

    .line 265
    .line 266
    invoke-virtual {p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 267
    .line 268
    .line 269
    move-result-object v11

    .line 270
    invoke-direct {v9, v8, v11, v7}, Landroidx/fragment/app/r$b;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    .line 271
    .line 272
    .line 273
    new-instance v8, Landroidx/fragment/app/i$f;

    .line 274
    .line 275
    invoke-direct {v8, v5, p0, v7, v4}, Landroidx/fragment/app/i$f;-><init>(Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;Landroid/view/View;Landroidx/fragment/app/i$a;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v9, v8}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v7, v9}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 282
    .line 283
    .line 284
    invoke-static {v10}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 285
    .line 286
    .line 287
    move-result v8

    .line 288
    if-eqz v8, :cond_e

    .line 289
    .line 290
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 291
    .line 292
    .line 293
    :cond_e
    :goto_4
    invoke-virtual {v4}, Landroidx/fragment/app/i$b;->c()LD0/d;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    new-instance v9, Landroidx/fragment/app/d;

    .line 298
    .line 299
    invoke-direct {v9, v7, p0, v4, v5}, Landroidx/fragment/app/d;-><init>(Landroid/view/View;Landroidx/fragment/app/i;Landroidx/fragment/app/i$a;Landroidx/fragment/app/Q$c;)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v9}, LD0/d;->c(LD0/d$a;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_3

    .line 306
    .line 307
    :cond_f
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 308
    .line 309
    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 310
    .line 311
    .line 312
    throw v0

    .line 313
    :cond_10
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 314
    .line 315
    invoke-direct {v0, v9}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    throw v0

    .line 319
    :cond_11
    return-void
.end method

.method private static final J(Landroid/animation/Animator;Landroidx/fragment/app/Q$c;)V
    .locals 1

    .line 1
    const-string v0, "$operation"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/animation/Animator;->end()V

    .line 7
    .line 8
    .line 9
    const/4 p0, 0x2

    .line 10
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private static final K(Landroid/view/View;Landroidx/fragment/app/i;Landroidx/fragment/app/i$a;Landroidx/fragment/app/Q$c;)V
    .locals 1

    .line 1
    const-string v0, "this$0"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$animationInfo"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "$operation"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->clearAnimation()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1, p0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Landroidx/fragment/app/i$b;->a()V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x2

    .line 30
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-static {p3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method private final L(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;)Ljava/util/Map;
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    .line 1
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 2
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_0
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Landroidx/fragment/app/i$c;

    .line 4
    invoke-virtual {v8}, Landroidx/fragment/app/i$b;->d()Z

    move-result v8

    if-nez v8, :cond_0

    .line 5
    invoke-interface {v5, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_1
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Landroidx/fragment/app/i$c;

    .line 8
    invoke-virtual {v8}, Landroidx/fragment/app/i$c;->e()Landroidx/fragment/app/L;

    move-result-object v8

    if-eqz v8, :cond_2

    .line 9
    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_3
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v7, 0x0

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/fragment/app/i$c;

    .line 11
    invoke-virtual {v8}, Landroidx/fragment/app/i$c;->e()Landroidx/fragment/app/L;

    move-result-object v9

    if-eqz v7, :cond_5

    if-ne v9, v7, :cond_4

    goto :goto_3

    .line 12
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    invoke-virtual {v8}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v2

    .line 14
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 15
    const-string v2, " returned Transition "

    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    invoke-virtual {v8}, Landroidx/fragment/app/i$c;->h()Ljava/lang/Object;

    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    const-string v2, " which uses a different Transition type than other Fragments."

    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 21
    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_3
    move-object v7, v9

    goto :goto_2

    :cond_6
    if-nez v7, :cond_7

    .line 22
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/fragment/app/i$c;

    .line 23
    invoke-virtual {v2}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v3

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v4, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    invoke-virtual {v2}, Landroidx/fragment/app/i$b;->a()V

    goto :goto_4

    .line 25
    :cond_7
    new-instance v5, Landroid/view/View;

    invoke-virtual {v0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-direct {v5, v8}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 26
    new-instance v15, Landroid/graphics/Rect;

    invoke-direct {v15}, Landroid/graphics/Rect;-><init>()V

    .line 27
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 28
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 29
    new-instance v9, Lm0/a;

    invoke-direct {v9}, Lm0/a;-><init>()V

    .line 30
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v16

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v17, 0x0

    :goto_5
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const/16 v18, 0x2

    move-object/from16 v19, v12

    if-eqz v14, :cond_12

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/fragment/app/i$c;

    .line 31
    invoke-virtual {v14}, Landroidx/fragment/app/i$c;->i()Z

    move-result v20

    if-eqz v20, :cond_11

    if-eqz v2, :cond_11

    if-eqz v3, :cond_11

    .line 32
    invoke-virtual {v14}, Landroidx/fragment/app/i$c;->g()Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v7, v14}, Landroidx/fragment/app/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 33
    invoke-virtual {v7, v14}, Landroidx/fragment/app/L;->u(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v14

    .line 34
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v11

    const-string v12, "lastIn.fragment.sharedElementSourceNames"

    invoke-static {v11, v12}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->getSharedElementSourceNames()Ljava/util/ArrayList;

    move-result-object v12

    const-string v6, "firstOut.fragment.sharedElementSourceNames"

    invoke-static {v12, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v6

    move-object/from16 v22, v13

    const-string v13, "firstOut.fragment.sharedElementTargetNames"

    invoke-static {v6, v13}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v13

    move-object/from16 v23, v4

    const/4 v4, 0x0

    :goto_6
    if-ge v4, v13, :cond_9

    move/from16 v19, v13

    .line 38
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v13

    move-object/from16 v24, v6

    const/4 v6, -0x1

    if-eq v13, v6, :cond_8

    .line 39
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v11, v13, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_8
    add-int/lit8 v4, v4, 0x1

    move/from16 v13, v19

    move-object/from16 v6, v24

    goto :goto_6

    .line 40
    :cond_9
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v4

    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getSharedElementTargetNames()Ljava/util/ArrayList;

    move-result-object v4

    const-string v6, "lastIn.fragment.sharedElementTargetNames"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_a

    .line 41
    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Landroidx/core/app/u;

    .line 42
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v6

    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Landroidx/core/app/u;

    const/4 v6, 0x0

    .line 43
    invoke-static {v6, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    goto :goto_7

    :cond_a
    const/4 v6, 0x0

    .line 44
    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->getEnterTransitionCallback()Landroidx/core/app/u;

    .line 45
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v12

    invoke-virtual {v12}, Landroidx/fragment/app/Fragment;->getExitTransitionCallback()Landroidx/core/app/u;

    .line 46
    invoke-static {v6, v6}, Li7/t;->a(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v12

    .line 47
    :goto_7
    invoke-virtual {v12}, Lkotlin/Pair;->a()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    invoke-virtual {v12}, Lkotlin/Pair;->b()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Landroid/support/v4/media/session/b;->a(Ljava/lang/Object;)V

    .line 48
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v12, 0x0

    :goto_8
    if-ge v12, v6, :cond_b

    .line 49
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    .line 50
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v19

    move/from16 v24, v6

    move-object/from16 v6, v19

    check-cast v6, Ljava/lang/String;

    .line 51
    invoke-interface {v9, v13, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v12, v12, 0x1

    move/from16 v6, v24

    goto :goto_8

    .line 52
    :cond_b
    invoke-static/range {v18 .. v18}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    move-result v6

    if-eqz v6, :cond_d

    .line 53
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_9

    .line 54
    :cond_c
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_a
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_d

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    goto :goto_a

    .line 55
    :cond_d
    new-instance v6, Lm0/a;

    invoke-direct {v6}, Lm0/a;-><init>()V

    .line 56
    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v12

    iget-object v12, v12, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    const-string v13, "firstOut.fragment.mView"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v6, v12}, Landroidx/fragment/app/i;->G(Ljava/util/Map;Landroid/view/View;)V

    .line 57
    invoke-virtual {v6, v11}, Lm0/a;->n(Ljava/util/Collection;)Z

    .line 58
    invoke-virtual {v6}, Lm0/a;->keySet()Ljava/util/Set;

    move-result-object v12

    invoke-virtual {v9, v12}, Lm0/a;->n(Ljava/util/Collection;)Z

    .line 59
    new-instance v12, Lm0/a;

    invoke-direct {v12}, Lm0/a;-><init>()V

    .line 60
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v13

    iget-object v13, v13, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    move-object/from16 v24, v5

    const-string v5, "lastIn.fragment.mView"

    invoke-static {v13, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v12, v13}, Landroidx/fragment/app/i;->G(Ljava/util/Map;Landroid/view/View;)V

    .line 61
    invoke-virtual {v12, v4}, Lm0/a;->n(Ljava/util/Collection;)Z

    .line 62
    invoke-virtual {v9}, Lm0/a;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v12, v5}, Lm0/a;->n(Ljava/util/Collection;)Z

    .line 63
    invoke-static {v9, v12}, Landroidx/fragment/app/J;->c(Lm0/a;Lm0/a;)V

    .line 64
    invoke-virtual {v9}, Lm0/a;->keySet()Ljava/util/Set;

    move-result-object v5

    const-string v13, "sharedElementNameMapping.keys"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v6, v5}, Landroidx/fragment/app/i;->H(Lm0/a;Ljava/util/Collection;)V

    .line 65
    invoke-virtual {v9}, Lm0/a;->values()Ljava/util/Collection;

    move-result-object v5

    const-string v13, "sharedElementNameMapping.values"

    invoke-static {v5, v13}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v12, v5}, Landroidx/fragment/app/i;->H(Lm0/a;Ljava/util/Collection;)V

    .line 66
    invoke-virtual {v9}, Lm0/i;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_e

    .line 67
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 68
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    move-object/from16 v13, v22

    move-object/from16 v4, v23

    move-object/from16 v5, v24

    const/4 v12, 0x0

    goto/16 :goto_5

    .line 69
    :cond_e
    invoke-virtual {v3}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v5

    invoke-virtual {v2}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v13

    move-object/from16 v25, v9

    const/4 v9, 0x1

    invoke-static {v5, v13, v1, v6, v9}, Landroidx/fragment/app/J;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLm0/a;Z)V

    .line 70
    invoke-virtual {v0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v5

    new-instance v13, Landroidx/fragment/app/e;

    invoke-direct {v13, v3, v2, v1, v12}, Landroidx/fragment/app/e;-><init>(Landroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;ZLm0/a;)V

    invoke-static {v5, v13}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    .line 71
    invoke-virtual {v6}, Lm0/a;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 72
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_f

    const/4 v5, 0x0

    .line 73
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    .line 74
    invoke-virtual {v6, v11}, Lm0/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    .line 75
    invoke-virtual {v7, v14, v6}, Landroidx/fragment/app/L;->p(Ljava/lang/Object;Landroid/view/View;)V

    goto :goto_b

    :cond_f
    const/4 v5, 0x0

    move-object/from16 v6, v22

    .line 76
    :goto_b
    invoke-virtual {v12}, Lm0/a;->values()Ljava/util/Collection;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 77
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-nez v11, :cond_10

    .line 78
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 79
    invoke-virtual {v12, v4}, Lm0/a;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/view/View;

    if-eqz v4, :cond_10

    .line 80
    invoke-virtual {v0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v11

    new-instance v12, Landroidx/fragment/app/f;

    invoke-direct {v12, v7, v4, v15}, Landroidx/fragment/app/f;-><init>(Landroidx/fragment/app/L;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v11, v12}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    move/from16 v17, v9

    :cond_10
    move-object/from16 v4, v24

    .line 81
    invoke-virtual {v7, v14, v4, v8}, Landroidx/fragment/app/L;->s(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v9, 0x0

    move-object v13, v8

    move-object v8, v14

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v18, v13

    move-object v13, v8

    move-object/from16 v20, v18

    .line 82
    invoke-virtual/range {v7 .. v14}, Landroidx/fragment/app/L;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 83
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v10, v23

    invoke-interface {v10, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    invoke-interface {v10, v3, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v5, v4

    move-object v13, v6

    move-object v12, v8

    move-object v4, v10

    move-object v10, v14

    move-object/from16 v8, v20

    :goto_c
    move-object/from16 v9, v25

    goto/16 :goto_5

    :cond_11
    move-object/from16 v20, v8

    move-object/from16 v25, v9

    move-object v14, v10

    move-object/from16 v22, v13

    move-object v10, v4

    move-object v4, v5

    const/4 v5, 0x0

    move-object v5, v4

    move-object v4, v10

    move-object v10, v14

    move-object/from16 v12, v19

    move-object/from16 v8, v20

    move-object/from16 v13, v22

    goto :goto_c

    :cond_12
    move-object/from16 v20, v8

    move-object/from16 v25, v9

    move-object v14, v10

    move-object/from16 v22, v13

    const/4 v9, 0x1

    move-object v10, v4

    move-object v4, v5

    const/4 v5, 0x0

    .line 85
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 86
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v11, 0x0

    :cond_13
    :goto_d
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_1f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v16, v12

    check-cast v16, Landroidx/fragment/app/i$c;

    .line 87
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$b;->d()Z

    move-result v12

    if-eqz v12, :cond_14

    .line 88
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v12

    sget-object v13, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v12, v13}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$b;->a()V

    goto :goto_d

    .line 90
    :cond_14
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$c;->h()Ljava/lang/Object;

    move-result-object v12

    invoke-virtual {v7, v12}, Landroidx/fragment/app/L;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    .line 91
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v13

    if-eqz v19, :cond_16

    if-eq v13, v2, :cond_15

    if-ne v13, v3, :cond_16

    :cond_15
    move/from16 v21, v9

    goto :goto_e

    :cond_16
    move/from16 v21, v5

    :goto_e
    if-nez v12, :cond_17

    if-nez v21, :cond_13

    .line 92
    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v10, v13, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$b;->a()V

    goto :goto_d

    :cond_17
    move-object/from16 v23, v10

    .line 94
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 95
    invoke-virtual {v13}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v9

    iget-object v9, v9, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    const-string v5, "operation.fragment.mView"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v10, v9}, Landroidx/fragment/app/i;->E(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v21, :cond_19

    if-ne v13, v2, :cond_18

    .line 96
    invoke-static/range {v20 .. v20}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_f

    .line 97
    :cond_18
    invoke-static {v14}, Lj7/q;->T0(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    .line 98
    :cond_19
    :goto_f
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_1a

    .line 99
    invoke-virtual {v7, v12, v4}, Landroidx/fragment/app/L;->a(Ljava/lang/Object;Landroid/view/View;)V

    move-object/from16 v9, p2

    move-object/from16 v24, v4

    move-object/from16 p3, v6

    move-object v5, v8

    move-object v0, v11

    move-object v8, v12

    move-object v11, v13

    move-object/from16 v27, v14

    move-object/from16 v6, v19

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    const/16 v21, 0x1

    goto :goto_10

    .line 100
    :cond_1a
    invoke-virtual {v7, v12, v10}, Landroidx/fragment/app/L;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object v5, v13

    const/4 v13, 0x0

    move-object v9, v14

    const/4 v14, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v26, v8

    move-object v8, v12

    const/4 v12, 0x0

    move-object/from16 v27, v9

    move-object v9, v8

    move-object/from16 v24, v4

    move-object/from16 p3, v6

    move-object/from16 v6, v19

    move-object/from16 v0, v21

    move-object/from16 v3, v22

    move-object/from16 v4, v23

    const/16 v21, 0x1

    move-object/from16 v19, v5

    move-object/from16 v5, v26

    .line 101
    invoke-virtual/range {v7 .. v14}, Landroidx/fragment/app/L;->n(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 102
    invoke-virtual/range {v19 .. v19}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    move-result-object v9

    sget-object v11, Landroidx/fragment/app/Q$c$b;->j:Landroidx/fragment/app/Q$c$b;

    if-ne v9, v11, :cond_1b

    move-object/from16 v9, p2

    move-object/from16 v11, v19

    .line 103
    invoke-interface {v9, v11}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 104
    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 105
    invoke-virtual {v11}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v13

    iget-object v13, v13, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 106
    invoke-virtual {v11}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v13

    iget-object v13, v13, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 107
    invoke-virtual {v7, v8, v13, v12}, Landroidx/fragment/app/L;->m(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 108
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v12

    new-instance v13, Landroidx/fragment/app/g;

    invoke-direct {v13, v10}, Landroidx/fragment/app/g;-><init>(Ljava/util/ArrayList;)V

    invoke-static {v12, v13}, Landroidx/core/view/L;->a(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/L;

    goto :goto_10

    :cond_1b
    move-object/from16 v9, p2

    move-object/from16 v11, v19

    .line 109
    :goto_10
    invoke-virtual {v11}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    move-result-object v12

    sget-object v13, Landroidx/fragment/app/Q$c$b;->i:Landroidx/fragment/app/Q$c$b;

    if-ne v12, v13, :cond_1c

    .line 110
    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v17, :cond_1d

    .line 111
    invoke-virtual {v7, v8, v15}, Landroidx/fragment/app/L;->o(Ljava/lang/Object;Landroid/graphics/Rect;)V

    goto :goto_11

    .line 112
    :cond_1c
    invoke-virtual {v7, v8, v3}, Landroidx/fragment/app/L;->p(Ljava/lang/Object;Landroid/view/View;)V

    .line 113
    :cond_1d
    :goto_11
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v4, v11, v10}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    invoke-virtual/range {v16 .. v16}, Landroidx/fragment/app/i$c;->j()Z

    move-result v10

    if-eqz v10, :cond_1e

    const/4 v10, 0x0

    .line 115
    invoke-virtual {v7, v5, v8, v10}, Landroidx/fragment/app/L;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    move-object v11, v0

    move-object/from16 v22, v3

    move-object v10, v4

    move-object/from16 v19, v6

    move/from16 v9, v21

    move-object/from16 v4, v24

    move-object/from16 v14, v27

    const/4 v5, 0x0

    move-object/from16 v0, p0

    :goto_12
    move-object/from16 v6, p3

    move-object/from16 v3, p5

    goto/16 :goto_d

    :cond_1e
    const/4 v10, 0x0

    .line 116
    invoke-virtual {v7, v0, v8, v10}, Landroidx/fragment/app/L;->k(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v0, p0

    move-object/from16 v22, v3

    move-object v10, v4

    move-object v8, v5

    move-object/from16 v19, v6

    move/from16 v9, v21

    move-object/from16 v4, v24

    move-object/from16 v14, v27

    const/4 v5, 0x0

    goto :goto_12

    :cond_1f
    move-object v5, v8

    move/from16 v21, v9

    move-object v4, v10

    move-object v0, v11

    move-object/from16 v27, v14

    move-object/from16 v6, v19

    .line 117
    invoke-virtual {v7, v5, v0, v6}, Landroidx/fragment/app/L;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_20

    goto/16 :goto_16

    .line 118
    :cond_20
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 119
    invoke-interface/range {p1 .. p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_21
    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_22

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Landroidx/fragment/app/i$c;

    .line 120
    invoke-virtual {v9}, Landroidx/fragment/app/i$b;->d()Z

    move-result v9

    if-nez v9, :cond_21

    .line 121
    invoke-interface {v3, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_13

    .line 122
    :cond_22
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_23
    :goto_14
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_29

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/fragment/app/i$c;

    .line 123
    invoke-virtual {v5}, Landroidx/fragment/app/i$c;->h()Ljava/lang/Object;

    move-result-object v8

    .line 124
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v9

    move-object/from16 v10, p5

    if-eqz v6, :cond_25

    if-eq v9, v2, :cond_24

    if-ne v9, v10, :cond_25

    :cond_24
    move/from16 v11, v21

    goto :goto_15

    :cond_25
    const/4 v11, 0x0

    :goto_15
    if-nez v8, :cond_26

    if-eqz v11, :cond_23

    .line 125
    :cond_26
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v8

    invoke-static {v8}, Landroidx/core/view/a0;->Q(Landroid/view/View;)Z

    move-result v8

    if-nez v8, :cond_28

    .line 126
    invoke-static/range {v18 .. v18}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    move-result v8

    if-eqz v8, :cond_27

    .line 127
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v8

    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 128
    :cond_27
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->a()V

    goto :goto_14

    .line 129
    :cond_28
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->b()Landroidx/fragment/app/Q$c;

    move-result-object v8

    invoke-virtual {v8}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    move-result-object v8

    .line 130
    invoke-virtual {v5}, Landroidx/fragment/app/i$b;->c()LD0/d;

    move-result-object v11

    .line 131
    new-instance v12, Landroidx/fragment/app/h;

    invoke-direct {v12, v5, v9}, Landroidx/fragment/app/h;-><init>(Landroidx/fragment/app/i$c;Landroidx/fragment/app/Q$c;)V

    invoke-virtual {v7, v8, v0, v11, v12}, Landroidx/fragment/app/L;->q(Landroidx/fragment/app/Fragment;Ljava/lang/Object;LD0/d;Ljava/lang/Runnable;)V

    goto :goto_14

    .line 132
    :cond_29
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/view/a0;->Q(Landroid/view/View;)Z

    move-result v2

    if-nez v2, :cond_2b

    :cond_2a
    :goto_16
    return-object v4

    :cond_2b
    const/4 v2, 0x4

    .line 133
    invoke-static {v1, v2}, Landroidx/fragment/app/J;->d(Ljava/util/List;I)V

    move-object/from16 v14, v27

    .line 134
    invoke-virtual {v7, v14}, Landroidx/fragment/app/L;->l(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v11

    .line 135
    invoke-static/range {v18 .. v18}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    move-result v2

    if-eqz v2, :cond_2d

    .line 136
    invoke-virtual/range {v20 .. v20}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v5, "sharedElementFirstOutViews"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/view/View;

    .line 137
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v3}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    goto :goto_17

    .line 138
    :cond_2c
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    const-string v5, "sharedElementLastInViews"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroid/view/View;

    .line 139
    invoke-static {v3}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    invoke-static {v3}, Landroidx/core/view/a0;->H(Landroid/view/View;)Ljava/lang/String;

    goto :goto_18

    .line 140
    :cond_2d
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v2

    invoke-virtual {v7, v2, v0}, Landroidx/fragment/app/L;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 141
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Q;->q()Landroid/view/ViewGroup;

    move-result-object v8

    move-object v10, v14

    move-object/from16 v9, v20

    move-object/from16 v12, v25

    invoke-virtual/range {v7 .. v12}, Landroidx/fragment/app/L;->r(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    move-object v13, v9

    const/4 v5, 0x0

    .line 142
    invoke-static {v1, v5}, Landroidx/fragment/app/J;->d(Ljava/util/List;I)V

    .line 143
    invoke-virtual {v7, v6, v13, v14}, Landroidx/fragment/app/L;->t(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object v4
.end method

.method private static final M(Landroidx/fragment/app/L;Landroid/view/View;Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    const-string v0, "$impl"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$lastInEpicenterRect"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, p2}, Landroidx/fragment/app/L;->h(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method private static final N(Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    const-string v0, "$transitioningViews"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x4

    .line 7
    invoke-static {p0, v0}, Landroidx/fragment/app/J;->d(Ljava/util/List;I)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static final O(Landroidx/fragment/app/i$c;Landroidx/fragment/app/Q$c;)V
    .locals 1

    .line 1
    const-string v0, "$transitionInfo"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "$operation"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/i$b;->a()V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x2

    .line 15
    invoke-static {p0}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method private static final P(Landroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;ZLm0/a;)V
    .locals 1

    .line 1
    const-string v0, "$lastInViews"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-static {p0, p1, p2, p3, v0}, Landroidx/fragment/app/J;->a(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLm0/a;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method private final Q(Ljava/util/List;)V
    .locals 4

    .line 1
    invoke-static {p1}, Lj7/q;->q0(Ljava/util/List;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Landroidx/fragment/app/Q$c;

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, Landroidx/fragment/app/Q$c;

    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 32
    .line 33
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 34
    .line 35
    iget v3, v3, Landroidx/fragment/app/Fragment$k;->c:I

    .line 36
    .line 37
    iput v3, v2, Landroidx/fragment/app/Fragment$k;->c:I

    .line 38
    .line 39
    invoke-virtual {v1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 44
    .line 45
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 46
    .line 47
    iget v3, v3, Landroidx/fragment/app/Fragment$k;->d:I

    .line 48
    .line 49
    iput v3, v2, Landroidx/fragment/app/Fragment$k;->d:I

    .line 50
    .line 51
    invoke-virtual {v1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    iget-object v2, v2, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 56
    .line 57
    iget-object v3, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 58
    .line 59
    iget v3, v3, Landroidx/fragment/app/Fragment$k;->e:I

    .line 60
    .line 61
    iput v3, v2, Landroidx/fragment/app/Fragment$k;->e:I

    .line 62
    .line 63
    invoke-virtual {v1}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 68
    .line 69
    iget-object v2, v0, Landroidx/fragment/app/Fragment;->mAnimationInfo:Landroidx/fragment/app/Fragment$k;

    .line 70
    .line 71
    iget v2, v2, Landroidx/fragment/app/Fragment$k;->f:I

    .line 72
    .line 73
    iput v2, v1, Landroidx/fragment/app/Fragment$k;->f:I

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    return-void
.end method

.method public static synthetic w(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/fragment/app/i;->F(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic x(Landroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;ZLm0/a;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/fragment/app/i;->P(Landroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;ZLm0/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic y(Landroid/animation/Animator;Landroidx/fragment/app/Q$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Landroidx/fragment/app/i;->J(Landroid/animation/Animator;Landroidx/fragment/app/Q$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic z(Landroid/view/View;Landroidx/fragment/app/i;Landroidx/fragment/app/i$a;Landroidx/fragment/app/Q$c;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Landroidx/fragment/app/i;->K(Landroid/view/View;Landroidx/fragment/app/i;Landroidx/fragment/app/i$a;Landroidx/fragment/app/Q$c;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public j(Ljava/util/List;Z)V
    .locals 11

    .line 1
    const-string v0, "operations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, "operation.fragment.mView"

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    move-object v4, v1

    .line 24
    check-cast v4, Landroidx/fragment/app/Q$c;

    .line 25
    .line 26
    sget-object v5, Landroidx/fragment/app/Q$c$b;->g:Landroidx/fragment/app/Q$c$b$a;

    .line 27
    .line 28
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 29
    .line 30
    .line 31
    move-result-object v6

    .line 32
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 33
    .line 34
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v5, v6}, Landroidx/fragment/app/Q$c$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/Q$c$b;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    sget-object v6, Landroidx/fragment/app/Q$c$b;->i:Landroidx/fragment/app/Q$c$b;

    .line 42
    .line 43
    if-ne v5, v6, :cond_0

    .line 44
    .line 45
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eq v4, v6, :cond_0

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    move-object v1, v2

    .line 53
    :goto_0
    move-object v8, v1

    .line 54
    check-cast v8, Landroidx/fragment/app/Q$c;

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    invoke-interface {p1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    :cond_2
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    move-object v4, v1

    .line 75
    check-cast v4, Landroidx/fragment/app/Q$c;

    .line 76
    .line 77
    sget-object v5, Landroidx/fragment/app/Q$c$b;->g:Landroidx/fragment/app/Q$c$b$a;

    .line 78
    .line 79
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->h()Landroidx/fragment/app/Fragment;

    .line 80
    .line 81
    .line 82
    move-result-object v6

    .line 83
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->mView:Landroid/view/View;

    .line 84
    .line 85
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v5, v6}, Landroidx/fragment/app/Q$c$b$a;->a(Landroid/view/View;)Landroidx/fragment/app/Q$c$b;

    .line 89
    .line 90
    .line 91
    move-result-object v5

    .line 92
    sget-object v6, Landroidx/fragment/app/Q$c$b;->i:Landroidx/fragment/app/Q$c$b;

    .line 93
    .line 94
    if-eq v5, v6, :cond_2

    .line 95
    .line 96
    invoke-virtual {v4}, Landroidx/fragment/app/Q$c;->g()Landroidx/fragment/app/Q$c$b;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    if-ne v4, v6, :cond_2

    .line 101
    .line 102
    move-object v2, v1

    .line 103
    :cond_3
    move-object v9, v2

    .line 104
    check-cast v9, Landroidx/fragment/app/Q$c;

    .line 105
    .line 106
    const/4 v0, 0x2

    .line 107
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_4

    .line 112
    .line 113
    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 122
    .line 123
    .line 124
    new-instance v5, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-static {p1}, Lj7/q;->R0(Ljava/util/Collection;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-direct {p0, p1}, Landroidx/fragment/app/i;->Q(Ljava/util/List;)V

    .line 134
    .line 135
    .line 136
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v2

    .line 144
    if-eqz v2, :cond_7

    .line 145
    .line 146
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, Landroidx/fragment/app/Q$c;

    .line 151
    .line 152
    new-instance v3, LD0/d;

    .line 153
    .line 154
    invoke-direct {v3}, LD0/d;-><init>()V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Q$c;->l(LD0/d;)V

    .line 158
    .line 159
    .line 160
    new-instance v4, Landroidx/fragment/app/i$a;

    .line 161
    .line 162
    invoke-direct {v4, v2, v3, p2}, Landroidx/fragment/app/i$a;-><init>(Landroidx/fragment/app/Q$c;LD0/d;Z)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    new-instance v3, LD0/d;

    .line 169
    .line 170
    invoke-direct {v3}, LD0/d;-><init>()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Q$c;->l(LD0/d;)V

    .line 174
    .line 175
    .line 176
    new-instance v4, Landroidx/fragment/app/i$c;

    .line 177
    .line 178
    const/4 v7, 0x0

    .line 179
    const/4 v10, 0x1

    .line 180
    if-eqz p2, :cond_5

    .line 181
    .line 182
    if-ne v2, v8, :cond_6

    .line 183
    .line 184
    :goto_2
    move v7, v10

    .line 185
    goto :goto_3

    .line 186
    :cond_5
    if-ne v2, v9, :cond_6

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_6
    :goto_3
    invoke-direct {v4, v2, v3, p2, v7}, Landroidx/fragment/app/i$c;-><init>(Landroidx/fragment/app/Q$c;LD0/d;ZZ)V

    .line 190
    .line 191
    .line 192
    invoke-interface {v5, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    new-instance v3, Landroidx/fragment/app/b;

    .line 196
    .line 197
    invoke-direct {v3, v6, v2, p0}, Landroidx/fragment/app/b;-><init>(Ljava/util/List;Landroidx/fragment/app/Q$c;Landroidx/fragment/app/i;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v3}, Landroidx/fragment/app/Q$c;->c(Ljava/lang/Runnable;)V

    .line 201
    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_7
    move-object v4, p0

    .line 205
    move v7, p2

    .line 206
    invoke-direct/range {v4 .. v9}, Landroidx/fragment/app/i;->L(Ljava/util/List;Ljava/util/List;ZLandroidx/fragment/app/Q$c;Landroidx/fragment/app/Q$c;)Ljava/util/Map;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 211
    .line 212
    invoke-interface {p1, p2}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result p2

    .line 216
    invoke-direct {p0, v1, v6, p2, p1}, Landroidx/fragment/app/i;->I(Ljava/util/List;Ljava/util/List;ZLjava/util/Map;)V

    .line 217
    .line 218
    .line 219
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 224
    .line 225
    .line 226
    move-result p2

    .line 227
    if-eqz p2, :cond_8

    .line 228
    .line 229
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object p2

    .line 233
    check-cast p2, Landroidx/fragment/app/Q$c;

    .line 234
    .line 235
    invoke-direct {p0, p2}, Landroidx/fragment/app/i;->D(Landroidx/fragment/app/Q$c;)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_8
    invoke-interface {v6}, Ljava/util/List;->clear()V

    .line 240
    .line 241
    .line 242
    invoke-static {v0}, Landroidx/fragment/app/FragmentManager;->J0(I)Z

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    if-eqz p1, :cond_9

    .line 247
    .line 248
    invoke-static {v8}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    invoke-static {v9}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    :cond_9
    return-void
.end method
