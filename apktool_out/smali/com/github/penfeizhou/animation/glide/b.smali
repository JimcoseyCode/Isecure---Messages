.class Lcom/github/penfeizhou/animation/glide/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LI1/e;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public transcode(Lx1/v;Lv1/h;)Lx1/v;
    .locals 2

    .line 1
    invoke-interface {p1}, Lx1/v;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Lcom/github/penfeizhou/animation/decode/b;

    .line 6
    .line 7
    sget-object v0, LO3/a;->d:Lv1/g;

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Lv1/h;->b(Lv1/g;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p2

    .line 19
    instance-of v0, p1, LF3/b;

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    new-instance v0, LE3/a;

    .line 25
    .line 26
    check-cast p1, LF3/b;

    .line 27
    .line 28
    invoke-direct {v0, p1}, LE3/a;-><init>(LF3/b;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, LD3/a;->k(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, p2}, LD3/a;->l(Z)V

    .line 35
    .line 36
    .line 37
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b$a;

    .line 38
    .line 39
    invoke-direct {p1, p0, v0, v0}, Lcom/github/penfeizhou/animation/glide/b$a;-><init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;LE3/a;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    instance-of v0, p1, LR3/l;

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    new-instance v0, LQ3/a;

    .line 48
    .line 49
    check-cast p1, LR3/l;

    .line 50
    .line 51
    invoke-direct {v0, p1}, LQ3/a;-><init>(LR3/l;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, LD3/a;->k(Z)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p2}, LD3/a;->l(Z)V

    .line 58
    .line 59
    .line 60
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b$b;

    .line 61
    .line 62
    invoke-direct {p1, p0, v0, v0}, Lcom/github/penfeizhou/animation/glide/b$b;-><init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;LQ3/a;)V

    .line 63
    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_1
    instance-of v0, p1, LM3/g;

    .line 67
    .line 68
    if-eqz v0, :cond_2

    .line 69
    .line 70
    new-instance v0, LL3/a;

    .line 71
    .line 72
    check-cast p1, LM3/g;

    .line 73
    .line 74
    invoke-direct {v0, p1}, LL3/a;-><init>(LM3/g;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, LD3/a;->k(Z)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p2}, LD3/a;->l(Z)V

    .line 81
    .line 82
    .line 83
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b$c;

    .line 84
    .line 85
    invoke-direct {p1, p0, v0, v0}, Lcom/github/penfeizhou/animation/glide/b$c;-><init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;LL3/a;)V

    .line 86
    .line 87
    .line 88
    return-object p1

    .line 89
    :cond_2
    instance-of v0, p1, LI3/a;

    .line 90
    .line 91
    if-eqz v0, :cond_3

    .line 92
    .line 93
    new-instance v0, LH3/a;

    .line 94
    .line 95
    check-cast p1, LI3/a;

    .line 96
    .line 97
    invoke-direct {v0, p1}, LH3/a;-><init>(LI3/a;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1}, LD3/a;->k(Z)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, p2}, LD3/a;->l(Z)V

    .line 104
    .line 105
    .line 106
    new-instance p1, Lcom/github/penfeizhou/animation/glide/b$d;

    .line 107
    .line 108
    invoke-direct {p1, p0, v0, v0}, Lcom/github/penfeizhou/animation/glide/b$d;-><init>(Lcom/github/penfeizhou/animation/glide/b;Landroid/graphics/drawable/Drawable;LH3/a;)V

    .line 109
    .line 110
    .line 111
    return-object p1

    .line 112
    :cond_3
    const/4 p1, 0x0

    .line 113
    return-object p1
.end method
