.class abstract Lt7/n;
.super Lt7/m;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method public static o(Ljava/io/File;Lt7/i;)Lt7/h;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "direction"

    .line 7
    .line 8
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lt7/h;

    .line 12
    .line 13
    invoke-direct {v0, p0, p1}, Lt7/h;-><init>(Ljava/io/File;Lt7/i;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static final p(Ljava/io/File;)Lt7/h;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lt7/i;->h:Lt7/i;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lt7/n;->o(Ljava/io/File;Lt7/i;)Lt7/h;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method

.method public static final q(Ljava/io/File;)Lt7/h;
    .locals 1

    .line 1
    const-string v0, "<this>"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lt7/i;->g:Lt7/i;

    .line 7
    .line 8
    invoke-static {p0, v0}, Lt7/n;->o(Ljava/io/File;Lt7/i;)Lt7/h;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0
.end method
