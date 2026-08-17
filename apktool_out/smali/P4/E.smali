.class final LP4/E;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic g:LP4/l;

.field final synthetic h:LP4/F;


# direct methods
.method constructor <init>(LP4/F;LP4/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP4/E;->h:LP4/F;

    .line 2
    .line 3
    iput-object p2, p0, LP4/E;->g:LP4/l;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LP4/E;->h:LP4/F;

    .line 2
    .line 3
    invoke-static {v0}, LP4/F;->c(LP4/F;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, LP4/E;->h:LP4/F;

    .line 9
    .line 10
    invoke-static {v1}, LP4/F;->b(LP4/F;)LP4/h;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-static {v1}, LP4/F;->b(LP4/F;)LP4/h;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p0, LP4/E;->g:LP4/l;

    .line 21
    .line 22
    invoke-virtual {v2}, LP4/l;->l()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-interface {v1, v2}, LP4/h;->onSuccess(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_0
    :goto_0
    monitor-exit v0

    .line 33
    return-void

    .line 34
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    throw v1
.end method
