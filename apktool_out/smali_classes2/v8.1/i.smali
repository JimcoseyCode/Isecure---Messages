.class public final Lv8/i;
.super Lv8/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final b:LB8/i;


# direct methods
.method public constructor <init>(LB8/n;Lw7/a;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getScope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Lv8/a;-><init>()V

    .line 5
    new-instance v0, Lv8/h;

    invoke-direct {v0, p2}, Lv8/h;-><init>(Lw7/a;)V

    invoke-interface {p1, v0}, LB8/n;->e(Lw7/a;)LB8/i;

    move-result-object p1

    iput-object p1, p0, Lv8/i;->b:LB8/i;

    return-void
.end method

.method public synthetic constructor <init>(LB8/n;Lw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 2
    sget-object p1, LB8/f;->e:LB8/n;

    .line 3
    :cond_0
    invoke-direct {p0, p1, p2}, Lv8/i;-><init>(LB8/n;Lw7/a;)V

    return-void
.end method

.method public constructor <init>(Lw7/a;)V
    .locals 2

    .line 1
    const-string v0, "getScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, p1, v1, v0}, Lv8/i;-><init>(LB8/n;Lw7/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method static synthetic j(Lw7/a;)Lv8/k;
    .locals 0

    .line 1
    invoke-static {p0}, Lv8/i;->k(Lw7/a;)Lv8/k;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static final k(Lw7/a;)Lv8/k;
    .locals 1

    .line 1
    invoke-interface {p0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lv8/k;

    .line 6
    .line 7
    instance-of v0, p0, Lv8/a;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Lv8/a;

    .line 12
    .line 13
    invoke-virtual {p0}, Lv8/a;->h()Lv8/k;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    :cond_0
    return-object p0
.end method


# virtual methods
.method protected i()Lv8/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lv8/i;->b:LB8/i;

    .line 2
    .line 3
    invoke-interface {v0}, Lw7/a;->invoke()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lv8/k;

    .line 8
    .line 9
    return-object v0
.end method
