.class public final Le9/C$a$c;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/C$a;->h([BLe9/x;II)Le9/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:[B

.field final synthetic b:Le9/x;

.field final synthetic c:I

.field final synthetic d:I


# direct methods
.method constructor <init>([BLe9/x;II)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/C$a$c;->a:[B

    .line 2
    .line 3
    iput-object p2, p0, Le9/C$a$c;->b:Le9/x;

    .line 4
    .line 5
    iput p3, p0, Le9/C$a$c;->c:I

    .line 6
    .line 7
    iput p4, p0, Le9/C$a$c;->d:I

    .line 8
    .line 9
    invoke-direct {p0}, Le9/C;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public contentLength()J
    .locals 2

    .line 1
    iget v0, p0, Le9/C$a$c;->c:I

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/C$a$c;->b:Le9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 3

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/C$a$c;->a:[B

    .line 7
    .line 8
    iget v1, p0, Le9/C$a$c;->d:I

    .line 9
    .line 10
    iget v2, p0, Le9/C$a$c;->c:I

    .line 11
    .line 12
    invoke-interface {p1, v0, v1, v2}, Lt9/i;->write([BII)Lt9/i;

    .line 13
    .line 14
    .line 15
    return-void
.end method
