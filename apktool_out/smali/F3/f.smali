.class LF3/f;
.super LF3/e;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# static fields
.field static final n:I


# instance fields
.field e:I

.field f:I

.field g:I

.field h:I

.field i:I

.field j:S

.field k:S

.field l:B

.field m:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "fcTL"

    .line 2
    .line 3
    invoke-static {v0}, LF3/e;->a(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sput v0, LF3/f;->n:I

    .line 8
    .line 9
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LF3/e;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method b(LG3/a;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, LG3/a;->c()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iput v0, p0, LF3/f;->e:I

    .line 6
    .line 7
    invoke-virtual {p1}, LG3/a;->c()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    iput v0, p0, LF3/f;->f:I

    .line 12
    .line 13
    invoke-virtual {p1}, LG3/a;->c()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, LF3/f;->g:I

    .line 18
    .line 19
    invoke-virtual {p1}, LG3/a;->c()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    iput v0, p0, LF3/f;->h:I

    .line 24
    .line 25
    invoke-virtual {p1}, LG3/a;->c()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iput v0, p0, LF3/f;->i:I

    .line 30
    .line 31
    invoke-virtual {p1}, LG3/a;->d()S

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iput-short v0, p0, LF3/f;->j:S

    .line 36
    .line 37
    invoke-virtual {p1}, LG3/a;->d()S

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    iput-short v0, p0, LF3/f;->k:S

    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    iput-byte v0, p0, LF3/f;->l:B

    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/github/penfeizhou/animation/io/c;->peek()B

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    iput-byte p1, p0, LF3/f;->m:B

    .line 54
    .line 55
    return-void
.end method
