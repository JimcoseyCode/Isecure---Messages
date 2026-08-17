.class public final LZ/S;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LZ/x0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/S$l;,
        LZ/S$j;,
        LZ/S$h;,
        LZ/S$k;,
        LZ/S$i;
    }
.end annotation


# static fields
.field static A0:J

.field private static final q0:Ljava/util/Set;

.field private static final r0:Ljava/util/Set;

.field public static final s0:LZ/y;

.field private static final t0:LZ/z0;

.field private static final u0:LZ/r;

.field private static final v0:Ljava/lang/Exception;

.field static final w0:Lg0/o;

.field private static final x0:Lb0/f$a;

.field private static final y0:Ljava/util/concurrent/Executor;

.field static z0:I


# instance fields
.field A:Ljava/lang/Integer;

.field B:Ly/I0;

.field C:LF/v1;

.field D:Landroid/view/Surface;

.field E:Landroid/view/Surface;

.field F:Landroid/media/MediaMuxer;

.field final G:LF/T0;

.field H:Lc0/n;

.field I:Lg0/l;

.field J:Lg0/m0;

.field K:Lg0/l;

.field L:Lg0/m0;

.field M:LZ/S$h;

.field N:Landroid/net/Uri;

.field O:J

.field P:J

.field Q:J

.field R:J

.field S:I

.field T:J

.field U:J

.field V:J

.field W:J

.field X:J

.field Y:I

.field Z:Ljava/lang/Throwable;

.field private final a:LF/T0;

.field a0:Lg0/i;

.field private final b:LF/T0;

.field final b0:LO/c;

.field private final c:Ljava/util/concurrent/Executor;

.field c0:Ljava/lang/Throwable;

.field private final d:Ljava/util/concurrent/Executor;

.field d0:Z

.field final e:Ljava/util/concurrent/Executor;

.field e0:LZ/x0$a;

.field private final f:Lg0/o;

.field f0:Ljava/util/concurrent/ScheduledFuture;

.field private final g:Lg0/o;

.field private g0:Z

.field private final h:Lb0/f$a;

.field h0:LZ/w0;

.field private final i:Ljava/lang/Object;

.field private i0:Lg0/q0;

.field private final j:Z

.field j0:LZ/w0;

.field private final k:I

.field k0:D

.field private final l:J

.field private l0:Z

.field private final m:LF/T0;

.field private m0:LZ/S$k;

.field private n:LZ/S$l;

.field private n0:Lb0/f;

.field private o:LZ/S$l;

.field private o0:J

.field p:I

.field private p0:Z

.field q:LZ/S$j;

.field r:LZ/S$j;

.field private s:J

.field t:LZ/S$j;

.field u:Z

.field private v:Ly/I0$h;

.field private w:Ly/I0$h;

.field private x:Lb0/i;

.field final y:Ljava/util/List;

.field z:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, LZ/S$l;->h:LZ/S$l;

    .line 2
    .line 3
    sget-object v1, LZ/S$l;->i:LZ/S$l;

    .line 4
    .line 5
    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, LZ/S;->q0:Ljava/util/Set;

    .line 14
    .line 15
    sget-object v0, LZ/S$l;->g:LZ/S$l;

    .line 16
    .line 17
    sget-object v1, LZ/S$l;->j:LZ/S$l;

    .line 18
    .line 19
    sget-object v2, LZ/S$l;->n:LZ/S$l;

    .line 20
    .line 21
    sget-object v3, LZ/S$l;->m:LZ/S$l;

    .line 22
    .line 23
    sget-object v4, LZ/S$l;->o:LZ/S$l;

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3, v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    sput-object v0, LZ/S;->r0:Ljava/util/Set;

    .line 34
    .line 35
    sget-object v0, LZ/z0;->b:LZ/y;

    .line 36
    .line 37
    sput-object v0, LZ/S;->s0:LZ/y;

    .line 38
    .line 39
    invoke-static {}, LZ/z0;->a()LZ/z0$a;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1, v0}, LZ/z0$a;->e(LZ/y;)LZ/z0$a;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const/4 v1, -0x1

    .line 48
    invoke-virtual {v0, v1}, LZ/z0$a;->b(I)LZ/z0$a;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, LZ/z0$a;->a()LZ/z0;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    sput-object v0, LZ/S;->t0:LZ/z0;

    .line 57
    .line 58
    invoke-static {}, LZ/r;->a()LZ/r$a;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2, v1}, LZ/r$a;->e(I)LZ/r$a;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1, v0}, LZ/r$a;->f(LZ/z0;)LZ/r$a;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, LZ/r$a;->a()LZ/r;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, LZ/S;->u0:LZ/r;

    .line 75
    .line 76
    new-instance v0, Ljava/lang/RuntimeException;

    .line 77
    .line 78
    const-string v1, "The video frame producer became inactive before any data was received."

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, LZ/S;->v0:Ljava/lang/Exception;

    .line 84
    .line 85
    new-instance v0, LZ/I;

    .line 86
    .line 87
    invoke-direct {v0}, LZ/I;-><init>()V

    .line 88
    .line 89
    .line 90
    sput-object v0, LZ/S;->w0:Lg0/o;

    .line 91
    .line 92
    new-instance v0, LZ/J;

    .line 93
    .line 94
    invoke-direct {v0}, LZ/J;-><init>()V

    .line 95
    .line 96
    .line 97
    sput-object v0, LZ/S;->x0:Lb0/f$a;

    .line 98
    .line 99
    invoke-static {}, LI/c;->d()Ljava/util/concurrent/Executor;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, LI/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, LZ/S;->y0:Ljava/util/concurrent/Executor;

    .line 108
    .line 109
    const/4 v0, 0x3

    .line 110
    sput v0, LZ/S;->z0:I

    .line 111
    .line 112
    const-wide/16 v0, 0x3e8

    .line 113
    .line 114
    sput-wide v0, LZ/S;->A0:J

    .line 115
    .line 116
    return-void
.end method

