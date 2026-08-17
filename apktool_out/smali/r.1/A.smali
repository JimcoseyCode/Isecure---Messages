.class public final Lr/A;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/K;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lz/a;

.field private final c:LF/d0;

.field private final d:LF/c0;

.field private final e:Ls/S;

.field private final f:Lr/r1;

.field private final g:J

.field private final h:Ljava/util/Map;

.field private final i:LK/m;

.field private final j:Ly/D;

.field private final k:Lr/Q0;

.field private final l:Ly/s;

.field private final m:Ljava/lang/Object;

.field private n:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;LF/d0;Ly/s;JLy/D;LK/m;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr/A;->h:Ljava/util/Map;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr/A;->m:Ljava/lang/Object;

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr/A;->n:Ljava/util/List;

    .line 24
    .line 25
    iput-object p1, p0, Lr/A;->a:Landroid/content/Context;

    .line 26
    .line 27
    iput-object p2, p0, Lr/A;->c:LF/d0;

    .line 28
    .line 29
    invoke-virtual {p2}, LF/d0;->c()Landroid/os/Handler;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {p1, v0}, Ls/S;->b(Landroid/content/Context;Landroid/os/Handler;)Ls/S;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lr/A;->e:Ls/S;

    .line 38
    .line 39
    invoke-static {p1}, Lr/r1;->c(Landroid/content/Context;)Lr/r1;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    iput-object p1, p0, Lr/A;->f:Lr/r1;

    .line 44
    .line 45
    new-instance p1, Lw/a;

    .line 46
    .line 47
    invoke-direct {p1, v0}, Lw/a;-><init>(Ls/S;)V

    .line 48
    .line 49
    .line 50
    iput-object p1, p0, Lr/A;->b:Lz/a;

    .line 51
    .line 52
    new-instance v1, LF/c0;

    .line 53
    .line 54
    const/4 v2, 0x1

    .line 55
    invoke-direct {v1, p1, v2}, LF/c0;-><init>(Lz/a;I)V

    .line 56
    .line 57
    .line 58
    iput-object v1, p0, Lr/A;->d:LF/c0;

    .line 59
    .line 60
    invoke-interface {p1, v1}, Lz/a;->e(Lz/a$a;)V

    .line 61
    .line 62
    .line 63
    iput-wide p4, p0, Lr/A;->g:J

    .line 64
    .line 65
    iput-object p7, p0, Lr/A;->i:LK/m;

    .line 66
    .line 67
    iput-object p6, p0, Lr/A;->j:Ly/D;

    .line 68
    .line 69
    iput-object p3, p0, Lr/A;->l:Ly/s;

    .line 70
    .line 71
    :try_start_0
    invoke-virtual {v0}, Ls/S;->d()[Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object p1
    :try_end_0
    .catch Ls/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 79
    new-instance p3, Lr/Q0;

    .line 80
    .line 81
    invoke-virtual {p2}, LF/d0;->b()Ljava/util/concurrent/Executor;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-direct {p3, p1, v0, p2}, Lr/Q0;-><init>(Ljava/util/List;Ls/S;Ljava/util/concurrent/Executor;)V

    .line 86
    .line 87
    .line 88
    iput-object p3, p0, Lr/A;->k:Lr/Q0;

    .line 89
    .line 90
    invoke-virtual {p0, p1}, Lr/A;->e(Ljava/util/List;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :catch_0
    move-exception p1

    .line 95
    new-instance p2, Ly/f0;

    .line 96
    .line 97
    invoke-static {p1}, Lr/Z0;->a(Ls/h;)Ly/u;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-direct {p2, p1}, Ly/f0;-><init>(Ljava/lang/Throwable;)V

    .line 102
    .line 103
    .line 104
    throw p2
.end method

.method private g(Ljava/util/List;)Ljava/util/List;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/lang/String;

    .line 21
    .line 22
    const-string v2, "0"

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    const-string v2, "1"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    iget-object v2, p0, Lr/A;->e:Ls/S;

    .line 40
    .line 41
    invoke-static {v2, v1}, Lr/W0;->a(Ls/S;Ljava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_1

    .line 46
    .line 47
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 54
    .line 55
    .line 56
    const-string v3, "Camera "

    .line 57
    .line 58
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v1, " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE."

    .line 65
    .line 66
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    const-string v2, "Camera2CameraFactory"

    .line 74
    .line 75
    invoke-static {v2, v1}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_2
    :goto_1
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    return-object v0
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lr/A;->i()Ls/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()LF/V0;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/A;->k:Lr/Q0;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()Ljava/util/Set;
    .locals 3

    .line 1
    iget-object v0, p0, Lr/A;->m:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 5
    .line 6
    iget-object v2, p0, Lr/A;->n:Ljava/util/List;

    .line 7
    .line 8
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 9
    .line 10
    .line 11
    monitor-exit v0

    .line 12
    return-object v1

    .line 13
    :catchall_0
    move-exception v1

    .line 14
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    throw v1
.end method

.method public d(Ljava/lang/String;)LF/M;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v2, v1, Lr/A;->m:Ljava/lang/Object;

    .line 4
    .line 5
    monitor-enter v2

    .line 6
    :try_start_0
    iget-object v0, v1, Lr/A;->n:Ljava/util/List;

    .line 7
    .line 8
    move-object/from16 v6, p1

    .line 9
    .line 10
    invoke-interface {v0, v6}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    new-instance v3, Lr/V;

    .line 18
    .line 19
    iget-object v4, v1, Lr/A;->a:Landroid/content/Context;

    .line 20
    .line 21
    iget-object v5, v1, Lr/A;->e:Ls/S;

    .line 22
    .line 23
    invoke-virtual/range {p0 .. p1}, Lr/A;->h(Ljava/lang/String;)Lr/b0;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    iget-object v8, v1, Lr/A;->b:Lz/a;

    .line 28
    .line 29
    iget-object v9, v1, Lr/A;->d:LF/c0;

    .line 30
    .line 31
    iget-object v0, v1, Lr/A;->c:LF/d0;

    .line 32
    .line 33
    invoke-virtual {v0}, LF/d0;->b()Ljava/util/concurrent/Executor;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    iget-object v0, v1, Lr/A;->c:LF/d0;

    .line 38
    .line 39
    invoke-virtual {v0}, LF/d0;->c()Landroid/os/Handler;

    .line 40
    .line 41
    .line 42
    move-result-object v11

    .line 43
    iget-object v12, v1, Lr/A;->f:Lr/r1;

    .line 44
    .line 45
    iget-wide v13, v1, Lr/A;->g:J

    .line 46
    .line 47
    iget-object v15, v1, Lr/A;->j:Ly/D;

    .line 48
    .line 49
    invoke-direct/range {v3 .. v15}, Lr/V;-><init>(Landroid/content/Context;Ls/S;Ljava/lang/String;Lr/b0;Lz/a;LF/c0;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lr/r1;JLy/D;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v3, "The given camera id is not on the available camera id list."

    .line 58
    .line 59
    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :goto_0
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 64
    throw v0
.end method

.method public e(Ljava/util/List;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lr/A;->l:Ly/s;

    .line 7
    .line 8
    invoke-static {p0, p1, v0}, Lr/X0;->b(Lr/A;Ly/s;Ljava/util/List;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-direct {p0, p1}, Lr/A;->g(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lr/A;->m:Ljava/lang/Object;

    .line 17
    .line 18
    monitor-enter v0

    .line 19
    :try_start_0
    iget-object v1, p0, Lr/A;->n:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    monitor-exit v0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const-string v1, "Camera2CameraFactory"

    .line 32
    .line 33
    new-instance v2, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v3, "Updated available camera list: "

    .line 39
    .line 40
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v3, p0, Lr/A;->n:Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v3, " -> "

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-static {v1, v2}, Ly/h0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    iput-object p1, p0, Lr/A;->n:Ljava/util/List;

    .line 64
    .line 65
    monitor-exit v0

    .line 66
    return-void

    .line 67
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    throw p1
.end method

.method public f()Lz/a;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/A;->b:Lz/a;

    .line 2
    .line 3
    return-object v0
.end method

.method h(Ljava/lang/String;)Lr/b0;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lr/A;->h:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr/b0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lr/b0;

    .line 12
    .line 13
    iget-object v1, p0, Lr/A;->e:Ls/S;

    .line 14
    .line 15
    iget-object v2, p0, Lr/A;->i:LK/m;

    .line 16
    .line 17
    invoke-direct {v0, p1, v1, v2}, Lr/b0;-><init>(Ljava/lang/String;Ls/S;LK/m;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lr/A;->h:Ljava/util/Map;

    .line 21
    .line 22
    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ls/h; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    return-object v0

    .line 29
    :goto_0
    invoke-static {p1}, Lr/Z0;->a(Ls/h;)Ly/u;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    throw p1
.end method

.method public i()Ls/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lr/A;->e:Ls/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public shutdown()V
    .locals 1

    .line 1
    iget-object v0, p0, Lr/A;->b:Lz/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lz/a;->shutdown()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr/A;->k:Lr/Q0;

    .line 7
    .line 8
    invoke-virtual {v0}, Lr/Q0;->h()V

    .line 9
    .line 10
    .line 11
    return-void
.end method
