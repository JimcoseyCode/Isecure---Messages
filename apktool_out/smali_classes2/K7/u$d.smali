.class public final LK7/u$d;
.super LM8/b$b;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LK7/u;->A(LL7/z;)LK7/u$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lkotlin/jvm/internal/C;


# direct methods
.method constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/C;)V
    .locals 0

    .line 1
    iput-object p1, p0, LK7/u$d;->a:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 4
    .line 5
    invoke-direct {p0}, LM8/b$b;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic a()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LK7/u$d;->e()LK7/u$a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public bridge synthetic c(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    check-cast p1, LL7/e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LK7/u$d;->d(LL7/e;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d(LL7/e;)Z
    .locals 2

    .line 1
    const-string v0, "javaClassDescriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ld8/F;->a:Ld8/F;

    .line 7
    .line 8
    iget-object v1, p0, LK7/u$d;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, p1, v1}, Ld8/B;->a(Ld8/F;LL7/e;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    sget-object v0, LK7/x;->a:LK7/x;

    .line 15
    .line 16
    invoke-virtual {v0}, LK7/x;->f()Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    iget-object p1, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 27
    .line 28
    sget-object v0, LK7/u$a;->g:LK7/u$a;

    .line 29
    .line 30
    iput-object v0, p1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-virtual {v0}, LK7/x;->i()Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    iget-object p1, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 44
    .line 45
    sget-object v0, LK7/u$a;->h:LK7/u$a;

    .line 46
    .line 47
    iput-object v0, p1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    invoke-virtual {v0}, LK7/x;->c()Ljava/util/Set;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_2

    .line 59
    .line 60
    iget-object p1, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 61
    .line 62
    sget-object v0, LK7/u$a;->i:LK7/u$a;

    .line 63
    .line 64
    iput-object v0, p1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v0}, LK7/x;->d()Ljava/util/Set;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    iget-object p1, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 78
    .line 79
    sget-object v0, LK7/u$a;->k:LK7/u$a;

    .line 80
    .line 81
    iput-object v0, p1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 82
    .line 83
    :cond_3
    :goto_0
    iget-object p1, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 84
    .line 85
    iget-object p1, p1, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 86
    .line 87
    if-nez p1, :cond_4

    .line 88
    .line 89
    const/4 p1, 0x1

    .line 90
    return p1

    .line 91
    :cond_4
    const/4 p1, 0x0

    .line 92
    return p1
.end method

.method public e()LK7/u$a;
    .locals 1

    .line 1
    iget-object v0, p0, LK7/u$d;->b:Lkotlin/jvm/internal/C;

    .line 2
    .line 3
    iget-object v0, v0, Lkotlin/jvm/internal/C;->g:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LK7/u$a;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, LK7/u$a;->j:LK7/u$a;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method
