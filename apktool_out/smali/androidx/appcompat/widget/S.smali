.class public Landroidx/appcompat/widget/S;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lk/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/appcompat/widget/S$i;,
        Landroidx/appcompat/widget/S$h;,
        Landroidx/appcompat/widget/S$g;,
        Landroidx/appcompat/widget/S$e;,
        Landroidx/appcompat/widget/S$f;,
        Landroidx/appcompat/widget/S$d;,
        Landroidx/appcompat/widget/S$c;
    }
.end annotation


# static fields
.field private static M:Ljava/lang/reflect/Method;

.field private static N:Ljava/lang/reflect/Method;


# instance fields
.field private A:Landroid/widget/AdapterView$OnItemClickListener;

.field private B:Landroid/widget/AdapterView$OnItemSelectedListener;

.field final C:Landroidx/appcompat/widget/S$i;

.field private final D:Landroidx/appcompat/widget/S$h;

.field private final E:Landroidx/appcompat/widget/S$g;

.field private final F:Landroidx/appcompat/widget/S$e;

.field private G:Ljava/lang/Runnable;

.field final H:Landroid/os/Handler;

.field private final I:Landroid/graphics/Rect;

.field private J:Landroid/graphics/Rect;

.field private K:Z

.field L:Landroid/widget/PopupWindow;

.field private g:Landroid/content/Context;

.field private h:Landroid/widget/ListAdapter;

.field i:Landroidx/appcompat/widget/N;

.field private j:I

.field private k:I

.field private l:I

.field private m:I

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:I

.field private s:Z

.field private t:Z

.field u:I

.field private v:Landroid/view/View;

.field private w:I

.field private x:Landroid/database/DataSetObserver;

.field private y:Landroid/view/View;

