.class public final Lq/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private final a:LF/S0;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LF/S0;->i0()LF/S0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lq/a$a;->a:LF/S0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Lq/a;
    .locals 2

    .line 1
    new-instance v0, Lq/a;

    .line 2
    .line 3
    iget-object v1, p0, Lq/a$a;->a:LF/S0;

    .line 4
    .line 5
    invoke-static {v1}, LF/X0;->h0(LF/j0;)LF/X0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lq/a;-><init>(LF/j0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public b()LF/R0;
    .locals 1

    .line 1
    iget-object v0, p0, Lq/a$a;->a:LF/S0;

    .line 2
    .line 3
    return-object v0
.end method

.method public d(LF/j0;)Lq/a$a;
    .locals 1

    .line 1
    sget-object v0, LF/j0$c;->j:LF/j0$c;

    .line 2
    .line 3
    invoke-virtual {p0, p1, v0}, Lq/a$a;->e(LF/j0;LF/j0$c;)Lq/a$a;

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public e(LF/j0;LF/j0$c;)Lq/a$a;
    .locals 4

    .line 1
    invoke-interface {p1}, LF/j0;->a()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, LF/j0$a;

    .line 20
    .line 21
    iget-object v2, p0, Lq/a$a;->a:LF/S0;

    .line 22
    .line 23
    invoke-interface {p1, v1}, LF/j0;->d(LF/j0$a;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v1, p2, v3}, LF/S0;->t(LF/j0$a;LF/j0$c;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-object p0
.end method

.method public f(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;)Lq/a$a;
    .locals 1

    .line 1
    invoke-static {p1}, Lq/a;->f0(Landroid/hardware/camera2/CaptureRequest$Key;)LF/j0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lq/a$a;->a:LF/S0;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, LF/S0;->X(LF/j0$a;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public g(Landroid/hardware/camera2/CaptureRequest$Key;Ljava/lang/Object;LF/j0$c;)Lq/a$a;
    .locals 1

    .line 1
    invoke-static {p1}, Lq/a;->f0(Landroid/hardware/camera2/CaptureRequest$Key;)LF/j0$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lq/a$a;->a:LF/S0;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p3, p2}, LF/S0;->t(LF/j0$a;LF/j0$c;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
