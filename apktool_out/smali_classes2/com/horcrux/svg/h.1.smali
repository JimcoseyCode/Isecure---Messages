.class Lcom/horcrux/svg/h;
.super Lcom/horcrux/svg/RenderableView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private g:Lcom/horcrux/svg/SVGLength;

.field private h:Lcom/horcrux/svg/SVGLength;

.field private i:Lcom/horcrux/svg/SVGLength;

.field private j:Lcom/horcrux/svg/SVGLength;


# direct methods
.method public constructor <init>(Lcom/facebook/react/bridge/ReactContext;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/horcrux/svg/RenderableView;-><init>(Lcom/facebook/react/bridge/ReactContext;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public c(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h;->g:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public d(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h;->h:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public e(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public f(Lcom/facebook/react/bridge/Dynamic;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/horcrux/svg/SVGLength;->b(Lcom/facebook/react/bridge/Dynamic;)Lcom/horcrux/svg/SVGLength;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iput-object p1, p0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Landroid/graphics/Path;

    .line 4
    .line 5
    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    .line 6
    .line 7
    .line 8
    iget-object v2, v0, Lcom/horcrux/svg/h;->g:Lcom/horcrux/svg/SVGLength;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v4, v0, Lcom/horcrux/svg/h;->h:Lcom/horcrux/svg/SVGLength;

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iget-object v6, v0, Lcom/horcrux/svg/h;->i:Lcom/horcrux/svg/SVGLength;

    .line 21
    .line 22
    invoke-virtual {v0, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    iget-object v8, v0, Lcom/horcrux/svg/h;->j:Lcom/horcrux/svg/SVGLength;

    .line 27
    .line 28
    invoke-virtual {v0, v8}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    new-instance v10, Landroid/graphics/RectF;

    .line 33
    .line 34
    sub-double v11, v2, v6

    .line 35
    .line 36
    double-to-float v13, v11

    .line 37
    sub-double v14, v4, v8

    .line 38
    .line 39
    move-wide/from16 p1, v6

    .line 40
    .line 41
    double-to-float v6, v14

    .line 42
    move-wide/from16 v16, v8

    .line 43
    .line 44
    add-double v7, v2, p1

    .line 45
    .line 46
    double-to-float v9, v7

    .line 47
    move-wide/from16 p1, v11

    .line 48
    .line 49
    add-double v11, v4, v16

    .line 50
    .line 51
    move-wide/from16 v16, v4

    .line 52
    .line 53
    double-to-float v4, v11

    .line 54
    invoke-direct {v10, v13, v6, v9, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 55
    .line 56
    .line 57
    sget-object v4, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 58
    .line 59
    invoke-virtual {v1, v10, v4}, Landroid/graphics/Path;->addOval(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 60
    .line 61
    .line 62
    new-instance v4, Ljava/util/ArrayList;

    .line 63
    .line 64
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 68
    .line 69
    new-instance v5, Lcom/horcrux/svg/H;

    .line 70
    .line 71
    sget-object v6, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 72
    .line 73
    new-instance v9, Lcom/horcrux/svg/L;

    .line 74
    .line 75
    invoke-direct {v9, v2, v3, v14, v15}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 76
    .line 77
    .line 78
    filled-new-array {v9}, [Lcom/horcrux/svg/L;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-direct {v5, v6, v9}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 89
    .line 90
    new-instance v5, Lcom/horcrux/svg/H;

    .line 91
    .line 92
    sget-object v6, Lcom/horcrux/svg/g;->j:Lcom/horcrux/svg/g;

    .line 93
    .line 94
    new-instance v9, Lcom/horcrux/svg/L;

    .line 95
    .line 96
    invoke-direct {v9, v2, v3, v14, v15}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 97
    .line 98
    .line 99
    new-instance v10, Lcom/horcrux/svg/L;

    .line 100
    .line 101
    move-wide/from16 v18, v14

    .line 102
    .line 103
    move-wide/from16 v13, v16

    .line 104
    .line 105
    invoke-direct {v10, v7, v8, v13, v14}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v9, v10}, [Lcom/horcrux/svg/L;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-direct {v5, v6, v9}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 119
    .line 120
    new-instance v5, Lcom/horcrux/svg/H;

    .line 121
    .line 122
    new-instance v9, Lcom/horcrux/svg/L;

    .line 123
    .line 124
    invoke-direct {v9, v7, v8, v13, v14}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 125
    .line 126
    .line 127
    new-instance v7, Lcom/horcrux/svg/L;

    .line 128
    .line 129
    invoke-direct {v7, v2, v3, v11, v12}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 130
    .line 131
    .line 132
    filled-new-array {v9, v7}, [Lcom/horcrux/svg/L;

    .line 133
    .line 134
    .line 135
    move-result-object v7

    .line 136
    invoke-direct {v5, v6, v7}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 143
    .line 144
    new-instance v5, Lcom/horcrux/svg/H;

    .line 145
    .line 146
    new-instance v7, Lcom/horcrux/svg/L;

    .line 147
    .line 148
    invoke-direct {v7, v2, v3, v11, v12}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 149
    .line 150
    .line 151
    new-instance v8, Lcom/horcrux/svg/L;

    .line 152
    .line 153
    move-wide/from16 v9, p1

    .line 154
    .line 155
    invoke-direct {v8, v9, v10, v13, v14}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 156
    .line 157
    .line 158
    filled-new-array {v7, v8}, [Lcom/horcrux/svg/L;

    .line 159
    .line 160
    .line 161
    move-result-object v7

    .line 162
    invoke-direct {v5, v6, v7}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    iget-object v4, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 169
    .line 170
    new-instance v5, Lcom/horcrux/svg/H;

    .line 171
    .line 172
    new-instance v7, Lcom/horcrux/svg/L;

    .line 173
    .line 174
    invoke-direct {v7, v9, v10, v13, v14}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 175
    .line 176
    .line 177
    new-instance v8, Lcom/horcrux/svg/L;

    .line 178
    .line 179
    move-wide/from16 v9, v18

    .line 180
    .line 181
    invoke-direct {v8, v2, v3, v9, v10}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 182
    .line 183
    .line 184
    filled-new-array {v7, v8}, [Lcom/horcrux/svg/L;

    .line 185
    .line 186
    .line 187
    move-result-object v2

    .line 188
    invoke-direct {v5, v6, v2}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 192
    .line 193
    .line 194
    return-object v1
.end method
