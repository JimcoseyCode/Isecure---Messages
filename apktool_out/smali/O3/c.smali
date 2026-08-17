.class public LO3/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/j;


# instance fields
.field private final a:Lv1/j;


# direct methods
.method public constructor <init>(Lv1/j;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO3/c;->a:Lv1/j;

    .line 5
    .line 6
    return-void
.end method

.method private static c(Ljava/io/InputStream;)[B
    .locals 4

    .line 1
    new-instance v0, Ljava/io/ByteArrayOutputStream;

    .line 2
    .line 3
    const/16 v1, 0x4000

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    new-array v1, v1, [B

    .line 9
    .line 10
    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const/4 v3, -0x1

    .line 15
    if-eq v2, v3, :cond_0

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :catch_0
    const/4 p0, 0x0

    .line 31
    return-object p0
.end method


# virtual methods
.method public a(Ljava/io/InputStream;IILv1/h;)Lx1/v;
    .locals 1

    .line 1
    invoke-static {p1}, LO3/c;->c(Ljava/io/InputStream;)[B

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iget-object v0, p0, LO3/c;->a:Lv1/j;

    .line 14
    .line 15
    invoke-interface {v0, p1, p2, p3, p4}, Lv1/j;->decode(Ljava/lang/Object;IILv1/h;)Lx1/v;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method

.method public b(Ljava/io/InputStream;Lv1/h;)Z
    .locals 1

    .line 1
    sget-object v0, LO3/a;->b:Lv1/g;

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lcom/github/penfeizhou/animation/io/d;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/d;-><init>(Ljava/io/InputStream;)V

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, LR3/m;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-nez v0, :cond_3

    .line 25
    .line 26
    :cond_0
    sget-object v0, LO3/a;->c:Lv1/g;

    .line 27
    .line 28
    invoke-virtual {p2, v0}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Ljava/lang/Boolean;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_1

    .line 39
    .line 40
    new-instance v0, Lcom/github/penfeizhou/animation/io/d;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/d;-><init>(Ljava/io/InputStream;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, LF3/d;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-nez v0, :cond_3

    .line 50
    .line 51
    :cond_1
    sget-object v0, LO3/a;->a:Lv1/g;

    .line 52
    .line 53
    invoke-virtual {p2, v0}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, Ljava/lang/Boolean;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_2

    .line 64
    .line 65
    new-instance v0, Lcom/github/penfeizhou/animation/io/d;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/d;-><init>(Ljava/io/InputStream;)V

    .line 68
    .line 69
    .line 70
    invoke-static {v0}, LM3/h;->b(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_3

    .line 75
    .line 76
    :cond_2
    sget-object v0, LO3/a;->e:Lv1/g;

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p2

    .line 82
    check-cast p2, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result p2

    .line 88
    if-nez p2, :cond_4

    .line 89
    .line 90
    new-instance p2, Lcom/github/penfeizhou/animation/io/d;

    .line 91
    .line 92
    invoke-direct {p2, p1}, Lcom/github/penfeizhou/animation/io/d;-><init>(Ljava/io/InputStream;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p2}, LI3/c;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-eqz p1, :cond_4

    .line 100
    .line 101
    :cond_3
    const/4 p1, 0x1

    .line 102
    return p1

    .line 103
    :cond_4
    const/4 p1, 0x0

    .line 104
    return p1
.end method

.method public bridge synthetic decode(Ljava/lang/Object;IILv1/h;)Lx1/v;
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LO3/c;->a(Ljava/io/InputStream;IILv1/h;)Lx1/v;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public bridge synthetic handles(Ljava/lang/Object;Lv1/h;)Z
    .locals 0

    .line 1
    check-cast p1, Ljava/io/InputStream;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LO3/c;->b(Ljava/io/InputStream;Lv1/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
