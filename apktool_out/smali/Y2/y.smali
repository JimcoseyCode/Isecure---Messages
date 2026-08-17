.class public LY2/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final p:Ljava/lang/Class;

.field private static q:LY2/y;

.field private static r:LY2/t;

.field private static s:Z


# instance fields
.field private final a:Lcom/facebook/imagepipeline/producers/p0;

.field private final b:LY2/v;

.field private final c:LY2/a;

.field private final d:Lc2/n;

.field private e:LW2/n;

.field private f:LW2/u;

.field private g:LW2/n;

.field private h:LW2/u;

.field private i:Lb3/c;

.field private j:Lk3/d;

.field private k:LY2/C;

.field private l:LY2/W;

.field private m:LV2/d;

.field private n:Lh3/d;

.field private o:LS2/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, LY2/y;

    .line 2
    .line 3
    sput-object v0, LY2/y;->p:Ljava/lang/Class;

    .line 4
    .line 5
    return-void
.end method

.method public constructor <init>(LY2/v;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lj3/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-string v0, "ImagePipelineConfig()"

    .line 11
    .line 12
    invoke-static {v0}, Lj3/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LY2/v;

    .line 20
    .line 21
    iput-object v0, p0, LY2/y;->b:LY2/v;

    .line 22
    .line 23
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v1}, LY2/x;->G()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    new-instance v1, Lcom/facebook/imagepipeline/producers/B;

    .line 34
    .line 35
    invoke-interface {p1}, LY2/v;->H()LY2/p;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-interface {v2}, LY2/p;->b()Ljava/util/concurrent/Executor;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-direct {v1, v2}, Lcom/facebook/imagepipeline/producers/B;-><init>(Ljava/util/concurrent/Executor;)V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    new-instance v1, Lcom/facebook/imagepipeline/producers/q0;

    .line 48
    .line 49
    invoke-interface {p1}, LY2/v;->H()LY2/p;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    invoke-interface {v2}, LY2/p;->b()Ljava/util/concurrent/Executor;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-direct {v1, v2}, Lcom/facebook/imagepipeline/producers/q0;-><init>(Ljava/util/concurrent/Executor;)V

    .line 58
    .line 59
    .line 60
    :goto_0
    iput-object v1, p0, LY2/y;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 61
    .line 62
    new-instance v1, LY2/a;

    .line 63
    .line 64
    invoke-interface {p1}, LY2/v;->e()La3/a;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-direct {v1, p1}, LY2/a;-><init>(La3/a;)V

    .line 69
    .line 70
    .line 71
    iput-object v1, p0, LY2/y;->c:LY2/a;

    .line 72
    .line 73
    invoke-static {}, Lj3/b;->d()Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    invoke-static {}, Lj3/b;->b()V

    .line 80
    .line 81
    .line 82
    :cond_2
    invoke-interface {v0}, LY2/v;->d()Lc2/n;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, LY2/y;->d:Lc2/n;

    .line 87
    .line 88
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    invoke-virtual {p1}, LY2/x;->A()Z

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    if-eqz p1, :cond_3

    .line 97
    .line 98
    invoke-static {}, LQ2/e;->e()LQ2/e;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    const/4 v0, 0x1

    .line 103
    invoke-virtual {p1, v0}, LQ2/e;->g(Z)LQ2/e;

    .line 104
    .line 105
    .line 106
    :cond_3
    return-void
.end method

