.class LX1/a$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX1/f$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LX1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "e"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field final b:Ljava/io/File;

.field final synthetic c:LX1/a;


# direct methods
.method public constructor <init>(LX1/a;Ljava/lang/String;Ljava/io/File;)V
    .locals 0

    .line 1
    iput-object p1, p0, LX1/a$e;->c:LX1/a;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, LX1/a$e;->a:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LX1/a$e;->b:Ljava/io/File;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;J)LV1/a;
    .locals 2

    .line 1
    iget-object p1, p0, LX1/a$e;->c:LX1/a;

    .line 2
    .line 3
    iget-object v0, p0, LX1/a$e;->a:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, LX1/a;->q(Ljava/lang/String;)Ljava/io/File;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :try_start_0
    iget-object v0, p0, LX1/a$e;->b:Ljava/io/File;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lb2/c;->b(Ljava/io/File;Ljava/io/File;)V
    :try_end_0
    .catch Lb2/c$d; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, p2, p3}, Ljava/io/File;->setLastModified(J)Z

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-static {p1}, LV1/b;->b(Ljava/io/File;)LV1/b;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :catch_0
    move-exception p1

    .line 29
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    if-eqz p2, :cond_3

    .line 34
    .line 35
    instance-of p3, p2, Lb2/c$c;

    .line 36
    .line 37
    if-nez p3, :cond_2

    .line 38
    .line 39
    instance-of p2, p2, Ljava/io/FileNotFoundException;

    .line 40
    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    sget-object p2, LW1/a$a;->n:LW1/a$a;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object p2, LW1/a$a;->p:LW1/a$a;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    sget-object p2, LW1/a$a;->o:LW1/a$a;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    sget-object p2, LW1/a$a;->p:LW1/a$a;

    .line 53
    .line 54
    :goto_0
    iget-object p3, p0, LX1/a$e;->c:LX1/a;

    .line 55
    .line 56
    invoke-static {p3}, LX1/a;->i(LX1/a;)LW1/a;

    .line 57
    .line 58
    .line 59
    move-result-object p3

    .line 60
    invoke-static {}, LX1/a;->n()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "commit"

    .line 65
    .line 66
    invoke-interface {p3, p2, v0, v1, p1}, LW1/a;->a(LW1/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 67
    .line 68
    .line 69
    throw p1
.end method

.method public f()Z
    .locals 1

    .line 1
    iget-object v0, p0, LX1/a$e;->b:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, LX1/a$e;->b:Ljava/io/File;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public g(Ljava/lang/Object;)LV1/a;
    .locals 2

    .line 1
    iget-object v0, p0, LX1/a$e;->c:LX1/a;

    .line 2
    .line 3
    invoke-static {v0}, LX1/a;->j(LX1/a;)Lj2/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lj2/a;->now()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-virtual {p0, p1, v0, v1}, LX1/a$e;->a(Ljava/lang/Object;J)LV1/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public h(LW1/j;Ljava/lang/Object;)V
    .locals 4

    .line 1
    :try_start_0
    new-instance p2, Ljava/io/FileOutputStream;

    .line 2
    .line 3
    iget-object v0, p0, LX1/a$e;->b:Ljava/io/File;

    .line 4
    .line 5
    invoke-direct {p2, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 6
    .line 7
    .line 8
    :try_start_1
    new-instance v0, Lc2/c;

    .line 9
    .line 10
    invoke-direct {v0, p2}, Lc2/c;-><init>(Ljava/io/OutputStream;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1, v0}, LW1/j;->a(Ljava/io/OutputStream;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lc2/c;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LX1/a$e;->b:Ljava/io/File;

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 29
    .line 30
    .line 31
    move-result-wide p1

    .line 32
    cmp-long p1, p1, v0

    .line 33
    .line 34
    if-nez p1, :cond_0

    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    new-instance p1, LX1/a$d;

    .line 38
    .line 39
    iget-object p2, p0, LX1/a$e;->b:Ljava/io/File;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/io/File;->length()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-direct {p1, v0, v1, v2, v3}, LX1/a$d;-><init>(JJ)V

    .line 46
    .line 47
    .line 48
    throw p1

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    invoke-virtual {p2}, Ljava/io/FileOutputStream;->close()V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :catch_0
    move-exception p1

    .line 55
    iget-object p2, p0, LX1/a$e;->c:LX1/a;

    .line 56
    .line 57
    invoke-static {p2}, LX1/a;->i(LX1/a;)LW1/a;

    .line 58
    .line 59
    .line 60
    move-result-object p2

    .line 61
    sget-object v0, LW1/a$a;->m:LW1/a$a;

    .line 62
    .line 63
    invoke-static {}, LX1/a;->n()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    const-string v2, "updateResource"

    .line 68
    .line 69
    invoke-interface {p2, v0, v1, v2, p1}, LW1/a;->a(LW1/a$a;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    throw p1
.end method
