.class Lm2/f$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/f$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lm2/f$a;


# direct methods
.method private constructor <init>(Lm2/f$a;)V
    .locals 0

    .line 2
    iput-object p1, p0, Lm2/f$a$a;->a:Lm2/f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lm2/f$a;Lm2/g;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm2/f$a$a;-><init>(Lm2/f$a;)V

    return-void
.end method


# virtual methods
.method public onCancellation(Lm2/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onFailure(Lm2/c;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm2/f$a$a;->a:Lm2/f$a;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lm2/f$a;->v(Lm2/f$a;Lm2/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onNewResult(Lm2/c;)V
    .locals 1

    .line 1
    invoke-interface {p1}, Lm2/c;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lm2/f$a$a;->a:Lm2/f$a;

    .line 8
    .line 9
    invoke-static {v0, p1}, Lm2/f$a;->w(Lm2/f$a;Lm2/c;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-interface {p1}, Lm2/c;->isFinished()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    iget-object v0, p0, Lm2/f$a$a;->a:Lm2/f$a;

    .line 20
    .line 21
    invoke-static {v0, p1}, Lm2/f$a;->v(Lm2/f$a;Lm2/c;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    return-void
.end method

.method public onProgressUpdate(Lm2/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/f$a$a;->a:Lm2/f$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm2/a;->d()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lm2/f$a$a;->a:Lm2/f$a;

    .line 8
    .line 9
    invoke-interface {p1}, Lm2/c;->d()F

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {v0, p1}, Ljava/lang/Math;->max(FF)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v1, p1}, Lm2/a;->q(F)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method
