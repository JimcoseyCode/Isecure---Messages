.class public abstract LO7/g;
.super LO7/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LL7/l0;


# static fields
.field static final synthetic p:[LC7/k;


# instance fields
.field private final k:LB8/n;

.field private final l:LL7/u;

.field private final m:LB8/i;

.field private n:Ljava/util/List;

.field private final o:LO7/g$a;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LO7/g;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "constructors"

    .line 10
    .line 11
    const-string v3, "getConstructors()Ljava/util/Collection;"

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
    sput-object v1, LO7/g;->p:[LC7/k;

    .line 27
    .line 28
    return-void
.end method

.method public constructor <init>(LB8/n;LL7/m;LM7/h;Lk8/f;LL7/h0;LL7/u;)V
    .locals 1

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
    const-string v0, "annotations"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "name"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "sourceElement"

    .line 22
    .line 23
    invoke-static {p5, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "visibilityImpl"

    .line 27
    .line 28
    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, p2, p3, p4, p5}, LO7/n;-><init>(LL7/m;LM7/h;Lk8/f;LL7/h0;)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, LO7/g;->k:LB8/n;

    .line 35
    .line 36
    iput-object p6, p0, LO7/g;->l:LL7/u;

    .line 37
    .line 38
    new-instance p2, LO7/d;

    .line 39
    .line 40
    invoke-direct {p2, p0}, LO7/d;-><init>(LO7/g;)V

    .line 41
    .line 42
    .line 43
    invoke-interface {p1, p2}, LB8/n;->e(Lw7/a;)LB8/i;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    iput-object p1, p0, LO7/g;->m:LB8/i;

    .line 48
    .line 49
    new-instance p1, LO7/g$a;

    .line 50
    .line 51
    invoke-direct {p1, p0}, LO7/g$a;-><init>(LO7/g;)V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, LO7/g;->o:LO7/g$a;

    .line 55
    .line 56
    return-void
.end method

.method static synthetic C0(LO7/g;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-static {p0}, LO7/g;->L0(LO7/g;)Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic H0(LO7/g;LC8/M0;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LO7/g;->Q0(LO7/g;LC8/M0;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic I0(LO7/g;LD8/g;)LC8/d0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LO7/g;->K0(LO7/g;LD8/g;)LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final K0(LO7/g;LD8/g;)LC8/d0;
    .locals 0

    .line 1
    invoke-virtual {p1, p0}, LD8/g;->f(LL7/m;)LL7/h;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p0}, LL7/h;->r()LC8/d0;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method private static final L0(LO7/g;)Ljava/util/Collection;
    .locals 0

    .line 1
    invoke-virtual {p0}, LO7/g;->N0()Ljava/util/Collection;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final Q0(LO7/g;LC8/M0;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    invoke-static {p1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, LC8/W;->a(LC8/S;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, LC8/S;->K0()LC8/v0;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-interface {p1}, LC8/v0;->p()LL7/h;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    instance-of v0, p1, LL7/m0;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    check-cast p1, LL7/m0;

    .line 23
    .line 24
    invoke-interface {p1}, LL7/n;->b()LL7/m;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_0

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p0, 0x0

    .line 37
    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
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

.method public E0(LL7/o;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const-string v0, "visitor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1, p0, p2}, LL7/o;->j(LL7/l0;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1
.end method

.method public J()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected final J0()LC8/d0;
    .locals 2

    .line 1
    invoke-interface {p0}, LL7/l0;->q()LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0}, LL7/e;->A0()Lv8/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :cond_0
    sget-object v0, Lv8/k$b;->b:Lv8/k$b;

    .line 14
    .line 15
    :cond_1
    new-instance v1, LO7/f;

    .line 16
    .line 17
    invoke-direct {v1, p0}, LO7/f;-><init>(LO7/g;)V

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v0, v1}, LC8/J0;->v(LL7/h;Lv8/k;Lkotlin/jvm/functions/Function1;)LC8/d0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "makeUnsubstitutedType(...)"

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-object v0
.end method

.method public K()Z
    .locals 2

    .line 1
    invoke-interface {p0}, LL7/l0;->b0()LC8/d0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LO7/e;

    .line 6
    .line 7
    invoke-direct {v1, p0}, LO7/e;-><init>(LO7/g;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, LC8/J0;->c(LC8/S;Lkotlin/jvm/functions/Function1;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public M0()LL7/l0;
    .locals 2

    .line 1
    invoke-super {p0}, LO7/n;->x0()LL7/p;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeAliasDescriptor"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, LL7/l0;

    .line 11
    .line 12
    return-object v0
.end method

.method public final N0()Ljava/util/Collection;
    .locals 5

    .line 1
    invoke-interface {p0}, LL7/l0;->q()LL7/e;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, LL7/e;->f()Ljava/util/Collection;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const-string v1, "getConstructors(...)"

    .line 17
    .line 18
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    new-instance v1, Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    check-cast v2, LL7/d;

    .line 41
    .line 42
    sget-object v3, LO7/T;->O:LO7/T$a;

    .line 43
    .line 44
    iget-object v4, p0, LO7/g;->k:LB8/n;

    .line 45
    .line 46
    invoke-static {v2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v3, v4, p0, v2}, LO7/T$a;->b(LB8/n;LL7/l0;LL7/d;)LO7/Q;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    if-eqz v2, :cond_1

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    return-object v1
.end method

.method protected abstract O0()Ljava/util/List;
.end method

.method public final P0(Ljava/util/List;)V
    .locals 1

    .line 1
    const-string v0, "declaredTypeParameters"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, LO7/g;->n:Ljava/util/List;

    .line 7
    .line 8
    return-void
.end method

.method public bridge synthetic a()LL7/h;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/g;->M0()LL7/l0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a()LL7/m;
    .locals 1

    .line 2
    invoke-virtual {p0}, LO7/g;->M0()LL7/l0;

    move-result-object v0

    return-object v0
.end method

.method protected final c0()LB8/n;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/g;->k:LB8/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/g;->l:LL7/u;

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

.method public j()LC8/v0;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/g;->o:LO7/g$a;

    .line 2
    .line 3
    return-object v0
.end method

.method public t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LO7/g;->n:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string v0, "declaredTypeParametersImpl"

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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "typealias "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LO7/m;->getName()Lk8/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Lk8/f;->j()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method

.method public bridge synthetic x0()LL7/p;
    .locals 1

    .line 1
    invoke-virtual {p0}, LO7/g;->M0()LL7/l0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
