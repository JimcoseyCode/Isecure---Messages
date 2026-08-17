.class public final Le9/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:Lj9/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    const-wide/16 v0, 0x5

    .line 5
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const/4 v3, 0x5

    invoke-direct {p0, v3, v0, v1, v2}, Le9/k;-><init>(IJLjava/util/concurrent/TimeUnit;)V

    return-void
.end method

.method public constructor <init>(IJLjava/util/concurrent/TimeUnit;)V
    .locals 7

    const-string v0, "timeUnit"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance v1, Lj9/h;

    .line 3
    sget-object v2, Li9/e;->h:Li9/e;

    move v3, p1

    move-wide v4, p2

    move-object v6, p4

    .line 4
    invoke-direct/range {v1 .. v6}, Lj9/h;-><init>(Li9/e;IJLjava/util/concurrent/TimeUnit;)V

    invoke-direct {p0, v1}, Le9/k;-><init>(Lj9/h;)V

    return-void
.end method

.method public constructor <init>(Lj9/h;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/k;->a:Lj9/h;

    return-void
.end method


# virtual methods
.method public final a()Lj9/h;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/k;->a:Lj9/h;

    .line 2
    .line 3
    return-object v0
.end method
