.class public abstract LF/k1$f;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LF/k1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LF/k1$f$a;
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

.method public static a(LF/q0;)LF/k1$f$a;
    .locals 1

    .line 1
    new-instance v0, LF/n$b;

    .line 2
    .line 3
    invoke-direct {v0}, LF/n$b;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, LF/n$b;->g(LF/q0;)LF/k1$f$a;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {p0, v0}, LF/k1$f$a;->e(Ljava/util/List;)LF/k1$f$a;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const/4 v0, 0x0

    .line 17
    invoke-virtual {p0, v0}, LF/k1$f$a;->d(Ljava/lang/String;)LF/k1$f$a;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const/4 v0, -0x1

    .line 22
    invoke-virtual {p0, v0}, LF/k1$f$a;->c(I)LF/k1$f$a;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, v0}, LF/k1$f$a;->f(I)LF/k1$f$a;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v0, Ly/H;->d:Ly/H;

    .line 31
    .line 32
    invoke-virtual {p0, v0}, LF/k1$f$a;->b(Ly/H;)LF/k1$f$a;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method


# virtual methods
.method public abstract b()Ly/H;
.end method

.method public abstract c()I
.end method

.method public abstract d()Ljava/lang/String;
.end method

.method public abstract e()Ljava/util/List;
.end method

.method public abstract f()LF/q0;
.end method

.method public abstract g()I
.end method
