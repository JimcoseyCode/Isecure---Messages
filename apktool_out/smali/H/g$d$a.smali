.class final LH/g$d$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LH/g$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field final a:D


# direct methods
.method constructor <init>(D)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, LH/g$d$a;->a:D

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method a()D
    .locals 4

    .line 1
    iget-wide v0, p0, LH/g$d$a;->a:D

    .line 2
    .line 3
    const-wide v2, 0x4001e540cc78e9f7L    # 2.23694

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    div-double/2addr v0, v2

    .line 9
    return-wide v0
.end method
