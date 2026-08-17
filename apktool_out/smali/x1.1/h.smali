.class Lx1/h;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lx1/f$a;
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements LR1/a$f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/h$d;,
        Lx1/h$f;,
        Lx1/h$e;,
        Lx1/h$b;,
        Lx1/h$g;,
        Lx1/h$h;,
        Lx1/h$c;
    }
.end annotation


# static fields
.field public static final O:Lv1/g;


# instance fields
.field private A:Z

.field private B:Ljava/lang/Object;

.field private C:Lcom/bumptech/glide/e;

.field private D:Ljava/util/function/Supplier;

.field private E:Ljava/lang/Thread;

.field private F:Lv1/f;

.field private G:Lv1/f;

.field private H:Ljava/lang/Object;

.field private I:Lv1/a;

.field private J:Lcom/bumptech/glide/load/data/d;

.field private volatile K:Lx1/f;

.field private volatile L:Z

.field private volatile M:Z

.field private N:Z

.field private final g:Lx1/g;

.field private final h:Ljava/util/List;

.field private final i:LR1/c;

.field private final j:Lx1/h$e;

.field private final k:LH0/e;

.field private final l:Lx1/h$d;

.field private final m:Lx1/h$f;

.field private n:Lcom/bumptech/glide/d;

.field private o:Lv1/f;

.field private p:Lcom/bumptech/glide/g;

.field private q:Lx1/n;

.field private r:I

.field private s:I

.field private t:Lx1/j;

.field private u:Lv1/h;

.field private v:Lx1/h$b;

.field private w:I

.field private x:Lx1/h$h;

.field private y:Lx1/h$g;

