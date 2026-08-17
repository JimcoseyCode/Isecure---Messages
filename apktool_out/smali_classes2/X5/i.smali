.class public final LX5/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX5/h;


# instance fields
.field private final a:LX5/l;

.field private final b:LX5/f;


# direct methods
.method public constructor <init>(LX5/l;LT5/b;LW5/b;)V
    .locals 2

    .line 4
    new-instance v0, LX5/a;

    new-instance v1, LX5/b;

    invoke-direct {v1}, LX5/b;-><init>()V

    invoke-direct {v0, p2, p3, v1}, LX5/a;-><init>(LT5/b;LW5/b;LX5/g;)V

    invoke-direct {p0, p1, v0}, LX5/i;-><init>(LX5/l;LX5/f;)V

    return-void
.end method

.method public constructor <init>(LX5/l;LX5/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LX5/i;->a:LX5/l;

    .line 3
    iput-object p2, p0, LX5/i;->b:LX5/f;

    return-void
.end method


# virtual methods
.method public a(I)LT5/g;
    .locals 3

    .line 1
    invoke-static {p1}, LU5/a;->a(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LX5/i;->b:LX5/f;

    .line 8
    .line 9
    iget-object v1, p0, LX5/i;->a:LX5/l;

    .line 10
    .line 11
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-interface {v1, v2}, LX5/l;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, LX5/f;->a(Ljava/lang/String;)LX5/g;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, LX5/b;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, LX5/b;->b(I)LT5/g;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    return-object p1

    .line 30
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 31
    .line 32
    new-instance v1, Ljava/lang/StringBuilder;

    .line 33
    .line 34
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p1, " calling code belongs to a geo entity"

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw v0
.end method

.method public b(Ljava/lang/String;)LT5/g;
    .locals 2

    .line 1
    invoke-static {p1}, LU5/a;->b(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, LX5/i;->b:LX5/f;

    .line 8
    .line 9
    iget-object v1, p0, LX5/i;->a:LX5/l;

    .line 10
    .line 11
    invoke-interface {v1, p1}, LX5/l;->a(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v0, v1}, LX5/f;->a(Ljava/lang/String;)LX5/g;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, LX5/b;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LX5/b;->c(Ljava/lang/String;)LT5/g;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string p1, " region code is a non-geo entity"

    .line 37
    .line 38
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    throw v0
.end method
