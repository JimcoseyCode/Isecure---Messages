.class public final LI4/c1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LI4/L6;

.field private final b:Ljava/lang/Boolean;

.field private final c:Ljava/lang/Boolean;

.field private final d:LI4/u6;

.field private final e:LI4/g9;

.field private final f:LI4/h0;

.field private final g:LI4/h0;


# direct methods
.method synthetic constructor <init>(LI4/a1;LI4/b1;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LI4/a1;->i(LI4/a1;)LI4/L6;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    iput-object p2, p0, LI4/c1;->a:LI4/L6;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    iput-object p2, p0, LI4/c1;->b:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-static {p1}, LI4/a1;->k(LI4/a1;)Ljava/lang/Boolean;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LI4/c1;->c:Ljava/lang/Boolean;

    .line 18
    .line 19
    iput-object p2, p0, LI4/c1;->d:LI4/u6;

    .line 20
    .line 21
    invoke-static {p1}, LI4/a1;->j(LI4/a1;)LI4/g9;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    iput-object p2, p0, LI4/c1;->e:LI4/g9;

    .line 26
    .line 27
    invoke-static {p1}, LI4/a1;->a(LI4/a1;)LI4/h0;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    iput-object p2, p0, LI4/c1;->f:LI4/h0;

    .line 32
    .line 33
    invoke-static {p1}, LI4/a1;->b(LI4/a1;)LI4/h0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, LI4/c1;->g:LI4/h0;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a()LI4/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/c1;->f:LI4/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()LI4/h0;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/c1;->g:LI4/h0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()LI4/L6;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/c1;->a:LI4/L6;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LI4/g9;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/c1;->e:LI4/g9;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, LI4/c1;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, LI4/c1;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, LI4/c1;

    .line 12
    .line 13
    iget-object v1, p0, LI4/c1;->a:LI4/L6;

    .line 14
    .line 15
    iget-object v3, p1, LI4/c1;->a:LI4/L6;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    invoke-static {v1, v1}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    iget-object v3, p0, LI4/c1;->c:Ljava/lang/Boolean;

    .line 31
    .line 32
    iget-object v4, p1, LI4/c1;->c:Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-static {v3, v4}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_2

    .line 39
    .line 40
    invoke-static {v1, v1}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, LI4/c1;->e:LI4/g9;

    .line 47
    .line 48
    iget-object v3, p1, LI4/c1;->e:LI4/g9;

    .line 49
    .line 50
    invoke-static {v1, v3}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_2

    .line 55
    .line 56
    iget-object v1, p0, LI4/c1;->f:LI4/h0;

    .line 57
    .line 58
    iget-object v3, p1, LI4/c1;->f:LI4/h0;

    .line 59
    .line 60
    invoke-static {v1, v3}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    iget-object v1, p0, LI4/c1;->g:LI4/h0;

    .line 67
    .line 68
    iget-object p1, p1, LI4/c1;->g:LI4/h0;

    .line 69
    .line 70
    invoke-static {v1, p1}, Lr4/h;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_2

    .line 75
    .line 76
    return v0

    .line 77
    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 7

    .line 1
    iget-object v0, p0, LI4/c1;->a:LI4/L6;

    .line 2
    .line 3
    iget-object v2, p0, LI4/c1;->c:Ljava/lang/Boolean;

    .line 4
    .line 5
    iget-object v4, p0, LI4/c1;->e:LI4/g9;

    .line 6
    .line 7
    iget-object v5, p0, LI4/c1;->f:LI4/h0;

    .line 8
    .line 9
    iget-object v6, p0, LI4/c1;->g:LI4/h0;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    filled-new-array/range {v0 .. v6}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lr4/h;->b([Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    return v0
.end method
