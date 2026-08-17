.class public final LO7/T;
.super LO7/s;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LO7/Q;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO7/T$a;
    }
.end annotation


# static fields
.field public static final O:LO7/T$a;

.field static final synthetic P:[LC7/k;


# instance fields
.field private final K:LB8/n;

.field private final L:LL7/l0;

.field private final M:LB8/j;

.field private N:LL7/d;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LO7/T;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "withDispatchReceiver"

    .line 10
    .line 11
    const-string v3, "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"

    .line 12
    .line 13
    invoke-direct {v0, v1, v2, v3}, Lkotlin/jvm/internal/v;-><init>(LC7/f;Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lkotlin/jvm/internal/D;->k(Lkotlin/jvm/internal/u;)LC7/m;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    const/4 v1, 0x1

    .line 21
    new-array v1, v1, [LC7/k;

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    aput-object v0, v1, v2

    .line 25
    .line 26
    sput-object v1, LO7/T;->P:[LC7/k;

    .line 27
    .line 28
    new-instance v0, LO7/T$a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, LO7/T$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LO7/T;->O:LO7/T$a;

    .line 35
    .line 36
    return-void
.end method

.method private constructor <init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;)V
    .locals 7

    .line 2
    sget-object v4, Lk8/h;->j:Lk8/f;

    move-object v0, p0

    move-object v1, p2

    move-object v2, p4

    move-object v3, p5

    move-object v5, p6

    move-object v6, p7

    invoke-direct/range {v0 .. v6}, LO7/s;-><init>(LL7/m;LL7/z;LM7/h;Lk8/f;LL7/b$a;LL7/h0;)V

    .line 3
    iput-object p1, v0, LO7/T;->K:LB8/n;

    .line 4
    iput-object v1, v0, LO7/T;->L:LL7/l0;

    .line 5
    invoke-virtual {p0}, LO7/T;->m1()LL7/l0;

    move-result-object p2

    invoke-interface {p2}, LL7/D;->B0()Z

    move-result p2

    invoke-virtual {p0, p2}, LO7/s;->S0(Z)V

    .line 6
    new-instance p2, LO7/S;

    invoke-direct {p2, p0, p3}, LO7/S;-><init>(LO7/T;LL7/d;)V

    invoke-interface {p1, p2}, LB8/n;->g(Lw7/a;)LB8/j;

    move-result-object p1

    iput-object p1, v0, LO7/T;->M:LB8/j;

    .line 7
    iput-object p3, v0, LO7/T;->N:LL7/d;

    return-void
.end method

.method public synthetic constructor <init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LO7/T;-><init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;)V

    return-void
.end method

.method static synthetic h1(LO7/T;LL7/d;)LO7/T;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LO7/T;->o1(LO7/T;LL7/d;)LO7/T;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final o1(LO7/T;LL7/d;)LO7/T;
    .locals 9

    .line 1
    new-instance v0, LO7/T;

    .line 2
    .line 3
    iget-object v1, p0, LO7/T;->K:LB8/n;

    .line 4
    .line 5
    invoke-virtual {p0}, LO7/T;->m1()LL7/l0;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-interface {p1}, LM7/a;->getAnnotations()LM7/h;

    .line 10
    .line 11
    .line 12
    move-result-object v5

    .line 13
    invoke-interface {p1}, LL7/b;->getKind()LL7/b$a;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    const-string v3, "getKind(...)"

    .line 18
    .line 19
    invoke-static {v6, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, LO7/T;->m1()LL7/l0;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-interface {v3}, LL7/p;->g()LL7/h0;

    .line 27
    .line 28
    .line 29
    move-result-object v7

    .line 30
    const-string v3, "getSource(...)"

    .line 31
    .line 32
    invoke-static {v7, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    move-object v4, p0

    .line 36
    move-object v3, p1

    .line 37
    invoke-direct/range {v0 .. v7}, LO7/T;-><init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;)V

    .line 38
    .line 39
    .line 40
    sget-object p0, LO7/T;->O:LO7/T$a;

    .line 41
    .line 42
    invoke-virtual {v4}, LO7/T;->m1()LL7/l0;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p0, p1}, LO7/T$a;->a(LO7/T$a;LL7/l0;)LC8/G0;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/4 p1, 0x0

    .line 51
    if-nez p0, :cond_0

    .line 52
    .line 53
    return-object p1

    .line 54
    :cond_0
    invoke-interface {v3}, LL7/a;->a0()LL7/c0;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    invoke-interface {v1, p0}, LL7/c0;->c(LC8/G0;)LL7/c0;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    :cond_1
    move-object v2, p1

    .line 65
    invoke-interface {v3}, LL7/a;->m0()Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    const-string v1, "getContextReceiverParameters(...)"

    .line 70
    .line 71
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Ljava/util/ArrayList;

    .line 75
    .line 76
    const/16 v1, 0xa

    .line 77
    .line 78
    invoke-static {p1, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-eqz v1, :cond_2

    .line 94
    .line 95
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    check-cast v1, LL7/c0;

    .line 100
    .line 101
    invoke-interface {v1, p0}, LL7/c0;->c(LC8/G0;)LL7/c0;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    invoke-virtual {v4}, LO7/T;->m1()LL7/l0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-interface {p0}, LL7/i;->t()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    invoke-virtual {v4}, LO7/s;->i()Ljava/util/List;

    .line 118
    .line 119
    .line 120
    move-result-object v5

    .line 121
    invoke-virtual {v4}, LO7/T;->getReturnType()LC8/S;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    sget-object v7, LL7/E;->h:LL7/E;

    .line 126
    .line 127
    invoke-virtual {v4}, LO7/T;->m1()LL7/l0;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-interface {p1}, LL7/D;->getVisibility()LL7/u;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    const/4 v1, 0x0

    .line 136
    move-object v4, p0

    .line 137
    invoke-virtual/range {v0 .. v8}, LO7/s;->O0(LL7/c0;LL7/c0;Ljava/util/List;Ljava/util/List;Ljava/util/List;LC8/S;LL7/E;LL7/u;)LO7/s;

    .line 138
    .line 139
    .line 140
    return-object v0
.end method


# virtual methods
.method public A()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/T;->k0()LL7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/l;->A()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    return v0
.end method

.method public B()LL7/e;
    .locals 2

    .line 1
    invoke-virtual {p0}, LO7/T;->k0()LL7/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, LL7/l;->B()LL7/e;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "getConstructedClass(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic I0(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LO7/s;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p6}, LO7/T;->j1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LO7/T;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic a()LL7/a;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/T;->l1()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/b;
    .locals 1

    .line 2
    invoke-virtual {p0}, LO7/T;->l1()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/m;
    .locals 1

    .line 3
    invoke-virtual {p0}, LO7/T;->l1()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/z;
    .locals 1

    .line 4
    invoke-virtual {p0}, LO7/T;->l1()LO7/Q;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LL7/i;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/T;->k1()LL7/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic b()LL7/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LO7/T;->k1()LL7/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c(LC8/G0;)LL7/l;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO7/T;->n1(LC8/G0;)LO7/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LC8/G0;)LL7/n;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, LO7/T;->n1(LC8/G0;)LO7/Q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic c(LC8/G0;)LL7/z;
    .locals 0

    .line 3
    invoke-virtual {p0, p1}, LO7/T;->n1(LC8/G0;)LO7/Q;

    move-result-object p1

    return-object p1
.end method

.method public getReturnType()LC8/S;
    .locals 1

    .line 1
    invoke-super {p0}, LO7/s;->getReturnType()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public i1(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LO7/Q;
    .locals 1

    .line 1
    const-string v0, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "modality"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "visibility"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "kind"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, LO7/s;->s()LL7/z$a;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0, p1}, LL7/z$a;->m(LL7/m;)LL7/z$a;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-interface {p1, p2}, LL7/z$a;->s(LL7/E;)LL7/z$a;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-interface {p1, p3}, LL7/z$a;->b(LL7/u;)LL7/z$a;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-interface {p1, p4}, LL7/z$a;->i(LL7/b$a;)LL7/z$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-interface {p1, p5}, LL7/z$a;->k(Z)LL7/z$a;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-interface {p1}, LL7/z$a;->build()LL7/z;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const-string p2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    .line 50
    .line 51
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    check-cast p1, LO7/Q;

    .line 55
    .line 56
    return-object p1
.end method

.method protected j1(LL7/m;LL7/z;LL7/b$a;Lk8/f;LM7/h;LL7/h0;)LO7/T;
    .locals 8

    .line 1
    const-string p2, "newOwner"

    .line 2
    .line 3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string p1, "kind"

    .line 7
    .line 8
    invoke-static {p3, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string p1, "annotations"

    .line 12
    .line 13
    invoke-static {p5, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string p1, "source"

    .line 17
    .line 18
    invoke-static {p6, p1}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    sget-object v6, LL7/b$a;->g:LL7/b$a;

    .line 22
    .line 23
    if-eq p3, v6, :cond_0

    .line 24
    .line 25
    sget-object p1, LL7/b$a;->j:LL7/b$a;

    .line 26
    .line 27
    :cond_0
    new-instance v0, LO7/T;

    .line 28
    .line 29
    iget-object v1, p0, LO7/T;->K:LB8/n;

    .line 30
    .line 31
    invoke-virtual {p0}, LO7/T;->m1()LL7/l0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {p0}, LO7/T;->k0()LL7/d;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    move-object v4, p0

    .line 40
    move-object v5, p5

    .line 41
    move-object v7, p6

    .line 42
    invoke-direct/range {v0 .. v7}, LO7/T;-><init>(LB8/n;LL7/l0;LL7/d;LO7/Q;LM7/h;LL7/b$a;LL7/h0;)V

    .line 43
    .line 44
    .line 45
    return-object v0
.end method

.method public k0()LL7/d;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/T;->N:LL7/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public k1()LL7/l0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/T;->m1()LL7/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public l1()LO7/Q;
    .locals 2

    .line 1
    invoke-super {p0}, LO7/s;->a()LL7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, LO7/Q;

    .line 11
    .line 12
    return-object v0
.end method

.method public m1()LL7/l0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/T;->L:LL7/l0;

    .line 2
    .line 3
    return-object v0
.end method

.method public n1(LC8/G0;)LO7/Q;
    .locals 2

    .line 1
    const-string v0, "substitutor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LO7/s;->c(LC8/G0;)LL7/z;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"

    .line 11
    .line 12
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    check-cast p1, LO7/T;

    .line 16
    .line 17
    invoke-virtual {p1}, LO7/T;->getReturnType()LC8/S;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, LC8/G0;->f(LC8/S;)LC8/G0;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v1, "create(...)"

    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, LO7/T;->k0()LL7/d;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, LL7/d;->a()LL7/d;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, v0}, LL7/d;->c(LC8/G0;)LL7/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    const/4 p1, 0x0

    .line 45
    return-object p1

    .line 46
    :cond_0
    iput-object v0, p1, LO7/T;->N:LL7/d;

    .line 47
    .line 48
    return-object p1
.end method

.method public bridge synthetic x(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LL7/b;
    .locals 0

    .line 1
    invoke-virtual/range {p0 .. p5}, LO7/T;->i1(LL7/m;LL7/E;LL7/u;LL7/b$a;Z)LO7/Q;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic x0()LL7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/T;->l1()LO7/Q;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
