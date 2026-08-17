.class public final LC8/s;
.super LC8/p0;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:LM7/h;


# direct methods
.method public constructor <init>(LM7/h;)V
    .locals 1

    .line 1
    const-string v0, "annotations"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, LC8/p0;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LC8/s;->a:LM7/h;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic a(LC8/p0;)LC8/p0;
    .locals 0

    .line 1
    check-cast p1, LC8/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LC8/s;->d(LC8/s;)LC8/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public b()LC7/d;
    .locals 1

    .line 1
    const-class v0, LC8/s;

    .line 2
    .line 3
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public bridge synthetic c(LC8/p0;)LC8/p0;
    .locals 0

    .line 1
    check-cast p1, LC8/s;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LC8/s;->f(LC8/s;)LC8/s;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public d(LC8/s;)LC8/s;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p0

    .line 4
    :cond_0
    new-instance v0, LC8/s;

    .line 5
    .line 6
    iget-object v1, p0, LC8/s;->a:LM7/h;

    .line 7
    .line 8
    iget-object p1, p1, LC8/s;->a:LM7/h;

    .line 9
    .line 10
    invoke-static {v1, p1}, LM7/j;->a(LM7/h;LM7/h;)LM7/h;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v0, p1}, LC8/s;-><init>(LM7/h;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public final e()LM7/h;
    .locals 1

    .line 1
    iget-object v0, p0, LC8/s;->a:LM7/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    instance-of v0, p1, LC8/s;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    return p1

    .line 7
    :cond_0
    check-cast p1, LC8/s;

    .line 8
    .line 9
    iget-object p1, p1, LC8/s;->a:LM7/h;

    .line 10
    .line 11
    iget-object v0, p0, LC8/s;->a:LM7/h;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    return p1
.end method

.method public f(LC8/s;)LC8/s;
    .locals 0

    .line 1
    invoke-static {p1, p0}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, LC8/s;->a:LM7/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
