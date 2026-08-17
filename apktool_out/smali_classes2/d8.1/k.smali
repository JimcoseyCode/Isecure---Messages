.class public final Ld8/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld8/k$a;
    }
.end annotation


# static fields
.field public static final b:Ld8/k$a;


# instance fields
.field private final a:Ly8/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ld8/k$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ld8/k$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ld8/k;->b:Ld8/k$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(LB8/n;LL7/H;Ly8/o;Ld8/o;Ld8/h;LX7/j;LL7/M;Ly8/w;LT7/c;Ly8/m;LD8/p;LF8/a;)V
    .locals 21

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    const-string v0, "storageManager"

    .line 4
    .line 5
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "moduleDescriptor"

    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "configuration"

    .line 16
    .line 17
    move-object/from16 v3, p3

    .line 18
    .line 19
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "classDataFinder"

    .line 23
    .line 24
    move-object/from16 v4, p4

    .line 25
    .line 26
    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "annotationAndConstantLoader"

    .line 30
    .line 31
    move-object/from16 v5, p5

    .line 32
    .line 33
    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "packageFragmentProvider"

    .line 37
    .line 38
    move-object/from16 v6, p6

    .line 39
    .line 40
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, "notFoundClasses"

    .line 44
    .line 45
    move-object/from16 v12, p7

    .line 46
    .line 47
    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const-string v0, "errorReporter"

    .line 51
    .line 52
    move-object/from16 v8, p8

    .line 53
    .line 54
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const-string v0, "lookupTracker"

    .line 58
    .line 59
    move-object/from16 v9, p9

    .line 60
    .line 61
    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const-string v0, "contractDeserializer"

    .line 65
    .line 66
    move-object/from16 v13, p10

    .line 67
    .line 68
    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const-string v0, "kotlinTypeChecker"

    .line 72
    .line 73
    move-object/from16 v7, p11

    .line 74
    .line 75
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string v0, "typeAttributeTranslators"

    .line 79
    .line 80
    move-object/from16 v10, p12

    .line 81
    .line 82
    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-interface {v2}, LL7/H;->n()LI7/i;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    instance-of v11, v0, LK7/k;

    .line 93
    .line 94
    if-eqz v11, :cond_0

    .line 95
    .line 96
    check-cast v0, LK7/k;

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_0
    const/4 v0, 0x0

    .line 100
    :goto_0
    new-instance v11, Ly8/n;

    .line 101
    .line 102
    sget-object v7, Ly8/B$a;->a:Ly8/B$a;

    .line 103
    .line 104
    sget-object v10, Ld8/p;->a:Ld8/p;

    .line 105
    .line 106
    move-object v14, v0

    .line 107
    move-object v0, v11

    .line 108
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    if-eqz v14, :cond_1

    .line 113
    .line 114
    invoke-virtual {v14}, LK7/k;->L0()LK7/u;

    .line 115
    .line 116
    .line 117
    move-result-object v15

    .line 118
    if-eqz v15, :cond_1

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_1
    sget-object v15, LN7/a$a;->a:LN7/a$a;

    .line 122
    .line 123
    :goto_1
    if-eqz v14, :cond_2

    .line 124
    .line 125
    invoke-virtual {v14}, LK7/k;->L0()LK7/u;

    .line 126
    .line 127
    .line 128
    move-result-object v14

    .line 129
    if-eqz v14, :cond_2

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    sget-object v14, LN7/c$b;->a:LN7/c$b;

    .line 133
    .line 134
    :goto_2
    sget-object v16, Lj8/i;->a:Lj8/i;

    .line 135
    .line 136
    invoke-virtual/range {v16 .. v16}, Lj8/i;->a()Lm8/g;

    .line 137
    .line 138
    .line 139
    move-result-object v16

    .line 140
    move-object/from16 v17, v0

    .line 141
    .line 142
    new-instance v0, Lu8/b;

    .line 143
    .line 144
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-direct {v0, v1, v2}, Lu8/b;-><init>(LB8/n;Ljava/lang/Iterable;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual/range {p12 .. p12}, LF8/a;->a()Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v19

    .line 155
    sget-object v20, Ly8/z;->a:Ly8/z;

    .line 156
    .line 157
    move-object v2, v15

    .line 158
    move-object v15, v14

    .line 159
    move-object v14, v2

    .line 160
    move-object/from16 v2, p2

    .line 161
    .line 162
    move-object/from16 v18, v0

    .line 163
    .line 164
    move-object/from16 v0, v17

    .line 165
    .line 166
    move-object/from16 v17, p11

    .line 167
    .line 168
    invoke-direct/range {v0 .. v20}, Ly8/n;-><init>(LB8/n;LL7/H;Ly8/o;Ly8/j;Ly8/e;LL7/O;Ly8/B;Ly8/w;LT7/c;Ly8/x;Ljava/lang/Iterable;LL7/M;Ly8/m;LN7/a;LN7/c;Lm8/g;LD8/p;Lu8/a;Ljava/util/List;Ly8/v;)V

    .line 169
    .line 170
    .line 171
    move-object v1, v0

    .line 172
    move-object/from16 v0, p0

    .line 173
    .line 174
    iput-object v1, v0, Ld8/k;->a:Ly8/n;

    .line 175
    .line 176
    return-void
.end method


# virtual methods
.method public final a()Ly8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ld8/k;->a:Ly8/n;

    .line 2
    .line 3
    return-object v0
.end method
