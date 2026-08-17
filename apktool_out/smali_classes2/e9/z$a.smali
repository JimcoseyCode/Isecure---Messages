.class public final Le9/z$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le9/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private A:I

.field private B:I

.field private C:J

.field private D:Lj9/i;

.field private a:Le9/p;

.field private b:Le9/k;

.field private final c:Ljava/util/List;

.field private final d:Ljava/util/List;

.field private e:Le9/r$c;

.field private f:Z

.field private g:Le9/b;

.field private h:Z

.field private i:Z

.field private j:Le9/n;

.field private k:Le9/c;

.field private l:Le9/q;

.field private m:Ljava/net/Proxy;

.field private n:Ljava/net/ProxySelector;

.field private o:Le9/b;

.field private p:Ljavax/net/SocketFactory;

.field private q:Ljavax/net/ssl/SSLSocketFactory;

.field private r:Ljavax/net/ssl/X509TrustManager;

.field private s:Ljava/util/List;

.field private t:Ljava/util/List;

.field private u:Ljavax/net/ssl/HostnameVerifier;

.field private v:Le9/g;

.field private w:Lr9/c;

.field private x:I

.field private y:I

.field private z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Le9/p;

    invoke-direct {v0}, Le9/p;-><init>()V

    iput-object v0, p0, Le9/z$a;->a:Le9/p;

    .line 3
    new-instance v0, Le9/k;

    invoke-direct {v0}, Le9/k;-><init>()V

    iput-object v0, p0, Le9/z$a;->b:Le9/k;

    .line 4
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le9/z$a;->c:Ljava/util/List;

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Le9/z$a;->d:Ljava/util/List;

    .line 6
    sget-object v0, Le9/r;->a:Le9/r;

    invoke-static {v0}, Lf9/c;->e(Le9/r;)Le9/r$c;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->e:Le9/r$c;

    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Le9/z$a;->f:Z

    .line 8
    sget-object v1, Le9/b;->a:Le9/b;

    iput-object v1, p0, Le9/z$a;->g:Le9/b;

    .line 9
    iput-boolean v0, p0, Le9/z$a;->h:Z

    .line 10
    iput-boolean v0, p0, Le9/z$a;->i:Z

    .line 11
    sget-object v0, Le9/n;->a:Le9/n;

    iput-object v0, p0, Le9/z$a;->j:Le9/n;

    .line 12
    sget-object v0, Le9/q;->a:Le9/q;

    iput-object v0, p0, Le9/z$a;->l:Le9/q;

    .line 13
    iput-object v1, p0, Le9/z$a;->o:Le9/b;

    .line 14
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v0

    const-string v1, "SocketFactory.getDefault()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Le9/z$a;->p:Ljavax/net/SocketFactory;

    .line 15
    sget-object v0, Le9/z;->M:Le9/z$b;

    invoke-virtual {v0}, Le9/z$b;->a()Ljava/util/List;

    move-result-object v1

    iput-object v1, p0, Le9/z$a;->s:Ljava/util/List;

    .line 16
    invoke-virtual {v0}, Le9/z$b;->b()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->t:Ljava/util/List;

    .line 17
    sget-object v0, Lr9/d;->a:Lr9/d;

    iput-object v0, p0, Le9/z$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 18
    sget-object v0, Le9/g;->c:Le9/g;

    iput-object v0, p0, Le9/z$a;->v:Le9/g;

    const/16 v0, 0x2710

    .line 19
    iput v0, p0, Le9/z$a;->y:I

    .line 20
    iput v0, p0, Le9/z$a;->z:I

    .line 21
    iput v0, p0, Le9/z$a;->A:I

    const-wide/16 v0, 0x400

    .line 22
    iput-wide v0, p0, Le9/z$a;->C:J

    return-void
.end method

