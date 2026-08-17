.class public LP4/m;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LP4/N;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LP4/N;

    invoke-direct {v0}, LP4/N;-><init>()V

    iput-object v0, p0, LP4/m;->a:LP4/N;

    return-void
.end method

.method public constructor <init>(LP4/a;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LP4/N;

    invoke-direct {v0}, LP4/N;-><init>()V

    iput-object v0, p0, LP4/m;->a:LP4/N;

    new-instance v0, LP4/K;

    invoke-direct {v0, p0}, LP4/K;-><init>(LP4/m;)V

    invoke-virtual {p1, v0}, LP4/a;->b(LP4/i;)LP4/a;

    return-void
.end method

.method static bridge synthetic f(LP4/m;)LP4/N;
    .locals 0

    .line 1
    iget-object p0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public a()LP4/l;
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    return-object v0
.end method

.method public b(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->s(Ljava/lang/Exception;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->t(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public d(Ljava/lang/Exception;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->v(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public e(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, LP4/m;->a:LP4/N;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LP4/N;->w(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
