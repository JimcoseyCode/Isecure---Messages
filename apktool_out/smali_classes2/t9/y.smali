.class public final Lt9/y;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lt9/i;


# instance fields
.field public final g:Lt9/D;

.field public final h:Lt9/h;

.field public i:Z


# direct methods
.method public constructor <init>(Lt9/D;)V
    .locals 1

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lt9/y;->g:Lt9/D;

    .line 10
    .line 11
    new-instance p1, Lt9/h;

    .line 12
    .line 13
    invoke-direct {p1}, Lt9/h;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, Lt9/y;->h:Lt9/h;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public C0(J)Lt9/i;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lt9/h;->X0(J)Lt9/h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string p2, "closed"

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public E0()Ljava/io/OutputStream;
    .locals 1

    .line 1
    new-instance v0, Lt9/y$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lt9/y$a;-><init>(Lt9/y;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public G(Lt9/F;)J
    .locals 6

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-wide/16 v0, 0x0

    .line 7
    .line 8
    :goto_0
    iget-object v2, p0, Lt9/y;->h:Lt9/h;

    .line 9
    .line 10
    const-wide/16 v3, 0x2000

    .line 11
    .line 12
    invoke-interface {p1, v2, v3, v4}, Lt9/F;->read(Lt9/h;J)J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    const-wide/16 v4, -0x1

    .line 17
    .line 18
    cmp-long v4, v2, v4

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    add-long/2addr v0, v2

    .line 23
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-wide v0
.end method

.method public K()Lt9/i;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt9/h;->r()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lt9/y;->g:Lt9/D;

    .line 18
    .line 19
    iget-object v3, p0, Lt9/y;->h:Lt9/h;

    .line 20
    .line 21
    invoke-interface {v2, v3, v0, v1}, Lt9/D;->write(Lt9/h;J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "closed"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method

.method public S(Lt9/k;)Lt9/i;
    .locals 1

    .line 1
    const-string v0, "byteString"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lt9/h;->S0(Lt9/k;)Lt9/h;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "closed"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public V(Ljava/lang/String;)Lt9/i;
    .locals 1

    .line 1
    const-string v0, "string"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lt9/h;->e1(Ljava/lang/String;)Lt9/h;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "closed"

    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    throw p1
.end method

.method public a0(J)Lt9/i;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lt9/h;->Y0(J)Lt9/h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string p2, "closed"

    .line 18
    .line 19
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public c()Lt9/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public close()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_3

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lt9/y;->g:Lt9/D;

    .line 18
    .line 19
    iget-object v1, p0, Lt9/y;->h:Lt9/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Lt9/h;->size()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-interface {v0, v1, v2, v3}, Lt9/D;->write(Lt9/h;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 32
    :goto_1
    :try_start_1
    iget-object v1, p0, Lt9/y;->g:Lt9/D;

    .line 33
    .line 34
    invoke-interface {v1}, Lt9/D;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    .line 37
    goto :goto_2

    .line 38
    :catchall_1
    move-exception v1

    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    move-object v0, v1

    .line 42
    :cond_1
    :goto_2
    const/4 v1, 0x1

    .line 43
    iput-boolean v1, p0, Lt9/y;->i:Z

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    goto :goto_3

    .line 48
    :cond_2
    throw v0

    .line 49
    :cond_3
    :goto_3
    return-void
.end method

.method public flush()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v0, v0, v2

    .line 14
    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    iget-object v0, p0, Lt9/y;->g:Lt9/D;

    .line 18
    .line 19
    iget-object v1, p0, Lt9/y;->h:Lt9/h;

    .line 20
    .line 21
    invoke-virtual {v1}, Lt9/h;->size()J

    .line 22
    .line 23
    .line 24
    move-result-wide v2

    .line 25
    invoke-interface {v0, v1, v2, v3}, Lt9/D;->write(Lt9/h;J)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Lt9/y;->g:Lt9/D;

    .line 29
    .line 30
    invoke-interface {v0}, Lt9/D;->flush()V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 35
    .line 36
    const-string v1, "closed"

    .line 37
    .line 38
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    return v0
.end method

.method public timeout()Lt9/G;
    .locals 1

    .line 1
    iget-object v0, p0, Lt9/y;->g:Lt9/D;

    .line 2
    .line 3
    invoke-interface {v0}, Lt9/D;->timeout()Lt9/G;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
    const-string v1, "buffer("

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lt9/y;->g:Lt9/D;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const/16 v1, 0x29

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 3
    invoke-virtual {v0, p1}, Lt9/h;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 4
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    return p1

    .line 5
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([B)Lt9/i;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-boolean v0, p0, Lt9/y;->i:Z

    if-nez v0, :cond_0

    .line 12
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 13
    invoke-virtual {v0, p1}, Lt9/h;->U0([B)Lt9/h;

    .line 14
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    move-result-object p1

    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write([BII)Lt9/i;
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    iget-boolean v0, p0, Lt9/y;->i:Z

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 18
    invoke-virtual {v0, p1, p2, p3}, Lt9/h;->V0([BII)Lt9/h;

    .line 19
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    move-result-object p1

    return-object p1

    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Lt9/h;J)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-boolean v0, p0, Lt9/y;->i:Z

    if-nez v0, :cond_0

    .line 7
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lt9/h;->write(Lt9/h;J)V

    .line 9
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    return-void

    .line 10
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public writeByte(I)Lt9/i;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt9/h;->W0(I)Lt9/h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "closed"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public writeInt(I)Lt9/i;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt9/h;->Z0(I)Lt9/h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "closed"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public writeShort(I)Lt9/i;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lt9/h;->b1(I)Lt9/h;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lt9/y;->K()Lt9/i;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 16
    .line 17
    const-string v0, "closed"

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    throw p1
.end method

.method public x()Lt9/i;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lt9/y;->i:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lt9/y;->h:Lt9/h;

    .line 6
    .line 7
    invoke-virtual {v0}, Lt9/h;->size()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    cmp-long v2, v0, v2

    .line 14
    .line 15
    if-lez v2, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lt9/y;->g:Lt9/D;

    .line 18
    .line 19
    iget-object v3, p0, Lt9/y;->h:Lt9/h;

    .line 20
    .line 21
    invoke-interface {v2, v3, v0, v1}, Lt9/D;->write(Lt9/h;J)V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-object p0

    .line 25
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 26
    .line 27
    const-string v1, "closed"

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw v0
.end method
