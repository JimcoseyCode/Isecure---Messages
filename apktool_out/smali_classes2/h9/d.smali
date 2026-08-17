.class public final Lh9/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;
.implements Ljava/io/Flushable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh9/d$d;,
        Lh9/d$b;,
        Lh9/d$c;,
        Lh9/d$a;
    }
.end annotation


# static fields
.field public static final B:Ljava/lang/String;

.field public static final C:Ljava/lang/String;

.field public static final D:Ljava/lang/String;

.field public static final E:Ljava/lang/String;

.field public static final F:Ljava/lang/String;

.field public static final G:J

.field public static final H:LP8/o;

.field public static final I:Ljava/lang/String;

.field public static final J:Ljava/lang/String;

.field public static final K:Ljava/lang/String;

.field public static final L:Ljava/lang/String;

.field public static final M:Lh9/d$a;


# instance fields
.field private final A:I

.field private g:J

.field private final h:Ljava/io/File;

.field private final i:Ljava/io/File;

.field private final j:Ljava/io/File;

.field private k:J

.field private l:Lt9/i;

.field private final m:Ljava/util/LinkedHashMap;

.field private n:I

.field private o:Z

.field private p:Z

.field private q:Z

.field private r:Z

.field private s:Z

.field private t:Z

.field private u:J

.field private final v:Li9/d;

.field private final w:Lh9/d$e;

.field private final x:Ln9/a;

.field private final y:Ljava/io/File;

.field private final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh9/d$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lh9/d$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lh9/d;->M:Lh9/d$a;

    .line 8
    .line 9
    const-string v0, "journal"

    .line 10
    .line 11
    sput-object v0, Lh9/d;->B:Ljava/lang/String;

    .line 12
    .line 13
    const-string v0, "journal.tmp"

    .line 14
    .line 15
    sput-object v0, Lh9/d;->C:Ljava/lang/String;

    .line 16
    .line 17
    const-string v0, "journal.bkp"

    .line 18
    .line 19
    sput-object v0, Lh9/d;->D:Ljava/lang/String;

    .line 20
    .line 21
    const-string v0, "libcore.io.DiskLruCache"

    .line 22
    .line 23
    sput-object v0, Lh9/d;->E:Ljava/lang/String;

    .line 24
    .line 25
    const-string v0, "1"

    .line 26
    .line 27
    sput-object v0, Lh9/d;->F:Ljava/lang/String;

    .line 28
    .line 29
    const-wide/16 v0, -0x1

    .line 30
    .line 31
    sput-wide v0, Lh9/d;->G:J

    .line 32
    .line 33
    new-instance v0, LP8/o;

    .line 34
    .line 35
    const-string v1, "[a-z0-9_-]{1,120}"

    .line 36
    .line 37
    invoke-direct {v0, v1}, LP8/o;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sput-object v0, Lh9/d;->H:LP8/o;

    .line 41
    .line 42
    const-string v0, "CLEAN"

    .line 43
    .line 44
    sput-object v0, Lh9/d;->I:Ljava/lang/String;

    .line 45
    .line 46
    const-string v0, "DIRTY"

    .line 47
    .line 48
    sput-object v0, Lh9/d;->J:Ljava/lang/String;

    .line 49
    .line 50
    const-string v0, "REMOVE"

    .line 51
    .line 52
    sput-object v0, Lh9/d;->K:Ljava/lang/String;

    .line 53
    .line 54
    const-string v0, "READ"

    .line 55
    .line 56
    sput-object v0, Lh9/d;->L:Ljava/lang/String;

    .line 57
    .line 58
    return-void
.end method

