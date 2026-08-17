.class public final synthetic Lc6/s;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:Ljava/util/concurrent/Callable;

.field public final synthetic h:LP4/m;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/Callable;LP4/m;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc6/s;->g:Ljava/util/concurrent/Callable;

    .line 5
    .line 6
    iput-object p2, p0, Lc6/s;->h:LP4/m;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lc6/s;->g:Ljava/util/concurrent/Callable;

    .line 2
    .line 3
    iget-object v1, p0, Lc6/s;->h:LP4/m;

    .line 4
    .line 5
    :try_start_0
    invoke-interface {v0}, Ljava/util/concurrent/Callable;->call()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch LY5/a; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    invoke-virtual {v1, v0}, LP4/m;->c(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :catch_0
    move-exception v0

    .line 14
    new-instance v2, LY5/a;

    .line 15
    .line 16
    const-string v3, "Internal error has occurred when executing ML Kit tasks"

    .line 17
    .line 18
    const/16 v4, 0xd

    .line 19
    .line 20
    invoke-direct {v2, v3, v4, v0}, LY5/a;-><init>(Ljava/lang/String;ILjava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, LP4/m;->b(Ljava/lang/Exception;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :catch_1
    move-exception v0

    .line 28
    invoke-virtual {v1, v0}, LP4/m;->b(Ljava/lang/Exception;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method
