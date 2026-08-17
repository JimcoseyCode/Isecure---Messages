.class public abstract LK7/v;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field private static final a:Lk8/f;

.field private static final b:Lk8/f;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "getFirst"

    .line 2
    .line 3
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "identifier(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, LK7/v;->a:Lk8/f;

    .line 13
    .line 14
    const-string v0, "getLast"

    .line 15
    .line 16
    invoke-static {v0}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, LK7/v;->b:Lk8/f;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic a()Lk8/f;
    .locals 1

    .line 1
    sget-object v0, LK7/v;->a:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b()Lk8/f;
    .locals 1

    .line 1
    sget-object v0, LK7/v;->b:Lk8/f;

    .line 2
    .line 3
    return-object v0
.end method
