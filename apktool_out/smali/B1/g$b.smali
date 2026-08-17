.class public LB1/g$b;
.super LB1/g$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LB1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    new-instance v0, LB1/g$b$a;

    .line 2
    .line 3
    invoke-direct {v0}, LB1/g$b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, LB1/g$a;-><init>(LB1/g$d;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method