.method public constructor <init>(Le9/z;)V
    .locals 2

    const-string v0, "okHttpClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    invoke-direct {p0}, Le9/z$a;-><init>()V

    .line 24
    invoke-virtual {p1}, Le9/z;->r()Le9/p;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->a:Le9/p;

    .line 25
    invoke-virtual {p1}, Le9/z;->o()Le9/k;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->b:Le9/k;

    .line 26
    iget-object v0, p0, Le9/z$a;->c:Ljava/util/List;

    invoke-virtual {p1}, Le9/z;->z()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/q;->A(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 27
    iget-object v0, p0, Le9/z$a;->d:Ljava/util/List;

    invoke-virtual {p1}, Le9/z;->B()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Lj7/q;->A(Ljava/util/Collection;Ljava/lang/Iterable;)Z

    .line 28
    invoke-virtual {p1}, Le9/z;->u()Le9/r$c;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->e:Le9/r$c;

    .line 29
    invoke-virtual {p1}, Le9/z;->K()Z

    move-result v0

    iput-boolean v0, p0, Le9/z$a;->f:Z

    .line 30
    invoke-virtual {p1}, Le9/z;->i()Le9/b;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->g:Le9/b;

    .line 31
    invoke-virtual {p1}, Le9/z;->v()Z

    move-result v0

    iput-boolean v0, p0, Le9/z$a;->h:Z

    .line 32
    invoke-virtual {p1}, Le9/z;->w()Z

    move-result v0

    iput-boolean v0, p0, Le9/z$a;->i:Z

    .line 33
    invoke-virtual {p1}, Le9/z;->q()Le9/n;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->j:Le9/n;

    .line 34
    invoke-virtual {p1}, Le9/z;->j()Le9/c;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->k:Le9/c;

    .line 35
    invoke-virtual {p1}, Le9/z;->t()Le9/q;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->l:Le9/q;

    .line 36
    invoke-virtual {p1}, Le9/z;->G()Ljava/net/Proxy;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->m:Ljava/net/Proxy;

    .line 37
    invoke-virtual {p1}, Le9/z;->I()Ljava/net/ProxySelector;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->n:Ljava/net/ProxySelector;

    .line 38
    invoke-virtual {p1}, Le9/z;->H()Le9/b;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->o:Le9/b;

    .line 39
    invoke-virtual {p1}, Le9/z;->L()Ljavax/net/SocketFactory;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->p:Ljavax/net/SocketFactory;

    .line 40
    invoke-static {p1}, Le9/z;->h(Le9/z;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 41
    invoke-virtual {p1}, Le9/z;->P()Ljavax/net/ssl/X509TrustManager;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->r:Ljavax/net/ssl/X509TrustManager;

    .line 42
    invoke-virtual {p1}, Le9/z;->p()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->s:Ljava/util/List;

    .line 43
    invoke-virtual {p1}, Le9/z;->F()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->t:Ljava/util/List;

    .line 44
    invoke-virtual {p1}, Le9/z;->y()Ljavax/net/ssl/HostnameVerifier;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 45
    invoke-virtual {p1}, Le9/z;->m()Le9/g;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->v:Le9/g;

    .line 46
    invoke-virtual {p1}, Le9/z;->l()Lr9/c;

    move-result-object v0

    iput-object v0, p0, Le9/z$a;->w:Lr9/c;

    .line 47
    invoke-virtual {p1}, Le9/z;->k()I

    move-result v0

    iput v0, p0, Le9/z$a;->x:I

    .line 48
    invoke-virtual {p1}, Le9/z;->n()I

    move-result v0

    iput v0, p0, Le9/z$a;->y:I

    .line 49
    invoke-virtual {p1}, Le9/z;->J()I

    move-result v0

    iput v0, p0, Le9/z$a;->z:I

    .line 50
    invoke-virtual {p1}, Le9/z;->O()I

    move-result v0

    iput v0, p0, Le9/z$a;->A:I

    .line 51
    invoke-virtual {p1}, Le9/z;->E()I

    move-result v0

    iput v0, p0, Le9/z$a;->B:I

    .line 52
    invoke-virtual {p1}, Le9/z;->A()J

    move-result-wide v0

    iput-wide v0, p0, Le9/z$a;->C:J

    .line 53
    invoke-virtual {p1}, Le9/z;->x()Lj9/i;

    move-result-object p1

    iput-object p1, p0, Le9/z$a;->D:Lj9/i;

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le9/z$a;->C:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final B()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->d:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final C()I
    .locals 1

    .line 1
    iget v0, p0, Le9/z$a;->B:I

    .line 2
    .line 3
    return v0
.end method

.method public final D()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->t:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E()Ljava/net/Proxy;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->m:Ljava/net/Proxy;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F()Le9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->o:Le9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final G()Ljava/net/ProxySelector;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->n:Ljava/net/ProxySelector;

    .line 2
    .line 3
    return-object v0
.end method

.method public final H()I
    .locals 1

    .line 1
    iget v0, p0, Le9/z$a;->z:I

    .line 2
    .line 3
    return v0
.end method

.method public final I()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le9/z$a;->f:Z

    .line 2
    .line 3
    return v0
.end method

.method public final J()Lj9/i;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->D:Lj9/i;

    .line 2
    .line 3
    return-object v0
.end method

.method public final K()Ljavax/net/SocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->p:Ljavax/net/SocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final L()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->q:Ljavax/net/ssl/SSLSocketFactory;

    .line 2
    .line 3
    return-object v0
.end method

.method public final M()I
    .locals 1

    .line 1
    iget v0, p0, Le9/z$a;->A:I

    .line 2
    .line 3
    return v0
.end method

.method public final N()Ljavax/net/ssl/X509TrustManager;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->r:Ljavax/net/ssl/X509TrustManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public final O(Ljava/util/List;)Le9/z$a;
    .locals 4

    .line 1
    const-string v0, "protocols"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lj7/q;->R0(Ljava/util/Collection;)Ljava/util/List;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    sget-object v0, Le9/A;->l:Le9/A;

    .line 11
    .line 12
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v3, 0x1

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    sget-object v1, Le9/A;->i:Le9/A;

    .line 21
    .line 22
    invoke-interface {p1, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v1, v2

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move v1, v3

    .line 32
    :goto_1
    if-eqz v1, :cond_8

    .line 33
    .line 34
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-gt v0, v3, :cond_3

    .line 45
    .line 46
    :cond_2
    move v2, v3

    .line 47
    :cond_3
    if-eqz v2, :cond_7

    .line 48
    .line 49
    sget-object v0, Le9/A;->h:Le9/A;

    .line 50
    .line 51
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_5

    .line 63
    .line 64
    sget-object v1, Le9/A;->j:Le9/A;

    .line 65
    .line 66
    invoke-interface {p1, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, Le9/z$a;->t:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-nez v1, :cond_4

    .line 76
    .line 77
    iput-object v0, p0, Le9/z$a;->D:Lj9/i;

    .line 78
    .line 79
    :cond_4
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    const-string v0, "Collections.unmodifiableList(protocolsCopy)"

    .line 84
    .line 85
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Le9/z$a;->t:Ljava/util/List;

    .line 89
    .line 90
    return-object p0

    .line 91
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 92
    .line 93
    const-string v0, "protocols must not contain null"

    .line 94
    .line 95
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1

    .line 99
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 102
    .line 103
    .line 104
    const-string v1, "protocols must not contain http/1.0: "

    .line 105
    .line 106
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 127
    .line 128
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .line 130
    .line 131
    const-string v1, "protocols containing h2_prior_knowledge cannot use other protocols: "

    .line 132
    .line 133
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object p1

    .line 149
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v0

    .line 153
    :cond_8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 154
    .line 155
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 156
    .line 157
    .line 158
    const-string v1, "protocols must contain h2_prior_knowledge or http/1.1: "

    .line 159
    .line 160
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    throw v0
.end method

.method public final P(JLjava/util/concurrent/TimeUnit;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lf9/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Le9/z$a;->z:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final Q(JLjava/util/concurrent/TimeUnit;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lf9/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Le9/z$a;->A:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final a(Le9/v;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/z$a;->c:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final b(Le9/v;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "interceptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/z$a;->d:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-object p0
.end method

.method public final c()Le9/z;
    .locals 1

    .line 1
    new-instance v0, Le9/z;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le9/z;-><init>(Le9/z$a;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final d(Le9/c;)Le9/z$a;
    .locals 0

    .line 1
    iput-object p1, p0, Le9/z$a;->k:Le9/c;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e(JLjava/util/concurrent/TimeUnit;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lf9/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Le9/z$a;->x:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final f(JLjava/util/concurrent/TimeUnit;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "unit"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "timeout"

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lf9/c;->h(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iput p1, p0, Le9/z$a;->y:I

    .line 13
    .line 14
    return-object p0
.end method

.method public final g(Le9/n;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "cookieJar"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Le9/z$a;->j:Le9/n;

    .line 7
    .line 8
    return-object p0
.end method

.method public final h(Le9/r;)Le9/z$a;
    .locals 1

    .line 1
    const-string v0, "eventListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lf9/c;->e(Le9/r;)Le9/r$c;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iput-object p1, p0, Le9/z$a;->e:Le9/r$c;

    .line 11
    .line 12
    return-object p0
.end method

.method public final i(Z)Le9/z$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Le9/z$a;->h:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(Z)Le9/z$a;
    .locals 0

    .line 1
    iput-boolean p1, p0, Le9/z$a;->i:Z

    .line 2
    .line 3
    return-object p0
.end method

.method public final k()Le9/b;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->g:Le9/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final l()Le9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->k:Le9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()I
    .locals 1

    .line 1
    iget v0, p0, Le9/z$a;->x:I

    .line 2
    .line 3
    return v0
.end method

.method public final n()Lr9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->w:Lr9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final o()Le9/g;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->v:Le9/g;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p()I
    .locals 1

    .line 1
    iget v0, p0, Le9/z$a;->y:I

    .line 2
    .line 3
    return v0
.end method

.method public final q()Le9/k;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->b:Le9/k;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->s:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Le9/n;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->j:Le9/n;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t()Le9/p;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->a:Le9/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final u()Le9/q;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->l:Le9/q;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v()Le9/r$c;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->e:Le9/r$c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final w()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le9/z$a;->h:Z

    .line 2
    .line 3
    return v0
.end method

.method public final x()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Le9/z$a;->i:Z

    .line 2
    .line 3
    return v0
.end method

.method public final y()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->u:Ljavax/net/ssl/HostnameVerifier;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/z$a;->c:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method
