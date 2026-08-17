.class public final LX7/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LX7/p;


# instance fields
.field private final a:LX7/k;

.field private final b:LL7/m;

.field private final c:I

.field private final d:Ljava/util/Map;

.field private final e:LB8/h;


# direct methods
.method public constructor <init>(LX7/k;LL7/m;Lb8/z;I)V
    .locals 1

    .line 1
    const-string v0, "c"

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
    const-string v0, "typeParameterOwner"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LX7/m;->a:LX7/k;

    .line 20
    .line 21
    iput-object p2, p0, LX7/m;->b:LL7/m;

    .line 22
    .line 23
    iput p4, p0, LX7/m;->c:I

    .line 24
    .line 25
    invoke-interface {p3}, Lb8/z;->getTypeParameters()Ljava/util/List;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-static {p2}, LM8/a;->d(Ljava/lang/Iterable;)Ljava/util/Map;

    .line 30
    .line 31
    .line 32
    move-result-object p2

    .line 33
    iput-object p2, p0, LX7/m;->d:Ljava/util/Map;

    .line 34
    .line 35
    invoke-virtual {p1}, LX7/k;->e()LB8/n;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    new-instance p2, LX7/l;

    .line 40
    .line 41
    invoke-direct {p2, p0}, LX7/l;-><init>(LX7/m;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {p1, p2}, LB8/n;->i(Lkotlin/jvm/functions/Function1;)LB8/h;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, LX7/m;->e:LB8/h;

    .line 49
    .line 50
    return-void
.end method

.method static synthetic b(LX7/m;Lb8/y;)LY7/c0;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LX7/m;->c(LX7/m;Lb8/y;)LY7/c0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final c(LX7/m;Lb8/y;)LY7/c0;
    .locals 4

    .line 1
    const-string v0, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX7/m;->d:Ljava/util/Map;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    new-instance v1, LY7/c0;

    .line 21
    .line 22
    iget-object v2, p0, LX7/m;->a:LX7/k;

    .line 23
    .line 24
    invoke-static {v2, p0}, LX7/c;->d(LX7/k;LX7/p;)LX7/k;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    iget-object v3, p0, LX7/m;->b:LL7/m;

    .line 29
    .line 30
    invoke-interface {v3}, LM7/a;->getAnnotations()LM7/h;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-static {v2, v3}, LX7/c;->k(LX7/k;LM7/h;)LX7/k;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    iget v3, p0, LX7/m;->c:I

    .line 39
    .line 40
    add-int/2addr v3, v0

    .line 41
    iget-object p0, p0, LX7/m;->b:LL7/m;

    .line 42
    .line 43
    invoke-direct {v1, v2, p1, v3, p0}, LY7/c0;-><init>(LX7/k;Lb8/y;ILL7/m;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_0
    const/4 p0, 0x0

    .line 48
    return-object p0
.end method


# virtual methods
.method public a(Lb8/y;)LL7/m0;
    .locals 1

    .line 1
    const-string v0, "javaTypeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX7/m;->e:LB8/h;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, LY7/c0;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    iget-object v0, p0, LX7/m;->a:LX7/k;

    .line 18
    .line 19
    invoke-virtual {v0}, LX7/k;->f()LX7/p;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0, p1}, LX7/p;->a(Lb8/y;)LL7/m0;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1
.end method
