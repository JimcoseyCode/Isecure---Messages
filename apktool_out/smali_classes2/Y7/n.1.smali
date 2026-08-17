.class public final LY7/n;
.super LO7/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LW7/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LY7/n$a;,
        LY7/n$b;
    }
.end annotation


# static fields
.field public static final E:LY7/n$a;

.field private static final F:Ljava/util/Set;


# instance fields
.field private final A:Lv8/g;

.field private final B:LY7/a0;

.field private final C:LM7/h;

.field private final D:LB8/i;

.field private final o:LX7/k;

.field private final p:Lb8/g;

.field private final q:LL7/e;

.field private final r:LX7/k;

.field private final s:Lkotlin/Lazy;

.field private final t:LL7/f;

.field private final u:LL7/E;

.field private final v:LL7/x0;

.field private final w:Z

.field private final x:LY7/n$b;

.field private final y:LY7/z;

.field private final z:LL7/f0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, LY7/n$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LY7/n$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LY7/n;->E:LY7/n$a;

    .line 8
    .line 9
    const-string v7, "notifyAll"

    .line 10
    .line 11
    const-string v8, "toString"

    .line 12
    .line 13
    const-string v2, "equals"

    .line 14
    .line 15
    const-string v3, "hashCode"

    .line 16
    .line 17
    const-string v4, "getClass"

    .line 18
    .line 19
    const-string v5, "wait"

    .line 20
    .line 21
    const-string v6, "notify"

    .line 22
    .line 23
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, Lj7/T;->h([Ljava/lang/Object;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, LY7/n;->F:Ljava/util/Set;

    .line 32
    .line 33
    return-void
.end method

.method public constructor <init>(LX7/k;LL7/m;Lb8/g;LL7/e;)V
    .locals 9

    const-string v0, "outerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jClass"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    move-result-object v1

    invoke-interface {p3}, Lb8/t;->getName()Lk8/f;

    move-result-object v3

    .line 3
    invoke-virtual {p1}, LX7/k;->a()LX7/d;

    move-result-object v0

    invoke-virtual {v0}, LX7/d;->t()La8/b;

    move-result-object v0

    invoke-interface {v0, p3}, La8/b;->a(Lb8/l;)La8/a;

    move-result-object v4

    const/4 v5, 0x0

    move-object v0, p0

    move-object v2, p2

    .line 4
    invoke-direct/range {v0 .. v5}, LO7/j;-><init>(LB8/n;LL7/m;Lk8/f;LL7/h0;Z)V

    .line 5
    iput-object p1, p0, LY7/n;->o:LX7/k;

    .line 6
    iput-object p3, p0, LY7/n;->p:Lb8/g;

    .line 7
    iput-object p4, p0, LY7/n;->q:LL7/e;

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    move-object v0, p1

    move-object v2, p3

    .line 8
    invoke-static/range {v0 .. v5}, LX7/c;->f(LX7/k;LL7/g;Lb8/z;IILjava/lang/Object;)LX7/k;

    move-result-object v0

    iput-object v0, p0, LY7/n;->r:LX7/k;

    .line 9
    invoke-virtual {v0}, LX7/k;->a()LX7/d;

    move-result-object v3

    invoke-virtual {v3}, LX7/d;->h()LV7/j;

    move-result-object v3

    invoke-interface {v3, p3, p0}, LV7/j;->d(Lb8/g;LL7/e;)V

    .line 10
    invoke-interface {p3}, Lb8/g;->E()Lb8/D;

    .line 11
    new-instance v3, LY7/k;

    invoke-direct {v3, p0}, LY7/k;-><init>(LY7/n;)V

    invoke-static {v3}, Li7/i;->b(Lw7/a;)Lkotlin/Lazy;

    move-result-object v3

    iput-object v3, p0, LY7/n;->s:Lkotlin/Lazy;

    .line 12
    invoke-interface {p3}, Lb8/g;->o()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, LL7/f;->l:LL7/f;

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {p3}, Lb8/g;->D()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, LL7/f;->i:LL7/f;

    goto :goto_0

    .line 14
    :cond_1
    invoke-interface {p3}, Lb8/g;->x()Z

    move-result v3

    if-eqz v3, :cond_2

    sget-object v3, LL7/f;->j:LL7/f;

    goto :goto_0

    .line 15
    :cond_2
    sget-object v3, LL7/f;->h:LL7/f;

    .line 16
    :goto_0
    iput-object v3, p0, LY7/n;->t:LL7/f;

    .line 17
    invoke-interface {p3}, Lb8/g;->o()Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v3, :cond_6

    invoke-interface {p3}, Lb8/g;->x()Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_3

    .line 18
    :cond_3
    sget-object v3, LL7/E;->g:LL7/E$a;

    .line 19
    invoke-interface {p3}, Lb8/g;->A()Z

    move-result v6

    .line 20
    invoke-interface {p3}, Lb8/g;->A()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p3}, Lb8/s;->isAbstract()Z

    move-result v7

    if-nez v7, :cond_5

    invoke-interface {p3}, Lb8/g;->D()Z

    move-result v7

    if-eqz v7, :cond_4

    goto :goto_1

    :cond_4
    move v7, v4

    goto :goto_2

    :cond_5
    :goto_1
    move v7, v5

    .line 21
    :goto_2
    invoke-interface {p3}, Lb8/s;->isFinal()Z

    move-result v8

    xor-int/2addr v8, v5

    .line 22
    invoke-virtual {v3, v6, v7, v8}, LL7/E$a;->a(ZZZ)LL7/E;

    move-result-object v3

    goto :goto_4

    .line 23
    :cond_6
    :goto_3
    sget-object v3, LL7/E;->h:LL7/E;

    :goto_4
    iput-object v3, p0, LY7/n;->u:LL7/E;

    .line 24
    invoke-interface {p3}, Lb8/s;->getVisibility()LL7/x0;

    move-result-object v3

    iput-object v3, p0, LY7/n;->v:LL7/x0;

    .line 25
    invoke-interface {p3}, Lb8/g;->h()Lb8/g;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-interface {p3}, Lb8/s;->M()Z

    move-result v3

    if-nez v3, :cond_7

    move v3, v5

    goto :goto_5

    :cond_7
    move v3, v4

    :goto_5
    iput-boolean v3, p0, LY7/n;->w:Z

    .line 26
    new-instance v3, LY7/n$b;

    invoke-direct {v3, p0}, LY7/n$b;-><init>(LY7/n;)V

    iput-object v3, p0, LY7/n;->x:LY7/n$b;

    move-object v1, v0

    .line 27
    new-instance v0, LY7/z;

    if-eqz p4, :cond_8

    move v4, v5

    :cond_8
    const/16 v6, 0x10

    const/4 v7, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    move-object v3, p3

    invoke-direct/range {v0 .. v7}, LY7/z;-><init>(LX7/k;LL7/e;Lb8/g;ZLY7/z;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    iput-object v3, p0, LY7/n;->y:LY7/z;

    .line 28
    sget-object v4, LL7/f0;->e:LL7/f0$a;

    invoke-virtual {v1}, LX7/k;->e()LB8/n;

    move-result-object v5

    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    move-result-object v6

    invoke-virtual {v6}, LX7/d;->k()LD8/p;

    move-result-object v6

    invoke-interface {v6}, LD8/p;->d()LD8/g;

    move-result-object v6

    new-instance v7, LY7/l;

    invoke-direct {v7, p0}, LY7/l;-><init>(LY7/n;)V

    invoke-virtual {v4, p0, v5, v6, v7}, LL7/f0$a;->a(LL7/e;LB8/n;LD8/g;Lkotlin/jvm/functions/Function1;)LL7/f0;

    move-result-object v4

    iput-object v4, p0, LY7/n;->z:LL7/f0;

    .line 29
    new-instance v4, Lv8/g;

    invoke-direct {v4, v3}, Lv8/g;-><init>(Lv8/k;)V

    iput-object v4, p0, LY7/n;->A:Lv8/g;

    .line 30
    new-instance v3, LY7/a0;

    invoke-direct {v3, v1, p3, p0}, LY7/a0;-><init>(LX7/k;Lb8/g;LW7/c;)V

    iput-object v3, p0, LY7/n;->B:LY7/a0;

    .line 31
    invoke-static {v1, p3}, LX7/h;->a(LX7/k;Lb8/d;)LM7/h;

    move-result-object v2

    iput-object v2, p0, LY7/n;->C:LM7/h;

    .line 32
    invoke-virtual {v1}, LX7/k;->e()LB8/n;

    move-result-object v1

    new-instance v2, LY7/m;

    invoke-direct {v2, p0}, LY7/m;-><init>(LY7/n;)V

    invoke-interface {v1, v2}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object v1

    iput-object v1, p0, LY7/n;->D:LB8/i;

    return-void
.end method

.method public synthetic constructor <init>(LX7/k;LL7/m;Lb8/g;LL7/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/4 p4, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, LY7/n;-><init>(LX7/k;LL7/m;Lb8/g;LL7/e;)V

    return-void
.end method

.method public static final synthetic H0(LY7/n;)LL7/e;
    .locals 0

    .line 1
    iget-object p0, p0, LY7/n;->q:LL7/e;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic I0(LY7/n;)LX7/k;
    .locals 0

    .line 1
    iget-object p0, p0, LY7/n;->r:LX7/k;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic J0(LY7/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/n;->T0(LY7/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic K0(LY7/n;LD8/g;)LY7/z;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LY7/n;->U0(LY7/n;LD8/g;)LY7/z;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic L0(LY7/n;)Ljava/util/List;
    .locals 0

    .line 1
    invoke-static {p0}, LY7/n;->N0(LY7/n;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final N0(LY7/n;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, LY7/n;->p:Lb8/g;

    .line 2
    .line 3
    invoke-interface {v0}, Lb8/z;->getTypeParameters()Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_1

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, Lb8/y;

    .line 33
    .line 34
    iget-object v3, p0, LY7/n;->r:LX7/k;

    .line 35
    .line 36
    invoke-virtual {v3}, LX7/k;->f()LX7/p;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-interface {v3, v2}, LX7/p;->a(Lb8/y;)LL7/m0;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 51
    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 55
    .line 56
    .line 57
    const-string v3, "Parameter "

    .line 58
    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v2, " surely belongs to class "

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object p0, p0, LY7/n;->p:Lb8/g;

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string p0, ", so it must be resolved"

    .line 76
    .line 77
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v0, p0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    throw v0

    .line 88
    :cond_1
    return-object v1
.end method

.method private static final T0(LY7/n;)Ljava/util/List;
    .locals 1

    .line 1
    invoke-static {p0}, Ls8/e;->n(LL7/h;)Lk8/b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object p0, p0, LY7/n;->o:LX7/k;

    .line 8
    .line 9
    invoke-virtual {p0}, LX7/k;->a()LX7/d;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, LX7/d;->f()LU7/A;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0, v0}, LU7/A;->a(Lk8/b;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method private static final U0(LY7/n;LD8/g;)LY7/z;
    .locals 7

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v1, LY7/z;

    .line 7
    .line 8
    iget-object v2, p0, LY7/n;->r:LX7/k;

    .line 9
    .line 10
    iget-object v4, p0, LY7/n;->p:Lb8/g;

    .line 11
    .line 12
    iget-object p1, p0, LY7/n;->q:LL7/e;

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    :goto_0
    move v5, p1

    .line 18
    goto :goto_1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    goto :goto_0

    .line 21
    :goto_1
    iget-object v6, p0, LY7/n;->y:LY7/z;

    .line 22
    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v6}, LY7/z;-><init>(LX7/k;LL7/e;Lb8/g;ZLY7/z;)V

    .line 25
    .line 26
    .line 27
    return-object v1
.end method


# virtual methods
.method public bridge synthetic A0()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY7/n;->R0()LY7/z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

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

.method public I()Ljava/util/Collection;
    .locals 8

    .line 1
    iget-object v0, p0, LY7/n;->u:LL7/E;

    .line 2
    .line 3
    sget-object v1, LL7/E;->i:LL7/E;

    .line 4
    .line 5
    if-ne v0, v1, :cond_3

    .line 6
    .line 7
    sget-object v2, LC8/I0;->h:LC8/I0;

    .line 8
    .line 9
    const/4 v6, 0x7

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static/range {v2 .. v7}, LZ7/b;->b(LC8/I0;ZZLL7/m0;ILjava/lang/Object;)LZ7/a;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, p0, LY7/n;->p:Lb8/g;

    .line 19
    .line 20
    invoke-interface {v1}, Lb8/g;->J()LO8/i;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    new-instance v2, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v1}, LO8/i;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lb8/j;

    .line 44
    .line 45
    iget-object v4, p0, LY7/n;->r:LX7/k;

    .line 46
    .line 47
    invoke-virtual {v4}, LX7/k;->g()LZ7/e;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    invoke-virtual {v4, v3, v0}, LZ7/e;->p(Lb8/x;LZ7/a;)LC8/S;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-virtual {v3}, LC8/S;->K0()LC8/v0;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v3}, LC8/v0;->p()LL7/h;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    instance-of v4, v3, LL7/e;

    .line 64
    .line 65
    if-eqz v4, :cond_1

    .line 66
    .line 67
    check-cast v3, LL7/e;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    const/4 v3, 0x0

    .line 71
    :goto_1
    if-eqz v3, :cond_0

    .line 72
    .line 73
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    new-instance v0, LY7/n$c;

    .line 78
    .line 79
    invoke-direct {v0}, LY7/n$c;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-static {v2, v0}, Lj7/q;->H0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    return-object v0

    .line 87
    :cond_3
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
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
    iget-boolean v0, p0, LY7/n;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic L(LD8/g;)Lv8/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LY7/n;->S0(LD8/g;)LY7/z;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final M0(LV7/j;LL7/e;)LY7/n;
    .locals 3

    .line 1
    const-string v0, "javaResolverCache"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LY7/n;

    .line 7
    .line 8
    iget-object v1, p0, LY7/n;->r:LX7/k;

    .line 9
    .line 10
    invoke-virtual {v1}, LX7/k;->a()LX7/d;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    invoke-virtual {v2, p1}, LX7/d;->x(LV7/j;)LX7/d;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {v1, p1}, LX7/c;->m(LX7/k;LX7/d;)LX7/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p0}, LO7/j;->b()LL7/m;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, "getContainingDeclaration(...)"

    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, LY7/n;->p:Lb8/g;

    .line 32
    .line 33
    invoke-direct {v0, p1, v1, v2, p2}, LY7/n;-><init>(LX7/k;LL7/m;Lb8/g;LL7/e;)V

    .line 34
    .line 35
    .line 36
    return-object v0
.end method

.method public O()LL7/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public O0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->y:LY7/z;

    .line 2
    .line 3
    invoke-virtual {v0}, LY7/z;->a1()LB8/i;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Ljava/util/List;

    .line 12
    .line 13
    return-object v0
.end method

.method public P()Lv8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->B:LY7/a0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final P0()Lb8/g;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->p:Lb8/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final Q0()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->s:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
    return-object v0
.end method

.method public R()LL7/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public R0()LY7/z;
    .locals 2

    .line 1
    invoke-super {p0}, LO7/a;->A0()Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.load.java.lazy.descriptors.LazyJavaClassMemberScope"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    check-cast v0, LY7/z;

    .line 11
    .line 12
    return-object v0
.end method

.method protected S0(LD8/g;)LY7/z;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LY7/n;->z:LL7/f0;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LL7/f0;->c(LD8/g;)Lv8/k;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, LY7/z;

    .line 13
    .line 14
    return-object p1
.end method

.method public bridge synthetic f()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-virtual {p0}, LY7/n;->O0()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->C:LM7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public getKind()LL7/f;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->t:LL7/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 2

    .line 1
    iget-object v0, p0, LY7/n;->v:LL7/x0;

    .line 2
    .line 3
    sget-object v1, LL7/t;->a:LL7/u;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, LY7/n;->p:Lb8/g;

    .line 12
    .line 13
    invoke-interface {v0}, Lb8/g;->h()Lb8/g;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    sget-object v0, LU7/y;->a:LL7/u;

    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v0

    .line 25
    :cond_0
    iget-object v0, p0, LY7/n;->v:LL7/x0;

    .line 26
    .line 27
    invoke-static {v0}, LU7/V;->d(LL7/x0;)LL7/u;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
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
    iget-object v0, p0, LY7/n;->x:LY7/n$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public k()LL7/E;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->u:LL7/E;

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
    iget-object v0, p0, LY7/n;->D:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/List;

    .line 8
    .line 9
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
    const-string v1, "Lazy Java class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ls8/e;->p(LL7/m;)Lk8/d;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    return-object v0
.end method

.method public v0()Lv8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LY7/n;->A:Lv8/g;

    .line 2
    .line 3
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
