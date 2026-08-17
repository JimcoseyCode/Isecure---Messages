.class public LO3/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lv1/j;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LO3/b$b;
    }
.end annotation


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
.method public a(Ljava/nio/ByteBuffer;IILv1/h;)Lx1/v;
    .locals 0

    .line 1
    new-instance p2, LO3/b$a;

    .line 2
    .line 3
    invoke-direct {p2, p0, p1}, LO3/b$a;-><init>(LO3/b;Ljava/nio/ByteBuffer;)V

    .line 4
    .line 5
    .line 6
    new-instance p3, Lcom/github/penfeizhou/animation/io/a;

    .line 7
    .line 8
    invoke-direct {p3, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p3}, LR3/m;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    const/4 p4, 0x0

    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    new-instance p3, LR3/l;

    .line 19
    .line 20
    invoke-direct {p3, p2, p4}, LR3/l;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p3, Lcom/github/penfeizhou/animation/io/a;

    .line 25
    .line 26
    invoke-direct {p3, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p3}, LF3/d;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 30
    .line 31
    .line 32
    move-result p3

    .line 33
    if-eqz p3, :cond_1

    .line 34
    .line 35
    new-instance p3, LF3/b;

    .line 36
    .line 37
    invoke-direct {p3, p2, p4}, LF3/b;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    new-instance p3, Lcom/github/penfeizhou/animation/io/a;

    .line 42
    .line 43
    invoke-direct {p3, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p3}, LM3/h;->b(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 47
    .line 48
    .line 49
    move-result p3

    .line 50
    if-eqz p3, :cond_2

    .line 51
    .line 52
    new-instance p3, LM3/g;

    .line 53
    .line 54
    invoke-direct {p3, p2, p4}, LM3/g;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    new-instance p3, Lcom/github/penfeizhou/animation/io/a;

    .line 59
    .line 60
    invoke-direct {p3, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

    .line 61
    .line 62
    .line 63
    invoke-static {p3}, LI3/c;->a(Lcom/github/penfeizhou/animation/io/Reader;)Z

    .line 64
    .line 65
    .line 66
    move-result p3

    .line 67
    if-eqz p3, :cond_3

    .line 68
    .line 69
    new-instance p3, LI3/a;

    .line 70
    .line 71
    invoke-direct {p3, p2, p4}, LI3/a;-><init>(LP3/b;Lcom/github/penfeizhou/animation/decode/b$j;)V

    .line 72
    .line 73
    .line 74
    :goto_0
    new-instance p2, LO3/b$b;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    invoke-direct {p2, p3, p1}, LO3/b$b;-><init>(Lcom/github/penfeizhou/animation/decode/b;I)V

    .line 81
    .line 82
    .line 83
    return-object p2

    .line 84
    :cond_3
    return-object p4
.end method

.method public b(Ljava/nio/ByteBuffer;Lv1/h;)Z
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
    new-instance v0, Lcom/github/penfeizhou/animation/io/a;

    .line 16
    .line 17
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

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
    new-instance v0, Lcom/github/penfeizhou/animation/io/a;

    .line 41
    .line 42
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

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
    new-instance v0, Lcom/github/penfeizhou/animation/io/a;

    .line 66
    .line 67
    invoke-direct {v0, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

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
    new-instance p2, Lcom/github/penfeizhou/animation/io/a;

    .line 91
    .line 92
    invoke-direct {p2, p1}, Lcom/github/penfeizhou/animation/io/a;-><init>(Ljava/nio/ByteBuffer;)V

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
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, LO3/b;->a(Ljava/nio/ByteBuffer;IILv1/h;)Lx1/v;

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
    check-cast p1, Ljava/nio/ByteBuffer;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LO3/b;->b(Ljava/nio/ByteBuffer;Lv1/h;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method
