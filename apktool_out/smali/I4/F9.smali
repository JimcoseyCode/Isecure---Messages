.class public final LI4/F9;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI4/n9;


# instance fields
.field private a:LC5/b;

.field private final b:LC5/b;

.field private final c:LI4/p9;


# direct methods
.method public constructor <init>(Landroid/content/Context;LI4/p9;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, LI4/F9;->c:LI4/p9;

    .line 5
    .line 6
    sget-object p2, Lcom/google/android/datatransport/cct/a;->g:Lcom/google/android/datatransport/cct/a;

    .line 7
    .line 8
    invoke-static {p1}, LW3/t;->f(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, LW3/t;->c()LW3/t;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1, p2}, LW3/t;->g(LW3/f;)LU3/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2}, Lcom/google/android/datatransport/cct/a;->a()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const-string v0, "json"

    .line 24
    .line 25
    invoke-static {v0}, LU3/c;->b(Ljava/lang/String;)LU3/c;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-interface {p2, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p2

    .line 33
    if-eqz p2, :cond_0

    .line 34
    .line 35
    new-instance p2, Lq5/w;

    .line 36
    .line 37
    new-instance v0, LI4/C9;

    .line 38
    .line 39
    invoke-direct {v0, p1}, LI4/C9;-><init>(LU3/i;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p2, v0}, Lq5/w;-><init>(LC5/b;)V

    .line 43
    .line 44
    .line 45
    iput-object p2, p0, LI4/F9;->a:LC5/b;

    .line 46
    .line 47
    :cond_0
    new-instance p2, Lq5/w;

    .line 48
    .line 49
    new-instance v0, LI4/D9;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LI4/D9;-><init>(LU3/i;)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, v0}, Lq5/w;-><init>(LC5/b;)V

    .line 55
    .line 56
    .line 57
    iput-object p2, p0, LI4/F9;->b:LC5/b;

    .line 58
    .line 59
    return-void
.end method

.method static b(LI4/p9;LI4/m9;)LU3/d;
    .locals 2

    .line 1
    invoke-virtual {p0}, LI4/p9;->a()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    invoke-interface {p1}, LI4/m9;->zza()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1, p0, v1}, LI4/m9;->d(IZ)[B

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, LU3/d;->e(Ljava/lang/Object;)LU3/d;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :cond_0
    invoke-interface {p1, p0, v1}, LI4/m9;->d(IZ)[B

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0}, LU3/d;->g(Ljava/lang/Object;)LU3/d;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method


# virtual methods
.method public final a(LI4/m9;)V
    .locals 2

    .line 1
    iget-object v0, p0, LI4/F9;->c:LI4/p9;

    .line 2
    .line 3
    invoke-virtual {v0}, LI4/p9;->a()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LI4/F9;->a:LC5/b;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, LC5/b;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, LU3/h;

    .line 18
    .line 19
    iget-object v1, p0, LI4/F9;->c:LI4/p9;

    .line 20
    .line 21
    invoke-static {v1, p1}, LI4/F9;->b(LI4/p9;LI4/m9;)LU3/d;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-interface {v0, p1}, LU3/h;->a(LU3/d;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void

    .line 29
    :cond_1
    iget-object v0, p0, LI4/F9;->b:LC5/b;

    .line 30
    .line 31
    invoke-interface {v0}, LC5/b;->get()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, LU3/h;

    .line 36
    .line 37
    iget-object v1, p0, LI4/F9;->c:LI4/p9;

    .line 38
    .line 39
    invoke-static {v1, p1}, LI4/F9;->b(LI4/p9;LI4/m9;)LU3/d;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, LU3/h;->a(LU3/d;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
