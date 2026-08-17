.class public abstract LV3/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


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

.method public static a(Ljava/util/List;)LV3/j;
    .locals 1

    .line 1
    new-instance v0, LV3/d;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LV3/d;-><init>(Ljava/util/List;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static b()Lv5/a;
    .locals 2

    .line 1
    new-instance v0, Lx5/d;

    .line 2
    .line 3
    invoke-direct {v0}, Lx5/d;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, LV3/b;->a:Lw5/a;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lx5/d;->j(Lw5/a;)Lx5/d;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x1

    .line 13
    invoke-virtual {v0, v1}, Lx5/d;->k(Z)Lx5/d;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lx5/d;->i()Lv5/a;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
.end method
