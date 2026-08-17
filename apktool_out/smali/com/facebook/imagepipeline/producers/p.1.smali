.class public final Lcom/facebook/imagepipeline/producers/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/facebook/imagepipeline/producers/d0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/p$a;,
        Lcom/facebook/imagepipeline/producers/p$b;,
        Lcom/facebook/imagepipeline/producers/p$c;,
        Lcom/facebook/imagepipeline/producers/p$d;
    }
.end annotation


# static fields
.field public static final m:Lcom/facebook/imagepipeline/producers/p$a;


# instance fields
.field private final a:Lf2/a;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lb3/c;

.field private final d:Lb3/e;

.field private final e:LY2/n;

.field private final f:Z

.field private final g:Z

.field private final h:Lcom/facebook/imagepipeline/producers/d0;

.field private final i:I

.field private final j:LY2/a;

.field private final k:Ljava/lang/Runnable;

.field private final l:Lc2/n;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/imagepipeline/producers/p$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/imagepipeline/producers/p$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/imagepipeline/producers/p;->m:Lcom/facebook/imagepipeline/producers/p$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lf2/a;Ljava/util/concurrent/Executor;Lb3/c;Lb3/e;LY2/n;ZZLcom/facebook/imagepipeline/producers/d0;ILY2/a;Ljava/lang/Runnable;Lc2/n;)V
    .locals 1

    .line 1
    const-string v0, "byteArrayPool"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "executor"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "imageDecoder"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "progressiveJpegConfig"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "downsampleMode"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "inputProducer"

    .line 27
    .line 28
    invoke-static {p8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "closeableReferenceFactory"

    .line 32
    .line 33
    invoke-static {p10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "recoverFromDecoderOOM"

    .line 37
    .line 38
    invoke-static {p12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/p;->a:Lf2/a;

    .line 45
    .line 46
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/p;->b:Ljava/util/concurrent/Executor;

    .line 47
    .line 48
    iput-object p3, p0, Lcom/facebook/imagepipeline/producers/p;->c:Lb3/c;

    .line 49
    .line 50
    iput-object p4, p0, Lcom/facebook/imagepipeline/producers/p;->d:Lb3/e;

    .line 51
    .line 52
    iput-object p5, p0, Lcom/facebook/imagepipeline/producers/p;->e:LY2/n;

    .line 53
    .line 54
    iput-boolean p6, p0, Lcom/facebook/imagepipeline/producers/p;->f:Z

    .line 55
    .line 56
    iput-boolean p7, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    .line 57
    .line 58
    iput-object p8, p0, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    .line 59
    .line 60
    iput p9, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    .line 61
    .line 62
    iput-object p10, p0, Lcom/facebook/imagepipeline/producers/p;->j:LY2/a;

    .line 63
    .line 64
    iput-object p11, p0, Lcom/facebook/imagepipeline/producers/p;->k:Ljava/lang/Runnable;

    .line 65
    .line 66
    iput-object p12, p0, Lcom/facebook/imagepipeline/producers/p;->l:Lc2/n;

    .line 67
    .line 68
    return-void
.end method


# virtual methods
.method public b(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V
    .locals 10

    .line 1
    const-string v0, "consumer"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lj3/b;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p2}, Lcom/facebook/imagepipeline/producers/e0;->e()Lcom/facebook/imagepipeline/request/b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/b;->getSourceUri()Landroid/net/Uri;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Lk2/f;->o(Landroid/net/Uri;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/facebook/imagepipeline/request/b;->getSourceUri()Landroid/net/Uri;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v0}, Lcom/facebook/imagepipeline/request/c;->s(Landroid/net/Uri;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    new-instance v1, Lcom/facebook/imagepipeline/producers/p$b;

    .line 42
    .line 43
    iget-boolean v5, p0, Lcom/facebook/imagepipeline/producers/p;->g:Z

    .line 44
    .line 45
    iget v6, p0, Lcom/facebook/imagepipeline/producers/p;->i:I

    .line 46
    .line 47
    move-object v2, p0

    .line 48
    move-object v3, p1

    .line 49
    move-object v4, p2

    .line 50
    invoke-direct/range {v1 .. v6}, Lcom/facebook/imagepipeline/producers/p$b;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V

    .line 51
    .line 52
    .line 53
    move-object v3, v2

    .line 54
    move-object v5, v4

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move-object v3, p0

    .line 57
    move-object v4, p1

    .line 58
    move-object v5, p2

    .line 59
    new-instance v6, Lb3/f;

    .line 60
    .line 61
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/p;->a:Lf2/a;

    .line 62
    .line 63
    invoke-direct {v6, p1}, Lb3/f;-><init>(Lf2/a;)V

    .line 64
    .line 65
    .line 66
    new-instance v2, Lcom/facebook/imagepipeline/producers/p$c;

    .line 67
    .line 68
    iget-object v7, v3, Lcom/facebook/imagepipeline/producers/p;->d:Lb3/e;

    .line 69
    .line 70
    iget-boolean v8, v3, Lcom/facebook/imagepipeline/producers/p;->g:Z

    .line 71
    .line 72
    iget v9, v3, Lcom/facebook/imagepipeline/producers/p;->i:I

    .line 73
    .line 74
    invoke-direct/range {v2 .. v9}, Lcom/facebook/imagepipeline/producers/p$c;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lb3/f;Lb3/e;ZI)V

    .line 75
    .line 76
    .line 77
    move-object v1, v2

    .line 78
    :goto_0
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    .line 79
    .line 80
    invoke-interface {p1, v1, v5}, Lcom/facebook/imagepipeline/producers/d0;->b(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    move-object v3, p0

    .line 85
    move-object v4, p1

    .line 86
    move-object v5, p2

    .line 87
    const-string p1, "DecodeProducer#produceResults"

    .line 88
    .line 89
    invoke-static {p1}, Lj3/b;->a(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :try_start_0
    invoke-interface {v5}, Lcom/facebook/imagepipeline/producers/e0;->e()Lcom/facebook/imagepipeline/request/b;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/b;->getSourceUri()Landroid/net/Uri;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-static {p2}, Lk2/f;->o(Landroid/net/Uri;)Z

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    if-nez p2, :cond_2

    .line 105
    .line 106
    invoke-virtual {p1}, Lcom/facebook/imagepipeline/request/b;->getSourceUri()Landroid/net/Uri;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-static {p1}, Lcom/facebook/imagepipeline/request/c;->s(Landroid/net/Uri;)Z

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-nez p1, :cond_2

    .line 115
    .line 116
    new-instance v2, Lcom/facebook/imagepipeline/producers/p$b;

    .line 117
    .line 118
    iget-boolean v6, v3, Lcom/facebook/imagepipeline/producers/p;->g:Z

    .line 119
    .line 120
    iget v7, v3, Lcom/facebook/imagepipeline/producers/p;->i:I

    .line 121
    .line 122
    invoke-direct/range {v2 .. v7}, Lcom/facebook/imagepipeline/producers/p$b;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;ZI)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :catchall_0
    move-exception v0

    .line 127
    move-object p1, v0

    .line 128
    goto :goto_2

    .line 129
    :cond_2
    new-instance v6, Lb3/f;

    .line 130
    .line 131
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/p;->a:Lf2/a;

    .line 132
    .line 133
    invoke-direct {v6, p1}, Lb3/f;-><init>(Lf2/a;)V

    .line 134
    .line 135
    .line 136
    new-instance v2, Lcom/facebook/imagepipeline/producers/p$c;

    .line 137
    .line 138
    iget-object v7, v3, Lcom/facebook/imagepipeline/producers/p;->d:Lb3/e;

    .line 139
    .line 140
    iget-boolean v8, v3, Lcom/facebook/imagepipeline/producers/p;->g:Z

    .line 141
    .line 142
    iget v9, v3, Lcom/facebook/imagepipeline/producers/p;->i:I

    .line 143
    .line 144
    invoke-direct/range {v2 .. v9}, Lcom/facebook/imagepipeline/producers/p$c;-><init>(Lcom/facebook/imagepipeline/producers/p;Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;Lb3/f;Lb3/e;ZI)V

    .line 145
    .line 146
    .line 147
    :goto_1
    iget-object p1, v3, Lcom/facebook/imagepipeline/producers/p;->h:Lcom/facebook/imagepipeline/producers/d0;

    .line 148
    .line 149
    invoke-interface {p1, v2, v5}, Lcom/facebook/imagepipeline/producers/d0;->b(Lcom/facebook/imagepipeline/producers/n;Lcom/facebook/imagepipeline/producers/e0;)V

    .line 150
    .line 151
    .line 152
    sget-object p1, Li7/B;->a:Li7/B;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 153
    .line 154
    invoke-static {}, Lj3/b;->b()V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :goto_2
    invoke-static {}, Lj3/b;->b()V

    .line 159
    .line 160
    .line 161
    throw p1
.end method

.method public final c()LY2/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->j:LY2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/facebook/imagepipeline/producers/p;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final e()LY2/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->e:LY2/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ljava/util/concurrent/Executor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->b:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lb3/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->c:Lb3/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()Ljava/lang/Runnable;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->k:Ljava/lang/Runnable;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()Lc2/n;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/p;->l:Lc2/n;

    .line 2
    .line 3
    return-object v0
.end method
