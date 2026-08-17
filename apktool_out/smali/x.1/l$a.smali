.class public final Lx/l$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/I;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx/l;
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
    iput-object v0, p0, Lx/l$a;->a:LF/S0;

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic a(Lx/l$a;LF/j0;LF/j0$a;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lx/l$a;->b()LF/R0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p2}, LF/j0;->c(LF/j0$a;)LF/j0$c;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {p1, p2}, LF/j0;->d(LF/j0$a;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-interface {p0, p2, v0, p1}, LF/R0;->t(LF/j0$a;LF/j0$c;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static e(LF/j0;)Lx/l$a;
    .locals 3

    .line 1
    new-instance v0, Lx/l$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lx/l$a;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lx/k;

    .line 7
    .line 8
    invoke-direct {v1, v0, p0}, Lx/k;-><init>(Lx/l$a;LF/j0;)V

    .line 9
    .line 10
    .line 11
    const-string v2, "camera2.captureRequest.option."

    .line 12
    .line 13
    invoke-interface {p0, v2, v1}, LF/j0;->h(Ljava/lang/String;LF/j0$b;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method public b()LF/R0;
    .locals 1

    .line 1
    iget-object v0, p0, Lx/l$a;->a:LF/S0;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Lx/l;
    .locals 2

    .line 1
    new-instance v0, Lx/l;

    .line 2
    .line 3
    iget-object v1, p0, Lx/l$a;->a:LF/S0;

    .line 4
    .line 5
    invoke-static {v1}, LF/X0;->h0(LF/j0;)LF/X0;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lx/l;-><init>(LF/j0;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
