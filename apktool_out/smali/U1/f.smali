.class public LU1/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field a:LU1/b$r;

.field b:LU1/e;

.field c:Ljava/lang/String;

.field d:LU1/g$b;

.field e:Ljava/lang/String;

.field f:LU1/g$b;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LU1/f;->a:LU1/b$r;

    .line 3
    iput-object v0, p0, LU1/f;->b:LU1/e;

    .line 4
    iput-object v0, p0, LU1/f;->c:Ljava/lang/String;

    .line 5
    iput-object v0, p0, LU1/f;->d:LU1/g$b;

    .line 6
    iput-object v0, p0, LU1/f;->e:Ljava/lang/String;

    .line 7
    iput-object v0, p0, LU1/f;->f:LU1/g$b;

    return-void
.end method

.method public constructor <init>(LU1/f;)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, LU1/f;->a:LU1/b$r;

    .line 10
    iput-object v0, p0, LU1/f;->b:LU1/e;

    .line 11
    iput-object v0, p0, LU1/f;->c:Ljava/lang/String;

    .line 12
    iput-object v0, p0, LU1/f;->d:LU1/g$b;

    .line 13
    iput-object v0, p0, LU1/f;->e:Ljava/lang/String;

    .line 14
    iput-object v0, p0, LU1/f;->f:LU1/g$b;

    if-nez p1, :cond_0

    return-void

    .line 15
    :cond_0
    iget-object v0, p1, LU1/f;->a:LU1/b$r;

    iput-object v0, p0, LU1/f;->a:LU1/b$r;

    .line 16
    iget-object v0, p1, LU1/f;->b:LU1/e;

    iput-object v0, p0, LU1/f;->b:LU1/e;

    .line 17
    iget-object v0, p1, LU1/f;->d:LU1/g$b;

    iput-object v0, p0, LU1/f;->d:LU1/g$b;

    .line 18
    iget-object v0, p1, LU1/f;->e:Ljava/lang/String;

    iput-object v0, p0, LU1/f;->e:Ljava/lang/String;

    .line 19
    iget-object p1, p1, LU1/f;->f:LU1/g$b;

    iput-object p1, p0, LU1/f;->f:LU1/g$b;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->a:LU1/b$r;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, LU1/b$r;->f()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-lez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
.end method

.method public b()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->b:LU1/e;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public d()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->e:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public e()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->d:LU1/g$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU1/f;->f:LU1/g$b;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public g(FFFF)LU1/f;
    .locals 1

    .line 1
    new-instance v0, LU1/g$b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2, p3, p4}, LU1/g$b;-><init>(FFFF)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, LU1/f;->f:LU1/g$b;

    .line 7
    .line 8
    return-object p0
.end method
