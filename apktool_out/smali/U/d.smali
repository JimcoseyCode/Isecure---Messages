.class public LU/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static b:LU/d;


# instance fields
.field private final a:LU/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LU/d;

    .line 2
    .line 3
    const-string v1, "1.5.0"

    .line 4
    .line 5
    invoke-direct {v0, v1}, LU/d;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU/d;->b:LU/d;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LU/h;->t(Ljava/lang/String;)LU/h;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, LU/d;->a:LU/h;

    .line 9
    .line 10
    return-void
.end method

.method public static a()LU/d;
    .locals 1

    .line 1
    sget-object v0, LU/d;->b:LU/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public static c(LU/h;)Z
    .locals 2

    .line 1
    invoke-static {}, LU/d;->a()LU/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, LU/d;->a:LU/h;

    .line 6
    .line 7
    invoke-virtual {p0}, LU/h;->q()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {p0}, LU/h;->r()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {v0, v1, p0}, LU/h;->h(II)I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-ltz p0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x0

    .line 24
    return p0
.end method


# virtual methods
.method public b()LU/h;
    .locals 1

    .line 1
    iget-object v0, p0, LU/d;->a:LU/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LU/d;->a:LU/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LU/h;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
