.class Lm2/h$a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm2/e;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm2/h$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field private a:I

.field final synthetic b:Lm2/h$a;


# direct methods
.method public constructor <init>(Lm2/h$a;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm2/h$a$a;->b:Lm2/h$a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p2, p0, Lm2/h$a$a;->a:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onCancellation(Lm2/c;)V
    .locals 0

    .line 1
    return-void
.end method

.method public onFailure(Lm2/c;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lm2/h$a$a;->b:Lm2/h$a;

    .line 2
    .line 3
    iget v1, p0, Lm2/h$a$a;->a:I

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Lm2/h$a;->v(Lm2/h$a;ILm2/c;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onNewResult(Lm2/c;)V
    .locals 2

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
    iget-object v0, p0, Lm2/h$a$a;->b:Lm2/h$a;

    .line 8
    .line 9
    iget v1, p0, Lm2/h$a$a;->a:I

    .line 10
    .line 11
    invoke-static {v0, v1, p1}, Lm2/h$a;->w(Lm2/h$a;ILm2/c;)V

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p1}, Lm2/c;->isFinished()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lm2/h$a$a;->b:Lm2/h$a;

    .line 22
    .line 23
    iget v1, p0, Lm2/h$a$a;->a:I

    .line 24
    .line 25
    invoke-static {v0, v1, p1}, Lm2/h$a;->v(Lm2/h$a;ILm2/c;)V

    .line 26
    .line 27
    .line 28
    :cond_1
    return-void
.end method

.method public onProgressUpdate(Lm2/c;)V
    .locals 1

    .line 1
    iget v0, p0, Lm2/h$a$a;->a:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lm2/h$a$a;->b:Lm2/h$a;

    .line 6
    .line 7
    invoke-interface {p1}, Lm2/c;->d()F

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    invoke-virtual {v0, p1}, Lm2/a;->q(F)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
