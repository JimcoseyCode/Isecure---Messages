.class final Le9/c$a;
.super Le9/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final g:Lt9/j;

.field private final h:Lh9/d$d;

.field private final i:Ljava/lang/String;

.field private final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lh9/d$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Le9/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Le9/c$a;->h:Lh9/d$d;

    .line 10
    .line 11
    iput-object p2, p0, Le9/c$a;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Le9/c$a;->j:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Lh9/d$d;->e(I)Lt9/F;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Le9/c$a$a;

    .line 21
    .line 22
    invoke-direct {p2, p0, p1, p1}, Le9/c$a$a;-><init>(Le9/c$a;Lt9/F;Lt9/F;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Lt9/s;->d(Lt9/F;)Lt9/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Le9/c$a;->g:Lt9/j;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 3

    .line 1
    iget-object v0, p0, Le9/c$a;->j:Ljava/lang/String;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lf9/c;->T(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    return-wide v1
.end method

.method public contentType()Le9/x;
    .locals 2

    .line 1
    iget-object v0, p0, Le9/c$a;->i:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Le9/x;->g:Le9/x$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Le9/x$a;->c(Ljava/lang/String;)Le9/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public final e()Lh9/d$d;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/c$a;->h:Lh9/d$d;

    .line 2
    .line 3
    return-object v0
.end method

.method public source()Lt9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/c$a;->g:Lt9/j;

    .line 2
    .line 3
    return-object v0
.end method
