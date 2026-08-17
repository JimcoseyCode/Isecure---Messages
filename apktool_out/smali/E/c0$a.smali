.class LE/c0$a;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements LJ/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LE/c0;->k(LE/k;)Lm5/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:LE/k;

.field final synthetic b:LE/c0;


# direct methods
.method constructor <init>(LE/c0;LE/k;)V
    .locals 0

    .line 1
    iput-object p1, p0, LE/c0$a;->b:LE/c0;

    .line 2
    .line 3
    iput-object p2, p0, LE/c0$a;->a:LE/k;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Void;)V
    .locals 0

    .line 1
    iget-object p1, p0, LE/c0$a;->b:LE/c0;

    .line 2
    .line 3
    iget-object p1, p1, LE/c0;->b:LE/y;

    .line 4
    .line 5
    invoke-interface {p1}, LE/y;->c()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public onFailure(Ljava/lang/Throwable;)V
    .locals 5

    .line 1
    iget-object v0, p0, LE/c0$a;->a:LE/k;

    .line 2
    .line 3
    invoke-virtual {v0}, LE/k;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, LE/c0$a;->a:LE/k;

    .line 11
    .line 12
    invoke-virtual {v0}, LE/k;->a()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, LF/h0;

    .line 22
    .line 23
    invoke-virtual {v0}, LF/h0;->f()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    instance-of v1, p1, Ly/X;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, p0, LE/c0$a;->b:LE/c0;

    .line 32
    .line 33
    iget-object v1, v1, LE/c0;->c:LE/z;

    .line 34
    .line 35
    check-cast p1, Ly/X;

    .line 36
    .line 37
    invoke-static {v0, p1}, LE/Y$a;->c(ILy/X;)LE/Y$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {v1, p1}, LE/z;->j(LE/Y$a;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    iget-object v1, p0, LE/c0$a;->b:LE/c0;

    .line 46
    .line 47
    iget-object v1, v1, LE/c0;->c:LE/z;

    .line 48
    .line 49
    new-instance v2, Ly/X;

    .line 50
    .line 51
    const/4 v3, 0x2

    .line 52
    const-string v4, "Failed to submit capture request"

    .line 53
    .line 54
    invoke-direct {v2, v3, v4, p1}, Ly/X;-><init>(ILjava/lang/String;Ljava/lang/Throwable;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2}, LE/Y$a;->c(ILy/X;)LE/Y$a;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v1, p1}, LE/z;->j(LE/Y$a;)V

    .line 62
    .line 63
    .line 64
    :goto_0
    iget-object p1, p0, LE/c0$a;->b:LE/c0;

    .line 65
    .line 66
    iget-object p1, p1, LE/c0;->b:LE/y;

    .line 67
    .line 68
    invoke-interface {p1}, LE/y;->c()V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public bridge synthetic onSuccess(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Void;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, LE/c0$a;->a(Ljava/lang/Void;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
