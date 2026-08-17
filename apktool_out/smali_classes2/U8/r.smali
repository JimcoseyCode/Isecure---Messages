.class public abstract LU8/r;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:LW8/E;

.field private static final b:LW8/E;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LW8/E;

    .line 2
    .line 3
    const-string v1, "NONE"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LW8/E;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU8/r;->a:LW8/E;

    .line 9
    .line 10
    new-instance v0, LW8/E;

    .line 11
    .line 12
    const-string v1, "PENDING"

    .line 13
    .line 14
    invoke-direct {v0, v1}, LW8/E;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LU8/r;->b:LW8/E;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(Ljava/lang/Object;)LU8/l;
    .locals 1

    .line 1
    new-instance v0, LU8/q;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    sget-object p0, LV8/m;->a:LW8/E;

    .line 6
    .line 7
    :cond_0
    invoke-direct {v0, p0}, LU8/q;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public static final synthetic b()LW8/E;
    .locals 1

    .line 1
    sget-object v0, LU8/r;->a:LW8/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic c()LW8/E;
    .locals 1

    .line 1
    sget-object v0, LU8/r;->b:LW8/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final d(LU8/p;Ln7/j;ILT8/a;)LU8/b;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-ge p2, v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    const/4 v0, -0x2

    .line 8
    if-ne p2, v0, :cond_1

    .line 9
    .line 10
    :goto_0
    sget-object v0, LT8/a;->h:LT8/a;

    .line 11
    .line 12
    if-ne p3, v0, :cond_1

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_1
    invoke-static {p0, p1, p2, p3}, LU8/o;->a(LU8/n;Ln7/j;ILT8/a;)LU8/b;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
