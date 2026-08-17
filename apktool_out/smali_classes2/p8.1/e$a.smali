.class public final Lp8/e$a;
.super LC8/z;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp8/e;->g(LC8/E0;Z)LC8/E0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic d:Z


# direct methods
.method constructor <init>(LC8/E0;Z)V
    .locals 0

    .line 1
    iput-boolean p2, p0, Lp8/e$a;->d:Z

    .line 2
    .line 3
    invoke-direct {p0, p1}, LC8/z;-><init>(LC8/E0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lp8/e$a;->d:Z

    .line 2
    .line 3
    return v0
.end method

.method public e(LC8/S;)LC8/B0;
    .locals 3

    .line 1
    const-string v0, "key"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LC8/z;->e(LC8/S;)LC8/B0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-interface {p1}, LC8/v0;->p()LL7/h;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    instance-of v2, p1, LL7/m0;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    move-object v1, p1

    .line 26
    check-cast v1, LL7/m0;

    .line 27
    .line 28
    :cond_0
    invoke-static {v0, v1}, Lp8/e;->a(LC8/B0;LL7/m0;)LC8/B0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    return-object p1

    .line 33
    :cond_1
    return-object v1
.end method
