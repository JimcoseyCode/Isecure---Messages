.class public final Lq8/z;
.super Lq8/b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final c:LC8/S;


# direct methods
.method public constructor <init>(Ljava/util/List;LC8/S;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "type"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lq8/y;

    .line 12
    .line 13
    invoke-direct {v0, p2}, Lq8/y;-><init>(LC8/S;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, p1, v0}, Lq8/b;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lq8/z;->c:LC8/S;

    .line 20
    .line 21
    return-void
.end method

.method private static final c(LC8/S;LL7/H;)LC8/S;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method static synthetic d(LC8/S;LL7/H;)LC8/S;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lq8/z;->c(LC8/S;LL7/H;)LC8/S;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method


# virtual methods
.method public final e()LC8/S;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/z;->c:LC8/S;

    .line 2
    .line 3
    return-object v0
.end method
