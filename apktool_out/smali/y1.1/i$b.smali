.class final Ly1/i$b;
.super Ly1/c;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly1/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly1/c;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method protected bridge synthetic a()Ly1/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/i$b;->d()Ly1/i$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected d()Ly1/i$a;
    .locals 1

    .line 1
    new-instance v0, Ly1/i$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ly1/i$a;-><init>(Ly1/i$b;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method e(ILjava/lang/Class;)Ly1/i$a;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ly1/c;->b()Ly1/m;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ly1/i$a;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Ly1/i$a;->b(ILjava/lang/Class;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method
