.class final Lm8/i$e;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lm8/h$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm8/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "e"
.end annotation


# instance fields
.field final g:Lm8/j$b;

.field final h:I

.field final i:Lm8/y$b;

.field final j:Z

.field final k:Z


# direct methods
.method constructor <init>(Lm8/j$b;ILm8/y$b;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm8/i$e;->g:Lm8/j$b;

    .line 5
    .line 6
    iput p2, p0, Lm8/i$e;->h:I

    .line 7
    .line 8
    iput-object p3, p0, Lm8/i$e;->i:Lm8/y$b;

    .line 9
    .line 10
    iput-boolean p4, p0, Lm8/i$e;->j:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lm8/i$e;->k:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    .line 1
    iget v0, p0, Lm8/i$e;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public c()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm8/i$e;->j:Z

    .line 2
    .line 3
    return v0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lm8/i$e;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lm8/i$e;->h(Lm8/i$e;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public d()Lm8/y$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$e;->i:Lm8/y$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public g()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lm8/i$e;->k:Z

    .line 2
    .line 3
    return v0
.end method

.method public h(Lm8/i$e;)I
    .locals 1

    .line 1
    iget v0, p0, Lm8/i$e;->h:I

    .line 2
    .line 3
    iget p1, p1, Lm8/i$e;->h:I

    .line 4
    .line 5
    sub-int/2addr v0, p1

    .line 6
    return v0
.end method

.method public i(Lm8/p$a;Lm8/p;)Lm8/p$a;
    .locals 0

    .line 1
    check-cast p1, Lm8/i$b;

    .line 2
    .line 3
    check-cast p2, Lm8/i;

    .line 4
    .line 5
    invoke-virtual {p1, p2}, Lm8/i$b;->j(Lm8/i;)Lm8/i$b;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public j()Lm8/j$b;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$e;->g:Lm8/j$b;

    .line 2
    .line 3
    return-object v0
.end method

.method public o()Lm8/y$c;
    .locals 1

    .line 1
    iget-object v0, p0, Lm8/i$e;->i:Lm8/y$b;

    .line 2
    .line 3
    invoke-virtual {v0}, Lm8/y$b;->h()Lm8/y$c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
