.class LU1/g$E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "E"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LU1/g$E$e;,
        LU1/g$E$i;,
        LU1/g$E$h;,
        LU1/g$E$g;,
        LU1/g$E$f;,
        LU1/g$E$b;,
        LU1/g$E$d;,
        LU1/g$E$c;,
        LU1/g$E$a;
    }
.end annotation


# instance fields
.field A:LU1/g$E$f;

.field B:Ljava/lang/Boolean;

.field C:LU1/g$c;

.field D:Ljava/lang/String;

.field E:Ljava/lang/String;

.field F:Ljava/lang/String;

.field G:Ljava/lang/Boolean;

.field H:Ljava/lang/Boolean;

.field I:LU1/g$O;

.field J:Ljava/lang/Float;

.field K:Ljava/lang/String;

.field L:LU1/g$E$a;

.field M:Ljava/lang/String;

.field N:LU1/g$O;

.field O:Ljava/lang/Float;

.field P:LU1/g$O;

.field Q:Ljava/lang/Float;

.field R:LU1/g$E$i;

.field S:LU1/g$E$e;

.field g:J

.field h:LU1/g$O;

.field i:LU1/g$E$a;

.field j:Ljava/lang/Float;

.field k:LU1/g$O;

.field l:Ljava/lang/Float;

.field m:LU1/g$p;

.field n:LU1/g$E$c;

.field o:LU1/g$E$d;

.field p:Ljava/lang/Float;

