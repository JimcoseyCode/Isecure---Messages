.class Lb3/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lb3/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb3/b;


# direct methods
.method constructor <init>(Lb3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lb3/b$a;->a:Lb3/b;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Ld3/k;ILd3/p;LX2/d;)Ld3/e;
    .locals 8

    .line 1
    invoke-virtual {p1}, Ld3/k;->I()LQ2/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lb3/b$a;->a:Lb3/b;

    .line 6
    .line 7
    invoke-static {v1}, Lb3/b;->b(Lb3/b;)Lc2/n;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-interface {v1}, Lc2/n;->get()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    check-cast v1, Ljava/lang/Boolean;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    iget-object v1, p4, LX2/d;->k:Landroid/graphics/ColorSpace;

    .line 24
    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ld3/k;->A()Landroid/graphics/ColorSpace;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    :cond_0
    :goto_0
    move-object v7, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    iget-object v1, p4, LX2/d;->k:Landroid/graphics/ColorSpace;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :goto_1
    sget-object v1, LQ2/b;->b:LQ2/c;

    .line 37
    .line 38
    if-ne v0, v1, :cond_2

    .line 39
    .line 40
    iget-object v2, p0, Lb3/b$a;->a:Lb3/b;

    .line 41
    .line 42
    move-object v3, p1

    .line 43
    move v4, p2

    .line 44
    move-object v5, p3

    .line 45
    move-object v6, p4

    .line 46
    invoke-virtual/range {v2 .. v7}, Lb3/b;->f(Ld3/k;ILd3/p;LX2/d;Landroid/graphics/ColorSpace;)Ld3/f;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    return-object p1

    .line 51
    :cond_2
    move-object v3, p1

    .line 52
    move v4, p2

    .line 53
    move-object v5, p3

    .line 54
    move-object v6, p4

    .line 55
    sget-object p1, LQ2/b;->d:LQ2/c;

    .line 56
    .line 57
    if-ne v0, p1, :cond_3

    .line 58
    .line 59
    iget-object p1, p0, Lb3/b$a;->a:Lb3/b;

    .line 60
    .line 61
    invoke-virtual {p1, v3, v4, v5, v6}, Lb3/b;->e(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    return-object p1

    .line 66
    :cond_3
    sget-object p1, LQ2/b;->k:LQ2/c;

    .line 67
    .line 68
    if-ne v0, p1, :cond_4

    .line 69
    .line 70
    iget-object p1, p0, Lb3/b$a;->a:Lb3/b;

    .line 71
    .line 72
    invoke-virtual {p1, v3, v4, v5, v6}, Lb3/b;->d(Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    return-object p1

    .line 77
    :cond_4
    sget-object p1, LQ2/b;->n:LQ2/c;

    .line 78
    .line 79
    if-ne v0, p1, :cond_5

    .line 80
    .line 81
    iget-object p1, p0, Lb3/b$a;->a:Lb3/b;

    .line 82
    .line 83
    invoke-static {p1, v3, v4, v5, v6}, Lb3/b;->c(Lb3/b;Ld3/k;ILd3/p;LX2/d;)Ld3/e;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    return-object p1

    .line 88
    :cond_5
    sget-object p1, LQ2/c;->d:LQ2/c;

    .line 89
    .line 90
    if-eq v0, p1, :cond_6

    .line 91
    .line 92
    iget-object p1, p0, Lb3/b$a;->a:Lb3/b;

    .line 93
    .line 94
    invoke-virtual {p1, v3, v6}, Lb3/b;->g(Ld3/k;LX2/d;)Ld3/f;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :cond_6
    new-instance p1, Lb3/a;

    .line 100
    .line 101
    const-string p2, "unknown image format"

    .line 102
    .line 103
    invoke-direct {p1, p2, v3}, Lb3/a;-><init>(Ljava/lang/String;Ld3/k;)V

    .line 104
    .line 105
    .line 106
    throw p1
.end method
