.class public Lg2/g;
.super Lg2/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# direct methods
.method private constructor <init>(Lg2/i;Lg2/a$c;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lg2/a;-><init>(Lg2/i;Lg2/a$c;Ljava/lang/Throwable;)V

    return-void
.end method

.method constructor <init>(Ljava/lang/Object;Lg2/h;Lg2/a$c;Ljava/lang/Throwable;)V
    .locals 6

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    .line 2
    invoke-direct/range {v0 .. v5}, Lg2/a;-><init>(Ljava/lang/Object;Lg2/h;Lg2/a$c;Ljava/lang/Throwable;Z)V

    return-void
.end method


# virtual methods
.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lg2/g;->k()Lg2/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()Lg2/a;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lg2/a;->W()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lc2/k;->i(Z)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Lg2/g;

    .line 9
    .line 10
    iget-object v1, p0, Lg2/a;->h:Lg2/i;

    .line 11
    .line 12
    iget-object v2, p0, Lg2/a;->i:Lg2/a$c;

    .line 13
    .line 14
    iget-object v3, p0, Lg2/a;->j:Ljava/lang/Throwable;

    .line 15
    .line 16
    invoke-direct {v0, v1, v2, v3}, Lg2/g;-><init>(Lg2/i;Lg2/a$c;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-object v0
.end method
