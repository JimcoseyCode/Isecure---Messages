.class Lcom/horcrux/svg/b;
.super Lcom/horcrux/svg/RenderableView;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private g:Lcom/horcrux/svg/SVGLength;

.field private h:Lcom/horcrux/svg/SVGLength;

.field private i:Lcom/horcrux/svg/SVGLength;


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
    iput-object p1, p0, Lcom/horcrux/svg/b;->g:Lcom/horcrux/svg/SVGLength;

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
    iput-object p1, p0, Lcom/horcrux/svg/b;->h:Lcom/horcrux/svg/SVGLength;

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
    iput-object p1, p0, Lcom/horcrux/svg/b;->i:Lcom/horcrux/svg/SVGLength;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/horcrux/svg/VirtualView;->invalidate()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method getPath(Landroid/graphics/Canvas;Landroid/graphics/Paint;)Landroid/graphics/Path;
    .locals 16

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
    iget-object v2, v0, Lcom/horcrux/svg/b;->g:Lcom/horcrux/svg/SVGLength;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Lcom/horcrux/svg/VirtualView;->relativeOnWidth(Lcom/horcrux/svg/SVGLength;)D

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    iget-object v4, v0, Lcom/horcrux/svg/b;->h:Lcom/horcrux/svg/SVGLength;

    .line 15
    .line 16
    invoke-virtual {v0, v4}, Lcom/horcrux/svg/VirtualView;->relativeOnHeight(Lcom/horcrux/svg/SVGLength;)D

    .line 17
    .line 18
    .line 19
    move-result-wide v4

    .line 20
    iget-object v6, v0, Lcom/horcrux/svg/b;->i:Lcom/horcrux/svg/SVGLength;

    .line 21
    .line 22
    invoke-virtual {v0, v6}, Lcom/horcrux/svg/VirtualView;->relativeOnOther(Lcom/horcrux/svg/SVGLength;)D

    .line 23
    .line 24
    .line 25
    move-result-wide v6

    .line 26
    double-to-float v8, v2

    .line 27
    double-to-float v9, v4

    .line 28
    double-to-float v10, v6

    .line 29
    sget-object v11, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 30
    .line 31
    invoke-virtual {v1, v8, v9, v10, v11}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 32
    .line 33
    .line 34
    new-instance v8, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 40
    .line 41
    new-instance v9, Lcom/horcrux/svg/H;

    .line 42
    .line 43
    sget-object v10, Lcom/horcrux/svg/g;->i:Lcom/horcrux/svg/g;

    .line 44
    .line 45
    new-instance v11, Lcom/horcrux/svg/L;

    .line 46
    .line 47
    sub-double v12, v4, v6

    .line 48
    .line 49
    invoke-direct {v11, v2, v3, v12, v13}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 50
    .line 51
    .line 52
    filled-new-array {v11}, [Lcom/horcrux/svg/L;

    .line 53
    .line 54
    .line 55
    move-result-object v11

    .line 56
    invoke-direct {v9, v10, v11}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    iget-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 63
    .line 64
    new-instance v9, Lcom/horcrux/svg/H;

    .line 65
    .line 66
    sget-object v10, Lcom/horcrux/svg/g;->j:Lcom/horcrux/svg/g;

    .line 67
    .line 68
    new-instance v11, Lcom/horcrux/svg/L;

    .line 69
    .line 70
    invoke-direct {v11, v2, v3, v12, v13}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 71
    .line 72
    .line 73
    new-instance v14, Lcom/horcrux/svg/L;

    .line 74
    .line 75
    move-wide/from16 p1, v6

    .line 76
    .line 77
    add-double v6, v2, p1

    .line 78
    .line 79
    invoke-direct {v14, v6, v7, v4, v5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 80
    .line 81
    .line 82
    filled-new-array {v11, v14}, [Lcom/horcrux/svg/L;

    .line 83
    .line 84
    .line 85
    move-result-object v11

    .line 86
    invoke-direct {v9, v10, v11}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    iget-object v8, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 93
    .line 94
    new-instance v9, Lcom/horcrux/svg/H;

    .line 95
    .line 96
    new-instance v11, Lcom/horcrux/svg/L;

    .line 97
    .line 98
    invoke-direct {v11, v6, v7, v4, v5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 99
    .line 100
    .line 101
    new-instance v6, Lcom/horcrux/svg/L;

    .line 102
    .line 103
    add-double v14, v4, p1

    .line 104
    .line 105
    invoke-direct {v6, v2, v3, v14, v15}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 106
    .line 107
    .line 108
    filled-new-array {v11, v6}, [Lcom/horcrux/svg/L;

    .line 109
    .line 110
    .line 111
    move-result-object v6

    .line 112
    invoke-direct {v9, v10, v6}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    iget-object v6, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 119
    .line 120
    new-instance v7, Lcom/horcrux/svg/H;

    .line 121
    .line 122
    new-instance v8, Lcom/horcrux/svg/L;

    .line 123
    .line 124
    invoke-direct {v8, v2, v3, v14, v15}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 125
    .line 126
    .line 127
    new-instance v9, Lcom/horcrux/svg/L;

    .line 128
    .line 129
    sub-double v14, v2, p1

    .line 130
    .line 131
    invoke-direct {v9, v14, v15, v4, v5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 132
    .line 133
    .line 134
    filled-new-array {v8, v9}, [Lcom/horcrux/svg/L;

    .line 135
    .line 136
    .line 137
    move-result-object v8

    .line 138
    invoke-direct {v7, v10, v8}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    iget-object v6, v0, Lcom/horcrux/svg/VirtualView;->elements:Ljava/util/ArrayList;

    .line 145
    .line 146
    new-instance v7, Lcom/horcrux/svg/H;

    .line 147
    .line 148
    new-instance v8, Lcom/horcrux/svg/L;

    .line 149
    .line 150
    invoke-direct {v8, v14, v15, v4, v5}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 151
    .line 152
    .line 153
    new-instance v4, Lcom/horcrux/svg/L;

    .line 154
    .line 155
    invoke-direct {v4, v2, v3, v12, v13}, Lcom/horcrux/svg/L;-><init>(DD)V

    .line 156
    .line 157
    .line 158
    filled-new-array {v8, v4}, [Lcom/horcrux/svg/L;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    invoke-direct {v7, v10, v2}, Lcom/horcrux/svg/H;-><init>(Lcom/horcrux/svg/g;[Lcom/horcrux/svg/L;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    return-object v1
.end method
