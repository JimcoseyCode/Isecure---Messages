.class public final Lh6/f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lh6/h;

.field private final b:Lc6/d;

.field private final c:Lc6/i;


# direct methods
.method constructor <init>(Lh6/h;Lc6/d;Lc6/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh6/f;->a:Lh6/h;

    .line 5
    .line 6
    iput-object p2, p0, Lh6/f;->b:Lc6/d;

    .line 7
    .line 8
    iput-object p3, p0, Lh6/f;->c:Lc6/i;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Le6/b;)Lh6/g;
    .locals 7

    .line 1
    iget-object v0, p0, Lh6/f;->a:Lh6/h;

    .line 2
    .line 3
    new-instance v1, Lh6/g;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lc6/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    move-object v3, v0

    .line 10
    check-cast v3, Lh6/k;

    .line 11
    .line 12
    iget-object v0, p0, Lh6/f;->b:Lc6/d;

    .line 13
    .line 14
    invoke-virtual {p1}, Le6/b;->c()Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v0, v2}, Lc6/d;->a(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-static {}, Lh6/b;->d()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-static {v0}, LI4/J9;->b(Ljava/lang/String;)LI4/x9;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, p0, Lh6/f;->c:Lc6/i;

    .line 31
    .line 32
    move-object v2, p1

    .line 33
    invoke-direct/range {v1 .. v6}, Lh6/g;-><init>(Le6/b;Lh6/k;Ljava/util/concurrent/Executor;LI4/x9;Lc6/i;)V

    .line 34
    .line 35
    .line 36
    return-object v1
.end method
