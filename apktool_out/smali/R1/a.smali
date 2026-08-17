.class public abstract LR1/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LR1/a$d;,
        LR1/a$g;,
        LR1/a$e;,
        LR1/a$f;
    }
.end annotation


# static fields
.field private static final a:LR1/a$g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LR1/a$a;

    .line 2
    .line 3
    invoke-direct {v0}, LR1/a$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LR1/a;->a:LR1/a$g;

    .line 7
    .line 8
    return-void
.end method

.method private static a(LH0/e;LR1/a$d;)LH0/e;
    .locals 1

    .line 1
    invoke-static {}, LR1/a;->c()LR1/a$g;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, p1, v0}, LR1/a;->b(LH0/e;LR1/a$d;LR1/a$g;)LH0/e;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method private static b(LH0/e;LR1/a$d;LR1/a$g;)LH0/e;
    .locals 1

    .line 1
    new-instance v0, LR1/a$e;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1, p2}, LR1/a$e;-><init>(LH0/e;LR1/a$d;LR1/a$g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method private static c()LR1/a$g;
    .locals 1

    .line 1
    sget-object v0, LR1/a;->a:LR1/a$g;

    .line 2
    .line 3
    return-object v0
.end method

.method public static d(ILR1/a$d;)LH0/e;
    .locals 1

    .line 1
    new-instance v0, LH0/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LH0/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {v0, p1}, LR1/a;->a(LH0/e;LR1/a$d;)LH0/e;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public static e()LH0/e;
    .locals 1

    .line 1
    const/16 v0, 0x14

    .line 2
    .line 3
    invoke-static {v0}, LR1/a;->f(I)LH0/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static f(I)LH0/e;
    .locals 2

    .line 1
    new-instance v0, LH0/f;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LH0/f;-><init>(I)V

    .line 4
    .line 5
    .line 6
    new-instance p0, LR1/a$b;

    .line 7
    .line 8
    invoke-direct {p0}, LR1/a$b;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, LR1/a$c;

    .line 12
    .line 13
    invoke-direct {v1}, LR1/a$c;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, p0, v1}, LR1/a;->b(LH0/e;LR1/a$d;LR1/a$g;)LH0/e;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method