.field private z:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Landroid/widget/PopupWindow;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1c

    .line 6
    .line 7
    if-gt v1, v2, :cond_0

    .line 8
    .line 9
    :try_start_0
    const-string v1, "setClipToScreenEnabled"

    .line 10
    .line 11
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 12
    .line 13
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    sput-object v1, Landroidx/appcompat/widget/S;->M:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    :catch_0
    :try_start_1
    const-string v1, "setEpicenterBounds"

    .line 24
    .line 25
    const-class v2, Landroid/graphics/Rect;

    .line 26
    .line 27
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Landroidx/appcompat/widget/S;->N:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 36
    .line 37
    :catch_1
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    sget v1, Lf/a;->D:I

    invoke-direct {p0, p1, v0, v1}, Landroidx/appcompat/widget/S;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/appcompat/widget/S;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 3

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    .line 4
    iput v0, p0, Landroidx/appcompat/widget/S;->j:I

    .line 5
    iput v0, p0, Landroidx/appcompat/widget/S;->k:I

    const/16 v0, 0x3ea

    .line 6
    iput v0, p0, Landroidx/appcompat/widget/S;->n:I

    const/4 v0, 0x0

    .line 7
    iput v0, p0, Landroidx/appcompat/widget/S;->r:I

    .line 8
    iput-boolean v0, p0, Landroidx/appcompat/widget/S;->s:Z

    .line 9
    iput-boolean v0, p0, Landroidx/appcompat/widget/S;->t:Z

    const v1, 0x7fffffff

    .line 10
    iput v1, p0, Landroidx/appcompat/widget/S;->u:I

    .line 11
    iput v0, p0, Landroidx/appcompat/widget/S;->w:I

    .line 12
    new-instance v1, Landroidx/appcompat/widget/S$i;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/S$i;-><init>(Landroidx/appcompat/widget/S;)V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->C:Landroidx/appcompat/widget/S$i;

    .line 13
    new-instance v1, Landroidx/appcompat/widget/S$h;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/S$h;-><init>(Landroidx/appcompat/widget/S;)V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->D:Landroidx/appcompat/widget/S$h;

    .line 14
    new-instance v1, Landroidx/appcompat/widget/S$g;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/S$g;-><init>(Landroidx/appcompat/widget/S;)V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->E:Landroidx/appcompat/widget/S$g;

    .line 15
    new-instance v1, Landroidx/appcompat/widget/S$e;

    invoke-direct {v1, p0}, Landroidx/appcompat/widget/S$e;-><init>(Landroidx/appcompat/widget/S;)V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->F:Landroidx/appcompat/widget/S$e;

    .line 16
    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 17
    iput-object p1, p0, Landroidx/appcompat/widget/S;->g:Landroid/content/Context;

    .line 18
    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Landroidx/appcompat/widget/S;->H:Landroid/os/Handler;

    .line 19
    sget-object v1, Lf/j;->l1:[I

    invoke-virtual {p1, p2, v1, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 20
    sget v2, Lf/j;->m1:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    iput v2, p0, Landroidx/appcompat/widget/S;->l:I

    .line 21
    sget v2, Lf/j;->n1:I

    invoke-virtual {v1, v2, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v0

    iput v0, p0, Landroidx/appcompat/widget/S;->m:I

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    .line 22
    iput-boolean v2, p0, Landroidx/appcompat/widget/S;->o:Z

    .line 23
    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 24
    new-instance v0, Landroidx/appcompat/widget/s;

    invoke-direct {v0, p1, p2, p3, p4}, Landroidx/appcompat/widget/s;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    iput-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 25
    invoke-virtual {v0, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method

.method private A()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->v:Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/appcompat/widget/S;->v:Landroid/view/View;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method private M(Z)V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_1

    .line 6
    .line 7
    sget-object v0, Landroidx/appcompat/widget/S;->M:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    :catch_0
    :cond_0
    return-void

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 26
    .line 27
    invoke-static {v0, p1}, Landroidx/appcompat/widget/S$d;->b(Landroid/widget/PopupWindow;Z)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method private c()I
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 2
    .line 3
    const/high16 v1, -0x80000000

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/appcompat/widget/S;->g:Landroid/content/Context;

    .line 11
    .line 12
    new-instance v5, Landroidx/appcompat/widget/S$a;

    .line 13
    .line 14
    invoke-direct {v5, p0}, Landroidx/appcompat/widget/S$a;-><init>(Landroidx/appcompat/widget/S;)V

    .line 15
    .line 16
    .line 17
    iput-object v5, p0, Landroidx/appcompat/widget/S;->G:Ljava/lang/Runnable;

    .line 18
    .line 19
    iget-boolean v5, p0, Landroidx/appcompat/widget/S;->K:Z

    .line 20
    .line 21
    xor-int/2addr v5, v3

    .line 22
    invoke-virtual {p0, v0, v5}, Landroidx/appcompat/widget/S;->q(Landroid/content/Context;Z)Landroidx/appcompat/widget/N;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    iput-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 27
    .line 28
    iget-object v6, p0, Landroidx/appcompat/widget/S;->z:Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5, v6}, Landroidx/appcompat/widget/N;->setSelector(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 36
    .line 37
    iget-object v6, p0, Landroidx/appcompat/widget/S;->h:Landroid/widget/ListAdapter;

    .line 38
    .line 39
    invoke-virtual {v5, v6}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 40
    .line 41
    .line 42
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 43
    .line 44
    iget-object v6, p0, Landroidx/appcompat/widget/S;->A:Landroid/widget/AdapterView$OnItemClickListener;

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 47
    .line 48
    .line 49
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 50
    .line 51
    invoke-virtual {v5, v3}, Landroid/view/View;->setFocusable(Z)V

    .line 52
    .line 53
    .line 54
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 55
    .line 56
    invoke-virtual {v5, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 57
    .line 58
    .line 59
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 60
    .line 61
    new-instance v6, Landroidx/appcompat/widget/S$b;

    .line 62
    .line 63
    invoke-direct {v6, p0}, Landroidx/appcompat/widget/S$b;-><init>(Landroidx/appcompat/widget/S;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v5, v6}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 67
    .line 68
    .line 69
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 70
    .line 71
    iget-object v6, p0, Landroidx/appcompat/widget/S;->E:Landroidx/appcompat/widget/S$g;

    .line 72
    .line 73
    invoke-virtual {v5, v6}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    .line 74
    .line 75
    .line 76
    iget-object v5, p0, Landroidx/appcompat/widget/S;->B:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 77
    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    iget-object v6, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 81
    .line 82
    invoke-virtual {v6, v5}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 83
    .line 84
    .line 85
    :cond_1
    iget-object v5, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 86
    .line 87
    iget-object v6, p0, Landroidx/appcompat/widget/S;->v:Landroid/view/View;

    .line 88
    .line 89
    if-eqz v6, :cond_5

    .line 90
    .line 91
    new-instance v7, Landroid/widget/LinearLayout;

    .line 92
    .line 93
    invoke-direct {v7, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v7, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 97
    .line 98
    .line 99
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 100
    .line 101
    const/high16 v8, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-direct {v0, v2, v4, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 104
    .line 105
    .line 106
    iget v8, p0, Landroidx/appcompat/widget/S;->w:I

    .line 107
    .line 108
    if-eqz v8, :cond_3

    .line 109
    .line 110
    if-eq v8, v3, :cond_2

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-virtual {v7, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_3
    invoke-virtual {v7, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 124
    .line 125
    .line 126
    :goto_0
    iget v0, p0, Landroidx/appcompat/widget/S;->k:I

    .line 127
    .line 128
    if-ltz v0, :cond_4

    .line 129
    .line 130
    move v5, v1

    .line 131
    goto :goto_1

    .line 132
    :cond_4
    move v0, v4

    .line 133
    move v5, v0

    .line 134
    :goto_1
    invoke-static {v0, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-virtual {v6, v0, v4}, Landroid/view/View;->measure(II)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 146
    .line 147
    invoke-virtual {v6}, Landroid/view/View;->getMeasuredHeight()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iget v6, v0, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 152
    .line 153
    add-int/2addr v5, v6

    .line 154
    iget v0, v0, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 155
    .line 156
    add-int/2addr v5, v0

    .line 157
    move v0, v5

    .line 158
    move-object v5, v7

    .line 159
    goto :goto_2

    .line 160
    :cond_5
    move v0, v4

    .line 161
    :goto_2
    iget-object v6, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 162
    .line 163
    invoke-virtual {v6, v5}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 164
    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_6
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 168
    .line 169
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    check-cast v0, Landroid/view/ViewGroup;

    .line 174
    .line 175
    iget-object v0, p0, Landroidx/appcompat/widget/S;->v:Landroid/view/View;

    .line 176
    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 184
    .line 185
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 186
    .line 187
    .line 188
    move-result v0

    .line 189
    iget v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 190
    .line 191
    add-int/2addr v0, v6

    .line 192
    iget v5, v5, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 193
    .line 194
    add-int/2addr v0, v5

    .line 195
    goto :goto_3

    .line 196
    :cond_7
    move v0, v4

    .line 197
    :goto_3
    iget-object v5, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 198
    .line 199
    invoke-virtual {v5}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    if-eqz v5, :cond_8

    .line 204
    .line 205
    iget-object v6, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 206
    .line 207
    invoke-virtual {v5, v6}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 208
    .line 209
    .line 210
    iget-object v5, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 211
    .line 212
    iget v6, v5, Landroid/graphics/Rect;->top:I

    .line 213
    .line 214
    iget v5, v5, Landroid/graphics/Rect;->bottom:I

    .line 215
    .line 216
    add-int/2addr v5, v6

    .line 217
    iget-boolean v7, p0, Landroidx/appcompat/widget/S;->o:Z

    .line 218
    .line 219
    if-nez v7, :cond_9

    .line 220
    .line 221
    neg-int v6, v6

    .line 222
    iput v6, p0, Landroidx/appcompat/widget/S;->m:I

    .line 223
    .line 224
    goto :goto_4

    .line 225
    :cond_8
    iget-object v5, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 226
    .line 227
    invoke-virtual {v5}, Landroid/graphics/Rect;->setEmpty()V

    .line 228
    .line 229
    .line 230
    move v5, v4

    .line 231
    :cond_9
    :goto_4
    iget-object v6, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 232
    .line 233
    invoke-virtual {v6}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 234
    .line 235
    .line 236
    move-result v6

    .line 237
    const/4 v7, 0x2

    .line 238
    if-ne v6, v7, :cond_a

    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_a
    move v3, v4

    .line 242
    :goto_5
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    iget v6, p0, Landroidx/appcompat/widget/S;->m:I

    .line 247
    .line 248
    invoke-direct {p0, v4, v6, v3}, Landroidx/appcompat/widget/S;->s(Landroid/view/View;IZ)I

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    iget-boolean v4, p0, Landroidx/appcompat/widget/S;->s:Z

    .line 253
    .line 254
    if-nez v4, :cond_f

    .line 255
    .line 256
    iget v4, p0, Landroidx/appcompat/widget/S;->j:I

    .line 257
    .line 258
    if-ne v4, v2, :cond_b

    .line 259
    .line 260
    goto :goto_8

    .line 261
    :cond_b
    iget v4, p0, Landroidx/appcompat/widget/S;->k:I

    .line 262
    .line 263
    const/4 v6, -0x2

    .line 264
    if-eq v4, v6, :cond_d

    .line 265
    .line 266
    const/high16 v1, 0x40000000    # 2.0f

    .line 267
    .line 268
    if-eq v4, v2, :cond_c

    .line 269
    .line 270
    invoke-static {v4, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    :goto_6
    move v7, v1

    .line 275
    goto :goto_7

    .line 276
    :cond_c
    iget-object v2, p0, Landroidx/appcompat/widget/S;->g:Landroid/content/Context;

    .line 277
    .line 278
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 287
    .line 288
    iget-object v4, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 289
    .line 290
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 291
    .line 292
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 293
    .line 294
    add-int/2addr v6, v4

    .line 295
    sub-int/2addr v2, v6

    .line 296
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 297
    .line 298
    .line 299
    move-result v1

    .line 300
    goto :goto_6

    .line 301
    :cond_d
    iget-object v2, p0, Landroidx/appcompat/widget/S;->g:Landroid/content/Context;

    .line 302
    .line 303
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 304
    .line 305
    .line 306
    move-result-object v2

    .line 307
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 312
    .line 313
    iget-object v4, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 314
    .line 315
    iget v6, v4, Landroid/graphics/Rect;->left:I

    .line 316
    .line 317
    iget v4, v4, Landroid/graphics/Rect;->right:I

    .line 318
    .line 319
    add-int/2addr v6, v4

    .line 320
    sub-int/2addr v2, v6

    .line 321
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 322
    .line 323
    .line 324
    move-result v1

    .line 325
    goto :goto_6

    .line 326
    :goto_7
    iget-object v6, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 327
    .line 328
    sub-int v10, v3, v0

    .line 329
    .line 330
    const/4 v11, -0x1

    .line 331
    const/4 v8, 0x0

    .line 332
    const/4 v9, -0x1

    .line 333
    invoke-virtual/range {v6 .. v11}, Landroidx/appcompat/widget/N;->d(IIIII)I

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-lez v1, :cond_e

    .line 338
    .line 339
    iget-object v2, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 340
    .line 341
    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    iget-object v3, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 346
    .line 347
    invoke-virtual {v3}, Landroid/view/View;->getPaddingBottom()I

    .line 348
    .line 349
    .line 350
    move-result v3

    .line 351
    add-int/2addr v2, v3

    .line 352
    add-int/2addr v5, v2

    .line 353
    add-int/2addr v0, v5

    .line 354
    :cond_e
    add-int/2addr v1, v0

    .line 355
    return v1

    .line 356
    :cond_f
    :goto_8
    add-int/2addr v3, v5

    .line 357
    return v3
.end method

.method private s(Landroid/view/View;IZ)I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-static {v0, p1, p2, p3}, Landroidx/appcompat/widget/S$c;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method


# virtual methods
.method public B(Landroid/view/View;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/S;->y:Landroid/view/View;

    .line 2
    .line 3
    return-void
.end method

.method public C(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setAnimationStyle(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public D(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/appcompat/widget/S;->I:Landroid/graphics/Rect;

    .line 15
    .line 16
    iget v1, v0, Landroid/graphics/Rect;->left:I

    .line 17
    .line 18
    iget v0, v0, Landroid/graphics/Rect;->right:I

    .line 19
    .line 20
    add-int/2addr v1, v0

    .line 21
    add-int/2addr v1, p1

    .line 22
    iput v1, p0, Landroidx/appcompat/widget/S;->k:I

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/appcompat/widget/S;->P(I)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public E(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/S;->r:I

    .line 2
    .line 3
    return-void
.end method

.method public F(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Landroid/graphics/Rect;

    .line 4
    .line 5
    invoke-direct {v0, p1}, Landroid/graphics/Rect;-><init>(Landroid/graphics/Rect;)V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    iput-object v0, p0, Landroidx/appcompat/widget/S;->J:Landroid/graphics/Rect;

    .line 11
    .line 12
    return-void
.end method

.method public G(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public H(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Landroidx/appcompat/widget/S;->K:Z

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public I(Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public J(Landroid/widget/AdapterView$OnItemClickListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/S;->A:Landroid/widget/AdapterView$OnItemClickListener;

    .line 2
    .line 3
    return-void
.end method

.method public K(Landroid/widget/AdapterView$OnItemSelectedListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/appcompat/widget/S;->B:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 2
    .line 3
    return-void
.end method

.method public L(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Landroidx/appcompat/widget/S;->q:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/appcompat/widget/S;->p:Z

    .line 5
    .line 6
    return-void
.end method

.method public N(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/S;->w:I

    .line 2
    .line 3
    return-void
.end method

.method public O(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/N;->setListSelectionHidden(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChoiceMode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {v0, p1, v1}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public P(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/S;->k:I

    .line 2
    .line 3
    return-void
.end method

.method public d()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/N;->setListSelectionHidden(Z)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method public dismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Landroidx/appcompat/widget/S;->A()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/appcompat/widget/S;->H:Landroid/os/Handler;

    .line 18
    .line 19
    iget-object v1, p0, Landroidx/appcompat/widget/S;->C:Landroidx/appcompat/widget/S$i;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public e(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public f()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/S;->l:I

    .line 2
    .line 3
    return v0
.end method

.method public g(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/S;->l:I

    .line 2
    .line 3
    return-void
.end method

.method public i()Landroid/graphics/drawable/Drawable;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public isShowing()Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j()Landroid/widget/ListView;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public l(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/appcompat/widget/S;->m:I

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Landroidx/appcompat/widget/S;->o:Z

    .line 5
    .line 6
    return-void
.end method

.method public o()I
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/S;->o:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    iget v0, p0, Landroidx/appcompat/widget/S;->m:I

    .line 8
    .line 9
    return v0
.end method

.method public p(Landroid/widget/ListAdapter;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->x:Landroid/database/DataSetObserver;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/appcompat/widget/S$f;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Landroidx/appcompat/widget/S$f;-><init>(Landroidx/appcompat/widget/S;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/appcompat/widget/S;->x:Landroid/database/DataSetObserver;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v1, p0, Landroidx/appcompat/widget/S;->h:Landroid/widget/ListAdapter;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :goto_0
    iput-object p1, p0, Landroidx/appcompat/widget/S;->h:Landroid/widget/ListAdapter;

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/appcompat/widget/S;->x:Landroid/database/DataSetObserver;

    .line 25
    .line 26
    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 27
    .line 28
    .line 29
    :cond_2
    iget-object p1, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 30
    .line 31
    if-eqz p1, :cond_3

    .line 32
    .line 33
    iget-object v0, p0, Landroidx/appcompat/widget/S;->h:Landroid/widget/ListAdapter;

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method q(Landroid/content/Context;Z)Landroidx/appcompat/widget/N;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/N;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/N;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public r()Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->y:Landroid/view/View;

    .line 2
    .line 3
    return-object v0
.end method

.method public show()V
    .locals 13

    .line 1
    invoke-direct {p0}, Landroidx/appcompat/widget/S;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->y()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 10
    .line 11
    iget v3, p0, Landroidx/appcompat/widget/S;->n:I

    .line 12
    .line 13
    invoke-static {v2, v3}, Landroidx/core/widget/h;->b(Landroid/widget/PopupWindow;I)V

    .line 14
    .line 15
    .line 16
    iget-object v2, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 17
    .line 18
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    const/4 v3, 0x1

    .line 23
    const/4 v4, -0x2

    .line 24
    const/4 v5, 0x0

    .line 25
    const/4 v6, -0x1

    .line 26
    if-eqz v2, :cond_c

    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_0

    .line 37
    .line 38
    goto/16 :goto_c

    .line 39
    .line 40
    :cond_0
    iget v2, p0, Landroidx/appcompat/widget/S;->k:I

    .line 41
    .line 42
    if-ne v2, v6, :cond_1

    .line 43
    .line 44
    move v2, v6

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    if-ne v2, v4, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    :cond_2
    :goto_0
    iget v7, p0, Landroidx/appcompat/widget/S;->j:I

    .line 57
    .line 58
    if-ne v7, v6, :cond_7

    .line 59
    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    move v0, v6

    .line 64
    :goto_1
    if-eqz v1, :cond_5

    .line 65
    .line 66
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 67
    .line 68
    iget v4, p0, Landroidx/appcompat/widget/S;->k:I

    .line 69
    .line 70
    if-ne v4, v6, :cond_4

    .line 71
    .line 72
    move v4, v6

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move v4, v5

    .line 75
    :goto_2
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 79
    .line 80
    invoke-virtual {v1, v5}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_5
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 85
    .line 86
    iget v4, p0, Landroidx/appcompat/widget/S;->k:I

    .line 87
    .line 88
    if-ne v4, v6, :cond_6

    .line 89
    .line 90
    move v4, v6

    .line 91
    goto :goto_3

    .line 92
    :cond_6
    move v4, v5

    .line 93
    :goto_3
    invoke-virtual {v1, v4}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 97
    .line 98
    invoke-virtual {v1, v6}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 99
    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    if-ne v7, v4, :cond_8

    .line 103
    .line 104
    goto :goto_4

    .line 105
    :cond_8
    move v0, v7

    .line 106
    :goto_4
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 107
    .line 108
    iget-boolean v4, p0, Landroidx/appcompat/widget/S;->t:Z

    .line 109
    .line 110
    if-nez v4, :cond_9

    .line 111
    .line 112
    iget-boolean v4, p0, Landroidx/appcompat/widget/S;->s:Z

    .line 113
    .line 114
    if-nez v4, :cond_9

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_9
    move v3, v5

    .line 118
    :goto_5
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 119
    .line 120
    .line 121
    iget-object v7, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 122
    .line 123
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    iget v9, p0, Landroidx/appcompat/widget/S;->l:I

    .line 128
    .line 129
    iget v10, p0, Landroidx/appcompat/widget/S;->m:I

    .line 130
    .line 131
    if-gez v2, :cond_a

    .line 132
    .line 133
    move v11, v6

    .line 134
    goto :goto_6

    .line 135
    :cond_a
    move v11, v2

    .line 136
    :goto_6
    if-gez v0, :cond_b

    .line 137
    .line 138
    move v12, v6

    .line 139
    goto :goto_7

    .line 140
    :cond_b
    move v12, v0

    .line 141
    :goto_7
    invoke-virtual/range {v7 .. v12}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :cond_c
    iget v1, p0, Landroidx/appcompat/widget/S;->k:I

    .line 146
    .line 147
    if-ne v1, v6, :cond_d

    .line 148
    .line 149
    move v1, v6

    .line 150
    goto :goto_8

    .line 151
    :cond_d
    if-ne v1, v4, :cond_e

    .line 152
    .line 153
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    :cond_e
    :goto_8
    iget v2, p0, Landroidx/appcompat/widget/S;->j:I

    .line 162
    .line 163
    if-ne v2, v6, :cond_f

    .line 164
    .line 165
    move v0, v6

    .line 166
    goto :goto_9

    .line 167
    :cond_f
    if-ne v2, v4, :cond_10

    .line 168
    .line 169
    goto :goto_9

    .line 170
    :cond_10
    move v0, v2

    .line 171
    :goto_9
    iget-object v2, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 172
    .line 173
    invoke-virtual {v2, v1}, Landroid/widget/PopupWindow;->setWidth(I)V

    .line 174
    .line 175
    .line 176
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 177
    .line 178
    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    .line 179
    .line 180
    .line 181
    invoke-direct {p0, v3}, Landroidx/appcompat/widget/S;->M(Z)V

    .line 182
    .line 183
    .line 184
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 185
    .line 186
    iget-boolean v1, p0, Landroidx/appcompat/widget/S;->t:Z

    .line 187
    .line 188
    if-nez v1, :cond_11

    .line 189
    .line 190
    iget-boolean v1, p0, Landroidx/appcompat/widget/S;->s:Z

    .line 191
    .line 192
    if-nez v1, :cond_11

    .line 193
    .line 194
    goto :goto_a

    .line 195
    :cond_11
    move v3, v5

    .line 196
    :goto_a
    invoke-virtual {v0, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    .line 197
    .line 198
    .line 199
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 200
    .line 201
    iget-object v1, p0, Landroidx/appcompat/widget/S;->D:Landroidx/appcompat/widget/S$h;

    .line 202
    .line 203
    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    .line 204
    .line 205
    .line 206
    iget-boolean v0, p0, Landroidx/appcompat/widget/S;->q:Z

    .line 207
    .line 208
    if-eqz v0, :cond_12

    .line 209
    .line 210
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 211
    .line 212
    iget-boolean v1, p0, Landroidx/appcompat/widget/S;->p:Z

    .line 213
    .line 214
    invoke-static {v0, v1}, Landroidx/core/widget/h;->a(Landroid/widget/PopupWindow;Z)V

    .line 215
    .line 216
    .line 217
    :cond_12
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 218
    .line 219
    const/16 v1, 0x1c

    .line 220
    .line 221
    if-gt v0, v1, :cond_13

    .line 222
    .line 223
    sget-object v0, Landroidx/appcompat/widget/S;->N:Ljava/lang/reflect/Method;

    .line 224
    .line 225
    if-eqz v0, :cond_14

    .line 226
    .line 227
    :try_start_0
    iget-object v1, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 228
    .line 229
    iget-object v2, p0, Landroidx/appcompat/widget/S;->J:Landroid/graphics/Rect;

    .line 230
    .line 231
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v2

    .line 235
    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 236
    .line 237
    .line 238
    goto :goto_b

    .line 239
    :cond_13
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 240
    .line 241
    iget-object v1, p0, Landroidx/appcompat/widget/S;->J:Landroid/graphics/Rect;

    .line 242
    .line 243
    invoke-static {v0, v1}, Landroidx/appcompat/widget/S$d;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    .line 244
    .line 245
    .line 246
    :catch_0
    :cond_14
    :goto_b
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 247
    .line 248
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->r()Landroid/view/View;

    .line 249
    .line 250
    .line 251
    move-result-object v1

    .line 252
    iget v2, p0, Landroidx/appcompat/widget/S;->l:I

    .line 253
    .line 254
    iget v3, p0, Landroidx/appcompat/widget/S;->m:I

    .line 255
    .line 256
    iget v4, p0, Landroidx/appcompat/widget/S;->r:I

    .line 257
    .line 258
    invoke-static {v0, v1, v2, v3, v4}, Landroidx/core/widget/h;->c(Landroid/widget/PopupWindow;Landroid/view/View;III)V

    .line 259
    .line 260
    .line 261
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 262
    .line 263
    invoke-virtual {v0, v6}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 264
    .line 265
    .line 266
    iget-boolean v0, p0, Landroidx/appcompat/widget/S;->K:Z

    .line 267
    .line 268
    if-eqz v0, :cond_15

    .line 269
    .line 270
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 271
    .line 272
    invoke-virtual {v0}, Landroidx/appcompat/widget/N;->isInTouchMode()Z

    .line 273
    .line 274
    .line 275
    move-result v0

    .line 276
    if-eqz v0, :cond_16

    .line 277
    .line 278
    :cond_15
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->d()V

    .line 279
    .line 280
    .line 281
    :cond_16
    iget-boolean v0, p0, Landroidx/appcompat/widget/S;->K:Z

    .line 282
    .line 283
    if-nez v0, :cond_17

    .line 284
    .line 285
    iget-object v0, p0, Landroidx/appcompat/widget/S;->H:Landroid/os/Handler;

    .line 286
    .line 287
    iget-object v1, p0, Landroidx/appcompat/widget/S;->F:Landroidx/appcompat/widget/S$e;

    .line 288
    .line 289
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 290
    .line 291
    .line 292
    :cond_17
    :goto_c
    return-void
.end method

.method public t()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItem()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public u()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-wide/high16 v0, -0x8000000000000000L

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemId()J

    .line 13
    .line 14
    .line 15
    move-result-wide v0

    .line 16
    return-wide v0
.end method

.method public v()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, -0x1

    .line 8
    return v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public w()Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/appcompat/widget/S;->isShowing()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v0, p0, Landroidx/appcompat/widget/S;->i:Landroidx/appcompat/widget/N;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/widget/AdapterView;->getSelectedView()Landroid/view/View;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
.end method

.method public x()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/appcompat/widget/S;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public y()Z
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/S;->L:Landroid/widget/PopupWindow;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x2

    .line 8
    if-ne v0, v1, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    return v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0
.end method

.method public z()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/appcompat/widget/S;->K:Z

    .line 2
    .line 3
    return v0
.end method