.field private z:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "glide_thread_priority_override"

    .line 2
    .line 3
    invoke-static {v0}, Lv1/g;->e(Ljava/lang/String;)Lv1/g;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lx1/h;->O:Lv1/g;

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>(Lx1/h$e;LH0/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx1/g;

    .line 5
    .line 6
    invoke-direct {v0}, Lx1/g;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx1/h;->g:Lx1/g;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lx1/h;->h:Ljava/util/List;

    .line 17
    .line 18
    invoke-static {}, LR1/c;->a()LR1/c;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iput-object v0, p0, Lx1/h;->i:LR1/c;

    .line 23
    .line 24
    new-instance v0, Lx1/h$d;

    .line 25
    .line 26
    invoke-direct {v0}, Lx1/h$d;-><init>()V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lx1/h;->l:Lx1/h$d;

    .line 30
    .line 31
    new-instance v0, Lx1/h$f;

    .line 32
    .line 33
    invoke-direct {v0}, Lx1/h$f;-><init>()V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lx1/h;->m:Lx1/h$f;

    .line 37
    .line 38
    iput-object p1, p0, Lx1/h;->j:Lx1/h$e;

    .line 39
    .line 40
    iput-object p2, p0, Lx1/h;->k:LH0/e;

    .line 41
    .line 42
    return-void
.end method

.method private A(Ljava/lang/String;JLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-static {p2, p3}, LQ1/g;->a(J)D

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lx1/h;->q:Lx1/n;

    .line 5
    .line 6
    invoke-static {p1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p4, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string p2, ", "

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method private B(Lx1/v;Lv1/a;Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/h;->C:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lx1/h;->K()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Lx1/h;->O()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lx1/h;->v:Lx1/h$b;

    .line 18
    .line 19
    invoke-interface {v0, p1, p2, p3}, Lx1/h$b;->b(Lx1/v;Lv1/a;Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method private C(Lx1/v;Lv1/a;Z)V
    .locals 1

    .line 1
    const-string v0, "DecodeJob.notifyEncodeAndRelease"

    .line 2
    .line 3
    invoke-static {v0}, LR1/b;->a(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    instance-of v0, p1, Lx1/r;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Lx1/r;

    .line 12
    .line 13
    invoke-interface {v0}, Lx1/r;->initialize()V

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p1

    .line 18
    goto :goto_4

    .line 19
    :cond_0
    :goto_0
    iget-object v0, p0, Lx1/h;->l:Lx1/h$d;

    .line 20
    .line 21
    invoke-virtual {v0}, Lx1/h$d;->c()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-static {p1}, Lx1/u;->d(Lx1/v;)Lx1/u;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    move-object v0, p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 v0, 0x0

    .line 34
    :goto_1
    invoke-direct {p0, p1, p2, p3}, Lx1/h;->B(Lx1/v;Lv1/a;Z)V

    .line 35
    .line 36
    .line 37
    sget-object p1, Lx1/h$h;->k:Lx1/h$h;

    .line 38
    .line 39
    iput-object p1, p0, Lx1/h;->x:Lx1/h$h;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    :try_start_1
    iget-object p1, p0, Lx1/h;->l:Lx1/h$d;

    .line 42
    .line 43
    invoke-virtual {p1}, Lx1/h$d;->c()Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_2

    .line 48
    .line 49
    iget-object p1, p0, Lx1/h;->l:Lx1/h$d;

    .line 50
    .line 51
    iget-object p2, p0, Lx1/h;->j:Lx1/h$e;

    .line 52
    .line 53
    iget-object p3, p0, Lx1/h;->u:Lv1/h;

    .line 54
    .line 55
    invoke-virtual {p1, p2, p3}, Lx1/h$d;->b(Lx1/h$e;Lv1/h;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_2

    .line 59
    :catchall_1
    move-exception p1

    .line 60
    goto :goto_3

    .line 61
    :cond_2
    :goto_2
    if-eqz v0, :cond_3

    .line 62
    .line 63
    :try_start_2
    invoke-virtual {v0}, Lx1/u;->f()V

    .line 64
    .line 65
    .line 66
    :cond_3
    invoke-direct {p0}, Lx1/h;->E()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 67
    .line 68
    .line 69
    invoke-static {}, LR1/b;->e()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :goto_3
    if-eqz v0, :cond_4

    .line 74
    .line 75
    :try_start_3
    invoke-virtual {v0}, Lx1/u;->f()V

    .line 76
    .line 77
    .line 78
    :cond_4
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 79
    :goto_4
    invoke-static {}, LR1/b;->e()V

    .line 80
    .line 81
    .line 82
    throw p1
.end method

.method private D()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/h;->C:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-direct {p0}, Lx1/h;->K()V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-direct {p0}, Lx1/h;->O()V

    .line 15
    .line 16
    .line 17
    new-instance v0, Lx1/q;

    .line 18
    .line 19
    new-instance v1, Ljava/util/ArrayList;

    .line 20
    .line 21
    iget-object v2, p0, Lx1/h;->h:Ljava/util/List;

    .line 22
    .line 23
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "Failed to load resource"

    .line 27
    .line 28
    invoke-direct {v0, v2, v1}, Lx1/q;-><init>(Ljava/lang/String;Ljava/util/List;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Lx1/h;->v:Lx1/h$b;

    .line 32
    .line 33
    invoke-interface {v1, v0}, Lx1/h$b;->a(Lx1/q;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lx1/h;->F()V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private E()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h;->m:Lx1/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/h$f;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lx1/h;->I()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private F()V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h;->m:Lx1/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/h$f;->c()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lx1/h;->I()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method private I()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/h;->m:Lx1/h$f;

    .line 2
    .line 3
    invoke-virtual {v0}, Lx1/h$f;->e()V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lx1/h;->l:Lx1/h$d;

    .line 7
    .line 8
    invoke-virtual {v0}, Lx1/h$d;->a()V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lx1/h;->g:Lx1/g;

    .line 12
    .line 13
    invoke-virtual {v0}, Lx1/g;->a()V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lx1/h;->L:Z

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iput-object v1, p0, Lx1/h;->n:Lcom/bumptech/glide/d;

    .line 21
    .line 22
    iput-object v1, p0, Lx1/h;->o:Lv1/f;

    .line 23
    .line 24
    iput-object v1, p0, Lx1/h;->u:Lv1/h;

    .line 25
    .line 26
    iput-object v1, p0, Lx1/h;->p:Lcom/bumptech/glide/g;

    .line 27
    .line 28
    iput-object v1, p0, Lx1/h;->q:Lx1/n;

    .line 29
    .line 30
    iput-object v1, p0, Lx1/h;->v:Lx1/h$b;

    .line 31
    .line 32
    iput-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 33
    .line 34
    iput-object v1, p0, Lx1/h;->K:Lx1/f;

    .line 35
    .line 36
    iput-object v1, p0, Lx1/h;->E:Ljava/lang/Thread;

    .line 37
    .line 38
    iput-object v1, p0, Lx1/h;->F:Lv1/f;

    .line 39
    .line 40
    iput-object v1, p0, Lx1/h;->H:Ljava/lang/Object;

    .line 41
    .line 42
    iput-object v1, p0, Lx1/h;->I:Lv1/a;

    .line 43
    .line 44
    iput-object v1, p0, Lx1/h;->J:Lcom/bumptech/glide/load/data/d;

    .line 45
    .line 46
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    iput-wide v2, p0, Lx1/h;->z:J

    .line 49
    .line 50
    iput-boolean v0, p0, Lx1/h;->M:Z

    .line 51
    .line 52
    iput-object v1, p0, Lx1/h;->B:Ljava/lang/Object;

    .line 53
    .line 54
    iget-object v0, p0, Lx1/h;->h:Ljava/util/List;

    .line 55
    .line 56
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Lx1/h;->k:LH0/e;

    .line 60
    .line 61
    invoke-interface {v0, p0}, LH0/e;->release(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    return-void
.end method

.method private J(Lx1/h$g;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/h;->y:Lx1/h$g;

    .line 2
    .line 3
    iget-object p1, p0, Lx1/h;->v:Lx1/h$b;

    .line 4
    .line 5
    invoke-interface {p1, p0}, Lx1/h$b;->c(Lx1/h;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private K()V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/h;->C:Lcom/bumptech/glide/e;

    .line 2
    .line 3
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lx1/h;->D:Ljava/util/function/Supplier;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/16 v1, 0x9

    .line 26
    .line 27
    invoke-static {v0, v1}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    const/4 v0, 0x0

    .line 32
    iput-object v0, p0, Lx1/h;->D:Ljava/util/function/Supplier;

    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 36
    .line 37
    const-string v1, "OverrideGlideThreadPriority experiment is not enabled."

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v0
.end method

.method private L()V
    .locals 3

    .line 1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lx1/h;->E:Ljava/lang/Thread;

    .line 6
    .line 7
    invoke-static {}, LQ1/g;->b()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    iput-wide v0, p0, Lx1/h;->z:J

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    :cond_0
    iget-boolean v1, p0, Lx1/h;->M:Z

    .line 15
    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lx1/h;->K:Lx1/f;

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Lx1/h;->K:Lx1/f;

    .line 23
    .line 24
    invoke-interface {v0}, Lx1/f;->b()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    iget-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 31
    .line 32
    invoke-direct {p0, v1}, Lx1/h;->v(Lx1/h$h;)Lx1/h$h;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    iput-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 37
    .line 38
    invoke-direct {p0}, Lx1/h;->u()Lx1/f;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    iput-object v1, p0, Lx1/h;->K:Lx1/f;

    .line 43
    .line 44
    iget-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 45
    .line 46
    sget-object v2, Lx1/h$h;->j:Lx1/h$h;

    .line 47
    .line 48
    if-ne v1, v2, :cond_0

    .line 49
    .line 50
    sget-object v0, Lx1/h$g;->h:Lx1/h$g;

    .line 51
    .line 52
    invoke-direct {p0, v0}, Lx1/h;->J(Lx1/h$g;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_1
    iget-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 57
    .line 58
    sget-object v2, Lx1/h$h;->l:Lx1/h$h;

    .line 59
    .line 60
    if-eq v1, v2, :cond_2

    .line 61
    .line 62
    iget-boolean v1, p0, Lx1/h;->M:Z

    .line 63
    .line 64
    if-eqz v1, :cond_3

    .line 65
    .line 66
    :cond_2
    if-nez v0, :cond_3

    .line 67
    .line 68
    invoke-direct {p0}, Lx1/h;->D()V

    .line 69
    .line 70
    .line 71
    :cond_3
    return-void
.end method

.method private M(Ljava/lang/Object;Lv1/a;Lx1/t;)Lx1/v;
    .locals 6

    .line 1
    invoke-direct {p0, p2}, Lx1/h;->w(Lv1/a;)Lv1/h;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    iget-object v0, p0, Lx1/h;->n:Lcom/bumptech/glide/d;

    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/bumptech/glide/d;->h()Lcom/bumptech/glide/h;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->l(Ljava/lang/Object;)Lcom/bumptech/glide/load/data/e;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_0
    iget v3, p0, Lx1/h;->r:I

    .line 16
    .line 17
    iget v4, p0, Lx1/h;->s:I

    .line 18
    .line 19
    new-instance v5, Lx1/h$c;

    .line 20
    .line 21
    invoke-direct {v5, p0, p2}, Lx1/h$c;-><init>(Lx1/h;Lv1/a;)V

    .line 22
    .line 23
    .line 24
    move-object v0, p3

    .line 25
    invoke-virtual/range {v0 .. v5}, Lx1/t;->a(Lcom/bumptech/glide/load/data/e;Lv1/h;IILx1/i$a;)Lx1/v;

    .line 26
    .line 27
    .line 28
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->cleanup()V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    move-object p1, v0

    .line 35
    invoke-interface {v1}, Lcom/bumptech/glide/load/data/e;->cleanup()V

    .line 36
    .line 37
    .line 38
    throw p1
.end method

.method private N()V
    .locals 3

    .line 1
    sget-object v0, Lx1/h$a;->a:[I

    .line 2
    .line 3
    iget-object v1, p0, Lx1/h;->y:Lx1/h$g;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    invoke-direct {p0}, Lx1/h;->t()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v2, "Unrecognized run reason: "

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lx1/h;->y:Lx1/h$g;

    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0

    .line 49
    :cond_1
    invoke-direct {p0}, Lx1/h;->L()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_2
    sget-object v0, Lx1/h$h;->g:Lx1/h$h;

    .line 54
    .line 55
    invoke-direct {p0, v0}, Lx1/h;->v(Lx1/h$h;)Lx1/h$h;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p0, Lx1/h;->x:Lx1/h$h;

    .line 60
    .line 61
    invoke-direct {p0}, Lx1/h;->u()Lx1/f;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iput-object v0, p0, Lx1/h;->K:Lx1/f;

    .line 66
    .line 67
    invoke-direct {p0}, Lx1/h;->L()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method private O()V
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/h;->i:LR1/c;

    .line 2
    .line 3
    invoke-virtual {v0}, LR1/c;->c()V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lx1/h;->L:Z

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Lx1/h;->h:Ljava/util/List;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object v0, p0, Lx1/h;->h:Ljava/util/List;

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    sub-int/2addr v2, v1

    .line 28
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Throwable;

    .line 33
    .line 34
    :goto_0
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v2, "Already notified"

    .line 37
    .line 38
    invoke-direct {v1, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    throw v1

    .line 42
    :cond_1
    iput-boolean v1, p0, Lx1/h;->L:Z

    .line 43
    .line 44
    return-void
.end method

.method private r(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lv1/a;)Lx1/v;
    .locals 3

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, LQ1/g;->b()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    invoke-direct {p0, p2, p3}, Lx1/h;->s(Ljava/lang/Object;Lv1/a;)Lx1/v;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    const-string p3, "DecodeJob"

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    invoke-static {p3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_1

    .line 24
    .line 25
    new-instance p3, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-string v2, "Decoded result "

    .line 31
    .line 32
    invoke-virtual {p3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-direct {p0, p3, v0, v1}, Lx1/h;->z(Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p2

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    :goto_0
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 49
    .line 50
    .line 51
    return-object p2

    .line 52
    :goto_1
    invoke-interface {p1}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 53
    .line 54
    .line 55
    throw p2
.end method

.method private s(Ljava/lang/Object;Lv1/a;)Lx1/v;
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/h;->g:Lx1/g;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v0, v1}, Lx1/g;->h(Ljava/lang/Class;)Lx1/t;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-direct {p0, p1, p2, v0}, Lx1/h;->M(Ljava/lang/Object;Lv1/a;Lx1/t;)Lx1/v;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private t()V
    .locals 4

    .line 1
    const-string v0, "DecodeJob"

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-wide v0, p0, Lx1/h;->z:J

    .line 11
    .line 12
    new-instance v2, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string v3, "data: "

    .line 18
    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v3, p0, Lx1/h;->H:Ljava/lang/Object;

    .line 23
    .line 24
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v3, ", cache key: "

    .line 28
    .line 29
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v3, p0, Lx1/h;->F:Lv1/f;

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v3, ", fetcher: "

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object v3, p0, Lx1/h;->J:Lcom/bumptech/glide/load/data/d;

    .line 43
    .line 44
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "Retrieved data"

    .line 52
    .line 53
    invoke-direct {p0, v3, v0, v1, v2}, Lx1/h;->A(Ljava/lang/String;JLjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    iget-object v0, p0, Lx1/h;->C:Lcom/bumptech/glide/e;

    .line 57
    .line 58
    const-class v1, Lcom/bumptech/glide/c$d;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lcom/bumptech/glide/e;->a(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    const/4 v1, 0x0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    iget-object v0, p0, Lx1/h;->D:Ljava/util/function/Supplier;

    .line 68
    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    :try_start_0
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    iget-object v2, p0, Lx1/h;->D:Ljava/util/function/Supplier;

    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    check-cast v2, Ljava/lang/Integer;

    .line 88
    .line 89
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-static {v0, v2}, Landroid/os/Process;->setThreadPriority(II)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :catch_0
    iput-object v1, p0, Lx1/h;->D:Ljava/util/function/Supplier;

    .line 98
    .line 99
    :cond_1
    :goto_0
    :try_start_1
    iget-object v0, p0, Lx1/h;->J:Lcom/bumptech/glide/load/data/d;

    .line 100
    .line 101
    iget-object v2, p0, Lx1/h;->H:Ljava/lang/Object;

    .line 102
    .line 103
    iget-object v3, p0, Lx1/h;->I:Lv1/a;

    .line 104
    .line 105
    invoke-direct {p0, v0, v2, v3}, Lx1/h;->r(Lcom/bumptech/glide/load/data/d;Ljava/lang/Object;Lv1/a;)Lx1/v;

    .line 106
    .line 107
    .line 108
    move-result-object v1
    :try_end_1
    .catch Lx1/q; {:try_start_1 .. :try_end_1} :catch_1

    .line 109
    goto :goto_1

    .line 110
    :catch_1
    move-exception v0

    .line 111
    iget-object v2, p0, Lx1/h;->G:Lv1/f;

    .line 112
    .line 113
    iget-object v3, p0, Lx1/h;->I:Lv1/a;

    .line 114
    .line 115
    invoke-virtual {v0, v2, v3}, Lx1/q;->i(Lv1/f;Lv1/a;)V

    .line 116
    .line 117
    .line 118
    iget-object v2, p0, Lx1/h;->h:Ljava/util/List;

    .line 119
    .line 120
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    :goto_1
    if-eqz v1, :cond_2

    .line 124
    .line 125
    iget-object v0, p0, Lx1/h;->I:Lv1/a;

    .line 126
    .line 127
    iget-boolean v2, p0, Lx1/h;->N:Z

    .line 128
    .line 129
    invoke-direct {p0, v1, v0, v2}, Lx1/h;->C(Lx1/v;Lv1/a;Z)V

    .line 130
    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_2
    invoke-direct {p0}, Lx1/h;->L()V

    .line 134
    .line 135
    .line 136
    :goto_2
    return-void
.end method

.method private u()Lx1/f;
    .locals 3

    .line 1
    sget-object v0, Lx1/h$a;->b:[I

    .line 2
    .line 3
    iget-object v1, p0, Lx1/h;->x:Lx1/h$h;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v1, 0x2

    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    const/4 v1, 0x3

    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x4

    .line 21
    if-ne v0, v1, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0

    .line 25
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    const-string v2, "Unrecognized stage: "

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lx1/h;->x:Lx1/h$h;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    new-instance v0, Lx1/z;

    .line 51
    .line 52
    iget-object v1, p0, Lx1/h;->g:Lx1/g;

    .line 53
    .line 54
    invoke-direct {v0, v1, p0}, Lx1/z;-><init>(Lx1/g;Lx1/f$a;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_2
    new-instance v0, Lx1/c;

    .line 59
    .line 60
    iget-object v1, p0, Lx1/h;->g:Lx1/g;

    .line 61
    .line 62
    invoke-direct {v0, v1, p0}, Lx1/c;-><init>(Lx1/g;Lx1/f$a;)V

    .line 63
    .line 64
    .line 65
    return-object v0

    .line 66
    :cond_3
    new-instance v0, Lx1/w;

    .line 67
    .line 68
    iget-object v1, p0, Lx1/h;->g:Lx1/g;

    .line 69
    .line 70
    invoke-direct {v0, v1, p0}, Lx1/w;-><init>(Lx1/g;Lx1/f$a;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private v(Lx1/h$h;)Lx1/h$h;
    .locals 3

    .line 1
    sget-object v0, Lx1/h$a;->b:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    aget v0, v0, v1

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    if-eq v0, v1, :cond_5

    .line 11
    .line 12
    const/4 v1, 0x2

    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    .line 15
    const/4 v1, 0x3

    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq v0, v1, :cond_2

    .line 20
    .line 21
    const/4 v1, 0x5

    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    iget-object p1, p0, Lx1/h;->t:Lx1/j;

    .line 25
    .line 26
    invoke-virtual {p1}, Lx1/j;->b()Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    sget-object p1, Lx1/h$h;->h:Lx1/h$h;

    .line 33
    .line 34
    return-object p1

    .line 35
    :cond_0
    sget-object p1, Lx1/h$h;->h:Lx1/h$h;

    .line 36
    .line 37
    invoke-direct {p0, p1}, Lx1/h;->v(Lx1/h$h;)Lx1/h$h;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 43
    .line 44
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string v2, "Unrecognized stage: "

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw v0

    .line 65
    :cond_2
    sget-object p1, Lx1/h$h;->l:Lx1/h$h;

    .line 66
    .line 67
    return-object p1

    .line 68
    :cond_3
    iget-boolean p1, p0, Lx1/h;->A:Z

    .line 69
    .line 70
    if-eqz p1, :cond_4

    .line 71
    .line 72
    sget-object p1, Lx1/h$h;->l:Lx1/h$h;

    .line 73
    .line 74
    return-object p1

    .line 75
    :cond_4
    sget-object p1, Lx1/h$h;->j:Lx1/h$h;

    .line 76
    .line 77
    return-object p1

    .line 78
    :cond_5
    iget-object p1, p0, Lx1/h;->t:Lx1/j;

    .line 79
    .line 80
    invoke-virtual {p1}, Lx1/j;->a()Z

    .line 81
    .line 82
    .line 83
    move-result p1

    .line 84
    if-eqz p1, :cond_6

    .line 85
    .line 86
    sget-object p1, Lx1/h$h;->i:Lx1/h$h;

    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_6
    sget-object p1, Lx1/h$h;->i:Lx1/h$h;

    .line 90
    .line 91
    invoke-direct {p0, p1}, Lx1/h;->v(Lx1/h$h;)Lx1/h$h;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    return-object p1
.end method

.method private w(Lv1/a;)Lv1/h;
    .locals 3

    .line 1
    iget-object v0, p0, Lx1/h;->u:Lv1/h;

    .line 2
    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 4
    .line 5
    const/16 v2, 0x1a

    .line 6
    .line 7
    if-ge v1, v2, :cond_0

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v1, Lv1/a;->j:Lv1/a;

    .line 11
    .line 12
    if-eq p1, v1, :cond_2

    .line 13
    .line 14
    iget-object p1, p0, Lx1/h;->g:Lx1/g;

    .line 15
    .line 16
    invoke-virtual {p1}, Lx1/g;->x()Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/4 p1, 0x0

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 26
    :goto_1
    sget-object v1, Lcom/bumptech/glide/load/resource/bitmap/t;->j:Lv1/g;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Ljava/lang/Boolean;

    .line 33
    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_3

    .line 41
    .line 42
    if-eqz p1, :cond_4

    .line 43
    .line 44
    :cond_3
    return-object v0

    .line 45
    :cond_4
    new-instance v0, Lv1/h;

    .line 46
    .line 47
    invoke-direct {v0}, Lv1/h;-><init>()V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, Lx1/h;->u:Lv1/h;

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Lv1/h;->c(Lv1/h;)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    invoke-virtual {v0, v1, p1}, Lv1/h;->d(Lv1/g;Ljava/lang/Object;)Lv1/h;

    .line 60
    .line 61
    .line 62
    return-object v0
.end method

.method private x()I
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h;->p:Lcom/bumptech/glide/g;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method private z(Ljava/lang/String;J)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Lx1/h;->A(Ljava/lang/String;JLjava/lang/String;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method G(Lv1/a;Lx1/v;)Lx1/v;
    .locals 11

    .line 1
    invoke-interface {p2}, Lx1/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    sget-object v0, Lv1/a;->j:Lv1/a;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eq p1, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lx1/h;->g:Lx1/g;

    .line 15
    .line 16
    invoke-virtual {v0, v8}, Lx1/g;->s(Ljava/lang/Class;)Lv1/l;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v2, p0, Lx1/h;->n:Lcom/bumptech/glide/d;

    .line 21
    .line 22
    iget v3, p0, Lx1/h;->r:I

    .line 23
    .line 24
    iget v4, p0, Lx1/h;->s:I

    .line 25
    .line 26
    invoke-interface {v0, v2, p2, v3, v4}, Lv1/l;->a(Landroid/content/Context;Lx1/v;II)Lx1/v;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v7, v0

    .line 31
    move-object v0, v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v0, p2

    .line 34
    move-object v7, v1

    .line 35
    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_1

    .line 40
    .line 41
    invoke-interface {p2}, Lx1/v;->recycle()V

    .line 42
    .line 43
    .line 44
    :cond_1
    iget-object p2, p0, Lx1/h;->g:Lx1/g;

    .line 45
    .line 46
    invoke-virtual {p2, v0}, Lx1/g;->w(Lx1/v;)Z

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    if-eqz p2, :cond_2

    .line 51
    .line 52
    iget-object p2, p0, Lx1/h;->g:Lx1/g;

    .line 53
    .line 54
    invoke-virtual {p2, v0}, Lx1/g;->n(Lx1/v;)Lv1/k;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget-object p2, p0, Lx1/h;->u:Lv1/h;

    .line 59
    .line 60
    invoke-interface {v1, p2}, Lv1/k;->a(Lv1/h;)Lv1/c;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    :goto_1
    move-object v10, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_2
    sget-object p2, Lv1/c;->i:Lv1/c;

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :goto_2
    iget-object v1, p0, Lx1/h;->g:Lx1/g;

    .line 70
    .line 71
    iget-object v2, p0, Lx1/h;->F:Lv1/f;

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Lx1/g;->y(Lv1/f;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    const/4 v2, 0x1

    .line 78
    xor-int/2addr v1, v2

    .line 79
    iget-object v3, p0, Lx1/h;->t:Lx1/j;

    .line 80
    .line 81
    invoke-virtual {v3, v1, p1, p2}, Lx1/j;->d(ZLv1/a;Lv1/c;)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_6

    .line 86
    .line 87
    if-eqz v10, :cond_5

    .line 88
    .line 89
    sget-object p1, Lx1/h$a;->c:[I

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    aget p1, p1, v1

    .line 96
    .line 97
    if-eq p1, v2, :cond_4

    .line 98
    .line 99
    const/4 v1, 0x2

    .line 100
    if-ne p1, v1, :cond_3

    .line 101
    .line 102
    new-instance v1, Lx1/x;

    .line 103
    .line 104
    iget-object p1, p0, Lx1/h;->g:Lx1/g;

    .line 105
    .line 106
    invoke-virtual {p1}, Lx1/g;->b()Ly1/b;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    iget-object v3, p0, Lx1/h;->F:Lv1/f;

    .line 111
    .line 112
    iget-object v4, p0, Lx1/h;->o:Lv1/f;

    .line 113
    .line 114
    iget v5, p0, Lx1/h;->r:I

    .line 115
    .line 116
    iget v6, p0, Lx1/h;->s:I

    .line 117
    .line 118
    iget-object v9, p0, Lx1/h;->u:Lv1/h;

    .line 119
    .line 120
    invoke-direct/range {v1 .. v9}, Lx1/x;-><init>(Ly1/b;Lv1/f;Lv1/f;IILv1/l;Ljava/lang/Class;Lv1/h;)V

    .line 121
    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 125
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "Unknown strategy: "

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p2

    .line 143
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    throw p1

    .line 147
    :cond_4
    new-instance v1, Lx1/d;

    .line 148
    .line 149
    iget-object p1, p0, Lx1/h;->F:Lv1/f;

    .line 150
    .line 151
    iget-object p2, p0, Lx1/h;->o:Lv1/f;

    .line 152
    .line 153
    invoke-direct {v1, p1, p2}, Lx1/d;-><init>(Lv1/f;Lv1/f;)V

    .line 154
    .line 155
    .line 156
    :goto_3
    invoke-static {v0}, Lx1/u;->d(Lx1/v;)Lx1/u;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    iget-object p2, p0, Lx1/h;->l:Lx1/h$d;

    .line 161
    .line 162
    invoke-virtual {p2, v1, v10, p1}, Lx1/h$d;->d(Lv1/f;Lv1/k;Lx1/u;)V

    .line 163
    .line 164
    .line 165
    return-object p1

    .line 166
    :cond_5
    new-instance p1, Lcom/bumptech/glide/h$d;

    .line 167
    .line 168
    invoke-interface {v0}, Lx1/v;->get()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object p2

    .line 176
    invoke-direct {p1, p2}, Lcom/bumptech/glide/h$d;-><init>(Ljava/lang/Class;)V

    .line 177
    .line 178
    .line 179
    throw p1

    .line 180
    :cond_6
    return-object v0
.end method

.method H(Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h;->m:Lx1/h$f;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lx1/h$f;->d(Z)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lx1/h;->I()V

    .line 10
    .line 11
    .line 12
    :cond_0
    return-void
.end method

.method P()Z
    .locals 2

    .line 1
    sget-object v0, Lx1/h$h;->g:Lx1/h$h;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lx1/h;->v(Lx1/h$h;)Lx1/h$h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sget-object v1, Lx1/h$h;->h:Lx1/h$h;

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    sget-object v1, Lx1/h$h;->i:Lx1/h$h;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    return v0

    .line 18
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 19
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lx1/h;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lx1/h;->q(Lx1/h;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public h(Lv1/f;Ljava/lang/Object;Lcom/bumptech/glide/load/data/d;Lv1/a;Lv1/f;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/h;->F:Lv1/f;

    .line 2
    .line 3
    iput-object p2, p0, Lx1/h;->H:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lx1/h;->J:Lcom/bumptech/glide/load/data/d;

    .line 6
    .line 7
    iput-object p4, p0, Lx1/h;->I:Lv1/a;

    .line 8
    .line 9
    iput-object p5, p0, Lx1/h;->G:Lv1/f;

    .line 10
    .line 11
    iget-object p2, p0, Lx1/h;->g:Lx1/g;

    .line 12
    .line 13
    invoke-virtual {p2}, Lx1/g;->c()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const/4 p3, 0x0

    .line 18
    invoke-interface {p2, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eq p1, p2, :cond_0

    .line 23
    .line 24
    const/4 p3, 0x1

    .line 25
    :cond_0
    iput-boolean p3, p0, Lx1/h;->N:Z

    .line 26
    .line 27
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iget-object p2, p0, Lx1/h;->E:Ljava/lang/Thread;

    .line 32
    .line 33
    if-eq p1, p2, :cond_1

    .line 34
    .line 35
    sget-object p1, Lx1/h$g;->i:Lx1/h$g;

    .line 36
    .line 37
    invoke-direct {p0, p1}, Lx1/h;->J(Lx1/h$g;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    const-string p1, "DecodeJob.decodeFromRetrievedData"

    .line 42
    .line 43
    invoke-static {p1}, LR1/b;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-direct {p0}, Lx1/h;->t()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    .line 49
    invoke-static {}, LR1/b;->e()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catchall_0
    move-exception p1

    .line 54
    invoke-static {}, LR1/b;->e()V

    .line 55
    .line 56
    .line 57
    throw p1
.end method

.method public j(Lv1/f;Ljava/lang/Exception;Lcom/bumptech/glide/load/data/d;Lv1/a;)V
    .locals 2

    .line 1
    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lx1/q;

    .line 5
    .line 6
    const-string v1, "Fetching data failed"

    .line 7
    .line 8
    invoke-direct {v0, v1, p2}, Lx1/q;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p3}, Lcom/bumptech/glide/load/data/d;->getDataClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {v0, p1, p4, p2}, Lx1/q;->j(Lv1/f;Lv1/a;Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Lx1/h;->h:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iget-object p2, p0, Lx1/h;->E:Ljava/lang/Thread;

    .line 28
    .line 29
    if-eq p1, p2, :cond_0

    .line 30
    .line 31
    sget-object p1, Lx1/h$g;->h:Lx1/h$g;

    .line 32
    .line 33
    invoke-direct {p0, p1}, Lx1/h;->J(Lx1/h$g;)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    invoke-direct {p0}, Lx1/h;->L()V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public k()V
    .locals 1

    .line 1
    sget-object v0, Lx1/h$g;->h:Lx1/h$g;

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lx1/h;->J(Lx1/h$g;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public m()LR1/c;
    .locals 1

    .line 1
    iget-object v0, p0, Lx1/h;->i:LR1/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public p()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lx1/h;->M:Z

    .line 3
    .line 4
    iget-object v0, p0, Lx1/h;->K:Lx1/f;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Lx1/f;->cancel()V

    .line 9
    .line 10
    .line 11
    :cond_0
    return-void
.end method

.method public q(Lx1/h;)I
    .locals 2

    .line 1
    invoke-direct {p0}, Lx1/h;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-direct {p1}, Lx1/h;->x()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr v0, v1

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lx1/h;->w:I

    .line 13
    .line 14
    iget p1, p1, Lx1/h;->w:I

    .line 15
    .line 16
    sub-int/2addr v0, p1

    .line 17
    :cond_0
    return v0
.end method

.method public run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx1/h;->y:Lx1/h$g;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/h;->B:Ljava/lang/Object;

    .line 4
    .line 5
    const-string v2, "DecodeJob#run(reason=%s, model=%s)"

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, LR1/b;->c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lx1/h;->J:Lcom/bumptech/glide/load/data/d;

    .line 11
    .line 12
    :try_start_0
    iget-boolean v1, p0, Lx1/h;->M:Z

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-direct {p0}, Lx1/h;->D()V
    :try_end_0
    .catch Lx1/b; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-static {}, LR1/b;->e()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :catchall_0
    move-exception v1

    .line 29
    goto :goto_0

    .line 30
    :catch_0
    move-exception v1

    .line 31
    goto :goto_2

    .line 32
    :cond_1
    :try_start_1
    invoke-direct {p0}, Lx1/h;->N()V
    :try_end_1
    .catch Lx1/b; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-static {}, LR1/b;->e()V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :goto_0
    :try_start_2
    const-string v2, "DecodeJob"

    .line 45
    .line 46
    const/4 v3, 0x3

    .line 47
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    iget-object v2, p0, Lx1/h;->x:Lx1/h$h;

    .line 54
    .line 55
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :catchall_1
    move-exception v1

    .line 60
    goto :goto_3

    .line 61
    :cond_3
    :goto_1
    iget-object v2, p0, Lx1/h;->x:Lx1/h$h;

    .line 62
    .line 63
    sget-object v3, Lx1/h$h;->k:Lx1/h$h;

    .line 64
    .line 65
    if-eq v2, v3, :cond_4

    .line 66
    .line 67
    iget-object v2, p0, Lx1/h;->h:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    invoke-direct {p0}, Lx1/h;->D()V

    .line 73
    .line 74
    .line 75
    :cond_4
    iget-boolean v2, p0, Lx1/h;->M:Z

    .line 76
    .line 77
    if-nez v2, :cond_5

    .line 78
    .line 79
    throw v1

    .line 80
    :cond_5
    throw v1

    .line 81
    :goto_2
    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 82
    :goto_3
    if-eqz v0, :cond_6

    .line 83
    .line 84
    invoke-interface {v0}, Lcom/bumptech/glide/load/data/d;->cleanup()V

    .line 85
    .line 86
    .line 87
    :cond_6
    invoke-static {}, LR1/b;->e()V

    .line 88
    .line 89
    .line 90
    throw v1
.end method

.method y(Lcom/bumptech/glide/d;Ljava/lang/Object;Lx1/n;Lv1/f;IILjava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lx1/j;Ljava/util/Map;ZZZLv1/h;Lx1/h$b;I)Lx1/h;
    .locals 16

    move-object/from16 v0, p0

    .line 1
    iget-object v1, v0, Lx1/h;->g:Lx1/g;

    iget-object v15, v0, Lx1/h;->j:Lx1/h$e;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v5, p5

    move/from16 v6, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v7, p10

    move-object/from16 v12, p11

    move/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v11, p15

    invoke-virtual/range {v1 .. v15}, Lx1/g;->v(Lcom/bumptech/glide/d;Ljava/lang/Object;Lv1/f;IILx1/j;Ljava/lang/Class;Ljava/lang/Class;Lcom/bumptech/glide/g;Lv1/h;Ljava/util/Map;ZZLx1/h$e;)V

    .line 2
    iput-object v2, v0, Lx1/h;->n:Lcom/bumptech/glide/d;

    .line 3
    iput-object v4, v0, Lx1/h;->o:Lv1/f;

    .line 4
    iput-object v10, v0, Lx1/h;->p:Lcom/bumptech/glide/g;

    move-object/from16 v1, p3

    .line 5
    iput-object v1, v0, Lx1/h;->q:Lx1/n;

    .line 6
    iput v5, v0, Lx1/h;->r:I

    .line 7
    iput v6, v0, Lx1/h;->s:I

    .line 8
    iput-object v7, v0, Lx1/h;->t:Lx1/j;

    move/from16 v1, p14

    .line 9
    iput-boolean v1, v0, Lx1/h;->A:Z

    .line 10
    iput-object v11, v0, Lx1/h;->u:Lv1/h;

    move-object/from16 v1, p16

    .line 11
    iput-object v1, v0, Lx1/h;->v:Lx1/h$b;

    move/from16 v1, p17

    .line 12
    iput v1, v0, Lx1/h;->w:I

    .line 13
    sget-object v1, Lx1/h$g;->g:Lx1/h$g;

    iput-object v1, v0, Lx1/h;->y:Lx1/h$g;

    .line 14
    iput-object v3, v0, Lx1/h;->B:Ljava/lang/Object;

    .line 15
    invoke-virtual {v2}, Lcom/bumptech/glide/d;->f()Lcom/bumptech/glide/e;

    move-result-object v1

    iput-object v1, v0, Lx1/h;->C:Lcom/bumptech/glide/e;

    .line 16
    sget-object v1, Lx1/h;->O:Lv1/g;

    invoke-virtual {v11, v1}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/function/Supplier;

    iput-object v1, v0, Lx1/h;->D:Ljava/util/function/Supplier;

    return-object v0
.end method
