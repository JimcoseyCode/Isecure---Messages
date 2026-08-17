.class final Lh6/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lh6/l;


# instance fields
.field private a:Z

.field private final b:Landroid/content/Context;

.field private final c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;

.field private final d:LI4/x9;

.field private e:LI4/j;


# direct methods
.method constructor <init>(Landroid/content/Context;Le6/b;LI4/x9;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lh6/p;->c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;

    .line 10
    .line 11
    iput-object p1, p0, Lh6/p;->b:Landroid/content/Context;

    .line 12
    .line 13
    invoke-virtual {p2}, Le6/b;->a()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;->g:I

    .line 18
    .line 19
    iput-object p3, p0, Lh6/p;->d:LI4/x9;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lh6/p;->e:LI4/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    const/16 v0, 0xd

    .line 7
    .line 8
    :try_start_0
    iget-object v1, p0, Lh6/p;->b:Landroid/content/Context;

    .line 9
    .line 10
    sget-object v2, Lcom/google/android/gms/dynamite/DynamiteModule;->b:Lcom/google/android/gms/dynamite/DynamiteModule$b;

    .line 11
    .line 12
    const-string v3, "com.google.android.gms.vision.dynamite"

    .line 13
    .line 14
    invoke-static {v1, v2, v3}, Lcom/google/android/gms/dynamite/DynamiteModule;->d(Landroid/content/Context;Lcom/google/android/gms/dynamite/DynamiteModule$b;Ljava/lang/String;)Lcom/google/android/gms/dynamite/DynamiteModule;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Lcom/google/android/gms/dynamite/DynamiteModule;->c(Ljava/lang/String;)Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, LI4/l;->c(Landroid/os/IBinder;)LI4/m;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    iget-object v2, p0, Lh6/p;->b:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {v2}, LB4/b;->x(Ljava/lang/Object;)LB4/a;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    iget-object v3, p0, Lh6/p;->c:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;

    .line 35
    .line 36
    invoke-interface {v1, v2, v3}, LI4/m;->l(LB4/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzah;)LI4/j;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    iput-object v1, p0, Lh6/p;->e:LI4/j;

    .line 41
    .line 42
    if-nez v1, :cond_2

    .line 43
    .line 44
    iget-boolean v1, p0, Lh6/p;->a:Z

    .line 45
    .line 46
    if-eqz v1, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    iget-object v1, p0, Lh6/p;->b:Landroid/content/Context;

    .line 50
    .line 51
    const-string v2, "barcode"

    .line 52
    .line 53
    invoke-static {v1, v2}, Lc6/l;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v1, 0x1

    .line 57
    iput-boolean v1, p0, Lh6/p;->a:Z

    .line 58
    .line 59
    iget-object v1, p0, Lh6/p;->d:LI4/x9;

    .line 60
    .line 61
    sget-object v2, LI4/L6;->I:LI4/L6;

    .line 62
    .line 63
    invoke-static {v1, v2}, Lh6/b;->e(LI4/x9;LI4/L6;)V

    .line 64
    .line 65
    .line 66
    new-instance v1, LY5/a;

    .line 67
    .line 68
    const-string v2, "Waiting for the barcode module to be downloaded. Please wait."

    .line 69
    .line 70
    const/16 v3, 0xe

    .line 71
    .line 72
    invoke-direct {v1, v2, v3}, LY5/a;-><init>(Ljava/lang/String;I)V

    .line 73
    .line 74
    .line 75
    throw v1

    .line 76
    :catch_0
    move-exception v1

    .line 77
    goto :goto_2

    .line 78
    :catch_1
    move-exception v1

    .line 79
    goto :goto_3

    .line 80
    :cond_2
    :goto_0
    iget-object v1, p0, Lh6/p;->d:LI4/x9;

    .line 81
    .line 82
    sget-object v2, LI4/L6;->h:LI4/L6;

    .line 83
    .line 84
    invoke-static {v1, v2}, Lh6/b;->e(LI4/x9;LI4/L6;)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lcom/google/android/gms/dynamite/DynamiteModule$a; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    .line 86
    .line 87
    :goto_1
    const/4 v0, 0x0

    .line 88
    return v0

    .line 89
    :goto_2
    new-instance v2, LY5/a;

    .line 90
    .line 91
    const-string v3, "Failed to load deprecated vision dynamite module."

    .line 92
    .line 93
    invoke-direct {v2, v3, v0, v1}, LY5/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    throw v2

    .line 97
    :goto_3
    new-instance v2, LY5/a;

    .line 98
    .line 99
    const-string v3, "Failed to create legacy barcode detector."

    .line 100
    .line 101
    invoke-direct {v2, v3, v0, v1}, LY5/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw v2
.end method

.method public final b(Lk6/a;)Ljava/util/List;
    .locals 8

    .line 1
    iget-object v0, p0, Lh6/p;->e:LI4/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lh6/p;->a()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lh6/p;->e:LI4/j;

    .line 9
    .line 10
    if-eqz v0, :cond_6

    .line 11
    .line 12
    invoke-static {v0}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LI4/j;

    .line 17
    .line 18
    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;

    .line 19
    .line 20
    invoke-virtual {p1}, Lk6/a;->k()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-virtual {p1}, Lk6/a;->g()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-virtual {p1}, Lk6/a;->j()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    invoke-static {v4}, Ll6/b;->a(I)I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    const/4 v4, 0x0

    .line 37
    const-wide/16 v5, 0x0

    .line 38
    .line 39
    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;-><init>(IIIJI)V

    .line 40
    .line 41
    .line 42
    :try_start_0
    invoke-virtual {p1}, Lk6/a;->f()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    const/4 v3, -0x1

    .line 47
    const/4 v4, 0x0

    .line 48
    if-eq v2, v3, :cond_4

    .line 49
    .line 50
    const/16 v3, 0x11

    .line 51
    .line 52
    if-eq v2, v3, :cond_3

    .line 53
    .line 54
    const/16 v3, 0x23

    .line 55
    .line 56
    if-eq v2, v3, :cond_2

    .line 57
    .line 58
    const v3, 0x32315659

    .line 59
    .line 60
    .line 61
    if-ne v2, v3, :cond_1

    .line 62
    .line 63
    invoke-static {}, Ll6/c;->d()Ll6/c;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v2, p1, v4}, Ll6/c;->c(Lk6/a;Z)Ljava/nio/ByteBuffer;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-static {v2}, LB4/b;->x(Ljava/lang/Object;)LB4/a;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v0, v2, v1}, LI4/j;->x(LB4/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_0

    .line 80
    :catch_0
    move-exception v0

    .line 81
    move-object p1, v0

    .line 82
    goto :goto_2

    .line 83
    :cond_1
    new-instance v0, LY5/a;

    .line 84
    .line 85
    invoke-virtual {p1}, Lk6/a;->f()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    .line 90
    .line 91
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 92
    .line 93
    .line 94
    const-string v2, "Unsupported image format: "

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const/4 v1, 0x3

    .line 107
    invoke-direct {v0, p1, v1}, LY5/a;-><init>(Ljava/lang/String;I)V

    .line 108
    .line 109
    .line 110
    throw v0

    .line 111
    :cond_2
    invoke-virtual {p1}, Lk6/a;->i()[Landroid/media/Image$Plane;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    check-cast v2, [Landroid/media/Image$Plane;

    .line 120
    .line 121
    aget-object v3, v2, v4

    .line 122
    .line 123
    invoke-virtual {v3}, Landroid/media/Image$Plane;->getRowStride()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    iput v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;->g:I

    .line 128
    .line 129
    aget-object v2, v2, v4

    .line 130
    .line 131
    invoke-virtual {v2}, Landroid/media/Image$Plane;->getBuffer()Ljava/nio/ByteBuffer;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2}, LB4/b;->x(Ljava/lang/Object;)LB4/a;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v0, v2, v1}, LI4/j;->x(LB4/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_0

    .line 144
    :cond_3
    invoke-virtual {p1}, Lk6/a;->d()Ljava/nio/ByteBuffer;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-static {v2}, LB4/b;->x(Ljava/lang/Object;)LB4/a;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    invoke-virtual {v0, v2, v1}, LI4/j;->x(LB4/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    goto :goto_0

    .line 157
    :cond_4
    invoke-virtual {p1}, Lk6/a;->c()Landroid/graphics/Bitmap;

    .line 158
    .line 159
    .line 160
    move-result-object v2

    .line 161
    invoke-static {v2}, LB4/b;->x(Ljava/lang/Object;)LB4/a;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {v0, v2, v1}, LI4/j;->y(LB4/a;Lcom/google/android/gms/internal/mlkit_vision_barcode/zzan;)[Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :goto_0
    new-instance v1, Ljava/util/ArrayList;

    .line 170
    .line 171
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 172
    .line 173
    .line 174
    array-length v2, v0

    .line 175
    :goto_1
    if-ge v4, v2, :cond_5

    .line 176
    .line 177
    aget-object v3, v0, v4

    .line 178
    .line 179
    new-instance v5, Lf6/a;

    .line 180
    .line 181
    new-instance v6, Lh6/o;

    .line 182
    .line 183
    invoke-direct {v6, v3}, Lh6/o;-><init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzu;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Lk6/a;->e()Landroid/graphics/Matrix;

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-direct {v5, v6, v3}, Lf6/a;-><init>(Lg6/a;Landroid/graphics/Matrix;)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v1, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 194
    .line 195
    .line 196
    add-int/lit8 v4, v4, 0x1

    .line 197
    .line 198
    goto :goto_1

    .line 199
    :cond_5
    return-object v1

    .line 200
    :goto_2
    new-instance v0, LY5/a;

    .line 201
    .line 202
    const-string v1, "Failed to detect with legacy barcode detector"

    .line 203
    .line 204
    const/16 v2, 0xd

    .line 205
    .line 206
    invoke-direct {v0, v1, v2, p1}, LY5/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    throw v0

    .line 210
    :cond_6
    new-instance p1, LY5/a;

    .line 211
    .line 212
    const-string v0, "Error initializing the legacy barcode scanner."

    .line 213
    .line 214
    const/16 v1, 0xe

    .line 215
    .line 216
    invoke-direct {p1, v0, v1}, LY5/a;-><init>(Ljava/lang/String;I)V

    .line 217
    .line 218
    .line 219
    throw p1
.end method

.method public final zzb()V
    .locals 1

    .line 1
    iget-object v0, p0, Lh6/p;->e:LI4/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {v0}, LI4/j;->b()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :catch_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lh6/p;->e:LI4/j;

    .line 10
    .line 11
    :cond_0
    return-void
.end method
