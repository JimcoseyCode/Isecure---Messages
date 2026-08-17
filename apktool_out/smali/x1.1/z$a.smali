.class Lx1/z$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/bumptech/glide/load/data/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx1/z;->g(LB1/n$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic g:LB1/n$a;

.field final synthetic h:Lx1/z;


# direct methods
.method constructor <init>(Lx1/z;LB1/n$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lx1/z$a;->h:Lx1/z;

    .line 2
    .line 3
    iput-object p2, p0, Lx1/z$a;->g:LB1/n$a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/z$a;->h:Lx1/z;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/z$a;->g:LB1/n$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx1/z;->d(LB1/n$a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lx1/z$a;->h:Lx1/z;

    .line 12
    .line 13
    iget-object v1, p0, Lx1/z$a;->g:LB1/n$a;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lx1/z;->f(LB1/n$a;Ljava/lang/Exception;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lx1/z$a;->h:Lx1/z;

    .line 2
    .line 3
    iget-object v1, p0, Lx1/z$a;->g:LB1/n$a;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lx1/z;->d(LB1/n$a;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lx1/z$a;->h:Lx1/z;

    .line 12
    .line 13
    iget-object v1, p0, Lx1/z$a;->g:LB1/n$a;

    .line 14
    .line 15
    invoke-virtual {v0, v1, p1}, Lx1/z;->e(LB1/n$a;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method
