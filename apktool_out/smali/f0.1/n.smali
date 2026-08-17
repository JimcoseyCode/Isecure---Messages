.class public Lf0/n;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LH0/i;


# static fields
.field private static final g:Landroid/util/Size;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:LF/v1;

.field private final c:LZ/z0;

.field private final d:Landroid/util/Size;

.field private final e:Ly/H;

.field private final f:Landroid/util/Range;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Size;

    .line 2
    .line 3
    const/16 v1, 0x500

    .line 4
    .line 5
    const/16 v2, 0x2d0

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lf0/n;->g:Landroid/util/Size;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;LF/v1;LZ/z0;Landroid/util/Size;Ly/H;Landroid/util/Range;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lf0/n;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lf0/n;->b:LF/v1;

    .line 7
    .line 8
    iput-object p3, p0, Lf0/n;->c:LZ/z0;

    .line 9
    .line 10
    iput-object p4, p0, Lf0/n;->d:Landroid/util/Size;

    .line 11
    .line 12
    iput-object p5, p0, Lf0/n;->e:Ly/H;

    .line 13
    .line 14
    iput-object p6, p0, Lf0/n;->f:Landroid/util/Range;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()Lg0/q0;
    .locals 13

    .line 1
    iget-object v0, p0, Lf0/n;->c:LZ/z0;

    .line 2
    .line 3
    iget-object v1, p0, Lf0/n;->f:Landroid/util/Range;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lf0/m;->c(LZ/z0;Landroid/util/Range;)Lf0/j;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Resolved VIDEO frame rates: Capture frame rate = "

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lf0/j;->a()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v2, "fps. Encode frame rate = "

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lf0/j;->b()I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v2, "fps."

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "VidEncCfgDefaultRslvr"

    .line 48
    .line 49
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lf0/n;->c:LZ/z0;

    .line 53
    .line 54
    invoke-virtual {v1}, LZ/z0;->c()Landroid/util/Range;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    const-string v1, "Using fallback VIDEO bitrate"

    .line 59
    .line 60
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, p0, Lf0/n;->e:Ly/H;

    .line 64
    .line 65
    invoke-virtual {v1}, Ly/H;->a()I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-virtual {v0}, Lf0/j;->b()I

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    iget-object v1, p0, Lf0/n;->d:Landroid/util/Size;

    .line 74
    .line 75
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    sget-object v1, Lf0/n;->g:Landroid/util/Size;

    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    .line 82
    .line 83
    .line 84
    move-result v9

    .line 85
    iget-object v2, p0, Lf0/n;->d:Landroid/util/Size;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 88
    .line 89
    .line 90
    move-result v10

    .line 91
    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    .line 92
    .line 93
    .line 94
    move-result v11

    .line 95
    const v3, 0xd59f80

    .line 96
    .line 97
    .line 98
    const/16 v5, 0x8

    .line 99
    .line 100
    const/16 v7, 0x1e

    .line 101
    .line 102
    invoke-static/range {v3 .. v12}, Lf0/m;->f(IIIIIIIIILandroid/util/Range;)I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    iget-object v2, p0, Lf0/n;->a:Ljava/lang/String;

    .line 107
    .line 108
    iget-object v3, p0, Lf0/n;->e:Ly/H;

    .line 109
    .line 110
    invoke-static {v2, v3}, Lh0/b;->a(Ljava/lang/String;Ly/H;)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    iget-object v3, p0, Lf0/n;->a:Ljava/lang/String;

    .line 115
    .line 116
    invoke-static {v3, v2}, Lf0/m;->b(Ljava/lang/String;I)Lg0/r0;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    invoke-static {}, Lg0/q0;->c()Lg0/q0$a;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    iget-object v5, p0, Lf0/n;->a:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v4, v5}, Lg0/q0$a;->i(Ljava/lang/String;)Lg0/q0$a;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    iget-object v5, p0, Lf0/n;->b:LF/v1;

    .line 131
    .line 132
    invoke-virtual {v4, v5}, Lg0/q0$a;->h(LF/v1;)Lg0/q0$a;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    iget-object v5, p0, Lf0/n;->d:Landroid/util/Size;

    .line 137
    .line 138
    invoke-virtual {v4, v5}, Lg0/q0$a;->k(Landroid/util/Size;)Lg0/q0$a;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    invoke-virtual {v4, v1}, Lg0/q0$a;->b(I)Lg0/q0$a;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v0}, Lf0/j;->a()I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    invoke-virtual {v1, v4}, Lg0/q0$a;->c(I)Lg0/q0$a;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    invoke-virtual {v0}, Lf0/j;->b()I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    invoke-virtual {v1, v0}, Lg0/q0$a;->f(I)Lg0/q0$a;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    invoke-virtual {v0, v2}, Lg0/q0$a;->j(I)Lg0/q0$a;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-virtual {v0, v3}, Lg0/q0$a;->e(Lg0/r0;)Lg0/q0$a;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-virtual {v0}, Lg0/q0$a;->a()Lg0/q0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lf0/n;->a()Lg0/q0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