.method private a()LY2/t;
    .locals 14

    .line 1
    new-instance v0, LY2/t;

    .line 2
    .line 3
    invoke-direct {p0}, LY2/y;->p()LY2/W;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, LY2/y;->b:LY2/v;

    .line 8
    .line 9
    invoke-interface {v2}, LY2/v;->j()Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    iget-object v3, p0, LY2/y;->b:LY2/v;

    .line 14
    .line 15
    invoke-interface {v3}, LY2/v;->b()Ljava/util/Set;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v4, p0, LY2/y;->b:LY2/v;

    .line 20
    .line 21
    invoke-interface {v4}, LY2/v;->u()Lc2/n;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    invoke-virtual {p0}, LY2/y;->e()LW2/u;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {p0}, LY2/y;->h()LW2/u;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    iget-object v7, p0, LY2/y;->d:Lc2/n;

    .line 34
    .line 35
    iget-object v8, p0, LY2/y;->b:LY2/v;

    .line 36
    .line 37
    invoke-interface {v8}, LY2/v;->l()LW2/k;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    iget-object v9, p0, LY2/y;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 42
    .line 43
    iget-object v10, p0, LY2/y;->b:LY2/v;

    .line 44
    .line 45
    invoke-interface {v10}, LY2/v;->F()LY2/x;

    .line 46
    .line 47
    .line 48
    move-result-object v10

    .line 49
    invoke-virtual {v10}, LY2/x;->t()Lc2/n;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    iget-object v11, p0, LY2/y;->b:LY2/v;

    .line 54
    .line 55
    invoke-interface {v11}, LY2/v;->F()LY2/x;

    .line 56
    .line 57
    .line 58
    move-result-object v11

    .line 59
    invoke-virtual {v11}, LY2/x;->I()Lc2/n;

    .line 60
    .line 61
    .line 62
    move-result-object v11

    .line 63
    iget-object v12, p0, LY2/y;->b:LY2/v;

    .line 64
    .line 65
    invoke-interface {v12}, LY2/v;->C()LY1/a;

    .line 66
    .line 67
    .line 68
    const/4 v12, 0x0

    .line 69
    iget-object v13, p0, LY2/y;->b:LY2/v;

    .line 70
    .line 71
    invoke-direct/range {v0 .. v13}, LY2/t;-><init>(LY2/W;Ljava/util/Set;Ljava/util/Set;Lc2/n;LW2/x;LW2/x;Lc2/n;LW2/k;Lcom/facebook/imagepipeline/producers/p0;Lc2/n;Lc2/n;LY1/a;LY2/v;)V

    .line 72
    .line 73
    .line 74
    return-object v0
.end method

.method private c()LS2/a;
    .locals 9

    .line 1
    iget-object v0, p0, LY2/y;->o:LS2/a;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LY2/y;->m()LV2/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 10
    .line 11
    invoke-interface {v0}, LY2/v;->H()LY2/p;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p0}, LY2/y;->d()LW2/n;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 20
    .line 21
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, LY2/x;->j()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 30
    .line 31
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LY2/x;->v()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 40
    .line 41
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, LY2/x;->c()I

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 50
    .line 51
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0}, LY2/x;->d()I

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 60
    .line 61
    invoke-interface {v0}, LY2/v;->v()La2/g;

    .line 62
    .line 63
    .line 64
    move-result-object v8

    .line 65
    invoke-static/range {v1 .. v8}, LS2/b;->a(LV2/d;LY2/p;LW2/n;ZZIILjava/util/concurrent/ExecutorService;)LS2/a;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, LY2/y;->o:LS2/a;

    .line 70
    .line 71
    :cond_0
    iget-object v0, p0, LY2/y;->o:LS2/a;

    .line 72
    .line 73
    return-object v0
.end method

.method private i()Lb3/c;
    .locals 5

    .line 1
    iget-object v0, p0, LY2/y;->i:Lb3/c;

    .line 2
    .line 3
    if-nez v0, :cond_2

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->E()Lb3/c;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 14
    .line 15
    invoke-interface {v0}, LY2/v;->E()Lb3/c;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LY2/y;->i:Lb3/c;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0}, LY2/y;->c()LS2/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, LS2/a;->b()Lb3/c;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-interface {v0}, LS2/a;->c()Lb3/c;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, 0x0

    .line 38
    move-object v0, v1

    .line 39
    :goto_0
    invoke-virtual {p0}, LY2/y;->r()Lb3/c;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget-object v3, p0, LY2/y;->b:LY2/v;

    .line 44
    .line 45
    invoke-interface {v3}, LY2/v;->z()Lb3/d;

    .line 46
    .line 47
    .line 48
    new-instance v3, Lb3/b;

    .line 49
    .line 50
    invoke-virtual {p0}, LY2/y;->n()Lh3/d;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-direct {v3, v1, v0, v2, v4}, Lb3/b;-><init>(Lb3/c;Lb3/c;Lb3/c;Lh3/d;)V

    .line 55
    .line 56
    .line 57
    iput-object v3, p0, LY2/y;->i:Lb3/c;

    .line 58
    .line 59
    :cond_2
    :goto_1
    iget-object v0, p0, LY2/y;->i:Lb3/c;

    .line 60
    .line 61
    return-object v0
