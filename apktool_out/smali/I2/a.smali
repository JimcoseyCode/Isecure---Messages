.class public final LI2/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LC2/d;


# instance fields
.field private final a:LR2/a;


# direct methods
.method public constructor <init>(LR2/a;)V
    .locals 1

    .line 1
    const-string v0, "animatedDrawableBackend"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LI2/a;->a:LR2/a;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/a;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public b()I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/a;->b()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public h()I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/a;->getHeight()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public i()I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/a;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public j(I)I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LR2/a;->f(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, LI2/a;->a:LR2/a;

    .line 2
    .line 3
    invoke-interface {v0}, LR2/a;->getWidth()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
