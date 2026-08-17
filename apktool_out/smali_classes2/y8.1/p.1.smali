.class public final Ly8/p;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Ly8/n;

.field private final b:Lh8/c;

.field private final c:LL7/m;

.field private final d:Lh8/g;

.field private final e:Lh8/h;

.field private final f:Lh8/a;

.field private final g:LA8/s;

.field private final h:Ly8/X;

.field private final i:Ly8/K;


# direct methods
.method public constructor <init>(Ly8/n;Lh8/c;LL7/m;Lh8/g;Lh8/h;Lh8/a;LA8/s;Ly8/X;Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "components"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "nameResolver"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "containingDeclaration"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "typeTable"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "versionRequirementTable"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "metadataVersion"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v0, "typeParameters"

    .line 32
    .line 33
    invoke-static {p9, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Ly8/p;->a:Ly8/n;

    .line 40
    .line 41
    iput-object p2, p0, Ly8/p;->b:Lh8/c;

    .line 42
    .line 43
    iput-object p3, p0, Ly8/p;->c:LL7/m;

    .line 44
    .line 45
    iput-object p4, p0, Ly8/p;->d:Lh8/g;

    .line 46
    .line 47
    iput-object p5, p0, Ly8/p;->e:Lh8/h;

    .line 48
    .line 49
    iput-object p6, p0, Ly8/p;->f:Lh8/a;

    .line 50
    .line 51
    iput-object p7, p0, Ly8/p;->g:LA8/s;

    .line 52
    .line 53
    new-instance p1, Ly8/X;

    .line 54
    .line 55
    new-instance p2, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    const-string p4, "Deserializer for \""

    .line 61
    .line 62
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-interface {p3}, LL7/J;->getName()Lk8/f;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const/16 p3, 0x22

    .line 73
    .line 74
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p5

    .line 81
    if-eqz p7, :cond_1

    .line 82
    .line 83
    invoke-interface {p7}, LA8/s;->c()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    if-nez p2, :cond_0

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_0
    :goto_0
    move-object p6, p2

    .line 91
    move-object p3, p8

    .line 92
    move-object p4, p9

    .line 93
    move-object p2, p0

    .line 94
    goto :goto_2

    .line 95
    :cond_1
    :goto_1
    const-string p2, "[container not found]"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :goto_2
    invoke-direct/range {p1 .. p6}, Ly8/X;-><init>(Ly8/p;Ly8/X;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    iput-object p1, p2, Ly8/p;->h:Ly8/X;

    .line 102
    .line 103
    new-instance p1, Ly8/K;

    .line 104
    .line 105
    invoke-direct {p1, p0}, Ly8/K;-><init>(Ly8/p;)V

    .line 106
    .line 107
    .line 108
    iput-object p1, p2, Ly8/p;->i:Ly8/K;

    .line 109
    .line 110
    return-void
.end method

.method public static synthetic b(Ly8/p;LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;ILjava/lang/Object;)Ly8/p;
    .locals 7

    .line 1
    and-int/lit8 p8, p7, 0x4

    .line 2
    .line 3
    if-eqz p8, :cond_0

    .line 4
    .line 5
    iget-object p3, p0, Ly8/p;->b:Lh8/c;

    .line 6
    .line 7
    :cond_0
    move-object v3, p3

    .line 8
    and-int/lit8 p3, p7, 0x8

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    .line 12
    iget-object p4, p0, Ly8/p;->d:Lh8/g;

    .line 13
    .line 14
    :cond_1
    move-object v4, p4

    .line 15
    and-int/lit8 p3, p7, 0x10

    .line 16
    .line 17
    if-eqz p3, :cond_2

    .line 18
    .line 19
    iget-object p5, p0, Ly8/p;->e:Lh8/h;

    .line 20
    .line 21
    :cond_2
    move-object v5, p5

    .line 22
    and-int/lit8 p3, p7, 0x20

    .line 23
    .line 24
    if-eqz p3, :cond_3

    .line 25
    .line 26
    iget-object p6, p0, Ly8/p;->f:Lh8/a;

    .line 27
    .line 28
    :cond_3
    move-object v0, p0

    .line 29
    move-object v1, p1

    .line 30
    move-object v2, p2

    .line 31
    move-object v6, p6

    .line 32
    invoke-virtual/range {v0 .. v6}, Ly8/p;->a(LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;)Ly8/p;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method


# virtual methods
.method public final a(LL7/m;Ljava/util/List;Lh8/c;Lh8/g;Lh8/h;Lh8/a;)Ly8/p;
    .locals 11

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "typeParameterProtos"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "nameResolver"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "typeTable"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "versionRequirementTable"

    .line 22
    .line 23
    move-object/from16 v1, p5

    .line 24
    .line 25
    invoke-static {v1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-string v0, "metadataVersion"

    .line 29
    .line 30
    move-object/from16 v7, p6

    .line 31
    .line 32
    invoke-static {v7, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    new-instance v1, Ly8/p;

    .line 36
    .line 37
    iget-object v2, p0, Ly8/p;->a:Ly8/n;

    .line 38
    .line 39
    invoke-static {v7}, Lh8/i;->b(Lh8/a;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    move-object/from16 v6, p5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    iget-object v0, p0, Ly8/p;->e:Lh8/h;

    .line 49
    .line 50
    move-object v6, v0

    .line 51
    :goto_0
    iget-object v8, p0, Ly8/p;->g:LA8/s;

    .line 52
    .line 53
    iget-object v9, p0, Ly8/p;->h:Ly8/X;

    .line 54
    .line 55
    move-object v4, p1

    .line 56
    move-object v10, p2

    .line 57
    move-object v3, p3

    .line 58
    move-object v5, p4

    .line 59
    invoke-direct/range {v1 .. v10}, Ly8/p;-><init>(Ly8/n;Lh8/c;LL7/m;Lh8/g;Lh8/h;Lh8/a;LA8/s;Ly8/X;Ljava/util/List;)V

    .line 60
    .line 61
    .line 62
    return-object v1
.end method

.method public final c()Ly8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->a:Ly8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final d()LA8/s;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->g:LA8/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()LL7/m;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->c:LL7/m;

    .line 2
    .line 3
    return-object v0
.end method

.method public final f()Ly8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->i:Ly8/K;

    .line 2
    .line 3
    return-object v0
.end method

.method public final g()Lh8/c;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->b:Lh8/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h()LB8/n;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->a:Ly8/n;

    .line 2
    .line 3
    invoke-virtual {v0}, Ly8/n;->u()LB8/n;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final i()Ly8/X;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->h:Ly8/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j()Lh8/g;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->d:Lh8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k()Lh8/h;
    .locals 1

    .line 1
    iget-object v0, p0, Ly8/p;->e:Lh8/h;

    .line 2
    .line 3
    return-object v0
.end method