.end method

.method private k()Lk3/d;
    .locals 8

    .line 1
    iget-object v0, p0, LY2/y;->j:Lk3/d;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->x()Lk3/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 14
    .line 15
    invoke-interface {v0}, LY2/v;->w()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 22
    .line 23
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, LY2/x;->J()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    new-instance v0, Lk3/h;

    .line 34
    .line 35
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 36
    .line 37
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {v1}, LY2/x;->m()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-direct {v0, v1}, Lk3/h;-><init>(I)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, LY2/y;->j:Lk3/d;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v2, Lk3/f;

    .line 52
    .line 53
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 54
    .line 55
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, LY2/x;->m()I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 64
    .line 65
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, LY2/x;->x()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 74
    .line 75
    invoke-interface {v0}, LY2/v;->x()Lk3/d;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 80
    .line 81
    invoke-interface {v0}, LY2/v;->w()Ljava/lang/Integer;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 86
    .line 87
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-virtual {v0}, LY2/x;->F()Z

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-direct/range {v2 .. v7}, Lk3/f;-><init>(IZLk3/d;Ljava/lang/Integer;Z)V

    .line 96
    .line 97
    .line 98
    iput-object v2, p0, LY2/y;->j:Lk3/d;

    .line 99
    .line 100
    :cond_1
    :goto_0
    iget-object v0, p0, LY2/y;->j:Lk3/d;

    .line 101
    .line 102
    return-object v0
.end method

.method public static l()LY2/y;
    .locals 2

    .line 1
    sget-object v0, LY2/y;->q:LY2/y;

    .line 2
    .line 3
    const-string v1, "ImagePipelineFactory was not initialized!"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lc2/k;->h(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, LY2/y;

    .line 10
    .line 11
    return-object v0
.end method

.method private o()LY2/C;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LY2/y;->k:LY2/C;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 8
    .line 9
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, LY2/x;->p()LY2/x$d;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 18
    .line 19
    invoke-interface {v1}, LY2/v;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 24
    .line 25
    invoke-interface {v1}, LY2/v;->a()Lg3/D;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Lg3/D;->k()Lf2/a;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-direct {v0}, LY2/y;->i()Lb3/c;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 38
    .line 39
    invoke-interface {v1}, LY2/v;->p()Lb3/e;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 44
    .line 45
    invoke-interface {v1}, LY2/v;->B()LY2/n;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 50
    .line 51
    invoke-interface {v1}, LY2/v;->m()Z

    .line 52
    .line 53
    .line 54
    move-result v8

    .line 55
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 56
    .line 57
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, LY2/x;->B()Z

    .line 62
    .line 63
    .line 64
    move-result v9

    .line 65
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 66
    .line 67
    invoke-interface {v1}, LY2/v;->H()LY2/p;

    .line 68
    .line 69
    .line 70
    move-result-object v10

    .line 71
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 72
    .line 73
    invoke-interface {v1}, LY2/v;->a()Lg3/D;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iget-object v11, v0, LY2/y;->b:LY2/v;

    .line 78
    .line 79
    invoke-interface {v11}, LY2/v;->c()I

    .line 80
    .line 81
    .line 82
    move-result v11

    .line 83
    invoke-virtual {v1, v11}, Lg3/D;->i(I)Lf2/i;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 88
    .line 89
    invoke-interface {v1}, LY2/v;->a()Lg3/D;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, Lg3/D;->j()Lf2/l;

    .line 94
    .line 95
    .line 96
    move-result-object v12

    .line 97
    invoke-virtual {v0}, LY2/y;->e()LW2/u;

    .line 98
    .line 99
    .line 100
    move-result-object v13

    .line 101
    invoke-virtual {v0}, LY2/y;->h()LW2/u;

    .line 102
    .line 103
    .line 104
    move-result-object v14

    .line 105
    iget-object v15, v0, LY2/y;->d:Lc2/n;

    .line 106
    .line 107
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 108
    .line 109
    invoke-interface {v1}, LY2/v;->l()LW2/k;

    .line 110
    .line 111
    .line 112
    move-result-object v16

    .line 113
    invoke-virtual {v0}, LY2/y;->m()LV2/d;

    .line 114
    .line 115
    .line 116
    move-result-object v17

    .line 117
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 118
    .line 119
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-virtual {v1}, LY2/x;->g()I

    .line 124
    .line 125
    .line 126
    move-result v18

    .line 127
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 128
    .line 129
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v1}, LY2/x;->f()I

    .line 134
    .line 135
    .line 136
    move-result v19

    .line 137
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 138
    .line 139
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    invoke-virtual {v1}, LY2/x;->e()Z

    .line 144
    .line 145
    .line 146
    move-result v20

    .line 147
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 148
    .line 149
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v1}, LY2/x;->m()I

    .line 154
    .line 155
    .line 156
    move-result v21

    .line 157
    invoke-virtual {v0}, LY2/y;->f()LY2/a;

    .line 158
    .line 159
    .line 160
    move-result-object v22

    .line 161
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 162
    .line 163
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-virtual {v1}, LY2/x;->l()Z

    .line 168
    .line 169
    .line 170
    move-result v23

    .line 171
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 172
    .line 173
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, LY2/x;->u()I

    .line 178
    .line 179
    .line 180
    move-result v24

    .line 181
    invoke-interface/range {v2 .. v24}, LY2/x$d;->a(Landroid/content/Context;Lf2/a;Lb3/c;Lb3/e;LY2/n;ZZLY2/p;Lf2/i;Lf2/l;LW2/x;LW2/x;Lc2/n;LW2/k;LV2/d;IIZILY2/a;ZI)LY2/C;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    iput-object v1, v0, LY2/y;->k:LY2/C;

    .line 186
    .line 187
    :cond_0
    iget-object v1, v0, LY2/y;->k:LY2/C;

    .line 188
    .line 189
    return-object v1
