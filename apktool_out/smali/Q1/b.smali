.class public final LQ1/b;
.super Lm0/a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# instance fields
.field private m:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lm0/a;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LQ1/b;->m:I

    .line 3
    .line 4
    invoke-super {p0}, Lm0/i;->clear()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public g(Lm0/i;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LQ1/b;->m:I

    .line 3
    .line 4
    invoke-super {p0, p1}, Lm0/i;->g(Lm0/i;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public h(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LQ1/b;->m:I

    .line 3
    .line 4
    invoke-super {p0, p1}, Lm0/i;->h(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget v0, p0, LQ1/b;->m:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0}, Lm0/i;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iput v0, p0, LQ1/b;->m:I

    .line 10
    .line 11
    :cond_0
    iget v0, p0, LQ1/b;->m:I

    .line 12
    .line 13
    return v0
.end method

.method public i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LQ1/b;->m:I

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Lm0/i;->i(ILjava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, LQ1/b;->m:I

    .line 3
    .line 4
    invoke-super {p0, p1, p2}, Lm0/i;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    return-object p1
.end method
