.class Lm8/t$d;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private final g:Lm8/t$c;

.field private h:Lm8/d$a;

.field i:I

.field final synthetic j:Lm8/t;


# direct methods
.method private constructor <init>(Lm8/t;)V
    .locals 2

    .line 2
    iput-object p1, p0, Lm8/t$d;->j:Lm8/t;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance v0, Lm8/t$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lm8/t$c;-><init>(Lm8/d;Lm8/t$a;)V

    iput-object v0, p0, Lm8/t$d;->g:Lm8/t$c;

    .line 4
    invoke-virtual {v0}, Lm8/t$c;->d()Lm8/o;

    move-result-object v0

    invoke-virtual {v0}, Lm8/o;->K()Lm8/d$a;

    move-result-object v0

    iput-object v0, p0, Lm8/t$d;->h:Lm8/d$a;

    .line 5
    invoke-virtual {p1}, Lm8/t;->size()I

    move-result p1

    iput p1, p0, Lm8/t$d;->i:I

    return-void
.end method

.method synthetic constructor <init>(Lm8/t;Lm8/t$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lm8/t$d;-><init>(Lm8/t;)V

    return-void
.end method


# virtual methods
.method public a()B
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/t$d;->h:Lm8/d$a;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lm8/t$d;->g:Lm8/t$c;

    .line 10
    .line 11
    invoke-virtual {v0}, Lm8/t$c;->d()Lm8/o;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Lm8/o;->K()Lm8/d$a;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    iput-object v0, p0, Lm8/t$d;->h:Lm8/d$a;

    .line 20
    .line 21
    :cond_0
    iget v0, p0, Lm8/t$d;->i:I

    .line 22
    .line 23
    add-int/lit8 v0, v0, -0x1

    .line 24
    .line 25
    iput v0, p0, Lm8/t$d;->i:I

    .line 26
    .line 27
    iget-object v0, p0, Lm8/t$d;->h:Lm8/d$a;

    .line 28
    .line 29
    invoke-interface {v0}, Lm8/d$a;->a()B

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    return v0
.end method

.method public b()Ljava/lang/Byte;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm8/t$d;->a()B

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lm8/t$d;->i:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lm8/t$d;->b()Ljava/lang/Byte;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method
