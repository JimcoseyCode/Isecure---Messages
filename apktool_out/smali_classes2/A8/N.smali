.class public final LA8/N;
.super LO7/K;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LA8/b;


# instance fields
.field private final I:Lf8/n;

.field private final J:Lh8/c;

.field private final K:Lh8/g;

.field private final L:Lh8/h;

.field private final M:LA8/s;


# direct methods
.method public constructor <init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;ZZZZZLf8/n;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V
    .locals 16

    move-object/from16 v0, p14

    move-object/from16 v1, p15

    move-object/from16 v2, p16

    move-object/from16 v3, p17

    const-string v4, "containingDeclaration"

    move-object/from16 v5, p1

    invoke-static {v5, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "annotations"

    move-object/from16 v6, p3

    invoke-static {v6, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "modality"

    move-object/from16 v7, p4

    invoke-static {v7, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "visibility"

    move-object/from16 v8, p5

    invoke-static {v8, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "name"

    move-object/from16 v9, p7

    invoke-static {v9, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "kind"

    move-object/from16 v10, p8

    invoke-static {v10, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "proto"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "nameResolver"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "typeTable"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "versionRequirementTable"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    sget-object v9, LL7/h0;->a:LL7/h0;

    const/4 v13, 0x0

    move-object/from16 v0, p0

    move-object/from16 v2, p2

    move/from16 v11, p10

    move/from16 v14, p11

    move/from16 v15, p12

    move/from16 v12, p13

    move-object v1, v5

    move-object v3, v6

    move-object v4, v7

    move-object v5, v8

    move-object v8, v10

    move/from16 v6, p6

    move-object/from16 v7, p7

    move/from16 v10, p9

    .line 2
    invoke-direct/range {v0 .. v15}, LO7/K;-><init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;LL7/h0;ZZZZZZ)V

    move-object/from16 v1, p14

    .line 3
    iput-object v1, v0, LA8/N;->I:Lf8/n;

    move-object/from16 v1, p15

    .line 4
    iput-object v1, v0, LA8/N;->J:Lh8/c;

    move-object/from16 v2, p16

    .line 5
    iput-object v2, v0, LA8/N;->K:Lh8/g;

    move-object/from16 v3, p17

    .line 6
    iput-object v3, v0, LA8/N;->L:Lh8/h;

    move-object/from16 v1, p18

    .line 7
    iput-object v1, v0, LA8/N;->M:LA8/s;

    return-void
.end method


# virtual methods
.method public bridge synthetic D()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/N;->c1()Lf8/n;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected M0(LL7/m;LL7/E;LL7/u;LL7/Z;LL7/b$a;Lk8/f;LL7/h0;)LO7/K;
    .locals 20

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v0, "newModality"

    .line 9
    .line 10
    move-object/from16 v5, p2

    .line 11
    .line 12
    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "newVisibility"

    .line 16
    .line 17
    move-object/from16 v6, p3

    .line 18
    .line 19
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "kind"

    .line 23
    .line 24
    move-object/from16 v9, p5

    .line 25
    .line 26
    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "newName"

    .line 30
    .line 31
    move-object/from16 v8, p6

    .line 32
    .line 33
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "source"

    .line 37
    .line 38
    move-object/from16 v1, p7

    .line 39
    .line 40
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, LA8/N;

    .line 44
    .line 45
    invoke-virtual/range {p0 .. p0}, LM7/b;->getAnnotations()LM7/h;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual/range {p0 .. p0}, LO7/Y;->d0()Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    invoke-virtual/range {p0 .. p0}, LO7/K;->o0()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    invoke-virtual/range {p0 .. p0}, LO7/K;->isConst()Z

    .line 58
    .line 59
    .line 60
    move-result v11

    .line 61
    invoke-virtual/range {p0 .. p0}, LA8/N;->isExternal()Z

    .line 62
    .line 63
    .line 64
    move-result v12

    .line 65
    invoke-virtual/range {p0 .. p0}, LO7/K;->M()Z

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    invoke-virtual/range {p0 .. p0}, LO7/K;->J()Z

    .line 70
    .line 71
    .line 72
    move-result v14

    .line 73
    invoke-virtual/range {p0 .. p0}, LA8/N;->c1()Lf8/n;

    .line 74
    .line 75
    .line 76
    move-result-object v15

    .line 77
    invoke-virtual/range {p0 .. p0}, LA8/N;->W()Lh8/c;

    .line 78
    .line 79
    .line 80
    move-result-object v16

    .line 81
    invoke-virtual/range {p0 .. p0}, LA8/N;->Q()Lh8/g;

    .line 82
    .line 83
    .line 84
    move-result-object v17

    .line 85
    invoke-virtual/range {p0 .. p0}, LA8/N;->d1()Lh8/h;

    .line 86
    .line 87
    .line 88
    move-result-object v18

    .line 89
    invoke-virtual/range {p0 .. p0}, LA8/N;->Y()LA8/s;

    .line 90
    .line 91
    .line 92
    move-result-object v19

    .line 93
    move-object/from16 v3, p4

    .line 94
    .line 95
    invoke-direct/range {v1 .. v19}, LA8/N;-><init>(LL7/m;LL7/Z;LM7/h;LL7/E;LL7/u;ZLk8/f;LL7/b$a;ZZZZZLf8/n;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V

    .line 96
    .line 97
    .line 98
    return-object v1
.end method

.method public Q()Lh8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/N;->K:Lh8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public W()Lh8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/N;->J:Lh8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()LA8/s;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/N;->M:LA8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public c1()Lf8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/N;->I:Lf8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public d1()Lh8/h;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/N;->L:Lh8/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public isExternal()Z
    .locals 2

    .line 1
    sget-object v0, Lh8/b;->E:Lh8/b$b;

    .line 2
    .line 3
    invoke-virtual {p0}, LA8/N;->c1()Lf8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Lf8/n;->Z()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-virtual {v0, v1}, Lh8/b$b;->f(I)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, "get(...)"

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    return v0
.end method
