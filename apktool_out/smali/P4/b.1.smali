.class public LP4/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LP4/t;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LP4/t;

    .line 5
    .line 6
    invoke-direct {v0}, LP4/t;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LP4/b;->a:LP4/t;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/b;->a:LP4/t;

    .line 2
    .line 3
    invoke-virtual {v0}, LP4/t;->c()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public b()LP4/a;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/b;->a:LP4/t;

    .line 2
    .line 3
    return-object v0
.end method
