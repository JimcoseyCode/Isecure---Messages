.class public final LN0/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field public static final a:LN0/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LN0/j;

    .line 2
    .line 3
    invoke-direct {v0}, LN0/j;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LN0/j;->a:LN0/j;

    .line 7
    .line 8
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
.method public final a(LN0/E;LO0/b;Ljava/util/List;LR8/N;)LN0/i;
    .locals 1

    .line 1
    const-string v0, "storage"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "migrations"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "scope"

    .line 12
    .line 13
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    if-eqz p2, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p2, LO0/a;

    .line 20
    .line 21
    invoke-direct {p2}, LO0/a;-><init>()V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object v0, LN0/h;->a:LN0/h$a;

    .line 25
    .line 26
    invoke-virtual {v0, p3}, LN0/h$a;->b(Ljava/util/List;)Lkotlin/jvm/functions/Function2;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-static {p3}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    new-instance v0, LN0/k;

    .line 35
    .line 36
    invoke-direct {v0, p1, p3, p2, p4}, LN0/k;-><init>(LN0/E;Ljava/util/List;LN0/e;LR8/N;)V

    .line 37
    .line 38
    .line 39
    return-object v0
.end method