.end method

.method private p()LY2/W;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 4
    .line 5
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, LY2/x;->w()Z

    .line 10
    .line 11
    .line 12
    move-result v10

    .line 13
    iget-object v1, v0, LY2/y;->l:LY2/W;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    new-instance v2, LY2/W;

    .line 18
    .line 19
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 20
    .line 21
    invoke-interface {v1}, LY2/v;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-direct {v0}, LY2/y;->o()LY2/C;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 38
    .line 39
    invoke-interface {v1}, LY2/v;->g()Lcom/facebook/imagepipeline/producers/X;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 44
    .line 45
    invoke-interface {v1}, LY2/v;->m()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 50
    .line 51
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, LY2/x;->L()Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    iget-object v8, v0, LY2/y;->a:Lcom/facebook/imagepipeline/producers/p0;

    .line 60
    .line 61
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 62
    .line 63
    invoke-interface {v1}, LY2/v;->B()LY2/n;

    .line 64
    .line 65
    .line 66
    move-result-object v9

    .line 67
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 68
    .line 69
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    invoke-virtual {v1}, LY2/x;->K()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 78
    .line 79
    invoke-interface {v1}, LY2/v;->A()Z

    .line 80
    .line 81
    .line 82
    move-result v12

    .line 83
    invoke-direct {v0}, LY2/y;->k()Lk3/d;

    .line 84
    .line 85
    .line 86
    move-result-object v13

    .line 87
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 88
    .line 89
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-virtual {v1}, LY2/x;->E()Z

    .line 94
    .line 95
    .line 96
    move-result v14

    .line 97
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 98
    .line 99
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v1}, LY2/x;->C()Z

    .line 104
    .line 105
    .line 106
    move-result v15

    .line 107
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 108
    .line 109
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-virtual {v1}, LY2/x;->a()Z

    .line 114
    .line 115
    .line 116
    move-result v16

    .line 117
    iget-object v1, v0, LY2/y;->b:LY2/v;

    .line 118
    .line 119
    invoke-interface {v1}, LY2/v;->o()Ljava/util/Set;

    .line 120
    .line 121
    .line 122
    move-result-object v17

    .line 123
    invoke-direct/range {v2 .. v17}, LY2/W;-><init>(Landroid/content/ContentResolver;LY2/C;Lcom/facebook/imagepipeline/producers/X;ZZLcom/facebook/imagepipeline/producers/p0;LY2/n;ZZZLk3/d;ZZZLjava/util/Set;)V

    .line 124
    .line 125
    .line 126
    iput-object v2, v0, LY2/y;->l:LY2/W;

    .line 127
    .line 128
    :cond_0
    iget-object v1, v0, LY2/y;->l:LY2/W;

    .line 129
    .line 130
    return-object v1
