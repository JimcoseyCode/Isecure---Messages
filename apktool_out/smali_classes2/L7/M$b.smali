.class public final LL7/M$b;
.super LO7/j;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LL7/M;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private final o:Z

.field private final p:Ljava/util/List;

.field private final q:LC8/u;


# direct methods
.method public constructor <init>(LB8/n;LL7/m;Lk8/f;ZI)V
    .locals 9

    .line 1
    const-string v0, "storageManager"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "container"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "name"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v4, LL7/h0;->a:LL7/h0;

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    move-object v0, p0

    .line 20
    move-object v1, p1

    .line 21
    move-object v2, p2

    .line 22
    move-object v3, p3

    .line 23
    invoke-direct/range {v0 .. v5}, LO7/j;-><init>(LB8/n;LL7/m;Lk8/f;LL7/h0;Z)V

    .line 24
    .line 25
    .line 26
    iput-boolean p4, p0, LL7/M$b;->o:Z

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-static {v1, p5}, LB7/d;->p(II)LB7/c;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    new-instance v7, Ljava/util/ArrayList;

    .line 34
    .line 35
    const/16 v2, 0xa

    .line 36
    .line 37
    invoke-static {v1, v2}, Lj7/q;->u(Ljava/lang/Iterable;I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_0

    .line 53
    .line 54
    move-object v1, v8

    .line 55
    check-cast v1, Lj7/J;

    .line 56
    .line 57
    invoke-virtual {v1}, Lj7/J;->nextInt()I

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    sget-object v1, LM7/h;->a:LM7/h$a;

    .line 62
    .line 63
    invoke-virtual {v1}, LM7/h$a;->b()LM7/h;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    sget-object v3, LC8/N0;->k:LC8/N0;

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 72
    .line 73
    .line 74
    const/16 v4, 0x54

    .line 75
    .line 76
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v2}, Lk8/f;->q(Ljava/lang/String;)Lk8/f;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    const/4 v2, 0x0

    .line 91
    move-object v0, p0

    .line 92
    move-object v6, p1

    .line 93
    invoke-static/range {v0 .. v6}, LO7/U;->O0(LL7/m;LM7/h;ZLC8/N0;Lk8/f;ILB8/n;)LL7/m0;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-interface {v7, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_0
    iput-object v7, p0, LL7/M$b;->p:Ljava/util/List;

    .line 102
    .line 103
    new-instance v1, LC8/u;

    .line 104
    .line 105
    invoke-static {p0}, LL7/q0;->g(LL7/i;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-static {p0}, Ls8/e;->s(LL7/m;)LL7/H;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    invoke-interface {v3}, LL7/H;->n()LI7/i;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v3}, LI7/i;->i()LC8/d0;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    invoke-static {v3}, Lj7/T;->d(Ljava/lang/Object;)Ljava/util/Set;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-direct {v1, p0, v2, v3, p1}, LC8/u;-><init>(LL7/e;Ljava/util/List;Ljava/util/Collection;LB8/n;)V

    .line 126
    .line 127
    .line 128
    iput-object v1, p0, LL7/M$b;->q:LC8/u;

    .line 129
    .line 130
    return-void
.end method


# virtual methods
.method public B0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public C()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public F0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public H0()Lv8/k$b;
    .locals 1

    .line 1
    sget-object v0, Lv8/k$b;->b:Lv8/k$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public I()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public I0()LC8/u;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/M$b;->q:LC8/u;

    .line 2
    .line 3
    return-object v0
.end method

.method public J()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method protected J0(LD8/g;)Lv8/k$b;
    .locals 1

    .line 1
    const-string v0, "kotlinTypeRefiner"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object p1, Lv8/k$b;->b:Lv8/k$b;

    .line 7
    .line 8
    return-object p1
.end method

.method public K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LL7/M$b;->o:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic L(LD8/g;)Lv8/k;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LL7/M$b;->J0(LD8/g;)Lv8/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public O()LL7/d;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public bridge synthetic P()Lv8/k;
    .locals 1

    .line 1
    invoke-virtual {p0}, LL7/M$b;->H0()Lv8/k$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public R()LL7/e;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public f()Ljava/util/Collection;
    .locals 1

    .line 1
    invoke-static {}, Lj7/T;->e()Ljava/util/Set;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public getAnnotations()LM7/h;
    .locals 1

    .line 1
    sget-object v0, LM7/h;->a:LM7/h$a;

    .line 2
    .line 3
    invoke-virtual {v0}, LM7/h$a;->b()LM7/h;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getKind()LL7/f;
    .locals 1

    .line 1
    sget-object v0, LL7/f;->h:LL7/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVisibility()LL7/u;
    .locals 2

    .line 1
    sget-object v0, LL7/t;->e:LL7/u;

    .line 2
    .line 3
    const-string v1, "PUBLIC"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method

.method public isExternal()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isInline()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public bridge synthetic j()LC8/v0;
    .locals 1

    .line 1
    invoke-virtual {p0}, LL7/M$b;->I0()LC8/u;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public k()LL7/E;
    .locals 1

    .line 1
    sget-object v0, LL7/E;->h:LL7/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public l()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public t()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, LL7/M$b;->p:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "class "

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LO7/a;->getName()Lk8/f;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v1, " (not found)"

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public w0()LL7/r0;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
.end method

.method public y()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method
