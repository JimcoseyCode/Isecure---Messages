.class final LW3/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU3/h;


# instance fields
.field private final a:LW3/o;

.field private final b:Ljava/lang/String;

.field private final c:LU3/c;

.field private final d:LU3/g;

.field private final e:LW3/s;


# direct methods
.method constructor <init>(LW3/o;Ljava/lang/String;LU3/c;LU3/g;LW3/s;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW3/r;->a:LW3/o;

    .line 5
    .line 6
    iput-object p2, p0, LW3/r;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p3, p0, LW3/r;->c:LU3/c;

    .line 9
    .line 10
    iput-object p4, p0, LW3/r;->d:LU3/g;

    .line 11
    .line 12
    iput-object p5, p0, LW3/r;->e:LW3/s;

    .line 13
    .line 14
    return-void
.end method

.method public static synthetic b(Ljava/lang/Exception;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public a(LU3/d;)V
    .locals 1

    .line 1
    new-instance v0, LW3/q;

    .line 2
    .line 3
    invoke-direct {v0}, LW3/q;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1, v0}, LW3/r;->c(LU3/d;LU3/j;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public c(LU3/d;LU3/j;)V
    .locals 3

    .line 1
    iget-object v0, p0, LW3/r;->e:LW3/s;

    .line 2
    .line 3
    invoke-static {}, LW3/n;->a()LW3/n$a;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object v2, p0, LW3/r;->a:LW3/o;

    .line 8
    .line 9
    invoke-virtual {v1, v2}, LW3/n$a;->e(LW3/o;)LW3/n$a;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, LW3/n$a;->c(LU3/d;)LW3/n$a;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iget-object v1, p0, LW3/r;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, LW3/n$a;->f(Ljava/lang/String;)LW3/n$a;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, LW3/r;->d:LU3/g;

    .line 24
    .line 25
    invoke-virtual {p1, v1}, LW3/n$a;->d(LU3/g;)LW3/n$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget-object v1, p0, LW3/r;->c:LU3/c;

    .line 30
    .line 31
    invoke-virtual {p1, v1}, LW3/n$a;->b(LU3/c;)LW3/n$a;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p1}, LW3/n$a;->a()LW3/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {v0, p1, p2}, LW3/s;->a(LW3/n;LU3/j;)V

    .line 40
    .line 41
    .line 42
    return-void
.end method
