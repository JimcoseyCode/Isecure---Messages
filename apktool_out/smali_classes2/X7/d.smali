.class public final LX7/d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LB8/n;

.field private final b:LU7/u;

.field private final c:Ld8/v;

.field private final d:Ld8/n;

.field private final e:LV7/o;

.field private final f:Ly8/w;

.field private final g:LV7/j;

.field private final h:LV7/i;

.field private final i:Lu8/a;

.field private final j:La8/b;

.field private final k:LX7/n;

.field private final l:Ld8/D;

.field private final m:LL7/k0;

.field private final n:LT7/c;

.field private final o:LL7/H;

.field private final p:LI7/n;

.field private final q:LU7/d;

.field private final r:Lc8/e0;

.field private final s:LU7/v;

.field private final t:LX7/e;

.field private final u:LD8/p;

.field private final v:LU7/D;

.field private final w:LU7/A;

.field private final x:Lt8/f;


# direct methods
.method public constructor <init>(LB8/n;LU7/u;Ld8/v;Ld8/n;LV7/o;Ly8/w;LV7/j;LV7/i;Lu8/a;La8/b;LX7/n;Ld8/D;LL7/k0;LT7/c;LL7/H;LI7/n;LU7/d;Lc8/e0;LU7/v;LX7/e;LD8/p;LU7/D;LU7/A;Lt8/f;)V
    .locals 16

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "storageManager"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finder"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinClassFinder"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deserializedDescriptorResolver"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signaturePropagator"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaResolverCache"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaPropertyInitializerEvaluator"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "samConversionResolver"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sourceElementFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "moduleClassResolver"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "packagePartProvider"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "supertypeLoopChecker"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lookupTracker"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "module"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reflectionTypes"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationTypeQualifierResolver"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "signatureEnhancement"

    move-object/from16 v15, p18

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaClassesTracker"

    move-object/from16 v15, p19

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "settings"

    move-object/from16 v15, p20

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "kotlinTypeChecker"

    move-object/from16 v15, p21

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaTypeEnhancementState"

    move-object/from16 v15, p22

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "javaModuleResolver"

    move-object/from16 v15, p23

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syntheticPartsProvider"

    move-object/from16 v15, p24

    invoke-static {v15, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v0, p0

    .line 2
    iput-object v1, v0, LX7/d;->a:LB8/n;

    .line 3
    iput-object v2, v0, LX7/d;->b:LU7/u;

    .line 4
    iput-object v3, v0, LX7/d;->c:Ld8/v;

    .line 5
    iput-object v4, v0, LX7/d;->d:Ld8/n;

    .line 6
    iput-object v5, v0, LX7/d;->e:LV7/o;

    .line 7
    iput-object v6, v0, LX7/d;->f:Ly8/w;

    .line 8
    iput-object v7, v0, LX7/d;->g:LV7/j;

    .line 9
    iput-object v8, v0, LX7/d;->h:LV7/i;

    .line 10
    iput-object v9, v0, LX7/d;->i:Lu8/a;

    .line 11
    iput-object v10, v0, LX7/d;->j:La8/b;

    .line 12
    iput-object v11, v0, LX7/d;->k:LX7/n;

    .line 13
    iput-object v12, v0, LX7/d;->l:Ld8/D;

    .line 14
    iput-object v13, v0, LX7/d;->m:LL7/k0;

    .line 15
    iput-object v14, v0, LX7/d;->n:LT7/c;

    move-object/from16 v1, p15

    .line 16
    iput-object v1, v0, LX7/d;->o:LL7/H;

    move-object/from16 v1, p16

    .line 17
    iput-object v1, v0, LX7/d;->p:LI7/n;

    move-object/from16 v1, p17

    .line 18
    iput-object v1, v0, LX7/d;->q:LU7/d;

    move-object/from16 v1, p18

    .line 19
    iput-object v1, v0, LX7/d;->r:Lc8/e0;

    move-object/from16 v1, p19

    .line 20
    iput-object v1, v0, LX7/d;->s:LU7/v;

    move-object/from16 v1, p20

    .line 21
    iput-object v1, v0, LX7/d;->t:LX7/e;

    move-object/from16 v1, p21

    .line 22
    iput-object v1, v0, LX7/d;->u:LD8/p;

    move-object/from16 v1, p22

    .line 23
    iput-object v1, v0, LX7/d;->v:LU7/D;

    move-object/from16 v1, p23

    .line 24
    iput-object v1, v0, LX7/d;->w:LU7/A;

    .line 25
    iput-object v15, v0, LX7/d;->x:Lt8/f;

    return-void
.end method

.method public synthetic constructor <init>(LB8/n;LU7/u;Ld8/v;Ld8/n;LV7/o;Ly8/w;LV7/j;LV7/i;Lu8/a;La8/b;LX7/n;Ld8/D;LL7/k0;LT7/c;LL7/H;LI7/n;LU7/d;Lc8/e0;LU7/v;LX7/e;LD8/p;LU7/D;LU7/A;Lt8/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 26

    const/high16 v0, 0x800000

    and-int v0, p25, v0

    if-eqz v0, :cond_0

    .line 26
    sget-object v0, Lt8/f;->a:Lt8/f$a;

    invoke-virtual {v0}, Lt8/f$a;->a()Lt8/a;

    move-result-object v0

    move-object/from16 v25, v0

    :goto_0
    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    move-object/from16 v20, p19

    move-object/from16 v21, p20

    move-object/from16 v22, p21

    move-object/from16 v23, p22

    move-object/from16 v24, p23

    goto :goto_1

    :cond_0
    move-object/from16 v25, p24

    goto :goto_0

    .line 27
    :goto_1
    invoke-direct/range {v1 .. v25}, LX7/d;-><init>(LB8/n;LU7/u;Ld8/v;Ld8/n;LV7/o;Ly8/w;LV7/j;LV7/i;Lu8/a;La8/b;LX7/n;Ld8/D;LL7/k0;LT7/c;LL7/H;LI7/n;LU7/d;Lc8/e0;LU7/v;LX7/e;LD8/p;LU7/D;LU7/A;Lt8/f;)V

    return-void
.end method


# virtual methods
.method public final a()LU7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->q:LU7/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ld8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->d:Ld8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c()Ly8/w;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->f:Ly8/w;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LU7/u;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->b:LU7/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LU7/v;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->s:LU7/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()LU7/A;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->w:LU7/A;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()LV7/i;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->h:LV7/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LV7/j;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->g:LV7/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i()LU7/D;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->v:LU7/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Ld8/v;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->c:Ld8/v;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()LD8/p;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->u:LD8/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()LT7/c;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->n:LT7/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()LL7/H;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->o:LL7/H;

    .line 2
    .line 3
    return-object v0
.end method

.method public final n()LX7/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->k:LX7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Ld8/D;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->l:Ld8/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()LI7/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->p:LI7/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q()LX7/e;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->t:LX7/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Lc8/e0;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->r:Lc8/e0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()LV7/o;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->e:LV7/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()La8/b;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->j:La8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()LB8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->a:LB8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()LL7/k0;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->m:LL7/k0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Lt8/f;
    .locals 1

    .line 1
    iget-object v0, p0, LX7/d;->x:Lt8/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final x(LV7/j;)LX7/d;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "javaResolverCache"

    .line 4
    .line 5
    move-object/from16 v9, p1

    .line 6
    .line 7
    invoke-static {v9, v1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    new-instance v2, LX7/d;

    .line 11
    .line 12
    iget-object v3, v0, LX7/d;->a:LB8/n;

    .line 13
    .line 14
    iget-object v4, v0, LX7/d;->b:LU7/u;

    .line 15
    .line 16
    iget-object v5, v0, LX7/d;->c:Ld8/v;

    .line 17
    .line 18
    iget-object v6, v0, LX7/d;->d:Ld8/n;

    .line 19
    .line 20
    iget-object v7, v0, LX7/d;->e:LV7/o;

    .line 21
    .line 22
    iget-object v8, v0, LX7/d;->f:Ly8/w;

    .line 23
    .line 24
    iget-object v10, v0, LX7/d;->h:LV7/i;

    .line 25
    .line 26
    iget-object v11, v0, LX7/d;->i:Lu8/a;

    .line 27
    .line 28
    iget-object v12, v0, LX7/d;->j:La8/b;

    .line 29
    .line 30
    iget-object v13, v0, LX7/d;->k:LX7/n;

    .line 31
    .line 32
    iget-object v14, v0, LX7/d;->l:Ld8/D;

    .line 33
    .line 34
    iget-object v15, v0, LX7/d;->m:LL7/k0;

    .line 35
    .line 36
    iget-object v1, v0, LX7/d;->n:LT7/c;

    .line 37
    .line 38
    move-object/from16 v16, v1

    .line 39
    .line 40
    iget-object v1, v0, LX7/d;->o:LL7/H;

    .line 41
    .line 42
    move-object/from16 v17, v1

    .line 43
    .line 44
    iget-object v1, v0, LX7/d;->p:LI7/n;

    .line 45
    .line 46
    move-object/from16 v18, v1

    .line 47
    .line 48
    iget-object v1, v0, LX7/d;->q:LU7/d;

    .line 49
    .line 50
    move-object/from16 v19, v1

    .line 51
    .line 52
    iget-object v1, v0, LX7/d;->r:Lc8/e0;

    .line 53
    .line 54
    move-object/from16 v20, v1

    .line 55
    .line 56
    iget-object v1, v0, LX7/d;->s:LU7/v;

    .line 57
    .line 58
    move-object/from16 v21, v1

    .line 59
    .line 60
    iget-object v1, v0, LX7/d;->t:LX7/e;

    .line 61
    .line 62
    move-object/from16 v22, v1

    .line 63
    .line 64
    iget-object v1, v0, LX7/d;->u:LD8/p;

    .line 65
    .line 66
    move-object/from16 v23, v1

    .line 67
    .line 68
    iget-object v1, v0, LX7/d;->v:LU7/D;

    .line 69
    .line 70
    move-object/from16 v24, v1

    .line 71
    .line 72
    iget-object v1, v0, LX7/d;->w:LU7/A;

    .line 73
    .line 74
    const/high16 v27, 0x800000

    .line 75
    .line 76
    const/16 v28, 0x0

    .line 77
    .line 78
    const/16 v26, 0x0

    .line 79
    .line 80
    move-object/from16 v25, v1

    .line 81
    .line 82
    invoke-direct/range {v2 .. v28}, LX7/d;-><init>(LB8/n;LU7/u;Ld8/v;Ld8/n;LV7/o;Ly8/w;LV7/j;LV7/i;Lu8/a;La8/b;LX7/n;Ld8/D;LL7/k0;LT7/c;LL7/H;LI7/n;LU7/d;Lc8/e0;LU7/v;LX7/e;LD8/p;LU7/D;LU7/A;Lt8/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 83
    .line 84
    .line 85
    return-object v2
.end method
