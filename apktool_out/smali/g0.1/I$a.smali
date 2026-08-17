.class Lg0/I$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg0/I;->b0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lg0/I;


# direct methods
.method constructor <init>(Lg0/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lg0/I$a;->a:Lg0/I;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(Lg0/i0;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lg0/I$a;->a:Lg0/I;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg0/I;->I()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-interface {p1, v0, v1}, Lg0/i0;->e(J)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-interface {p1, v0}, Lg0/i0;->c(Z)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Lg0/i0;->d()Z

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lg0/i0;->b()Lm5/a;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Lg0/I$a$a;

    .line 22
    .line 23
    invoke-direct {v0, p0}, Lg0/I$a$a;-><init>(Lg0/I$a;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lg0/I$a;->a:Lg0/I;

    .line 27
    .line 28
    iget-object v1, v1, Lg0/I;->i:Ljava/util/concurrent/Executor;

    .line 29
    .line 30
    invoke-static {p1, v0, v1}, LJ/n;->j(Lm5/a;LJ/c;Ljava/util/concurrent/Executor;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lg0/I$a;->a:Lg0/I;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Unable to acquire InputBuffer."

    .line 5
    .line 6
    invoke-virtual {v0, v1, v2, p1}, Lg0/I;->K(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lg0/i0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lg0/I$a;->a(Lg0/i0;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
