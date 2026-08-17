.class final Ll9/b$f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lt9/D;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field private final g:Lt9/o;

.field private h:Z

.field final synthetic i:Ll9/b;


# direct methods
.method public constructor <init>(Ll9/b;)V
    .locals 1

    .line 1
    iput-object p1, p0, Ll9/b$f;->i:Ll9/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lt9/o;

    .line 7
    .line 8
    invoke-static {p1}, Ll9/b;->l(Ll9/b;)Lt9/i;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Lt9/D;->timeout()Lt9/G;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-direct {v0, p1}, Lt9/o;-><init>(Lt9/G;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Ll9/b$f;->g:Lt9/o;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public close()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Ll9/b$f;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Ll9/b$f;->h:Z

    .line 8
    .line 9
    iget-object v0, p0, Ll9/b$f;->i:Ll9/b;

    .line 10
    .line 11
    iget-object v1, p0, Ll9/b$f;->g:Lt9/o;

    .line 12
    .line 13
    invoke-static {v0, v1}, Ll9/b;->i(Ll9/b;Lt9/o;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Ll9/b$f;->i:Ll9/b;

    .line 17
    .line 18
    const/4 v1, 0x3

    .line 19
    invoke-static {v0, v1}, Ll9/b;->p(Ll9/b;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Ll9/b$f;->h:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Ll9/b$f;->i:Ll9/b;

    .line 7
    .line 8
    invoke-static {v0}, Ll9/b;->l(Ll9/b;)Lt9/i;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-interface {v0}, Lt9/i;->flush()V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public timeout()Lt9/G;
    .locals 1

    .line 1
    iget-object v0, p0, Ll9/b$f;->g:Lt9/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public write(Lt9/h;J)V
    .locals 7

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Ll9/b$f;->h:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Lt9/h;->size()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    move-wide v5, p2

    .line 17
    invoke-static/range {v1 .. v6}, Lf9/c;->i(JJJ)V

    .line 18
    .line 19
    .line 20
    iget-object p2, p0, Ll9/b$f;->i:Ll9/b;

    .line 21
    .line 22
    invoke-static {p2}, Ll9/b;->l(Ll9/b;)Lt9/i;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-interface {p2, p1, v5, v6}, Lt9/D;->write(Lt9/h;J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 31
    .line 32
    const-string p2, "closed"

    .line 33
    .line 34
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1
.end method
