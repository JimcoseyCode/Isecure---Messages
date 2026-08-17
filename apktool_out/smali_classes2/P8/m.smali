.class final LP8/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP8/l;


# instance fields
.field private final a:Ljava/util/regex/Matcher;

.field private final b:Ljava/lang/CharSequence;

.field private final c:LP8/k;

.field private d:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    const-string v0, "matcher"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "input"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LP8/m;->a:Ljava/util/regex/Matcher;

    .line 15
    .line 16
    iput-object p2, p0, LP8/m;->b:Ljava/lang/CharSequence;

    .line 17
    .line 18
    new-instance p1, LP8/m$b;

    .line 19
    .line 20
    invoke-direct {p1, p0}, LP8/m$b;-><init>(LP8/m;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, LP8/m;->c:LP8/k;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic c(LP8/m;)Ljava/util/regex/MatchResult;
    .locals 0

    .line 1
    invoke-direct {p0}, LP8/m;->d()Ljava/util/regex/MatchResult;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final d()Ljava/util/regex/MatchResult;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/m;->a:Ljava/util/regex/Matcher;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a()LP8/l$b;
    .locals 1

    .line 1
    invoke-static {p0}, LP8/l$a;->a(LP8/l;)LP8/l$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LP8/m;->d:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, LP8/m$a;

    .line 6
    .line 7
    invoke-direct {v0, p0}, LP8/m$a;-><init>(LP8/m;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LP8/m;->d:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, LP8/m;->d:Ljava/util/List;

    .line 13
    .line 14
    invoke-static {v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method
