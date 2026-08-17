.class public LM3/k;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LM3/b;


# instance fields
.field public a:I

.field public b:I

.field c:B

.field public d:B

.field e:B


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, LM3/k;->a:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, LM3/k;->b:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput-byte v0, p0, LM3/k;->c:B

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput-byte v0, p0, LM3/k;->d:B

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput-byte p1, p0, LM3/k;->e:B

    .line 30
    .line 31
    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/k;->c:B

    .line 2
    .line 3
    const/16 v1, 0x80

    .line 4
    .line 5
    and-int/2addr v0, v1

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    return v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0
.end method

.method public c()I
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/k;->c:B

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x7

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    shl-int v0, v1, v0

    .line 7
    .line 8
    return v0
.end method
