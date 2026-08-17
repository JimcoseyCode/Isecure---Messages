.class public Lm2/i;
.super Lm2/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm2/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static v()Lm2/i;
    .locals 1

    .line 1
    new-instance v0, Lm2/i;

    .line 2
    .line 3
    invoke-direct {v0}, Lm2/i;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public n(Ljava/lang/Throwable;)Z
    .locals 0

    .line 1
    invoke-static {p1}, Lc2/k;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Ljava/lang/Throwable;

    .line 6
    .line 7
    invoke-super {p0, p1}, Lm2/a;->n(Ljava/lang/Throwable;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    return p1
.end method
