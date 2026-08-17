.class public LM3/i;
.super LM3/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private a:I

.field private b:B

.field public c:I

.field public d:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LM3/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    and-int/lit16 v0, v0, 0xff

    .line 6
    .line 7
    iput v0, p0, LM3/i;->a:I

    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iput-byte v0, p0, LM3/i;->b:B

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput v0, p0, LM3/i;->c:I

    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    and-int/lit16 v0, v0, 0xff

    .line 26
    .line 27
    iput v0, p0, LM3/i;->d:I

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    new-instance p1, LM3/h$a;

    .line 37
    .line 38
    invoke-direct {p1}, LM3/h$a;-><init>()V

    .line 39
    .line 40
    .line 41
    throw p1
.end method

.method public c()I
    .locals 1

    .line 1
    iget-byte v0, p0, LM3/i;->b:B

    .line 2
    .line 3
    shr-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    and-int/lit8 v0, v0, 0x7

    .line 6
    .line 7
    return v0
.end method

.method public d()Z
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/i;->b:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method
