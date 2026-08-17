.class public abstract Ly8/Q;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:Lk8/c;

.field public static final b:Lk8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lk8/c;

    .line 2
    .line 3
    const-string v1, "kotlin.suspend"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lk8/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Ly8/Q;->a:Lk8/c;

    .line 9
    .line 10
    new-instance v0, Lk8/a;

    .line 11
    .line 12
    sget-object v1, LI7/o;->A:Lk8/c;

    .line 13
    .line 14
    const-string v2, "suspend"

    .line 15
    .line 16
    invoke-static {v2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v3, "identifier(...)"

    .line 21
    .line 22
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Lk8/a;-><init>(Lk8/c;Lk8/f;)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Ly8/Q;->b:Lk8/a;

    .line 29
    .line 30
    return-void
.end method