.method public constructor <init>(Ln9/a;Ljava/io/File;IIJLi9/e;)V
    .locals 4

    .line 1
    const-string v0, "fileSystem"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "directory"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "taskRunner"

    .line 12
    .line 13
    invoke-static {p7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lh9/d;->x:Ln9/a;

    .line 20
    .line 21
    iput-object p2, p0, Lh9/d;->y:Ljava/io/File;

    .line 22
    .line 23
    iput p3, p0, Lh9/d;->z:I

    .line 24
    .line 25
    iput p4, p0, Lh9/d;->A:I

    .line 26
    .line 27
    iput-wide p5, p0, Lh9/d;->g:J

    .line 28
    .line 29
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 30
    .line 31
    const/4 p3, 0x0

    .line 32
    const/high16 v0, 0x3f400000    # 0.75f

    .line 33
    .line 34
    const/4 v1, 0x1

    .line 35
    invoke-direct {p1, p3, v0, v1}, Ljava/util/LinkedHashMap;-><init>(IFZ)V

    .line 36
    .line 37
    .line 38
    iput-object p1, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 39
    .line 40
    invoke-virtual {p7}, Li9/e;->i()Li9/d;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, Lh9/d;->v:Li9/d;

    .line 45
    .line 46
    new-instance p1, Lh9/d$e;

    .line 47
    .line 48
    new-instance p7, Ljava/lang/StringBuilder;

    .line 49
    .line 50
    invoke-direct {p7}, Ljava/lang/StringBuilder;-><init>()V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lf9/c;->i:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, " Cache"

    .line 59
    .line 60
    invoke-virtual {p7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p7

    .line 67
    invoke-direct {p1, p0, p7}, Lh9/d$e;-><init>(Lh9/d;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lh9/d;->w:Lh9/d$e;

    .line 71
    .line 72
    const-wide/16 v2, 0x0

    .line 73
    .line 74
    cmp-long p1, p5, v2

    .line 75
    .line 76
    if-lez p1, :cond_0

    .line 77
    .line 78
    move p1, v1

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    move p1, p3

    .line 81
    :goto_0
    if-eqz p1, :cond_3

    .line 82
    .line 83
    if-lez p4, :cond_1

    .line 84
    .line 85
    move p3, v1

    .line 86
    :cond_1
    if-eqz p3, :cond_2

    .line 87
    .line 88
    new-instance p1, Ljava/io/File;

    .line 89
    .line 90
    sget-object p3, Lh9/d;->B:Ljava/lang/String;

    .line 91
    .line 92
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    iput-object p1, p0, Lh9/d;->h:Ljava/io/File;

    .line 96
    .line 97
    new-instance p1, Ljava/io/File;

    .line 98
    .line 99
    sget-object p3, Lh9/d;->C:Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iput-object p1, p0, Lh9/d;->i:Ljava/io/File;

    .line 105
    .line 106
    new-instance p1, Ljava/io/File;

    .line 107
    .line 108
    sget-object p3, Lh9/d;->D:Ljava/lang/String;

    .line 109
    .line 110
    invoke-direct {p1, p2, p3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iput-object p1, p0, Lh9/d;->j:Ljava/io/File;

    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    const-string p2, "valueCount <= 0"

    .line 119
    .line 120
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    throw p1

    .line 124
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    const-string p2, "maxSize <= 0"

    .line 127
    .line 128
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p1
.end method

.method public static final synthetic A(Lh9/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh9/d;->s:Z

    .line 2
    .line 3
    return-void
.end method

.method private final A0()V
    .locals 9

    .line 1
    const-string v0, ", "

    .line 2
    .line 3
    iget-object v1, p0, Lh9/d;->x:Ln9/a;

    .line 4
    .line 5
    iget-object v2, p0, Lh9/d;->h:Ljava/io/File;

    .line 6
    .line 7
    invoke-interface {v1, v2}, Ln9/a;->a(Ljava/io/File;)Lt9/F;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lt9/s;->d(Lt9/F;)Lt9/j;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_0
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    sget-object v7, Lh9/d;->E:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v7, v2}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_1

    .line 42
    .line 43
    sget-object v7, Lh9/d;->F:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v7, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    if-eqz v7, :cond_1

    .line 50
    .line 51
    iget v7, p0, Lh9/d;->z:I

    .line 52
    .line 53
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    invoke-static {v7, v4}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_1

    .line 62
    .line 63
    iget v4, p0, Lh9/d;->A:I

    .line 64
    .line 65
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-static {v4, v5}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_1

    .line 74
    .line 75
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 76
    .line 77
    .line 78
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    if-gtz v4, :cond_1

    .line 80
    .line 81
    const/4 v0, 0x0

    .line 82
    :goto_0
    :try_start_1
    invoke-interface {v1}, Lt9/j;->j0()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-direct {p0, v2}, Lh9/d;->D0(Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/EOFException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    .line 89
    add-int/lit8 v0, v0, 0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :catchall_0
    move-exception v0

    .line 93
    goto :goto_2

    .line 94
    :catch_0
    :try_start_2
    iget-object v2, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 95
    .line 96
    invoke-virtual {v2}, Ljava/util/AbstractMap;->size()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    sub-int/2addr v0, v2

    .line 101
    iput v0, p0, Lh9/d;->n:I

    .line 102
    .line 103
    invoke-interface {v1}, Lt9/j;->D()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    if-nez v0, :cond_0

    .line 108
    .line 109
    invoke-virtual {p0}, Lh9/d;->J0()V

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_0
    invoke-direct {p0}, Lh9/d;->w0()Lt9/i;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 118
    .line 119
    :goto_1
    sget-object v0, Li7/B;->a:Li7/B;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    const/4 v0, 0x0

    .line 122
    invoke-static {v1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_1
    :try_start_3
    new-instance v4, Ljava/io/IOException;

    .line 127
    .line 128
    new-instance v7, Ljava/lang/StringBuilder;

    .line 129
    .line 130
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 131
    .line 132
    .line 133
    const-string v8, "unexpected journal header: ["

    .line 134
    .line 135
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    const/16 v0, 0x5d

    .line 160
    .line 161
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    invoke-direct {v4, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 172
    :goto_2
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 173
    :catchall_1
    move-exception v2

    .line 174
    invoke-static {v1, v0}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 175
    .line 176
    .line 177
    throw v2
.end method

.method public static final synthetic B(Lh9/d;I)V
    .locals 0

    .line 1
    iput p1, p0, Lh9/d;->n:I

    .line 2
    .line 3
    return-void
.end method

.method private final D0(Ljava/lang/String;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v5, 0x6

    .line 4
    const/4 v6, 0x0

    .line 5
    const/16 v2, 0x20

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    invoke-static/range {v1 .. v6}, LP8/q;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 12
    .line 13
    .line 14
    move-result v7

    .line 15
    const-string v8, "unexpected journal line: "

    .line 16
    .line 17
    const/4 v9, -0x1

    .line 18
    if-eq v7, v9, :cond_9

    .line 19
    .line 20
    add-int/lit8 v3, v7, 0x1

    .line 21
    .line 22
    const/4 v5, 0x4

    .line 23
    const/4 v6, 0x0

    .line 24
    const/16 v2, 0x20

    .line 25
    .line 26
    const/4 v4, 0x0

    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    invoke-static/range {v1 .. v6}, LP8/q;->c0(Ljava/lang/CharSequence;CIZILjava/lang/Object;)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const-string v4, "(this as java.lang.String).substring(startIndex)"

    .line 34
    .line 35
    const-string v5, "null cannot be cast to non-null type java.lang.String"

    .line 36
    .line 37
    const/4 v6, 0x2

    .line 38
    const/4 v10, 0x0

    .line 39
    const/4 v11, 0x0

    .line 40
    if-ne v2, v9, :cond_1

    .line 41
    .line 42
    if-eqz v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    sget-object v12, Lh9/d;->K:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    if-ne v7, v13, :cond_2

    .line 58
    .line 59
    invoke-static {v1, v12, v10, v6, v11}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v12

    .line 63
    if-eqz v12, :cond_2

    .line 64
    .line 65
    iget-object v1, v0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 66
    .line 67
    invoke-virtual {v1, v3}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :cond_0
    new-instance v1, Ljava/lang/NullPointerException;

    .line 72
    .line 73
    invoke-direct {v1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    throw v1

    .line 77
    :cond_1
    if-eqz v1, :cond_8

    .line 78
    .line 79
    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v12, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    .line 84
    .line 85
    invoke-static {v3, v12}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_2
    iget-object v12, v0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    invoke-virtual {v12, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    check-cast v12, Lh9/d$c;

    .line 95
    .line 96
    if-nez v12, :cond_3

    .line 97
    .line 98
    new-instance v12, Lh9/d$c;

    .line 99
    .line 100
    invoke-direct {v12, v0, v3}, Lh9/d$c;-><init>(Lh9/d;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v13, v0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 104
    .line 105
    invoke-interface {v13, v3, v12}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    :cond_3
    if-eq v2, v9, :cond_5

    .line 109
    .line 110
    sget-object v3, Lh9/d;->I:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 113
    .line 114
    .line 115
    move-result v13

    .line 116
    if-ne v7, v13, :cond_5

    .line 117
    .line 118
    invoke-static {v1, v3, v10, v6, v11}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    const/4 v3, 0x1

    .line 125
    add-int/2addr v2, v3

    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    invoke-virtual {v1, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-static {v13, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    new-array v14, v3, [C

    .line 136
    .line 137
    const/16 v1, 0x20

    .line 138
    .line 139
    aput-char v1, v14, v10

    .line 140
    .line 141
    const/16 v17, 0x6

    .line 142
    .line 143
    const/16 v18, 0x0

    .line 144
    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    invoke-static/range {v13 .. v18}, LP8/q;->F0(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    invoke-virtual {v12, v3}, Lh9/d$c;->o(Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v12, v11}, Lh9/d$c;->l(Lh9/d$b;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v12, v1}, Lh9/d$c;->m(Ljava/util/List;)V

    .line 159
    .line 160
    .line 161
    return-void

    .line 162
    :cond_4
    new-instance v1, Ljava/lang/NullPointerException;

    .line 163
    .line 164
    invoke-direct {v1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    throw v1

    .line 168
    :cond_5
    if-ne v2, v9, :cond_6

    .line 169
    .line 170
    sget-object v3, Lh9/d;->J:Ljava/lang/String;

    .line 171
    .line 172
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 173
    .line 174
    .line 175
    move-result v4

    .line 176
    if-ne v7, v4, :cond_6

    .line 177
    .line 178
    invoke-static {v1, v3, v10, v6, v11}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 179
    .line 180
    .line 181
    move-result v3

    .line 182
    if-eqz v3, :cond_6

    .line 183
    .line 184
    new-instance v1, Lh9/d$b;

    .line 185
    .line 186
    invoke-direct {v1, v0, v12}, Lh9/d$b;-><init>(Lh9/d;Lh9/d$c;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v12, v1}, Lh9/d$c;->l(Lh9/d$b;)V

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_6
    if-ne v2, v9, :cond_7

    .line 194
    .line 195
    sget-object v2, Lh9/d;->L:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 198
    .line 199
    .line 200
    move-result v3

    .line 201
    if-ne v7, v3, :cond_7

    .line 202
    .line 203
    invoke-static {v1, v2, v10, v6, v11}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    if-eqz v2, :cond_7

    .line 208
    .line 209
    return-void

    .line 210
    :cond_7
    new-instance v2, Ljava/io/IOException;

    .line 211
    .line 212
    new-instance v3, Ljava/lang/StringBuilder;

    .line 213
    .line 214
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    throw v2

    .line 231
    :cond_8
    new-instance v1, Ljava/lang/NullPointerException;

    .line 232
    .line 233
    invoke-direct {v1, v5}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v1

    .line 237
    :cond_9
    move-object/from16 v1, p1

    .line 238
    .line 239
    new-instance v2, Ljava/io/IOException;

    .line 240
    .line 241
    new-instance v3, Ljava/lang/StringBuilder;

    .line 242
    .line 243
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v1

    .line 256
    invoke-direct {v2, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw v2
.end method

.method private final declared-synchronized I()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh9/d;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    const-string v0, "cache is closed"

    .line 9
    .line 10
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw v1

    .line 16
    :catchall_0
    move-exception v0

    .line 17
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    throw v0
.end method

.method private final M0()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lh9/d$c;

    .line 22
    .line 23
    invoke-virtual {v1}, Lh9/d$c;->i()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    const-string v0, "toEvict"

    .line 30
    .line 31
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v1}, Lh9/d;->L0(Lh9/d$c;)Z

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x1

    .line 38
    return v0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    return v0
.end method

.method private final O0(Ljava/lang/String;)V
    .locals 2

    .line 1
    sget-object v0, Lh9/d;->H:LP8/o;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP8/o;->d(Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const-string v1, "keys must match regex [a-z0-9_-]{1,120}: \""

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const/16 p1, 0x22

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public static synthetic X(Lh9/d;Ljava/lang/String;JILjava/lang/Object;)Lh9/d$b;
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    sget-wide p2, Lh9/d;->G:J

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lh9/d;->W(Ljava/lang/String;J)Lh9/d$b;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public static final synthetic d(Lh9/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lh9/d;->p:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(Lh9/d;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lh9/d;->q:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic k(Lh9/d;)Z
    .locals 0

    .line 1
    invoke-direct {p0}, Lh9/d;->u0()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic m(Lh9/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh9/d;->o:Z

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic r(Lh9/d;Lt9/i;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lh9/d;->l:Lt9/i;

    .line 2
    .line 3
    return-void
.end method

.method public static final synthetic s(Lh9/d;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lh9/d;->t:Z

    .line 2
    .line 3
    return-void
.end method

.method private final u0()Z
    .locals 2

    .line 1
    iget v0, p0, Lh9/d;->n:I

    .line 2
    .line 3
    const/16 v1, 0x7d0

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    iget-object v1, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/util/AbstractMap;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method private final w0()Lt9/i;
    .locals 3

    .line 1
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 2
    .line 3
    iget-object v1, p0, Lh9/d;->h:Ljava/io/File;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ln9/a;->g(Ljava/io/File;)Lt9/D;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lh9/e;

    .line 10
    .line 11
    new-instance v2, Lh9/d$f;

    .line 12
    .line 13
    invoke-direct {v2, p0}, Lh9/d$f;-><init>(Lh9/d;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0, v2}, Lh9/e;-><init>(Lt9/D;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lt9/s;->c(Lt9/D;)Lt9/i;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0
.end method

.method private final y0()V
    .locals 9

    .line 1
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 2
    .line 3
    iget-object v1, p0, Lh9/d;->i:Ljava/io/File;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Ln9/a;->f(Ljava/io/File;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "i.next()"

    .line 29
    .line 30
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    check-cast v1, Lh9/d$c;

    .line 34
    .line 35
    invoke-virtual {v1}, Lh9/d$c;->b()Lh9/d$b;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const/4 v3, 0x0

    .line 40
    if-nez v2, :cond_1

    .line 41
    .line 42
    iget v2, p0, Lh9/d;->A:I

    .line 43
    .line 44
    :goto_1
    if-ge v3, v2, :cond_0

    .line 45
    .line 46
    iget-wide v4, p0, Lh9/d;->k:J

    .line 47
    .line 48
    invoke-virtual {v1}, Lh9/d$c;->e()[J

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    aget-wide v7, v6, v3

    .line 53
    .line 54
    add-long/2addr v4, v7

    .line 55
    iput-wide v4, p0, Lh9/d;->k:J

    .line 56
    .line 57
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v2, 0x0

    .line 61
    invoke-virtual {v1, v2}, Lh9/d$c;->l(Lh9/d$b;)V

    .line 62
    .line 63
    .line 64
    iget v2, p0, Lh9/d;->A:I

    .line 65
    .line 66
    :goto_2
    if-ge v3, v2, :cond_2

    .line 67
    .line 68
    iget-object v4, p0, Lh9/d;->x:Ln9/a;

    .line 69
    .line 70
    invoke-virtual {v1}, Lh9/d$c;->a()Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/io/File;

    .line 79
    .line 80
    invoke-interface {v4, v5}, Ln9/a;->f(Ljava/io/File;)V

    .line 81
    .line 82
    .line 83
    iget-object v4, p0, Lh9/d;->x:Ln9/a;

    .line 84
    .line 85
    invoke-virtual {v1}, Lh9/d$c;->c()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/io/File;

    .line 94
    .line 95
    invoke-interface {v4, v5}, Ln9/a;->f(Ljava/io/File;)V

    .line 96
    .line 97
    .line 98
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_3
    return-void
.end method


# virtual methods
.method public final declared-synchronized J(Lh9/d$b;Z)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "editor"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lh9/d$b;->d()Lh9/d$c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Lh9/d$c;->b()Lh9/d$b;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-eqz v1, :cond_c

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v0}, Lh9/d$c;->g()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    iget v2, p0, Lh9/d;->A:I

    .line 31
    .line 32
    move v3, v1

    .line 33
    :goto_0
    if-ge v3, v2, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lh9/d$b;->e()[Z

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-static {v4}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    aget-boolean v4, v4, v3

    .line 43
    .line 44
    if-eqz v4, :cond_1

    .line 45
    .line 46
    iget-object v4, p0, Lh9/d;->x:Ln9/a;

    .line 47
    .line 48
    invoke-virtual {v0}, Lh9/d$c;->c()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v5

    .line 52
    invoke-interface {v5, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/io/File;

    .line 57
    .line 58
    invoke-interface {v4, v5}, Ln9/a;->d(Ljava/io/File;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_0

    .line 63
    .line 64
    invoke-virtual {p1}, Lh9/d$b;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-void

    .line 69
    :catchall_0
    move-exception v0

    .line 70
    move-object p1, v0

    .line 71
    goto/16 :goto_5

    .line 72
    .line 73
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    :try_start_1
    invoke-virtual {p1}, Lh9/d$b;->a()V

    .line 77
    .line 78
    .line 79
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 80
    .line 81
    new-instance p2, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v0, "Newly created entry didn\'t create value for index "

    .line 87
    .line 88
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p2

    .line 98
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p1

    .line 102
    :cond_2
    iget p1, p0, Lh9/d;->A:I

    .line 103
    .line 104
    :goto_1
    if-ge v1, p1, :cond_5

    .line 105
    .line 106
    invoke-virtual {v0}, Lh9/d$c;->c()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Ljava/io/File;

    .line 115
    .line 116
    if-eqz p2, :cond_3

    .line 117
    .line 118
    invoke-virtual {v0}, Lh9/d$c;->i()Z

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    if-nez v3, :cond_3

    .line 123
    .line 124
    iget-object v3, p0, Lh9/d;->x:Ln9/a;

    .line 125
    .line 126
    invoke-interface {v3, v2}, Ln9/a;->d(Ljava/io/File;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v0}, Lh9/d$c;->a()Ljava/util/List;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    check-cast v3, Ljava/io/File;

    .line 141
    .line 142
    iget-object v4, p0, Lh9/d;->x:Ln9/a;

    .line 143
    .line 144
    invoke-interface {v4, v2, v3}, Ln9/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Lh9/d$c;->e()[J

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    aget-wide v4, v2, v1

    .line 152
    .line 153
    iget-object v2, p0, Lh9/d;->x:Ln9/a;

    .line 154
    .line 155
    invoke-interface {v2, v3}, Ln9/a;->h(Ljava/io/File;)J

    .line 156
    .line 157
    .line 158
    move-result-wide v2

    .line 159
    invoke-virtual {v0}, Lh9/d$c;->e()[J

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    aput-wide v2, v6, v1

    .line 164
    .line 165
    iget-wide v6, p0, Lh9/d;->k:J

    .line 166
    .line 167
    sub-long/2addr v6, v4

    .line 168
    add-long/2addr v6, v2

    .line 169
    iput-wide v6, p0, Lh9/d;->k:J

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_3
    iget-object v3, p0, Lh9/d;->x:Ln9/a;

    .line 173
    .line 174
    invoke-interface {v3, v2}, Ln9/a;->f(Ljava/io/File;)V

    .line 175
    .line 176
    .line 177
    :cond_4
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_5
    const/4 p1, 0x0

    .line 181
    invoke-virtual {v0, p1}, Lh9/d$c;->l(Lh9/d$b;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Lh9/d$c;->i()Z

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    if-eqz p1, :cond_6

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Lh9/d;->L0(Lh9/d$c;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 191
    .line 192
    .line 193
    monitor-exit p0

    .line 194
    return-void

    .line 195
    :cond_6
    :try_start_2
    iget p1, p0, Lh9/d;->n:I

    .line 196
    .line 197
    const/4 v1, 0x1

    .line 198
    add-int/2addr p1, v1

    .line 199
    iput p1, p0, Lh9/d;->n:I

    .line 200
    .line 201
    iget-object p1, p0, Lh9/d;->l:Lt9/i;

    .line 202
    .line 203
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Lh9/d$c;->g()Z

    .line 207
    .line 208
    .line 209
    move-result v2

    .line 210
    const/16 v3, 0xa

    .line 211
    .line 212
    const/16 v4, 0x20

    .line 213
    .line 214
    if-nez v2, :cond_8

    .line 215
    .line 216
    if-eqz p2, :cond_7

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_7
    iget-object p2, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 220
    .line 221
    invoke-virtual {v0}, Lh9/d$c;->d()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p2, v1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    sget-object p2, Lh9/d;->K:Ljava/lang/String;

    .line 229
    .line 230
    invoke-interface {p1, p2}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 231
    .line 232
    .line 233
    move-result-object p2

    .line 234
    invoke-interface {p2, v4}, Lt9/i;->writeByte(I)Lt9/i;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0}, Lh9/d$c;->d()Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object p2

    .line 241
    invoke-interface {p1, p2}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 242
    .line 243
    .line 244
    invoke-interface {p1, v3}, Lt9/i;->writeByte(I)Lt9/i;

    .line 245
    .line 246
    .line 247
    goto :goto_4

    .line 248
    :cond_8
    :goto_3
    invoke-virtual {v0, v1}, Lh9/d$c;->o(Z)V

    .line 249
    .line 250
    .line 251
    sget-object v1, Lh9/d;->I:Ljava/lang/String;

    .line 252
    .line 253
    invoke-interface {p1, v1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 254
    .line 255
    .line 256
    move-result-object v1

    .line 257
    invoke-interface {v1, v4}, Lt9/i;->writeByte(I)Lt9/i;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lh9/d$c;->d()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v1

    .line 264
    invoke-interface {p1, v1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, p1}, Lh9/d$c;->s(Lt9/i;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p1, v3}, Lt9/i;->writeByte(I)Lt9/i;

    .line 271
    .line 272
    .line 273
    if-eqz p2, :cond_9

    .line 274
    .line 275
    iget-wide v1, p0, Lh9/d;->u:J

    .line 276
    .line 277
    const-wide/16 v3, 0x1

    .line 278
    .line 279
    add-long/2addr v3, v1

    .line 280
    iput-wide v3, p0, Lh9/d;->u:J

    .line 281
    .line 282
    invoke-virtual {v0, v1, v2}, Lh9/d$c;->p(J)V

    .line 283
    .line 284
    .line 285
    :cond_9
    :goto_4
    invoke-interface {p1}, Lt9/i;->flush()V

    .line 286
    .line 287
    .line 288
    iget-wide p1, p0, Lh9/d;->k:J

    .line 289
    .line 290
    iget-wide v0, p0, Lh9/d;->g:J

    .line 291
    .line 292
    cmp-long p1, p1, v0

    .line 293
    .line 294
    if-gtz p1, :cond_a

    .line 295
    .line 296
    invoke-direct {p0}, Lh9/d;->u0()Z

    .line 297
    .line 298
    .line 299
    move-result p1

    .line 300
    if-eqz p1, :cond_b

    .line 301
    .line 302
    :cond_a
    iget-object v0, p0, Lh9/d;->v:Li9/d;

    .line 303
    .line 304
    iget-object v1, p0, Lh9/d;->w:Lh9/d$e;

    .line 305
    .line 306
    const/4 v4, 0x2

    .line 307
    const/4 v5, 0x0

    .line 308
    const-wide/16 v2, 0x0

    .line 309
    .line 310
    invoke-static/range {v0 .. v5}, Li9/d;->j(Li9/d;Li9/a;JILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 311
    .line 312
    .line 313
    :cond_b
    monitor-exit p0

    .line 314
    return-void

    .line 315
    :cond_c
    :try_start_3
    const-string p1, "Check failed."

    .line 316
    .line 317
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 318
    .line 319
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 320
    .line 321
    .line 322
    throw p2

    .line 323
    :goto_5
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 324
    throw p1
.end method

.method public final declared-synchronized J0()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {v0}, Lt9/D;->close()V

    .line 7
    .line 8
    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    goto/16 :goto_3

    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 14
    .line 15
    iget-object v1, p0, Lh9/d;->i:Ljava/io/File;

    .line 16
    .line 17
    invoke-interface {v0, v1}, Ln9/a;->b(Ljava/io/File;)Lt9/D;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, Lt9/s;->c(Lt9/D;)Lt9/i;

    .line 22
    .line 23
    .line 24
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    :try_start_1
    sget-object v1, Lh9/d;->E:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0, v1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    invoke-interface {v1, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 34
    .line 35
    .line 36
    sget-object v1, Lh9/d;->F:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {v0, v1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v1, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 43
    .line 44
    .line 45
    iget v1, p0, Lh9/d;->z:I

    .line 46
    .line 47
    int-to-long v3, v1

    .line 48
    invoke-interface {v0, v3, v4}, Lt9/i;->C0(J)Lt9/i;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-interface {v1, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 53
    .line 54
    .line 55
    iget v1, p0, Lh9/d;->A:I

    .line 56
    .line 57
    int-to-long v3, v1

    .line 58
    invoke-interface {v0, v3, v4}, Lt9/i;->C0(J)Lt9/i;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-interface {v1, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 63
    .line 64
    .line 65
    invoke-interface {v0, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 66
    .line 67
    .line 68
    iget-object v1, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-eqz v3, :cond_2

    .line 83
    .line 84
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    check-cast v3, Lh9/d$c;

    .line 89
    .line 90
    invoke-virtual {v3}, Lh9/d$c;->b()Lh9/d$b;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const/16 v5, 0x20

    .line 95
    .line 96
    if-eqz v4, :cond_1

    .line 97
    .line 98
    sget-object v4, Lh9/d;->J:Ljava/lang/String;

    .line 99
    .line 100
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    invoke-interface {v4, v5}, Lt9/i;->writeByte(I)Lt9/i;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v3}, Lh9/d$c;->d()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v0, v3}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 115
    .line 116
    .line 117
    goto :goto_1

    .line 118
    :catchall_1
    move-exception v1

    .line 119
    goto :goto_2

    .line 120
    :cond_1
    sget-object v4, Lh9/d;->I:Ljava/lang/String;

    .line 121
    .line 122
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-interface {v4, v5}, Lt9/i;->writeByte(I)Lt9/i;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Lh9/d$c;->d()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3, v0}, Lh9/d$c;->s(Lt9/i;)V

    .line 137
    .line 138
    .line 139
    invoke-interface {v0, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 140
    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_2
    sget-object v1, Li7/B;->a:Li7/B;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 144
    .line 145
    const/4 v1, 0x0

    .line 146
    :try_start_2
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 147
    .line 148
    .line 149
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 150
    .line 151
    iget-object v1, p0, Lh9/d;->h:Ljava/io/File;

    .line 152
    .line 153
    invoke-interface {v0, v1}, Ln9/a;->d(Ljava/io/File;)Z

    .line 154
    .line 155
    .line 156
    move-result v0

    .line 157
    if-eqz v0, :cond_3

    .line 158
    .line 159
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 160
    .line 161
    iget-object v1, p0, Lh9/d;->h:Ljava/io/File;

    .line 162
    .line 163
    iget-object v2, p0, Lh9/d;->j:Ljava/io/File;

    .line 164
    .line 165
    invoke-interface {v0, v1, v2}, Ln9/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 166
    .line 167
    .line 168
    :cond_3
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 169
    .line 170
    iget-object v1, p0, Lh9/d;->i:Ljava/io/File;

    .line 171
    .line 172
    iget-object v2, p0, Lh9/d;->h:Ljava/io/File;

    .line 173
    .line 174
    invoke-interface {v0, v1, v2}, Ln9/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 175
    .line 176
    .line 177
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 178
    .line 179
    iget-object v1, p0, Lh9/d;->j:Ljava/io/File;

    .line 180
    .line 181
    invoke-interface {v0, v1}, Ln9/a;->f(Ljava/io/File;)V

    .line 182
    .line 183
    .line 184
    invoke-direct {p0}, Lh9/d;->w0()Lt9/i;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    iput-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 189
    .line 190
    const/4 v0, 0x0

    .line 191
    iput-boolean v0, p0, Lh9/d;->o:Z

    .line 192
    .line 193
    iput-boolean v0, p0, Lh9/d;->t:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 194
    .line 195
    monitor-exit p0

    .line 196
    return-void

    .line 197
    :goto_2
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 198
    :catchall_2
    move-exception v2

    .line 199
    :try_start_4
    invoke-static {v0, v1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 200
    .line 201
    .line 202
    throw v2

    .line 203
    :goto_3
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 204
    throw v0
.end method

.method public final declared-synchronized K0(Ljava/lang/String;)Z
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lh9/d;->t0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lh9/d;->I()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lh9/d;->O0(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Lh9/d$c;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    const-string v1, "lruEntries[key] ?: return false"

    .line 28
    .line 29
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p1}, Lh9/d;->L0(Lh9/d$c;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_0

    .line 37
    .line 38
    iget-wide v1, p0, Lh9/d;->k:J

    .line 39
    .line 40
    iget-wide v3, p0, Lh9/d;->g:J

    .line 41
    .line 42
    cmp-long v1, v1, v3

    .line 43
    .line 44
    if-gtz v1, :cond_0

    .line 45
    .line 46
    iput-boolean v0, p0, Lh9/d;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    :goto_0
    monitor-exit p0

    .line 52
    return p1

    .line 53
    :cond_1
    monitor-exit p0

    .line 54
    return v0

    .line 55
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw p1
.end method

.method public final L0(Lh9/d$c;)Z
    .locals 10

    .line 1
    const-string v0, "entry"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lh9/d;->p:Z

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    const/16 v2, 0x20

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    if-nez v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Lh9/d$c;->f()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-lez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    sget-object v4, Lh9/d;->J:Ljava/lang/String;

    .line 26
    .line 27
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lh9/d$c;->d()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, v1}, Lt9/i;->writeByte(I)Lt9/i;

    .line 41
    .line 42
    .line 43
    invoke-interface {v0}, Lt9/i;->flush()V

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {p1}, Lh9/d$c;->f()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-gtz v0, :cond_1

    .line 51
    .line 52
    invoke-virtual {p1}, Lh9/d$c;->b()Lh9/d$b;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    :cond_1
    invoke-virtual {p1, v3}, Lh9/d$c;->q(Z)V

    .line 59
    .line 60
    .line 61
    return v3

    .line 62
    :cond_2
    invoke-virtual {p1}, Lh9/d$c;->b()Lh9/d$b;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Lh9/d$b;->c()V

    .line 69
    .line 70
    .line 71
    :cond_3
    iget v0, p0, Lh9/d;->A:I

    .line 72
    .line 73
    const/4 v4, 0x0

    .line 74
    :goto_0
    if-ge v4, v0, :cond_4

    .line 75
    .line 76
    iget-object v5, p0, Lh9/d;->x:Ln9/a;

    .line 77
    .line 78
    invoke-virtual {p1}, Lh9/d$c;->a()Ljava/util/List;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v6

    .line 86
    check-cast v6, Ljava/io/File;

    .line 87
    .line 88
    invoke-interface {v5, v6}, Ln9/a;->f(Ljava/io/File;)V

    .line 89
    .line 90
    .line 91
    iget-wide v5, p0, Lh9/d;->k:J

    .line 92
    .line 93
    invoke-virtual {p1}, Lh9/d$c;->e()[J

    .line 94
    .line 95
    .line 96
    move-result-object v7

    .line 97
    aget-wide v8, v7, v4

    .line 98
    .line 99
    sub-long/2addr v5, v8

    .line 100
    iput-wide v5, p0, Lh9/d;->k:J

    .line 101
    .line 102
    invoke-virtual {p1}, Lh9/d$c;->e()[J

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const-wide/16 v6, 0x0

    .line 107
    .line 108
    aput-wide v6, v5, v4

    .line 109
    .line 110
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    iget v0, p0, Lh9/d;->n:I

    .line 114
    .line 115
    add-int/2addr v0, v3

    .line 116
    iput v0, p0, Lh9/d;->n:I

    .line 117
    .line 118
    iget-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 119
    .line 120
    if-eqz v0, :cond_5

    .line 121
    .line 122
    sget-object v4, Lh9/d;->K:Ljava/lang/String;

    .line 123
    .line 124
    invoke-interface {v0, v4}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 125
    .line 126
    .line 127
    invoke-interface {v0, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lh9/d$c;->d()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-interface {v0, v2}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 135
    .line 136
    .line 137
    invoke-interface {v0, v1}, Lt9/i;->writeByte(I)Lt9/i;

    .line 138
    .line 139
    .line 140
    :cond_5
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 141
    .line 142
    invoke-virtual {p1}, Lh9/d$c;->d()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    invoke-virtual {v0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-direct {p0}, Lh9/d;->u0()Z

    .line 150
    .line 151
    .line 152
    move-result p1

    .line 153
    if-eqz p1, :cond_6

    .line 154
    .line 155
    iget-object v4, p0, Lh9/d;->v:Li9/d;

    .line 156
    .line 157
    iget-object v5, p0, Lh9/d;->w:Lh9/d$e;

    .line 158
    .line 159
    const/4 v8, 0x2

    .line 160
    const/4 v9, 0x0

    .line 161
    const-wide/16 v6, 0x0

    .line 162
    .line 163
    invoke-static/range {v4 .. v9}, Li9/d;->j(Li9/d;Li9/a;JILjava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    return v3
.end method

.method public final M()V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lh9/d;->close()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 5
    .line 6
    iget-object v1, p0, Lh9/d;->y:Ljava/io/File;

    .line 7
    .line 8
    invoke-interface {v0, v1}, Ln9/a;->c(Ljava/io/File;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final N0()V
    .locals 4

    .line 1
    :cond_0
    iget-wide v0, p0, Lh9/d;->k:J

    .line 2
    .line 3
    iget-wide v2, p0, Lh9/d;->g:J

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-lez v0, :cond_1

    .line 8
    .line 9
    invoke-direct {p0}, Lh9/d;->M0()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_1
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lh9/d;->s:Z

    .line 18
    .line 19
    return-void
.end method

.method public final declared-synchronized W(Ljava/lang/String;J)Lh9/d$b;
    .locals 9

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lh9/d;->t0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lh9/d;->I()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lh9/d;->O0(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lh9/d$c;

    .line 23
    .line 24
    sget-wide v1, Lh9/d;->G:J

    .line 25
    .line 26
    cmp-long v1, p2, v1

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {v0}, Lh9/d$c;->h()J

    .line 34
    .line 35
    .line 36
    move-result-wide v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    cmp-long p2, v3, p2

    .line 38
    .line 39
    if-eqz p2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    move-object p1, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_0
    :goto_0
    monitor-exit p0

    .line 46
    return-object v2

    .line 47
    :cond_1
    if-eqz v0, :cond_2

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0}, Lh9/d$c;->b()Lh9/d$b;

    .line 50
    .line 51
    .line 52
    move-result-object p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    move-object p2, v2

    .line 55
    :goto_1
    if-eqz p2, :cond_3

    .line 56
    .line 57
    monitor-exit p0

    .line 58
    return-object v2

    .line 59
    :cond_3
    if-eqz v0, :cond_4

    .line 60
    .line 61
    :try_start_2
    invoke-virtual {v0}, Lh9/d$c;->f()I

    .line 62
    .line 63
    .line 64
    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 65
    if-eqz p2, :cond_4

    .line 66
    .line 67
    monitor-exit p0

    .line 68
    return-object v2

    .line 69
    :cond_4
    :try_start_3
    iget-boolean p2, p0, Lh9/d;->s:Z

    .line 70
    .line 71
    if-nez p2, :cond_8

    .line 72
    .line 73
    iget-boolean p2, p0, Lh9/d;->t:Z

    .line 74
    .line 75
    if-eqz p2, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    iget-object p2, p0, Lh9/d;->l:Lt9/i;

    .line 79
    .line 80
    invoke-static {p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    sget-object p3, Lh9/d;->J:Ljava/lang/String;

    .line 84
    .line 85
    invoke-interface {p2, p3}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    const/16 v1, 0x20

    .line 90
    .line 91
    invoke-interface {p3, v1}, Lt9/i;->writeByte(I)Lt9/i;

    .line 92
    .line 93
    .line 94
    move-result-object p3

    .line 95
    invoke-interface {p3, p1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 96
    .line 97
    .line 98
    move-result-object p3

    .line 99
    const/16 v1, 0xa

    .line 100
    .line 101
    invoke-interface {p3, v1}, Lt9/i;->writeByte(I)Lt9/i;

    .line 102
    .line 103
    .line 104
    invoke-interface {p2}, Lt9/i;->flush()V

    .line 105
    .line 106
    .line 107
    iget-boolean p2, p0, Lh9/d;->o:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 108
    .line 109
    if-eqz p2, :cond_6

    .line 110
    .line 111
    monitor-exit p0

    .line 112
    return-object v2

    .line 113
    :cond_6
    if-nez v0, :cond_7

    .line 114
    .line 115
    :try_start_4
    new-instance v0, Lh9/d$c;

    .line 116
    .line 117
    invoke-direct {v0, p0, p1}, Lh9/d$c;-><init>(Lh9/d;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object p2, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-interface {p2, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :cond_7
    new-instance p1, Lh9/d$b;

    .line 126
    .line 127
    invoke-direct {p1, p0, v0}, Lh9/d$b;-><init>(Lh9/d;Lh9/d$c;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, p1}, Lh9/d$c;->l(Lh9/d$b;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 131
    .line 132
    .line 133
    monitor-exit p0

    .line 134
    return-object p1

    .line 135
    :cond_8
    :goto_2
    :try_start_5
    iget-object v3, p0, Lh9/d;->v:Li9/d;

    .line 136
    .line 137
    iget-object v4, p0, Lh9/d;->w:Lh9/d$e;

    .line 138
    .line 139
    const/4 v7, 0x2

    .line 140
    const/4 v8, 0x0

    .line 141
    const-wide/16 v5, 0x0

    .line 142
    .line 143
    invoke-static/range {v3 .. v8}, Li9/d;->j(Li9/d;Li9/a;JILjava/lang/Object;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 144
    .line 145
    .line 146
    monitor-exit p0

    .line 147
    return-object v2

    .line 148
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 149
    throw p1
.end method

.method public declared-synchronized close()V
    .locals 6

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh9/d;->q:Z

    .line 3
    .line 4
    const/4 v1, 0x1

    .line 5
    if-eqz v0, :cond_4

    .line 6
    .line 7
    iget-boolean v0, p0, Lh9/d;->r:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-string v2, "lruEntries.values"

    .line 19
    .line 20
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    new-array v3, v2, [Lh9/d$c;

    .line 25
    .line 26
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    check-cast v0, [Lh9/d$c;

    .line 33
    .line 34
    array-length v3, v0

    .line 35
    :goto_0
    if-ge v2, v3, :cond_2

    .line 36
    .line 37
    aget-object v4, v0, v2

    .line 38
    .line 39
    invoke-virtual {v4}, Lh9/d$c;->b()Lh9/d$b;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    if-eqz v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v4}, Lh9/d$c;->b()Lh9/d$b;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    if-eqz v4, :cond_1

    .line 50
    .line 51
    invoke-virtual {v4}, Lh9/d$b;->c()V

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    goto :goto_3

    .line 57
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-virtual {p0}, Lh9/d;->N0()V

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 64
    .line 65
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v0}, Lt9/D;->close()V

    .line 69
    .line 70
    .line 71
    const/4 v0, 0x0

    .line 72
    iput-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 73
    .line 74
    iput-boolean v1, p0, Lh9/d;->r:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    monitor-exit p0

    .line 77
    return-void

    .line 78
    :cond_3
    :try_start_1
    new-instance v0, Ljava/lang/NullPointerException;

    .line 79
    .line 80
    const-string v1, "null cannot be cast to non-null type kotlin.Array<T>"

    .line 81
    .line 82
    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    throw v0

    .line 86
    :cond_4
    :goto_2
    iput-boolean v1, p0, Lh9/d;->r:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 87
    .line 88
    monitor-exit p0

    .line 89
    return-void

    .line 90
    :goto_3
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 91
    throw v0
.end method

.method public final declared-synchronized d0(Ljava/lang/String;)Lh9/d$d;
    .locals 7

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lh9/d;->t0()V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lh9/d;->I()V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1}, Lh9/d;->O0(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lh9/d;->m:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lh9/d$c;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    const-string v2, "lruEntries[key] ?: return null"

    .line 28
    .line 29
    invoke-static {v0, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lh9/d$c;->r()Lh9/d$d;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    if-eqz v0, :cond_1

    .line 37
    .line 38
    iget v1, p0, Lh9/d;->n:I

    .line 39
    .line 40
    add-int/lit8 v1, v1, 0x1

    .line 41
    .line 42
    iput v1, p0, Lh9/d;->n:I

    .line 43
    .line 44
    iget-object v1, p0, Lh9/d;->l:Lt9/i;

    .line 45
    .line 46
    invoke-static {v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    sget-object v2, Lh9/d;->L:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {v1, v2}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/16 v2, 0x20

    .line 56
    .line 57
    invoke-interface {v1, v2}, Lt9/i;->writeByte(I)Lt9/i;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-interface {v1, p1}, Lt9/i;->V(Ljava/lang/String;)Lt9/i;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    const/16 v1, 0xa

    .line 66
    .line 67
    invoke-interface {p1, v1}, Lt9/i;->writeByte(I)Lt9/i;

    .line 68
    .line 69
    .line 70
    invoke-direct {p0}, Lh9/d;->u0()Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    iget-object v1, p0, Lh9/d;->v:Li9/d;

    .line 77
    .line 78
    iget-object v2, p0, Lh9/d;->w:Lh9/d$e;

    .line 79
    .line 80
    const/4 v5, 0x2

    .line 81
    const/4 v6, 0x0

    .line 82
    const-wide/16 v3, 0x0

    .line 83
    .line 84
    invoke-static/range {v1 .. v6}, Li9/d;->j(Li9/d;Li9/a;JILjava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :catchall_0
    move-exception v0

    .line 89
    move-object p1, v0

    .line 90
    goto :goto_1

    .line 91
    :cond_0
    :goto_0
    monitor-exit p0

    .line 92
    return-object v0

    .line 93
    :cond_1
    monitor-exit p0

    .line 94
    return-object v1

    .line 95
    :cond_2
    monitor-exit p0

    .line 96
    return-object v1

    .line 97
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    throw p1
.end method

.method public declared-synchronized flush()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-boolean v0, p0, Lh9/d;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    monitor-exit p0

    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_1
    invoke-direct {p0}, Lh9/d;->I()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lh9/d;->N0()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Lh9/d;->l:Lt9/i;

    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lt9/i;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 26
    throw v0
.end method

.method public final g0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lh9/d;->r:Z

    .line 2
    .line 3
    return v0
.end method

.method public final i0()Ljava/io/File;
    .locals 1

    .line 1
    iget-object v0, p0, Lh9/d;->y:Ljava/io/File;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k0()Ln9/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l0()I
    .locals 1

    .line 1
    iget v0, p0, Lh9/d;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final declared-synchronized t0()V
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    sget-boolean v0, Lf9/c;->h:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {p0}, Ljava/lang/Thread;->holdsLock(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 14
    .line 15
    new-instance v1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    const-string v2, "Thread "

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "Thread.currentThread()"

    .line 30
    .line 31
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v2, " MUST hold lock on "

    .line 42
    .line 43
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_3

    .line 59
    .line 60
    :cond_1
    :goto_0
    iget-boolean v0, p0, Lh9/d;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    .line 62
    if-eqz v0, :cond_2

    .line 63
    .line 64
    monitor-exit p0

    .line 65
    return-void

    .line 66
    :cond_2
    :try_start_1
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 67
    .line 68
    iget-object v1, p0, Lh9/d;->j:Ljava/io/File;

    .line 69
    .line 70
    invoke-interface {v0, v1}, Ln9/a;->d(Ljava/io/File;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 77
    .line 78
    iget-object v1, p0, Lh9/d;->h:Ljava/io/File;

    .line 79
    .line 80
    invoke-interface {v0, v1}, Ln9/a;->d(Ljava/io/File;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 87
    .line 88
    iget-object v1, p0, Lh9/d;->j:Ljava/io/File;

    .line 89
    .line 90
    invoke-interface {v0, v1}, Ln9/a;->f(Ljava/io/File;)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 95
    .line 96
    iget-object v1, p0, Lh9/d;->j:Ljava/io/File;

    .line 97
    .line 98
    iget-object v2, p0, Lh9/d;->h:Ljava/io/File;

    .line 99
    .line 100
    invoke-interface {v0, v1, v2}, Ln9/a;->e(Ljava/io/File;Ljava/io/File;)V

    .line 101
    .line 102
    .line 103
    :cond_4
    :goto_1
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 104
    .line 105
    iget-object v1, p0, Lh9/d;->j:Ljava/io/File;

    .line 106
    .line 107
    invoke-static {v0, v1}, Lf9/c;->C(Ln9/a;Ljava/io/File;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    iput-boolean v0, p0, Lh9/d;->p:Z

    .line 112
    .line 113
    iget-object v0, p0, Lh9/d;->x:Ln9/a;

    .line 114
    .line 115
    iget-object v1, p0, Lh9/d;->h:Ljava/io/File;

    .line 116
    .line 117
    invoke-interface {v0, v1}, Ln9/a;->d(Ljava/io/File;)Z

    .line 118
    .line 119
    .line 120
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 121
    const/4 v1, 0x1

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    :try_start_2
    invoke-direct {p0}, Lh9/d;->A0()V

    .line 125
    .line 126
    .line 127
    invoke-direct {p0}, Lh9/d;->y0()V

    .line 128
    .line 129
    .line 130
    iput-boolean v1, p0, Lh9/d;->q:Z
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 131
    .line 132
    monitor-exit p0

    .line 133
    return-void

    .line 134
    :catch_0
    move-exception v0

    .line 135
    :try_start_3
    sget-object v2, Lo9/j;->c:Lo9/j$a;

    .line 136
    .line 137
    invoke-virtual {v2}, Lo9/j$a;->g()Lo9/j;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    new-instance v3, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 144
    .line 145
    .line 146
    const-string v4, "DiskLruCache "

    .line 147
    .line 148
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    iget-object v4, p0, Lh9/d;->y:Ljava/io/File;

    .line 152
    .line 153
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    const-string v4, " is corrupt: "

    .line 157
    .line 158
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string v4, ", removing"

    .line 169
    .line 170
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v3

    .line 177
    const/4 v4, 0x5

    .line 178
    invoke-virtual {v2, v3, v4, v0}, Lo9/j;->k(Ljava/lang/String;ILjava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 179
    .line 180
    .line 181
    const/4 v0, 0x0

    .line 182
    :try_start_4
    invoke-virtual {p0}, Lh9/d;->M()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 183
    .line 184
    .line 185
    :try_start_5
    iput-boolean v0, p0, Lh9/d;->r:Z

    .line 186
    .line 187
    goto :goto_2

    .line 188
    :catchall_1
    move-exception v1

    .line 189
    iput-boolean v0, p0, Lh9/d;->r:Z

    .line 190
    .line 191
    throw v1

    .line 192
    :cond_5
    :goto_2
    invoke-virtual {p0}, Lh9/d;->J0()V

    .line 193
    .line 194
    .line 195
    iput-boolean v1, p0, Lh9/d;->q:Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 196
    .line 197
    monitor-exit p0

    .line 198
    return-void

    .line 199
    :goto_3
    :try_start_6
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 200
    throw v0
.end method
