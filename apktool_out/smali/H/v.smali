.class public abstract LH/v;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static a(LS/c;LS/c;)LS/c;
    .locals 1

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    if-nez p0, :cond_1

    .line 5
    .line 6
    return-object p1

    .line 7
    :cond_1
    invoke-static {p0}, LS/c$a;->b(LS/c;)LS/c$a;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p1}, LS/c;->b()LS/a;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_2

    .line 16
    .line 17
    invoke-virtual {p1}, LS/c;->b()LS/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {p0, v0}, LS/c$a;->d(LS/a;)LS/c$a;

    .line 22
    .line 23
    .line 24
    :cond_2
    invoke-virtual {p1}, LS/c;->d()LS/d;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    if-eqz v0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p1}, LS/c;->d()LS/d;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {p0, v0}, LS/c$a;->f(LS/d;)LS/c$a;

    .line 35
    .line 36
    .line 37
    :cond_3
    invoke-virtual {p1}, LS/c;->c()LS/b;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_4

    .line 42
    .line 43
    invoke-virtual {p1}, LS/c;->c()LS/b;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, LS/c$a;->e(LS/b;)LS/c$a;

    .line 48
    .line 49
    .line 50
    :cond_4
    invoke-virtual {p1}, LS/c;->a()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_5

    .line 55
    .line 56
    invoke-virtual {p1}, LS/c;->a()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    invoke-virtual {p0, p1}, LS/c$a;->c(I)LS/c$a;

    .line 61
    .line 62
    .line 63
    :cond_5
    invoke-virtual {p0}, LS/c$a;->a()LS/c;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method
