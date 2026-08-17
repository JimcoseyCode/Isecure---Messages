.class public abstract Lcom/github/penfeizhou/animation/io/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lcom/github/penfeizhou/animation/io/Reader;


# instance fields
.field protected reader:Lcom/github/penfeizhou/animation/io/Reader;


# direct methods
.method public constructor <init>(Lcom/github/penfeizhou/animation/io/Reader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public available()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->available()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public peek()B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->peek()B

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public position()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->position()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public read([BII)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2, p3}, Lcom/github/penfeizhou/animation/io/Reader;->read([BII)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public reset()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->reset()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public skip(J)J
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, Lcom/github/penfeizhou/animation/io/Reader;->skip(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide p1

    .line 7
    return-wide p1
.end method

.method public toInputStream()Ljava/io/InputStream;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/github/penfeizhou/animation/io/c;->reset()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lcom/github/penfeizhou/animation/io/c;->reader:Lcom/github/penfeizhou/animation/io/Reader;

    .line 5
    .line 6
    invoke-interface {v0}, Lcom/github/penfeizhou/animation/io/Reader;->toInputStream()Ljava/io/InputStream;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0
.end method
