.class public final Le9/D;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le9/D$a;
    }
.end annotation


# instance fields
.field private g:Le9/d;

.field private final h:Le9/B;

.field private final i:Le9/A;

.field private final j:Ljava/lang/String;

.field private final k:I

.field private final l:Le9/s;

.field private final m:Le9/t;

.field private final n:Le9/E;

.field private final o:Le9/D;

.field private final p:Le9/D;

.field private final q:Le9/D;

.field private final r:J

.field private final s:J

.field private final t:Lj9/c;


# direct methods
.method public constructor <init>(Le9/B;Le9/A;Ljava/lang/String;ILe9/s;Le9/t;Le9/E;Le9/D;Le9/D;Le9/D;JJLj9/c;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "protocol"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "message"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headers"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/D;->h:Le9/B;

    iput-object p2, p0, Le9/D;->i:Le9/A;

    iput-object p3, p0, Le9/D;->j:Ljava/lang/String;

    iput p4, p0, Le9/D;->k:I

    iput-object p5, p0, Le9/D;->l:Le9/s;

    iput-object p6, p0, Le9/D;->m:Le9/t;

    iput-object p7, p0, Le9/D;->n:Le9/E;

    iput-object p8, p0, Le9/D;->o:Le9/D;

    iput-object p9, p0, Le9/D;->p:Le9/D;

    iput-object p10, p0, Le9/D;->q:Le9/D;

    iput-wide p11, p0, Le9/D;->r:J

    iput-wide p13, p0, Le9/D;->s:J

    move-object/from16 p1, p15

    iput-object p1, p0, Le9/D;->t:Lj9/c;

    return-void
.end method

.method public static synthetic d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Le9/D;->X(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method


# virtual methods
.method public final A()Le9/D;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->p:Le9/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final A0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le9/D;->s:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final B()Ljava/util/List;
    .locals 3

    .line 1
    iget-object v0, p0, Le9/D;->m:Le9/t;

    .line 2
    .line 3
    iget v1, p0, Le9/D;->k:I

    .line 4
    .line 5
    const/16 v2, 0x191

    .line 6
    .line 7
    if-eq v1, v2, :cond_1

    .line 8
    .line 9
    const/16 v2, 0x197

    .line 10
    .line 11
    if-eq v1, v2, :cond_0

    .line 12
    .line 13
    invoke-static {}, Lj7/q;->j()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v1, "Proxy-Authenticate"

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    const-string v1, "WWW-Authenticate"

    .line 22
    .line 23
    :goto_0
    invoke-static {v0, v1}, Lk9/e;->a(Le9/t;Ljava/lang/String;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public final D0()Le9/B;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->h:Le9/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final I()I
    .locals 1

    .line 1
    iget v0, p0, Le9/D;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final J()Lj9/c;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->t:Lj9/c;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J0()J
    .locals 2

    .line 1
    iget-wide v0, p0, Le9/D;->r:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final M()Le9/s;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->l:Le9/s;

    .line 2
    .line 3
    return-object v0
.end method

.method public final W(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x2

    .line 3
    invoke-static {p0, p1, v0, v1, v0}, Le9/D;->d0(Le9/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public final X(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "name"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/D;->m:Le9/t;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Le9/t;->o(Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    return-object p2
.end method

.method public close()V
    .locals 2

    .line 1
    iget-object v0, p0, Le9/D;->n:Le9/E;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Le9/E;->close()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    const-string v1, "response is not eligible for a body and must not be closed"

    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    throw v0
.end method

.method public final d()Le9/E;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->n:Le9/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final e()I
    .locals 1

    .line 1
    iget v0, p0, Le9/D;->k:I

    .line 2
    .line 3
    return v0
.end method

.method public final g0()Le9/t;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->m:Le9/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i0()Z
    .locals 2

    .line 1
    iget v0, p0, Le9/D;->k:I

    .line 2
    .line 3
    const/16 v1, 0x133

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x134

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x12c
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final k()Le9/t;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->m:Le9/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k0()Z
    .locals 2

    .line 1
    iget v0, p0, Le9/D;->k:I

    .line 2
    .line 3
    const/16 v1, 0xc8

    .line 4
    .line 5
    if-le v1, v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/16 v1, 0x12b

    .line 9
    .line 10
    if-lt v1, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 15
    return v0
.end method

.method public final l0()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Le9/B;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->h:Le9/B;

    .line 2
    .line 3
    return-object v0
.end method

.method public final r()Le9/E;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->n:Le9/E;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s()Le9/d;
    .locals 2

    .line 1
    iget-object v0, p0, Le9/D;->g:Le9/d;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Le9/d;->p:Le9/d$b;

    .line 6
    .line 7
    iget-object v1, p0, Le9/D;->m:Le9/t;

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Le9/d$b;->b(Le9/t;)Le9/d;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Le9/D;->g:Le9/d;

    .line 14
    .line 15
    :cond_0
    return-object v0
.end method

.method public final t0()Le9/D;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->o:Le9/D;

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
    const-string v1, "Response{protocol="

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Le9/D;->i:Le9/A;

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", code="

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget v1, p0, Le9/D;->k:I

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, ", message="

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget-object v1, p0, Le9/D;->j:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    const-string v1, ", url="

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    iget-object v1, p0, Le9/D;->h:Le9/B;

    .line 42
    .line 43
    invoke-virtual {v1}, Le9/B;->p()Le9/u;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const/16 v1, 0x7d

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0
.end method

.method public final u0()Le9/D$a;
    .locals 1

    .line 1
    new-instance v0, Le9/D$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Le9/D$a;-><init>(Le9/D;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public final w0()Le9/D;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->q:Le9/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public final y0()Le9/A;
    .locals 1

    .line 1
    iget-object v0, p0, Le9/D;->i:Le9/A;

    .line 2
    .line 3
    return-object v0
.end method