.end method

.method public static declared-synchronized s(LY2/v;)V
    .locals 3

    .line 1
    const-class v0, LY2/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, LY2/y;->q:LY2/y;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    sget-object v1, LY2/y;->p:Ljava/lang/Class;

    .line 9
    .line 10
    const-string v2, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior."

    .line 11
    .line 12
    invoke-static {v1, v2}, Ld2/a;->E(Ljava/lang/Class;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    sget-boolean v1, LY2/y;->s:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_1
    new-instance v1, LY2/y;

    .line 24
    .line 25
    invoke-direct {v1, p0}, LY2/y;-><init>(LY2/v;)V

    .line 26
    .line 27
    .line 28
    sput-object v1, LY2/y;->q:LY2/y;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    monitor-exit v0

    .line 31
    return-void

    .line 32
    :goto_0
    :try_start_2
    monitor-exit v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 33
    throw p0
.end method

.method public static declared-synchronized t(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-class v0, LY2/y;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-static {}, Lj3/b;->d()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-string v1, "ImagePipelineFactory#initialize"

    .line 11
    .line 12
    invoke-static {v1}, Lj3/b;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    invoke-static {p0}, LY2/u;->K(Landroid/content/Context;)LY2/u$a;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, LY2/u$a;->a()LY2/u;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, LY2/y;->s(LY2/v;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lj3/b;->d()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    invoke-static {}, Lj3/b;->b()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :cond_1
    monitor-exit v0

    .line 39
    return-void

    .line 40
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 41
    throw p0
.end method


# virtual methods
.method public b(Landroid/content/Context;)Lc3/a;
    .locals 1

    .line 1
    invoke-direct {p0}, LY2/y;->c()LS2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-interface {v0, p1}, LS2/a;->a(Landroid/content/Context;)Lc3/a;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
.end method

.method public d()LW2/n;
    .locals 8

    .line 1
    iget-object v0, p0, LY2/y;->e:LW2/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->f()LW2/a;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 12
    .line 13
    invoke-interface {v0}, LY2/v;->D()Lc2/n;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 18
    .line 19
    invoke-interface {v0}, LY2/v;->y()Lf2/d;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 24
    .line 25
    invoke-interface {v0}, LY2/v;->n()LW2/x$a;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 30
    .line 31
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, LY2/x;->r()Z

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 40
    .line 41
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0}, LY2/x;->q()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 50
    .line 51
    invoke-interface {v0}, LY2/v;->t()LW2/n$b;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    invoke-interface/range {v1 .. v7}, LW2/a;->a(Lc2/n;Lf2/d;LW2/x$a;ZZLW2/n$b;)LW2/n;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, LY2/y;->e:LW2/n;

    .line 60
    .line 61
    :cond_0
    iget-object v0, p0, LY2/y;->e:LW2/n;

    .line 62
    .line 63
    return-object v0
.end method

.method public e()LW2/u;
    .locals 2

    .line 1
    iget-object v0, p0, LY2/y;->f:LW2/u;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, LY2/y;->d()LW2/n;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 10
    .line 11
    invoke-interface {v1}, LY2/v;->s()LW2/t;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v0, v1}, LW2/v;->a(LW2/x;LW2/t;)LW2/u;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, LY2/y;->f:LW2/u;

    .line 20
    .line 21
    :cond_0
    iget-object v0, p0, LY2/y;->f:LW2/u;

    .line 22
    .line 23
    return-object v0
.end method

.method public f()LY2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/y;->c:LY2/a;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()LW2/n;
    .locals 3

    .line 1
    iget-object v0, p0, LY2/y;->g:LW2/n;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->G()Lc2/n;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 12
    .line 13
    invoke-interface {v1}, LY2/v;->y()Lf2/d;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, p0, LY2/y;->b:LY2/v;

    .line 18
    .line 19
    invoke-interface {v2}, LY2/v;->k()LW2/x$a;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v0, v1, v2}, LW2/r;->a(Lc2/n;Lf2/d;LW2/x$a;)LW2/n;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, LY2/y;->g:LW2/n;

    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, LY2/y;->g:LW2/n;

    .line 30
    .line 31
    return-object v0
