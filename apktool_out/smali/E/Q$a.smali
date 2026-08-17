.class abstract LE/Q$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE/Q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "a"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method static e(ILjava/util/List;)LE/Q$a;
    .locals 3

    .line 1
    new-instance v0, LE/d;

    .line 2
    .line 3
    new-instance v1, LP/u;

    .line 4
    .line 5
    invoke-direct {v1}, LP/u;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, LP/u;

    .line 9
    .line 10
    invoke-direct {v2}, LP/u;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2, p0, p1}, LE/d;-><init>(LP/u;LP/u;ILjava/util/List;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method


# virtual methods
.method abstract a()LP/u;
.end method

.method abstract b()I
.end method

.method abstract c()Ljava/util/List;
.end method

.method abstract d()LP/u;
.end method
