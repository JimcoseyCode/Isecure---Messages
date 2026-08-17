.class public final LA8/c;
.super LO7/i;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LA8/b;


# instance fields
.field private final L:Lf8/d;

.field private final M:Lh8/c;

.field private final N:Lh8/g;

.field private final O:Lh8/h;

.field private final P:LA8/s;


# direct methods
.method public constructor <init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;Lf8/d;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;)V
    .locals 11

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    const-string v0, "containingDeclaration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kind"

    move-object/from16 v5, p5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p11, :cond_0

    .line 2
    sget-object v0, LL7/h0;->a:LL7/h0;

    move-object v6, v0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move-object v0, p0

    goto :goto_0

    :cond_0
    move-object/from16 v6, p11

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    :goto_0
    invoke-direct/range {v0 .. v6}, LO7/i;-><init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;LL7/h0;)V

    .line 3
    iput-object v7, p0, LA8/c;->L:Lf8/d;

    .line 4
    iput-object v8, p0, LA8/c;->M:Lh8/c;

    .line 5
    iput-object v9, p0, LA8/c;->N:Lh8/g;

    .line 6
    iput-object v10, p0, LA8/c;->O:Lh8/h;

    move-object/from16 v1, p10

    .line 7
    iput-object v1, p0, LA8/c;->P:LA8/s;

    return-void
.end method

.method public synthetic constructor <init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;Lf8/d;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v12, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    goto :goto_1

    :cond_0
    move-object/from16 v12, p11

    goto :goto_0

    .line 1
    :goto_1
    invoke-direct/range {v1 .. v12}, LA8/c;-><init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;Lf8/d;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic D()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/c;->q1()Lf8/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic I0(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LO7/s;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LA8/c;->p1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LA8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public N()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public Q()Lh8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/c;->N:Lh8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public W()Lh8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/c;->M:Lh8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()LA8/s;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/c;->P:LA8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isSuspend()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic l1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LO7/i;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LA8/c;->p1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LA8/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method protected p1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LA8/c;
    .locals 13

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "kind"

    .line 7
    .line 8
    move-object/from16 v6, p3

    .line 9
    .line 10
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string v0, "annotations"

    .line 14
    .line 15
    move-object/from16 v4, p5

    .line 16
    .line 17
    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v0, "source"

    .line 21
    .line 22
    move-object/from16 v12, p6

    .line 23
    .line 24
    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v1, LA8/c;

    .line 28
    .line 29
    move-object v2, p1

    .line 30
    check-cast v2, LL7/e;

    .line 31
    .line 32
    move-object v3, p2

    .line 33
    check-cast v3, LL7/l;

    .line 34
    .line 35
    iget-boolean v5, p0, LO7/i;->K:Z

    .line 36
    .line 37
    invoke-virtual {p0}, LA8/c;->q1()Lf8/d;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    invoke-virtual {p0}, LA8/c;->W()Lh8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    invoke-virtual {p0}, LA8/c;->Q()Lh8/g;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-virtual {p0}, LA8/c;->r1()Lh8/h;

    .line 50
    .line 51
    .line 52
    move-result-object v10

    .line 53
    invoke-virtual {p0}, LA8/c;->Y()LA8/s;

    .line 54
    .line 55
    .line 56
    move-result-object v11

    .line 57
    invoke-direct/range {v1 .. v12}, LA8/c;-><init>(LL7/e;LL7/l;LM7/h;ZLL7/b$a;Lf8/d;Lh8/c;Lh8/g;Lh8/h;LA8/s;LL7/h0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, LO7/s;->N0()Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    invoke-virtual {v1, p1}, LO7/s;->V0(Z)V

    .line 65
    .line 66
    .line 67
    return-object v1
.end method

.method public q1()Lf8/d;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/c;->L:Lf8/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public r1()Lh8/h;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/c;->O:Lh8/h;

    .line 2
    .line 3
    return-object v0
.end method
