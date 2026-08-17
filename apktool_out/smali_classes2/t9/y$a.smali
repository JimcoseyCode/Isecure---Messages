.class public final Lt9/y$a;
.super Ljava/io/OutputStream;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt9/y;->E0()Ljava/io/OutputStream;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic g:Lt9/y;


# direct methods
.method constructor <init>(Lt9/y;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lt9/y$a;->g:Lt9/y;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/y$a;->g:Lt9/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Lt9/y;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public flush()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt9/y$a;->g:Lt9/y;

    .line 2
    .line 3
    iget-boolean v1, v0, Lt9/y;->i:Z

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lt9/y;->flush()V

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lt9/y$a;->g:Lt9/y;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, ".outputStream()"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    return-object v0
.end method

.method public write(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lt9/y$a;->g:Lt9/y;

    iget-boolean v1, v0, Lt9/y;->i:Z

    if-nez v1, :cond_0

    .line 2
    iget-object v0, v0, Lt9/y;->h:Lt9/h;

    int-to-byte p1, p1

    .line 3
    invoke-virtual {v0, p1}, Lt9/h;->W0(I)Lt9/h;

    .line 4
    iget-object p1, p0, Lt9/y$a;->g:Lt9/y;

    invoke-virtual {p1}, Lt9/y;->K()Lt9/i;

    return-void

    .line 5
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lt9/y$a;->g:Lt9/y;

    iget-boolean v1, v0, Lt9/y;->i:Z

    if-nez v1, :cond_0

    .line 7
    iget-object v0, v0, Lt9/y;->h:Lt9/h;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lt9/h;->V0([BII)Lt9/h;

    .line 9
    iget-object p1, p0, Lt9/y$a;->g:Lt9/y;

    invoke-virtual {p1}, Lt9/y;->K()Lt9/i;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
