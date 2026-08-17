.class final LX5/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX5/g;


# instance fields
.field private final a:LX5/e;

.field private final b:LX5/e;


# direct methods
.method constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LX5/e;->b()LX5/e;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, LX5/b;->a:LX5/e;

    .line 9
    .line 10
    invoke-static {}, LX5/e;->c()LX5/e;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, LX5/b;->b:LX5/e;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(LT5/g;)V
    .locals 1

    .line 1
    iget-object v0, p0, LX5/b;->b:LX5/e;

    .line 2
    .line 3
    invoke-virtual {v0}, LX5/e;->d()LX5/e$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0, p1}, LX5/e$c;->a(LT5/g;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, LU5/a;->b(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    iget-object v0, p0, LX5/b;->b:LX5/e;

    .line 20
    .line 21
    invoke-virtual {v0, p1}, LX5/e;->a(LT5/g;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    iget-object v0, p0, LX5/b;->a:LX5/e;

    .line 26
    .line 27
    invoke-virtual {v0, p1}, LX5/e;->a(LT5/g;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method b(I)LT5/g;
    .locals 1

    .line 1
    iget-object v0, p0, LX5/b;->a:LX5/e;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {v0, p1}, LX5/e;->e(Ljava/lang/Object;)LT5/g;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method c(Ljava/lang/String;)LT5/g;
    .locals 1

    .line 1
    iget-object v0, p0, LX5/b;->b:LX5/e;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LX5/e;->e(Ljava/lang/Object;)LT5/g;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
