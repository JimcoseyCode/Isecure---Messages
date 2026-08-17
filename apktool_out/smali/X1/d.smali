.class public LX1/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LX1/d$b;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Lc2/n;

.field private final d:J

.field private final e:J

.field private final f:J

.field private final g:LX1/j;

.field private final h:LW1/a;

.field private final i:LW1/c;

.field private final j:LZ1/b;

.field private final k:Landroid/content/Context;

.field private final l:Z


# direct methods
.method protected constructor <init>(LX1/d$b;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LX1/d$b;->e(LX1/d$b;)Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LX1/d;->k:Landroid/content/Context;

    .line 9
    .line 10
    invoke-static {p1}, LX1/d$b;->b(LX1/d$b;)Lc2/n;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 22
    :goto_1
    const-string v2, "Either a non-null context or a base directory path or supplier must be provided."

    .line 23
    .line 24
    invoke-static {v1, v2}, Lc2/k;->j(ZLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, LX1/d$b;->b(LX1/d$b;)Lc2/n;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    if-nez v1, :cond_2

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    new-instance v0, LX1/d$a;

    .line 36
    .line 37
    invoke-direct {v0, p0}, LX1/d$a;-><init>(LX1/d;)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v0}, LX1/d$b;->m(LX1/d$b;Lc2/n;)V

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {p1}, LX1/d$b;->l(LX1/d$b;)I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput v0, p0, LX1/d;->a:I

    .line 48
    .line 49
    invoke-static {p1}, LX1/d$b;->a(LX1/d$b;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/String;

    .line 58
    .line 59
    iput-object v0, p0, LX1/d;->b:Ljava/lang/String;

    .line 60
    .line 61
    invoke-static {p1}, LX1/d$b;->b(LX1/d$b;)Lc2/n;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lc2/n;

    .line 70
    .line 71
    iput-object v0, p0, LX1/d;->c:Lc2/n;

    .line 72
    .line 73
    invoke-static {p1}, LX1/d$b;->i(LX1/d$b;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v0

    .line 77
    iput-wide v0, p0, LX1/d;->d:J

    .line 78
    .line 79
    invoke-static {p1}, LX1/d$b;->j(LX1/d$b;)J

    .line 80
    .line 81
    .line 82
    move-result-wide v0

    .line 83
    iput-wide v0, p0, LX1/d;->e:J

    .line 84
    .line 85
    invoke-static {p1}, LX1/d$b;->k(LX1/d$b;)J

    .line 86
    .line 87
    .line 88
    move-result-wide v0

    .line 89
    iput-wide v0, p0, LX1/d;->f:J

    .line 90
    .line 91
    invoke-static {p1}, LX1/d$b;->g(LX1/d$b;)LX1/j;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-static {v0}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, LX1/j;

    .line 100
    .line 101
    iput-object v0, p0, LX1/d;->g:LX1/j;

    .line 102
    .line 103
    invoke-static {p1}, LX1/d$b;->c(LX1/d$b;)LW1/a;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    if-nez v0, :cond_3

    .line 108
    .line 109
    invoke-static {}, LW1/g;->b()LW1/g;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    goto :goto_2

    .line 114
    :cond_3
    invoke-static {p1}, LX1/d$b;->c(LX1/d$b;)LW1/a;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    :goto_2
    iput-object v0, p0, LX1/d;->h:LW1/a;

    .line 119
    .line 120
    invoke-static {p1}, LX1/d$b;->d(LX1/d$b;)LW1/c;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-nez v0, :cond_4

    .line 125
    .line 126
    invoke-static {}, LW1/h;->i()LW1/h;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_3

    .line 131
    :cond_4
    invoke-static {p1}, LX1/d$b;->d(LX1/d$b;)LW1/c;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    :goto_3
    iput-object v0, p0, LX1/d;->i:LW1/c;

    .line 136
    .line 137
    invoke-static {p1}, LX1/d$b;->f(LX1/d$b;)LZ1/b;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    if-nez v0, :cond_5

    .line 142
    .line 143
    invoke-static {}, LZ1/c;->b()LZ1/c;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto :goto_4

    .line 148
    :cond_5
    invoke-static {p1}, LX1/d$b;->f(LX1/d$b;)LZ1/b;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :goto_4
    iput-object v0, p0, LX1/d;->j:LZ1/b;

    .line 153
    .line 154
    invoke-static {p1}, LX1/d$b;->h(LX1/d$b;)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput-boolean p1, p0, LX1/d;->l:Z

    .line 159
    .line 160
    return-void
.end method

.method static bridge synthetic a(LX1/d;)Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, LX1/d;->k:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public static m(Landroid/content/Context;)LX1/d$b;
    .locals 2

    .line 1
    new-instance v0, LX1/d$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LX1/d$b;-><init>(Landroid/content/Context;LX1/e;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method


# virtual methods
.method public b()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->b:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->c:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()LW1/a;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->h:LW1/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public e()LW1/c;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->i:LW1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public f()J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d;->d:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public g()LZ1/b;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->j:LZ1/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public h()LX1/j;
    .locals 1

    .line 1
    iget-object v0, p0, LX1/d;->g:LX1/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LX1/d;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public j()J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d;->e:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public k()J
    .locals 2

    .line 1
    iget-wide v0, p0, LX1/d;->f:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public l()I
    .locals 1

    .line 1
    iget v0, p0, LX1/d;->a:I

    .line 2
    .line 3
    return v0
.end method
