.class public LW2/u;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW2/x;


# instance fields
.field private final a:LW2/x;

.field private final b:LW2/z;


# direct methods
.method public constructor <init>(LW2/x;LW2/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW2/u;->a:LW2/x;

    .line 5
    .line 6
    iput-object p2, p0, LW2/u;->b:LW2/z;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LW2/u;->a:LW2/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW2/x;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b(Lc2/l;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LW2/u;->a:LW2/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW2/x;->b(Lc2/l;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(Lc2/l;)I
    .locals 1

    .line 1
    iget-object v0, p0, LW2/u;->a:LW2/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW2/x;->d(Lc2/l;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public f(Ljava/lang/Object;Lg2/a;)Lg2/a;
    .locals 1

    .line 1
    iget-object v0, p0, LW2/u;->b:LW2/z;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW2/z;->c(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LW2/u;->a:LW2/x;

    .line 7
    .line 8
    invoke-interface {v0, p1, p2}, LW2/x;->f(Ljava/lang/Object;Lg2/a;)Lg2/a;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public get(Ljava/lang/Object;)Lg2/a;
    .locals 2

    .line 1
    iget-object v0, p0, LW2/u;->a:LW2/x;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LW2/x;->get(Ljava/lang/Object;)Lg2/a;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, LW2/u;->b:LW2/z;

    .line 10
    .line 11
    invoke-interface {v1, p1}, LW2/z;->b(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    iget-object v1, p0, LW2/u;->b:LW2/z;

    .line 16
    .line 17
    invoke-interface {v1, p1}, LW2/z;->a(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-object v0
.end method
