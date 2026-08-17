.class public final LA8/P;
.super LO7/g;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LA8/t;


# instance fields
.field private final q:Lf8/r;

.field private final r:Lh8/c;

.field private final s:Lh8/g;

.field private final t:Lh8/h;

.field private final u:LA8/s;

.field private v:LC8/d0;

.field private w:LC8/d0;

.field private x:Ljava/util/List;

.field private y:LC8/d0;


# direct methods
.method public constructor <init>(LB8/n;LL7/m;LM7/h;Lk8/f;LL7/u;Lf8/r;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V
    .locals 11

    .line 1
    move-object/from16 v7, p6

    .line 2
    .line 3
    move-object/from16 v8, p7

    .line 4
    .line 5
    move-object/from16 v9, p8

    .line 6
    .line 7
    move-object/from16 v10, p9

    .line 8
    .line 9
    const-string v0, "storageManager"

    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "containingDeclaration"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const-string v0, "annotations"

    .line 20
    .line 21
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v0, "name"

    .line 25
    .line 26
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "visibility"

    .line 30
    .line 31
    move-object/from16 v6, p5

    .line 32
    .line 33
    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, "proto"

    .line 37
    .line 38
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, "nameResolver"

    .line 42
    .line 43
    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const-string v0, "typeTable"

    .line 47
    .line 48
    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "versionRequirementTable"

    .line 52
    .line 53
    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    sget-object v5, LL7/h0;->a:LL7/h0;

    .line 57
    .line 58
    const-string v0, "NO_SOURCE"

    .line 59
    .line 60
    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    move-object v0, p0

    .line 64
    move-object v1, p1

    .line 65
    move-object v2, p2

    .line 66
    move-object v3, p3

    .line 67
    move-object v4, p4

    .line 68
    invoke-direct/range {v0 .. v6}, LO7/g;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LL7/h0;LL7/u;)V

    .line 69
    .line 70
    .line 71
    iput-object v7, p0, LA8/P;->q:Lf8/r;

    .line 72
    .line 73
    iput-object v8, p0, LA8/P;->r:Lh8/c;

    .line 74
    .line 75
    iput-object v9, p0, LA8/P;->s:Lh8/g;

    .line 76
    .line 77
    iput-object v10, p0, LA8/P;->t:Lh8/h;

    .line 78
    .line 79
    move-object/from16 v1, p10

    .line 80
    .line 81
    iput-object v1, p0, LA8/P;->u:LA8/s;

    .line 82
    .line 83
    return-void
.end method


# virtual methods
.method public bridge synthetic D()Lm8/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LA8/P;->R0()Lf8/r;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method protected O0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->x:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "typeConstructorParameters"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method

.method public Q()Lh8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->s:Lh8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public R0()Lf8/r;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->q:Lf8/r;

    .line 2
    .line 3
    return-object v0
.end method

.method public S0()Lh8/h;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->t:Lh8/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public T()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->w:LC8/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "expandedType"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final T0(Ljava/util/List;LC8/d0;LC8/d0;)V
    .locals 1

    .line 1
    const-string v0, "declaredTypeParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "underlyingType"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "expandedType"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, LO7/g;->P0(Ljava/util/List;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, LA8/P;->v:LC8/d0;

    .line 20
    .line 21
    iput-object p3, p0, LA8/P;->w:LC8/d0;

    .line 22
    .line 23
    invoke-static {p0}, LL7/q0;->g(LL7/i;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LA8/P;->x:Ljava/util/List;

    .line 28
    .line 29
    invoke-virtual {p0}, LO7/g;->J0()LC8/d0;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, LA8/P;->y:LC8/d0;

    .line 34
    .line 35
    return-void
.end method

.method public U0(LC8/G0;)LL7/l0;
    .locals 12

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, LC8/G0;->k()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance v1, LA8/P;

    .line 14
    .line 15
    invoke-virtual {p0}, LO7/g;->c0()LB8/n;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {p0}, LO7/n;->b()LL7/m;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    const-string v0, "getContainingDeclaration(...)"

    .line 24
    .line 25
    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, LM7/b;->getAnnotations()LM7/h;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v0, "<get-annotations>(...)"

    .line 33
    .line 34
    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, LO7/m;->getName()Lk8/f;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    const-string v0, "getName(...)"

    .line 42
    .line 43
    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, LO7/g;->getVisibility()LL7/u;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-virtual {p0}, LA8/P;->R0()Lf8/r;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    invoke-virtual {p0}, LA8/P;->W()Lh8/c;

    .line 55
    .line 56
    .line 57
    move-result-object v8

    .line 58
    invoke-virtual {p0}, LA8/P;->Q()Lh8/g;

    .line 59
    .line 60
    .line 61
    move-result-object v9

    .line 62
    invoke-virtual {p0}, LA8/P;->S0()Lh8/h;

    .line 63
    .line 64
    .line 65
    move-result-object v10

    .line 66
    invoke-virtual {p0}, LA8/P;->Y()LA8/s;

    .line 67
    .line 68
    .line 69
    move-result-object v11

    .line 70
    invoke-direct/range {v1 .. v11}, LA8/P;-><init>(LB8/n;LL7/m;LM7/h;Lk8/f;LL7/u;Lf8/r;Lh8/c;Lh8/g;Lh8/h;LA8/s;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, LO7/g;->t()Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {p0}, LA8/P;->b0()LC8/d0;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v3, LC8/N0;->k:LC8/N0;

    .line 82
    .line 83
    invoke-virtual {p1, v2, v3}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    const-string v4, "safeSubstitute(...)"

    .line 88
    .line 89
    invoke-static {v2, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v2}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {p0}, LA8/P;->T()LC8/d0;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {p1, v5, v3}, LC8/G0;->n(LC8/S;LC8/N0;)LC8/S;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-static {p1, v4}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-static {p1}, LC8/F0;->a(LC8/S;)LC8/d0;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {v1, v0, v2, p1}, LA8/P;->T0(Ljava/util/List;LC8/d0;LC8/d0;)V

    .line 112
    .line 113
    .line 114
    return-object v1
.end method

.method public W()Lh8/c;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->r:Lh8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public Y()LA8/s;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->u:LA8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public b0()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->v:LC8/d0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "underlyingType"

    .line 7
    .line 8
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public bridge synthetic c(LC8/G0;)LL7/n;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LA8/P;->U0(LC8/G0;)LL7/l0;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public q()LL7/e;
    .locals 3

    .line 1
    invoke-virtual {p0}, LA8/P;->T()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, LC8/W;->a(LC8/S;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-virtual {p0}, LA8/P;->T()LC8/d0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, LC8/S;->K0()LC8/v0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, LC8/v0;->p()LL7/h;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    instance-of v2, v0, LL7/e;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    check-cast v0, LL7/e;

    .line 30
    .line 31
    return-object v0

    .line 32
    :cond_1
    return-object v1
.end method

.method public r()LC8/d0;
    .locals 1

    .line 1
    iget-object v0, p0, LA8/P;->y:LC8/d0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "defaultTypeImpl"

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/l;->y(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :cond_0
    return-object v0
.end method
