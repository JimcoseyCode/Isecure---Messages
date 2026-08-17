.class public LC1/a$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LB1/o;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private final a:LB1/m;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LB1/m;

    .line 5
    .line 6
    const-wide/16 v1, 0x1f4

    .line 7
    .line 8
    invoke-direct {v0, v1, v2}, LB1/m;-><init>(J)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, LC1/a$a;->a:LB1/m;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public build(LB1/r;)LB1/n;
    .locals 1

    .line 1
    new-instance p1, LC1/a;

    .line 2
    .line 3
    iget-object v0, p0, LC1/a$a;->a:LB1/m;

    .line 4
    .line 5
    invoke-direct {p1, v0}, LC1/a;-><init>(LB1/m;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public teardown()V
    .locals 0

    .line 1
    return-void
.end method
