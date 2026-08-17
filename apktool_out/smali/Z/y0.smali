.class public abstract LZ/y0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LZ/y0$a;,
        LZ/y0$d;,
        LZ/y0$e;,
        LZ/y0$b;,
        LZ/y0$c;
    }
.end annotation


# instance fields
.field private final a:LZ/s;

.field private final b:LZ/c0;


# direct methods
.method constructor <init>(LZ/s;LZ/c0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, LZ/s;

    .line 9
    .line 10
    iput-object p1, p0, LZ/y0;->a:LZ/s;

    .line 11
    .line 12
    invoke-static {p2}, LH0/g;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LZ/c0;

    .line 17
    .line 18
    iput-object p1, p0, LZ/y0;->b:LZ/c0;

    .line 19
    .line 20
    return-void
.end method

.method static a(LZ/s;LZ/c0;LZ/t;)LZ/y0$a;
    .locals 6

    .line 1
    new-instance v0, LZ/y0$a;

    .line 2
    .line 3
    const/4 v4, 0x0

    .line 4
    const/4 v5, 0x0

    .line 5
    move-object v1, p0

    .line 6
    move-object v2, p1

    .line 7
    move-object v3, p2

    .line 8
    invoke-direct/range {v0 .. v5}, LZ/y0$a;-><init>(LZ/s;LZ/c0;LZ/t;ILjava/lang/Throwable;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method static b(LZ/s;LZ/c0;LZ/t;ILjava/lang/Throwable;)LZ/y0$a;
    .locals 8

    .line 1
    if-eqz p3, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    const-string v1, "An error type is required."

    .line 7
    .line 8
    invoke-static {v0, v1}, LH0/g;->b(ZLjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    new-instance v2, LZ/y0$a;

    .line 12
    .line 13
    move-object v3, p0

    .line 14
    move-object v4, p1

    .line 15
    move-object v5, p2

    .line 16
    move v6, p3

    .line 17
    move-object v7, p4

    .line 18
    invoke-direct/range {v2 .. v7}, LZ/y0$a;-><init>(LZ/s;LZ/c0;LZ/t;ILjava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    return-object v2
.end method

.method static d(LZ/s;LZ/c0;)LZ/y0$b;
    .locals 1

    .line 1
    new-instance v0, LZ/y0$b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LZ/y0$b;-><init>(LZ/s;LZ/c0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static e(LZ/s;LZ/c0;)LZ/y0$c;
    .locals 1

    .line 1
    new-instance v0, LZ/y0$c;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LZ/y0$c;-><init>(LZ/s;LZ/c0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static f(LZ/s;LZ/c0;)LZ/y0$d;
    .locals 1

    .line 1
    new-instance v0, LZ/y0$d;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LZ/y0$d;-><init>(LZ/s;LZ/c0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method static g(LZ/s;LZ/c0;)LZ/y0$e;
    .locals 1

    .line 1
    new-instance v0, LZ/y0$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, LZ/y0$e;-><init>(LZ/s;LZ/c0;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public c()LZ/s;
    .locals 1

    .line 1
    iget-object v0, p0, LZ/y0;->a:LZ/s;

    .line 2
    .line 3
    return-object v0
.end method
