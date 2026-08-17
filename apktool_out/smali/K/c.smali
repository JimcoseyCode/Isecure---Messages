.class public final LK/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ly/Y;


# instance fields
.field private final a:LF/B;


# direct methods
.method public constructor <init>(LF/B;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LK/c;->a:LF/B;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()J
    .locals 2

    .line 1
    iget-object v0, p0, LK/c;->a:LF/B;

    .line 2
    .line 3
    invoke-interface {v0}, LF/B;->a()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public b()LF/u1;
    .locals 1

    .line 1
    iget-object v0, p0, LK/c;->a:LF/B;

    .line 2
    .line 3
    invoke-interface {v0}, LF/B;->b()LF/u1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public c()I
    .locals 1

    .line 1
    iget-object v0, p0, LK/c;->a:LF/B;

    .line 2
    .line 3
    invoke-interface {v0}, LF/B;->c()LF/A;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LF/A;->j()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    return v0
.end method

.method public d(LH/i$b;)V
    .locals 1

    .line 1
    iget-object v0, p0, LK/c;->a:LF/B;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LF/B;->d(LH/i$b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e()I
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public f()LF/B;
    .locals 1

    .line 1
    iget-object v0, p0, LK/c;->a:LF/B;

    .line 2
    .line 3
    return-object v0
.end method