.method constructor <init>(Ljava/util/concurrent/Executor;LZ/r;ILg0/o;Lg0/o;Lb0/f$a;J)V
    .locals 7

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 10
    .line 11
    const-class v0, Landroidx/camera/video/internal/compat/quirk/EncoderNotUsePersistentInputSurfaceQuirk;

    .line 12
    .line 13
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    move v0, v1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v0, v2

    .line 24
    :goto_0
    iput-boolean v0, p0, LZ/S;->j:Z

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    invoke-static {v0}, LF/T0;->l(Ljava/lang/Object;)LF/T0;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    iput-object v3, p0, LZ/S;->m:LF/T0;

    .line 32
    .line 33
    sget-object v3, LZ/S$l;->g:LZ/S$l;

    .line 34
    .line 35
    iput-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 36
    .line 37
    iput-object v0, p0, LZ/S;->o:LZ/S$l;

    .line 38
    .line 39
    iput v2, p0, LZ/S;->p:I

    .line 40
    .line 41
    iput-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 42
    .line 43
    iput-object v0, p0, LZ/S;->r:LZ/S$j;

    .line 44
    .line 45
    const-wide/16 v3, 0x0

    .line 46
    .line 47
    iput-wide v3, p0, LZ/S;->s:J

    .line 48
    .line 49
    iput-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 50
    .line 51
    iput-boolean v2, p0, LZ/S;->u:Z

    .line 52
    .line 53
    iput-object v0, p0, LZ/S;->v:Ly/I0$h;

    .line 54
    .line 55
    iput-object v0, p0, LZ/S;->w:Ly/I0$h;

    .line 56
    .line 57
    iput-object v0, p0, LZ/S;->x:Lb0/i;

    .line 58
    .line 59
    new-instance v5, Ljava/util/ArrayList;

    .line 60
    .line 61
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 62
    .line 63
    .line 64
    iput-object v5, p0, LZ/S;->y:Ljava/util/List;

    .line 65
    .line 66
    iput-object v0, p0, LZ/S;->z:Ljava/lang/Integer;

    .line 67
    .line 68
    iput-object v0, p0, LZ/S;->A:Ljava/lang/Integer;

    .line 69
    .line 70
    iput-object v0, p0, LZ/S;->D:Landroid/view/Surface;

    .line 71
    .line 72
    iput-object v0, p0, LZ/S;->E:Landroid/view/Surface;

    .line 73
    .line 74
    iput-object v0, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 75
    .line 76
    iput-object v0, p0, LZ/S;->H:Lc0/n;

    .line 77
    .line 78
    iput-object v0, p0, LZ/S;->I:Lg0/l;

    .line 79
    .line 80
    iput-object v0, p0, LZ/S;->J:Lg0/m0;

    .line 81
    .line 82
    iput-object v0, p0, LZ/S;->K:Lg0/l;

    .line 83
    .line 84
    iput-object v0, p0, LZ/S;->L:Lg0/m0;

    .line 85
    .line 86
    sget-object v5, LZ/S$h;->g:LZ/S$h;

    .line 87
    .line 88
    iput-object v5, p0, LZ/S;->M:LZ/S$h;

    .line 89
    .line 90
    sget-object v5, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 91
    .line 92
    iput-object v5, p0, LZ/S;->N:Landroid/net/Uri;

    .line 93
    .line 94
    iput-wide v3, p0, LZ/S;->O:J

    .line 95
    .line 96
    iput-wide v3, p0, LZ/S;->P:J

    .line 97
    .line 98
    iput-wide v3, p0, LZ/S;->Q:J

    .line 99
    .line 100
    const-wide v5, 0x7fffffffffffffffL

    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    iput-wide v5, p0, LZ/S;->R:J

    .line 106
    .line 107
    iput v2, p0, LZ/S;->S:I

    .line 108
    .line 109
    iput-wide v5, p0, LZ/S;->T:J

    .line 110
    .line 111
    iput-wide v5, p0, LZ/S;->U:J

    .line 112
    .line 113
    iput-wide v5, p0, LZ/S;->V:J

    .line 114
    .line 115
    iput-wide v3, p0, LZ/S;->W:J

    .line 116
    .line 117
    iput-wide v3, p0, LZ/S;->X:J

    .line 118
    .line 119
    iput v1, p0, LZ/S;->Y:I

    .line 120
    .line 121
    iput-object v0, p0, LZ/S;->Z:Ljava/lang/Throwable;

    .line 122
    .line 123
    iput-object v0, p0, LZ/S;->a0:Lg0/i;

    .line 124
    .line 125
    new-instance v1, LO/a;

    .line 126
    .line 127
    const/16 v3, 0x3c

    .line 128
    .line 129
    invoke-direct {v1, v3}, LO/a;-><init>(I)V

    .line 130
    .line 131
    .line 132
    iput-object v1, p0, LZ/S;->b0:LO/c;

    .line 133
    .line 134
    iput-object v0, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 135
    .line 136
    iput-boolean v2, p0, LZ/S;->d0:Z

    .line 137
    .line 138
    sget-object v1, LZ/x0$a;->i:LZ/x0$a;

    .line 139
    .line 140
    iput-object v1, p0, LZ/S;->e0:LZ/x0$a;

    .line 141
    .line 142
    iput-object v0, p0, LZ/S;->f0:Ljava/util/concurrent/ScheduledFuture;

    .line 143
    .line 144
    iput-boolean v2, p0, LZ/S;->g0:Z

    .line 145
    .line 146
    iput-object v0, p0, LZ/S;->i0:Lg0/q0;

    .line 147
    .line 148
    iput-object v0, p0, LZ/S;->j0:LZ/w0;

    .line 149
    .line 150
    const-wide/16 v3, 0x0

    .line 151
    .line 152
    iput-wide v3, p0, LZ/S;->k0:D

    .line 153
    .line 154
    iput-boolean v2, p0, LZ/S;->l0:Z

    .line 155
    .line 156
    iput-object v0, p0, LZ/S;->m0:LZ/S$k;

    .line 157
    .line 158
    iput-object v0, p0, LZ/S;->n0:Lb0/f;

    .line 159
    .line 160
    iput-wide v5, p0, LZ/S;->o0:J

    .line 161
    .line 162
    iput-boolean v2, p0, LZ/S;->p0:Z

    .line 163
    .line 164
    iput-object p1, p0, LZ/S;->c:Ljava/util/concurrent/Executor;

    .line 165
    .line 166
    if-eqz p1, :cond_1

    .line 167
    .line 168
    goto :goto_1

    .line 169
    :cond_1
    invoke-static {}, LI/c;->d()Ljava/util/concurrent/Executor;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    :goto_1
    iput-object p1, p0, LZ/S;->d:Ljava/util/concurrent/Executor;

    .line 174
    .line 175
    invoke-static {p1}, LI/c;->g(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    iput-object v0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 180
    .line 181
    invoke-direct {p0, p2}, LZ/S;->G(LZ/r;)LZ/r;

    .line 182
    .line 183
    .line 184
    move-result-object p2

    .line 185
    invoke-static {p2}, LF/T0;->l(Ljava/lang/Object;)LF/T0;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    iput-object p2, p0, LZ/S;->G:LF/T0;

    .line 190
    .line 191
    iput p3, p0, LZ/S;->k:I

    .line 192
    .line 193
    iget p2, p0, LZ/S;->p:I

    .line 194
    .line 195
    iget-object p3, p0, LZ/S;->n:LZ/S$l;

    .line 196
    .line 197
    invoke-direct {p0, p3}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 198
    .line 199
    .line 200
    move-result-object p3

    .line 201
    invoke-static {p2, p3}, LZ/d0;->d(ILZ/d0$a;)LZ/d0;

    .line 202
    .line 203
    .line 204
    move-result-object p2

    .line 205
    invoke-static {p2}, LF/T0;->l(Ljava/lang/Object;)LF/T0;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    iput-object p2, p0, LZ/S;->a:LF/T0;

    .line 210
    .line 211
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 212
    .line 213
    invoke-static {p2}, LF/T0;->l(Ljava/lang/Object;)LF/T0;

    .line 214
    .line 215
    .line 216
    move-result-object p2

    .line 217
    iput-object p2, p0, LZ/S;->b:LF/T0;

    .line 218
    .line 219
    iput-object p4, p0, LZ/S;->f:Lg0/o;

    .line 220
    .line 221
    iput-object p5, p0, LZ/S;->g:Lg0/o;

    .line 222
    .line 223
    iput-object p6, p0, LZ/S;->h:Lb0/f$a;

    .line 224
    .line 225
    new-instance p2, LZ/w0;

    .line 226
    .line 227
    invoke-direct {p2, p4, v0, p1}, LZ/w0;-><init>(Lg0/o;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;)V

    .line 228
    .line 229
    .line 230
    iput-object p2, p0, LZ/S;->h0:LZ/w0;

    .line 231
    .line 232
    const-wide/16 p1, -0x1

    .line 233
    .line 234
    cmp-long p1, p7, p1

    .line 235
    .line 236
    if-eqz p1, :cond_2

    .line 237
    .line 238
    goto :goto_2

    .line 239
    :cond_2
    const-wide/32 p7, 0x3200000

    .line 240
    .line 241
    .line 242
    :goto_2
    iput-wide p7, p0, LZ/S;->l:J

    .line 243
    .line 244
    new-instance p1, Ljava/lang/StringBuilder;

    .line 245
    .line 246
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 247
    .line 248
    .line 249
    const-string p2, "mRequiredFreeStorageBytes = "

    .line 250
    .line 251
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    .line 253
    .line 254
    invoke-static {p7, p8}, Lh0/e;->a(J)Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object p1

    .line 265
    const-string p2, "Recorder"

    .line 266
    .line 267
    invoke-static {p2, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    return-void
.end method

.method static synthetic A(LZ/S;)Lg0/o;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S;->f:Lg0/o;

    .line 2
    .line 3
    return-object p0
.end method

.method private A0(LZ/S$j;)V
    .locals 9

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    iput-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 6
    .line 7
    iget-object v0, p0, LZ/S;->h:Lb0/f$a;

    .line 8
    .line 9
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-interface {v0, v1}, Lb0/f$a;->a(LZ/s;)Lb0/f;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LZ/S;->n0:Lb0/f;

    .line 18
    .line 19
    invoke-interface {v0}, Lb0/f;->a()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0

    .line 23
    new-instance v2, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    .line 28
    const-string v3, "availableBytes = "

    .line 29
    .line 30
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, Lh0/e;->a(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const-string v3, "Recorder"

    .line 45
    .line 46
    invoke-static {v3, v2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-wide v4, p0, LZ/S;->l:J

    .line 50
    .line 51
    cmp-long v2, v0, v4

    .line 52
    .line 53
    const/4 v6, 0x3

    .line 54
    if-gez v2, :cond_0

    .line 55
    .line 56
    new-instance p1, Ljava/io/IOException;

    .line 57
    .line 58
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    iget-wide v1, p0, LZ/S;->l:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v1, "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes."

    .line 73
    .line 74
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0, v6, p1}, LZ/S;->I(ILjava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_0
    sub-long/2addr v0, v4

    .line 86
    iput-wide v0, p0, LZ/S;->o0:J

    .line 87
    .line 88
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v0}, LZ/s;->b()J

    .line 93
    .line 94
    .line 95
    move-result-wide v0

    .line 96
    const-wide/16 v4, 0x0

    .line 97
    .line 98
    cmp-long v0, v0, v4

    .line 99
    .line 100
    if-lez v0, :cond_1

    .line 101
    .line 102
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-virtual {v0}, LZ/s;->b()J

    .line 107
    .line 108
    .line 109
    move-result-wide v0

    .line 110
    long-to-double v0, v0

    .line 111
    const-wide v7, 0x3fee666666666666L    # 0.95

    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    mul-double/2addr v0, v7

    .line 117
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    iput-wide v0, p0, LZ/S;->W:J

    .line 122
    .line 123
    new-instance v0, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v1, "File size limit in bytes: "

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    iget-wide v1, p0, LZ/S;->W:J

    .line 134
    .line 135
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-static {v3, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    iput-wide v4, p0, LZ/S;->W:J

    .line 147
    .line 148
    :goto_0
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, LZ/s;->a()J

    .line 153
    .line 154
    .line 155
    move-result-wide v0

    .line 156
    cmp-long v0, v0, v4

    .line 157
    .line 158
    if-lez v0, :cond_2

    .line 159
    .line 160
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 161
    .line 162
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-virtual {v1}, LZ/s;->a()J

    .line 167
    .line 168
    .line 169
    move-result-wide v1

    .line 170
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 171
    .line 172
    .line 173
    move-result-wide v0

    .line 174
    iput-wide v0, p0, LZ/S;->X:J

    .line 175
    .line 176
    new-instance v0, Ljava/lang/StringBuilder;

    .line 177
    .line 178
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 179
    .line 180
    .line 181
    const-string v1, "Duration limit in nanoseconds: "

    .line 182
    .line 183
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    iget-wide v1, p0, LZ/S;->X:J

    .line 187
    .line 188
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    invoke-static {v3, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_2
    iput-wide v4, p0, LZ/S;->X:J

    .line 200
    .line 201
    :goto_1
    iget-object v0, p0, LZ/S;->M:LZ/S$h;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 204
    .line 205
    .line 206
    move-result v0

    .line 207
    if-eqz v0, :cond_6

    .line 208
    .line 209
    const/4 v1, 0x1

    .line 210
    if-eq v0, v1, :cond_4

    .line 211
    .line 212
    const/4 v1, 0x2

    .line 213
    if-eq v0, v1, :cond_3

    .line 214
    .line 215
    if-eq v0, v6, :cond_3

    .line 216
    .line 217
    const/4 v1, 0x4

    .line 218
    if-eq v0, v1, :cond_3

    .line 219
    .line 220
    const/4 v1, 0x5

    .line 221
    if-eq v0, v1, :cond_3

    .line 222
    .line 223
    goto/16 :goto_6

    .line 224
    .line 225
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 226
    .line 227
    new-instance v0, Ljava/lang/StringBuilder;

    .line 228
    .line 229
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 230
    .line 231
    .line 232
    const-string v1, "Incorrectly invoke startInternal in audio state "

    .line 233
    .line 234
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    iget-object v1, p0, LZ/S;->M:LZ/S$h;

    .line 238
    .line 239
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    throw p1

    .line 250
    :cond_4
    invoke-virtual {p1}, LZ/S$j;->W()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_5

    .line 255
    .line 256
    sget-object v0, LZ/S$h;->j:LZ/S$h;

    .line 257
    .line 258
    goto :goto_2

    .line 259
    :cond_5
    sget-object v0, LZ/S$h;->i:LZ/S$h;

    .line 260
    .line 261
    :goto_2
    invoke-virtual {p0, v0}, LZ/S;->r0(LZ/S$h;)V

    .line 262
    .line 263
    .line 264
    goto :goto_6

    .line 265
    :cond_6
    invoke-virtual {p1}, LZ/S$j;->W()Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    if-eqz v0, :cond_b

    .line 270
    .line 271
    invoke-virtual {p0}, LZ/S;->R()Z

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    if-eqz v0, :cond_a

    .line 276
    .line 277
    :try_start_0
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 278
    .line 279
    invoke-virtual {v0}, LZ/S$j;->g0()Z

    .line 280
    .line 281
    .line 282
    move-result v0

    .line 283
    if-eqz v0, :cond_7

    .line 284
    .line 285
    iget-object v0, p0, LZ/S;->K:Lg0/l;

    .line 286
    .line 287
    if-nez v0, :cond_8

    .line 288
    .line 289
    goto :goto_3

    .line 290
    :catch_0
    move-exception v0

    .line 291
    goto :goto_4

    .line 292
    :catch_1
    move-exception v0

    .line 293
    goto :goto_4

    .line 294
    :cond_7
    :goto_3
    invoke-direct {p0, p1}, LZ/S;->x0(LZ/S$j;)V

    .line 295
    .line 296
    .line 297
    :cond_8
    sget-object v0, LZ/S$h;->j:LZ/S$h;

    .line 298
    .line 299
    invoke-virtual {p0, v0}, LZ/S;->r0(LZ/S$h;)V
    :try_end_0
    .catch Lc0/o; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lg0/l0; {:try_start_0 .. :try_end_0} :catch_0

    .line 300
    .line 301
    .line 302
    goto :goto_6

    .line 303
    :goto_4
    const-string v1, "Unable to create audio resource with error: "

    .line 304
    .line 305
    invoke-static {v3, v1, v0}, Ly/h0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 306
    .line 307
    .line 308
    instance-of v1, v0, Lg0/l0;

    .line 309
    .line 310
    if-eqz v1, :cond_9

    .line 311
    .line 312
    sget-object v1, LZ/S$h;->k:LZ/S$h;

    .line 313
    .line 314
    goto :goto_5

    .line 315
    :cond_9
    sget-object v1, LZ/S$h;->l:LZ/S$h;

    .line 316
    .line 317
    :goto_5
    invoke-virtual {p0, v1}, LZ/S;->r0(LZ/S$h;)V

    .line 318
    .line 319
    .line 320
    iput-object v0, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_a
    new-instance p1, Ljava/lang/AssertionError;

    .line 324
    .line 325
    const-string v0, "The Recorder doesn\'t support recording with audio"

    .line 326
    .line 327
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    throw p1

    .line 331
    :cond_b
    :goto_6
    const/4 v0, 0x0

    .line 332
    invoke-direct {p0, p1, v0}, LZ/S;->H0(LZ/S$j;Z)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-eqz v0, :cond_c

    .line 340
    .line 341
    iget-object v0, p0, LZ/S;->H:Lc0/n;

    .line 342
    .line 343
    invoke-virtual {p1}, LZ/S$j;->d0()Z

    .line 344
    .line 345
    .line 346
    move-result p1

    .line 347
    invoke-virtual {v0, p1}, Lc0/n;->D(Z)V

    .line 348
    .line 349
    .line 350
    iget-object p1, p0, LZ/S;->K:Lg0/l;

    .line 351
    .line 352
    invoke-interface {p1}, Lg0/l;->start()V

    .line 353
    .line 354
    .line 355
    :cond_c
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 356
    .line 357
    invoke-interface {p1}, Lg0/l;->start()V

    .line 358
    .line 359
    .line 360
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 361
    .line 362
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 363
    .line 364
    .line 365
    move-result-object v0

    .line 366
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-static {v0, v1}, LZ/y0;->f(LZ/s;LZ/c0;)LZ/y0$d;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {p1, v0}, LZ/S$j;->u0(LZ/y0;)V

    .line 375
    .line 376
    .line 377
    return-void

    .line 378
    :cond_d
    new-instance p1, Ljava/lang/AssertionError;

    .line 379
    .line 380
    const-string v0, "Attempted to start a new recording while another was in progress."

    .line 381
    .line 382
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    throw p1
.end method

.method static synthetic B(LZ/S;)Ljava/util/concurrent/Executor;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S;->d:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object p0
.end method

.method private B0(LZ/S$j;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ/S;->A0(LZ/S$j;)V

    .line 2
    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    .line 6
    invoke-direct {p0, p1}, LZ/S;->f0(LZ/S$j;)V

    .line 7
    .line 8
    .line 9
    :cond_0
    return-void
.end method

.method static synthetic C(LZ/S;)Lb0/i;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S;->x:Lb0/i;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic D(LZ/S;Lg0/q0;)Lg0/q0;
    .locals 0

    .line 1
    iput-object p1, p0, LZ/S;->i0:Lg0/q0;

    .line 2
    .line 3
    return-object p1
.end method

.method static synthetic E(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3, p4}, LZ/S;->q0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static E0(Lb0/i;I)I
    .locals 3

    .line 1
    if-eqz p0, :cond_4

    .line 2
    .line 3
    invoke-interface {p0}, LF/w0;->b()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x1

    .line 10
    if-eq p0, v2, :cond_2

    .line 11
    .line 12
    if-eq p0, v1, :cond_1

    .line 13
    .line 14
    const/16 v0, 0x9

    .line 15
    .line 16
    if-eq p0, v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v2

    .line 20
    :cond_1
    return v0

    .line 21
    :cond_2
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 22
    .line 23
    const/16 p1, 0x1a

    .line 24
    .line 25
    if-ge p0, p1, :cond_3

    .line 26
    .line 27
    return v0

    .line 28
    :cond_3
    return v1

    .line 29
    :cond_4
    :goto_0
    return p1
.end method

.method private F()V
    .locals 1

    .line 1
    :goto_0
    iget-object v0, p0, LZ/S;->b0:LO/c;

    .line 2
    .line 3
    invoke-interface {v0}, LO/c;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LZ/S;->b0:LO/c;

    .line 10
    .line 11
    invoke-interface {v0}, LO/c;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
.end method

.method private F0()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->j0:LZ/w0;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {v0}, LZ/w0;->m()Lg0/l;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LZ/S;->I:Lg0/l;

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    invoke-static {v0}, LH0/g;->i(Z)V

    .line 17
    .line 18
    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v1, "Releasing video encoder: "

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v1, p0, LZ/S;->I:Lg0/l;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "Recorder"

    .line 39
    .line 40
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, LZ/S;->j0:LZ/w0;

    .line 44
    .line 45
    invoke-virtual {v0}, LZ/w0;->r()V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    iput-object v0, p0, LZ/S;->j0:LZ/w0;

    .line 50
    .line 51
    iput-object v0, p0, LZ/S;->I:Lg0/l;

    .line 52
    .line 53
    iput-object v0, p0, LZ/S;->J:Lg0/m0;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, LZ/S;->t0(Landroid/view/Surface;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    invoke-direct {p0}, LZ/S;->p0()Lm5/a;

    .line 60
    .line 61
    .line 62
    return-void
.end method

.method private G(LZ/r;)LZ/r;
    .locals 2

    .line 1
    invoke-virtual {p1}, LZ/r;->i()LZ/r$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, LZ/r;->d()LZ/z0;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1}, LZ/z0;->b()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v1, -0x1

    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    new-instance p1, LZ/z;

    .line 17
    .line 18
    invoke-direct {p1}, LZ/z;-><init>()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, LZ/r$a;->b(LH0/a;)LZ/r$a;

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, LZ/r$a;->a()LZ/r;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1
.end method

.method private H(Ly/I0;LF/v1;Z)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ly/I0;->v()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-string v1, "Recorder"

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p1, "Ignore the SurfaceRequest since it is already served."

    .line 10
    .line 11
    invoke-static {v1, p1}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 16
    .line 17
    new-instance v2, LZ/M;

    .line 18
    .line 19
    invoke-direct {v2, p0}, LZ/M;-><init>(LZ/S;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0, v2}, Ly/I0;->x(Ljava/util/concurrent/Executor;Ly/I0$i;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ly/I0;->q()Landroid/util/Size;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {p1}, Ly/I0;->o()Ly/H;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    invoke-virtual {p1}, Ly/I0;->m()LF/M;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-interface {v3}, LF/M;->d()Ly/q;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {p1}, Ly/I0;->r()I

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    invoke-virtual {p0, v3, v4}, LZ/S;->c(Ly/q;I)LZ/e0;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    invoke-interface {v3, v0, v2}, LZ/e0;->e(Landroid/util/Size;Ly/H;)LZ/v;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    new-instance v5, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    const-string v6, "Using supported quality of "

    .line 59
    .line 60
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v6, " for surface size "

    .line 67
    .line 68
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    sget-object v0, LZ/v;->g:LZ/v;

    .line 82
    .line 83
    if-eq v4, v0, :cond_2

    .line 84
    .line 85
    invoke-interface {v3, v4, v2}, LZ/e0;->c(LZ/v;Ly/H;)Lb0/i;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    iput-object v0, p0, LZ/S;->x:Lb0/i;

    .line 90
    .line 91
    if-eqz v0, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 95
    .line 96
    const-string p2, "Camera advertised available quality but did not produce EncoderProfiles  for advertised quality."

    .line 97
    .line 98
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_2
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    const-string v2, "mResolvedEncoderProfiles = "

    .line 108
    .line 109
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    iget-object v2, p0, LZ/S;->x:Lb0/i;

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    iget-object v0, p0, LZ/S;->m0:LZ/S$k;

    .line 125
    .line 126
    if-eqz v0, :cond_3

    .line 127
    .line 128
    invoke-virtual {v0}, LZ/S$k;->j()V

    .line 129
    .line 130
    .line 131
    :cond_3
    new-instance v1, LZ/S$k;

    .line 132
    .line 133
    iget-boolean v5, p0, LZ/S;->p0:Z

    .line 134
    .line 135
    if-eqz p3, :cond_4

    .line 136
    .line 137
    sget p3, LZ/S;->z0:I

    .line 138
    .line 139
    :goto_1
    move-object v2, p0

    .line 140
    move-object v3, p1

    .line 141
    move-object v4, p2

    .line 142
    move v6, p3

    .line 143
    goto :goto_2

    .line 144
    :cond_4
    const/4 p3, 0x0

    .line 145
    goto :goto_1

    .line 146
    :goto_2
    invoke-direct/range {v1 .. v6}, LZ/S$k;-><init>(LZ/S;Ly/I0;LF/v1;ZI)V

    .line 147
    .line 148
    .line 149
    iput-object v1, v2, LZ/S;->m0:LZ/S$k;

    .line 150
    .line 151
    invoke-virtual {v1}, LZ/S$k;->l()V

    .line 152
    .line 153
    .line 154
    return-void
.end method

.method private H0(LZ/S$j;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->y:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LZ/S;->y:Ljava/util/List;

    .line 10
    .line 11
    invoke-static {v0}, LJ/n;->k(Ljava/util/Collection;)Lm5/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/concurrent/Future;->isDone()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x1

    .line 22
    invoke-interface {v0, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LZ/S;->y:Ljava/util/List;

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_1
    iget-object v0, p0, LZ/S;->y:Ljava/util/List;

    .line 31
    .line 32
    new-instance v1, LZ/P;

    .line 33
    .line 34
    invoke-direct {v1, p0, p1}, LZ/P;-><init>(LZ/S;LZ/S$j;)V

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_2

    .line 49
    .line 50
    if-nez p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p0, LZ/S;->y:Ljava/util/List;

    .line 53
    .line 54
    new-instance v0, LZ/Q;

    .line 55
    .line 56
    invoke-direct {v0, p0, p1}, LZ/Q;-><init>(LZ/S;LZ/S$j;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Landroidx/concurrent/futures/c;->a(Landroidx/concurrent/futures/c$c;)Lm5/a;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-interface {p2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    :cond_2
    iget-object p1, p0, LZ/S;->y:Ljava/util/List;

    .line 67
    .line 68
    invoke-static {p1}, LJ/n;->k(Ljava/util/Collection;)Lm5/a;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    new-instance p2, LZ/S$f;

    .line 73
    .line 74
    invoke-direct {p2, p0}, LZ/S$f;-><init>(LZ/S;)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {p1, p2, v0}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 82
    .line 83
    .line 84
    return-void
.end method

.method private J(LZ/S$j;ILjava/lang/Throwable;)V
    .locals 8

    .line 1
    sget-object v0, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, LZ/S$j;->m(Landroid/net/Uri;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    iget-object v3, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    const-wide/16 v6, 0x0

    .line 15
    .line 16
    const/4 v2, 0x1

    .line 17
    invoke-static/range {v2 .. v7}, LZ/b;->e(ILjava/lang/Throwable;DJ)LZ/b;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-wide/16 v3, 0x0

    .line 22
    .line 23
    invoke-static {v3, v4, v3, v4, v2}, LZ/c0;->d(JJLZ/b;)LZ/c0;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-static {v0}, LZ/t;->b(Landroid/net/Uri;)LZ/t;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v1, v2, v0, p2, p3}, LZ/y0;->b(LZ/s;LZ/c0;LZ/t;ILjava/lang/Throwable;)LZ/y0$a;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-virtual {p1, p2}, LZ/S$j;->u0(LZ/y0;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private J0(LZ/S$l;)V
    .locals 3

    .line 1
    sget-object v0, LZ/S;->q0:Ljava/util/Set;

    .line 2
    .line 3
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_2

    .line 10
    .line 11
    sget-object v0, LZ/S;->r0:Ljava/util/Set;

    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, LZ/S;->o:LZ/S$l;

    .line 20
    .line 21
    if-eq v0, p1, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, LZ/S;->o:LZ/S$l;

    .line 24
    .line 25
    iget-object v0, p0, LZ/S;->a:LF/T0;

    .line 26
    .line 27
    iget v1, p0, LZ/S;->p:I

    .line 28
    .line 29
    invoke-direct {p0, p1}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iget-object v2, p0, LZ/S;->v:Ly/I0$h;

    .line 34
    .line 35
    invoke-static {v1, p1, v2}, LZ/d0;->e(ILZ/d0$a;Ly/I0$h;)LZ/d0;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-virtual {v0, p1}, LF/T0;->k(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    return-void

    .line 43
    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    const-string v2, "Invalid state transition. State is not a valid non-pending state while in a pending state: "

    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    throw v0

    .line 66
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v1, "Can only updated non-pending state from a pending state, but state is "

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    throw p1
.end method

.method private K(J)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :cond_0
    :goto_0
    iget-object v1, p0, LZ/S;->b0:LO/c;

    .line 7
    .line 8
    invoke-interface {v1}, LO/c;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    iget-object v1, p0, LZ/S;->b0:LO/c;

    .line 15
    .line 16
    invoke-interface {v1}, LO/c;->a()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Lg0/i;

    .line 21
    .line 22
    invoke-interface {v1}, Lg0/i;->o0()J

    .line 23
    .line 24
    .line 25
    move-result-wide v2

    .line 26
    cmp-long v2, v2, p1

    .line 27
    .line 28
    if-ltz v2, :cond_0

    .line 29
    .line 30
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return-object v0
.end method

.method private static N(ILy/q;I)LZ/e0;
    .locals 2

    .line 1
    new-instance v0, LZ/a0;

    .line 2
    .line 3
    check-cast p1, LF/L;

    .line 4
    .line 5
    sget-object v1, Lg0/u0;->d:Lg0/s0$a;

    .line 6
    .line 7
    invoke-direct {v0, p2, p1, p0, v1}, LZ/a0;-><init>(ILF/L;ILg0/s0$a;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method private O(LZ/S$h;)I
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    if-eq v0, v1, :cond_5

    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    if-eq v0, v2, :cond_5

    .line 12
    .line 13
    const/4 v1, 0x5

    .line 14
    const/4 v3, 0x3

    .line 15
    if-eq v0, v3, :cond_2

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    if-eq v0, v2, :cond_1

    .line 19
    .line 20
    if-ne v0, v1, :cond_0

    .line 21
    .line 22
    return v2

    .line 23
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 24
    .line 25
    new-instance v1, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Invalid internal audio state: "

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    return v3

    .line 47
    :cond_2
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    invoke-virtual {p1}, LZ/S$j;->d0()Z

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    return v1

    .line 58
    :cond_3
    iget-boolean p1, p0, LZ/S;->d0:Z

    .line 59
    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    return v2

    .line 63
    :cond_4
    const/4 p1, 0x0

    .line 64
    return p1

    .line 65
    :cond_5
    return v1
.end method

.method private P(LZ/S$l;)LZ/d0$a;
    .locals 2

    .line 1
    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 8
    .line 9
    sget-object v1, LZ/S$l;->k:LZ/S$l;

    .line 10
    .line 11
    if-eq p1, v1, :cond_1

    .line 12
    .line 13
    sget-object v1, LZ/S$l;->m:LZ/S$l;

    .line 14
    .line 15
    if-ne p1, v1, :cond_0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    sget-object p1, LZ/d0$a;->h:LZ/d0$a;

    .line 21
    .line 22
    return-object p1

    .line 23
    :cond_1
    :goto_0
    sget-object p1, LZ/d0$a;->g:LZ/d0$a;

    .line 24
    .line 25
    return-object p1
.end method

.method private static T(LZ/b0;LZ/S$j;)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, LZ/b0;->m()J

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    invoke-virtual {p1}, LZ/S$j;->J()J

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    cmp-long p0, v1, p0

    .line 14
    .line 15
    if-nez p0, :cond_1

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    return p0

    .line 19
    :cond_1
    return v0
.end method

.method private U(LZ/S$l;)LZ/S$j;
    .locals 4

    .line 1
    sget-object v0, LZ/S$l;->i:LZ/S$l;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    sget-object v0, LZ/S$l;->h:LZ/S$l;

    .line 8
    .line 9
    if-ne p1, v0, :cond_4

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    :goto_0
    iget-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 13
    .line 14
    if-nez v0, :cond_3

    .line 15
    .line 16
    iget-object v0, p0, LZ/S;->r:LZ/S$j;

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    iput-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 21
    .line 22
    invoke-virtual {v0}, LZ/S$j;->M()LF/n1;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, LZ/S$g;

    .line 31
    .line 32
    invoke-direct {v3, p0}, LZ/S$g;-><init>(LZ/S;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, LF/n1;->c(Ljava/util/concurrent/Executor;LF/V0$a;)V

    .line 36
    .line 37
    .line 38
    const/4 v1, 0x0

    .line 39
    iput-object v1, p0, LZ/S;->r:LZ/S$j;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    sget-object p1, LZ/S$l;->l:LZ/S$l;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    sget-object p1, LZ/S$l;->k:LZ/S$l;

    .line 50
    .line 51
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 52
    .line 53
    .line 54
    return-object v0

    .line 55
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 56
    .line 57
    const-string v0, "Pending recording should exist when in a PENDING state."

    .line 58
    .line 59
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    throw p1

    .line 63
    :cond_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 64
    .line 65
    const-string v0, "Cannot make pending recording active because another recording is already active."

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    .line 72
    .line 73
    const-string v0, "makePendingRecordingActiveLocked() can only be called from a pending state."

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    throw p1
.end method

.method static V(Lg0/l;)V
    .locals 1

    .line 1
    instance-of v0, p0, Lg0/I;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Lg0/I;

    .line 6
    .line 7
    invoke-virtual {p0}, Lg0/I;->c0()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method private Z(LZ/S$j;)V
    .locals 8

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->q:LZ/S$j;

    .line 5
    .line 6
    if-ne v1, p1, :cond_b

    .line 7
    .line 8
    invoke-virtual {v1}, LZ/S$j;->M()LF/n1;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {p1}, LF/n1;->f()V

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, LZ/S;->q:LZ/S$j;

    .line 17
    .line 18
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v2, 0x1

    .line 25
    const/4 v3, 0x0

    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    goto :goto_3

    .line 30
    :pswitch_0
    move-object v4, p1

    .line 31
    move v6, v2

    .line 32
    move v1, v3

    .line 33
    move v5, v1

    .line 34
    move v7, v5

    .line 35
    :goto_0
    move-object v2, v4

    .line 36
    goto/16 :goto_7

    .line 37
    .line 38
    :pswitch_1
    iget-boolean v1, p0, LZ/S;->j:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iput-object p1, p0, LZ/S;->E:Landroid/view/Surface;

    .line 43
    .line 44
    iget-object v1, p0, LZ/S;->B:Ly/I0;

    .line 45
    .line 46
    if-eqz v1, :cond_0

    .line 47
    .line 48
    invoke-virtual {v1}, Ly/I0;->v()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_0

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto/16 :goto_8

    .line 57
    .line 58
    :cond_0
    move v2, v3

    .line 59
    :goto_1
    sget-object v1, LZ/S$l;->g:LZ/S$l;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 62
    .line 63
    .line 64
    move-object v4, p1

    .line 65
    move v5, v2

    .line 66
    move v1, v3

    .line 67
    move v6, v1

    .line 68
    :goto_2
    move v7, v6

    .line 69
    goto :goto_0

    .line 70
    :cond_1
    sget-object v1, LZ/S$l;->j:LZ/S$l;

    .line 71
    .line 72
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 73
    .line 74
    .line 75
    :goto_3
    move-object v2, p1

    .line 76
    move-object v4, v2

    .line 77
    move v1, v3

    .line 78
    move v5, v1

    .line 79
    :goto_4
    move v6, v5

    .line 80
    move v7, v6

    .line 81
    goto/16 :goto_7

    .line 82
    .line 83
    :pswitch_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 84
    .line 85
    new-instance v1, Ljava/lang/StringBuilder;

    .line 86
    .line 87
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 88
    .line 89
    .line 90
    const-string v2, "Unexpected state on finalize of recording: "

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    iget-object v2, p0, LZ/S;->n:LZ/S$l;

    .line 96
    .line 97
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    throw p1

    .line 108
    :pswitch_3
    move v1, v2

    .line 109
    goto :goto_5

    .line 110
    :pswitch_4
    move v1, v3

    .line 111
    :goto_5
    iget-object v4, p0, LZ/S;->e0:LZ/x0$a;

    .line 112
    .line 113
    sget-object v5, LZ/x0$a;->i:LZ/x0$a;

    .line 114
    .line 115
    if-ne v4, v5, :cond_2

    .line 116
    .line 117
    iget-object v2, p0, LZ/S;->r:LZ/S$j;

    .line 118
    .line 119
    iput-object p1, p0, LZ/S;->r:LZ/S$j;

    .line 120
    .line 121
    sget-object v4, LZ/S$l;->g:LZ/S$l;

    .line 122
    .line 123
    invoke-virtual {p0, v4}, LZ/S;->u0(LZ/S$l;)V

    .line 124
    .line 125
    .line 126
    sget-object v4, LZ/S;->v0:Ljava/lang/Exception;

    .line 127
    .line 128
    const/4 v5, 0x4

    .line 129
    move v6, v3

    .line 130
    move v7, v5

    .line 131
    move v5, v6

    .line 132
    goto :goto_7

    .line 133
    :cond_2
    iget-boolean v4, p0, LZ/S;->j:Z

    .line 134
    .line 135
    if-eqz v4, :cond_4

    .line 136
    .line 137
    iput-object p1, p0, LZ/S;->E:Landroid/view/Surface;

    .line 138
    .line 139
    iget-object v4, p0, LZ/S;->B:Ly/I0;

    .line 140
    .line 141
    if-eqz v4, :cond_3

    .line 142
    .line 143
    invoke-virtual {v4}, Ly/I0;->v()Z

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    if-nez v4, :cond_3

    .line 148
    .line 149
    goto :goto_6

    .line 150
    :cond_3
    move v2, v3

    .line 151
    :goto_6
    sget-object v4, LZ/S$l;->g:LZ/S$l;

    .line 152
    .line 153
    invoke-direct {p0, v4}, LZ/S;->J0(LZ/S$l;)V

    .line 154
    .line 155
    .line 156
    move-object v4, p1

    .line 157
    move v5, v2

    .line 158
    move v6, v3

    .line 159
    goto :goto_2

    .line 160
    :cond_4
    iget-object v2, p0, LZ/S;->I:Lg0/l;

    .line 161
    .line 162
    if-eqz v2, :cond_5

    .line 163
    .line 164
    iget-object v2, p0, LZ/S;->n:LZ/S$l;

    .line 165
    .line 166
    invoke-direct {p0, v2}, LZ/S;->U(LZ/S$l;)LZ/S$j;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    move-object v4, p1

    .line 171
    move v5, v3

    .line 172
    move v6, v5

    .line 173
    move v7, v6

    .line 174
    move-object p1, v2

    .line 175
    goto/16 :goto_0

    .line 176
    .line 177
    :cond_5
    move-object v2, p1

    .line 178
    move-object v4, v2

    .line 179
    move v5, v3

    .line 180
    goto :goto_4

    .line 181
    :goto_7
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    if-eqz v5, :cond_6

    .line 183
    .line 184
    iget-object p1, p0, LZ/S;->B:Ly/I0;

    .line 185
    .line 186
    iget-object v0, p0, LZ/S;->C:LF/v1;

    .line 187
    .line 188
    invoke-direct {p0, p1, v0, v3}, LZ/S;->H(Ly/I0;LF/v1;Z)V

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :cond_6
    if-eqz v6, :cond_7

    .line 193
    .line 194
    invoke-direct {p0}, LZ/S;->k0()V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_7
    if-eqz p1, :cond_9

    .line 199
    .line 200
    iget-boolean v0, p0, LZ/S;->j:Z

    .line 201
    .line 202
    if-nez v0, :cond_8

    .line 203
    .line 204
    invoke-direct {p0, p1, v1}, LZ/S;->B0(LZ/S$j;Z)V

    .line 205
    .line 206
    .line 207
    return-void

    .line 208
    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    .line 209
    .line 210
    const-string v0, "Attempt to start a pending recording while the Recorder is waiting for a new surface request."

    .line 211
    .line 212
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    throw p1

    .line 216
    :cond_9
    if-eqz v2, :cond_a

    .line 217
    .line 218
    invoke-direct {p0, v2, v7, v4}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 219
    .line 220
    .line 221
    :cond_a
    return-void

    .line 222
    :cond_b
    :try_start_1
    new-instance p1, Ljava/lang/AssertionError;

    .line 223
    .line 224
    const-string v1, "Active recording did not match finalized recording on finalize."

    .line 225
    .line 226
    invoke-direct {p1, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    throw p1

    .line 230
    :goto_8
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    throw p1

    .line 232
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private a0()V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    invoke-virtual {p0}, LZ/S;->S()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    move v1, v2

    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception v1

    .line 24
    goto :goto_2

    .line 25
    :cond_0
    :pswitch_1
    sget-object v1, LZ/S$l;->g:LZ/S$l;

    .line 26
    .line 27
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :pswitch_2
    sget-object v1, LZ/S$l;->g:LZ/S$l;

    .line 32
    .line 33
    invoke-direct {p0, v1}, LZ/S;->J0(LZ/S$l;)V

    .line 34
    .line 35
    .line 36
    :goto_0
    const/4 v1, 0x1

    .line 37
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    iput-boolean v2, p0, LZ/S;->g0:Z

    .line 39
    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v0, p0, LZ/S;->B:Ly/I0;

    .line 43
    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Ly/I0;->v()Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, LZ/S;->B:Ly/I0;

    .line 53
    .line 54
    iget-object v1, p0, LZ/S;->C:LF/v1;

    .line 55
    .line 56
    invoke-direct {p0, v0, v1, v2}, LZ/S;->H(Ly/I0;LF/v1;Z)V

    .line 57
    .line 58
    .line 59
    :cond_1
    return-void

    .line 60
    :goto_2
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 61
    throw v1

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private c0(Ly/I0;LF/v1;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->B:Ly/I0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ly/I0;->v()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LZ/S;->B:Ly/I0;

    .line 12
    .line 13
    invoke-virtual {v0}, Ly/I0;->z()Z

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p3, p0, LZ/S;->p0:Z

    .line 17
    .line 18
    iput-object p1, p0, LZ/S;->B:Ly/I0;

    .line 19
    .line 20
    iput-object p2, p0, LZ/S;->C:LF/v1;

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-direct {p0, p1, p2, p3}, LZ/S;->H(Ly/I0;LF/v1;Z)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method private f0(LZ/S$j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-ne v0, p1, :cond_1

    .line 4
    .line 5
    iget-boolean p1, p0, LZ/S;->u:Z

    .line 6
    .line 7
    if-nez p1, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, LZ/S;->K:Lg0/l;

    .line 16
    .line 17
    invoke-interface {p1}, Lg0/l;->pause()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 21
    .line 22
    invoke-interface {p1}, Lg0/l;->pause()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 26
    .line 27
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v0, v1}, LZ/y0;->d(LZ/s;LZ/c0;)LZ/y0$b;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-virtual {p1, v0}, LZ/S$j;->u0(LZ/y0;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    return-void
.end method

.method public static synthetic h(LZ/S;LZ/S$j;JILjava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LZ/S;->D0(LZ/S$j;JILjava/lang/Throwable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private h0(Landroid/content/Context;LZ/s;)LZ/u;
    .locals 1

    .line 1
    const-string v0, "The OutputOptions cannot be null."

    .line 2
    .line 3
    invoke-static {p2, v0}, LH0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    new-instance v0, LZ/u;

    .line 7
    .line 8
    invoke-direct {v0, p1, p0, p2}, LZ/u;-><init>(Landroid/content/Context;LZ/S;LZ/s;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static synthetic i(Lg0/l;)V
    .locals 2

    .line 1
    const-string v0, "Recorder"

    .line 2
    .line 3
    const-string v1, "The source didn\'t become non-streaming before timeout. Waited 1000ms"

    .line 4
    .line 5
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-class v0, Landroidx/camera/video/internal/compat/quirk/DeactivateEncoderSurfaceBeforeStopEncoderQuirk;

    .line 9
    .line 10
    invoke-static {v0}, Landroidx/camera/video/internal/compat/quirk/a;->b(Ljava/lang/Class;)LF/b1;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-static {p0}, LZ/S;->V(Lg0/l;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method private i0()V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->H:Lc0/n;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    iput-object v1, p0, LZ/S;->H:Lc0/n;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "Releasing audio source: 0x%x"

    .line 21
    .line 22
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "Recorder"

    .line 27
    .line 28
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lc0/n;->w()Lm5/a;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v2, LZ/S$b;

    .line 36
    .line 37
    invoke-direct {v2, p0, v0}, LZ/S$b;-><init>(LZ/S;Lc0/n;)V

    .line 38
    .line 39
    .line 40
    invoke-static {}, LI/c;->b()Ljava/util/concurrent/Executor;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1, v2, v0}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 49
    .line 50
    const-string v1, "Cannot release null audio source."

    .line 51
    .line 52
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    throw v0
.end method

.method public static synthetic j(LZ/S;Landroidx/concurrent/futures/c$a;Ljava/lang/Throwable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    instance-of v0, p2, Lg0/h;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LZ/S$h;->k:LZ/S$h;

    .line 10
    .line 11
    invoke-virtual {p0, v0}, LZ/S;->r0(LZ/S$h;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v0, LZ/S$h;->l:LZ/S$h;

    .line 16
    .line 17
    invoke-virtual {p0, v0}, LZ/S;->r0(LZ/S$h;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    iput-object p2, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 21
    .line 22
    const/4 p2, 0x1

    .line 23
    invoke-virtual {p0, p2}, LZ/S;->I0(Z)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    invoke-virtual {p1, p0}, Landroidx/concurrent/futures/c$a;->c(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_1
    return-void
.end method

.method public static synthetic k(LZ/S;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ/S;->N:Landroid/net/Uri;

    .line 2
    .line 3
    return-void
.end method

.method private k0()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->K:Lg0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Recorder"

    .line 6
    .line 7
    const-string v1, "Releasing audio encoder."

    .line 8
    .line 9
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LZ/S;->K:Lg0/l;

    .line 13
    .line 14
    invoke-interface {v0}, Lg0/l;->a()V

    .line 15
    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, LZ/S;->K:Lg0/l;

    .line 19
    .line 20
    iput-object v0, p0, LZ/S;->L:Lg0/m0;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, LZ/S;->H:Lc0/n;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-direct {p0}, LZ/S;->i0()V

    .line 27
    .line 28
    .line 29
    :cond_1
    sget-object v0, LZ/S$h;->g:LZ/S$h;

    .line 30
    .line 31
    invoke-virtual {p0, v0}, LZ/S;->r0(LZ/S$h;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, LZ/S;->l0()V

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method public static synthetic l(LZ/S;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->B:Ly/I0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, LZ/S;->C:LF/v1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {p0, v0, v1, v2}, LZ/S;->H(Ly/I0;LF/v1;Z)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 13
    .line 14
    const-string v0, "surface request is required to retry initialization."

    .line 15
    .line 16
    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    throw p0
.end method

.method private l0()V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->I:Lg0/l;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Recorder"

    .line 6
    .line 7
    const-string v1, "Releasing video encoder."

    .line 8
    .line 9
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, LZ/S;->F0()V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-direct {p0}, LZ/S;->a0()V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static synthetic m(LZ/S;LZ/x0$a;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LZ/S;->b0(LZ/x0$a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private m0()V
    .locals 3

    .line 1
    sget-object v0, LZ/S;->q0:Ljava/util/Set;

    .line 2
    .line 3
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LZ/S;->o:LZ/S$l;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, LZ/S;->u0(LZ/S$l;)V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    const-string v2, "Cannot restore non-pending state when in state "

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    iget-object v2, p0, LZ/S;->n:LZ/S$l;

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static synthetic n(LZ/S;LZ/S$j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ/S;->f0(LZ/S$j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic o(LZ/z0$a;)V
    .locals 1

    .line 1
    sget-object v0, LZ/S;->t0:LZ/z0;

    .line 2
    .line 3
    invoke-virtual {v0}, LZ/z0;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-virtual {p0, v0}, LZ/z0$a;->b(I)LZ/z0$a;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private o0(LZ/S$j;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-ne v0, p1, :cond_2

    .line 4
    .line 5
    iget-boolean p1, p0, LZ/S;->u:Z

    .line 6
    .line 7
    if-nez p1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    iget-object p1, p0, LZ/S;->K:Lg0/l;

    .line 16
    .line 17
    invoke-interface {p1}, Lg0/l;->start()V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Lg0/l;->start()V

    .line 25
    .line 26
    .line 27
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 28
    .line 29
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v0, v1}, LZ/y0;->e(LZ/s;LZ/c0;)LZ/y0$c;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p1, v0}, LZ/S$j;->u0(LZ/y0;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_1
    const/4 p1, 0x1

    .line 46
    iput-boolean p1, p0, LZ/S;->l0:Z

    .line 47
    .line 48
    :cond_2
    return-void
.end method

.method public static synthetic p(LZ/S;Ly/I0;LF/v1;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, LZ/S;->c0(Ly/I0;LF/v1;Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private p0()Lm5/a;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Try to safely release video encoder: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LZ/S;->I:Lg0/l;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, p0, LZ/S;->h0:LZ/w0;

    .line 26
    .line 27
    invoke-virtual {v0}, LZ/w0;->q()Lm5/a;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public static synthetic q(LZ/S;LZ/S$j;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->I:Lg0/l;

    .line 2
    .line 3
    new-instance v1, LZ/S$c;

    .line 4
    .line 5
    invoke-direct {v1, p0, p2, p1}, LZ/S$c;-><init>(LZ/S;Landroidx/concurrent/futures/c$a;LZ/S$j;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 9
    .line 10
    invoke-interface {v0, v1, p0}, Lg0/l;->d(Lg0/m;Ljava/util/concurrent/Executor;)V

    .line 11
    .line 12
    .line 13
    const-string p0, "videoEncodingFuture"

    .line 14
    .line 15
    return-object p0
.end method

.method private static q0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    .locals 2

    .line 1
    invoke-static {}, LI/c;->e()Ljava/util/concurrent/ScheduledExecutorService;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LZ/E;

    .line 6
    .line 7
    invoke-direct {v1, p1, p0}, LZ/E;-><init>(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1, p2, p3, p4}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static synthetic r(LZ/S;LZ/S$j;Landroidx/concurrent/futures/c$a;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, LZ/C;

    .line 5
    .line 6
    invoke-direct {v0, p0, p2}, LZ/C;-><init>(LZ/S;Landroidx/concurrent/futures/c$a;)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, LZ/S;->H:Lc0/n;

    .line 10
    .line 11
    iget-object v2, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 12
    .line 13
    new-instance v3, LZ/S$d;

    .line 14
    .line 15
    invoke-direct {v3, p0, v0}, LZ/S$d;-><init>(LZ/S;LH0/a;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lc0/n;->A(Ljava/util/concurrent/Executor;Lc0/n$c;)V

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, LZ/S;->K:Lg0/l;

    .line 22
    .line 23
    new-instance v2, LZ/S$e;

    .line 24
    .line 25
    invoke-direct {v2, p0, p2, v0, p1}, LZ/S$e;-><init>(LZ/S;Landroidx/concurrent/futures/c$a;LH0/a;LZ/S$j;)V

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    invoke-interface {v1, v2, p0}, Lg0/l;->d(Lg0/m;Ljava/util/concurrent/Executor;)V

    .line 31
    .line 32
    .line 33
    const-string p0, "audioEncodingFuture"

    .line 34
    .line 35
    return-object p0
.end method

.method public static synthetic s(LZ/S;LZ/S$j;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LZ/S;->o0(LZ/S$j;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic t(LZ/S;Ly/I0$h;)V
    .locals 0

    .line 1
    iput-object p1, p0, LZ/S;->w:Ly/I0$h;

    .line 2
    .line 3
    return-void
.end method

.method public static synthetic u(Ljava/util/concurrent/Executor;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static synthetic v(LZ/S;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LZ/S;->p0:Z

    .line 2
    .line 3
    return p0
.end method

.method private v0(I)V
    .locals 3

    .line 1
    iget v0, p0, LZ/S;->p:I

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Transitioning streamId: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget v1, p0, LZ/S;->p:I

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v1, " --> "

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "Recorder"

    .line 34
    .line 35
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iput p1, p0, LZ/S;->p:I

    .line 39
    .line 40
    iget-object v0, p0, LZ/S;->a:LF/T0;

    .line 41
    .line 42
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 43
    .line 44
    invoke-direct {p0, v1}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    iget-object v2, p0, LZ/S;->v:Ly/I0$h;

    .line 49
    .line 50
    invoke-static {p1, v1, v2}, LZ/d0;->e(ILZ/d0$a;Ly/I0$h;)LZ/d0;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {v0, p1}, LF/T0;->k(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method static synthetic w(LZ/S;Z)Z
    .locals 0

    .line 1
    iput-boolean p1, p0, LZ/S;->p0:Z

    .line 2
    .line 3
    return p1
.end method

.method static synthetic x(LZ/S;)Lm5/a;
    .locals 0

    .line 1
    invoke-direct {p0}, LZ/S;->p0()Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private x0(LZ/S$j;)V
    .locals 6

    .line 1
    iget-object v0, p0, LZ/S;->G:LF/T0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LZ/S;->M(LF/n1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZ/r;

    .line 8
    .line 9
    iget-object v1, p0, LZ/S;->x:Lb0/i;

    .line 10
    .line 11
    invoke-static {v0, v1}, Lf0/b;->c(LZ/r;Lb0/i;)Lf0/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    sget-object v2, LF/v1;->g:LF/v1;

    .line 16
    .line 17
    iget-object v3, p0, LZ/S;->i0:Lg0/q0;

    .line 18
    .line 19
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    check-cast v3, Lg0/q0;

    .line 24
    .line 25
    invoke-virtual {v3}, Lg0/q0;->e()I

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    invoke-virtual {v3}, Lg0/q0;->h()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-eq v4, v5, :cond_0

    .line 34
    .line 35
    new-instance v4, Landroid/util/Rational;

    .line 36
    .line 37
    invoke-virtual {v3}, Lg0/q0;->e()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {v3}, Lg0/q0;->h()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-direct {v4, v5, v3}, Landroid/util/Rational;-><init>(II)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v4, 0x0

    .line 50
    :goto_0
    invoke-virtual {v0}, LZ/r;->b()LZ/a;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-static {v1, v3, v4}, Lf0/b;->d(Lf0/e;LZ/a;Landroid/util/Rational;)Lc0/a;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    iget-object v4, p0, LZ/S;->H:Lc0/n;

    .line 59
    .line 60
    if-eqz v4, :cond_1

    .line 61
    .line 62
    invoke-direct {p0}, LZ/S;->i0()V

    .line 63
    .line 64
    .line 65
    :cond_1
    invoke-direct {p0, p1, v3}, LZ/S;->y0(LZ/S$j;Lc0/a;)Lc0/n;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, LZ/S;->H:Lc0/n;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v4, "Set up new audio source: 0x%x"

    .line 84
    .line 85
    invoke-static {v4, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    const-string v4, "Recorder"

    .line 90
    .line 91
    invoke-static {v4, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, LZ/r;->b()LZ/a;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-static {v1, v2, v3, p1}, Lf0/b;->b(Lf0/e;LF/v1;Lc0/a;LZ/a;)Lg0/a;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iget-object v0, p0, LZ/S;->g:Lg0/o;

    .line 103
    .line 104
    iget-object v1, p0, LZ/S;->d:Ljava/util/concurrent/Executor;

    .line 105
    .line 106
    iget-object v2, p0, LZ/S;->B:Ly/I0;

    .line 107
    .line 108
    invoke-static {v2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    check-cast v2, Ly/I0;

    .line 113
    .line 114
    invoke-virtual {v2}, Ly/I0;->r()I

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    invoke-interface {v0, v1, p1, v2}, Lg0/o;->a(Ljava/util/concurrent/Executor;Lg0/n;I)Lg0/l;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    iput-object p1, p0, LZ/S;->K:Lg0/l;

    .line 123
    .line 124
    invoke-interface {p1}, Lg0/l;->c()Lg0/l$b;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    instance-of v0, p1, Lg0/l$a;

    .line 129
    .line 130
    if-eqz v0, :cond_2

    .line 131
    .line 132
    iget-object v0, p0, LZ/S;->H:Lc0/n;

    .line 133
    .line 134
    check-cast p1, Lg0/l$a;

    .line 135
    .line 136
    invoke-virtual {v0, p1}, Lc0/n;->B(Lb0/c;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 141
    .line 142
    const-string v0, "The EncoderInput of audio isn\'t a ByteBufferInput."

    .line 143
    .line 144
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    throw p1
.end method

.method static synthetic y(LZ/S;)LF/T0;
    .locals 0

    .line 1
    iget-object p0, p0, LZ/S;->b:LF/T0;

    .line 2
    .line 3
    return-object p0
.end method

.method private y0(LZ/S$j;Lc0/a;)Lc0/n;
    .locals 1

    .line 1
    sget-object v0, LZ/S;->y0:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    invoke-virtual {p1, p2, v0}, LZ/S$j;->k0(Lc0/a;Ljava/util/concurrent/Executor;)Lc0/n;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method static synthetic z()Lb0/f$a;
    .locals 1

    .line 1
    sget-object v0, LZ/S;->x0:Lb0/f$a;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method C0(LZ/b0;ILjava/lang/Throwable;)V
    .locals 12

    .line 1
    iget-object v1, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, LZ/S;->r:LZ/S$j;

    .line 5
    .line 6
    invoke-static {p1, v0}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 7
    .line 8
    .line 9
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    :try_start_1
    iget-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 13
    .line 14
    invoke-static {p1, v0}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    const-string p2, "Recorder"

    .line 21
    .line 22
    new-instance p3, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v0, "stop() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LZ/b0;->k()LZ/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {p2, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    move-object v6, p0

    .line 51
    goto/16 :goto_3

    .line 52
    .line 53
    :cond_0
    :try_start_2
    iget-object v0, p0, LZ/S;->n:LZ/S$l;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 59
    const/4 v2, 0x0

    .line 60
    packed-switch v0, :pswitch_data_0

    .line 61
    .line 62
    .line 63
    :goto_0
    move-object v6, p0

    .line 64
    move v10, p2

    .line 65
    move-object v11, p3

    .line 66
    goto :goto_2

    .line 67
    :pswitch_0
    :try_start_3
    iget-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 68
    .line 69
    invoke-static {p1, v0}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, LH0/g;->i(Z)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :pswitch_1
    :try_start_4
    sget-object p1, LZ/S$l;->m:LZ/S$l;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 80
    .line 81
    .line 82
    sget-object p1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 83
    .line 84
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 85
    .line 86
    .line 87
    move-result-wide v3

    .line 88
    invoke-virtual {p1, v3, v4}, Ljava/util/concurrent/TimeUnit;->toMicros(J)J

    .line 89
    .line 90
    .line 91
    move-result-wide v8

    .line 92
    iget-object v7, p0, LZ/S;->q:LZ/S$j;

    .line 93
    .line 94
    iget-object p1, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 95
    .line 96
    new-instance v5, LZ/O;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 97
    .line 98
    move-object v6, p0

    .line 99
    move v10, p2

    .line 100
    move-object v11, p3

    .line 101
    :try_start_5
    invoke-direct/range {v5 .. v11}, LZ/O;-><init>(LZ/S;LZ/S$j;JILjava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {p1, v5}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 105
    .line 106
    .line 107
    goto :goto_2

    .line 108
    :catchall_1
    move-exception v0

    .line 109
    :goto_1
    move-object p1, v0

    .line 110
    goto :goto_3

    .line 111
    :catchall_2
    move-exception v0

    .line 112
    move-object v6, p0

    .line 113
    goto :goto_1

    .line 114
    :pswitch_2
    move-object v6, p0

    .line 115
    move v10, p2

    .line 116
    move-object v11, p3

    .line 117
    iget-object p2, v6, LZ/S;->r:LZ/S$j;

    .line 118
    .line 119
    invoke-static {p1, p2}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 120
    .line 121
    .line 122
    move-result p1

    .line 123
    invoke-static {p1}, LH0/g;->i(Z)V

    .line 124
    .line 125
    .line 126
    iget-object p1, v6, LZ/S;->r:LZ/S$j;

    .line 127
    .line 128
    iput-object v2, v6, LZ/S;->r:LZ/S$j;

    .line 129
    .line 130
    invoke-direct {p0}, LZ/S;->m0()V

    .line 131
    .line 132
    .line 133
    move-object v2, p1

    .line 134
    :goto_2
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 135
    if-eqz v2, :cond_2

    .line 136
    .line 137
    const/16 p1, 0xa

    .line 138
    .line 139
    if-ne v10, p1, :cond_1

    .line 140
    .line 141
    const-string p1, "Recorder"

    .line 142
    .line 143
    const-string p2, "Recording was stopped due to recording being garbage collected before any valid data has been produced."

    .line 144
    .line 145
    invoke-static {p1, p2}, Ly/h0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :cond_1
    new-instance p1, Ljava/lang/RuntimeException;

    .line 149
    .line 150
    const-string p2, "Recording was stopped before any data could be produced."

    .line 151
    .line 152
    invoke-direct {p1, p2, v11}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 153
    .line 154
    .line 155
    const/16 p2, 0x8

    .line 156
    .line 157
    invoke-direct {p0, v2, p2, p1}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 158
    .line 159
    .line 160
    :cond_2
    return-void

    .line 161
    :pswitch_3
    move-object v6, p0

    .line 162
    :try_start_6
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 163
    .line 164
    const-string p2, "Calling stop() while idling or initializing is invalid."

    .line 165
    .line 166
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw p1

    .line 170
    :goto_3
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 171
    throw p1

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method D0(LZ/S$j;JILjava/lang/Throwable;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-ne v0, p1, :cond_3

    .line 4
    .line 5
    iget-boolean p1, p0, LZ/S;->u:Z

    .line 6
    .line 7
    if-nez p1, :cond_3

    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, LZ/S;->u:Z

    .line 11
    .line 12
    iput p4, p0, LZ/S;->Y:I

    .line 13
    .line 14
    iput-object p5, p0, LZ/S;->Z:Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    invoke-direct {p0}, LZ/S;->F()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, LZ/S;->K:Lg0/l;

    .line 26
    .line 27
    invoke-interface {p1, p2, p3}, Lg0/l;->b(J)V

    .line 28
    .line 29
    .line 30
    :cond_0
    iget-object p1, p0, LZ/S;->a0:Lg0/i;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    invoke-interface {p1}, Lg0/i;->close()V

    .line 35
    .line 36
    .line 37
    const/4 p1, 0x0

    .line 38
    iput-object p1, p0, LZ/S;->a0:Lg0/i;

    .line 39
    .line 40
    :cond_1
    iget-object p1, p0, LZ/S;->e0:LZ/x0$a;

    .line 41
    .line 42
    sget-object p4, LZ/x0$a;->h:LZ/x0$a;

    .line 43
    .line 44
    if-eq p1, p4, :cond_2

    .line 45
    .line 46
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 47
    .line 48
    new-instance p4, LZ/B;

    .line 49
    .line 50
    invoke-direct {p4, p1}, LZ/B;-><init>(Lg0/l;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    const-wide/16 v0, 0x3e8

    .line 56
    .line 57
    sget-object p5, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 58
    .line 59
    invoke-static {p4, p1, v0, v1, p5}, LZ/S;->q0(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    iput-object p1, p0, LZ/S;->f0:Ljava/util/concurrent/ScheduledFuture;

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 67
    .line 68
    invoke-static {p1}, LZ/S;->V(Lg0/l;)V

    .line 69
    .line 70
    .line 71
    :goto_0
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 72
    .line 73
    invoke-interface {p1, p2, p3}, Lg0/l;->b(J)V

    .line 74
    .line 75
    .line 76
    :cond_3
    return-void
.end method

.method G0()V
    .locals 8

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "Recorder"

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v3, "tryServicePendingRecording on state: "

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v1, v2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    const/4 v2, 0x1

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    if-eq v1, v2, :cond_0

    .line 38
    .line 39
    const/4 v5, 0x2

    .line 40
    if-eq v1, v5, :cond_1

    .line 41
    .line 42
    move v5, v3

    .line 43
    move-object v1, v4

    .line 44
    :goto_0
    move-object v2, v1

    .line 45
    goto :goto_2

    .line 46
    :cond_0
    move v2, v3

    .line 47
    :cond_1
    iget-object v1, p0, LZ/S;->e0:LZ/x0$a;

    .line 48
    .line 49
    sget-object v5, LZ/x0$a;->i:LZ/x0$a;

    .line 50
    .line 51
    if-ne v1, v5, :cond_2

    .line 52
    .line 53
    iget-object v1, p0, LZ/S;->r:LZ/S$j;

    .line 54
    .line 55
    iput-object v4, p0, LZ/S;->r:LZ/S$j;

    .line 56
    .line 57
    invoke-direct {p0}, LZ/S;->m0()V

    .line 58
    .line 59
    .line 60
    sget-object v3, LZ/S;->v0:Ljava/lang/Exception;

    .line 61
    .line 62
    const/4 v5, 0x4

    .line 63
    move-object v7, v3

    .line 64
    move v3, v2

    .line 65
    move-object v2, v7

    .line 66
    goto :goto_2

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    goto :goto_3

    .line 69
    :cond_2
    iget-object v1, p0, LZ/S;->q:LZ/S$j;

    .line 70
    .line 71
    if-nez v1, :cond_4

    .line 72
    .line 73
    iget-boolean v1, p0, LZ/S;->g0:Z

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object v1, p0, LZ/S;->I:Lg0/l;

    .line 79
    .line 80
    if-eqz v1, :cond_5

    .line 81
    .line 82
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 83
    .line 84
    invoke-direct {p0, v1}, LZ/S;->U(LZ/S$l;)LZ/S$j;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    move v5, v3

    .line 89
    move v3, v2

    .line 90
    move-object v2, v4

    .line 91
    move-object v4, v1

    .line 92
    move-object v1, v2

    .line 93
    goto :goto_2

    .line 94
    :cond_4
    :goto_1
    const-string v1, "Recorder"

    .line 95
    .line 96
    new-instance v5, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 99
    .line 100
    .line 101
    const-string v6, "PendingRecording is not handled, active recording = "

    .line 102
    .line 103
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object v6, p0, LZ/S;->q:LZ/S$j;

    .line 107
    .line 108
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v6, ", need reset flag = "

    .line 112
    .line 113
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    iget-boolean v6, p0, LZ/S;->g0:Z

    .line 117
    .line 118
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-static {v1, v5}, Ly/h0;->l(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    :cond_5
    move v5, v3

    .line 129
    move-object v1, v4

    .line 130
    move v3, v2

    .line 131
    goto :goto_0

    .line 132
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 133
    if-eqz v4, :cond_6

    .line 134
    .line 135
    invoke-direct {p0, v4, v3}, LZ/S;->B0(LZ/S$j;Z)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_6
    if-eqz v1, :cond_7

    .line 140
    .line 141
    invoke-direct {p0, v1, v5, v2}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 142
    .line 143
    .line 144
    :cond_7
    return-void

    .line 145
    :goto_3
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 146
    throw v1
.end method

.method I(ILjava/lang/Throwable;)V
    .locals 11

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v0, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    const/16 v2, 0x8

    .line 9
    .line 10
    const/4 v3, 0x3

    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    if-eqz v0, :cond_3

    .line 15
    .line 16
    :try_start_0
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->stop()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/media/MediaMuxer;->release()V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :catch_0
    move-exception v0

    .line 26
    new-instance v7, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v8, "MediaMuxer failed to stop or release with error: "

    .line 32
    .line 33
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v8, "Recorder"

    .line 48
    .line 49
    invoke-static {v8, v7, v0}, Ly/h0;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    if-nez p1, :cond_2

    .line 53
    .line 54
    iget-object p1, p0, LZ/S;->n0:Lb0/f;

    .line 55
    .line 56
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Lb0/f;

    .line 61
    .line 62
    invoke-interface {p1}, Lb0/f;->a()J

    .line 63
    .line 64
    .line 65
    move-result-wide v7

    .line 66
    iget-wide v9, p0, LZ/S;->l:J

    .line 67
    .line 68
    cmp-long p1, v7, v9

    .line 69
    .line 70
    if-gez p1, :cond_0

    .line 71
    .line 72
    move p1, v3

    .line 73
    goto :goto_0

    .line 74
    :cond_0
    iget-wide v7, p0, LZ/S;->P:J

    .line 75
    .line 76
    cmp-long p1, v7, v4

    .line 77
    .line 78
    if-nez p1, :cond_1

    .line 79
    .line 80
    move p1, v2

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    move p1, v1

    .line 83
    :cond_2
    :goto_0
    iput-object v6, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    if-nez p1, :cond_4

    .line 87
    .line 88
    move p1, v2

    .line 89
    :cond_4
    :goto_1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 90
    .line 91
    iget-object v2, p0, LZ/S;->N:Landroid/net/Uri;

    .line 92
    .line 93
    invoke-virtual {v0, v2}, LZ/S$j;->m(Landroid/net/Uri;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 97
    .line 98
    invoke-virtual {v0}, LZ/S$j;->I()LZ/s;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    iget-object v7, p0, LZ/S;->N:Landroid/net/Uri;

    .line 107
    .line 108
    invoke-static {v7}, LZ/t;->b(Landroid/net/Uri;)LZ/t;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    iget-object v8, p0, LZ/S;->t:LZ/S$j;

    .line 113
    .line 114
    if-nez p1, :cond_5

    .line 115
    .line 116
    invoke-static {v0, v2, v7}, LZ/y0;->a(LZ/s;LZ/c0;LZ/t;)LZ/y0$a;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    goto :goto_2

    .line 121
    :cond_5
    invoke-static {v0, v2, v7, p1, p2}, LZ/y0;->b(LZ/s;LZ/c0;LZ/t;ILjava/lang/Throwable;)LZ/y0$a;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :goto_2
    invoke-virtual {v8, p1}, LZ/S$j;->u0(LZ/y0;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 129
    .line 130
    iput-object v6, p0, LZ/S;->t:LZ/S$j;

    .line 131
    .line 132
    const/4 p2, 0x0

    .line 133
    iput-boolean p2, p0, LZ/S;->u:Z

    .line 134
    .line 135
    iput-object v6, p0, LZ/S;->z:Ljava/lang/Integer;

    .line 136
    .line 137
    iput-object v6, p0, LZ/S;->A:Ljava/lang/Integer;

    .line 138
    .line 139
    iget-object p2, p0, LZ/S;->y:Ljava/util/List;

    .line 140
    .line 141
    invoke-interface {p2}, Ljava/util/List;->clear()V

    .line 142
    .line 143
    .line 144
    sget-object p2, Landroid/net/Uri;->EMPTY:Landroid/net/Uri;

    .line 145
    .line 146
    iput-object p2, p0, LZ/S;->N:Landroid/net/Uri;

    .line 147
    .line 148
    iput-wide v4, p0, LZ/S;->O:J

    .line 149
    .line 150
    iput-wide v4, p0, LZ/S;->P:J

    .line 151
    .line 152
    iput-wide v4, p0, LZ/S;->Q:J

    .line 153
    .line 154
    const-wide v4, 0x7fffffffffffffffL

    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    iput-wide v4, p0, LZ/S;->R:J

    .line 160
    .line 161
    iput-wide v4, p0, LZ/S;->T:J

    .line 162
    .line 163
    iput-wide v4, p0, LZ/S;->U:J

    .line 164
    .line 165
    iput-wide v4, p0, LZ/S;->V:J

    .line 166
    .line 167
    iput v1, p0, LZ/S;->Y:I

    .line 168
    .line 169
    iput-object v6, p0, LZ/S;->Z:Ljava/lang/Throwable;

    .line 170
    .line 171
    iput-object v6, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 172
    .line 173
    const-wide/16 v0, 0x0

    .line 174
    .line 175
    iput-wide v0, p0, LZ/S;->k0:D

    .line 176
    .line 177
    iput-object v6, p0, LZ/S;->n0:Lb0/f;

    .line 178
    .line 179
    iput-wide v4, p0, LZ/S;->o0:J

    .line 180
    .line 181
    invoke-direct {p0}, LZ/S;->F()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, v6}, LZ/S;->s0(Ly/I0$h;)V

    .line 185
    .line 186
    .line 187
    iget-object p2, p0, LZ/S;->M:LZ/S$h;

    .line 188
    .line 189
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    const/4 v0, 0x2

    .line 194
    if-eq p2, v0, :cond_7

    .line 195
    .line 196
    if-eq p2, v3, :cond_7

    .line 197
    .line 198
    const/4 v0, 0x4

    .line 199
    if-eq p2, v0, :cond_6

    .line 200
    .line 201
    const/4 v0, 0x5

    .line 202
    if-eq p2, v0, :cond_6

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_6
    sget-object p2, LZ/S$h;->g:LZ/S$h;

    .line 206
    .line 207
    invoke-virtual {p0, p2}, LZ/S;->r0(LZ/S$h;)V

    .line 208
    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_7
    sget-object p2, LZ/S$h;->h:LZ/S$h;

    .line 212
    .line 213
    invoke-virtual {p0, p2}, LZ/S;->r0(LZ/S$h;)V

    .line 214
    .line 215
    .line 216
    iget-object p2, p0, LZ/S;->H:Lc0/n;

    .line 217
    .line 218
    invoke-virtual {p2}, Lc0/n;->F()V

    .line 219
    .line 220
    .line 221
    :goto_3
    invoke-direct {p0, p1}, LZ/S;->Z(LZ/S$j;)V

    .line 222
    .line 223
    .line 224
    return-void

    .line 225
    :cond_8
    new-instance p1, Ljava/lang/AssertionError;

    .line 226
    .line 227
    const-string p2, "Attempted to finalize in-progress recording, but no recording is in progress."

    .line 228
    .line 229
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    throw p1
.end method

.method I0(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LZ/S$j;->I()LZ/s;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v1, v2}, LZ/y0;->g(LZ/s;LZ/c0;)LZ/y0$e;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1, p1}, LZ/S$j;->w0(LZ/y0;Z)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method K0(Lg0/i;LZ/S$j;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-wide v3, v1, LZ/S;->O:J

    .line 6
    .line 7
    invoke-interface/range {p1 .. p1}, Lg0/i;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v5

    .line 11
    add-long/2addr v3, v5

    .line 12
    iget-wide v5, v1, LZ/S;->W:J

    .line 13
    .line 14
    const-wide/16 v7, 0x0

    .line 15
    .line 16
    cmp-long v0, v5, v7

    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    const-string v10, "Recorder"

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    cmp-long v0, v3, v5

    .line 24
    .line 25
    if-lez v0, :cond_0

    .line 26
    .line 27
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-wide v3, v1, LZ/S;->W:J

    .line 32
    .line 33
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    const-string v3, "Reach file size limit %d > %d"

    .line 42
    .line 43
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 v0, 0x2

    .line 51
    invoke-virtual {v1, v2, v0, v9}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    return-void

    .line 55
    :cond_0
    invoke-interface/range {p1 .. p1}, Lg0/i;->o0()J

    .line 56
    .line 57
    .line 58
    move-result-wide v5

    .line 59
    iget-wide v11, v1, LZ/S;->T:J

    .line 60
    .line 61
    const-wide v13, 0x7fffffffffffffffL

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    cmp-long v0, v11, v13

    .line 67
    .line 68
    const/4 v15, 0x1

    .line 69
    if-nez v0, :cond_1

    .line 70
    .line 71
    iput-wide v5, v1, LZ/S;->T:J

    .line 72
    .line 73
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-wide v7, v1, LZ/S;->T:J

    .line 78
    .line 79
    invoke-static {v7, v8}, Lb0/d;->f(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    filled-new-array {v0, v7}, [Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    const-string v7, "First audio time: %d (%s)"

    .line 88
    .line 89
    invoke-static {v7, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 98
    .line 99
    move-wide/from16 v16, v7

    .line 100
    .line 101
    iget-wide v7, v1, LZ/S;->R:J

    .line 102
    .line 103
    invoke-static {v7, v8, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 104
    .line 105
    .line 106
    move-result-wide v7

    .line 107
    sub-long v7, v5, v7

    .line 108
    .line 109
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 110
    .line 111
    .line 112
    move-result-wide v7

    .line 113
    iget-wide v11, v1, LZ/S;->V:J

    .line 114
    .line 115
    cmp-long v11, v11, v13

    .line 116
    .line 117
    if-eqz v11, :cond_2

    .line 118
    .line 119
    move v11, v15

    .line 120
    goto :goto_0

    .line 121
    :cond_2
    const/4 v11, 0x0

    .line 122
    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    .line 123
    .line 124
    invoke-static {v11, v12}, LH0/g;->j(ZLjava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-wide v11, v1, LZ/S;->V:J

    .line 128
    .line 129
    sub-long v11, v5, v11

    .line 130
    .line 131
    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 132
    .line 133
    .line 134
    move-result-wide v11

    .line 135
    add-long/2addr v7, v11

    .line 136
    iget-wide v11, v1, LZ/S;->X:J

    .line 137
    .line 138
    cmp-long v0, v11, v16

    .line 139
    .line 140
    if-eqz v0, :cond_3

    .line 141
    .line 142
    cmp-long v0, v7, v11

    .line 143
    .line 144
    if-lez v0, :cond_3

    .line 145
    .line 146
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    iget-wide v3, v1, LZ/S;->X:J

    .line 151
    .line 152
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    const-string v3, "Audio data reaches duration limit %d > %d"

    .line 161
    .line 162
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    const/16 v0, 0x9

    .line 170
    .line 171
    invoke-virtual {v1, v2, v0, v9}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 172
    .line 173
    .line 174
    return-void

    .line 175
    :cond_3
    :goto_1
    :try_start_0
    iget-object v0, v1, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 176
    .line 177
    iget-object v7, v1, LZ/S;->z:Ljava/lang/Integer;

    .line 178
    .line 179
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    invoke-interface/range {p1 .. p1}, Lg0/i;->a()Ljava/nio/ByteBuffer;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-interface/range {p1 .. p1}, Lg0/i;->O()Landroid/media/MediaCodec$BufferInfo;

    .line 188
    .line 189
    .line 190
    move-result-object v9

    .line 191
    invoke-virtual {v0, v7, v8, v9}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .line 193
    .line 194
    iput-wide v3, v1, LZ/S;->O:J

    .line 195
    .line 196
    iget-wide v2, v1, LZ/S;->P:J

    .line 197
    .line 198
    invoke-interface/range {p1 .. p1}, Lg0/i;->size()J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    add-long/2addr v2, v7

    .line 203
    iput-wide v2, v1, LZ/S;->P:J

    .line 204
    .line 205
    iput-wide v5, v1, LZ/S;->V:J

    .line 206
    .line 207
    return-void

    .line 208
    :catch_0
    move-exception v0

    .line 209
    iget-object v3, v1, LZ/S;->n0:Lb0/f;

    .line 210
    .line 211
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    check-cast v3, Lb0/f;

    .line 216
    .line 217
    invoke-interface {v3}, Lb0/f;->a()J

    .line 218
    .line 219
    .line 220
    move-result-wide v3

    .line 221
    iget-wide v5, v1, LZ/S;->l:J

    .line 222
    .line 223
    cmp-long v3, v3, v5

    .line 224
    .line 225
    if-gez v3, :cond_4

    .line 226
    .line 227
    const/4 v15, 0x3

    .line 228
    :cond_4
    invoke-virtual {v1, v2, v15, v0}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    return-void
.end method

.method L()LZ/c0;
    .locals 11

    .line 1
    iget-wide v0, p0, LZ/S;->Q:J

    .line 2
    .line 3
    iget-wide v2, p0, LZ/S;->O:J

    .line 4
    .line 5
    iget-object v4, p0, LZ/S;->M:LZ/S$h;

    .line 6
    .line 7
    invoke-direct {p0, v4}, LZ/S;->O(LZ/S$h;)I

    .line 8
    .line 9
    .line 10
    move-result v5

    .line 11
    iget-object v6, p0, LZ/S;->c0:Ljava/lang/Throwable;

    .line 12
    .line 13
    iget-wide v7, p0, LZ/S;->k0:D

    .line 14
    .line 15
    iget-wide v9, p0, LZ/S;->P:J

    .line 16
    .line 17
    invoke-static/range {v5 .. v10}, LZ/b;->e(ILjava/lang/Throwable;DJ)LZ/b;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-static {v0, v1, v2, v3, v4}, LZ/c0;->d(JJLZ/b;)LZ/c0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method L0(Lg0/i;LZ/S$j;)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p2

    .line 4
    .line 5
    iget-object v0, v1, LZ/S;->A:Ljava/lang/Integer;

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    iget-wide v3, v1, LZ/S;->O:J

    .line 10
    .line 11
    invoke-interface/range {p1 .. p1}, Lg0/i;->size()J

    .line 12
    .line 13
    .line 14
    move-result-wide v5

    .line 15
    add-long/2addr v3, v5

    .line 16
    iget-wide v5, v1, LZ/S;->W:J

    .line 17
    .line 18
    const-wide/16 v7, 0x0

    .line 19
    .line 20
    cmp-long v0, v5, v7

    .line 21
    .line 22
    const/4 v9, 0x0

    .line 23
    const-string v10, "Recorder"

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    cmp-long v0, v3, v5

    .line 28
    .line 29
    if-lez v0, :cond_0

    .line 30
    .line 31
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-wide v3, v1, LZ/S;->W:J

    .line 36
    .line 37
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v3, "Reach file size limit %d > %d"

    .line 46
    .line 47
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x2

    .line 55
    invoke-virtual {v1, v2, v0, v9}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_0
    invoke-interface/range {p1 .. p1}, Lg0/i;->o0()J

    .line 60
    .line 61
    .line 62
    move-result-wide v5

    .line 63
    iget-wide v11, v1, LZ/S;->R:J

    .line 64
    .line 65
    const-wide v13, 0x7fffffffffffffffL

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    cmp-long v0, v11, v13

    .line 71
    .line 72
    const/4 v15, 0x1

    .line 73
    if-nez v0, :cond_1

    .line 74
    .line 75
    iput-wide v5, v1, LZ/S;->R:J

    .line 76
    .line 77
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-wide v11, v1, LZ/S;->R:J

    .line 82
    .line 83
    invoke-static {v11, v12}, Lb0/d;->f(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    filled-new-array {v0, v9}, [Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    const-string v9, "First video time: %d (%s)"

    .line 92
    .line 93
    invoke-static {v9, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_1
    sget-object v0, Ljava/util/concurrent/TimeUnit;->MICROSECONDS:Ljava/util/concurrent/TimeUnit;

    .line 102
    .line 103
    move-wide/from16 v16, v7

    .line 104
    .line 105
    iget-wide v7, v1, LZ/S;->T:J

    .line 106
    .line 107
    invoke-static {v11, v12, v7, v8}, Ljava/lang/Math;->min(JJ)J

    .line 108
    .line 109
    .line 110
    move-result-wide v7

    .line 111
    sub-long v7, v5, v7

    .line 112
    .line 113
    invoke-virtual {v0, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 114
    .line 115
    .line 116
    move-result-wide v7

    .line 117
    iget-wide v11, v1, LZ/S;->U:J

    .line 118
    .line 119
    cmp-long v11, v11, v13

    .line 120
    .line 121
    if-eqz v11, :cond_2

    .line 122
    .line 123
    move v11, v15

    .line 124
    goto :goto_0

    .line 125
    :cond_2
    const/4 v11, 0x0

    .line 126
    :goto_0
    const-string v12, "There should be a previous data for adjusting the duration."

    .line 127
    .line 128
    invoke-static {v11, v12}, LH0/g;->j(ZLjava/lang/String;)V

    .line 129
    .line 130
    .line 131
    iget-wide v11, v1, LZ/S;->U:J

    .line 132
    .line 133
    sub-long v11, v5, v11

    .line 134
    .line 135
    invoke-virtual {v0, v11, v12}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    .line 136
    .line 137
    .line 138
    move-result-wide v11

    .line 139
    add-long/2addr v11, v7

    .line 140
    iget-wide v13, v1, LZ/S;->X:J

    .line 141
    .line 142
    cmp-long v0, v13, v16

    .line 143
    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    cmp-long v0, v11, v13

    .line 147
    .line 148
    if-lez v0, :cond_3

    .line 149
    .line 150
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    iget-wide v3, v1, LZ/S;->X:J

    .line 155
    .line 156
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 157
    .line 158
    .line 159
    move-result-object v3

    .line 160
    filled-new-array {v0, v3}, [Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    const-string v3, "Video data reaches duration limit %d > %d"

    .line 165
    .line 166
    invoke-static {v3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    const/16 v0, 0x9

    .line 174
    .line 175
    invoke-virtual {v1, v2, v0, v9}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 176
    .line 177
    .line 178
    return-void

    .line 179
    :cond_3
    :goto_1
    const/4 v9, 0x3

    .line 180
    :try_start_0
    iget-object v0, v1, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 181
    .line 182
    iget-object v11, v1, LZ/S;->A:Ljava/lang/Integer;

    .line 183
    .line 184
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 185
    .line 186
    .line 187
    move-result v11

    .line 188
    invoke-interface/range {p1 .. p1}, Lg0/i;->a()Ljava/nio/ByteBuffer;

    .line 189
    .line 190
    .line 191
    move-result-object v12

    .line 192
    invoke-interface/range {p1 .. p1}, Lg0/i;->O()Landroid/media/MediaCodec$BufferInfo;

    .line 193
    .line 194
    .line 195
    move-result-object v13

    .line 196
    invoke-virtual {v0, v11, v12, v13}, Landroid/media/MediaMuxer;->writeSampleData(ILjava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 197
    .line 198
    .line 199
    iput-wide v3, v1, LZ/S;->O:J

    .line 200
    .line 201
    iput-wide v7, v1, LZ/S;->Q:J

    .line 202
    .line 203
    iput-wide v5, v1, LZ/S;->U:J

    .line 204
    .line 205
    invoke-interface/range {p1 .. p1}, Lg0/i;->T()Z

    .line 206
    .line 207
    .line 208
    move-result v0

    .line 209
    invoke-virtual {v1, v0}, LZ/S;->I0(Z)V

    .line 210
    .line 211
    .line 212
    iget-wide v5, v1, LZ/S;->o0:J

    .line 213
    .line 214
    cmp-long v0, v3, v5

    .line 215
    .line 216
    if-lez v0, :cond_5

    .line 217
    .line 218
    iget-object v0, v1, LZ/S;->n0:Lb0/f;

    .line 219
    .line 220
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Lb0/f;

    .line 225
    .line 226
    invoke-interface {v0}, Lb0/f;->a()J

    .line 227
    .line 228
    .line 229
    move-result-wide v3

    .line 230
    new-instance v0, Ljava/lang/StringBuilder;

    .line 231
    .line 232
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 233
    .line 234
    .line 235
    const-string v5, "availableBytes = "

    .line 236
    .line 237
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-static {v3, v4}, Lh0/e;->a(J)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v5

    .line 244
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v10, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    iget-wide v5, v1, LZ/S;->l:J

    .line 255
    .line 256
    cmp-long v0, v3, v5

    .line 257
    .line 258
    if-gez v0, :cond_4

    .line 259
    .line 260
    new-instance v0, Ljava/io/IOException;

    .line 261
    .line 262
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    iget-wide v4, v1, LZ/S;->l:J

    .line 267
    .line 268
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    const-string v4, "Insufficient storage space. The available storage (%d bytes) is below the required threshold of %d bytes."

    .line 277
    .line 278
    invoke-static {v4, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v2, v9, v0}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :cond_4
    sub-long/2addr v3, v5

    .line 290
    iput-wide v3, v1, LZ/S;->o0:J

    .line 291
    .line 292
    :cond_5
    return-void

    .line 293
    :catch_0
    move-exception v0

    .line 294
    iget-object v3, v1, LZ/S;->n0:Lb0/f;

    .line 295
    .line 296
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v3

    .line 300
    check-cast v3, Lb0/f;

    .line 301
    .line 302
    invoke-interface {v3}, Lb0/f;->a()J

    .line 303
    .line 304
    .line 305
    move-result-wide v3

    .line 306
    iget-wide v5, v1, LZ/S;->l:J

    .line 307
    .line 308
    cmp-long v3, v3, v5

    .line 309
    .line 310
    if-gez v3, :cond_6

    .line 311
    .line 312
    move v15, v9

    .line 313
    :cond_6
    invoke-virtual {v1, v2, v15, v0}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 314
    .line 315
    .line 316
    return-void

    .line 317
    :cond_7
    new-instance v0, Ljava/lang/AssertionError;

    .line 318
    .line 319
    const-string v2, "Video data comes before the track is added to MediaMuxer."

    .line 320
    .line 321
    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    throw v0
.end method

.method M(LF/n1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p1}, LF/n1;->d()Lm5/a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    :try_start_0
    invoke-interface {p1}, Ljava/util/concurrent/Future;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object p1

    .line 10
    :catch_0
    move-exception p1

    .line 11
    goto :goto_0

    .line 12
    :catch_1
    move-exception p1

    .line 13
    :goto_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 14
    .line 15
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 16
    .line 17
    .line 18
    throw v0
.end method

.method Q()Z
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->M:LZ/S$h;

    .line 2
    .line 3
    sget-object v1, LZ/S$h;->j:LZ/S$h;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method R()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->G:LF/T0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LZ/S;->M(LF/n1;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LZ/r;

    .line 8
    .line 9
    invoke-virtual {v0}, LZ/r;->b()LZ/a;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, LZ/a;->c()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x1

    .line 20
    return v0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method S()Z
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LZ/S$j;->g0()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method W()V
    .locals 9

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :pswitch_0
    const-string v1, "Recorder"

    .line 19
    .line 20
    const-string v5, "onConfigured() was invoked when the Recorder had encountered error"

    .line 21
    .line 22
    invoke-static {v1, v5}, Ly/h0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto/16 :goto_3

    .line 26
    .line 27
    :catchall_0
    move-exception v1

    .line 28
    goto/16 :goto_5

    .line 29
    .line 30
    :pswitch_1
    iget-boolean v1, p0, LZ/S;->j:Z

    .line 31
    .line 32
    if-eqz v1, :cond_0

    .line 33
    .line 34
    goto/16 :goto_3

    .line 35
    .line 36
    :cond_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 37
    .line 38
    const-string v2, "Unexpectedly invoke onConfigured() in a STOPPING state when it\'s not waiting for a new surface."

    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    throw v1

    .line 44
    :pswitch_2
    move v1, v2

    .line 45
    goto :goto_0

    .line 46
    :pswitch_3
    move v1, v4

    .line 47
    :goto_0
    invoke-virtual {p0}, LZ/S;->S()Z

    .line 48
    .line 49
    .line 50
    move-result v5

    .line 51
    const-string v6, "Unexpectedly invoke onConfigured() when there\'s a non-persistent in-progress recording"

    .line 52
    .line 53
    invoke-static {v5, v6}, LH0/g;->j(ZLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    move v8, v2

    .line 57
    move-object v5, v3

    .line 58
    move-object v6, v5

    .line 59
    move v7, v4

    .line 60
    goto :goto_4

    .line 61
    :pswitch_4
    new-instance v1, Ljava/lang/AssertionError;

    .line 62
    .line 63
    new-instance v2, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    const-string v3, "Incorrectly invoke onConfigured() in state "

    .line 69
    .line 70
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 74
    .line 75
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-direct {v1, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    throw v1

    .line 86
    :pswitch_5
    move v1, v2

    .line 87
    goto :goto_1

    .line 88
    :pswitch_6
    move v1, v4

    .line 89
    :goto_1
    iget-object v5, p0, LZ/S;->q:LZ/S$j;

    .line 90
    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    move-object v5, v3

    .line 94
    move-object v6, v5

    .line 95
    move v7, v4

    .line 96
    :goto_2
    move v8, v7

    .line 97
    goto :goto_4

    .line 98
    :cond_1
    iget-object v5, p0, LZ/S;->e0:LZ/x0$a;

    .line 99
    .line 100
    sget-object v6, LZ/x0$a;->i:LZ/x0$a;

    .line 101
    .line 102
    if-ne v5, v6, :cond_2

    .line 103
    .line 104
    iget-object v5, p0, LZ/S;->r:LZ/S$j;

    .line 105
    .line 106
    iput-object v3, p0, LZ/S;->r:LZ/S$j;

    .line 107
    .line 108
    invoke-direct {p0}, LZ/S;->m0()V

    .line 109
    .line 110
    .line 111
    sget-object v6, LZ/S;->v0:Ljava/lang/Exception;

    .line 112
    .line 113
    const/4 v7, 0x4

    .line 114
    move v8, v4

    .line 115
    goto :goto_4

    .line 116
    :cond_2
    iget-object v5, p0, LZ/S;->n:LZ/S$l;

    .line 117
    .line 118
    invoke-direct {p0, v5}, LZ/S;->U(LZ/S$l;)LZ/S$j;

    .line 119
    .line 120
    .line 121
    move-result-object v5

    .line 122
    move-object v6, v3

    .line 123
    move v7, v4

    .line 124
    move v8, v7

    .line 125
    move-object v3, v5

    .line 126
    move-object v5, v6

    .line 127
    goto :goto_4

    .line 128
    :pswitch_7
    sget-object v1, LZ/S$l;->j:LZ/S$l;

    .line 129
    .line 130
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 131
    .line 132
    .line 133
    :goto_3
    move-object v5, v3

    .line 134
    move-object v6, v5

    .line 135
    move v1, v4

    .line 136
    move v7, v1

    .line 137
    goto :goto_2

    .line 138
    :goto_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 139
    if-eqz v8, :cond_4

    .line 140
    .line 141
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 142
    .line 143
    invoke-direct {p0, v0, v2}, LZ/S;->H0(LZ/S$j;Z)V

    .line 144
    .line 145
    .line 146
    iget-object v0, p0, LZ/S;->I:Lg0/l;

    .line 147
    .line 148
    invoke-interface {v0}, Lg0/l;->start()V

    .line 149
    .line 150
    .line 151
    iget-boolean v0, p0, LZ/S;->l0:Z

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 156
    .line 157
    invoke-virtual {v0}, LZ/S$j;->I()LZ/s;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-virtual {p0}, LZ/S;->L()LZ/c0;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    invoke-static {v2, v3}, LZ/y0;->e(LZ/s;LZ/c0;)LZ/y0$c;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-virtual {v0, v2}, LZ/S$j;->u0(LZ/y0;)V

    .line 170
    .line 171
    .line 172
    iput-boolean v4, p0, LZ/S;->l0:Z

    .line 173
    .line 174
    :cond_3
    if-eqz v1, :cond_6

    .line 175
    .line 176
    iget-object v0, p0, LZ/S;->I:Lg0/l;

    .line 177
    .line 178
    invoke-interface {v0}, Lg0/l;->pause()V

    .line 179
    .line 180
    .line 181
    return-void

    .line 182
    :cond_4
    if-eqz v3, :cond_5

    .line 183
    .line 184
    invoke-direct {p0, v3, v1}, LZ/S;->B0(LZ/S$j;Z)V

    .line 185
    .line 186
    .line 187
    return-void

    .line 188
    :cond_5
    if-eqz v5, :cond_6

    .line 189
    .line 190
    invoke-direct {p0, v5, v7, v6}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 191
    .line 192
    .line 193
    :cond_6
    return-void

    .line 194
    :goto_5
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 195
    throw v1

    .line 196
    nop

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_4
        :pswitch_0
    .end packed-switch
.end method

.method X(Ljava/lang/Throwable;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 5
    .line 6
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :pswitch_0
    new-instance v1, Ljava/lang/AssertionError;

    .line 16
    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v3, "Encountered encoder setup error while in unexpected state "

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    const-string v3, ": "

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    invoke-direct {v1, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    throw v1

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :pswitch_1
    iget-object v1, p0, LZ/S;->r:LZ/S$j;

    .line 51
    .line 52
    iput-object v2, p0, LZ/S;->r:LZ/S$j;

    .line 53
    .line 54
    move-object v2, v1

    .line 55
    :pswitch_2
    const/4 v1, -0x1

    .line 56
    invoke-direct {p0, v1}, LZ/S;->v0(I)V

    .line 57
    .line 58
    .line 59
    sget-object v1, LZ/S$l;->o:LZ/S$l;

    .line 60
    .line 61
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    if-eqz v2, :cond_0

    .line 66
    .line 67
    const/4 v0, 0x7

    .line 68
    invoke-direct {p0, v2, v0, p1}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-void

    .line 72
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 73
    throw p1

    .line 74
    nop

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method Y(LZ/S$j;ILjava/lang/Throwable;)V
    .locals 9

    .line 1
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 2
    .line 3
    if-ne p1, v0, :cond_2

    .line 4
    .line 5
    iget-object v1, p0, LZ/S;->i:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    iget-object v0, p0, LZ/S;->n:LZ/S$l;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 14
    const/4 v2, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    goto :goto_1

    .line 19
    :pswitch_0
    :try_start_1
    sget-object v0, LZ/S$l;->m:LZ/S$l;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, LZ/S;->u0(LZ/S$l;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 22
    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    move-object p1, v0

    .line 28
    move-object v3, p0

    .line 29
    goto :goto_3

    .line 30
    :goto_0
    :pswitch_1
    :try_start_2
    iget-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 31
    .line 32
    if-ne p1, v0, :cond_1

    .line 33
    .line 34
    :goto_1
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    const-wide/16 v5, -0x1

    .line 38
    .line 39
    move-object v3, p0

    .line 40
    move-object v4, p1

    .line 41
    move v7, p2

    .line 42
    move-object v8, p3

    .line 43
    invoke-virtual/range {v3 .. v8}, LZ/S;->D0(LZ/S$j;JILjava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    move-object v3, p0

    .line 48
    return-void

    .line 49
    :catchall_1
    move-exception v0

    .line 50
    move-object v3, p0

    .line 51
    :goto_2
    move-object p1, v0

    .line 52
    goto :goto_3

    .line 53
    :cond_1
    move-object v3, p0

    .line 54
    :try_start_3
    new-instance p1, Ljava/lang/AssertionError;

    .line 55
    .line 56
    const-string p2, "Internal error occurred for recording but it is not the active recording."

    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    throw p1

    .line 62
    :catchall_2
    move-exception v0

    .line 63
    goto :goto_2

    .line 64
    :pswitch_2
    move-object v3, p0

    .line 65
    new-instance p1, Ljava/lang/AssertionError;

    .line 66
    .line 67
    new-instance p2, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    const-string p3, "In-progress recording error occurred while in unexpected state: "

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object p3, v3, LZ/S;->n:LZ/S$l;

    .line 78
    .line 79
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p2

    .line 86
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :goto_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 91
    throw p1

    .line 92
    :cond_2
    move-object v3, p0

    .line 93
    new-instance p1, Ljava/lang/AssertionError;

    .line 94
    .line 95
    const-string p2, "Internal error occurred on recording that is not the current in-progress recording."

    .line 96
    .line 97
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    throw p1

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public a(Ly/I0;)V
    .locals 2

    .line 1
    sget-object v0, LF/v1;->g:LF/v1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1}, LZ/S;->b(Ly/I0;LF/v1;Z)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public b(Ly/I0;LF/v1;Z)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    const-string v1, "Recorder"

    .line 5
    .line 6
    new-instance v2, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v3, "Surface is requested in state: "

    .line 12
    .line 13
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 17
    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v3, ", Current surface: "

    .line 22
    .line 23
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    iget v3, p0, LZ/S;->p:I

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v1, v2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 39
    .line 40
    sget-object v2, LZ/S$l;->o:LZ/S$l;

    .line 41
    .line 42
    if-ne v1, v2, :cond_0

    .line 43
    .line 44
    sget-object v1, LZ/S$l;->g:LZ/S$l;

    .line 45
    .line 46
    invoke-virtual {p0, v1}, LZ/S;->u0(LZ/S$l;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    iget-object v0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    new-instance v1, LZ/F;

    .line 56
    .line 57
    invoke-direct {v1, p0, p1, p2, p3}, LZ/F;-><init>(LZ/S;Ly/I0;LF/v1;Z)V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 65
    throw p1
.end method

.method b0(LZ/x0$a;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->e0:LZ/x0$a;

    .line 2
    .line 3
    iput-object p1, p0, LZ/S;->e0:LZ/x0$a;

    .line 4
    .line 5
    const-string v1, "Recorder"

    .line 6
    .line 7
    if-eq v0, p1, :cond_4

    .line 8
    .line 9
    new-instance v0, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    const-string v2, "Video source has transitioned to state: "

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v0, LZ/x0$a;->i:LZ/x0$a;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-ne p1, v0, :cond_2

    .line 33
    .line 34
    iget-object p1, p0, LZ/S;->E:Landroid/view/Surface;

    .line 35
    .line 36
    const/4 v0, 0x4

    .line 37
    const/4 v2, 0x0

    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget-object p1, p0, LZ/S;->m0:LZ/S$k;

    .line 41
    .line 42
    if-eqz p1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1}, LZ/S$k;->j()V

    .line 45
    .line 46
    .line 47
    iput-object v2, p0, LZ/S;->m0:LZ/S$k;

    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0, v0, v2, v1}, LZ/S;->j0(ILjava/lang/Throwable;Z)V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    const/4 p1, 0x1

    .line 54
    iput-boolean p1, p0, LZ/S;->g0:Z

    .line 55
    .line 56
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    invoke-virtual {p1}, LZ/S$j;->g0()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    if-nez p1, :cond_3

    .line 65
    .line 66
    iget-object p1, p0, LZ/S;->t:LZ/S$j;

    .line 67
    .line 68
    invoke-virtual {p0, p1, v0, v2}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    sget-object v0, LZ/x0$a;->h:LZ/x0$a;

    .line 73
    .line 74
    if-ne p1, v0, :cond_3

    .line 75
    .line 76
    iget-object p1, p0, LZ/S;->f0:Ljava/util/concurrent/ScheduledFuture;

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-interface {p1, v1}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, LZ/S;->I:Lg0/l;

    .line 87
    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    invoke-static {p1}, LZ/S;->V(Lg0/l;)V

    .line 91
    .line 92
    .line 93
    :cond_3
    return-void

    .line 94
    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 97
    .line 98
    .line 99
    const-string v2, "Video source transitions to the same state: "

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    return-void
.end method

.method public c(Ly/q;I)LZ/e0;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p2, v0, :cond_0

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    :cond_0
    iget p2, p0, LZ/S;->k:I

    .line 6
    .line 7
    invoke-static {v0, p1, p2}, LZ/S;->N(ILy/q;I)LZ/e0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public d()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->G:LF/T0;

    .line 2
    .line 3
    return-object v0
.end method

.method d0(LZ/w0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, LZ/w0;->m()Lg0/l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Lg0/l;

    .line 10
    .line 11
    iput-object v0, p0, LZ/S;->I:Lg0/l;

    .line 12
    .line 13
    iget-object v1, p0, LZ/S;->m:LF/T0;

    .line 14
    .line 15
    invoke-interface {v0}, Lg0/l;->e()Lg0/g0;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lg0/s0;

    .line 20
    .line 21
    invoke-interface {v0}, Lg0/s0;->c()Landroid/util/Range;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v1, v0}, LF/T0;->k(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, LZ/S;->I:Lg0/l;

    .line 29
    .line 30
    invoke-interface {v0}, Lg0/l;->h()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iput v0, p0, LZ/S;->S:I

    .line 35
    .line 36
    invoke-virtual {p1}, LZ/w0;->k()Landroid/view/Surface;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    iput-object v0, p0, LZ/S;->E:Landroid/view/Surface;

    .line 41
    .line 42
    invoke-virtual {p0, v0}, LZ/S;->t0(Landroid/view/Surface;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 46
    .line 47
    new-instance v1, LZ/G;

    .line 48
    .line 49
    invoke-direct {v1, p0}, LZ/G;-><init>(LZ/S;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, LZ/w0;->p(Ljava/util/concurrent/Executor;Lg0/l$c$a;)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, LZ/w0;->l()Lm5/a;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    new-instance v1, LZ/S$a;

    .line 60
    .line 61
    invoke-direct {v1, p0, p1}, LZ/S$a;-><init>(LZ/S;LZ/w0;)V

    .line 62
    .line 63
    .line 64
    iget-object p1, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 65
    .line 66
    invoke-static {v0, v1, p1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public e()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->a:LF/T0;

    .line 2
    .line 3
    return-object v0
.end method

.method e0(LZ/b0;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->r:LZ/S$j;

    .line 5
    .line 6
    invoke-static {p1, v1}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LZ/S;->q:LZ/S$j;

    .line 13
    .line 14
    invoke-static {p1, v1}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "pause() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LZ/b0;->k()LZ/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object p1, p0, LZ/S;->n:LZ/S$l;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    if-eq p1, v1, :cond_2

    .line 60
    .line 61
    const/4 v1, 0x3

    .line 62
    if-eq p1, v1, :cond_3

    .line 63
    .line 64
    const/4 v1, 0x4

    .line 65
    if-eq p1, v1, :cond_1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p1, LZ/S$l;->l:LZ/S$l;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, LZ/S;->q:LZ/S$j;

    .line 74
    .line 75
    iget-object v1, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 76
    .line 77
    new-instance v2, LZ/N;

    .line 78
    .line 79
    invoke-direct {v2, p0, p1}, LZ/N;-><init>(LZ/S;LZ/S$j;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_2
    sget-object p1, LZ/S$l;->i:LZ/S$l;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "Called pause() from invalid state: "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, LZ/S;->n:LZ/S$l;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    throw p1
.end method

.method public f()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->b:LF/T0;

    .line 2
    .line 3
    return-object v0
.end method

.method public g(LZ/x0$a;)V
    .locals 2

    .line 1
    iget-object v0, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    new-instance v1, LZ/D;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, LZ/D;-><init>(LZ/S;LZ/x0$a;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public g0(Landroid/content/Context;LZ/q;)LZ/u;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LZ/S;->h0(Landroid/content/Context;LZ/s;)LZ/u;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method j0(ILjava/lang/Throwable;Z)V
    .locals 11

    .line 1
    iget-object v1, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    iget-object v0, p0, LZ/S;->n:LZ/S$l;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v2, 0x1

    .line 11
    const/4 v3, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    :pswitch_0
    goto :goto_0

    .line 16
    :pswitch_1
    sget-object v0, LZ/S$l;->n:LZ/S$l;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, LZ/S;->u0(LZ/S$l;)V

    .line 19
    .line 20
    .line 21
    :goto_0
    move v2, v3

    .line 22
    goto :goto_2

    .line 23
    :catchall_0
    move-exception v0

    .line 24
    move-object p1, v0

    .line 25
    goto :goto_3

    .line 26
    :pswitch_2
    iget-object v0, p0, LZ/S;->t:LZ/S$j;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    move v0, v2

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    move v0, v3

    .line 33
    :goto_1
    new-instance v4, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v5, "In-progress recording shouldn\'t be null when in state "

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v5, p0, LZ/S;->n:LZ/S$l;

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v0, v4}, LH0/g;->j(ZLjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, LZ/S;->q:LZ/S$j;

    .line 56
    .line 57
    iget-object v4, p0, LZ/S;->t:LZ/S$j;

    .line 58
    .line 59
    if-ne v0, v4, :cond_2

    .line 60
    .line 61
    invoke-virtual {p0}, LZ/S;->S()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    sget-object v0, LZ/S$l;->n:LZ/S$l;

    .line 69
    .line 70
    invoke-virtual {p0, v0}, LZ/S;->u0(LZ/S$l;)V

    .line 71
    .line 72
    .line 73
    move v10, v3

    .line 74
    move v3, v2

    .line 75
    move v2, v10

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    .line 78
    .line 79
    const-string p2, "In-progress recording does not match the active recording. Unable to reset encoder."

    .line 80
    .line 81
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :pswitch_3
    sget-object v0, LZ/S$l;->n:LZ/S$l;

    .line 86
    .line 87
    invoke-direct {p0, v0}, LZ/S;->J0(LZ/S$l;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    :pswitch_4
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    if-eqz v2, :cond_4

    .line 92
    .line 93
    if-eqz p3, :cond_3

    .line 94
    .line 95
    invoke-direct {p0}, LZ/S;->l0()V

    .line 96
    .line 97
    .line 98
    return-void

    .line 99
    :cond_3
    invoke-direct {p0}, LZ/S;->k0()V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :cond_4
    if-eqz v3, :cond_5

    .line 104
    .line 105
    iget-object v5, p0, LZ/S;->t:LZ/S$j;

    .line 106
    .line 107
    const-wide/16 v6, -0x1

    .line 108
    .line 109
    move-object v4, p0

    .line 110
    move v8, p1

    .line 111
    move-object v9, p2

    .line 112
    invoke-virtual/range {v4 .. v9}, LZ/S;->D0(LZ/S$j;JILjava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    :cond_5
    return-void

    .line 116
    :goto_3
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 117
    throw p1

    .line 118
    nop

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_4
    .end packed-switch
.end method

.method n0(LZ/b0;)V
    .locals 4

    .line 1
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, LZ/S;->r:LZ/S$j;

    .line 5
    .line 6
    invoke-static {p1, v1}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    iget-object v1, p0, LZ/S;->q:LZ/S$j;

    .line 13
    .line 14
    invoke-static {p1, v1}, LZ/S;->T(LZ/b0;LZ/S$j;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "Recorder"

    .line 21
    .line 22
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    .line 27
    const-string v3, "resume() called on a recording that is no longer active: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, LZ/b0;->k()LZ/s;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-static {v1, p1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    monitor-exit v0

    .line 47
    return-void

    .line 48
    :catchall_0
    move-exception p1

    .line 49
    goto :goto_1

    .line 50
    :cond_0
    iget-object p1, p0, LZ/S;->n:LZ/S$l;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    if-eqz p1, :cond_3

    .line 57
    .line 58
    const/4 v1, 0x5

    .line 59
    if-eq p1, v1, :cond_2

    .line 60
    .line 61
    const/4 v1, 0x2

    .line 62
    if-eq p1, v1, :cond_1

    .line 63
    .line 64
    const/4 v1, 0x3

    .line 65
    if-eq p1, v1, :cond_3

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_1
    sget-object p1, LZ/S$l;->h:LZ/S$l;

    .line 69
    .line 70
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 71
    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    sget-object p1, LZ/S$l;->k:LZ/S$l;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, LZ/S;->u0(LZ/S$l;)V

    .line 77
    .line 78
    .line 79
    iget-object p1, p0, LZ/S;->q:LZ/S$j;

    .line 80
    .line 81
    iget-object v1, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    new-instance v2, LZ/A;

    .line 84
    .line 85
    invoke-direct {v2, p0, p1}, LZ/A;-><init>(LZ/S;LZ/S$j;)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 89
    .line 90
    .line 91
    :goto_0
    monitor-exit v0

    .line 92
    return-void

    .line 93
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 94
    .line 95
    new-instance v1, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v2, "Called resume() from invalid state: "

    .line 101
    .line 102
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    iget-object v2, p0, LZ/S;->n:LZ/S$l;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    throw p1

    .line 118
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    throw p1
.end method

.method r0(LZ/S$h;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "Transitioning audio state: "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, LZ/S;->M:LZ/S$h;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, " --> "

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    const-string v1, "Recorder"

    .line 29
    .line 30
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, LZ/S;->M:LZ/S$h;

    .line 34
    .line 35
    return-void
.end method

.method s0(Ly/I0$h;)V
    .locals 4

    .line 1
    const-string v0, "Recorder"

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Update stream transformation info: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-static {v0, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LZ/S;->v:Ly/I0$h;

    .line 24
    .line 25
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 26
    .line 27
    monitor-enter v0

    .line 28
    :try_start_0
    iget-object v1, p0, LZ/S;->a:LF/T0;

    .line 29
    .line 30
    iget v2, p0, LZ/S;->p:I

    .line 31
    .line 32
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 33
    .line 34
    invoke-direct {p0, v3}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    invoke-static {v2, v3, p1}, LZ/d0;->e(ILZ/d0$a;Ly/I0$h;)LZ/d0;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {v1, p1}, LF/T0;->k(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    monitor-exit v0

    .line 46
    return-void

    .line 47
    :catchall_0
    move-exception p1

    .line 48
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    throw p1
.end method

.method t0(Landroid/view/Surface;)V
    .locals 1

    .line 1
    iget-object v0, p0, LZ/S;->D:Landroid/view/Surface;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-object p1, p0, LZ/S;->D:Landroid/view/Surface;

    .line 7
    .line 8
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0

    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    const/4 p1, 0x0

    .line 21
    :goto_0
    invoke-direct {p0, p1}, LZ/S;->v0(I)V

    .line 22
    .line 23
    .line 24
    monitor-exit v0

    .line 25
    return-void

    .line 26
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    throw p1
.end method

.method u0(LZ/S$l;)V
    .locals 3

    .line 1
    iget-object v0, p0, LZ/S;->n:LZ/S$l;

    .line 2
    .line 3
    if-eq v0, p1, :cond_4

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v1, "Transitioning Recorder internal state: "

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, " --> "

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    const-string v1, "Recorder"

    .line 33
    .line 34
    invoke-static {v1, v0}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    sget-object v0, LZ/S;->q0:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 47
    .line 48
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v0, LZ/S;->r0:Ljava/util/Set;

    .line 55
    .line 56
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 57
    .line 58
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_0

    .line 63
    .line 64
    iget-object v0, p0, LZ/S;->n:LZ/S$l;

    .line 65
    .line 66
    iput-object v0, p0, LZ/S;->o:LZ/S$l;

    .line 67
    .line 68
    invoke-direct {p0, v0}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    goto :goto_0

    .line 73
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    const-string v1, "Invalid state transition. Should not be transitioning to a PENDING state from state "

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    iget-object v1, p0, LZ/S;->n:LZ/S$l;

    .line 86
    .line 87
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :cond_1
    iget-object v0, p0, LZ/S;->o:LZ/S$l;

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    iput-object v2, p0, LZ/S;->o:LZ/S$l;

    .line 103
    .line 104
    :cond_2
    :goto_0
    iput-object p1, p0, LZ/S;->n:LZ/S$l;

    .line 105
    .line 106
    if-nez v2, :cond_3

    .line 107
    .line 108
    invoke-direct {p0, p1}, LZ/S;->P(LZ/S$l;)LZ/d0$a;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    :cond_3
    iget-object p1, p0, LZ/S;->a:LF/T0;

    .line 113
    .line 114
    iget v0, p0, LZ/S;->p:I

    .line 115
    .line 116
    iget-object v1, p0, LZ/S;->v:Ly/I0$h;

    .line 117
    .line 118
    invoke-static {v0, v2, v1}, LZ/d0;->e(ILZ/d0$a;Ly/I0$h;)LZ/d0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    invoke-virtual {p1, v0}, LF/T0;->k(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_4
    new-instance v0, Ljava/lang/AssertionError;

    .line 127
    .line 128
    new-instance v1, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v2, "Attempted to transition to state "

    .line 134
    .line 135
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v2, ", but Recorder is already in state "

    .line 142
    .line 143
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    throw v0
.end method

.method w0(LZ/S$j;)V
    .locals 10

    .line 1
    iget-object v0, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 2
    .line 3
    if-nez v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LZ/S;->b0:LO/c;

    .line 12
    .line 13
    invoke-interface {v0}, LO/c;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    .line 21
    .line 22
    const-string v0, "Audio is enabled but no audio sample is ready. Cannot start media muxer."

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    throw p1

    .line 28
    :cond_1
    :goto_0
    iget-object v0, p0, LZ/S;->a0:Lg0/i;

    .line 29
    .line 30
    if-eqz v0, :cond_c

    .line 31
    .line 32
    const/4 v1, 0x0

    .line 33
    :try_start_0
    iput-object v1, p0, LZ/S;->a0:Lg0/i;

    .line 34
    .line 35
    invoke-interface {v0}, Lg0/i;->o0()J

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-direct {p0, v2, v3}, LZ/S;->K(J)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {v0}, Lg0/i;->size()J

    .line 44
    .line 45
    .line 46
    move-result-wide v3

    .line 47
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-eqz v6, :cond_2

    .line 56
    .line 57
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    check-cast v6, Lg0/i;

    .line 62
    .line 63
    invoke-interface {v6}, Lg0/i;->size()J

    .line 64
    .line 65
    .line 66
    move-result-wide v6

    .line 67
    add-long/2addr v3, v6

    .line 68
    goto :goto_1

    .line 69
    :catchall_0
    move-exception p1

    .line 70
    goto/16 :goto_8

    .line 71
    .line 72
    :cond_2
    iget-wide v5, p0, LZ/S;->W:J

    .line 73
    .line 74
    const-wide/16 v7, 0x0

    .line 75
    .line 76
    cmp-long v7, v5, v7

    .line 77
    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    cmp-long v5, v3, v5

    .line 81
    .line 82
    if-lez v5, :cond_3

    .line 83
    .line 84
    const-string v2, "Recorder"

    .line 85
    .line 86
    const-string v5, "Initial data exceeds file size limit %d > %d"

    .line 87
    .line 88
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    iget-wide v6, p0, LZ/S;->W:J

    .line 93
    .line 94
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    filled-new-array {v3, v4}, [Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    invoke-static {v5, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-static {v2, v3}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    const/4 v2, 0x2

    .line 110
    invoke-virtual {p0, p1, v2, v1}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Lg0/i;->close()V

    .line 114
    .line 115
    .line 116
    return-void

    .line 117
    :cond_3
    const/4 v1, 0x3

    .line 118
    const/4 v3, 0x5

    .line 119
    :try_start_1
    iget-object v4, p0, LZ/S;->G:LF/T0;

    .line 120
    .line 121
    invoke-virtual {p0, v4}, LZ/S;->M(LF/n1;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    check-cast v4, LZ/r;

    .line 126
    .line 127
    invoke-virtual {v4}, LZ/r;->c()I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    const/4 v6, -0x1

    .line 132
    if-ne v5, v6, :cond_4

    .line 133
    .line 134
    iget-object v4, p0, LZ/S;->x:Lb0/i;

    .line 135
    .line 136
    sget-object v5, LZ/S;->u0:LZ/r;

    .line 137
    .line 138
    invoke-virtual {v5}, LZ/r;->c()I

    .line 139
    .line 140
    .line 141
    move-result v5

    .line 142
    invoke-static {v5}, LZ/r;->g(I)I

    .line 143
    .line 144
    .line 145
    move-result v5

    .line 146
    invoke-static {v4, v5}, LZ/S;->E0(Lb0/i;I)I

    .line 147
    .line 148
    .line 149
    move-result v4

    .line 150
    goto :goto_2

    .line 151
    :catch_0
    move-exception v2

    .line 152
    goto/16 :goto_6

    .line 153
    .line 154
    :cond_4
    invoke-virtual {v4}, LZ/r;->c()I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    invoke-static {v4}, LZ/r;->g(I)I

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    :goto_2
    new-instance v5, LZ/H;

    .line 163
    .line 164
    invoke-direct {v5, p0}, LZ/H;-><init>(LZ/S;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v4, v5}, LZ/S$j;->l0(ILH0/a;)Landroid/media/MediaMuxer;

    .line 168
    .line 169
    .line 170
    move-result-object v4
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 171
    :try_start_2
    iget-object v5, p0, LZ/S;->w:Ly/I0$h;

    .line 172
    .line 173
    if-eqz v5, :cond_5

    .line 174
    .line 175
    invoke-virtual {p0, v5}, LZ/S;->s0(Ly/I0$h;)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v5}, Ly/I0$h;->b()I

    .line 179
    .line 180
    .line 181
    move-result v5

    .line 182
    invoke-virtual {v4, v5}, Landroid/media/MediaMuxer;->setOrientationHint(I)V

    .line 183
    .line 184
    .line 185
    :cond_5
    invoke-virtual {p1}, LZ/S$j;->I()LZ/s;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    invoke-virtual {v5}, LZ/s;->c()Landroid/location/Location;

    .line 190
    .line 191
    .line 192
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 193
    if-eqz v5, :cond_6

    .line 194
    .line 195
    :try_start_3
    invoke-virtual {v5}, Landroid/location/Location;->getLatitude()D

    .line 196
    .line 197
    .line 198
    move-result-wide v6

    .line 199
    invoke-virtual {v5}, Landroid/location/Location;->getLongitude()D

    .line 200
    .line 201
    .line 202
    move-result-wide v8

    .line 203
    invoke-static {v6, v7, v8, v9}, Li0/a;->a(DD)Landroid/util/Pair;

    .line 204
    .line 205
    .line 206
    move-result-object v5

    .line 207
    iget-object v6, v5, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v6, Ljava/lang/Double;

    .line 210
    .line 211
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 212
    .line 213
    .line 214
    move-result-wide v6

    .line 215
    double-to-float v6, v6

    .line 216
    iget-object v5, v5, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v5, Ljava/lang/Double;

    .line 219
    .line 220
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 221
    .line 222
    .line 223
    move-result-wide v7

    .line 224
    double-to-float v5, v7

    .line 225
    invoke-virtual {v4, v6, v5}, Landroid/media/MediaMuxer;->setLocation(FF)V
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 226
    .line 227
    .line 228
    goto :goto_3

    .line 229
    :catch_1
    move-exception v1

    .line 230
    :try_start_4
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->release()V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p0, p1, v3, v1}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 234
    .line 235
    .line 236
    invoke-interface {v0}, Lg0/i;->close()V

    .line 237
    .line 238
    .line 239
    return-void

    .line 240
    :cond_6
    :goto_3
    :try_start_5
    iget-object v3, p0, LZ/S;->J:Lg0/m0;

    .line 241
    .line 242
    invoke-interface {v3}, Lg0/m0;->a()Landroid/media/MediaFormat;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    invoke-virtual {v4, v3}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 247
    .line 248
    .line 249
    move-result v3

    .line 250
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 251
    .line 252
    .line 253
    move-result-object v3

    .line 254
    iput-object v3, p0, LZ/S;->A:Ljava/lang/Integer;

    .line 255
    .line 256
    invoke-virtual {p0}, LZ/S;->Q()Z

    .line 257
    .line 258
    .line 259
    move-result v3

    .line 260
    if-eqz v3, :cond_7

    .line 261
    .line 262
    iget-object v3, p0, LZ/S;->L:Lg0/m0;

    .line 263
    .line 264
    invoke-interface {v3}, Lg0/m0;->a()Landroid/media/MediaFormat;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    invoke-virtual {v4, v3}, Landroid/media/MediaMuxer;->addTrack(Landroid/media/MediaFormat;)I

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 273
    .line 274
    .line 275
    move-result-object v3

    .line 276
    iput-object v3, p0, LZ/S;->z:Ljava/lang/Integer;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 277
    .line 278
    :cond_7
    :try_start_6
    invoke-virtual {v4}, Landroid/media/MediaMuxer;->start()V
    :try_end_6
    .catch Ljava/lang/IllegalStateException; {:try_start_6 .. :try_end_6} :catch_2
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 279
    .line 280
    .line 281
    :try_start_7
    iput-object v4, p0, LZ/S;->F:Landroid/media/MediaMuxer;

    .line 282
    .line 283
    invoke-virtual {p0, v0, p1}, LZ/S;->L0(Lg0/i;LZ/S$j;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    if-eqz v2, :cond_8

    .line 295
    .line 296
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v2

    .line 300
    check-cast v2, Lg0/i;

    .line 301
    .line 302
    invoke-virtual {p0, v2, p1}, LZ/S;->K0(Lg0/i;LZ/S$j;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :cond_8
    invoke-interface {v0}, Lg0/i;->close()V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :catch_2
    move-exception v2

    .line 311
    :try_start_8
    iget-object v3, p0, LZ/S;->n0:Lb0/f;

    .line 312
    .line 313
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v3

    .line 317
    check-cast v3, Lb0/f;

    .line 318
    .line 319
    invoke-interface {v3}, Lb0/f;->a()J

    .line 320
    .line 321
    .line 322
    move-result-wide v3

    .line 323
    iget-wide v5, p0, LZ/S;->l:J

    .line 324
    .line 325
    cmp-long v3, v3, v5

    .line 326
    .line 327
    if-gez v3, :cond_9

    .line 328
    .line 329
    goto :goto_5

    .line 330
    :cond_9
    const/4 v1, 0x1

    .line 331
    :goto_5
    invoke-virtual {p0, p1, v1, v2}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 332
    .line 333
    .line 334
    invoke-interface {v0}, Lg0/i;->close()V

    .line 335
    .line 336
    .line 337
    return-void

    .line 338
    :goto_6
    :try_start_9
    invoke-static {v2}, Lh0/e;->d(Ljava/lang/Exception;)Z

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    if-eqz v4, :cond_a

    .line 343
    .line 344
    goto :goto_7

    .line 345
    :cond_a
    move v1, v3

    .line 346
    :goto_7
    invoke-virtual {p0, p1, v1, v2}, LZ/S;->Y(LZ/S$j;ILjava/lang/Throwable;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 347
    .line 348
    .line 349
    invoke-interface {v0}, Lg0/i;->close()V

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :goto_8
    if-eqz v0, :cond_b

    .line 354
    .line 355
    :try_start_a
    invoke-interface {v0}, Lg0/i;->close()V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 356
    .line 357
    .line 358
    goto :goto_9

    .line 359
    :catchall_1
    move-exception v0

    .line 360
    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 361
    .line 362
    .line 363
    :cond_b
    :goto_9
    throw p1

    .line 364
    :cond_c
    new-instance p1, Ljava/lang/AssertionError;

    .line 365
    .line 366
    const-string v0, "Media muxer cannot be started without an encoded video frame."

    .line 367
    .line 368
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    throw p1

    .line 372
    :cond_d
    new-instance p1, Ljava/lang/AssertionError;

    .line 373
    .line 374
    const-string v0, "Unable to set up media muxer when one already exists."

    .line 375
    .line 376
    invoke-direct {p1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    throw p1
.end method

.method z0(LZ/u;)LZ/b0;
    .locals 9

    .line 1
    const-string v0, "The given PendingRecording cannot be null."

    .line 2
    .line 3
    invoke-static {p1, v0}, LH0/g;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LZ/S;->i:Ljava/lang/Object;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-wide v1, p0, LZ/S;->s:J

    .line 10
    .line 11
    const-wide/16 v3, 0x1

    .line 12
    .line 13
    add-long/2addr v1, v3

    .line 14
    iput-wide v1, p0, LZ/S;->s:J

    .line 15
    .line 16
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    :pswitch_0
    iget-object v3, p0, LZ/S;->q:LZ/S$j;

    .line 30
    .line 31
    :goto_0
    move-object v8, v4

    .line 32
    move-object v4, v3

    .line 33
    move-object v3, v8

    .line 34
    goto :goto_4

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    goto/16 :goto_5

    .line 37
    .line 38
    :pswitch_1
    iget-object v3, p0, LZ/S;->r:LZ/S$j;

    .line 39
    .line 40
    invoke-static {v3}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, LZ/S$j;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :pswitch_2
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 48
    .line 49
    sget-object v6, LZ/S$l;->j:LZ/S$l;

    .line 50
    .line 51
    if-ne v3, v6, :cond_1

    .line 52
    .line 53
    iget-object v3, p0, LZ/S;->q:LZ/S$j;

    .line 54
    .line 55
    if-nez v3, :cond_0

    .line 56
    .line 57
    iget-object v3, p0, LZ/S;->r:LZ/S$j;

    .line 58
    .line 59
    if-nez v3, :cond_0

    .line 60
    .line 61
    const/4 v3, 0x1

    .line 62
    goto :goto_1

    .line 63
    :cond_0
    move v3, v5

    .line 64
    :goto_1
    const-string v7, "Expected recorder to be idle but a recording is either pending or in progress."

    .line 65
    .line 66
    invoke-static {v3, v7}, LH0/g;->j(ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    .line 69
    :cond_1
    :try_start_1
    invoke-static {p1, v1, v2}, LZ/S$j;->s(LZ/u;J)LZ/S$j;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {p1}, LZ/u;->a()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-virtual {v3, v7}, LZ/S$j;->X(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    iput-object v3, p0, LZ/S;->r:LZ/S$j;

    .line 81
    .line 82
    iget-object v3, p0, LZ/S;->n:LZ/S$l;

    .line 83
    .line 84
    if-ne v3, v6, :cond_2

    .line 85
    .line 86
    sget-object v3, LZ/S$l;->h:LZ/S$l;

    .line 87
    .line 88
    invoke-virtual {p0, v3}, LZ/S;->u0(LZ/S$l;)V

    .line 89
    .line 90
    .line 91
    iget-object v3, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 92
    .line 93
    new-instance v6, LZ/K;

    .line 94
    .line 95
    invoke-direct {v6, p0}, LZ/K;-><init>(LZ/S;)V

    .line 96
    .line 97
    .line 98
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catch_0
    move-exception v3

    .line 103
    goto :goto_3

    .line 104
    :cond_2
    sget-object v6, LZ/S$l;->o:LZ/S$l;

    .line 105
    .line 106
    if-ne v3, v6, :cond_3

    .line 107
    .line 108
    sget-object v3, LZ/S$l;->h:LZ/S$l;

    .line 109
    .line 110
    invoke-virtual {p0, v3}, LZ/S;->u0(LZ/S$l;)V

    .line 111
    .line 112
    .line 113
    iget-object v3, p0, LZ/S;->e:Ljava/util/concurrent/Executor;

    .line 114
    .line 115
    new-instance v6, LZ/L;

    .line 116
    .line 117
    invoke-direct {v6, p0}, LZ/L;-><init>(LZ/S;)V

    .line 118
    .line 119
    .line 120
    invoke-interface {v3, v6}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_3
    sget-object v3, LZ/S$l;->h:LZ/S$l;

    .line 125
    .line 126
    invoke-virtual {p0, v3}, LZ/S;->u0(LZ/S$l;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 127
    .line 128
    .line 129
    :goto_2
    move-object v3, v4

    .line 130
    goto :goto_4

    .line 131
    :goto_3
    const/4 v5, 0x5

    .line 132
    :goto_4
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 133
    if-nez v4, :cond_5

    .line 134
    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    const-string v0, "Recorder"

    .line 138
    .line 139
    new-instance v4, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v6, "Recording was started when the Recorder had encountered error "

    .line 145
    .line 146
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v4

    .line 156
    invoke-static {v0, v4}, Ly/h0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {p1, v1, v2}, LZ/S$j;->s(LZ/u;J)LZ/S$j;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-direct {p0, v0, v5, v3}, LZ/S;->J(LZ/S$j;ILjava/lang/Throwable;)V

    .line 164
    .line 165
    .line 166
    invoke-static {p1, v1, v2}, LZ/b0;->d(LZ/u;J)LZ/b0;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    return-object p1

    .line 171
    :cond_4
    invoke-static {p1, v1, v2}, LZ/b0;->e(LZ/u;J)LZ/b0;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 177
    .line 178
    const-string v0, "A recording is already in progress. Previous recordings must be stopped before a new recording can be started."

    .line 179
    .line 180
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw p1

    .line 184
    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 185
    throw p1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_2
        :pswitch_2
    .end packed-switch
.end method
