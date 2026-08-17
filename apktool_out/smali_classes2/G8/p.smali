.class public abstract LG8/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG8/p$a;
    }
.end annotation


# direct methods
.method public static final a(LC8/N0;)LG8/s;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, LG8/p$a;->a:[I

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    aget p0, v0, p0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    if-eq p0, v0, :cond_2

    .line 16
    .line 17
    const/4 v0, 0x2

    .line 18
    if-eq p0, v0, :cond_1

    .line 19
    .line 20
    const/4 v0, 0x3

    .line 21
    if-ne p0, v0, :cond_0

    .line 22
    .line 23
    sget-object p0, LG8/s;->i:LG8/s;

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    new-instance p0, Li7/m;

    .line 27
    .line 28
    invoke-direct {p0}, Li7/m;-><init>()V

    .line 29
    .line 30
    .line 31
    throw p0

    .line 32
    :cond_1
    sget-object p0, LG8/s;->h:LG8/s;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    sget-object p0, LG8/s;->j:LG8/s;

    .line 36
    .line 37
    return-object p0
.end method
