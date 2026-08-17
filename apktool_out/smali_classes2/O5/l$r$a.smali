.class LO5/l$r$a;
.super Lcom/google/gson/n;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LO5/l$r;->a(Lcom/google/gson/d;LR5/a;)Lcom/google/gson/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/gson/n;

.field final synthetic b:LO5/l$r;


# direct methods
.method constructor <init>(LO5/l$r;Lcom/google/gson/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LO5/l$r$a;->b:LO5/l$r;

    .line 2
    .line 3
    iput-object p2, p0, LO5/l$r$a;->a:Lcom/google/gson/n;

    .line 4
    .line 5
    invoke-direct {p0}, Lcom/google/gson/n;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public bridge synthetic b(LS5/a;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, LO5/l$r$a;->e(LS5/a;)Ljava/sql/Timestamp;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public bridge synthetic d(LS5/c;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Ljava/sql/Timestamp;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, LO5/l$r$a;->f(LS5/c;Ljava/sql/Timestamp;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public e(LS5/a;)Ljava/sql/Timestamp;
    .locals 3

    .line 1
    iget-object v0, p0, LO5/l$r$a;->a:Lcom/google/gson/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/google/gson/n;->b(LS5/a;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/util/Date;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Ljava/sql/Timestamp;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_0
    const/4 p1, 0x0

    .line 22
    return-object p1
.end method

.method public f(LS5/c;Ljava/sql/Timestamp;)V
    .locals 1

    .line 1
    iget-object v0, p0, LO5/l$r$a;->a:Lcom/google/gson/n;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/google/gson/n;->d(LS5/c;Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