.field q:[LU1/g$p;

.field r:LU1/g$p;

.field s:Ljava/lang/Float;

.field t:LU1/g$f;

.field u:Ljava/util/List;

.field v:LU1/g$p;

.field w:Ljava/lang/Integer;

.field x:LU1/g$E$b;

.field y:LU1/g$E$g;

.field z:LU1/g$E$h;


# direct methods
.method constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, LU1/g$E;->g:J

    .line 7
    .line 8
    return-void
.end method

.method static a()LU1/g$E;
    .locals 8

    .line 1
    new-instance v0, LU1/g$E;

    .line 2
    .line 3
    invoke-direct {v0}, LU1/g$E;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, LU1/g$E;->g:J

    .line 9
    .line 10
    sget-object v1, LU1/g$f;->h:LU1/g$f;

    .line 11
    .line 12
    iput-object v1, v0, LU1/g$E;->h:LU1/g$O;

    .line 13
    .line 14
    sget-object v2, LU1/g$E$a;->g:LU1/g$E$a;

    .line 15
    .line 16
    iput-object v2, v0, LU1/g$E;->i:LU1/g$E$a;

    .line 17
    .line 18
    const/high16 v3, 0x3f800000    # 1.0f

    .line 19
    .line 20
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    iput-object v4, v0, LU1/g$E;->j:Ljava/lang/Float;

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    iput-object v5, v0, LU1/g$E;->k:LU1/g$O;

    .line 28
    .line 29
    iput-object v4, v0, LU1/g$E;->l:Ljava/lang/Float;

    .line 30
    .line 31
    new-instance v6, LU1/g$p;

    .line 32
    .line 33
    invoke-direct {v6, v3}, LU1/g$p;-><init>(F)V

    .line 34
    .line 35
    .line 36
    iput-object v6, v0, LU1/g$E;->m:LU1/g$p;

    .line 37
    .line 38
    sget-object v3, LU1/g$E$c;->g:LU1/g$E$c;

    .line 39
    .line 40
    iput-object v3, v0, LU1/g$E;->n:LU1/g$E$c;

    .line 41
    .line 42
    sget-object v3, LU1/g$E$d;->g:LU1/g$E$d;

    .line 43
    .line 44
    iput-object v3, v0, LU1/g$E;->o:LU1/g$E$d;

    .line 45
    .line 46
    const/high16 v3, 0x40800000    # 4.0f

    .line 47
    .line 48
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    iput-object v3, v0, LU1/g$E;->p:Ljava/lang/Float;

    .line 53
    .line 54
    iput-object v5, v0, LU1/g$E;->q:[LU1/g$p;

    .line 55
    .line 56
    new-instance v3, LU1/g$p;

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    invoke-direct {v3, v6}, LU1/g$p;-><init>(F)V

    .line 60
    .line 61
    .line 62
    iput-object v3, v0, LU1/g$E;->r:LU1/g$p;

    .line 63
    .line 64
    iput-object v4, v0, LU1/g$E;->s:Ljava/lang/Float;

    .line 65
    .line 66
    iput-object v1, v0, LU1/g$E;->t:LU1/g$f;

    .line 67
    .line 68
    iput-object v5, v0, LU1/g$E;->u:Ljava/util/List;

    .line 69
    .line 70
    new-instance v3, LU1/g$p;

    .line 71
    .line 72
    const/high16 v6, 0x41400000    # 12.0f

    .line 73
    .line 74
    sget-object v7, LU1/g$d0;->m:LU1/g$d0;

    .line 75
    .line 76
    invoke-direct {v3, v6, v7}, LU1/g$p;-><init>(FLU1/g$d0;)V

    .line 77
    .line 78
    .line 79
    iput-object v3, v0, LU1/g$E;->v:LU1/g$p;

    .line 80
    .line 81
    const/16 v3, 0x190

    .line 82
    .line 83
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    iput-object v3, v0, LU1/g$E;->w:Ljava/lang/Integer;

    .line 88
    .line 89
    sget-object v3, LU1/g$E$b;->g:LU1/g$E$b;

    .line 90
    .line 91
    iput-object v3, v0, LU1/g$E;->x:LU1/g$E$b;

    .line 92
    .line 93
    sget-object v3, LU1/g$E$g;->g:LU1/g$E$g;

    .line 94
    .line 95
    iput-object v3, v0, LU1/g$E;->y:LU1/g$E$g;

    .line 96
    .line 97
    sget-object v3, LU1/g$E$h;->g:LU1/g$E$h;

    .line 98
    .line 99
    iput-object v3, v0, LU1/g$E;->z:LU1/g$E$h;

    .line 100
    .line 101
    sget-object v3, LU1/g$E$f;->g:LU1/g$E$f;

    .line 102
    .line 103
    iput-object v3, v0, LU1/g$E;->A:LU1/g$E$f;

    .line 104
    .line 105
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v3, v0, LU1/g$E;->B:Ljava/lang/Boolean;

    .line 108
    .line 109
    iput-object v5, v0, LU1/g$E;->C:LU1/g$c;

    .line 110
    .line 111
    iput-object v5, v0, LU1/g$E;->D:Ljava/lang/String;

    .line 112
    .line 113
    iput-object v5, v0, LU1/g$E;->E:Ljava/lang/String;

    .line 114
    .line 115
    iput-object v5, v0, LU1/g$E;->F:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v3, v0, LU1/g$E;->G:Ljava/lang/Boolean;

    .line 118
    .line 119
    iput-object v3, v0, LU1/g$E;->H:Ljava/lang/Boolean;

    .line 120
    .line 121
    iput-object v1, v0, LU1/g$E;->I:LU1/g$O;

    .line 122
    .line 123
    iput-object v4, v0, LU1/g$E;->J:Ljava/lang/Float;

    .line 124
    .line 125
    iput-object v5, v0, LU1/g$E;->K:Ljava/lang/String;

    .line 126
    .line 127
    iput-object v2, v0, LU1/g$E;->L:LU1/g$E$a;

    .line 128
    .line 129
    iput-object v5, v0, LU1/g$E;->M:Ljava/lang/String;

    .line 130
    .line 131
    iput-object v5, v0, LU1/g$E;->N:LU1/g$O;

    .line 132
    .line 133
    iput-object v4, v0, LU1/g$E;->O:Ljava/lang/Float;

    .line 134
    .line 135
    iput-object v5, v0, LU1/g$E;->P:LU1/g$O;

    .line 136
    .line 137
    iput-object v4, v0, LU1/g$E;->Q:Ljava/lang/Float;

    .line 138
    .line 139
    sget-object v1, LU1/g$E$i;->g:LU1/g$E$i;

    .line 140
    .line 141
    iput-object v1, v0, LU1/g$E;->R:LU1/g$E$i;

    .line 142
    .line 143
    sget-object v1, LU1/g$E$e;->g:LU1/g$E$e;

    .line 144
    .line 145
    iput-object v1, v0, LU1/g$E;->S:LU1/g$E$e;

    .line 146
    .line 147
    return-object v0
.end method


# virtual methods
.method b(Z)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 8
    .line 9
    iput-object v1, p0, LU1/g$E;->G:Ljava/lang/Boolean;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    :goto_0
    iput-object v1, p0, LU1/g$E;->B:Ljava/lang/Boolean;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    iput-object p1, p0, LU1/g$E;->C:LU1/g$c;

    .line 20
    .line 21
    iput-object p1, p0, LU1/g$E;->K:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v0, p0, LU1/g$E;->s:Ljava/lang/Float;

    .line 24
    .line 25
    sget-object v1, LU1/g$f;->h:LU1/g$f;

    .line 26
    .line 27
    iput-object v1, p0, LU1/g$E;->I:LU1/g$O;

    .line 28
    .line 29
    iput-object v0, p0, LU1/g$E;->J:Ljava/lang/Float;

    .line 30
    .line 31
    iput-object p1, p0, LU1/g$E;->M:Ljava/lang/String;

    .line 32
    .line 33
    iput-object p1, p0, LU1/g$E;->N:LU1/g$O;

    .line 34
    .line 35
    iput-object v0, p0, LU1/g$E;->O:Ljava/lang/Float;

    .line 36
    .line 37
    iput-object p1, p0, LU1/g$E;->P:LU1/g$O;

    .line 38
    .line 39
    iput-object v0, p0, LU1/g$E;->Q:Ljava/lang/Float;

    .line 40
    .line 41
    sget-object p1, LU1/g$E$i;->g:LU1/g$E$i;

    .line 42
    .line 43
    iput-object p1, p0, LU1/g$E;->R:LU1/g$E$i;

    .line 44
    .line 45
    return-void
.end method

.method protected clone()Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LU1/g$E;

    .line 6
    .line 7
    iget-object v1, p0, LU1/g$E;->q:[LU1/g$p;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, [LU1/g$p;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, [LU1/g$p;

    .line 16
    .line 17
    iput-object v1, v0, LU1/g$E;->q:[LU1/g$p;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
