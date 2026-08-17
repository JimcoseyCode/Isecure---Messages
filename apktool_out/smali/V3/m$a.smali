.class public abstract LV3/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LV3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract a()LV3/m;
.end method

.method public abstract b(LV3/k;)LV3/m$a;
.end method

.method public abstract c(Ljava/util/List;)LV3/m$a;
.end method

.method abstract d(Ljava/lang/Integer;)LV3/m$a;
.end method

.method abstract e(Ljava/lang/String;)LV3/m$a;
.end method

.method public abstract f(LV3/p;)LV3/m$a;
.end method

.method public abstract g(J)LV3/m$a;
.end method

.method public abstract h(J)LV3/m$a;
.end method

.method public i(I)LV3/m$a;
    .locals 0

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0, p1}, LV3/m$a;->d(Ljava/lang/Integer;)LV3/m$a;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public j(Ljava/lang/String;)LV3/m$a;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LV3/m$a;->e(Ljava/lang/String;)LV3/m$a;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
