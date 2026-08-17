.class LU1/b$i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LU1/b$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU1/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "i"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(LU1/b$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, LU1/b$i;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LU1/b$q;LU1/g$L;)Z
    .locals 1

    .line 1
    instance-of p1, p2, LU1/g$J;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    check-cast p2, LU1/g$J;

    .line 7
    .line 8
    invoke-interface {p2}, LU1/g$J;->b()Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    return v0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1

    .line 21
    :cond_1
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "empty"

    .line 2
    .line 3
    return-object v0
.end method
