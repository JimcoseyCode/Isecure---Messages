.class Lcom/github/penfeizhou/animation/decode/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/github/penfeizhou/animation/decode/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:Lcom/github/penfeizhou/animation/decode/b;


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/decode/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->a(Lcom/github/penfeizhou/animation/decode/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 15
    .line 16
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->b(Lcom/github/penfeizhou/animation/decode/b;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_3

    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 27
    .line 28
    invoke-static {v2}, Lcom/github/penfeizhou/animation/decode/b;->g(Lcom/github/penfeizhou/animation/decode/b;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v4

    .line 36
    sub-long/2addr v4, v0

    .line 37
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 38
    .line 39
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->i(Lcom/github/penfeizhou/animation/decode/b;)Landroid/os/Handler;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 44
    .line 45
    invoke-static {v1}, Lcom/github/penfeizhou/animation/decode/b;->h(Lcom/github/penfeizhou/animation/decode/b;)Ljava/lang/Runnable;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 53
    .line 54
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->i(Lcom/github/penfeizhou/animation/decode/b;)Landroid/os/Handler;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    const-wide/16 v6, 0x0

    .line 59
    .line 60
    sub-long/2addr v2, v4

    .line 61
    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->max(JJ)J

    .line 62
    .line 63
    .line 64
    move-result-wide v1

    .line 65
    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 69
    .line 70
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->j(Lcom/github/penfeizhou/animation/decode/b;)Ljava/util/Set;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_2

    .line 83
    .line 84
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Lcom/github/penfeizhou/animation/decode/b$j;

    .line 89
    .line 90
    iget-object v2, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 91
    .line 92
    iget-object v2, v2, Lcom/github/penfeizhou/animation/decode/b;->o:Ljava/nio/ByteBuffer;

    .line 93
    .line 94
    if-eqz v2, :cond_1

    .line 95
    .line 96
    invoke-interface {v1, v2}, Lcom/github/penfeizhou/animation/decode/b$j;->a(Ljava/nio/ByteBuffer;)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    :goto_1
    return-void

    .line 101
    :cond_3
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$a;->g:Lcom/github/penfeizhou/animation/decode/b;

    .line 102
    .line 103
    invoke-virtual {v0}, Lcom/github/penfeizhou/animation/decode/b;->U()V

    .line 104
    .line 105
    .line 106
    return-void
.end method
