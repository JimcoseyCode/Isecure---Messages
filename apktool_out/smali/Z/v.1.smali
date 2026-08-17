.class public abstract LZ/v;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/v$b;
    }
.end annotation


# static fields
.field public static final a:LZ/v;

.field public static final b:LZ/v;

.field public static final c:LZ/v;

.field public static final d:LZ/v;

.field public static final e:LZ/v;

.field public static final f:LZ/v;

.field static final g:LZ/v;

.field private static final h:Ljava/util/Set;

.field private static final i:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x2d0

    .line 4
    .line 5
    const/16 v2, 0x1e0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    new-instance v3, Landroid/util/Size;

    .line 11
    .line 12
    const/16 v4, 0x280

    .line 13
    .line 14
    invoke-direct {v3, v4, v2}, Landroid/util/Size;-><init>(II)V

    .line 15
    .line 16
    .line 17
    filled-new-array {v0, v3}, [Landroid/util/Size;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x4

    .line 30
    const/16 v3, 0x7d2

    .line 31
    .line 32
    const-string v4, "SD"

    .line 33
    .line 34
    invoke-static {v2, v3, v4, v0}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, LZ/v;->a:LZ/v;

    .line 39
    .line 40
    new-instance v3, Landroid/util/Size;

    .line 41
    .line 42
    const/16 v4, 0x500

    .line 43
    .line 44
    invoke-direct {v3, v4, v1}, Landroid/util/Size;-><init>(II)V

    .line 45
    .line 46
    .line 47
    invoke-static {v3}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    const/4 v3, 0x5

    .line 52
    const/16 v4, 0x7d3

    .line 53
    .line 54
    const-string v5, "HD"

    .line 55
    .line 56
    invoke-static {v3, v4, v5, v1}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    sput-object v1, LZ/v;->b:LZ/v;

    .line 61
    .line 62
    new-instance v4, Landroid/util/Size;

    .line 63
    .line 64
    const/16 v5, 0x780

    .line 65
    .line 66
    const/16 v6, 0x438

    .line 67
    .line 68
    invoke-direct {v4, v5, v6}, Landroid/util/Size;-><init>(II)V

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    const/4 v5, 0x6

    .line 76
    const/16 v6, 0x7d4

    .line 77
    .line 78
    const-string v7, "FHD"

    .line 79
    .line 80
    invoke-static {v5, v6, v7, v4}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    sput-object v4, LZ/v;->c:LZ/v;

    .line 85
    .line 86
    new-instance v6, Landroid/util/Size;

    .line 87
    .line 88
    const/16 v7, 0xf00

    .line 89
    .line 90
    const/16 v8, 0x870

    .line 91
    .line 92
    invoke-direct {v6, v7, v8}, Landroid/util/Size;-><init>(II)V

    .line 93
    .line 94
    .line 95
    invoke-static {v6}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    const/16 v7, 0x8

    .line 100
    .line 101
    const/16 v8, 0x7d5

    .line 102
    .line 103
    const-string v9, "UHD"

    .line 104
    .line 105
    invoke-static {v7, v8, v9, v6}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    sput-object v6, LZ/v;->d:LZ/v;

    .line 110
    .line 111
    sget-object v7, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/16 v9, 0x7d0

    .line 115
    .line 116
    const-string v10, "LOWEST"

    .line 117
    .line 118
    invoke-static {v8, v9, v10, v7}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    sput-object v9, LZ/v;->e:LZ/v;

    .line 123
    .line 124
    const/16 v10, 0x7d1

    .line 125
    .line 126
    const-string v11, "HIGHEST"

    .line 127
    .line 128
    const/4 v12, 0x1

    .line 129
    invoke-static {v12, v10, v11, v7}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    sput-object v10, LZ/v;->f:LZ/v;

    .line 134
    .line 135
    const/4 v11, -0x1

    .line 136
    const-string v13, "NONE"

    .line 137
    .line 138
    invoke-static {v11, v11, v13, v7}, LZ/v$b;->h(IILjava/lang/String;Ljava/util/List;)LZ/v$b;

    .line 139
    .line 140
    .line 141
    move-result-object v7

    .line 142
    sput-object v7, LZ/v;->g:LZ/v;

    .line 143
    .line 144
    new-instance v7, Ljava/util/HashSet;

    .line 145
    .line 146
    new-array v5, v5, [LZ/v;

    .line 147
    .line 148
    aput-object v9, v5, v8

    .line 149
    .line 150
    aput-object v10, v5, v12

    .line 151
    .line 152
    const/4 v9, 0x2

    .line 153
    aput-object v0, v5, v9

    .line 154
    .line 155
    const/4 v10, 0x3

    .line 156
    aput-object v1, v5, v10

    .line 157
    .line 158
    aput-object v4, v5, v2

    .line 159
    .line 160
    aput-object v6, v5, v3

    .line 161
    .line 162
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    invoke-direct {v7, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 167
    .line 168
    .line 169
    sput-object v7, LZ/v;->h:Ljava/util/Set;

    .line 170
    .line 171
    new-array v2, v2, [LZ/v;

    .line 172
    .line 173
    aput-object v6, v2, v8

    .line 174
    .line 175
    aput-object v4, v2, v12

    .line 176
    .line 177
    aput-object v1, v2, v9

    .line 178
    .line 179
    aput-object v0, v2, v10

    .line 180
    .line 181
    invoke-static {v2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    sput-object v0, LZ/v;->i:Ljava/util/List;

    .line 186
    .line 187
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LZ/v$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LZ/v;-><init>()V

    return-void
.end method

.method static a(LZ/v;)Z
    .locals 1

    .line 1
    sget-object v0, LZ/v;->h:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public static b()Ljava/util/List;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    sget-object v1, LZ/v;->i:Ljava/util/List;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
