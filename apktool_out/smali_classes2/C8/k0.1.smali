.class public final LC8/k0;
.super LC8/C0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LL7/m0;

.field private final b:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(LL7/m0;)V
    .locals 1

    .line 1
    const-string v0, "typeParameter"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LC8/C0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LC8/k0;->a:LL7/m0;

    .line 10
    .line 11
    sget-object p1, Li7/l;->h:Li7/l;

    .line 12
    .line 13
    new-instance v0, LC8/j0;

    .line 14
    .line 15
    invoke-direct {v0, p0}, LC8/j0;-><init>(LC8/k0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, Li7/i;->a(Li7/l;Lw7/a;)Lkotlin/Lazy;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    iput-object p1, p0, LC8/k0;->b:Lkotlin/Lazy;

    .line 23
    .line 24
    return-void
.end method

.method private static final c(LC8/k0;)LC8/S;
    .locals 0

    .line 1
    iget-object p0, p0, LC8/k0;->a:LL7/m0;

    .line 2
    .line 3
    invoke-static {p0}, LC8/l0;->b(LL7/m0;)LC8/S;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method static synthetic d(LC8/k0;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0}, LC8/k0;->c(LC8/k0;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final e()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/k0;->b:Lkotlin/Lazy;

    .line 2
    .line 3
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, LC8/S;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()LC8/N0;
    .locals 1

    .line 1
    sget-object v0, LC8/N0;->m:LC8/N0;

    .line 2
    .line 3
    return-object v0
.end method

.method public b()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
.end method

.method public getType()LC8/S;
    .locals 1

    .line 1
    invoke-direct {p0}, LC8/k0;->e()LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public o(LD8/g;)LC8/B0;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
