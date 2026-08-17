.class Lcom/github/penfeizhou/animation/decode/b$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/decode/b;->s()Landroid/graphics/Rect;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Ljava/lang/Thread;

.field final synthetic h:Lcom/github/penfeizhou/animation/decode/b;


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/decode/b;Ljava/lang/Thread;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    iput-object p2, p0, Lcom/github/penfeizhou/animation/decode/b$e;->g:Ljava/lang/Thread;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    iget-object v0, v0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->k(Lcom/github/penfeizhou/animation/decode/b;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 16
    .line 17
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->m(Lcom/github/penfeizhou/animation/decode/b;)LP3/b;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v1}, LP3/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->l(Lcom/github/penfeizhou/animation/decode/b;Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :catchall_0
    move-exception v0

    .line 34
    goto :goto_3

    .line 35
    :catch_0
    move-exception v0

    .line 36
    goto :goto_2

    .line 37
    :catch_1
    move-exception v0

    .line 38
    goto :goto_2

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 40
    .line 41
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->k(Lcom/github/penfeizhou/animation/decode/b;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->reset()V

    .line 46
    .line 47
    .line 48
    :goto_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 49
    .line 50
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->k(Lcom/github/penfeizhou/animation/decode/b;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->n(Lcom/github/penfeizhou/animation/decode/b;Landroid/graphics/Rect;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    .line 60
    .line 61
    :cond_1
    :goto_1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->g:Ljava/lang/Thread;

    .line 62
    .line 63
    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :goto_2
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 68
    .line 69
    .line 70
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$e;->h:Lcom/github/penfeizhou/animation/decode/b;

    .line 71
    .line 72
    invoke-static {}, Lcom/github/penfeizhou/animation/decode/b;->o()Landroid/graphics/Rect;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iput-object v1, v0, Lcom/github/penfeizhou/animation/decode/b;->p:Landroid/graphics/Rect;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :goto_3
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b$e;->g:Ljava/lang/Thread;

    .line 80
    .line 81
    invoke-static {v1}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    .line 82
    .line 83
    .line 84
    throw v0
.end method
