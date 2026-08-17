.class public final synthetic Lc6/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/Executor;

.field public final synthetic h:LP4/a;

.field public final synthetic i:LP4/b;

.field public final synthetic j:LP4/m;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Executor;LP4/a;LP4/b;LP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc6/y;->g:Ljava/util/concurrent/Executor;

    .line 5
    .line 6
    iput-object p2, p0, Lc6/y;->h:LP4/a;

    .line 7
    .line 8
    iput-object p3, p0, Lc6/y;->i:LP4/b;

    .line 9
    .line 10
    iput-object p4, p0, Lc6/y;->j:LP4/m;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lc6/y;->g:Ljava/util/concurrent/Executor;

    .line 2
    .line 3
    :try_start_0
    invoke-interface {v0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catch_0
    move-exception p1

    .line 8
    iget-object v0, p0, Lc6/y;->h:LP4/a;

    .line 9
    .line 10
    invoke-virtual {v0}, LP4/a;->a()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lc6/y;->i:LP4/b;

    .line 17
    .line 18
    invoke-virtual {v0}, LP4/b;->a()V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, Lc6/y;->j:LP4/m;

    .line 23
    .line 24
    invoke-virtual {v0, p1}, LP4/m;->b(Ljava/lang/Exception;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    throw p1
.end method
