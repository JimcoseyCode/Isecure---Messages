.class public final synthetic Lj6/b;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LP4/f;


# instance fields
.field public final synthetic a:Lj6/e;

.field public final synthetic b:J

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(Lj6/e;JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/b;->a:Lj6/e;

    .line 5
    .line 6
    iput-wide p2, p0, Lj6/b;->b:J

    .line 7
    .line 8
    iput-wide p4, p0, Lj6/b;->c:J

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onComplete(LP4/l;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lj6/b;->a:Lj6/e;

    .line 2
    .line 3
    iget-wide v2, p0, Lj6/b;->b:J

    .line 4
    .line 5
    iget-wide v4, p0, Lj6/b;->c:J

    .line 6
    .line 7
    invoke-virtual {p1}, LP4/l;->n()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/16 p1, 0xc9

    .line 14
    .line 15
    :goto_0
    move v1, p1

    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {p1}, LP4/l;->p()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p1}, LP4/l;->k()Ljava/lang/Exception;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    check-cast p1, LY5/a;

    .line 28
    .line 29
    invoke-static {p1}, Lr4/i;->k(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    check-cast p1, LY5/a;

    .line 34
    .line 35
    invoke-virtual {p1}, LY5/a;->a()I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :goto_1
    invoke-virtual/range {v0 .. v5}, Lj6/e;->b(IJJ)V

    .line 43
    .line 44
    .line 45
    return-void
.end method
