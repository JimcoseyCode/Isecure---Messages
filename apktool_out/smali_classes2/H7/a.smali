.class public final LH7/a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LH7/a;

.field private static final b:Ljava/util/Set;

.field private static final c:Lk8/b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, LH7/a;

    .line 2
    .line 3
    invoke-direct {v0}, LH7/a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LH7/a;->a:LH7/a;

    .line 7
    .line 8
    sget-object v1, LU7/I;->a:Lk8/c;

    .line 9
    .line 10
    sget-object v2, LU7/I;->l:Lk8/c;

    .line 11
    .line 12
    sget-object v3, LU7/I;->m:Lk8/c;

    .line 13
    .line 14
    sget-object v4, LU7/I;->d:Lk8/c;

    .line 15
    .line 16
    sget-object v5, LU7/I;->f:Lk8/c;

    .line 17
    .line 18
    sget-object v6, LU7/I;->i:Lk8/c;

    .line 19
    .line 20
    filled-new-array/range {v1 .. v6}, [Lk8/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-static {v0}, Lj7/q;->m([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    new-instance v1, Ljava/util/LinkedHashSet;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 31
    .line 32
    .line 33
    sget-object v2, Lk8/b;->d:Lk8/b$a;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    check-cast v3, Lk8/c;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    sput-object v1, LH7/a;->b:Ljava/util/Set;

    .line 60
    .line 61
    sget-object v0, Lk8/b;->d:Lk8/b$a;

    .line 62
    .line 63
    sget-object v1, LU7/I;->j:Lk8/c;

    .line 64
    .line 65
    const-string v2, "REPEATABLE_ANNOTATION"

    .line 66
    .line 67
    invoke-static {v1, v2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v1}, Lk8/b$a;->c(Lk8/c;)Lk8/b;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    sput-object v0, LH7/a;->c:Lk8/b;

    .line 75
    .line 76
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lk8/b;
    .locals 1

    .line 1
    sget-object v0, LH7/a;->c:Lk8/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    .line 1
    sget-object v0, LH7/a;->b:Ljava/util/Set;

    .line 2
    .line 3
    return-object v0
.end method

.method public final c(Ld8/x;)Z
    .locals 3

    .line 1
    const-string v0, "klass"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 7
    .line 8
    invoke-direct {v0}, Lkotlin/jvm/internal/z;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v1, LH7/a$a;

    .line 12
    .line 13
    invoke-direct {v1, v0}, LH7/a$a;-><init>(Lkotlin/jvm/internal/z;)V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-interface {p1, v1, v2}, Ld8/x;->d(Ld8/x$c;[B)V

    .line 18
    .line 19
    .line 20
    iget-boolean p1, v0, Lkotlin/jvm/internal/z;->g:Z

    .line 21
    .line 22
    return p1
.end method
