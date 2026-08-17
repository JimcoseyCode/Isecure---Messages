.class public final LD8/i;
.super LC8/d0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LG8/d;


# instance fields
.field private final h:LG8/b;

.field private final i:LD8/n;

.field private final j:LC8/M0;

.field private final k:LC8/r0;

.field private final l:Z

.field private final m:Z


# direct methods
.method public constructor <init>(LG8/b;LC8/M0;LC8/B0;LL7/m0;)V
    .locals 10

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "projection"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeParameter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    new-instance v1, LD8/n;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v7}, LD8/n;-><init>(LC8/B0;Lw7/a;LD8/n;LL7/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v8, 0x38

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p1

    move-object v4, p2

    move-object v3, v1

    move-object v1, p0

    invoke-direct/range {v1 .. v9}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZ)V
    .locals 1

    const-string v0, "captureStatus"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, LC8/d0;-><init>()V

    .line 4
    iput-object p1, p0, LD8/i;->h:LG8/b;

    .line 5
    iput-object p2, p0, LD8/i;->i:LD8/n;

    .line 6
    iput-object p3, p0, LD8/i;->j:LC8/M0;

    .line 7
    iput-object p4, p0, LD8/i;->k:LC8/r0;

    .line 8
    iput-boolean p5, p0, LD8/i;->l:Z

    .line 9
    iput-boolean p6, p0, LD8/i;->m:Z

    return-void
.end method

.method public synthetic constructor <init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 1
    sget-object p4, LC8/r0;->h:LC8/r0$a;

    invoke-virtual {p4}, LC8/r0$a;->j()LC8/r0;

    move-result-object p4

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    const/4 p8, 0x0

    if-eqz p4, :cond_1

    move v5, p8

    goto :goto_0

    :cond_1
    move v5, p5

    :goto_0
    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    move v6, p8

    :goto_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    goto :goto_2

    :cond_2
    move v6, p6

    goto :goto_1

    .line 2
    :goto_2
    invoke-direct/range {v0 .. v6}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZ)V

    return-void
.end method


# virtual methods
.method public I0()Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public J0()LC8/r0;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/i;->k:LC8/r0;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic K0()LC8/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LD8/i;->U0()LD8/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public L0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LD8/i;->l:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic M0(LD8/g;)LC8/S;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/i;->Y0(LD8/g;)LD8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic O0(Z)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/i;->X0(Z)LD8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic P0(LD8/g;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/i;->Y0(LD8/g;)LD8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic Q0(LC8/r0;)LC8/M0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/i;->S0(LC8/r0;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic R0(Z)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LD8/i;->X0(Z)LD8/i;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public S0(LC8/r0;)LC8/d0;
    .locals 8

    .line 1
    const-string v0, "newAttributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LD8/i;

    .line 7
    .line 8
    iget-object v2, p0, LD8/i;->h:LG8/b;

    .line 9
    .line 10
    invoke-virtual {p0}, LD8/i;->U0()LD8/n;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    iget-object v4, p0, LD8/i;->j:LC8/M0;

    .line 15
    .line 16
    invoke-virtual {p0}, LD8/i;->L0()Z

    .line 17
    .line 18
    .line 19
    move-result v6

    .line 20
    iget-boolean v7, p0, LD8/i;->m:Z

    .line 21
    .line 22
    move-object v5, p1

    .line 23
    invoke-direct/range {v1 .. v7}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZ)V

    .line 24
    .line 25
    .line 26
    return-object v1
.end method

.method public final T0()LG8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/i;->h:LG8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public U0()LD8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/i;->i:LD8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final V0()LC8/M0;
    .locals 1

    .line 1
    iget-object v0, p0, LD8/i;->j:LC8/M0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W0()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LD8/i;->m:Z

    .line 2
    .line 3
    return v0
.end method

.method public X0(Z)LD8/i;
    .locals 9

    .line 1
    new-instance v0, LD8/i;

    .line 2
    .line 3
    iget-object v1, p0, LD8/i;->h:LG8/b;

    .line 4
    .line 5
    invoke-virtual {p0}, LD8/i;->U0()LD8/n;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    iget-object v3, p0, LD8/i;->j:LC8/M0;

    .line 10
    .line 11
    invoke-virtual {p0}, LD8/i;->J0()LC8/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    const/16 v7, 0x20

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    move v5, p1

    .line 20
    invoke-direct/range {v0 .. v8}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public Y0(LD8/g;)LD8/i;
    .locals 10

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v2, p0, LD8/i;->h:LG8/b;

    .line 7
    .line 8
    invoke-virtual {p0}, LD8/i;->U0()LD8/n;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0, p1}, LD8/n;->l(LD8/g;)LD8/n;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    iget-object v0, p0, LD8/i;->j:LC8/M0;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1, v0}, LD8/g;->h(LG8/i;)LC8/S;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p1}, LC8/S;->N0()LC8/M0;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    :goto_0
    move-object v4, p1

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    goto :goto_0

    .line 32
    :goto_1
    invoke-virtual {p0}, LD8/i;->J0()LC8/r0;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    invoke-virtual {p0}, LD8/i;->L0()Z

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    new-instance v1, LD8/i;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    const/16 v8, 0x20

    .line 44
    .line 45
    const/4 v9, 0x0

    .line 46
    invoke-direct/range {v1 .. v9}, LD8/i;-><init>(LG8/b;LD8/n;LC8/M0;LC8/r0;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 47
    .line 48
    .line 49
    return-object v1
.end method

.method public o()Lv8/k;
    .locals 3

    .line 1
    sget-object v0, LE8/h;->h:LE8/h;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    invoke-static {v0, v2, v1}, LE8/l;->a(LE8/h;Z[Ljava/lang/String;)LE8/g;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method
