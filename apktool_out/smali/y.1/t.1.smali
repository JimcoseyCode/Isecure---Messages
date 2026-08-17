.class public abstract Ly/t;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ly/t$b;,
        Ly/t$a;
    }
.end annotation


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

.method public static a(Ly/t$b;)Ly/t;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p0, v0}, Ly/t;->b(Ly/t$b;Ly/t$a;)Ly/t;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    return-object p0
.end method

.method public static b(Ly/t$b;Ly/t$a;)Ly/t;
    .locals 1

    .line 1
    new-instance v0, Ly/b;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Ly/b;-><init>(Ly/t$b;Ly/t$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public abstract c()Ly/t$a;
.end method

.method public abstract d()Ly/t$b;
.end method
