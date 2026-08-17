.class public final LL7/f0;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LL7/f0$a;
    }
.end annotation


# static fields
.field public static final e:LL7/f0$a;

.field static final synthetic f:[LC7/k;


# instance fields
.field private final a:LL7/e;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:LD8/g;

.field private final d:LB8/i;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lkotlin/jvm/internal/v;

    .line 2
    .line 3
    const-class v1, LL7/f0;

    .line 4
    .line 5
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "scopeForOwnerModule"

    .line 10
    .line 11
    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

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
    sput-object v1, LL7/f0;->f:[LC7/k;

    .line 27
    .line 28
    new-instance v0, LL7/f0$a;

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-direct {v0, v1}, LL7/f0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, LL7/f0;->e:LL7/f0$a;

    .line 35
    .line 36
    return-void
.end method

.method private constructor <init>(LL7/e;LB8/n;Lkotlin/jvm/functions/Function1;LD8/g;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LL7/f0;->a:LL7/e;

    .line 4
    iput-object p3, p0, LL7/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p4, p0, LL7/f0;->c:LD8/g;

    .line 6
    new-instance p1, LL7/d0;

    invoke-direct {p1, p0}, LL7/d0;-><init>(LL7/f0;)V

    invoke-interface {p2, p1}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p1

    iput-object p1, p0, LL7/f0;->d:LB8/i;

    return-void
.end method

.method public synthetic constructor <init>(LL7/e;LB8/n;Lkotlin/jvm/functions/Function1;LD8/g;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, LL7/f0;-><init>(LL7/e;LB8/n;Lkotlin/jvm/functions/Function1;LD8/g;)V

    return-void
.end method

.method static synthetic a(LL7/f0;)Lv8/k;
    .locals 0

    .line 1
    invoke-static {p0}, LL7/f0;->f(LL7/f0;)Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method static synthetic b(LL7/f0;LD8/g;)Lv8/k;
    .locals 0

    .line 1
    invoke-static {p0, p1}, LL7/f0;->d(LL7/f0;LD8/g;)Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final d(LL7/f0;LD8/g;)Lv8/k;
    .locals 0

    .line 1
    iget-object p0, p0, LL7/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lv8/k;

    .line 8
    .line 9
    return-object p0
.end method

.method private final e()Lv8/k;
    .locals 3

    .line 1
    iget-object v0, p0, LL7/f0;->d:LB8/i;

    .line 2
    .line 3
    sget-object v1, LL7/f0;->f:[LC7/k;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {v0, p0, v1}, LB8/m;->a(LB8/i;Ljava/lang/Object;LC7/k;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lv8/k;

    .line 13
    .line 14
    return-object v0
.end method

.method private static final f(LL7/f0;)Lv8/k;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/f0;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    iget-object p0, p0, LL7/f0;->c:LD8/g;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lv8/k;

    .line 10
    .line 11
    return-object p0
.end method


# virtual methods
.method public final c(LD8/g;)Lv8/k;
    .locals 2

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LL7/f0;->a:LL7/e;

    .line 7
    .line 8
    invoke-static {v0}, Ls8/e;->s(LL7/m;)LL7/H;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {p1, v0}, LD8/g;->d(LL7/H;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    invoke-direct {p0}, LL7/f0;->e()Lv8/k;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_0
    iget-object v0, p0, LL7/f0;->a:LL7/e;

    .line 24
    .line 25
    invoke-interface {v0}, LL7/h;->j()LC8/v0;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    const-string v1, "getTypeConstructor(...)"

    .line 30
    .line 31
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, LD8/g;->e(LC8/v0;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    invoke-direct {p0}, LL7/f0;->e()Lv8/k;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :cond_1
    iget-object v0, p0, LL7/f0;->a:LL7/e;

    .line 46
    .line 47
    new-instance v1, LL7/e0;

    .line 48
    .line 49
    invoke-direct {v1, p0, p1}, LL7/e0;-><init>(LL7/f0;LD8/g;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0, v1}, LD8/g;->c(LL7/e;Lw7/a;)Lv8/k;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    return-object p1
.end method
