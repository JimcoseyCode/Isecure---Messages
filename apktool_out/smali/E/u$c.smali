.class abstract LE/u$c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "c"
.end annotation


# instance fields
.field private a:LF/r;

.field private b:LF/r;

.field private c:LF/q0;

.field private d:LF/q0;

.field private e:LF/q0;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LE/u$c$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LE/u$c$a;-><init>(LE/u$c;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LE/u$c;->a:LF/r;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, LE/u$c;->e:LF/q0;

    .line 13
    .line 14
    return-void
.end method

.method static n(Landroid/util/Size;ILjava/util/List;ZLy/d0;LE/G;)LE/u$c;
    .locals 9

    .line 1
    new-instance v0, LE/b;

    .line 2
    .line 3
    new-instance v7, LP/u;

    .line 4
    .line 5
    invoke-direct {v7}, LP/u;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v8, LP/u;

    .line 9
    .line 10
    invoke-direct {v8}, LP/u;-><init>()V

    .line 11
    .line 12
    .line 13
    move-object v1, p0

    .line 14
    move v2, p1

    .line 15
    move-object v3, p2

    .line 16
    move v4, p3

    .line 17
    move-object v5, p4

    .line 18
    move-object v6, p5

    .line 19
    invoke-direct/range {v0 .. v8}, LE/b;-><init>(Landroid/util/Size;ILjava/util/List;ZLy/d0;LE/G;LP/u;LP/u;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method


# virtual methods
.method a()LF/r;
    .locals 1

    .line 1
    iget-object v0, p0, LE/u$c;->a:LF/r;

    .line 2
    .line 3
    return-object v0
.end method

.method abstract b()LP/u;
.end method

.method abstract c()Ly/d0;
.end method

.method abstract d()I
.end method

.method abstract e()Ljava/util/List;
.end method

.method abstract f()LE/G;
.end method

.method g()LF/q0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/u$c;->e:LF/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method abstract h()LP/u;
.end method

.method i()LF/r;
    .locals 1

    .line 1
    iget-object v0, p0, LE/u$c;->b:LF/r;

    .line 2
    .line 3
    return-object v0
.end method

.method j()LF/q0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/u$c;->d:LF/q0;

    .line 2
    .line 3
    return-object v0
.end method

.method abstract k()Landroid/util/Size;
.end method

.method l()LF/q0;
    .locals 1

    .line 1
    iget-object v0, p0, LE/u$c;->c:LF/q0;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method abstract m()Z
.end method

.method o(LF/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/u$c;->a:LF/r;

    .line 2
    .line 3
    return-void
.end method

.method p(Landroid/view/Surface;Landroid/util/Size;I)V
    .locals 1

    .line 1
    new-instance v0, LF/G0;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3}, LF/G0;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LE/u$c;->e:LF/q0;

    .line 7
    .line 8
    return-void
.end method

.method q(LF/r;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/u$c;->b:LF/r;

    .line 2
    .line 3
    return-void
.end method

.method r(Landroid/view/Surface;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE/u$c;->d:LF/q0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "The secondary surface is already set."

    .line 9
    .line 10
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LF/G0;

    .line 14
    .line 15
    invoke-virtual {p0}, LE/u$c;->k()Landroid/util/Size;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, LE/u$c;->d()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v0, p1, v1, v2}, LF/G0;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LE/u$c;->d:LF/q0;

    .line 27
    .line 28
    return-void
.end method

.method s(Landroid/view/Surface;)V
    .locals 3

    .line 1
    iget-object v0, p0, LE/u$c;->c:LF/q0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :goto_0
    const-string v1, "The surface is already set."

    .line 9
    .line 10
    invoke-static {v0, v1}, LH0/g;->j(ZLjava/lang/String;)V

    .line 11
    .line 12
    .line 13
    new-instance v0, LF/G0;

    .line 14
    .line 15
    invoke-virtual {p0}, LE/u$c;->k()Landroid/util/Size;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0}, LE/u$c;->d()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-direct {v0, p1, v1, v2}, LF/G0;-><init>(Landroid/view/Surface;Landroid/util/Size;I)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, LE/u$c;->c:LF/q0;

    .line 27
    .line 28
    return-void
.end method
