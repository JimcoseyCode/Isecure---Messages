.class public LM3/j;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LM3/b;


# instance fields
.field public a:I

.field public b:I

.field public c:I

.field public d:I

.field private e:B

.field public f:LM3/c;

.field public g:I

.field public h:I


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
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, LM3/j;->a:I

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, LM3/j;->b:I

    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, LM3/j;->c:I

    .line 18
    .line 19
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/gif/io/GifReader;->readUInt16()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, LM3/j;->d:I

    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput-byte v0, p0, LM3/j;->e:B

    .line 30
    .line 31
    invoke-virtual {p0}, LM3/j;->c()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    new-instance v0, LM3/c;

    .line 38
    .line 39
    invoke-virtual {p0}, LM3/j;->d()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-direct {v0, v1}, LM3/c;-><init>(I)V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, LM3/j;->f:LM3/c;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, LM3/c;->a(Lcom/github/penfeizhou/animation/gif/io/GifReader;)V

    .line 49
    .line 50
    .line 51
    :cond_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    and-int/lit16 v0, v0, 0xff

    .line 56
    .line 57
    iput v0, p0, LM3/j;->g:I

    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->position()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iput v0, p0, LM3/j;->h:I

    .line 64
    .line 65
    :goto_0
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    and-int/lit16 v0, v0, 0xff

    .line 72
    .line 73
    int-to-long v0, v0

    .line 74
    invoke-virtual {p1, v0, v1}, Lcom/github/penfeizhou/animation/io/c;->skip(J)J

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    return-void
.end method

.method public b()Z
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/j;->e:B

    .line 2
    .line 3
    const/16 v1, 0x40

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

.method public c()Z
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/j;->e:B

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

.method public d()I
    .locals 2

    .line 1
    iget-byte v0, p0, LM3/j;->e:B

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0xf

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    shl-int v0, v1, v0

    .line 7
    .line 8
    return v0
.end method
