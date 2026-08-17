.class public final LG2/c;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final a:I


# direct methods
.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, LG2/c;->a:I

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(III)Ljava/util/Map;
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {p3, v0}, LB7/d;->d(II)I

    .line 3
    .line 4
    .line 5
    move-result p3

    .line 6
    iget v0, p0, LG2/c;->a:I

    .line 7
    .line 8
    invoke-static {p3, v0}, LB7/d;->h(II)I

    .line 9
    .line 10
    .line 11
    move-result p3

    .line 12
    int-to-float p3, p3

    .line 13
    invoke-virtual {p0, p1}, LG2/c;->b(I)F

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    mul-float/2addr p3, p1

    .line 18
    const/4 p1, 0x0

    .line 19
    invoke-static {p3, p1}, LB7/d;->c(FF)F

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    int-to-float p3, p2

    .line 24
    invoke-static {p1, p3}, LB7/d;->g(FF)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    div-float/2addr p3, p1

    .line 29
    const/4 p1, 0x0

    .line 30
    invoke-static {p1, p2}, LB7/d;->p(II)LB7/c;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 35
    .line 36
    const/16 v1, 0xa

    .line 37
    .line 38
    invoke-static {p2, v1}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    invoke-static {v1}, Lj7/K;->e(I)I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    const/16 v2, 0x10

    .line 47
    .line 48
    invoke-static {v1, v2}, LB7/d;->d(II)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_1

    .line 64
    .line 65
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    move-object v2, v1

    .line 70
    check-cast v2, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    int-to-float v3, v2

    .line 77
    rem-float/2addr v3, p3

    .line 78
    float-to-int v3, v3

    .line 79
    if-nez v3, :cond_0

    .line 80
    .line 81
    move p1, v2

    .line 82
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    return-object v0
.end method

.method public final b(I)F
    .locals 1

    .line 1
    int-to-float p1, p1

    .line 2
    const/high16 v0, 0x447a0000    # 1000.0f

    .line 3
    .line 4
    div-float/2addr p1, v0

    .line 5
    return p1
.end method
