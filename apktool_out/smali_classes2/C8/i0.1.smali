.class public final LC8/i0;
.super LC8/C0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LC8/S;


# direct methods
.method public constructor <init>(LI7/i;)V
    .locals 1

    .line 1
    const-string v0, "kotlinBuiltIns"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LC8/C0;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, LI7/i;->I()LC8/d0;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const-string v0, "getNullableAnyType(...)"

    .line 14
    .line 15
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LC8/i0;->a:LC8/S;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public a()LC8/N0;
    .locals 1

    .line 1
    sget-object v0, LC8/N0;->m:LC8/N0;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getType()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/i0;->a:LC8/S;

    .line 2
    .line 3
    return-object v0
.end method

.method public o(LD8/g;)LC8/B0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
