.class public final Lcom/google/gson/i;
.super Lcom/google/gson/f;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private final g:LN5/h;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/google/gson/f;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LN5/h;

    .line 5
    .line 6
    invoke-direct {v0}, LN5/h;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public A(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN5/h;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-eq p1, p0, :cond_1

    .line 2
    .line 3
    instance-of v0, p1, Lcom/google/gson/i;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p1, Lcom/google/gson/i;

    .line 8
    .line 9
    iget-object p1, p1, Lcom/google/gson/i;->g:LN5/h;

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    return p1

    .line 22
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 23
    return p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public u(Ljava/lang/String;Lcom/google/gson/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/google/gson/h;->g:Lcom/google/gson/h;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {v0, p1, p2}, LN5/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public v()Ljava/util/Set;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LN5/h;->entrySet()Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public w(Ljava/lang/String;)Lcom/google/gson/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN5/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/gson/f;

    .line 8
    .line 9
    return-object p1
.end method

.method public x(Ljava/lang/String;)Lcom/google/gson/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN5/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/gson/e;

    .line 8
    .line 9
    return-object p1
.end method

.method public y(Ljava/lang/String;)Lcom/google/gson/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN5/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/gson/i;

    .line 8
    .line 9
    return-object p1
.end method

.method public z(Ljava/lang/String;)Lcom/google/gson/k;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/google/gson/i;->g:LN5/h;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LN5/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Lcom/google/gson/k;

    .line 8
    .line 9
    return-object p1
.end method
