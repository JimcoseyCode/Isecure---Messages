.class public abstract Ls9/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Lt9/k;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Lt9/k;->j:Lt9/k$a;

    .line 2
    .line 3
    const-string v1, "000000ffff"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Lt9/k$a;->e(Ljava/lang/String;)Lt9/k;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    sput-object v0, Ls9/b;->a:Lt9/k;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic a()Lt9/k;
    .locals 1

    .line 1
    sget-object v0, Ls9/b;->a:Lt9/k;

    .line 2
    .line 3
    return-object v0
.end method
