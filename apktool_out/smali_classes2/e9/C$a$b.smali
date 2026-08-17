.class public final Le9/C$a$b;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/C$a;->g(Lt9/k;Le9/x;)Le9/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt9/k;

.field final synthetic b:Le9/x;


# direct methods
.method constructor <init>(Lt9/k;Le9/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/C$a$b;->a:Lt9/k;

    .line 2
    .line 3
    iput-object p2, p0, Le9/C$a$b;->b:Le9/x;

    .line 4
    .line 5
    invoke-direct {p0}, Le9/C;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget-object v0, p0, Le9/C$a$b;->a:Lt9/k;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt9/k;->E()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    int-to-long v0, v0

    .line 8
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/C$a$b;->b:Le9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/C$a$b;->a:Lt9/k;

    .line 7
    .line 8
    invoke-interface {p1, v0}, Lt9/i;->S(Lt9/k;)Lt9/i;

    .line 9
    .line 10
    .line 11
    return-void
.end method
