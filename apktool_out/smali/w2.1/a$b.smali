.class Lw2/a$b;
.super Lw2/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lw2/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static d(Lw2/d;Lw2/d;)Lw2/a$b;
    .locals 1

    .line 1
    invoke-static {}, Lj3/b;->d()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const-string v0, "AbstractDraweeController#createInternal"

    .line 8
    .line 9
    invoke-static {v0}, Lj3/b;->a(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Lw2/a$b;

    .line 13
    .line 14
    invoke-direct {v0}, Lw2/a$b;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lw2/f;->a(Lw2/d;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lw2/f;->a(Lw2/d;)V

    .line 21
    .line 22
    .line 23
    invoke-static {}, Lj3/b;->d()Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    invoke-static {}, Lj3/b;->b()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-object v0
.end method
