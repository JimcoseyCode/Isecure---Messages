.class abstract Lr/f2$b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr/f2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x408
    name = "b"
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

.method static f(Ljava/util/List;Ljava/util/List;III)Lr/f2$b;
    .locals 6

    .line 1
    new-instance v0, Lr/e;

    .line 2
    .line 3
    move-object v1, p0

    .line 4
    move-object v2, p1

    .line 5
    move v3, p2

    .line 6
    move v4, p3

    .line 7
    move v5, p4

    .line 8
    invoke-direct/range {v0 .. v5}, Lr/e;-><init>(Ljava/util/List;Ljava/util/List;III)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method abstract a()Ljava/util/List;
.end method

.method abstract b()Ljava/util/List;
.end method

.method abstract c()I
.end method

.method abstract d()I
.end method

.method abstract e()I
.end method
