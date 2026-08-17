.class public LE/i;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP/y;


# instance fields
.field private final a:LP/w;


# direct methods
.method constructor <init>(LP/w;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE/i;->a:LP/w;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(LP/z;)LP/z;
    .locals 3

    .line 1
    iget-object v0, p0, LE/i;->a:LP/w;

    .line 2
    .line 3
    new-instance v1, LP/v;

    .line 4
    .line 5
    new-instance v2, LE/W;

    .line 6
    .line 7
    invoke-direct {v2, p1}, LE/W;-><init>(LP/z;)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {v1, v2, p1}, LP/v;-><init>(Landroidx/camera/core/o;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, LP/w;->a(Ly/b0;)Ly/c0;

    .line 15
    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    throw p1
.end method

.method public bridge synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LP/z;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE/i;->a(LP/z;)LP/z;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
