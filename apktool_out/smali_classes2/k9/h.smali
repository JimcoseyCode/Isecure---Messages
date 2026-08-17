.class public final Lk9/h;
.super Le9/E;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:Ljava/lang/String;

.field private final h:J

.field private final i:Lt9/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLt9/j;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Le9/E;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lk9/h;->g:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Lk9/h;->h:J

    .line 12
    .line 13
    iput-object p4, p0, Lk9/h;->i:Lt9/j;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lk9/h;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 2

    .line 1
    iget-object v0, p0, Lk9/h;->g:Ljava/lang/String;

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

.method public source()Lt9/j;
    .locals 1

    .line 1
    iget-object v0, p0, Lk9/h;->i:Lt9/j;

    .line 2
    .line 3
    return-object v0
.end method