.end method

.method public h()LW2/u;
    .locals 2

    .line 1
    iget-object v0, p0, LY2/y;->h:LW2/u;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->h()LW2/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 14
    .line 15
    invoke-interface {v0}, LY2/v;->h()LW2/x;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {p0}, LY2/y;->g()LW2/n;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    :goto_0
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 25
    .line 26
    invoke-interface {v1}, LY2/v;->s()LW2/t;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {v0, v1}, LW2/s;->a(LW2/x;LW2/t;)LW2/u;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, p0, LY2/y;->h:LW2/u;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, LY2/y;->h:LW2/u;

    .line 37
    .line 38
    return-object v0
.end method

.method public j()LY2/t;
    .locals 1

    .line 1
    sget-object v0, LY2/y;->r:LY2/t;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, LY2/y;->a()LY2/t;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, LY2/y;->r:LY2/t;

    .line 10
    .line 11
    :cond_0
    sget-object v0, LY2/y;->r:LY2/t;

    .line 12
    .line 13
    return-object v0
.end method

.method public m()LV2/d;
    .locals 3

    .line 1
    iget-object v0, p0, LY2/y;->m:LV2/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->a()Lg3/D;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {p0}, LY2/y;->n()Lh3/d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {p0}, LY2/y;->f()LY2/a;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v0, v1, v2}, LV2/e;->a(Lg3/D;Lh3/d;LY2/a;)LV2/d;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, LY2/y;->m:LV2/d;

    .line 24
    .line 25
    :cond_0
    iget-object v0, p0, LY2/y;->m:LV2/d;

    .line 26
    .line 27
    return-object v0
.end method

.method public n()Lh3/d;
    .locals 4

    .line 1
    iget-object v0, p0, LY2/y;->n:Lh3/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 6
    .line 7
    invoke-interface {v0}, LY2/v;->a()Lg3/D;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 12
    .line 13
    invoke-interface {v1}, LY2/v;->F()LY2/x;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, LY2/x;->H()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-object v2, p0, LY2/y;->b:LY2/v;

    .line 22
    .line 23
    invoke-interface {v2}, LY2/v;->F()LY2/x;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, LY2/x;->s()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    iget-object v3, p0, LY2/y;->b:LY2/v;

    .line 32
    .line 33
    invoke-interface {v3}, LY2/v;->F()LY2/x;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {v3}, LY2/x;->o()Lh3/f;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-static {v0, v1, v2, v3}, Lh3/e;->a(Lg3/D;ZZLh3/f;)Lh3/d;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p0, LY2/y;->n:Lh3/d;

    .line 46
    .line 47
    :cond_0
    iget-object v0, p0, LY2/y;->n:Lh3/d;

    .line 48
    .line 49
    return-object v0
.end method

.method public q()Lc3/a;
    .locals 1

    .line 1
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 2
    .line 3
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LY2/x;->A()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lm3/a;

    .line 14
    .line 15
    invoke-direct {v0}, Lm3/a;-><init>()V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    return-object v0
.end method

.method public r()Lb3/c;
    .locals 2

    .line 1
    iget-object v0, p0, LY2/y;->b:LY2/v;

    .line 2
    .line 3
    invoke-interface {v0}, LY2/v;->F()LY2/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LY2/x;->A()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    new-instance v0, Lm3/b;

    .line 14
    .line 15
    iget-object v1, p0, LY2/y;->b:LY2/v;

    .line 16
    .line 17
    invoke-interface {v1}, LY2/v;->getContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Lm3/b;-><init>(Landroid/content/res/Resources;)V

    .line 30
    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_0
    const/4 v0, 0x0

    .line 34
    return-object v0
.end method
