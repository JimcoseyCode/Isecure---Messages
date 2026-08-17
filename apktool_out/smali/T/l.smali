.class public LT/l;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LF/B;


# instance fields
.field private final a:LF/B;

.field private final b:LF/u1;

.field private final c:J


# direct methods
.method private constructor <init>(LF/B;LF/u1;J)V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, LT/l;->a:LF/B;

    .line 5
    iput-object p2, p0, LT/l;->b:LF/u1;

    .line 6
    iput-wide p3, p0, LT/l;->c:J

    return-void
.end method

.method public constructor <init>(LF/u1;J)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0, p1, p2, p3}, LT/l;-><init>(LF/B;LF/u1;J)V

    return-void
.end method

.method public constructor <init>(LF/u1;LF/B;)V
    .locals 2

    const-wide/16 v0, -0x1

    .line 1
    invoke-direct {p0, p2, p1, v0, v1}, LT/l;-><init>(LF/B;LF/u1;J)V

    return-void
.end method


# virtual methods
.method public a()J
    .locals 4

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->a()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget-wide v0, p0, LT/l;->c:J

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long v2, v0, v2

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    return-wide v0

    .line 19
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v1, "No timestamp is available."

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw v0
.end method

.method public b()LF/u1;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->b:LF/u1;

    .line 2
    .line 3
    return-object v0
.end method

.method public c()LF/A;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->c()LF/A;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/A;->g:LF/A;

    .line 11
    .line 12
    return-object v0
.end method

.method public e()LF/z;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->e()LF/z;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/z;->g:LF/z;

    .line 11
    .line 12
    return-object v0
.end method

.method public f()LF/y;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->f()LF/y;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/y;->g:LF/y;

    .line 11
    .line 12
    return-object v0
.end method

.method public g()LF/w;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->g()LF/w;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/w;->g:LF/w;

    .line 11
    .line 12
    return-object v0
.end method

.method public h()LF/v;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->h()LF/v;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/v;->g:LF/v;

    .line 11
    .line 12
    return-object v0
.end method

.method public j()LF/u;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->j()LF/u;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/u;->g:LF/u;

    .line 11
    .line 12
    return-object v0
.end method

.method public k()LF/x;
    .locals 1

    .line 1
    iget-object v0, p0, LT/l;->a:LF/B;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, LF/B;->k()LF/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    sget-object v0, LF/x;->g:LF/x;

    .line 11
    .line 12
    return-object v0
.end method
