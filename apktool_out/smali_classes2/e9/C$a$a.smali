.class public final Le9/C$a$a;
.super Le9/C;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/C$a;->e(Ljava/io/File;Le9/x;)Le9/C;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/io/File;

.field final synthetic b:Le9/x;


# direct methods
.method constructor <init>(Ljava/io/File;Le9/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, Le9/C$a$a;->a:Ljava/io/File;

    .line 2
    .line 3
    iput-object p2, p0, Le9/C$a$a;->b:Le9/x;

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
    iget-object v0, p0, Le9/C$a$a;->a:Ljava/io/File;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/io/File;->length()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
.end method

.method public contentType()Le9/x;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/C$a$a;->b:Le9/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public writeTo(Lt9/i;)V
    .locals 2

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/C$a$a;->a:Ljava/io/File;

    .line 7
    .line 8
    invoke-static {v0}, Lt9/s;->j(Ljava/io/File;)Lt9/F;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :try_start_0
    invoke-interface {p1, v0}, Lt9/i;->G(Lt9/F;)J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    invoke-static {v0, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 22
    :catchall_1
    move-exception v1

    .line 23
    invoke-static {v0, p1}, Lt7/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 24
    .line 25
    .line 26
    throw v1
.end method
