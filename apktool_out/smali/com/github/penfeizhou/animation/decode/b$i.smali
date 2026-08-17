.class Lcom/github/penfeizhou/animation/decode/b$i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/github/penfeizhou/animation/decode/b;->R(II)I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:I

.field final synthetic h:Z

.field final synthetic i:Lcom/github/penfeizhou/animation/decode/b;


# direct methods
.method constructor <init>(Lcom/github/penfeizhou/animation/decode/b;IZ)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/github/penfeizhou/animation/decode/b$i;->i:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    iput p2, p0, Lcom/github/penfeizhou/animation/decode/b$i;->g:I

    .line 4
    .line 5
    iput-boolean p3, p0, Lcom/github/penfeizhou/animation/decode/b$i;->h:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$i;->i:Lcom/github/penfeizhou/animation/decode/b;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->d(Lcom/github/penfeizhou/animation/decode/b;)V

    .line 4
    .line 5
    .line 6
    :try_start_0
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$i;->i:Lcom/github/penfeizhou/animation/decode/b;

    .line 7
    .line 8
    iget v1, p0, Lcom/github/penfeizhou/animation/decode/b$i;->g:I

    .line 9
    .line 10
    iput v1, v0, Lcom/github/penfeizhou/animation/decode/b;->k:I

    .line 11
    .line 12
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->m(Lcom/github/penfeizhou/animation/decode/b;)LP3/b;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, LP3/b;->a()Lcom/github/penfeizhou/animation/io/Reader;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->A(Lcom/github/penfeizhou/animation/io/Reader;)Lcom/github/penfeizhou/animation/io/Reader;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->K(Lcom/github/penfeizhou/animation/io/Reader;)Landroid/graphics/Rect;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v0, v1}, Lcom/github/penfeizhou/animation/decode/b;->n(Lcom/github/penfeizhou/animation/decode/b;Landroid/graphics/Rect;)V

    .line 29
    .line 30
    .line 31
    iget-boolean v0, p0, Lcom/github/penfeizhou/animation/decode/b$i;->h:Z

    .line 32
    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    iget-object v0, p0, Lcom/github/penfeizhou/animation/decode/b$i;->i:Lcom/github/penfeizhou/animation/decode/b;

    .line 36
    .line 37
    invoke-static {v0}, Lcom/github/penfeizhou/animation/decode/b;->c(Lcom/github/penfeizhou/animation/decode/b;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    move-exception v0

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    return-void

    .line 44
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 45
    .line 46
    .line 47
    return-void
.end method
