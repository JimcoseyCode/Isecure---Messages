.class public final LJ7/b;
.super LO7/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LJ7/b$a;,
        LJ7/b$b;
    }
.end annotation


# static fields
.field public static final t:LJ7/b$a;

.field private static final u:Lk8/b;

.field private static final v:Lk8/b;


# instance fields
.field private final l:LB8/n;

.field private final m:LL7/N;

.field private final n:LJ7/f;

.field private final o:I

.field private final p:LJ7/b$b;

.field private final q:LJ7/d;

.field private final r:Ljava/util/List;

.field private final s:LJ7/c;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, LJ7/b$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LJ7/b$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LJ7/b;->t:LJ7/b$a;

    .line 8
    .line 9
    new-instance v0, Lk8/b;

    .line 10
    .line 11
    sget-object v1, LI7/o;->A:Lk8/c;

    .line 12
    .line 13
    const-string v2, "Function"

    .line 14
    .line 15
    invoke-static {v2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, "identifier(...)"

    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1, v2}, Lk8/b;-><init>(Lk8/c;Lk8/f;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, LJ7/b;->u:Lk8/b;

    .line 28
    .line 29
    new-instance v0, Lk8/b;

    .line 30
    .line 31
    sget-object v1, LI7/o;->x:Lk8/c;

    .line 32
    .line 33
    const-string v2, "KFunction"

    .line 34
    .line 35
    invoke-static {v2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2, v3}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {v0, v1, v2}, Lk8/b;-><init>(Lk8/c;Lk8/f;)V

    .line 43
    .line 44
    .line 45
    sput-object v0, LJ7/b;->v:Lk8/b;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(LB8/n;LL7/N;LJ7/f;I)V
    .locals 3

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "containingDeclaration"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "functionTypeKind"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p3, p4}, LJ7/f;->c(I)Lk8/f;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-direct {p0, p1, v0}, LO7/a;-><init>(LB8/n;Lk8/f;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LJ7/b;->l:LB8/n;

    .line 24
    .line 25
    iput-object p2, p0, LJ7/b;->m:LL7/N;

    .line 26
    .line 27
    iput-object p3, p0, LJ7/b;->n:LJ7/f;

    .line 28
    .line 29
    iput p4, p0, LJ7/b;->o:I

    .line 30
    .line 31
    new-instance p2, LJ7/b$b;

    .line 32
    .line 33
    invoke-direct {p2, p0}, LJ7/b$b;-><init>(LJ7/b;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, LJ7/b;->p:LJ7/b$b;

    .line 37
    .line 38
    new-instance p2, LJ7/d;

    .line 39
    .line 40
    invoke-direct {p2, p1, p0}, LJ7/d;-><init>(LB8/n;LJ7/b;)V

    .line 41
    .line 42
    .line 43
    iput-object p2, p0, LJ7/b;->q:LJ7/d;

    .line 44
    .line 45
    new-instance p1, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    new-instance p2, LB7/c;

    .line 51
    .line 52
    const/4 p3, 0x1

    .line 53
    invoke-direct {p2, p3, p4}, LB7/c;-><init>(II)V

    .line 54
    .line 55
    .line 56
    new-instance p3, Ljava/util/ArrayList;

    .line 57
    .line 58
    const/16 p4, 0xa

    .line 59
    .line 60
    invoke-static {p2, p4}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 61
    .line 62
    .line 63
    move-result p4

    .line 64
    invoke-direct {p3, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 65
    .line 66
    .line 67
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result p4

    .line 75
    if-eqz p4, :cond_0

    .line 76
    .line 77
    move-object p4, p2

    .line 78
    check-cast p4, Lj7/J;

    .line 79
    .line 80
    invoke-virtual {p4}, Lj7/J;->nextInt()I

    .line 81
    .line 82
    .line 83
    move-result p4

    .line 84
    sget-object v0, LC8/N0;->l:LC8/N0;

    .line 85
    .line 86
    new-instance v1, Ljava/lang/StringBuilder;

    .line 87
    .line 88
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 89
    .line 90
    .line 91
    const/16 v2, 0x50

    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p4

    .line 103
    invoke-static {p1, p0, v0, p4}, LJ7/b;->H0(Ljava/util/ArrayList;LJ7/b;LC8/N0;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    sget-object p4, Li7/B;->a:Li7/B;

    .line 107
    .line 108
    invoke-interface {p3, p4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_0
    sget-object p2, LC8/N0;->m:LC8/N0;

    .line 113
    .line 114
    const-string p3, "R"

    .line 115
    .line 116
    invoke-static {p1, p0, p2, p3}, LJ7/b;->H0(Ljava/util/ArrayList;LJ7/b;LC8/N0;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, Lj7/q;->P0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    iput-object p1, p0, LJ7/b;->r:Ljava/util/List;

    .line 124
    .line 125
    sget-object p1, LJ7/c;->g:LJ7/c$a;

    .line 126
    .line 127
    iget-object p2, p0, LJ7/b;->n:LJ7/f;

    .line 128
    .line 129
    invoke-virtual {p1, p2}, LJ7/c$a;->a(LJ7/f;)LJ7/c;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    iput-object p1, p0, LJ7/b;->s:LJ7/c;

    .line 134
    .line 135
    return-void
.end method

.method private static final H0(Ljava/util/ArrayList;LJ7/b;LC8/N0;Ljava/lang/String;)V
    .locals 8

    .line 1
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    invoke-static {p3}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 8
    .line 9
    .line 10
    move-result-object v5

    .line 11
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 12
    .line 13
    .line 14
    move-result v6

    .line 15
    iget-object v7, p1, LJ7/b;->l:LB8/n;

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move-object v1, p1

    .line 19
    move-object v4, p2

    .line 20
    invoke-static/range {v1 .. v7}, LO7/U;->O0(LL7/m;LM7/h;ZLC8/N0;Lk8/f;ILB8/n;)LL7/m0;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static final synthetic I0(LJ7/b;)LL7/N;
    .locals 0

    .line 1
    iget-object p0, p0, LJ7/b;->m:LL7/N;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic J0()Lk8/b;
    .locals 1

    .line 1
    sget-object v0, LJ7/b;->u:Lk8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic K0()Lk8/b;
    .locals 1

    .line 1
    sget-object v0, LJ7/b;->v:Lk8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic L0(LJ7/b;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, LJ7/b;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic M0(LJ7/b;)LB8/n;
    .locals 0

    .line 1
    iget-object p0, p0, LJ7/b;->l:LB8/n;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public B0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public F0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic I()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->S0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public J()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public K()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic L(LD8/g;)Lv8/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LJ7/b;->U0(LD8/g;)LJ7/d;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final N0()I
    .locals 1

    .line 1
    iget v0, p0, LJ7/b;->o:I

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic O()LL7/d;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->V0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LL7/d;

    .line 6
    .line 7
    return-object v0
.end method

.method public O0()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public bridge synthetic P()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->T0()Lv8/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public P0()Ljava/util/List;
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

.method public Q0()LL7/N;
    .locals 1

    .line 1
    iget-object v0, p0, LJ7/b;->m:LL7/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public bridge synthetic R()LL7/e;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->O0()Ljava/lang/Void;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, LL7/e;

    .line 6
    .line 7
    return-object v0
.end method

.method public final R0()LJ7/f;
    .locals 1

    .line 1
    iget-object v0, p0, LJ7/b;->n:LJ7/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public S0()Ljava/util/List;
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

.method public T0()Lv8/k$b;
    .locals 1

    .line 1
    sget-object v0, Lv8/k$b;->b:Lv8/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method protected U0(LD8/g;)LJ7/d;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LJ7/b;->q:LJ7/d;

    .line 7
    .line 8
    return-object p1
.end method

.method public V0()Ljava/lang/Void;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public bridge synthetic b()LL7/m;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->Q0()LL7/N;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic f()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LJ7/b;->P0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public g()LL7/h0;
    .locals 2

    .line 1
    sget-object v0, LL7/h0;->a:LL7/h0;

    .line 2
    .line 3
    const-string v1, "NO_SOURCE"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getKind()LL7/f;
    .locals 1

    .line 1
    sget-object v0, LL7/f;->i:LL7/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 2

    .line 1
    sget-object v0, LL7/t;->e:LL7/u;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
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

.method public j()LC8/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LJ7/b;->p:LJ7/b$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LL7/E;
    .locals 1

    .line 1
    sget-object v0, LL7/E;->k:LL7/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LJ7/b;->r:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, LO7/a;->getName()Lk8/f;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lk8/f;->j()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "asString(...)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public w0()LL7/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
