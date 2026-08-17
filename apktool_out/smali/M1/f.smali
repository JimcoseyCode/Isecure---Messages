.class public LM1/f;
.super LM1/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static G:LM1/f;

.field private static H:LM1/f;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LM1/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static g0(Ljava/lang/Class;)LM1/f;
    .locals 1

    .line 1
    new-instance v0, LM1/f;

    .line 2
    .line 3
    invoke-direct {v0}, LM1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LM1/a;->f(Ljava/lang/Class;)LM1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, LM1/f;

    .line 11
    .line 12
    return-object p0
.end method

.method public static h0(Lx1/j;)LM1/f;
    .locals 1

    .line 1
    new-instance v0, LM1/f;

    .line 2
    .line 3
    invoke-direct {v0}, LM1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LM1/a;->g(Lx1/j;)LM1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, LM1/f;

    .line 11
    .line 12
    return-object p0
.end method

.method public static i0(Lv1/f;)LM1/f;
    .locals 1

    .line 1
    new-instance v0, LM1/f;

    .line 2
    .line 3
    invoke-direct {v0}, LM1/f;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LM1/a;->Y(Lv1/f;)LM1/a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, LM1/f;

    .line 11
    .line 12
    return-object p0
.end method

.method public static j0(Z)LM1/f;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    sget-object p0, LM1/f;->G:LM1/f;

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    new-instance p0, LM1/f;

    .line 8
    .line 9
    invoke-direct {p0}, LM1/f;-><init>()V

    .line 10
    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-virtual {p0, v0}, LM1/a;->a0(Z)LM1/a;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, LM1/f;

    .line 18
    .line 19
    invoke-virtual {p0}, LM1/a;->b()LM1/a;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, LM1/f;

    .line 24
    .line 25
    sput-object p0, LM1/f;->G:LM1/f;

    .line 26
    .line 27
    :cond_0
    sget-object p0, LM1/f;->G:LM1/f;

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    sget-object p0, LM1/f;->H:LM1/f;

    .line 31
    .line 32
    if-nez p0, :cond_2

    .line 33
    .line 34
    new-instance p0, LM1/f;

    .line 35
    .line 36
    invoke-direct {p0}, LM1/f;-><init>()V

    .line 37
    .line 38
    .line 39
    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, v0}, LM1/a;->a0(Z)LM1/a;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, LM1/f;

    .line 45
    .line 46
    invoke-virtual {p0}, LM1/a;->b()LM1/a;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    check-cast p0, LM1/f;

    .line 51
    .line 52
    sput-object p0, LM1/f;->H:LM1/f;

    .line 53
    .line 54
    :cond_2
    sget-object p0, LM1/f;->H:LM1/f;

    .line 55
    .line 56
    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LM1/f;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, LM1/a;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    return p1

    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, LM1/a;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    return v0
.end method
