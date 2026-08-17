.class public final LI4/J;
.super LI4/K;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 1
    new-instance v0, LI4/X;

    .line 2
    .line 3
    const/16 v1, 0xc

    .line 4
    .line 5
    invoke-direct {v0, v1}, LI4/X;-><init>(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, LI4/K;-><init>(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static p()LI4/J;
    .locals 1

    .line 1
    new-instance v0, LI4/J;

    .line 2
    .line 3
    invoke-direct {v0}, LI4/J;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method final bridge synthetic g()Ljava/util/Collection;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method
